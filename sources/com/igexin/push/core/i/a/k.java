package com.igexin.push.core.i.a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

/* loaded from: classes7.dex */
public final class k {
    private k() {
    }

    @TargetApi(19)
    public static int a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    public static <T> T a(T t11) {
        t11.getClass();
        return t11;
    }

    public static void a(boolean z11, String str) {
        if (!z11) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }
}
