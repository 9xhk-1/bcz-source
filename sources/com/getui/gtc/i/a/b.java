package com.getui.gtc.i.a;

import com.getui.gtc.base.crypt.CryptTools;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes6.dex */
public final class b {
    public static byte[] a(byte[] bArr, String str) {
        return a(bArr, str.getBytes());
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr2.length;
        if (length > 0 && length <= 256) {
            int i11 = 0;
            for (byte b11 : bArr2) {
                if ((b11 & 255) != 14 || (i11 = i11 + 1) <= 3) {
                }
            }
            if (bArr.length <= 0) {
                throw new IllegalArgumentException("data is fail!");
            }
            try {
                return CryptTools.encrypt("RC4", CryptTools.wrapperKey("RC4", bArr2), (IvParameterSpec) null, bArr);
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        throw new IllegalArgumentException("key is fail!");
    }
}
