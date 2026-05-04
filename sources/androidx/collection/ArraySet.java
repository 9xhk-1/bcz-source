package androidx.collection;

import a00.q;
import a00.r0;
import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import y00.b;
import y00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,283:1\n288#2,10:284\n301#2,14:294\n318#2:308\n323#2:309\n328#2:310\n333#2:311\n338#2,61:312\n403#2,17:373\n423#2,6:390\n433#2,60:396\n501#2,9:456\n514#2,22:465\n540#2,7:487\n551#2,19:494\n574#2,6:513\n584#2,6:519\n594#2,5:525\n603#2,8:530\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n89#1:284,10\n98#1:294,14\n108#1:308\n118#1:309\n128#1:310\n133#1:311\n145#1:312,61\n155#1:373,17\n165#1:390,6\n176#1:396,60\n185#1:456,9\n210#1:465,22\n215#1:487,7\n223#1:494,19\n250#1:513,6\n259#1:519,6\n269#1:525,5\n280#1:530,8\n*E\n"})
/* loaded from: classes.dex */
public final class ArraySet<E> implements Collection<E>, Set<E>, b, h {
    private int _size;

    @k
    private Object[] array;

    @k
    private int[] hashes;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public E elementAt(int i11) {
            return ArraySet.this.valueAt(i11);
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        public void removeAt(int i11) {
            ArraySet.this.removeAt(i11);
        }
    }

