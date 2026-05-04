package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.SiblingsAlignedNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class WithAlignmentLineBlockElement extends ModifierNodeElement<SiblingsAlignedNode.WithAlignmentLineBlockNode> {
    public static final int $stable = 0;

    @m80.k
    private final l<Measured, Integer> block;

    /* JADX WARN: Multi-variable type inference failed */
    public WithAlignmentLineBlockElement(@m80.k l<? super Measured, Integer> lVar) {
        this.block = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineBlockElement withAlignmentLineBlockElement = obj instanceof WithAlignmentLineBlockElement ? (WithAlignmentLineBlockElement) obj : null;
        return withAlignmentLineBlockElement != null && this.block == withAlignmentLineBlockElement.block;
    }

    @m80.k
    public final l<Measured, Integer> getBlock() {
        return this.block;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.block.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("alignBy");
        inspectorInfo.setValue(this.block);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public SiblingsAlignedNode.WithAlignmentLineBlockNode create() {
        return new SiblingsAlignedNode.WithAlignmentLineBlockNode(this.block);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k SiblingsAlignedNode.WithAlignmentLineBlockNode withAlignmentLineBlockNode) {
        withAlignmentLineBlockNode.setBlock(this.block);
    }
}
