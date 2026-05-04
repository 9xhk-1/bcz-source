package com.xiaomi.push;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes8.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f45703a = {100, ho.c.A, 84, 114, 72, 0, 4, 97, 73, 97, 2, 52, 84, 102, ho.c.f59556u, 32};

    private static Cipher a(byte[] bArr, int i11) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f45703a);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i11, secretKeySpec, ivParameterSpec);
        return cipher;
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        return a(bArr, 1).doFinal(bArr2);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        return a(bArr, 2).doFinal(bArr2);
    }
}
