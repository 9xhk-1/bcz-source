package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import y00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class MutableSetWrapper<E> extends SetWrapper<E> implements Set<E>, h {

    @k
    private final MutableScatterSet<E> parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper(@k MutableScatterSet<E> parent) {
        super(parent);
        g0.p(parent, "parent");
        this.parent = parent;
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public boolean add(E e11) {
        return this.parent.add(e11);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public boolean addAll(@k Collection<? extends E> elements) {
        g0.p(elements, "elements");
        return this.parent.addAll(elements);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public void clear() {
        this.parent.clear();
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<E> iterator() {
        return new MutableSetWrapper$iterator$1(this);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.parent.remove(obj);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public boolean removeAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        return this.parent.removeAll(elements);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public boolean retainAll(@k Collection<? extends Object> elements) {
        g0.p(elements, "elements");
        return this.parent.retainAll(elements);
    }
}
