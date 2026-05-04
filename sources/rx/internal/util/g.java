package rx.internal.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class g<T> extends qb0.g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final qb0.c<? super T> f86708a;

    public g(qb0.c<? super T> cVar) {
        this.f86708a = cVar;
    }

    @Override // qb0.c
    public void onCompleted() {
        this.f86708a.onCompleted();
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f86708a.onError(th2);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f86708a.onNext(t11);
    }
}
