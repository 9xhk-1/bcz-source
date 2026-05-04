package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.5")
@w00.h
/* loaded from: classes8.dex */
public final class o1 implements Comparable<o1> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f100435b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final byte f100436c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f100437d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f100438e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f100439f = 8;

    /* renamed from: a, reason: collision with root package name */
    public final byte f100440a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    @v0
    @o00.g
    public /* synthetic */ o1(byte b11) {
        this.f100440a = b11;
    }

    @o00.f
    public static final int A(byte b11, byte b12) {
        return s1.i(s1.i(b11 & 255) - s1.i(b12 & 255));
    }

    @o00.f
    public static final long B(byte b11, long j11) {
        return w1.i(w1.i(b11 & 255) - j11);
    }

    @o00.f
    public static final int C(byte b11, int i11) {
        return s1.i(s1.i(b11 & 255) - i11);
    }

    @o00.f
    public static final int D(byte b11, short s11) {
        return s1.i(s1.i(b11 & 255) - s1.i(s11 & c2.f100412d));
    }

    @o00.f
    public static final byte E(byte b11, byte b12) {
        return i((byte) k1.a(s1.i(b11 & 255), s1.i(b12 & 255)));
    }

    @o00.f
    public static final long F(byte b11, long j11) {
        return l1.a(w1.i(b11 & 255), j11);
    }

    @o00.f
    public static final int G(byte b11, int i11) {
        return k1.a(s1.i(b11 & 255), i11);
    }

    @o00.f
    public static final short H(byte b11, short s11) {
        return c2.i((short) k1.a(s1.i(b11 & 255), s1.i(s11 & c2.f100412d)));
    }

    @o00.f
    public static final byte I(byte b11, byte b12) {
        return i((byte) (b11 | b12));
    }

    @o00.f
    public static final int J(byte b11, byte b12) {
        return s1.i(s1.i(b11 & 255) + s1.i(b12 & 255));
    }

    @o00.f
    public static final long K(byte b11, long j11) {
        return w1.i(w1.i(b11 & 255) + j11);
    }

    @o00.f
    public static final int L(byte b11, int i11) {
        return s1.i(s1.i(b11 & 255) + i11);
    }

    @o00.f
    public static final int M(byte b11, short s11) {
        return s1.i(s1.i(b11 & 255) + s1.i(s11 & c2.f100412d));
    }

    @o00.f
    public static final g10.x N(byte b11, byte b12) {
        return new g10.x(s1.i(b11 & 255), s1.i(b12 & 255), null);
    }

    @y0(version = "1.9")
    @o00.f
    @j2(markerClass = {kotlin.c.class})
    public static final g10.x O(byte b11, byte b12) {
        return g10.c0.V(s1.i(b11 & 255), s1.i(b12 & 255));
    }

    @o00.f
    public static final int P(byte b11, byte b12) {
        return k1.a(s1.i(b11 & 255), s1.i(b12 & 255));
    }

    @o00.f
    public static final long R(byte b11, long j11) {
        return l1.a(w1.i(b11 & 255), j11);
    }

    @o00.f
    public static final int S(byte b11, int i11) {
        return k1.a(s1.i(b11 & 255), i11);
    }

    @o00.f
    public static final int T(byte b11, short s11) {
        return k1.a(s1.i(b11 & 255), s1.i(s11 & c2.f100412d));
    }

    @o00.f
    public static final int U(byte b11, byte b12) {
        return s1.i(s1.i(b11 & 255) * s1.i(b12 & 255));
    }

    @o00.f
    public static final long V(byte b11, long j11) {
        return w1.i(w1.i(b11 & 255) * j11);
    }

    @o00.f
    public static final int W(byte b11, int i11) {
        return s1.i(s1.i(b11 & 255) * i11);
    }

    @o00.f
    public static final int X(byte b11, short s11) {
        return s1.i(s1.i(b11 & 255) * s1.i(s11 & c2.f100412d));
    }

    @o00.f
    public static final double Z(byte b11) {
        return i2.h(b11 & 255);
    }

    @o00.f
    public static final byte a(byte b11, byte b12) {
        return i((byte) (b11 & b12));
    }

    @o00.f
    public static final float a0(byte b11) {
        return (float) i2.h(b11 & 255);
    }

    public static final /* synthetic */ o1 b(byte b11) {
        return new o1(b11);
    }

    @o00.f
    public static final int c0(byte b11) {
        return b11 & 255;
    }

    @o00.f
    public static int d(byte b11, byte b12) {
        return kotlin.jvm.internal.g0.t(b11 & 255, b12 & 255);
    }

    @o00.f
    public static final long d0(byte b11) {
        return b11 & 255;
    }

    @o00.f
    public static final int e(byte b11, long j11) {
        int compare;
        compare = Long.compare(w1.i(b11 & 255) ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
        return compare;
    }

    @o00.f
    public static final short e0(byte b11) {
        return (short) (b11 & 255);
    }

    @o00.f
    public static final int f(byte b11, int i11) {
        int compare;
        compare = Integer.compare(s1.i(b11 & 255) ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
        return compare;
    }

    @m80.k
    public static String f0(byte b11) {
        return String.valueOf(b11 & 255);
    }

    @o00.f
    public static final int g(byte b11, short s11) {
        return kotlin.jvm.internal.g0.t(b11 & 255, s11 & c2.f100412d);
    }

    @o00.f
    public static final int h0(byte b11) {
        return s1.i(b11 & 255);
    }

    @o00.f
    public static final long i0(byte b11) {
        return w1.i(b11 & 255);
    }

    @o00.f
    public static final short j0(byte b11) {
        return c2.i((short) (b11 & 255));
    }

    @o00.f
    public static final byte k(byte b11) {
        return i((byte) (b11 - 1));
    }

    @o00.f
    public static final int l(byte b11, byte b12) {
        return j1.a(s1.i(b11 & 255), s1.i(b12 & 255));
    }

    @o00.f
    public static final byte l0(byte b11, byte b12) {
        return i((byte) (b11 ^ b12));
    }

    @o00.f
    public static final long m(byte b11, long j11) {
        return m1.a(w1.i(b11 & 255), j11);
    }

    @o00.f
    public static final int o(byte b11, int i11) {
        return j1.a(s1.i(b11 & 255), i11);
    }

    @o00.f
    public static final int p(byte b11, short s11) {
        return j1.a(s1.i(b11 & 255), s1.i(s11 & c2.f100412d));
    }

    public static boolean q(byte b11, Object obj) {
        return (obj instanceof o1) && b11 == ((o1) obj).k0();
    }

    public static final boolean r(byte b11, byte b12) {
        return b11 == b12;
    }

    @o00.f
    public static final int s(byte b11, byte b12) {
        return j1.a(s1.i(b11 & 255), s1.i(b12 & 255));
    }

    @o00.f
    public static final long t(byte b11, long j11) {
        return m1.a(w1.i(b11 & 255), j11);
    }

    @o00.f
    public static final int u(byte b11, int i11) {
        return j1.a(s1.i(b11 & 255), i11);
    }

    @o00.f
    public static final int v(byte b11, short s11) {
        return j1.a(s1.i(b11 & 255), s1.i(s11 & c2.f100412d));
    }

    public static int x(byte b11) {
        return Byte.hashCode(b11);
    }

    @o00.f
    public static final byte y(byte b11) {
        return i((byte) (b11 + 1));
    }

    @o00.f
    public static final byte z(byte b11) {
        return i((byte) (~b11));
    }

    @o00.f
    public final int c(byte b11) {
        return kotlin.jvm.internal.g0.t(k0() & 255, b11 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(o1 o1Var) {
        return kotlin.jvm.internal.g0.t(k0() & 255, o1Var.k0() & 255);
    }

    public boolean equals(Object obj) {
        return q(this.f100440a, obj);
    }

    public int hashCode() {
        return x(this.f100440a);
    }

    public final /* synthetic */ byte k0() {
        return this.f100440a;
    }

    @m80.k
    public String toString() {
        return f0(this.f100440a);
    }

    @v0
    public static /* synthetic */ void w() {
    }

    @o00.f
    public static final byte Y(byte b11) {
        return b11;
    }

    @o00.f
    public static final byte g0(byte b11) {
        return b11;
    }

    @v0
    @o00.g
    public static byte i(byte b11) {
        return b11;
    }
}
