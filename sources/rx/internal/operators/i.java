package rx.internal.operators;

import rx.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i<T> implements b.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final rx.e<T> f85465a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends rx.b> f85466b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.f<T> implements qb0.b {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.b f85467b;

        /* renamed from: c, reason: collision with root package name */
        public final wb0.p<? super T, ? extends rx.b> f85468c;

        public a(qb0.b bVar, wb0.p<? super T, ? extends rx.b> pVar) {
            this.f85467b = bVar;
            this.f85468c = pVar;
        }

        @Override // qb0.b
        public void a(qb0.h hVar) {
            b(hVar);
        }

        @Override // qb0.f
        public void h(T t11) {
            try {
                rx.b call = this.f85468c.call(t11);
                if (call == null) {
                    onError(new NullPointerException("The mapper returned a null Completable"));
                } else {
                    call.q0(this);
                }
            } catch (Throwable th2) {
                vb0.a.e(th2);
                onError(th2);
            }
        }

        @Override // qb0.b
        public void onCompleted() {
            this.f85467b.onCompleted();
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            this.f85467b.onError(th2);
        }
    }

    public i(rx.e<T> eVar, wb0.p<? super T, ? extends rx.b> pVar) {
        this.f85465a = eVar;
        this.f85466b = pVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.b bVar) {
        a aVar = new a(bVar, this.f85466b);
        bVar.a(aVar);
        this.f85465a.j0(aVar);
    }
}
