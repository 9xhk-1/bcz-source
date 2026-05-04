package xy;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCaseInsensitiveMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaseInsensitiveMap.kt\nio/ktor/util/CaseInsensitiveMap\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,78:1\n216#2,2:79\n*S KotlinDebug\n*F\n+ 1 CaseInsensitiveMap.kt\nio/ktor/util/CaseInsensitiveMap\n*L\n30#1:79,2\n*E\n"})
/* loaded from: classes8.dex */
public final class s<Value> implements Map<String, Value>, y00.g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<u, Value> f98647a = new LinkedHashMap();

    public static final Map.Entry j(Map.Entry DelegatingMutableSet) {
        kotlin.jvm.internal.g0.p(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return new o0(((u) DelegatingMutableSet.getKey()).a(), DelegatingMutableSet.getValue());
    }

    public static final Map.Entry k(Map.Entry DelegatingMutableSet) {
        kotlin.jvm.internal.g0.p(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return new o0(e2.a((String) DelegatingMutableSet.getKey()), DelegatingMutableSet.getValue());
    }

    public static final String l(u DelegatingMutableSet) {
        kotlin.jvm.internal.g0.p(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return DelegatingMutableSet.a();
    }

    public static final u m(String DelegatingMutableSet) {
        kotlin.jvm.internal.g0.p(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return e2.a(DelegatingMutableSet);
    }

    @Override // java.util.Map
    public void clear() {
        this.f98647a.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return n((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(@m80.l Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f98647a.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Value>> entrySet() {
        return p();
    }

    @Override // java.util.Map
    public boolean equals(@m80.l Object obj) {
        if (obj == null || !(obj instanceof s)) {
            return false;
        }
        return kotlin.jvm.internal.g0.g(((s) obj).f98647a, this.f98647a);
    }

    @Override // java.util.Map
    public final /* bridge */ Value get(Object obj) {
        if (obj instanceof String) {
            return o((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f98647a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f98647a.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return r();
    }

    public boolean n(@m80.k String key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return this.f98647a.containsKey(new u(key));
    }

    @m80.l
    public Value o(@m80.k String key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return this.f98647a.get(e2.a(key));
    }

    @m80.k
    public Set<Map.Entry<String, Value>> p() {
        return new j0(this.f98647a.entrySet(), new x00.l() { // from class: xy.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                Map.Entry j11;
                j11 = s.j((Map.Entry) obj);
                return j11;
            }
        }, new x00.l() { // from class: xy.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                Map.Entry k11;
                k11 = s.k((Map.Entry) obj);
                return k11;
            }
        });
    }

    @Override // java.util.Map
    public void putAll(@m80.k Map<? extends String, ? extends Value> from) {
        kotlin.jvm.internal.g0.p(from, "from");
        for (Map.Entry<? extends String, ? extends Value> entry : from.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @m80.k
    public Set<String> r() {
        return new j0(this.f98647a.keySet(), new x00.l() { // from class: xy.q
            @Override // x00.l
            public final Object invoke(Object obj) {
                String l11;
                l11 = s.l((u) obj);
                return l11;
            }
        }, new x00.l() { // from class: xy.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                u m11;
                m11 = s.m((String) obj);
                return m11;
            }
        });
    }

    @Override // java.util.Map
    public final /* bridge */ Value remove(Object obj) {
        if (obj instanceof String) {
            return v((String) obj);
        }
        return null;
    }

    public int s() {
        return this.f98647a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return s();
    }

    @m80.k
    public Collection<Value> t() {
        return this.f98647a.values();
    }

    @Override // java.util.Map
    @m80.l
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Value put(@m80.k String key, @m80.k Value value) {
        kotlin.jvm.internal.g0.p(key, "key");
        kotlin.jvm.internal.g0.p(value, "value");
        return this.f98647a.put(e2.a(key), value);
    }

    @m80.l
    public Value v(@m80.k String key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return this.f98647a.remove(e2.a(key));
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return t();
    }
}
