package xb;

import android.annotation.SuppressLint;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f97942a = "boboLetmeinImTeacherLily";

    /* renamed from: b, reason: collision with root package name */
    public static final String f97943b = "DESede";

    /* renamed from: c, reason: collision with root package name */
    public static final String f97944c = "ohComein";

    /* renamed from: d, reason: collision with root package name */
    public static final String f97945d = "utf-8";

    /* renamed from: e, reason: collision with root package name */
    public static final String f97946e = "Desede/CBC/PKCS5Padding";

    public static String a(byte[] encryptText) throws Exception {
        SecretKey generateSecret = SecretKeyFactory.getInstance(f97943b).generateSecret(new DESedeKeySpec(f97942a.getBytes()));
        Cipher cipher = Cipher.getInstance(f97946e);
        cipher.init(2, generateSecret, new IvParameterSpec(f97944c.getBytes()));
        return new String(cipher.doFinal(encryptText), "utf-8");
    }

    @SuppressLint({"TrulyRandom"})
    public static byte[] b(String plainText) throws Exception {
        SecretKey generateSecret = SecretKeyFactory.getInstance(f97943b).generateSecret(new DESedeKeySpec(f97942a.getBytes()));
        Cipher cipher = Cipher.getInstance(f97946e);
        cipher.init(1, generateSecret, new IvParameterSpec(f97944c.getBytes()));
        return cipher.doFinal(plainText.getBytes("utf-8"));
    }
}
