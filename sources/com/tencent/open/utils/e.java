package com.tencent.open.utils;

import android.util.Base64;
import com.tencent.open.log.SLog;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f44586a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, String str2, byte[] bArr) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
        } catch (Exception e11) {
            SLog.e("DESUtils", "encryptAES", e11);
            return null;
        }
    }

    public static byte[] a(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return messageDigest.digest();
        } catch (Exception e11) {
            SLog.e("DESUtils", "encryptSha", e11);
            return null;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            char[] cArr = new char[bArr.length * 2];
            for (int i11 = 0; i11 < bArr.length; i11++) {
                byte b11 = bArr[i11];
                int i12 = i11 * 2;
                char[] cArr2 = f44586a;
                cArr[i12 + 1] = cArr2[b11 & 15];
                cArr[i12] = cArr2[((byte) (b11 >>> 4)) & 15];
            }
            return new String(cArr);
        }
        return "";
    }
}
