package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import m80.k;
import m80.l;
import y00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ImmutableMapAdapter<K, V> implements ImmutableMap<K, V>, Map<K, V>, a {
    public static final int $stable = 8;

    @k
    private final ImmutableSet<Map.Entry<K, V>> entries;

    @k
    private final Map<K, V> impl;

    @k
    private final ImmutableSet<K> keys;

    @k
    private final ImmutableCollection<V> values;

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableMapAdapter(@k Map<K, ? extends V> map) {
        this.impl = map;
        this.keys = new ImmutableSetAdapter(map.keySet());
        this.values = new ImmutableCollectionAdapter(map.values());
        this.entries = new ImmutableSetAdapter(map.entrySet());
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V compute(K k11, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfAbsent(K k11, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V computeIfPresent(K k11, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.impl.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.impl.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ ImmutableSet<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@l Object obj) {
        return this.impl.equals(obj);
    }

    @Override // java.util.Map
    @l
    public V get(Object obj) {
        return this.impl.get(obj);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @k
    public ImmutableSet<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @k
    public ImmutableSet<K> getKeys() {
        return this.keys;
    }

    public int getSize() {
        return this.impl.size();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableMap
    @k
    public ImmutableCollection<V> getValues() {
        return this.values;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.impl.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.impl.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ ImmutableSet<K> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public V merge(K k11, V v11, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V put(K k11, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V putIfAbsent(K k11, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public V replace(K k11, V v11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @k
    public String toString() {
        return this.impl.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ ImmutableCollection<V> values() {
        return getValues();
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(K k11, V v11, V v12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
