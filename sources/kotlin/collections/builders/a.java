package kotlin.collections.builders;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a<K, V> extends b00.a<Map.Entry<K, V>, K, V> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final MapBuilder<K, V> f66926a;

    public a(@k MapBuilder<K, V> backing) {
        g0.p(backing, "backing");
        this.f66926a = backing;
    }

    @k
    public final MapBuilder<K, V> a() {
        return this.f66926a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(@k Collection<? extends Map.Entry<K, V>> elements) {
        g0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f66926a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(@k Collection<?> elements) {
        g0.p(elements, "elements");
        return this.f66926a.containsAllEntries$kotlin_stdlib(elements);
    }

    @Override // b00.a
    public boolean containsEntry(@k Map.Entry<? extends K, ? extends V> element) {
        g0.p(element, "element");
        return this.f66926a.containsEntry$kotlin_stdlib(element);
    }

    @Override // a00.j
    public int getSize() {
        return this.f66926a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f66926a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.f66926a.entriesIterator$kotlin_stdlib();
    }

    @Override // b00.a
    public boolean remove(@k Map.Entry<K, V> element) {
        g0.p(element, "element");
        return this.f66926a.removeEntry$kotlin_stdlib(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(@k Collection<?> elements) {
        g0.p(elements, "elements");
        this.f66926a.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(@k Collection<?> elements) {
        g0.p(elements, "elements");
        this.f66926a.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }

    @Override // a00.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(@k Map.Entry<K, V> element) {
        g0.p(element, "element");
        throw new UnsupportedOperationException();
    }
}
