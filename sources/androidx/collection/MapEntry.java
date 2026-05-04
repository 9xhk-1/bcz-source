package androidx.collection;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class MapEntry<K, V> implements Map.Entry<K, V>, y00.a {
    private final K key;
    private final V value;

    public MapEntry(K k11, V v11) {
        this.key = k11;
        this.value = v11;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
