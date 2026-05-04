package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import m80.k;
import y00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, g.a {

    @k
    private final PersistentHashMapBuilderEntriesIterator<K, V> parentIterator;
    private V value;

    public MutableMapEntry(@k PersistentHashMapBuilderEntriesIterator<K, V> persistentHashMapBuilderEntriesIterator, K k11, V v11) {
        super(k11, v11);
        this.parentIterator = persistentHashMapBuilderEntriesIterator;
        this.value = v11;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public void setValue(V v11) {
        this.value = v11;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V setValue(V v11) {
        V value = getValue();
        setValue((MutableMapEntry<K, V>) v11);
        this.parentIterator.setValue(getKey(), v11);
        return value;
    }
}
