package rx.internal.operators;

import rx.c;
import rx.e;
import rx.internal.operators.p4;
import rx.internal.producers.SingleProducer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class q4<T, R> implements e.t<R> {

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f85960a;

    /* renamed from: b, reason: collision with root package name */
    public final c.b<? extends R, ? super T> f85961b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends qb0.f<T> {

        /* renamed from: b, reason: collision with root package name */
        public final qb0.g<? super T> f85962b;

        public a(qb0.g<? super T> gVar) {
            this.f85962b = gVar;
        }

        @Override // qb0.f
        public void h(T t11) {
            this.f85962b.setProducer(new SingleProducer(this.f85962b, t11));
        }

        @Override // qb0.f
        public void onError(Throwable th2) {
            this.f85962b.onError(th2);
        }
    }

    public q4(e.t<T> tVar, c.b<? extends R, ? super T> bVar) {
        this.f85960a = tVar;
        this.f85961b = bVar;
    }

    public static <T> qb0.f<T> b(qb0.g<T> gVar) {
        a aVar = new a(gVar);
        gVar.add(aVar);
        return aVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super R> fVar) {
        p4.a aVar = new p4.a(fVar);
        fVar.b(aVar);
        try {
            qb0.g<? super T> call = ac0.c.R(this.f85961b).call(aVar);
            qb0.f b11 = b(call);
            call.onStart();
            this.f85960a.call(b11);
        } catch (Throwable th2) {
            vb0.a.h(th2, fVar);
        }
    }
}
