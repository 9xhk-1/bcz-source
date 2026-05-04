package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class p3<T, E> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.c<? extends E> f85909a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85910a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, boolean z11, qb0.g gVar2) {
            super(gVar, z11);
            this.f85910a = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            try {
                this.f85910a.onCompleted();
            } finally {
                this.f85910a.unsubscribe();
            }
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            try {
                this.f85910a.onError(th2);
            } finally {
                this.f85910a.unsubscribe();
            }
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85910a.onNext(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<E> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85912a;

        public b(qb0.g gVar) {
            this.f85912a = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85912a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85912a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(E e11) {
            onCompleted();
        }

        @Override // qb0.g
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public p3(rx.c<? extends E> cVar) {
        this.f85909a = cVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        zb0.g gVar2 = new zb0.g(gVar, false);
        a aVar = new a(gVar2, false, gVar2);
        b bVar = new b(aVar);
        gVar2.add(aVar);
        gVar2.add(bVar);
        gVar.add(gVar2);
        this.f85909a.J6(bVar);
        return aVar;
    }
}
