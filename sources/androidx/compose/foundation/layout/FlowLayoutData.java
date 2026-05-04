package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class FlowLayoutData {
    public static final int $stable = 8;
    private float fillCrossAxisFraction;

    public FlowLayoutData(float f11) {
        this.fillCrossAxisFraction = f11;
    }

    public static /* synthetic */ FlowLayoutData copy$default(FlowLayoutData flowLayoutData, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = flowLayoutData.fillCrossAxisFraction;
        }
        return flowLayoutData.copy(f11);
    }

    public final float component1() {
        return this.fillCrossAxisFraction;
    }

    @m80.k
    public final FlowLayoutData copy(float f11) {
        return new FlowLayoutData(f11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FlowLayoutData) && Float.compare(this.fillCrossAxisFraction, ((FlowLayoutData) obj).fillCrossAxisFraction) == 0;
    }

    public final float getFillCrossAxisFraction() {
        return this.fillCrossAxisFraction;
    }

    public int hashCode() {
        return Float.hashCode(this.fillCrossAxisFraction);
    }

    public final void setFillCrossAxisFraction(float f11) {
        this.fillCrossAxisFraction = f11;
    }

    @m80.k
    public String toString() {
        return "FlowLayoutData(fillCrossAxisFraction=" + this.fillCrossAxisFraction + ')';
    }
}
