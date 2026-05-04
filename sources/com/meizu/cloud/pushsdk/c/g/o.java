package com.meizu.cloud.pushsdk.c.g;

import java.nio.charset.Charset;

/* loaded from: classes7.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f39673a = Charset.forName("UTF-8");

    public static void a(long j11, long j12, long j13) {
        if ((j12 | j13) < 0 || j12 > j11 || j11 - j12 < j13) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13)));
        }
    }

    public static void a(Throwable th2) {
        b(th2);
    }

    public static boolean a(byte[] bArr, int i11, byte[] bArr2, int i12, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            if (bArr[i14 + i11] != bArr2[i14 + i12]) {
                return false;
            }
        }
        return true;
    }

    private static <T extends Throwable> void b(Throwable th2) throws Throwable {
        throw th2;
    }
}
