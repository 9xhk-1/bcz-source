package kotlin.time;

import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import kotlin.time.d;
import kotlin.time.n;
import org.junit.jupiter.api.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@w30.h
@yz.n(level = DeprecationLevel.ERROR, message = "Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
/* loaded from: classes8.dex */
public abstract class a implements n.c {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final DurationUnit f67746b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: kotlin.time.a$a, reason: collision with other inner class name */
    public static final class C0803a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final double f67747a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final a f67748b;

        /* renamed from: c, reason: collision with root package name */
        public final long f67749c;

        public /* synthetic */ C0803a(double d11, a aVar, long j11, v vVar) {
            this(d11, aVar, j11);
        }

        @Override // kotlin.time.m
        public long a() {
            return e.S(f.v(this.f67748b.c() - this.f67747a, this.f67748b.b()), this.f67749c);
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
            return (obj instanceof C0803a) && g0.g(this.f67748b, ((C0803a) obj).f67748b) && e.q(n((d) obj), e.f67757b.T());
        }

        @Override // kotlin.time.d
        public int hashCode() {
            return e.K(e.T(f.v(this.f67747a, this.f67748b.b()), this.f67749c));
        }

        @Override // kotlin.time.m
        @m80.k
        public /* bridge */ d j(long j11) {
            return d.a.d(this, j11);
        }

        @Override // kotlin.time.d
        public long n(@m80.k d other) {
            g0.p(other, "other");
            if (other instanceof C0803a) {
                C0803a c0803a = (C0803a) other;
                if (g0.g(this.f67748b, c0803a.f67748b)) {
                    if (e.q(this.f67749c, c0803a.f67749c) && e.O(this.f67749c)) {
                        return e.f67757b.T();
                    }
                    long S = e.S(this.f67749c, c0803a.f67749c);
                    long v11 = f.v(this.f67747a - c0803a.f67747a, this.f67748b.b());
                    return e.q(v11, e.j0(S)) ? e.f67757b.T() : e.T(v11, S);
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @m80.k
        public String toString() {
            return "DoubleTimeMark(" + this.f67747a + w30.g.h(this.f67748b.b()) + " + " + ((Object) e.f0(this.f67749c)) + j2.O + this.f67748b + ')';
        }

        public C0803a(double d11, a timeSource, long j11) {
            g0.p(timeSource, "timeSource");
            this.f67747a = d11;
            this.f67748b = timeSource;
            this.f67749c = j11;
        }

        @Override // kotlin.time.m
        @m80.k
        public d h(long j11) {
            return new C0803a(this.f67747a, this.f67748b, e.T(this.f67749c, j11), null);
        }
    }

    public a(@m80.k DurationUnit unit) {
        g0.p(unit, "unit");
        this.f67746b = unit;
    }

    @m80.k
    public final DurationUnit b() {
        return this.f67746b;
    }

    public abstract double c();

    @Override // kotlin.time.n
    @m80.k
    public d a() {
        return new C0803a(c(), this, e.f67757b.T(), null);
    }
}
