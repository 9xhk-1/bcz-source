package com.igexin.push.g;

import android.text.TextUtils;
import android.util.Base64;
import java.io.RandomAccessFile;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f38634a = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCzbMQ22qV6umuPXYWXEOGdlpJR\nBWMP68/ArS7XG8+7GmRbWMW1HOMLOOdwuIfPFp9QiwOshG0mYXlm1ecQ/fCXhRMW\nfh+OMCoBdl7vnCpoDYPmjYQBkm9fRW6oej33UhZtlnTZjECAsyC2Eybha7jg3Lft\ngYVnwaPShTmv5+Z9SQIDAQAB";

    /* renamed from: b, reason: collision with root package name */
    private static final String f38635b = "LOG-CryptoTool";

    private static byte a(char c11) {
        return (byte) "0123456789ABCDEF".indexOf(c11);
    }

    private static RSAPublicKey b(String str) throws Exception {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    private static byte[] c() {
        if (com.igexin.push.core.e.aB == null) {
            String str = (String) o.b(com.igexin.push.core.e.f38035l, o.f38738g, "");
            byte[] bArr = null;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str != null && !str.equals("")) {
                String upperCase = str.toUpperCase();
                int length = upperCase.length() / 2;
                char[] charArray = upperCase.toCharArray();
                bArr = new byte[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 * 2;
                    bArr[i11] = (byte) (((byte) "0123456789ABCDEF".indexOf(charArray[i12 + 1])) | (((byte) "0123456789ABCDEF".indexOf(charArray[i12])) << 4));
                }
            }
            com.igexin.push.core.e.aB = com.igexin.c.a.a.a.a(bArr, com.igexin.push.core.e.M);
        }
        return com.igexin.push.core.e.aB;
    }

    private static String a() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        return a(keyGenerator.generateKey().getEncoded());
    }

    private static void b() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        com.igexin.push.core.e.aB = keyGenerator.generateKey().getEncoded();
        o.a(com.igexin.push.core.e.f38035l, o.f38738g, a(g.a(com.igexin.push.core.e.aB)));
        o.b(com.igexin.push.core.e.f38035l, o.f38738g, "");
    }

    private static byte[] c(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (((byte) "0123456789ABCDEF".indexOf(charArray[i12 + 1])) | (((byte) "0123456789ABCDEF".indexOf(charArray[i12])) << 4));
        }
        return bArr;
    }

    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder("");
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

    private static void a(RandomAccessFile randomAccessFile) throws Exception {
        long length = (int) (randomAccessFile.length() % 16);
        if (length >= 16 || length <= 0) {
            return;
        }
        randomAccessFile.setLength(randomAccessFile.length() - length);
    }

    private static byte[] a(String str) throws Exception {
        RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(f38634a, 0)));
        Cipher cipher = Cipher.getInstance("RSA/ECB/OAEPWithSHA1AndMGF1Padding");
        cipher.init(1, rSAPublicKey);
        byte[] doFinal = cipher.doFinal(str.getBytes("UTF-8"));
        a(doFinal);
        return doFinal;
    }
}
