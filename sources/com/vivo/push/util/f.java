package com.vivo.push.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class f {
    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 < length; i11++) {
            cArr[i11] = (char) (bArr[i11] ^ 16);
        }
        return new String(cArr);
    }

    public static byte[] a(String str, String str2, byte[] bArr) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("utf-8"), "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(str.getBytes("utf-8")));
        return cipher.doFinal(bArr);
    }
}
