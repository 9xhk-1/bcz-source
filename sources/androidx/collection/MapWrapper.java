package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MapWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1787:1\n1#2:1788\n*E\n"})
/* loaded from: classes.dex */
class MapWrapper<K, V> implements Map<K, V>, y00.a {

    @l
    private Entries<K, V> _entries;

    @l
    private Keys<K, V> _keys;

    @l
    private Values<K, V> _values;

    @k
    private final ScatterMap<K, V> parent;

    public MapWrapper(@k ScatterMap<K, V> parent) {
        g0.p(parent, "parent");
        this.parent = parent;
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
        return this.parent.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.parent.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return g0.g(this.parent, ((MapWrapper) obj).parent);
    }

    @Override // java.util.Map
    @l
    public V get(Object obj) {
        return this.parent.get(obj);
    }

    @k
    public Set<Map.Entry<K, V>> getEntries() {
        Entries<K, V> entries = this._entries;
        if (entries != null) {
            return entries;
        }
        Entries<K, V> entries2 = new Entries<>(this.parent);
        this._entries = entries2;
        return entries2;
    }

    @k
    public Set<K> getKeys() {
        Keys<K, V> keys = this._keys;
        if (keys != null) {
            return keys;
        }
        Keys<K, V> keys2 = new Keys<>(this.parent);
        this._keys = keys2;
        return keys2;
    }

    public int getSize() {
        return this.parent._size;
    }

    @k
    public Collection<V> getValues() {
        Values<K, V> values = this._values;
        if (values != null) {
            return values;
        }
        Values<K, V> values2 = new Values<>(this.parent);
        this._values = values2;
        return values2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.parent.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.parent.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
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
        return this.parent.toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
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
