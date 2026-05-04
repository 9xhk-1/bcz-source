package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c3<T> implements c.b<T, T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f85192a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f85192a = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f85192a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f85192a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f85192a.onNext(t11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final c3<Object> f85194a = new c3<>();
    }

    public static <T> c3<T> b() {
        return (c3<T>) b.f85194a;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        return new zb0.g(new a(gVar, gVar));
    }
}
