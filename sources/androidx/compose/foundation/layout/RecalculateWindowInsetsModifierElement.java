package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class RecalculateWindowInsetsModifierElement extends ModifierNodeElement<RecalculateWindowInsetsModifierNode> {

    @m80.k
    public static final RecalculateWindowInsetsModifierElement INSTANCE = new RecalculateWindowInsetsModifierElement();

    private RecalculateWindowInsetsModifierElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("recalculateWindowInsets");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k RecalculateWindowInsetsModifierNode recalculateWindowInsetsModifierNode) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public RecalculateWindowInsetsModifierNode create() {
        return new RecalculateWindowInsetsModifierNode();
    }
}
