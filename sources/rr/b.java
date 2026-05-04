package rr;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import ur.d;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f84538a = "GCMKS";

    /* renamed from: b, reason: collision with root package name */
    public static final String f84539b = "AndroidKeyStore";

    /* renamed from: c, reason: collision with root package name */
    public static final String f84540c = "AES/GCM/NoPadding";

    /* renamed from: d, reason: collision with root package name */
    public static final String f84541d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final int f84542e = 12;

    /* renamed from: f, reason: collision with root package name */
    public static final int f84543f = 256;

    /* renamed from: g, reason: collision with root package name */
    public static Map<String, SecretKey> f84544g = new HashMap();

    public static SecretKey a(String str) {
        h.e(f84538a, "load key");
        SecretKey secretKey = null;
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            Key key = keyStore.getKey(str, null);
            if (key instanceof SecretKey) {
                secretKey = (SecretKey) key;
            } else {
                h.e(f84538a, "generate key");
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(pr.b.f81166d).setEncryptionPaddings("NoPadding").setKeySize(256).build());
                secretKey = keyGenerator.generateKey();
            }
        } catch (IOException e11) {
            h.d(f84538a, "IOException : " + e11.getMessage());
        } catch (InvalidAlgorithmParameterException e12) {
            h.d(f84538a, "InvalidAlgorithmParameterException : " + e12.getMessage());
        } catch (KeyStoreException e13) {
            h.d(f84538a, "KeyStoreException : " + e13.getMessage());
        } catch (NoSuchAlgorithmException e14) {
            h.d(f84538a, "NoSuchAlgorithmException : " + e14.getMessage());
        } catch (NoSuchProviderException e15) {
            h.d(f84538a, "NoSuchProviderException : " + e15.getMessage());
        } catch (UnrecoverableKeyException e16) {
            h.d(f84538a, "UnrecoverableKeyException : " + e16.getMessage());
        } catch (CertificateException e17) {
            h.d(f84538a, "CertificateException : " + e17.getMessage());
        } catch (Exception e18) {
            h.d(f84538a, "Exception: " + e18.getMessage());
        }
        f84544g.put(str, secretKey);
        return secretKey;
    }

    public static boolean b() {
        return true;
    }

    public static SecretKey c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f84544g.get(str) == null) {
            a(str);
        }
        return f84544g.get(str);
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            h.d(f84538a, "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(e(str, d.c(str2)), "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            h.d(f84538a, "decrypt: UnsupportedEncodingException : " + e11.getMessage());
            return "";
        }
    }

    public static byte[] e(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            h.d(f84538a, "alias or encrypt content is null");
            return bArr2;
        }
        if (!b()) {
            h.d(f84538a, "sdk version is too low");
            return bArr2;
        }
        if (bArr.length > 12) {
            return f(c(str), bArr);
        }
        h.d(f84538a, "Decrypt source data is invalid.");
        return bArr2;
    }

    public static byte[] f(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (secretKey == null) {
            h.d(f84538a, "Decrypt secret key is null");
            return bArr2;
        }
        if (bArr == null) {
            h.d(f84538a, "content is null");
            return bArr2;
        }
        if (!b()) {
            h.d(f84538a, "sdk version is too low");
            return bArr2;
        }
        if (bArr.length <= 12) {
            h.d(f84538a, "Decrypt source data is invalid.");
            return bArr2;
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKey, new GCMParameterSpec(128, copyOf));
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        } catch (InvalidAlgorithmParameterException e11) {
            h.d(f84538a, "InvalidAlgorithmParameterException : " + e11.getMessage());
            return bArr2;
        } catch (InvalidKeyException e12) {
            h.d(f84538a, "InvalidKeyException : " + e12.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f84538a, "NoSuchAlgorithmException : " + e13.getMessage());
            return bArr2;
        } catch (BadPaddingException e14) {
            h.d(f84538a, "BadPaddingException : " + e14.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e15) {
            h.d(f84538a, "IllegalBlockSizeException : " + e15.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e16) {
            h.d(f84538a, "NoSuchPaddingException : " + e16.getMessage());
            return bArr2;
        } catch (Exception e17) {
            h.d(f84538a, "Exception: " + e17.getMessage());
            return bArr2;
        }
    }

    public static String g(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            h.d(f84538a, "alias or encrypt content is null");
            return "";
        }
        try {
            return d.b(h(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e11) {
            h.d(f84538a, "encrypt: UnsupportedEncodingException : " + e11.getMessage());
            return "";
        }
    }

    public static byte[] h(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            h.d(f84538a, "alias or encrypt content is null");
            return bArr2;
        }
        if (b()) {
            return i(c(str), bArr);
        }
        h.d(f84538a, "sdk version is too low");
        return bArr2;
    }

    public static byte[] i(SecretKey secretKey, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (bArr == null) {
            h.d(f84538a, "content is null");
            return bArr2;
        }
        if (secretKey == null) {
            h.d(f84538a, "secret key is null");
            return bArr2;
        }
        if (!b()) {
            h.d(f84538a, "sdk version is too low");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            byte[] doFinal = cipher.doFinal(bArr);
            byte[] iv2 = cipher.getIV();
            if (iv2 != null && iv2.length == 12) {
                byte[] copyOf = Arrays.copyOf(iv2, iv2.length + doFinal.length);
                System.arraycopy(doFinal, 0, copyOf, iv2.length, doFinal.length);
                return copyOf;
            }
            h.d(f84538a, "IV is invalid.");
            return bArr2;
        } catch (InvalidKeyException e11) {
            h.d(f84538a, "InvalidKeyException : " + e11.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e12) {
            h.d(f84538a, "NoSuchAlgorithmException : " + e12.getMessage());
            return bArr2;
        } catch (BadPaddingException e13) {
            h.d(f84538a, "BadPaddingException : " + e13.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e14) {
            h.d(f84538a, "IllegalBlockSizeException : " + e14.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e15) {
            h.d(f84538a, "NoSuchPaddingException : " + e15.getMessage());
            return bArr2;
        } catch (Exception e16) {
            h.d(f84538a, "Exception: " + e16.getMessage());
            return bArr2;
        }
    }
}
