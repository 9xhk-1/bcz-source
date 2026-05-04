package a00;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.y0(version = "1.1")
/* loaded from: classes8.dex */
public abstract class i<K, V> extends AbstractMap<K, V> implements Map<K, V>, y00.g {
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    public abstract Set<Map.Entry<K, V>> getEntries();

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @m80.l
    public abstract V put(K k11, V v11);

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }
}
