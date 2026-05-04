package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry;
import java.util.Map;
import m80.k;
import y00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class MutableMapEntry<K, V> extends MapEntry<K, V> implements Map.Entry<K, V>, g.a {

    @k
    private LinkedValue<V> links;

    @k
    private final Map<K, LinkedValue<V>> mutableMap;

    public MutableMapEntry(@k Map<K, LinkedValue<V>> map, K k11, @k LinkedValue<V> linkedValue) {
        super(k11, linkedValue.getValue());
        this.mutableMap = map;
        this.links = linkedValue;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V getValue() {
        return this.links.getValue();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.MapEntry, java.util.Map.Entry
    public V setValue(V v11) {
        V value = this.links.getValue();
        this.links = this.links.withValue(v11);
        this.mutableMap.put(getKey(), this.links);
        return value;
    }
}
