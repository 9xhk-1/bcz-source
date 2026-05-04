package e80;

import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d {
    public static byte[] a(String str) {
        a.j(str, "Input");
        return str.getBytes(org.apache.http.b.f77708f);
    }

    public static String b(byte[] bArr) {
        a.j(bArr, "Input");
        return c(bArr, 0, bArr.length);
    }

    public static String c(byte[] bArr, int i11, int i12) {
        a.j(bArr, "Input");
        return new String(bArr, i11, i12, org.apache.http.b.f77708f);
    }

    public static byte[] d(String str, String str2) {
        a.j(str, "Input");
        a.f(str2, "Charset");
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static String e(byte[] bArr, int i11, int i12, String str) {
        a.j(bArr, "Input");
        a.f(str, "Charset");
        try {
            return new String(bArr, i11, i12, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr, i11, i12);
        }
    }

    public static String f(byte[] bArr, String str) {
        a.j(bArr, "Input");
        return e(bArr, 0, bArr.length, str);
    }
}
