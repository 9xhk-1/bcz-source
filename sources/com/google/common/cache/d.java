package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.a;
import com.google.common.cache.b;
import com.google.common.cache.d;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.q8;
import com.google.common.collect.u6;
import com.google.common.util.concurrent.ExecutionError;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.common.util.concurrent.d1;
import com.google.common.util.concurrent.h2;
import com.google.common.util.concurrent.p1;
import com.google.common.util.concurrent.w1;
import com.google.common.util.concurrent.y2;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import com.huawei.hms.framework.common.ContainerUtils;
import ho.n0;
import ho.u0;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
/* loaded from: classes7.dex */
public class d<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V> {
    public static final int A = 16;
    public static final Logger B = Logger.getLogger(d.class.getName());
    public static final a0<Object, Object> C = new a();
    public static final Queue<?> D = new b();

    /* renamed from: w, reason: collision with root package name */
    public static final int f32796w = 1073741824;

    /* renamed from: x, reason: collision with root package name */
    public static final int f32797x = 65536;

    /* renamed from: y, reason: collision with root package name */
    public static final int f32798y = 3;

    /* renamed from: z, reason: collision with root package name */
    public static final int f32799z = 63;

    /* renamed from: a, reason: collision with root package name */
    public final int f32800a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32801b;

    /* renamed from: c, reason: collision with root package name */
    public final r<K, V>[] f32802c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32803d;

    /* renamed from: e, reason: collision with root package name */
    public final Equivalence<Object> f32804e;

    /* renamed from: f, reason: collision with root package name */
    public final Equivalence<Object> f32805f;

    /* renamed from: g, reason: collision with root package name */
    public final t f32806g;

    /* renamed from: h, reason: collision with root package name */
    public final t f32807h;

    /* renamed from: i, reason: collision with root package name */
    public final long f32808i;

    /* renamed from: j, reason: collision with root package name */
    public final jo.u<K, V> f32809j;

    /* renamed from: k, reason: collision with root package name */
    public final long f32810k;

    /* renamed from: l, reason: collision with root package name */
    public final long f32811l;

    /* renamed from: m, reason: collision with root package name */
    public final long f32812m;

    /* renamed from: n, reason: collision with root package name */
    public final Queue<RemovalNotification<K, V>> f32813n;

    /* renamed from: o, reason: collision with root package name */
    public final jo.p<K, V> f32814o;

    /* renamed from: p, reason: collision with root package name */
    public final u0 f32815p;

    /* renamed from: q, reason: collision with root package name */
    public final f f32816q;

    /* renamed from: r, reason: collision with root package name */
    public final a.b f32817r;

    /* renamed from: s, reason: collision with root package name */
    @CheckForNull
    public final CacheLoader<? super K, V> f32818s;

    /* renamed from: t, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    @vo.b
    public Set<K> f32819t;

    /* renamed from: u, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    @vo.b
    public Collection<V> f32820u;

    /* renamed from: v, reason: collision with root package name */
    @RetainedWith
    @CheckForNull
    @vo.b
    public Set<Map.Entry<K, V>> f32821v;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a0<K, V> {
        @CheckForNull
        com.google.common.cache.e<K, V> a();

        void b(@CheckForNull V newValue);

        V c() throws ExecutionException;

        a0<K, V> d(ReferenceQueue<V> queue, @CheckForNull V value, com.google.common.cache.e<K, V> entry);

        @CheckForNull
        V get();

        int getWeight();

        boolean isActive();

        boolean isLoading();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AbstractQueue<Object> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return ImmutableSet.of().iterator();
        }

        @Override // java.util.Queue
        public boolean offer(Object o11) {
            return true;
        }

        @Override // java.util.Queue
        @CheckForNull
        public Object peek() {
            return null;
        }

