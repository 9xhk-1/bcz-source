package rx.internal.operators;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a4<T> implements c.b<rx.c<T>, T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f85089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85090b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super rx.c<T>> f85091a;

        /* renamed from: b, reason: collision with root package name */
        public final int f85092b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicInteger f85093c = new AtomicInteger(1);

        /* renamed from: d, reason: collision with root package name */
        public final qb0.h f85094d;

        /* renamed from: e, reason: collision with root package name */
        public int f85095e;

        /* renamed from: f, reason: collision with root package name */
        public dc0.f<T, T> f85096f;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.a4$a$a, reason: collision with other inner class name */
        public class C1077a implements qb0.d {
            public C1077a() {
            }

            @Override // qb0.d
            public void request(long j11) {
                if (j11 < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j11);
                }
                if (j11 != 0) {
                    a.this.request(rx.internal.operators.a.c(a.this.f85092b, j11));
                }
            }
        }

        public a(qb0.g<? super rx.c<T>> gVar, int i11) {
            this.f85091a = gVar;
            this.f85092b = i11;
            qb0.h a11 = ec0.f.a(this);
            this.f85094d = a11;
            add(a11);
            request(0L);
        }

        public qb0.d C() {
            return new C1077a();
        }

        @Override // wb0.a
        public void call() {
            if (this.f85093c.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            dc0.f<T, T> fVar = this.f85096f;
            if (fVar != null) {
                this.f85096f = null;
                fVar.onCompleted();
            }
            this.f85091a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            dc0.f<T, T> fVar = this.f85096f;
            if (fVar != null) {
                this.f85096f = null;
                fVar.onError(th2);
            }
            this.f85091a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            int i11 = this.f85095e;
            dc0.i iVar = this.f85096f;
            if (i11 == 0) {
                this.f85093c.getAndIncrement();
                iVar = dc0.i.A7(this.f85092b, this);
                this.f85096f = iVar;
                this.f85091a.onNext(iVar);
            }
            int i12 = i11 + 1;
            iVar.onNext(t11);
            if (i12 != this.f85092b) {
                this.f85095e = i12;
                return;
            }
            this.f85095e = 0;
            this.f85096f = null;
            iVar.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super rx.c<T>> f85098a;

        /* renamed from: b, reason: collision with root package name */
        public final int f85099b;

        /* renamed from: c, reason: collision with root package name */
        public final int f85100c;

        /* renamed from: e, reason: collision with root package name */
        public final qb0.h f85102e;

        /* renamed from: i, reason: collision with root package name */
        public final Queue<dc0.f<T, T>> f85106i;

        /* renamed from: j, reason: collision with root package name */
        public Throwable f85107j;

        /* renamed from: k, reason: collision with root package name */
        public volatile boolean f85108k;

        /* renamed from: l, reason: collision with root package name */
        public int f85109l;

        /* renamed from: m, reason: collision with root package name */
        public int f85110m;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f85101d = new AtomicInteger(1);

        /* renamed from: f, reason: collision with root package name */
        public final ArrayDeque<dc0.f<T, T>> f85103f = new ArrayDeque<>();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicInteger f85105h = new AtomicInteger();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicLong f85104g = new AtomicLong();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class a extends AtomicBoolean implements qb0.d {
            private static final long serialVersionUID = 4625807964358024108L;

            public a() {
            }

            @Override // qb0.d
            public void request(long j11) {
                if (j11 < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j11);
                }
                if (j11 != 0) {
                    b bVar = b.this;
                    if (get() || !compareAndSet(false, true)) {
                        b.this.request(rx.internal.operators.a.c(bVar.f85100c, j11));
                    } else {
                        bVar.request(rx.internal.operators.a.a(rx.internal.operators.a.c(bVar.f85100c, j11 - 1), bVar.f85099b));
                    }
                    rx.internal.operators.a.b(bVar.f85104g, j11);
                    bVar.H();
                }
            }
        }

        public b(qb0.g<? super rx.c<T>> gVar, int i11, int i12) {
            this.f85098a = gVar;
            this.f85099b = i11;
            this.f85100c = i12;
            qb0.h a11 = ec0.f.a(this);
            this.f85102e = a11;
            add(a11);
            request(0L);
            this.f85106i = new rx.internal.util.atomic.e((i11 + (i12 - 1)) / i12);
        }

        public boolean D(boolean z11, boolean z12, qb0.g<? super dc0.f<T, T>> gVar, Queue<dc0.f<T, T>> queue) {
            if (gVar.isUnsubscribed()) {
                queue.clear();
                return true;
            }
            if (!z11) {
                return false;
            }
            Throwable th2 = this.f85107j;
            if (th2 != null) {
                queue.clear();
                gVar.onError(th2);
                return true;
            }
            if (!z12) {
                return false;
            }
            gVar.onCompleted();
            return true;
        }

        public qb0.d E() {
            return new a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void H() {
            AtomicInteger atomicInteger = this.f85105h;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            qb0.g<? super rx.c<T>> gVar = this.f85098a;
            Queue<dc0.f<T, T>> queue = this.f85106i;
            int i11 = 1;
            do {
                long j11 = this.f85104g.get();
                long j12 = 0;
                while (j12 != j11) {
                    boolean z11 = this.f85108k;
                    dc0.f<T, T> poll = queue.poll();
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
                if (j12 == j11 && D(this.f85108k, queue.isEmpty(), gVar, queue)) {
                    return;
                }
                if (j12 != 0 && j11 != Long.MAX_VALUE) {
                    this.f85104g.addAndGet(-j12);
                }
                i11 = atomicInteger.addAndGet(-i11);
            } while (i11 != 0);
        }

        @Override // wb0.a
        public void call() {
            if (this.f85101d.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            Iterator<dc0.f<T, T>> it = this.f85103f.iterator();
            while (it.hasNext()) {
                it.next().onCompleted();
            }
            this.f85103f.clear();
            this.f85108k = true;
            H();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            Iterator<dc0.f<T, T>> it = this.f85103f.iterator();
            while (it.hasNext()) {
                it.next().onError(th2);
            }
            this.f85103f.clear();
            this.f85107j = th2;
            this.f85108k = true;
            H();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            int i11 = this.f85109l;
            ArrayDeque<dc0.f<T, T>> arrayDeque = this.f85103f;
            if (i11 == 0 && !this.f85098a.isUnsubscribed()) {
                this.f85101d.getAndIncrement();
                dc0.i A7 = dc0.i.A7(16, this);
                arrayDeque.offer(A7);
                this.f85106i.offer(A7);
                H();
            }
            Iterator<dc0.f<T, T>> it = this.f85103f.iterator();
            while (it.hasNext()) {
                it.next().onNext(t11);
            }
            int i12 = this.f85110m + 1;
            if (i12 == this.f85099b) {
                this.f85110m = i12 - this.f85100c;
                dc0.f<T, T> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.onCompleted();
                }
            } else {
                this.f85110m = i12;
            }
            int i13 = i11 + 1;
            if (i13 == this.f85100c) {
                this.f85109l = 0;
            } else {
                this.f85109l = i13;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T> extends qb0.g<T> implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super rx.c<T>> f85112a;

        /* renamed from: b, reason: collision with root package name */
        public final int f85113b;

        /* renamed from: c, reason: collision with root package name */
        public final int f85114c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicInteger f85115d = new AtomicInteger(1);

        /* renamed from: e, reason: collision with root package name */
        public final qb0.h f85116e;

        /* renamed from: f, reason: collision with root package name */
        public int f85117f;

        /* renamed from: g, reason: collision with root package name */
        public dc0.f<T, T> f85118g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class a extends AtomicBoolean implements qb0.d {
            private static final long serialVersionUID = 4625807964358024108L;

            public a() {
            }

            @Override // qb0.d
            public void request(long j11) {
                if (j11 < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j11);
                }
                if (j11 != 0) {
                    c cVar = c.this;
                    if (get() || !compareAndSet(false, true)) {
                        cVar.request(rx.internal.operators.a.c(j11, cVar.f85114c));
                    } else {
                        cVar.request(rx.internal.operators.a.a(rx.internal.operators.a.c(j11, cVar.f85113b), rx.internal.operators.a.c(cVar.f85114c - cVar.f85113b, j11 - 1)));
                    }
                }
            }
        }

        public c(qb0.g<? super rx.c<T>> gVar, int i11, int i12) {
            this.f85112a = gVar;
            this.f85113b = i11;
            this.f85114c = i12;
            qb0.h a11 = ec0.f.a(this);
            this.f85116e = a11;
            add(a11);
            request(0L);
        }

        public qb0.d D() {
            return new a();
        }

        @Override // wb0.a
        public void call() {
            if (this.f85115d.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            dc0.f<T, T> fVar = this.f85118g;
            if (fVar != null) {
                this.f85118g = null;
                fVar.onCompleted();
            }
            this.f85112a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            dc0.f<T, T> fVar = this.f85118g;
            if (fVar != null) {
                this.f85118g = null;
                fVar.onError(th2);
            }
            this.f85112a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            int i11 = this.f85117f;
            dc0.i iVar = this.f85118g;
            if (i11 == 0) {
                this.f85115d.getAndIncrement();
                iVar = dc0.i.A7(this.f85113b, this);
                this.f85118g = iVar;
                this.f85112a.onNext(iVar);
            }
            int i12 = i11 + 1;
            if (iVar != null) {
                iVar.onNext(t11);
            }
            if (i12 == this.f85113b) {
                this.f85117f = i12;
                this.f85118g = null;
                iVar.onCompleted();
            } else if (i12 == this.f85114c) {
                this.f85117f = 0;
            } else {
                this.f85117f = i12;
            }
        }
    }

    public a4(int i11, int i12) {
        this.f85089a = i11;
        this.f85090b = i12;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super rx.c<T>> gVar) {
        int i11 = this.f85090b;
        int i12 = this.f85089a;
        if (i11 == i12) {
            a aVar = new a(gVar, i12);
            gVar.add(aVar.f85094d);
            gVar.setProducer(aVar.C());
            return aVar;
        }
        if (i11 > i12) {
            c cVar = new c(gVar, i12, i11);
            gVar.add(cVar.f85116e);
            gVar.setProducer(cVar.D());
            return cVar;
        }
        b bVar = new b(gVar, i12, i11);
        gVar.add(bVar.f85102e);
        gVar.setProducer(bVar.E());
        return bVar;
    }
}
