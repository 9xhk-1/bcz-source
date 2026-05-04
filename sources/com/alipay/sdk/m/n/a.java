package com.alipay.sdk.m.n;

import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f10849a = 128;

    /* renamed from: b, reason: collision with root package name */
    public static final int f10850b = 64;

    /* renamed from: c, reason: collision with root package name */
    public static final int f10851c = 24;

    /* renamed from: d, reason: collision with root package name */
    public static final int f10852d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f10853e = 16;

    /* renamed from: f, reason: collision with root package name */
    public static final int f10854f = 4;

    /* renamed from: g, reason: collision with root package name */
    public static final int f10855g = -128;

    /* renamed from: h, reason: collision with root package name */
    public static final char f10856h = '=';

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f10857i = new byte[128];

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f10858j = new char[64];

    static {
        int i11 = 0;
        for (int i12 = 0; i12 < 128; i12++) {
            f10857i[i12] = -1;
        }
        for (int i13 = 90; i13 >= 65; i13--) {
            f10857i[i13] = (byte) (i13 - 65);
        }
        for (int i14 = 122; i14 >= 97; i14--) {
            f10857i[i14] = (byte) (i14 - 71);
        }
        for (int i15 = 57; i15 >= 48; i15--) {
            f10857i[i15] = (byte) (i15 + 4);
        }
        byte[] bArr = f10857i;
        bArr[43] = 62;
        bArr[47] = 63;
        for (int i16 = 0; i16 <= 25; i16++) {
            f10858j[i16] = (char) (i16 + 65);
        }
        int i17 = 26;
        int i18 = 0;
        while (i17 <= 51) {
            f10858j[i17] = (char) (i18 + 97);
            i17++;
            i18++;
        }
        int i19 = 52;
        while (i19 <= 61) {
            f10858j[i19] = (char) (i11 + 48);
            i19++;
            i11++;
        }
        char[] cArr = f10858j;
        cArr[62] = '+';
        cArr[63] = '/';
    }

    public static boolean a(char c11) {
        return c11 < 128 && f10857i[c11] != -1;
    }

    public static boolean b(char c11) {
        return c11 == '=';
    }

    public static boolean c(char c11) {
        return c11 == ' ' || c11 == '\r' || c11 == '\n' || c11 == '\t';
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * 8;
        if (length == 0) {
            return "";
        }
        int i11 = length % 24;
        int i12 = length / 24;
        char[] cArr = new char[(i11 != 0 ? i12 + 1 : i12) * 4];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            byte b11 = bArr[i13];
            int i16 = i13 + 2;
            byte b12 = bArr[i13 + 1];
            i13 += 3;
            byte b13 = bArr[i16];
            byte b14 = (byte) (b12 & 15);
            byte b15 = (byte) (b11 & 3);
            int i17 = b11 & Byte.MIN_VALUE;
            int i18 = b11 >> 2;
            if (i17 != 0) {
                i18 ^= 192;
            }
            byte b16 = (byte) i18;
            int i19 = b12 & Byte.MIN_VALUE;
            int i21 = b12 >> 4;
            if (i19 != 0) {
                i21 ^= 240;
            }
            byte b17 = (byte) i21;
            byte b18 = (byte) ((b13 & Byte.MIN_VALUE) == 0 ? b13 >> 6 : (b13 >> 6) ^ R.styleable.Theme_drawable_wiki_sound1);
            char[] cArr2 = f10858j;
            cArr[i14] = cArr2[b16];
            cArr[i14 + 1] = cArr2[b17 | (b15 << 4)];
            int i22 = i14 + 3;
            cArr[i14 + 2] = cArr2[(b14 << 2) | b18];
            i14 += 4;
            cArr[i22] = cArr2[b13 & 63];
        }
        if (i11 == 8) {
            byte b19 = bArr[i13];
            byte b21 = (byte) (b19 & 3);
            int i23 = b19 & Byte.MIN_VALUE;
            int i24 = b19 >> 2;
            if (i23 != 0) {
                i24 ^= 192;
            }
            byte b22 = (byte) i24;
            char[] cArr3 = f10858j;
            cArr[i14] = cArr3[b22];
            cArr[i14 + 1] = cArr3[b21 << 4];
            cArr[i14 + 2] = '=';
            cArr[i14 + 3] = '=';
        } else if (i11 == 16) {
            byte b23 = bArr[i13];
            byte b24 = bArr[i13 + 1];
            byte b25 = (byte) (b24 & 15);
            byte b26 = (byte) (b23 & 3);
            int i25 = b23 & Byte.MIN_VALUE;
            int i26 = b23 >> 2;
            if (i25 != 0) {
                i26 ^= 192;
            }
            byte b27 = (byte) i26;
            int i27 = b24 & Byte.MIN_VALUE;
            int i28 = b24 >> 4;
            if (i27 != 0) {
                i28 ^= 240;
            }
            byte b28 = (byte) i28;
            char[] cArr4 = f10858j;
            cArr[i14] = cArr4[b27];
            cArr[i14 + 1] = cArr4[b28 | (b26 << 4)];
            cArr[i14 + 2] = cArr4[b25 << 2];
            cArr[i14 + 3] = '=';
        }
        return new String(cArr);
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int a11 = a(charArray);
        if (a11 % 4 != 0) {
            return null;
        }
        int i11 = a11 / 4;
        if (i11 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i11 * 3];
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i11 - 1) {
            int i15 = i13 + 1;
            char c11 = charArray[i13];
            if (a(c11)) {
                int i16 = i13 + 2;
                char c12 = charArray[i15];
                if (a(c12)) {
                    int i17 = i13 + 3;
                    char c13 = charArray[i16];
                    if (a(c13)) {
                        i13 += 4;
                        char c14 = charArray[i17];
                        if (a(c14)) {
                            byte[] bArr2 = f10857i;
                            byte b11 = bArr2[c11];
                            byte b12 = bArr2[c12];
                            byte b13 = bArr2[c13];
                            byte b14 = bArr2[c14];
                            bArr[i14] = (byte) ((b11 << 2) | (b12 >> 4));
                            int i18 = i14 + 2;
                            bArr[i14 + 1] = (byte) (((b12 & 15) << 4) | ((b13 >> 2) & 15));
                            i14 += 3;
                            bArr[i18] = (byte) ((b13 << 6) | b14);
                            i12++;
                        }
                    }
                }
            }
            return null;
        }
        int i19 = i13 + 1;
        char c15 = charArray[i13];
        if (!a(c15)) {
            return null;
        }
        int i21 = i13 + 2;
        char c16 = charArray[i19];
        if (!a(c16)) {
            return null;
        }
        byte[] bArr3 = f10857i;
        byte b15 = bArr3[c15];
        byte b16 = bArr3[c16];
        char c17 = charArray[i21];
        char c18 = charArray[i13 + 3];
        if (a(c17) && a(c18)) {
            byte b17 = bArr3[c17];
            byte b18 = bArr3[c18];
            bArr[i14] = (byte) ((b15 << 2) | (b16 >> 4));
            bArr[i14 + 1] = (byte) (((b16 & 15) << 4) | ((b17 >> 2) & 15));
            bArr[i14 + 2] = (byte) (b18 | (b17 << 6));
            return bArr;
        }
        if (b(c17) && b(c18)) {
            if ((b16 & 15) != 0) {
                return null;
            }
            int i22 = i12 * 3;
            byte[] bArr4 = new byte[i22 + 1];
            System.arraycopy(bArr, 0, bArr4, 0, i22);
            bArr4[i14] = (byte) ((b15 << 2) | (b16 >> 4));
            return bArr4;
        }
        if (b(c17) || !b(c18)) {
            return null;
        }
        byte b19 = bArr3[c17];
        if ((b19 & 3) != 0) {
            return null;
        }
        int i23 = i12 * 3;
        byte[] bArr5 = new byte[i23 + 2];
        System.arraycopy(bArr, 0, bArr5, 0, i23);
        bArr5[i14] = (byte) ((b15 << 2) | (b16 >> 4));
        bArr5[i14 + 1] = (byte) (((b19 >> 2) & 15) | ((b16 & 15) << 4));
        return bArr5;
    }

    public static int a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (!c(cArr[i12])) {
                cArr[i11] = cArr[i12];
                i11++;
            }
        }
        return i11;
    }
}
