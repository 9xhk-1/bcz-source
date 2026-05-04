package io.ktor.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nio/ktor/util/LRUCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
/* loaded from: classes8.dex */
public final class LRUCache<K, V> extends LinkedHashMap<K, V> {

    @k
    private final l<V, g2> close;
    private final int maxSize;

    @k
    private final l<K, V> supplier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LRUCache(@k l<? super K, ? extends V> supplier, @k l<? super V, g2> close, int i11) {
        super(10, 0.75f, true);
        g0.p(supplier, "supplier");
        g0.p(close, "close");
        this.supplier = supplier;
        this.close = close;
        this.maxSize = i11;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) getEntries();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        if (this.maxSize == 0) {
            return this.supplier.invoke(obj);
        }
        synchronized (this) {
            V v11 = (V) super.get(obj);
            if (v11 != null) {
                return v11;
            }
            V invoke = this.supplier.invoke(obj);
            put(obj, invoke);
            return invoke;
        }
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(@k Map.Entry<? extends K, ? extends V> eldest) {
        g0.p(eldest, "eldest");
        boolean z11 = size() > this.maxSize;
        if (z11) {
            this.close.invoke(eldest.getValue());
        }
        return z11;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }
}
