package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SizeAnimationModifierElement extends ModifierNodeElement<SizeAnimationModifierNode> {

    @k
    private final Alignment alignment;

    @k
    private final FiniteAnimationSpec<IntSize> animationSpec;

    @l
    private final p<IntSize, IntSize, g2> finishedListener;

    /* JADX WARN: Multi-variable type inference failed */
    public SizeAnimationModifierElement(@k FiniteAnimationSpec<IntSize> finiteAnimationSpec, @k Alignment alignment, @l p<? super IntSize, ? super IntSize, g2> pVar) {
        this.animationSpec = finiteAnimationSpec;
        this.alignment = alignment;
        this.finishedListener = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SizeAnimationModifierElement copy$default(SizeAnimationModifierElement sizeAnimationModifierElement, FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = sizeAnimationModifierElement.animationSpec;
        }
        if ((i11 & 2) != 0) {
            alignment = sizeAnimationModifierElement.alignment;
        }
        if ((i11 & 4) != 0) {
            pVar = sizeAnimationModifierElement.finishedListener;
        }
        return sizeAnimationModifierElement.copy(finiteAnimationSpec, alignment, pVar);
    }

    @k
    public final FiniteAnimationSpec<IntSize> component1() {
        return this.animationSpec;
    }

    @k
    public final Alignment component2() {
        return this.alignment;
    }

    @l
    public final p<IntSize, IntSize, g2> component3() {
        return this.finishedListener;
    }

    @k
    public final SizeAnimationModifierElement copy(@k FiniteAnimationSpec<IntSize> finiteAnimationSpec, @k Alignment alignment, @l p<? super IntSize, ? super IntSize, g2> pVar) {
        return new SizeAnimationModifierElement(finiteAnimationSpec, alignment, pVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        SizeAnimationModifierElement sizeAnimationModifierElement = (SizeAnimationModifierElement) obj;
        return g0.g(this.animationSpec, sizeAnimationModifierElement.animationSpec) && g0.g(this.alignment, sizeAnimationModifierElement.alignment) && g0.g(this.finishedListener, sizeAnimationModifierElement.finishedListener);
    }

    @k
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @k
    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    @l
    public final p<IntSize, IntSize, g2> getFinishedListener() {
        return this.finishedListener;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = ((this.animationSpec.hashCode() * 31) + this.alignment.hashCode()) * 31;
        p<IntSize, IntSize, g2> pVar = this.finishedListener;
        return hashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("animateContentSize");
        inspectorInfo.getProperties().set("animationSpec", this.animationSpec);
        inspectorInfo.getProperties().set("alignment", this.alignment);
        inspectorInfo.getProperties().set("finishedListener", this.finishedListener);
    }

    @k
    public String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.animationSpec + ", alignment=" + this.alignment + ", finishedListener=" + this.finishedListener + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public SizeAnimationModifierNode create() {
        return new SizeAnimationModifierNode(this.animationSpec, this.alignment, this.finishedListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k SizeAnimationModifierNode sizeAnimationModifierNode) {
        sizeAnimationModifierNode.setAnimationSpec(this.animationSpec);
        sizeAnimationModifierNode.setListener(this.finishedListener);
        sizeAnimationModifierNode.setAlignment(this.alignment);
    }
}
