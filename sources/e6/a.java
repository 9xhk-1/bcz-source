package e6;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    public static final long A = 100;
    public static final double B = 0.4d;

    /* renamed from: a, reason: collision with root package name */
    public static final int f49189a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f49190b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f49191c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final int f49192d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final int f49193e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final int f49194f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f49195g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final int f49196h = 7;

    /* renamed from: i, reason: collision with root package name */
    public static final int f49197i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final int f49198j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final int f49199k = 10;

    /* renamed from: l, reason: collision with root package name */
    public static final int f49200l = 11;

    /* renamed from: m, reason: collision with root package name */
    public static final int f49201m = 12;

    /* renamed from: n, reason: collision with root package name */
    public static final int f49202n = 13;

    /* renamed from: o, reason: collision with root package name */
    public static final int f49203o = 14;

    /* renamed from: p, reason: collision with root package name */
    public static final int f49204p = 15;

    /* renamed from: q, reason: collision with root package name */
    public static final int f49205q = 16;

    /* renamed from: r, reason: collision with root package name */
    public static final int f49206r = 17;

    /* renamed from: s, reason: collision with root package name */
    public static final int f49207s = 18;

    /* renamed from: t, reason: collision with root package name */
    public static final int f49208t = 19;

    /* renamed from: u, reason: collision with root package name */
    public static final int f49209u = 1001;

    /* renamed from: v, reason: collision with root package name */
    public static final int f49210v = 1002;

    /* renamed from: w, reason: collision with root package name */
    public static final int f49211w = 1003;

    /* renamed from: x, reason: collision with root package name */
    public static final int f49212x = 1004;

    /* renamed from: y, reason: collision with root package name */
    public static final int f49213y = 1005;

    /* renamed from: z, reason: collision with root package name */
    public static final int f49214z = 1006;

    public static final double A(@m80.k i data) {
        g0.p(data, "data");
        double d11 = !data.x() ? 0.0d : 1.0d;
        if (d11 <= 0.0d) {
            return d11;
        }
        if (data.B()) {
            d11 *= 0.5d;
        }
        return data.E() ? d11 * 0.8d : d11;
    }

    public static final double B(boolean z11, boolean z12) {
        if (z11) {
            return z12 ? 0.5d : 1.0d;
        }
        return 0.0d;
    }

    public static final double C(int i11, boolean z11) {
        if (!z11) {
            return 1.0d;
        }
        double d11 = i11 / 1000.0d;
        if (d11 <= 7.0d) {
            return 1.0d;
        }
        return d11 <= 15.0d ? 0.8d : 0.5d;
    }

    @m80.k
    public static final k D(@m80.k k kVar, @m80.k k point) {
        g0.p(kVar, "<this>");
        g0.p(point, "point");
        return new k(Math.max(kVar.v(), point.v()), Math.max(kVar.u(), point.u()), Math.max(kVar.p(), point.p()), Math.max(kVar.t(), point.t()), Math.max(kVar.s(), point.s()), Math.max(kVar.n(), point.n()), Math.max(kVar.m(), point.m()), Math.max(kVar.r(), point.r()), Math.max(kVar.q(), point.q()), Math.max(kVar.o(), point.o()));
    }

    @m80.k
    public static final k a(@m80.k b factor, double d11, double d12) {
        g0.p(factor, "factor");
        return new k(z(factor.v(), d11, d12), z(factor.u(), d11, d12), z(factor.p(), d11, d12), z(factor.t(), d11, d12), z(factor.s(), d11, d12), z(factor.n(), d11, d12), z(factor.m(), d11, d12), z(factor.r(), d11, d12), z(factor.q(), d11, d12), z(factor.o(), d11, d12));
    }

    @m80.k
    public static final k b(@m80.k i data) {
        g0.p(data, "data");
        double A2 = A(data);
        double s11 = s(data);
        double d11 = 100 * A2;
        return new k(0.0d, 1.0d * d11 * s11, d11 * 0.1d * s11, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1017, null);
    }

    @m80.k
    public static final k c(@m80.k i data) {
        g0.p(data, "data");
        double A2 = 100 * A(data);
        return new k(0.0d, 1.0d * A2 * 0.8d, A2 * 0.1d * 0.8d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1017, null);
    }

    @m80.k
    public static final k d(@m80.k i data) {
        g0.p(data, "data");
        double A2 = A(data);
        double s11 = s(data);
        double d11 = 100 * A2;
        double d12 = d11 * 0.1d * s11;
        return new k(d12, d12, 1.0d * d11 * s11, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1016, null);
    }

    @m80.k
    public static final k e(@m80.k i data) {
        g0.p(data, "data");
        double A2 = 100 * A(data);
        double d11 = 1;
        double d12 = A2 * 0.1d * d11;
        return new k(d12, d12, d12, 0.0d, 0.0d, 1.0d * A2 * d11, 0.0d, 0.0d, 0.0d, 0.0d, 984, null);
    }

    @m80.k
    public static final k f(@m80.k i data) {
        g0.p(data, "data");
        double A2 = A(data);
        double s11 = s(data);
        double d11 = 100 * A2;
        return new k(d11 * 0.1d * s11, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d * d11 * s11, 0.0d, 0.0d, 0.0d, 958, null);
    }

    @m80.k
    public static final k g(@m80.k i data) {
        g0.p(data, "data");
        double A2 = 100 * A(data);
        double d11 = A2 * 0.1d * 0.8d;
        return new k(d11, d11, d11, 0.0d, 0.0d, 1.0d * A2 * 0.8d, 0.0d, 0.0d, 0.0d, 0.0d, 984, null);
    }

    @m80.k
    public static final k h(@m80.k i data) {
        g0.p(data, "data");
        double A2 = A(data);
        double s11 = s(data);
        double d11 = 100 * A2;
        double d12 = d11 * 0.1d * s11;
        return new k(1.0d * d11 * s11, d12, d12, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1016, null);
    }

    @m80.k
    public static final k i(@m80.k i data) {
        g0.p(data, "data");
        double A2 = A(data);
        double s11 = s(data);
        double d11 = 100 * A2;
        double d12 = d11 * 0.1d * s11;
        return new k(d12, d12, 0.5d * d11 * s11, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1016, null);
    }

    @m80.k
    public static final k j(@m80.k i data) {
        g0.p(data, "data");
        double A2 = A(data);
        double s11 = s(data);
        double d11 = 100 * A2;
        double d12 = d11 * 0.1d * s11;
        return new k(d12, d12, 1.0d * d11 * s11, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1016, null);
    }

    @m80.k
    public static final k k(@m80.k i data) {
        g0.p(data, "data");
        double A2 = A(data);
        double s11 = s(data);
        double d11 = 100 * A2;
        double d12 = d11 * 0.1d * s11;
        return new k(d12, d12, d12, 0.0d, 0.0d, 1.0d * d11 * s11, 0.0d, 0.0d, 0.0d, 0.0d, 984, null);
    }

    @m80.k
    public static final k l() {
        return new k(10.0d, 0.0d, 10.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1018, null);
    }

    @m80.k
    public static final k m(double d11, double d12) {
        if (d11 == 0.0d) {
            return new k(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1023, null);
        }
        double d13 = 100 * d11;
        double d14 = d13 * 0.1d * d12 * 1.0d;
        return new k(d14, d14, d13 * 1.0d * d12 * 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1016, null);
    }

    @m80.k
    public static final k n() {
        return new k(10.0d, 0.0d, 10.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1018, null);
    }

    public static final double o(double d11, long j11, double d12, long j12, boolean z11) {
        double min;
        double max;
        double d13 = 0.6d;
        if (j12 != 0) {
            if (z11) {
                double d14 = (-j12) / j11;
                min = d11 * Math.min(Math.pow(2.0d, d14), 0.6d);
                max = d12 * Math.max(1 - Math.pow(2.0d, d14), 0.4d);
                return min + max;
            }
            d11 *= 0.6d;
            d13 = 1 - (Math.pow(2.0d, (-j12) / j11) * 0.2d);
        }
        min = d11 * d13;
        max = d12 * 0.4d;
        return min + max;
    }

    public static final double p(double d11) {
        return d11 * 0.4d;
    }

    public static final double q(double d11, double d12) {
        return Math.min(100.0d, d11 + d12);
    }

    public static final double r(double d11, double d12) {
        return d11 >= 0.0d ? (d11 * 0.3d) + (d12 * 0.7d) : d12;
    }

    public static final double s(@m80.k i data) {
        g0.p(data, "data");
        double d11 = data.w() ? 0.8d : 1.0d;
        return data.v() == 1 ? d11 * 0.8d : d11;
    }

    public static final double t(double d11, long j11, double d12, long j12, boolean z11) {
        return d12 < 0.0d ? d11 : d11 < 0.0d ? p(d12) : o(d11, j11, d12, w3.g.b(j12), z11);
    }

    public static final long u(long j11, long j12) {
        double d11 = j11;
        return (long) Math.ceil(d11 * (1 - Math.pow(2.0d, (-1) - ((j12 * 1.0d) / d11))));
    }

    public static final long v(long j11, long j12) {
        double d11 = j11;
        return (long) Math.ceil(d11 * (1 - (Math.pow(2.0d, (j12 * (-1.0d)) / d11) * 0.5d)));
    }

    public static final long w(long j11, long j12) {
        double d11 = j11;
        return (long) Math.ceil(d11 * Math.min(Math.pow(2.0d, (j12 * 1.0d) / d11) * 1.6d, 5.0d));
    }

    public static final long x(long j11, long j12) {
        double d11 = j11;
        return (long) Math.ceil(d11 * Math.min(Math.pow(2.0d, (j12 * 1.0d) / d11) * 1.8d, 5.0d));
    }

    public static final double y(double d11, double d12) {
        return d12 < 0.0d ? d11 : d11 < 0.0d ? p(d12) : q(d11, d12);
    }

    public static final double z(double d11, double d12, double d13) {
        if (d11 >= 0.0d) {
            return 100 * d11 * d12 * d13;
        }
        return -1.0d;
    }
}
