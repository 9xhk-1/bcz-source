package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class e0<T, U> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends T> f85285a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.o<? extends rx.c<U>> f85286b;

    public e0(rx.c<? extends T> cVar, wb0.o<? extends rx.c<U>> oVar) {
        this.f85285a = cVar;
        this.f85286b = oVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        try {
            this.f85286b.call().D5(1).J6(new a(gVar));
        } catch (Throwable th2) {
            vb0.a.f(th2, gVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<U> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85287a;

        public a(qb0.g gVar) {
            this.f85287a = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            e0.this.f85285a.J6(zb0.h.f(this.f85287a));
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85287a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(U u11) {
        }
    }
}
