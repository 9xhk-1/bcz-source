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
/* loaded from: classes9.dex */
public final class j2<T, K, V> implements c.b<yb0.d<K, V>, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, ? extends K> f85564a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends V> f85565b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85566c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f85567d;

    /* renamed from: e, reason: collision with root package name */
    public final wb0.p<wb0.b<Object>, Map<K, Object>> f85568e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f85569a;

        public a(d dVar) {
            this.f85569a = dVar;
        }

        @Override // wb0.a
        public void call() {
            this.f85569a.q();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<K, V> implements wb0.b<e<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final Queue<e<K, V>> f85571a;

        public b(Queue<e<K, V>> queue) {
            this.f85571a = queue;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(e<K, V> eVar) {
            this.f85571a.offer(eVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final d<?, ?, ?> f85572a;

        public c(d<?, ?, ?> dVar) {
            this.f85572a = dVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            this.f85572a.I(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T, K, V> extends qb0.g<T> {

        /* renamed from: q, reason: collision with root package name */
        public static final Object f85573q = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super yb0.d<K, V>> f85574a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, ? extends K> f85575b;

        /* renamed from: c, reason: collision with root package name */
        public final wb0.p<? super T, ? extends V> f85576c;

        /* renamed from: d, reason: collision with root package name */
        public final int f85577d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f85578e;

        /* renamed from: f, reason: collision with root package name */
        public final Map<K, e<K, V>> f85579f;

        /* renamed from: g, reason: collision with root package name */
        public final Queue<e<K, V>> f85580g = new ConcurrentLinkedQueue();

        /* renamed from: h, reason: collision with root package name */
        public final c f85581h;

        /* renamed from: i, reason: collision with root package name */
        public final Queue<e<K, V>> f85582i;

        /* renamed from: j, reason: collision with root package name */
        public final rx.internal.producers.a f85583j;

        /* renamed from: k, reason: collision with root package name */
        public final AtomicBoolean f85584k;

        /* renamed from: l, reason: collision with root package name */
        public final AtomicLong f85585l;

        /* renamed from: m, reason: collision with root package name */
        public final AtomicInteger f85586m;

        /* renamed from: n, reason: collision with root package name */
        public Throwable f85587n;

        /* renamed from: o, reason: collision with root package name */
        public volatile boolean f85588o;

        /* renamed from: p, reason: collision with root package name */
        public final AtomicInteger f85589p;

        public d(qb0.g<? super yb0.d<K, V>> gVar, wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2, int i11, boolean z11, Map<K, e<K, V>> map, Queue<e<K, V>> queue) {
            this.f85574a = gVar;
            this.f85575b = pVar;
            this.f85576c = pVar2;
            this.f85577d = i11;
            this.f85578e = z11;
            rx.internal.producers.a aVar = new rx.internal.producers.a();
            this.f85583j = aVar;
            aVar.request(i11);
            this.f85581h = new c(this);
            this.f85584k = new AtomicBoolean();
            this.f85585l = new AtomicLong();
            this.f85586m = new AtomicInteger(1);
            this.f85589p = new AtomicInteger();
            this.f85579f = map;
            this.f85582i = queue;
        }

        public void C(K k11) {
            if (k11 == null) {
                k11 = (K) f85573q;
            }
            if (this.f85579f.remove(k11) == null || this.f85586m.decrementAndGet() != 0) {
                return;
            }
            unsubscribe();
        }

        public boolean D(boolean z11, boolean z12, qb0.g<? super yb0.d<K, V>> gVar, Queue<?> queue) {
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f85587n;
            if (th2 != null) {
                H(gVar, queue, th2);
                return true;
            }
            if (!z12) {
                return false;
            }
            this.f85574a.onCompleted();
            return true;
        }

        public void E() {
            if (this.f85589p.getAndIncrement() != 0) {
                return;
            }
            Queue<e<K, V>> queue = this.f85580g;
            qb0.g<? super yb0.d<K, V>> gVar = this.f85574a;
            int i11 = 1;
            while (!D(this.f85588o, queue.isEmpty(), gVar, queue)) {
                long j11 = this.f85585l.get();
                boolean z11 = j11 == Long.MAX_VALUE;
                long j12 = 0;
                while (j11 != 0) {
                    boolean z12 = this.f85588o;
                    e<K, V> poll = queue.poll();
                    boolean z13 = poll == null;
                    if (D(z12, z13, gVar, queue)) {
                        return;
                    }
                    if (z13) {
                        break;
                    }
                    gVar.onNext(poll);
                    j11--;
                    j12--;
                }
                if (j12 != 0) {
                    if (!z11) {
                        this.f85585l.addAndGet(j12);
                    }
                    this.f85583j.request(-j12);
                }
                i11 = this.f85589p.addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
        }

        public void H(qb0.g<? super yb0.d<K, V>> gVar, Queue<?> queue, Throwable th2) {
            queue.clear();
            ArrayList arrayList = new ArrayList(this.f85579f.values());
            this.f85579f.clear();
            Queue<e<K, V>> queue2 = this.f85582i;
            if (queue2 != null) {
                queue2.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((e) it.next()).onError(th2);
            }
            gVar.onError(th2);
        }

        public void I(long j11) {
            if (j11 >= 0) {
                rx.internal.operators.a.b(this.f85585l, j11);
                E();
            } else {
                throw new IllegalArgumentException("n >= 0 required but it was " + j11);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85588o) {
                return;
            }
            Iterator<e<K, V>> it = this.f85579f.values().iterator();
            while (it.hasNext()) {
                it.next().A7();
            }
            this.f85579f.clear();
            Queue<e<K, V>> queue = this.f85582i;
            if (queue != null) {
                queue.clear();
            }
            this.f85588o = true;
            this.f85586m.decrementAndGet();
            E();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85588o) {
                ac0.c.I(th2);
                return;
            }
            this.f85587n = th2;
            this.f85588o = true;
            this.f85586m.decrementAndGet();
            E();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f85588o) {
                return;
            }
            Queue<?> queue = this.f85580g;
            qb0.g<? super yb0.d<K, V>> gVar = this.f85574a;
            try {
                K call = this.f85575b.call(t11);
                Object obj = call != null ? call : f85573q;
                e eVar = this.f85579f.get(obj);
                if (eVar == null) {
                    if (this.f85584k.get()) {
                        return;
                    }
                    eVar = e.z7(call, this.f85577d, this, this.f85578e);
                    this.f85579f.put(obj, eVar);
                    this.f85586m.getAndIncrement();
                    queue.offer(eVar);
                    E();
                }
                try {
                    eVar.onNext(this.f85576c.call(t11));
                    if (this.f85582i == null) {
                        return;
                    }
                    while (true) {
                        e<K, V> poll = this.f85582i.poll();
                        if (poll == null) {
                            return;
                        } else {
                            poll.A7();
                        }
                    }
                } catch (Throwable th2) {
                    unsubscribe();
                    H(gVar, queue, th2);
                }
            } catch (Throwable th3) {
                unsubscribe();
                H(gVar, queue, th3);
            }
        }

        public void q() {
            if (this.f85584k.compareAndSet(false, true) && this.f85586m.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85583j.c(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<K, T> extends yb0.d<K, T> {

        /* renamed from: c, reason: collision with root package name */
        public final f<T, K> f85590c;

        public e(K k11, f<T, K> fVar) {
            super(k11, fVar);
            this.f85590c = fVar;
        }

        public static <T, K> e<K, T> z7(K k11, int i11, d<?, K, T> dVar, boolean z11) {
            return new e<>(k11, new f(i11, dVar, k11, z11));
        }

        public void A7() {
            this.f85590c.j();
        }

        public void onError(Throwable th2) {
            this.f85590c.n(th2);
        }

        public void onNext(T t11) {
            this.f85590c.q(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<T, K> extends AtomicInteger implements qb0.d, qb0.h, c.a<T> {
        private static final long serialVersionUID = -3852313036005250360L;

        /* renamed from: a, reason: collision with root package name */
        public final K f85591a;

        /* renamed from: c, reason: collision with root package name */
        public final d<?, K, T> f85593c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f85594d;

        /* renamed from: f, reason: collision with root package name */
        public volatile boolean f85596f;

        /* renamed from: g, reason: collision with root package name */
        public Throwable f85597g;

        /* renamed from: b, reason: collision with root package name */
        public final Queue<Object> f85592b = new ConcurrentLinkedQueue();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicBoolean f85598h = new AtomicBoolean();

        /* renamed from: i, reason: collision with root package name */
        public final AtomicReference<qb0.g<? super T>> f85599i = new AtomicReference<>();

        /* renamed from: j, reason: collision with root package name */
        public final AtomicBoolean f85600j = new AtomicBoolean();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f85595e = new AtomicLong();

        public f(int i11, d<?, K, T> dVar, K k11, boolean z11) {
            this.f85593c = dVar;
            this.f85591a = k11;
            this.f85594d = z11;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super T> gVar) {
            if (!this.f85600j.compareAndSet(false, true)) {
                gVar.onError(new IllegalStateException("Only one Subscriber allowed!"));
                return;
            }
            gVar.add(this);
            gVar.setProducer(this);
            this.f85599i.lazySet(gVar);
            h();
        }

        public boolean b(boolean z11, boolean z12, qb0.g<? super T> gVar, boolean z13) {
            if (this.f85598h.get()) {
                this.f85592b.clear();
                this.f85593c.C(this.f85591a);
                return true;
            }
            if (!z11) {
                return false;
            }
            if (z13) {
                if (!z12) {
                    return false;
                }
                Throwable th2 = this.f85597g;
                if (th2 != null) {
                    gVar.onError(th2);
                } else {
                    gVar.onCompleted();
                }
                return true;
            }
            Throwable th3 = this.f85597g;
            if (th3 != null) {
                this.f85592b.clear();
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
            Queue<Object> queue = this.f85592b;
            boolean z11 = this.f85594d;
            qb0.g<? super T> gVar = this.f85599i.get();
            int i11 = 1;
            while (true) {
                if (gVar != null) {
                    if (b(this.f85596f, queue.isEmpty(), gVar, z11)) {
                        return;
                    }
                    long j11 = this.f85595e.get();
                    boolean z12 = j11 == Long.MAX_VALUE;
                    long j12 = 0;
                    while (j11 != 0) {
                        boolean z13 = this.f85596f;
                        Object poll = queue.poll();
                        boolean z14 = poll == null;
                        if (b(z13, z14, gVar, z11)) {
                            return;
                        }
                        if (z14) {
                            break;
                        }
                        gVar.onNext((Object) v.e(poll));
                        j11--;
                        j12--;
                    }
                    if (j12 != 0) {
                        if (!z12) {
                            this.f85595e.addAndGet(j12);
                        }
                        this.f85593c.f85583j.request(-j12);
                    }
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
                if (gVar == null) {
                    gVar = this.f85599i.get();
                }
            }
        }

        @Override // qb0.h
        public boolean isUnsubscribed() {
            return this.f85598h.get();
        }

        public void j() {
            this.f85596f = true;
            h();
        }

        public void n(Throwable th2) {
            this.f85597g = th2;
            this.f85596f = true;
            h();
        }

        public void q(T t11) {
            if (t11 == null) {
                this.f85597g = new NullPointerException();
                this.f85596f = true;
            } else {
                this.f85592b.offer(v.j(t11));
            }
            h();
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j11);
            }
            if (j11 != 0) {
                rx.internal.operators.a.b(this.f85595e, j11);
                h();
            }
        }

        @Override // qb0.h
        public void unsubscribe() {
            if (this.f85598h.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.f85593c.C(this.f85591a);
            }
        }
    }

    public j2(wb0.p<? super T, ? extends K> pVar) {
        this(pVar, rx.internal.util.o.c(), rx.internal.util.j.f86718d, false, null);
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super yb0.d<K, V>> gVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> call;
        if (this.f85568e == null) {
            call = new ConcurrentHashMap<>();
            concurrentLinkedQueue = null;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
            try {
                call = this.f85568e.call(new b(concurrentLinkedQueue));
            } catch (Throwable th2) {
                vb0.a.f(th2, gVar);
                qb0.g<? super T> d11 = zb0.h.d();
                d11.unsubscribe();
                return d11;
            }
        }
        d dVar = new d(gVar, this.f85564a, this.f85565b, this.f85566c, this.f85567d, call, concurrentLinkedQueue);
        gVar.add(ec0.f.a(new a(dVar)));
        gVar.setProducer(dVar.f85581h);
        return dVar;
    }

    public j2(wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2) {
        this(pVar, pVar2, rx.internal.util.j.f86718d, false, null);
    }

    public j2(wb0.p<? super T, ? extends K> pVar, wb0.p<? super T, ? extends V> pVar2, int i11, boolean z11, wb0.p<wb0.b<Object>, Map<K, Object>> pVar3) {
        this.f85564a = pVar;
        this.f85565b = pVar2;
        this.f85566c = i11;
        this.f85567d = z11;
        this.f85568e = pVar3;
    }
}
