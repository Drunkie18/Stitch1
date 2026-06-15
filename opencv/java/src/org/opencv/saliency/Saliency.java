//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.saliency;

import org.opencv.core.Algorithm;
import org.opencv.core.Mat;

// C++: class Saliency
/**
 * *******************************<b> Saliency Base Class </b>*********************************
 */
public class Saliency extends Algorithm {

    protected Saliency(long addr) { super(addr); }

    // internal usage only
    public static Saliency __fromPtr__(long addr) { return new Saliency(addr); }

    //
    // C++:  bool cv::saliency::Saliency::computeSaliency(Mat image, Mat& saliencyMap)
    //

    /**
     * Compute the saliency
     * \param image        The image.
     * \param saliencyMap      The computed saliency map.
     * \return true if the saliency map is computed, false otherwise
     * @param image automatically generated
     * @param saliencyMap automatically generated
     * @return automatically generated
     */
    public boolean computeSaliency(Mat image, Mat saliencyMap) {
        return computeSaliency_0(nativeObj, image.nativeObj, saliencyMap.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::saliency::Saliency::computeSaliency(Mat image, Mat& saliencyMap)
    private static native boolean computeSaliency_0(long nativeObj, long image_nativeObj, long saliencyMap_nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
