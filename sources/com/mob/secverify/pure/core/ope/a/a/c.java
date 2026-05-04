package com.mob.secverify.pure.core.ope.a.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static byte[] f40845a = {68, 64, 94, 49, 50, 83};

    public static String a(byte[] bArr) {
        try {
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                bArr2[i11] = bArr[i11];
                for (byte b11 : f40845a) {
                    bArr2[i11] = (byte) (b11 ^ bArr2[i11]);
                }
            }
            return new String(bArr2);
        } catch (Throwable th2) {
            com.mob.secverify.b.c.a().c("[SecPure] ==>%s", th2.toString());
            return "";
        }
    }
}
