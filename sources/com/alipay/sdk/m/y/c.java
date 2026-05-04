package com.alipay.sdk.m.y;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static String f11230a = "idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#";

    public static String a() {
        String str = new String();
        for (int i11 = 0; i11 < f11230a.length() - 1; i11 += 4) {
            str = str + f11230a.charAt(i11);
        }
        return str;
    }

    public static String b(String str, String str2) {
        byte[] doFinal;
        try {
            PBEKeySpec a11 = a(str);
            int length = str2.length() / 2;
            byte[] bArr = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = i11 * 2;
                bArr[i11] = Integer.valueOf(str2.substring(i12, i12 + 2), 16).byteValue();
            }
            byte[] b11 = b();
            if (length <= 16) {
                doFinal = null;
            } else {
                SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance(qr.c.f82661b).generateSecret(new PBEKeySpec(a11.getPassword(), Arrays.copyOf(bArr, 16), 10, 128)).getEncoded(), "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(b11));
                doFinal = cipher.doFinal(bArr, 16, length - 16);
            }
        } catch (Exception unused) {
        }
        if (doFinal == null) {
            throw new Exception();
        }
        String str3 = new String(doFinal);
        if (com.alipay.sdk.m.z.a.c(str3)) {
            return str3;
        }
        return null;
    }

    public static String a(String str, String str2) {
        try {
            PBEKeySpec a11 = a(str);
            byte[] bytes = str2.getBytes();
            byte[] b11 = b();
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance(qr.c.f82661b).generateSecret(a11).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(b11));
            byte[] salt = a11.getSalt();
            ByteBuffer allocate = ByteBuffer.allocate(salt.length + cipher.getOutputSize(bytes.length));
            allocate.put(salt);
            cipher.doFinal(ByteBuffer.wrap(bytes), allocate);
            return a(allocate.array());
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b() {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < 48; i11 += 2) {
                sb2.append("AsAgAtA5A6AdAgABABACADAfAsAdAfAsAgAaAgA3A5A6=8=0".charAt(i11));
            }
            return a.a(sb2.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b11 : bArr) {
            stringBuffer.append("0123456789ABCDEF".charAt((b11 >> 4) & 15));
            stringBuffer.append("0123456789ABCDEF".charAt(b11 & 15));
        }
        return stringBuffer.toString();
    }

    public static PBEKeySpec a(String str) {
        Class<?> cls = Class.forName(new String(a.a("amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20=")));
        Object newInstance = cls.newInstance();
        byte[] bArr = new byte[16];
        Method method = cls.getMethod("nextBytes", bArr.getClass());
        method.setAccessible(true);
        method.invoke(newInstance, bArr);
        return new PBEKeySpec(str.toCharArray(), bArr, 10, 128);
    }
}
