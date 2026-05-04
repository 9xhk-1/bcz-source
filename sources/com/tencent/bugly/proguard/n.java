package com.tencent.bugly.proguard;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f42616a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f42617b;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = bArr[i11 >>> 4];
            bArr3[i11] = bArr[i11 & 15];
        }
        f42616a = bArr2;
        f42617b = bArr3;
    }

    public static boolean a(int i11, int i12) {
        return i11 == i12;
    }

    public static boolean a(long j11, long j12) {
        return j11 == j12;
    }

    public static boolean a(boolean z11, boolean z12) {
        return z11 == z12;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    public static byte[] a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        byte[] bArr = new byte[position];
        System.arraycopy(byteBuffer.array(), 0, bArr, 0, position);
        return bArr;
    }
}
