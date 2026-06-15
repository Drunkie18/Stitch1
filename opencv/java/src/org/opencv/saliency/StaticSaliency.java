//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.saliency;

import org.opencv.core.Mat;
import org.opencv.saliency.Saliency;

// C++: class StaticSaliency
/**
 * *******************************<b> Static Saliency Base Class </b>*********************************
 */
public class StaticSaliency extends Saliency {

    protected StaticSaliency(long addr) { super(addr); }

    // internal usage only
    public static StaticSaliency __fromPtr__(long addr) { return new StaticSaliency(addr); }

    //
    // C++:  bool cv::saliency::StaticSaliency::computeBinaryMap(Mat _saliencyMap, Mat& _binaryMap)
    //

    /**
     * This function perform a binary map of given saliency map. This is obtained in this
     *     way:
     *
     *     In a first step, to improve the definition of interest areas and facilitate identification of
     *     targets, a segmentation by clustering is performed, using *K-means algorithm*. Then, to gain a
     *     binary representation of clustered saliency map, since values of the map can vary according to
     *     the characteristics of frame under analysis, it is not convenient to use a fixed threshold. So,
     * Otsu's algorithm* is used, which assumes that the image to be thresholded contains two classes
     *     of pixels or bi-modal histograms (e.g. foreground and back-ground pixels); later on, the
     *     algorithm calculates the optimal threshold separating those two classes, so that their
     *     intra-class variance is minimal.
     *
     *     @param _saliencyMap the saliency map obtained through one of the specialized algorithms
     *     @param _binaryMap the binary map
     * @return automatically generated
     */
    public boolean computeBinaryMap(Mat _saliencyMap, Mat _binaryMap) {
        return computeBinaryMap_0(nativeObj, _saliencyMap.nativeObj, _binaryMap.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::saliency::StaticSaliency::computeBinaryMap(Mat _saliencyMap, Mat& _binaryMap)
    private static native boolean computeBinaryMap_0(long nativeObj, long _saliencyMap_nativeObj, long _binaryMap_nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
