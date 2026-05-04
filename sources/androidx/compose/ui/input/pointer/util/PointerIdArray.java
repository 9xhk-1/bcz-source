package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerId;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PointerIdArray {
    public static final int $stable = 8;

    @k
    private long[] internalArray = new long[2];
    private int size;

    private final long[] resizeStorage(int i11) {
        long[] jArr = this.internalArray;
        long[] copyOf = Arrays.copyOf(jArr, Math.max(i11, jArr.length * 2));
        g0.o(copyOf, "copyOf(...)");
        this.internalArray = copyOf;
        return copyOf;
    }

    public final boolean add(long j11) {
        if (contains(j11)) {
            return false;
        }
        set(this.size, j11);
        return true;
    }

    /* renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m3823add0FcD4WY(long j11) {
        return add(j11);
    }

    public final void clear() {
        this.size = 0;
    }

    public final boolean contains(long j11) {
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.internalArray[i12] == j11) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m3824contains0FcD4WY(long j11) {
        return contains(j11);
    }

    /* renamed from: get-_I2yYro, reason: not valid java name */
    public final long m3825get_I2yYro(int i11) {
        return PointerId.m3712constructorimpl(this.internalArray[i11]);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean remove(long j11) {
        int i11 = this.size;
        int i12 = 0;
        while (i12 < i11) {
            if (j11 == this.internalArray[i12]) {
                int i13 = this.size - 1;
                while (i12 < i13) {
                    long[] jArr = this.internalArray;
                    int i14 = i12 + 1;
                    jArr[i12] = jArr[i14];
                    i12 = i14;
                }
                this.size--;
                return true;
            }
            i12++;
        }
        return false;
    }

    /* renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m3826remove0FcD4WY(long j11) {
        return remove(j11);
    }

    public final boolean removeAt(int i11) {
        int i12 = this.size;
        if (i11 >= i12) {
            return false;
        }
        int i13 = i12 - 1;
        while (i11 < i13) {
            long[] jArr = this.internalArray;
            int i14 = i11 + 1;
            jArr[i11] = jArr[i14];
            i11 = i14;
        }
        this.size--;
        return true;
    }

    public final void set(int i11, long j11) {
        long[] jArr = this.internalArray;
        if (i11 >= jArr.length) {
            jArr = resizeStorage(i11 + 1);
        }
        jArr[i11] = j11;
        if (i11 >= this.size) {
            this.size = i11 + 1;
        }
    }

    /* renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m3827setDmW0f2w(int i11, long j11) {
        set(i11, j11);
    }
}
