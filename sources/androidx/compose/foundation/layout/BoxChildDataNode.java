package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class BoxChildDataNode extends Modifier.Node implements ParentDataModifierNode {

    @m80.k
    private Alignment alignment;
    private boolean matchParentSize;

    public BoxChildDataNode(@m80.k Alignment alignment, boolean z11) {
        this.alignment = alignment;
        this.matchParentSize = z11;
    }

    @m80.k
    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @m80.k
    public BoxChildDataNode modifyParentData(@m80.k Density density, @l Object obj) {
        return this;
    }

    public final void setAlignment(@m80.k Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setMatchParentSize(boolean z11) {
        this.matchParentSize = z11;
    }
}
