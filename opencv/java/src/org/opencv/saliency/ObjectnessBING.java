//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.saliency;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfFloat;
import org.opencv.saliency.Objectness;
import org.opencv.saliency.ObjectnessBING;
import org.opencv.utils.Converters;

// C++: class ObjectnessBING
/**
 * the Binarized normed gradients algorithm from CITE: BING
 */
public class ObjectnessBING extends Objectness {

    protected ObjectnessBING(long addr) { super(addr); }

    // internal usage only
    public static ObjectnessBING __fromPtr__(long addr) { return new ObjectnessBING(addr); }

    //
    // C++: static Ptr_ObjectnessBING cv::saliency::ObjectnessBING::create()
    //

    public static ObjectnessBING create() {
        return ObjectnessBING.__fromPtr__(create_0());
    }


    //
    // C++:  bool cv::saliency::ObjectnessBING::computeSaliency(Mat image, Mat& saliencyMap)
    //

    public boolean computeSaliency(Mat image, Mat saliencyMap) {
        return computeSaliency_0(nativeObj, image.nativeObj, saliencyMap.nativeObj);
    }


    //
    // C++:  vector_float cv::saliency::ObjectnessBING::getobjectnessValues()
    //

    /**
     * Return the list of the rectangles' objectness value,
     *
     *     in the same order as the *vector&lt;Vec4i&gt; objectnessBoundingBox* returned by the algorithm (in
     *     computeSaliencyImpl function). The bigger value these scores are, it is more likely to be an
     *     object window.
     * @return automatically generated
     */
    public MatOfFloat getobjectnessValues() {
        return MatOfFloat.fromNativeAddr(getobjectnessValues_0(nativeObj));
    }


    //
    // C++:  void cv::saliency::ObjectnessBING::setTrainingPath(String trainingPath)
    //

    /**
     * This is a utility function that allows to set the correct path from which the algorithm will load
     *     the trained model.
     *     @param trainingPath trained model path
     */
    public void setTrainingPath(String trainingPath) {
        setTrainingPath_0(nativeObj, trainingPath);
    }


    //
    // C++:  void cv::saliency::ObjectnessBING::setBBResDir(String resultsDir)
    //

    /**
     * This is a utility function that allows to set an arbitrary path in which the algorithm will save the
     *     optional results
     *
     *     (ie writing on file the total number and the list of rectangles returned by objectess, one for
     *     each row).
     *     @param resultsDir results' folder path
     */
    public void setBBResDir(String resultsDir) {
        setBBResDir_0(nativeObj, resultsDir);
    }


    //
    // C++:  double cv::saliency::ObjectnessBING::getBase()
    //

    public double getBase() {
        return getBase_0(nativeObj);
    }


    //
    // C++:  void cv::saliency::ObjectnessBING::setBase(double val)
    //

    public void setBase(double val) {
        setBase_0(nativeObj, val);
    }


    //
    // C++:  int cv::saliency::ObjectnessBING::getNSS()
    //

    public int getNSS() {
        return getNSS_0(nativeObj);
    }


    //
    // C++:  void cv::saliency::ObjectnessBING::setNSS(int val)
    //

    public void setNSS(int val) {
        setNSS_0(nativeObj, val);
    }


    //
    // C++:  int cv::saliency::ObjectnessBING::getW()
    //

    public int getW() {
        return getW_0(nativeObj);
    }


    //
    // C++:  void cv::saliency::ObjectnessBING::setW(int val)
    //

    public void setW(int val) {
        setW_0(nativeObj, val);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_ObjectnessBING cv::saliency::ObjectnessBING::create()
    private static native long create_0();

    // C++:  bool cv::saliency::ObjectnessBING::computeSaliency(Mat image, Mat& saliencyMap)
    private static native boolean computeSaliency_0(long nativeObj, long image_nativeObj, long saliencyMap_nativeObj);

    // C++:  vector_float cv::saliency::ObjectnessBING::getobjectnessValues()
    private static native long getobjectnessValues_0(long nativeObj);

    // C++:  void cv::saliency::ObjectnessBING::setTrainingPath(String trainingPath)
    private static native void setTrainingPath_0(long nativeObj, String trainingPath);

    // C++:  void cv::saliency::ObjectnessBING::setBBResDir(String resultsDir)
    private static native void setBBResDir_0(long nativeObj, String resultsDir);

    // C++:  double cv::saliency::ObjectnessBING::getBase()
    private static native double getBase_0(long nativeObj);

    // C++:  void cv::saliency::ObjectnessBING::setBase(double val)
    private static native void setBase_0(long nativeObj, double val);

    // C++:  int cv::saliency::ObjectnessBING::getNSS()
    private static native int getNSS_0(long nativeObj);

    // C++:  void cv::saliency::ObjectnessBING::setNSS(int val)
    private static native void setNSS_0(long nativeObj, int val);

    // C++:  int cv::saliency::ObjectnessBING::getW()
    private static native int getW_0(long nativeObj);

    // C++:  void cv::saliency::ObjectnessBING::setW(int val)
    private static native void setW_0(long nativeObj, int val);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
