package androidx.compose.runtime.snapshots;

import a00.q;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SnapshotId_jvmKt {
    public static final long SnapshotIdInvalidValue = -1;
    public static final long SnapshotIdMax = Long.MAX_VALUE;
    public static final int SnapshotIdSize = 64;
    public static final long SnapshotIdZero = 0;

    public static final int binarySearch(@k long[] jArr, long j11) {
        int length = jArr.length - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            long j12 = jArr[i12];
            if (j11 > j12) {
                i11 = i12 + 1;
            } else {
                if (j11 >= j12) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final int compareTo(long j11, long j12) {
        return g0.u(j11, j12);
    }

    public static final void copyInto(@k long[] jArr, @k long[] jArr2) {
        q.J0(jArr, jArr2, 0, 0, 0, 12, null);
    }

    public static final long div(long j11, int i11) {
        return j11 / i11;
    }

    public static final long first(@k long[] jArr) {
        return jArr[0];
    }

    public static final void forEach(@k long[] jArr, @k l<? super Long, g2> lVar) {
        for (long j11 : jArr) {
            lVar.invoke(Long.valueOf(j11));
        }
    }

    public static final long get(@k long[] jArr, int i11) {
        return jArr[i11];
    }

    public static final int getSize(@k long[] jArr) {
        return jArr.length;
    }

    public static final long minus(long j11, int i11) {
        return j11 - i11;
    }

    public static final long plus(long j11, int i11) {
        return j11 + i11;
    }

    public static final void set(@k long[] jArr, int i11, long j11) {
        jArr[i11] = j11;
    }

    @k
    public static final long[] snapshotIdArrayOf(long j11) {
        return new long[]{j11};
    }

    @k
    public static final long[] snapshotIdArrayWithCapacity(int i11) {
        return new long[i11];
    }

    public static final long times(long j11, int i11) {
        return j11 * i11;
    }

    public static final int toInt(long j11) {
        return (int) j11;
    }

    public static final long toSnapshotId(int i11) {
        return i11;
    }

    @k
    public static final long[] withIdInsertedAt(@k long[] jArr, int i11, long j11) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        q.A0(jArr, jArr2, 0, 0, i11);
        q.A0(jArr, jArr2, i11 + 1, i11, length);
        jArr2[i11] = j11;
        return jArr2;
    }

    @m80.l
    public static final long[] withIdRemovedAt(@k long[] jArr, int i11) {
        int length = jArr.length;
        int i12 = length - 1;
        if (i12 == 0) {
            return null;
        }
        long[] jArr2 = new long[i12];
        if (i11 > 0) {
            q.A0(jArr, jArr2, 0, 0, i11);
        }
        if (i11 < i12) {
            q.A0(jArr, jArr2, i11, i11 + 1, length);
        }
        return jArr2;
    }

    public static final int compareTo(long j11, int i11) {
        return g0.u(j11, i11);
    }

    public static final long minus(long j11, long j12) {
        return j11 - j12;
    }

    public static final long toLong(long j11) {
        return j11;
    }
}
