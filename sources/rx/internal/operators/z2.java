package rx.internal.operators;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class z2<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final long f86477a;

    /* renamed from: b, reason: collision with root package name */
    public final TimeUnit f86478b;

    /* renamed from: c, reason: collision with root package name */
    public final rx.d f86479c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> implements wb0.a {

        /* renamed from: c, reason: collision with root package name */
        public static final Object f86480c = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f86481a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReference<Object> f86482b = new AtomicReference<>(f86480c);

        public a(qb0.g<? super T> gVar) {
            this.f86481a = gVar;
        }

        @Override // wb0.a
        public void call() {
            q();
        }

        @Override // qb0.c
        public void onCompleted() {
            q();
            this.f86481a.onCompleted();
            unsubscribe();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86481a.onError(th2);
            unsubscribe();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f86482b.set(t11);
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        public final void q() {
            AtomicReference<Object> atomicReference = this.f86482b;
            Object obj = f86480c;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                try {
                    this.f86481a.onNext(andSet);
                } catch (Throwable th2) {
                    vb0.a.f(th2, this);
                }
            }
        }
    }

    public z2(long j11, TimeUnit timeUnit, rx.d dVar) {
        this.f86477a = j11;
        this.f86478b = timeUnit;
        this.f86479c = dVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        zb0.g gVar2 = new zb0.g(gVar);
        d.a a11 = this.f86479c.a();
        gVar.add(a11);
        a aVar = new a(gVar2);
        gVar.add(aVar);
        long j11 = this.f86477a;
        a11.n(aVar, j11, j11, this.f86478b);
        return aVar;
    }
}
