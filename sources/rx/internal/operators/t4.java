package rx.internal.operators;

import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class t4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.e<? extends T> f86112a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.c<?> f86113b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.f f86114b;

        public a(qb0.f fVar) {
            this.f86114b = fVar;
        }

        @Override // qb0.f
        public void h(T t11) {
            this.f86114b.h(t11);
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            this.f86114b.onError(th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Object> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f86116a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.f f86117b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ec0.e f86118c;

        public b(qb0.f fVar, ec0.e eVar) {
            this.f86117b = fVar;
            this.f86118c = eVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86116a) {
                return;
            }
            this.f86116a = true;
            this.f86118c.b(this.f86117b);
            t4.this.f86112a.j0(this.f86117b);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f86116a) {
                ac0.c.I(th2);
            } else {
                this.f86116a = true;
                this.f86117b.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(Object obj) {
            onCompleted();
        }
    }

    public t4(rx.e<? extends T> eVar, rx.c<?> cVar) {
        this.f86112a = eVar;
        this.f86113b = cVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        a aVar = new a(fVar);
        ec0.e eVar = new ec0.e();
        fVar.b(eVar);
        b bVar = new b(aVar, eVar);
        eVar.b(bVar);
        this.f86113b.r5(bVar);
    }
}
