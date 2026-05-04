package com.igexin.c.a.a;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f37074a = "RC4Carder";

    private static String a() {
        return null;
    }

    public static byte[] b(byte[] bArr, String str) {
        return a(bArr, str.getBytes());
    }

    private static void a(int[] iArr, int i11, int i12) {
        int i13 = iArr[i11];
        iArr[i11] = iArr[i12];
        iArr[i12] = i13;
    }

    private static boolean a(byte[] bArr) {
        int length = bArr.length;
        if (length <= 0 || length > 256) {
            return false;
        }
        int i11 = 0;
        for (byte b11 : bArr) {
            if ((b11 & 255) == 14 && (i11 = i11 + 1) > 3) {
                return false;
            }
        }
        return true;
    }

    public static byte[] a(byte[] bArr, String str) {
        return a(bArr, str.getBytes());
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (!a(bArr2)) {
            throw new IllegalArgumentException("key is fail!");
        }
        if (bArr.length <= 0) {
            throw new IllegalArgumentException("data is fail!");
        }
        int[] iArr = new int[256];
        for (int i11 = 0; i11 < 256; i11++) {
            iArr[i11] = i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            i12 = ((i12 + iArr[i13]) + (bArr2[i13 % bArr2.length] & 255)) % 256;
            a(iArr, i13, i12);
        }
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            i14 = (i14 + 1) % 256;
            i15 = (i15 + iArr[i14]) % 256;
            a(iArr, i14, i15);
            bArr3[i16] = (byte) (iArr[(iArr[i14] + iArr[i15]) % 256] ^ bArr[i16]);
        }
        return bArr3;
    }
}
