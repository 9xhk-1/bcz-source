package com.huawei.hms.utils;

import io.ktor.util.date.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class HEX {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f36706a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', b.f62000f, 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f36707b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private HEX() {
    }

    private static char[] a(byte[] bArr, char[] cArr) {
        if (bArr == null) {
            return new char[0];
        }
        char[] cArr2 = new char[bArr.length << 1];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = i11 + 1;
            cArr2[i11] = cArr[(b11 & 240) >>> 4];
            i11 += 2;
            cArr2[i12] = cArr[b11 & 15];
        }
        return cArr2;
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, false);
    }

    public static String encodeHexString(byte[] bArr, boolean z11) {
        return new String(encodeHex(bArr, z11));
    }

    public static char[] encodeHex(byte[] bArr, boolean z11) {
        return a(bArr, z11 ? f36707b : f36706a);
    }
}
