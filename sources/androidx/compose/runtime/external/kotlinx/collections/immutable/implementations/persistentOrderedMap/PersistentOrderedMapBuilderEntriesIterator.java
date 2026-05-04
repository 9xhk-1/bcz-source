package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import m80.k;
import y00.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, d {
    public static final int $stable = 8;

    @k
    private final PersistentOrderedMapBuilderLinksIterator<K, V> internal;

    public PersistentOrderedMapBuilderEntriesIterator(@k PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.internal = new PersistentOrderedMapBuilderLinksIterator<>(persistentOrderedMapBuilder.getFirstKey$runtime_release(), persistentOrderedMapBuilder);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.internal.remove();
    }

    @Override // java.util.Iterator
    @k
    public Map.Entry<K, V> next() {
        return new MutableMapEntry(this.internal.getBuilder$runtime_release().getHashMapBuilder$runtime_release(), this.internal.getLastIteratedKey$runtime_release(), this.internal.next());
    }
}
