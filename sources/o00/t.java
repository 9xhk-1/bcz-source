package o00;

import yz.k1;
import yz.l1;
import yz.s1;
import yz.v0;
import yz.w1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t {
    public static final int a(int i11, int i12, int i13) {
        int compare;
        int a11 = k1.a(i11, i13);
        int a12 = k1.a(i12, i13);
        compare = Integer.compare(a11 ^ Integer.MIN_VALUE, a12 ^ Integer.MIN_VALUE);
        int i14 = s1.i(a11 - a12);
        return compare >= 0 ? i14 : s1.i(i14 + i13);
    }

    public static final long b(long j11, long j12, long j13) {
        int compare;
        long a11 = l1.a(j11, j13);
        long a12 = l1.a(j12, j13);
        compare = Long.compare(a11 ^ Long.MIN_VALUE, a12 ^ Long.MIN_VALUE);
        long i11 = w1.i(a11 - a12);
        return compare >= 0 ? i11 : w1.i(i11 + j13);
    }

    @y0(version = "1.3")
    @v0
    public static final long c(long j11, long j12, long j13) {
        int compare;
        int compare2;
        if (j13 > 0) {
            compare2 = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
            return compare2 >= 0 ? j12 : w1.i(j12 - b(j12, j11, w1.i(j13)));
        }
        if (j13 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        compare = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
        return compare <= 0 ? j12 : w1.i(j12 + b(j11, j12, w1.i(-j13)));
    }

    @y0(version = "1.3")
    @v0
    public static final int d(int i11, int i12, int i13) {
        int compare;
        int compare2;
        if (i13 > 0) {
            compare2 = Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return s1.i(i12 - a(i12, i11, s1.i(i13)));
            }
        } else {
            if (i13 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            compare = Integer.compare(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
            if (compare > 0) {
                return s1.i(i12 + a(i11, i12, s1.i(-i13)));
            }
        }
        return i12;
    }
}
