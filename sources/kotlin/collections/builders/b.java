package kotlin.collections.builders;

import a00.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import y00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b<E> extends j<E> implements Set<E>, h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final MapBuilder<E, ?> f66927a;

    public b(@k MapBuilder<E, ?> backing) {
        g0.p(backing, "backing");
        this.f66927a = backing;
    }

    @Override // a00.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@k Collection<? extends E> elements) {
        g0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f66927a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f66927a.containsKey(obj);
    }

    @Override // a00.j
    public int getSize() {
        return this.f66927a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f66927a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public Iterator<E> iterator() {
        return this.f66927a.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f66927a.removeKey$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@k Collection<?> elements) {
        g0.p(elements, "elements");
        this.f66927a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@k Collection<?> elements) {
        g0.p(elements, "elements");
        this.f66927a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}
