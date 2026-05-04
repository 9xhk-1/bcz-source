package rx.internal.operators;

import rx.e;
import rx.exceptions.OnErrorThrowable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class u4<T, R> implements e.t<R> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.e<T> f86144a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.p<? super T, ? extends R> f86145b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T, R> extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.f<? super R> f86146b;

        /* renamed from: c, reason: collision with root package name */
        public final wb0.p<? super T, ? extends R> f86147c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f86148d;

        public a(qb0.f<? super R> fVar, wb0.p<? super T, ? extends R> pVar) {
            this.f86146b = fVar;
            this.f86147c = pVar;
        }

        @Override // qb0.f
        public void h(T t11) {
            try {
                this.f86146b.h(this.f86147c.call(t11));
            } catch (Throwable th2) {
                vb0.a.e(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, t11));
            }
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            if (this.f86148d) {
                ac0.c.I(th2);
            } else {
                this.f86148d = true;
                this.f86146b.onError(th2);
            }
        }
    }

    public u4(rx.e<T> eVar, wb0.p<? super T, ? extends R> pVar) {
        this.f86144a = eVar;
        this.f86145b = pVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super R> fVar) {
        a aVar = new a(fVar, this.f86145b);
        fVar.b(aVar);
        this.f86144a.j0(aVar);
    }
}
