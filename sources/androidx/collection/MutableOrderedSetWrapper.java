package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import y00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class MutableOrderedSetWrapper<E> extends OrderedSetWrapper<E> implements Set<E>, h {

    @k
    private final MutableOrderedScatterSet<E> parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper(@k MutableOrderedScatterSet<E> parent) {
        super(parent);
        g0.p(parent, "parent");
        this.parent = parent;
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean add(E e11) {
        return this.parent.add(e11);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean addAll(@k Collection<? extends E> elements) {
        g0.p(elements, "elements");
        return this.parent.addAll(elements);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<E> iterator() {
        return new MutableOrderedSetWrapper$iterator$1(this);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.parent.remove(obj);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean removeAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        return this.parent.removeAll(elements);
    }

    @Override // androidx.collection.OrderedSetWrapper, java.util.Set, java.util.Collection
    public boolean retainAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        return this.parent.retainAll(elements);
    }
}
