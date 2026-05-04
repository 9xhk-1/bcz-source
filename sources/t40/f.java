package t40;

import androidx.collection.SieveCacheKt;
import com.huawei.hms.framework.common.ExceptionCode;
import g10.m;
import g10.o;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 math.kt\nkotlinx/datetime/internal/MathKt\n*L\n1#1,288:1\n155#1:289\n157#1:290\n155#1:291\n157#1:292\n155#1:293\n155#1,3:294\n155#1:297\n157#1:298\n155#1,3:299\n155#1:302\n157#1:303\n155#1:304\n160#1:305\n160#1:306\n*S KotlinDebug\n*F\n+ 1 math.kt\nkotlinx/datetime/internal/MathKt\n*L\n88#1:289\n89#1:290\n90#1:291\n91#1:292\n102#1:293\n103#1:294,3\n104#1:297\n105#1:298\n105#1:299,3\n106#1:302\n109#1:303\n109#1:304\n115#1:305\n133#1:306\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final int[] f89500a = {1, 10, 100, 1000, 10000, 100000, 1000000, ExceptionCode.CRASH_EXCEPTION, 100000000, 1000000000};

    public static final int a(long j11) {
        if (j11 > SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        if (j11 < SieveCacheKt.NodeMetaAndPreviousMask) {
            return Integer.MIN_VALUE;
        }
        return (int) j11;
    }

    public static final boolean b(@k m mVar, long j11) {
        g0.p(mVar, "<this>");
        o oVar = mVar.g() > 0 ? new o(mVar.d(), mVar.f()) : new o(mVar.f(), mVar.d());
        return j11 <= oVar.f() && oVar.d() <= j11 && (j11 - mVar.d()) % mVar.g() == 0;
    }

    @k
    public static final int[] c() {
        return f89500a;
    }

    public static final int d(@k m mVar) {
        g0.p(mVar, "<this>");
        if (mVar.isEmpty()) {
            return 0;
        }
        try {
            return a((e.b(mVar.f(), -mVar.d()) / mVar.g()) + 1);
        } catch (ArithmeticException unused) {
            return Integer.MAX_VALUE;
        }
    }

    public static final long e(long j11) {
        return (j11 >> 32) & 4294967295L;
    }

    public static final long f(long j11, int i11) {
        return (j11 >> i11) & 1;
    }

    public static final long g(long j11) {
        return j11 & 4294967295L;
    }

    public static final long h(long j11, long j12, long j13, long j14) {
        if (j11 > 0 && j13 < 0) {
            j11--;
            j13 += j12;
        } else if (j11 < 0 && j13 > 0) {
            j11++;
            j13 -= j12;
        }
        long j15 = j11;
        if (j15 == 0) {
            return j13 / j14;
        }
        d j16 = j(j15, j12, j14);
        return e.b(j16.a(), e.b(j13 / j14, e.b(j13 % j14, j16.b()) / j14));
    }

    public static final long i(long j11, long j12, long j13) {
        if (j11 > 0 && j13 < 0) {
            j11--;
            j13 += j12;
        } else if (j11 < 0 && j13 > 0) {
            j11++;
            j13 -= j12;
        }
        return e.b(e.d(j11, j12), j13);
    }

    @k
    public static final d j(long j11, long j12, long j13) {
        if (j11 == 0 || j12 == 0) {
            return new d(0L, 0L);
        }
        long p11 = p(j11, j12);
        if (p11 != 0) {
            return new d(p11 / j13, p11 % j13);
        }
        if (j12 == j13) {
            return new d(j11, 0L);
        }
        if (j11 == j13) {
            return new d(j12, 0L);
        }
        long j14 = j11 >= 0 ? 0L : -1L;
        long j15 = j12 >= 0 ? 0L : -1L;
        long j16 = j11 & 4294967295L;
        long j17 = (j11 >> 32) & 4294967295L;
        long j18 = j12 & 4294967295L;
        long j19 = (j12 >> 32) & 4294967295L;
        long j21 = (j14 * j19) + (j17 * j15);
        long j22 = (j14 * j18) + (j17 * j19) + (j15 * j16);
        long j23 = j17 * j18;
        long j24 = j19 * j16;
        long j25 = j16 * j18;
        long j26 = j25 & 4294967295L;
        long j27 = (j23 & 4294967295L) + (j24 & 4294967295L) + ((j25 >> 32) & 4294967295L);
        long j28 = j27 & 4294967295L;
        long j29 = ((j27 >> 32) & 4294967295L) + (j22 & 4294967295L) + ((j23 >> 32) & 4294967295L) + ((j24 >> 32) & 4294967295L);
        long j31 = (j28 << 32) | j26;
        long j32 = (j29 & 4294967295L) | (((((j29 >> 32) & 4294967295L) + ((j22 >> 32) & 4294967295L)) + (j21 & 4294967295L)) << 32);
        int i11 = ((j32 >> 63) & 1) == 1 ? -1 : 1;
        if (i11 == -1) {
            j31 = (~j31) + 1;
            j32 = ~j32;
            if (j31 == 0) {
                j32++;
            }
        }
        int i12 = 127;
        long j33 = 0;
        long j34 = 0;
        while (-1 < i12) {
            j34 = (j34 << 1) | ((i12 < 64 ? j31 >> i12 : j32 >> (i12 - 64)) & 1);
            if (j34 >= j13 || j34 < 0) {
                j34 -= j13;
                if (i12 >= 63) {
                    throw new ArithmeticException("The result of a multiplication followed by division overflows a long");
                }
                j33 |= 1 << i12;
            }
            i12--;
        }
        long j35 = i11;
        return new d(j33 * j35, j35 * j34);
    }

    public static final long k(@k m mVar, @k Random random) {
        g0.p(mVar, "<this>");
        g0.p(random, "random");
        return (e10.e.i(random, new o(0L, (mVar.f() - mVar.d()) / mVar.g())) * mVar.g()) + mVar.d();
    }

    public static /* synthetic */ long l(m mVar, Random random, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            random = Random.Default;
        }
        return k(mVar, random);
    }

    @l
    public static final Long m(@k m mVar, @k Random random) {
        g0.p(mVar, "<this>");
        g0.p(random, "random");
        if (mVar.isEmpty()) {
            return null;
        }
        return Long.valueOf(k(mVar, random));
    }

    public static /* synthetic */ Long n(m mVar, Random random, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            random = Random.Default;
        }
        return m(mVar, random);
    }

    public static final long o(long j11, long j12) {
        if (j12 == -1) {
            if (j11 == Long.MIN_VALUE) {
                return Long.MAX_VALUE;
            }
            return -j11;
        }
        if (j12 == 1) {
            return j11;
        }
        long j13 = j11 * j12;
        if (j13 / j12 != j11) {
            return ((j11 > 0L ? 1 : (j11 == 0L ? 0 : -1)) > 0) == (j12 > 0) ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
        return j13;
    }

    public static final long p(long j11, long j12) {
        if (j12 == -1) {
            if (j11 == Long.MIN_VALUE) {
                return 0L;
            }
            return -j11;
        }
        if (j12 == 1) {
            return j11;
        }
        long j13 = j11 * j12;
        if (j13 / j12 != j11) {
            return 0L;
        }
        return j13;
    }
}
