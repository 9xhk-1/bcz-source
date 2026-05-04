package androidx.compose.runtime.snapshots;

import a00.d1;
import androidx.compose.runtime.PreconditionsKt;
import g10.u;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import y00.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n*L\n1#1,539:1\n1726#2,3:540\n1855#2,2:543\n33#3,5:545\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n*L\n383#1:540,3\n393#1:543,2\n526#1:545,5\n*E\n"})
/* loaded from: classes.dex */
final class SubList<T> implements List<T>, e {
    private final int offset;

    @k
    private final SnapshotStateList<T> parentList;
    private int size;
    private int structure;

    public SubList(@k SnapshotStateList<T> snapshotStateList, int i11, int i12) {
        this.parentList = snapshotStateList;
        this.offset = i11;
        this.structure = snapshotStateList.getStructure$runtime_release();
        this.size = i12 - i11;
    }

    private final void validateModification() {
        if (this.parentList.getStructure$runtime_release() != this.structure) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t11) {
        validateModification();
        this.parentList.add(this.offset + size(), t11);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i11, @k Collection<? extends T> collection) {
        validateModification();
        boolean addAll = this.parentList.addAll(i11 + this.offset, collection);
        if (addAll) {
            this.size = size() + collection.size();
            this.structure = this.parentList.getStructure$runtime_release();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            validateModification();
            SnapshotStateList<T> snapshotStateList = this.parentList;
            int i11 = this.offset;
            snapshotStateList.removeRange(i11, size() + i11);
            this.size = 0;
            this.structure = this.parentList.getStructure$runtime_release();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public T get(int i11) {
        validateModification();
        SnapshotStateListKt.validateRange(i11, size());
        return this.parentList.get(this.offset + i11);
    }

    @k
    public final SnapshotStateList<T> getParentList() {
        return this.parentList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        validateModification();
        int i11 = this.offset;
        Iterator<Integer> it = u.W1(i11, size() + i11).iterator();
        while (it.hasNext()) {
            int nextInt = ((d1) it).nextInt();
            if (g0.g(obj, this.parentList.get(nextInt))) {
                return nextInt - this.offset;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        validateModification();
        int size = this.offset + size();
        do {
            size--;
            if (size < this.offset) {
                return -1;
            }
        } while (!g0.g(obj, this.parentList.get(size)));
        return size - this.offset;
    }

    @Override // java.util.List
    @k
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i11) {
        return removeAt(i11);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@k Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z11 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z11) {
                    z11 = true;
                }
            }
            return z11;
        }
    }

    public T removeAt(int i11) {
        validateModification();
        T remove = this.parentList.remove(this.offset + i11);
        this.size = size() - 1;
        this.structure = this.parentList.getStructure$runtime_release();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@k Collection<? extends Object> collection) {
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i11 = this.offset;
        int retainAllInRange$runtime_release = snapshotStateList.retainAllInRange$runtime_release(collection, i11, size() + i11);
        if (retainAllInRange$runtime_release > 0) {
            this.structure = this.parentList.getStructure$runtime_release();
            this.size = size() - retainAllInRange$runtime_release;
        }
        return retainAllInRange$runtime_release > 0;
    }

    @Override // java.util.List
    public T set(int i11, T t11) {
        SnapshotStateListKt.validateRange(i11, size());
        validateModification();
        T t12 = this.parentList.set(i11 + this.offset, t11);
        this.structure = this.parentList.getStructure$runtime_release();
        return t12;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @k
    public List<T> subList(int i11, int i12) {
        if (!(i11 >= 0 && i11 <= i12 && i12 <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        validateModification();
        SnapshotStateList<T> snapshotStateList = this.parentList;
        int i13 = this.offset;
        return new SubList(snapshotStateList, i11 + i13, i12 + i13);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.u.a(this);
    }

    @Override // java.util.List
    @k
    public ListIterator<T> listIterator(int i11) {
        validateModification();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i11 - 1;
        return new SubList$listIterator$1(intRef, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.u.b(this, tArr);
    }

    @Override // java.util.List
    public void add(int i11, T t11) {
        validateModification();
        this.parentList.add(this.offset + i11, t11);
        this.size = size() + 1;
        this.structure = this.parentList.getStructure$runtime_release();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@k Collection<? extends T> collection) {
        return addAll(size(), collection);
    }
}
