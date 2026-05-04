package com.xiaomi.push.service;

import android.text.TextUtils;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes8.dex */
public class bs {

    /* renamed from: a, reason: collision with root package name */
    private static RSAPublicKey f46338a;

    /* renamed from: a, reason: collision with other field name */
    private static final byte[] f980a;

    static {
        byte[] bArr = {48, -127, -97, 48, 13, 6, 9, 42, -122, 72, -122, -9, 13, 1, 1, 1, 5, 0, 3, -127, -115, 0, 48, -127, -119, 2, -127, -127, 0, -109, -38, -114, ho.c.D, -72, 78, 16, 70, -90, 113, -30, 36, 85, -3, -43, 123, 61, -98, 4, -16, 67, 19, -90, -73, -5, -89, 36, 44, -27, 59, -123, 72, -73, -48, 49, 13, 16, 50, -27, -82, ho.c.f59556u, -28, 84, 0, -41, 16, 69, -39, 7, 82, 56, 79, -37, 40, 85, 107, 98, 33, 123, -34, -49, 111, -11, 49, 28, 117, -74, 114, -122, -29, -84, 82, ho.c.f59561z, -122, 42, -40, -79, ho.c.f59556u, -116, -42, 101, -70, 44, 11, 62, -49, -3, -22, -2, 66, 90, -116, -75, -99, 34, 121, 69, 10, -81, -57, 89, -23, -36, -60, -81, 67, -114, 10, 79, 100, ho.c.G, 47, -24, 110, -66, -7, 87, 16, -125, -91, -43, -103, 67, -20, 41, 117, -37, -11, 2, 3, 1, 0, 1};
        f980a = bArr;
        try {
            f46338a = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr));
        } catch (Throwable unused) {
            com.xiaomi.channel.commonutils.logger.b.d("rsa key pair init failure!!!");
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(1, f46338a);
            return Base64.encodeToString(a(cipher, 1, str.getBytes("UTF-8"), f46338a.getModulus().bitLength()), 2);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static byte[] a(Cipher cipher, int i11, byte[] bArr, int i12) {
        if (cipher == null || bArr == null) {
            return null;
        }
        int i13 = i12 / 8;
        if (i11 != 2) {
            i13 -= 11;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i14 = 0;
            int i15 = 0;
            while (bArr.length > i14) {
                byte[] doFinal = bArr.length - i14 > i13 ? cipher.doFinal(bArr, i14, i13) : cipher.doFinal(bArr, i14, bArr.length - i14);
                byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                i15++;
                i14 = i15 * i13;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }
}
