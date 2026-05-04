package rx.internal.operators;

import rx.c;
import rx.exceptions.OnErrorThrowable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class h0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f85431a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, Boolean> f85432b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85433a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, Boolean> f85434b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f85435c;

        public a(qb0.g<? super T> gVar, wb0.p<? super T, Boolean> pVar) {
            this.f85433a = gVar;
            this.f85434b = pVar;
            request(0L);
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85435c) {
                return;
            }
            this.f85433a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85435c) {
                ac0.c.I(th2);
            } else {
                this.f85435c = true;
                this.f85433a.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                if (this.f85434b.call(t11).booleanValue()) {
                    this.f85433a.onNext(t11);
                } else {
                    request(1L);
                }
            } catch (Throwable th2) {
                vb0.a.e(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, t11));
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            super.setProducer(dVar);
            this.f85433a.setProducer(dVar);
        }
    }

    public h0(rx.c<T> cVar, wb0.p<? super T, Boolean> pVar) {
        this.f85431a = cVar;
        this.f85432b = pVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        a aVar = new a(gVar, this.f85432b);
        gVar.add(aVar);
        this.f85431a.J6(aVar);
    }
}
