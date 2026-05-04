package sr;

import android.security.keystore.KeyGenParameterSpec;
import android.text.TextUtils;
import android.util.Base64;
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
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f88900a = "RSAEncryptKS";

    /* renamed from: b, reason: collision with root package name */
    public static final String f88901b = "AndroidKeyStore";

    /* renamed from: c, reason: collision with root package name */
    public static final String f88902c = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";

    /* renamed from: d, reason: collision with root package name */
    public static final String f88903d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final int f88904e = 2048;

    /* renamed from: f, reason: collision with root package name */
    public static final int f88905f = 3072;

    public static synchronized KeyPair a(String str, boolean z11) {
        synchronized (a.class) {
            KeyPair keyPair = null;
            if (f(str)) {
                h.d(f88900a, "Key pair exits");
                return null;
            }
            h.e(f88900a, "generate key pair.");
            try {
                try {
                    try {
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        if (z11) {
                            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 2).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setKeySize(3072).build());
                        } else {
                            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder(str, 2).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setKeySize(2048).build());
                        }
                        keyPair = keyPairGenerator.generateKeyPair();
                    } catch (NoSuchProviderException e11) {
                        h.d(f88900a, "NoSuchProviderException: " + e11.getMessage());
                    }
                } catch (Exception e12) {
                    h.d(f88900a, "Exception: " + e12.getMessage());
                }
            } catch (InvalidAlgorithmParameterException e13) {
                h.d(f88900a, "InvalidAlgorithmParameterException: " + e13.getMessage());
            } catch (NoSuchAlgorithmException e14) {
                h.d(f88900a, "NoSuchAlgorithmException: " + e14.getMessage());
            }
            return keyPair;
        }
    }

    public static PrivateKey b(String str) {
        if (!f(str)) {
            return null;
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return (PrivateKey) keyStore.getKey(str, null);
        } catch (IOException e11) {
            h.d(f88900a, "IOException: " + e11.getMessage());
            return null;
        } catch (KeyStoreException e12) {
            h.d(f88900a, "KeyStoreException: " + e12.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f88900a, "NoSuchAlgorithmException: " + e13.getMessage());
            return null;
        } catch (UnrecoverableKeyException e14) {
            h.d(f88900a, "UnrecoverableKeyException: " + e14.getMessage());
            return null;
        } catch (CertificateException e15) {
            h.d(f88900a, "CertificateException: " + e15.getMessage());
            return null;
        } catch (Exception e16) {
            h.d(f88900a, "Exception: " + e16.getMessage());
            return null;
        }
    }

    public static boolean c() {
        return true;
    }

    public static byte[] d(String str, byte[] bArr, boolean z11) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            h.d(f88900a, "alias or content is null");
            return bArr2;
        }
        if (!c()) {
            h.d(f88900a, "sdk version is too low");
            return bArr2;
        }
        PublicKey e11 = e(str, z11);
        if (e11 == null) {
            h.d(f88900a, "Public key is null");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(1, e11, new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-1"), PSource.PSpecified.DEFAULT));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e12) {
            h.d(f88900a, "InvalidAlgorithmParameterException: " + e12.getMessage());
            return bArr2;
        } catch (InvalidKeyException e13) {
            h.d(f88900a, "InvalidKeyException: " + e13.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e14) {
            h.d(f88900a, "NoSuchAlgorithmException: " + e14.getMessage());
            return bArr2;
        } catch (BadPaddingException e15) {
            h.d(f88900a, "BadPaddingException: " + e15.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e16) {
            h.d(f88900a, "IllegalBlockSizeException: " + e16.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e17) {
            h.d(f88900a, "NoSuchPaddingException: " + e17.getMessage());
            return bArr2;
        } catch (Exception e18) {
            h.d(f88900a, "Exception: " + e18.getMessage());
            return bArr2;
        }
    }

    public static PublicKey e(String str, boolean z11) {
        if (!f(str)) {
            a(str, z11);
        }
        Certificate g11 = g(str);
        if (g11 != null) {
            return g11.getPublicKey();
        }
        return null;
    }

    public static boolean f(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.getKey(str, null) != null;
        } catch (IOException e11) {
            h.d(f88900a, "IOException: " + e11.getMessage());
            return false;
        } catch (KeyStoreException e12) {
            h.d(f88900a, "KeyStoreException: " + e12.getMessage());
            return false;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f88900a, "NoSuchAlgorithmException: " + e13.getMessage());
            return false;
        } catch (UnrecoverableKeyException e14) {
            h.d(f88900a, "UnrecoverableKeyException: " + e14.getMessage());
            return false;
        } catch (CertificateException e15) {
            h.d(f88900a, "CertificateException: " + e15.getMessage());
            return false;
        } catch (Exception e16) {
            h.d(f88900a, "Exception: " + e16.getMessage());
            return false;
        }
    }

    public static Certificate g(String str) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.getCertificate(str);
        } catch (IOException e11) {
            h.d(f88900a, "IOException: " + e11.getMessage());
            return null;
        } catch (KeyStoreException e12) {
            h.d(f88900a, "KeyStoreException: " + e12.getMessage());
            return null;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f88900a, "NoSuchAlgorithmException: " + e13.getMessage());
            return null;
        } catch (CertificateException e14) {
            h.d(f88900a, "CertificateException: " + e14.getMessage());
            return null;
        } catch (Exception e15) {
            h.d(f88900a, "Exception: " + e15.getMessage());
            return null;
        }
    }

    @Deprecated
    public static String h(String str, String str2) {
        try {
            return new String(i(str, Base64.decode(str2, 0)), "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            h.d(f88900a, "UnsupportedEncodingException: " + e11.getMessage());
            return "";
        } catch (Exception e12) {
            h.d(f88900a, "Exception: " + e12.getMessage());
            return "";
        }
    }

    @Deprecated
    public static byte[] i(String str, byte[] bArr) {
        byte[] bArr2 = new byte[0];
        if (TextUtils.isEmpty(str) || bArr == null) {
            h.d(f88900a, "alias or encrypted content is null");
            return bArr2;
        }
        if (!c()) {
            h.d(f88900a, "sdk version is too low");
            return bArr2;
        }
        PrivateKey b11 = b(str);
        if (b11 == null) {
            h.d(f88900a, "Private key is null");
            return bArr2;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            cipher.init(2, b11, new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-1"), PSource.PSpecified.DEFAULT));
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException e11) {
            h.d(f88900a, "InvalidAlgorithmParameterException: " + e11.getMessage());
            return bArr2;
        } catch (InvalidKeyException e12) {
            h.d(f88900a, "InvalidKeyException: " + e12.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f88900a, "NoSuchAlgorithmException: " + e13.getMessage());
            return bArr2;
        } catch (BadPaddingException e14) {
            h.d(f88900a, "BadPaddingException: " + e14.getMessage());
            return bArr2;
        } catch (IllegalBlockSizeException e15) {
            h.d(f88900a, "IllegalBlockSizeException: " + e15.getMessage());
            return bArr2;
        } catch (NoSuchPaddingException e16) {
            h.d(f88900a, "NoSuchPaddingException: " + e16.getMessage());
            return bArr2;
        } catch (Exception e17) {
            h.d(f88900a, "Exception: " + e17.getMessage());
            return bArr2;
        }
    }

    public static String j(String str, String str2) {
        try {
            return new String(k(str, Base64.decode(str2, 0)), "UTF-8");
        } catch (UnsupportedEncodingException e11) {
            h.d(f88900a, "UnsupportedEncodingException: " + e11.getMessage());
            return "";
        } catch (Exception e12) {
            h.d(f88900a, "Exception: " + e12.getMessage());
            return "";
        }
    }

    public static byte[] k(String str, byte[] bArr) {
        return i(str, bArr);
    }

    @Deprecated
    public static String l(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return Base64.encodeToString(m(str, str2.getBytes("UTF-8")), 0);
        } catch (UnsupportedEncodingException e11) {
            h.d(f88900a, "UnsupportedEncodingException: " + e11.getMessage());
            return "";
        }
    }

    @Deprecated
    public static byte[] m(String str, byte[] bArr) {
        return d(str, bArr, false);
    }

    public static String n(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            return Base64.encodeToString(o(str, str2.getBytes("UTF-8")), 0);
        } catch (UnsupportedEncodingException e11) {
            h.d(f88900a, "UnsupportedEncodingException: " + e11.getMessage());
            return "";
        }
    }

    public static byte[] o(String str, byte[] bArr) {
        return d(str, bArr, true);
    }
}
