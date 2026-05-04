package com.alipay.sdk.m.g;

import android.util.Base64;
import java.security.SecureRandom;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile SecureRandom f10560a;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f10561b = "0123456789ABCDEF".toCharArray();

    public static byte[] a(long j11) {
        return new byte[]{(byte) j11, (byte) (j11 >> 8), (byte) (j11 >> 16), (byte) (j11 >> 24), (byte) (j11 >> 32), (byte) (j11 >> 40), (byte) (j11 >> 48), (byte) (j11 >> 56)};
    }

    public static byte[] b() {
        byte[] bArr = new byte[2];
        a().nextBytes(bArr);
        return bArr;
    }

    public static byte[] c() {
        byte[] bArr = new byte[4];
        a().nextBytes(bArr);
        return bArr;
    }

    public static byte[] a(int i11) {
        return new byte[]{(byte) i11, (byte) (i11 >> 8), (byte) (i11 >> 16), (byte) (i11 >> 24)};
    }

    public static byte[] a(short s11) {
        return new byte[]{(byte) s11, (byte) (s11 >> 8)};
    }

    public static String b(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            byte b11 = bArr[i11];
            int i12 = i11 * 2;
            char[] cArr2 = f10561b;
            cArr[i12] = cArr2[(b11 & 255) >>> 4];
            cArr[i12 + 1] = cArr2[b11 & 15];
        }
        return new String(cArr);
    }

    public static byte[] a(char c11, char c12) {
        return new byte[]{(byte) (c11 & 255), (byte) (c12 & 255)};
    }

    public static byte[] a(char c11) {
        return new byte[]{(byte) (c11 & 255)};
    }

    public static byte[] a(byte b11) {
        return new byte[]{b11};
    }

    public static SecureRandom a() {
        if (f10560a != null) {
            return f10560a;
        }
        synchronized (c.class) {
            try {
                if (f10560a == null) {
                    f10560a = new SecureRandom();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f10560a;
    }

    public static byte[] a(byte[]... bArr) {
        int i11 = 0;
        for (byte[] bArr2 : bArr) {
            i11 += bArr2.length;
        }
        byte[] bArr3 = null;
        int i12 = 0;
        for (byte[] bArr4 : bArr) {
            if (bArr3 == null) {
                bArr3 = Arrays.copyOf(bArr4, i11);
                i12 = bArr4.length;
            } else {
                System.arraycopy(bArr4, 0, bArr3, i12, bArr4.length);
                i12 += bArr4.length;
            }
        }
        return bArr3;
    }

    public static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 3);
    }
}
