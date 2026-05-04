package com.huawei.hms.support.log.common;

import ho.c;
import io.ktor.util.date.b;
import kx.a0;
import s60.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class Base64 {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f36435a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', b.f62002h, 'Z', 'a', 'b', 'c', b.f62000f, 'e', 'f', 'g', b.f61999e, 'i', 'j', 'k', 'l', b.f61998d, 'n', 'o', 'p', 'q', 'r', b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/', '='};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f36436b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, c.f59556u, 19, 20, c.f59560y, c.f59561z, c.A, c.B, c.C, -1, -1, -1, -1, -1, -1, c.D, c.E, 28, c.G, c.H, 31, 32, 33, 34, 35, 36, e.f88061c, 38, 39, 40, 41, 42, 43, 44, a0.f68904b, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    private Base64() {
    }

    private static int a(String str) {
        int length = str.length();
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt > 255 || f36436b[charAt] < 0) {
                length--;
            }
        }
        return length;
    }

    public static byte[] decode(String str) {
        if (str == null) {
            return new byte[0];
        }
        int a11 = a(str);
        int i11 = (a11 / 4) * 3;
        int i12 = a11 % 4;
        if (i12 == 3) {
            i11 += 2;
        }
        if (i12 == 2) {
            i11++;
        }
        byte[] bArr = new byte[i11];
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < str.length(); i16++) {
            char charAt = str.charAt(i16);
            byte b11 = charAt > 255 ? (byte) -1 : f36436b[charAt];
            if (b11 >= 0) {
                int i17 = i15 + 6;
                i14 = (i14 << 6) | b11;
                if (i17 >= 8) {
                    i15 -= 2;
                    bArr[i13] = (byte) (255 & (i14 >> i15));
                    i13++;
                } else {
                    i15 = i17;
                }
            }
        }
        return i13 != i11 ? new byte[0] : bArr;
    }

    public static String encode(byte[] bArr) {
        return bArr == null ? "" : encode(bArr, bArr.length);
    }

    public static String encode(byte[] bArr, int i11) {
        boolean z11;
        if (bArr == null) {
            return "";
        }
        char[] cArr = new char[((i11 + 2) / 3) * 4];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = (bArr[i12] & 255) << 8;
            int i15 = i12 + 1;
            boolean z12 = true;
            if (i15 < i11) {
                i14 |= bArr[i15] & 255;
                z11 = true;
            } else {
                z11 = false;
            }
            int i16 = i14 << 8;
            int i17 = i12 + 2;
            if (i17 < i11) {
                i16 |= bArr[i17] & 255;
            } else {
                z12 = false;
            }
            int i18 = i13 + 3;
            char[] cArr2 = f36435a;
            int i19 = 64;
            cArr[i18] = cArr2[z12 ? i16 & 63 : 64];
            int i21 = i16 >> 6;
            int i22 = i13 + 2;
            if (z11) {
                i19 = i21 & 63;
            }
            cArr[i22] = cArr2[i19];
            cArr[i13 + 1] = cArr2[(i16 >> 12) & 63];
            cArr[i13] = cArr2[(i16 >> 18) & 63];
            i12 += 3;
            i13 += 4;
        }
        return new String(cArr);
    }
}
