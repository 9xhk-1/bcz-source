package tv;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;
import tv.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class q<K, V> extends tv.a<K, V, t<V>> implements nu.e<Map<K, t<V>>> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<K, V> extends a.AbstractC1213a<K, V, t<V>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements t<Map<K, t<V>>> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Provider f90973a;

            public a(final Provider val$mapProviderFactory) {
                this.f90973a = val$mapProviderFactory;
            }

            @Override // javax.inject.Provider, vz.c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<K, t<V>> get() {
                Map map = (Map) this.f90973a.get();
                if (map.isEmpty()) {
                    return Collections.EMPTY_MAP;
                }
                LinkedHashMap d11 = d.d(map.size());
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    d11.put(entry.getKey(), v.a((Provider) entry.getValue()));
                }
                return Collections.unmodifiableMap(d11);
            }
        }

        public q<K, V> c() {
            return new q<>(this.f90955a);
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
        public b<K, V> f(final Provider<Map<K, Provider<V>>> mapProviderFactory) {
            return b(new a(mapProviderFactory));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tv.a.AbstractC1213a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b<K, V> b(t<Map<K, t<V>>> mapProviderFactory) {
            super.b(mapProviderFactory);
            return this;
        }

        public b(int size) {
            super(size);
        }
    }

    public static <K, V> b<K, V> c(int size) {
        return new b<>(size);
    }

    @Override // javax.inject.Provider, vz.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Map<K, t<V>> get() {
        return b();
    }

    public q(Map<K, t<V>> contributingMap) {
        super(contributingMap);
    }
}
