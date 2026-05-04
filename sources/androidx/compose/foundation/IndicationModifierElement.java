package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class IndicationModifierElement extends ModifierNodeElement<IndicationModifierNode> {

    @m80.k
    private final IndicationNodeFactory indication;

    @m80.k
    private final InteractionSource interactionSource;

    public IndicationModifierElement(@m80.k InteractionSource interactionSource, @m80.k IndicationNodeFactory indicationNodeFactory) {
        this.interactionSource = interactionSource;
        this.indication = indicationNodeFactory;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return g0.g(this.interactionSource, indicationModifierElement.interactionSource) && g0.g(this.indication, indicationModifierElement.indication);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.interactionSource.hashCode() * 31) + this.indication.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indication");
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indication", this.indication);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public IndicationModifierNode create() {
        return new IndicationModifierNode(this.indication.create(this.interactionSource));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k IndicationModifierNode indicationModifierNode) {
        indicationModifierNode.update(this.indication.create(this.interactionSource));
    }
}
