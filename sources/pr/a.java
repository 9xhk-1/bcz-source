package pr;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ur.d;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f81156a = "security:";

    /* renamed from: b, reason: collision with root package name */
    public static final String f81157b = "AES/CBC/PKCS5Padding";

    /* renamed from: c, reason: collision with root package name */
    public static final String f81158c = "AES";

    /* renamed from: d, reason: collision with root package name */
    public static final String f81159d = "CBC";

    /* renamed from: e, reason: collision with root package name */
    public static final String f81160e = "";

    /* renamed from: f, reason: collision with root package name */
    public static final int f81161f = 16;

    /* renamed from: g, reason: collision with root package name */
    public static final int f81162g = 16;

    public static int a(byte[] bArr) {
        return bArr[16] == 58 ? 16 : -1;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(0, 6) + str.substring(12, 16) + str.substring(26, 32) + str.substring(48);
        } catch (Exception e11) {
            h.d(f81159d, "get encryptword exception : " + e11.getMessage());
            return "";
        }
    }

    public static String c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                return str2.substring(0, 6) + str.substring(0, 6) + str2.substring(6, 10) + str.substring(6, 16) + str2.substring(10, 16) + str.substring(16) + str2.substring(16);
            } catch (Exception e11) {
                h.d(f81159d, "mix exception: " + e11.getMessage());
            }
        }
        return "";
    }

    public static byte[] d(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81159d, "encrypt 5 content is null");
            return new byte[0];
        }
        if (bArr == null) {
            h.d(f81159d, "encrypt 5 key is null");
            return new byte[0];
        }
        if (bArr.length < 16) {
            h.d(f81159d, "encrypt 5 key error: 5 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr2 == null) {
            h.d(f81159d, "encrypt 5 iv is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            h.d(f81159d, "encrypt 5 iv error: 5 iv length less than 16 bytes.");
            return new byte[0];
        }
        try {
            return y(str.getBytes("UTF-8"), bArr, bArr2);
        } catch (UnsupportedEncodingException e11) {
            h.d(f81159d, " cbc encrypt data error" + e11.getMessage());
            return new byte[0];
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static String f(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return str.substring(6, 12) + str.substring(16, 26) + str.substring(32, 48);
        } catch (Exception e11) {
            h.d(f81159d, "getIv exception : " + e11.getMessage());
            return "";
        }
    }

    public static byte[] g(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length - 16];
        System.arraycopy(bArr, 16, bArr2, 0, bArr.length - 16);
        return bArr2;
    }

    public static String h(String str) {
        return (TextUtils.isEmpty(str) || str.indexOf("security:") == -1) ? "" : str.substring(9);
    }

    public static byte[] i(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        System.arraycopy(bArr, 0, bArr2, 0, 16);
        return bArr2;
    }

    public static byte[] j(byte[] bArr) {
        String str;
        try {
            str = new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            h.d(f81159d, "stripCryptHead: exception : " + e11.getMessage());
            str = "";
        }
        if (!str.startsWith("security:")) {
            return new byte[0];
        }
        if (bArr.length <= 9) {
            return new byte[0];
        }
        int length = bArr.length - 9;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 9, bArr2, 0, length);
        return bArr2;
    }

    public static String k(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81159d, "decrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            h.d(f81159d, "decrypt 1 key is null");
            return "";
        }
        byte[] c11 = d.c(str2);
        if (c11.length >= 16) {
            return m(str, c11);
        }
        h.d(f81159d, "decrypt 1 key error: 1 key length less than 16 bytes.");
        return "";
    }

    public static String l(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81159d, "decrypt 3 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            h.d(f81159d, "decrypt 3 key is null");
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            h.d(f81159d, "decrypt 3 iv is null");
            return "";
        }
        byte[] c11 = d.c(str2);
        byte[] c12 = d.c(str3);
        if (c11.length < 16) {
            h.d(f81159d, "decrypt 3 key error: 3 key length less than 16 bytes.");
            return "";
        }
        if (c12.length >= 16) {
            return n(str, c11, c12);
        }
        h.d(f81159d, "decrypt 3 iv error: 3 iv length less than 16 bytes.");
        return "";
    }

    public static String m(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81159d, "decrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            h.d(f81159d, "decrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            h.d(f81159d, "decrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        }
        String f11 = f(str);
        String b11 = b(str);
        if (TextUtils.isEmpty(f11)) {
            h.d(f81159d, "decrypt 2 iv is null");
            return "";
        }
        if (!TextUtils.isEmpty(b11)) {
            return n(b11, bArr, d.c(f11));
        }
        h.d(f81159d, "decrypt 2 encrypt content is null");
        return "";
    }

    public static String n(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81159d, "decrypt 4 content is null");
            return "";
        }
        if (bArr == null) {
            h.d(f81159d, "decrypt 4 key is null");
            return "";
        }
        if (bArr.length < 16) {
            h.d(f81159d, "decrypt 4 key error: 4 key length less than 16 bytes.");
            return "";
        }
        if (bArr2 == null) {
            h.d(f81159d, "decrypt 4 iv is null");
            return "";
        }
        if (bArr2.length < 16) {
            h.d(f81159d, "decrypt 4 iv error: 4 iv length less than 16 bytes.");
            return "";
        }
        try {
            return new String(p(d.c(str), bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            h.d(f81159d, " cbc decrypt data error" + e11.getMessage());
            return "";
        }
    }

    public static byte[] o(byte[] bArr, byte[] bArr2) {
        return p(g(bArr), bArr2, i(bArr));
    }

    public static byte[] p(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            h.d(f81159d, "decrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            h.d(f81159d, "decrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            h.d(f81159d, "decrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            h.d(f81159d, "decrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            h.d(f81159d, "decrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            h.d(f81159d, "decrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e11) {
            h.d(f81159d, "NullPointerException: " + e11.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e12) {
            h.d(f81159d, "InvalidAlgorithmParameterException: " + e12.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e13) {
            h.d(f81159d, "InvalidKeyException: " + e13.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e14) {
            h.d(f81159d, "NoSuchAlgorithmException: " + e14.getMessage());
            return new byte[0];
        } catch (BadPaddingException e15) {
            h.d(f81159d, "BadPaddingException: " + e15.getMessage());
            h.d(f81159d, "key is not right");
            return new byte[0];
        } catch (IllegalBlockSizeException e16) {
            h.d(f81159d, "IllegalBlockSizeException: " + e16.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e17) {
            h.d(f81159d, "NoSuchPaddingException: " + e17.getMessage());
            return new byte[0];
        }
    }

    public static String q(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length >= 16) {
            String h11 = h(str);
            if ("".equals(h11)) {
                return "";
            }
            int indexOf = h11.indexOf(58);
            if (indexOf >= 0) {
                return n(d.b(d.c(h11.substring(indexOf + 1))), bArr, d.c(h11.substring(0, indexOf)));
            }
            h.d(f81159d, " cbc cipherText data missing colon");
        }
        return "";
    }

    public static String r(byte[] bArr, byte[] bArr2) {
        try {
            return new String(s(bArr, bArr2), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            h.d(f81159d, "decryptWithCryptHead UnsupportedEncodingException ");
            return "";
        }
    }

    public static byte[] s(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr2.length < 16) {
            return new byte[0];
        }
        byte[] j11 = j(bArr);
        if (j11.length == 0) {
            return new byte[0];
        }
        int a11 = a(j11);
        if (a11 < 0) {
            h.d(f81159d, " cbc cipherText data missing colon");
            return new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(j11, a11);
        int length = (j11.length - copyOf.length) - 1;
        byte[] bArr3 = new byte[length];
        System.arraycopy(j11, a11 + 1, bArr3, 0, length);
        return p(bArr3, bArr2, copyOf);
    }

    public static String t(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81159d, "encrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            h.d(f81159d, "encrypt 1 key is null");
            return "";
        }
        byte[] c11 = d.c(str2);
        if (c11.length >= 16) {
            return v(str, c11);
        }
        h.d(f81159d, "encrypt 1 key error: 1 key length less than 16 bytes.");
        return "";
    }

    public static String u(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81159d, "encrypt 3 content is null");
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            h.d(f81159d, "encrypt 3 key is null");
            return "";
        }
        if (TextUtils.isEmpty(str3)) {
            h.d(f81159d, "encrypt 3 iv is null");
            return "";
        }
        byte[] c11 = d.c(str2);
        byte[] c12 = d.c(str3);
        if (c11.length < 16) {
            h.d(f81159d, "encrypt 3 key error: 3 key length less than 16 bytes.");
            return "";
        }
        if (c12.length >= 16) {
            return w(str, c11, c12);
        }
        h.d(f81159d, "encrypt 3 iv error: 3 iv length less than 16 bytes.");
        return "";
    }

    public static String v(String str, byte[] bArr) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81159d, "encrypt 2 content is null");
            return "";
        }
        if (bArr == null) {
            h.d(f81159d, "encrypt 2 key is null");
            return "";
        }
        if (bArr.length < 16) {
            h.d(f81159d, "encrypt 2 key error: 2 key length less than 16 bytes.");
            return "";
        }
        byte[] d11 = ur.c.d(16);
        byte[] d12 = d(str, bArr, d11);
        return (d12 == null || d12.length == 0) ? "" : c(d.b(d11), d.b(d12));
    }

    public static String w(String str, byte[] bArr, byte[] bArr2) {
        if (TextUtils.isEmpty(str)) {
            h.d(f81159d, "encrypt 4 content is null");
            return "";
        }
        if (bArr == null) {
            h.d(f81159d, "encrypt 4 key is null");
            return "";
        }
        if (bArr.length < 16) {
            h.d(f81159d, "encrypt 4 key error: 4 key length less than 16 bytes.");
            return "";
        }
        if (bArr2 == null) {
            h.d(f81159d, "encrypt 4 iv is null");
            return "";
        }
        if (bArr2.length >= 16) {
            return d.b(d(str, bArr, bArr2));
        }
        h.d(f81159d, "encrypt 4 iv error: 4 iv length less than 16 bytes.");
        return "";
    }

    public static byte[] x(byte[] bArr, byte[] bArr2) {
        byte[] d11 = ur.c.d(16);
        return e(d11, y(bArr, bArr2, d11));
    }

    public static byte[] y(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null) {
            h.d(f81159d, "encrypt 6 content is null");
            return new byte[0];
        }
        if (bArr.length == 0) {
            h.d(f81159d, "encrypt 6 content length is 0");
            return new byte[0];
        }
        if (bArr2 == null) {
            h.d(f81159d, "encrypt 6 key is null");
            return new byte[0];
        }
        if (bArr2.length < 16) {
            h.d(f81159d, "encrypt 6 key error: 6 key length less than 16 bytes.");
            return new byte[0];
        }
        if (bArr3 == null) {
            h.d(f81159d, "encrypt 6 iv is null");
            return new byte[0];
        }
        if (bArr3.length < 16) {
            h.d(f81159d, "encrypt 6 iv error: 6 iv length less than 16 bytes.");
            return new byte[0];
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (NullPointerException e11) {
            h.d(f81159d, "NullPointerException: " + e11.getMessage());
            return new byte[0];
        } catch (InvalidAlgorithmParameterException e12) {
            h.d(f81159d, "InvalidAlgorithmParameterException: " + e12.getMessage());
            return new byte[0];
        } catch (InvalidKeyException e13) {
            h.d(f81159d, "InvalidKeyException: " + e13.getMessage());
            return new byte[0];
        } catch (NoSuchAlgorithmException e14) {
            h.d(f81159d, "NoSuchAlgorithmException: " + e14.getMessage());
            return new byte[0];
        } catch (BadPaddingException e15) {
            h.d(f81159d, "BadPaddingException: " + e15.getMessage());
            return new byte[0];
        } catch (IllegalBlockSizeException e16) {
            h.d(f81159d, "IllegalBlockSizeException: " + e16.getMessage());
            return new byte[0];
        } catch (NoSuchPaddingException e17) {
            h.d(f81159d, "NoSuchPaddingException: " + e17.getMessage());
            return new byte[0];
        }
    }
}
