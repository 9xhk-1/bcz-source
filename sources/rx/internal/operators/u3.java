package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class u3<T> implements c.b<bc0.f<T>, T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.d f86141a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86142a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f86142a = gVar2;
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86142a.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86142a.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            this.f86142a.onNext(new bc0.f(u3.this.f86141a.b(), t11));
        }
    }

    public u3(rx.d dVar) {
        this.f86141a = dVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super bc0.f<T>> gVar) {
        return new a(gVar, gVar);
    }
}
