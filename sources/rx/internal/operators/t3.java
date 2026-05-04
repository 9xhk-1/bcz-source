package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class t3<T> implements c.b<bc0.e<T>, T> {

    /* renamed from: a, reason: collision with root package name */
    public final rx.d f86108a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<T> {

        /* renamed from: a, reason: collision with root package name */
        public long f86109a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ qb0.g f86110b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qb0.g gVar, qb0.g gVar2) {
            super(gVar);
            this.f86110b = gVar2;
            this.f86109a = t3.this.f86108a.b();
        }

        @Override // qb0.c
        public void onCompleted() {
            this.f86110b.onCompleted();
        }

        @Override // qb0.c
        public void onError(Throwable th2) {
            this.f86110b.onError(th2);
        }

        @Override // qb0.c
        public void onNext(T t11) {
            long b11 = t3.this.f86108a.b();
            this.f86110b.onNext(new bc0.e(b11 - this.f86109a, t11));
            this.f86109a = b11;
        }
    }

    public t3(rx.d dVar) {
        this.f86108a = dVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super bc0.e<T>> gVar) {
        return new a(gVar, gVar);
    }
}
