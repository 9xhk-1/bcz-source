package rx.internal.operators;

import rx.c;
import rx.e;
import rx.internal.operators.q4;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d5<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final e.t<T> f85276a;

    public d5(e.t<T> tVar) {
        this.f85276a = tVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        q4.a aVar = new q4.a(gVar);
        gVar.add(aVar);
        this.f85276a.call(aVar);
    }
}
