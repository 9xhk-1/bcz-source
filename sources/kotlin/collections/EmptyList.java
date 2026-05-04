package kotlin.collections;

import a00.t0;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import m80.k;
import m80.l;
import okhttp3.i;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class EmptyList implements List, Serializable, RandomAccess, a {

    @k
    public static final EmptyList INSTANCE = new EmptyList();
    private static final long serialVersionUID = -7390468764508069838L;

    private EmptyList() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(@k Void element) {
        g0.p(element, "element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@k Collection elements) {
        g0.p(elements, "elements");
        return elements.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@l Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int getSize() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    public int indexOf(@k Void element) {
        g0.p(element, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @k
    public Iterator iterator() {
        return t0.f1145a;
    }

    public int lastIndexOf(@k Void element) {
        g0.p(element, "element");
        return -1;
    }

    @Override // java.util.List
    @k
    public ListIterator listIterator() {
        return t0.f1145a;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    @k
    public List subList(int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i11 + ", toIndex: " + i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @k
    public String toString() {
        return i.f77289p;
    }

    public void add(int i11, Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return contains((Void) obj);
        }
        return false;
    }

    @Override // java.util.List
    @k
    public Void get(int i11) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i11 + '.');
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return indexOf((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return lastIndexOf((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    @k
    public ListIterator listIterator(int i11) {
        if (i11 == 0) {
            return t0.f1145a;
        }
        throw new IndexOutOfBoundsException("Index: " + i11);
    }

    @Override // java.util.List
    public Void remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Void set(int i11, Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        g0.p(array, "array");
        return (T[]) u.b(this, array);
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean add(Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
