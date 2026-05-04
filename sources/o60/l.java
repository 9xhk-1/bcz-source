package o60;

import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l {
    public static byte[] a(String str) {
        return b(str, "ISO-8859-1");
    }

    public static byte[] b(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException e11) {
            throw h(str2, e11);
        }
    }

    public static byte[] c(String str) {
        return b(str, "US-ASCII");
    }

    public static byte[] d(String str) {
        return b(str, "UTF-16");
    }

    public static byte[] e(String str) {
        return b(str, n60.c.f74536d);
    }

    public static byte[] f(String str) {
        return b(str, n60.c.f74537e);
    }

    public static byte[] g(String str) {
        return b(str, "UTF-8");
    }

    public static IllegalStateException h(String str, UnsupportedEncodingException unsupportedEncodingException) {
        return new IllegalStateException(str + ": " + unsupportedEncodingException);
    }

    public static String i(byte[] bArr, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, str);
        } catch (UnsupportedEncodingException e11) {
            throw h(str, e11);
        }
    }

    public static String j(byte[] bArr) {
        return i(bArr, "ISO-8859-1");
    }

    public static String k(byte[] bArr) {
        return i(bArr, "US-ASCII");
    }

    public static String l(byte[] bArr) {
        return i(bArr, "UTF-16");
    }

    public static String m(byte[] bArr) {
        return i(bArr, n60.c.f74536d);
    }

    public static String n(byte[] bArr) {
        return i(bArr, n60.c.f74537e);
    }

    public static String o(byte[] bArr) {
        return i(bArr, "UTF-8");
    }
}
