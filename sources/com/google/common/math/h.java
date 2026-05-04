package com.google.common.math;

import androidx.media3.common.C;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.google.common.base.Preconditions;
import com.jiongji.andriod.card.R;
import java.math.RoundingMode;
import ro.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@e
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @go.e
    public static final long f34333a = 4611686018427387904L;

    /* renamed from: b, reason: collision with root package name */
    @go.e
    public static final long f34334b = -5402926248376769404L;

    /* renamed from: f, reason: collision with root package name */
    @go.e
    public static final long f34338f = 3037000499L;

    /* renamed from: j, reason: collision with root package name */
    public static final int f34342j = -545925251;

    /* renamed from: c, reason: collision with root package name */
    @go.e
    public static final byte[] f34335c = {19, ho.c.f59556u, ho.c.f59556u, ho.c.f59556u, ho.c.f59556u, 17, 17, 17, 16, 16, 16, 15, 15, 15, 15, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* renamed from: d, reason: collision with root package name */
    @go.c
    @go.e
    public static final long[] f34336d = {1, 10, 100, 1000, 10000, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1000000, 10000000, vb.a.f93807j, C.NANOS_PER_SECOND, z50.f.f100989w, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* renamed from: e, reason: collision with root package name */
    @go.c
    @go.e
    public static final long[] f34337e = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* renamed from: g, reason: collision with root package name */
    public static final long[] f34339g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f34340h = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* renamed from: i, reason: collision with root package name */
    @go.e
    public static final int[] f34341i = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, 419, 287, R.styleable.Theme_drawable_review_sound, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* renamed from: k, reason: collision with root package name */
    public static final long[][] f34343k = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34344a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f34344a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34344a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34344a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34344a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34344a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34344a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34344a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34344a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34345a = new a("SMALL", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f34346b = new C0424b("LARGE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ b[] f34347c = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends b {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.math.h.b
            public long b(long a11, long b11, long m11) {
                return (a11 * b11) % m11;
            }

            @Override // com.google.common.math.h.b
            public long d(long a11, long m11) {
                return (a11 * a11) % m11;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.math.h$b$b, reason: collision with other inner class name */
        public enum C0424b extends b {
            public C0424b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.math.h.b
            public long b(long a11, long b11, long m11) {
                long j11 = a11 >>> 32;
                long j12 = b11 >>> 32;
                long j13 = a11 & 4294967295L;
                long j14 = b11 & 4294967295L;
                long i11 = i(j11 * j12, m11) + (j11 * j14);
                if (i11 < 0) {
                    i11 = t.k(i11, m11);
                }
                return g(i(i11 + (j12 * j13), m11), t.k(j13 * j14, m11), m11);
            }

            @Override // com.google.common.math.h.b
            public long d(long a11, long m11) {
                long j11 = a11 >>> 32;
                long j12 = a11 & 4294967295L;
                long i11 = i(j11 * j11, m11);
                long j13 = j11 * j12 * 2;
                if (j13 < 0) {
                    j13 = t.k(j13, m11);
                }
                return g(i(i11 + j13, m11), t.k(j12 * j12, m11), m11);
            }

            public final long g(long a11, long b11, long m11) {
                long j11 = a11 + b11;
                return a11 >= m11 - b11 ? j11 - m11 : j11;
            }

            public final long i(long a11, long m11) {
                int i11 = 32;
                do {
                    int min = Math.min(i11, Long.numberOfLeadingZeros(a11));
                    a11 = t.k(a11 << min, m11);
                    i11 -= min;
                } while (i11 > 0);
                return a11;
            }
        }

        public b(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ b[] a() {
            return new b[]{f34345a, f34346b};
        }

        public static boolean e(long base, long n11) {
            return (n11 <= h.f34338f ? f34345a : f34346b).f(base, n11);
        }

        public static b valueOf(String name) {
            return (b) Enum.valueOf(b.class, name);
        }

        public static b[] values() {
            return (b[]) f34347c.clone();
        }

        public abstract long b(long a11, long b11, long m11);

        public final long c(long a11, long p11, long m11) {
            long j11 = a11;
            long j12 = 1;
            while (p11 != 0) {
                long j13 = m11;
                if ((p11 & 1) != 0) {
                    j12 = b(j12, j11, j13);
                }
                j11 = d(j11, j13);
                p11 >>= 1;
                m11 = j13;
            }
            return j12;
        }

        public abstract long d(long a11, long m11);

        public final boolean f(long base, long n11) {
            long j11 = n11 - 1;
            int numberOfTrailingZeros = Long.numberOfTrailingZeros(j11);
            long j12 = j11 >> numberOfTrailingZeros;
            long j13 = base % n11;
            if (j13 == 0) {
                return true;
            }
            long c11 = c(j13, j12, n11);
            if (c11 == 1) {
                return true;
            }
            int i11 = 0;
            while (c11 != j11) {
                i11++;
                if (i11 == numberOfTrailingZeros) {
                    return false;
                }
                c11 = d(c11, n11);
            }
            return true;
        }

        public /* synthetic */ b(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    public static long A(long a11, long b11) {
        long j11 = a11 - b11;
        return (((b11 ^ a11) > 0L ? 1 : ((b11 ^ a11) == 0L ? 0 : -1)) >= 0) | ((a11 ^ j11) >= 0) ? j11 : ((j11 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @go.c
    public static long B(long j11, RoundingMode roundingMode) {
        i.f("x", j11);
        if (i(j11)) {
            return f.x((int) j11, roundingMode);
        }
        long sqrt = (long) Math.sqrt(j11);
        long j12 = sqrt * sqrt;
        switch (a.f34344a[roundingMode.ordinal()]) {
            case 1:
                i.k(j12 == j11);
                return sqrt;
            case 2:
            case 3:
                return j11 < j12 ? sqrt - 1 : sqrt;
            case 4:
            case 5:
                return j11 > j12 ? sqrt + 1 : sqrt;
            case 6:
            case 7:
            case 8:
                return (sqrt - (j11 < j12 ? 1 : 0)) + n((r0 * r0) + r0, j11);
            default:
                throw new AssertionError();
        }
    }

    public static long a(int n11, int k11) {
        i.e("n", n11);
        i.e("k", k11);
        Preconditions.checkArgument(k11 <= n11, "k (%s) > n (%s)", k11, n11);
        if (k11 > (n11 >> 1)) {
            k11 = n11 - k11;
        }
        long j11 = 1;
        if (k11 == 0) {
            return 1L;
        }
        if (k11 == 1) {
            return n11;
        }
        long[] jArr = f34339g;
        if (n11 < jArr.length) {
            return jArr[n11] / (jArr[k11] * jArr[n11 - k11]);
        }
        int[] iArr = f34340h;
        if (k11 >= iArr.length || n11 > iArr[k11]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = f34341i;
        if (k11 < iArr2.length && n11 <= iArr2[k11]) {
            int i11 = n11 - 1;
            long j12 = n11;
            for (int i12 = 2; i12 <= k11; i12++) {
                j12 = (j12 * i11) / i12;
                i11--;
            }
            return j12;
        }
        long j13 = n11;
        int q11 = q(j13, RoundingMode.CEILING);
        int i13 = n11 - 1;
        int i14 = q11;
        int i15 = 2;
        long j14 = j13;
        long j15 = 1;
        while (i15 <= k11) {
            i14 += q11;
            if (i14 < 63) {
                j14 *= i13;
                j15 *= i15;
            } else {
                j11 = u(j11, j14, j15);
                j14 = i13;
                j15 = i15;
                i14 = q11;
            }
            i15++;
            i13--;
        }
        return u(j11, j14, j15);
    }

    public static long b(long x11) {
        i.i("x", x11);
        if (x11 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(x11 - 1));
        }
        throw new ArithmeticException("ceilingPowerOfTwo(" + x11 + ") is not representable as a long");
    }

    public static long c(long a11, long b11) {
        long j11 = a11 + b11;
        i.c(((a11 ^ b11) < 0) | ((a11 ^ j11) >= 0), "checkedAdd", a11, b11);
        return j11;
    }

    public static long d(long a11, long b11) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(a11) + Long.numberOfLeadingZeros(~a11) + Long.numberOfLeadingZeros(b11) + Long.numberOfLeadingZeros(~b11);
        if (numberOfLeadingZeros > 65) {
            return a11 * b11;
        }
        i.c(numberOfLeadingZeros >= 64, "checkedMultiply", a11, b11);
        i.c((a11 >= 0) | (b11 != Long.MIN_VALUE), "checkedMultiply", a11, b11);
        long j11 = a11 * b11;
        i.c(a11 == 0 || j11 / a11 == b11, "checkedMultiply", a11, b11);
        return j11;
    }

    @go.c
    public static long e(long b11, int k11) {
        int i11 = k11;
        i.e("exponent", i11);
        long j11 = 1;
        if (!(b11 >= -2) || !(b11 <= 2)) {
            long j12 = b11;
            while (i11 != 0) {
                if (i11 == 1) {
                    return d(j11, j12);
                }
                if ((i11 & 1) != 0) {
                    j11 = d(j11, j12);
                }
                i11 >>= 1;
                if (i11 > 0) {
                    i.c(-3037000499L <= j12 && j12 <= f34338f, "checkedPow", j12, i11);
                    j12 *= j12;
                }
            }
            return j11;
        }
        int i12 = (int) b11;
        if (i12 == -2) {
            i.c(i11 < 64, "checkedPow", b11, i11);
            return (i11 & 1) == 0 ? 1 << i11 : (-1) << i11;
        }
        if (i12 == -1) {
            return (i11 & 1) == 0 ? 1L : -1L;
        }
        if (i12 == 0) {
            return i11 == 0 ? 1L : 0L;
        }
        if (i12 == 1) {
            return 1L;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        i.c(i11 < 63, "checkedPow", b11, i11);
        return 1 << i11;
    }

    @go.c
    public static long f(long a11, long b11) {
        long j11 = a11 - b11;
        i.c(((a11 ^ b11) >= 0) | ((a11 ^ j11) >= 0), "checkedSubtract", a11, b11);
        return j11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @go.c
    public static long g(long p11, long q11, RoundingMode mode) {
        Preconditions.checkNotNull(mode);
        long j11 = p11 / q11;
        long j12 = p11 - (q11 * j11);
        if (j12 == 0) {
            return j11;
        }
        int i11 = ((int) ((p11 ^ q11) >> 63)) | 1;
        switch (a.f34344a[mode.ordinal()]) {
            case 1:
                i.k(j12 == 0);
                return j11;
            case 2:
                return j11;
            case 3:
                if (i11 >= 0) {
                    return j11;
                }
                return j11 + i11;
            case 4:
                return j11 + i11;
            case 5:
                if (i11 <= 0) {
                    return j11;
                }
                return j11 + i11;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j12);
                long abs2 = abs - (Math.abs(q11) - abs);
                if (abs2 == 0) {
                    if (mode != RoundingMode.HALF_UP && (mode != RoundingMode.HALF_EVEN || (1 & j11) == 0)) {
                        return j11;
                    }
                } else if (abs2 <= 0) {
                    return j11;
                }
                return j11 + i11;
            default:
                throw new AssertionError();
        }
    }

    @go.c
    public static long h(int n11) {
        i.e("n", n11);
        long[] jArr = f34339g;
        if (n11 < jArr.length) {
            return jArr[n11];
        }
        return Long.MAX_VALUE;
    }

    public static boolean i(long x11) {
        return ((long) ((int) x11)) == x11;
    }

    public static long j(long x11) {
        i.i("x", x11);
        return 1 << (63 - Long.numberOfLeadingZeros(x11));
    }

    public static long k(long a11, long b11) {
        i.f("a", a11);
        i.f(yr.e.f100279a, b11);
        if (a11 == 0) {
            return b11;
        }
        if (b11 == 0) {
            return a11;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(a11);
        long j11 = a11 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(b11);
        long j12 = b11 >> numberOfTrailingZeros2;
        while (j11 != j12) {
            long j13 = j11 - j12;
            long j14 = (j13 >> 63) & j13;
            long j15 = (j13 - j14) - j14;
            j12 += j14;
            j11 = j15 >> Long.numberOfTrailingZeros(j15);
        }
        return j11 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean l(long x11) {
        return (x11 > 0) & ((x11 & (x11 - 1)) == 0);
    }

    @go.c
    public static boolean m(long n11) {
        if (n11 < 2) {
            i.f("n", n11);
            return false;
        }
        if (n11 < 66) {
            return ((722865708377213483 >> (((int) n11) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (n11 % 30))) & f34342j) != 0 || n11 % 7 == 0 || n11 % 11 == 0 || n11 % 13 == 0) {
            return false;
        }
        if (n11 < 289) {
            return true;
        }
        for (long[] jArr : f34343k) {
            if (n11 <= jArr[0]) {
                for (int i11 = 1; i11 < jArr.length; i11++) {
                    if (!b.e(jArr[i11], n11)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @go.e
    public static int n(long x11, long y11) {
        return (int) ((~(~(x11 - y11))) >>> 63);
    }

    @go.c
    public static int o(long x11, RoundingMode mode) {
        int n11;
        i.i("x", x11);
        int p11 = p(x11);
        long j11 = f34336d[p11];
        switch (a.f34344a[mode.ordinal()]) {
            case 1:
                i.k(x11 == j11);
                return p11;
            case 2:
            case 3:
                return p11;
            case 4:
            case 5:
                n11 = n(j11, x11);
                break;
            case 6:
            case 7:
            case 8:
                n11 = n(f34337e[p11], x11);
                break;
            default:
                throw new AssertionError();
        }
        return p11 + n11;
    }

    @go.c
    public static int p(long x11) {
        byte b11 = f34335c[Long.numberOfLeadingZeros(x11)];
        return b11 - n(x11, f34336d[b11]);
    }

    public static int q(long x11, RoundingMode mode) {
        i.i("x", x11);
        switch (a.f34344a[mode.ordinal()]) {
            case 1:
                i.k(l(x11));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(x11 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Long.numberOfLeadingZeros(x11);
                return (63 - numberOfLeadingZeros) + n(f34334b >>> numberOfLeadingZeros, x11);
            default:
                throw new AssertionError("impossible");
        }
        return 63 - Long.numberOfLeadingZeros(x11);
    }

    public static long r(long x11, long y11) {
        return (x11 & y11) + ((x11 ^ y11) >> 1);
    }

    @go.c
    public static int s(long x11, int m11) {
        return (int) t(x11, m11);
    }

    @go.c
    public static long t(long x11, long m11) {
        if (m11 <= 0) {
            throw new ArithmeticException("Modulus must be positive");
        }
        long j11 = x11 % m11;
        return j11 >= 0 ? j11 : j11 + m11;
    }

    public static long u(long x11, long numerator, long denominator) {
        if (x11 == 1) {
            return numerator / denominator;
        }
        long k11 = k(x11, denominator);
        return (x11 / k11) * (numerator / (denominator / k11));
    }

    @go.c
    public static long v(long b11, int k11) {
        i.e("exponent", k11);
        if (-2 > b11 || b11 > 2) {
            long j11 = 1;
            while (k11 != 0) {
                if (k11 == 1) {
                    return j11 * b11;
                }
                j11 *= (k11 & 1) == 0 ? 1L : b11;
                b11 *= b11;
                k11 >>= 1;
            }
            return j11;
        }
        int i11 = (int) b11;
        if (i11 == -2) {
            if (k11 < 64) {
                return (k11 & 1) == 0 ? 1 << k11 : -(1 << k11);
            }
            return 0L;
        }
        if (i11 == -1) {
            return (k11 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return k11 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        if (k11 < 64) {
            return 1 << k11;
        }
        return 0L;
    }

    @go.c
    public static double w(long x11, RoundingMode mode) {
        long j11;
        double d11;
        long j12;
        double d12 = x11;
        long j13 = (long) d12;
        int compare = j13 == Long.MAX_VALUE ? -1 : Long.compare(x11, j13);
        int[] iArr = a.f34344a;
        switch (iArr[mode.ordinal()]) {
            case 1:
                i.k(compare == 0);
                return d12;
            case 2:
                if (x11 >= 0) {
                    if (compare < 0) {
                        return d.f(d12);
                    }
                } else if (compare > 0) {
                    return Math.nextUp(d12);
                }
                return d12;
            case 3:
                if (compare < 0) {
                    return d.f(d12);
                }
                return d12;
            case 4:
                if (x11 >= 0) {
                    if (compare > 0) {
                        return Math.nextUp(d12);
                    }
                } else if (compare < 0) {
                    return d.f(d12);
                }
                return d12;
            case 5:
                if (compare > 0) {
                    return Math.nextUp(d12);
                }
                return d12;
            case 6:
            case 7:
            case 8:
                if (compare >= 0) {
                    d11 = Math.nextUp(d12);
                    j11 = Long.MAX_VALUE;
                    j12 = (long) Math.ceil(d11);
                } else {
                    j11 = Long.MAX_VALUE;
                    double f11 = d.f(d12);
                    long floor = (long) Math.floor(f11);
                    d11 = d12;
                    d12 = f11;
                    j12 = j13;
                    j13 = floor;
                }
                long j14 = x11 - j13;
                long j15 = j12 - x11;
                if (j12 == j11) {
                    j15++;
                }
                int compare2 = Long.compare(j14, j15);
                if (compare2 >= 0) {
                    if (compare2 <= 0) {
                        int i11 = iArr[mode.ordinal()];
                        if (i11 != 6) {
                            if (i11 != 7) {
                                if (i11 != 8) {
                                    throw new AssertionError("impossible");
                                }
                                if ((d.c(d12) & 1) == 0) {
                                }
                            } else if (x11 >= 0) {
                            }
                        } else if (x11 >= 0) {
                        }
                    }
                    return d11;
                }
                return d12;
            default:
                throw new AssertionError("impossible");
        }
    }

    public static long x(long a11, long b11) {
        long j11 = a11 + b11;
        return (((b11 ^ a11) > 0L ? 1 : ((b11 ^ a11) == 0L ? 0 : -1)) < 0) | ((a11 ^ j11) >= 0) ? j11 : ((j11 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long y(long a11, long b11) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(a11) + Long.numberOfLeadingZeros(~a11) + Long.numberOfLeadingZeros(b11) + Long.numberOfLeadingZeros(~b11);
        if (numberOfLeadingZeros > 65) {
            return a11 * b11;
        }
        long j11 = ((a11 ^ b11) >>> 63) + Long.MAX_VALUE;
        if (!((numberOfLeadingZeros < 64) | ((b11 == Long.MIN_VALUE) & (a11 < 0)))) {
            long j12 = a11 * b11;
            if (a11 == 0 || j12 / a11 == b11) {
                return j12;
            }
        }
        return j11;
    }

    public static long z(long b11, int k11) {
        i.e("exponent", k11);
        long j11 = 1;
        if (!(b11 >= -2) || !(b11 <= 2)) {
            long j12 = ((b11 >>> 63) & k11 & 1) + Long.MAX_VALUE;
            while (k11 != 0) {
                if (k11 == 1) {
                    return y(j11, b11);
                }
                if ((k11 & 1) != 0) {
                    j11 = y(j11, b11);
                }
                k11 >>= 1;
                if (k11 > 0) {
                    if ((-3037000499L > b11) || (b11 > f34338f)) {
                        return j12;
                    }
                    b11 *= b11;
                }
            }
            return j11;
        }
        int i11 = (int) b11;
        if (i11 == -2) {
            return k11 >= 64 ? (k11 & 1) + Long.MAX_VALUE : (k11 & 1) == 0 ? 1 << k11 : (-1) << k11;
        }
        if (i11 == -1) {
            return (k11 & 1) == 0 ? 1L : -1L;
        }
        if (i11 == 0) {
            return k11 == 0 ? 1L : 0L;
        }
        if (i11 == 1) {
            return 1L;
        }
        if (i11 != 2) {
            throw new AssertionError();
        }
        if (k11 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << k11;
    }
}
