package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.5")
@w00.h
/* loaded from: classes8.dex */
public final class s1 implements Comparable<s1> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f100444b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f100445c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static final int f100446d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f100447e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f100448f = 32;

    /* renamed from: a, reason: collision with root package name */
    public final int f100449a;

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
    public /* synthetic */ s1(int i11) {
        this.f100449a = i11;
    }

    @o00.f
    public static final int A(int i11, byte b11) {
        return i(i11 - i(b11 & 255));
    }

    @o00.f
    public static final long B(int i11, long j11) {
        return w1.i(w1.i(i11 & 4294967295L) - j11);
    }

    @o00.f
    public static final int C(int i11, int i12) {
        return i(i11 - i12);
    }

    @o00.f
    public static final int D(int i11, short s11) {
        return i(i11 - i(s11 & c2.f100412d));
    }

    @o00.f
    public static final byte E(int i11, byte b11) {
        return o1.i((byte) k1.a(i11, i(b11 & 255)));
    }

    @o00.f
    public static final long F(int i11, long j11) {
        return l1.a(w1.i(i11 & 4294967295L), j11);
    }

    @o00.f
    public static final int G(int i11, int i12) {
        return k1.a(i11, i12);
    }

    @o00.f
    public static final short H(int i11, short s11) {
        return c2.i((short) k1.a(i11, i(s11 & c2.f100412d)));
    }

    @o00.f
    public static final int I(int i11, int i12) {
        return i(i11 | i12);
    }

    @o00.f
    public static final int J(int i11, byte b11) {
        return i(i11 + i(b11 & 255));
    }

    @o00.f
    public static final long K(int i11, long j11) {
        return w1.i(w1.i(i11 & 4294967295L) + j11);
    }

    @o00.f
    public static final int L(int i11, int i12) {
        return i(i11 + i12);
    }

    @o00.f
    public static final int M(int i11, short s11) {
        return i(i11 + i(s11 & c2.f100412d));
    }

    @o00.f
    public static final g10.x N(int i11, int i12) {
        return new g10.x(i11, i12, null);
    }

    @y0(version = "1.9")
    @o00.f
    @j2(markerClass = {kotlin.c.class})
    public static final g10.x O(int i11, int i12) {
        return g10.c0.V(i11, i12);
    }

    @o00.f
    public static final int P(int i11, byte b11) {
        return k1.a(i11, i(b11 & 255));
    }

    @o00.f
    public static final long R(int i11, long j11) {
        return l1.a(w1.i(i11 & 4294967295L), j11);
    }

    @o00.f
    public static final int S(int i11, int i12) {
        return i2.g(i11, i12);
    }

    @o00.f
    public static final int T(int i11, short s11) {
        return k1.a(i11, i(s11 & c2.f100412d));
    }

    @o00.f
    public static final int U(int i11, int i12) {
        return i(i11 << i12);
    }

    @o00.f
    public static final int V(int i11, int i12) {
        return i(i11 >>> i12);
    }

    @o00.f
    public static final int W(int i11, byte b11) {
        return i(i11 * i(b11 & 255));
    }

    @o00.f
    public static final long X(int i11, long j11) {
        return w1.i(w1.i(i11 & 4294967295L) * j11);
    }

    @o00.f
    public static final int Y(int i11, int i12) {
        return i(i11 * i12);
    }

    @o00.f
    public static final int Z(int i11, short s11) {
        return i(i11 * i(s11 & c2.f100412d));
    }

    @o00.f
    public static final int a(int i11, int i12) {
        return i(i11 & i12);
    }

    @o00.f
    public static final byte a0(int i11) {
        return (byte) i11;
    }

    public static final /* synthetic */ s1 b(int i11) {
        return new s1(i11);
    }

    @o00.f
    public static final int c(int i11, byte b11) {
        int compare;
        compare = Integer.compare(i11 ^ Integer.MIN_VALUE, i(b11 & 255) ^ Integer.MIN_VALUE);
        return compare;
    }

    @o00.f
    public static final double c0(int i11) {
        return i2.h(i11);
    }

    @o00.f
    public static final int d(int i11, long j11) {
        int compare;
        compare = Long.compare(w1.i(i11 & 4294967295L) ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
        return compare;
    }

    @o00.f
    public static final float d0(int i11) {
        return (float) i2.h(i11);
    }

    @o00.f
    public static int f(int i11, int i12) {
        return i2.e(i11, i12);
    }

    @o00.f
    public static final long f0(int i11) {
        return i11 & 4294967295L;
    }

    @o00.f
    public static final int g(int i11, short s11) {
        int compare;
        compare = Integer.compare(i11 ^ Integer.MIN_VALUE, i(s11 & c2.f100412d) ^ Integer.MIN_VALUE);
        return compare;
    }

    @o00.f
    public static final short g0(int i11) {
        return (short) i11;
    }

    @m80.k
    public static String h0(int i11) {
        return String.valueOf(i11 & 4294967295L);
    }

    @o00.f
    public static final byte i0(int i11) {
        return o1.i((byte) i11);
    }

    @o00.f
    public static final int k(int i11) {
        return i(i11 - 1);
    }

    @o00.f
    public static final long k0(int i11) {
        return w1.i(i11 & 4294967295L);
    }

    @o00.f
    public static final int l(int i11, byte b11) {
        return j1.a(i11, i(b11 & 255));
    }

    @o00.f
    public static final short l0(int i11) {
        return c2.i((short) i11);
    }

    @o00.f
    public static final long m(int i11, long j11) {
        return m1.a(w1.i(i11 & 4294967295L), j11);
    }

    @o00.f
    public static final int n0(int i11, int i12) {
        return i(i11 ^ i12);
    }

    @o00.f
    public static final int o(int i11, int i12) {
        return i2.f(i11, i12);
    }

    @o00.f
    public static final int p(int i11, short s11) {
        return j1.a(i11, i(s11 & c2.f100412d));
    }

    public static boolean q(int i11, Object obj) {
        return (obj instanceof s1) && i11 == ((s1) obj).m0();
    }

    public static final boolean r(int i11, int i12) {
        return i11 == i12;
    }

    @o00.f
    public static final int s(int i11, byte b11) {
        return j1.a(i11, i(b11 & 255));
    }

    @o00.f
    public static final long t(int i11, long j11) {
        return m1.a(w1.i(i11 & 4294967295L), j11);
    }

    @o00.f
    public static final int u(int i11, int i12) {
        return j1.a(i11, i12);
    }

    @o00.f
    public static final int v(int i11, short s11) {
        return j1.a(i11, i(s11 & c2.f100412d));
    }

    public static int x(int i11) {
        return Integer.hashCode(i11);
    }

    @o00.f
    public static final int y(int i11) {
        return i(i11 + 1);
    }

    @o00.f
    public static final int z(int i11) {
        return i(~i11);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(s1 s1Var) {
        return i2.e(m0(), s1Var.m0());
    }

    @o00.f
    public final int e(int i11) {
        return i2.e(m0(), i11);
    }

    public boolean equals(Object obj) {
        return q(this.f100449a, obj);
    }

    public int hashCode() {
        return x(this.f100449a);
    }

    public final /* synthetic */ int m0() {
        return this.f100449a;
    }

    @m80.k
    public String toString() {
        return h0(this.f100449a);
    }

    @v0
    public static /* synthetic */ void w() {
    }

    @o00.f
    public static final int e0(int i11) {
        return i11;
    }

    @v0
    @o00.g
    public static int i(int i11) {
        return i11;
    }

    @o00.f
    public static final int j0(int i11) {
        return i11;
    }
}
