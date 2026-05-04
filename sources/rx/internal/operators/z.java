package rx.internal.operators;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;
import rx.exceptions.MissingBackpressureException;
import rx.internal.util.ExceptionsUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class z<T, R> implements c.a<R> {

    /* renamed from: e, reason: collision with root package name */
    public static final int f86436e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static final int f86437f = 1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f86438g = 2;

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends T> f86439a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends rx.c<? extends R>> f86440b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86441c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86442d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f86443a;

        public a(d dVar) {
            this.f86443a = dVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            this.f86443a.L(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T, R> implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final R f86445a;

        /* renamed from: b, reason: collision with root package name */
        public final d<T, R> f86446b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f86447c;

        public b(R r11, d<T, R> dVar) {
            this.f86445a = r11;
            this.f86446b = dVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            if (this.f86447c || j11 <= 0) {
                return;
            }
            this.f86447c = true;
            d<T, R> dVar = this.f86446b;
            dVar.H(this.f86445a);
            dVar.D(1L);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T, R> extends qb0.g<R> {

        /* renamed from: a, reason: collision with root package name */
        public final d<T, R> f86448a;

        /* renamed from: b, reason: collision with root package name */
        public long f86449b;

        public c(d<T, R> dVar) {
            this.f86448a = dVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86448a.D(this.f86449b);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86448a.E(th2, this.f86449b);
        }

        @Override // qb0.c
        public void onNext(R r11) {
            this.f86449b++;
            this.f86448a.H(r11);
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f86448a.f86453d.c(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d<T, R> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super R> f86450a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, ? extends rx.c<? extends R>> f86451b;

        /* renamed from: c, reason: collision with root package name */
        public final int f86452c;

        /* renamed from: e, reason: collision with root package name */
        public final Queue<Object> f86454e;

        /* renamed from: h, reason: collision with root package name */
        public final ec0.e f86457h;

        /* renamed from: i, reason: collision with root package name */
        public volatile boolean f86458i;

        /* renamed from: j, reason: collision with root package name */
        public volatile boolean f86459j;

        /* renamed from: d, reason: collision with root package name */
        public final rx.internal.producers.a f86453d = new rx.internal.producers.a();

        /* renamed from: f, reason: collision with root package name */
        public final AtomicInteger f86455f = new AtomicInteger();

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<Throwable> f86456g = new AtomicReference<>();

        public d(qb0.g<? super R> gVar, wb0.p<? super T, ? extends rx.c<? extends R>> pVar, int i11, int i12) {
            this.f86450a = gVar;
            this.f86451b = pVar;
            this.f86452c = i12;
            this.f86454e = rx.internal.util.unsafe.n0.f() ? new rx.internal.util.unsafe.z<>(i11) : new rx.internal.util.atomic.d<>(i11);
            this.f86457h = new ec0.e();
            request(i11);
        }

        public void C(Throwable th2) {
            unsubscribe();
            if (!ExceptionsUtils.addThrowable(this.f86456g, th2)) {
                I(th2);
                return;
            }
            Throwable terminate = ExceptionsUtils.terminate(this.f86456g);
            if (ExceptionsUtils.isTerminated(terminate)) {
                return;
            }
            this.f86450a.onError(terminate);
        }

        public void D(long j11) {
            if (j11 != 0) {
                this.f86453d.b(j11);
            }
            this.f86459j = false;
            q();
        }

        public void E(Throwable th2, long j11) {
            if (!ExceptionsUtils.addThrowable(this.f86456g, th2)) {
                I(th2);
                return;
            }
            if (this.f86452c == 0) {
                Throwable terminate = ExceptionsUtils.terminate(this.f86456g);
                if (!ExceptionsUtils.isTerminated(terminate)) {
                    this.f86450a.onError(terminate);
                }
                unsubscribe();
                return;
            }
            if (j11 != 0) {
                this.f86453d.b(j11);
            }
            this.f86459j = false;
            q();
        }

        public void H(R r11) {
            this.f86450a.onNext(r11);
        }

        public void I(Throwable th2) {
            ac0.c.I(th2);
        }

        public void L(long j11) {
            if (j11 > 0) {
                this.f86453d.request(j11);
            } else {
                if (j11 >= 0) {
                    return;
                }
                throw new IllegalArgumentException("n >= 0 required but it was " + j11);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86458i = true;
            q();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (!ExceptionsUtils.addThrowable(this.f86456g, th2)) {
                I(th2);
                return;
            }
            this.f86458i = true;
            if (this.f86452c != 0) {
                q();
                return;
            }
            Throwable terminate = ExceptionsUtils.terminate(this.f86456g);
            if (!ExceptionsUtils.isTerminated(terminate)) {
                this.f86450a.onError(terminate);
            }
            this.f86457h.unsubscribe();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86454e.offer(v.j(t11))) {
                q();
            } else {
                unsubscribe();
                onError(new MissingBackpressureException());
            }
        }

        public void q() {
            if (this.f86455f.getAndIncrement() != 0) {
                return;
            }
            int i11 = this.f86452c;
            while (!this.f86450a.isUnsubscribed()) {
                if (!this.f86459j) {
                    if (i11 == 1 && this.f86456g.get() != null) {
                        Throwable terminate = ExceptionsUtils.terminate(this.f86456g);
                        if (ExceptionsUtils.isTerminated(terminate)) {
                            return;
                        }
                        this.f86450a.onError(terminate);
                        return;
                    }
                    boolean z11 = this.f86458i;
                    Object poll = this.f86454e.poll();
                    boolean z12 = poll == null;
                    if (z11 && z12) {
                        Throwable terminate2 = ExceptionsUtils.terminate(this.f86456g);
                        if (terminate2 == null) {
                            this.f86450a.onCompleted();
                            return;
                        } else {
                            if (ExceptionsUtils.isTerminated(terminate2)) {
                                return;
                            }
                            this.f86450a.onError(terminate2);
                            return;
                        }
                    }
                    if (!z12) {
                        try {
                            rx.c<? extends R> call = this.f86451b.call((Object) v.e(poll));
                            if (call == null) {
                                C(new NullPointerException("The source returned by the mapper was null"));
                                return;
                            }
                            if (call != rx.c.S1()) {
                                if (call instanceof rx.internal.util.k) {
                                    this.f86459j = true;
                                    this.f86453d.c(new b(((rx.internal.util.k) call).y7(), this));
                                } else {
                                    c cVar = new c(this);
                                    this.f86457h.b(cVar);
                                    if (cVar.isUnsubscribed()) {
                                        return;
                                    }
                                    this.f86459j = true;
                                    call.J6(cVar);
                                }
                                request(1L);
                            } else {
                                request(1L);
                            }
                        } catch (Throwable th2) {
                            vb0.a.e(th2);
                            C(th2);
                            return;
                        }
                    }
                }
                if (this.f86455f.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public z(rx.c<? extends T> cVar, wb0.p<? super T, ? extends rx.c<? extends R>> pVar, int i11, int i12) {
        this.f86439a = cVar;
        this.f86440b = pVar;
        this.f86441c = i11;
        this.f86442d = i12;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super R> gVar) {
        d dVar = new d(this.f86442d == 0 ? new zb0.g<>(gVar) : gVar, this.f86440b, this.f86441c, this.f86442d);
        gVar.add(dVar);
        gVar.add(dVar.f86457h);
        gVar.setProducer(new a(dVar));
        if (gVar.isUnsubscribed()) {
            return;
        }
        this.f86439a.J6(dVar);
    }
}
