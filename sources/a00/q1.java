package a00;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,111:1\n348#2,6:112\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MutableMapWithDefaultImpl\n*L\n108#1:112,6\n*E\n"})
/* loaded from: classes8.dex */
public final class q1<K, V> implements p1<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<K, V> f1131a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<K, V> f1132b;

    /* JADX WARN: Multi-variable type inference failed */
    public q1(@m80.k Map<K, V> map, @m80.k x00.l<? super K, ? extends V> lVar) {
        kotlin.jvm.internal.g0.p(map, "map");
        kotlin.jvm.internal.g0.p(lVar, "default");
        this.f1131a = map;
        this.f1132b = lVar;
    }

    @m80.k
    public Set<Map.Entry<K, V>> b() {
        return q().entrySet();
    }

    @Override // a00.g1
    public V c0(K k11) {
        Map<K, V> q11 = q();
        V v11 = q11.get(k11);
        return (v11 != null || q11.containsKey(k11)) ? v11 : this.f1132b.invoke(k11);
    }

    @Override // java.util.Map
    public void clear() {
        q().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return q().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return q().containsValue(obj);
    }

    @m80.k
    public Set<K> d() {
        return q().keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return b();
    }

    @Override // java.util.Map
    public boolean equals(@m80.l Object obj) {
        return q().equals(obj);
    }

    public int g() {
        return q().size();
    }

    @Override // java.util.Map
    @m80.l
    public V get(Object obj) {
        return q().get(obj);
    }

    @m80.k
    public Collection<V> h() {
        return q().values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return q().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return q().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return d();
    }

    @Override // java.util.Map
    @m80.l
    public V put(K k11, V v11) {
        return q().put(k11, v11);
    }

    @Override // java.util.Map
    public void putAll(@m80.k Map<? extends K, ? extends V> from) {
        kotlin.jvm.internal.g0.p(from, "from");
        q().putAll(from);
    }

    @Override // a00.p1, a00.g1
    @m80.k
    public Map<K, V> q() {
        return this.f1131a;
    }

    @Override // java.util.Map
    @m80.l
    public V remove(Object obj) {
        return q().remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return g();
    }

    @m80.k
    public String toString() {
        return q().toString();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return h();
    }
}
