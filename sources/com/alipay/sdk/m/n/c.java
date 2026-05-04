package com.alipay.sdk.m.n;

import android.text.TextUtils;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {
    public static byte[] a(Cipher cipher, String str) {
        SecureRandom secureRandom = new SecureRandom();
        int blockSize = cipher.getBlockSize();
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(secureRandom.nextDouble());
        }
        int i11 = blockSize * 2;
        byte[] bArr = new byte[i11];
        byte[] bArr2 = new byte[blockSize];
        secureRandom.nextBytes(bArr2);
        for (int i12 = 1; i12 < i11; i12++) {
            byte codePointAt = (byte) (str.codePointAt(i12 % str.length()) & 127);
            bArr[i12] = codePointAt;
            if (i12 >= blockSize) {
                bArr[i12] = (byte) (bArr[0] & codePointAt);
            }
        }
        System.arraycopy(bArr, blockSize, bArr2, 0, blockSize);
        return bArr2;
    }
}
