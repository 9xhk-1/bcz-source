package com.google.common.cache;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.u6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import jo.l;
import jo.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@jo.e
@go.b
/* loaded from: classes7.dex */
public abstract class a<K, V> implements jo.b<K, V> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.cache.a$a, reason: collision with other inner class name */
    public static final class C0381a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final l f32740a = m.a();

        /* renamed from: b, reason: collision with root package name */
        public final l f32741b = m.a();

        /* renamed from: c, reason: collision with root package name */
        public final l f32742c = m.a();

        /* renamed from: d, reason: collision with root package name */
        public final l f32743d = m.a();

        /* renamed from: e, reason: collision with root package name */
        public final l f32744e = m.a();

        /* renamed from: f, reason: collision with root package name */
        public final l f32745f = m.a();

        public static long h(long value) {
            if (value >= 0) {
                return value;
            }
            return Long.MAX_VALUE;
        }

        @Override // com.google.common.cache.a.b
        public void a(int count) {
            this.f32740a.add(count);
        }

        @Override // com.google.common.cache.a.b
        public void b() {
            this.f32745f.increment();
        }

        @Override // com.google.common.cache.a.b
        public void c(long loadTime) {
            this.f32742c.increment();
            this.f32744e.add(loadTime);
        }

        @Override // com.google.common.cache.a.b
        public void d(int count) {
            this.f32741b.add(count);
        }

        @Override // com.google.common.cache.a.b
        public void e(long loadTime) {
            this.f32743d.increment();
            this.f32744e.add(loadTime);
        }

        @Override // com.google.common.cache.a.b
        public jo.d f() {
            return new jo.d(h(this.f32740a.sum()), h(this.f32741b.sum()), h(this.f32742c.sum()), h(this.f32743d.sum()), h(this.f32744e.sum()), h(this.f32745f.sum()));
        }

        public void g(b other) {
            jo.d f11 = other.f();
            this.f32740a.add(f11.c());
            this.f32741b.add(f11.j());
            this.f32742c.add(f11.h());
            this.f32743d.add(f11.f());
            this.f32744e.add(f11.n());
            this.f32745f.add(f11.b());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(int count);

        void b();

        void c(long loadTime);

        void d(int count);

        void e(long loadTime);

        jo.d f();
    }

    @Override // jo.b
    public ConcurrentMap<K, V> asMap() {
        throw new UnsupportedOperationException();
    }

    @Override // jo.b
    public V g(K key, Callable<? extends V> valueLoader) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    @Override // jo.b
    public void invalidateAll() {
        throw new UnsupportedOperationException();
    }

    @Override // jo.b
    public void l(Iterable<? extends Object> keys) {
        Iterator<? extends Object> it = keys.iterator();
        while (it.hasNext()) {
            u(it.next());
        }
    }

    @Override // jo.b
    public ImmutableMap<K, V> o(Iterable<? extends Object> keys) {
        V k11;
        LinkedHashMap c02 = u6.c0();
        for (Object obj : keys) {
            if (!c02.containsKey(obj) && (k11 = k(obj)) != null) {
                c02.put(obj, k11);
            }
        }
        return ImmutableMap.copyOf((Map) c02);
    }

    @Override // jo.b
    public jo.d p() {
        throw new UnsupportedOperationException();
    }

    @Override // jo.b
    public void put(K key, V value) {
        throw new UnsupportedOperationException();
    }

    @Override // jo.b
    public void putAll(Map<? extends K, ? extends V> m11) {
        for (Map.Entry<? extends K, ? extends V> entry : m11.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // jo.b
    public long size() {
        throw new UnsupportedOperationException();
    }

    @Override // jo.b
    public void u(Object key) {
        throw new UnsupportedOperationException();
    }

    @Override // jo.b
    public void d() {
    }
}
