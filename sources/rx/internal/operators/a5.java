package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a5<T, U> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f85120a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<? extends U> f85121b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, U> extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.f<? super T> f85122b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f85123c = new AtomicBoolean();

        /* renamed from: d, reason: collision with root package name */
        public final qb0.g<U> f85124d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.a5$a$a, reason: collision with other inner class name */
        public final class C1078a extends qb0.g<U> {
            public C1078a() {
            }

            @Override // qb0.c
            public void onCompleted() {
                onError(new CancellationException("Single::takeUntil(Observable) - Stream was canceled before emitting a terminal event."));
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                a.this.onError(th2);
            }

            @Override // qb0.c
            public void onNext(U u11) {
                onCompleted();
            }
        }

        public a(qb0.f<? super T> fVar) {
            this.f85122b = fVar;
            C1078a c1078a = new C1078a();
            this.f85124d = c1078a;
            b(c1078a);
        }

        @Override // qb0.f
        public void h(T t11) {
            if (this.f85123c.compareAndSet(false, true)) {
                unsubscribe();
                this.f85122b.h(t11);
            }
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            if (!this.f85123c.compareAndSet(false, true)) {
                ac0.c.I(th2);
            } else {
                unsubscribe();
                this.f85122b.onError(th2);
            }
        }
    }

    public a5(e.t<T> tVar, rx.c<? extends U> cVar) {
        this.f85120a = tVar;
        this.f85121b = cVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        a aVar = new a(fVar);
        fVar.b(aVar);
        this.f85121b.r5(aVar.f85124d);
        this.f85120a.call(aVar);
    }
}
