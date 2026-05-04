package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k2<T> implements c.b<T, T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final k2<?> f85657a = new k2<>();
    }

    public static <T> k2<T> b() {
        return (k2<T>) b.f85657a;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        a aVar = new a(gVar);
        gVar.add(aVar);
        return aVar;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85655a;

        public a(qb0.g gVar) {
            this.f85655a = gVar;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85655a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85655a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
        }
    }
}
