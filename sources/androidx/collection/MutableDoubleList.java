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
@u0({"SMAP\nDoubleList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoubleList.kt\nandroidx/collection/MutableDoubleList\n+ 2 DoubleList.kt\nandroidx/collection/DoubleList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,983:1\n562#1:985\n367#2:984\n72#2:986\n239#2,6:989\n72#2:995\n72#2:996\n72#2:1003\n13351#3,2:987\n1699#3,6:997\n*S KotlinDebug\n*F\n+ 1 DoubleList.kt\nandroidx/collection/MutableDoubleList\n*L\n698#1:985\n634#1:984\n758#1:986\n771#1:989,6\n785#1:995\n831#1:996\n848#1:1003\n766#1:987,2\n833#1:997,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableDoubleList extends DoubleList {
    public MutableDoubleList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableDoubleList mutableDoubleList, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = mutableDoubleList._size;
        }
        mutableDoubleList.trim(i11);
    }

    public final boolean add(double d11) {
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i11 = this._size;
        dArr[i11] = d11;
        this._size = i11 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i11, @k double[] elements) {
        g0.p(elements, "elements");
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        double[] dArr = this.content;
        int i12 = this._size;
        if (i11 != i12) {
            q.x0(dArr, dArr, elements.length + i11, i11, i12);
        }
        q.G0(elements, dArr, i11, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i11) {
        double[] dArr = this.content;
        if (dArr.length < i11) {
            double[] copyOf = Arrays.copyOf(dArr, Math.max(i11, (dArr.length * 3) / 2));
            g0.o(copyOf, "copyOf(...)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(double d11) {
        remove(d11);
    }

    public final void plusAssign(@k DoubleList elements) {
        g0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(double d11) {
        int indexOf = indexOf(d11);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(@k double[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        for (double d11 : elements) {
            remove(d11);
        }
        return i11 != this._size;
    }

    public final double removeAt(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d11 = dArr[i11];
        int i12 = this._size;
        if (i11 != i12 - 1) {
            q.x0(dArr, dArr, i11, i11 + 1, i12);
        }
        this._size--;
        return d11;
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
                double[] dArr = this.content;
                q.x0(dArr, dArr, i11, i12, i14);
            }
            this._size -= i12 - i11;
        }
    }

    public final boolean retainAll(@k double[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        double[] dArr = this.content;
        int i12 = i11 - 1;
        while (true) {
            int i13 = 0;
            int i14 = -1;
            if (-1 >= i12) {
                break;
            }
            double d11 = dArr[i12];
            int length = elements.length;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (elements[i13] == d11) {
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

    public final double set(@IntRange(from = 0) int i11, double d11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        double[] dArr = this.content;
        double d12 = dArr[i11];
        dArr[i11] = d11;
        return d12;
    }

    public final void sort() {
        int i11 = this._size;
        if (i11 == 0) {
            return;
        }
        q.L3(this.content, 0, i11);
    }

    public final void sortDescending() {
        int i11 = this._size;
        if (i11 == 0) {
            return;
        }
        a0.Pu(this.content, 0, i11);
    }

    public final void trim(int i11) {
        int max = Math.max(i11, this._size);
        double[] dArr = this.content;
        if (dArr.length > max) {
            double[] copyOf = Arrays.copyOf(dArr, max);
            g0.o(copyOf, "copyOf(...)");
            this.content = copyOf;
        }
    }

    public MutableDoubleList(int i11) {
        super(i11, null);
    }

    public final void minusAssign(@k double[] elements) {
        g0.p(elements, "elements");
        for (double d11 : elements) {
            remove(d11);
        }
    }

    public final void plusAssign(@k double[] elements) {
        g0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableDoubleList(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 16 : i11);
    }

    public final void plusAssign(double d11) {
        add(d11);
    }

    public final void add(@IntRange(from = 0) int i11, double d11) {
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        double[] dArr = this.content;
        int i12 = this._size;
        if (i11 != i12) {
            q.x0(dArr, dArr, i11 + 1, i11, i12);
        }
        dArr[i11] = d11;
        this._size++;
    }

    public final void minusAssign(@k DoubleList elements) {
        g0.p(elements, "elements");
        double[] dArr = elements.content;
        int i11 = elements._size;
        for (int i12 = 0; i12 < i11; i12++) {
            remove(dArr[i12]);
        }
    }

    public final boolean removeAll(@k DoubleList elements) {
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

    public final boolean retainAll(@k DoubleList elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        double[] dArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!elements.contains(dArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i11, @k DoubleList elements) {
        g0.p(elements, "elements");
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i12 = elements._size;
        if (i12 == 0) {
            return false;
        }
        ensureCapacity(this._size + i12);
        double[] dArr = this.content;
        int i13 = this._size;
        if (i11 != i13) {
            q.x0(dArr, dArr, elements._size + i11, i11, i13);
        }
        q.x0(elements.content, dArr, i11, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(@k DoubleList elements) {
        g0.p(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(@k double[] elements) {
        g0.p(elements, "elements");
        return addAll(this._size, elements);
    }
}
