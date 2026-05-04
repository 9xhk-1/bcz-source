package o0;

import c40.l2;
import c40.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x0<g> f75462a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@m80.k x0<? extends g> x0Var) {
        this.f75462a = x0Var;
    }

    @Override // o0.d
    @m80.k
    public x0<g> a() {
        return this.f75462a;
    }

    @Override // o0.d
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        l2.a.b(a(), null, 1, null);
    }

    @Override // o0.d
    public boolean isDisposed() {
        return !a().isActive();
    }
}
