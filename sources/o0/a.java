package o0;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import c40.l2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a implements k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Lifecycle f75424a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final l2 f75425b;

    public a(@m80.k Lifecycle lifecycle, @m80.k l2 l2Var) {
        this.f75424a = lifecycle;
        this.f75425b = l2Var;
    }

    @Override // o0.k
    public void complete() {
        this.f75424a.removeObserver(this);
    }

    @Override // o0.k
    public void dispose() {
        l2.a.b(this.f75425b, null, 1, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@m80.k LifecycleOwner lifecycleOwner) {
        dispose();
    }

    @Override // o0.k
    public void start() {
        this.f75424a.addObserver(this);
    }
}
