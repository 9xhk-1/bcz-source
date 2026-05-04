package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.cache.CacheLoader;
import com.google.common.util.concurrent.d1;
import com.google.common.util.concurrent.p1;
import com.google.common.util.concurrent.q1;
import ho.p0;
import ho.r;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@jo.e
@go.b(emulated = true)
/* loaded from: classes7.dex */
public abstract class CacheLoader<K, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String message) {
            super(message);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends CacheLoader<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Executor f32737b;

        public a(final Executor val$executor) {
            this.f32737b = val$executor;
        }

        @Override // com.google.common.cache.CacheLoader
        public V d(K k11) throws Exception {
            return (V) CacheLoader.this.d(k11);
        }

        @Override // com.google.common.cache.CacheLoader
        public Map<K, V> e(Iterable<? extends K> keys) throws Exception {
            return CacheLoader.this.e(keys);
        }

        @Override // com.google.common.cache.CacheLoader
        public p1<V> f(final K key, final V oldValue) {
            final CacheLoader cacheLoader = CacheLoader.this;
            q1 b11 = q1.b(new Callable() { // from class: jo.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object obj;
                    obj = CacheLoader.this.f(key, oldValue).get();
                    return obj;
                }
            });
            this.f32737b.execute(b11);
            return b11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<K, V> extends CacheLoader<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final r<K, V> f32738a;

        public b(r<K, V> computingFunction) {
            this.f32738a = (r) Preconditions.checkNotNull(computingFunction);
        }

        @Override // com.google.common.cache.CacheLoader
        public V d(K k11) {
            return (V) this.f32738a.apply(Preconditions.checkNotNull(k11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<V> extends CacheLoader<Object, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final p0<V> f32739a;

        public c(p0<V> computingSupplier) {
            this.f32739a = (p0) Preconditions.checkNotNull(computingSupplier);
        }

        @Override // com.google.common.cache.CacheLoader
        public V d(Object key) {
            Preconditions.checkNotNull(key);
            return this.f32739a.get();
        }
    }

    @go.c
    public static <K, V> CacheLoader<K, V> a(final CacheLoader<K, V> loader, final Executor executor) {
        Preconditions.checkNotNull(loader);
        Preconditions.checkNotNull(executor);
        return loader.new a(executor);
    }

    public static <K, V> CacheLoader<K, V> b(r<K, V> function) {
        return new b(function);
    }

    public static <V> CacheLoader<Object, V> c(p0<V> supplier) {
        return new c(supplier);
    }

    public abstract V d(K key) throws Exception;

    public Map<K, V> e(Iterable<? extends K> keys) throws Exception {
        throw new UnsupportedLoadingOperationException();
    }

    @go.c
    public p1<V> f(K key, V oldValue) throws Exception {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(oldValue);
        return d1.o(d(key));
    }
}
