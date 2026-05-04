package pq;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public class l {
    public static SecretKey a(f fVar) throws NoSuchAlgorithmException, InvalidKeySpecException {
        if (fVar == null || !fVar.a()) {
            throw new IllegalArgumentException("invalid data for generating the key.");
        }
        Log.d("AGC_Keys", "build aes key, iterationCount:" + fVar.g());
        SecretKey generateSecret = SecretKeyFactory.getInstance(fVar.f()).generateSecret(new PBEKeySpec(a.c(e(a.b(fVar.b()), a.b(fVar.c()), a.b(fVar.d()))).toCharArray(), a.b(fVar.e()), fVar.g(), fVar.h() * 8));
        Log.d("AGC_Keys", "build aes key end");
        return new SecretKeySpec(generateSecret.getEncoded(), "AES");
    }

    public static byte[] b(SecretKey secretKey, byte[] bArr) throws GeneralSecurityException {
        if (secretKey == null || bArr == null) {
            throw new NullPointerException("key or cipherText must not be null.");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, 17);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKey, new IvParameterSpec(copyOfRange));
        return cipher.doFinal(bArr, copyOfRange.length + 1, (bArr.length - copyOfRange.length) - 1);
    }

    public static byte[] c(byte[] bArr, int i11) {
        if (bArr == null) {
            throw new NullPointerException("bytes must not be null.");
        }
        for (int i12 = 0; i12 < bArr.length; i12++) {
            if (i11 < 0) {
                bArr[i12] = (byte) (bArr[i12] << (-i11));
            } else {
                bArr[i12] = (byte) (bArr[i12] >> i11);
            }
        }
        return bArr;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            throw new NullPointerException("left or right must not be null.");
        }
        if (bArr.length != bArr2.length) {
            throw new IllegalArgumentException("left and right must be the same length.");
        }
        byte[] bArr3 = new byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11]);
        }
        return bArr3;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return d(c(d(c(bArr, -4), bArr2), 6), bArr3);
    }
}
