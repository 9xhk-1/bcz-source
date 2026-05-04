package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import c40.h1;
import c40.p2;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {

    @k
    private final kotlin.coroutines.d coroutineContext;

    @k
    private final Lifecycle lifecycle;

    public LifecycleCoroutineScopeImpl(@k Lifecycle lifecycle, @k kotlin.coroutines.d coroutineContext) {
        g0.p(lifecycle, "lifecycle");
        g0.p(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() == Lifecycle.State.DESTROYED) {
            p2.j(getCoroutineContext(), null, 1, null);
        }
    }

    @Override // c40.r0
    @k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    @k
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(@k LifecycleOwner source, @k Lifecycle.Event event) {
        g0.p(source, "source");
        g0.p(event, "event");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            p2.j(getCoroutineContext(), null, 1, null);
        }
    }

    public final void register() {
        c40.k.f(this, h1.e().q(), null, new LifecycleCoroutineScopeImpl$register$1(this, null), 2, null);
    }
}
