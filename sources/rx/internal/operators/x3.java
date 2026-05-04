package rx.internal.operators;

import rx.c;
import rx.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class x3<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.d f86364a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86365a;

        public a(qb0.g gVar) {
            this.f86365a = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86365a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86365a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f86365a.onNext(t11);
        }

        @Override // qb0.g
        public void setProducer(qb0.d dVar) {
            this.f86365a.setProducer(dVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements wb0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86367a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements wb0.a {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d.a f86369a;

            public a(d.a aVar) {
                this.f86369a = aVar;
            }

            @Override // wb0.a
            public void call() {
                b.this.f86367a.unsubscribe();
                this.f86369a.unsubscribe();
            }
        }

        public b(qb0.g gVar) {
            this.f86367a = gVar;
        }

        @Override // wb0.a
        public void call() {
            d.a a11 = x3.this.f86364a.a();
            a11.h(new a(a11));
        }
    }

    public x3(rx.d dVar) {
        this.f86364a = dVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        a aVar = new a(gVar);
        gVar.add(ec0.f.a(new b(aVar)));
        return aVar;
    }
}
