//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.saliency;

import org.opencv.core.Mat;
import org.opencv.saliency.StaticSaliency;
import org.opencv.saliency.StaticSaliencySpectralResidual;

// C++: class StaticSaliencySpectralResidual
/**
 * the Spectral Residual approach from  CITE: SR
 *
 * Starting from the principle of natural image statistics, this method simulate the behavior of
 * pre-attentive visual search. The algorithm analyze the log spectrum of each image and obtain the
 * spectral residual. Then transform the spectral residual to spatial domain to obtain the saliency
 * map, which suggests the positions of proto-objects.
 */
public class StaticSaliencySpectralResidual extends StaticSaliency {

    protected StaticSaliencySpectralResidual(long addr) { super(addr); }

    // internal usage only
    public static StaticSaliencySpectralResidual __fromPtr__(long addr) { return new StaticSaliencySpectralResidual(addr); }

    //
    // C++: static Ptr_StaticSaliencySpectralResidual cv::saliency::StaticSaliencySpectralResidual::create()
    //

    public static StaticSaliencySpectralResidual create() {
        return StaticSaliencySpectralResidual.__fromPtr__(create_0());
    }


    //
    // C++:  bool cv::saliency::StaticSaliencySpectralResidual::computeSaliency(Mat image, Mat& saliencyMap)
    //

    public boolean computeSaliency(Mat image, Mat saliencyMap) {
        return computeSaliency_0(nativeObj, image.nativeObj, saliencyMap.nativeObj);
    }


    //
    // C++:  void cv::saliency::StaticSaliencySpectralResidual::read(FileNode fn)
    //

    // Unknown type 'FileNode' (I), skipping the function


    //
    // C++:  void cv::saliency::StaticSaliencySpectralResidual::write(FileStorage fs)
    //

    // Unknown type 'FileStorage' (I), skipping the function


    //
    // C++:  int cv::saliency::StaticSaliencySpectralResidual::getImageWidth()
    //

    public int getImageWidth() {
        return getImageWidth_0(nativeObj);
    }


    //
    // C++:  void cv::saliency::StaticSaliencySpectralResidual::setImageWidth(int val)
    //

    public void setImageWidth(int val) {
        setImageWidth_0(nativeObj, val);
    }


    //
    // C++:  int cv::saliency::StaticSaliencySpectralResidual::getImageHeight()
    //

    public int getImageHeight() {
        return getImageHeight_0(nativeObj);
    }


    //
    // C++:  void cv::saliency::StaticSaliencySpectralResidual::setImageHeight(int val)
    //

    public void setImageHeight(int val) {
        setImageHeight_0(nativeObj, val);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_StaticSaliencySpectralResidual cv::saliency::StaticSaliencySpectralResidual::create()
    private static native long create_0();

    // C++:  bool cv::saliency::StaticSaliencySpectralResidual::computeSaliency(Mat image, Mat& saliencyMap)
    private static native boolean computeSaliency_0(long nativeObj, long image_nativeObj, long saliencyMap_nativeObj);

    // C++:  int cv::saliency::StaticSaliencySpectralResidual::getImageWidth()
    private static native int getImageWidth_0(long nativeObj);

    // C++:  void cv::saliency::StaticSaliencySpectralResidual::setImageWidth(int val)
    private static native void setImageWidth_0(long nativeObj, int val);

    // C++:  int cv::saliency::StaticSaliencySpectralResidual::getImageHeight()
    private static native int getImageHeight_0(long nativeObj);

    // C++:  void cv::saliency::StaticSaliencySpectralResidual::setImageHeight(int val)
    private static native void setImageHeight_0(long nativeObj, int val);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
