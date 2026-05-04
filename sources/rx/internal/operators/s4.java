package rx.internal.operators;

import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class s4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f86060a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<Throwable, ? extends T> f86061b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.f<? super T> f86062b;

        /* renamed from: c, reason: collision with root package name */
        public final wb0.p<Throwable, ? extends T> f86063c;

        public a(qb0.f<? super T> fVar, wb0.p<Throwable, ? extends T> pVar) {
            this.f86062b = fVar;
            this.f86063c = pVar;
        }

        @Override // qb0.f
        public void h(T t11) {
            this.f86062b.h(t11);
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            try {
                this.f86062b.h(this.f86063c.call(th2));
            } catch (Throwable th3) {
                vb0.a.e(th3);
                this.f86062b.onError(th3);
            }
        }
    }

    public s4(e.t<T> tVar, wb0.p<Throwable, ? extends T> pVar) {
        this.f86060a = tVar;
        this.f86061b = pVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        a aVar = new a(fVar, this.f86061b);
        fVar.b(aVar);
        this.f86060a.call(aVar);
    }
}
