package rx.internal.operators;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class z4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f86495a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.b f86496b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.f<T> implements qb0.b {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.f<? super T> f86497b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f86498c = new AtomicBoolean();

        public a(qb0.f<? super T> fVar) {
            this.f86497b = fVar;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            b(hVar);
        }

        @Override // qb0.f
        public void h(T t11) {
            if (this.f86498c.compareAndSet(false, true)) {
                unsubscribe();
                this.f86497b.h(t11);
            }
        }

        @Override // qb0.b
        public void onCompleted() {
            onError(new CancellationException("Single::takeUntil(Completable) - Stream was canceled before emitting a terminal event."));
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            if (!this.f86498c.compareAndSet(false, true)) {
                ac0.c.I(th2);
            } else {
                unsubscribe();
                this.f86497b.onError(th2);
            }
        }
    }

    public z4(e.t<T> tVar, rx.b bVar) {
        this.f86495a = tVar;
        this.f86496b = bVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        a aVar = new a(fVar);
        fVar.b(aVar);
        this.f86496b.q0(aVar);
        this.f86495a.call(aVar);
    }
}
