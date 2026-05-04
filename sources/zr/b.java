package zr;

import android.util.Base64;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f102830a = "EncryptUtil";

    /* renamed from: b, reason: collision with root package name */
    public static final String f102831b = "RSA";

    /* JADX WARN: Removed duplicated region for block: B:16:0x0017 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] a(int r3) {
        /*
            byte[] r3 = new byte[r3]
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.security.NoSuchAlgorithmException -> Ld
            r1 = 26
            if (r0 < r1) goto L14
            java.security.SecureRandom r0 = ur.b.a()     // Catch: java.security.NoSuchAlgorithmException -> Ld
            goto L15
        Ld:
            java.lang.String r0 = zr.b.f102830a
            java.lang.String r1 = "getSecureRandomBytes: NoSuchAlgorithmException"
            zr.f.k(r0, r1)
        L14:
            r0 = 0
        L15:
            if (r0 != 0) goto L1d
            java.lang.String r0 = "SHA1PRNG"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r0)     // Catch: java.lang.Exception -> L21 java.security.NoSuchAlgorithmException -> L3d
        L1d:
            r0.nextBytes(r3)     // Catch: java.lang.Exception -> L21 java.security.NoSuchAlgorithmException -> L3d
            return r3
        L21:
            r3 = move-exception
            java.lang.String r0 = zr.b.f102830a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getSecureRandomBytes getInstance: exception : "
            r1.append(r2)
            java.lang.String r3 = r3.getMessage()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            zr.f.k(r0, r3)
            goto L44
        L3d:
            java.lang.String r3 = zr.b.f102830a
            java.lang.String r0 = "getSecureRandomBytes getInstance: NoSuchAlgorithmException"
            zr.f.k(r3, r0)
        L44:
            r3 = 0
            byte[] r3 = new byte[r3]
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zr.b.a(int):byte[]");
    }

    @Deprecated
    public static String b(int i11) {
        return d.b(a(i11));
    }

    @Deprecated
    public static PrivateKey c(String str) {
        try {
            try {
                return KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str, 0)));
            } catch (GeneralSecurityException e11) {
                f.p(f102830a, "load Key Exception:" + e11.getMessage(), true);
                return null;
            }
        } catch (IllegalArgumentException unused) {
            f.p(f102830a, "base64 decode IllegalArgumentException", true);
            return null;
        } catch (Exception unused2) {
            f.p(f102830a, "base64 decode Exception", true);
            return null;
        }
    }

    @Deprecated
    public static RSAPublicKey d(String str) {
        try {
            try {
                return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            } catch (GeneralSecurityException e11) {
                f.p(f102830a, "load Key Exception:" + e11.getMessage(), true);
                return null;
            }
        } catch (IllegalArgumentException unused) {
            f.p(f102830a, "base64 decode IllegalArgumentException", true);
            return null;
        } catch (Exception unused2) {
            f.p(f102830a, "base64 decode Exception", true);
            return null;
        }
    }
}
