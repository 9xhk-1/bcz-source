package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d0<T, U> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends T> f85246a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<U> f85247b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<U> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f85248a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85249b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ec0.e f85250c;

        public a(qb0.g gVar, ec0.e eVar) {
            this.f85249b = gVar;
            this.f85250c = eVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85248a) {
                return;
            }
            this.f85248a = true;
            this.f85250c.b(ec0.f.e());
            d0.this.f85246a.J6(this.f85249b);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85248a) {
                ac0.c.I(th2);
            } else {
                this.f85248a = true;
                this.f85249b.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(U u11) {
            onCompleted();
        }
    }

    public d0(rx.c<? extends T> cVar, rx.c<U> cVar2) {
        this.f85246a = cVar;
        this.f85247b = cVar2;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        ec0.e eVar = new ec0.e();
        gVar.add(eVar);
        a aVar = new a(zb0.h.f(gVar), eVar);
        eVar.b(aVar);
        this.f85247b.J6(aVar);
    }
}
