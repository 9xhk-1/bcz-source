package o00;

import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o {
    public static final int a(int i11, int i12, int i13) {
        return e(e(i11, i13) - e(i12, i13), i13);
    }

    public static final long b(long j11, long j12, long j13) {
        return f(f(j11, j13) - f(j12, j13), j13);
    }

    @v0
    public static final int c(int i11, int i12, int i13) {
        if (i13 > 0) {
            if (i11 < i12) {
                return i12 - a(i12, i11, i13);
            }
        } else {
            if (i13 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i11 > i12) {
                return i12 + a(i11, i12, -i13);
            }
        }
        return i12;
    }

    @v0
    public static final long d(long j11, long j12, long j13) {
        if (j13 > 0) {
            return j11 >= j12 ? j12 : j12 - b(j12, j11, j13);
        }
        if (j13 < 0) {
            return j11 <= j12 ? j12 : j12 + b(j11, j12, -j13);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    public static final int e(int i11, int i12) {
        int i13 = i11 % i12;
        return i13 >= 0 ? i13 : i13 + i12;
    }

    public static final long f(long j11, long j12) {
        long j13 = j11 % j12;
        return j13 >= 0 ? j13 : j13 + j12;
    }
}
