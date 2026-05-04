package com.igexin.push.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* loaded from: classes7.dex */
public final class l {
    public static Bitmap a(String str) {
        if (str != null) {
            try {
                Bitmap decodeFile = BitmapFactory.decodeFile(str);
                if (decodeFile != null) {
                    return decodeFile;
                }
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
        return null;
    }
}
