package androidx.collection;

import a00.a0;
import a00.h0;
import a00.q;
import a00.r0;
import androidx.annotation.IntRange;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q30.k0;
import q30.m;
import y00.e;
import y00.f;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 ObjectList.kt\nandroidx/collection/ObjectList\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1548:1\n903#1,5:1549\n903#1,5:1554\n903#1,5:1559\n903#1,5:1564\n903#1,5:1572\n903#1,5:1577\n903#1,5:1582\n919#1,2:1604\n903#1,5:1613\n903#1,5:1618\n919#1,2:1624\n919#1,2:1628\n629#1:1631\n924#1,2:1634\n924#1,2:1641\n924#1,2:1661\n924#1,2:1670\n924#1,2:1673\n924#1,2:1677\n1864#2,3:1569\n1855#2:1623\n1856#2:1626\n1855#2:1672\n1856#2:1675\n231#3,3:1587\n200#3,7:1590\n211#3,3:1598\n214#3,2:1602\n217#3,6:1606\n234#3:1612\n231#3,3:1644\n200#3,7:1647\n211#3,3:1655\n214#3,2:1659\n217#3,6:1663\n234#3:1669\n1399#4:1597\n1270#4:1601\n1399#4:1654\n1270#4:1658\n1313#5:1627\n1314#5:1630\n1313#5:1676\n1314#5:1679\n84#6:1632\n287#6,4:1637\n292#6:1643\n80#6:1680\n80#6:1681\n80#6:1682\n80#6:1683\n80#6:1684\n80#6:1685\n13309#7:1633\n13310#7:1636\n1#8:1686\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n633#1:1549,5\n649#1:1554,5\n678#1:1559,5\n708#1:1564,5\n738#1:1572,5\n825#1:1577,5\n839#1:1582,5\n840#1:1604,2\n846#1:1613,5\n856#1:1618,5\n866#1:1624,2\n871#1:1628,2\n892#1:1631\n1020#1:1634,2\n1025#1:1641,2\n1030#1:1661,2\n1036#1:1670,2\n1042#1:1673,2\n1047#1:1677,2\n718#1:1569,3\n866#1:1623\n866#1:1626\n1042#1:1672\n1042#1:1675\n840#1:1587,3\n840#1:1590,7\n840#1:1598,3\n840#1:1602,2\n840#1:1606,6\n840#1:1612\n1030#1:1644,3\n1030#1:1647,7\n1030#1:1655,3\n1030#1:1659,2\n1030#1:1663,6\n1030#1:1669\n840#1:1597\n840#1:1601\n1030#1:1654\n1030#1:1658\n871#1:1627\n871#1:1630\n1047#1:1676\n1047#1:1679\n946#1:1632\n1025#1:1637,4\n1025#1:1643\n1061#1:1680\n1113#1:1681\n1130#1:1682\n1147#1:1683\n1164#1:1684\n1181#1:1685\n1020#1:1633\n1020#1:1636\n*E\n"})
/* loaded from: classes.dex */
public final class MutableObjectList<E> extends ObjectList<E> {

