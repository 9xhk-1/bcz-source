package com.mob.secverify.pure.core.ope.b.c;

import kx.a0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f40867a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f40868b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 63, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, 0, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, ho.c.f59556u, 19, 20, ho.c.f59560y, ho.c.f59561z, ho.c.A, ho.c.B, ho.c.C, -1, -1, -1, -1, -1, -1, ho.c.D, ho.c.E, 28, ho.c.G, ho.c.H, 31, 32, 33, 34, 35, 36, s60.e.f88061c, 38, 39, 40, 41, 42, 43, 44, a0.f68904b, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    private a() {
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(((bArr.length - 1) / 3) << 6);
        int i11 = 0;
        for (int i12 = 0; i12 < bArr.length; i12++) {
            int i13 = i12 % 3;
            i11 |= (bArr[i12] & 255) << (16 - (i13 << 3));
            if (i13 == 2 || i12 == bArr.length - 1) {
                char[] cArr = f40867a;
                stringBuffer.append(cArr[(16515072 & i11) >>> 18]);
                stringBuffer.append(cArr[(258048 & i11) >>> 12]);
                stringBuffer.append(cArr[(i11 & 4032) >>> 6]);
                stringBuffer.append(cArr[i11 & 63]);
                i11 = 0;
            }
        }
        if (bArr.length % 3 > 0) {
            stringBuffer.setCharAt(stringBuffer.length() - 1, '=');
        }
        if (bArr.length % 3 == 1) {
            stringBuffer.setCharAt(stringBuffer.length() - 2, '=');
        }
        return stringBuffer.toString();
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 4 == 0) {
            if (str.length() == 0) {
                return new byte[0];
            }
            int i11 = str.charAt(length + (-1)) == '=' ? 1 : 0;
            if (str.charAt(length - 2) == '=') {
                i11++;
            }
            int i12 = ((length / 4) * 3) - i11;
            byte[] bArr = new byte[i12];
            for (int i13 = 0; i13 < length; i13 += 4) {
                int i14 = (i13 / 4) * 3;
                char charAt = str.charAt(i13);
                char charAt2 = str.charAt(i13 + 1);
                char charAt3 = str.charAt(i13 + 2);
                char charAt4 = str.charAt(i13 + 3);
                byte[] bArr2 = f40868b;
                int i15 = (bArr2[charAt] << ho.c.f59556u) | (bArr2[charAt2] << 12) | (bArr2[charAt3] << 6) | bArr2[charAt4];
                bArr[i14] = (byte) ((i15 >> 16) & 255);
                if (i13 < length - 4) {
                    bArr[i14 + 1] = (byte) ((i15 >> 8) & 255);
                    bArr[i14 + 2] = (byte) i15;
                } else {
                    int i16 = i14 + 1;
                    if (i16 < i12) {
                        bArr[i16] = (byte) ((i15 >> 8) & 255);
                    }
                    int i17 = i14 + 2;
                    if (i17 < i12) {
                        bArr[i17] = (byte) i15;
                    }
                }
            }
            return bArr;
        }
        throw new IllegalArgumentException("Base64 string length must be 4*n");
    }
}
