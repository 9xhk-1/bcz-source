package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.lifecycle.Lifecycle;
import c40.l2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@MainThread
@u0({"SMAP\nLifecycleController.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleController.jvm.kt\nandroidx/lifecycle/LifecycleController\n*L\n1#1,71:1\n57#1,3:72\n57#1,3:75\n*S KotlinDebug\n*F\n+ 1 LifecycleController.jvm.kt\nandroidx/lifecycle/LifecycleController\n*L\n49#1:72,3\n36#1:75,3\n*E\n"})
/* loaded from: classes2.dex */
public final class LifecycleController {

    @k
    private final DispatchQueue dispatchQueue;

    @k
    private final Lifecycle lifecycle;

    @k
    private final Lifecycle.State minState;

    @k
    private final LifecycleEventObserver observer;

    public LifecycleController(@k Lifecycle lifecycle, @k Lifecycle.State minState, @k DispatchQueue dispatchQueue, @k final l2 parentJob) {
        g0.p(lifecycle, "lifecycle");
        g0.p(minState, "minState");
        g0.p(dispatchQueue, "dispatchQueue");
        g0.p(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.f
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.observer$lambda$0(LifecycleController.this, parentJob, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(lifecycleEventObserver);
        } else {
            l2.a.b(parentJob, null, 1, null);
            finish();
        }
    }

    private final void handleDestroy(l2 l2Var) {
        l2.a.b(l2Var, null, 1, null);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observer$lambda$0(LifecycleController this$0, l2 parentJob, LifecycleOwner source, Lifecycle.Event event) {
        g0.p(this$0, "this$0");
        g0.p(parentJob, "$parentJob");
        g0.p(source, "source");
        g0.p(event, "<anonymous parameter 1>");
        if (source.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            l2.a.b(parentJob, null, 1, null);
            this$0.finish();
        } else if (source.getLifecycle().getCurrentState().compareTo(this$0.minState) < 0) {
            this$0.dispatchQueue.pause();
        } else {
            this$0.dispatchQueue.resume();
        }
    }

    @MainThread
    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }
}
