package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d2<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.b<? super Long> f85254a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f85255a;

        public a(b bVar) {
            this.f85255a = bVar;
        }

        @Override // qb0.d
        public void request(long j11) {
            d2.this.f85254a.call(Long.valueOf(j11));
            this.f85255a.C(j11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final qb0.g<? super T> f85257a;

        public b(qb0.g<? super T> gVar) {
            this.f85257a = gVar;
            request(0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(long j11) {
            request(j11);
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85257a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85257a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85257a.onNext(t11);
        }
    }

    public d2(wb0.b<? super Long> bVar) {
        this.f85254a = bVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        b bVar = new b(gVar);
        gVar.setProducer(new a(bVar));
        gVar.add(bVar);
        return bVar;
    }
}
