#include <jni.h>
#include <string>
#include <vector>
#include <android/bitmap.h>
#include <android/log.h>

// OpenCV Headers
#include <opencv2/core.hpp>
#include <opencv2/imgproc.hpp>
#include <opencv2/stitching.hpp>

// Setup logging so we can print messages from C++ to the Android Studio console
#define LOG_TAG "NativeStitcher"
#define LOGD(...) __android_log_print(ANDROID_LOG_DEBUG, LOG_TAG, __VA_ARGS__)
#define LOGE(...) __android_log_print(ANDROID_LOG_ERROR, LOG_TAG, __VA_ARGS__)

// ---------------------------------------------------------
// HELPER 1: Convert Android Bitmap to OpenCV cv::Mat
// ---------------------------------------------------------
void bitmapToMat(JNIEnv *env, jobject bitmap, cv::Mat &dst) {
    AndroidBitmapInfo info;
    void* pixels = 0;

    if (AndroidBitmap_getInfo(env, bitmap, &info) < 0) return;
    if (AndroidBitmap_lockPixels(env, bitmap, &pixels) < 0) return;

    cv::Mat tmp(info.height, info.width, CV_8UC4, pixels);
    tmp.copyTo(dst);

    AndroidBitmap_unlockPixels(env, bitmap);
}

// ---------------------------------------------------------
// HELPER 2: Convert OpenCV cv::Mat back to Android Bitmap
// ---------------------------------------------------------
void matToBitmap(JNIEnv *env, cv::Mat src, jobject bitmap) {
    AndroidBitmapInfo info;
    void* pixels = 0;

    if (AndroidBitmap_getInfo(env, bitmap, &info) < 0) return;
    if (AndroidBitmap_lockPixels(env, bitmap, &pixels) < 0) return;

    // The Android Canvas
    cv::Mat tmp(info.height, info.width, CV_8UC4, pixels);

    // --- THE FIX ---
    // OpenCV Panoramas are weird sizes. We force the OpenCV image to resize
    // to fit the exact dimensions of the Android canvas before copying!
    cv::Mat resizedSrc;
    cv::resize(src, resizedSrc, tmp.size());
    resizedSrc.copyTo(tmp);

    AndroidBitmap_unlockPixels(env, bitmap);
}

// ---------------------------------------------------------
// MAIN BRIDGE: Kotlin calls this function!
// ---------------------------------------------------------
extern "C" JNIEXPORT void JNICALL
Java_com_example_stitch1_MainActivity_stitchPanoramas(
        JNIEnv* env,
        jobject /* this */,
        jobject bitmapLeft,
        jobject bitmapRight,
        jobject bitmapOutput) {

    LOGD("C++ Engine triggered! Beginning Panorama Stitching...");

    // 1. Create empty OpenCV Matrices
    cv::Mat matLeft, matRight, matResult;

    // 2. Translate the Kotlin Bitmaps into OpenCV Matrices
    bitmapToMat(env, bitmapLeft, matLeft);
    bitmapToMat(env, bitmapRight, matRight);

    // 3. Convert RGBA (Android Default) to RGB (OpenCV expects 3 color channels, not 4)
    cv::cvtColor(matLeft, matLeft, cv::COLOR_RGBA2RGB);
    cv::cvtColor(matRight, matRight, cv::COLOR_RGBA2RGB);

    // 4. Create the Vector (List) of images to stitch
    std::vector<cv::Mat> imagesToStitch;
    imagesToStitch.push_back(matLeft);
    imagesToStitch.push_back(matRight);

    // 5. Initialize the OpenCV Stitcher
    cv::Ptr<cv::Stitcher> stitcher = cv::Stitcher::create(cv::Stitcher::PANORAMA);

    LOGD("Images loaded. Computing Homography and Blending...");

    // 6. Execute the Stitch!
    cv::Stitcher::Status status = stitcher->stitch(imagesToStitch, matResult);

    // 7. Check the result
    if (status == cv::Stitcher::OK) {
        LOGD("Stitching SUCCESSFUL!");

        // Convert the 3-channel RGB result back to 4-channel RGBA for Android
        cv::cvtColor(matResult, matResult, cv::COLOR_RGB2RGBA);

        // Translate the finished OpenCV Matrix back into the Kotlin output Bitmap
        matToBitmap(env, matResult, bitmapOutput);
    } else {
        LOGE("Stitching FAILED. Error Code: %d", status);
        // If it fails, output the left image so the screen doesn't crash
        cv::cvtColor(matLeft, matLeft, cv::COLOR_RGB2RGBA);
        matToBitmap(env, matLeft, bitmapOutput);
    }
}