package rx.internal.operators;

import rx.c;
import rx.exceptions.OnErrorThrowable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class r0<T, R> implements c.a<R> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f85969a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends R> f85970b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, R> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super R> f85971a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, ? extends R> f85972b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f85973c;

        public a(qb0.g<? super R> gVar, wb0.p<? super T, ? extends R> pVar) {
            this.f85971a = gVar;
            this.f85972b = pVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85973c) {
                return;
            }
            this.f85971a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85973c) {
                ac0.c.I(th2);
            } else {
                this.f85973c = true;
                this.f85971a.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                this.f85971a.onNext(this.f85972b.call(t11));
            } catch (Throwable th2) {
                vb0.a.e(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, t11));
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85971a.setProducer(dVar);
        }
    }

    public r0(rx.c<T> cVar, wb0.p<? super T, ? extends R> pVar) {
        this.f85969a = cVar;
        this.f85970b = pVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super R> gVar) {
        a aVar = new a(gVar, this.f85970b);
        gVar.add(aVar);
        this.f85969a.J6(aVar);
    }
}
