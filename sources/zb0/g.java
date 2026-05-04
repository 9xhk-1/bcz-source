package zb0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g<T> extends qb0.g<T> {

    /* renamed from: a, reason: collision with root package name */
    public final qb0.c<T> f102521a;

    public g(qb0.g<? super T> gVar) {
        this(gVar, true);
    }

    @Override // qb0.c
    public void onCompleted() {
        this.f102521a.onCompleted();
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f102521a.onError(th2);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f102521a.onNext(t11);
    }

    public g(qb0.g<? super T> gVar, boolean z11) {
        super(gVar, z11);
        this.f102521a = new f(gVar);
    }
}
