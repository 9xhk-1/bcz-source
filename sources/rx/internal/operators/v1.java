package rx.internal.operators;

import rx.c;
import rx.internal.operators.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class v1<T, U> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.p<? super T, ? extends rx.c<U>> f86157a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final w1.b<T> f86158a;

        /* renamed from: b, reason: collision with root package name */
        public final qb0.g<?> f86159b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ zb0.g f86160c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ec0.e f86161d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: rx.internal.operators.v1$a$a, reason: collision with other inner class name */
        public class C1102a extends qb0.g<U> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int f86163a;

            public C1102a(int i11) {
                this.f86163a = i11;
            }

            @Override // qb0.c
            public void onCompleted() {
                a aVar = a.this;
                aVar.f86158a.b(this.f86163a, aVar.f86160c, aVar.f86159b);
                unsubscribe();
            }

            @Override // qb0.c
            public void onError(Throwable th2) {
                a.this.f86159b.onError(th2);
            }

            @Override // qb0.c
            public void onNext(U u11) {
                onCompleted();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, zb0.g gVar2, ec0.e eVar) {
            super(gVar);
            this.f86160c = gVar2;
            this.f86161d = eVar;
            this.f86158a = new w1.b<>();
            this.f86159b = this;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86158a.c(this.f86160c, this);
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86160c.onError(th2);
            unsubscribe();
            this.f86158a.a();
        }

        @Override // qb0.c
        public void onNext(T t11) {
            try {
                rx.c<U> call = v1.this.f86157a.call(t11);
                C1102a c1102a = new C1102a(this.f86158a.d(t11));
                this.f86161d.b(c1102a);
                call.J6(c1102a);
            } catch (Throwable th2) {
                vb0.a.f(th2, this);
            }
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public v1(wb0.p<? super T, ? extends rx.c<U>> pVar) {
        this.f86157a = pVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        zb0.g gVar2 = new zb0.g(gVar);
        ec0.e eVar = new ec0.e();
        gVar.add(eVar);
        return new a(gVar, gVar2, eVar);
    }
}
