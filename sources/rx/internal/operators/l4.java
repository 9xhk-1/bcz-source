package rx.internal.operators;

import rx.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class l4<T> implements e.t<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f85717a;

    /* renamed from: b, reason: collision with root package name */
    public final wb0.a f85718b;

    public l4(e.t<T> tVar, wb0.a aVar) {
        this.f85717a = tVar;
        this.f85718b = aVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.f<? super T> fVar) {
        fVar.b(ec0.f.a(this.f85718b));
        this.f85717a.call(fVar);
    }
}
