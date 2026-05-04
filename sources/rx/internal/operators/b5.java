package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b5<T, U> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f85161a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.e<? extends U> f85162b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, U> extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.f<? super T> f85163b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f85164c = new AtomicBoolean();

        /* renamed from: d, reason: collision with root package name */
        public final qb0.f<U> f85165d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.b5$a$a, reason: collision with other inner class name */
        public final class C1080a extends qb0.f<U> {
            public C1080a() {
            }

            @Override // qb0.f
            public void h(U u11) {
                onError(new CancellationException("Single::takeUntil(Single) - Stream was canceled before emitting a terminal event."));
            }

            @Override // qb0.f
            public void onError(Throwable th2) {
                a.this.onError(th2);
            }
        }

        public a(qb0.f<? super T> fVar) {
            this.f85163b = fVar;
            C1080a c1080a = new C1080a();
            this.f85165d = c1080a;
            b(c1080a);
        }

        @Override // qb0.f
        public void h(T t11) {
            if (this.f85164c.compareAndSet(false, true)) {
                unsubscribe();
                this.f85163b.h(t11);
            }
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            if (!this.f85164c.compareAndSet(false, true)) {
                ac0.c.I(th2);
            } else {
                unsubscribe();
                this.f85163b.onError(th2);
            }
        }
    }

    public b5(e.t<T> tVar, rx.e<? extends U> eVar) {
        this.f85161a = tVar;
        this.f85162b = eVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        a aVar = new a(fVar);
        fVar.b(aVar);
        this.f85162b.j0(aVar.f85165d);
        this.f85161a.call(aVar);
    }
}
