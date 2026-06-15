//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.bgsegm;

import org.opencv.core.Mat;
import org.opencv.video.BackgroundSubtractor;

// C++: class BackgroundSubtractorMOG
/**
 * Gaussian Mixture-based Background/Foreground Segmentation Algorithm.
 *
 * The class implements the algorithm described in CITE: KB2001 .
 */
public class BackgroundSubtractorMOG extends BackgroundSubtractor {

    protected BackgroundSubtractorMOG(long addr) { super(addr); }

    // internal usage only
    public static BackgroundSubtractorMOG __fromPtr__(long addr) { return new BackgroundSubtractorMOG(addr); }

    //
    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::apply(Mat image, Mat& fgmask, double learningRate = -1)
    //

    /**
     * Computes a foreground mask.
     *
     *     @param image Next video frame of type CV_8UC(n),CV_8SC(n),CV_16UC(n),CV_16SC(n),CV_32SC(n),CV_32FC(n),CV_64FC(n), where n is 1,2,3,4.
     *     @param fgmask The output foreground mask as an 8-bit binary image.
     *     @param learningRate The value between 0 and 1 that indicates how fast the background model is
     *     learnt. Negative parameter value makes the algorithm to use some automatically chosen learning
     *     rate. 0 means that the background model is not updated at all, 1 means that the background model
     *     is completely reinitialized from the last frame.
     */
    public void apply(Mat image, Mat fgmask, double learningRate) {
        apply_0(nativeObj, image.nativeObj, fgmask.nativeObj, learningRate);
    }

    /**
     * Computes a foreground mask.
     *
     *     @param image Next video frame of type CV_8UC(n),CV_8SC(n),CV_16UC(n),CV_16SC(n),CV_32SC(n),CV_32FC(n),CV_64FC(n), where n is 1,2,3,4.
     *     @param fgmask The output foreground mask as an 8-bit binary image.
     *     learnt. Negative parameter value makes the algorithm to use some automatically chosen learning
     *     rate. 0 means that the background model is not updated at all, 1 means that the background model
     *     is completely reinitialized from the last frame.
     */
    public void apply(Mat image, Mat fgmask) {
        apply_1(nativeObj, image.nativeObj, fgmask.nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::apply(Mat image, Mat knownForegroundMask, Mat& fgmask, double learningRate = -1)
    //

    /**
     * Computes a foreground mask and skips known foreground in evaluation.
     *
     *     @param image Next video frame of type CV_8UC(n),CV_8SC(n),CV_16UC(n),CV_16SC(n),CV_32SC(n),CV_32FC(n),CV_64FC(n), where n is 1,2,3,4.
     *     @param fgmask The output foreground mask as an 8-bit binary image.
     *     @param knownForegroundMask The mask for inputting already known foreground, allows model to ignore learning known pixels.
     *     @param learningRate The value between 0 and 1 that indicates how fast the background model is
     *     learnt. Negative parameter value makes the algorithm to use some automatically chosen learning
     *     rate. 0 means that the background model is not updated at all, 1 means that the background model
     *     is completely reinitialized from the last frame.
     */
    public void apply(Mat image, Mat knownForegroundMask, Mat fgmask, double learningRate) {
        apply_2(nativeObj, image.nativeObj, knownForegroundMask.nativeObj, fgmask.nativeObj, learningRate);
    }

    /**
     * Computes a foreground mask and skips known foreground in evaluation.
     *
     *     @param image Next video frame of type CV_8UC(n),CV_8SC(n),CV_16UC(n),CV_16SC(n),CV_32SC(n),CV_32FC(n),CV_64FC(n), where n is 1,2,3,4.
     *     @param fgmask The output foreground mask as an 8-bit binary image.
     *     @param knownForegroundMask The mask for inputting already known foreground, allows model to ignore learning known pixels.
     *     learnt. Negative parameter value makes the algorithm to use some automatically chosen learning
     *     rate. 0 means that the background model is not updated at all, 1 means that the background model
     *     is completely reinitialized from the last frame.
     */
    public void apply(Mat image, Mat knownForegroundMask, Mat fgmask) {
        apply_3(nativeObj, image.nativeObj, knownForegroundMask.nativeObj, fgmask.nativeObj);
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorMOG::getHistory()
    //

    public int getHistory() {
        return getHistory_0(nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setHistory(int nframes)
    //

    public void setHistory(int nframes) {
        setHistory_0(nativeObj, nframes);
    }


    //
    // C++:  int cv::bgsegm::BackgroundSubtractorMOG::getNMixtures()
    //

    public int getNMixtures() {
        return getNMixtures_0(nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setNMixtures(int nmix)
    //

    public void setNMixtures(int nmix) {
        setNMixtures_0(nativeObj, nmix);
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorMOG::getBackgroundRatio()
    //

    public double getBackgroundRatio() {
        return getBackgroundRatio_0(nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setBackgroundRatio(double backgroundRatio)
    //

    public void setBackgroundRatio(double backgroundRatio) {
        setBackgroundRatio_0(nativeObj, backgroundRatio);
    }


    //
    // C++:  double cv::bgsegm::BackgroundSubtractorMOG::getNoiseSigma()
    //

    public double getNoiseSigma() {
        return getNoiseSigma_0(nativeObj);
    }


    //
    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setNoiseSigma(double noiseSigma)
    //

    public void setNoiseSigma(double noiseSigma) {
        setNoiseSigma_0(nativeObj, noiseSigma);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::apply(Mat image, Mat& fgmask, double learningRate = -1)
    private static native void apply_0(long nativeObj, long image_nativeObj, long fgmask_nativeObj, double learningRate);
    private static native void apply_1(long nativeObj, long image_nativeObj, long fgmask_nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::apply(Mat image, Mat knownForegroundMask, Mat& fgmask, double learningRate = -1)
    private static native void apply_2(long nativeObj, long image_nativeObj, long knownForegroundMask_nativeObj, long fgmask_nativeObj, double learningRate);
    private static native void apply_3(long nativeObj, long image_nativeObj, long knownForegroundMask_nativeObj, long fgmask_nativeObj);

    // C++:  int cv::bgsegm::BackgroundSubtractorMOG::getHistory()
    private static native int getHistory_0(long nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setHistory(int nframes)
    private static native void setHistory_0(long nativeObj, int nframes);

    // C++:  int cv::bgsegm::BackgroundSubtractorMOG::getNMixtures()
    private static native int getNMixtures_0(long nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setNMixtures(int nmix)
    private static native void setNMixtures_0(long nativeObj, int nmix);

    // C++:  double cv::bgsegm::BackgroundSubtractorMOG::getBackgroundRatio()
    private static native double getBackgroundRatio_0(long nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setBackgroundRatio(double backgroundRatio)
    private static native void setBackgroundRatio_0(long nativeObj, double backgroundRatio);

    // C++:  double cv::bgsegm::BackgroundSubtractorMOG::getNoiseSigma()
    private static native double getNoiseSigma_0(long nativeObj);

    // C++:  void cv::bgsegm::BackgroundSubtractorMOG::setNoiseSigma(double noiseSigma)
    private static native void setNoiseSigma_0(long nativeObj, double noiseSigma);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
