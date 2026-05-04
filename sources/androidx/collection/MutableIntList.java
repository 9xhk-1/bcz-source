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
@u0({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n+ 2 IntList.kt\nandroidx/collection/IntList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,968:1\n556#1:970\n363#2:969\n70#2:971\n237#2,6:974\n70#2:980\n70#2:981\n70#2:988\n13330#3,2:972\n1663#3,6:982\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/MutableIntList\n*L\n692#1:970\n628#1:969\n749#1:971\n762#1:974,6\n776#1:980\n822#1:981\n839#1:988\n757#1:972,2\n824#1:982,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableIntList extends IntList {
    public MutableIntList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableIntList mutableIntList, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = mutableIntList._size;
        }
        mutableIntList.trim(i11);
    }

    public final boolean add(int i11) {
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i12 = this._size;
        iArr[i12] = i11;
        this._size = i12 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i11, @k int[] elements) {
        g0.p(elements, "elements");
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        int[] iArr = this.content;
        int i12 = this._size;
        if (i11 != i12) {
            q.z0(iArr, iArr, elements.length + i11, i11, i12);
        }
        q.I0(elements, iArr, i11, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i11) {
        int[] iArr = this.content;
        if (iArr.length < i11) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i11, (iArr.length * 3) / 2));
            g0.o(copyOf, "copyOf(...)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(int i11) {
        remove(i11);
    }

    public final void plusAssign(@k IntList elements) {
        g0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(int i11) {
        int indexOf = indexOf(i11);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(@k int[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        for (int i12 : elements) {
            remove(i12);
        }
        return i11 != this._size;
    }

    public final int removeAt(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i12 = iArr[i11];
        int i13 = this._size;
        if (i11 != i13 - 1) {
            q.z0(iArr, iArr, i11, i11 + 1, i13);
        }
        this._size--;
        return i12;
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
                int[] iArr = this.content;
                q.z0(iArr, iArr, i11, i12, i14);
            }
            this._size -= i12 - i11;
        }
    }

    public final boolean retainAll(@k int[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        int[] iArr = this.content;
        int i12 = i11 - 1;
        while (true) {
            int i13 = 0;
            int i14 = -1;
            if (-1 >= i12) {
                break;
            }
            int i15 = iArr[i12];
            int length = elements.length;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (elements[i13] == i15) {
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

    public final int set(@IntRange(from = 0) int i11, int i12) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        int[] iArr = this.content;
        int i13 = iArr[i11];
        iArr[i11] = i12;
        return i13;
    }

    public final void sort() {
        int i11 = this._size;
        if (i11 == 0) {
            return;
        }
        q.P3(this.content, 0, i11);
    }

    public final void sortDescending() {
        int i11 = this._size;
        if (i11 == 0) {
            return;
        }
        a0.Tu(this.content, 0, i11);
    }

    public final void trim(int i11) {
        int max = Math.max(i11, this._size);
        int[] iArr = this.content;
        if (iArr.length > max) {
            int[] copyOf = Arrays.copyOf(iArr, max);
            g0.o(copyOf, "copyOf(...)");
            this.content = copyOf;
        }
    }

    public MutableIntList(int i11) {
        super(i11, null);
    }

    public final void minusAssign(@k int[] elements) {
        g0.p(elements, "elements");
        for (int i11 : elements) {
            remove(i11);
        }
    }

    public final void plusAssign(@k int[] elements) {
        g0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableIntList(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 16 : i11);
    }

    public final void plusAssign(int i11) {
        add(i11);
    }

    public final void add(@IntRange(from = 0) int i11, int i12) {
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        int[] iArr = this.content;
        int i13 = this._size;
        if (i11 != i13) {
            q.z0(iArr, iArr, i11 + 1, i11, i13);
        }
        iArr[i11] = i12;
        this._size++;
    }

    public final void minusAssign(@k IntList elements) {
        g0.p(elements, "elements");
        int[] iArr = elements.content;
        int i11 = elements._size;
        for (int i12 = 0; i12 < i11; i12++) {
            remove(iArr[i12]);
        }
    }

    public final boolean removeAll(@k IntList elements) {
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

    public final boolean retainAll(@k IntList elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        int[] iArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!elements.contains(iArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i11, @k IntList elements) {
        g0.p(elements, "elements");
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i12 = elements._size;
        if (i12 == 0) {
            return false;
        }
        ensureCapacity(this._size + i12);
        int[] iArr = this.content;
        int i13 = this._size;
        if (i11 != i13) {
            q.z0(iArr, iArr, elements._size + i11, i11, i13);
        }
        q.z0(elements.content, iArr, i11, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(@k IntList elements) {
        g0.p(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(@k int[] elements) {
        g0.p(elements, "elements");
        return addAll(this._size, elements);
    }
}
