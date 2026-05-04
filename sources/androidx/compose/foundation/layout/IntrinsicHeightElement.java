package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class IntrinsicHeightElement extends ModifierNodeElement<IntrinsicHeightNode> {
    private final boolean enforceIncoming;

    @m80.k
    private final IntrinsicSize height;

    @m80.k
    private final l<InspectorInfo, g2> inspectorInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public IntrinsicHeightElement(@m80.k IntrinsicSize intrinsicSize, boolean z11, @m80.k l<? super InspectorInfo, g2> lVar) {
        this.height = intrinsicSize;
        this.enforceIncoming = z11;
        this.inspectorInfo = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.height == intrinsicHeightElement.height && this.enforceIncoming == intrinsicHeightElement.enforceIncoming;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    @m80.k
    public final IntrinsicSize getHeight() {
        return this.height;
    }

    @m80.k
    public final l<InspectorInfo, g2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.height.hashCode() * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public IntrinsicHeightNode create() {
        return new IntrinsicHeightNode(this.height, this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k IntrinsicHeightNode intrinsicHeightNode) {
        intrinsicHeightNode.setHeight(this.height);
        intrinsicHeightNode.setEnforceIncoming(this.enforceIncoming);
    }
}
