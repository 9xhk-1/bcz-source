package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.5")
@w00.h
/* loaded from: classes8.dex */
public final class c2 implements Comparable<c2> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f100410b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final short f100411c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final short f100412d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f100413e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f100414f = 16;

    /* renamed from: a, reason: collision with root package name */
    public final short f100415a;

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
    public /* synthetic */ c2(short s11) {
        this.f100415a = s11;
    }

    @o00.f
    public static final int A(short s11, byte b11) {
        return s1.i(s1.i(s11 & f100412d) - s1.i(b11 & 255));
    }

    @o00.f
    public static final long B(short s11, long j11) {
        return w1.i(w1.i(s11 & j60.g.f63638t) - j11);
    }

    @o00.f
    public static final int C(short s11, int i11) {
        return s1.i(s1.i(s11 & f100412d) - i11);
    }

    @o00.f
    public static final int D(short s11, short s12) {
        return s1.i(s1.i(s11 & f100412d) - s1.i(s12 & f100412d));
    }

    @o00.f
    public static final byte E(short s11, byte b11) {
        return o1.i((byte) k1.a(s1.i(s11 & f100412d), s1.i(b11 & 255)));
    }

    @o00.f
    public static final long F(short s11, long j11) {
        return l1.a(w1.i(s11 & j60.g.f63638t), j11);
    }

    @o00.f
    public static final int G(short s11, int i11) {
        return k1.a(s1.i(s11 & f100412d), i11);
    }

    @o00.f
    public static final short H(short s11, short s12) {
        return i((short) k1.a(s1.i(s11 & f100412d), s1.i(s12 & f100412d)));
    }

    @o00.f
    public static final short I(short s11, short s12) {
        return i((short) (s11 | s12));
    }

    @o00.f
    public static final int J(short s11, byte b11) {
        return s1.i(s1.i(s11 & f100412d) + s1.i(b11 & 255));
    }

    @o00.f
    public static final long K(short s11, long j11) {
        return w1.i(w1.i(s11 & j60.g.f63638t) + j11);
    }

    @o00.f
    public static final int L(short s11, int i11) {
        return s1.i(s1.i(s11 & f100412d) + i11);
    }

    @o00.f
    public static final int M(short s11, short s12) {
        return s1.i(s1.i(s11 & f100412d) + s1.i(s12 & f100412d));
    }

    @o00.f
    public static final g10.x N(short s11, short s12) {
        return new g10.x(s1.i(s11 & f100412d), s1.i(s12 & f100412d), null);
    }

    @y0(version = "1.9")
    @o00.f
    @j2(markerClass = {kotlin.c.class})
    public static final g10.x O(short s11, short s12) {
        return g10.c0.V(s1.i(s11 & f100412d), s1.i(s12 & f100412d));
    }

    @o00.f
    public static final int P(short s11, byte b11) {
        return k1.a(s1.i(s11 & f100412d), s1.i(b11 & 255));
    }

    @o00.f
    public static final long R(short s11, long j11) {
        return l1.a(w1.i(s11 & j60.g.f63638t), j11);
    }

    @o00.f
    public static final int S(short s11, int i11) {
        return k1.a(s1.i(s11 & f100412d), i11);
    }

    @o00.f
    public static final int T(short s11, short s12) {
        return k1.a(s1.i(s11 & f100412d), s1.i(s12 & f100412d));
    }

    @o00.f
    public static final int U(short s11, byte b11) {
        return s1.i(s1.i(s11 & f100412d) * s1.i(b11 & 255));
    }

    @o00.f
    public static final long V(short s11, long j11) {
        return w1.i(w1.i(s11 & j60.g.f63638t) * j11);
    }

    @o00.f
    public static final int W(short s11, int i11) {
        return s1.i(s1.i(s11 & f100412d) * i11);
    }

    @o00.f
    public static final int X(short s11, short s12) {
        return s1.i(s1.i(s11 & f100412d) * s1.i(s12 & f100412d));
    }

    @o00.f
    public static final byte Y(short s11) {
        return (byte) s11;
    }

    @o00.f
    public static final double Z(short s11) {
        return i2.h(s11 & f100412d);
    }

    @o00.f
    public static final short a(short s11, short s12) {
        return i((short) (s11 & s12));
    }

    @o00.f
    public static final float a0(short s11) {
        return (float) i2.h(s11 & f100412d);
    }

    public static final /* synthetic */ c2 b(short s11) {
        return new c2(s11);
    }

    @o00.f
    public static final int c(short s11, byte b11) {
        return kotlin.jvm.internal.g0.t(s11 & f100412d, b11 & 255);
    }

    @o00.f
    public static final int c0(short s11) {
        return s11 & f100412d;
    }

    @o00.f
    public static final int d(short s11, long j11) {
        int compare;
        compare = Long.compare(w1.i(s11 & j60.g.f63638t) ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
        return compare;
    }

    @o00.f
    public static final long d0(short s11) {
        return s11 & j60.g.f63638t;
    }

    @o00.f
    public static final int e(short s11, int i11) {
        int compare;
        compare = Integer.compare(s1.i(s11 & f100412d) ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
        return compare;
    }

    @m80.k
    public static String f0(short s11) {
        return String.valueOf(s11 & f100412d);
    }

    @o00.f
    public static int g(short s11, short s12) {
        return kotlin.jvm.internal.g0.t(s11 & f100412d, s12 & f100412d);
    }

    @o00.f
    public static final byte g0(short s11) {
        return o1.i((byte) s11);
    }

    @o00.f
    public static final int h0(short s11) {
        return s1.i(s11 & f100412d);
    }

    @o00.f
    public static final long i0(short s11) {
        return w1.i(s11 & j60.g.f63638t);
    }

    @o00.f
    public static final short k(short s11) {
        return i((short) (s11 - 1));
    }

    @o00.f
    public static final int l(short s11, byte b11) {
        return j1.a(s1.i(s11 & f100412d), s1.i(b11 & 255));
    }

    @o00.f
    public static final short l0(short s11, short s12) {
        return i((short) (s11 ^ s12));
    }

    @o00.f
    public static final long m(short s11, long j11) {
        return m1.a(w1.i(s11 & j60.g.f63638t), j11);
    }

    @o00.f
    public static final int o(short s11, int i11) {
        return j1.a(s1.i(s11 & f100412d), i11);
    }

    @o00.f
    public static final int p(short s11, short s12) {
        return j1.a(s1.i(s11 & f100412d), s1.i(s12 & f100412d));
    }

    public static boolean q(short s11, Object obj) {
        return (obj instanceof c2) && s11 == ((c2) obj).k0();
    }

    public static final boolean r(short s11, short s12) {
        return s11 == s12;
    }

    @o00.f
    public static final int s(short s11, byte b11) {
        return j1.a(s1.i(s11 & f100412d), s1.i(b11 & 255));
    }

    @o00.f
    public static final long t(short s11, long j11) {
        return m1.a(w1.i(s11 & j60.g.f63638t), j11);
    }

    @o00.f
    public static final int u(short s11, int i11) {
        return j1.a(s1.i(s11 & f100412d), i11);
    }

    @o00.f
    public static final int v(short s11, short s12) {
        return j1.a(s1.i(s11 & f100412d), s1.i(s12 & f100412d));
    }

    public static int x(short s11) {
        return Short.hashCode(s11);
    }

    @o00.f
    public static final short y(short s11) {
        return i((short) (s11 + 1));
    }

    @o00.f
    public static final short z(short s11) {
        return i((short) (~s11));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(c2 c2Var) {
        return kotlin.jvm.internal.g0.t(k0() & f100412d, c2Var.k0() & f100412d);
    }

    public boolean equals(Object obj) {
        return q(this.f100415a, obj);
    }

    @o00.f
    public final int f(short s11) {
        return kotlin.jvm.internal.g0.t(k0() & f100412d, s11 & f100412d);
    }

    public int hashCode() {
        return x(this.f100415a);
    }

    public final /* synthetic */ short k0() {
        return this.f100415a;
    }

    @m80.k
    public String toString() {
        return f0(this.f100415a);
    }

    @v0
    public static /* synthetic */ void w() {
    }

    @o00.f
    public static final short e0(short s11) {
        return s11;
    }

    @v0
    @o00.g
    public static short i(short s11) {
        return s11;
    }

    @o00.f
    public static final short j0(short s11) {
        return s11;
    }
}
