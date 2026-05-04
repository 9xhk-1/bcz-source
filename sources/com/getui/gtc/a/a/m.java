package com.getui.gtc.a.a;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes6.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static String f29733a = "RSA";

    /* renamed from: b, reason: collision with root package name */
    private static String f29734b = "RSA/NONE/OAEPWithSHA1AndMGF1Padding";

    public static PublicKey a(byte[] bArr) {
        try {
            return KeyFactory.getInstance(f29733a).generatePublic(new X509EncodedKeySpec(bArr));
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance(f29734b);
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
