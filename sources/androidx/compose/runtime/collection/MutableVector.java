package androidx.compose.runtime.collection;

import a00.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.g;
import x00.p;
import x00.q;
import y00.e;
import y00.f;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 ArrayUtils.android.kt\nandroidx/compose/runtime/collection/ArrayUtils_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1110:1\n289#1,4:1111\n289#1,4:1115\n289#1,4:1121\n289#1,4:1127\n289#1,4:1135\n289#1,4:1141\n44#1:1151\n472#1:1152\n48#1:1155\n472#1:1156\n44#1:1157\n472#1:1158\n516#1:1161\n332#1:1162\n472#1:1163\n516#1:1164\n472#1:1165\n516#1:1166\n44#1:1167\n472#1:1168\n516#1:1169\n44#1:1170\n472#1:1171\n472#1:1172\n472#1:1173\n44#1:1174\n472#1:1175\n44#1:1178\n44#1:1183\n44#1:1184\n472#1:1185\n27#2,2:1119\n27#2,2:1125\n27#2,2:1131\n27#2,2:1133\n27#2,2:1139\n27#2,2:1145\n27#2,2:1159\n27#2,2:1179\n27#2,2:1181\n1864#3,3:1147\n1855#3,2:1153\n1855#3,2:1176\n1#4:1150\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n55#1:1111,4\n66#1:1115,4\n87#1:1121,4\n111#1:1127,4\n156#1:1135,4\n169#1:1141,4\n234#1:1151\n235#1:1152\n265#1:1155\n266#1:1156\n279#1:1157\n280#1:1158\n309#1:1161\n310#1:1162\n312#1:1163\n340#1:1164\n340#1:1165\n526#1:1166\n529#1:1167\n529#1:1168\n563#1:1169\n563#1:1170\n563#1:1171\n588#1:1172\n598#1:1173\n678#1:1174\n679#1:1175\n700#1:1178\n725#1:1183\n759#1:1184\n760#1:1185\n69#1:1119,2\n90#1:1125,2\n114#1:1131,2\n121#1:1133,2\n157#1:1139,2\n172#1:1145,2\n300#1:1159,2\n701#1:1179,2\n717#1:1181,2\n179#1:1147,3\n256#1:1153,2\n692#1:1176,2\n*E\n"})
/* loaded from: classes.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;

    @g
    @k
    public T[] content;

    @l
    private List<T> list;
    private int size;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1110:1\n472#2:1111\n516#2:1112\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n850#1:1111\n855#1:1112\n*E\n"})
    public static final class MutableVectorList<T> implements List<T>, e {

        @k
        private final MutableVector<T> vector;

        public MutableVectorList(@k MutableVector<T> mutableVector) {
            this.vector = mutableVector;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t11) {
            return this.vector.add(t11);
        }

        @Override // java.util.List
        public boolean addAll(int i11, @k Collection<? extends T> collection) {
            return this.vector.addAll(i11, collection);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.vector.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.vector.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@k Collection<? extends Object> collection) {
            return this.vector.containsAll(collection);
        }

        @Override // java.util.List
        public T get(int i11) {
            MutableVectorKt.checkIndex(this, i11);
            return this.vector.content[i11];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.vector.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.vector.getSize() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @k
        public Iterator<T> iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.vector.lastIndexOf(obj);
        }

        @Override // java.util.List
        @k
        public ListIterator<T> listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i11) {
            return removeAt(i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@k Collection<? extends Object> collection) {
            return this.vector.removeAll(collection);
        }

        public T removeAt(int i11) {
            MutableVectorKt.checkIndex(this, i11);
            return this.vector.removeAt(i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@k Collection<? extends Object> collection) {
            return this.vector.retainAll(collection);
        }

        @Override // java.util.List
        public T set(int i11, T t11) {
            MutableVectorKt.checkIndex(this, i11);
            return this.vector.set(i11, t11);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @k
        public List<T> subList(int i11, int i12) {
            MutableVectorKt.checkSubIndex(this, i11, i12);
            return new SubList(this, i11, i12);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return u.a(this);
        }

        @Override // java.util.List
        public void add(int i11, T t11) {
            this.vector.add(i11, t11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@k Collection<? extends T> collection) {
            return this.vector.addAll(collection);
        }

        @Override // java.util.List
        @k
        public ListIterator<T> listIterator(int i11) {
            return new VectorListIterator(this, i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.vector.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) u.b(this, tArr);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1110:1\n1855#2,2:1111\n1855#2,2:1113\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n922#1:1111,2\n1006#1:1113,2\n*E\n"})
    public static final class SubList<T> implements List<T>, e {
        private int end;

        @k
        private final List<T> list;
        private final int start;

        public SubList(@k List<T> list, int i11, int i12) {
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
        public boolean addAll(int i11, @k Collection<? extends T> collection) {
            this.list.addAll(i11 + this.start, collection);
            int size = collection.size();
            this.end += size;
            return size > 0;
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
        public boolean containsAll(@k Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i11) {
            MutableVectorKt.checkIndex(this, i11);
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
            return new VectorListIterator(this, 0);
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
            return new VectorListIterator(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i11) {
            return removeAt(i11);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@k Collection<? extends Object> collection) {
            int i11 = this.end;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i11 != this.end;
        }

        public T removeAt(int i11) {
            MutableVectorKt.checkIndex(this, i11);
            this.end--;
            return this.list.remove(i11 + this.start);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@k Collection<? extends Object> collection) {
            int i11 = this.end;
            int i12 = i11 - 1;
            int i13 = this.start;
            if (i13 <= i12) {
                while (true) {
                    if (!collection.contains(this.list.get(i12))) {
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
            MutableVectorKt.checkIndex(this, i11);
            return this.list.set(i11 + this.start, t11);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @k
        public List<T> subList(int i11, int i12) {
            MutableVectorKt.checkSubIndex(this, i11, i12);
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
            return new VectorListIterator(this, i11);
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
        public <T> T[] toArray(T[] tArr) {
            return (T[]) u.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@k Collection<? extends T> collection) {
            this.list.addAll(this.end, collection);
            int size = collection.size();
            this.end += size;
            return size > 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class VectorListIterator<T> implements ListIterator<T>, f {
        private int index;

        @k
        private final List<T> list;

        public VectorListIterator(@k List<T> list, int i11) {
            this.list = list;
            this.index = i11;
        }

        @Override // java.util.ListIterator
        public void add(T t11) {
            this.list.add(this.index, t11);
            this.index++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.list;
            int i11 = this.index;
            this.index = i11 + 1;
            return list.get(i11);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.index;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i11 = this.index - 1;
            this.index = i11;
            return this.list.get(i11);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.index - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i11 = this.index - 1;
            this.index = i11;
            this.list.remove(i11);
        }

        @Override // java.util.ListIterator
        public void set(T t11) {
            this.list.set(this.index, t11);
        }
    }

    @v0
    public MutableVector(@k T[] tArr, int i11) {
        this.content = tArr;
        this.size = i11;
    }

    public final boolean add(T t11) {
        int i11 = this.size + 1;
        if (this.content.length < i11) {
            resizeStorage(i11);
        }
        T[] tArr = this.content;
        int i12 = this.size;
        tArr[i12] = t11;
        this.size = i12 + 1;
        return true;
    }

    public final boolean addAll(int i11, @k List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i12 = this.size + size;
        if (this.content.length < i12) {
            resizeStorage(i12);
        }
        T[] tArr = this.content;
        int i13 = this.size;
        if (i11 != i13) {
            System.arraycopy(tArr, i11, tArr, i11 + size, i13 - i11);
        }
        int size2 = list.size();
        for (int i14 = 0; i14 < size2; i14++) {
            tArr[i11 + i14] = list.get(i14);
        }
        this.size += size;
        return true;
    }

    public final boolean any(@k x00.l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i11 = 0; i11 < size; i11++) {
            if (lVar.invoke(tArr[i11]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @k
    public final List<T> asMutableList() {
        List<T> list = this.list;
        if (list != null) {
            return list;
        }
        MutableVectorList mutableVectorList = new MutableVectorList(this);
        this.list = mutableVectorList;
        return mutableVectorList;
    }

    public final void clear() {
        T[] tArr = this.content;
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            tArr[i12] = null;
        }
        this.size = 0;
    }

    public final boolean contains(T t11) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i11 = 0; !g0.g(this.content[i11], t11); i11++) {
                if (i11 != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(@k List<? extends T> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!contains(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(@k MutableVector<T> mutableVector) {
        if (mutableVector.size != this.size) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i11 = 0; g0.g(mutableVector.content[i11], this.content[i11]); i11++) {
                if (i11 != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i11) {
        if (this.content.length < i11) {
            resizeStorage(i11);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T first(@k x00.l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i11 = 0; i11 < size; i11++) {
            ?? r32 = (Object) tArr[i11];
            if (lVar.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @l
    public final T firstOrNull(@k x00.l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i11 = 0; i11 < size; i11++) {
            ?? r32 = (Object) tArr[i11];
            if (lVar.invoke(r32).booleanValue()) {
                return r32;
            }
        }
        return null;
    }

    public final <R> R fold(R r11, @k p<? super R, ? super T, ? extends R> pVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i11 = 0; i11 < size; i11++) {
            r11 = pVar.invoke(r11, tArr[i11]);
        }
        return r11;
    }

    public final <R> R foldIndexed(R r11, @k q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i11 = 0; i11 < size; i11++) {
            r11 = qVar.invoke(Integer.valueOf(i11), r11, tArr[i11]);
        }
        return r11;
    }

    public final <R> R foldRight(R r11, @k p<? super T, ? super R, ? extends R> pVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return r11;
        }
        while (size >= 0) {
            r11 = pVar.invoke(tArr[size], r11);
            size--;
        }
        return r11;
    }

    public final <R> R foldRightIndexed(R r11, @k q<? super Integer, ? super T, ? super R, ? extends R> qVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return r11;
        }
        while (size >= 0) {
            r11 = qVar.invoke(Integer.valueOf(size), tArr[size], r11);
            size--;
        }
        return r11;
    }

    public final void forEach(@k x00.l<? super T, g2> lVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i11 = 0; i11 < size; i11++) {
            lVar.invoke(tArr[i11]);
        }
    }

    public final void forEachIndexed(@k p<? super Integer, ? super T, g2> pVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i11 = 0; i11 < size; i11++) {
            pVar.invoke(Integer.valueOf(i11), tArr[i11]);
        }
    }

    public final void forEachReversed(@k x00.l<? super T, g2> lVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            lVar.invoke(tArr[size]);
            size--;
        }
    }

    public final void forEachReversedIndexed(@k p<? super Integer, ? super T, g2> pVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return;
        }
        while (size >= 0) {
            pVar.invoke(Integer.valueOf(size), tArr[size]);
            size--;
        }
    }

    public final T get(int i11) {
        return this.content[i11];
    }

    @v0
    @k
    public final T[] getContent() {
        return this.content;
    }

    @k
    public final g10.l getIndices() {
        return g10.u.W1(0, getSize());
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(T t11) {
        T[] tArr = this.content;
        int i11 = this.size;
        for (int i12 = 0; i12 < i11; i12++) {
            if (g0.g(t11, tArr[i12])) {
                return i12;
            }
        }
        return -1;
    }

    public final int indexOfFirst(@k x00.l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        int size = getSize();
        for (int i11 = 0; i11 < size; i11++) {
            if (lVar.invoke(tArr[i11]).booleanValue()) {
                return i11;
            }
        }
        return -1;
    }

    public final int indexOfLast(@k x00.l<? super T, Boolean> lVar) {
        int size = getSize() - 1;
        T[] tArr = this.content;
        if (size >= tArr.length) {
            return -1;
        }
        while (size >= 0) {
            if (lVar.invoke(tArr[size]).booleanValue()) {
                return size;
            }
            size--;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final boolean isNotEmpty() {
        return getSize() != 0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T last(@k x00.l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r22 = (Object) tArr[size];
            if (lVar.invoke(r22).booleanValue()) {
                return r22;
            }
        }
        throwNoSuchElementException("MutableVector contains no element matching the predicate.");
        throw new KotlinNothingValueException();
    }

    public final int lastIndexOf(T t11) {
        T[] tArr = this.content;
        for (int i11 = this.size - 1; i11 >= 0; i11--) {
            if (g0.g(t11, tArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @l
    public final T lastOrNull(@k x00.l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            ?? r22 = (Object) tArr[size];
            if (lVar.invoke(r22).booleanValue()) {
                return r22;
            }
        }
        return null;
    }

    public final /* synthetic */ <R> R[] map(x00.l<? super T, ? extends R> lVar) {
        int size = getSize();
        g0.y(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            rArr[i11] = lVar.invoke(this.content[i11]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> R[] mapIndexed(p<? super Integer, ? super T, ? extends R> pVar) {
        int size = getSize();
        g0.y(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            rArr[i11] = pVar.invoke(Integer.valueOf(i11), this.content[i11]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(p<? super Integer, ? super T, ? extends R> pVar) {
        int size = getSize();
        g0.y(0, "R?");
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            R invoke = pVar.invoke(Integer.valueOf(i12), tArr[i12]);
            if (invoke != null) {
                objArr[i11] = invoke;
                i11++;
            }
        }
        return new MutableVector<>(objArr, i11);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(x00.l<? super T, ? extends R> lVar) {
        int size = getSize();
        g0.y(0, "R?");
        Object[] objArr = new Object[size];
        T[] tArr = this.content;
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            R invoke = lVar.invoke(tArr[i12]);
            if (invoke != null) {
                objArr[i11] = invoke;
                i11++;
            }
        }
        return new MutableVector<>(objArr, i11);
    }

    public final void minusAssign(T t11) {
        remove(t11);
    }

    public final void plusAssign(T t11) {
        add(t11);
    }

    public final boolean remove(T t11) {
        int indexOf = indexOf(t11);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final boolean removeAll(@k List<? extends T> list) {
        int i11 = this.size;
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            remove(list.get(i12));
        }
        return i11 != this.size;
    }

    public final T removeAt(int i11) {
        T[] tArr = this.content;
        T t11 = tArr[i11];
        if (i11 != getSize() - 1) {
            int i12 = i11 + 1;
            System.arraycopy(tArr, i12, tArr, i11, this.size - i12);
        }
        int i13 = this.size - 1;
        this.size = i13;
        tArr[i13] = null;
        return t11;
    }

    public final void removeIf(@k x00.l<? super T, Boolean> lVar) {
        int size = getSize();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            if (lVar.invoke(this.content[i12]).booleanValue()) {
                i11++;
            } else if (i11 > 0) {
                T[] tArr = this.content;
                tArr[i12 - i11] = tArr[i12];
            }
        }
        int i13 = size - i11;
        a00.q.M1(this.content, null, i13, size);
        setSize(i13);
    }

    public final void removeRange(int i11, int i12) {
        if (i12 > i11) {
            int i13 = this.size;
            if (i12 < i13) {
                T[] tArr = this.content;
                System.arraycopy(tArr, i12, tArr, i11, i13 - i12);
            }
            int i14 = this.size - (i12 - i11);
            int size = getSize() - 1;
            if (i14 <= size) {
                int i15 = i14;
                while (true) {
                    this.content[i15] = null;
                    if (i15 == size) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.size = i14;
        }
    }

    @v0
    public final void resizeStorage(int i11) {
        T[] tArr = this.content;
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[Math.max(i11, length * 2)];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        this.content = tArr2;
    }

    public final boolean retainAll(@k Collection<? extends T> collection) {
        int i11 = this.size;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!collection.contains(this.content[size])) {
                removeAt(size);
            }
        }
        return i11 != this.size;
    }

    public final boolean reversedAny(@k x00.l<? super T, Boolean> lVar) {
        T[] tArr = this.content;
        for (int size = getSize() - 1; size >= 0; size--) {
            if (lVar.invoke(tArr[size]).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final T set(int i11, T t11) {
        T[] tArr = this.content;
        T t12 = tArr[i11];
        tArr[i11] = t11;
        return t12;
    }

    @v0
    public final void setSize(int i11) {
        this.size = i11;
    }

    public final void sortWith(@k Comparator<T> comparator) {
        a00.q.i4(this.content, comparator, 0, this.size);
    }

    public final int sumBy(@k x00.l<? super T, Integer> lVar) {
        T[] tArr = this.content;
        int i11 = 0;
        for (int i12 = 0; i12 < getSize(); i12++) {
            i11 += lVar.invoke(tArr[i12]).intValue();
        }
        return i11;
    }

    @v0
    @k
    public final Void throwNoSuchElementException() {
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    @v0
    @k
    public final Void throwNoSuchElementException(@k String str) {
        throw new NoSuchElementException(str);
    }

    public final boolean containsAll(@k Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @l
    public final T firstOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[0];
    }

    @l
    public final T lastOrNull() {
        if (getSize() == 0) {
            return null;
        }
        return this.content[getSize() - 1];
    }

    public final boolean removeAll(@k MutableVector<T> mutableVector) {
        int i11 = this.size;
        int size = mutableVector.getSize() - 1;
        if (size >= 0) {
            int i12 = 0;
            while (true) {
                remove(mutableVector.content[i12]);
                if (i12 == size) {
                    break;
                }
                i12++;
            }
        }
        return i11 != this.size;
    }

    public final void add(int i11, T t11) {
        int i12 = this.size + 1;
        if (this.content.length < i12) {
            resizeStorage(i12);
        }
        T[] tArr = this.content;
        int i13 = this.size;
        if (i11 != i13) {
            System.arraycopy(tArr, i11, tArr, i11 + 1, i13 - i11);
        }
        tArr[i11] = t11;
        this.size++;
    }

    public final boolean containsAll(@k MutableVector<T> mutableVector) {
        g10.l W1 = g10.u.W1(0, mutableVector.getSize());
        int d11 = W1.d();
        int f11 = W1.f();
        if (d11 > f11) {
            return true;
        }
        while (contains(mutableVector.content[d11])) {
            if (d11 == f11) {
                return true;
            }
            d11++;
        }
        return false;
    }

    public final T first() {
        if (getSize() != 0) {
            return this.content[0];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final T last() {
        if (getSize() != 0) {
            return this.content[getSize() - 1];
        }
        throwNoSuchElementException("MutableVector is empty.");
        throw new KotlinNothingValueException();
    }

    public final boolean removeAll(@k Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i11 = this.size;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return i11 != this.size;
    }

    public final boolean addAll(int i11, @k MutableVector<T> mutableVector) {
        int i12 = mutableVector.size;
        if (i12 == 0) {
            return false;
        }
        int i13 = this.size + i12;
        if (this.content.length < i13) {
            resizeStorage(i13);
        }
        T[] tArr = this.content;
        int i14 = this.size;
        if (i11 != i14) {
            System.arraycopy(tArr, i11, tArr, i11 + i12, i14 - i11);
        }
        System.arraycopy(mutableVector.content, 0, tArr, i11, i12);
        this.size += i12;
        return true;
    }

    @v0
    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean addAll(@k List<? extends T> list) {
        return addAll(getSize(), (List) list);
    }

    public final boolean addAll(@k MutableVector<T> mutableVector) {
        return addAll(getSize(), mutableVector);
    }

    public final boolean addAll(@k T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            return false;
        }
        int i11 = this.size + length;
        if (this.content.length < i11) {
            resizeStorage(i11);
        }
        System.arraycopy(tArr, 0, this.content, this.size, length);
        this.size += length;
        return true;
    }

    public final boolean addAll(int i11, @k Collection<? extends T> collection) {
        int i12 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i13 = this.size + size;
        if (this.content.length < i13) {
            resizeStorage(i13);
        }
        T[] tArr = this.content;
        int i14 = this.size;
        if (i11 != i14) {
            System.arraycopy(tArr, i11, tArr, i11 + size, i14 - i11);
        }
        for (T t11 : collection) {
            int i15 = i12 + 1;
            if (i12 < 0) {
                h0.b0();
            }
            tArr[i12 + i11] = t11;
            i12 = i15;
        }
        this.size += size;
        return true;
    }

    public final boolean addAll(@k Collection<? extends T> collection) {
        return addAll(this.size, collection);
    }
}
