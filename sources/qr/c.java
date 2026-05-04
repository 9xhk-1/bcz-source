package qr;

import android.os.Build;
import android.text.TextUtils;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82660a = "PBKDF2";

    /* renamed from: b, reason: collision with root package name */
    public static final String f82661b = "PBKDF2WithHmacSHA1";

    /* renamed from: c, reason: collision with root package name */
    public static final String f82662c = "PBKDF2WithHmacSHA256";

    /* renamed from: d, reason: collision with root package name */
    public static final String f82663d = "";

    /* renamed from: e, reason: collision with root package name */
    public static final int f82664e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f82665f = 16;

    /* renamed from: g, reason: collision with root package name */
    public static final int f82666g = 32;

    /* renamed from: h, reason: collision with root package name */
    public static final int f82667h = 10000;

    /* renamed from: i, reason: collision with root package name */
    public static final int f82668i = 1000;

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            int length = bArr.length ^ bArr2.length;
            for (int i11 = 0; i11 < bArr.length && i11 < bArr2.length; i11++) {
                length |= bArr[i11] ^ bArr2[i11];
            }
            if (length == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] b(char[] cArr, byte[] bArr, int i11, int i12, boolean z11) {
        try {
            return (z11 ? SecretKeyFactory.getInstance(f82662c) : SecretKeyFactory.getInstance(f82661b)).generateSecret(new PBEKeySpec(cArr, bArr, i11, i12)).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e11) {
            h.d(f82660a, "pbkdf exception : " + e11.getMessage());
            return new byte[0];
        }
    }

    public static byte[] c(char[] cArr, byte[] bArr, int i11, int i12) {
        return b(cArr, bArr, i11, i12, false);
    }

    @Deprecated
    public static String d(String str) {
        return e(str, 10000);
    }

    @Deprecated
    public static String e(String str, int i11) {
        return f(str, ur.c.d(8), i11, 32);
    }

    @Deprecated
    public static String f(String str, byte[] bArr, int i11, int i12) {
        if (TextUtils.isEmpty(str)) {
            h.d(f82660a, "pwd is null.");
            return "";
        }
        if (i11 < 1000) {
            h.d(f82660a, "iterations times is not enough.");
            return "";
        }
        if (bArr == null || bArr.length < 8) {
            h.d(f82660a, "salt parameter is null or length is not enough");
            return "";
        }
        if (i12 < 32) {
            h.d(f82660a, "cipherLen length is not enough");
            return "";
        }
        return ur.d.b(bArr) + ur.d.b(c(str.toCharArray(), bArr, i11, i12 * 8));
    }

    public static String g(String str) {
        return h(str, 10000);
    }

    public static String h(String str, int i11) {
        return i(str, ur.c.d(16), i11, 32);
    }

    public static String i(String str, byte[] bArr, int i11, int i12) {
        byte[] j11;
        if (TextUtils.isEmpty(str)) {
            h.d(f82660a, "pwd is null.");
            return "";
        }
        if (i11 < 1000) {
            h.d(f82660a, "iterations times is not enough.");
            return "";
        }
        if (bArr == null || bArr.length < 16) {
            h.d(f82660a, "salt parameter is null or length is not enough");
            return "";
        }
        if (i12 < 32) {
            h.d(f82660a, "cipherLen length is not enough");
            return "";
        }
        if (Build.VERSION.SDK_INT < 26) {
            h.e(f82660a, "sha 1");
            j11 = c(str.toCharArray(), bArr, i11, i12 * 8);
        } else {
            h.e(f82660a, "sha 256");
            j11 = j(str.toCharArray(), bArr, i11, i12 * 8);
        }
        return ur.d.b(bArr) + ur.d.b(j11);
    }

    public static byte[] j(char[] cArr, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[0];
        if (Build.VERSION.SDK_INT >= 26) {
            return b(cArr, bArr, i11, i12, true);
        }
        h.d(f82660a, "system version not high than 26");
        return bArr2;
    }

    @Deprecated
    public static boolean k(String str, String str2) {
        return l(str, str2, 10000);
    }

    @Deprecated
    public static boolean l(String str, String str2, int i11) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.length() < 16) {
            return false;
        }
        return a(c(str.toCharArray(), ur.d.c(str2.substring(0, 16)), i11, 256), ur.d.c(str2.substring(16)));
    }

    public static boolean m(String str, String str2) {
        return n(str, str2, 10000);
    }

    public static boolean n(String str, String str2, int i11) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str2.length() < 32) {
            return false;
        }
        String substring = str2.substring(0, 32);
        return a(Build.VERSION.SDK_INT < 26 ? c(str.toCharArray(), ur.d.c(substring), i11, 256) : j(str.toCharArray(), ur.d.c(substring), i11, 256), ur.d.c(str2.substring(32)));
    }
}
