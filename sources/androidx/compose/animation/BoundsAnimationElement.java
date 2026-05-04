package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalSharedTransitionApi
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class BoundsAnimationElement extends ModifierNodeElement<BoundsAnimationModifierNode> {
    public static final int $stable = 0;
    private final boolean animateMotionFrameOfReference;

    @k
    private final BoundsTransform boundsTransform;

    @k
    private final LookaheadScope lookaheadScope;

    @k
    private final p<IntSize, Constraints, Constraints> resolveMeasureConstraints;

    /* JADX WARN: Multi-variable type inference failed */
    public BoundsAnimationElement(@k LookaheadScope lookaheadScope, @k BoundsTransform boundsTransform, @k p<? super IntSize, ? super Constraints, Constraints> pVar, boolean z11) {
        this.lookaheadScope = lookaheadScope;
        this.boundsTransform = boundsTransform;
        this.resolveMeasureConstraints = pVar;
        this.animateMotionFrameOfReference = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoundsAnimationElement copy$default(BoundsAnimationElement boundsAnimationElement, LookaheadScope lookaheadScope, BoundsTransform boundsTransform, p pVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lookaheadScope = boundsAnimationElement.lookaheadScope;
        }
        if ((i11 & 2) != 0) {
            boundsTransform = boundsAnimationElement.boundsTransform;
        }
        if ((i11 & 4) != 0) {
            pVar = boundsAnimationElement.resolveMeasureConstraints;
        }
        if ((i11 & 8) != 0) {
            z11 = boundsAnimationElement.animateMotionFrameOfReference;
        }
        return boundsAnimationElement.copy(lookaheadScope, boundsTransform, pVar, z11);
    }

    @k
    public final LookaheadScope component1() {
        return this.lookaheadScope;
    }

    @k
    public final BoundsTransform component2() {
        return this.boundsTransform;
    }

    @k
    public final p<IntSize, Constraints, Constraints> component3() {
        return this.resolveMeasureConstraints;
    }

    public final boolean component4() {
        return this.animateMotionFrameOfReference;
    }

    @k
    public final BoundsAnimationElement copy(@k LookaheadScope lookaheadScope, @k BoundsTransform boundsTransform, @k p<? super IntSize, ? super Constraints, Constraints> pVar, boolean z11) {
        return new BoundsAnimationElement(lookaheadScope, boundsTransform, pVar, z11);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoundsAnimationElement)) {
            return false;
        }
        BoundsAnimationElement boundsAnimationElement = (BoundsAnimationElement) obj;
        return g0.g(this.lookaheadScope, boundsAnimationElement.lookaheadScope) && g0.g(this.boundsTransform, boundsAnimationElement.boundsTransform) && g0.g(this.resolveMeasureConstraints, boundsAnimationElement.resolveMeasureConstraints) && this.animateMotionFrameOfReference == boundsAnimationElement.animateMotionFrameOfReference;
    }

    public final boolean getAnimateMotionFrameOfReference() {
        return this.animateMotionFrameOfReference;
    }

    @k
    public final BoundsTransform getBoundsTransform() {
        return this.boundsTransform;
    }

    @k
    public final LookaheadScope getLookaheadScope() {
        return this.lookaheadScope;
    }

    @k
    public final p<IntSize, Constraints, Constraints> getResolveMeasureConstraints() {
        return this.resolveMeasureConstraints;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((this.lookaheadScope.hashCode() * 31) + this.boundsTransform.hashCode()) * 31) + this.resolveMeasureConstraints.hashCode()) * 31) + Boolean.hashCode(this.animateMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("boundsAnimation");
        inspectorInfo.getProperties().set("lookaheadScope", this.lookaheadScope);
        inspectorInfo.getProperties().set("boundsTransform", this.boundsTransform);
        inspectorInfo.getProperties().set("onChooseMeasureConstraints", this.resolveMeasureConstraints);
        inspectorInfo.getProperties().set("animateMotionFrameOfReference", Boolean.valueOf(this.animateMotionFrameOfReference));
    }

    @k
    public String toString() {
        return "BoundsAnimationElement(lookaheadScope=" + this.lookaheadScope + ", boundsTransform=" + this.boundsTransform + ", resolveMeasureConstraints=" + this.resolveMeasureConstraints + ", animateMotionFrameOfReference=" + this.animateMotionFrameOfReference + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public BoundsAnimationModifierNode create() {
        return new BoundsAnimationModifierNode(this.lookaheadScope, this.boundsTransform, this.resolveMeasureConstraints, this.animateMotionFrameOfReference);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k BoundsAnimationModifierNode boundsAnimationModifierNode) {
        boundsAnimationModifierNode.setLookaheadScope(this.lookaheadScope);
        boundsAnimationModifierNode.setBoundsTransform(this.boundsTransform);
        boundsAnimationModifierNode.setOnChooseMeasureConstraints(this.resolveMeasureConstraints);
        boundsAnimationModifierNode.setAnimateMotionFrameOfReference(this.animateMotionFrameOfReference);
    }
}
