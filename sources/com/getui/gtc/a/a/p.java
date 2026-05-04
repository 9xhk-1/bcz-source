package com.getui.gtc.a.a;

import java.security.MessageDigest;

/* loaded from: classes6.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f29741a = {'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f', 'g', io.ktor.util.date.b.f61999e, 'i', 'j', 'k', 'l', io.ktor.util.date.b.f61998d, 'n', 'o', 'p', 'q', 'r', io.ktor.util.date.b.f61997c, 't', l50.b.f69934p, 'v', 'w', 'x', 'y', io.ktor.util.date.b.f62003i, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', io.ktor.util.date.b.f62001g, 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', io.ktor.util.date.b.f62002h, 'Z'};

    private static String a(String str) {
        MessageDigest messageDigest;
        byte[] bytes = str.getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', io.ktor.util.date.b.f62000f, 'e', 'f'};
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (Exception e11) {
            com.getui.gtc.i.c.a.c(e11);
            messageDigest = null;
        }
        if (messageDigest == null) {
            return null;
        }
        messageDigest.update(bytes);
        byte[] digest = messageDigest.digest();
        char[] cArr2 = new char[32];
        int i11 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            byte b11 = digest[i12];
            int i13 = i11 + 1;
            cArr2[i11] = cArr[(b11 >>> 4) & 15];
            i11 += 2;
            cArr2[i13] = cArr[b11 & 15];
        }
        return new String(cArr2);
    }

    public static byte[] b(byte[] bArr) {
        if (bArr == null || bArr.length < 16) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - 16];
        System.arraycopy(bArr, 8, bArr2, 0, bArr.length - 16);
        return g.b(bArr2);
    }

    public static byte[] a(byte[] bArr) {
        byte[] a11;
        if (bArr == null || (a11 = g.a(bArr)) == null) {
            return null;
        }
        String a12 = a(String.valueOf(System.currentTimeMillis()));
        int length = a11.length;
        byte[] bArr2 = new byte[length + 16];
        byte[] bytes = a12.substring(0, 8).getBytes();
        byte[] bytes2 = a12.substring(24, 32).getBytes();
        System.arraycopy(bytes, 0, bArr2, 0, 8);
        System.arraycopy(a11, 0, bArr2, 8, length);
        System.arraycopy(bytes2, 0, bArr2, length + 8, 8);
        return bArr2;
    }
}
