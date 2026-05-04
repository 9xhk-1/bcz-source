package tv;

import com.baicizhan.client.business.dataset.provider.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class a<K, V, V2> implements h<Map<K, V2>> {

    /* renamed from: a, reason: collision with root package name */
    public final Map<K, t<V>> f90954a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: tv.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1213a<K, V, V2> {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap<K, t<V>> f90955a;

        public AbstractC1213a(int size) {
            this.f90955a = d.d(size);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AbstractC1213a<K, V, V2> a(K k11, t<V> tVar) {
            this.f90955a.put(s.c(k11, a.d.C0245a.f16161a), (t) s.c(tVar, ma.b.f72911h1));
            return this;
        }

        public AbstractC1213a<K, V, V2> b(t<Map<K, V2>> mapOfProviders) {
            if (mapOfProviders instanceof f) {
                return b(((f) mapOfProviders).a());
            }
            this.f90955a.putAll(((a) mapOfProviders).f90954a);
            return this;
        }
    }

    public a(Map<K, t<V>> map) {
        this.f90954a = Collections.unmodifiableMap(map);
    }

    public final Map<K, t<V>> b() {
        return this.f90954a;
    }
}
