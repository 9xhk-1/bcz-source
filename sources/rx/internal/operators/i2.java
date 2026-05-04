package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes9.dex */
public final class i2<T, K, V> implements c.b<yb0.d<K, V>, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, ? extends K> f85489a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends V> f85490b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85491c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f85492d;

    /* renamed from: e, reason: collision with root package name */
    public final wb0.p<wb0.b<K>, Map<K, Object>> f85493e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f85494a;

        public a(c cVar) {
            this.f85494a = cVar;
        }

        @Override // wb0.a
        public void call() {
            this.f85494a.q();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final c<?, ?, ?> f85496a;

        public b(c<?, ?, ?> cVar) {
            this.f85496a = cVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            this.f85496a.L(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T, K, V> extends qb0.g<T> {

        /* renamed from: r, reason: collision with root package name */
        public static final Object f85497r = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super yb0.d<K, V>> f85498a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, ? extends K> f85499b;

        /* renamed from: c, reason: collision with root package name */
        public final wb0.p<? super T, ? extends V> f85500c;

        /* renamed from: d, reason: collision with root package name */
        public final int f85501d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f85502e;

        /* renamed from: f, reason: collision with root package name */
        public final Map<Object, d<K, V>> f85503f;

        /* renamed from: g, reason: collision with root package name */
        public final Map<Object, d<K, V>> f85504g;

        /* renamed from: h, reason: collision with root package name */
        public final Queue<yb0.d<K, V>> f85505h = new ConcurrentLinkedQueue();

        /* renamed from: i, reason: collision with root package name */
        public final b f85506i;

        /* renamed from: j, reason: collision with root package name */
        public final Queue<K> f85507j;

        /* renamed from: k, reason: collision with root package name */
        public final rx.internal.producers.a f85508k;

        /* renamed from: l, reason: collision with root package name */
        public final AtomicBoolean f85509l;

        /* renamed from: m, reason: collision with root package name */
        public final AtomicLong f85510m;

        /* renamed from: n, reason: collision with root package name */
        public final AtomicInteger f85511n;

        /* renamed from: o, reason: collision with root package name */
        public Throwable f85512o;

        /* renamed from: p, reason: collision with root package name */
        public volatile boolean f85513p;

        /* renamed from: q, reason: collision with root package name */
        public final AtomicInteger f85514q;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static class a<K> implements wb0.b<K> {

            /* renamed from: a, reason: collision with root package name */
            public final Queue<K> f85515a;

            public a(Queue<K> queue) {
                this.f85515a = queue;
            }

            @Override // wb0.b
            public void call(K k11) {
                this.f85515a.offer(k11);
            }
        }

        public c(qb0.g<? super yb0.d<K, V>> gVar, wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2, int i11, boolean z11, wb0.p<wb0.b<K>, Map<K, Object>> pVar3) {
            this.f85498a = gVar;
            this.f85499b = pVar;
            this.f85500c = pVar2;
            this.f85501d = i11;
            this.f85502e = z11;
            rx.internal.producers.a aVar = new rx.internal.producers.a();
            this.f85508k = aVar;
            aVar.request(i11);
            this.f85506i = new b(this);
            this.f85509l = new AtomicBoolean();
            this.f85510m = new AtomicLong();
            this.f85511n = new AtomicInteger(1);
            this.f85514q = new AtomicInteger();
            if (pVar3 == null) {
                this.f85503f = new ConcurrentHashMap();
                this.f85507j = null;
            } else {
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                this.f85507j = concurrentLinkedQueue;
                this.f85503f = E(pVar3, new a(concurrentLinkedQueue));
            }
            this.f85504g = new ConcurrentHashMap();
        }

        public void C(K k11) {
            if (k11 == null) {
                k11 = (K) f85497r;
            }
            if (this.f85503f.remove(k11) != null && this.f85511n.decrementAndGet() == 0) {
                unsubscribe();
            }
            if (this.f85507j != null) {
                this.f85504g.remove(k11);
            }
        }

        public boolean D(boolean z11, boolean z12, qb0.g<? super yb0.d<K, V>> gVar, Queue<?> queue) {
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f85512o;
            if (th2 != null) {
                I(gVar, queue, th2);
                return true;
            }
            if (!z12) {
                return false;
            }
            this.f85498a.onCompleted();
            return true;
        }

        public final Map<Object, d<K, V>> E(wb0.p<wb0.b<K>, Map<K, Object>> pVar, wb0.b<K> bVar) {
            return pVar.call(bVar);
        }

        public void H() {
            if (this.f85514q.getAndIncrement() != 0) {
                return;
            }
            Queue<yb0.d<K, V>> queue = this.f85505h;
            qb0.g<? super yb0.d<K, V>> gVar = this.f85498a;
            int i11 = 1;
            while (!D(this.f85513p, queue.isEmpty(), gVar, queue)) {
                long j11 = this.f85510m.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.f85513p;
                    yb0.d<K, V> poll = queue.poll();
                    boolean z12 = poll == null;
                    if (D(z11, z12, gVar, queue)) {
                        return;
                    }
                    if (z12) {
                        break;
                    }
                    gVar.onNext(poll);
                    j12++;
                }
                if (j12 != 0) {
                    if (j11 != Long.MAX_VALUE) {
                        rx.internal.operators.a.i(this.f85510m, j12);
                    }
                    this.f85508k.request(j12);
                }
                i11 = this.f85514q.addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }

        public void I(qb0.g<? super yb0.d<K, V>> gVar, Queue<?> queue, Throwable th2) {
            queue.clear();
            ArrayList arrayList = new ArrayList(this.f85503f.values());
            this.f85503f.clear();
            if (this.f85507j != null) {
                this.f85504g.clear();
                this.f85507j.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((d) it.next()).onError(th2);
            }
            gVar.onError(th2);
        }

        public void L(long j11) {
            if (j11 >= 0) {
                rx.internal.operators.a.b(this.f85510m, j11);
                H();
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j11);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85513p) {
                return;
            }
            Iterator<d<K, V>> it = this.f85503f.values().iterator();
            while (it.hasNext()) {
                it.next().A7();
            }
            this.f85503f.clear();
            if (this.f85507j != null) {
                this.f85504g.clear();
                this.f85507j.clear();
            }
            this.f85513p = true;
            this.f85511n.decrementAndGet();
            H();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85513p) {
                ac0.c.I(th2);
                return;
            }
            this.f85512o = th2;
            this.f85513p = true;
            this.f85511n.decrementAndGet();
            H();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            boolean z11;
            if (this.f85513p) {
                return;
            }
            Queue<?> queue = this.f85505h;
            qb0.g<? super yb0.d<K, V>> gVar = this.f85498a;
            try {
                K call = this.f85499b.call(t11);
                Object obj = call != null ? call : f85497r;
                d<K, V> dVar = this.f85503f.get(obj);
                if (dVar != null) {
                    z11 = false;
                } else {
                    if (this.f85509l.get()) {
                        return;
                    }
                    dVar = d.z7(call, this.f85501d, this, this.f85502e);
                    this.f85503f.put(obj, dVar);
                    if (this.f85507j != null) {
                        this.f85504g.put(obj, dVar);
                    }
                    this.f85511n.getAndIncrement();
                    z11 = true;
                }
                try {
                    dVar.onNext(this.f85500c.call(t11));
                    if (this.f85507j != null) {
                        while (true) {
                            K poll = this.f85507j.poll();
                            if (poll == null) {
                                break;
                            }
                            d<K, V> remove = this.f85504g.remove(poll);
                            if (remove != null) {
                                remove.A7();
                            }
                        }
                    }
                    if (z11) {
                        queue.offer(dVar);
                        H();
                    }
                } catch (Throwable th2) {
                    unsubscribe();
                    I(gVar, queue, th2);
                }
            } catch (Throwable th3) {
                unsubscribe();
                I(gVar, queue, th3);
            }
        }

        public void q() {
            if (this.f85509l.compareAndSet(false, true) && this.f85511n.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85508k.c(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<K, T> extends yb0.d<K, T> {

        /* renamed from: c, reason: collision with root package name */
        public final e<T, K> f85516c;

        public d(K k11, e<T, K> eVar) {
            super(k11, eVar);
            this.f85516c = eVar;
        }

        public static <T, K> d<K, T> z7(K k11, int i11, c<?, K, T> cVar, boolean z11) {
            return new d<>(k11, new e(i11, cVar, k11, z11));
        }

        public void A7() {
            this.f85516c.j();
        }

        public void onError(Throwable th2) {
            this.f85516c.n(th2);
        }

        public void onNext(T t11) {
            this.f85516c.q(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<T, K> extends AtomicInteger implements qb0.d, qb0.h, c.a<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: a, reason: collision with root package name */
        public final K f85517a;

        /* renamed from: c, reason: collision with root package name */
        public final c<?, K, T> f85519c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f85520d;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f85522f;

        /* renamed from: g, reason: collision with root package name */
        public Throwable f85523g;

        /* renamed from: b, reason: collision with root package name */
        public final Queue<Object> f85518b = new ConcurrentLinkedQueue();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f85524h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        public final AtomicReference<qb0.g<? super T>> f85525i = new AtomicReference<>();

        /* renamed from: j, reason: collision with root package name */
        public final AtomicBoolean f85526j = new AtomicBoolean();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f85521e = new AtomicLong();

        public e(int i11, c<?, K, T> cVar, K k11, boolean z11) {
            this.f85519c = cVar;
            this.f85517a = k11;
            this.f85520d = z11;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            if (!this.f85526j.compareAndSet(false, true)) {
                gVar.onError(new IllegalStateException("Only one Subscriber allowed!"));
                return;
            }
            gVar.add(this);
            gVar.setProducer(this);
            this.f85525i.lazySet(gVar);
            h();
        }

        public boolean b(boolean z11, boolean z12, qb0.g<? super T> gVar, boolean z13) {
            if (this.f85524h.get()) {
                this.f85518b.clear();
                this.f85519c.C(this.f85517a);
                return true;
            }
            if (!z11) {
                return false;
            }
            if (z13) {
                if (!z12) {
                    return false;
                }
                Throwable th2 = this.f85523g;
                if (th2 != null) {
                    gVar.onError(th2);
                } else {
                    gVar.onCompleted();
                }
                return true;
            }
            Throwable th3 = this.f85523g;
            if (th3 != null) {
                this.f85518b.clear();
                gVar.onError(th3);
                return true;
            }
            if (!z12) {
                return false;
            }
            gVar.onCompleted();
            return true;
        }

        public void h() {
            if (getAndIncrement() != 0) {
                return;
            }
            Queue<Object> queue = this.f85518b;
            boolean z11 = this.f85520d;
            qb0.g<? super T> gVar = this.f85525i.get();
            int i11 = 1;
            while (true) {
                if (gVar != null) {
                    if (b(this.f85522f, queue.isEmpty(), gVar, z11)) {
                        return;
                    }
                    long j11 = this.f85521e.get();
                    long j12 = 0;
                    while (j12 != j11) {
                        boolean z12 = this.f85522f;
                        Object poll = queue.poll();
                        boolean z13 = poll == null;
                        if (b(z12, z13, gVar, z11)) {
                            return;
                        }
                        if (z13) {
                            break;
                        }
                        gVar.onNext((Object) v.e(poll));
                        j12++;
                    }
                    if (j12 != 0) {
                        if (j11 != Long.MAX_VALUE) {
                            rx.internal.operators.a.i(this.f85521e, j12);
                        }
                        this.f85519c.f85508k.request(j12);
                    }
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
                if (gVar == null) {
                    gVar = this.f85525i.get();
                }
            }
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f85524h.get();
        }

        public void j() {
            this.f85522f = true;
            h();
        }

        public void n(Throwable th2) {
            this.f85523g = th2;
            this.f85522f = true;
            h();
        }

        public void q(T t11) {
            if (t11 == null) {
                this.f85523g = new NullPointerException();
                this.f85522f = true;
            } else {
                this.f85518b.offer(v.j(t11));
            }
            h();
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j11);
            }
            if (j11 != 0) {
                rx.internal.operators.a.b(this.f85521e, j11);
                h();
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (this.f85524h.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f85519c.C(this.f85517a);
            }
        }
    }

    public i2(wb0.p<? super T, ? extends K> pVar) {
        this(pVar, rx.internal.util.o.c(), rx.internal.util.j.f86718d, false, null);
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super yb0.d<K, V>> gVar) {
        qb0.g<? super yb0.d<K, V>> gVar2;
        try {
            gVar2 = gVar;
            try {
                c cVar = new c(gVar2, this.f85489a, this.f85490b, this.f85491c, this.f85492d, this.f85493e);
                gVar2.add(ec0.f.a(new a(cVar)));
                gVar2.setProducer(cVar.f85506i);
                return cVar;
            } catch (Throwable th2) {
                th = th2;
                vb0.a.f(th, gVar2);
                qb0.g<? super T> d11 = zb0.h.d();
                d11.unsubscribe();
                return d11;
            }
        } catch (Throwable th3) {
            th = th3;
            gVar2 = gVar;
        }
    }

    public i2(wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2) {
        this(pVar, pVar2, rx.internal.util.j.f86718d, false, null);
    }

    public i2(wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2, wb0.p<wb0.b<K>, Map<K, Object>> pVar3) {
        this(pVar, pVar2, rx.internal.util.j.f86718d, false, pVar3);
    }

    public i2(wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2, int i11, boolean z11, wb0.p<wb0.b<K>, Map<K, Object>> pVar3) {
        this.f85489a = pVar;
        this.f85490b = pVar2;
        this.f85491c = i11;
        this.f85492d = z11;
        this.f85493e = pVar3;
    }
}
