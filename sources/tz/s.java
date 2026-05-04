package tz;

import java.nio.ByteOrder;

/* loaded from: classes8.dex */
public class s {
    public static int a(byte b11, byte b12, byte b13, byte b14) {
        return ((b11 & 255) << 24) | ((b12 & 255) << 16) | ((b13 & 255) << 8) | (b14 & 255);
    }

    public static int b(byte[] bArr, int i11, ByteOrder byteOrder) {
        byte b11;
        byte b12;
        byte b13;
        byte b14;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            b11 = bArr[i11 + 3];
            b12 = bArr[i11 + 2];
            b13 = bArr[i11 + 1];
            b14 = bArr[i11];
        } else {
            b11 = bArr[i11];
            b12 = bArr[i11 + 1];
            b13 = bArr[i11 + 2];
            b14 = bArr[i11 + 3];
        }
        return a(b11, b12, b13, b14);
    }

    public static long c(byte b11, byte b12, byte b13, byte b14, byte b15, byte b16, byte b17, byte b18) {
        return (a(b11, b12, b13, b14) << 32) | a(b15, b16, b17, b18);
    }

    public static short d(byte b11, byte b12) {
        return (short) ((b11 << 8) | (b12 & 255));
    }

    public static short e(byte[] bArr, int i11, ByteOrder byteOrder) {
        byte b11;
        byte b12;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            b11 = bArr[i11 + 1];
            b12 = bArr[i11];
        } else {
            b11 = bArr[i11];
            b12 = bArr[i11 + 1];
        }
        return d(b11, b12);
    }

    public static long f(byte[] bArr, int i11, ByteOrder byteOrder) {
        byte b11;
        byte b12;
        byte b13;
        byte b14;
        byte b15;
        byte b16;
        byte b17;
        byte b18;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            b11 = bArr[i11 + 7];
            b12 = bArr[i11 + 6];
            b13 = bArr[i11 + 5];
            b14 = bArr[i11 + 4];
            b15 = bArr[i11 + 3];
            b16 = bArr[i11 + 2];
            b17 = bArr[i11 + 1];
            b18 = bArr[i11];
        } else {
            b11 = bArr[i11];
            b12 = bArr[i11 + 1];
            b13 = bArr[i11 + 2];
            b14 = bArr[i11 + 3];
            b15 = bArr[i11 + 4];
            b16 = bArr[i11 + 5];
            b17 = bArr[i11 + 6];
            b18 = bArr[i11 + 7];
        }
        return c(b11, b12, b13, b14, b15, b16, b17, b18);
    }
}
