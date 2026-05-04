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
@u0({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n+ 2 LongList.kt\nandroidx/collection/LongList\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,972:1\n557#1:974\n364#2:973\n70#2:975\n237#2,6:978\n70#2:984\n70#2:985\n70#2:992\n13337#3,2:976\n1675#3,6:986\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/MutableLongList\n*L\n693#1:974\n629#1:973\n751#1:975\n764#1:978,6\n778#1:984\n824#1:985\n841#1:992\n759#1:976,2\n826#1:986,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableLongList extends LongList {
    public MutableLongList() {
        this(0, 1, null);
    }

    public static /* synthetic */ void trim$default(MutableLongList mutableLongList, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = mutableLongList._size;
        }
        mutableLongList.trim(i11);
    }

    public final boolean add(long j11) {
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i11 = this._size;
        jArr[i11] = j11;
        this._size = i11 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i11, @k long[] elements) {
        g0.p(elements, "elements");
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this._size + elements.length);
        long[] jArr = this.content;
        int i12 = this._size;
        if (i11 != i12) {
            q.A0(jArr, jArr, elements.length + i11, i11, i12);
        }
        q.J0(elements, jArr, i11, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    public final void clear() {
        this._size = 0;
    }

    public final void ensureCapacity(int i11) {
        long[] jArr = this.content;
        if (jArr.length < i11) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i11, (jArr.length * 3) / 2));
            g0.o(copyOf, "copyOf(...)");
            this.content = copyOf;
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(long j11) {
        remove(j11);
    }

    public final void plusAssign(@k LongList elements) {
        g0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public final boolean remove(long j11) {
        int indexOf = indexOf(j11);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(@k long[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        for (long j11 : elements) {
            remove(j11);
        }
        return i11 != this._size;
    }

    public final long removeAt(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j11 = jArr[i11];
        int i12 = this._size;
        if (i11 != i12 - 1) {
            q.A0(jArr, jArr, i11, i11 + 1, i12);
        }
        this._size--;
        return j11;
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
                long[] jArr = this.content;
                q.A0(jArr, jArr, i11, i12, i14);
            }
            this._size -= i12 - i11;
        }
    }

    public final boolean retainAll(@k long[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        long[] jArr = this.content;
        int i12 = i11 - 1;
        while (true) {
            int i13 = 0;
            int i14 = -1;
            if (-1 >= i12) {
                break;
            }
            long j11 = jArr[i12];
            int length = elements.length;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (elements[i13] == j11) {
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

    public final long set(@IntRange(from = 0) int i11, long j11) {
        if (i11 < 0 || i11 >= this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        long[] jArr = this.content;
        long j12 = jArr[i11];
        jArr[i11] = j11;
        return j12;
    }

    public final void sort() {
        int i11 = this._size;
        if (i11 == 0) {
            return;
        }
        q.R3(this.content, 0, i11);
    }

    public final void sortDescending() {
        int i11 = this._size;
        if (i11 == 0) {
            return;
        }
        a0.Vu(this.content, 0, i11);
    }

    public final void trim(int i11) {
        int max = Math.max(i11, this._size);
        long[] jArr = this.content;
        if (jArr.length > max) {
            long[] copyOf = Arrays.copyOf(jArr, max);
            g0.o(copyOf, "copyOf(...)");
            this.content = copyOf;
        }
    }

    public MutableLongList(int i11) {
        super(i11, null);
    }

    public final void minusAssign(@k long[] elements) {
        g0.p(elements, "elements");
        for (long j11 : elements) {
            remove(j11);
        }
    }

    public final void plusAssign(@k long[] elements) {
        g0.p(elements, "elements");
        addAll(this._size, elements);
    }

    public /* synthetic */ MutableLongList(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 16 : i11);
    }

    public final void plusAssign(long j11) {
        add(j11);
    }

    public final void add(@IntRange(from = 0) int i11, long j11) {
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Index must be between 0 and size");
        }
        ensureCapacity(this._size + 1);
        long[] jArr = this.content;
        int i12 = this._size;
        if (i11 != i12) {
            q.A0(jArr, jArr, i11 + 1, i11, i12);
        }
        jArr[i11] = j11;
        this._size++;
    }

    public final void minusAssign(@k LongList elements) {
        g0.p(elements, "elements");
        long[] jArr = elements.content;
        int i11 = elements._size;
        for (int i12 = 0; i12 < i11; i12++) {
            remove(jArr[i12]);
        }
    }

    public final boolean removeAll(@k LongList elements) {
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

    public final boolean retainAll(@k LongList elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        long[] jArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!elements.contains(jArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i11, @k LongList elements) {
        g0.p(elements, "elements");
        if (i11 < 0 || i11 > this._size) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("");
        }
        int i12 = elements._size;
        if (i12 == 0) {
            return false;
        }
        ensureCapacity(this._size + i12);
        long[] jArr = this.content;
        int i13 = this._size;
        if (i11 != i13) {
            q.A0(jArr, jArr, elements._size + i11, i11, i13);
        }
        q.A0(elements.content, jArr, i11, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(@k LongList elements) {
        g0.p(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(@k long[] elements) {
        g0.p(elements, "elements");
        return addAll(this._size, elements);
    }
}
