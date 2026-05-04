package com.igexin.base.util;

import android.text.TextUtils;
import java.security.MessageDigest;

/* loaded from: classes7.dex */
public class StringUtil {
    public static String bytesToHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b11 : bArr) {
            String hexString = Integer.toHexString(b11 & 255);
            if (hexString.length() < 2) {
                sb2.append(0);
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    private static byte charToByte(char c11) {
        return (byte) "0123456789ABCDEF".indexOf(c11);
    }

    public static String getMD5(String str) {
        return getMD5(str.getBytes());
    }

    public static byte[] hexStringToBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (charToByte(charArray[i12 + 1]) | (charToByte(charArray[i12]) << 4));
        }
        return bArr;
    }

    public static String getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(bArr);
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
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
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }
}
