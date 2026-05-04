package kotlin.time;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
/* loaded from: classes8.dex */
public final class j {
    public static final long a(long j11, long j12, long j13) {
        if (!e.O(j12) || (j11 ^ j13) >= 0) {
            return j11;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    public static final long b(long j11) {
        return j11 < 0 ? e.f67757b.G() : e.f67757b.n();
    }

    public static final boolean c(long j11) {
        return ((j11 - 1) | 1) == Long.MAX_VALUE;
    }

    public static final long d(long j11, @m80.k DurationUnit unit, long j12) {
        g0.p(unit, "unit");
        long e02 = e.e0(j12, unit);
        if (((j11 - 1) | 1) == Long.MAX_VALUE) {
            return a(j11, j12, e02);
        }
        if (((e02 - 1) | 1) == Long.MAX_VALUE) {
            return e(j11, unit, j12);
        }
        long j13 = j11 + e02;
        return ((j11 ^ j13) & (e02 ^ j13)) < 0 ? j11 < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j13;
    }

    public static final long e(long j11, DurationUnit durationUnit, long j12) {
        long o11 = e.o(j12, 2);
        long e02 = e.e0(o11, durationUnit);
        return (1 | (e02 - 1)) == Long.MAX_VALUE ? e02 : d(d(j11, durationUnit, o11), durationUnit, e.S(j12, o11));
    }

    public static final long f(long j11, long j12, @m80.k DurationUnit unit) {
        g0.p(unit, "unit");
        return (1 | (j12 - 1)) == Long.MAX_VALUE ? e.j0(b(j12)) : g(j11, j12, unit);
    }

    public static final long g(long j11, long j12, DurationUnit durationUnit) {
        long j13 = j11 - j12;
        if (((j13 ^ j11) & (~(j13 ^ j12))) >= 0) {
            return f.x(j13, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return e.j0(b(j13));
        }
        long b11 = w30.f.b(1L, durationUnit2, durationUnit);
        long j14 = (j11 / b11) - (j12 / b11);
        long j15 = (j11 % b11) - (j12 % b11);
        e.a aVar = e.f67757b;
        return e.T(f.x(j14, durationUnit2), f.x(j15, durationUnit));
    }

    public static final long h(long j11, long j12, @m80.k DurationUnit unit) {
        g0.p(unit, "unit");
        return ((j12 - 1) | 1) == Long.MAX_VALUE ? j11 == j12 ? e.f67757b.T() : e.j0(b(j12)) : (1 | (j11 - 1)) == Long.MAX_VALUE ? b(j11) : g(j11, j12, unit);
    }
}
