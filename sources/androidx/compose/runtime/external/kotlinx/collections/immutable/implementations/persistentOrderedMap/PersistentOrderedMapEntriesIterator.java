package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import m80.k;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentOrderedMapEntriesIterator<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, a {
    public static final int $stable = 8;

    @k
    private final PersistentOrderedMapLinksIterator<K, V> internal;

    public PersistentOrderedMapEntriesIterator(@k PersistentOrderedMap<K, V> persistentOrderedMap) {
        this.internal = new PersistentOrderedMapLinksIterator<>(persistentOrderedMap.getFirstKey$runtime_release(), persistentOrderedMap.getHashMap$runtime_release());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.internal.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Iterator
    @k
    public Map.Entry<K, V> next() {
        return new MapEntry(this.internal.getNextKey$runtime_release(), this.internal.next().getValue());
    }
}
