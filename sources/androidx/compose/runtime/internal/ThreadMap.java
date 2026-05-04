package androidx.compose.runtime.internal;

import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSnapshotThreadLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,154:1\n12634#2,3:155\n*S KotlinDebug\n*F\n+ 1 SnapshotThreadLocal.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n84#1:155,3\n*E\n"})
/* loaded from: classes.dex */
public final class ThreadMap {
    public static final int $stable = 8;

    @k
    private final long[] keys;
    private final int size;

    @k
    private final Object[] values;

    public ThreadMap(int i11, @k long[] jArr, @k Object[] objArr) {
        this.size = i11;
        this.keys = jArr;
        this.values = objArr;
    }

    private final int find(long j11) {
        int i11 = this.size - 1;
        if (i11 != -1) {
            int i12 = 0;
            if (i11 != 0) {
                while (i12 <= i11) {
                    int i13 = (i12 + i11) >>> 1;
                    long j12 = this.keys[i13] - j11;
                    if (j12 < 0) {
                        i12 = i13 + 1;
                    } else {
                        if (j12 <= 0) {
                            return i13;
                        }
                        i11 = i13 - 1;
                    }
                }
                return -(i12 + 1);
            }
            long j13 = this.keys[0];
            if (j13 == j11) {
                return 0;
            }
            if (j13 > j11) {
                return -2;
            }
        }
        return -1;
    }

    @l
    public final Object get(long j11) {
        int find = find(j11);
        if (find >= 0) {
            return this.values[find];
        }
        return null;
    }

    @k
    public final ThreadMap newWith(long j11, @l Object obj) {
        int i11 = this.size;
        int i12 = 0;
        int i13 = 0;
        for (Object obj2 : this.values) {
            if (obj2 != null) {
                i13++;
            }
        }
        int i14 = i13 + 1;
        long[] jArr = new long[i14];
        Object[] objArr = new Object[i14];
        if (i14 > 1) {
            int i15 = 0;
            while (true) {
                if (i12 >= i14 || i15 >= i11) {
                    break;
                }
                long j12 = this.keys[i15];
                Object obj3 = this.values[i15];
                if (j12 > j11) {
                    jArr[i12] = j11;
                    objArr[i12] = obj;
                    i12++;
                    break;
                }
                if (obj3 != null) {
                    jArr[i12] = j12;
                    objArr[i12] = obj3;
                    i12++;
                }
                i15++;
            }
            if (i15 == i11) {
                jArr[i13] = j11;
                objArr[i13] = obj;
            } else {
                while (i12 < i14) {
                    long j13 = this.keys[i15];
                    Object obj4 = this.values[i15];
                    if (obj4 != null) {
                        jArr[i12] = j13;
                        objArr[i12] = obj4;
                        i12++;
                    }
                    i15++;
                }
            }
        } else {
            jArr[0] = j11;
            objArr[0] = obj;
        }
        return new ThreadMap(i14, jArr, objArr);
    }

    public final boolean trySet(long j11, @l Object obj) {
        int find = find(j11);
        if (find < 0) {
            return false;
        }
        this.values[find] = obj;
        return true;
    }
}
