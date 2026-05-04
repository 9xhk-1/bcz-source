package rx.internal.operators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class g2<T, R> implements c.b<R, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, ? extends rx.c<? extends R>> f85386a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85387b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85388c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final c<?, T> f85389a;

        /* renamed from: b, reason: collision with root package name */
        public final Queue<Object> f85390b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f85391c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f85392d;

        public a(c<?, T> cVar, int i11) {
            this.f85389a = cVar;
            this.f85390b = rx.internal.util.unsafe.n0.f() ? new rx.internal.util.unsafe.z<>(i11) : new rx.internal.util.atomic.d<>(i11);
            request(i11);
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85391c = true;
            this.f85389a.C();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85392d = th2;
            this.f85391c = true;
            this.f85389a.C();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85390b.offer(v.j(t11));
            this.f85389a.C();
        }

        public void q(long j11) {
            request(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends AtomicLong implements qb0.d {
        private static final long serialVersionUID = -657299606803478389L;

        /* renamed from: a, reason: collision with root package name */
        public final c<?, ?> f85393a;

        public b(c<?, ?> cVar) {
            this.f85393a = cVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            if (j11 < 0) {
                throw new IllegalStateException("n >= 0 required but it was " + j11);
            }
            if (j11 > 0) {
                rx.internal.operators.a.b(this, j11);
                this.f85393a.C();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T, R> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final wb0.p<? super T, ? extends rx.c<? extends R>> f85394a;

        /* renamed from: b, reason: collision with root package name */
        public final int f85395b;

        /* renamed from: c, reason: collision with root package name */
        public final qb0.g<? super R> f85396c;

        /* renamed from: e, reason: collision with root package name */
        public volatile boolean f85398e;

        /* renamed from: f, reason: collision with root package name */
        public Throwable f85399f;

        /* renamed from: g, reason: collision with root package name */
        public volatile boolean f85400g;

        /* renamed from: i, reason: collision with root package name */
        public b f85402i;

        /* renamed from: d, reason: collision with root package name */
        public final Queue<a<R>> f85397d = new LinkedList();

        /* renamed from: h, reason: collision with root package name */
        public final AtomicInteger f85401h = new AtomicInteger();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {
            public a() {
            }

            @Override // wb0.a
            public void call() {
                c.this.f85400g = true;
                if (c.this.f85401h.getAndIncrement() == 0) {
                    c.this.q();
                }
            }
        }

        public c(wb0.p<? super T, ? extends rx.c<? extends R>> pVar, int i11, int i12, qb0.g<? super R> gVar) {
            this.f85394a = pVar;
            this.f85395b = i11;
            this.f85396c = gVar;
            request(i12 == Integer.MAX_VALUE ? Long.MAX_VALUE : i12);
        }

        public void C() {
            a<R> peek;
            if (this.f85401h.getAndIncrement() != 0) {
                return;
            }
            b bVar = this.f85402i;
            qb0.g<? super R> gVar = this.f85396c;
            int i11 = 1;
            while (!this.f85400g) {
                boolean z11 = this.f85398e;
                synchronized (this.f85397d) {
                    peek = this.f85397d.peek();
                }
                boolean z12 = false;
                boolean z13 = peek == null;
                if (z11) {
                    Throwable th2 = this.f85399f;
                    if (th2 != null) {
                        q();
                        gVar.onError(th2);
                        return;
                    } else if (z13) {
                        gVar.onCompleted();
                        return;
                    }
                }
                if (!z13) {
                    long j11 = bVar.get();
                    Queue<Object> queue = peek.f85390b;
                    long j12 = 0;
                    while (true) {
                        boolean z14 = peek.f85391c;
                        Object peek2 = queue.peek();
                        boolean z15 = peek2 == null;
                        if (z14) {
                            Throwable th3 = peek.f85392d;
                            if (th3 == null) {
                                if (z15) {
                                    synchronized (this.f85397d) {
                                        this.f85397d.poll();
                                    }
                                    peek.unsubscribe();
                                    request(1L);
                                    z12 = true;
                                    break;
                                }
                            } else {
                                q();
                                gVar.onError(th3);
                                return;
                            }
                        }
                        if (z15 || j11 == j12) {
                            break;
                        }
                        queue.poll();
                        try {
                            gVar.onNext((Object) v.e(peek2));
                            j12++;
                        } catch (Throwable th4) {
                            vb0.a.g(th4, gVar, peek2);
                            return;
                        }
                    }
                    if (j12 != 0) {
                        if (j11 != Long.MAX_VALUE) {
                            rx.internal.operators.a.i(bVar, j12);
                        }
                        if (!z12) {
                            peek.q(j12);
                        }
                    }
                    if (z12) {
                        continue;
                    }
                }
                i11 = this.f85401h.addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
            }
            q();
        }

        public void D() {
            this.f85402i = new b(this);
            add(ec0.f.a(new a()));
            this.f85396c.add(this);
            this.f85396c.setProducer(this.f85402i);
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85398e = true;
            C();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85399f = th2;
            this.f85398e = true;
            C();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                rx.c<? extends R> call = this.f85394a.call(t11);
                if (this.f85400g) {
                    return;
                }
                a<R> aVar = new a<>(this, this.f85395b);
                synchronized (this.f85397d) {
                    try {
                        if (this.f85400g) {
                            return;
                        }
                        this.f85397d.add(aVar);
                        if (this.f85400g) {
                            return;
                        }
                        call.J6(aVar);
                        C();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                vb0.a.g(th3, this.f85396c, t11);
            }
        }

        public void q() {
            ArrayList arrayList;
            synchronized (this.f85397d) {
                arrayList = new ArrayList(this.f85397d);
                this.f85397d.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((qb0.h) it.next()).unsubscribe();
            }
        }
    }

    public g2(wb0.p<? super T, ? extends rx.c<? extends R>> pVar, int i11, int i12) {
        this.f85386a = pVar;
        this.f85387b = i11;
        this.f85388c = i12;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super R> gVar) {
        c cVar = new c(this.f85386a, this.f85387b, this.f85388c, gVar);
        cVar.D();
        return cVar;
    }
}
