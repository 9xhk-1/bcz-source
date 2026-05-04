package qr;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82669a = "SHA";

    /* renamed from: b, reason: collision with root package name */
    public static final String f82670b = "SHA-256";

    /* renamed from: c, reason: collision with root package name */
    public static final String f82671c = "";

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f82672d = {"SHA-256", "SHA-384", "SHA-512"};

    public static boolean a(String str) {
        for (String str2 : f82672d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        return c(str, "SHA-256");
    }

    public static String c(String str, String str2) {
        byte[] bArr;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            h.d(f82669a, "content or algorithm is null.");
            return "";
        }
        if (!a(str2)) {
            h.d(f82669a, "algorithm is not safe or legal");
            return "";
        }
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bArr = new byte[0];
            h.d(f82669a, "Error in generate SHA UnsupportedEncodingException");
        }
        return ur.d.b(d(bArr, str2));
    }

    public static byte[] d(byte[] bArr, String str) {
        if (bArr == null || TextUtils.isEmpty(str)) {
            h.d(f82669a, "content or algorithm is null.");
            return new byte[0];
        }
        if (!a(str)) {
            h.d(f82669a, "algorithm is not safe or legal");
            return new byte[0];
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException unused) {
            h.d(f82669a, "Error in generate SHA NoSuchAlgorithmException");
            return new byte[0];
        }
    }

    public static boolean e(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        return str2.equals(c(str, str3));
    }

    public static boolean f(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return str2.equals(b(str));
    }
}
