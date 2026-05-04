package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class FocusGroupPropertiesElement extends ModifierNodeElement<FocusGroupPropertiesNode> {

    @k
    public static final FocusGroupPropertiesElement INSTANCE = new FocusGroupPropertiesElement();

    private FocusGroupPropertiesElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return -1929324230;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("FocusGroupProperties");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k FocusGroupPropertiesNode focusGroupPropertiesNode) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public FocusGroupPropertiesNode create() {
        return new FocusGroupPropertiesNode();
    }
}
