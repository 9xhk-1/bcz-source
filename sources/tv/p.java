package tv;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;
import tv.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p<K, V> extends tv.a<K, V, V> {

    /* renamed from: b, reason: collision with root package name */
    public static final t<Map<Object, Object>> f90972b = l.a(Collections.EMPTY_MAP);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<K, V> extends a.AbstractC1213a<K, V, V> {
        public p<K, V> c() {
            return new p<>(this.f90955a);
        }

        @Deprecated
        public b<K, V> d(K key, Provider<V> providerOfValue) {
            return a(key, v.a(providerOfValue));
        }

        @Override // tv.a.AbstractC1213a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public b<K, V> a(K key, t<V> providerOfValue) {
            super.a(key, providerOfValue);
            return this;
        }

        @Deprecated
        public b<K, V> f(Provider<Map<K, V>> mapFactory) {
            return b(v.a(mapFactory));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tv.a.AbstractC1213a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b<K, V> b(t<Map<K, V>> mapFactory) {
            super.b(mapFactory);
            return this;
        }

        public b(int size) {
            super(size);
        }
    }

    public static <K, V> b<K, V> c(int size) {
        return new b<>(size);
    }

    public static <K, V> t<Map<K, V>> d() {
        return (t<Map<K, V>>) f90972b;
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Map<K, V> get() {
        LinkedHashMap d11 = d.d(b().size());
        for (Map.Entry<K, t<V>> entry : b().entrySet()) {
            d11.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(d11);
    }

    public p(Map<K, t<V>> map) {
        super(map);
    }
}
