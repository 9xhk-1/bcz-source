package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import a00.j;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Set;
import m80.k;
import y00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashMapBuilderKeys<K, V> extends j<K> implements Set<K>, h {
    public static final int $stable = 8;

    @k
    private final PersistentHashMapBuilder<K, V> builder;

    public PersistentHashMapBuilderKeys(@k PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        this.builder = persistentHashMapBuilder;
    }

    @Override // a00.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.builder.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.builder.containsKey(obj);
    }

    @Override // a00.j
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public Iterator<K> iterator() {
        return new PersistentHashMapBuilderKeysIterator(this.builder);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.builder.containsKey(obj)) {
            return false;
        }
        this.builder.remove(obj);
        return true;
    }
}
