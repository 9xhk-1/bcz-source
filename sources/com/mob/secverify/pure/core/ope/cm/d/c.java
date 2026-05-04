package com.mob.secverify.pure.core.ope.cm.d;

import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f41025a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b11 : bArr) {
            sb2.append(f41025a[(b11 >>> 4) & 15]);
            sb2.append(f41025a[b11 & 15]);
        }
        return sb2.toString().toUpperCase(Locale.getDefault());
    }
}
