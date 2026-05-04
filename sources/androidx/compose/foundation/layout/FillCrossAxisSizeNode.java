package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FillCrossAxisSizeNode extends Modifier.Node implements ParentDataModifierNode {
    public static final int $stable = 8;
    private float fraction;

    public FillCrossAxisSizeNode(float f11) {
        this.fraction = f11;
    }

    public final float getFraction() {
        return this.fraction;
    }

    public final void setFraction(float f11) {
        this.fraction = f11;
    }

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    @m80.k
    public RowColumnParentData modifyParentData(@m80.k Density density, @l Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData(0.0f, false, null, null, 15, null);
        }
        FlowLayoutData flowLayoutData = rowColumnParentData.getFlowLayoutData();
        if (flowLayoutData == null) {
            flowLayoutData = new FlowLayoutData(this.fraction);
        }
        rowColumnParentData.setFlowLayoutData(flowLayoutData);
        FlowLayoutData flowLayoutData2 = rowColumnParentData.getFlowLayoutData();
        g0.m(flowLayoutData2);
        flowLayoutData2.setFillCrossAxisFraction(this.fraction);
        return rowColumnParentData;
    }
}
