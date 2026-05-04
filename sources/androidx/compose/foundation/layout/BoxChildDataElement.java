package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class BoxChildDataElement extends ModifierNodeElement<BoxChildDataNode> {

    @m80.k
    private final Alignment alignment;

    @m80.k
    private final l<InspectorInfo, g2> inspectorInfo;
    private final boolean matchParentSize;

    /* JADX WARN: Multi-variable type inference failed */
    public BoxChildDataElement(@m80.k Alignment alignment, boolean z11, @m80.k l<? super InspectorInfo, g2> lVar) {
        this.alignment = alignment;
        this.matchParentSize = z11;
        this.inspectorInfo = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && g0.g(this.alignment, boxChildDataElement.alignment) && this.matchParentSize == boxChildDataElement.matchParentSize;
    }

    @m80.k
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @m80.k
    public final l<InspectorInfo, g2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.matchParentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public BoxChildDataNode create() {
        return new BoxChildDataNode(this.alignment, this.matchParentSize);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k BoxChildDataNode boxChildDataNode) {
        boxChildDataNode.setAlignment(this.alignment);
        boxChildDataNode.setMatchParentSize(this.matchParentSize);
    }
}
