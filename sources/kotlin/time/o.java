package kotlin.time;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w30.h
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f67796h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f67797a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67798b;

    /* renamed from: c, reason: collision with root package name */
    public final int f67799c;

    /* renamed from: d, reason: collision with root package name */
    public final int f67800d;

    /* renamed from: e, reason: collision with root package name */
    public final int f67801e;

    /* renamed from: f, reason: collision with root package name */
    public final int f67802f;

    /* renamed from: g, reason: collision with root package name */
    public final int f67803g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final o a(@m80.k Instant instant) {
            long j11;
            long j12;
            g0.p(instant, "instant");
            long epochSeconds = instant.getEpochSeconds();
            long j13 = epochSeconds / 86400;
            if ((epochSeconds ^ 86400) < 0 && j13 * 86400 != epochSeconds) {
                j13--;
            }
            long j14 = epochSeconds % 86400;
            int i11 = (int) (j14 + (86400 & (((j14 ^ 86400) & ((-j14) | j14)) >> 63)));
            long j15 = (j13 + g.f67771f) - 60;
            if (j15 < 0) {
                j11 = -1;
                long j16 = g.f67770e;
                long j17 = ((j15 + 1) / j16) - 1;
                j12 = 400 * j17;
                j15 += (-j17) * j16;
            } else {
                j11 = -1;
                j12 = 0;
            }
            long j18 = 400;
            long j19 = ((j18 * j15) + 591) / g.f67770e;
            long j21 = 365;
            long j22 = 4;
            long j23 = 100;
            long j24 = j15 - ((((j21 * j19) + (j19 / j22)) - (j19 / j23)) + (j19 / j18));
            if (j24 < 0) {
                j19 += j11;
                j24 = j15 - ((((j21 * j19) + (j19 / j22)) - (j19 / j23)) + (j19 / j18));
            }
            int i12 = (int) j24;
            int i13 = ((i12 * 5) + 2) / 153;
            int i14 = i11 / 3600;
            int i15 = i11 - (i14 * 3600);
            int i16 = i15 / 60;
            return new o((int) (j19 + j12 + (i13 / 10)), ((i13 + 2) % 12) + 1, (i12 - (((i13 * 306) + 5) / 10)) + 1, i14, i16, i15 - (i16 * 60), instant.getNanosecondsOfSecond());
        }

        public a() {
        }
    }

    public o(int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f67797a = i11;
        this.f67798b = i12;
        this.f67799c = i13;
        this.f67800d = i14;
        this.f67801e = i15;
        this.f67802f = i16;
        this.f67803g = i17;
    }

    public final int a() {
        return this.f67799c;
    }

    public final int b() {
        return this.f67800d;
    }

    public final int c() {
        return this.f67801e;
    }

    public final int d() {
        return this.f67798b;
    }

    public final int e() {
        return this.f67803g;
    }

    public final int f() {
        return this.f67802f;
    }

    public final int g() {
        return this.f67797a;
    }

    public final <T> T h(int i11, @m80.k p<? super Long, ? super Integer, ? extends T> buildInstant) {
        g0.p(buildInstant, "buildInstant");
        long g11 = g();
        long j11 = 365 * g11;
        long d11 = (g11 >= 0 ? j11 + (((3 + g11) / 4) - ((99 + g11) / 100)) + ((g11 + 399) / 400) : j11 - (((g11 / (-4)) - (g11 / (-100))) + (g11 / (-400)))) + (((d() * 367) - 362) / 12) + (a() - 1);
        if (d() > 2) {
            d11 = !g.p(g()) ? d11 - 2 : (-1) + d11;
        }
        return buildInstant.invoke(Long.valueOf((((d11 - g.f67771f) * 86400) + (((b() * 3600) + (c() * 60)) + f())) - i11), Integer.valueOf(e()));
    }

    @m80.k
    public String toString() {
        return "UnboundLocalDateTime(" + this.f67797a + '-' + this.f67798b + '-' + this.f67799c + ' ' + this.f67800d + ':' + this.f67801e + ':' + this.f67802f + '.' + this.f67803g + ')';
    }
}
