package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.ScrollScope;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class DecayApproachAnimation implements ApproachAnimation<Float, AnimationVector1D> {

    @k
    private final DecayAnimationSpec<Float> decayAnimationSpec;

    public DecayApproachAnimation(@k DecayAnimationSpec<Float> decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    @Override // androidx.compose.foundation.gestures.snapping.ApproachAnimation
    public /* bridge */ /* synthetic */ Object approachAnimation(ScrollScope scrollScope, Float f11, Float f12, l<? super Float, g2> lVar, c<? super AnimationResult<Float, AnimationVector1D>> cVar) {
        return approachAnimation(scrollScope, f11.floatValue(), f12.floatValue(), lVar, cVar);
    }

    @m80.l
    public Object approachAnimation(@k ScrollScope scrollScope, float f11, float f12, @k l<? super Float, g2> lVar, @k c<? super AnimationResult<Float, AnimationVector1D>> cVar) {
        Object animateDecay;
        animateDecay = SnapFlingBehaviorKt.animateDecay(scrollScope, f11, AnimationStateKt.AnimationState$default(0.0f, f12, 0L, 0L, false, 28, null), this.decayAnimationSpec, lVar, cVar);
        return animateDecay == b.l() ? animateDecay : (AnimationResult) animateDecay;
    }
}
