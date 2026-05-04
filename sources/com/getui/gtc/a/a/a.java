package com.getui.gtc.a.a;

import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import xy.l1;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static byte[] f29678a;

    /* renamed from: com.getui.gtc.a.a.a$a, reason: collision with other inner class name */
    public static class C0344a extends Provider {
        public C0344a() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", ExifInterface.TAG_SOFTWARE);
        }
    }

    public static String a() {
        try {
            byte[] bArr = new byte[20];
            SecureRandom.getInstance(l1.f98585a).nextBytes(bArr);
            return b(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b11 : bArr) {
            a(stringBuffer, b11);
        }
        return stringBuffer.toString();
    }

    public static String a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            return b(b(bArr, bArr2, bArr3));
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(a(bArr), "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
            Cipher cipher = Cipher.getInstance("AES/CFB/NoPadding");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr2);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void a(StringBuffer stringBuffer, byte b11) {
        stringBuffer.append("0123456789ABCDEF".charAt((b11 >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b11 & 15));
    }

    public static byte[] a(byte[] bArr) {
        SecureRandom secureRandom;
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 28) {
                byte[] bArr2 = f29678a;
                if (bArr2 != null) {
                    return bArr2;
                }
                secureRandom = SecureRandom.getInstance(l1.f98585a);
            } else {
                secureRandom = SecureRandom.getInstance(l1.f98585a, new C0344a());
            }
            secureRandom.setSeed(bArr);
            keyGenerator.init(128, secureRandom);
            byte[] encoded = keyGenerator.generateKey().getEncoded();
            if (i11 >= 28 && f29678a == null) {
                f29678a = encoded;
            }
            return encoded;
        } catch (Throwable th2) {
            com.getui.gtc.i.c.a.c(th2);
            return null;
        }
    }
}
