package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.u0;
import m80.k;
import q30.q;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n1726#2,3:57\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapper\n*L\n33#1:57,3\n*E\n"})
/* loaded from: classes.dex */
public final class ScatterSetWrapper<T> implements Set<T>, a {
    public static final int $stable = 8;

    @k
    private final ScatterSet<T> set;

    public ScatterSetWrapper(@k ScatterSet<T> scatterSet) {
        this.set = scatterSet;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.set.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @k
    public final ScatterSet<T> getSet$runtime_release() {
        return this.set;
    }

    public int getSize() {
        return this.set.getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.set.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<T> iterator() {
        return q.a(new ScatterSetWrapper$iterator$1(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return u.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) u.b(this, tArr);
    }
}
