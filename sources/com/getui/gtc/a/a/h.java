package com.getui.gtc.a.a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes6.dex */
public final class h {
    public static String a(String str) {
        MessageDigest messageDigest;
        byte[] bytes = str.getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Exception unused) {
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

    public static byte[] a(byte[] bArr) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(bArr);
        return messageDigest.digest();
    }
}
