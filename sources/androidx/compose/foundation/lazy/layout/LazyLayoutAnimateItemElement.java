package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntOffset;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyLayoutAnimateItemElement extends ModifierNodeElement<LazyLayoutAnimationSpecsNode> {
    public static final int $stable = 0;

    @l
    private final FiniteAnimationSpec<Float> fadeInSpec;

    @l
    private final FiniteAnimationSpec<Float> fadeOutSpec;

    @l
    private final FiniteAnimationSpec<IntOffset> placementSpec;

    public LazyLayoutAnimateItemElement(@l FiniteAnimationSpec<Float> finiteAnimationSpec, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, @l FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        this.fadeInSpec = finiteAnimationSpec;
        this.placementSpec = finiteAnimationSpec2;
        this.fadeOutSpec = finiteAnimationSpec3;
    }

    private final FiniteAnimationSpec<Float> component1() {
        return this.fadeInSpec;
    }

    private final FiniteAnimationSpec<IntOffset> component2() {
        return this.placementSpec;
    }

    private final FiniteAnimationSpec<Float> component3() {
        return this.fadeOutSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LazyLayoutAnimateItemElement copy$default(LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = lazyLayoutAnimateItemElement.fadeInSpec;
        }
        if ((i11 & 2) != 0) {
            finiteAnimationSpec2 = lazyLayoutAnimateItemElement.placementSpec;
        }
        if ((i11 & 4) != 0) {
            finiteAnimationSpec3 = lazyLayoutAnimateItemElement.fadeOutSpec;
        }
        return lazyLayoutAnimateItemElement.copy(finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }

    @k
    public final LazyLayoutAnimateItemElement copy(@l FiniteAnimationSpec<Float> finiteAnimationSpec, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, @l FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        return new LazyLayoutAnimateItemElement(finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return g0.g(this.fadeInSpec, lazyLayoutAnimateItemElement.fadeInSpec) && g0.g(this.placementSpec, lazyLayoutAnimateItemElement.placementSpec) && g0.g(this.fadeOutSpec, lazyLayoutAnimateItemElement.fadeOutSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeInSpec;
        int hashCode = (finiteAnimationSpec == null ? 0 : finiteAnimationSpec.hashCode()) * 31;
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec2 = this.placementSpec;
        int hashCode2 = (hashCode + (finiteAnimationSpec2 == null ? 0 : finiteAnimationSpec2.hashCode())) * 31;
        FiniteAnimationSpec<Float> finiteAnimationSpec3 = this.fadeOutSpec;
        return hashCode2 + (finiteAnimationSpec3 != null ? finiteAnimationSpec3.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateItem");
        inspectorInfo.getProperties().set("fadeInSpec", this.fadeInSpec);
        inspectorInfo.getProperties().set("placementSpec", this.placementSpec);
        inspectorInfo.getProperties().set("fadeOutSpec", this.fadeOutSpec);
    }

    @k
    public String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.fadeInSpec + ", placementSpec=" + this.placementSpec + ", fadeOutSpec=" + this.fadeOutSpec + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public LazyLayoutAnimationSpecsNode create() {
        return new LazyLayoutAnimationSpecsNode(this.fadeInSpec, this.placementSpec, this.fadeOutSpec);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k LazyLayoutAnimationSpecsNode lazyLayoutAnimationSpecsNode) {
        lazyLayoutAnimationSpecsNode.setFadeInSpec(this.fadeInSpec);
        lazyLayoutAnimationSpecsNode.setPlacementSpec(this.placementSpec);
        lazyLayoutAnimationSpecsNode.setFadeOutSpec(this.fadeOutSpec);
    }
}
