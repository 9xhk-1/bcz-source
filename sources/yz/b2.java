package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "UNumbersKt")
/* loaded from: classes8.dex */
public final class b2 {
    @y0(version = "1.5")
    @o00.f
    public static final int A(int i11) {
        return s1.i(Integer.lowestOneBit(i11));
    }

    @y0(version = "1.5")
    @o00.f
    public static final short B(short s11) {
        return c2.i((short) Integer.lowestOneBit(s11 & c2.f100412d));
    }

    @y0(version = "1.5")
    @o00.f
    public static final int a(byte b11) {
        return Integer.numberOfLeadingZeros(b11 & 255) - 24;
    }

    @y0(version = "1.5")
    @o00.f
    public static final int b(long j11) {
        return Long.numberOfLeadingZeros(j11);
    }

    @y0(version = "1.5")
    @o00.f
    public static final int c(int i11) {
        return Integer.numberOfLeadingZeros(i11);
    }

    @y0(version = "1.5")
    @o00.f
    public static final int d(short s11) {
        return Integer.numberOfLeadingZeros(s11 & c2.f100412d) - 16;
    }

    @y0(version = "1.5")
    @o00.f
    public static final int e(byte b11) {
        return Integer.bitCount(s1.i(b11 & 255));
    }

    @y0(version = "1.5")
    @o00.f
    public static final int f(long j11) {
        return Long.bitCount(j11);
    }

    @y0(version = "1.5")
    @o00.f
    public static final int g(int i11) {
        return Integer.bitCount(i11);
    }

    @y0(version = "1.5")
    @o00.f
    public static final int h(short s11) {
        return Integer.bitCount(s1.i(s11 & c2.f100412d));
    }

    @y0(version = "1.5")
    @o00.f
    public static final int i(byte b11) {
        return Integer.numberOfTrailingZeros(b11 | 256);
    }

    @y0(version = "1.5")
    @o00.f
    public static final int j(long j11) {
        return Long.numberOfTrailingZeros(j11);
    }

    @y0(version = "1.5")
    @o00.f
    public static final int k(int i11) {
        return Integer.numberOfTrailingZeros(i11);
    }

    @y0(version = "1.5")
    @o00.f
    public static final int l(short s11) {
        return Integer.numberOfTrailingZeros(s11 | 65536);
    }

    @y0(version = "1.6")
    @o00.f
    public static final long m(long j11, int i11) {
        return w1.i(Long.rotateLeft(j11, i11));
    }

    @y0(version = "1.6")
    @o00.f
    public static final byte n(byte b11, int i11) {
        return o1.i(m0.Z0(b11, i11));
    }

    @y0(version = "1.6")
    @o00.f
    public static final int o(int i11, int i12) {
        return s1.i(Integer.rotateLeft(i11, i12));
    }

    @y0(version = "1.6")
    @o00.f
    public static final short p(short s11, int i11) {
        return c2.i(m0.a1(s11, i11));
    }

    @y0(version = "1.6")
    @o00.f
    public static final long q(long j11, int i11) {
        return w1.i(Long.rotateRight(j11, i11));
    }

    @y0(version = "1.6")
    @o00.f
    public static final byte r(byte b11, int i11) {
        return o1.i(m0.b1(b11, i11));
    }

    @y0(version = "1.6")
    @o00.f
    public static final int s(int i11, int i12) {
        return s1.i(Integer.rotateRight(i11, i12));
    }

    @y0(version = "1.6")
    @o00.f
    public static final short t(short s11, int i11) {
        return c2.i(m0.c1(s11, i11));
    }

    @y0(version = "1.5")
    @o00.f
    public static final byte u(byte b11) {
        return o1.i((byte) Integer.highestOneBit(b11 & 255));
    }

    @y0(version = "1.5")
    @o00.f
    public static final long v(long j11) {
        return w1.i(Long.highestOneBit(j11));
    }

    @y0(version = "1.5")
    @o00.f
    public static final int w(int i11) {
        return s1.i(Integer.highestOneBit(i11));
    }

    @y0(version = "1.5")
    @o00.f
    public static final short x(short s11) {
        return c2.i((short) Integer.highestOneBit(s11 & c2.f100412d));
    }

    @y0(version = "1.5")
    @o00.f
    public static final byte y(byte b11) {
        return o1.i((byte) Integer.lowestOneBit(b11 & 255));
    }

    @y0(version = "1.5")
    @o00.f
    public static final long z(long j11) {
        return w1.i(Long.lowestOneBit(j11));
    }
}
