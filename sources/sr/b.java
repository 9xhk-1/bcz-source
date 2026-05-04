package sr;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f88906a = "RSASignKS";

    /* renamed from: b, reason: collision with root package name */
    public static final String f88907b = "AndroidKeyStore";

    /* renamed from: c, reason: collision with root package name */
    public static final String f88908c = "SHA256withRSA/PSS";

    /* renamed from: d, reason: collision with root package name */
    public static final String f88909d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final int f88910e = 2048;

    /* renamed from: f, reason: collision with root package name */
    public static final int f88911f = 3072;

    public static synchronized KeyPair a(String str, boolean z11) {
        synchronized (b.class) {
            KeyPair keyPair = null;
            if (b(str)) {
                h.d(f88906a, "Key pair exits");
                return null;
            }
            try {
                try {
                    try {
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        if (z11) {
                            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256", "SHA-512").setSignaturePaddings("PSS").setKeySize(3072).build());
                        } else {
                            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 12).setDigests("SHA-256", "SHA-512").setSignaturePaddings("PSS").setKeySize(2048).build());
                        }
                        keyPair = keyPairGenerator.generateKeyPair();
                    } catch (InvalidAlgorithmParameterException e11) {
                        h.d(f88906a, "InvalidAlgorithmParameterException: " + e11.getMessage());
                    }
                } catch (NoSuchAlgorithmException e12) {
                    h.d(f88906a, "NoSuchAlgorithmException: " + e12.getMessage());
                }
            } catch (NoSuchProviderException e13) {
                h.d(f88906a, "NoSuchProviderException: " + e13.getMessage());
            }
            return keyPair;
        }
    }

    public static boolean b(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.getKey(str, null) != null;
        } catch (IOException e11) {
            h.d(f88906a, "IOException: " + e11.getMessage());
            return false;
        } catch (KeyStoreException e12) {
            h.d(f88906a, "KeyStoreException: " + e12.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f88906a, "NoSuchAlgorithmException: " + e13.getMessage());
            return false;
        } catch (UnrecoverableKeyException e14) {
            h.d(f88906a, "UnrecoverableKeyException: " + e14.getMessage());
            return false;
        } catch (CertificateException e15) {
            h.d(f88906a, "CertificateException: " + e15.getMessage());
            return false;
        }
    }

    public static boolean c(String str, byte[] bArr, byte[] bArr2, boolean z11) {
        if (TextUtils.isEmpty(str) || bArr == null || bArr2 == null) {
            h.d(f88906a, "alias or content or sign value is null");
            return false;
        }
        if (!f()) {
            h.d(f88906a, "sdk version is too low");
            return false;
        }
        KeyStore.Entry e11 = e(str, z11);
        if (!(e11 instanceof KeyStore.PrivateKeyEntry)) {
            h.d(f88906a, "Not an instance of a PrivateKeyEntry");
            return false;
        }
        try {
            Signature signature = Signature.getInstance(f88908c);
            signature.initVerify(((KeyStore.PrivateKeyEntry) e11).getCertificate());
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (InvalidKeyException e12) {
            h.d(f88906a, "InvalidKeyException: " + e12.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f88906a, "NoSuchAlgorithmException: " + e13.getMessage());
            return false;
        } catch (SignatureException e14) {
            h.d(f88906a, "SignatureException: " + e14.getMessage());
            return false;
        } catch (Exception e15) {
            h.d(f88906a, "Exception: " + e15.getMessage());
            return false;
        }
    }

    public static byte[] d(String str, byte[] bArr, boolean z11) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            h.d(f88906a, "alias or content is null");
            return bArr2;
        }
        if (!f()) {
            h.d(f88906a, "sdk version is too low");
            return bArr2;
        }
        KeyStore.Entry e11 = e(str, z11);
        if (!(e11 instanceof KeyStore.PrivateKeyEntry)) {
            h.d(f88906a, "Not an instance of a PrivateKeyEntry");
            return bArr2;
        }
        try {
            Signature signature = Signature.getInstance(f88908c);
            signature.initSign(((KeyStore.PrivateKeyEntry) e11).getPrivateKey());
            signature.update(bArr);
            return signature.sign();
        } catch (InvalidKeyException e12) {
            h.d(f88906a, "InvalidKeyException: " + e12.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f88906a, "NoSuchAlgorithmException: " + e13.getMessage());
            return bArr2;
        } catch (SignatureException e14) {
            h.d(f88906a, "SignatureException: " + e14.getMessage());
            return bArr2;
        } catch (Exception e15) {
            h.d(f88906a, "Exception: " + e15.getMessage());
            return bArr2;
        }
    }

    public static KeyStore.Entry e(String str, boolean z11) {
        if (!b(str)) {
            a(str, z11);
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.getEntry(str, null);
        } catch (IOException e11) {
            h.d(f88906a, "IOException: " + e11.getMessage());
            return null;
        } catch (KeyStoreException e12) {
            h.d(f88906a, "KeyStoreException: " + e12.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f88906a, "NoSuchAlgorithmException: " + e13.getMessage());
            return null;
        } catch (UnrecoverableEntryException e14) {
            h.d(f88906a, "UnrecoverableEntryException: " + e14.getMessage());
            return null;
        } catch (CertificateException e15) {
            h.d(f88906a, "CertificateException: " + e15.getMessage());
            return null;
        }
    }

    public static boolean f() {
        return true;
    }

    @Deprecated
    public static String g(String str, String str2) {
        try {
            return Base64.encodeToString(h(str, str2.getBytes("UTF-8")), 0);
        } catch (UnsupportedEncodingException e11) {
            Log.e(f88906a, "sign UnsupportedEncodingException : " + e11.getMessage());
            return "";
        }
    }

    @Deprecated
    public static byte[] h(String str, byte[] bArr) {
        return d(str, bArr, false);
    }

    public static String i(String str, String str2) {
        try {
            return Base64.encodeToString(j(str, str2.getBytes("UTF-8")), 0);
        } catch (UnsupportedEncodingException e11) {
            Log.e(f88906a, "sign UnsupportedEncodingException : " + e11.getMessage());
            return "";
        }
    }

    public static byte[] j(String str, byte[] bArr) {
        return d(str, bArr, true);
    }

    @Deprecated
    public static boolean k(String str, String str2, String str3) {
        try {
            return l(str, str2.getBytes("UTF-8"), Base64.decode(str3, 0));
        } catch (UnsupportedEncodingException e11) {
            Log.e(f88906a, "verifySign UnsupportedEncodingException: " + e11.getMessage());
            return false;
        } catch (Exception e12) {
            h.d(f88906a, "base64 decode Exception" + e12.getMessage());
            return false;
        }
    }

    @Deprecated
    public static boolean l(String str, byte[] bArr, byte[] bArr2) {
        return c(str, bArr, bArr2, false);
    }

    public static boolean m(String str, String str2, String str3) {
        try {
            return n(str, str2.getBytes("UTF-8"), Base64.decode(str3, 0));
        } catch (UnsupportedEncodingException e11) {
            Log.e(f88906a, "verifySign UnsupportedEncodingException: " + e11.getMessage());
            return false;
        } catch (Exception e12) {
            h.d(f88906a, "base64 decode Exception" + e12.getMessage());
            return false;
        }
    }

    public static boolean n(String str, byte[] bArr, byte[] bArr2) {
        return c(str, bArr, bArr2, true);
    }
}
