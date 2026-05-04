package com.mob.secverify.pure.core.ope.b.c;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static String f40875a = "a6Hy5Hb8IfX46D1f";

    public static String a(String str, String str2, String str3) {
        if (str != null) {
            try {
                if (str.length() == 0 || str.trim().length() == 0 || str2 == null || str2.length() != 16 || str3.length() != 16) {
                    return null;
                }
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, new SecretKeySpec(str2.getBytes("utf-8"), "AES"), new IvParameterSpec(str3.getBytes("utf-8")));
                return a.a(cipher.doFinal(str.getBytes("utf-8")));
            } catch (Exception e11) {
                com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "EncryptedUtils", "encrypted", e11.toString());
            }
        }
        return null;
    }

    public static String b(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        try {
            if (str.length() == 0 || str.trim().length() == 0) {
                return null;
            }
            if (str2 == null) {
                throw new Exception("decrypt key is null");
            }
            if (str2.length() != 16) {
                throw new Exception("decrypt key length error");
            }
            if (str3.length() != 16) {
                throw new Exception(" iv decrypt key length error");
            }
            byte[] a11 = a.a(str);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(str2.getBytes("utf-8"), "AES"), new IvParameterSpec(str3.getBytes("utf-8")));
            return new String(cipher.doFinal(a11), "utf-8");
        } catch (Exception e11) {
            com.mob.secverify.b.c.a().b("[SecPure][%s][%s] ==>%s", "EncryptedUtils", "decrypted", e11.toString());
            return null;
        }
    }
}
