package e00;

import kotlin.jvm.internal.g0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class h extends g {
    @y0(version = "1.1")
    @o00.f
    public static final byte I(byte b11, byte b12) {
        return (byte) Math.max((int) b11, (int) b12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final byte J(byte b11, byte b12, byte b13) {
        return (byte) Math.max((int) b11, Math.max((int) b12, (int) b13));
    }

    @y0(version = "1.4")
    public static final byte K(byte b11, @m80.k byte... other) {
        g0.p(other, "other");
        for (byte b12 : other) {
            b11 = (byte) Math.max((int) b11, (int) b12);
        }
        return b11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final double L(double d11, double d12) {
        return Math.max(d11, d12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final double M(double d11, double d12, double d13) {
        return Math.max(d11, Math.max(d12, d13));
    }

    @y0(version = "1.4")
    public static final double N(double d11, @m80.k double... other) {
        g0.p(other, "other");
        for (double d12 : other) {
            d11 = Math.max(d11, d12);
        }
        return d11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final float O(float f11, float f12) {
        return Math.max(f11, f12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final float P(float f11, float f12, float f13) {
        return Math.max(f11, Math.max(f12, f13));
    }

    @y0(version = "1.4")
    public static float Q(float f11, @m80.k float... other) {
        g0.p(other, "other");
        for (float f12 : other) {
            f11 = Math.max(f11, f12);
        }
        return f11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final int R(int i11, int i12) {
        return Math.max(i11, i12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final int S(int i11, int i12, int i13) {
        return Math.max(i11, Math.max(i12, i13));
    }

    @y0(version = "1.4")
    public static final int T(int i11, @m80.k int... other) {
        g0.p(other, "other");
        for (int i12 : other) {
            i11 = Math.max(i11, i12);
        }
        return i11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final long U(long j11, long j12) {
        return Math.max(j11, j12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final long V(long j11, long j12, long j13) {
        return Math.max(j11, Math.max(j12, j13));
    }

    @y0(version = "1.4")
    public static final long W(long j11, @m80.k long... other) {
        g0.p(other, "other");
        for (long j12 : other) {
            j11 = Math.max(j11, j12);
        }
        return j11;
    }

    @y0(version = "1.1")
    @m80.k
    public static <T extends Comparable<? super T>> T X(@m80.k T a11, @m80.k T b11) {
        g0.p(a11, "a");
        g0.p(b11, "b");
        return a11.compareTo(b11) >= 0 ? a11 : b11;
    }

    @y0(version = "1.1")
    @m80.k
    public static final <T extends Comparable<? super T>> T Y(@m80.k T a11, @m80.k T b11, @m80.k T c11) {
        g0.p(a11, "a");
        g0.p(b11, "b");
        g0.p(c11, "c");
        return (T) X(a11, X(b11, c11));
    }

    @y0(version = "1.4")
    @m80.k
    public static final <T extends Comparable<? super T>> T Z(@m80.k T a11, @m80.k T... other) {
        g0.p(a11, "a");
        g0.p(other, "other");
        for (T t11 : other) {
            a11 = (T) X(a11, t11);
        }
        return a11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final short a0(short s11, short s12) {
        return (short) Math.max((int) s11, (int) s12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final short b0(short s11, short s12, short s13) {
        return (short) Math.max((int) s11, Math.max((int) s12, (int) s13));
    }

    @y0(version = "1.4")
    public static final short c0(short s11, @m80.k short... other) {
        g0.p(other, "other");
        for (short s12 : other) {
            s11 = (short) Math.max((int) s11, (int) s12);
        }
        return s11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final byte d0(byte b11, byte b12) {
        return (byte) Math.min((int) b11, (int) b12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final byte e0(byte b11, byte b12, byte b13) {
        return (byte) Math.min((int) b11, Math.min((int) b12, (int) b13));
    }

    @y0(version = "1.4")
    public static final byte f0(byte b11, @m80.k byte... other) {
        g0.p(other, "other");
        for (byte b12 : other) {
            b11 = (byte) Math.min((int) b11, (int) b12);
        }
        return b11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final double g0(double d11, double d12) {
        return Math.min(d11, d12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final double h0(double d11, double d12, double d13) {
        return Math.min(d11, Math.min(d12, d13));
    }

    @y0(version = "1.4")
    public static final double i0(double d11, @m80.k double... other) {
        g0.p(other, "other");
        for (double d12 : other) {
            d11 = Math.min(d11, d12);
        }
        return d11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final float j0(float f11, float f12) {
        return Math.min(f11, f12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final float k0(float f11, float f12, float f13) {
        return Math.min(f11, Math.min(f12, f13));
    }

    @y0(version = "1.4")
    public static float l0(float f11, @m80.k float... other) {
        g0.p(other, "other");
        for (float f12 : other) {
            f11 = Math.min(f11, f12);
        }
        return f11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final int m0(int i11, int i12) {
        return Math.min(i11, i12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final int n0(int i11, int i12, int i13) {
        return Math.min(i11, Math.min(i12, i13));
    }

    @y0(version = "1.4")
    public static final int o0(int i11, @m80.k int... other) {
        g0.p(other, "other");
        for (int i12 : other) {
            i11 = Math.min(i11, i12);
        }
        return i11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final long p0(long j11, long j12) {
        return Math.min(j11, j12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final long q0(long j11, long j12, long j13) {
        return Math.min(j11, Math.min(j12, j13));
    }

    @y0(version = "1.4")
    public static final long r0(long j11, @m80.k long... other) {
        g0.p(other, "other");
        for (long j12 : other) {
            j11 = Math.min(j11, j12);
        }
        return j11;
    }

    @y0(version = "1.1")
    @m80.k
    public static final <T extends Comparable<? super T>> T s0(@m80.k T a11, @m80.k T b11) {
        g0.p(a11, "a");
        g0.p(b11, "b");
        return a11.compareTo(b11) <= 0 ? a11 : b11;
    }

    @y0(version = "1.1")
    @m80.k
    public static final <T extends Comparable<? super T>> T t0(@m80.k T a11, @m80.k T b11, @m80.k T c11) {
        g0.p(a11, "a");
        g0.p(b11, "b");
        g0.p(c11, "c");
        return (T) s0(a11, s0(b11, c11));
    }

    @y0(version = "1.4")
    @m80.k
    public static final <T extends Comparable<? super T>> T u0(@m80.k T a11, @m80.k T... other) {
        g0.p(a11, "a");
        g0.p(other, "other");
        for (T t11 : other) {
            a11 = (T) s0(a11, t11);
        }
        return a11;
    }

    @y0(version = "1.1")
    @o00.f
    public static final short v0(short s11, short s12) {
        return (short) Math.min((int) s11, (int) s12);
    }

    @y0(version = "1.1")
    @o00.f
    public static final short w0(short s11, short s12, short s13) {
        return (short) Math.min((int) s11, Math.min((int) s12, (int) s13));
    }

    @y0(version = "1.4")
    public static final short x0(short s11, @m80.k short... other) {
        g0.p(other, "other");
        for (short s12 : other) {
            s11 = (short) Math.min((int) s11, (int) s12);
        }
        return s11;
    }
}
