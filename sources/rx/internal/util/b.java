package rx.internal.util;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b<T> implements qb0.c<T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.b<? super T> f86688a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.b<? super Throwable> f86689b;

    /* renamed from: c, reason: collision with root package name */
    public final wb0.a f86690c;

    public b(wb0.b<? super T> bVar, wb0.b<? super Throwable> bVar2, wb0.a aVar) {
        this.f86688a = bVar;
        this.f86689b = bVar2;
        this.f86690c = aVar;
    }

    @Override // qb0.c
    public void onCompleted() {
        this.f86690c.call();
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f86689b.call(th2);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f86688a.call(t11);
    }
}
