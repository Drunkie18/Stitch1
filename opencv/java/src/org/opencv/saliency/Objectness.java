//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.saliency;

import org.opencv.saliency.Saliency;

// C++: class Objectness
/**
 * *******************************<b> Objectness Base Class </b>*********************************
 */
public class Objectness extends Saliency {

    protected Objectness(long addr) { super(addr); }

    // internal usage only
    public static Objectness __fromPtr__(long addr) { return new Objectness(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize() or cleaner
    private static native void delete(long nativeObj);

}
