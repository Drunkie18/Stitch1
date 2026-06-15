//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.saliency;

import org.opencv.core.Mat;
import org.opencv.saliency.StaticSaliency;
import org.opencv.saliency.StaticSaliencyFineGrained;

// C++: class StaticSaliencyFineGrained
/**
 * the Fine Grained Saliency approach from CITE: FGS
 *
 * This method calculates saliency based on center-surround differences.
 * High resolution saliency maps are generated in real time by using integral images.
 */
public class StaticSaliencyFineGrained extends StaticSaliency {

    protected StaticSaliencyFineGrained(long addr) { super(addr); }

    // internal usage only
    public static StaticSaliencyFineGrained __fromPtr__(long addr) { return new StaticSaliencyFineGrained(addr); }

    //
    // C++: static Ptr_StaticSaliencyFineGrained cv::saliency::StaticSaliencyFineGrained::create()
    //

    public static StaticSaliencyFineGrained create() {
        return StaticSaliencyFineGrained.__fromPtr__(create_0());
    }


    //
    // C++:  bool cv::saliency::StaticSaliencyFineGrained::computeSaliency(Mat image, Mat& saliencyMap)
    //

    public boolean computeSaliency(Mat image, Mat saliencyMap) {
        return computeSaliency_0(nativeObj, image.nativeObj, saliencyMap.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_StaticSaliencyFineGrained cv::saliency::StaticSaliencyFineGrained::create()
    private static native long create_0();

    // C++:  bool cv::saliency::StaticSaliencyFineGrained::computeSaliency(Mat image, Mat& saliencyMap)
    private static native boolean computeSaliency_0(long nativeObj, long image_nativeObj, long saliencyMap_nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
