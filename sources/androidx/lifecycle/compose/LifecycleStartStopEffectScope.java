package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LifecycleStartStopEffectScope implements LifecycleOwner {
    public static final int $stable = 8;

    @k
    private final Lifecycle lifecycle;

    public LifecycleStartStopEffectScope(@k Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @k
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @k
    public final LifecycleStopOrDisposeEffectResult onStopOrDispose(@k final l<? super LifecycleOwner, g2> lVar) {
        return new LifecycleStopOrDisposeEffectResult() { // from class: androidx.lifecycle.compose.LifecycleStartStopEffectScope$onStopOrDispose$1
            @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
            public void runStopOrDisposeEffect() {
                lVar.invoke(this);
            }
        };
    }
}
