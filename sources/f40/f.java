package f40;

import com.baicizhan.client.business.dataset.provider.a;
import com.google.common.util.concurrent.s2;
import g10.u;
import h40.x0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import y00.g;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
/* loaded from: classes8.dex */
public final class f<K, V> extends a00.i<K, V> {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f50897b = AtomicIntegerFieldUpdater.newUpdater(f.class, "_size$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50898c = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "core$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final ReferenceQueue<K> f50899a;
    private volatile /* synthetic */ Object core$volatile;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a {

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f50900g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load$volatile");

        /* renamed from: a, reason: collision with root package name */
        public final int f50901a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50902b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50903c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicReferenceArray f50904d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ AtomicReferenceArray f50905e;
        private volatile /* synthetic */ int load$volatile;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,280:1\n1#2:281\n*E\n"})
        /* renamed from: f40.f$a$a, reason: collision with other inner class name */
        public final class C0606a<E> implements Iterator<E>, y00.d {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final x00.p<K, V, E> f50907a;

            /* renamed from: b, reason: collision with root package name */
            public int f50908b = -1;

            /* renamed from: c, reason: collision with root package name */
            public K f50909c;

            /* renamed from: d, reason: collision with root package name */
            public V f50910d;

            /* JADX WARN: Multi-variable type inference failed */
            public C0606a(@m80.k x00.p<? super K, ? super V, ? extends E> pVar) {
                this.f50907a = pVar;
                a();
            }

            public final void a() {
                K k11;
                while (true) {
                    int i11 = this.f50908b + 1;
                    this.f50908b = i11;
                    if (i11 >= a.this.f50901a) {
                        return;
                    }
                    p pVar = (p) a.this.f().get(this.f50908b);
                    if (pVar != null && (k11 = (K) pVar.get()) != null) {
                        this.f50909c = k11;
                        Object obj = (V) a.this.i().get(this.f50908b);
                        if (obj instanceof q) {
                            obj = (V) ((q) obj).f50962a;
                        }
                        if (obj != null) {
                            this.f50910d = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            @m80.k
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void remove() {
                g.e();
                throw new KotlinNothingValueException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f50908b < a.this.f50901a;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.f50908b >= a.this.f50901a) {
                    throw new NoSuchElementException();
                }
                x00.p<K, V, E> pVar = this.f50907a;
                K k11 = this.f50909c;
                if (k11 == false) {
                    g0.S(a.d.C0245a.f16161a);
                    k11 = (K) g2.f100423a;
                }
                V v11 = this.f50910d;
                if (v11 == false) {
                    g0.S("value");
                    v11 = (V) g2.f100423a;
                }
                E e11 = (E) pVar.invoke(k11, v11);
                a();
                return e11;
            }
        }

        public a(int i11) {
            this.f50901a = i11;
            this.f50902b = Integer.numberOfLeadingZeros(i11) + 1;
            this.f50903c = (i11 * 2) / 3;
            this.f50904d = new AtomicReferenceArray(i11);
            this.f50905e = new AtomicReferenceArray(i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object m(a aVar, Object obj, Object obj2, p pVar, int i11, Object obj3) {
            if ((i11 & 4) != 0) {
                pVar = null;
            }
            return aVar.l(obj, obj2, pVar);
        }

        public final void d(@m80.k p<?> pVar) {
            int j11 = j(pVar.f50961a);
            while (true) {
                p<?> pVar2 = (p) f().get(j11);
                if (pVar2 == null) {
                    return;
                }
                if (pVar2 == pVar) {
                    o(j11);
                    return;
                } else {
                    if (j11 == 0) {
                        j11 = this.f50901a;
                    }
                    j11--;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @m80.l
        public final V e(@m80.k K k11) {
            int j11 = j(k11.hashCode());
            while (true) {
                p pVar = (p) f().get(j11);
                if (pVar == null) {
                    return null;
                }
                T t11 = pVar.get();
                if (g0.g(k11, t11)) {
                    V v11 = (V) i().get(j11);
                    return v11 instanceof q ? (V) ((q) v11).f50962a : v11;
                }
                if (t11 == 0) {
                    o(j11);
                }
                if (j11 == 0) {
                    j11 = this.f50901a;
                }
                j11--;
            }
        }

        public final /* synthetic */ AtomicReferenceArray f() {
            return this.f50904d;
        }

        public final /* synthetic */ int g() {
            return this.load$volatile;
        }

        public final /* synthetic */ AtomicReferenceArray i() {
            return this.f50905e;
        }

        public final int j(int i11) {
            return (i11 * (-1640531527)) >>> this.f50902b;
        }

        @m80.k
        public final <E> Iterator<E> k(@m80.k x00.p<? super K, ? super V, ? extends E> pVar) {
            return new C0606a(pVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
        
            r6 = i().get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
        
            if ((r6 instanceof f40.q) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
        
            if (com.google.common.util.concurrent.s2.a(i(), r0, r6, r7) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        
            r6 = f40.g.f50918c;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        
            return r6;
         */
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object l(@m80.k K r6, @m80.l V r7, @m80.l f40.p<K> r8) {
            /*
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.j(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.f()
                java.lang.Object r2 = r2.get(r0)
                f40.p r2 = (f40.p) r2
                if (r2 != 0) goto L4d
                r2 = 0
                if (r7 != 0) goto L19
                return r2
            L19:
                if (r1 != 0) goto L35
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = h()
            L1f:
                int r1 = r3.get(r5)
                int r4 = r5.f50903c
                if (r1 < r4) goto L2c
                h40.x0 r6 = f40.g.a()
                return r6
            L2c:
                int r4 = r1 + 1
                boolean r1 = r3.compareAndSet(r5, r1, r4)
                if (r1 == 0) goto L1f
                r1 = 1
            L35:
                if (r8 != 0) goto L42
                f40.p r8 = new f40.p
                f40.f<K, V> r3 = f40.f.this
                java.lang.ref.ReferenceQueue r3 = f40.f.l(r3)
                r8.<init>(r6, r3)
            L42:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.f()
                boolean r2 = com.google.common.util.concurrent.s2.a(r3, r0, r2, r8)
                if (r2 != 0) goto L60
                goto L9
            L4d:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.g0.g(r6, r2)
                if (r3 == 0) goto L7c
                if (r1 == 0) goto L60
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = h()
                r6.decrementAndGet(r5)
            L60:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.i()
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof f40.q
                if (r8 == 0) goto L71
                h40.x0 r6 = f40.g.a()
                return r6
            L71:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.i()
                boolean r8 = com.google.common.util.concurrent.s2.a(r8, r0, r6, r7)
                if (r8 == 0) goto L60
                return r6
            L7c:
                if (r2 != 0) goto L81
                r5.o(r0)
            L81:
                if (r0 != 0) goto L85
                int r0 = r5.f50901a
            L85:
                int r0 = r0 + (-1)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: f40.f.a.l(java.lang.Object, java.lang.Object, f40.p):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @m80.k
        public final f<K, V>.a n() {
            Object obj;
            x0 x0Var;
            q d11;
            while (true) {
                f<K, V>.a aVar = (f<K, V>.a) f.this.new a(Integer.highestOneBit(u.u(f.this.size(), 4)) * 4);
                int i11 = this.f50901a;
                for (int i12 = 0; i12 < i11; i12++) {
                    p pVar = (p) f().get(i12);
                    Object obj2 = pVar != null ? pVar.get() : null;
                    if (pVar != null && obj2 == null) {
                        o(i12);
                    }
                    while (true) {
                        obj = i().get(i12);
                        if (obj instanceof q) {
                            obj = ((q) obj).f50962a;
                            break;
                        }
                        AtomicReferenceArray i13 = i();
                        d11 = g.d(obj);
                        if (s2.a(i13, i12, obj, d11)) {
                            break;
                        }
                    }
                    if (obj2 != null && obj != null) {
                        Object l11 = aVar.l(obj2, obj, pVar);
                        x0Var = g.f50918c;
                        if (l11 != x0Var) {
                        }
                    }
                }
                return aVar;
            }
        }

        public final void o(int i11) {
            Object obj;
            do {
                obj = i().get(i11);
                if (obj == null || (obj instanceof q)) {
                    return;
                }
            } while (!s2.a(i(), i11, obj, null));
            f.this.n();
        }

        public final /* synthetic */ void p(int i11) {
            this.load$volatile = i11;
        }

        public final /* synthetic */ void q(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, x00.l<? super Integer, Integer> lVar) {
            int i11;
            do {
                i11 = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i11, lVar.invoke(Integer.valueOf(i11)).intValue()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<K, V> implements Map.Entry<K, V>, g.a {

        /* renamed from: a, reason: collision with root package name */
        public final K f50912a;

        /* renamed from: b, reason: collision with root package name */
        public final V f50913b;

        public b(K k11, V v11) {
            this.f50912a = k11;
            this.f50913b = v11;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f50912a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f50913b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            g.e();
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class c<E> extends a00.j<E> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final x00.p<K, V, E> f50914a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(@m80.k x00.p<? super K, ? super V, ? extends E> pVar) {
            this.f50914a = pVar;
        }

        @Override // a00.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E e11) {
            g.e();
            throw new KotlinNothingValueException();
        }

        @Override // a00.j
        public int getSize() {
            return f.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @m80.k
        public Iterator<E> iterator() {
            return ((a) f.p().get(f.this)).k(this.f50914a);
        }
    }

    public f() {
        this(false, 1, null);
    }

    public static final Map.Entry g(Object obj, Object obj2) {
        return new b(obj, obj2);
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater p() {
        return f50898c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    @m80.l
    public V get(@m80.l Object obj) {
        if (obj == null) {
            return null;
        }
        return (V) ((a) f50898c.get(this)).e(obj);
    }

    @Override // a00.i
    @m80.k
    public Set<Map.Entry<K, V>> getEntries() {
        return new c(new x00.p() { // from class: f40.e
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                Map.Entry g11;
                g11 = f.g(obj, obj2);
                return g11;
            }
        });
    }

    @Override // a00.i
    @m80.k
    public Set<K> getKeys() {
        return new c(new x00.p() { // from class: f40.d
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                Object h11;
                h11 = f.h(obj, obj2);
                return h11;
            }
        });
    }

    @Override // a00.i
    public int getSize() {
        return f50897b.get(this);
    }

    public final void m(p<?> pVar) {
        ((a) f50898c.get(this)).d(pVar);
    }

    public final void n() {
        f50897b.decrementAndGet(this);
    }

    public final /* synthetic */ Object o() {
        return this.core$volatile;
    }

    @Override // a00.i, java.util.AbstractMap, java.util.Map
    @m80.l
    public V put(@m80.k K k11, @m80.k V v11) {
        x0 x0Var;
        V v12 = (V) a.m((a) f50898c.get(this), k11, v11, null, 4, null);
        x0Var = g.f50918c;
        if (v12 == x0Var) {
            v12 = t(k11, v11);
        }
        if (v12 == null) {
            f50897b.incrementAndGet(this);
        }
        return v12;
    }

    public final /* synthetic */ int r() {
        return this._size$volatile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    @m80.l
    public V remove(@m80.l Object obj) {
        x0 x0Var;
        if (obj == 0) {
            return null;
        }
        V v11 = (V) a.m((a) f50898c.get(this), obj, null, null, 4, null);
        x0Var = g.f50918c;
        if (v11 == x0Var) {
            v11 = t(obj, null);
        }
        if (v11 != null) {
            f50897b.decrementAndGet(this);
        }
        return v11;
    }

    public final synchronized V t(K k11, V v11) {
        V v12;
        x0 x0Var;
        a aVar = (a) f50898c.get(this);
        while (true) {
            K k12 = k11;
            V v13 = v11;
            v12 = (V) a.m(aVar, k12, v13, null, 4, null);
            x0Var = g.f50918c;
            if (v12 == x0Var) {
                aVar = aVar.n();
                f50898c.set(this, aVar);
                k11 = k12;
                v11 = v13;
            }
        }
        return v12;
    }

    public final void u() {
        if (this.f50899a == null) {
            throw new IllegalStateException("Must be created with weakRefQueue = true");
        }
        while (true) {
            try {
                Reference<? extends K> remove = this.f50899a.remove();
                g0.n(remove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                m((p) remove);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public final /* synthetic */ void v(Object obj) {
        this.core$volatile = obj;
    }

    public final /* synthetic */ void w(int i11) {
        this._size$volatile = i11;
    }

    public /* synthetic */ f(boolean z11, int i11, v vVar) {
        this((i11 & 1) != 0 ? false : z11);
    }

    public f(boolean z11) {
        this.core$volatile = new a(16);
        this.f50899a = z11 ? new ReferenceQueue<>() : null;
    }

    public static final Object h(Object obj, Object obj2) {
        return obj;
    }
}
