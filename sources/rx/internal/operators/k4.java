package rx.internal.operators;

import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class k4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f85678a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.a f85679b;

    public k4(e.t<T> tVar, wb0.a aVar) {
        this.f85678a = tVar;
        this.f85679b = aVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        try {
            this.f85679b.call();
            this.f85678a.call(fVar);
        } catch (Throwable th2) {
            vb0.a.e(th2);
            fVar.onError(th2);
        }
    }
}
