package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class u2<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super Throwable, ? extends rx.c<? extends T>> f86130a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements wb0.p<Throwable, rx.c<? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wb0.p f86131a;

        public a(wb0.p pVar) {
            this.f86131a = pVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<? extends T> call(Throwable th2) {
            return rx.c.M2(this.f86131a.call(th2));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements wb0.p<Throwable, rx.c<? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.c f86132a;

        public b(rx.c cVar) {
            this.f86132a = cVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<? extends T> call(Throwable th2) {
            return this.f86132a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements wb0.p<Throwable, rx.c<? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ rx.c f86133a;

        public c(rx.c cVar) {
            this.f86133a = cVar;
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.c<? extends T> call(Throwable th2) {
            return th2 instanceof Exception ? this.f86133a : rx.c.T1(th2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public boolean f86134a;

        /* renamed from: b, reason: collision with root package name */
        public long f86135b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86136c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ rx.internal.producers.a f86137d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ec0.e f86138e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends qb0.g<T> {
            public a() {
            }

            @Override // qb0.c
            public void onCompleted() {
                d.this.f86136c.onCompleted();
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                d.this.f86136c.onError(th2);
            }

            @Override // qb0.c
            public void onNext(T t11) {
                d.this.f86136c.onNext(t11);
            }

            @Override // qb0.g
            public void setProducer(qb0.d dVar) {
                d.this.f86137d.c(dVar);
            }
        }

        public d(qb0.g gVar, rx.internal.producers.a aVar, ec0.e eVar) {
            this.f86136c = gVar;
            this.f86137d = aVar;
            this.f86138e = eVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            if (this.f86134a) {
                return;
            }
            this.f86134a = true;
            this.f86136c.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            if (this.f86134a) {
                vb0.a.e(th2);
                ac0.c.I(th2);
                return;
            }
            this.f86134a = true;
            try {
                unsubscribe();
                a aVar = new a();
                this.f86138e.b(aVar);
                long j11 = this.f86135b;
                if (j11 != 0) {
                    this.f86137d.b(j11);
                }
                u2.this.f86130a.call(th2).J6(aVar);
            } catch (Throwable th3) {
                vb0.a.f(th3, this.f86136c);
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            if (this.f86134a) {
                return;
            }
            this.f86135b++;
            this.f86136c.onNext(t11);
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f86137d.c(dVar);
        }
    }

    public u2(wb0.p<? super Throwable, ? extends rx.c<? extends T>> pVar) {
        this.f86130a = pVar;
    }

    public static <T> u2<T> b(rx.c<? extends T> cVar) {
        return new u2<>(new c(cVar));
    }

    public static <T> u2<T> h(rx.c<? extends T> cVar) {
        return new u2<>(new b(cVar));
    }

    public static <T> u2<T> j(wb0.p<? super Throwable, ? extends T> pVar) {
        return new u2<>(new a(pVar));
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        rx.internal.producers.a aVar = new rx.internal.producers.a();
        ec0.e eVar = new ec0.e();
        d dVar = new d(gVar, aVar, eVar);
        eVar.b(dVar);
        gVar.add(eVar);
        gVar.setProducer(aVar);
        return dVar;
    }
}
