package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class k0 extends j0 {
    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int J(byte b11, byte b12) {
        int i11 = b11 / b12;
        return ((b11 ^ b12) >= 0 || b12 * i11 == b11) ? i11 : i11 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int K(byte b11, int i11) {
        int i12 = b11 / i11;
        return ((b11 ^ i11) >= 0 || i11 * i12 == b11) ? i12 : i12 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int L(byte b11, short s11) {
        int i11 = b11 / s11;
        return ((b11 ^ s11) >= 0 || s11 * i11 == b11) ? i11 : i11 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int M(int i11, byte b11) {
        int i12 = i11 / b11;
        return ((i11 ^ b11) >= 0 || b11 * i12 == i11) ? i12 : i12 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int N(int i11, int i12) {
        int i13 = i11 / i12;
        return ((i11 ^ i12) >= 0 || i12 * i13 == i11) ? i13 : i13 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int O(int i11, short s11) {
        int i12 = i11 / s11;
        return ((i11 ^ s11) >= 0 || s11 * i12 == i11) ? i12 : i12 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int P(short s11, byte b11) {
        int i11 = s11 / b11;
        return ((s11 ^ b11) >= 0 || b11 * i11 == s11) ? i11 : i11 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int Q(short s11, int i11) {
        int i12 = s11 / i11;
        return ((s11 ^ i11) >= 0 || i11 * i12 == s11) ? i12 : i12 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int R(short s11, short s12) {
        int i11 = s11 / s12;
        return ((s11 ^ s12) >= 0 || s12 * i11 == s11) ? i11 : i11 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final long S(byte b11, long j11) {
        long j12 = b11;
        long j13 = j12 / j11;
        return ((j12 ^ j11) >= 0 || j11 * j13 == j12) ? j13 : j13 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final long T(int i11, long j11) {
        long j12 = i11;
        long j13 = j12 / j11;
        return ((j12 ^ j11) >= 0 || j11 * j13 == j12) ? j13 : j13 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final long U(long j11, byte b11) {
        long j12 = b11;
        long j13 = j11 / j12;
        return ((j11 ^ j12) >= 0 || j12 * j13 == j11) ? j13 : j13 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final long V(long j11, int i11) {
        long j12 = i11;
        long j13 = j11 / j12;
        return ((j11 ^ j12) >= 0 || j12 * j13 == j11) ? j13 : j13 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final long W(long j11, long j12) {
        long j13 = j11 / j12;
        return ((j11 ^ j12) >= 0 || j12 * j13 == j11) ? j13 : j13 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final long X(long j11, short s11) {
        long j12 = s11;
        long j13 = j11 / j12;
        return ((j11 ^ j12) >= 0 || j12 * j13 == j11) ? j13 : j13 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final long Y(short s11, long j11) {
        long j12 = s11;
        long j13 = j12 / j11;
        return ((j12 ^ j11) >= 0 || j11 * j13 == j12) ? j13 : j13 - 1;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final byte Z(byte b11, byte b12) {
        int i11 = b11 % b12;
        return (byte) (i11 + (b12 & (((i11 ^ b12) & ((-i11) | i11)) >> 31)));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final byte a0(int i11, byte b11) {
        int i12 = i11 % b11;
        return (byte) (i12 + (b11 & (((i12 ^ b11) & ((-i12) | i12)) >> 31)));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final byte b0(long j11, byte b11) {
        long j12 = j11 % b11;
        return (byte) (j12 + (r0 & (((j12 ^ r0) & ((-j12) | j12)) >> 63)));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final byte c0(short s11, byte b11) {
        int i11 = s11 % b11;
        return (byte) (i11 + (b11 & (((i11 ^ b11) & ((-i11) | i11)) >> 31)));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final double d0(double d11, double d12) {
        double d13 = d11 % d12;
        return d13 == 0.0d ? d13 : Math.signum(d13) == Math.signum(d12) ? d13 : d13 + d12;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final double e0(double d11, float f11) {
        double d12 = f11;
        double d13 = d11 % d12;
        return d13 == 0.0d ? d13 : Math.signum(d13) == Math.signum(d12) ? d13 : d13 + d12;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final double f0(float f11, double d11) {
        double d12 = f11 % d11;
        return d12 == 0.0d ? d12 : Math.signum(d12) == Math.signum(d11) ? d12 : d12 + d11;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final float g0(float f11, float f12) {
        float f13 = f11 % f12;
        return f13 == 0.0f ? f13 : Math.signum(f13) == Math.signum(f12) ? f13 : f13 + f12;
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int h0(byte b11, int i11) {
        int i12 = b11 % i11;
        return i12 + (i11 & (((i12 ^ i11) & ((-i12) | i12)) >> 31));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int i0(int i11, int i12) {
        int i13 = i11 % i12;
        return i13 + (i12 & (((i13 ^ i12) & ((-i13) | i13)) >> 31));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int j0(long j11, int i11) {
        long j12 = i11;
        long j13 = j11 % j12;
        return (int) (j13 + (j12 & (((j13 ^ j12) & ((-j13) | j13)) >> 63)));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final int k0(short s11, int i11) {
        int i12 = s11 % i11;
        return i12 + (i11 & (((i12 ^ i11) & ((-i12) | i12)) >> 31));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final long l0(byte b11, long j11) {
        long j12 = b11 % j11;
        return j12 + (j11 & (((j12 ^ j11) & ((-j12) | j12)) >> 63));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final long m0(int i11, long j11) {
        long j12 = i11 % j11;
        return j12 + (j11 & (((j12 ^ j11) & ((-j12) | j12)) >> 63));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final long n0(long j11, long j12) {
        long j13 = j11 % j12;
        return j13 + (j12 & (((j13 ^ j12) & ((-j13) | j13)) >> 63));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final long o0(short s11, long j11) {
        long j12 = s11 % j11;
        return j12 + (j11 & (((j12 ^ j11) & ((-j12) | j12)) >> 63));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final short p0(byte b11, short s11) {
        int i11 = b11 % s11;
        return (short) (i11 + (s11 & (((i11 ^ s11) & ((-i11) | i11)) >> 31)));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final short q0(int i11, short s11) {
        int i12 = i11 % s11;
        return (short) (i12 + (s11 & (((i12 ^ s11) & ((-i12) | i12)) >> 31)));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final short r0(long j11, short s11) {
        long j12 = j11 % s11;
        return (short) (j12 + (r0 & (((j12 ^ r0) & ((-j12) | j12)) >> 63)));
    }

    @y0(version = "1.5")
    @o00.g
    @o00.f
    public static final short s0(short s11, short s12) {
        int i11 = s11 % s12;
        return (short) (i11 + (s12 & (((i11 ^ s12) & ((-i11) | i11)) >> 31)));
    }
}
