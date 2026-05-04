package com.mob.secverify.pure.core.ope.b.c;

import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static String f40890a = "RSA/ECB/PKCS1Padding";

    public static String a(String str, String str2) throws Exception {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) a(str2);
        if (TextUtils.isEmpty(str)) {
            throw new Exception("rsaAes key is null");
        }
        return new String(a(rSAPublicKey, a.a(str)), Charset.defaultCharset()).trim();
    }

    public static String b(String str, String str2) throws InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, BadPaddingException, IllegalBlockSizeException {
        PublicKey a11 = a(str);
        Cipher cipher = Cipher.getInstance(f40890a);
        cipher.init(1, a11);
        return a.a(cipher.doFinal(str2.getBytes(Charset.defaultCharset()))).toString();
    }

    public static PublicKey a(String str) {
        try {
            h hVar = new h();
            byte[] bArr = new byte[str.length()];
            str.getBytes(0, str.length(), bArr, 0);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            hVar.a(byteArrayInputStream, byteArrayOutputStream);
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(byteArrayOutputStream.toByteArray()));
        } catch (Exception e11) {
            com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "RSAUtils", "encrypted", e11.toString());
            return null;
        }
    }

    private static byte[] a(RSAPublicKey rSAPublicKey, byte[] bArr) throws Exception {
        if (rSAPublicKey != null) {
            try {
                Cipher cipher = Cipher.getInstance(f40890a);
                cipher.init(2, rSAPublicKey);
                return cipher.doFinal(bArr);
            } catch (InvalidKeyException unused) {
                throw new InvalidKeyException("InvalidKey");
            } catch (NoSuchAlgorithmException unused2) {
                throw new NoSuchAlgorithmException("NoSuchAlgorithm");
            } catch (BadPaddingException unused3) {
                throw new BadPaddingException("BadPadding");
            } catch (IllegalBlockSizeException unused4) {
                throw new IllegalBlockSizeException("IllegalBlockSize");
            } catch (NoSuchPaddingException unused5) {
                throw new NoSuchPaddingException("NoSuchPadding or not support this padding");
            }
        }
        throw new Exception("public key is null");
    }
}
