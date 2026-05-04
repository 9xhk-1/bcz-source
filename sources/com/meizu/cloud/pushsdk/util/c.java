package com.meizu.cloud.pushsdk.util;

import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.nio.charset.Charset;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f39978a = Charset.forName("UTF-8");

    public static String a(String str, String str2) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    return new String(a(a(str), b(str2)), f39978a);
                }
            } catch (Exception e11) {
                DebugLogger.e("RSAUtils", "decrypt " + e11.getMessage());
            }
        }
        return null;
    }

    private static byte[] b(String str) {
        return com.meizu.cloud.pushsdk.c.g.a.a(str);
    }

    private static RSAPublicKey a(String str) {
        StringBuilder sb2;
        String str2;
        try {
            return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(b(str)));
        } catch (NoSuchAlgorithmException e11) {
            e = e11;
            sb2 = new StringBuilder();
            str2 = "loadPublicKey NoSuchAlgorithmException ";
            sb2.append(str2);
            sb2.append(e.getMessage());
            DebugLogger.e("RSAUtils", sb2.toString());
            return null;
        } catch (InvalidKeySpecException e12) {
            e = e12;
            sb2 = new StringBuilder();
            str2 = "loadPublicKey InvalidKeySpecException ";
            sb2.append(str2);
            sb2.append(e.getMessage());
            DebugLogger.e("RSAUtils", sb2.toString());
            return null;
        }
    }

    private static byte[] a(PublicKey publicKey, byte[] bArr) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, publicKey);
        return cipher.doFinal(bArr);
    }
}
