package com.alipay.sdk.m.l0;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {
    public static String a(String str) {
        byte[] bArr;
        try {
            bArr = a(a(), str.getBytes());
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr != null) {
            return a(bArr);
        }
        return null;
    }

    public static String b(String str) {
        try {
            return new String(b(a(), m5631a(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] a() throws Exception {
        return e.a(new byte[]{33, 83, -50, -89, -84, -114, 80, 99, 10, 63, ho.c.f59561z, -65, -11, ho.c.H, 101, -118});
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(b()));
        return cipher.doFinal(bArr2);
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(b()));
        return cipher.doFinal(bArr2);
    }

    public static byte[] b() {
        try {
            byte[] a11 = b.a("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8"), 2);
            if (a11 != null) {
                return e.a(a11);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    /* renamed from: a, reason: collision with other method in class */
    public static byte[] m5631a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = Integer.valueOf(str.substring(i12, i12 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b11 : bArr) {
            a(stringBuffer, b11);
        }
        return stringBuffer.toString();
    }

    public static void a(StringBuffer stringBuffer, byte b11) {
        stringBuffer.append("0123456789ABCDEF".charAt((b11 >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b11 & 15));
    }
}
