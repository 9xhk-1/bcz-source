package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedDecayKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.unit.Density;
import c40.i;
import j00.c;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class DefaultFlingBehavior implements ScrollableDefaultFlingBehavior {
    public static final int $stable = 0;

    @k
    private DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;

    @k
    private final MotionDurationScale motionDurationScale;

    public DefaultFlingBehavior(@k DecayAnimationSpec<Float> decayAnimationSpec, @k MotionDurationScale motionDurationScale) {
        this.flingDecay = decayAnimationSpec;
        this.motionDurationScale = motionDurationScale;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @l
    public Object performFling(@k ScrollScope scrollScope, float f11, @k c<? super Float> cVar) {
        this.lastAnimationCycleCount = 0;
        return i.h(this.motionDurationScale, new DefaultFlingBehavior$performFling$2(f11, this, scrollScope, null), cVar);
    }

    public final void setLastAnimationCycleCount(int i11) {
        this.lastAnimationCycleCount = i11;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableDefaultFlingBehavior
    public void updateDensity(@k Density density) {
        this.flingDecay = SplineBasedDecayKt.splineBasedDecay(density);
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i11, v vVar) {
        this(decayAnimationSpec, (i11 & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }
}
