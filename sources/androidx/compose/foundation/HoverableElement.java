package androidx.compose.foundation;

import a90.c3;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class HoverableElement extends ModifierNodeElement<HoverableNode> {

    @m80.k
    private final MutableInteractionSource interactionSource;

    public HoverableElement(@m80.k MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && g0.g(((HoverableElement) obj).interactionSource, this.interactionSource);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.interactionSource.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("hoverable");
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.TRUE);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public HoverableNode create() {
        return new HoverableNode(this.interactionSource);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k HoverableNode hoverableNode) {
        hoverableNode.updateInteractionSource(this.interactionSource);
    }
}
