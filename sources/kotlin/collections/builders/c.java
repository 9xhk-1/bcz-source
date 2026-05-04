package kotlin.collections.builders;

import a00.g;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c<V> extends g<V> implements Collection<V>, y00.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final MapBuilder<?, V> f66928a;

    public c(@k MapBuilder<?, V> backing) {
        g0.p(backing, "backing");
        this.f66928a = backing;
    }

    @k
    public final MapBuilder<?, V> a() {
        return this.f66928a;
    }

    @Override // a00.g, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(@k Collection<? extends V> elements) {
        g0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f66928a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f66928a.containsValue(obj);
    }

    @Override // a00.g
    public int getSize() {
        return this.f66928a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f66928a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<V> iterator() {
        return this.f66928a.valuesIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f66928a.removeValue$kotlin_stdlib(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(@k Collection<?> elements) {
        g0.p(elements, "elements");
        this.f66928a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(@k Collection<?> elements) {
        g0.p(elements, "elements");
        this.f66928a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}
