package rx.internal.operators;

import rx.e;
import rx.exceptions.CompositeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class j4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.e<T> f85613a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.b<? super T> f85614b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.b<Throwable> f85615c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.f<? super T> f85616b;

        /* renamed from: c, reason: collision with root package name */
        public final wb0.b<? super T> f85617c;

        /* renamed from: d, reason: collision with root package name */
        public final wb0.b<Throwable> f85618d;

        public a(qb0.f<? super T> fVar, wb0.b<? super T> bVar, wb0.b<Throwable> bVar2) {
            this.f85616b = fVar;
            this.f85617c = bVar;
            this.f85618d = bVar2;
        }

        @Override // qb0.f
        public void h(T t11) {
            try {
                this.f85617c.call(t11);
                this.f85616b.h(t11);
            } catch (Throwable th2) {
                vb0.a.i(th2, this, t11);
            }
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            try {
                this.f85618d.call(th2);
                this.f85616b.onError(th2);
            } catch (Throwable th3) {
                vb0.a.e(th3);
                this.f85616b.onError(new CompositeException(th2, th3));
            }
        }
    }

    public j4(rx.e<T> eVar, wb0.b<? super T> bVar, wb0.b<Throwable> bVar2) {
        this.f85613a = eVar;
        this.f85614b = bVar;
        this.f85615c = bVar2;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        a aVar = new a(fVar, this.f85614b, this.f85615c);
        fVar.b(aVar);
        this.f85613a.j0(aVar);
    }
}
