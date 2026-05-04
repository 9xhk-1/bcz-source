package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.IntSize;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {
    public static final int $stable = 8;

    @k
    private final MutableState<IntSize> targetSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5278boximpl(IntSize.Companion.m5291getZeroYbymL2g()), null, 2, null);

    @k
    private Transition<EnterExitState> transition;

    public AnimatedVisibilityScopeImpl(@k Transition<EnterExitState> transition) {
        this.transition = transition;
    }

    @k
    public final MutableState<IntSize> getTargetSize$animation() {
        return this.targetSize;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    @k
    public Transition<EnterExitState> getTransition() {
        return this.transition;
    }

    public void setTransition(@k Transition<EnterExitState> transition) {
        this.transition = transition;
    }
}
