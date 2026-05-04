package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class x<T, R> implements c.a<R> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f86327a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.o<R> f86328b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.c<R, ? super T> f86329c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, R> extends u<T, R> {

        /* renamed from: j, reason: collision with root package name */
        public final wb0.c<R, ? super T> f86330j;

        public a(qb0.g<? super R> gVar, R r11, wb0.c<R, ? super T> cVar) {
            super(gVar);
            this.f86070c = r11;
            this.f86069b = true;
            this.f86330j = cVar;
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86120i) {
                return;
            }
            try {
                this.f86330j.call(this.f86070c, t11);
            } catch (Throwable th2) {
                vb0.a.e(th2);
                unsubscribe();
                onError(th2);
            }
        }
    }

    public x(rx.c<T> cVar, wb0.o<R> oVar, wb0.c<R, ? super T> cVar2) {
        this.f86327a = cVar;
        this.f86328b = oVar;
        this.f86329c = cVar2;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super R> gVar) {
        try {
            new a(gVar, this.f86328b.call(), this.f86329c).H(this.f86327a);
        } catch (Throwable th2) {
            vb0.a.e(th2);
            gVar.onError(th2);
        }
    }
}
