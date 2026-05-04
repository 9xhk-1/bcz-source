package com.heytap.msp.push.encrypt;

import com.heytap.mcssdk.utils.LogUtil;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AESEncrypt {
    private static final String ALGORITHM = "AES";
    private static final String IV_CONNECT = "%IV1%";
    private static final int KEY_BYTE_SIZE = 256;
    public static final String SDK_APP_SECRET = "isvrbeT7qUywVEZ1Ia0/aUVA/TcFaeV0wC8qFLc8rg4=";
    private static final String TRANSFORMATION = "AES/CTR/NoPadding";

    public static String decrypt(String str, String str2) throws Exception {
        String[] split = str2.split(IV_CONNECT);
        byte[] decodeBase64 = Base64.decodeBase64(split[0]);
        byte[] decodeBase642 = Base64.decodeBase64(split[1]);
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decodeBase64(str), "AES");
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(2, secretKeySpec, new IvParameterSpec(decodeBase642));
        return new String(cipher.doFinal(decodeBase64));
    }

    public static String encrypt(String str) {
        try {
            return encrypt(SDK_APP_SECRET, str);
        } catch (Exception e11) {
            LogUtil.d(e11.getLocalizedMessage());
            return "";
        }
    }

    public static String genKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        return Base64.encodeBase64String(keyGenerator.generateKey().getEncoded());
    }

    public static String encrypt(String str, String str2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decodeBase64(str), "AES");
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(1, secretKeySpec);
        String encodeBase64String = Base64.encodeBase64String(cipher.getIV());
        return Base64.encodeBase64String(cipher.doFinal(str2.getBytes())) + IV_CONNECT + encodeBase64String;
    }
}
