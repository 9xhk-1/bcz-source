package r40;

import kotlin.time.DurationUnit;
import kotlin.time.Instant;
import kotlin.time.d;
import kotlin.time.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w30.h
/* loaded from: classes8.dex */
public final class b0 implements kotlin.time.d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Instant f83059a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final w30.b f83060b;

    public b0(@m80.k Instant instant, @m80.k w30.b clock) {
        kotlin.jvm.internal.g0.p(instant, "instant");
        kotlin.jvm.internal.g0.p(clock, "clock");
        this.f83059a = instant;
        this.f83060b = clock;
    }

    @Override // kotlin.time.m
    public long a() {
        return g(this.f83060b.a(), this.f83059a);
    }

    @Override // kotlin.time.m
    public boolean b() {
        return d.a.b(this);
    }

    @Override // java.lang.Comparable
    /* renamed from: b0 */
    public int compareTo(@m80.k kotlin.time.d dVar) {
        return d.a.a(this, dVar);
    }

    @Override // kotlin.time.m
    public boolean c() {
        return d.a.c(this);
    }

    public final boolean d(Instant instant) {
        e.a aVar = kotlin.time.e.f67757b;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        return kotlin.jvm.internal.g0.g(instant.m6321plusLRDsOJo(kotlin.time.f.w(1, durationUnit)), instant) || kotlin.jvm.internal.g0.g(instant.m6321plusLRDsOJo(kotlin.time.f.w(-1, durationUnit)), instant);
    }

    @Override // kotlin.time.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public long n(@m80.k kotlin.time.d other) {
        kotlin.jvm.internal.g0.p(other, "other");
        if (other instanceof b0) {
            b0 b0Var = (b0) other;
            if (kotlin.jvm.internal.g0.g(b0Var.f83060b, this.f83060b)) {
                return g(this.f83059a, b0Var.f83059a);
            }
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
    }

    @Override // kotlin.time.d
    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.g0.g(this.f83060b, b0Var.f83060b) && kotlin.jvm.internal.g0.g(this.f83059a, b0Var.f83059a);
    }

    public final Instant f(Instant instant, long j11) {
        if (!d(instant)) {
            return instant.m6321plusLRDsOJo(j11);
        }
        if (kotlin.time.e.O(j11)) {
            if (kotlin.time.e.R(j11) != (instant.compareTo(Instant.Companion.e()) >= 0)) {
                throw new IllegalArgumentException("Summing infinities of different signs");
            }
        }
        return instant;
    }

    public final long g(Instant instant, Instant instant2) {
        return kotlin.jvm.internal.g0.g(instant, instant2) ? kotlin.time.e.f67757b.T() : (d(instant) || d(instant2)) ? kotlin.time.e.U(instant.m6320minusUwyO8pc(instant2), Double.POSITIVE_INFINITY) : instant.m6320minusUwyO8pc(instant2);
    }

    @Override // kotlin.time.d
    public int hashCode() {
        return this.f83059a.hashCode();
    }

    @m80.k
    public String toString() {
        return "InstantTimeMark(" + this.f83059a + org.junit.jupiter.api.j2.O + this.f83060b + ')';
    }

    @Override // kotlin.time.m
    @m80.k
    public kotlin.time.d h(long j11) {
        return new b0(f(this.f83059a, j11), this.f83060b);
    }

    @Override // kotlin.time.m
    @m80.k
    public kotlin.time.d j(long j11) {
        return new b0(f(this.f83059a, kotlin.time.e.j0(j11)), this.f83060b);
    }
}
