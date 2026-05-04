package j50;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class f1<K, V> extends p1<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final h50.f f63355c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(@m80.k f50.i<K> kSerializer, @m80.k f50.i<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.g0.p(kSerializer, "kSerializer");
        kotlin.jvm.internal.g0.p(vSerializer, "vSerializer");
        this.f63355c = new e1(kSerializer.a(), vSerializer.a());
    }

    @Override // j50.a
    @m80.k
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> j(@m80.k Map<K, ? extends V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // j50.a
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int k(@m80.k Map<K, ? extends V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return map.size();
    }

    @Override // j50.p1
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void u(@m80.k LinkedHashMap<K, V> linkedHashMap, int i11, K k11, V v11) {
        kotlin.jvm.internal.g0.p(linkedHashMap, "<this>");
        linkedHashMap.put(k11, v11);
    }

    @Override // j50.a
    @m80.k
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> q(@m80.k Map<K, ? extends V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }

    @Override // j50.a
    @m80.k
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public Map<K, V> r(@m80.k LinkedHashMap<K, V> linkedHashMap) {
        kotlin.jvm.internal.g0.p(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // j50.p1, f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f63355c;
    }

    @Override // j50.a
    @m80.k
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> g() {
        return new LinkedHashMap<>();
    }

    @Override // j50.a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public int h(@m80.k LinkedHashMap<K, V> linkedHashMap) {
        kotlin.jvm.internal.g0.p(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    @Override // j50.a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void i(@m80.k LinkedHashMap<K, V> linkedHashMap, int i11) {
        kotlin.jvm.internal.g0.p(linkedHashMap, "<this>");
    }
}
