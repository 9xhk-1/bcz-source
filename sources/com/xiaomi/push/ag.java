package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes8.dex */
public class ag {

    /* renamed from: a, reason: collision with root package name */
    static final char[] f45248a = "0123456789ABCDEF".toCharArray();

    public static String a(byte[] bArr, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder(i12 * 2);
        for (int i13 = 0; i13 < i12; i13++) {
            byte b11 = bArr[i11 + i13];
            char[] cArr = f45248a;
            sb2.append(cArr[(b11 & 255) >> 4]);
            sb2.append(cArr[b11 & 15]);
        }
        return sb2.toString();
    }

    public static boolean a(Context context) {
        return af.f126a;
    }
}
