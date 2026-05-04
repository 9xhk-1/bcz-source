package androidx.compose.animation.core;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 2)
@u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2137:1\n85#2:2138\n113#2,2:2139\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n*L\n122#1:2138\n122#1:2139,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class TransitionState<S> {
    public static final int $stable = 0;

    @k
    private final MutableState isRunning$delegate;

    public /* synthetic */ TransitionState(v vVar) {
        this();
    }

    public abstract S getCurrentState();

    public abstract S getTargetState();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public abstract void setCurrentState$animation_core_release(S s11);

    public final void setRunning$animation_core_release(boolean z11) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z11));
    }

    public abstract void setTargetState$animation_core_release(S s11);

    public abstract void transitionConfigured$animation_core_release(@k Transition<S> transition);

    public abstract void transitionRemoved$animation_core_release();

    private TransitionState() {
        this.isRunning$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }
}
