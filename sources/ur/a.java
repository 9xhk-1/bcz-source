package ur;

import android.annotation.SuppressLint;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f92403a = "BaseKeyUtil";

    /* renamed from: b, reason: collision with root package name */
    public static final int f92404b = 16;

    /* renamed from: c, reason: collision with root package name */
    public static final int f92405c = 16;

    /* renamed from: d, reason: collision with root package name */
    public static final int f92406d = 10000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f92407e = 32;

    /* renamed from: f, reason: collision with root package name */
    public static final int f92408f = 1;

    public static int a(int i11, int i12, int i13) {
        if (i12 < i11) {
            i11 = i12;
        }
        return i13 < i11 ? i13 : i11;
    }

    public static boolean b(int i11) {
        return i11 >= 16;
    }

    public static boolean c(int i11, byte[] bArr) {
        return b(i11) & d(bArr);
    }

    public static boolean d(byte[] bArr) {
        return bArr.length >= 16;
    }

    public static String e(String str, String str2, String str3, byte[] bArr, int i11, boolean z11) {
        return d.b(h(str, str2, str3, bArr, i11, z11));
    }

    public static byte[] f(String str, String str2, String str3, String str4, int i11, boolean z11) {
        return h(str, str2, str3, d.c(str4), i11, z11);
    }

    public static byte[] g(String str, String str2, String str3, byte[] bArr, int i11, int i12, boolean z11) {
        byte[] c11 = d.c(str);
        byte[] c12 = d.c(str2);
        byte[] c13 = d.c(str3);
        int a11 = a(c11.length, c12.length, c13.length);
        if (!c(a11, bArr)) {
            throw new IllegalArgumentException("key length must be more than 128bit.");
        }
        char[] cArr = new char[a11];
        for (int i13 = 0; i13 < a11; i13++) {
            cArr[i13] = (char) ((c11[i13] ^ c12[i13]) ^ c13[i13]);
        }
        if (z11) {
            h.e(f92403a, "exportRootKey: sha256");
            return qr.c.j(cArr, bArr, i11, i12 * 8);
        }
        h.e(f92403a, "exportRootKey: sha1");
        return qr.c.c(cArr, bArr, i11, i12 * 8);
    }

    @SuppressLint({"NewApi"})
    public static byte[] h(String str, String str2, String str3, byte[] bArr, int i11, boolean z11) {
        return g(str, str2, str3, bArr, 10000, i11, z11);
    }

    @SuppressLint({"NewApi"})
    public static byte[] i(String str, String str2, String str3, byte[] bArr, boolean z11) {
        return h(str, str2, str3, bArr, 16, z11);
    }

    public static byte[] j(String str, String str2, String str3, byte[] bArr, boolean z11) {
        return h(str, str2, str3, bArr, 32, z11);
    }

    public static byte[] k(String str, String str2, String str3, byte[] bArr, boolean z11) {
        return g(str, str2, str3, bArr, 1, 32, z11);
    }

    @SuppressLint({"NewApi"})
    public static byte[] l(String str, String str2, String str3, byte[] bArr, boolean z11) {
        return g(str, str2, str3, bArr, 1, 16, z11);
    }
}
