package rx.internal.operators;

import rx.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class e1<T> implements c.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f85289a;

    public e1(Throwable th2) {
        this.f85289a = th2;
    }

    @Override // wb0.b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(qb0.g<? super T> gVar) {
        gVar.onError(this.f85289a);
    }
}
