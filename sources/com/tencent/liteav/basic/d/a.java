package com.tencent.liteav.basic.d;

import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f43242a = "RSA";

    public static byte[] a(byte[] bArr, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/None/PKCS1Padding");
        cipher.init(2, privateKey);
        int length = bArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i11 = 0;
        while (true) {
            int i12 = length - i11;
            if (i12 <= 0) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            }
            byteArrayOutputStream.write(i12 >= cipher.getBlockSize() ? cipher.doFinal(bArr, i11, cipher.getBlockSize()) : cipher.doFinal(bArr, i11, i12));
            i11 += cipher.getBlockSize();
        }
    }

    public static PrivateKey a(byte[] bArr) throws NoSuchAlgorithmException, InvalidKeySpecException {
        return KeyFactory.getInstance(f43242a).generatePrivate(new PKCS8EncodedKeySpec(bArr));
    }
}
