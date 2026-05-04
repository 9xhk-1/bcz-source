package androidx.compose.foundation.shape;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.InspectableValue;
import androidx.compose.ui.unit.Density;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class PercentCornerSize implements CornerSize, InspectableValue {
    private final float percent;

    public PercentCornerSize(@FloatRange(from = 0.0d, to = 100.0d) float f11) {
        this.percent = f11;
        if (f11 < 0.0f || f11 > 100.0f) {
            InlineClassHelperKt.throwIllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    private final float component1() {
        return this.percent;
    }

    public static /* synthetic */ PercentCornerSize copy$default(PercentCornerSize percentCornerSize, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = percentCornerSize.percent;
        }
        return percentCornerSize.copy(f11);
    }

    @k
    public final PercentCornerSize copy(@FloatRange(from = 0.0d, to = 100.0d) float f11) {
        return new PercentCornerSize(f11);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PercentCornerSize) && Float.compare(this.percent, ((PercentCornerSize) obj).percent) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.percent);
    }

    @Override // androidx.compose.foundation.shape.CornerSize
    /* renamed from: toPx-TmRCtEA */
    public float mo1010toPxTmRCtEA(long j11, @k Density density) {
        return Size.m2336getMinDimensionimpl(j11) * (this.percent / 100.0f);
    }

    @k
    public String toString() {
        return "CornerSize(size = " + this.percent + "%)";
    }

    @Override // androidx.compose.ui.platform.InspectableValue
    @k
    public String getValueOverride() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.percent);
        sb2.append('%');
        return sb2.toString();
    }
}
