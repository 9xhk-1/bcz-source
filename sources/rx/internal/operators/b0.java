package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b0<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final wb0.o<? extends rx.c<? extends T>> f85130a;

    public b0(wb0.o<? extends rx.c<? extends T>> oVar) {
        this.f85130a = oVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        try {
            this.f85130a.call().J6(zb0.h.f(gVar));
        } catch (Throwable th2) {
            vb0.a.f(th2, gVar);
        }
    }
}