    @l
    private ObjectListMutableList<E> list;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MutableObjectListIterator<T> implements ListIterator<T>, f {

        @k
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(@k List<T> list, int i11) {
            g0.p(list, "list");
            this.list = list;
            this.prevIndex = i11 - 1;
        }

        @Override // java.util.ListIterator
        public void add(T t11) {
            List<T> list = this.list;
            int i11 = this.prevIndex + 1;
            this.prevIndex = i11;
            list.add(i11, t11);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i11 = this.prevIndex + 1;
            this.prevIndex = i11;
            return list.get(i11);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.prevIndex + 1;
        }

        @Override // java.util.ListIterator
        public T previous() {
            List<T> list = this.list;
            int i11 = this.prevIndex;
            this.prevIndex = i11 - 1;
            return list.get(i11);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.prevIndex;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        @Override // java.util.ListIterator
        public void set(T t11) {
            this.list.set(this.prevIndex, t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ObjectListMutableList<T> implements List<T>, e {

        @k
        private final MutableObjectList<T> objectList;

        public ObjectListMutableList(@k MutableObjectList<T> objectList) {
            g0.p(objectList, "objectList");
            this.objectList = objectList;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t11) {
            return this.objectList.add(t11);
        }

        @Override // java.util.List
        public boolean addAll(int i11, @k Collection<? extends T> elements) {
            g0.p(elements, "elements");
            return this.objectList.addAll(i11, elements);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.objectList.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.objectList.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@k Collection<? extends Object> elements) {
            g0.p(elements, "elements");
            return this.objectList.containsAll(elements);
        }

        @Override // java.util.List
        public T get(int i11) {
            ObjectListKt.checkIndex(this, i11);
            return this.objectList.get(i11);
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.objectList.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @k
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.objectList.lastIndexOf(obj);
        }

        @Override // java.util.List
        @k
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i11) {
            return removeAt(i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@k Collection<? extends Object> elements) {
            g0.p(elements, "elements");
            return this.objectList.removeAll(elements);
        }

        public T removeAt(int i11) {
            ObjectListKt.checkIndex(this, i11);
            return this.objectList.removeAt(i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@k Collection<? extends Object> elements) {
            g0.p(elements, "elements");
            return this.objectList.retainAll((Collection<? extends T>) elements);
        }

        @Override // java.util.List
        public T set(int i11, T t11) {
            ObjectListKt.checkIndex(this, i11);
            return this.objectList.set(i11, t11);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @k
        public List<T> subList(int i11, int i12) {
            ObjectListKt.checkSubIndex(this, i11, i12);
            return new SubList(this, i11, i12);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return u.a(this);
        }

        @Override // java.util.List
        public void add(int i11, T t11) {
            this.objectList.add(i11, t11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@k Collection<? extends T> elements) {
            g0.p(elements, "elements");
            return this.objectList.addAll(elements);
        }

        @Override // java.util.List
        @k
        public ListIterator<T> listIterator(int i11) {
            return new MutableObjectListIterator(this, i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.objectList.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            g0.p(array, "array");
            return (T[]) u.b(this, array);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1548:1\n1855#2,2:1549\n1855#2,2:1551\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/MutableObjectList$SubList\n*L\n1345#1:1549,2\n1427#1:1551,2\n*E\n"})
    public static final class SubList<T> implements List<T>, e {
        private int end;

        @k
        private final List<T> list;
        private final int start;

        public SubList(@k List<T> list, int i11, int i12) {
            g0.p(list, "list");
            this.list = list;
            this.start = i11;
            this.end = i12;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t11) {
            List<T> list = this.list;
            int i11 = this.end;
            this.end = i11 + 1;
            list.add(i11, t11);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i11, @k Collection<? extends T> elements) {
            g0.p(elements, "elements");
            this.list.addAll(i11 + this.start, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i11 = this.end - 1;
            int i12 = this.start;
            if (i12 <= i11) {
                while (true) {
                    this.list.remove(i11);
                    if (i11 == i12) {
                        break;
                    } else {
                        i11--;
                    }
                }
            }
            this.end = this.start;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i11 = this.end;
            for (int i12 = this.start; i12 < i11; i12++) {
                if (g0.g(this.list.get(i12), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@k Collection<? extends Object> elements) {
            g0.p(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i11) {
            ObjectListKt.checkIndex(this, i11);
            return this.list.get(i11 + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i11 = this.end;
            for (int i12 = this.start; i12 < i11; i12++) {
                if (g0.g(this.list.get(i12), obj)) {
                    return i12 - this.start;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @k
        public Iterator<T> iterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i11 = this.end - 1;
            int i12 = this.start;
            if (i12 > i11) {
                return -1;
            }
            while (!g0.g(this.list.get(i11), obj)) {
                if (i11 == i12) {
                    return -1;
                }
                i11--;
            }
            return i11 - this.start;
        }

        @Override // java.util.List
        @k
        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i11) {
            return removeAt(i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@k Collection<? extends Object> elements) {
            g0.p(elements, "elements");
            int i11 = this.end;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i11 != this.end;
        }

        public T removeAt(int i11) {
            ObjectListKt.checkIndex(this, i11);
            this.end--;
            return this.list.remove(i11 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@k Collection<? extends Object> elements) {
            g0.p(elements, "elements");
            int i11 = this.end;
            int i12 = i11 - 1;
            int i13 = this.start;
            if (i13 <= i12) {
                while (true) {
                    if (!elements.contains(this.list.get(i12))) {
                        this.list.remove(i12);
                        this.end--;
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12--;
                }
            }
            return i11 != this.end;
        }

        @Override // java.util.List
        public T set(int i11, T t11) {
            ObjectListKt.checkIndex(this, i11);
            return this.list.set(i11 + this.start, t11);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @k
        public List<T> subList(int i11, int i12) {
            ObjectListKt.checkSubIndex(this, i11, i12);
            return new SubList(this, i11, i12);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return u.a(this);
        }

        @Override // java.util.List
        public void add(int i11, T t11) {
            this.list.add(i11 + this.start, t11);
            this.end++;
        }

        @Override // java.util.List
        @k
        public ListIterator<T> listIterator(int i11) {
            return new MutableObjectListIterator(this, i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i11 = this.end;
            for (int i12 = this.start; i12 < i11; i12++) {
                if (g0.g(this.list.get(i12), obj)) {
                    this.list.remove(i12);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] array) {
            g0.p(array, "array");
            return (T[]) u.b(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@k Collection<? extends T> elements) {
            g0.p(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }

    private final void throwIndexOutOfBoundsInclusiveException(int i11) {
        RuntimeHelpersKt.throwIndexOutOfBoundsException("Index " + i11 + " must be in 0.." + this._size);
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = mutableObjectList._size;
        }
        mutableObjectList.trim(i11);
    }

    public final boolean add(E e11) {
        int i11 = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i11) {
            resizeStorage(i11, objArr);
        }
        Object[] objArr2 = this.content;
        int i12 = this._size;
        objArr2[i12] = e11;
        this._size = i12 + 1;
        return true;
    }

    public final boolean addAll(@IntRange(from = 0) int i11, @k E[] elements) {
        g0.p(elements, "elements");
        if (i11 < 0 || i11 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i11);
        }
        if (elements.length == 0) {
            return false;
        }
        int length = this._size + elements.length;
        Object[] objArr = this.content;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        Object[] objArr2 = this.content;
        int i12 = this._size;
        if (i11 != i12) {
            q.B0(objArr2, objArr2, elements.length + i11, i11, i12);
        }
        q.K0(elements, objArr2, i11, 0, 0, 12, null);
        this._size += elements.length;
        return true;
    }

    @Override // androidx.collection.ObjectList
    @k
    public List<E> asList() {
        return asMutableList();
    }

    @k
    public final List<E> asMutableList() {
        ObjectListMutableList<E> objectListMutableList = this.list;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        ObjectListMutableList<E> objectListMutableList2 = new ObjectListMutableList<>(this);
        this.list = objectListMutableList2;
        return objectListMutableList2;
    }

    public final void clear() {
        q.M1(this.content, null, 0, this._size);
        this._size = 0;
    }

    public final void ensureCapacity(int i11) {
        Object[] objArr = this.content;
        if (objArr.length < i11) {
            resizeStorage(i11, objArr);
        }
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final void minusAssign(E e11) {
        remove(e11);
    }

    public final void plusAssign(@k ObjectList<E> elements) {
        g0.p(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i11 = this._size + elements._size;
        Object[] objArr = this.content;
        if (objArr.length < i11) {
            resizeStorage(i11, objArr);
        }
        q.B0(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    public final boolean remove(E e11) {
        int indexOf = indexOf(e11);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(@k E[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        for (E e11 : elements) {
            remove(e11);
        }
        return i11 != this._size;
    }

    public final E removeAt(@IntRange(from = 0) int i11) {
        if (i11 < 0 || i11 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i11);
        }
        Object[] objArr = this.content;
        E e11 = (E) objArr[i11];
        int i12 = this._size;
        if (i11 != i12 - 1) {
            q.B0(objArr, objArr, i11, i11 + 1, i12);
        }
        int i13 = this._size - 1;
        this._size = i13;
        objArr[i13] = null;
        return e11;
    }

    public final void removeIf(@k x00.l<? super E, Boolean> predicate) {
        g0.p(predicate, "predicate");
        int i11 = this._size;
        Object[] objArr = this.content;
        int i12 = 0;
        g10.l W1 = g10.u.W1(0, i11);
        int d11 = W1.d();
        int f11 = W1.f();
        if (d11 <= f11) {
            while (true) {
                objArr[d11 - i12] = objArr[d11];
                if (predicate.invoke(objArr[d11]).booleanValue()) {
                    i12++;
                }
                if (d11 == f11) {
                    break;
                } else {
                    d11++;
                }
            }
        }
        q.M1(objArr, null, i11 - i12, i11);
        this._size -= i12;
    }

    public final void removeRange(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        int i13;
        if (i11 < 0 || i11 > (i13 = this._size) || i12 < 0 || i12 > i13) {
            RuntimeHelpersKt.throwIndexOutOfBoundsException("Start (" + i11 + ") and end (" + i12 + ") must be in 0.." + this._size);
        }
        if (i12 < i11) {
            RuntimeHelpersKt.throwIllegalArgumentException("Start (" + i11 + ") is more than end (" + i12 + ')');
        }
        if (i12 != i11) {
            int i14 = this._size;
            if (i12 < i14) {
                Object[] objArr = this.content;
                q.B0(objArr, objArr, i11, i12, i14);
            }
            int i15 = this._size;
            int i16 = i15 - (i12 - i11);
            q.M1(this.content, null, i16, i15);
            this._size = i16;
        }
    }

    @v0
    public final void resizeStorage(int i11, @k Object[] oldContent) {
        g0.p(oldContent, "oldContent");
        int length = oldContent.length;
        this.content = q.B0(oldContent, new Object[Math.max(i11, (length * 3) / 2)], 0, 0, length);
    }

    public final boolean retainAll(@k E[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        Object[] objArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (a0.bg(elements, objArr[i12]) < 0) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final E set(@IntRange(from = 0) int i11, E e11) {
        if (i11 < 0 || i11 >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(i11);
        }
        Object[] objArr = this.content;
        E e12 = (E) objArr[i11];
        objArr[i11] = e11;
        return e12;
    }

    public final void trim(int i11) {
        int max = Math.max(i11, this._size);
        Object[] objArr = this.content;
        if (objArr.length > max) {
            Object[] copyOf = Arrays.copyOf(objArr, max);
            g0.o(copyOf, "copyOf(...)");
            this.content = copyOf;
        }
    }

    public MutableObjectList(int i11) {
        super(i11, null);
    }

    public final void minusAssign(@k List<? extends E> elements) {
        g0.p(elements, "elements");
        int size = elements.size();
        for (int i11 = 0; i11 < size; i11++) {
            remove(elements.get(i11));
        }
    }

    public /* synthetic */ MutableObjectList(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 16 : i11);
    }

    public final void minusAssign(@k E[] elements) {
        g0.p(elements, "elements");
        for (E e11 : elements) {
            remove(e11);
        }
    }

    public final boolean removeAll(@k ObjectList<E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        minusAssign((ObjectList) elements);
        return i11 != this._size;
    }

    public final void add(@IntRange(from = 0) int i11, E e11) {
        if (i11 < 0 || i11 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i11);
        }
        int i12 = this._size + 1;
        Object[] objArr = this.content;
        if (objArr.length < i12) {
            resizeStorage(i12, objArr);
        }
        Object[] objArr2 = this.content;
        int i13 = this._size;
        if (i11 != i13) {
            q.B0(objArr2, objArr2, i11 + 1, i11, i13);
        }
        objArr2[i11] = e11;
        this._size++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@k ObjectList<E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i11 = elements._size;
        for (int i12 = 0; i12 < i11; i12++) {
            remove(objArr[i12]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(@k ObjectList<E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        Object[] objArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!elements.contains(objArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final boolean removeAll(@k ScatterSet<E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        minusAssign((ScatterSet) elements);
        return i11 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@k ScatterSet<E> elements) {
        g0.p(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        remove(objArr[(i11 << 3) + i13]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final boolean removeAll(@k List<? extends E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        minusAssign((List) elements);
        return i11 != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@k ScatterSet<E> elements) {
        g0.p(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int size = this._size + elements.getSize();
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j11 = jArr[i11];
            if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j11) < 128) {
                        add(objArr2[(i11 << 3) + i13]);
                    }
                    j11 >>= 8;
                }
                if (i12 != 8) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final boolean retainAll(@k Collection<? extends E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        Object[] objArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!elements.contains(objArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i11, @k Collection<? extends E> elements) {
        g0.p(elements, "elements");
        if (i11 < 0 || i11 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i11);
        }
        int i12 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = this._size + elements.size();
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.content;
        if (i11 != this._size) {
            q.B0(objArr2, objArr2, elements.size() + i11, i11, this._size);
        }
        for (Object obj : elements) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                h0.b0();
            }
            objArr2[i12 + i11] = obj;
            i12 = i13;
        }
        this._size += elements.size();
        return true;
    }

    public final boolean removeAll(@k Iterable<? extends E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        minusAssign((Iterable) elements);
        return i11 != this._size;
    }

    public final void minusAssign(@k Iterable<? extends E> elements) {
        g0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean removeAll(@k m<? extends E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        minusAssign((m) elements);
        return i11 != this._size;
    }

    public final void minusAssign(@k m<? extends E> elements) {
        g0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final boolean retainAll(@k Iterable<? extends E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        Object[] objArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!r0.a2(elements, objArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final void plusAssign(@k E[] elements) {
        g0.p(elements, "elements");
        if (elements.length == 0) {
            return;
        }
        int length = this._size + elements.length;
        Object[] objArr = this.content;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        q.K0(elements, this.content, this._size, 0, 0, 12, null);
        this._size += elements.length;
    }

    public final boolean retainAll(@k m<? extends E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        Object[] objArr = this.content;
        for (int i12 = i11 - 1; -1 < i12; i12--) {
            if (!k0.D0(elements, objArr[i12])) {
                removeAt(i12);
            }
        }
        return i11 != this._size;
    }

    public final boolean addAll(@IntRange(from = 0) int i11, @k ObjectList<E> elements) {
        g0.p(elements, "elements");
        if (i11 < 0 || i11 > this._size) {
            throwIndexOutOfBoundsInclusiveException(i11);
        }
        if (elements.isEmpty()) {
            return false;
        }
        int i12 = this._size + elements._size;
        Object[] objArr = this.content;
        if (objArr.length < i12) {
            resizeStorage(i12, objArr);
        }
        Object[] objArr2 = this.content;
        int i13 = this._size;
        if (i11 != i13) {
            q.B0(objArr2, objArr2, elements._size + i11, i11, i13);
        }
        q.B0(elements.content, objArr2, i11, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final void plusAssign(@k List<? extends E> elements) {
        g0.p(elements, "elements");
        if (elements.isEmpty()) {
            return;
        }
        int i11 = this._size;
        int size = elements.size() + i11;
        Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        Object[] objArr2 = this.content;
        int size2 = elements.size();
        for (int i12 = 0; i12 < size2; i12++) {
            objArr2[i12 + i11] = elements.get(i12);
        }
        this._size += elements.size();
    }

    public final void plusAssign(E e11) {
        add(e11);
    }

    public final void plusAssign(@k Iterable<? extends E> elements) {
        g0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void plusAssign(@k m<? extends E> elements) {
        g0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final boolean addAll(@k ObjectList<E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        plusAssign((ObjectList) elements);
        return i11 != this._size;
    }

    public final boolean addAll(@k ScatterSet<E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        plusAssign((ScatterSet) elements);
        return i11 != this._size;
    }

    public final boolean addAll(@k E[] elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        plusAssign((Object[]) elements);
        return i11 != this._size;
    }

    public final boolean addAll(@k List<? extends E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        plusAssign((List) elements);
        return i11 != this._size;
    }

    public final boolean addAll(@k Iterable<? extends E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        plusAssign((Iterable) elements);
        return i11 != this._size;
    }

    public final boolean addAll(@k m<? extends E> elements) {
        g0.p(elements, "elements");
        int i11 = this._size;
        plusAssign((m) elements);
        return i11 != this._size;
    }
}
