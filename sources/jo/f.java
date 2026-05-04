package jo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.c5;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.c
@e
/* loaded from: classes7.dex */
public abstract class f<K, V> extends c5 implements b<K, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a<K, V> extends f<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final b<K, V> f64459a;

        public a(b<K, V> delegate) {
            this.f64459a = (b) Preconditions.checkNotNull(delegate);
        }

        @Override // jo.f, com.google.common.collect.c5
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public final b<K, V> delegate() {
            return this.f64459a;
        }
    }

    @Override // jo.b
    public ConcurrentMap<K, V> asMap() {
        return delegate().asMap();
    }

    @Override // jo.b
    public void d() {
        delegate().d();
    }

    @Override // jo.b
    public V g(K key, Callable<? extends V> valueLoader) throws ExecutionException {
        return delegate().g(key, valueLoader);
    }

    @Override // jo.b
    public void invalidateAll() {
        delegate().invalidateAll();
    }

    @Override // jo.b
    @CheckForNull
    public V k(Object key) {
        return delegate().k(key);
    }

    @Override // jo.b
    public void l(Iterable<? extends Object> keys) {
        delegate().l(keys);
    }

    @Override // jo.b
    public ImmutableMap<K, V> o(Iterable<? extends Object> keys) {
        return delegate().o(keys);
    }

    @Override // jo.b
    public d p() {
        return delegate().p();
    }

    @Override // jo.b
    public void put(K key, V value) {
        delegate().put(key, value);
    }

    @Override // jo.b
    public void putAll(Map<? extends K, ? extends V> m11) {
        delegate().putAll(m11);
    }

    @Override // jo.b
    public long size() {
        return delegate().size();
    }

    @Override // jo.b
    public void u(Object key) {
        delegate().u(key);
    }

    @Override // com.google.common.collect.c5
    /* renamed from: w */
    public abstract b<K, V> delegate();
}
