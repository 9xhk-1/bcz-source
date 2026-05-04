package qr;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import ur.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f82656a = "HMACSHA256";

    /* renamed from: b, reason: collision with root package name */
    public static final String f82657b = "HmacSHA256";

    /* renamed from: c, reason: collision with root package name */
    public static final String f82658c = "";

    /* renamed from: d, reason: collision with root package name */
    public static final int f82659d = 32;

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            h.d(f82656a, "content or key is null.");
            return new byte[0];
        }
        if (bArr2.length < 32) {
            h.d(f82656a, "hmac key length is not right");
            return new byte[0];
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, f82657b);
            Mac mac = Mac.getInstance(secretKeySpec.getAlgorithm());
            mac.init(secretKeySpec);
            return mac.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException e11) {
            h.d(f82656a, "hmacsha256 encrypt exception" + e11.getMessage());
            return new byte[0];
        }
    }

    public static String b(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? "" : c(str, ur.d.c(str2));
    }

    public static String c(String str, byte[] bArr) {
        byte[] bArr2;
        if (TextUtils.isEmpty(str) || bArr == null) {
            return "";
        }
        if (bArr.length < 32) {
            h.d(f82656a, "hmac key length is not right");
            return "";
        }
        try {
            bArr2 = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e11) {
            h.d(f82656a, "hmacsha256 encrypt exception" + e11.getMessage());
            bArr2 = new byte[0];
        }
        return ur.d.b(a(bArr2, bArr));
    }
}
