package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d1<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<T> f85252a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> extends t<T, T> {

        /* renamed from: i, reason: collision with root package name */
        public static final Object f85253i = new Object();

        /* JADX WARN: Type inference failed for: r1v1, types: [R, java.lang.Object] */
        public a(qb0.g<? super T> gVar) {
            super(gVar);
            this.f86070c = f85253i;
        }

        @Override // rx.internal.operators.t, qb0.c
        public void onCompleted() {
            Object obj = this.f86070c;
            if (obj == f85253i) {
                q();
            } else {
                C(obj);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qb0.c
        public void onNext(T t11) {
            this.f86070c = t11;
        }
    }

    public d1(rx.c<T> cVar) {
        this.f85252a = cVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        new a(gVar).H(this.f85252a);
    }
}
