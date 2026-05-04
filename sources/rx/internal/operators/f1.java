package rx.internal.operators;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import rx.c;
import rx.internal.operators.g1;
import rx.internal.subscriptions.SequentialSubscription;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f1<T, U, V> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f85318a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<U> f85319b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.p<? super T, ? extends rx.c<V>> f85320c;

    /* renamed from: d, reason: collision with root package name */
    public final rx.c<? extends T> f85321d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85322a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, ? extends rx.c<?>> f85323b;

        /* renamed from: c, reason: collision with root package name */
        public final rx.c<? extends T> f85324c;

        /* renamed from: d, reason: collision with root package name */
        public final rx.internal.producers.a f85325d = new rx.internal.producers.a();

        /* renamed from: e, reason: collision with root package name */
        public final AtomicLong f85326e = new AtomicLong();

        /* renamed from: f, reason: collision with root package name */
        public final SequentialSubscription f85327f;

        /* renamed from: g, reason: collision with root package name */
        public final SequentialSubscription f85328g;

        /* renamed from: h, reason: collision with root package name */
        public long f85329h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.f1$a$a, reason: collision with other inner class name */
        public final class C1083a extends qb0.g<Object> {

            /* renamed from: a, reason: collision with root package name */
            public final long f85330a;

            /* renamed from: b, reason: collision with root package name */
            public boolean f85331b;

            public C1083a(long j11) {
                this.f85330a = j11;
            }

            @Override // qb0.c
            public void onCompleted() {
                if (this.f85331b) {
                    return;
                }
                this.f85331b = true;
                a.this.q(this.f85330a);
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                if (this.f85331b) {
                    ac0.c.I(th2);
                } else {
                    this.f85331b = true;
                    a.this.C(this.f85330a, th2);
                }
            }

            @Override // qb0.c
            public void onNext(Object obj) {
                if (this.f85331b) {
                    return;
                }
                this.f85331b = true;
                unsubscribe();
                a.this.q(this.f85330a);
            }
        }

        public a(qb0.g<? super T> gVar, wb0.p<? super T, ? extends rx.c<?>> pVar, rx.c<? extends T> cVar) {
            this.f85322a = gVar;
            this.f85323b = pVar;
            this.f85324c = cVar;
            SequentialSubscription sequentialSubscription = new SequentialSubscription();
            this.f85327f = sequentialSubscription;
            this.f85328g = new SequentialSubscription(this);
            add(sequentialSubscription);
        }

        public void C(long j11, Throwable th2) {
            if (!this.f85326e.compareAndSet(j11, Long.MAX_VALUE)) {
                ac0.c.I(th2);
            } else {
                unsubscribe();
                this.f85322a.onError(th2);
            }
        }

        public void D(rx.c<?> cVar) {
            if (cVar != null) {
                C1083a c1083a = new C1083a(0L);
                if (this.f85327f.replace(c1083a)) {
                    cVar.r5(c1083a);
                }
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85326e.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f85327f.unsubscribe();
                this.f85322a.onCompleted();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85326e.getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
                ac0.c.I(th2);
            } else {
                this.f85327f.unsubscribe();
                this.f85322a.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            long j11 = this.f85326e.get();
            if (j11 != Long.MAX_VALUE) {
                long j12 = j11 + 1;
                if (this.f85326e.compareAndSet(j11, j12)) {
                    qb0.h hVar = this.f85327f.get();
                    if (hVar != null) {
                        hVar.unsubscribe();
                    }
                    this.f85322a.onNext(t11);
                    this.f85329h++;
                    try {
                        rx.c<?> call = this.f85323b.call(t11);
                        if (call == null) {
                            throw new NullPointerException("The itemTimeoutIndicator returned a null Observable");
                        }
                        C1083a c1083a = new C1083a(j12);
                        if (this.f85327f.replace(c1083a)) {
                            call.r5(c1083a);
                        }
                    } catch (Throwable th2) {
                        vb0.a.e(th2);
                        unsubscribe();
                        this.f85326e.getAndSet(Long.MAX_VALUE);
                        this.f85322a.onError(th2);
                    }
                }
            }
        }

        public void q(long j11) {
            if (this.f85326e.compareAndSet(j11, Long.MAX_VALUE)) {
                unsubscribe();
                if (this.f85324c == null) {
                    this.f85322a.onError(new TimeoutException());
                    return;
                }
                long j12 = this.f85329h;
                if (j12 != 0) {
                    this.f85325d.b(j12);
                }
                g1.a aVar = new g1.a(this.f85322a, this.f85325d);
                if (this.f85328g.replace(aVar)) {
                    this.f85324c.r5(aVar);
                }
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85325d.c(dVar);
        }
    }

    public f1(rx.c<T> cVar, rx.c<U> cVar2, wb0.p<? super T, ? extends rx.c<V>> pVar, rx.c<? extends T> cVar3) {
        this.f85318a = cVar;
        this.f85319b = cVar2;
        this.f85320c = pVar;
        this.f85321d = cVar3;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        a aVar = new a(gVar, this.f85320c, this.f85321d);
        gVar.add(aVar.f85328g);
        gVar.setProducer(aVar.f85325d);
        aVar.D(this.f85319b);
        this.f85318a.r5(aVar);
    }
}
