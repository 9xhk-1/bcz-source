package rx.internal.operators;

import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class i4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.e<T> f85533a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.a f85534b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.f<? super T> f85535b;

        /* renamed from: c, reason: collision with root package name */
        public final wb0.a f85536c;

        public a(qb0.f<? super T> fVar, wb0.a aVar) {
            this.f85535b = fVar;
            this.f85536c = aVar;
        }

        @Override // qb0.f
        public void h(T t11) {
            try {
                this.f85535b.h(t11);
            } finally {
                j();
            }
        }

        public void j() {
            try {
                this.f85536c.call();
            } catch (Throwable th2) {
                vb0.a.e(th2);
                ac0.c.I(th2);
            }
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            try {
                this.f85535b.onError(th2);
            } finally {
                j();
            }
        }
    }

    public i4(rx.e<T> eVar, wb0.a aVar) {
        this.f85533a = eVar;
        this.f85534b = aVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        a aVar = new a(fVar, this.f85534b);
        fVar.b(aVar);
        this.f85533a.j0(aVar);
    }
}
