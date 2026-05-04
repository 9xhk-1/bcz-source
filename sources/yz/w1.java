package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.5")
@w00.h
/* loaded from: classes8.dex */
public final class w1 implements Comparable<w1> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f100453b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f100454c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final long f100455d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f100456e = 8;

    /* renamed from: f, reason: collision with root package name */
    public static final int f100457f = 64;

    /* renamed from: a, reason: collision with root package name */
    public final long f100458a;

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
    public /* synthetic */ w1(long j11) {
        this.f100458a = j11;
    }

    @o00.f
    public static final long A(long j11, byte b11) {
        return i(j11 - i(b11 & 255));
    }

    @o00.f
    public static final long B(long j11, long j12) {
        return i(j11 - j12);
    }

    @o00.f
    public static final long C(long j11, int i11) {
        return i(j11 - i(i11 & 4294967295L));
    }

    @o00.f
    public static final long D(long j11, short s11) {
        return i(j11 - i(s11 & j60.g.f63638t));
    }

    @o00.f
    public static final byte E(long j11, byte b11) {
        return o1.i((byte) l1.a(j11, i(b11 & 255)));
    }

    @o00.f
    public static final long F(long j11, long j12) {
        return l1.a(j11, j12);
    }

    @o00.f
    public static final int G(long j11, int i11) {
        return s1.i((int) l1.a(j11, i(i11 & 4294967295L)));
    }

    @o00.f
    public static final short H(long j11, short s11) {
        return c2.i((short) l1.a(j11, i(s11 & j60.g.f63638t)));
    }

    @o00.f
    public static final long I(long j11, long j12) {
        return i(j11 | j12);
    }

    @o00.f
    public static final long J(long j11, byte b11) {
        return i(j11 + i(b11 & 255));
    }

    @o00.f
    public static final long K(long j11, long j12) {
        return i(j11 + j12);
    }

    @o00.f
    public static final long L(long j11, int i11) {
        return i(j11 + i(i11 & 4294967295L));
    }

    @o00.f
    public static final long M(long j11, short s11) {
        return i(j11 + i(s11 & j60.g.f63638t));
    }

    @o00.f
    public static final g10.a0 N(long j11, long j12) {
        return new g10.a0(j11, j12, null);
    }

    @y0(version = "1.9")
    @o00.f
    @j2(markerClass = {kotlin.c.class})
    public static final g10.a0 O(long j11, long j12) {
        return g10.c0.X(j11, j12);
    }

    @o00.f
    public static final long P(long j11, byte b11) {
        return l1.a(j11, i(b11 & 255));
    }

    @o00.f
    public static final long R(long j11, long j12) {
        return i2.p(j11, j12);
    }

    @o00.f
    public static final long S(long j11, int i11) {
        return l1.a(j11, i(i11 & 4294967295L));
    }

    @o00.f
    public static final long T(long j11, short s11) {
        return l1.a(j11, i(s11 & j60.g.f63638t));
    }

    @o00.f
    public static final long U(long j11, int i11) {
        return i(j11 << i11);
    }

    @o00.f
    public static final long V(long j11, int i11) {
        return i(j11 >>> i11);
    }

    @o00.f
    public static final long W(long j11, byte b11) {
        return i(j11 * i(b11 & 255));
    }

    @o00.f
    public static final long X(long j11, long j12) {
        return i(j11 * j12);
    }

    @o00.f
    public static final long Y(long j11, int i11) {
        return i(j11 * i(i11 & 4294967295L));
    }

    @o00.f
    public static final long Z(long j11, short s11) {
        return i(j11 * i(s11 & j60.g.f63638t));
    }

    @o00.f
    public static final long a(long j11, long j12) {
        return i(j11 & j12);
    }

    @o00.f
    public static final byte a0(long j11) {
        return (byte) j11;
    }

    public static final /* synthetic */ w1 b(long j11) {
        return new w1(j11);
    }

    @o00.f
    public static final int c(long j11, byte b11) {
        int compare;
        compare = Long.compare(j11 ^ Long.MIN_VALUE, i(b11 & 255) ^ Long.MIN_VALUE);
        return compare;
    }

    @o00.f
    public static final double c0(long j11) {
        return i2.q(j11);
    }

    @o00.f
    public static final float d0(long j11) {
        return (float) i2.q(j11);
    }

    @o00.f
    public static int e(long j11, long j12) {
        return i2.n(j11, j12);
    }

    @o00.f
    public static final int e0(long j11) {
        return (int) j11;
    }

    @o00.f
    public static final int f(long j11, int i11) {
        int compare;
        compare = Long.compare(j11 ^ Long.MIN_VALUE, i(i11 & 4294967295L) ^ Long.MIN_VALUE);
        return compare;
    }

    @o00.f
    public static final int g(long j11, short s11) {
        int compare;
        compare = Long.compare(j11 ^ Long.MIN_VALUE, i(s11 & j60.g.f63638t) ^ Long.MIN_VALUE);
        return compare;
    }

    @o00.f
    public static final short g0(long j11) {
        return (short) j11;
    }

    @m80.k
    public static String h0(long j11) {
        return i2.t(j11, 10);
    }

    @o00.f
    public static final byte i0(long j11) {
        return o1.i((byte) j11);
    }

    @o00.f
    public static final int j0(long j11) {
        return s1.i((int) j11);
    }

    @o00.f
    public static final long k(long j11) {
        return i(j11 - 1);
    }

    @o00.f
    public static final long l(long j11, byte b11) {
        return m1.a(j11, i(b11 & 255));
    }

    @o00.f
    public static final short l0(long j11) {
        return c2.i((short) j11);
    }

    @o00.f
    public static final long m(long j11, long j12) {
        return i2.o(j11, j12);
    }

    @o00.f
    public static final long n0(long j11, long j12) {
        return i(j11 ^ j12);
    }

    @o00.f
    public static final long o(long j11, int i11) {
        return m1.a(j11, i(i11 & 4294967295L));
    }

    @o00.f
    public static final long p(long j11, short s11) {
        return m1.a(j11, i(s11 & j60.g.f63638t));
    }

    public static boolean q(long j11, Object obj) {
        return (obj instanceof w1) && j11 == ((w1) obj).m0();
    }

    public static final boolean r(long j11, long j12) {
        return j11 == j12;
    }

    @o00.f
    public static final long s(long j11, byte b11) {
        return m1.a(j11, i(b11 & 255));
    }

    @o00.f
    public static final long t(long j11, long j12) {
        return m1.a(j11, j12);
    }

    @o00.f
    public static final long u(long j11, int i11) {
        return m1.a(j11, i(i11 & 4294967295L));
    }

    @o00.f
    public static final long v(long j11, short s11) {
        return m1.a(j11, i(s11 & j60.g.f63638t));
    }

    public static int x(long j11) {
        return Long.hashCode(j11);
    }

    @o00.f
    public static final long y(long j11) {
        return i(j11 + 1);
    }

    @o00.f
    public static final long z(long j11) {
        return i(~j11);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(w1 w1Var) {
        return i2.n(m0(), w1Var.m0());
    }

    @o00.f
    public final int d(long j11) {
        return i2.n(m0(), j11);
    }

    public boolean equals(Object obj) {
        return q(this.f100458a, obj);
    }

    public int hashCode() {
        return x(this.f100458a);
    }

    public final /* synthetic */ long m0() {
        return this.f100458a;
    }

    @m80.k
    public String toString() {
        return h0(this.f100458a);
    }

    @v0
    public static /* synthetic */ void w() {
    }

    @o00.f
    public static final long f0(long j11) {
        return j11;
    }

    @v0
    @o00.g
    public static long i(long j11) {
        return j11;
    }

    @o00.f
    public static final long k0(long j11) {
        return j11;
    }
}
