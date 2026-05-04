package a3;

import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1462a = "\n";

    /* renamed from: b, reason: collision with root package name */
    public static final a f1463b = new a('+', '/');

    /* renamed from: c, reason: collision with root package name */
    public static final a f1464c = new a('-', '_');

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final char[] f1465a = new char[64];

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f1466b = new byte[128];

        public a(char c11, char c12) {
            char c13 = 'A';
            int i11 = 0;
            while (c13 <= 'Z') {
                this.f1465a[i11] = c13;
                c13 = (char) (c13 + 1);
                i11++;
            }
            char c14 = 'a';
            while (c14 <= 'z') {
                this.f1465a[i11] = c14;
                c14 = (char) (c14 + 1);
                i11++;
            }
            char c15 = '0';
            while (c15 <= '9') {
                this.f1465a[i11] = c15;
                c15 = (char) (c15 + 1);
                i11++;
            }
            char[] cArr = this.f1465a;
            cArr[i11] = c11;
            cArr[i11 + 1] = c12;
            int i12 = 0;
            while (true) {
                byte[] bArr = this.f1466b;
                if (i12 >= bArr.length) {
                    break;
                }
                bArr[i12] = -1;
                i12++;
            }
            for (int i13 = 0; i13 < 64; i13++) {
                this.f1466b[this.f1465a[i13]] = (byte) i13;
            }
        }

        public byte[] a() {
            return this.f1466b;
        }

        public char[] b() {
            return this.f1465a;
        }
    }

    public static byte[] a(String str) {
        return c(str.toCharArray());
    }

    public static byte[] b(String str, a aVar) {
        return f(str.toCharArray(), aVar);
    }

    public static byte[] c(char[] cArr) {
        return e(cArr, 0, cArr.length, f1463b.f1466b);
    }

    public static byte[] d(char[] cArr, int i11, int i12, a aVar) {
        return e(cArr, i11, i12, aVar.f1466b);
    }

    public static byte[] e(char[] cArr, int i11, int i12, byte[] bArr) {
        char c11;
        if (i12 % 4 != 0) {
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        }
        while (i12 > 0 && cArr[(i11 + i12) - 1] == '=') {
            i12--;
        }
        int i13 = (i12 * 3) / 4;
        byte[] bArr2 = new byte[i13];
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
            byte b11 = bArr[c12];
            byte b12 = bArr[c13];
            byte b13 = bArr[c11];
            byte b14 = bArr[c14];
            if (b11 < 0 || b12 < 0 || b13 < 0 || b14 < 0) {
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            }
            int i17 = (b11 << 2) | (b12 >>> 4);
            int i18 = ((b12 & 15) << 4) | (b13 >>> 2);
            int i19 = ((b13 & 3) << 6) | b14;
            int i21 = i15 + 1;
            bArr2[i15] = (byte) i17;
            if (i21 < i13) {
                bArr2[i21] = (byte) i18;
                i21 = i15 + 2;
            }
            if (i21 < i13) {
                i15 = i21 + 1;
                bArr2[i21] = (byte) i19;
            } else {
                i15 = i21;
            }
        }
        return bArr2;
    }

    public static byte[] f(char[] cArr, a aVar) {
        return d(cArr, 0, cArr.length, aVar);
    }

    public static byte[] g(char[] cArr, byte[] bArr) {
        return e(cArr, 0, cArr.length, bArr);
    }

    public static byte[] h(String str) {
        return j(str, f1463b.f1466b);
    }

    public static byte[] i(String str, a aVar) {
        return j(str, aVar.f1466b);
    }

    public static byte[] j(String str, byte[] bArr) {
        char[] cArr = new char[str.length()];
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char charAt = str.charAt(i12);
            if (charAt != ' ' && charAt != '\r' && charAt != '\n' && charAt != '\t') {
                cArr[i11] = charAt;
                i11++;
            }
        }
        return e(cArr, 0, i11, bArr);
    }

    public static String k(String str) {
        return l(str, false);
    }

    public static String l(String str, boolean z11) {
        return new String(g(str.toCharArray(), (z11 ? f1464c : f1463b).f1466b));
    }

    public static char[] m(byte[] bArr) {
        return r(bArr, f1463b.f1465a);
    }

    public static char[] n(byte[] bArr, int i11) {
        return p(bArr, 0, i11, f1463b.f1465a);
    }

    public static char[] o(byte[] bArr, int i11, int i12, a aVar) {
        return p(bArr, i11, i12, aVar.f1465a);
    }

    public static char[] p(byte[] bArr, int i11, int i12, char[] cArr) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = ((i12 * 4) + 2) / 3;
        char[] cArr2 = new char[((i12 + 2) / 3) * 4];
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
            cArr2[i19] = cArr[i22 >>> 2];
            int i26 = i19 + 2;
            cArr2[i19 + 1] = cArr[i23];
            char c11 = '=';
            cArr2[i26] = i26 < i17 ? cArr[i24] : '=';
            int i27 = i19 + 3;
            if (i27 < i17) {
                c11 = cArr[i25];
            }
            cArr2[i27] = c11;
            i19 += 4;
            i11 = i15;
        }
        return cArr2;
    }

    public static char[] q(byte[] bArr, a aVar) {
        return o(bArr, 0, bArr.length, aVar);
    }

    public static char[] r(byte[] bArr, char[] cArr) {
        return p(bArr, 0, bArr.length, cArr);
    }

    public static String s(byte[] bArr) {
        return u(bArr, 0, bArr.length, 76, "\n", f1463b.f1465a);
    }

    public static String t(byte[] bArr, int i11, int i12, int i13, String str, a aVar) {
        return u(bArr, i11, i12, i13, str, aVar.f1465a);
    }

    public static String u(byte[] bArr, int i11, int i12, int i13, String str, char[] cArr) {
        int i14 = (i13 * 3) / 4;
        if (i14 <= 0) {
            throw new IllegalArgumentException();
        }
        y0 y0Var = new y0((((i12 + 2) / 3) * 4) + ((((i12 + i14) - 1) / i14) * str.length()));
        int i15 = 0;
        while (i15 < i12) {
            int min = Math.min(i12 - i15, i14);
            y0Var.R(p(bArr, i11 + i15, min, cArr));
            y0Var.O(str);
            i15 += min;
        }
        return y0Var.toString();
    }

    public static String v(String str) {
        return w(str, false);
    }

    public static String w(String str, boolean z11) {
        try {
            return new String(r(str.getBytes("UTF-8"), (z11 ? f1464c : f1463b).f1465a));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }
}
