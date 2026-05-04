package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class y0<T, R> implements c.a<R> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f86398a;

    /* renamed from: b, reason: collision with root package name */
    public final R f86399b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.q<R, ? super T, R> f86400c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, R> extends t<T, R> {

        /* renamed from: i, reason: collision with root package name */
        public final wb0.q<R, ? super T, R> f86401i;

        public a(qb0.g<? super R> gVar, R r11, wb0.q<R, ? super T, R> qVar) {
            super(gVar);
            this.f86070c = r11;
            this.f86069b = true;
            this.f86401i = qVar;
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                this.f86070c = this.f86401i.call(this.f86070c, t11);
            } catch (Throwable th2) {
                vb0.a.e(th2);
                unsubscribe();
                this.f86068a.onError(th2);
            }
        }
    }

    public y0(rx.c<T> cVar, R r11, wb0.q<R, ? super T, R> qVar) {
        this.f86398a = cVar;
        this.f86399b = r11;
        this.f86400c = qVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super R> gVar) {
        new a(gVar, this.f86399b, this.f86400c).H(this.f86398a);
    }
}
