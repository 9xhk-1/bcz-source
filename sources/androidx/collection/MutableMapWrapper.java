package androidx.collection;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import y00.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableMapWrapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1787:1\n1#2:1788\n215#3,2:1789\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableMapWrapper\n*L\n1782#1:1789,2\n*E\n"})
/* loaded from: classes.dex */
final class MutableMapWrapper<K, V> extends MapWrapper<K, V> implements Map<K, V>, g {

    @l
    private MutableEntries<K, V> _entries;

    @l
    private MutableKeys<K, V> _keys;

    @l
    private MutableValues<K, V> _values;

    @k
    private final MutableScatterMap<K, V> parent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableMapWrapper(@k MutableScatterMap<K, V> parent) {
        super(parent);
        g0.p(parent, "parent");
        this.parent = parent;
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public void clear() {
        this.parent.clear();
    }

    @Override // androidx.collection.MapWrapper
    @k
    public Set<Map.Entry<K, V>> getEntries() {
        MutableEntries<K, V> mutableEntries = this._entries;
        if (mutableEntries != null) {
            return mutableEntries;
        }
        MutableEntries<K, V> mutableEntries2 = new MutableEntries<>(this.parent);
        this._entries = mutableEntries2;
        return mutableEntries2;
    }

    @Override // androidx.collection.MapWrapper
    @k
    public Set<K> getKeys() {
        MutableKeys<K, V> mutableKeys = this._keys;
        if (mutableKeys != null) {
            return mutableKeys;
        }
        MutableKeys<K, V> mutableKeys2 = new MutableKeys<>(this.parent);
        this._keys = mutableKeys2;
        return mutableKeys2;
    }

    @Override // androidx.collection.MapWrapper
    @k
    public Collection<V> getValues() {
        MutableValues<K, V> mutableValues = this._values;
        if (mutableValues != null) {
            return mutableValues;
        }
        MutableValues<K, V> mutableValues2 = new MutableValues<>(this.parent);
        this._values = mutableValues2;
        return mutableValues2;
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    @l
    public V put(K k11, V v11) {
        return this.parent.put(k11, v11);
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    public void putAll(@k Map<? extends K, ? extends V> from) {
        g0.p(from, "from");
        for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
            this.parent.set(entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.collection.MapWrapper, java.util.Map
    @l
    public V remove(Object obj) {
        return this.parent.remove(obj);
    }
}
