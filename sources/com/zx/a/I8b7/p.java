package com.zx.a.I8b7;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final SecureRandom f46646a = new SecureRandom();

    public static byte[] a(String str, SecretKey secretKey, IvParameterSpec ivParameterSpec, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(2, secretKey, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    public static byte[] b(String str, SecretKey secretKey, IvParameterSpec ivParameterSpec, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(str);
        cipher.init(1, secretKey, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    public static String a(String str, byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(bArr);
        return a(messageDigest.digest());
    }

    public static SecretKey b(byte[] bArr, String str) {
        try {
            Mac mac = Mac.getInstance(qr.b.f82657b);
            mac.init(new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), qr.b.f82657b));
            return new SecretKeySpec(mac.doFinal(bArr), "AES");
        } catch (Exception e11) {
            r2.a(e11);
            return null;
        }
    }

    public static String a(String str, boolean z11) throws Throwable {
        if (!z11) {
            str = a("MD5", str.getBytes(StandardCharsets.UTF_8));
        }
        StringBuilder a11 = f3.a(str);
        a11.append(m3.f46592h);
        byte[] bytes = a11.toString().getBytes(StandardCharsets.UTF_8);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(bytes);
        String a12 = a(messageDigest.digest());
        return a12.substring(0, 16) + a12.substring(a12.length() - 16);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return a(str2, str.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e11) {
            r2.a(e11);
            return "";
        }
    }

    public static byte[] a(String str, SecretKey secretKey, String str2) throws Exception {
        byte[] bArr = new byte[12];
        f46646a.nextBytes(bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, secretKey, new GCMParameterSpec(128, bArr));
        Charset charset = StandardCharsets.UTF_8;
        cipher.updateAAD(str2.getBytes(charset));
        byte[] doFinal = cipher.doFinal(str.getBytes(charset));
        ByteBuffer allocate = ByteBuffer.allocate(doFinal.length + 12);
        allocate.put(bArr);
        allocate.put(doFinal);
        return allocate.array();
    }

    public static String a(byte[] bArr, SecretKey secretKey, String str) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKey, new GCMParameterSpec(128, bArr, 0, 12));
        Charset charset = StandardCharsets.UTF_8;
        cipher.updateAAD(str.getBytes(charset));
        return new String(cipher.doFinal(bArr, 12, bArr.length - 12), charset);
    }

    public static SecretKey a(byte[] bArr, String str) {
        try {
            Mac mac = Mac.getInstance(qr.b.f82657b);
            mac.init(new SecretKeySpec(str.getBytes(StandardCharsets.UTF_8), qr.b.f82657b));
            byte[] bArr2 = new byte[16];
            System.arraycopy(mac.doFinal(bArr), 0, bArr2, 0, 16);
            return new SecretKeySpec(bArr2, "AES");
        } catch (Exception e11) {
            r2.a(e11);
            return null;
        }
    }

    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = bArr[i11];
            if (i12 < 0) {
                i12 += 256;
            }
            if (i12 < 16) {
                sb2.append("0");
            }
            sb2.append(Integer.toHexString(i12));
        }
        return sb2.toString();
    }
}
