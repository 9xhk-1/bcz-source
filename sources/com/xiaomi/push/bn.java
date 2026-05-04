package com.xiaomi.push;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes8.dex */
public class bn {
    private static String a(byte b11) {
        int i11 = (b11 & Byte.MAX_VALUE) + (b11 < 0 ? 128 : 0);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11 < 16 ? "0" : "");
        sb2.append(Integer.toHexString(i11).toLowerCase());
        return sb2.toString();
    }

    public static String b(String str) {
        return a(str).subSequence(8, 24).toString();
    }

    public static String a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            StringBuffer stringBuffer = new StringBuffer();
            messageDigest.update(str.getBytes(), 0, str.length());
            for (byte b11 : messageDigest.digest()) {
                stringBuffer.append(a(b11));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static byte[] m5756a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception unused) {
            return null;
        }
    }
}
