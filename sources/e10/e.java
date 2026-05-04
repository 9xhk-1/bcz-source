package e10;

import g10.l;
import g10.o;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import kotlin.random.XorWowRandom;
import m80.k;
import org.junit.jupiter.api.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    @y0(version = "1.3")
    @k
    public static final Random a(int i11) {
        return new XorWowRandom(i11, i11 >> 31);
    }

    @y0(version = "1.3")
    @k
    public static final Random b(long j11) {
        return new XorWowRandom((int) j11, (int) (j11 >> 32));
    }

    @k
    public static final String c(@k Object from, @k Object until) {
        g0.p(from, "from");
        g0.p(until, "until");
        return "Random range is empty: [" + from + j2.O + until + ").";
    }

    public static final void d(double d11, double d12) {
        if (d12 <= d11) {
            throw new IllegalArgumentException(c(Double.valueOf(d11), Double.valueOf(d12)).toString());
        }
    }

    public static final void e(int i11, int i12) {
        if (i12 <= i11) {
            throw new IllegalArgumentException(c(Integer.valueOf(i11), Integer.valueOf(i12)).toString());
        }
    }

    public static final void f(long j11, long j12) {
        if (j12 <= j11) {
            throw new IllegalArgumentException(c(Long.valueOf(j11), Long.valueOf(j12)).toString());
        }
    }

    public static final int g(int i11) {
        return 31 - Integer.numberOfLeadingZeros(i11);
    }

    @y0(version = "1.3")
    public static final int h(@k Random random, @k l range) {
        g0.p(random, "<this>");
        g0.p(range, "range");
        if (!range.isEmpty()) {
            return range.f() < Integer.MAX_VALUE ? random.nextInt(range.d(), range.f() + 1) : range.d() > Integer.MIN_VALUE ? random.nextInt(range.d() - 1, range.f()) + 1 : random.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    @y0(version = "1.3")
    public static final long i(@k Random random, @k o range) {
        g0.p(random, "<this>");
        g0.p(range, "range");
        if (!range.isEmpty()) {
            return range.f() < Long.MAX_VALUE ? random.nextLong(range.d(), range.f() + 1) : range.d() > Long.MIN_VALUE ? random.nextLong(range.d() - 1, range.f()) + 1 : random.nextLong();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + range);
    }

    public static final int j(int i11, int i12) {
        return (i11 >>> (32 - i12)) & ((-i12) >> 31);
    }
}
