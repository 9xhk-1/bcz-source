package rx.internal.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c<T> extends qb0.g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.b<? super T> f86691a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.b<Throwable> f86692b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.a f86693c;

    public c(wb0.b<? super T> bVar, wb0.b<Throwable> bVar2, wb0.a aVar) {
        this.f86691a = bVar;
        this.f86692b = bVar2;
        this.f86693c = aVar;
    }

    @Override // qb0.c
    public void onCompleted() {
        this.f86693c.call();
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f86692b.call(th2);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f86691a.call(t11);
    }
}
