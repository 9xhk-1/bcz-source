package org.apache.thrift;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class EncodingUtils {
    public static final int clearBit(int i11, int i12) {
        return i11 & (~(1 << i12));
    }

    public static final int decodeBigEndian(byte[] bArr) {
        return decodeBigEndian(bArr, 0);
    }

    public static final void encodeBigEndian(int i11, byte[] bArr) {
        encodeBigEndian(i11, bArr, 0);
    }

    public static final byte setBit(byte b11, int i11, boolean z11) {
        return (byte) setBit((int) b11, i11, z11);
    }

    public static final boolean testBit(int i11, int i12) {
        return (i11 & (1 << i12)) != 0;
    }

    public static final long clearBit(long j11, int i11) {
        return j11 & (~(1 << i11));
    }

    public static final int decodeBigEndian(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    public static final void encodeBigEndian(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) ((i11 >> 24) & 255);
        bArr[i12 + 1] = (byte) ((i11 >> 16) & 255);
        bArr[i12 + 2] = (byte) ((i11 >> 8) & 255);
        bArr[i12 + 3] = (byte) (i11 & 255);
    }

    public static final short setBit(short s11, int i11, boolean z11) {
        return (short) setBit((int) s11, i11, z11);
    }

    public static final boolean testBit(long j11, int i11) {
        return (j11 & (1 << i11)) != 0;
    }

    public static final byte clearBit(byte b11, int i11) {
        return (byte) clearBit((int) b11, i11);
    }

    public static final int setBit(int i11, int i12, boolean z11) {
        return z11 ? i11 | (1 << i12) : clearBit(i11, i12);
    }

    public static final boolean testBit(byte b11, int i11) {
        return testBit((int) b11, i11);
    }

    public static final short clearBit(short s11, int i11) {
        return (short) clearBit((int) s11, i11);
    }

    public static final long setBit(long j11, int i11, boolean z11) {
        return z11 ? j11 | (1 << i11) : clearBit(j11, i11);
    }

    public static final boolean testBit(short s11, int i11) {
        return testBit((int) s11, i11);
    }
}
