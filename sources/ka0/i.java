package ka0;

import ba0.c2;
import ba0.h4;
import ba0.o1;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import ka0.i;
import org.apiguardian.api.API;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.support.hierarchical.m;
import org.junit.platform.engine.support.store.NamespacedHierarchicalStoreException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.EXPERIMENTAL)
/* loaded from: classes9.dex */
public final class i<N> implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f66140a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap<c<N>, f> f66141b;

    /* renamed from: c, reason: collision with root package name */
    public final i<N> f66142c;

    /* renamed from: d, reason: collision with root package name */
    public final b<N> f66143d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f66144e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface b<N> {
        void a(N namespace, Object key, Object value) throws Throwable;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<N> {

        /* renamed from: a, reason: collision with root package name */
        public final N f66145a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f66146b;

        public boolean equals(Object o11) {
            if (this == o11) {
                return true;
            }
            if (o11 != null && getClass() == o11.getClass()) {
                c cVar = (c) o11;
                if (this.f66145a.equals(cVar.f66145a) && this.f66146b.equals(cVar.f66146b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.f66145a, this.f66146b);
        }

        public c(N n11, Object obj) {
            this.f66145a = (N) c2.r(n11, "namespace must not be null");
            this.f66146b = c2.r(obj, "key must not be null");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<N> {

        /* renamed from: d, reason: collision with root package name */
        public static final Comparator<d<?>> f66147d = Comparator.comparing(new Function() { // from class: ka0.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(((i.d) obj).f66149b);
                return valueOf;
            }
        }).reversed();

        /* renamed from: a, reason: collision with root package name */
        public final c<N> f66148a;

        /* renamed from: b, reason: collision with root package name */
        public final int f66149b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f66150c;

        /* JADX WARN: Multi-variable type inference failed */
        public final void e(b<N> closeAction) throws Throwable {
            closeAction.a(this.f66148a.f66145a, this.f66148a.f66146b, this.f66150c);
        }

        public d(c<N> compositeKey, int order, Object value) {
            this.f66148a = compositeKey;
            this.f66149b = order;
            this.f66150c = value;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements Supplier<Object> {

        /* renamed from: c, reason: collision with root package name */
        public static final Object f66151c = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final Supplier<Object> f66152a;

        /* renamed from: b, reason: collision with root package name */
        public volatile Object f66153b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f66154a;

            public a(Throwable throwable) {
                this.f66154a = throwable;
            }
        }

        public final synchronized void a() {
            try {
                if (this.f66153b == f66151c) {
                    this.f66153b = this.f66152a.get();
                }
            } finally {
            }
        }

        @Override // java.util.function.Supplier
        public Object get() {
            if (this.f66153b == f66151c) {
                a();
            }
            if (this.f66153b instanceof a) {
                throw o1.e(((a) this.f66153b).f66154a);
            }
            return this.f66153b;
        }

        public e(Supplier<Object> delegate) {
            this.f66153b = f66151c;
            this.f66152a = delegate;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f66155a;

        /* renamed from: b, reason: collision with root package name */
        public final Supplier<Object> f66156b;

        public f(int order, Supplier<Object> supplier) {
            this.f66155a = order;
            this.f66156b = supplier;
        }

        public static Object d(f value) {
            if (value != null) {
                return value.c();
            }
            return null;
        }

        public final Object c() {
            return this.f66156b.get();
        }

        public final <N> d<N> e(c<N> compositeKey) {
            try {
                return new d<>(compositeKey, this.f66155a, c());
            } catch (Throwable th2) {
                h4.a(th2);
                return null;
            }
        }
    }

    public i(i<N> parentStore) {
        this(parentStore, null);
    }

    public static /* synthetic */ boolean c(d dVar) {
        return (dVar == null || dVar.f66150c == null) ? false : true;
    }

    public static /* synthetic */ Object e(i iVar, Function function, Object obj) {
        iVar.U();
        return function.apply(obj);
    }

    public static /* synthetic */ boolean f(Throwable th2) {
        return false;
    }

    public static /* synthetic */ void j(final i iVar, m mVar, final d dVar) {
        iVar.getClass();
        mVar.c(new m.a() { // from class: ka0.g
            @Override // org.junit.platform.engine.support.hierarchical.m.a
            public final void execute() {
                dVar.e(i.this.f66143d);
            }
        });
    }

    public static /* synthetic */ f q(final i iVar, final Function function, final Object obj, c cVar) {
        iVar.getClass();
        return iVar.a0(new e(new Supplier() { // from class: ka0.h
            @Override // java.util.function.Supplier
            public final Object get() {
                return i.e(i.this, function, obj);
            }
        }));
    }

    public <T> T C(N n11, Object obj, Class<T> cls) throws NamespacedHierarchicalStoreException {
        return (T) r(obj, w(n11, obj), cls);
    }

    public <K, V> Object E(N namespace, final K key, final Function<K, V> defaultCreator) {
        c2.r(defaultCreator, "defaultCreator must not be null");
        c<N> cVar = new c<>(namespace, key);
        f I = I(cVar);
        if (I == null) {
            I = this.f66141b.computeIfAbsent(cVar, new Function() { // from class: ka0.e
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return i.q(i.this, defaultCreator, key, (i.c) obj);
                }
            });
        }
        return I.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K, V> V H(N n11, K k11, Function<K, V> function, Class<V> cls) throws NamespacedHierarchicalStoreException {
        return (V) r(k11, E(n11, k11, function), cls);
    }

    public final f I(c<N> compositeKey) {
        f fVar = this.f66141b.get(compositeKey);
        if (fVar != null) {
            return fVar;
        }
        i<N> iVar = this.f66142c;
        if (iVar != null) {
            return iVar.I(compositeKey);
        }
        return null;
    }

    public i<N> L() {
        return new i<>(this, this.f66143d);
    }

    public Object S(N namespace, Object key, final Object value) throws NamespacedHierarchicalStoreException {
        U();
        return f.d(this.f66141b.put(new c<>(namespace, key), a0(new Supplier() { // from class: ka0.f
            @Override // java.util.function.Supplier
            public final Object get() {
                return i.a(value);
            }
        })));
    }

    public final void U() {
        if (this.f66144e) {
            throw new NamespacedHierarchicalStoreException("A NamespacedHierarchicalStore cannot be modified or queried after it has been closed");
        }
    }

    public Object V(N namespace, Object key) {
        U();
        return f.d(this.f66141b.remove(new c(namespace, key)));
    }

    public <T> T Z(N n11, Object obj, Class<T> cls) throws NamespacedHierarchicalStoreException {
        U();
        return (T) r(obj, V(n11, obj), cls);
    }

    public final f a0(Supplier<Object> value) {
        return new f(this.f66140a.getAndIncrement(), value);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f66144e) {
            return;
        }
        try {
            if (this.f66143d != null) {
                final m mVar = new m(new Predicate() { // from class: ka0.a
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return i.f((Throwable) obj);
                    }
                });
                this.f66141b.entrySet().stream().map(new Function() { // from class: ka0.b
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        i.d e11;
                        e11 = ((i.f) r1.getValue()).e((i.c) ((Map.Entry) obj).getKey());
                        return e11;
                    }
                }).filter(new Predicate() { // from class: ka0.c
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return i.c((i.d) obj);
                    }
                }).sorted(d.f66147d).forEach(new Consumer() { // from class: ka0.d
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        i.j(i.this, mVar, (i.d) obj);
                    }
                });
                mVar.b();
            }
        } finally {
            this.f66144e = true;
        }
    }

    @API(since = "1.11", status = API.Status.EXPERIMENTAL)
    public boolean isClosed() {
        return this.f66144e;
    }

    public final <T> T r(Object obj, Object obj2, Class<T> cls) {
        c2.r(cls, "requiredType must not be null");
        if (obj2 == null) {
            return null;
        }
        if (ReflectionUtils.Q0(obj2, cls)) {
            return cls.isPrimitive() ? (T) ReflectionUtils.J0(cls).cast(obj2) : cls.cast(obj2);
        }
        throw new NamespacedHierarchicalStoreException(String.format("Object stored under key [%s] is not of required type [%s], but was [%s]: %s", obj, cls.getName(), obj2.getClass().getName(), obj2));
    }

    public Object w(N namespace, Object key) {
        return f.d(I(new c<>(namespace, key)));
    }

    public i(i<N> parentStore, b<N> closeAction) {
        this.f66140a = new AtomicInteger();
        this.f66141b = new ConcurrentHashMap(4);
        this.f66144e = false;
        this.f66142c = parentStore;
        this.f66143d = closeAction;
    }

    public static /* synthetic */ Object a(Object obj) {
        return obj;
    }
}
