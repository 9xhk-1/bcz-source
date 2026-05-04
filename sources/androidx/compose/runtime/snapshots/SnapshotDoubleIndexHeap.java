package androidx.compose.runtime.snapshots;

import a00.q;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSnapshotDoubleIndexHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleIndexHeap.kt\nandroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap\n+ 2 SnapshotId.jvm.kt\nandroidx/compose/runtime/snapshots/SnapshotId_jvmKt\n*L\n1#1,201:1\n65#2,2:202\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleIndexHeap.kt\nandroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap\n*L\n171#1:202,2\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;
    private int firstFreeHandle;

    @k
    private int[] handles;
    private int size;

    @k
    private long[] values = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(16);

    @k
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i11 = 0;
        while (i11 < 16) {
            int i12 = i11 + 1;
            iArr[i11] = i12;
            i11 = i12;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i11 = length * 2;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                iArr[i12] = i13;
                i12 = i13;
            }
            q.I0(this.handles, iArr, 0, 0, 0, 14, null);
            this.handles = iArr;
        }
        int i14 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i14];
        return i14;
    }

    private final void ensure(int i11) {
        int length = this.values.length;
        if (i11 <= length) {
            return;
        }
        int i12 = length * 2;
        long[] snapshotIdArrayWithCapacity = SnapshotId_jvmKt.snapshotIdArrayWithCapacity(i12);
        int[] iArr = new int[i12];
        q.J0(this.values, snapshotIdArrayWithCapacity, 0, 0, 0, 12, null);
        q.I0(this.index, iArr, 0, 0, 0, 14, null);
        this.values = snapshotIdArrayWithCapacity;
        this.index = iArr;
    }

    private final void freeHandle(int i11) {
        this.handles[i11] = this.firstFreeHandle;
        this.firstFreeHandle = i11;
    }

    public static /* synthetic */ long lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(j11);
    }

    private final void shiftDown(int i11) {
        long[] jArr = this.values;
        int i12 = this.size >> 1;
        while (i11 < i12) {
            int i13 = (i11 + 1) << 1;
            int i14 = i13 - 1;
            if (i13 < this.size) {
                long j11 = jArr[i13];
                if (j11 < jArr[i14]) {
                    if (j11 >= jArr[i11]) {
                        return;
                    }
                    swap(i13, i11);
                    i11 = i13;
                }
            }
            if (jArr[i14] >= jArr[i11]) {
                return;
            }
            swap(i14, i11);
            i11 = i14;
        }
    }

    private final void shiftUp(int i11) {
        long[] jArr = this.values;
        long j11 = jArr[i11];
        while (i11 > 0) {
            int i12 = ((i11 + 1) >> 1) - 1;
            if (jArr[i12] <= j11) {
                return;
            }
            swap(i12, i11);
            i11 = i12;
        }
    }

    private final void swap(int i11, int i12) {
        long[] jArr = this.values;
        int[] iArr = this.index;
        int[] iArr2 = this.handles;
        long j11 = jArr[i11];
        jArr[i11] = jArr[i12];
        jArr[i12] = j11;
        int i13 = iArr[i11];
        int i14 = iArr[i12];
        iArr[i11] = i14;
        iArr[i12] = i13;
        iArr2[i14] = i11;
        iArr2[i13] = i12;
    }

    public final int add(long j11) {
        ensure(this.size + 1);
        int i11 = this.size;
        this.size = i11 + 1;
        int allocateHandle = allocateHandle();
        this.values[i11] = j11;
        this.index[i11] = allocateHandle;
        this.handles[allocateHandle] = i11;
        shiftUp(i11);
        return allocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final long lowestOrDefault(long j11) {
        return this.size > 0 ? this.values[0] : j11;
    }

    public final void remove(int i11) {
        int i12 = this.handles[i11];
        swap(i12, this.size - 1);
        this.size--;
        shiftUp(i12);
        shiftDown(i12);
        freeHandle(i11);
    }

    @o
    public final void validate() {
        int i11 = this.size;
        int i12 = 1;
        while (i12 < i11) {
            int i13 = i12 + 1;
            long[] jArr = this.values;
            if (jArr[(i13 >> 1) - 1] > jArr[i12]) {
                throw new IllegalStateException(("Index " + i12 + " is out of place").toString());
            }
            i12 = i13;
        }
    }

    @o
    public final void validateHandle(int i11, long j11) {
        int i12 = this.handles[i11];
        if (this.index[i12] != i11) {
            throw new IllegalStateException(("Index for handle " + i11 + " is corrupted").toString());
        }
        if (this.values[i12] == j11) {
            return;
        }
        throw new IllegalStateException(("Value for handle " + i11 + " was " + this.values[i12] + " but was supposed to be " + j11).toString());
    }
}
