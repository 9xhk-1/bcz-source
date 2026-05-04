package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
@u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2137:1\n85#2:2138\n113#2,2:2139\n85#2:2141\n113#2,2:2142\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n167#1:2138\n167#1:2139,2\n179#1:2141\n179#1:2142,2\n*E\n"})
/* loaded from: classes.dex */
public final class MutableTransitionState<S> extends TransitionState<S> {
    public static final int $stable = 0;

    @k
    private final MutableState currentState$delegate;

    @k
    private final MutableState targetState$delegate;

    public MutableTransitionState(S s11) {
        super(null);
        this.currentState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s11, null, 2, null);
        this.targetState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s11, null, 2, null);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final boolean isIdle() {
        return g0.g(getCurrentState(), getTargetState()) && !isRunning$animation_core_release();
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void setCurrentState$animation_core_release(S s11) {
        this.currentState$delegate.setValue(s11);
    }

    @Override // androidx.compose.animation.core.TransitionState
    /* renamed from: setTargetState, reason: merged with bridge method [inline-methods] */
    public void setTargetState$animation_core_release(S s11) {
        this.targetState$delegate.setValue(s11);
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionRemoved$animation_core_release() {
    }

    @Override // androidx.compose.animation.core.TransitionState
    public void transitionConfigured$animation_core_release(@k Transition<S> transition) {
    }
}
