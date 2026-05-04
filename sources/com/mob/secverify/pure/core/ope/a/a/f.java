package com.mob.secverify.pure.core.ope.a.a;

import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static String f40853a = "RSA/ECB/PKCS1Padding";

    public static String a(String str, RSAPublicKey rSAPublicKey) {
        try {
            return a.a(a(rSAPublicKey, str.getBytes()));
        } catch (Exception e11) {
            com.mob.secverify.b.c.a().c("[SecPure] ==>%s", e11.toString());
            return "";
        }
    }

    public static PublicKey a(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(e.a(str)));
        } catch (NoSuchAlgorithmException e11) {
            com.mob.secverify.b.c.a().c("[SecPure] ==>%s", e11.toString());
            return null;
        } catch (InvalidKeySpecException e12) {
            com.mob.secverify.b.c.a().c("[SecPure] ==>%s", e12.toString());
            return null;
        }
    }

    public static byte[] a(RSAPublicKey rSAPublicKey, byte[] bArr) throws Exception {
        if (rSAPublicKey != null) {
            try {
                Cipher cipher = Cipher.getInstance(f40853a);
                cipher.init(1, rSAPublicKey);
                return cipher.doFinal(bArr);
            } catch (InvalidKeyException unused) {
                throw new Exception("ivalid publickey");
            } catch (NoSuchAlgorithmException unused2) {
                throw new Exception("no such algorithm");
            } catch (BadPaddingException unused3) {
                throw new Exception("Padding ivalid");
            } catch (IllegalBlockSizeException unused4) {
                throw new Exception("block size ivalid");
            } catch (NoSuchPaddingException e11) {
                com.mob.secverify.b.c.a().c("[SecPure] ==>%s", e11.toString());
                return null;
            }
        }
        throw new Exception("public key is null");
    }
}
