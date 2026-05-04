package rx.internal.operators;

import java.util.concurrent.atomic.AtomicReference;
import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class y2<T, U> implements c.b<T, T> {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f86409b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<U> f86410a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<U> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f86411a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zb0.g f86412b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f86413c;

        public a(AtomicReference atomicReference, zb0.g gVar, AtomicReference atomicReference2) {
            this.f86411a = atomicReference;
            this.f86412b = gVar;
            this.f86413c = atomicReference2;
        }

        @Override // qb0.c
        public void onCompleted() {
            onNext(null);
            this.f86412b.onCompleted();
            ((qb0.h) this.f86413c.get()).unsubscribe();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86412b.onError(th2);
            ((qb0.h) this.f86413c.get()).unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qb0.c
        public void onNext(U u11) {
            AtomicReference atomicReference = this.f86411a;
            Object obj = y2.f86409b;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                this.f86412b.onNext(andSet);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f86415a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zb0.g f86416b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86417c;

        public b(AtomicReference atomicReference, zb0.g gVar, qb0.g gVar2) {
            this.f86415a = atomicReference;
            this.f86416b = gVar;
            this.f86417c = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86417c.onNext(null);
            this.f86416b.onCompleted();
            this.f86417c.unsubscribe();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86416b.onError(th2);
            this.f86417c.unsubscribe();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f86415a.set(t11);
        }
    }

    public y2(rx.c<U> cVar) {
        this.f86410a = cVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        zb0.g gVar2 = new zb0.g(gVar);
        AtomicReference atomicReference = new AtomicReference(f86409b);
        AtomicReference atomicReference2 = new AtomicReference();
        a aVar = new a(atomicReference, gVar2, atomicReference2);
        b bVar = new b(atomicReference, gVar2, aVar);
        atomicReference2.lazySet(bVar);
        gVar.add(bVar);
        gVar.add(aVar);
        this.f86410a.J6(aVar);
        return bVar;
    }
}
