package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OnGloballyPositionedElement extends ModifierNodeElement<OnGloballyPositionedNode> {

    @k
    private final l<LayoutCoordinates, g2> onGloballyPositioned;

    /* JADX WARN: Multi-variable type inference failed */
    public OnGloballyPositionedElement(@k l<? super LayoutCoordinates, g2> lVar) {
        this.onGloballyPositioned = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnGloballyPositionedElement) && this.onGloballyPositioned == ((OnGloballyPositionedElement) obj).onGloballyPositioned;
    }

    @k
    public final l<LayoutCoordinates, g2> getOnGloballyPositioned() {
        return this.onGloballyPositioned;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onGloballyPositioned.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onGloballyPositioned");
        inspectorInfo.getProperties().set("onGloballyPositioned", this.onGloballyPositioned);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public OnGloballyPositionedNode create() {
        return new OnGloballyPositionedNode(this.onGloballyPositioned);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k OnGloballyPositionedNode onGloballyPositionedNode) {
        onGloballyPositionedNode.setCallback(this.onGloballyPositioned);
    }
}