        @Override // java.util.Queue
        @CheckForNull
        public Object poll() {
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return 0;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b0 extends AbstractCollection<V> {
        public b0() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o11) {
            return d.this.containsValue(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return d.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d.this.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class c<T> extends AbstractSet<T> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d.this.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c0<K, V> extends e0<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public volatile long f32824d;

        /* renamed from: e, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32825e;

        /* renamed from: f, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32826f;

        public c0(ReferenceQueue<K> queue, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
            super(queue, key, hash, next);
            this.f32824d = Long.MAX_VALUE;
            this.f32825e = d.G();
            this.f32826f = d.G();
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void c(com.google.common.cache.e<K, V> previous) {
            this.f32826f = previous;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void g(long time) {
            this.f32824d = time;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> k() {
            return this.f32826f;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> m() {
            return this.f32825e;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public long o() {
            return this.f32824d;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void p(com.google.common.cache.e<K, V> next) {
            this.f32825e = next;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.cache.d$d, reason: collision with other inner class name */
    public static abstract class AbstractC0384d<K, V> implements com.google.common.cache.e<K, V> {
        @Override // com.google.common.cache.e
        public a0<K, V> a() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public int b() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void c(com.google.common.cache.e<K, V> previous) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> d() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void e(a0<K, V> valueReference) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public long f() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void g(long time) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public K getKey() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> getNext() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void i(long time) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> k() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> l() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> m() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public long o() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void p(com.google.common.cache.e<K, V> next) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void q(com.google.common.cache.e<K, V> next) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void r(com.google.common.cache.e<K, V> previous) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d0<K, V> extends e0<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public volatile long f32827d;

        /* renamed from: e, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32828e;

        /* renamed from: f, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32829f;

        /* renamed from: g, reason: collision with root package name */
        public volatile long f32830g;

        /* renamed from: h, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32831h;

        /* renamed from: i, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32832i;

        public d0(ReferenceQueue<K> queue, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
            super(queue, key, hash, next);
            this.f32827d = Long.MAX_VALUE;
            this.f32828e = d.G();
            this.f32829f = d.G();
            this.f32830g = Long.MAX_VALUE;
            this.f32831h = d.G();
            this.f32832i = d.G();
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void c(com.google.common.cache.e<K, V> previous) {
            this.f32829f = previous;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> d() {
            return this.f32832i;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public long f() {
            return this.f32830g;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void g(long time) {
            this.f32827d = time;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void i(long time) {
            this.f32830g = time;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> k() {
            return this.f32829f;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> l() {
            return this.f32831h;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> m() {
            return this.f32828e;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public long o() {
            return this.f32827d;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void p(com.google.common.cache.e<K, V> next) {
            this.f32828e = next;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void q(com.google.common.cache.e<K, V> next) {
            this.f32831h = next;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void r(com.google.common.cache.e<K, V> previous) {
            this.f32832i = previous;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e0<K, V> extends WeakReference<K> implements com.google.common.cache.e<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final int f32838a;

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public final com.google.common.cache.e<K, V> f32839b;

        /* renamed from: c, reason: collision with root package name */
        public volatile a0<K, V> f32840c;

        public e0(ReferenceQueue<K> queue, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
            super(key, queue);
            this.f32840c = d.T();
            this.f32838a = hash;
            this.f32839b = next;
        }

        @Override // com.google.common.cache.e
        public a0<K, V> a() {
            return this.f32840c;
        }

        @Override // com.google.common.cache.e
        public int b() {
            return this.f32838a;
        }

        public void c(com.google.common.cache.e<K, V> previous) {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.e<K, V> d() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public void e(a0<K, V> valueReference) {
            this.f32840c = valueReference;
        }

        public long f() {
            throw new UnsupportedOperationException();
        }

        public void g(long time) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.cache.e
        public K getKey() {
            return get();
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<K, V> getNext() {
            return this.f32839b;
        }

        public void i(long time) {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.e<K, V> k() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.e<K, V> l() {
            throw new UnsupportedOperationException();
        }

        public com.google.common.cache.e<K, V> m() {
            throw new UnsupportedOperationException();
        }

        public long o() {
            throw new UnsupportedOperationException();
        }

        public void p(com.google.common.cache.e<K, V> next) {
            throw new UnsupportedOperationException();
        }

        public void q(com.google.common.cache.e<K, V> next) {
            throw new UnsupportedOperationException();
        }

        public void r(com.google.common.cache.e<K, V> previous) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f32841a;

        /* renamed from: b, reason: collision with root package name */
        public static final f f32842b;

        /* renamed from: c, reason: collision with root package name */
        public static final f f32843c;

        /* renamed from: d, reason: collision with root package name */
        public static final f f32844d;

        /* renamed from: e, reason: collision with root package name */
        public static final f f32845e;

        /* renamed from: f, reason: collision with root package name */
        public static final f f32846f;

        /* renamed from: g, reason: collision with root package name */
        public static final f f32847g;

        /* renamed from: h, reason: collision with root package name */
        public static final f f32848h;

        /* renamed from: i, reason: collision with root package name */
        public static final int f32849i = 1;

        /* renamed from: j, reason: collision with root package name */
        public static final int f32850j = 2;

        /* renamed from: k, reason: collision with root package name */
        public static final int f32851k = 4;

        /* renamed from: l, reason: collision with root package name */
        public static final f[] f32852l;

        /* renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ f[] f32853m;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends f {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> segment, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
                return new w(key, hash, next);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends f {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> c(r<K, V> segment, com.google.common.cache.e<K, V> original, com.google.common.cache.e<K, V> newNext, K key) {
                com.google.common.cache.e<K, V> c11 = super.c(segment, original, newNext, key);
                b(original, c11);
                return c11;
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> segment, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
                return new u(key, hash, next);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum c extends f {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> c(r<K, V> segment, com.google.common.cache.e<K, V> original, com.google.common.cache.e<K, V> newNext, K key) {
                com.google.common.cache.e<K, V> c11 = super.c(segment, original, newNext, key);
                d(original, c11);
                return c11;
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> segment, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
                return new y(key, hash, next);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.cache.d$f$d, reason: collision with other inner class name */
        public enum C0385d extends f {
            public C0385d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> c(r<K, V> segment, com.google.common.cache.e<K, V> original, com.google.common.cache.e<K, V> newNext, K key) {
                com.google.common.cache.e<K, V> c11 = super.c(segment, original, newNext, key);
                b(original, c11);
                d(original, c11);
                return c11;
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> segment, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
                return new v(key, hash, next);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum e extends f {
            public e(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> segment, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
                return new e0(segment.f32910h, key, hash, next);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.google.common.cache.d$f$f, reason: collision with other inner class name */
        public enum C0386f extends f {
            public C0386f(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> c(r<K, V> segment, com.google.common.cache.e<K, V> original, com.google.common.cache.e<K, V> newNext, K key) {
                com.google.common.cache.e<K, V> c11 = super.c(segment, original, newNext, key);
                b(original, c11);
                return c11;
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> segment, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
                return new c0(segment.f32910h, key, hash, next);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum g extends f {
            public g(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> c(r<K, V> segment, com.google.common.cache.e<K, V> original, com.google.common.cache.e<K, V> newNext, K key) {
                com.google.common.cache.e<K, V> c11 = super.c(segment, original, newNext, key);
                d(original, c11);
                return c11;
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> segment, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
                return new g0(segment.f32910h, key, hash, next);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum h extends f {
            public h(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> c(r<K, V> segment, com.google.common.cache.e<K, V> original, com.google.common.cache.e<K, V> newNext, K key) {
                com.google.common.cache.e<K, V> c11 = super.c(segment, original, newNext, key);
                b(original, c11);
                d(original, c11);
                return c11;
            }

            @Override // com.google.common.cache.d.f
            public <K, V> com.google.common.cache.e<K, V> f(r<K, V> segment, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
                return new d0(segment.f32910h, key, hash, next);
            }
        }

        static {
            a aVar = new a("STRONG", 0);
            f32841a = aVar;
            b bVar = new b("STRONG_ACCESS", 1);
            f32842b = bVar;
            c cVar = new c("STRONG_WRITE", 2);
            f32843c = cVar;
            C0385d c0385d = new C0385d("STRONG_ACCESS_WRITE", 3);
            f32844d = c0385d;
            e eVar = new e("WEAK", 4);
            f32845e = eVar;
            C0386f c0386f = new C0386f("WEAK_ACCESS", 5);
            f32846f = c0386f;
            g gVar = new g("WEAK_WRITE", 6);
            f32847g = gVar;
            h hVar = new h("WEAK_ACCESS_WRITE", 7);
            f32848h = hVar;
            f32853m = a();
            f32852l = new f[]{aVar, bVar, cVar, c0385d, eVar, c0386f, gVar, hVar};
        }

        public f(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ f[] a() {
            return new f[]{f32841a, f32842b, f32843c, f32844d, f32845e, f32846f, f32847g, f32848h};
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static f e(t tVar, boolean z11, boolean z12) {
            return f32852l[(tVar == t.f32920c ? (char) 4 : (char) 0) | (z11 ? 1 : 0) | (z12 ? 2 : 0)];
        }

        public static f valueOf(String name) {
            return (f) Enum.valueOf(f.class, name);
        }

        public static f[] values() {
            return (f[]) f32853m.clone();
        }

        public <K, V> void b(com.google.common.cache.e<K, V> original, com.google.common.cache.e<K, V> newEntry) {
            newEntry.g(original.o());
            d.d(original.k(), newEntry);
            d.d(newEntry, original.m());
            d.H(original);
        }

        public <K, V> com.google.common.cache.e<K, V> c(r<K, V> segment, com.google.common.cache.e<K, V> original, com.google.common.cache.e<K, V> newNext, K key) {
            return f(segment, key, original.b(), newNext);
        }

        public <K, V> void d(com.google.common.cache.e<K, V> original, com.google.common.cache.e<K, V> newEntry) {
            newEntry.i(original.f());
            d.g(original.d(), newEntry);
            d.g(newEntry, original.l());
            d.I(original);
        }

        public abstract <K, V> com.google.common.cache.e<K, V> f(r<K, V> segment, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next);

        public /* synthetic */ f(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class g extends d<K, V>.i<Map.Entry<K, V>> {
        public g() {
            super();
        }

        @Override // com.google.common.cache.d.i, java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g0<K, V> extends e0<K, V> {

        /* renamed from: d, reason: collision with root package name */
        public volatile long f32856d;

        /* renamed from: e, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32857e;

        /* renamed from: f, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32858f;

        public g0(ReferenceQueue<K> queue, K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
            super(queue, key, hash, next);
            this.f32856d = Long.MAX_VALUE;
            this.f32857e = d.G();
            this.f32858f = d.G();
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> d() {
            return this.f32858f;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public long f() {
            return this.f32856d;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void i(long time) {
            this.f32856d = time;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public com.google.common.cache.e<K, V> l() {
            return this.f32857e;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void q(com.google.common.cache.e<K, V> next) {
            this.f32857e = next;
        }

        @Override // com.google.common.cache.d.e0, com.google.common.cache.e
        public void r(com.google.common.cache.e<K, V> previous) {
            this.f32858f = previous;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class h extends d<K, V>.c<Map.Entry<K, V>> {
        public h() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o11) {
            Map.Entry entry;
            Object key;
            Object obj;
            return (o11 instanceof Map.Entry) && (key = (entry = (Map.Entry) o11).getKey()) != null && (obj = d.this.get(key)) != null && d.this.f32805f.d(entry.getValue(), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o11) {
            Map.Entry entry;
            Object key;
            return (o11 instanceof Map.Entry) && (key = (entry = (Map.Entry) o11).getKey()) != null && d.this.remove(key, entry.getValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h0<K, V> extends s<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final int f32860b;

        public h0(ReferenceQueue<V> queue, V referent, com.google.common.cache.e<K, V> entry, int weight) {
            super(queue, referent, entry);
            this.f32860b = weight;
        }

        @Override // com.google.common.cache.d.s, com.google.common.cache.d.a0
        public a0<K, V> d(ReferenceQueue<V> queue, V value, com.google.common.cache.e<K, V> entry) {
            return new h0(queue, value, entry, this.f32860b);
        }

        @Override // com.google.common.cache.d.s, com.google.common.cache.d.a0
        public int getWeight() {
            return this.f32860b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class i<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f32861a;

        /* renamed from: b, reason: collision with root package name */
        public int f32862b = -1;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public r<K, V> f32863c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public AtomicReferenceArray<com.google.common.cache.e<K, V>> f32864d;

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        public com.google.common.cache.e<K, V> f32865e;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public d<K, V>.l0 f32866f;

        /* renamed from: g, reason: collision with root package name */
        @CheckForNull
        public d<K, V>.l0 f32867g;

        public i() {
            this.f32861a = d.this.f32802c.length - 1;
            a();
        }

        public final void a() {
            this.f32866f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i11 = this.f32861a;
                if (i11 < 0) {
                    return;
                }
                r<K, V>[] rVarArr = d.this.f32802c;
                this.f32861a = i11 - 1;
                r<K, V> rVar = rVarArr[i11];
                this.f32863c = rVar;
                if (rVar.f32904b != 0) {
                    this.f32864d = this.f32863c.f32908f;
                    this.f32862b = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public boolean b(com.google.common.cache.e<K, V> entry) {
            try {
                long a11 = d.this.f32815p.a();
                K key = entry.getKey();
                Object v11 = d.this.v(entry, a11);
                if (v11 == null) {
                    this.f32863c.G();
                    return false;
                }
                this.f32866f = new l0(key, v11);
                this.f32863c.G();
                return true;
            } catch (Throwable th2) {
                this.f32863c.G();
                throw th2;
            }
        }

        public d<K, V>.l0 c() {
            d<K, V>.l0 l0Var = this.f32866f;
            if (l0Var == null) {
                throw new NoSuchElementException();
            }
            this.f32867g = l0Var;
            a();
            return this.f32867g;
        }

        public boolean d() {
            com.google.common.cache.e<K, V> eVar = this.f32865e;
            if (eVar == null) {
                return false;
            }
            while (true) {
                this.f32865e = eVar.getNext();
                com.google.common.cache.e<K, V> eVar2 = this.f32865e;
                if (eVar2 == null) {
                    return false;
                }
                if (b(eVar2)) {
                    return true;
                }
                eVar = this.f32865e;
            }
        }

        public boolean e() {
            while (true) {
                int i11 = this.f32862b;
                if (i11 < 0) {
                    return false;
                }
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f32864d;
                this.f32862b = i11 - 1;
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(i11);
                this.f32865e = eVar;
                if (eVar != null && (b(eVar) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32866f != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            Preconditions.checkState(this.f32867g != null);
            d.this.remove(this.f32867g.getKey());
            this.f32867g = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i0<K, V> extends x<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final int f32869b;

        public i0(V referent, int weight) {
            super(referent);
            this.f32869b = weight;
        }

        @Override // com.google.common.cache.d.x, com.google.common.cache.d.a0
        public int getWeight() {
            return this.f32869b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class j extends d<K, V>.i<K> {
        public j() {
            super();
        }

        @Override // com.google.common.cache.d.i, java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j0<K, V> extends f0<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final int f32871b;

        public j0(ReferenceQueue<V> queue, V referent, com.google.common.cache.e<K, V> entry, int weight) {
            super(queue, referent, entry);
            this.f32871b = weight;
        }

        @Override // com.google.common.cache.d.f0, com.google.common.cache.d.a0
        public a0<K, V> d(ReferenceQueue<V> queue, V value, com.google.common.cache.e<K, V> entry) {
            return new j0(queue, value, entry, this.f32871b);
        }

        @Override // com.google.common.cache.d.f0, com.google.common.cache.d.a0
        public int getWeight() {
            return this.f32871b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class k extends d<K, V>.c<K> {
        public k() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o11) {
            return d.this.containsKey(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o11) {
            return d.this.remove(o11) != null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l<K, V> extends p<K, V> implements jo.i<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: n, reason: collision with root package name */
        @CheckForNull
        public transient jo.i<K, V> f32878n;

        public l(d<K, V> cache) {
            super(cache);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f32878n = (jo.i<K, V>) x().b(this.f32899l);
        }

        private Object readResolve() {
            return this.f32878n;
        }

        @Override // jo.i, ho.r
        public V apply(K key) {
            return this.f32878n.apply(key);
        }

        @Override // jo.i
        public V get(K key) throws ExecutionException {
            return this.f32878n.get(key);
        }

        @Override // jo.i
        public V s(K key) {
            return this.f32878n.s(key);
        }

        @Override // jo.i
        public ImmutableMap<K, V> t(Iterable<? extends K> keys) throws ExecutionException {
            return this.f32878n.t(keys);
        }

        @Override // jo.i
        public void v(K key) {
            this.f32878n.v(key);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class l0 implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f32879a;

        /* renamed from: b, reason: collision with root package name */
        public V f32880b;

        public l0(K key, V value) {
            this.f32879a = key;
            this.f32880b = value;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) object;
                if (this.f32879a.equals(entry.getKey()) && this.f32880b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f32879a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f32880b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f32879a.hashCode() ^ this.f32880b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            V v12 = (V) d.this.put(this.f32879a, v11);
            this.f32880b = v11;
            return v12;
        }

        public String toString() {
            return getKey() + ContainerUtils.KEY_VALUE_DELIMITER + getValue();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m<K, V> implements a0<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public volatile a0<K, V> f32882a;

        /* renamed from: b, reason: collision with root package name */
        public final h2<V> f32883b;

        /* renamed from: c, reason: collision with root package name */
        public final n0 f32884c;

        public m() {
            this(d.T());
        }

        public static /* synthetic */ Object e(m mVar, Object obj) {
            mVar.j(obj);
            return obj;
        }

        @Override // com.google.common.cache.d.a0
        public com.google.common.cache.e<K, V> a() {
            return null;
        }

        @Override // com.google.common.cache.d.a0
        public void b(@CheckForNull V newValue) {
            if (newValue != null) {
                j(newValue);
            } else {
                this.f32882a = d.T();
            }
        }

        @Override // com.google.common.cache.d.a0
        public V c() throws ExecutionException {
            return (V) y2.f(this.f32883b);
        }

        public long f() {
            return this.f32884c.g(TimeUnit.NANOSECONDS);
        }

        public final p1<V> g(Throwable t11) {
            return d1.n(t11);
        }

        @Override // com.google.common.cache.d.a0
        public V get() {
            return this.f32882a.get();
        }

        @Override // com.google.common.cache.d.a0
        public int getWeight() {
            return this.f32882a.getWeight();
        }

        public a0<K, V> h() {
            return this.f32882a;
        }

        public p1<V> i(K key, CacheLoader<? super K, V> loader) {
            try {
                this.f32884c.k();
                V v11 = this.f32882a.get();
                if (v11 == null) {
                    V d11 = loader.d(key);
                    return j(d11) ? this.f32883b : d1.o(d11);
                }
                p1<V> f11 = loader.f(key, v11);
                return f11 == null ? d1.o(null) : d1.z(f11, new ho.r() { // from class: jo.j
                    @Override // ho.r
                    public final Object apply(Object obj) {
                        return d.m.e(d.m.this, obj);
                    }
                }, w1.c());
            } catch (Throwable th2) {
                p1<V> g11 = k(th2) ? this.f32883b : g(th2);
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return g11;
            }
        }

        @Override // com.google.common.cache.d.a0
        public boolean isActive() {
            return this.f32882a.isActive();
        }

        @Override // com.google.common.cache.d.a0
        public boolean isLoading() {
            return true;
        }

        @uo.a
        public boolean j(@CheckForNull V newValue) {
            return this.f32883b.B(newValue);
        }

        @uo.a
        public boolean k(Throwable t11) {
            return this.f32883b.C(t11);
        }

        public m(a0<K, V> oldValue) {
            this.f32883b = h2.F();
            this.f32884c = n0.e();
            this.f32882a = oldValue;
        }

        @Override // com.google.common.cache.d.a0
        public a0<K, V> d(ReferenceQueue<V> queue, @CheckForNull V value, com.google.common.cache.e<K, V> entry) {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n<K, V> extends o<K, V> implements jo.i<K, V> {
        private static final long serialVersionUID = 1;

        public n(com.google.common.cache.b<? super K, ? super V> builder, CacheLoader<? super K, V> loader) {
            super(new d(builder, (CacheLoader) Preconditions.checkNotNull(loader)), null);
        }

        private void readObject(ObjectInputStream in2) throws InvalidObjectException {
            throw new InvalidObjectException("Use LoadingSerializationProxy");
        }

        @Override // jo.i, ho.r
        public final V apply(K key) {
            return s(key);
        }

        @Override // jo.i
        public V get(K key) throws ExecutionException {
            return this.f32885a.w(key);
        }

        @Override // jo.i
        @uo.a
        public V s(K key) {
            try {
                return get(key);
            } catch (ExecutionException e11) {
                throw new UncheckedExecutionException(e11.getCause());
            }
        }

        @Override // jo.i
        public ImmutableMap<K, V> t(Iterable<? extends K> keys) throws ExecutionException {
            return this.f32885a.r(keys);
        }

        @Override // jo.i
        public void v(K key) {
            this.f32885a.P(key);
        }

        @Override // com.google.common.cache.d.o
        public Object writeReplace() {
            return new l(this.f32885a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o<K, V> implements jo.b<K, V>, Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a, reason: collision with root package name */
        public final d<K, V> f32885a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends CacheLoader<Object, V> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Callable f32886a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f32887b;

            public a(final o this$0, final Callable val$valueLoader) {
                this.f32886a = val$valueLoader;
                this.f32887b = this$0;
            }

            @Override // com.google.common.cache.CacheLoader
            public V d(Object obj) throws Exception {
                return (V) this.f32886a.call();
            }
        }

        public /* synthetic */ o(d dVar, a aVar) {
            this(dVar);
        }

        private void readObject(ObjectInputStream in2) throws InvalidObjectException {
            throw new InvalidObjectException("Use ManualSerializationProxy");
        }

        @Override // jo.b
        public ConcurrentMap<K, V> asMap() {
            return this.f32885a;
        }

        @Override // jo.b
        public void d() {
            this.f32885a.b();
        }

        @Override // jo.b
        public V g(K key, final Callable<? extends V> valueLoader) throws ExecutionException {
            Preconditions.checkNotNull(valueLoader);
            return this.f32885a.p(key, new a(this, valueLoader));
        }

        @Override // jo.b
        public void invalidateAll() {
            this.f32885a.clear();
        }

        @Override // jo.b
        @CheckForNull
        public V k(Object key) {
            return this.f32885a.u(key);
        }

        @Override // jo.b
        public void l(Iterable<?> keys) {
            this.f32885a.y(keys);
        }

        @Override // jo.b
        public ImmutableMap<K, V> o(Iterable<?> keys) {
            return this.f32885a.s(keys);
        }

        @Override // jo.b
        public jo.d p() {
            a.C0381a c0381a = new a.C0381a();
            c0381a.g(this.f32885a.f32817r);
            for (r<K, V> rVar : this.f32885a.f32802c) {
                c0381a.g(rVar.f32916n);
            }
            return c0381a.f();
        }

        @Override // jo.b
        public void put(K key, V value) {
            this.f32885a.put(key, value);
        }

        @Override // jo.b
        public void putAll(Map<? extends K, ? extends V> m11) {
            this.f32885a.putAll(m11);
        }

        @Override // jo.b
        public long size() {
            return this.f32885a.C();
        }

        @Override // jo.b
        public void u(Object key) {
            Preconditions.checkNotNull(key);
            this.f32885a.remove(key);
        }

        public Object writeReplace() {
            return new p(this.f32885a);
        }

        public o(com.google.common.cache.b<? super K, ? super V> builder) {
            this(new d(builder, null));
        }

        public o(d<K, V> localCache) {
            this.f32885a = localCache;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class p<K, V> extends jo.f<K, V> implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: a, reason: collision with root package name */
        public final t f32888a;

        /* renamed from: b, reason: collision with root package name */
        public final t f32889b;

        /* renamed from: c, reason: collision with root package name */
        public final Equivalence<Object> f32890c;

        /* renamed from: d, reason: collision with root package name */
        public final Equivalence<Object> f32891d;

        /* renamed from: e, reason: collision with root package name */
        public final long f32892e;

        /* renamed from: f, reason: collision with root package name */
        public final long f32893f;

        /* renamed from: g, reason: collision with root package name */
        public final long f32894g;

        /* renamed from: h, reason: collision with root package name */
        public final jo.u<K, V> f32895h;

        /* renamed from: i, reason: collision with root package name */
        public final int f32896i;

        /* renamed from: j, reason: collision with root package name */
        public final jo.p<? super K, ? super V> f32897j;

        /* renamed from: k, reason: collision with root package name */
        @CheckForNull
        public final u0 f32898k;

        /* renamed from: l, reason: collision with root package name */
        public final CacheLoader<? super K, V> f32899l;

        /* renamed from: m, reason: collision with root package name */
        @CheckForNull
        public transient jo.b<K, V> f32900m;

        public p(d<K, V> cache) {
            this(cache.f32806g, cache.f32807h, cache.f32804e, cache.f32805f, cache.f32811l, cache.f32810k, cache.f32808i, cache.f32809j, cache.f32803d, cache.f32814o, cache.f32815p, cache.f32818s);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f32900m = (jo.b<K, V>) x().a();
        }

        private Object readResolve() {
            return this.f32900m;
        }

        @Override // jo.f, com.google.common.collect.c5
        /* renamed from: w */
        public jo.b<K, V> delegate() {
            return this.f32900m;
        }

        public com.google.common.cache.b<K, V> x() {
            com.google.common.cache.b<K, V> bVar = (com.google.common.cache.b<K, V>) com.google.common.cache.b.F().K(this.f32888a).L(this.f32889b).B(this.f32890c).P(this.f32891d).e(this.f32896i).J(this.f32897j);
            bVar.f32755a = false;
            long j11 = this.f32892e;
            if (j11 > 0) {
                bVar.h(j11, TimeUnit.NANOSECONDS);
            }
            long j12 = this.f32893f;
            if (j12 > 0) {
                bVar.f(j12, TimeUnit.NANOSECONDS);
            }
            jo.u uVar = this.f32895h;
            if (uVar != b.f.INSTANCE) {
                bVar.S(uVar);
                long j13 = this.f32894g;
                if (j13 != -1) {
                    bVar.E(j13);
                }
            } else {
                long j14 = this.f32894g;
                if (j14 != -1) {
                    bVar.D(j14);
                }
            }
            u0 u0Var = this.f32898k;
            if (u0Var != null) {
                bVar.N(u0Var);
            }
            return bVar;
        }

        public p(t keyStrength, t valueStrength, Equivalence<Object> keyEquivalence, Equivalence<Object> valueEquivalence, long expireAfterWriteNanos, long expireAfterAccessNanos, long maxWeight, jo.u<K, V> weigher, int concurrencyLevel, jo.p<? super K, ? super V> removalListener, u0 ticker, CacheLoader<? super K, V> loader) {
            this.f32888a = keyStrength;
            this.f32889b = valueStrength;
            this.f32890c = keyEquivalence;
            this.f32891d = valueEquivalence;
            this.f32892e = expireAfterWriteNanos;
            this.f32893f = expireAfterAccessNanos;
            this.f32894g = maxWeight;
            this.f32895h = weigher;
            this.f32896i = concurrencyLevel;
            this.f32897j = removalListener;
            this.f32898k = (ticker == u0.b() || ticker == com.google.common.cache.b.f32753x) ? null : ticker;
            this.f32899l = loader;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class r<K, V> extends ReentrantLock {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final d<K, V> f32903a;

        /* renamed from: b, reason: collision with root package name */
        public volatile int f32904b;

        /* renamed from: c, reason: collision with root package name */
        @vo.a("this")
        public long f32905c;

        /* renamed from: d, reason: collision with root package name */
        public int f32906d;

        /* renamed from: e, reason: collision with root package name */
        public int f32907e;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public volatile AtomicReferenceArray<com.google.common.cache.e<K, V>> f32908f;

        /* renamed from: g, reason: collision with root package name */
        public final long f32909g;

        /* renamed from: h, reason: collision with root package name */
        @CheckForNull
        public final ReferenceQueue<K> f32910h;

        /* renamed from: i, reason: collision with root package name */
        @CheckForNull
        public final ReferenceQueue<V> f32911i;

        /* renamed from: j, reason: collision with root package name */
        public final Queue<com.google.common.cache.e<K, V>> f32912j;

        /* renamed from: k, reason: collision with root package name */
        public final AtomicInteger f32913k = new AtomicInteger();

        /* renamed from: l, reason: collision with root package name */
        @vo.a("this")
        public final Queue<com.google.common.cache.e<K, V>> f32914l;

        /* renamed from: m, reason: collision with root package name */
        @vo.a("this")
        public final Queue<com.google.common.cache.e<K, V>> f32915m;

        /* renamed from: n, reason: collision with root package name */
        public final a.b f32916n;

        public r(d<K, V> map, int initialCapacity, long maxSegmentWeight, a.b statsCounter) {
            this.f32903a = map;
            this.f32909g = maxSegmentWeight;
            this.f32916n = (a.b) Preconditions.checkNotNull(statsCounter);
            y(F(initialCapacity));
            this.f32910h = map.W() ? new ReferenceQueue<>() : null;
            this.f32911i = map.X() ? new ReferenceQueue<>() : null;
            this.f32912j = map.V() ? new ConcurrentLinkedQueue<>() : d.k();
            this.f32914l = map.a0() ? new k0<>() : d.k();
            this.f32915m = map.V() ? new e<>() : d.k();
        }

        public static /* synthetic */ void a(r rVar, Object obj, int i11, m mVar, p1 p1Var) {
            rVar.getClass();
            try {
                rVar.s(obj, i11, mVar, p1Var);
            } catch (Throwable th2) {
                d.B.log(Level.WARNING, "Exception thrown during refresh", th2);
                mVar.k(th2);
            }
        }

        public p1<V> A(final K key, final int hash, final m<K, V> loadingValueReference, CacheLoader<? super K, V> loader) {
            final p1<V> i11 = loadingValueReference.i(key, loader);
            i11.addListener(new Runnable() { // from class: jo.k
                @Override // java.lang.Runnable
                public final void run() {
                    d.r.a(d.r.this, key, hash, loadingValueReference, i11);
                }
            }, w1.c());
            return i11;
        }

        public V B(K key, int hash, m<K, V> loadingValueReference, CacheLoader<? super K, V> loader) throws ExecutionException {
            return s(key, hash, loadingValueReference, loadingValueReference.i(key, loader));
        }

        public V C(K key, int hash, CacheLoader<? super K, V> loader) throws ExecutionException {
            m<K, V> mVar;
            boolean z11;
            a0<K, V> a0Var;
            V B;
            int i11 = hash;
            lock();
            try {
                long a11 = this.f32903a.f32815p.a();
                I(a11);
                int i12 = this.f32904b - 1;
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f32908f;
                int length = i11 & (atomicReferenceArray.length() - 1);
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                com.google.common.cache.e<K, V> eVar2 = eVar;
                while (true) {
                    mVar = null;
                    if (eVar2 == null) {
                        z11 = true;
                        a0Var = null;
                        break;
                    }
                    long j11 = a11;
                    K key2 = eVar2.getKey();
                    if (eVar2.b() == i11 && key2 != null && this.f32903a.f32804e.d(key, key2)) {
                        a0Var = eVar2.a();
                        if (a0Var.isLoading()) {
                            z11 = false;
                        } else {
                            V v11 = a0Var.get();
                            if (v11 == null) {
                                m(key2, i11, v11, a0Var.getWeight(), RemovalCause.COLLECTED);
                                i11 = hash;
                            } else {
                                if (!this.f32903a.z(eVar2, j11)) {
                                    M(eVar2, j11);
                                    this.f32916n.a(1);
                                    unlock();
                                    H();
                                    return v11;
                                }
                                i11 = hash;
                                m(key2, i11, v11, a0Var.getWeight(), RemovalCause.EXPIRED);
                            }
                            this.f32914l.remove(eVar2);
                            this.f32915m.remove(eVar2);
                            this.f32904b = i12;
                            z11 = true;
                        }
                    } else {
                        eVar2 = eVar2.getNext();
                        a11 = j11;
                    }
                }
                if (z11) {
                    mVar = new m<>();
                    if (eVar2 == null) {
                        eVar2 = D(key, i11, eVar);
                        eVar2.e(mVar);
                        atomicReferenceArray.set(length, eVar2);
                    } else {
                        eVar2.e(mVar);
                    }
                }
                unlock();
                H();
                if (!z11) {
                    return g0(eVar2, key, a0Var);
                }
                try {
                    synchronized (eVar2) {
                        B = B(key, i11, mVar, loader);
                    }
                    return B;
                } finally {
                    this.f32916n.d(1);
                }
            } catch (Throwable th2) {
                unlock();
                H();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @vo.a("this")
        public com.google.common.cache.e<K, V> D(K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
            return this.f32903a.f32816q.f(this, Preconditions.checkNotNull(key), hash, next);
        }

        public AtomicReferenceArray<com.google.common.cache.e<K, V>> F(int size) {
            return new AtomicReferenceArray<>(size);
        }

        public void G() {
            if ((this.f32913k.incrementAndGet() & 63) == 0) {
                b();
            }
        }

        public void H() {
            a0();
        }

        @vo.a("this")
        public void I(long now) {
            Z(now);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
        
            unlock();
            H();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
        
            return null;
         */
        @javax.annotation.CheckForNull
        @uo.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public V J(K r13, int r14, V r15, boolean r16) {
            /*
                Method dump skipped, instructions count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.r.J(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
        }

        @uo.a
        public boolean K(com.google.common.cache.e<K, V> entry, int hash) {
            AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray;
            int length;
            com.google.common.cache.e<K, V> eVar;
            com.google.common.cache.e<K, V> eVar2;
            lock();
            try {
                atomicReferenceArray = this.f32908f;
                length = (atomicReferenceArray.length() - 1) & hash;
                eVar = atomicReferenceArray.get(length);
                eVar2 = eVar;
            } catch (Throwable th2) {
                th = th2;
            }
            while (eVar2 != null) {
                if (eVar2 == entry) {
                    this.f32906d++;
                    com.google.common.cache.e<K, V> W = W(eVar, eVar2, eVar2.getKey(), hash, eVar2.a().get(), eVar2.a(), RemovalCause.COLLECTED);
                    int i11 = this.f32904b - 1;
                    atomicReferenceArray.set(length, W);
                    this.f32904b = i11;
                    unlock();
                    H();
                    return true;
                }
                int i12 = hash;
                try {
                    eVar2 = eVar2.getNext();
                    hash = i12;
                } catch (Throwable th3) {
                    th = th3;
                }
                th = th3;
                Throwable th4 = th;
                unlock();
                H();
                throw th4;
            }
            unlock();
            H();
            return false;
        }

        @uo.a
        public boolean L(K key, int hash, a0<K, V> valueReference) {
            AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray;
            int length;
            com.google.common.cache.e<K, V> eVar;
            com.google.common.cache.e<K, V> eVar2;
            lock();
            try {
                atomicReferenceArray = this.f32908f;
                length = (atomicReferenceArray.length() - 1) & hash;
                eVar = atomicReferenceArray.get(length);
                eVar2 = eVar;
            } catch (Throwable th2) {
                th = th2;
            }
            while (eVar2 != null) {
                K key2 = eVar2.getKey();
                if (eVar2.b() == hash && key2 != null && this.f32903a.f32804e.d(key, key2)) {
                    if (eVar2.a() != valueReference) {
                        unlock();
                        if (!isHeldByCurrentThread()) {
                            H();
                        }
                        return false;
                    }
                    this.f32906d++;
                    com.google.common.cache.e<K, V> W = W(eVar, eVar2, key2, hash, valueReference.get(), valueReference, RemovalCause.COLLECTED);
                    int i11 = this.f32904b - 1;
                    atomicReferenceArray.set(length, W);
                    this.f32904b = i11;
                    unlock();
                    if (!isHeldByCurrentThread()) {
                        H();
                    }
                    return true;
                }
                int i12 = hash;
                a0<K, V> a0Var = valueReference;
                try {
                    eVar2 = eVar2.getNext();
                    hash = i12;
                    valueReference = a0Var;
                } catch (Throwable th3) {
                    th = th3;
                }
                th = th3;
                Throwable th4 = th;
                unlock();
                if (isHeldByCurrentThread()) {
                    throw th4;
                }
                H();
                throw th4;
            }
            unlock();
            if (!isHeldByCurrentThread()) {
                H();
            }
            return false;
        }

        @vo.a("this")
        public void M(com.google.common.cache.e<K, V> entry, long now) {
            if (this.f32903a.M()) {
                entry.g(now);
            }
            this.f32915m.add(entry);
        }

        public void N(com.google.common.cache.e<K, V> entry, long now) {
            if (this.f32903a.M()) {
                entry.g(now);
            }
            this.f32912j.add(entry);
        }

        @vo.a("this")
        public void O(com.google.common.cache.e<K, V> entry, int weight, long now) {
            j();
            this.f32905c += weight;
            if (this.f32903a.M()) {
                entry.g(now);
            }
            if (this.f32903a.O()) {
                entry.i(now);
            }
            this.f32915m.add(entry);
            this.f32914l.add(entry);
        }

        @CheckForNull
        @uo.a
        public V P(K k11, int i11, CacheLoader<? super K, V> cacheLoader, boolean z11) {
            m<K, V> z12 = z(k11, i11, z11);
            if (z12 == null) {
                return null;
            }
            p1<V> A = A(k11, i11, z12, cacheLoader);
            if (A.isDone()) {
                try {
                    return (V) y2.f(A);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            r9 = r5.a();
            r8 = r9.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        
            if (r8 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
        
            if (r9.isActive() == false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        
            r12 = com.google.common.cache.RemovalCause.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
            r10 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        
            r11.f32906d++;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
        
            r12 = W(r4, r5, r6, r13, r8, r9, r10);
            r13 = r11.f32904b - 1;
            r0.set(r1, r12);
            r11.f32904b = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
        
            unlock();
            H();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0042, code lost:
        
            r12 = com.google.common.cache.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0046, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0047, code lost:
        
            r12 = r0;
         */
        @javax.annotation.CheckForNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public V Q(java.lang.Object r12, int r13) {
            /*
                r11 = this;
                r11.lock()
                com.google.common.cache.d<K, V> r0 = r11.f32903a     // Catch: java.lang.Throwable -> L72
                ho.u0 r0 = r0.f32815p     // Catch: java.lang.Throwable -> L72
                long r0 = r0.a()     // Catch: java.lang.Throwable -> L72
                r11.I(r0)     // Catch: java.lang.Throwable -> L72
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.e<K, V>> r0 = r11.f32908f     // Catch: java.lang.Throwable -> L72
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L72
                int r1 = r1 + (-1)
                r1 = r1 & r13
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Throwable -> L72
                r4 = r2
                com.google.common.cache.e r4 = (com.google.common.cache.e) r4     // Catch: java.lang.Throwable -> L72
                r5 = r4
            L1f:
                r2 = 0
                if (r5 == 0) goto L75
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Throwable -> L72
                int r3 = r5.b()     // Catch: java.lang.Throwable -> L72
                if (r3 != r13) goto L7d
                if (r6 == 0) goto L7d
                com.google.common.cache.d<K, V> r3 = r11.f32903a     // Catch: java.lang.Throwable -> L72
                com.google.common.base.Equivalence<java.lang.Object> r3 = r3.f32804e     // Catch: java.lang.Throwable -> L72
                boolean r3 = r3.d(r12, r6)     // Catch: java.lang.Throwable -> L72
                if (r3 == 0) goto L7d
                com.google.common.cache.d$a0 r9 = r5.a()     // Catch: java.lang.Throwable -> L72
                java.lang.Object r8 = r9.get()     // Catch: java.lang.Throwable -> L72
                if (r8 == 0) goto L4a
                com.google.common.cache.RemovalCause r12 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L46
            L44:
                r10 = r12
                goto L53
            L46:
                r0 = move-exception
                r12 = r0
                r3 = r11
                goto L85
            L4a:
                boolean r12 = r9.isActive()     // Catch: java.lang.Throwable -> L72
                if (r12 == 0) goto L75
                com.google.common.cache.RemovalCause r12 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L72
                goto L44
            L53:
                int r12 = r11.f32906d     // Catch: java.lang.Throwable -> L72
                int r12 = r12 + 1
                r11.f32906d = r12     // Catch: java.lang.Throwable -> L72
                r3 = r11
                r7 = r13
                com.google.common.cache.e r12 = r3.W(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6f
                int r13 = r3.f32904b     // Catch: java.lang.Throwable -> L6f
                int r13 = r13 + (-1)
                r0.set(r1, r12)     // Catch: java.lang.Throwable -> L6f
                r3.f32904b = r13     // Catch: java.lang.Throwable -> L6f
                r11.unlock()
                r11.H()
                return r8
            L6f:
                r0 = move-exception
            L70:
                r12 = r0
                goto L85
            L72:
                r0 = move-exception
                r3 = r11
                goto L70
            L75:
                r3 = r11
                r11.unlock()
                r11.H()
                return r2
            L7d:
                r3 = r11
                r7 = r13
                com.google.common.cache.e r5 = r5.getNext()     // Catch: java.lang.Throwable -> L6f
                r13 = r7
                goto L1f
            L85:
                r11.unlock()
                r11.H()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.r.Q(java.lang.Object, int):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        
            r10 = r6.a();
            r9 = r10.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r12.f32903a.f32805f.d(r15, r9) == false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (r9 != null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0058, code lost:
        
            if (r10.isActive() == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
        
            r13 = com.google.common.cache.RemovalCause.COLLECTED;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        
            r11 = r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        
            r12.f32906d++;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
        
            r13 = W(r5, r6, r7, r14, r9, r10, r11);
            r14 = r12.f32904b - 1;
            r0.set(r1, r13);
            r12.f32904b = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
        
            if (r11 != com.google.common.cache.RemovalCause.EXPLICIT) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
        
            r2 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
        
            unlock();
            H();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x004a, code lost:
        
            r13 = com.google.common.cache.RemovalCause.EXPLICIT;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x004f, code lost:
        
            r13 = r0;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean R(java.lang.Object r13, int r14, java.lang.Object r15) {
            /*
                r12 = this;
                r12.lock()
                com.google.common.cache.d<K, V> r0 = r12.f32903a     // Catch: java.lang.Throwable -> L80
                ho.u0 r0 = r0.f32815p     // Catch: java.lang.Throwable -> L80
                long r0 = r0.a()     // Catch: java.lang.Throwable -> L80
                r12.I(r0)     // Catch: java.lang.Throwable -> L80
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.e<K, V>> r0 = r12.f32908f     // Catch: java.lang.Throwable -> L80
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L80
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r14
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L80
                r5 = r3
                com.google.common.cache.e r5 = (com.google.common.cache.e) r5     // Catch: java.lang.Throwable -> L80
                r6 = r5
            L1f:
                r3 = 0
                if (r6 == 0) goto L92
                java.lang.Object r7 = r6.getKey()     // Catch: java.lang.Throwable -> L80
                int r4 = r6.b()     // Catch: java.lang.Throwable -> L80
                if (r4 != r14) goto L8a
                if (r7 == 0) goto L8a
                com.google.common.cache.d<K, V> r4 = r12.f32903a     // Catch: java.lang.Throwable -> L80
                com.google.common.base.Equivalence<java.lang.Object> r4 = r4.f32804e     // Catch: java.lang.Throwable -> L80
                boolean r4 = r4.d(r13, r7)     // Catch: java.lang.Throwable -> L80
                if (r4 == 0) goto L8a
                com.google.common.cache.d$a0 r10 = r6.a()     // Catch: java.lang.Throwable -> L80
                java.lang.Object r9 = r10.get()     // Catch: java.lang.Throwable -> L80
                com.google.common.cache.d<K, V> r13 = r12.f32903a     // Catch: java.lang.Throwable -> L80
                com.google.common.base.Equivalence<java.lang.Object> r13 = r13.f32805f     // Catch: java.lang.Throwable -> L80
                boolean r13 = r13.d(r15, r9)     // Catch: java.lang.Throwable -> L80
                if (r13 == 0) goto L52
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L4e
            L4c:
                r11 = r13
                goto L5d
            L4e:
                r0 = move-exception
                r13 = r0
                r4 = r12
                goto L94
            L52:
                if (r9 != 0) goto L92
                boolean r13 = r10.isActive()     // Catch: java.lang.Throwable -> L80
                if (r13 == 0) goto L92
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L80
                goto L4c
            L5d:
                int r13 = r12.f32906d     // Catch: java.lang.Throwable -> L80
                int r13 = r13 + r2
                r12.f32906d = r13     // Catch: java.lang.Throwable -> L80
                r4 = r12
                r8 = r14
                com.google.common.cache.e r13 = r4.W(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7d
                int r14 = r4.f32904b     // Catch: java.lang.Throwable -> L7d
                int r14 = r14 - r2
                r0.set(r1, r13)     // Catch: java.lang.Throwable -> L7d
                r4.f32904b = r14     // Catch: java.lang.Throwable -> L7d
                com.google.common.cache.RemovalCause r13 = com.google.common.cache.RemovalCause.EXPLICIT     // Catch: java.lang.Throwable -> L7d
                if (r11 != r13) goto L75
                goto L76
            L75:
                r2 = r3
            L76:
                r12.unlock()
                r12.H()
                return r2
            L7d:
                r0 = move-exception
            L7e:
                r13 = r0
                goto L94
            L80:
                r0 = move-exception
                r4 = r12
                goto L7e
            L83:
                r12.unlock()
                r12.H()
                return r3
            L8a:
                r4 = r12
                r8 = r14
                com.google.common.cache.e r6 = r6.getNext()     // Catch: java.lang.Throwable -> L7d
                r14 = r8
                goto L1f
            L92:
                r4 = r12
                goto L83
            L94:
                r12.unlock()
                r12.H()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.r.R(java.lang.Object, int, java.lang.Object):boolean");
        }

        @vo.a("this")
        public void S(com.google.common.cache.e<K, V> entry) {
            m(entry.getKey(), entry.b(), entry.a().get(), entry.a().getWeight(), RemovalCause.COLLECTED);
            this.f32914l.remove(entry);
            this.f32915m.remove(entry);
        }

        @vo.a("this")
        @go.e
        @uo.a
        public boolean T(com.google.common.cache.e<K, V> entry, int hash, RemovalCause cause) {
            AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f32908f;
            int length = (atomicReferenceArray.length() - 1) & hash;
            com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
            for (com.google.common.cache.e<K, V> eVar2 = eVar; eVar2 != null; eVar2 = eVar2.getNext()) {
                if (eVar2 == entry) {
                    this.f32906d++;
                    com.google.common.cache.e<K, V> W = W(eVar, eVar2, eVar2.getKey(), hash, eVar2.a().get(), eVar2.a(), cause);
                    int i11 = this.f32904b - 1;
                    atomicReferenceArray.set(length, W);
                    this.f32904b = i11;
                    return true;
                }
            }
            return false;
        }

        @CheckForNull
        @vo.a("this")
        public com.google.common.cache.e<K, V> U(com.google.common.cache.e<K, V> first, com.google.common.cache.e<K, V> entry) {
            int i11 = this.f32904b;
            com.google.common.cache.e<K, V> next = entry.getNext();
            while (first != entry) {
                com.google.common.cache.e<K, V> h11 = h(first, next);
                if (h11 != null) {
                    next = h11;
                } else {
                    S(first);
                    i11--;
                }
                first = first.getNext();
            }
            this.f32904b = i11;
            return next;
        }

        @uo.a
        public boolean V(K key, int hash, m<K, V> valueReference) {
            lock();
            try {
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f32908f;
                int length = (atomicReferenceArray.length() - 1) & hash;
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                com.google.common.cache.e<K, V> eVar2 = eVar;
                while (true) {
                    if (eVar2 == null) {
                        break;
                    }
                    K key2 = eVar2.getKey();
                    if (eVar2.b() != hash || key2 == null || !this.f32903a.f32804e.d(key, key2)) {
                        eVar2 = eVar2.getNext();
                    } else if (eVar2.a() == valueReference) {
                        if (valueReference.isActive()) {
                            eVar2.e(valueReference.h());
                        } else {
                            atomicReferenceArray.set(length, U(eVar, eVar2));
                        }
                        unlock();
                        H();
                        return true;
                    }
                }
                unlock();
                H();
                return false;
            } catch (Throwable th2) {
                unlock();
                H();
                throw th2;
            }
        }

        @CheckForNull
        @vo.a("this")
        public com.google.common.cache.e<K, V> W(com.google.common.cache.e<K, V> first, com.google.common.cache.e<K, V> entry, @CheckForNull K key, int hash, V value, a0<K, V> valueReference, RemovalCause cause) {
            m(key, hash, value, valueReference.getWeight(), cause);
            this.f32914l.remove(entry);
            this.f32915m.remove(entry);
            if (!valueReference.isLoading()) {
                return U(first, entry);
            }
            valueReference.b(null);
            return first;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        
            return null;
         */
        @javax.annotation.CheckForNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public V X(K r14, int r15, V r16) {
            /*
                r13 = this;
                r13.lock()
                com.google.common.cache.d<K, V> r0 = r13.f32903a     // Catch: java.lang.Throwable -> L63
                ho.u0 r0 = r0.f32815p     // Catch: java.lang.Throwable -> L63
                long r7 = r0.a()     // Catch: java.lang.Throwable -> L63
                r13.I(r7)     // Catch: java.lang.Throwable -> L63
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.e<K, V>> r0 = r13.f32908f     // Catch: java.lang.Throwable -> L63
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L63
                int r1 = r1 + (-1)
                r9 = r15 & r1
                java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L63
                r2 = r1
                com.google.common.cache.e r2 = (com.google.common.cache.e) r2     // Catch: java.lang.Throwable -> L63
                r1 = r2
            L20:
                r10 = 0
                if (r1 == 0) goto L66
                java.lang.Object r4 = r1.getKey()     // Catch: java.lang.Throwable -> L63
                int r5 = r1.b()     // Catch: java.lang.Throwable -> L63
                if (r5 != r15) goto L95
                if (r4 == 0) goto L95
                com.google.common.cache.d<K, V> r5 = r13.f32903a     // Catch: java.lang.Throwable -> L63
                com.google.common.base.Equivalence<java.lang.Object> r5 = r5.f32804e     // Catch: java.lang.Throwable -> L63
                boolean r5 = r5.d(r14, r4)     // Catch: java.lang.Throwable -> L63
                if (r5 == 0) goto L95
                r11 = r7
                com.google.common.cache.d$a0 r7 = r1.a()     // Catch: java.lang.Throwable -> L63
                java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L63
                if (r6 != 0) goto L6d
                boolean r14 = r7.isActive()     // Catch: java.lang.Throwable -> L63
                if (r14 == 0) goto L66
                int r14 = r13.f32906d     // Catch: java.lang.Throwable -> L63
                int r14 = r14 + 1
                r13.f32906d = r14     // Catch: java.lang.Throwable -> L63
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L63
                r5 = r15
                r3 = r1
                r1 = r13
                com.google.common.cache.e r14 = r1.W(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L63
                int r2 = r13.f32904b     // Catch: java.lang.Throwable -> L63
                int r2 = r2 + (-1)
                r0.set(r9, r14)     // Catch: java.lang.Throwable -> L63
                r13.f32904b = r2     // Catch: java.lang.Throwable -> L63
                goto L66
            L63:
                r0 = move-exception
                r14 = r0
                goto La0
            L66:
                r13.unlock()
                r13.H()
                return r10
            L6d:
                r0 = r1
                r4 = r6
                int r2 = r13.f32906d     // Catch: java.lang.Throwable -> L63
                int r2 = r2 + 1
                r13.f32906d = r2     // Catch: java.lang.Throwable -> L63
                int r5 = r7.getWeight()     // Catch: java.lang.Throwable -> L63
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L63
                r1 = r13
                r2 = r14
                r3 = r15
                r1.m(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L63
                r7 = r4
                r1 = r13
                r3 = r14
                r4 = r16
                r2 = r0
                r5 = r11
                r1.c0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L63
                r13.n(r2)     // Catch: java.lang.Throwable -> L63
                r13.unlock()
                r13.H()
                return r7
            L95:
                r3 = r2
                r5 = r7
                r2 = r1
                com.google.common.cache.e r2 = r2.getNext()     // Catch: java.lang.Throwable -> L63
                r1 = r2
                r2 = r3
                r7 = r5
                goto L20
            La0:
                r13.unlock()
                r13.H()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.r.X(java.lang.Object, int, java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean Y(K r17, int r18, V r19, V r20) {
            /*
                r16 = this;
                r1 = r16
                r3 = r18
                r1.lock()
                com.google.common.cache.d<K, V> r0 = r1.f32903a     // Catch: java.lang.Throwable -> L67
                ho.u0 r0 = r0.f32815p     // Catch: java.lang.Throwable -> L67
                long r7 = r0.a()     // Catch: java.lang.Throwable -> L67
                r1.I(r7)     // Catch: java.lang.Throwable -> L67
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.cache.e<K, V>> r0 = r1.f32908f     // Catch: java.lang.Throwable -> L67
                int r2 = r0.length()     // Catch: java.lang.Throwable -> L67
                r9 = 1
                int r2 = r2 - r9
                r10 = r3 & r2
                java.lang.Object r2 = r0.get(r10)     // Catch: java.lang.Throwable -> L67
                com.google.common.cache.e r2 = (com.google.common.cache.e) r2     // Catch: java.lang.Throwable -> L67
                r4 = r2
            L23:
                r11 = 0
                if (r4 == 0) goto L69
                r5 = r4
                java.lang.Object r4 = r5.getKey()     // Catch: java.lang.Throwable -> L67
                int r6 = r5.b()     // Catch: java.lang.Throwable -> L67
                if (r6 != r3) goto La9
                if (r4 == 0) goto La9
                com.google.common.cache.d<K, V> r6 = r1.f32903a     // Catch: java.lang.Throwable -> L67
                com.google.common.base.Equivalence<java.lang.Object> r6 = r6.f32804e     // Catch: java.lang.Throwable -> L67
                r12 = r17
                boolean r6 = r6.d(r12, r4)     // Catch: java.lang.Throwable -> L67
                if (r6 == 0) goto La9
                r13 = r7
                com.google.common.cache.d$a0 r7 = r5.a()     // Catch: java.lang.Throwable -> L67
                java.lang.Object r6 = r7.get()     // Catch: java.lang.Throwable -> L67
                if (r6 != 0) goto L70
                boolean r8 = r7.isActive()     // Catch: java.lang.Throwable -> L67
                if (r8 == 0) goto L69
                int r8 = r1.f32906d     // Catch: java.lang.Throwable -> L67
                int r8 = r8 + r9
                r1.f32906d = r8     // Catch: java.lang.Throwable -> L67
                com.google.common.cache.RemovalCause r8 = com.google.common.cache.RemovalCause.COLLECTED     // Catch: java.lang.Throwable -> L67
                r15 = r5
                r5 = r3
                r3 = r15
                com.google.common.cache.e r2 = r1.W(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L67
                int r3 = r1.f32904b     // Catch: java.lang.Throwable -> L67
                int r3 = r3 - r9
                r0.set(r10, r2)     // Catch: java.lang.Throwable -> L67
                r1.f32904b = r3     // Catch: java.lang.Throwable -> L67
                goto L69
            L67:
                r0 = move-exception
                goto Lba
            L69:
                r1.unlock()
                r1.H()
                return r11
            L70:
                r0 = r5
                r4 = r6
                com.google.common.cache.d<K, V> r2 = r1.f32903a     // Catch: java.lang.Throwable -> L67
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.f32805f     // Catch: java.lang.Throwable -> L67
                r3 = r19
                boolean r2 = r2.d(r3, r4)     // Catch: java.lang.Throwable -> L67
                if (r2 == 0) goto La4
                int r2 = r1.f32906d     // Catch: java.lang.Throwable -> L67
                int r2 = r2 + r9
                r1.f32906d = r2     // Catch: java.lang.Throwable -> L67
                int r5 = r7.getWeight()     // Catch: java.lang.Throwable -> L67
                com.google.common.cache.RemovalCause r6 = com.google.common.cache.RemovalCause.REPLACED     // Catch: java.lang.Throwable -> L67
                r3 = r18
                r2 = r12
                r1.m(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L67
                r1 = r16
                r3 = r17
                r4 = r20
                r2 = r0
                r5 = r13
                r1.c0(r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L67
                r1.n(r2)     // Catch: java.lang.Throwable -> L67
                r1.unlock()
                r1.H()
                return r9
            La4:
                r2 = r0
                r1.M(r2, r13)     // Catch: java.lang.Throwable -> L67
                goto L69
            La9:
                r3 = r19
                r4 = r2
                r2 = r5
                r13 = r7
                com.google.common.cache.e r2 = r2.getNext()     // Catch: java.lang.Throwable -> L67
                r3 = r4
                r4 = r2
                r2 = r3
                r3 = r18
                r7 = r13
                goto L23
            Lba:
                r1.unlock()
                r1.H()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.r.Y(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        public void Z(long now) {
            if (tryLock()) {
                try {
                    k();
                    p(now);
                    this.f32913k.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public void a0() {
            if (isHeldByCurrentThread()) {
                return;
            }
            this.f32903a.J();
        }

        public void b() {
            Z(this.f32903a.f32815p.a());
            a0();
        }

        public V b0(com.google.common.cache.e<K, V> entry, K key, int hash, V oldValue, long now, CacheLoader<? super K, V> loader) {
            V P;
            return (!this.f32903a.Q() || now - entry.f() <= this.f32903a.f32812m || entry.a().isLoading() || (P = P(key, hash, loader, true)) == null) ? oldValue : P;
        }

        public void c() {
            while (this.f32910h.poll() != null) {
            }
        }

        @vo.a("this")
        public void c0(com.google.common.cache.e<K, V> entry, K key, V value, long now) {
            a0<K, V> a11 = entry.a();
            int a12 = this.f32903a.f32809j.a(key, value);
            Preconditions.checkState(a12 >= 0, "Weights must be non-negative");
            entry.e(this.f32903a.f32807h.c(this, entry, value, a12));
            O(entry, a12, now);
            a11.b(value);
        }

        public void clear() {
            RemovalCause removalCause;
            if (this.f32904b == 0) {
                return;
            }
            lock();
            try {
                I(this.f32903a.f32815p.a());
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f32908f;
                for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                    for (com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(i11); eVar != null; eVar = eVar.getNext()) {
                        if (eVar.a().isActive()) {
                            K key = eVar.getKey();
                            V v11 = eVar.a().get();
                            try {
                                if (key != null && v11 != null) {
                                    removalCause = RemovalCause.EXPLICIT;
                                    m(key, eVar.b(), v11, eVar.a().getWeight(), removalCause);
                                }
                                m(key, eVar.b(), v11, eVar.a().getWeight(), removalCause);
                            } catch (Throwable th2) {
                                th = th2;
                                unlock();
                                H();
                                throw th;
                            }
                            removalCause = RemovalCause.COLLECTED;
                        }
                    }
                }
                for (int i12 = 0; i12 < atomicReferenceArray.length(); i12++) {
                    atomicReferenceArray.set(i12, null);
                }
                d();
                this.f32914l.clear();
                this.f32915m.clear();
                this.f32913k.set(0);
                this.f32906d++;
                this.f32904b = 0;
                unlock();
                H();
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public void d() {
            if (this.f32903a.W()) {
                c();
            }
            if (this.f32903a.X()) {
                e();
            }
        }

        @uo.a
        public boolean d0(K key, int hash, m<K, V> oldValueReference, V newValue) {
            lock();
            try {
                long a11 = this.f32903a.f32815p.a();
                I(a11);
                int i11 = this.f32904b + 1;
                if (i11 > this.f32907e) {
                    o();
                    i11 = this.f32904b + 1;
                }
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f32908f;
                int length = hash & (atomicReferenceArray.length() - 1);
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(length);
                com.google.common.cache.e<K, V> eVar2 = eVar;
                while (true) {
                    if (eVar2 == null) {
                        this.f32906d++;
                        com.google.common.cache.e<K, V> D = D(key, hash, eVar);
                        c0(D, key, newValue, a11);
                        atomicReferenceArray.set(length, D);
                        this.f32904b = i11;
                        n(D);
                        break;
                    }
                    K key2 = eVar2.getKey();
                    if (eVar2.b() == hash && key2 != null && this.f32903a.f32804e.d(key, key2)) {
                        a0<K, V> a12 = eVar2.a();
                        V v11 = a12.get();
                        if (oldValueReference != a12 && (v11 != null || a12 == d.C)) {
                            m(key, hash, newValue, 0, RemovalCause.REPLACED);
                            unlock();
                            H();
                            return false;
                        }
                        this.f32906d++;
                        if (oldValueReference.isActive()) {
                            m(key, hash, v11, oldValueReference.getWeight(), v11 == null ? RemovalCause.COLLECTED : RemovalCause.REPLACED);
                            i11--;
                        }
                        com.google.common.cache.e<K, V> eVar3 = eVar2;
                        c0(eVar3, key, newValue, a11);
                        this.f32904b = i11;
                        n(eVar3);
                    } else {
                        eVar2 = eVar2.getNext();
                    }
                }
                unlock();
                H();
                return true;
            } catch (Throwable th2) {
                unlock();
                H();
                throw th2;
            }
        }

        public void e() {
            while (this.f32911i.poll() != null) {
            }
        }

        public void e0() {
            if (tryLock()) {
                try {
                    k();
                } finally {
                    unlock();
                }
            }
        }

        public boolean f(Object key, int hash) {
            try {
                if (this.f32904b == 0) {
                    return false;
                }
                com.google.common.cache.e<K, V> v11 = v(key, hash, this.f32903a.f32815p.a());
                if (v11 == null) {
                    return false;
                }
                return v11.a().get() != null;
            } finally {
                G();
            }
        }

        public void f0(long now) {
            if (tryLock()) {
                try {
                    p(now);
                } finally {
                    unlock();
                }
            }
        }

        @go.e
        public boolean g(Object value) {
            try {
                if (this.f32904b != 0) {
                    long a11 = this.f32903a.f32815p.a();
                    AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f32908f;
                    int length = atomicReferenceArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        for (com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(i11); eVar != null; eVar = eVar.getNext()) {
                            V w11 = w(eVar, a11);
                            if (w11 != null && this.f32903a.f32805f.d(value, w11)) {
                                G();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                G();
            }
        }

        public V g0(com.google.common.cache.e<K, V> e11, K key, a0<K, V> valueReference) throws ExecutionException {
            if (!valueReference.isLoading()) {
                throw new AssertionError();
            }
            Preconditions.checkState(!Thread.holdsLock(e11), "Recursive load of: %s", key);
            try {
                V c11 = valueReference.c();
                if (c11 != null) {
                    N(e11, this.f32903a.f32815p.a());
                    return c11;
                }
                throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + key + ".");
            } finally {
                this.f32916n.d(1);
            }
        }

        @CheckForNull
        @vo.a("this")
        public com.google.common.cache.e<K, V> h(com.google.common.cache.e<K, V> original, com.google.common.cache.e<K, V> newNext) {
            K key = original.getKey();
            if (key == null) {
                return null;
            }
            a0<K, V> a11 = original.a();
            V v11 = a11.get();
            if (v11 == null && a11.isActive()) {
                return null;
            }
            com.google.common.cache.e<K, V> c11 = this.f32903a.f32816q.c(this, original, newNext, key);
            c11.e(a11.d(this.f32911i, v11, c11));
            return c11;
        }

        @vo.a("this")
        public void i() {
            int i11 = 0;
            do {
                Reference<? extends K> poll = this.f32910h.poll();
                if (poll == null) {
                    return;
                }
                this.f32903a.K((com.google.common.cache.e) poll);
                i11++;
            } while (i11 != 16);
        }

        @vo.a("this")
        public void j() {
            while (true) {
                com.google.common.cache.e<K, V> poll = this.f32912j.poll();
                if (poll == null) {
                    return;
                }
                if (this.f32915m.contains(poll)) {
                    this.f32915m.add(poll);
                }
            }
        }

        @vo.a("this")
        public void k() {
            if (this.f32903a.W()) {
                i();
            }
            if (this.f32903a.X()) {
                l();
            }
        }

        @vo.a("this")
        public void l() {
            int i11 = 0;
            do {
                Reference<? extends V> poll = this.f32911i.poll();
                if (poll == null) {
                    return;
                }
                this.f32903a.L((a0) poll);
                i11++;
            } while (i11 != 16);
        }

        @vo.a("this")
        public void m(@CheckForNull K key, int hash, @CheckForNull V value, int weight, RemovalCause cause) {
            this.f32905c -= weight;
            if (cause.wasEvicted()) {
                this.f32916n.b();
            }
            if (this.f32903a.f32813n != d.D) {
                this.f32903a.f32813n.offer(RemovalNotification.create(key, value, cause));
            }
        }

        @vo.a("this")
        public void n(com.google.common.cache.e<K, V> newest) {
            if (this.f32903a.l()) {
                j();
                if (newest.a().getWeight() > this.f32909g && !T(newest, newest.b(), RemovalCause.SIZE)) {
                    throw new AssertionError();
                }
                while (this.f32905c > this.f32909g) {
                    com.google.common.cache.e<K, V> x11 = x();
                    if (!T(x11, x11.b(), RemovalCause.SIZE)) {
                        throw new AssertionError();
                    }
                }
            }
        }

        @vo.a("this")
        public void o() {
            AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f32908f;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i11 = this.f32904b;
            AtomicReferenceArray<com.google.common.cache.e<K, V>> F = F(length << 1);
            this.f32907e = (F.length() * 3) / 4;
            int length2 = F.length() - 1;
            for (int i12 = 0; i12 < length; i12++) {
                com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(i12);
                if (eVar != null) {
                    com.google.common.cache.e<K, V> next = eVar.getNext();
                    int b11 = eVar.b() & length2;
                    if (next == null) {
                        F.set(b11, eVar);
                    } else {
                        com.google.common.cache.e<K, V> eVar2 = eVar;
                        while (next != null) {
                            int b12 = next.b() & length2;
                            if (b12 != b11) {
                                eVar2 = next;
                                b11 = b12;
                            }
                            next = next.getNext();
                        }
                        F.set(b11, eVar2);
                        while (eVar != eVar2) {
                            int b13 = eVar.b() & length2;
                            com.google.common.cache.e<K, V> h11 = h(eVar, F.get(b13));
                            if (h11 != null) {
                                F.set(b13, h11);
                            } else {
                                S(eVar);
                                i11--;
                            }
                            eVar = eVar.getNext();
                        }
                    }
                }
            }
            this.f32908f = F;
            this.f32904b = i11;
        }

        @vo.a("this")
        public void p(long now) {
            com.google.common.cache.e<K, V> peek;
            com.google.common.cache.e<K, V> peek2;
            j();
            do {
                peek = this.f32914l.peek();
                if (peek == null || !this.f32903a.z(peek, now)) {
                    do {
                        peek2 = this.f32915m.peek();
                        if (peek2 == null || !this.f32903a.z(peek2, now)) {
                            return;
                        }
                    } while (T(peek2, peek2.b(), RemovalCause.EXPIRED));
                    throw new AssertionError();
                }
            } while (T(peek, peek.b(), RemovalCause.EXPIRED));
            throw new AssertionError();
        }

        @CheckForNull
        public V q(Object key, int hash) {
            try {
                if (this.f32904b != 0) {
                    long a11 = this.f32903a.f32815p.a();
                    com.google.common.cache.e<K, V> v11 = v(key, hash, a11);
                    if (v11 == null) {
                        G();
                        return null;
                    }
                    V v12 = v11.a().get();
                    if (v12 != null) {
                        N(v11, a11);
                        V b02 = b0(v11, v11.getKey(), hash, v12, a11, this.f32903a.f32818s);
                        G();
                        return b02;
                    }
                    e0();
                }
                G();
                return null;
            } catch (Throwable th2) {
                G();
                throw th2;
            }
        }

        @uo.a
        public V r(K key, int hash, CacheLoader<? super K, V> loader) throws ExecutionException {
            K k11;
            int i11;
            CacheLoader<? super K, V> cacheLoader;
            com.google.common.cache.e<K, V> t11;
            Preconditions.checkNotNull(key);
            Preconditions.checkNotNull(loader);
            try {
                try {
                    try {
                        if (this.f32904b == 0 || (t11 = t(key, hash)) == null) {
                            k11 = key;
                            i11 = hash;
                            cacheLoader = loader;
                        } else {
                            long a11 = this.f32903a.f32815p.a();
                            V w11 = w(t11, a11);
                            if (w11 != null) {
                                N(t11, a11);
                                this.f32916n.a(1);
                                V b02 = b0(t11, key, hash, w11, a11, loader);
                                G();
                                return b02;
                            }
                            k11 = key;
                            i11 = hash;
                            cacheLoader = loader;
                            a0<K, V> a12 = t11.a();
                            if (a12.isLoading()) {
                                V g02 = g0(t11, k11, a12);
                                G();
                                return g02;
                            }
                        }
                        V C = C(k11, i11, cacheLoader);
                        G();
                        return C;
                    } catch (ExecutionException e11) {
                        e = e11;
                        ExecutionException executionException = e;
                        Throwable cause = executionException.getCause();
                        if (cause instanceof Error) {
                            throw new ExecutionError((Error) cause);
                        }
                        if (cause instanceof RuntimeException) {
                            throw new UncheckedExecutionException(cause);
                        }
                        throw executionException;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    G();
                    throw th3;
                }
            } catch (ExecutionException e12) {
                e = e12;
            } catch (Throwable th4) {
                th = th4;
                Throwable th32 = th;
                G();
                throw th32;
            }
        }

        @uo.a
        public V s(K k11, int i11, m<K, V> mVar, p1<V> p1Var) throws ExecutionException {
            V v11;
            try {
                v11 = (V) y2.f(p1Var);
            } catch (Throwable th2) {
                th = th2;
                v11 = null;
            }
            try {
                if (v11 != null) {
                    this.f32916n.c(mVar.f());
                    d0(k11, i11, mVar, v11);
                    return v11;
                }
                throw new CacheLoader.InvalidCacheLoadException("CacheLoader returned null for key " + k11 + ".");
            } catch (Throwable th3) {
                th = th3;
                if (v11 == null) {
                    this.f32916n.e(mVar.f());
                    V(k11, i11, mVar);
                }
                throw th;
            }
        }

        @CheckForNull
        public com.google.common.cache.e<K, V> t(Object key, int hash) {
            for (com.google.common.cache.e<K, V> u11 = u(hash); u11 != null; u11 = u11.getNext()) {
                if (u11.b() == hash) {
                    K key2 = u11.getKey();
                    if (key2 == null) {
                        e0();
                    } else if (this.f32903a.f32804e.d(key, key2)) {
                        return u11;
                    }
                }
            }
            return null;
        }

        public com.google.common.cache.e<K, V> u(int hash) {
            return this.f32908f.get(hash & (r0.length() - 1));
        }

        @CheckForNull
        public com.google.common.cache.e<K, V> v(Object key, int hash, long now) {
            com.google.common.cache.e<K, V> t11 = t(key, hash);
            if (t11 == null) {
                return null;
            }
            if (!this.f32903a.z(t11, now)) {
                return t11;
            }
            f0(now);
            return null;
        }

        public V w(com.google.common.cache.e<K, V> entry, long now) {
            if (entry.getKey() == null) {
                e0();
                return null;
            }
            V v11 = entry.a().get();
            if (v11 == null) {
                e0();
                return null;
            }
            if (!this.f32903a.z(entry, now)) {
                return v11;
            }
            f0(now);
            return null;
        }

        @vo.a("this")
        public com.google.common.cache.e<K, V> x() {
            for (com.google.common.cache.e<K, V> eVar : this.f32915m) {
                if (eVar.a().getWeight() > 0) {
                    return eVar;
                }
            }
            throw new AssertionError();
        }

        public void y(AtomicReferenceArray<com.google.common.cache.e<K, V>> newTable) {
            this.f32907e = (newTable.length() * 3) / 4;
            if (!this.f32903a.j()) {
                int i11 = this.f32907e;
                if (i11 == this.f32909g) {
                    this.f32907e = i11 + 1;
                }
            }
            this.f32908f = newTable;
        }

        /* JADX WARN: Finally extract failed */
        @CheckForNull
        public m<K, V> z(K k11, int i11, boolean z11) {
            lock();
            try {
                long a11 = this.f32903a.f32815p.a();
                I(a11);
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = this.f32908f;
                int length = (atomicReferenceArray.length() - 1) & i11;
                com.google.common.cache.e<K, V> eVar = (com.google.common.cache.e) atomicReferenceArray.get(length);
                for (com.google.common.cache.e eVar2 = eVar; eVar2 != null; eVar2 = eVar2.getNext()) {
                    Object key = eVar2.getKey();
                    if (eVar2.b() == i11 && key != null && this.f32903a.f32804e.d(k11, key)) {
                        a0<K, V> a12 = eVar2.a();
                        if (!a12.isLoading() && (!z11 || a11 - eVar2.f() >= this.f32903a.f32812m)) {
                            this.f32906d++;
                            m<K, V> mVar = new m<>(a12);
                            eVar2.e(mVar);
                            unlock();
                            H();
                            return mVar;
                        }
                        unlock();
                        H();
                        return null;
                    }
                }
                this.f32906d++;
                m<K, V> mVar2 = new m<>();
                com.google.common.cache.e<K, V> D = D(k11, i11, eVar);
                D.e(mVar2);
                atomicReferenceArray.set(length, D);
                unlock();
                H();
                return mVar2;
            } catch (Throwable th2) {
                unlock();
                H();
                throw th2;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class t {

        /* renamed from: a, reason: collision with root package name */
        public static final t f32918a = new a("STRONG", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final t f32919b = new b("SOFT", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final t f32920c = new c("WEAK", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ t[] f32921d = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends t {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.d.t
            public Equivalence<Object> b() {
                return Equivalence.c();
            }

            @Override // com.google.common.cache.d.t
            public <K, V> a0<K, V> c(r<K, V> segment, com.google.common.cache.e<K, V> entry, V value, int weight) {
                return weight == 1 ? new x(value) : new i0(value, weight);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends t {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.d.t
            public Equivalence<Object> b() {
                return Equivalence.g();
            }

            @Override // com.google.common.cache.d.t
            public <K, V> a0<K, V> c(r<K, V> segment, com.google.common.cache.e<K, V> entry, V value, int weight) {
                return weight == 1 ? new s(segment.f32911i, value, entry) : new h0(segment.f32911i, value, entry, weight);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum c extends t {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.cache.d.t
            public Equivalence<Object> b() {
                return Equivalence.g();
            }

            @Override // com.google.common.cache.d.t
            public <K, V> a0<K, V> c(r<K, V> segment, com.google.common.cache.e<K, V> entry, V value, int weight) {
                return weight == 1 ? new f0(segment.f32911i, value, entry) : new j0(segment.f32911i, value, entry, weight);
            }
        }

        public t(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ t[] a() {
            return new t[]{f32918a, f32919b, f32920c};
        }

        public static t valueOf(String name) {
            return (t) Enum.valueOf(t.class, name);
        }

        public static t[] values() {
            return (t[]) f32921d.clone();
        }

        public abstract Equivalence<Object> b();

        public abstract <K, V> a0<K, V> c(r<K, V> segment, com.google.common.cache.e<K, V> entry, V value, int weight);

        public /* synthetic */ t(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u<K, V> extends w<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public volatile long f32922e;

        /* renamed from: f, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32923f;

        /* renamed from: g, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32924g;

        public u(K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
            super(key, hash, next);
            this.f32922e = Long.MAX_VALUE;
            this.f32923f = d.G();
            this.f32924g = d.G();
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void c(com.google.common.cache.e<K, V> previous) {
            this.f32924g = previous;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void g(long time) {
            this.f32922e = time;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> k() {
            return this.f32924g;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> m() {
            return this.f32923f;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public long o() {
            return this.f32922e;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void p(com.google.common.cache.e<K, V> next) {
            this.f32923f = next;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v<K, V> extends w<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public volatile long f32925e;

        /* renamed from: f, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32926f;

        /* renamed from: g, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32927g;

        /* renamed from: h, reason: collision with root package name */
        public volatile long f32928h;

        /* renamed from: i, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32929i;

        /* renamed from: j, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32930j;

        public v(K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
            super(key, hash, next);
            this.f32925e = Long.MAX_VALUE;
            this.f32926f = d.G();
            this.f32927g = d.G();
            this.f32928h = Long.MAX_VALUE;
            this.f32929i = d.G();
            this.f32930j = d.G();
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void c(com.google.common.cache.e<K, V> previous) {
            this.f32927g = previous;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> d() {
            return this.f32930j;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public long f() {
            return this.f32928h;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void g(long time) {
            this.f32925e = time;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void i(long time) {
            this.f32928h = time;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> k() {
            return this.f32927g;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> l() {
            return this.f32929i;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> m() {
            return this.f32926f;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public long o() {
            return this.f32925e;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void p(com.google.common.cache.e<K, V> next) {
            this.f32926f = next;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void q(com.google.common.cache.e<K, V> next) {
            this.f32929i = next;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void r(com.google.common.cache.e<K, V> previous) {
            this.f32930j = previous;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class w<K, V> extends AbstractC0384d<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f32931a;

        /* renamed from: b, reason: collision with root package name */
        public final int f32932b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public final com.google.common.cache.e<K, V> f32933c;

        /* renamed from: d, reason: collision with root package name */
        public volatile a0<K, V> f32934d = d.T();

        public w(K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
            this.f32931a = key;
            this.f32932b = hash;
            this.f32933c = next;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public a0<K, V> a() {
            return this.f32934d;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public int b() {
            return this.f32932b;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void e(a0<K, V> valueReference) {
            this.f32934d = valueReference;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public K getKey() {
            return this.f32931a;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> getNext() {
            return this.f32933c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class y<K, V> extends w<K, V> {

        /* renamed from: e, reason: collision with root package name */
        public volatile long f32936e;

        /* renamed from: f, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32937f;

        /* renamed from: g, reason: collision with root package name */
        @Weak
        public com.google.common.cache.e<K, V> f32938g;

        public y(K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
            super(key, hash, next);
            this.f32936e = Long.MAX_VALUE;
            this.f32937f = d.G();
            this.f32938g = d.G();
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> d() {
            return this.f32938g;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public long f() {
            return this.f32936e;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void i(long time) {
            this.f32936e = time;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public com.google.common.cache.e<K, V> l() {
            return this.f32937f;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void q(com.google.common.cache.e<K, V> next) {
            this.f32937f = next;
        }

        @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
        public void r(com.google.common.cache.e<K, V> previous) {
            this.f32938g = previous;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class z extends d<K, V>.i<V> {
        public z() {
            super();
        }

        @Override // com.google.common.cache.d.i, java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    public d(com.google.common.cache.b<? super K, ? super V> bVar, @CheckForNull CacheLoader<? super K, V> cacheLoader) {
        this.f32803d = Math.min(bVar.l(), 65536);
        t q11 = bVar.q();
        this.f32806g = q11;
        this.f32807h = bVar.x();
        this.f32804e = bVar.p();
        this.f32805f = bVar.w();
        long r11 = bVar.r();
        this.f32808i = r11;
        this.f32809j = (jo.u<K, V>) bVar.y();
        this.f32810k = bVar.m();
        this.f32811l = bVar.n();
        this.f32812m = bVar.s();
        b.e eVar = (jo.p<K, V>) bVar.t();
        this.f32814o = eVar;
        this.f32813n = eVar == b.e.INSTANCE ? k() : new ConcurrentLinkedQueue<>();
        this.f32815p = bVar.v(N());
        this.f32816q = f.e(q11, U(), Y());
        this.f32817r = bVar.u().get();
        this.f32818s = cacheLoader;
        int min = Math.min(bVar.o(), 1073741824);
        if (l() && !j()) {
            min = (int) Math.min(min, r11);
        }
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        int i14 = 1;
        while (i14 < this.f32803d && (!l() || i14 * 20 <= this.f32808i)) {
            i13++;
            i14 <<= 1;
        }
        this.f32801b = 32 - i13;
        this.f32800a = i14 - 1;
        this.f32802c = E(i14);
        int i15 = min / i14;
        while (i12 < (i15 * i14 < min ? i15 + 1 : i15)) {
            i12 <<= 1;
        }
        if (l()) {
            long j11 = this.f32808i;
            long j12 = i14;
            long j13 = (j11 / j12) + 1;
            long j14 = j11 % j12;
            while (true) {
                r<K, V>[] rVarArr = this.f32802c;
                if (i11 >= rVarArr.length) {
                    return;
                }
                if (i11 == j14) {
                    j13--;
                }
                rVarArr[i11] = i(i12, j13, bVar.u().get());
                i11++;
            }
        } else {
            while (true) {
                r<K, V>[] rVarArr2 = this.f32802c;
                if (i11 >= rVarArr2.length) {
                    return;
                }
                rVarArr2[i11] = i(i12, -1L, bVar.u().get());
                i11++;
            }
        }
    }

    public static <K, V> com.google.common.cache.e<K, V> G() {
        return q.INSTANCE;
    }

    public static <K, V> void H(com.google.common.cache.e<K, V> nulled) {
        com.google.common.cache.e<K, V> G = G();
        nulled.p(G);
        nulled.c(G);
    }

    public static <K, V> void I(com.google.common.cache.e<K, V> nulled) {
        com.google.common.cache.e<K, V> G = G();
        nulled.q(G);
        nulled.r(G);
    }

    public static int R(int h11) {
        int i11 = h11 + ((h11 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    public static <K, V> a0<K, V> T() {
        return (a0<K, V>) C;
    }

    public static <K, V> void d(com.google.common.cache.e<K, V> previous, com.google.common.cache.e<K, V> next) {
        previous.p(next);
        next.c(previous);
    }

    public static <K, V> void g(com.google.common.cache.e<K, V> previous, com.google.common.cache.e<K, V> next) {
        previous.q(next);
        next.r(previous);
    }

    public static <E> Queue<E> k() {
        return (Queue<E>) D;
    }

    @go.e
    public boolean A(com.google.common.cache.e<K, V> entry, long now) {
        return S(entry.b()).w(entry, now) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<K, V> B(java.util.Set<? extends K> r7, com.google.common.cache.CacheLoader<? super K, V> r8) throws java.util.concurrent.ExecutionException {
        /*
            r6 = this;
            com.google.common.base.Preconditions.checkNotNull(r8)
            com.google.common.base.Preconditions.checkNotNull(r7)
            ho.n0 r0 = ho.n0.c()
            r1 = 1
            r2 = 0
            java.util.Map r7 = r8.e(r7)     // Catch: java.lang.Throwable -> L8e java.lang.Error -> L91 java.lang.Exception -> L98 java.lang.RuntimeException -> L9f java.lang.InterruptedException -> La6 com.google.common.cache.CacheLoader.UnsupportedLoadingOperationException -> Lb4
            if (r7 == 0) goto L6c
            r0.l()
            java.util.Set r3 = r7.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L1d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            if (r5 == 0) goto L3a
            if (r4 != 0) goto L36
            goto L3a
        L36:
            r6.put(r5, r4)
            goto L1d
        L3a:
            r2 = r1
            goto L1d
        L3c:
            if (r2 != 0) goto L4a
            com.google.common.cache.a$b r8 = r6.f32817r
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.g(r1)
            r8.c(r0)
            return r7
        L4a:
            com.google.common.cache.a$b r7 = r6.f32817r
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.g(r1)
            r7.e(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null keys or values from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L6c:
            com.google.common.cache.a$b r7 = r6.f32817r
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.g(r1)
            r7.e(r0)
            com.google.common.cache.CacheLoader$InvalidCacheLoadException r7 = new com.google.common.cache.CacheLoader$InvalidCacheLoadException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r8 = " returned null map from loadAll"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r7.<init>(r8)
            throw r7
        L8e:
            r7 = move-exception
            r1 = r2
            goto Lb7
        L91:
            r7 = move-exception
            com.google.common.util.concurrent.ExecutionError r8 = new com.google.common.util.concurrent.ExecutionError     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L98:
            r7 = move-exception
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        L9f:
            r7 = move-exception
            com.google.common.util.concurrent.UncheckedExecutionException r8 = new com.google.common.util.concurrent.UncheckedExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        La6:
            r7 = move-exception
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L8e
            r8.interrupt()     // Catch: java.lang.Throwable -> L8e
            java.util.concurrent.ExecutionException r8 = new java.util.concurrent.ExecutionException     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L8e
            throw r8     // Catch: java.lang.Throwable -> L8e
        Lb4:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r7 = move-exception
        Lb7:
            if (r1 != 0) goto Lc4
            com.google.common.cache.a$b r8 = r6.f32817r
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r0 = r0.g(r1)
            r8.e(r0)
        Lc4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.d.B(java.util.Set, com.google.common.cache.CacheLoader):java.util.Map");
    }

    public long C() {
        long j11 = 0;
        for (int i11 = 0; i11 < this.f32802c.length; i11++) {
            j11 += Math.max(0, r0[i11].f32904b);
        }
        return j11;
    }

    @go.e
    public com.google.common.cache.e<K, V> D(K key, int hash, @CheckForNull com.google.common.cache.e<K, V> next) {
        r<K, V> S = S(hash);
        S.lock();
        try {
            return S.D(key, hash, next);
        } finally {
            S.unlock();
        }
    }

    public final r<K, V>[] E(int ssize) {
        return new r[ssize];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @go.e
    public a0<K, V> F(com.google.common.cache.e<K, V> entry, V value, int weight) {
        return this.f32807h.c(S(entry.b()), entry, Preconditions.checkNotNull(value), weight);
    }

    public void J() {
        while (true) {
            RemovalNotification<K, V> poll = this.f32813n.poll();
            if (poll == null) {
                return;
            }
            try {
                this.f32814o.a(poll);
            } catch (Throwable th2) {
                B.log(Level.WARNING, "Exception thrown by removal listener", th2);
            }
        }
    }

    public void K(com.google.common.cache.e<K, V> entry) {
        int b11 = entry.b();
        S(b11).K(entry, b11);
    }

    public void L(a0<K, V> valueReference) {
        com.google.common.cache.e<K, V> a11 = valueReference.a();
        int b11 = a11.b();
        S(b11).L(a11.getKey(), b11, valueReference);
    }

    public boolean M() {
        return n();
    }

    public boolean N() {
        return O() || M();
    }

    public boolean O() {
        return o() || Q();
    }

    public void P(K key) {
        int x11 = x(Preconditions.checkNotNull(key));
        S(x11).P(key, x11, this.f32818s, false);
    }

    public boolean Q() {
        return this.f32812m > 0;
    }

    public r<K, V> S(int hash) {
        return this.f32802c[(hash >>> this.f32801b) & this.f32800a];
    }

    public boolean U() {
        return V() || M();
    }

    public boolean V() {
        return n() || l();
    }

    public boolean W() {
        return this.f32806g != t.f32918a;
    }

    public boolean X() {
        return this.f32807h != t.f32918a;
    }

    public boolean Y() {
        return a0() || O();
    }

    public boolean a0() {
        return o();
    }

    public void b() {
        for (r<K, V> rVar : this.f32802c) {
            rVar.b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (r<K, V> rVar : this.f32802c) {
            rVar.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        if (key == null) {
            return false;
        }
        int x11 = x(key);
        return S(x11).f(key, x11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        boolean z11 = false;
        if (obj == null) {
            return false;
        }
        long a11 = this.f32815p.a();
        r<K, V>[] rVarArr = this.f32802c;
        long j11 = -1;
        int i11 = 0;
        while (i11 < 3) {
            int length = rVarArr.length;
            long j12 = 0;
            for (?? r12 = z11; r12 < length; r12++) {
                r<K, V> rVar = rVarArr[r12];
                int i12 = rVar.f32904b;
                AtomicReferenceArray<com.google.common.cache.e<K, V>> atomicReferenceArray = rVar.f32908f;
                boolean z12 = z11;
                for (?? r15 = z12; r15 < atomicReferenceArray.length(); r15++) {
                    com.google.common.cache.e<K, V> eVar = atomicReferenceArray.get(r15);
                    while (eVar != null) {
                        r<K, V>[] rVarArr2 = rVarArr;
                        V w11 = rVar.w(eVar, a11);
                        com.google.common.cache.e<K, V> eVar2 = eVar;
                        if (w11 != null && this.f32805f.d(obj, w11)) {
                            return true;
                        }
                        eVar = eVar2.getNext();
                        rVarArr = rVarArr2;
                    }
                }
                j12 += rVar.f32906d;
                z11 = z12;
            }
            boolean z13 = z11;
            r<K, V>[] rVarArr3 = rVarArr;
            if (j12 == j11) {
                return z13;
            }
            i11++;
            j11 = j12;
            z11 = z13;
            rVarArr = rVarArr3;
        }
        return z11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @go.c
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f32821v;
        if (set != null) {
            return set;
        }
        h hVar = new h();
        this.f32821v = hVar;
        return hVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    @uo.a
    public V get(@CheckForNull Object key) {
        if (key == null) {
            return null;
        }
        int x11 = x(key);
        return S(x11).q(key, x11);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    public V getOrDefault(@CheckForNull Object key, @CheckForNull V defaultValue) {
        V v11 = get(key);
        return v11 != null ? v11 : defaultValue;
    }

    @go.e
    public com.google.common.cache.e<K, V> h(com.google.common.cache.e<K, V> original, com.google.common.cache.e<K, V> newNext) {
        return S(original.b()).h(original, newNext);
    }

    public r<K, V> i(int initialCapacity, long maxSegmentWeight, a.b statsCounter) {
        return new r<>(this, initialCapacity, maxSegmentWeight, statsCounter);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        r<K, V>[] rVarArr = this.f32802c;
        long j11 = 0;
        for (r<K, V> rVar : rVarArr) {
            if (rVar.f32904b != 0) {
                return false;
            }
            j11 += r8.f32906d;
        }
        if (j11 == 0) {
            return true;
        }
        for (r<K, V> rVar2 : rVarArr) {
            if (rVar2.f32904b != 0) {
                return false;
            }
            j11 -= r9.f32906d;
        }
        return j11 == 0;
    }

    public boolean j() {
        return this.f32809j != b.f.INSTANCE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f32819t;
        if (set != null) {
            return set;
        }
        k kVar = new k();
        this.f32819t = kVar;
        return kVar;
    }

    public boolean l() {
        return this.f32808i >= 0;
    }

    public boolean m() {
        return o() || n();
    }

    public boolean n() {
        return this.f32810k > 0;
    }

    public boolean o() {
        return this.f32811l > 0;
    }

    @uo.a
    public V p(K key, CacheLoader<? super K, V> loader) throws ExecutionException {
        int x11 = x(Preconditions.checkNotNull(key));
        return S(x11).r(key, x11, loader);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    @uo.a
    public V put(K key, V value) {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(value);
        int x11 = x(key);
        return S(x11).J(key, x11, value, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m11) {
        for (Map.Entry<? extends K, ? extends V> entry : m11.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    public V putIfAbsent(K key, V value) {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(value);
        int x11 = x(key);
        return S(x11).J(key, x11, value, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableMap<K, V> r(Iterable<? extends K> keys) throws ExecutionException {
        LinkedHashMap c02 = u6.c0();
        LinkedHashSet A2 = q8.A();
        int i11 = 0;
        int i12 = 0;
        for (K k11 : keys) {
            Object obj = get(k11);
            if (!c02.containsKey(k11)) {
                c02.put(k11, obj);
                if (obj == null) {
                    i12++;
                    A2.add(k11);
                } else {
                    i11++;
                }
            }
        }
        try {
            if (!A2.isEmpty()) {
                try {
                    Map B2 = B(Collections.unmodifiableSet(A2), this.f32818s);
                    for (Object obj2 : A2) {
                        Object obj3 = B2.get(obj2);
                        if (obj3 == null) {
                            throw new CacheLoader.InvalidCacheLoadException("loadAll failed to return a value for " + obj2);
                        }
                        c02.put(obj2, obj3);
                    }
                } catch (CacheLoader.UnsupportedLoadingOperationException unused) {
                    for (Object obj4 : A2) {
                        i12--;
                        c02.put(obj4, p(obj4, this.f32818s));
                    }
                }
            }
            ImmutableMap<K, V> copyOf = ImmutableMap.copyOf((Map) c02);
            this.f32817r.a(i11);
            this.f32817r.d(i12);
            return copyOf;
        } catch (Throwable th2) {
            this.f32817r.a(i11);
            this.f32817r.d(i12);
            throw th2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    @uo.a
    public V remove(@CheckForNull Object key) {
        if (key == null) {
            return null;
        }
        int x11 = x(key);
        return S(x11).Q(key, x11);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @uo.a
    public boolean replace(K key, @CheckForNull V oldValue, V newValue) {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(newValue);
        if (oldValue == null) {
            return false;
        }
        int x11 = x(key);
        return S(x11).Y(key, x11, oldValue, newValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImmutableMap<K, V> s(Iterable<?> keys) {
        ImmutableMap.b builder = ImmutableMap.builder();
        int i11 = 0;
        int i12 = 0;
        for (Object obj : keys) {
            V v11 = get(obj);
            if (v11 == null) {
                i12++;
            } else {
                builder.i(obj, v11);
                i11++;
            }
        }
        this.f32817r.a(i11);
        this.f32817r.d(i12);
        return builder.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return ro.i.A(C());
    }

    @CheckForNull
    public com.google.common.cache.e<K, V> t(@CheckForNull Object key) {
        if (key == null) {
            return null;
        }
        int x11 = x(key);
        return S(x11).t(key, x11);
    }

    @CheckForNull
    public V u(Object key) {
        int x11 = x(Preconditions.checkNotNull(key));
        V q11 = S(x11).q(key, x11);
        if (q11 == null) {
            this.f32817r.d(1);
            return q11;
        }
        this.f32817r.a(1);
        return q11;
    }

    @CheckForNull
    public V v(com.google.common.cache.e<K, V> entry, long now) {
        V v11;
        if (entry.getKey() == null || (v11 = entry.a().get()) == null || z(entry, now)) {
            return null;
        }
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f32820u;
        if (collection != null) {
            return collection;
        }
        b0 b0Var = new b0();
        this.f32820u = b0Var;
        return b0Var;
    }

    public V w(K key) throws ExecutionException {
        return p(key, this.f32818s);
    }

    public int x(@CheckForNull Object key) {
        return R(this.f32804e.f(key));
    }

    public void y(Iterable<?> keys) {
        Iterator<?> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public boolean z(com.google.common.cache.e<K, V> entry, long now) {
        Preconditions.checkNotNull(entry);
        if (!n() || now - entry.o() < this.f32810k) {
            return o() && now - entry.f() >= this.f32811l;
        }
        return true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @uo.a
    public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
        if (key == null || value == null) {
            return false;
        }
        int x11 = x(key);
        return S(x11).R(key, x11, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    @uo.a
    public V replace(K key, V value) {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(value);
        int x11 = x(key);
        return S(x11).X(key, x11, value);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum q implements com.google.common.cache.e<Object, Object> {
        INSTANCE;

        @Override // com.google.common.cache.e
        @CheckForNull
        public a0<Object, Object> a() {
            return null;
        }

        @Override // com.google.common.cache.e
        public int b() {
            return 0;
        }

        @Override // com.google.common.cache.e
        public long f() {
            return 0L;
        }

        @Override // com.google.common.cache.e
        @CheckForNull
        public Object getKey() {
            return null;
        }

        @Override // com.google.common.cache.e
        @CheckForNull
        public com.google.common.cache.e<Object, Object> getNext() {
            return null;
        }

        @Override // com.google.common.cache.e
        public long o() {
            return 0L;
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<Object, Object> d() {
            return this;
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<Object, Object> k() {
            return this;
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<Object, Object> l() {
            return this;
        }

        @Override // com.google.common.cache.e
        public com.google.common.cache.e<Object, Object> m() {
            return this;
        }

        @Override // com.google.common.cache.e
        public void c(com.google.common.cache.e<Object, Object> previous) {
        }

        @Override // com.google.common.cache.e
        public void e(a0<Object, Object> valueReference) {
        }

        @Override // com.google.common.cache.e
        public void g(long time) {
        }

        @Override // com.google.common.cache.e
        public void i(long time) {
        }

        @Override // com.google.common.cache.e
        public void p(com.google.common.cache.e<Object, Object> next) {
        }

        @Override // com.google.common.cache.e
        public void q(com.google.common.cache.e<Object, Object> next) {
        }

        @Override // com.google.common.cache.e
        public void r(com.google.common.cache.e<Object, Object> previous) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<K, V> extends AbstractQueue<com.google.common.cache.e<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.common.cache.e<K, V> f32833a = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends com.google.common.collect.l<com.google.common.cache.e<K, V>> {
            public b(com.google.common.cache.e firstOrNull) {
                super(firstOrNull);
            }

            @Override // com.google.common.collect.l
            @CheckForNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.e<K, V> a(com.google.common.cache.e<K, V> previous) {
                com.google.common.cache.e<K, V> m11 = previous.m();
                if (m11 == e.this.f32833a) {
                    return null;
                }
                return m11;
            }
        }

        @Override // java.util.Queue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.e<K, V> entry) {
            d.d(entry.k(), entry.m());
            d.d(this.f32833a.k(), entry);
            d.d(entry, this.f32833a);
            return true;
        }

        @Override // java.util.Queue
        @CheckForNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.e<K, V> peek() {
            com.google.common.cache.e<K, V> m11 = this.f32833a.m();
            if (m11 == this.f32833a) {
                return null;
            }
            return m11;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.e<K, V> m11 = this.f32833a.m();
            while (true) {
                com.google.common.cache.e<K, V> eVar = this.f32833a;
                if (m11 == eVar) {
                    eVar.p(eVar);
                    com.google.common.cache.e<K, V> eVar2 = this.f32833a;
                    eVar2.c(eVar2);
                    return;
                } else {
                    com.google.common.cache.e<K, V> m12 = m11.m();
                    d.H(m11);
                    m11 = m12;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o11) {
            return ((com.google.common.cache.e) o11).m() != q.INSTANCE;
        }

        @Override // java.util.Queue
        @CheckForNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.e<K, V> poll() {
            com.google.common.cache.e<K, V> m11 = this.f32833a.m();
            if (m11 == this.f32833a) {
                return null;
            }
            remove(m11);
            return m11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f32833a.m() == this.f32833a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.e<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @uo.a
        public boolean remove(Object o11) {
            com.google.common.cache.e eVar = (com.google.common.cache.e) o11;
            com.google.common.cache.e<K, V> k11 = eVar.k();
            com.google.common.cache.e<K, V> m11 = eVar.m();
            d.d(k11, m11);
            d.H(eVar);
            return m11 != q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i11 = 0;
            for (com.google.common.cache.e<K, V> m11 = this.f32833a.m(); m11 != this.f32833a; m11 = m11.m()) {
                i11++;
            }
            return i11;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends AbstractC0384d<K, V> {

            /* renamed from: a, reason: collision with root package name */
            @Weak
            public com.google.common.cache.e<K, V> f32834a = this;

            /* renamed from: b, reason: collision with root package name */
            @Weak
            public com.google.common.cache.e<K, V> f32835b = this;

            public a() {
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public void c(com.google.common.cache.e<K, V> previous) {
                this.f32835b = previous;
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public com.google.common.cache.e<K, V> k() {
                return this.f32835b;
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public com.google.common.cache.e<K, V> m() {
                return this.f32834a;
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public long o() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public void p(com.google.common.cache.e<K, V> next) {
                this.f32834a = next;
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public void g(long time) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k0<K, V> extends AbstractQueue<com.google.common.cache.e<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.common.cache.e<K, V> f32873a = new a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends com.google.common.collect.l<com.google.common.cache.e<K, V>> {
            public b(com.google.common.cache.e firstOrNull) {
                super(firstOrNull);
            }

            @Override // com.google.common.collect.l
            @CheckForNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public com.google.common.cache.e<K, V> a(com.google.common.cache.e<K, V> previous) {
                com.google.common.cache.e<K, V> l11 = previous.l();
                if (l11 == k0.this.f32873a) {
                    return null;
                }
                return l11;
            }
        }

        @Override // java.util.Queue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean offer(com.google.common.cache.e<K, V> entry) {
            d.g(entry.d(), entry.l());
            d.g(this.f32873a.d(), entry);
            d.g(entry, this.f32873a);
            return true;
        }

        @Override // java.util.Queue
        @CheckForNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.e<K, V> peek() {
            com.google.common.cache.e<K, V> l11 = this.f32873a.l();
            if (l11 == this.f32873a) {
                return null;
            }
            return l11;
        }

        @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            com.google.common.cache.e<K, V> l11 = this.f32873a.l();
            while (true) {
                com.google.common.cache.e<K, V> eVar = this.f32873a;
                if (l11 == eVar) {
                    eVar.q(eVar);
                    com.google.common.cache.e<K, V> eVar2 = this.f32873a;
                    eVar2.r(eVar2);
                    return;
                } else {
                    com.google.common.cache.e<K, V> l12 = l11.l();
                    d.I(l11);
                    l11 = l12;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o11) {
            return ((com.google.common.cache.e) o11).l() != q.INSTANCE;
        }

        @Override // java.util.Queue
        @CheckForNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public com.google.common.cache.e<K, V> poll() {
            com.google.common.cache.e<K, V> l11 = this.f32873a.l();
            if (l11 == this.f32873a) {
                return null;
            }
            remove(l11);
            return l11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return this.f32873a.l() == this.f32873a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<com.google.common.cache.e<K, V>> iterator() {
            return new b(peek());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        @uo.a
        public boolean remove(Object o11) {
            com.google.common.cache.e eVar = (com.google.common.cache.e) o11;
            com.google.common.cache.e<K, V> d11 = eVar.d();
            com.google.common.cache.e<K, V> l11 = eVar.l();
            d.g(d11, l11);
            d.I(eVar);
            return l11 != q.INSTANCE;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            int i11 = 0;
            for (com.google.common.cache.e<K, V> l11 = this.f32873a.l(); l11 != this.f32873a; l11 = l11.l()) {
                i11++;
            }
            return i11;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends AbstractC0384d<K, V> {

            /* renamed from: a, reason: collision with root package name */
            @Weak
            public com.google.common.cache.e<K, V> f32874a = this;

            /* renamed from: b, reason: collision with root package name */
            @Weak
            public com.google.common.cache.e<K, V> f32875b = this;

            public a() {
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public com.google.common.cache.e<K, V> d() {
                return this.f32875b;
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public long f() {
                return Long.MAX_VALUE;
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public com.google.common.cache.e<K, V> l() {
                return this.f32874a;
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public void q(com.google.common.cache.e<K, V> next) {
                this.f32874a = next;
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public void r(com.google.common.cache.e<K, V> previous) {
                this.f32875b = previous;
            }

            @Override // com.google.common.cache.d.AbstractC0384d, com.google.common.cache.e
            public void i(long time) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a0<Object, Object> {
        @Override // com.google.common.cache.d.a0
        @CheckForNull
        public com.google.common.cache.e<Object, Object> a() {
            return null;
        }

        @Override // com.google.common.cache.d.a0
        @CheckForNull
        public Object c() {
            return null;
        }

        @Override // com.google.common.cache.d.a0
        @CheckForNull
        public Object get() {
            return null;
        }

        @Override // com.google.common.cache.d.a0
        public int getWeight() {
            return 0;
        }

        @Override // com.google.common.cache.d.a0
        public boolean isActive() {
            return false;
        }

        @Override // com.google.common.cache.d.a0
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.d.a0
        public void b(Object newValue) {
        }

        @Override // com.google.common.cache.d.a0
        public a0<Object, Object> d(ReferenceQueue<Object> queue, @CheckForNull Object value, com.google.common.cache.e<Object, Object> entry) {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f0<K, V> extends WeakReference<V> implements a0<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.common.cache.e<K, V> f32854a;

        public f0(ReferenceQueue<V> queue, V referent, com.google.common.cache.e<K, V> entry) {
            super(referent, queue);
            this.f32854a = entry;
        }

        @Override // com.google.common.cache.d.a0
        public com.google.common.cache.e<K, V> a() {
            return this.f32854a;
        }

        @Override // com.google.common.cache.d.a0
        public V c() {
            return get();
        }

        @Override // com.google.common.cache.d.a0
        public a0<K, V> d(ReferenceQueue<V> queue, V value, com.google.common.cache.e<K, V> entry) {
            return new f0(queue, value, entry);
        }

        @Override // com.google.common.cache.d.a0
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.d.a0
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.d.a0
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.d.a0
        public void b(V newValue) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class s<K, V> extends SoftReference<V> implements a0<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.common.cache.e<K, V> f32917a;

        public s(ReferenceQueue<V> queue, V referent, com.google.common.cache.e<K, V> entry) {
            super(referent, queue);
            this.f32917a = entry;
        }

        @Override // com.google.common.cache.d.a0
        public com.google.common.cache.e<K, V> a() {
            return this.f32917a;
        }

        @Override // com.google.common.cache.d.a0
        public V c() {
            return get();
        }

        public a0<K, V> d(ReferenceQueue<V> queue, V value, com.google.common.cache.e<K, V> entry) {
            return new s(queue, value, entry);
        }

        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.d.a0
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.d.a0
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.d.a0
        public void b(V newValue) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class x<K, V> implements a0<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final V f32935a;

        public x(V referent) {
            this.f32935a = referent;
        }

        @Override // com.google.common.cache.d.a0
        public com.google.common.cache.e<K, V> a() {
            return null;
        }

        @Override // com.google.common.cache.d.a0
        public V c() {
            return get();
        }

        @Override // com.google.common.cache.d.a0
        public V get() {
            return this.f32935a;
        }

        @Override // com.google.common.cache.d.a0
        public int getWeight() {
            return 1;
        }

        @Override // com.google.common.cache.d.a0
        public boolean isActive() {
            return true;
        }

        @Override // com.google.common.cache.d.a0
        public boolean isLoading() {
            return false;
        }

        @Override // com.google.common.cache.d.a0
        public void b(V newValue) {
        }

        @Override // com.google.common.cache.d.a0
        public a0<K, V> d(ReferenceQueue<V> queue, V value, com.google.common.cache.e<K, V> entry) {
            return this;
        }
    }
}
