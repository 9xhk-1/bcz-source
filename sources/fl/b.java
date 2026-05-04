package fl;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class b<K, V> extends ArrayMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public int f51990a;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public void clear() {
        this.f51990a = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public int hashCode() {
        if (this.f51990a == 0) {
            this.f51990a = super.hashCode();
        }
        return this.f51990a;
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public V put(K k11, V v11) {
        this.f51990a = 0;
        return (V) super.put(k11, v11);
    }

    @Override // androidx.collection.SimpleArrayMap
    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f51990a = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V removeAt(int i11) {
        this.f51990a = 0;
        return (V) super.removeAt(i11);
    }

    @Override // androidx.collection.SimpleArrayMap
    public V setValueAt(int i11, V v11) {
        this.f51990a = 0;
        return (V) super.setValueAt(i11, v11);
    }
}
