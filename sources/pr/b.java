package pr;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ur.d;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f81163a = "security:";

    /* renamed from: b, reason: collision with root package name */
    public static final String f81164b = "AES/GCM/NoPadding";

    /* renamed from: c, reason: collision with root package name */
    public static final String f81165c = "AES";

    /* renamed from: d, reason: collision with root package name */
    public static final String f81166d = "GCM";

    /* renamed from: e, reason: collision with root package name */
    public static final String f81167e = "";

    /* renamed from: f, reason: collision with root package name */
    public static final int f81168f = 16;

    /* renamed from: g, reason: collision with root package name */
    public static final int f81169g = 12;

    /* renamed from: h, reason: collision with root package name */
    public static final int f81170h = 2;

    public static int a(byte[] bArr) {
        return bArr[12] == 58 ? 12 : -1;
    }

    public static String b(String str) {
        return (TextUtils.isEmpty(str) || str.length() < 24) ? "" : str.substring(24);
    }

    public static byte[] c(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81166d, "encrypt 5 content is null");
            return new byte[0];
        }
        if (bArr == null) {
            h.d(f81166d, "encrypt 5 key is null");
            return new byte[0];
        }
        if (bArr.length < 16) {
            h.d(f81166d, "encrypt 5 key error: 5 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr2 == null) {
            h.d(f81166d, "encrypt 5 iv is null");
            return new byte[0];
        }
        if (bArr2.length < 12) {
            h.d(f81166d, "encrypt 5 iv error: 5 iv length less than 16 bytes.");
            return new byte[0];
        }
        if (!x()) {
            h.d(f81166d, "encrypt 5 build version not higher than 19");
            return new byte[0];
        }
        try {
            return v(str.getBytes("UTF-8"), bArr, bArr2);
        } catch (UnsupportedEncodingException e11) {
            h.d(f81166d, "GCM encrypt data error" + e11.getMessage());
            return new byte[0];
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static String e(String str) {
        if (!TextUtils.isEmpty(str) && str.length() >= 24) {
            return str.substring(0, 24);
        }
        h.d(f81166d, "IV is invalid.");
        return "";
    }

    public static byte[] f(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length - 12];
        System.arraycopy(bArr, 12, bArr2, 0, bArr.length - 12);
        return bArr2;
    }

    public static byte[] g(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 0, bArr2, 0, 12);
        return bArr2;
    }

    public static String h(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81166d, "decrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            h.d(f81166d, "decrypt 1 key is null");
            return "";
        }
        if (!x()) {
            h.d(f81166d, "decrypt 1 build version not higher than 19");
            return "";
        }
        byte[] c11 = d.c(str2);
        if (c11.length >= 16) {
            return j(str, c11);
        }
        h.d(f81166d, "decrypt 1 key error: 1 key length less than 16 bytes.");
        return "";
    }

    public static String i(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81166d, "decrypt 3 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            h.d(f81166d, "decrypt 3 key is null");
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            h.d(f81166d, "decrypt 3 iv is null");
            return "";
        }
        if (!x()) {
            h.d(f81166d, "decrypt 3 build version not higher than 19");
            return "";
        }
        byte[] c11 = d.c(str2);
        byte[] c12 = d.c(str3);
        if (c11.length < 16) {
            h.d(f81166d, "decrypt 3 key error: 3 key length less than 16 bytes.");
            return "";
        }
        if (c12.length >= 12) {
            return k(str, c11, c12);
        }
        h.d(f81166d, "decrypt 3 iv error: 3 iv length less than 16 bytes.");
        return "";
    }

    public static String j(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81166d, "decrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            h.d(f81166d, "decrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            h.d(f81166d, "decrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        }
        if (!x()) {
            h.d(f81166d, "decrypt 2 build version not higher than 19");
            return "";
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            String e11 = e(str);
            String b11 = b(str);
            if (TextUtils.isEmpty(e11)) {
                h.d(f81166d, "decrypt 2 iv is null");
                return "";
            }
            if (TextUtils.isEmpty(b11)) {
                h.d(f81166d, "decrypt 2 encrypt content is null");
                return "";
            }
            cipher.init(2, secretKeySpec, w(d.c(e11)));
            return new String(cipher.doFinal(d.c(b11)), "UTF-8");
        } catch (UnsupportedEncodingException e12) {
            e = e12;
            h.d(f81166d, "GCM decrypt data exception: " + e.getMessage());
            return "";
        } catch (NullPointerException e13) {
            e = e13;
            h.d(f81166d, "GCM decrypt data exception: " + e.getMessage());
            return "";
        } catch (GeneralSecurityException e14) {
            e = e14;
            h.d(f81166d, "GCM decrypt data exception: " + e.getMessage());
            return "";
        }
    }

    public static String k(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81166d, "decrypt 4 content is null");
            return "";
        }
        if (bArr == null) {
            h.d(f81166d, "decrypt 4 key is null");
            return "";
        }
        if (bArr.length < 16) {
            h.d(f81166d, "decrypt 4 key error: 4 key length less than 16 bytes.");
            return "";
        }
        if (bArr2 == null) {
            h.d(f81166d, "decrypt 4 iv is null");
            return "";
        }
        if (bArr2.length < 12) {
            h.d(f81166d, "decrypt 4 iv error: 4 iv length less than 16 bytes.");
            return "";
        }
        if (!x()) {
            h.d(f81166d, "decrypt 4 build version not higher than 19");
            return "";
        }
        try {
            return new String(m(d.c(str), bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            h.d(f81166d, "GCM decrypt data exception: " + e11.getMessage());
            return "";
        }
    }

    public static byte[] l(byte[] bArr, byte[] bArr2) {
        return m(f(bArr), bArr2, g(bArr));
    }

    public static byte[] m(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            h.d(f81166d, "decrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            h.d(f81166d, "decrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            h.d(f81166d, "decrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            h.d(f81166d, "decrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            h.d(f81166d, "decrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 12) {
            h.d(f81166d, "decrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        if (!x()) {
            h.d(f81166d, "decrypt 6 build version not higher than 19");
            return new byte[0];
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, w(bArr3));
            return cipher.doFinal(bArr);
        } catch (GeneralSecurityException e11) {
            h.d(f81166d, "GCM decrypt data exception: " + e11.getMessage());
            return new byte[0];
        }
    }

    public static String n(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length >= 16) {
            String h11 = a.h(str);
            if ("".equals(h11)) {
                return "";
            }
            int indexOf = h11.indexOf(58);
            if (indexOf >= 0) {
                return k(d.b(d.c(h11.substring(indexOf + 1))), bArr, d.c(h11.substring(0, indexOf)));
            }
            h.d(f81166d, " gcm cipherText data missing colon");
        }
        return "";
    }

    public static String o(byte[] bArr, byte[] bArr2) {
        try {
            return new String(p(bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            h.d(f81166d, "UnsupportedEncodingException");
            return "";
        }
    }

    public static byte[] p(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr2.length < 16) {
            return new byte[0];
        }
        byte[] j11 = a.j(bArr);
        if (j11.length == 0) {
            return new byte[0];
        }
        int a11 = a(j11);
        if (a11 < 0) {
            h.d(f81166d, " gcm cipherText data missing colon");
            return new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(j11, a11);
        int length = (j11.length - copyOf.length) - 1;
        byte[] bArr3 = new byte[length];
        System.arraycopy(j11, a11 + 1, bArr3, 0, length);
        return m(bArr3, bArr2, copyOf);
    }

    public static String q(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81166d, "encrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            h.d(f81166d, "encrypt 1 key is null");
            return "";
        }
        if (!x()) {
            h.d(f81166d, "encrypt 1 build version not higher than 19");
            return "";
        }
        byte[] c11 = d.c(str2);
        if (c11.length >= 16) {
            return s(str, c11);
        }
        h.d(f81166d, "encrypt key error: key length less than 16 bytes.");
        return "";
    }

    public static String r(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81166d, "encrypt 3 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            h.d(f81166d, "encrypt 3 key is null");
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            h.d(f81166d, "encrypt 3 iv is null");
            return "";
        }
        if (!x()) {
            h.d(f81166d, "encrypt 3 build version not higher than 19");
            return "";
        }
        byte[] c11 = d.c(str2);
        byte[] c12 = d.c(str3);
        if (c11.length < 16) {
            h.d(f81166d, "encrypt 3 key error: 3 key length less than 16 bytes.");
            return "";
        }
        if (c12.length >= 12) {
            return t(str, c11, c12);
        }
        h.d(f81166d, "encrypt 3 iv error: 3 iv length less than 16 bytes.");
        return "";
    }

    public static String s(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81166d, "encrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            h.d(f81166d, "encrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            h.d(f81166d, "encrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        }
        if (!x()) {
            h.d(f81166d, "encrypt 2 build version not higher than 19");
            return "";
        }
        byte[] d11 = ur.c.d(12);
        byte[] c11 = c(str, bArr, d11);
        if (c11 == null || c11.length == 0) {
            return "";
        }
        return d.b(d11) + d.b(c11);
    }

    public static String t(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81166d, "encrypt 4 content is null");
            return "";
        }
        if (bArr == null) {
            h.d(f81166d, "encrypt 4 key is null");
            return "";
        }
        if (bArr.length < 16) {
            h.d(f81166d, "encrypt 4 key error: 3 key length less than 16 bytes.");
            return "";
        }
        if (bArr2 == null) {
            h.d(f81166d, "encrypt 4 iv is null");
            return "";
        }
        if (bArr2.length < 12) {
            h.d(f81166d, "encrypt 3 iv error: 3 iv length less than 16 bytes.");
            return "";
        }
        if (x()) {
            return d.b(c(str, bArr, bArr2));
        }
        h.d(f81166d, "encrypt 4 build version not higher than 19");
        return "";
    }

    public static byte[] u(byte[] bArr, byte[] bArr2) {
        byte[] d11 = ur.c.d(12);
        return d(d11, v(bArr, bArr2, d11));
    }

    public static byte[] v(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            h.d(f81166d, "encrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            h.d(f81166d, "encrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            h.d(f81166d, "encrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            h.d(f81166d, "encrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            h.d(f81166d, "encrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 12) {
            h.d(f81166d, "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        if (!x()) {
            h.d(f81166d, "encrypt 6 build version not higher than 19");
            return new byte[0];
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, w(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e11) {
            h.d(f81166d, "GCM encrypt data error" + e11.getMessage());
            return new byte[0];
        } catch (GeneralSecurityException e12) {
            h.d(f81166d, "GCM encrypt data error" + e12.getMessage());
            return new byte[0];
        }
    }

    public static AlgorithmParameterSpec w(byte[] bArr) {
        return new GCMParameterSpec(128, bArr);
    }

    public static boolean x() {
        return true;
    }
}
