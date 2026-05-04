package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RowColumnParentData {
    public static final int $stable = 8;

    @l
    private CrossAxisAlignment crossAxisAlignment;
    private boolean fill;

    @l
    private FlowLayoutData flowLayoutData;
    private float weight;

    public RowColumnParentData() {
        this(0.0f, false, null, null, 15, null);
    }

    public static /* synthetic */ RowColumnParentData copy$default(RowColumnParentData rowColumnParentData, float f11, boolean z11, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = rowColumnParentData.weight;
        }
        if ((i11 & 2) != 0) {
            z11 = rowColumnParentData.fill;
        }
        if ((i11 & 4) != 0) {
            crossAxisAlignment = rowColumnParentData.crossAxisAlignment;
        }
        if ((i11 & 8) != 0) {
            flowLayoutData = rowColumnParentData.flowLayoutData;
        }
        return rowColumnParentData.copy(f11, z11, crossAxisAlignment, flowLayoutData);
    }

    public final float component1() {
        return this.weight;
    }

    public final boolean component2() {
        return this.fill;
    }

    @l
    public final CrossAxisAlignment component3() {
        return this.crossAxisAlignment;
    }

    @l
    public final FlowLayoutData component4() {
        return this.flowLayoutData;
    }

    @m80.k
    public final RowColumnParentData copy(float f11, boolean z11, @l CrossAxisAlignment crossAxisAlignment, @l FlowLayoutData flowLayoutData) {
        return new RowColumnParentData(f11, z11, crossAxisAlignment, flowLayoutData);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnParentData)) {
            return false;
        }
        RowColumnParentData rowColumnParentData = (RowColumnParentData) obj;
        return Float.compare(this.weight, rowColumnParentData.weight) == 0 && this.fill == rowColumnParentData.fill && g0.g(this.crossAxisAlignment, rowColumnParentData.crossAxisAlignment) && g0.g(this.flowLayoutData, rowColumnParentData.flowLayoutData);
    }

    @l
    public final CrossAxisAlignment getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final boolean getFill() {
        return this.fill;
    }

    @l
    public final FlowLayoutData getFlowLayoutData() {
        return this.flowLayoutData;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        int hashCode = ((Float.hashCode(this.weight) * 31) + Boolean.hashCode(this.fill)) * 31;
        CrossAxisAlignment crossAxisAlignment = this.crossAxisAlignment;
        int hashCode2 = (hashCode + (crossAxisAlignment == null ? 0 : crossAxisAlignment.hashCode())) * 31;
        FlowLayoutData flowLayoutData = this.flowLayoutData;
        return hashCode2 + (flowLayoutData != null ? flowLayoutData.hashCode() : 0);
    }

    public final void setCrossAxisAlignment(@l CrossAxisAlignment crossAxisAlignment) {
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public final void setFill(boolean z11) {
        this.fill = z11;
    }

    public final void setFlowLayoutData(@l FlowLayoutData flowLayoutData) {
        this.flowLayoutData = flowLayoutData;
    }

    public final void setWeight(float f11) {
        this.weight = f11;
    }

    @m80.k
    public String toString() {
        return "RowColumnParentData(weight=" + this.weight + ", fill=" + this.fill + ", crossAxisAlignment=" + this.crossAxisAlignment + ", flowLayoutData=" + this.flowLayoutData + ')';
    }

    public RowColumnParentData(float f11, boolean z11, @l CrossAxisAlignment crossAxisAlignment, @l FlowLayoutData flowLayoutData) {
        this.weight = f11;
        this.fill = z11;
        this.crossAxisAlignment = crossAxisAlignment;
        this.flowLayoutData = flowLayoutData;
    }

    public /* synthetic */ RowColumnParentData(float f11, boolean z11, CrossAxisAlignment crossAxisAlignment, FlowLayoutData flowLayoutData, int i11, v vVar) {
        this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? null : crossAxisAlignment, (i11 & 8) != 0 ? null : flowLayoutData);
    }
}
