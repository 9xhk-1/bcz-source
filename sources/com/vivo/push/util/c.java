package com.vivo.push.util;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c {
    public static Bitmap a(Bitmap bitmap, int i11, int i12) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f11 = i11 / width;
        float f12 = i12 / height;
        try {
            Matrix matrix = new Matrix();
            matrix.postScale(f11, f12);
            try {
                return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            } catch (Exception unused) {
                return bitmap;
            }
        } catch (Exception unused2) {
            return bitmap;
        }
    }
}
