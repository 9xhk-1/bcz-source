package e10;

import g10.a0;
import g10.x;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import m80.k;
import yz.p1;
import yz.s1;
import yz.w1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* loaded from: classes8.dex */
public final class f {
    public static final void a(int i11, int i12) {
        int compare;
        compare = Integer.compare(i12 ^ Integer.MIN_VALUE, i11 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            throw new IllegalArgumentException(e.c(s1.b(i11), s1.b(i12)).toString());
        }
    }

    public static final void b(long j11, long j12) {
        int compare;
        compare = Long.compare(j12 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            throw new IllegalArgumentException(e.c(w1.b(j11), w1.b(j12)).toString());
        }
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final byte[] c(@k Random random, int i11) {
        g0.p(random, "<this>");
        return p1.f(random.nextBytes(i11));
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final byte[] d(@k Random nextUBytes, @k byte[] bArr) {
        g0.p(nextUBytes, "$this$nextUBytes");
        g0.p(bArr, "$v$c$kotlin-UByteArray$-array$0");
        nextUBytes.nextBytes(bArr);
        return bArr;
    }

    @y0(version = "1.3")
    @kotlin.d
    @k
    public static final byte[] e(@k Random nextUBytes, @k byte[] bArr, int i11, int i12) {
        g0.p(nextUBytes, "$this$nextUBytes");
        g0.p(bArr, "$v$c$kotlin-UByteArray$-array$0");
        nextUBytes.nextBytes(bArr, i11, i12);
        return bArr;
    }

    public static /* synthetic */ byte[] f(Random random, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = p1.o(bArr);
        }
        return e(random, bArr, i11, i12);
    }

    @y0(version = "1.5")
    public static final int g(@k Random random) {
        g0.p(random, "<this>");
        return s1.i(random.nextInt());
    }

    @y0(version = "1.5")
    public static final int h(@k Random random, @k x range) {
        int compare;
        int compare2;
        g0.p(random, "<this>");
        g0.p(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        compare = Integer.compare(range.f() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE);
        if (compare < 0) {
            return i(random, range.d(), s1.i(range.f() + 1));
        }
        compare2 = Integer.compare(range.d() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        return compare2 > 0 ? s1.i(i(random, s1.i(range.d() - 1), range.f()) + 1) : g(random);
    }

    @y0(version = "1.5")
    public static final int i(@k Random nextUInt, int i11, int i12) {
        g0.p(nextUInt, "$this$nextUInt");
        a(i11, i12);
        return s1.i(nextUInt.nextInt(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @y0(version = "1.5")
    public static final int j(@k Random nextUInt, int i11) {
        g0.p(nextUInt, "$this$nextUInt");
        return i(nextUInt, 0, i11);
    }

    @y0(version = "1.5")
    public static final long k(@k Random random) {
        g0.p(random, "<this>");
        return w1.i(random.nextLong());
    }

    @y0(version = "1.5")
    public static final long l(@k Random random, @k a0 range) {
        int compare;
        int compare2;
        g0.p(random, "<this>");
        g0.p(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        compare = Long.compare(range.f() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE);
        if (compare < 0) {
            return n(random, range.d(), w1.i(range.f() + w1.i(1 & 4294967295L)));
        }
        compare2 = Long.compare(range.d() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        if (compare2 <= 0) {
            return k(random);
        }
        long j11 = 1 & 4294967295L;
        return w1.i(n(random, w1.i(range.d() - w1.i(j11)), range.f()) + w1.i(j11));
    }

    @y0(version = "1.5")
    public static final long m(@k Random nextULong, long j11) {
        g0.p(nextULong, "$this$nextULong");
        return n(nextULong, 0L, j11);
    }

    @y0(version = "1.5")
    public static final long n(@k Random nextULong, long j11, long j12) {
        g0.p(nextULong, "$this$nextULong");
        b(j11, j12);
        return w1.i(nextULong.nextLong(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }
}
