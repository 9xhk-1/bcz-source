package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import a00.g;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import m80.k;
import y00.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderValues<K, V> extends g<V> implements Collection<V>, b {
    public static final int $stable = 8;

    @k
    private final PersistentOrderedMapBuilder<K, V> builder;

    public PersistentOrderedMapBuilderValues(@k PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.builder = persistentOrderedMapBuilder;
    }

    @Override // a00.g, java.util.AbstractCollection, java.util.Collection
    public boolean add(V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.builder.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.builder.containsValue(obj);
    }

    @Override // a00.g
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @k
    public Iterator<V> iterator() {
        return new PersistentOrderedMapBuilderValuesIterator(this.builder);
    }
}
