package dc0;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class e<T, R> extends f<T, R> {

    /* renamed from: b, reason: collision with root package name */
    public final zb0.f<T> f47780b;

    /* renamed from: c, reason: collision with root package name */
    public final f<T, R> f47781c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements c.a<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f47782a;

        public a(f fVar) {
            this.f47782a = fVar;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(qb0.g<? super R> gVar) {
            this.f47782a.J6(gVar);
        }
    }

    public e(f<T, R> fVar) {
        super(new a(fVar));
        this.f47781c = fVar;
        this.f47780b = new zb0.f<>(fVar);
    }

    @Override // qb0.c
    public void onCompleted() {
        this.f47780b.onCompleted();
    }

    @Override // qb0.c
    public void onError(Throwable th2) {
        this.f47780b.onError(th2);
    }

    @Override // qb0.c
    public void onNext(T t11) {
        this.f47780b.onNext(t11);
    }

    @Override // dc0.f
    public boolean w7() {
        return this.f47781c.w7();
    }
}
