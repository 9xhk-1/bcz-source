package com.igexin.c.b;

import android.text.TextUtils;
import com.igexin.c.a.b.g;
import io.ktor.util.date.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f37280a = {'a', 'b', 'c', b.f62000f, 'e', 'f', 'g', b.f61999e, 'i', 'j', 'k', 'l', b.f61998d, 'n', 'o', 'p', 'q', 'r', b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', b.f62002h, 'Z'};

    public static String a() {
        Random random = new Random();
        char[] cArr = new char[32];
        for (int i11 = 0; i11 < 32; i11++) {
            char[] cArr2 = f37280a;
            cArr[i11] = cArr2[random.nextInt(cArr2.length)];
        }
        return new String(cArr);
    }

    public static String b(String str) {
        MessageDigest messageDigest;
        byte[] bytes = str.getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', b.f62000f, 'e', 'f'};
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e11) {
            com.igexin.c.a.c.a.a(e11);
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        char[] cArr2 = new char[32];
        int i11 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            byte b11 = digest[i12];
            int i13 = i11 + 1;
            cArr2[i11] = cArr[(b11 >>> 4) & 15];
            i11 += 2;
            cArr2[i13] = cArr[b11 & 15];
        }
        return new String(cArr2);
    }

    public static byte[] c(byte[] bArr) {
        if (bArr == null || bArr.length < 16) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - 16];
        System.arraycopy(bArr, 8, bArr2, 0, bArr.length - 16);
        return g.b(bArr2);
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder("");
            int length = digest.length;
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = digest[i11];
                if (i12 < 0) {
                    i12 += 256;
                }
                if (i12 < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i12));
            }
            return sb2.toString();
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
            return null;
        }
    }

    public static String b(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    private static String a(byte[] bArr, int i11, int i12) {
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            sb2.append(String.format("%02X", Byte.valueOf(bArr[i13])));
        }
        return sb2.toString();
    }

    public static byte[] b(byte[] bArr) {
        byte[] a11;
        if (bArr == null || (a11 = g.a(bArr)) == null) {
            return null;
        }
        String b11 = b(String.valueOf(System.currentTimeMillis()));
        int length = a11.length;
        byte[] bArr2 = new byte[length + 16];
        byte[] bytes = b11.substring(0, 8).getBytes();
        byte[] bytes2 = b11.substring(24, 32).getBytes();
        System.arraycopy(bytes, 0, bArr2, 0, 8);
        System.arraycopy(a11, 0, bArr2, 8, length);
        System.arraycopy(bytes2, 0, bArr2, length + 8, 8);
        return bArr2;
    }

    public static boolean a(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static byte[] a(byte[] bArr) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e11) {
            com.igexin.c.a.c.a.a(e11);
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(bArr);
        return messageDigest.digest();
    }
}
