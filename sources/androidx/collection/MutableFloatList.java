package androidx.collection;

import a00.a0;
import a00.q;
import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n+ 2 FloatList.kt\nandroidx/collection/FloatList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,976:1\n559#1:978\n365#2:977\n70#2:979\n237#2,6:982\n70#2:988\n70#2:989\n70#2:996\n13344#3,2:980\n1687#3,6:990\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n695#1:978\n631#1:977\n755#1:979\n768#1:982,6\n782#1:988\n828#1:989\n845#1:996\n763#1:980,2\n830#1:990,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = mutableFloatList._size;
        }
        mutableFloatList.trim(i11);
    }

    public final boolean add(float f11) {
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i11 = this._size;
        fArr[i11] = f11;
        this._size = i11 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i11, @k float[] elements) {
        g0.p(elements, "elements");
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        float[] fArr = this.content;
        int i12 = this._size;
        if (i11 != i12) {
            q.y0(fArr, fArr, elements.length + i11, i11, i12);
        }
        q.H0(elements, fArr, i11, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i11) {
        float[] fArr = this.content;
        if (fArr.length < i11) {
            float[] copyOf = Arrays.copyOf(fArr, Math.max(i11, (fArr.length * 3) / 2));
            g0.o(copyOf, "copyOf(...)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(float f11) {
        remove(f11);
    }

    public final void plusAssign(@k FloatList elements) {
        g0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(float f11) {
        int indexOf = indexOf(f11);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(@k float[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        for (float f11 : elements) {
            remove(f11);
        }
        return i11 != this._size;
    }

    public final float removeAt(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f11 = fArr[i11];
        int i12 = this._size;
        if (i11 != i12 - 1) {
            q.y0(fArr, fArr, i11, i11 + 1, i12);
        }
        this._size--;
        return f11;
    }

    public final void removeRange(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        int i13;
        if (i11 < 0 || i11 > (i13 = this._size) || i12 < 0 || i12 > i13) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        if (i12 < i11) {
            RuntimeHelpersKt.throwIllegalArgumentException("The end index must be < start index");
        }
        if (i12 != i11) {
            int i14 = this._size;
            if (i12 < i14) {
                float[] fArr = this.content;
                q.y0(fArr, fArr, i11, i12, i14);
            }
            this._size -= i12 - i11;
        }
    }

    public final boolean retainAll(@k float[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        float[] fArr = this.content;
        int i12 = i11 - 1;
        while (true) {
            int i13 = 0;
            int i14 = -1;
            if (-1 >= i12) {
                break;
            }
            float f11 = fArr[i12];
            int length = elements.length;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (elements[i13] == f11) {
                    i14 = i13;
                    break;
                }
                i13++;
            }
            if (i14 < 0) {
                removeAt(i12);
            }
            i12--;
        }
        return i11 != this._size;
    }

    public final float set(@IntRange(from = 0) int i11, float f11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        float[] fArr = this.content;
        float f12 = fArr[i11];
        fArr[i11] = f11;
        return f12;
    }

    public final void sort() {
        int i11 = this._size;
        if (i11 == 0) {
            return;
        }
        q.N3(this.content, 0, i11);
    }

    public final void sortDescending() {
        int i11 = this._size;
        if (i11 == 0) {
            return;
        }
        a0.Ru(this.content, 0, i11);
    }

    public final void trim(int i11) {
        int max = Math.max(i11, this._size);
        float[] fArr = this.content;
        if (fArr.length > max) {
            float[] copyOf = Arrays.copyOf(fArr, max);
            g0.o(copyOf, "copyOf(...)");
            this.content = copyOf;
        }
    }

    public MutableFloatList(int i11) {
        super(i11, null);
    }

    public final void minusAssign(@k float[] elements) {
        g0.p(elements, "elements");
        for (float f11 : elements) {
            remove(f11);
        }
    }

    public final void plusAssign(@k float[] elements) {
        g0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableFloatList(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 16 : i11);
    }

    public final void plusAssign(float f11) {
        add(f11);
    }

    public final void add(@IntRange(from = 0) int i11, float f11) {
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        float[] fArr = this.content;
        int i12 = this._size;
        if (i11 != i12) {
            q.y0(fArr, fArr, i11 + 1, i11, i12);
        }
        fArr[i11] = f11;
        this._size++;
    }

    public final void minusAssign(@k FloatList elements) {
        g0.p(elements, "elements");
        float[] fArr = elements.content;
        int i11 = elements._size;
        for (int i12 = 0; i12 < i11; i12++) {
            remove(fArr[i12]);
        }
    }

    public final boolean removeAll(@k FloatList elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        int i12 = elements._size - 1;
        if (i12 >= 0) {
            int i13 = 0;
            while (true) {
                remove(elements.get(i13));
                if (i13 == i12) {
                    break;
                }
                i13++;
            }
        }
        return i11 != this._size;
    }

    public final boolean retainAll(@k FloatList elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        float[] fArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!elements.contains(fArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i11, @k FloatList elements) {
        g0.p(elements, "elements");
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i12 = elements._size;
        if (i12 == 0) {
            return false;
        }
        ensureCapacity(this._size + i12);
        float[] fArr = this.content;
        int i13 = this._size;
        if (i11 != i13) {
            q.y0(fArr, fArr, elements._size + i11, i11, i13);
        }
        q.y0(elements.content, fArr, i11, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(@k FloatList elements) {
        g0.p(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(@k float[] elements) {
        g0.p(elements, "elements");
        return addAll(this._size, elements);
    }
}
