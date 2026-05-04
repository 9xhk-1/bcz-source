package androidx.collection.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LruHashMap<K, V> {

    @k
    private final LinkedHashMap<K, V> map;

    public LruHashMap() {
        this(0, 0.0f, 3, null);
    }

    @l
    public final V get(@k K key) {
        g0.p(key, "key");
        return this.map.get(key);
    }

    @k
    public final Set<Map.Entry<K, V>> getEntries() {
        Set<Map.Entry<K, V>> entrySet = this.map.entrySet();
        g0.o(entrySet, "<get-entries>(...)");
        return entrySet;
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    @l
    public final V put(@k K key, @k V value) {
        g0.p(key, "key");
        g0.p(value, "value");
        return this.map.put(key, value);
    }

    @l
    public final V remove(@k K key) {
        g0.p(key, "key");
        return this.map.remove(key);
    }

    public LruHashMap(int i11, float f11) {
        this.map = new LinkedHashMap<>(i11, f11, true);
    }

    public /* synthetic */ LruHashMap(int i11, float f11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 16 : i11, (i12 & 2) != 0 ? 0.75f : f11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LruHashMap(@k LruHashMap<? extends K, V> original) {
        this(0, 0.0f, 3, null);
        g0.p(original, "original");
        for (Map.Entry<? extends K, V> entry : original.getEntries()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
