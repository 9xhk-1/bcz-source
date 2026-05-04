package yz;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "UnsignedKt")
/* loaded from: classes8.dex */
public final class i2 {
    @v0
    public static final int a(double d11) {
        if (Double.isNaN(d11) || d11 <= h(0)) {
            return 0;
        }
        if (d11 >= h(-1)) {
            return -1;
        }
        return d11 <= 2.147483647E9d ? s1.i((int) d11) : s1.i(s1.i((int) (d11 - Integer.MAX_VALUE)) + s1.i(Integer.MAX_VALUE));
    }

    @v0
    public static final long b(double d11) {
        if (Double.isNaN(d11) || d11 <= q(0L)) {
            return 0L;
        }
        if (d11 >= q(-1L)) {
            return -1L;
        }
        return d11 < 9.223372036854776E18d ? w1.i((long) d11) : w1.i(w1.i((long) (d11 - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    @v0
    @o00.f
    public static final int c(float f11) {
        return a(f11);
    }

    @v0
    @o00.f
    public static final long d(float f11) {
        return b(f11);
    }

    @v0
    public static final int e(int i11, int i12) {
        return kotlin.jvm.internal.g0.t(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
    }

    @v0
    public static final int f(int i11, int i12) {
        return s1.i((int) ((i11 & 4294967295L) / (i12 & 4294967295L)));
    }

    @v0
    public static final int g(int i11, int i12) {
        return s1.i((int) ((i11 & 4294967295L) % (i12 & 4294967295L)));
    }

    @v0
    public static final double h(int i11) {
        return (Integer.MAX_VALUE & i11) + (((i11 >>> 31) << 30) * 2);
    }

    @v0
    @o00.f
    public static final float i(int i11) {
        return (float) h(i11);
    }

    @v0
    @o00.f
    public static final long j(int i11) {
        return i11 & 4294967295L;
    }

    @o00.f
    public static final String k(int i11) {
        return String.valueOf(i11 & 4294967295L);
    }

    @o00.f
    public static final String l(int i11, int i12) {
        return t(i11 & 4294967295L, i12);
    }

    @v0
    @o00.f
    public static final long m(int i11) {
        return w1.i(i11 & 4294967295L);
    }

    @v0
    public static final int n(long j11, long j12) {
        return kotlin.jvm.internal.g0.u(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
    }

    @v0
    public static final long o(long j11, long j12) {
        int compare;
        int compare2;
        if (j12 < 0) {
            compare2 = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
            return compare2 < 0 ? w1.i(0L) : w1.i(1L);
        }
        if (j11 >= 0) {
            return w1.i(j11 / j12);
        }
        long j13 = ((j11 >>> 1) / j12) << 1;
        compare = Long.compare(w1.i(j11 - (j13 * j12)) ^ Long.MIN_VALUE, w1.i(j12) ^ Long.MIN_VALUE);
        return w1.i(j13 + (compare < 0 ? 0 : 1));
    }

    @v0
    public static final long p(long j11, long j12) {
        int compare;
        int compare2;
        if (j12 < 0) {
            compare2 = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
            return compare2 < 0 ? j11 : w1.i(j11 - j12);
        }
        if (j11 >= 0) {
            return w1.i(j11 % j12);
        }
        long j13 = j11 - ((((j11 >>> 1) / j12) << 1) * j12);
        compare = Long.compare(w1.i(j13) ^ Long.MIN_VALUE, w1.i(j12) ^ Long.MIN_VALUE);
        if (compare < 0) {
            j12 = 0;
        }
        return w1.i(j13 - j12);
    }

    @v0
    public static final double q(long j11) {
        return ((j11 >>> 11) * 2048) + (j11 & 2047);
    }

    @v0
    @o00.f
    public static final float r(long j11) {
        return (float) q(j11);
    }

    @o00.f
    public static final String s(long j11) {
        return t(j11, 10);
    }

    @m80.k
    public static final String t(long j11, int i11) {
        if (j11 >= 0) {
            String l11 = Long.toString(j11, kotlin.text.a.a(i11));
            kotlin.jvm.internal.g0.o(l11, "toString(...)");
            return l11;
        }
        long j12 = i11;
        long j13 = ((j11 >>> 1) / j12) << 1;
        long j14 = j11 - (j13 * j12);
        if (j14 >= j12) {
            j14 -= j12;
            j13++;
        }
        StringBuilder sb2 = new StringBuilder();
        String l12 = Long.toString(j13, kotlin.text.a.a(i11));
        kotlin.jvm.internal.g0.o(l12, "toString(...)");
        sb2.append(l12);
        String l13 = Long.toString(j14, kotlin.text.a.a(i11));
        kotlin.jvm.internal.g0.o(l13, "toString(...)");
        sb2.append(l13);
        return sb2.toString();
    }
}
