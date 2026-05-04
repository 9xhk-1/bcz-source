package rx.internal.operators;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;
import rx.internal.util.ExceptionsUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f85469a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends rx.b> f85470b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f85471c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85472d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85473a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, ? extends rx.b> f85474b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f85475c;

        /* renamed from: d, reason: collision with root package name */
        public final int f85476d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicInteger f85477e = new AtomicInteger(1);

        /* renamed from: g, reason: collision with root package name */
        public final AtomicReference<Throwable> f85479g = new AtomicReference<>();

        /* renamed from: f, reason: collision with root package name */
        public final ec0.b f85478f = new ec0.b();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.i0$a$a, reason: collision with other inner class name */
        public final class C1086a extends AtomicReference<qb0.h> implements qb0.b, qb0.h {
            private static final long serialVersionUID = -8588259593722659900L;

            public C1086a() {
            }

            @Override // qb0.b
            public void a(qb0.h hVar) {
                if (compareAndSet(null, hVar)) {
                    return;
                }
                hVar.unsubscribe();
                if (get() != this) {
                    ac0.c.I(new IllegalStateException("Subscription already set!"));
                }
            }

            @Override // qb0.h
            public boolean isUnsubscribed() {
                return get() == this;
            }

            @Override // qb0.b
            public void onCompleted() {
                a.this.C(this);
            }

            @Override // qb0.b
            public void onError(Throwable th2) {
                a.this.D(this, th2);
            }

            @Override // qb0.h
            public void unsubscribe() {
                qb0.h andSet = getAndSet(this);
                if (andSet == null || andSet == this) {
                    return;
                }
                andSet.unsubscribe();
            }
        }

        public a(qb0.g<? super T> gVar, wb0.p<? super T, ? extends rx.b> pVar, boolean z11, int i11) {
            this.f85473a = gVar;
            this.f85474b = pVar;
            this.f85475c = z11;
            this.f85476d = i11;
            request(i11 != Integer.MAX_VALUE ? i11 : Long.MAX_VALUE);
        }

        public void C(a<T>.C1086a c1086a) {
            this.f85478f.e(c1086a);
            if (q() || this.f85476d == Integer.MAX_VALUE) {
                return;
            }
            request(1L);
        }

        public void D(a<T>.C1086a c1086a, Throwable th2) {
            this.f85478f.e(c1086a);
            if (this.f85475c) {
                ExceptionsUtils.addThrowable(this.f85479g, th2);
                if (q() || this.f85476d == Integer.MAX_VALUE) {
                    return;
                }
                request(1L);
                return;
            }
            this.f85478f.unsubscribe();
            unsubscribe();
            if (androidx.camera.view.q.a(this.f85479g, null, th2)) {
                this.f85473a.onError(ExceptionsUtils.terminate(this.f85479g));
            } else {
                ac0.c.I(th2);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
            q();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85475c) {
                ExceptionsUtils.addThrowable(this.f85479g, th2);
                onCompleted();
                return;
            }
            this.f85478f.unsubscribe();
            if (androidx.camera.view.q.a(this.f85479g, null, th2)) {
                this.f85473a.onError(ExceptionsUtils.terminate(this.f85479g));
            } else {
                ac0.c.I(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                rx.b call = this.f85474b.call(t11);
                if (call == null) {
                    throw new NullPointerException("The mapper returned a null Completable");
                }
                C1086a c1086a = new C1086a();
                this.f85478f.a(c1086a);
                this.f85477e.getAndIncrement();
                call.G0(c1086a);
            } catch (Throwable th2) {
                vb0.a.e(th2);
                unsubscribe();
                onError(th2);
            }
        }

        public boolean q() {
            if (this.f85477e.decrementAndGet() != 0) {
                return false;
            }
            Throwable terminate = ExceptionsUtils.terminate(this.f85479g);
            if (terminate != null) {
                this.f85473a.onError(terminate);
                return true;
            }
            this.f85473a.onCompleted();
            return true;
        }
    }

    public i0(rx.c<T> cVar, wb0.p<? super T, ? extends rx.b> pVar, boolean z11, int i11) {
        if (pVar == null) {
            throw new NullPointerException("mapper is null");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i11);
        }
        this.f85469a = cVar;
        this.f85470b = pVar;
        this.f85471c = z11;
        this.f85472d = i11;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        a aVar = new a(gVar, this.f85470b, this.f85471c, this.f85472d);
        gVar.add(aVar);
        gVar.add(aVar.f85478f);
        this.f85469a.J6(aVar);
    }
}
