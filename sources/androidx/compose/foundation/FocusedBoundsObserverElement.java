package androidx.compose.foundation;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FocusedBoundsObserverElement extends ModifierNodeElement<FocusedBoundsObserverNode> {

    @m80.k
    private final l<LayoutCoordinates, g2> onPositioned;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusedBoundsObserverElement(@m80.k l<? super LayoutCoordinates, g2> lVar) {
        this.onPositioned = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        FocusedBoundsObserverElement focusedBoundsObserverElement = obj instanceof FocusedBoundsObserverElement ? (FocusedBoundsObserverElement) obj : null;
        return focusedBoundsObserverElement != null && this.onPositioned == focusedBoundsObserverElement.onPositioned;
    }

    @m80.k
    public final l<LayoutCoordinates, g2> getOnPositioned() {
        return this.onPositioned;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onPositioned.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusedBoundsChanged");
        inspectorInfo.getProperties().set("onPositioned", this.onPositioned);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public FocusedBoundsObserverNode create() {
        return new FocusedBoundsObserverNode(this.onPositioned);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k FocusedBoundsObserverNode focusedBoundsObserverNode) {
        focusedBoundsObserverNode.setOnPositioned(this.onPositioned);
    }
}
