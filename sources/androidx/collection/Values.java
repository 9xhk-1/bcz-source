package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import m80.k;
import q30.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/Values\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1787:1\n1726#2,3:1788\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/Values\n*L\n1450#1:1788,3\n*E\n"})
/* loaded from: classes.dex */
final class Values<K, V> implements Collection<V>, y00.a {

    @k
    private final ScatterMap<K, V> parent;

    public Values(@k ScatterMap<K, V> parent) {
        g0.p(parent, "parent");
        this.parent = parent;
    }

    @Override // java.util.Collection
    public boolean add(V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends V> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.parent.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!this.parent.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.parent._size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @k
    public Iterator<V> iterator() {
        return q.a(new Values$iterator$1(this, null));
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super V> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        g0.p(array, "array");
        return (T[]) u.b(this, array);
    }
}
