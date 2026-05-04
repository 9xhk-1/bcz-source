package kotlin.time;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.time.d;
import kotlin.time.n;
import yz.c0;
import yz.e0;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.9")
@j2(markerClass = {w30.h.class})
/* loaded from: classes8.dex */
public abstract class b implements n.c {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final DurationUnit f67750b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f67751c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTimeSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n+ 2 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,210:1\n80#2:211\n*S KotlinDebug\n*F\n+ 1 TimeSources.kt\nkotlin/time/AbstractLongTimeSource$LongTimeMark\n*L\n67#1:211\n*E\n"})
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final long f67752a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final b f67753b;

        /* renamed from: c, reason: collision with root package name */
        public final long f67754c;

        public /* synthetic */ a(long j11, b bVar, long j12, v vVar) {
            this(j11, bVar, j12);
        }

        @Override // kotlin.time.m
        public long a() {
            return e.S(j.h(this.f67753b.d(), this.f67752a, this.f67753b.e()), this.f67754c);
        }

        @Override // kotlin.time.m
        public /* bridge */ boolean b() {
            return d.a.b(this);
        }

        @Override // java.lang.Comparable
        /* renamed from: b0 */
        public /* bridge */ int compareTo(@m80.k d dVar) {
            return d.a.a(this, dVar);
        }

        @Override // kotlin.time.m
        public /* bridge */ boolean c() {
            return d.a.c(this);
        }

        @Override // kotlin.time.d
        public boolean equals(@m80.l Object obj) {
            return (obj instanceof a) && g0.g(this.f67753b, ((a) obj).f67753b) && e.q(n((d) obj), e.f67757b.T());
        }

        @Override // kotlin.time.d
        public int hashCode() {
            return (e.K(this.f67754c) * 37) + Long.hashCode(this.f67752a);
        }

        @Override // kotlin.time.m
        @m80.k
        public /* bridge */ d j(long j11) {
            return d.a.d(this, j11);
        }

        @Override // kotlin.time.d
        public long n(@m80.k d other) {
            g0.p(other, "other");
            if (other instanceof a) {
                a aVar = (a) other;
                if (g0.g(this.f67753b, aVar.f67753b)) {
                    return e.T(j.h(this.f67752a, aVar.f67752a, this.f67753b.e()), e.S(this.f67754c, aVar.f67754c));
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @m80.k
        public String toString() {
            return "LongTimeMark(" + this.f67752a + w30.g.h(this.f67753b.e()) + " + " + ((Object) e.f0(this.f67754c)) + org.junit.jupiter.api.j2.O + this.f67753b + ')';
        }

        public a(long j11, b timeSource, long j12) {
            g0.p(timeSource, "timeSource");
            this.f67752a = j11;
            this.f67753b = timeSource;
            this.f67754c = j12;
        }

        @Override // kotlin.time.m
        @m80.k
        public d h(long j11) {
            DurationUnit e11 = this.f67753b.e();
            if (e.O(j11)) {
                return new a(j.d(this.f67752a, e11, j11), this.f67753b, e.f67757b.T(), null);
            }
            long i02 = e.i0(j11, e11);
            long T = e.T(e.S(j11, i02), this.f67754c);
            long d11 = j.d(this.f67752a, e11, i02);
            long i03 = e.i0(T, e11);
            long d12 = j.d(d11, e11, i03);
            long S = e.S(T, i03);
            long z11 = e.z(S);
            if (d12 != 0 && z11 != 0 && (d12 ^ z11) < 0) {
                long w11 = f.w(c10.d.V(z11), e11);
                d12 = j.d(d12, e11, w11);
                S = e.S(S, w11);
            }
            if ((1 | (d12 - 1)) == Long.MAX_VALUE) {
                S = e.f67757b.T();
            }
            return new a(d12, this.f67753b, S, null);
        }
    }

    public b(@m80.k DurationUnit unit) {
        g0.p(unit, "unit");
        this.f67750b = unit;
        this.f67751c = e0.c(new x00.a() { // from class: w30.a
            @Override // x00.a
            public final Object invoke() {
                long h11;
                h11 = kotlin.time.b.h(kotlin.time.b.this);
                return Long.valueOf(h11);
            }
        });
    }

    public static final long h(b bVar) {
        return bVar.g();
    }

    public final long d() {
        return g() - f();
    }

    @m80.k
    public final DurationUnit e() {
        return this.f67750b;
    }

    public final long f() {
        return ((Number) this.f67751c.getValue()).longValue();
    }

    public abstract long g();

    @Override // kotlin.time.n
    @m80.k
    public d a() {
        return new a(d(), this, e.f67757b.T(), null);
    }
}
