package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IntStack {
    public static final int $stable = 8;

    @g
    @k
    public int[] slots = new int[10];

    @g
    public int tos;

    private final int[] resize() {
        int[] iArr = this.slots;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
        g0.o(copyOf, "copyOf(...)");
        this.slots = copyOf;
        return copyOf;
    }

    public final void clear() {
        this.tos = 0;
    }

    public final int getSize() {
        return this.tos;
    }

    public final int indexOf(int i11) {
        int[] iArr = this.slots;
        int min = Math.min(iArr.length, this.tos);
        for (int i12 = 0; i12 < min; i12++) {
            if (iArr[i12] == i11) {
                return i12;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.tos == 0;
    }

    public final boolean isNotEmpty() {
        return this.tos != 0;
    }

    public final int peek() {
        return this.slots[this.tos - 1];
    }

    public final int peek2() {
        return this.slots[this.tos - 2];
    }

    public final int peekOr(int i11) {
        int i12 = this.tos - 1;
        return i12 >= 0 ? this.slots[i12] : i11;
    }

    public final int pop() {
        int[] iArr = this.slots;
        int i11 = this.tos - 1;
        this.tos = i11;
        return iArr[i11];
    }

    public final void push(int i11) {
        int[] iArr = this.slots;
        if (this.tos >= iArr.length) {
            iArr = resize();
        }
        int i12 = this.tos;
        this.tos = i12 + 1;
        iArr[i12] = i11;
    }

    public final int peek(int i11) {
        return this.slots[i11];
    }
}
