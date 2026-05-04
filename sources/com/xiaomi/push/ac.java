package com.xiaomi.push;

/* loaded from: classes8.dex */
public class ac {
    public static int a(byte[] bArr) {
        if (bArr.length != 4) {
            throw new IllegalArgumentException("the length of bytes must be 4");
        }
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static byte[] a(int i11) {
        return new byte[]{(byte) (i11 >> 24), (byte) (i11 >> 16), (byte) (i11 >> 8), (byte) i11};
    }
}