    @w00.k
    public ArraySet() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e11) {
        int i11;
        int indexOf;
        int i12 = get_size$collection();
        if (e11 == null) {
            indexOf = ArraySetKt.indexOfNull(this);
            i11 = 0;
        } else {
            int hashCode = e11.hashCode();
            i11 = hashCode;
            indexOf = ArraySetKt.indexOf(this, e11, hashCode);
        }
        if (indexOf >= 0) {
            return false;
        }
        int i13 = ~indexOf;
        if (i12 >= getHashes$collection().length) {
            int i14 = 8;
            if (i12 >= 8) {
                i14 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i14 = 4;
            }
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i14);
            if (i12 != get_size$collection()) {
                throw new ConcurrentModificationException();
            }
            if (!(getHashes$collection().length == 0)) {
                q.I0(hashes$collection, getHashes$collection(), 0, 0, hashes$collection.length, 6, null);
                q.K0(array$collection, getArray$collection(), 0, 0, array$collection.length, 6, null);
            }
        }
        if (i13 < i12) {
            int i15 = i13 + 1;
            q.z0(getHashes$collection(), getHashes$collection(), i15, i13, i12);
            q.B0(getArray$collection(), getArray$collection(), i15, i13, i12);
        }
        if (i12 != get_size$collection() || i13 >= getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        getHashes$collection()[i13] = i11;
        getArray$collection()[i13] = e11;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(@k ArraySet<? extends E> array) {
        g0.p(array, "array");
        int i11 = array.get_size$collection();
        ensureCapacity(get_size$collection() + i11);
        if (get_size$collection() != 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                add(array.valueAt(i12));
            }
            return;
        }
        if (i11 > 0) {
            q.I0(array.getHashes$collection(), getHashes$collection(), 0, 0, i11, 6, null);
            q.K0(array.getArray$collection(), getArray$collection(), 0, 0, i11, 6, null);
            if (get_size$collection() != 0) {
                throw new ConcurrentModificationException();
            }
            set_size$collection(i11);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void ensureCapacity(int i11) {
        int i12 = get_size$collection();
        if (getHashes$collection().length < i11) {
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i11);
            if (get_size$collection() > 0) {
                q.I0(hashes$collection, getHashes$collection(), 0, 0, get_size$collection(), 6, null);
                q.K0(array$collection, getArray$collection(), 0, 0, get_size$collection(), 6, null);
            }
        }
        if (get_size$collection() != i12) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int i11 = get_size$collection();
            for (int i12 = 0; i12 < i11; i12++) {
                if (!((Set) obj).contains(valueAt(i12))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @k
    public final Object[] getArray$collection() {
        return this.array;
    }

    @k
    public final int[] getHashes$collection() {
        return this.hashes;
    }

    public int getSize() {
        return this._size;
    }

    public final int get_size$collection() {
        return this._size;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] hashes$collection = getHashes$collection();
        int i11 = get_size$collection();
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 += hashes$collection[i13];
        }
        return i12;
    }

    public final int indexOf(@l Object obj) {
        return obj == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(@k ArraySet<? extends E> array) {
        g0.p(array, "array");
        int i11 = array.get_size$collection();
        int i12 = get_size$collection();
        for (int i13 = 0; i13 < i11; i13++) {
            remove(array.valueAt(i13));
        }
        return i12 != get_size$collection();
    }

    public final E removeAt(int i11) {
        int i12;
        Object[] objArr;
        int i13 = get_size$collection();
        E e11 = (E) getArray$collection()[i11];
        if (i13 <= 1) {
            clear();
            return e11;
        }
        int i14 = i13 - 1;
        if (getHashes$collection().length <= 8 || get_size$collection() >= getHashes$collection().length / 3) {
            if (i11 < i14) {
                int i15 = i11 + 1;
                q.z0(getHashes$collection(), getHashes$collection(), i11, i15, i13);
                q.B0(getArray$collection(), getArray$collection(), i11, i15, i13);
            }
            getArray$collection()[i14] = null;
        } else {
            int i16 = get_size$collection() > 8 ? get_size$collection() + (get_size$collection() >> 1) : 8;
            int[] hashes$collection = getHashes$collection();
            Object[] array$collection = getArray$collection();
            ArraySetKt.allocArrays(this, i16);
            if (i11 > 0) {
                q.I0(hashes$collection, getHashes$collection(), 0, 0, i11, 6, null);
                objArr = array$collection;
                q.K0(objArr, getArray$collection(), 0, 0, i11, 6, null);
                i12 = i11;
            } else {
                i12 = i11;
                objArr = array$collection;
            }
            if (i12 < i14) {
                int i17 = i12 + 1;
                q.z0(hashes$collection, getHashes$collection(), i12, i17, i13);
                q.B0(objArr, getArray$collection(), i12, i17, i13);
            }
        }
        if (i13 != get_size$collection()) {
            throw new ConcurrentModificationException();
        }
        set_size$collection(i14);
        return e11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        boolean z11 = false;
        for (int i11 = get_size$collection() - 1; -1 < i11; i11--) {
            if (!r0.a2(elements, getArray$collection()[i11])) {
                removeAt(i11);
                z11 = true;
            }
        }
        return z11;
    }

    public final void setArray$collection(@k Object[] objArr) {
        g0.p(objArr, "<set-?>");
        this.array = objArr;
    }

    public final void setHashes$collection(@k int[] iArr) {
        g0.p(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final void set_size$collection(int i11) {
        this._size = i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection, java.util.Set
    @k
    public final Object[] toArray() {
        return q.l1(this.array, 0, this._size);
    }

    @k
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(get_size$collection() * 14);
        sb2.append(l50.b.f69927i);
        int i11 = get_size$collection();
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(j2.O);
            }
            E valueAt = valueAt(i12);
            if (valueAt != this) {
                sb2.append(valueAt);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append(l50.b.f69928j);
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    public final E valueAt(int i11) {
        return (E) getArray$collection()[i11];
    }

    @w00.k
    public ArraySet(int i11) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (i11 > 0) {
            ArraySetKt.allocArrays(this, i11);
        }
    }

    @Override // java.util.Collection, java.util.Set
    @k
    public final <T> T[] toArray(@k T[] array) {
        g0.p(array, "array");
        T[] tArr = (T[]) ArraySetJvmUtil.resizeForToArray(array, this._size);
        q.B0(this.array, tArr, 0, 0, this._size);
        g0.m(tArr);
        return tArr;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= remove(it.next());
        }
        return z11;
    }

    public /* synthetic */ ArraySet(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 0 : i11);
    }

    public ArraySet(@l ArraySet<? extends E> arraySet) {
        this(0);
        if (arraySet != null) {
            addAll((ArraySet) arraySet);
        }
    }

    public ArraySet(@l Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@k Collection<? extends E> elements) {
        g0.p(elements, "elements");
        ensureCapacity(get_size$collection() + elements.size());
        Iterator<? extends E> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= add(it.next());
        }
        return z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet(@l E[] eArr) {
        this(0);
        if (eArr != null) {
            Iterator a11 = kotlin.jvm.internal.h.a(eArr);
            while (a11.hasNext()) {
                add(a11.next());
            }
        }
    }
}
