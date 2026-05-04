package androidx.compose.foundation;

import a90.c3;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FocusableElement extends ModifierNodeElement<FocusableNode> {

    @l
    private final MutableInteractionSource interactionSource;

    public FocusableElement(@l MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusableElement) && g0.g(this.interactionSource, ((FocusableElement) obj).interactionSource);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        if (mutableInteractionSource != null) {
            return mutableInteractionSource.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusable");
        inspectorInfo.getProperties().set(c3.f2342e, Boolean.TRUE);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public FocusableNode create() {
        return new FocusableNode(this.interactionSource, 0, null, 6, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k FocusableNode focusableNode) {
        focusableNode.update(this.interactionSource);
    }
}
