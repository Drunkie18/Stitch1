//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.saliency;

import org.opencv.core.Mat;
import org.opencv.saliency.MotionSaliency;
import org.opencv.saliency.MotionSaliencyBinWangApr2014;

// C++: class MotionSaliencyBinWangApr2014
/**
 * the Fast Self-tuning Background Subtraction Algorithm from CITE: BinWangApr2014
 */
public class MotionSaliencyBinWangApr2014 extends MotionSaliency {

    protected MotionSaliencyBinWangApr2014(long addr) { super(addr); }

    // internal usage only
    public static MotionSaliencyBinWangApr2014 __fromPtr__(long addr) { return new MotionSaliencyBinWangApr2014(addr); }

    //
    // C++: static Ptr_MotionSaliencyBinWangApr2014 cv::saliency::MotionSaliencyBinWangApr2014::create()
    //

    public static MotionSaliencyBinWangApr2014 create() {
        return MotionSaliencyBinWangApr2014.__fromPtr__(create_0());
    }


    //
    // C++:  bool cv::saliency::MotionSaliencyBinWangApr2014::computeSaliency(Mat image, Mat& saliencyMap)
    //

    public boolean computeSaliency(Mat image, Mat saliencyMap) {
        return computeSaliency_0(nativeObj, image.nativeObj, saliencyMap.nativeObj);
    }


    //
    // C++:  void cv::saliency::MotionSaliencyBinWangApr2014::setImagesize(int W, int H)
    //

    /**
     * This is a utility function that allows to set the correct size (taken from the input image) in the
     *     corresponding variables that will be used to size the data structures of the algorithm.
     *     @param W width of input image
     *     @param H height of input image
     */
    public void setImagesize(int W, int H) {
        setImagesize_0(nativeObj, W, H);
    }


    //
    // C++:  bool cv::saliency::MotionSaliencyBinWangApr2014::init()
    //

    /**
     * This function allows the correct initialization of all data structures that will be used by the
     *     algorithm.
     * @return automatically generated
     */
    public boolean init() {
        return init_0(nativeObj);
    }


    //
    // C++:  int cv::saliency::MotionSaliencyBinWangApr2014::getImageWidth()
    //

    public int getImageWidth() {
        return getImageWidth_0(nativeObj);
    }


    //
    // C++:  void cv::saliency::MotionSaliencyBinWangApr2014::setImageWidth(int val)
    //

    public void setImageWidth(int val) {
        setImageWidth_0(nativeObj, val);
    }


    //
    // C++:  int cv::saliency::MotionSaliencyBinWangApr2014::getImageHeight()
    //

    public int getImageHeight() {
        return getImageHeight_0(nativeObj);
    }


    //
    // C++:  void cv::saliency::MotionSaliencyBinWangApr2014::setImageHeight(int val)
    //

    public void setImageHeight(int val) {
        setImageHeight_0(nativeObj, val);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_MotionSaliencyBinWangApr2014 cv::saliency::MotionSaliencyBinWangApr2014::create()
    private static native long create_0();

    // C++:  bool cv::saliency::MotionSaliencyBinWangApr2014::computeSaliency(Mat image, Mat& saliencyMap)
    private static native boolean computeSaliency_0(long nativeObj, long image_nativeObj, long saliencyMap_nativeObj);

    // C++:  void cv::saliency::MotionSaliencyBinWangApr2014::setImagesize(int W, int H)
    private static native void setImagesize_0(long nativeObj, int W, int H);

    // C++:  bool cv::saliency::MotionSaliencyBinWangApr2014::init()
    private static native boolean init_0(long nativeObj);

    // C++:  int cv::saliency::MotionSaliencyBinWangApr2014::getImageWidth()
    private static native int getImageWidth_0(long nativeObj);

    // C++:  void cv::saliency::MotionSaliencyBinWangApr2014::setImageWidth(int val)
    private static native void setImageWidth_0(long nativeObj, int val);

    // C++:  int cv::saliency::MotionSaliencyBinWangApr2014::getImageHeight()
    private static native int getImageHeight_0(long nativeObj);

    // C++:  void cv::saliency::MotionSaliencyBinWangApr2014::setImageHeight(int val)
    private static native void setImageHeight_0(long nativeObj, int val);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
