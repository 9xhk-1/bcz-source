package com.getui.gtc.dim.e;

/* loaded from: classes6.dex */
public final class a {
    public static byte[] a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            for (int length = bArr.length - 1; length > 0; length--) {
                bArr[length] = (byte) (bArr[length] ^ bArr[length - 1]);
            }
            bArr[0] = (byte) (bArr[0] ^ ho.c.A);
        }
        return bArr;
    }
}
