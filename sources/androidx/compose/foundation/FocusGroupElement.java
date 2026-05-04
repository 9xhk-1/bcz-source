package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FocusGroupElement extends ModifierNodeElement<FocusGroupNode> {

    @m80.k
    public static final FocusGroupElement INSTANCE = new FocusGroupElement();

    private FocusGroupElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return -1063782265;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusGroup");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k FocusGroupNode focusGroupNode) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public FocusGroupNode create() {
        return new FocusGroupNode();
    }
}
