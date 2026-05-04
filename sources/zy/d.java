package zy;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d<Key, Value> implements Map<Key, Value>, y00.g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ConcurrentHashMap<Key, Value> f103144a;

    public d() {
        this(0, 1, null);
    }

    public static final Object h(x00.a aVar, Object obj) {
        return aVar.invoke();
    }

    public static final Object j(l lVar, Object obj) {
        return lVar.invoke(obj);
    }

    @Override // java.util.Map
    public void clear() {
        this.f103144a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f103144a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f103144a.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<Key, Value>> entrySet() {
        return k();
    }

    @Override // java.util.Map
    public boolean equals(@m80.l Object obj) {
        if (obj instanceof Map) {
            return g0.g(obj, this.f103144a);
        }
        return false;
    }

    public final Value g(Key key, @k final x00.a<? extends Value> block) {
        g0.p(block, "block");
        ConcurrentHashMap<Key, Value> concurrentHashMap = this.f103144a;
        final l lVar = new l() { // from class: zy.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object h11;
                h11 = d.h(x00.a.this, obj);
                return h11;
            }
        };
        return concurrentHashMap.computeIfAbsent(key, new Function() { // from class: zy.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object j11;
                j11 = d.j(l.this, obj);
                return j11;
            }
        });
    }

    @Override // java.util.Map
    @m80.l
    public Value get(Object obj) {
        return this.f103144a.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f103144a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f103144a.isEmpty();
    }

    @k
    public Set<Map.Entry<Key, Value>> k() {
        Set<Map.Entry<Key, Value>> entrySet = this.f103144a.entrySet();
        g0.o(entrySet, "<get-entries>(...)");
        return entrySet;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Key> keySet() {
        return l();
    }

    @k
    public Set<Key> l() {
        Set<Key> keySet = this.f103144a.keySet();
        g0.o(keySet, "<get-keys>(...)");
        return keySet;
    }

    public int m() {
        return this.f103144a.size();
    }

    @k
    public Collection<Value> n() {
        Collection<Value> values = this.f103144a.values();
        g0.o(values, "<get-values>(...)");
        return values;
    }

    @Override // java.util.Map
    @m80.l
    public Value put(Key key, Value value) {
        return this.f103144a.put(key, value);
    }

    @Override // java.util.Map
    public void putAll(@k Map<? extends Key, ? extends Value> from) {
        g0.p(from, "from");
        this.f103144a.putAll(from);
    }

    @Override // java.util.Map
    @m80.l
    public Value remove(Object obj) {
        return this.f103144a.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m();
    }

    @k
    public String toString() {
        return "ConcurrentMapJvm by " + this.f103144a;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return n();
    }

    public d(int i11) {
        this.f103144a = new ConcurrentHashMap<>(i11);
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.f103144a.remove(obj, obj2);
    }

    public /* synthetic */ d(int i11, int i12, v vVar) {
        this((i12 & 1) != 0 ? 32 : i11);
    }
}
