package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.collect.s6;
import com.google.common.collect.t6.j;
import com.google.common.collect.t6.n;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.CheckForNull;
import rx.internal.util.atomic.SpscExactAtomicArrayQueue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
/* loaded from: classes7.dex */
public class t6<K, V, E extends j<K, V, E>, S extends n<K, V, E, S>> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final int f33872j = 1073741824;

    /* renamed from: k, reason: collision with root package name */
    public static final int f33873k = 65536;

    /* renamed from: l, reason: collision with root package name */
    public static final int f33874l = 3;

    /* renamed from: m, reason: collision with root package name */
    public static final int f33875m = 63;

    /* renamed from: n, reason: collision with root package name */
    public static final int f33876n = 16;

    /* renamed from: o, reason: collision with root package name */
    public static final g0<Object, Object, f> f33877o = new a();
    private static final long serialVersionUID = 5;

    /* renamed from: a, reason: collision with root package name */
    public final transient int f33878a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f33879b;

    /* renamed from: c, reason: collision with root package name */
    public final transient n<K, V, E, S>[] f33880c;

    /* renamed from: d, reason: collision with root package name */
    public final int f33881d;

    /* renamed from: e, reason: collision with root package name */
    public final Equivalence<Object> f33882e;

    /* renamed from: f, reason: collision with root package name */
    public final transient k<K, V, E, S> f33883f;

    /* renamed from: g, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient Set<K> f33884g;

    /* renamed from: h, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient Collection<V> f33885h;

    /* renamed from: i, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public transient Set<Map.Entry<K, V>> f33886i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b<K, V> extends m4<K, V> implements Serializable {
        private static final long serialVersionUID = 3;

        /* renamed from: a, reason: collision with root package name */
        public final p f33888a;

        /* renamed from: b, reason: collision with root package name */
        public final p f33889b;

        /* renamed from: c, reason: collision with root package name */
        public final Equivalence<Object> f33890c;

        /* renamed from: d, reason: collision with root package name */
        public final Equivalence<Object> f33891d;

        /* renamed from: e, reason: collision with root package name */
        public final int f33892e;

        /* renamed from: f, reason: collision with root package name */
        public transient ConcurrentMap<K, V> f33893f;

        public b(p keyStrength, p valueStrength, Equivalence<Object> keyEquivalence, Equivalence<Object> valueEquivalence, int concurrencyLevel, ConcurrentMap<K, V> delegate) {
            this.f33888a = keyStrength;
            this.f33889b = valueStrength;
            this.f33890c = keyEquivalence;
            this.f33891d = valueEquivalence;
            this.f33892e = concurrencyLevel;
            this.f33893f = delegate;
        }

        @Override // com.google.common.collect.m4, com.google.common.collect.w4, com.google.common.collect.c5
        /* renamed from: w */
        public ConcurrentMap<K, V> delegate() {
            return this.f33893f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @go.d
        public void x(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject == null) {
                    return;
                }
                this.f33893f.put(readObject, objectInputStream.readObject());
            }
        }

        @go.d
        public s6 y(ObjectInputStream in2) throws IOException {
            return new s6().g(in2.readInt()).j(this.f33888a).k(this.f33889b).h(this.f33890c).a(this.f33892e);
        }

        public void z(ObjectOutputStream out) throws IOException {
            out.writeInt(this.f33893f.size());
            for (Map.Entry<K, V> entry : this.f33893f.entrySet()) {
                out.writeObject(entry.getKey());
                out.writeObject(entry.getValue());
            }
            out.writeObject(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b0<K, V> extends d<K, V, b0<K, V>> implements w<K, V, b0<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        @CheckForNull
        public volatile V f33894b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<K, V> implements k<K, V, b0<K, V>, c0<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f33895a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f33895a;
            }

            @Override // com.google.common.collect.t6.k
            public p c() {
                return p.f33930b;
            }

            @Override // com.google.common.collect.t6.k
            public p e() {
                return p.f33929a;
            }

            @Override // com.google.common.collect.t6.k
            @CheckForNull
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public b0<K, V> d(c0<K, V> segment, b0<K, V> entry, @CheckForNull b0<K, V> newNext) {
                K key = entry.getKey();
                if (key == null) {
                    return null;
                }
                b0<K, V> f11 = f(segment, key, entry.f33900a, newNext);
                f11.f33894b = entry.f33894b;
                return f11;
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public b0<K, V> f(c0<K, V> segment, K key, int hash, @CheckForNull b0<K, V> next) {
                return next == null ? new b0<>(segment.f33899g, key, hash, null) : new b(segment.f33899g, key, hash, next, null);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public c0<K, V> a(t6<K, V, b0<K, V>, c0<K, V>> map, int initialCapacity) {
                return new c0<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(c0<K, V> segment, b0<K, V> entry, V value) {
                entry.f33894b = value;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b<K, V> extends b0<K, V> {

            /* renamed from: c, reason: collision with root package name */
            public final b0<K, V> f33896c;

            public /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i11, b0 b0Var, a aVar) {
                this(referenceQueue, obj, i11, b0Var);
            }

            @Override // com.google.common.collect.t6.d, com.google.common.collect.t6.j
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public b0<K, V> getNext() {
                return this.f33896c;
            }

            public b(ReferenceQueue<K> queue, K key, int hash, b0<K, V> next) {
                super(queue, key, hash, null);
                this.f33896c = next;
            }
        }

        public /* synthetic */ b0(ReferenceQueue referenceQueue, Object obj, int i11, a aVar) {
            this(referenceQueue, obj, i11);
        }

        @Override // com.google.common.collect.t6.j
        @CheckForNull
        public final V getValue() {
            return this.f33894b;
        }

        public b0(ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
            this.f33894b = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class c<K, V, E extends j<K, V, E>> implements j<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        public final K f33897a;

        /* renamed from: b, reason: collision with root package name */
        public final int f33898b;

        public c(K key, int hash) {
            this.f33897a = key;
            this.f33898b = hash;
        }

        @Override // com.google.common.collect.t6.j
        public final int b() {
            return this.f33898b;
        }

        @Override // com.google.common.collect.t6.j
        public final K getKey() {
            return this.f33897a;
        }

        @Override // com.google.common.collect.t6.j
        @CheckForNull
        public E getNext() {
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d<K, V, E extends j<K, V, E>> extends WeakReference<K> implements j<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        public final int f33900a;

        public d(ReferenceQueue<K> queue, K key, int hash) {
            super(key, queue);
            this.f33900a = hash;
        }

        @Override // com.google.common.collect.t6.j
        public final int b() {
            return this.f33900a;
        }

        @Override // com.google.common.collect.t6.j
        public final K getKey() {
            return get();
        }

        @CheckForNull
        public E getNext() {
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d0<K, V> extends d<K, V, d0<K, V>> implements f0<K, V, d0<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        public volatile g0<K, V, d0<K, V>> f33901b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<K, V> implements k<K, V, d0<K, V>, e0<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f33902a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f33902a;
            }

            @Override // com.google.common.collect.t6.k
            public p c() {
                return p.f33930b;
            }

            @Override // com.google.common.collect.t6.k
            public p e() {
                return p.f33930b;
            }

            @Override // com.google.common.collect.t6.k
            @CheckForNull
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public d0<K, V> d(e0<K, V> segment, d0<K, V> entry, @CheckForNull d0<K, V> newNext) {
                K key = entry.getKey();
                if (key == null || n.u(entry)) {
                    return null;
                }
                d0<K, V> f11 = f(segment, key, entry.f33900a, newNext);
                f11.f33901b = entry.f33901b.b(segment.f33906h, f11);
                return f11;
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public d0<K, V> f(e0<K, V> segment, K key, int hash, @CheckForNull d0<K, V> next) {
                return next == null ? new d0<>(segment.f33905g, key, hash) : new b(segment.f33905g, key, hash, next);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public e0<K, V> a(t6<K, V, d0<K, V>, e0<K, V>> map, int initialCapacity) {
                return new e0<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(e0<K, V> segment, d0<K, V> entry, V value) {
                g0 g0Var = entry.f33901b;
                entry.f33901b = new h0(segment.f33906h, value, entry);
                g0Var.clear();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b<K, V> extends d0<K, V> {

            /* renamed from: c, reason: collision with root package name */
            public final d0<K, V> f33903c;

            public b(ReferenceQueue<K> queue, K key, int hash, d0<K, V> next) {
                super(queue, key, hash);
                this.f33903c = next;
            }

            @Override // com.google.common.collect.t6.d, com.google.common.collect.t6.j
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public d0<K, V> getNext() {
                return this.f33903c;
            }
        }

        public d0(ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
            this.f33901b = t6.t();
        }

        @Override // com.google.common.collect.t6.f0
        public final g0<K, V, d0<K, V>> a() {
            return this.f33901b;
        }

        @Override // com.google.common.collect.t6.j
        public final V getValue() {
            return this.f33901b.get();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<t6<?, ?, ?, ?>> f33904a;

        public e(t6<?, ?, ?, ?> map) {
            this.f33904a = new WeakReference<>(map);
        }

        @Override // java.lang.Runnable
        public void run() {
            t6<?, ?, ?, ?> t6Var = this.f33904a.get();
            if (t6Var == null) {
                throw new CancellationException();
            }
            for (n<?, ?, ?, ?> nVar : t6Var.f33880c) {
                nVar.O();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements j<Object, Object, f> {
        public f() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.t6.j
        public int b() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.t6.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f getNext() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.t6.j
        public Object getKey() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.t6.j
        public Object getValue() {
            throw new AssertionError();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface f0<K, V, E extends j<K, V, E>> extends j<K, V, E> {
        g0<K, V, E> a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class g extends t6<K, V, E, S>.i<Map.Entry<K, V>> {
        public g() {
            super();
        }

        @Override // com.google.common.collect.t6.i, java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            return c();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g0<K, V, E extends j<K, V, E>> {
        E a();

        g0<K, V, E> b(ReferenceQueue<V> queue, E entry);

        void clear();

        @CheckForNull
        V get();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class h extends AbstractSet<Map.Entry<K, V>> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            t6.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o11) {
            Map.Entry entry;
            Object key;
            Object obj;
            return (o11 instanceof Map.Entry) && (key = (entry = (Map.Entry) o11).getKey()) != null && (obj = t6.this.get(key)) != null && t6.this.u().d(entry.getValue(), obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return t6.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o11) {
            Map.Entry entry;
            Object key;
            return (o11 instanceof Map.Entry) && (key = (entry = (Map.Entry) o11).getKey()) != null && t6.this.remove(key, entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t6.this.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h0<K, V, E extends j<K, V, E>> extends WeakReference<V> implements g0<K, V, E> {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final E f33909a;

        public h0(ReferenceQueue<V> queue, V referent, E entry) {
            super(referent, queue);
            this.f33909a = entry;
        }

        @Override // com.google.common.collect.t6.g0
        public E a() {
            return this.f33909a;
        }

        @Override // com.google.common.collect.t6.g0
        public g0<K, V, E> b(ReferenceQueue<V> queue, E entry) {
            return new h0(queue, get(), entry);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class i<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public int f33910a;

        /* renamed from: b, reason: collision with root package name */
        public int f33911b = -1;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public n<K, V, E, S> f33912c;

        /* renamed from: d, reason: collision with root package name */
        @CheckForNull
        public AtomicReferenceArray<E> f33913d;

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        public E f33914e;

        /* renamed from: f, reason: collision with root package name */
        @CheckForNull
        public t6<K, V, E, S>.i0 f33915f;

        /* renamed from: g, reason: collision with root package name */
        @CheckForNull
        public t6<K, V, E, S>.i0 f33916g;

        public i() {
            this.f33910a = t6.this.f33880c.length - 1;
            a();
        }

        public final void a() {
            this.f33915f = null;
            if (d() || e()) {
                return;
            }
            while (true) {
                int i11 = this.f33910a;
                if (i11 < 0) {
                    return;
                }
                n<K, V, E, S>[] nVarArr = t6.this.f33880c;
                this.f33910a = i11 - 1;
                n<K, V, E, S> nVar = nVarArr[i11];
                this.f33912c = nVar;
                if (nVar.f33924b != 0) {
                    this.f33913d = this.f33912c.f33927e;
                    this.f33911b = r0.length() - 1;
                    if (e()) {
                        return;
                    }
                }
            }
        }

        public boolean b(E entry) {
            try {
                Object key = entry.getKey();
                Object j11 = t6.this.j(entry);
                if (j11 == null) {
                    this.f33912c.A();
                    return false;
                }
                this.f33915f = new i0(key, j11);
                this.f33912c.A();
                return true;
            } catch (Throwable th2) {
                this.f33912c.A();
                throw th2;
            }
        }

        public t6<K, V, E, S>.i0 c() {
            t6<K, V, E, S>.i0 i0Var = this.f33915f;
            if (i0Var == null) {
                throw new NoSuchElementException();
            }
            this.f33916g = i0Var;
            a();
            return this.f33916g;
        }

        public boolean d() {
            E e11 = this.f33914e;
            if (e11 == null) {
                return false;
            }
            while (true) {
                this.f33914e = (E) e11.getNext();
                E e12 = this.f33914e;
                if (e12 == null) {
                    return false;
                }
                if (b(e12)) {
                    return true;
                }
                e11 = this.f33914e;
            }
        }

        public boolean e() {
            while (true) {
                int i11 = this.f33911b;
                if (i11 < 0) {
                    return false;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f33913d;
                this.f33911b = i11 - 1;
                E e11 = atomicReferenceArray.get(i11);
                this.f33914e = e11;
                if (e11 != null && (b(e11) || d())) {
                    return true;
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f33915f != null;
        }

        @Override // java.util.Iterator
        public abstract T next();

        @Override // java.util.Iterator
        public void remove() {
            x2.e(this.f33916g != null);
            t6.this.remove(this.f33916g.getKey());
            this.f33916g = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class i0 extends com.google.common.collect.g<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f33918a;

        /* renamed from: b, reason: collision with root package name */
        public V f33919b;

        public i0(K key, V value) {
            this.f33918a = key;
            this.f33919b = value;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public boolean equals(@CheckForNull Object object) {
            if (object instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) object;
                if (this.f33918a.equals(entry.getKey()) && this.f33919b.equals(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public K getKey() {
            return this.f33918a;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public V getValue() {
            return this.f33919b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public int hashCode() {
            return this.f33918a.hashCode() ^ this.f33919b.hashCode();
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        public V setValue(V v11) {
            V v12 = (V) t6.this.put(this.f33918a, v11);
            this.f33919b = v11;
            return v12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface j<K, V, E extends j<K, V, E>> {
        int b();

        K getKey();

        E getNext();

        V getValue();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface k<K, V, E extends j<K, V, E>, S extends n<K, V, E, S>> {
        S a(t6<K, V, E, S> map, int initialCapacity);

        void b(S segment, E entry, V value);

        p c();

        E d(S segment, E entry, @CheckForNull E newNext);

        p e();

        E f(S segment, K key, int hash, @CheckForNull E next);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class l extends t6<K, V, E, S>.i<K> {
        public l() {
            super();
        }

        @Override // com.google.common.collect.t6.i, java.util.Iterator
        public K next() {
            return c().getKey();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class m extends AbstractSet<K> {
        public m() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            t6.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object o11) {
            return t6.this.containsKey(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return t6.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object o11) {
            return t6.this.remove(o11) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t6.this.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o<K, V> extends b<K, V> {
        private static final long serialVersionUID = 3;

        public o(p keyStrength, p valueStrength, Equivalence<Object> keyEquivalence, Equivalence<Object> valueEquivalence, int concurrencyLevel, ConcurrentMap<K, V> delegate) {
            super(keyStrength, valueStrength, keyEquivalence, valueEquivalence, concurrencyLevel, delegate);
        }

        @go.d
        private void readObject(ObjectInputStream in2) throws IOException, ClassNotFoundException {
            in2.defaultReadObject();
            this.f33893f = y(in2).i();
            x(in2);
        }

        private Object readResolve() {
            return this.f33893f;
        }

        private void writeObject(ObjectOutputStream out) throws IOException {
            out.defaultWriteObject();
            z(out);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class p {

        /* renamed from: a, reason: collision with root package name */
        public static final p f33929a = new a("STRONG", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final p f33930b = new b("WEAK", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ p[] f33931c = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends p {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.collect.t6.p
            public Equivalence<Object> b() {
                return Equivalence.c();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends p {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal, null);
            }

            @Override // com.google.common.collect.t6.p
            public Equivalence<Object> b() {
                return Equivalence.g();
            }
        }

        public p(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ p[] a() {
            return new p[]{f33929a, f33930b};
        }

        public static p valueOf(String name) {
            return (p) Enum.valueOf(p.class, name);
        }

        public static p[] values() {
            return (p[]) f33931c.clone();
        }

        public abstract Equivalence<Object> b();

        public /* synthetic */ p(String str, int i11, a aVar) {
            this(str, i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class q<K> extends c<K, s6.a, q<K>> implements w<K, s6.a, q<K>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b<K> extends q<K> {

            /* renamed from: c, reason: collision with root package name */
            public final q<K> f33933c;

            public b(K key, int hash, q<K> next) {
                super(key, hash, null);
                this.f33933c = next;
            }

            @Override // com.google.common.collect.t6.c, com.google.common.collect.t6.j
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public q<K> getNext() {
                return this.f33933c;
            }

            @Override // com.google.common.collect.t6.q, com.google.common.collect.t6.j
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }
        }

        public /* synthetic */ q(Object obj, int i11, a aVar) {
            this(obj, i11);
        }

        @Override // com.google.common.collect.t6.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final s6.a getValue() {
            return s6.a.VALUE;
        }

        public q(K key, int hash) {
            super(key, hash);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<K> implements k<K, s6.a, q<K>, r<K>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?> f33932a = new a<>();

            public static <K> a<K> h() {
                return (a<K>) f33932a;
            }

            @Override // com.google.common.collect.t6.k
            public p c() {
                return p.f33929a;
            }

            @Override // com.google.common.collect.t6.k
            public p e() {
                return p.f33929a;
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public q<K> d(r<K> segment, q<K> entry, @CheckForNull q<K> newNext) {
                return f(segment, entry.f33897a, entry.f33898b, newNext);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public q<K> f(r<K> segment, K key, int hash, @CheckForNull q<K> next) {
                return next == null ? new q<>(key, hash, null) : new b(key, hash, next);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public r<K> a(t6<K, s6.a, q<K>, r<K>> map, int initialCapacity) {
                return new r<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(r<K> segment, q<K> entry, s6.a value) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class s<K, V> extends c<K, V, s<K, V>> implements w<K, V, s<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public volatile V f33934c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<K, V> implements k<K, V, s<K, V>, t<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f33935a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f33935a;
            }

            @Override // com.google.common.collect.t6.k
            public p c() {
                return p.f33929a;
            }

            @Override // com.google.common.collect.t6.k
            public p e() {
                return p.f33929a;
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public s<K, V> d(t<K, V> segment, s<K, V> entry, @CheckForNull s<K, V> newNext) {
                s<K, V> f11 = f(segment, entry.f33897a, entry.f33898b, newNext);
                f11.f33934c = entry.f33934c;
                return f11;
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public s<K, V> f(t<K, V> segment, K key, int hash, @CheckForNull s<K, V> next) {
                return next == null ? new s<>(key, hash, null) : new b(key, hash, next);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public t<K, V> a(t6<K, V, s<K, V>, t<K, V>> map, int initialCapacity) {
                return new t<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(t<K, V> segment, s<K, V> entry, V value) {
                entry.f33934c = value;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b<K, V> extends s<K, V> {

            /* renamed from: d, reason: collision with root package name */
            public final s<K, V> f33936d;

            public b(K key, int hash, s<K, V> next) {
                super(key, hash, null);
                this.f33936d = next;
            }

            @Override // com.google.common.collect.t6.c, com.google.common.collect.t6.j
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public s<K, V> getNext() {
                return this.f33936d;
            }
        }

        public /* synthetic */ s(Object obj, int i11, a aVar) {
            this(obj, i11);
        }

        @Override // com.google.common.collect.t6.j
        @CheckForNull
        public final V getValue() {
            return this.f33934c;
        }

        public s(K key, int hash) {
            super(key, hash);
            this.f33934c = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class u<K, V> extends c<K, V, u<K, V>> implements f0<K, V, u<K, V>> {

        /* renamed from: c, reason: collision with root package name */
        public volatile g0<K, V, u<K, V>> f33937c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<K, V> implements k<K, V, u<K, V>, v<K, V>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?, ?> f33938a = new a<>();

            public static <K, V> a<K, V> h() {
                return (a<K, V>) f33938a;
            }

            @Override // com.google.common.collect.t6.k
            public p c() {
                return p.f33929a;
            }

            @Override // com.google.common.collect.t6.k
            public p e() {
                return p.f33930b;
            }

            @Override // com.google.common.collect.t6.k
            @CheckForNull
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public u<K, V> d(v<K, V> segment, u<K, V> entry, @CheckForNull u<K, V> newNext) {
                if (n.u(entry)) {
                    return null;
                }
                u<K, V> f11 = f(segment, entry.f33897a, entry.f33898b, newNext);
                f11.f33937c = entry.f33937c.b(segment.f33940g, f11);
                return f11;
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public u<K, V> f(v<K, V> segment, K key, int hash, @CheckForNull u<K, V> next) {
                return next == null ? new u<>(key, hash, null) : new b(key, hash, next);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public v<K, V> a(t6<K, V, u<K, V>, v<K, V>> map, int initialCapacity) {
                return new v<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(v<K, V> segment, u<K, V> entry, V value) {
                g0 g0Var = entry.f33937c;
                entry.f33937c = new h0(segment.f33940g, value, entry);
                g0Var.clear();
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b<K, V> extends u<K, V> {

            /* renamed from: d, reason: collision with root package name */
            public final u<K, V> f33939d;

            public b(K key, int hash, u<K, V> next) {
                super(key, hash, null);
                this.f33939d = next;
            }

            @Override // com.google.common.collect.t6.c, com.google.common.collect.t6.j
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public u<K, V> getNext() {
                return this.f33939d;
            }
        }

        public /* synthetic */ u(Object obj, int i11, a aVar) {
            this(obj, i11);
        }

        @Override // com.google.common.collect.t6.f0
        public final g0<K, V, u<K, V>> a() {
            return this.f33937c;
        }

        @Override // com.google.common.collect.t6.j
        @CheckForNull
        public final V getValue() {
            return this.f33937c.get();
        }

        public u(K key, int hash) {
            super(key, hash);
            this.f33937c = t6.t();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface w<K, V, E extends j<K, V, E>> extends j<K, V, E> {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class x extends t6<K, V, E, S>.i<V> {
        public x() {
            super();
        }

        @Override // com.google.common.collect.t6.i, java.util.Iterator
        public V next() {
            return c().getValue();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class y extends AbstractCollection<V> {
        public y() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            t6.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object o11) {
            return t6.this.containsValue(o11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return t6.this.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new x();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return t6.this.size();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class z<K> extends d<K, s6.a, z<K>> implements w<K, s6.a, z<K>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b<K> extends z<K> {

            /* renamed from: b, reason: collision with root package name */
            public final z<K> f33944b;

            public /* synthetic */ b(ReferenceQueue referenceQueue, Object obj, int i11, z zVar, a aVar) {
                this(referenceQueue, obj, i11, zVar);
            }

            @Override // com.google.common.collect.t6.d, com.google.common.collect.t6.j
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public z<K> getNext() {
                return this.f33944b;
            }

            @Override // com.google.common.collect.t6.z, com.google.common.collect.t6.j
            public /* bridge */ /* synthetic */ Object getValue() {
                return super.getValue();
            }

            public b(ReferenceQueue<K> queue, K key, int hash, z<K> next) {
                super(queue, key, hash, null);
                this.f33944b = next;
            }
        }

        public /* synthetic */ z(ReferenceQueue referenceQueue, Object obj, int i11, a aVar) {
            this(referenceQueue, obj, i11);
        }

        @Override // com.google.common.collect.t6.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final s6.a getValue() {
            return s6.a.VALUE;
        }

        public z(ReferenceQueue<K> queue, K key, int hash) {
            super(queue, key, hash);
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<K> implements k<K, s6.a, z<K>, a0<K>> {

            /* renamed from: a, reason: collision with root package name */
            public static final a<?> f33943a = new a<>();

            public static <K> a<K> h() {
                return (a<K>) f33943a;
            }

            @Override // com.google.common.collect.t6.k
            public p c() {
                return p.f33930b;
            }

            @Override // com.google.common.collect.t6.k
            public p e() {
                return p.f33929a;
            }

            @Override // com.google.common.collect.t6.k
            @CheckForNull
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public z<K> d(a0<K> segment, z<K> entry, @CheckForNull z<K> newNext) {
                K key = entry.getKey();
                if (key == null) {
                    return null;
                }
                return f(segment, key, entry.f33900a, newNext);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public z<K> f(a0<K> segment, K key, int hash, @CheckForNull z<K> next) {
                return next == null ? new z<>(segment.f33887g, key, hash, null) : new b(segment.f33887g, key, hash, next, null);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public a0<K> a(t6<K, s6.a, z<K>, a0<K>> map, int initialCapacity) {
                return new a0<>(map, initialCapacity);
            }

            @Override // com.google.common.collect.t6.k
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public void b(a0<K> segment, z<K> entry, s6.a value) {
            }
        }
    }

    public t6(s6 builder, k<K, V, E, S> entryHelper) {
        this.f33881d = Math.min(builder.b(), 65536);
        this.f33882e = builder.d();
        this.f33883f = entryHelper;
        int min = Math.min(builder.c(), 1073741824);
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        int i14 = 1;
        while (i14 < this.f33881d) {
            i13++;
            i14 <<= 1;
        }
        this.f33879b = 32 - i13;
        this.f33878a = i14 - 1;
        this.f33880c = n(i14);
        int i15 = min / i14;
        while (i12 < (i14 * i15 < min ? i15 + 1 : i15)) {
            i12 <<= 1;
        }
        while (true) {
            n<K, V, E, S>[] nVarArr = this.f33880c;
            if (i11 >= nVarArr.length) {
                return;
            }
            nVarArr[i11] = g(i12);
            i11++;
        }
    }

    public static <K, V> t6<K, V, ? extends j<K, V, ?>, ?> d(s6 builder) {
        p e11 = builder.e();
        p pVar = p.f33929a;
        if (e11 == pVar && builder.f() == pVar) {
            return new t6<>(builder, s.a.h());
        }
        if (builder.e() == pVar && builder.f() == p.f33930b) {
            return new t6<>(builder, u.a.h());
        }
        p e12 = builder.e();
        p pVar2 = p.f33930b;
        if (e12 == pVar2 && builder.f() == pVar) {
            return new t6<>(builder, b0.a.h());
        }
        if (builder.e() == pVar2 && builder.f() == pVar2) {
            return new t6<>(builder, d0.a.h());
        }
        throw new AssertionError();
    }

    public static <K> t6<K, s6.a, ? extends j<K, s6.a, ?>, ?> h(s6 builder) {
        p e11 = builder.e();
        p pVar = p.f33929a;
        if (e11 == pVar && builder.f() == pVar) {
            return new t6<>(builder, q.a.h());
        }
        p e12 = builder.e();
        p pVar2 = p.f33930b;
        if (e12 == pVar2 && builder.f() == pVar) {
            return new t6<>(builder, z.a.h());
        }
        if (builder.f() == pVar2) {
            throw new IllegalArgumentException("Map cannot have both weak and dummy values");
        }
        throw new AssertionError();
    }

    public static int r(int h11) {
        int i11 = h11 + ((h11 << 15) ^ (-12931));
        int i12 = i11 ^ (i11 >>> 10);
        int i13 = i12 + (i12 << 3);
        int i14 = i13 ^ (i13 >>> 6);
        int i15 = i14 + (i14 << 2) + (i14 << 14);
        return i15 ^ (i15 >>> 16);
    }

    @go.d
    private void readObject(ObjectInputStream in2) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializationProxy");
    }

    public static <K, V, E extends j<K, V, E>> g0<K, V, E> t() {
        return (g0<K, V, E>) f33877o;
    }

    @go.e
    public E b(E original, E newNext) {
        return s(original.b()).f(original, newNext);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        for (n<K, V, E, S> nVar : this.f33880c) {
            nVar.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@CheckForNull Object key) {
        if (key == null) {
            return false;
        }
        int k11 = k(key);
        return s(k11).d(key, k11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.common.collect.t6$n] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.common.collect.t6$n<K, V, E extends com.google.common.collect.t6$j<K, V, E>, S extends com.google.common.collect.t6$n<K, V, E, S>>[]] */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        boolean z11 = false;
        if (obj == null) {
            return false;
        }
        n<K, V, E, S>[] nVarArr = this.f33880c;
        long j11 = -1;
        int i11 = 0;
        while (i11 < 3) {
            int length = nVarArr.length;
            long j12 = 0;
            for (?? r102 = z11; r102 < length; r102++) {
                ?? r11 = nVarArr[r102];
                int i12 = r11.f33924b;
                AtomicReferenceArray<E> atomicReferenceArray = r11.f33927e;
                for (?? r13 = z11; r13 < atomicReferenceArray.length(); r13++) {
                    E e11 = atomicReferenceArray.get(r13);
                    while (e11 != null) {
                        Object p11 = r11.p(e11);
                        boolean z12 = z11;
                        if (p11 != null && u().d(obj, p11)) {
                            return true;
                        }
                        e11 = e11.getNext();
                        z11 = z12;
                    }
                }
                j12 += r11.f33925c;
                z11 = z11;
            }
            boolean z13 = z11;
            if (j12 == j11) {
                return z13;
            }
            i11++;
            j11 = j12;
            z11 = z13;
        }
        return z11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f33886i;
        if (set != null) {
            return set;
        }
        h hVar = new h();
        this.f33886i = hVar;
        return hVar;
    }

    public n<K, V, E, S> g(int i11) {
        return this.f33883f.a(this, i11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    public V get(@CheckForNull Object key) {
        if (key == null) {
            return null;
        }
        int k11 = k(key);
        return s(k11).k(key, k11);
    }

    @CheckForNull
    public E i(@CheckForNull Object key) {
        if (key == null) {
            return null;
        }
        int k11 = k(key);
        return s(k11).l(key, k11);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        n<K, V, E, S>[] nVarArr = this.f33880c;
        long j11 = 0;
        for (int i11 = 0; i11 < nVarArr.length; i11++) {
            if (nVarArr[i11].f33924b != 0) {
                return false;
            }
            j11 += nVarArr[i11].f33925c;
        }
        if (j11 == 0) {
            return true;
        }
        for (int i12 = 0; i12 < nVarArr.length; i12++) {
            if (nVarArr[i12].f33924b != 0) {
                return false;
            }
            j11 -= nVarArr[i12].f33925c;
        }
        return j11 == 0;
    }

    @CheckForNull
    public V j(E e11) {
        if (e11.getKey() == null) {
            return null;
        }
        return (V) e11.getValue();
    }

    public int k(Object key) {
        return r(this.f33882e.f(key));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f33884g;
        if (set != null) {
            return set;
        }
        m mVar = new m();
        this.f33884g = mVar;
        return mVar;
    }

    @go.e
    public boolean l(j<K, V, ?> entry) {
        return s(entry.b()).q(entry) != null;
    }

    @go.e
    public p m() {
        return this.f33883f.c();
    }

    public final n<K, V, E, S>[] n(int ssize) {
        return new n[ssize];
    }

    public void o(E entry) {
        int b11 = entry.b();
        s(b11).D(entry, b11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p(g0<K, V, E> g0Var) {
        E a11 = g0Var.a();
        int b11 = a11.b();
        s(b11).F(a11.getKey(), b11, g0Var);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    @uo.a
    public V put(K key, V value) {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(value);
        int k11 = k(key);
        return s(k11).C(key, k11, value, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> m11) {
        for (Map.Entry<? extends K, ? extends V> entry : m11.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    @uo.a
    public V putIfAbsent(K key, V value) {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(value);
        int k11 = k(key);
        return s(k11).C(key, k11, value, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CheckForNull
    @uo.a
    public V remove(@CheckForNull Object key) {
        if (key == null) {
            return null;
        }
        int k11 = k(key);
        return s(k11).G(key, k11);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @uo.a
    public boolean replace(K key, @CheckForNull V oldValue, V newValue) {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(newValue);
        if (oldValue == null) {
            return false;
        }
        int k11 = k(key);
        return s(k11).N(key, k11, oldValue, newValue);
    }

    public n<K, V, E, S> s(int hash) {
        return this.f33880c[(hash >>> this.f33879b) & this.f33878a];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j11 = 0;
        for (int i11 = 0; i11 < this.f33880c.length; i11++) {
            j11 += r0[i11].f33924b;
        }
        return ro.i.A(j11);
    }

    @go.e
    public Equivalence<Object> u() {
        return this.f33883f.e().b();
    }

    @go.e
    public p v() {
        return this.f33883f.e();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f33885h;
        if (collection != null) {
            return collection;
        }
        y yVar = new y();
        this.f33885h = yVar;
        return yVar;
    }

    public Object writeReplace() {
        return new o(this.f33883f.c(), this.f33883f.e(), this.f33882e, this.f33883f.e().b(), this.f33881d, this);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @uo.a
    public boolean remove(@CheckForNull Object key, @CheckForNull Object value) {
        if (key == null || value == null) {
            return false;
        }
        int k11 = k(key);
        return s(k11).H(key, k11, value);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    @CheckForNull
    @uo.a
    public V replace(K key, V value) {
        Preconditions.checkNotNull(key);
        Preconditions.checkNotNull(value);
        int k11 = k(key);
        return s(k11).M(key, k11, value);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements g0<Object, Object, f> {
        @Override // com.google.common.collect.t6.g0
        @CheckForNull
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public f a() {
            return null;
        }

        @Override // com.google.common.collect.t6.g0
        @CheckForNull
        public Object get() {
            return null;
        }

        @Override // com.google.common.collect.t6.g0
        public void clear() {
        }

        @Override // com.google.common.collect.t6.g0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public g0<Object, Object, f> b(ReferenceQueue<Object> queue, f entry) {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a0<K> extends n<K, s6.a, z<K>, a0<K>> {

        /* renamed from: g, reason: collision with root package name */
        public final ReferenceQueue<K> f33887g;

        public a0(t6<K, s6.a, z<K>, a0<K>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f33887g = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.t6.n
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public z<K> a(j<K, s6.a, ?> entry) {
            return (z) entry;
        }

        @Override // com.google.common.collect.t6.n
        public ReferenceQueue<K> n() {
            return this.f33887g;
        }

        @Override // com.google.common.collect.t6.n
        public void v() {
            b(this.f33887g);
        }

        @Override // com.google.common.collect.t6.n
        public void w() {
            h(this.f33887g);
        }

        @Override // com.google.common.collect.t6.n
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public a0<K> Q() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c0<K, V> extends n<K, V, b0<K, V>, c0<K, V>> {

        /* renamed from: g, reason: collision with root package name */
        public final ReferenceQueue<K> f33899g;

        public c0(t6<K, V, b0<K, V>, c0<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f33899g = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.t6.n
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public b0<K, V> a(j<K, V, ?> entry) {
            return (b0) entry;
        }

        @Override // com.google.common.collect.t6.n
        public ReferenceQueue<K> n() {
            return this.f33899g;
        }

        @Override // com.google.common.collect.t6.n
        public void v() {
            b(this.f33899g);
        }

        @Override // com.google.common.collect.t6.n
        public void w() {
            h(this.f33899g);
        }

        @Override // com.google.common.collect.t6.n
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public c0<K, V> Q() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e0<K, V> extends n<K, V, d0<K, V>, e0<K, V>> {

        /* renamed from: g, reason: collision with root package name */
        public final ReferenceQueue<K> f33905g;

        /* renamed from: h, reason: collision with root package name */
        public final ReferenceQueue<V> f33906h;

        public e0(t6<K, V, d0<K, V>, e0<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f33905g = new ReferenceQueue<>();
            this.f33906h = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.t6.n
        public void U(j<K, V, ?> e11, g0<K, V, ? extends j<K, V, ?>> valueReference) {
            d0<K, V> a11 = a(e11);
            g0 g0Var = a11.f33901b;
            a11.f33901b = valueReference;
            g0Var.clear();
        }

        @Override // com.google.common.collect.t6.n
        @CheckForNull
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public d0<K, V> a(@CheckForNull j<K, V, ?> entry) {
            return (d0) entry;
        }

        @Override // com.google.common.collect.t6.n
        public ReferenceQueue<K> n() {
            return this.f33905g;
        }

        @Override // com.google.common.collect.t6.n
        public ReferenceQueue<V> r() {
            return this.f33906h;
        }

        @Override // com.google.common.collect.t6.n
        public g0<K, V, d0<K, V>> s(j<K, V, ?> e11) {
            return a(e11).a();
        }

        @Override // com.google.common.collect.t6.n
        public void v() {
            b(this.f33905g);
        }

        @Override // com.google.common.collect.t6.n
        public void w() {
            h(this.f33905g);
            i(this.f33906h);
        }

        @Override // com.google.common.collect.t6.n
        public g0<K, V, d0<K, V>> z(j<K, V, ?> e11, V value) {
            return new h0(this.f33906h, value, a(e11));
        }

        @Override // com.google.common.collect.t6.n
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public e0<K, V> Q() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class n<K, V, E extends j<K, V, E>, S extends n<K, V, E, S>> extends ReentrantLock {

        /* renamed from: a, reason: collision with root package name */
        @Weak
        public final t6<K, V, E, S> f33923a;

        /* renamed from: b, reason: collision with root package name */
        public volatile int f33924b;

        /* renamed from: c, reason: collision with root package name */
        public int f33925c;

        /* renamed from: d, reason: collision with root package name */
        public int f33926d;

        /* renamed from: e, reason: collision with root package name */
        @CheckForNull
        public volatile AtomicReferenceArray<E> f33927e;

        /* renamed from: f, reason: collision with root package name */
        public final AtomicInteger f33928f = new AtomicInteger();

        public n(t6<K, V, E, S> map, int initialCapacity) {
            this.f33923a = map;
            t(x(initialCapacity));
        }

        public static <K, V, E extends j<K, V, E>> boolean u(E entry) {
            return entry.getValue() == null;
        }

        public void A() {
            if ((this.f33928f.incrementAndGet() & 63) == 0) {
                O();
            }
        }

        @vo.a("this")
        public void B() {
            P();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public V C(K k11, int i11, V v11, boolean z11) {
            lock();
            try {
                B();
                int i12 = this.f33924b + 1;
                if (i12 > this.f33926d) {
                    j();
                    i12 = this.f33924b + 1;
                }
                AtomicReferenceArray<E> atomicReferenceArray = this.f33927e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.b() == i11 && key != null && this.f33923a.f33882e.d(k11, key)) {
                        V v12 = (V) jVar2.getValue();
                        if (v12 == null) {
                            this.f33925c++;
                            S(jVar2, v11);
                            this.f33924b = this.f33924b;
                            unlock();
                            return null;
                        }
                        if (z11) {
                            unlock();
                            return v12;
                        }
                        this.f33925c++;
                        S(jVar2, v11);
                        unlock();
                        return v12;
                    }
                }
                this.f33925c++;
                j f11 = this.f33923a.f33883f.f(Q(), k11, i11, jVar);
                S(f11, v11);
                atomicReferenceArray.set(length, f11);
                this.f33924b = i12;
                unlock();
                return null;
            } catch (Throwable th2) {
                unlock();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @uo.a
        public boolean D(E e11, int i11) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f33927e;
                int length = i11 & (atomicReferenceArray.length() - 1);
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    if (jVar2 == e11) {
                        this.f33925c++;
                        j J = J(jVar, jVar2);
                        int i12 = this.f33924b - 1;
                        atomicReferenceArray.set(length, J);
                        this.f33924b = i12;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @uo.a
        public boolean F(K k11, int i11, g0<K, V, E> g0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f33927e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.b() == i11 && key != null && this.f33923a.f33882e.d(k11, key)) {
                        if (((f0) jVar2).a() != g0Var) {
                            return false;
                        }
                        this.f33925c++;
                        j J = J(jVar, jVar2);
                        int i12 = this.f33924b - 1;
                        atomicReferenceArray.set(length, J);
                        this.f33924b = i12;
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        @uo.a
        public V G(Object obj, int i11) {
            lock();
            try {
                B();
                AtomicReferenceArray<E> atomicReferenceArray = this.f33927e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.b() == i11 && key != null && this.f33923a.f33882e.d(obj, key)) {
                        V v11 = (V) jVar2.getValue();
                        if (v11 == null && !u(jVar2)) {
                            return null;
                        }
                        this.f33925c++;
                        j J = J(jVar, jVar2);
                        int i12 = this.f33924b - 1;
                        atomicReferenceArray.set(length, J);
                        this.f33924b = i12;
                        return v11;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
        
            if (r8.f33923a.u().d(r11, r4.getValue()) == false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            r5 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        
            r8.f33925c++;
            r9 = J(r3, r4);
            r10 = r8.f33924b - 1;
            r0.set(r1, r9);
            r8.f33924b = r10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        
            if (u(r4) == false) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        
            return false;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean H(java.lang.Object r9, int r10, java.lang.Object r11) {
            /*
                r8 = this;
                r8.lock()
                r8.B()     // Catch: java.lang.Throwable -> L5c
                java.util.concurrent.atomic.AtomicReferenceArray<E extends com.google.common.collect.t6$j<K, V, E>> r0 = r8.f33927e     // Catch: java.lang.Throwable -> L5c
                int r1 = r0.length()     // Catch: java.lang.Throwable -> L5c
                r2 = 1
                int r1 = r1 - r2
                r1 = r1 & r10
                java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.t6$j r3 = (com.google.common.collect.t6.j) r3     // Catch: java.lang.Throwable -> L5c
                r4 = r3
            L16:
                r5 = 0
                if (r4 == 0) goto L67
                java.lang.Object r6 = r4.getKey()     // Catch: java.lang.Throwable -> L5c
                int r7 = r4.b()     // Catch: java.lang.Throwable -> L5c
                if (r7 != r10) goto L62
                if (r6 == 0) goto L62
                com.google.common.collect.t6<K, V, E extends com.google.common.collect.t6$j<K, V, E>, S extends com.google.common.collect.t6$n<K, V, E, S>> r7 = r8.f33923a     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.Equivalence<java.lang.Object> r7 = r7.f33882e     // Catch: java.lang.Throwable -> L5c
                boolean r6 = r7.d(r9, r6)     // Catch: java.lang.Throwable -> L5c
                if (r6 == 0) goto L62
                java.lang.Object r9 = r4.getValue()     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.t6<K, V, E extends com.google.common.collect.t6$j<K, V, E>, S extends com.google.common.collect.t6$n<K, V, E, S>> r10 = r8.f33923a     // Catch: java.lang.Throwable -> L5c
                com.google.common.base.Equivalence r10 = r10.u()     // Catch: java.lang.Throwable -> L5c
                boolean r9 = r10.d(r11, r9)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L41
                r5 = r2
                goto L47
            L41:
                boolean r9 = u(r4)     // Catch: java.lang.Throwable -> L5c
                if (r9 == 0) goto L5e
            L47:
                int r9 = r8.f33925c     // Catch: java.lang.Throwable -> L5c
                int r9 = r9 + r2
                r8.f33925c = r9     // Catch: java.lang.Throwable -> L5c
                com.google.common.collect.t6$j r9 = r8.J(r3, r4)     // Catch: java.lang.Throwable -> L5c
                int r10 = r8.f33924b     // Catch: java.lang.Throwable -> L5c
                int r10 = r10 - r2
                r0.set(r1, r9)     // Catch: java.lang.Throwable -> L5c
                r8.f33924b = r10     // Catch: java.lang.Throwable -> L5c
                r8.unlock()
                return r5
            L5c:
                r9 = move-exception
                goto L6b
            L5e:
                r8.unlock()
                return r5
            L62:
                com.google.common.collect.t6$j r4 = r4.getNext()     // Catch: java.lang.Throwable -> L5c
                goto L16
            L67:
                r8.unlock()
                return r5
            L6b:
                r8.unlock()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.t6.n.H(java.lang.Object, int, java.lang.Object):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @vo.a("this")
        public boolean I(E e11) {
            int b11 = e11.b();
            AtomicReferenceArray<E> atomicReferenceArray = this.f33927e;
            int length = b11 & (atomicReferenceArray.length() - 1);
            j jVar = (j) atomicReferenceArray.get(length);
            for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                if (jVar2 == e11) {
                    this.f33925c++;
                    j J = J(jVar, jVar2);
                    int i11 = this.f33924b - 1;
                    atomicReferenceArray.set(length, J);
                    this.f33924b = i11;
                    return true;
                }
            }
            return false;
        }

        @CheckForNull
        @vo.a("this")
        public E J(E e11, E e12) {
            int i11 = this.f33924b;
            E e13 = (E) e12.getNext();
            while (e11 != e12) {
                E f11 = f(e11, e13);
                if (f11 != null) {
                    e13 = f11;
                } else {
                    i11--;
                }
                e11 = (E) e11.getNext();
            }
            this.f33924b = i11;
            return e13;
        }

        @CheckForNull
        public E K(j<K, V, ?> first, j<K, V, ?> entry) {
            return J(a(first), a(entry));
        }

        @uo.a
        public boolean L(j<K, V, ?> entry) {
            return I(a(entry));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CheckForNull
        public V M(K k11, int i11, V v11) {
            lock();
            try {
                B();
                AtomicReferenceArray<E> atomicReferenceArray = this.f33927e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.b() == i11 && key != null && this.f33923a.f33882e.d(k11, key)) {
                        V v12 = (V) jVar2.getValue();
                        if (v12 != null) {
                            this.f33925c++;
                            S(jVar2, v11);
                            return v12;
                        }
                        if (u(jVar2)) {
                            this.f33925c++;
                            j J = J(jVar, jVar2);
                            int i12 = this.f33924b - 1;
                            atomicReferenceArray.set(length, J);
                            this.f33924b = i12;
                        }
                        return null;
                    }
                }
                return null;
            } finally {
                unlock();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean N(K k11, int i11, V v11, V v12) {
            lock();
            try {
                B();
                AtomicReferenceArray<E> atomicReferenceArray = this.f33927e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.b() == i11 && key != null && this.f33923a.f33882e.d(k11, key)) {
                        Object value = jVar2.getValue();
                        if (value != null) {
                            if (!this.f33923a.u().d(v11, value)) {
                                return false;
                            }
                            this.f33925c++;
                            S(jVar2, v12);
                            return true;
                        }
                        if (u(jVar2)) {
                            this.f33925c++;
                            j J = J(jVar, jVar2);
                            int i12 = this.f33924b - 1;
                            atomicReferenceArray.set(length, J);
                            this.f33924b = i12;
                        }
                        return false;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public void O() {
            P();
        }

        public void P() {
            if (tryLock()) {
                try {
                    w();
                    this.f33928f.set(0);
                } finally {
                    unlock();
                }
            }
        }

        public abstract S Q();

        public void R(int i11, j<K, V, ?> entry) {
            this.f33927e.set(i11, a(entry));
        }

        public void S(E entry, V value) {
            this.f33923a.f33883f.b(Q(), entry, value);
        }

        public void T(j<K, V, ?> entry, V value) {
            this.f33923a.f33883f.b(Q(), a(entry), value);
        }

        public void U(j<K, V, ?> entry, g0<K, V, ? extends j<K, V, ?>> valueReference) {
            throw new AssertionError();
        }

        public void V() {
            if (tryLock()) {
                try {
                    w();
                } finally {
                    unlock();
                }
            }
        }

        public abstract E a(j<K, V, ?> entry);

        public <T> void b(ReferenceQueue<T> referenceQueue) {
            while (referenceQueue.poll() != null) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @uo.a
        public boolean c(K k11, int i11, g0<K, V, ? extends j<K, V, ?>> g0Var) {
            lock();
            try {
                AtomicReferenceArray<E> atomicReferenceArray = this.f33927e;
                int length = (atomicReferenceArray.length() - 1) & i11;
                j jVar = (j) atomicReferenceArray.get(length);
                for (j jVar2 = jVar; jVar2 != null; jVar2 = jVar2.getNext()) {
                    Object key = jVar2.getKey();
                    if (jVar2.b() == i11 && key != null && this.f33923a.f33882e.d(k11, key)) {
                        if (((f0) jVar2).a() != g0Var) {
                            return false;
                        }
                        atomicReferenceArray.set(length, J(jVar, jVar2));
                        return true;
                    }
                }
                return false;
            } finally {
                unlock();
            }
        }

        public void clear() {
            if (this.f33924b != 0) {
                lock();
                try {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f33927e;
                    for (int i11 = 0; i11 < atomicReferenceArray.length(); i11++) {
                        atomicReferenceArray.set(i11, null);
                    }
                    v();
                    this.f33928f.set(0);
                    this.f33925c++;
                    this.f33924b = 0;
                    unlock();
                } catch (Throwable th2) {
                    unlock();
                    throw th2;
                }
            }
        }

        public boolean d(Object key, int hash) {
            try {
                boolean z11 = false;
                if (this.f33924b == 0) {
                    return false;
                }
                E o11 = o(key, hash);
                if (o11 != null) {
                    if (o11.getValue() != null) {
                        z11 = true;
                    }
                }
                return z11;
            } finally {
                A();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @go.e
        public boolean e(Object value) {
            try {
                if (this.f33924b != 0) {
                    AtomicReferenceArray<E> atomicReferenceArray = this.f33927e;
                    int length = atomicReferenceArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        for (E e11 = atomicReferenceArray.get(i11); e11 != null; e11 = e11.getNext()) {
                            Object p11 = p(e11);
                            if (p11 != null && this.f33923a.u().d(value, p11)) {
                                A();
                                return true;
                            }
                        }
                    }
                }
                return false;
            } finally {
                A();
            }
        }

        @CheckForNull
        public E f(E original, E newNext) {
            return this.f33923a.f33883f.d(Q(), original, newNext);
        }

        public E g(j<K, V, ?> entry, @CheckForNull j<K, V, ?> newNext) {
            return this.f33923a.f33883f.d(Q(), a(entry), a(newNext));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @vo.a("this")
        public void h(ReferenceQueue<K> referenceQueue) {
            int i11 = 0;
            do {
                Reference<? extends K> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.f33923a.o((j) poll);
                i11++;
            } while (i11 != 16);
        }

        @vo.a("this")
        public void i(ReferenceQueue<V> referenceQueue) {
            int i11 = 0;
            do {
                Reference<? extends V> poll = referenceQueue.poll();
                if (poll == null) {
                    return;
                }
                this.f33923a.p((g0) poll);
                i11++;
            } while (i11 != 16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @vo.a("this")
        public void j() {
            AtomicReferenceArray<E> atomicReferenceArray = this.f33927e;
            int length = atomicReferenceArray.length();
            if (length >= 1073741824) {
                return;
            }
            int i11 = this.f33924b;
            SpscExactAtomicArrayQueue spscExactAtomicArrayQueue = (AtomicReferenceArray<E>) x(length << 1);
            this.f33926d = (spscExactAtomicArrayQueue.length() * 3) / 4;
            int length2 = spscExactAtomicArrayQueue.length() - 1;
            for (int i12 = 0; i12 < length; i12++) {
                E e11 = atomicReferenceArray.get(i12);
                if (e11 != null) {
                    j next = e11.getNext();
                    int b11 = e11.b() & length2;
                    if (next == null) {
                        spscExactAtomicArrayQueue.set(b11, e11);
                    } else {
                        j jVar = e11;
                        while (next != null) {
                            int b12 = next.b() & length2;
                            if (b12 != b11) {
                                jVar = next;
                                b11 = b12;
                            }
                            next = next.getNext();
                        }
                        spscExactAtomicArrayQueue.set(b11, jVar);
                        while (e11 != jVar) {
                            int b13 = e11.b() & length2;
                            j f11 = f(e11, (j) spscExactAtomicArrayQueue.get(b13));
                            if (f11 != null) {
                                spscExactAtomicArrayQueue.set(b13, f11);
                            } else {
                                i11--;
                            }
                            e11 = e11.getNext();
                        }
                    }
                }
            }
            this.f33927e = spscExactAtomicArrayQueue;
            this.f33924b = i11;
        }

        @CheckForNull
        public V k(Object obj, int i11) {
            try {
                E o11 = o(obj, i11);
                if (o11 == null) {
                    A();
                    return null;
                }
                V v11 = (V) o11.getValue();
                if (v11 == null) {
                    V();
                }
                return v11;
            } finally {
                A();
            }
        }

        @CheckForNull
        public E l(Object obj, int i11) {
            if (this.f33924b == 0) {
                return null;
            }
            for (E m11 = m(i11); m11 != null; m11 = (E) m11.getNext()) {
                if (m11.b() == i11) {
                    Object key = m11.getKey();
                    if (key == null) {
                        V();
                    } else if (this.f33923a.f33882e.d(obj, key)) {
                        return m11;
                    }
                }
            }
            return null;
        }

        @CheckForNull
        public E m(int hash) {
            return this.f33927e.get(hash & (r0.length() - 1));
        }

        public ReferenceQueue<K> n() {
            throw new AssertionError();
        }

        @CheckForNull
        public E o(Object key, int hash) {
            return l(key, hash);
        }

        @CheckForNull
        public V p(E e11) {
            if (e11.getKey() == null) {
                V();
                return null;
            }
            V v11 = (V) e11.getValue();
            if (v11 != null) {
                return v11;
            }
            V();
            return null;
        }

        @CheckForNull
        public V q(j<K, V, ?> entry) {
            return p(a(entry));
        }

        public ReferenceQueue<V> r() {
            throw new AssertionError();
        }

        public g0<K, V, E> s(j<K, V, ?> entry) {
            throw new AssertionError();
        }

        public void t(AtomicReferenceArray<E> newTable) {
            this.f33926d = (newTable.length() * 3) / 4;
            this.f33927e = newTable;
        }

        public AtomicReferenceArray<E> x(int size) {
            return new AtomicReferenceArray<>(size);
        }

        public E y(K key, int hash, @CheckForNull j<K, V, ?> next) {
            return this.f33923a.f33883f.f(Q(), key, hash, a(next));
        }

        public g0<K, V, E> z(j<K, V, ?> entry, V value) {
            throw new AssertionError();
        }

        public void v() {
        }

        @vo.a("this")
        public void w() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r<K> extends n<K, s6.a, q<K>, r<K>> {
        public r(t6<K, s6.a, q<K>, r<K>> map, int initialCapacity) {
            super(map, initialCapacity);
        }

        @Override // com.google.common.collect.t6.n
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public q<K> a(j<K, s6.a, ?> entry) {
            return (q) entry;
        }

        @Override // com.google.common.collect.t6.n
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public r<K> Q() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t<K, V> extends n<K, V, s<K, V>, t<K, V>> {
        public t(t6<K, V, s<K, V>, t<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
        }

        @Override // com.google.common.collect.t6.n
        @CheckForNull
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public s<K, V> a(@CheckForNull j<K, V, ?> entry) {
            return (s) entry;
        }

        @Override // com.google.common.collect.t6.n
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public t<K, V> Q() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v<K, V> extends n<K, V, u<K, V>, v<K, V>> {

        /* renamed from: g, reason: collision with root package name */
        public final ReferenceQueue<V> f33940g;

        public v(t6<K, V, u<K, V>, v<K, V>> map, int initialCapacity) {
            super(map, initialCapacity);
            this.f33940g = new ReferenceQueue<>();
        }

        @Override // com.google.common.collect.t6.n
        public void U(j<K, V, ?> e11, g0<K, V, ? extends j<K, V, ?>> valueReference) {
            u<K, V> a11 = a(e11);
            g0 g0Var = a11.f33937c;
            a11.f33937c = valueReference;
            g0Var.clear();
        }

        @Override // com.google.common.collect.t6.n
        @CheckForNull
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public u<K, V> a(@CheckForNull j<K, V, ?> entry) {
            return (u) entry;
        }

        @Override // com.google.common.collect.t6.n
        public ReferenceQueue<V> r() {
            return this.f33940g;
        }

        @Override // com.google.common.collect.t6.n
        public g0<K, V, u<K, V>> s(j<K, V, ?> e11) {
            return a(e11).a();
        }

        @Override // com.google.common.collect.t6.n
        public void v() {
            b(this.f33940g);
        }

        @Override // com.google.common.collect.t6.n
        public void w() {
            i(this.f33940g);
        }

        @Override // com.google.common.collect.t6.n
        public g0<K, V, u<K, V>> z(j<K, V, ?> e11, V value) {
            return new h0(this.f33940g, value, a(e11));
        }

        @Override // com.google.common.collect.t6.n
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public v<K, V> Q() {
            return this;
        }
    }
}
