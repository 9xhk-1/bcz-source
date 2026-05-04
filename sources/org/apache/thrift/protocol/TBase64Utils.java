package org.apache.thrift.protocol;

import ho.c;
import kx.a0;
import s60.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class TBase64Utils {
    private static final byte[] DECODE_TABLE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, c.f59556u, 19, 20, c.f59560y, c.f59561z, c.A, c.B, c.C, -1, -1, -1, -1, -1, -1, c.D, c.E, 28, c.G, c.H, 31, 32, 33, 34, 35, 36, e.f88061c, 38, 39, 40, 41, 42, 43, 44, a0.f68904b, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final String ENCODE_TABLE = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static final void decode(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        byte[] bArr3 = DECODE_TABLE;
        int i14 = i11 + 1;
        bArr2[i13] = (byte) ((bArr3[bArr[i11] & 255] << 2) | (bArr3[bArr[i14] & 255] >> 4));
        if (i12 > 2) {
            int i15 = i11 + 2;
            bArr2[i13 + 1] = (byte) (((bArr3[bArr[i14] & 255] << 4) & 240) | (bArr3[bArr[i15] & 255] >> 2));
            if (i12 > 3) {
                bArr2[i13 + 2] = (byte) (bArr3[bArr[i11 + 3] & 255] | ((bArr3[bArr[i15] & 255] << 6) & 192));
            }
        }
    }

    public static final void encode(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        bArr2[i13] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((bArr[i11] >> 2) & 63);
        if (i12 == 3) {
            int i14 = i11 + 1;
            bArr2[i13 + 1] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(((bArr[i11] << 4) & 48) | ((bArr[i14] >> 4) & 15));
            int i15 = i11 + 2;
            bArr2[i13 + 2] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(((bArr[i15] >> 6) & 3) | ((bArr[i14] << 2) & 60));
            bArr2[i13 + 3] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(bArr[i15] & 63);
            return;
        }
        if (i12 != 2) {
            bArr2[i13 + 1] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((bArr[i11] << 4) & 48);
            return;
        }
        int i16 = (bArr[i11] << 4) & 48;
        int i17 = i11 + 1;
        bArr2[i13 + 1] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i16 | ((bArr[i17] >> 4) & 15));
        bArr2[i13 + 2] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((bArr[i17] << 2) & 60);
    }
}
