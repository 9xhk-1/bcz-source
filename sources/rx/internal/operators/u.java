package rx.internal.operators;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class u<T, R> extends t<T, R> {

    /* renamed from: i, reason: collision with root package name */
    public boolean f86120i;

    public u(qb0.g<? super R> gVar) {
        super(gVar);
    }

    @Override // rx.internal.operators.t, qb0.c
    public void onCompleted() {
        if (this.f86120i) {
            return;
        }
        this.f86120i = true;
        super.onCompleted();
    }

    @Override // rx.internal.operators.t, qb0.c
    public void onError(Throwable th2) {
        if (this.f86120i) {
            ac0.c.I(th2);
        } else {
            this.f86120i = true;
            super.onError(th2);
        }
    }
}
