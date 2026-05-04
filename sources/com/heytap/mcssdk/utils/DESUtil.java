package com.heytap.mcssdk.utils;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class DESUtil {
    public static String decrypt(String str, String str2) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(2, getDesKey(str2));
        return new String(cipher.doFinal(Base64.decode(str, 0)), Charset.defaultCharset()).trim();
    }

    private static Key getDesKey(String str) throws Exception {
        return SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(Base64.decode(str, 0)));
    }
}
