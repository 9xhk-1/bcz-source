package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m0 extends l0 {
    @y0(version = "1.4")
    @o00.f
    public static final int T0(byte b11) {
        return Integer.numberOfLeadingZeros(b11 & 255) - 24;
    }

    @y0(version = "1.4")
    @o00.f
    public static final int U0(short s11) {
        return Integer.numberOfLeadingZeros(s11 & c2.f100412d) - 16;
    }

    @y0(version = "1.4")
    @o00.f
    public static final int V0(byte b11) {
        return Integer.bitCount(b11 & 255);
    }

    @y0(version = "1.4")
    @o00.f
    public static final int W0(short s11) {
        return Integer.bitCount(s11 & c2.f100412d);
    }

    @y0(version = "1.4")
    @o00.f
    public static final int X0(byte b11) {
        return Integer.numberOfTrailingZeros(b11 | 256);
    }

    @y0(version = "1.4")
    @o00.f
    public static final int Y0(short s11) {
        return Integer.numberOfTrailingZeros(s11 | 65536);
    }

    @y0(version = "1.6")
    public static final byte Z0(byte b11, int i11) {
        int i12 = i11 & 7;
        return (byte) (((b11 & 255) >>> (8 - i12)) | (b11 << i12));
    }

    @y0(version = "1.6")
    public static final short a1(short s11, int i11) {
        int i12 = i11 & 15;
        return (short) (((s11 & 65535) >>> (16 - i12)) | (s11 << i12));
    }

    @y0(version = "1.6")
    public static final byte b1(byte b11, int i11) {
        int i12 = i11 & 7;
        return (byte) (((b11 & 255) >>> i12) | (b11 << (8 - i12)));
    }

    @y0(version = "1.6")
    public static final short c1(short s11, int i11) {
        int i12 = i11 & 15;
        return (short) (((s11 & 65535) >>> i12) | (s11 << (16 - i12)));
    }

    @y0(version = "1.4")
    @o00.f
    public static final byte d1(byte b11) {
        return (byte) Integer.highestOneBit(b11 & 255);
    }

    @y0(version = "1.4")
    @o00.f
    public static final short e1(short s11) {
        return (short) Integer.highestOneBit(s11 & c2.f100412d);
    }

    @y0(version = "1.4")
    @o00.f
    public static final byte f1(byte b11) {
        return (byte) Integer.lowestOneBit(b11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final short g1(short s11) {
        return (short) Integer.lowestOneBit(s11);
    }
}
