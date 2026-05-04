package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LazyLayoutAnimationSpecsNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;

    @l
    private FiniteAnimationSpec<Float> fadeInSpec;

    @l
    private FiniteAnimationSpec<Float> fadeOutSpec;

    @l
    private FiniteAnimationSpec<IntOffset> placementSpec;

    public LazyLayoutAnimationSpecsNode(@l FiniteAnimationSpec<Float> finiteAnimationSpec, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, @l FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        this.fadeInSpec = finiteAnimationSpec;
        this.placementSpec = finiteAnimationSpec2;
        this.fadeOutSpec = finiteAnimationSpec3;
    }

    @l
    public final FiniteAnimationSpec<Float> getFadeInSpec() {
        return this.fadeInSpec;
    }

    @l
    public final FiniteAnimationSpec<Float> getFadeOutSpec() {
        return this.fadeOutSpec;
    }

    @l
    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    public final void setFadeInSpec(@l FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeInSpec = finiteAnimationSpec;
    }

    public final void setFadeOutSpec(@l FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeOutSpec = finiteAnimationSpec;
    }

    public final void setPlacementSpec(@l FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @k
    public Object modifyParentData(@k Density density, @l Object obj) {
        return this;
    }
}
