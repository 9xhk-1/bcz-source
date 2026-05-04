package pr;

import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ur.d;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f81171a = "CipherUtil";

    /* renamed from: b, reason: collision with root package name */
    public static final String f81172b = "AES/GCM/NoPadding";

    /* renamed from: c, reason: collision with root package name */
    public static final String f81173c = "AES/CBC/PKCS5Padding";

    /* renamed from: d, reason: collision with root package name */
    public static final String f81174d = "AES";

    /* renamed from: e, reason: collision with root package name */
    public static final String f81175e = "";

    /* renamed from: f, reason: collision with root package name */
    public static final int f81176f = 16;

    /* renamed from: g, reason: collision with root package name */
    public static final int f81177g = 12;

    /* renamed from: h, reason: collision with root package name */
    public static final int f81178h = 16;

    public static int a(Cipher cipher, byte[] bArr) {
        if (cipher == null || bArr == null) {
            return -1;
        }
        return cipher.getOutputSize(bArr.length);
    }

    public static Cipher b(byte[] bArr, byte[] bArr2, int i11) {
        return c(bArr, bArr2, i11, "AES/CBC/PKCS5Padding");
    }

    public static Cipher c(byte[] bArr, byte[] bArr2, int i11, String str) {
        if (bArr == null || bArr.length < 16 || bArr2 == null || bArr2.length < 12 || !b.x()) {
            h.d(f81171a, "gcm encrypt param is not right");
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance(str);
            cipher.init(i11, secretKeySpec, "AES/GCM/NoPadding".equals(str) ? b.w(bArr2) : new IvParameterSpec(bArr2));
            return cipher;
        } catch (GeneralSecurityException e11) {
            h.d(f81171a, "GCM encrypt data error" + e11.getMessage());
            return null;
        }
    }

    public static Cipher d(byte[] bArr, byte[] bArr2, int i11) {
        return c(bArr, bArr2, i11, "AES/GCM/NoPadding");
    }

    public static Cipher e(byte[] bArr, Cipher cipher) {
        return f(bArr, cipher.getIV());
    }

    public static Cipher f(byte[] bArr, byte[] bArr2) {
        return b(bArr, bArr2, 2);
    }

    public static Cipher g(byte[] bArr) {
        return h(bArr, ur.c.d(16));
    }

    public static Cipher h(byte[] bArr, byte[] bArr2) {
        return b(bArr, bArr2, 1);
    }

    public static int i(byte[] bArr, byte[] bArr2) {
        return j(bArr, bArr2, ur.c.d(16));
    }

    public static int j(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return a(h(bArr2, bArr3), bArr);
    }

    public static Cipher k(byte[] bArr, Cipher cipher) {
        return l(bArr, cipher.getIV());
    }

    public static Cipher l(byte[] bArr, byte[] bArr2) {
        return d(bArr, bArr2, 2);
    }

    public static Cipher m(byte[] bArr) {
        byte[] d11 = ur.c.d(12);
        h.b(f81171a, "getEncryptCipher: iv is : " + d.b(d11));
        return n(bArr, d11);
    }

    public static Cipher n(byte[] bArr, byte[] bArr2) {
        return d(bArr, bArr2, 1);
    }

    public static int o(byte[] bArr, byte[] bArr2) {
        return p(bArr, bArr2, ur.c.d(12));
    }

    public static int p(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return a(n(bArr2, bArr3), bArr);
    }

    public static int q(Cipher cipher, byte[] bArr, int i11, int i12, byte[] bArr2, int i13) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        if (cipher != null && bArr != null) {
            return cipher.doFinal(bArr, i11, i12, bArr2, i13);
        }
        h.d(f81171a, "getEncryptCOntent: cipher is null or content is null");
        return -1;
    }

    public static int r(Cipher cipher, byte[] bArr, byte[] bArr2) {
        if (cipher == null || bArr == null) {
            h.d(f81171a, "getEncryptCOntent: cipher is null or content is null");
            return -1;
        }
        try {
            return cipher.doFinal(bArr, 0, bArr.length, bArr2);
        } catch (BadPaddingException unused) {
            h.d(f81171a, "getContent: BadPaddingException");
            return -1;
        } catch (IllegalBlockSizeException unused2) {
            h.d(f81171a, "getContent: IllegalBlockSizeException");
            return -1;
        } catch (ShortBufferException unused3) {
            h.d(f81171a, "getContent: ShortBufferException");
            return -1;
        }
    }

    public static byte[] s(Cipher cipher, byte[] bArr) {
        if (cipher == null || bArr == null) {
            h.d(f81171a, "getEncryptCOntent: cipher is null or content is null");
            return new byte[0];
        }
        try {
            return cipher.doFinal(bArr, 0, bArr.length);
        } catch (BadPaddingException unused) {
            h.d(f81171a, "getContent: BadPaddingException");
            return new byte[0];
        } catch (IllegalBlockSizeException unused2) {
            h.d(f81171a, "getContent: IllegalBlockSizeException");
            return new byte[0];
        }
    }
}
