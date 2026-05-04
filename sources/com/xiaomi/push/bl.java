package com.xiaomi.push;

/* loaded from: classes8.dex */
public class bl {

    /* renamed from: a, reason: collision with other field name */
    private static byte[] f178a;

    /* renamed from: a, reason: collision with root package name */
    private static final String f45314a = System.getProperty("line.separator");

    /* renamed from: a, reason: collision with other field name */
    private static char[] f179a = new char[64];

    static {
        char c11 = 'A';
        int i11 = 0;
        while (c11 <= 'Z') {
            f179a[i11] = c11;
            c11 = (char) (c11 + 1);
            i11++;
        }
        char c12 = 'a';
        while (c12 <= 'z') {
            f179a[i11] = c12;
            c12 = (char) (c12 + 1);
            i11++;
        }
        char c13 = '0';
        while (c13 <= '9') {
            f179a[i11] = c13;
            c13 = (char) (c13 + 1);
            i11++;
        }
        char[] cArr = f179a;
        cArr[i11] = '+';
        cArr[i11 + 1] = '/';
        f178a = new byte[128];
        int i12 = 0;
        while (true) {
            byte[] bArr = f178a;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        for (int i13 = 0; i13 < 64; i13++) {
            f178a[f179a[i13]] = (byte) i13;
        }
    }

    public static String a(String str) {
        return new String(a(str.getBytes()));
    }

    public static String b(String str) {
        return new String(m5755a(str));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static byte[] m5755a(String str) {
        return a(str.toCharArray());
    }

    public static byte[] a(char[] cArr) {
        return a(cArr, 0, cArr.length);
    }

    public static byte[] a(char[] cArr, int i11, int i12) {
        char c11;
        if (i12 % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (i12 > 0 && cArr[(i11 + i12) - 1] == '=') {
            i12--;
        }
        int i13 = (i12 * 3) / 4;
        byte[] bArr = new byte[i13];
        int i14 = i12 + i11;
        int i15 = 0;
        while (i11 < i14) {
            char c12 = cArr[i11];
            int i16 = i11 + 2;
            char c13 = cArr[i11 + 1];
            char c14 = 'A';
            if (i16 < i14) {
                i11 += 3;
                c11 = cArr[i16];
            } else {
                i11 = i16;
                c11 = 'A';
            }
            if (i11 < i14) {
                c14 = cArr[i11];
                i11++;
            }
            if (c12 > 127 || c13 > 127 || c11 > 127 || c14 > 127) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            byte[] bArr2 = f178a;
            byte b11 = bArr2[c12];
            byte b12 = bArr2[c13];
            byte b13 = bArr2[c11];
            byte b14 = bArr2[c14];
            if (b11 < 0 || b12 < 0 || b13 < 0 || b14 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            int i17 = (b11 << 2) | (b12 >>> 4);
            int i18 = ((b12 & 15) << 4) | (b13 >>> 2);
            int i19 = ((b13 & 3) << 6) | b14;
            int i21 = i15 + 1;
            bArr[i15] = (byte) i17;
            if (i21 < i13) {
                bArr[i21] = (byte) i18;
                i21 = i15 + 2;
            }
            if (i21 < i13) {
                i15 = i21 + 1;
                bArr[i21] = (byte) i19;
            } else {
                i15 = i21;
            }
        }
        return bArr;
    }

    public static char[] a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static char[] a(byte[] bArr, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = ((i12 * 4) + 2) / 3;
        char[] cArr = new char[((i12 + 2) / 3) * 4];
        int i18 = i12 + i11;
        int i19 = 0;
        while (i11 < i18) {
            int i21 = i11 + 1;
            byte b11 = bArr[i11];
            int i22 = b11 & 255;
            if (i21 < i18) {
                i13 = i11 + 2;
                i14 = bArr[i21] & 255;
            } else {
                i13 = i21;
                i14 = 0;
            }
            if (i13 < i18) {
                i15 = i13 + 1;
                i16 = bArr[i13] & 255;
            } else {
                i15 = i13;
                i16 = 0;
            }
            int i23 = ((b11 & 3) << 4) | (i14 >>> 4);
            int i24 = ((i14 & 15) << 2) | (i16 >>> 6);
            int i25 = i16 & 63;
            char[] cArr2 = f179a;
            cArr[i19] = cArr2[i22 >>> 2];
            int i26 = i19 + 2;
            cArr[i19 + 1] = cArr2[i23];
            char c11 = '=';
            cArr[i26] = i26 < i17 ? cArr2[i24] : '=';
            int i27 = i19 + 3;
            if (i27 < i17) {
                c11 = cArr2[i25];
            }
            cArr[i27] = c11;
            i19 += 4;
            i11 = i15;
        }
        return cArr;
    }
}
