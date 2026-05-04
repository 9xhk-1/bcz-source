package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.Internal;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MapFieldLite<K, V> extends LinkedHashMap<K, V> {
    private static final MapFieldLite<?, ?> EMPTY_MAP_FIELD;
    private boolean isMutable;

    static {
        MapFieldLite<?, ?> mapFieldLite = new MapFieldLite<>();
        EMPTY_MAP_FIELD = mapFieldLite;
        mapFieldLite.makeImmutable();
    }

    private MapFieldLite() {
        this.isMutable = true;
    }

    public static <K, V> int calculateHashCodeForMap(Map<K, V> a11) {
        int i11 = 0;
        for (Map.Entry<K, V> entry : a11.entrySet()) {
            i11 += calculateHashCodeForObject(entry.getValue()) ^ calculateHashCodeForObject(entry.getKey());
        }
        return i11;
    }

    private static int calculateHashCodeForObject(Object a11) {
        if (a11 instanceof byte[]) {
            return Internal.hashCode((byte[]) a11);
        }
        if (a11 instanceof Internal.EnumLite) {
            throw new UnsupportedOperationException();
        }
        return a11.hashCode();
    }

    private static void checkForNullKeysAndValues(Map<?, ?> m11) {
        for (Object obj : m11.keySet()) {
            Internal.checkNotNull(obj);
            Internal.checkNotNull(m11.get(obj));
        }
    }

    private static Object copy(Object object) {
        if (!(object instanceof byte[])) {
            return object;
        }
        byte[] bArr = (byte[]) object;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static <K, V> MapFieldLite<K, V> emptyMapField() {
        return (MapFieldLite<K, V>) EMPTY_MAP_FIELD;
    }

    private void ensureMutable() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean equals(Object a11, Object b11) {
        return ((a11 instanceof byte[]) && (b11 instanceof byte[])) ? Arrays.equals((byte[]) a11, (byte[]) b11) : a11.equals(b11);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        ensureMutable();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public void mergeFrom(MapFieldLite<K, V> other) {
        ensureMutable();
        if (other.isEmpty()) {
            return;
        }
        putAll(other);
    }

    public MapFieldLite<K, V> mutableCopy() {
        return isEmpty() ? new MapFieldLite<>() : new MapFieldLite<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        ensureMutable();
        Internal.checkNotNull(k11);
        Internal.checkNotNull(v11);
        return (V) super.put(k11, v11);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m11) {
        ensureMutable();
        checkForNullKeysAndValues(m11);
        super.putAll(m11);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        ensureMutable();
        return (V) super.remove(obj);
    }

    private MapFieldLite(Map<K, V> mapData) {
        super(mapData);
        this.isMutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), copy(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> boolean equals(Map<K, V> a11, Map<K, V> b11) {
        if (a11 == b11) {
            return true;
        }
        if (a11.size() != b11.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : a11.entrySet()) {
            if (!b11.containsKey(entry.getKey()) || !equals(entry.getValue(), b11.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object object) {
        return (object instanceof Map) && equals((Map) this, (Map) object);
    }
}
