package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class q0<T, R> implements c.a<R> {

    /* renamed from: a, reason: collision with root package name */
    public final c.a<T> f85927a;

    /* renamed from: b, reason: collision with root package name */
    public final c.b<? extends R, ? super T> f85928b;

    public q0(c.a<T> aVar, c.b<? extends R, ? super T> bVar) {
        this.f85927a = aVar;
        this.f85928b = bVar;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super R> gVar) {
        try {
            qb0.g<? super T> call = ac0.c.M(this.f85928b).call(gVar);
            try {
                call.onStart();
                this.f85927a.call(call);
            } catch (Throwable th2) {
                vb0.a.e(th2);
                call.onError(th2);
            }
        } catch (Throwable th3) {
            vb0.a.e(th3);
            gVar.onError(th3);
        }
    }
}
