package tr;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import ur.c;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90853a = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    /* renamed from: b, reason: collision with root package name */
    public static final String f90854b = "RSAEncrypt";

    /* renamed from: c, reason: collision with root package name */
    public static final String f90855c = "UTF-8";

    /* renamed from: d, reason: collision with root package name */
    public static final String f90856d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final int f90857e = 2048;

    /* renamed from: f, reason: collision with root package name */
    public static final String f90858f = "RSA";

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return b(str, c.f(str2));
        }
        h.d(f90854b, "content or private key is null");
        return "";
    }

    public static String b(String str, PrivateKey privateKey) {
        if (TextUtils.isEmpty(str) || privateKey == null || !h((RSAPrivateKey) privateKey)) {
            h.d(f90854b, "content or privateKey is null , or length is too short");
            return "";
        }
        try {
            return new String(c(Base64.decode(str, 0), privateKey), "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            h.d(f90854b, "RSA decrypt exception : " + e11.getMessage());
            return "";
        } catch (Exception e12) {
            h.d(f90854b, "exception : " + e12.getMessage());
            return "";
        }
    }

    public static byte[] c(byte[] bArr, PrivateKey privateKey) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || privateKey == null || !h((RSAPrivateKey) privateKey)) {
            h.d(f90854b, "content or privateKey is null , or length is too short");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (GeneralSecurityException e11) {
            h.d(f90854b, "RSA decrypt exception : " + e11.getMessage());
            return bArr2;
        }
    }

    public static String d(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return e(str, c.g(str2));
        }
        h.d(f90854b, "content or public key is null");
        return "";
    }

    public static String e(String str, PublicKey publicKey) {
        if (TextUtils.isEmpty(str) || publicKey == null || !i((RSAPublicKey) publicKey)) {
            h.d(f90854b, "content or PublicKey is null , or length is too short");
            return "";
        }
        try {
            return Base64.encodeToString(f(str.getBytes("UTF-8"), publicKey), 0);
        } catch (UnsupportedEncodingException unused) {
            h.d(f90854b, "encrypt: UnsupportedEncodingException");
            return "";
        } catch (Exception e11) {
            h.d(f90854b, "exception : " + e11.getMessage());
            return "";
        }
    }

    public static byte[] f(byte[] bArr, PublicKey publicKey) {
        byte[] bArr2 = new byte[0];
        if (bArr == null || publicKey == null || !i((RSAPublicKey) publicKey)) {
            h.d(f90854b, "content or PublicKey is null , or length is too short");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (GeneralSecurityException e11) {
            h.d(f90854b, "RSA encrypt exception : " + e11.getMessage());
            return bArr2;
        }
    }

    public static Map<String, Key> g(int i11) throws NoSuchAlgorithmException {
        HashMap hashMap = new HashMap(2);
        if (i11 < 2048) {
            h.d(f90854b, "generateRSAKeyPair: key length is too short");
            return hashMap;
        }
        SecureRandom c11 = c.c();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(i11, c11);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = generateKeyPair.getPublic();
        PrivateKey privateKey = generateKeyPair.getPrivate();
        hashMap.put("publicKey", publicKey);
        hashMap.put("privateKey", privateKey);
        return hashMap;
    }

    public static boolean h(RSAPrivateKey rSAPrivateKey) {
        return rSAPrivateKey != null && rSAPrivateKey.getModulus().bitLength() >= 2048;
    }

    public static boolean i(RSAPublicKey rSAPublicKey) {
        return rSAPublicKey != null && rSAPublicKey.getModulus().bitLength() >= 2048;
    }
}
