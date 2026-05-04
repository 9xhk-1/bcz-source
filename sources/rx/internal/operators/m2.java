package rx.internal.operators;

import rx.c;
import rx.exceptions.OnErrorThrowable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class m2<T, U, R> implements c.b<rx.c<? extends R>, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, ? extends rx.c<? extends U>> f85730a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.q<? super T, ? super U, ? extends R> f85731b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements wb0.p<T, rx.c<U>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.p f85732a;

        public a(wb0.p pVar) {
            this.f85732a = pVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<U> call(T t11) {
            return rx.c.u2((Iterable) this.f85732a.call(t11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T, U, R> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super rx.c<? extends R>> f85733a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.p<? super T, ? extends rx.c<? extends U>> f85734b;

        /* renamed from: c, reason: collision with root package name */
        public final wb0.q<? super T, ? super U, ? extends R> f85735c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f85736d;

        public b(qb0.g<? super rx.c<? extends R>> gVar, wb0.p<? super T, ? extends rx.c<? extends U>> pVar, wb0.q<? super T, ? super U, ? extends R> qVar) {
            this.f85733a = gVar;
            this.f85734b = pVar;
            this.f85735c = qVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f85736d) {
                return;
            }
            this.f85733a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f85736d) {
                ac0.c.I(th2);
            } else {
                this.f85736d = true;
                this.f85733a.onError(th2);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                this.f85733a.onNext(this.f85734b.call(t11).c3(new c(t11, this.f85735c)));
            } catch (Throwable th2) {
                vb0.a.e(th2);
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(th2, t11));
            }
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f85733a.setProducer(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c<T, U, R> implements wb0.p<U, R> {

        /* renamed from: a, reason: collision with root package name */
        public final T f85737a;

        /* renamed from: b, reason: collision with root package name */
        public final wb0.q<? super T, ? super U, ? extends R> f85738b;

        public c(T t11, wb0.q<? super T, ? super U, ? extends R> qVar) {
            this.f85737a = t11;
            this.f85738b = qVar;
        }

        @Override // wb0.p
        public R call(U u11) {
            return this.f85738b.call(this.f85737a, u11);
        }
    }

    public m2(wb0.p<? super T, ? extends rx.c<? extends U>> pVar, wb0.q<? super T, ? super U, ? extends R> qVar) {
        this.f85730a = pVar;
        this.f85731b = qVar;
    }

    public static <T, U> wb0.p<T, rx.c<U>> b(wb0.p<? super T, ? extends Iterable<? extends U>> pVar) {
        return new a(pVar);
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super rx.c<? extends R>> gVar) {
        b bVar = new b(gVar, this.f85730a, this.f85731b);
        gVar.add(bVar);
        return bVar;
    }
}
