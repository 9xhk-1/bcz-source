package com.mob.secverify.pure.core.ope.cm.d;

import javax.crypto.Cipher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h {
    public static String a(String str) {
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, l.a());
            return c.a(cipher.doFinal(str.getBytes("UTF-8")));
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().a(th2, "[SecPure] ==>%s", th2.getMessage());
            return null;
        }
    }
}
