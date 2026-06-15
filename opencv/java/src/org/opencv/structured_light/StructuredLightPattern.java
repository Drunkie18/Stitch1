//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.structured_light;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.utils.Converters;

// C++: class StructuredLightPattern
/**
 * Abstract base class for generating and decoding structured light patterns.
 */
public class StructuredLightPattern extends Algorithm {

    protected StructuredLightPattern(long addr) { super(addr); }

    // internal usage only
    public static StructuredLightPattern __fromPtr__(long addr) { return new StructuredLightPattern(addr); }

    //
    // C++:  bool cv::structured_light::StructuredLightPattern::generate(vector_Mat& patternImages)
    //

    /**
     * Generates the structured light pattern to project.
     *
     *    @param patternImages The generated pattern: a vector&lt;Mat&gt;, in which each image is a CV_8U Mat at projector's resolution.
     * @return automatically generated
     */
    public boolean generate(List<Mat> patternImages) {
        Mat patternImages_mat = new Mat();
        boolean retVal = generate_0(nativeObj, patternImages_mat.nativeObj);
        Converters.Mat_to_vector_Mat(patternImages_mat, patternImages);
        patternImages_mat.release();
        return retVal;
    }


    //
    // C++:  bool cv::structured_light::StructuredLightPattern::decode(vector_vector_Mat patternImages, Mat& disparityMap, vector_Mat blackImages = vector_Mat(), vector_Mat whiteImages = vector_Mat(), int flags = DECODE_3D_UNDERWORLD)
    //

    /**
     * Decodes the structured light pattern, generating a disparity map
     *
     *    @param patternImages The acquired pattern images to decode (vector&lt;vector&lt;Mat&gt;&gt;), loaded as grayscale and previously rectified.
     *    @param disparityMap The decoding result: a CV_64F Mat at image resolution, storing the computed disparity map.
     *    @param blackImages The all-black images needed for shadowMasks computation.
     *    @param whiteImages The all-white images needed for shadowMasks computation.
     *    @param flags Flags setting decoding algorithms. Default: DECODE_3D_UNDERWORLD.
     *    <b>Note:</b> All the images must be at the same resolution.
     * @return automatically generated
     */
    public boolean decode(List<List<Mat>> patternImages, Mat disparityMap, List<Mat> blackImages, List<Mat> whiteImages, int flags) {
        List<Mat> patternImages_tmplm = new ArrayList<Mat>((patternImages != null) ? patternImages.size() : 0);
        Mat patternImages_mat = Converters.vector_vector_Mat_to_Mat(patternImages, patternImages_tmplm);
        Mat blackImages_mat = Converters.vector_Mat_to_Mat(blackImages);
        Mat whiteImages_mat = Converters.vector_Mat_to_Mat(whiteImages);
        return decode_0(nativeObj, patternImages_mat.nativeObj, disparityMap.nativeObj, blackImages_mat.nativeObj, whiteImages_mat.nativeObj, flags);
    }

    /**
     * Decodes the structured light pattern, generating a disparity map
     *
     *    @param patternImages The acquired pattern images to decode (vector&lt;vector&lt;Mat&gt;&gt;), loaded as grayscale and previously rectified.
     *    @param disparityMap The decoding result: a CV_64F Mat at image resolution, storing the computed disparity map.
     *    @param blackImages The all-black images needed for shadowMasks computation.
     *    @param whiteImages The all-white images needed for shadowMasks computation.
     *    <b>Note:</b> All the images must be at the same resolution.
     * @return automatically generated
     */
    public boolean decode(List<List<Mat>> patternImages, Mat disparityMap, List<Mat> blackImages, List<Mat> whiteImages) {
        List<Mat> patternImages_tmplm = new ArrayList<Mat>((patternImages != null) ? patternImages.size() : 0);
        Mat patternImages_mat = Converters.vector_vector_Mat_to_Mat(patternImages, patternImages_tmplm);
        Mat blackImages_mat = Converters.vector_Mat_to_Mat(blackImages);
        Mat whiteImages_mat = Converters.vector_Mat_to_Mat(whiteImages);
        return decode_1(nativeObj, patternImages_mat.nativeObj, disparityMap.nativeObj, blackImages_mat.nativeObj, whiteImages_mat.nativeObj);
    }

    /**
     * Decodes the structured light pattern, generating a disparity map
     *
     *    @param patternImages The acquired pattern images to decode (vector&lt;vector&lt;Mat&gt;&gt;), loaded as grayscale and previously rectified.
     *    @param disparityMap The decoding result: a CV_64F Mat at image resolution, storing the computed disparity map.
     *    @param blackImages The all-black images needed for shadowMasks computation.
     *    <b>Note:</b> All the images must be at the same resolution.
     * @return automatically generated
     */
    public boolean decode(List<List<Mat>> patternImages, Mat disparityMap, List<Mat> blackImages) {
        List<Mat> patternImages_tmplm = new ArrayList<Mat>((patternImages != null) ? patternImages.size() : 0);
        Mat patternImages_mat = Converters.vector_vector_Mat_to_Mat(patternImages, patternImages_tmplm);
        Mat blackImages_mat = Converters.vector_Mat_to_Mat(blackImages);
        return decode_2(nativeObj, patternImages_mat.nativeObj, disparityMap.nativeObj, blackImages_mat.nativeObj);
    }

    /**
     * Decodes the structured light pattern, generating a disparity map
     *
     *    @param patternImages The acquired pattern images to decode (vector&lt;vector&lt;Mat&gt;&gt;), loaded as grayscale and previously rectified.
     *    @param disparityMap The decoding result: a CV_64F Mat at image resolution, storing the computed disparity map.
     *    <b>Note:</b> All the images must be at the same resolution.
     * @return automatically generated
     */
    public boolean decode(List<List<Mat>> patternImages, Mat disparityMap) {
        List<Mat> patternImages_tmplm = new ArrayList<Mat>((patternImages != null) ? patternImages.size() : 0);
        Mat patternImages_mat = Converters.vector_vector_Mat_to_Mat(patternImages, patternImages_tmplm);
        return decode_3(nativeObj, patternImages_mat.nativeObj, disparityMap.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  bool cv::structured_light::StructuredLightPattern::generate(vector_Mat& patternImages)
    private static native boolean generate_0(long nativeObj, long patternImages_mat_nativeObj);

    // C++:  bool cv::structured_light::StructuredLightPattern::decode(vector_vector_Mat patternImages, Mat& disparityMap, vector_Mat blackImages = vector_Mat(), vector_Mat whiteImages = vector_Mat(), int flags = DECODE_3D_UNDERWORLD)
    private static native boolean decode_0(long nativeObj, long patternImages_mat_nativeObj, long disparityMap_nativeObj, long blackImages_mat_nativeObj, long whiteImages_mat_nativeObj, int flags);
    private static native boolean decode_1(long nativeObj, long patternImages_mat_nativeObj, long disparityMap_nativeObj, long blackImages_mat_nativeObj, long whiteImages_mat_nativeObj);
    private static native boolean decode_2(long nativeObj, long patternImages_mat_nativeObj, long disparityMap_nativeObj, long blackImages_mat_nativeObj);
    private static native boolean decode_3(long nativeObj, long patternImages_mat_nativeObj, long disparityMap_nativeObj);

    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
