package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f2<T> implements c.b<T, T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.a f85333a;

    public f2(wb0.a aVar) {
        this.f85333a = aVar;
    }

    @Override // wb0.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public qb0.g<? super T> call(qb0.g<? super T> gVar) {
        gVar.add(ec0.f.a(this.f85333a));
        return zb0.h.f(gVar);
    }
}
