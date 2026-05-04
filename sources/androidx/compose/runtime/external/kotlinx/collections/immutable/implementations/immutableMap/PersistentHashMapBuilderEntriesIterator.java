package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.Map;
import m80.k;
import y00.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PersistentHashMapBuilderEntriesIterator<K, V> implements Iterator<Map.Entry<K, V>>, d {
    public static final int $stable = 8;

    @k
    private final PersistentHashMapBuilderBaseIterator<K, V, Map.Entry<K, V>> base;

    public PersistentHashMapBuilderEntriesIterator(@k PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i11 = 0; i11 < 8; i11++) {
            trieNodeBaseIteratorArr[i11] = new TrieNodeMutableEntriesIterator(this);
        }
        this.base = new PersistentHashMapBuilderBaseIterator<>(persistentHashMapBuilder, trieNodeBaseIteratorArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.base.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.base.remove();
    }

    public final void setValue(K k11, V v11) {
        this.base.setValue(k11, v11);
    }

    @Override // java.util.Iterator
    @k
    public Map.Entry<K, V> next() {
        return this.base.next();
    }
}
