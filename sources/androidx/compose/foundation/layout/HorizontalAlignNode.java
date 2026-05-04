package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class HorizontalAlignNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;

    @m80.k
    private Alignment.Horizontal horizontal;

    public HorizontalAlignNode(@m80.k Alignment.Horizontal horizontal) {
        this.horizontal = horizontal;
    }

    @m80.k
    public final Alignment.Horizontal getHorizontal() {
        return this.horizontal;
    }

    public final void setHorizontal(@m80.k Alignment.Horizontal horizontal) {
        this.horizontal = horizontal;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @m80.k
    public RowColumnParentData modifyParentData(@m80.k Density density, @l Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        rowColumnParentData.setCrossAxisAlignment(CrossAxisAlignment.Companion.horizontal$foundation_layout_release(this.horizontal));
        return rowColumnParentData;
    }
}
