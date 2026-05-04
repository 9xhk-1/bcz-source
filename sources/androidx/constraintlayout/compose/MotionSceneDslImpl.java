package androidx.constraintlayout.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class MotionSceneDslImpl implements MotionScene {
    public static final int $stable = 0;

    @k
    private final Map<String, ConstraintSet> constraintSetsByName;

    @k
    private final Map<String, Transition> transitionsByName;

    /* JADX WARN: Multi-variable type inference failed */
    public MotionSceneDslImpl(@k Map<String, ? extends ConstraintSet> map, @k Map<String, ? extends Transition> map2) {
        this.constraintSetsByName = map;
        this.transitionsByName = map2;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g0.g(MotionSceneDslImpl.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0.n(obj, "null cannot be cast to non-null type androidx.constraintlayout.compose.MotionSceneDslImpl");
        MotionSceneDslImpl motionSceneDslImpl = (MotionSceneDslImpl) obj;
        return g0.g(this.constraintSetsByName, motionSceneDslImpl.constraintSetsByName) && g0.g(this.transitionsByName, motionSceneDslImpl.transitionsByName);
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    @k
    public String getConstraintSet(@l String str) {
        return "";
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    @l
    public ConstraintSet getConstraintSetInstance(@k String str) {
        return this.constraintSetsByName.get(str);
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    @k
    public String getTransition(@l String str) {
        return "";
    }

    @Override // androidx.constraintlayout.compose.MotionScene
    @l
    public Transition getTransitionInstance(@k String str) {
        return this.transitionsByName.get(str);
    }

    public int hashCode() {
        return (this.constraintSetsByName.hashCode() * 31) + this.transitionsByName.hashCode();
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    @k
    public String getConstraintSet(int i11) {
        return "";
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void setDebugName(@l String str) {
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void setConstraintSetContent(@l String str, @l String str2) {
    }

    @Override // androidx.constraintlayout.core.state.CoreMotionScene
    public void setTransitionContent(@l String str, @l String str2) {
    }
}
