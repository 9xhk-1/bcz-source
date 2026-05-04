package rx.internal.operators;

import rx.d;
import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class r4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f86011a;

    /* renamed from: b, reason: collision with root package name */
    public final rx.d f86012b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.f<T> implements wb0.a {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.f<? super T> f86013b;

        /* renamed from: c, reason: collision with root package name */
        public final d.a f86014c;

        /* renamed from: d, reason: collision with root package name */
        public T f86015d;

        /* renamed from: e, reason: collision with root package name */
        public Throwable f86016e;

        public a(qb0.f<? super T> fVar, d.a aVar) {
            this.f86013b = fVar;
            this.f86014c = aVar;
        }

        @Override // wb0.a
        public void call() {
            try {
                Throwable th2 = this.f86016e;
                if (th2 != null) {
                    this.f86016e = null;
                    this.f86013b.onError(th2);
                } else {
                    T t11 = this.f86015d;
                    this.f86015d = null;
                    this.f86013b.h(t11);
                }
                this.f86014c.unsubscribe();
            } catch (Throwable th3) {
                this.f86014c.unsubscribe();
                throw th3;
            }
        }

        @Override // qb0.f
        public void h(T t11) {
            this.f86015d = t11;
            this.f86014c.h(this);
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            this.f86016e = th2;
            this.f86014c.h(this);
        }
    }

    public r4(e.t<T> tVar, rx.d dVar) {
        this.f86011a = tVar;
        this.f86012b = dVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        d.a a11 = this.f86012b.a();
        a aVar = new a(fVar, a11);
        fVar.b(a11);
        fVar.b(aVar);
        this.f86011a.call(aVar);
    }
}
