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
import javax.crypto.spec.IvParameterSpec;
import ur.d;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f84531a = "CBCKS";

    /* renamed from: b, reason: collision with root package name */
    public static final String f84532b = "AndroidKeyStore";

    /* renamed from: c, reason: collision with root package name */
    public static final String f84533c = "AES/CBC/PKCS7Padding";

    /* renamed from: d, reason: collision with root package name */
    public static final String f84534d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final int f84535e = 16;

    /* renamed from: f, reason: collision with root package name */
    public static final int f84536f = 256;

    /* renamed from: g, reason: collision with root package name */
    public static Map<String, SecretKey> f84537g = new HashMap();

    public static synchronized SecretKey a(String str) {
        SecretKey secretKey;
        synchronized (a.class) {
            try {
                h.e(f84531a, "load key");
                secretKey = null;
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                                            keyStore.load(null);
                                            Key key = keyStore.getKey(str, null);
                                            if (key == null || !(key instanceof SecretKey)) {
                                                h.e(f84531a, "generate key");
                                                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                                                keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes(pr.a.f81159d).setEncryptionPaddings("PKCS7Padding").setKeySize(256).build());
                                                secretKey = keyGenerator.generateKey();
                                            } else {
                                                secretKey = (SecretKey) key;
                                            }
                                        } catch (IOException e11) {
                                            h.d(f84531a, "IOException: " + e11.getMessage());
                                        }
                                    } catch (UnrecoverableKeyException e12) {
                                        h.d(f84531a, "UnrecoverableKeyException: " + e12.getMessage());
                                    }
                                } catch (KeyStoreException e13) {
                                    h.d(f84531a, "KeyStoreException: " + e13.getMessage());
                                }
                            } catch (InvalidAlgorithmParameterException e14) {
                                h.d(f84531a, "InvalidAlgorithmParameterException: " + e14.getMessage());
                            }
                        } catch (Exception e15) {
                            h.d(f84531a, "Exception: " + e15.getMessage());
                        }
                    } catch (CertificateException e16) {
                        h.d(f84531a, "CertificateException: " + e16.getMessage());
                    }
                } catch (NoSuchAlgorithmException e17) {
                    h.d(f84531a, "NoSuchAlgorithmException: " + e17.getMessage());
                } catch (NoSuchProviderException e18) {
                    h.d(f84531a, "NoSuchProviderException: " + e18.getMessage());
                }
                f84537g.put(str, secretKey);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return secretKey;
    }

    public static boolean b() {
        return true;
    }

    public static SecretKey c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f84537g.get(str) == null) {
            a(str);
        }
        return f84537g.get(str);
    }

    public static String d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            h.d(f84531a, "alias or encrypt content is null");
            return "";
        }
        try {
            return new String(e(str, d.c(str2)), "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            h.d(f84531a, "encrypt: UnsupportedEncodingException");
            return "";
        }
    }

    public static byte[] e(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            h.d(f84531a, "alias or encrypt content is null");
            return bArr2;
        }
        if (!b()) {
            h.d(f84531a, "sdk version is too low");
            return bArr2;
        }
        if (bArr.length <= 16) {
            h.d(f84531a, "Decrypt source data is invalid.");
            return bArr2;
        }
        SecretKey c11 = c(str);
        if (c11 == null) {
            h.d(f84531a, "decrypt secret key is null");
            return bArr2;
        }
        byte[] copyOf = Arrays.copyOf(bArr, 16);
        try {
            Cipher cipher = Cipher.getInstance(f84533c);
            cipher.init(2, c11, new IvParameterSpec(copyOf));
            return cipher.doFinal(bArr, 16, bArr.length - 16);
        } catch (InvalidAlgorithmParameterException e11) {
            h.d(f84531a, "InvalidAlgorithmParameterException: " + e11.getMessage());
            return bArr2;
        } catch (InvalidKeyException e12) {
            h.d(f84531a, "InvalidKeyException: " + e12.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f84531a, "NoSuchAlgorithmException: " + e13.getMessage());
            return bArr2;
        } catch (BadPaddingException e14) {
            h.d(f84531a, "BadPaddingException: " + e14.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e15) {
            h.d(f84531a, "IllegalBlockSizeException: " + e15.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e16) {
            h.d(f84531a, "NoSuchPaddingException: " + e16.getMessage());
            return bArr2;
        } catch (Exception e17) {
            h.d(f84531a, "Exception: " + e17.getMessage());
            return bArr2;
        }
    }

    public static String f(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            h.d(f84531a, "encrypt 1 content is null");
            return "";
        }
        try {
            return d.b(g(str, str2.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            h.d(f84531a, "encrypt: UnsupportedEncodingException");
            return "";
        }
    }

    public static byte[] g(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            h.d(f84531a, "alias or encrypt content is null");
            return bArr2;
        }
        if (!b()) {
            h.d(f84531a, "sdk version is too low");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance(f84533c);
            SecretKey c11 = c(str);
            if (c11 == null) {
                h.d(f84531a, "encrypt secret key is null");
                return bArr2;
            }
            cipher.init(1, c11);
            byte[] doFinal = cipher.doFinal(bArr);
            byte[] iv2 = cipher.getIV();
            if (iv2 != null && iv2.length == 16) {
                byte[] copyOf = Arrays.copyOf(iv2, iv2.length + doFinal.length);
                System.arraycopy(doFinal, 0, copyOf, iv2.length, doFinal.length);
                return copyOf;
            }
            h.d(f84531a, "IV is invalid.");
            return bArr2;
        } catch (InvalidKeyException e11) {
            h.d(f84531a, "InvalidKeyException: " + e11.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e12) {
            h.d(f84531a, "NoSuchAlgorithmException: " + e12.getMessage());
            return bArr2;
        } catch (BadPaddingException e13) {
            h.d(f84531a, "BadPaddingException: " + e13.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e14) {
            h.d(f84531a, "IllegalBlockSizeException: " + e14.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e15) {
            h.d(f84531a, "NoSuchPaddingException: " + e15.getMessage());
            return bArr2;
        } catch (Exception e16) {
            h.d(f84531a, "Exception: " + e16.getMessage());
            return bArr2;
        }
    }
}
