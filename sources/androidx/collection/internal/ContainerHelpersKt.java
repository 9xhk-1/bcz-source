package androidx.collection.internal;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ContainerHelpersKt {

    @g
    @k
    public static final int[] EMPTY_INTS = new int[0];

    @g
    @k
    public static final long[] EMPTY_LONGS = new long[0];

    @g
    @k
    public static final Object[] EMPTY_OBJECTS = new Object[0];

    public static final int binarySearch(@k int[] array, int i11, int i12) {
        g0.p(array, "array");
        int i13 = i11 - 1;
        int i14 = 0;
        while (i14 <= i13) {
            int i15 = (i14 + i13) >>> 1;
            int i16 = array[i15];
            if (i16 < i12) {
                i14 = i15 + 1;
            } else {
                if (i16 <= i12) {
                    return i15;
                }
                i13 = i15 - 1;
            }
        }
        return ~i14;
    }

    public static final boolean equal(@l Object obj, @l Object obj2) {
        return g0.g(obj, obj2);
    }

    public static final int idealByteArraySize(int i11) {
        for (int i12 = 4; i12 < 32; i12++) {
            int i13 = (1 << i12) - 12;
            if (i11 <= i13) {
                return i13;
            }
        }
        return i11;
    }

    public static final int idealIntArraySize(int i11) {
        return idealByteArraySize(i11 * 4) / 4;
    }

    public static final int idealLongArraySize(int i11) {
        return idealByteArraySize(i11 * 8) / 8;
    }

    public static final int binarySearch(@k long[] array, int i11, long j11) {
        g0.p(array, "array");
        int i12 = i11 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            long j12 = array[i14];
            if (j12 < j11) {
                i13 = i14 + 1;
            } else {
                if (j12 <= j11) {
                    return i14;
                }
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }
}
