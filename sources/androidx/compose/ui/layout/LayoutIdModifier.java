package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LayoutIdModifier extends Modifier.Node implements ParentDataModifierNode, LayoutIdParentData {
    public static final int $stable = 8;

    @k
    private Object layoutId;

    public LayoutIdModifier(@k Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    @k
    public Object getLayoutId() {
        return this.layoutId;
    }

    public void setLayoutId$ui_release(@k Object obj) {
        this.layoutId = obj;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @l
    public Object modifyParentData(@k Density density, @l Object obj) {
        return this;
    }
}
