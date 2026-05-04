package y;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i<K, V> implements Map<K, V>, y00.g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public Map<K, V> f98783a;

    public i(@k Map<K, V> map) {
        g0.p(map, "map");
        this.f98783a = map;
    }

    @k
    public Set<Map.Entry<K, V>> b() {
        return this.f98783a.entrySet();
    }

    @Override // java.util.Map
    public void clear() {
        this.f98783a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f98783a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f98783a.containsValue(obj);
    }

    @k
    public Set<K> d() {
        return this.f98783a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return b();
    }

    @k
    public final Map<K, V> g() {
        return this.f98783a;
    }

    @Override // java.util.Map
    @l
    public V get(Object obj) {
        return this.f98783a.get(obj);
    }

    public int h() {
        return this.f98783a.size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f98783a.isEmpty();
    }

    @k
    public Collection<V> j() {
        return this.f98783a.values();
    }

    public final void k(@k Map<K, V> map) {
        g0.p(map, "<set-?>");
        this.f98783a = map;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return d();
    }

    @Override // java.util.Map
    @l
    public V put(K k11, V v11) {
        return this.f98783a.put(k11, v11);
    }

    @Override // java.util.Map
    public void putAll(@k Map<? extends K, ? extends V> from) {
        g0.p(from, "from");
        this.f98783a.putAll(from);
    }

    @Override // java.util.Map
    @l
    public V remove(Object obj) {
        return this.f98783a.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return j();
    }
}
