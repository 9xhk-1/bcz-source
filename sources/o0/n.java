package o0;

import android.view.View;
import c40.x0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class n implements d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final View f75488a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public volatile x0<? extends g> f75489b;

    public n(@m80.k View view, @m80.k x0<? extends g> x0Var) {
        this.f75488a = view;
        this.f75489b = x0Var;
    }

    @Override // o0.d
    @m80.k
    public x0<g> a() {
        return this.f75489b;
    }

    public void b(@m80.k x0<? extends g> x0Var) {
        this.f75489b = x0Var;
    }

    @Override // o0.d
    public void dispose() {
        if (isDisposed()) {
            return;
        }
        u0.l.t(this.f75488a).a();
    }

    @Override // o0.d
    public boolean isDisposed() {
        return u0.l.t(this.f75488a).d(this);
    }
}
