package tr;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.util.Arrays;
import ur.c;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f90859a = "SHA256WithRSA";

    /* renamed from: b, reason: collision with root package name */
    public static final String f90860b = "SHA256WithRSA/PSS";

    /* renamed from: c, reason: collision with root package name */
    public static final String f90861c = "RSASign";

    /* renamed from: d, reason: collision with root package name */
    public static final String f90862d = "UTF-8";

    /* renamed from: e, reason: collision with root package name */
    public static final String f90863e = "";

    public static String a(String str, String str2, boolean z11) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            h.d(f90861c, "sign content or key is null");
            return "";
        }
        PrivateKey f11 = c.f(str2);
        return z11 ? g(str, f11) : k(str, f11);
    }

    public static String b(String str, PrivateKey privateKey, boolean z11) {
        try {
            return Base64.encodeToString(m(str.getBytes("UTF-8"), privateKey, z11), 0);
        } catch (UnsupportedEncodingException e11) {
            h.d(f90861c, "sign UnsupportedEncodingException: " + e11.getMessage());
            return "";
        }
    }

    public static boolean c(String str, String str2, String str3, boolean z11) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str2)) {
            h.d(f90861c, "content or public key or sign value is null");
            return false;
        }
        RSAPublicKey g11 = c.g(str3);
        return z11 ? i(str, str2, g11) : o(str, str2, g11);
    }

    public static boolean d(String str, String str2, PublicKey publicKey, boolean z11) {
        try {
            return q(str.getBytes("UTF-8"), Base64.decode(str2, 0), publicKey, z11);
        } catch (UnsupportedEncodingException e11) {
            h.d(f90861c, "verifySign UnsupportedEncodingException: " + e11.getMessage());
            return false;
        } catch (Exception e12) {
            h.d(f90861c, "base64 decode Exception : " + e12.getMessage());
            return false;
        }
    }

    public static boolean e() {
        return true;
    }

    public static String f(String str, String str2) {
        if (e()) {
            return a(str, str2, true);
        }
        h.d(f90861c, "sdk version is too low");
        return "";
    }

    public static String g(String str, PrivateKey privateKey) {
        if (e()) {
            return b(str, privateKey, true);
        }
        h.d(f90861c, "sdk version is too low");
        return "";
    }

    public static boolean h(String str, String str2, String str3) {
        if (e()) {
            return c(str, str2, str3, true);
        }
        h.d(f90861c, "sdk version is too low");
        return false;
    }

    public static boolean i(String str, String str2, PublicKey publicKey) {
        if (e()) {
            return d(str, str2, publicKey, true);
        }
        h.d(f90861c, "sdk version is too low");
        return false;
    }

    @Deprecated
    public static String j(String str, String str2) {
        return a(str, str2, false);
    }

    @Deprecated
    public static String k(String str, PrivateKey privateKey) {
        return b(str, privateKey, false);
    }

    public static byte[] l(ByteBuffer byteBuffer, PrivateKey privateKey, boolean z11) {
        Signature signature;
        byte[] bArr = new byte[0];
        if (byteBuffer == null || privateKey == null || !a.h((RSAPrivateKey) privateKey)) {
            h.d(f90861c, "content or privateKey is null , or length is too short");
            return bArr;
        }
        try {
            if (z11) {
                signature = Signature.getInstance("SHA256WithRSA/PSS");
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
            } else {
                signature = Signature.getInstance(f90859a);
            }
            signature.initSign(privateKey);
            signature.update(byteBuffer);
            bArr = signature.sign();
            h.e(f90861c, "result is : " + Arrays.toString(bArr));
            return bArr;
        } catch (InvalidAlgorithmParameterException e11) {
            h.d(f90861c, "sign InvalidAlgorithmParameterException: " + e11.getMessage());
            return bArr;
        } catch (InvalidKeyException e12) {
            h.d(f90861c, "sign InvalidKeyException: " + e12.getMessage());
            return bArr;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f90861c, "sign NoSuchAlgorithmException: " + e13.getMessage());
            return bArr;
        } catch (SignatureException e14) {
            h.d(f90861c, "sign SignatureException: " + e14.getMessage());
            return bArr;
        } catch (Exception e15) {
            h.d(f90861c, "sign Exception: " + e15.getMessage());
            return bArr;
        }
    }

    public static byte[] m(byte[] bArr, PrivateKey privateKey, boolean z11) {
        Signature signature;
        byte[] bArr2 = new byte[0];
        if (bArr == null || privateKey == null || !a.h((RSAPrivateKey) privateKey)) {
            h.d(f90861c, "content or privateKey is null , or length is too short");
            return bArr2;
        }
        try {
            if (z11) {
                signature = Signature.getInstance("SHA256WithRSA/PSS");
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
            } else {
                signature = Signature.getInstance(f90859a);
            }
            signature.initSign(privateKey);
            signature.update(bArr);
            return signature.sign();
        } catch (InvalidAlgorithmParameterException e11) {
            h.d(f90861c, "sign InvalidAlgorithmParameterException: " + e11.getMessage());
            return bArr2;
        } catch (InvalidKeyException e12) {
            h.d(f90861c, "sign InvalidKeyException: " + e12.getMessage());
            return bArr2;
        } catch (NoSuchAlgorithmException e13) {
            h.d(f90861c, "sign NoSuchAlgorithmException: " + e13.getMessage());
            return bArr2;
        } catch (SignatureException e14) {
            h.d(f90861c, "sign SignatureException: " + e14.getMessage());
            return bArr2;
        } catch (Exception e15) {
            h.d(f90861c, "sign Exception: " + e15.getMessage());
            return bArr2;
        }
    }

    @Deprecated
    public static boolean n(String str, String str2, String str3) {
        return c(str, str2, str3, false);
    }

    @Deprecated
    public static boolean o(String str, String str2, PublicKey publicKey) {
        return d(str, str2, publicKey, false);
    }

    public static boolean p(ByteBuffer byteBuffer, byte[] bArr, PublicKey publicKey, boolean z11) {
        Signature signature;
        if (byteBuffer == null || publicKey == null || bArr == null || !a.i((RSAPublicKey) publicKey)) {
            h.d(f90861c, "content or publicKey is null , or length is too short");
            return false;
        }
        try {
            if (z11) {
                signature = Signature.getInstance("SHA256WithRSA/PSS");
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
            } else {
                signature = Signature.getInstance(f90859a);
            }
            signature.initVerify(publicKey);
            signature.update(byteBuffer);
            return signature.verify(bArr);
        } catch (GeneralSecurityException e11) {
            h.d(f90861c, "check sign exception: " + e11.getMessage());
            return false;
        } catch (Exception e12) {
            h.d(f90861c, "exception : " + e12.getMessage());
            return false;
        }
    }

    public static boolean q(byte[] bArr, byte[] bArr2, PublicKey publicKey, boolean z11) {
        Signature signature;
        if (bArr == null || publicKey == null || bArr2 == null || !a.i((RSAPublicKey) publicKey)) {
            h.d(f90861c, "content or publicKey is null , or length is too short");
            return false;
        }
        try {
            if (z11) {
                signature = Signature.getInstance("SHA256WithRSA/PSS");
                signature.setParameter(new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
            } else {
                signature = Signature.getInstance(f90859a);
            }
            signature.initVerify(publicKey);
            signature.update(bArr);
            return signature.verify(bArr2);
        } catch (GeneralSecurityException e11) {
            h.d(f90861c, "check sign exception: " + e11.getMessage());
            return false;
        } catch (Exception e12) {
            h.d(f90861c, "exception : " + e12.getMessage());
            return false;
        }
    }
}
