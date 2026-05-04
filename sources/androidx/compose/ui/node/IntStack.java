package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMyersDiff.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,518:1\n56#2,5:519\n*S KotlinDebug\n*F\n+ 1 MyersDiff.kt\nandroidx/compose/ui/node/IntStack\n*L\n470#1:519,5\n*E\n"})
/* loaded from: classes2.dex */
final class IntStack {
    private int lastIndex;

    @k
    private int[] stack;

    public IntStack(int i11) {
        this.stack = new int[i11];
    }

    private final boolean compareDiagonal(int i11, int i12) {
        int[] iArr = this.stack;
        int i13 = iArr[i11];
        int i14 = iArr[i12];
        return i13 < i14 || (i13 == i14 && iArr[i11 + 1] <= iArr[i12 + 1]);
    }

    private final int partition(int i11, int i12, int i13) {
        int i14 = i11 - i13;
        while (i11 < i12) {
            if (compareDiagonal(i11, i12)) {
                i14 += i13;
                swapDiagonal(i14, i11);
            }
            i11 += i13;
        }
        int i15 = i14 + i13;
        swapDiagonal(i15, i12);
        return i15;
    }

    private final void quickSort(int i11, int i12, int i13) {
        if (i11 < i12) {
            int partition = partition(i11, i12, i13);
            quickSort(i11, partition - i13, i13);
            quickSort(partition + i13, i12, i13);
        }
    }

    private final int[] resizeStack(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
        g0.o(copyOf, "copyOf(...)");
        this.stack = copyOf;
        return copyOf;
    }

    private final void swapDiagonal(int i11, int i12) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, i11, i12);
        MyersDiffKt.swap(iArr, i11 + 1, i12 + 1);
        MyersDiffKt.swap(iArr, i11 + 2, i12 + 2);
    }

    public final int get(int i11) {
        return this.stack[i11];
    }

    public final int getSize() {
        return this.lastIndex;
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i11 = this.lastIndex - 1;
        this.lastIndex = i11;
        return iArr[i11];
    }

    public final void pushDiagonal(int i11, int i12, int i13) {
        int i14 = this.lastIndex;
        int[] iArr = this.stack;
        int i15 = i14 + 3;
        if (i15 >= iArr.length) {
            iArr = resizeStack(iArr);
        }
        iArr[i14] = i11 + i13;
        iArr[i14 + 1] = i12 + i13;
        iArr[i14 + 2] = i13;
        this.lastIndex = i15;
    }

    public final void pushRange(int i11, int i12, int i13, int i14) {
        int i15 = this.lastIndex;
        int[] iArr = this.stack;
        int i16 = i15 + 4;
        if (i16 >= iArr.length) {
            iArr = resizeStack(iArr);
        }
        iArr[i15] = i11;
        iArr[i15 + 1] = i12;
        iArr[i15 + 2] = i13;
        iArr[i15 + 3] = i14;
        this.lastIndex = i16;
    }

    public final void sortDiagonals() {
        int i11 = this.lastIndex;
        if (!(i11 % 3 == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Array size not a multiple of 3");
        }
        if (i11 > 3) {
            quickSort(0, i11 - 3, 3);
        }
    }
}
