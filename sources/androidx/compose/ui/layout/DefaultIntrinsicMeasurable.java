package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Constraints;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DefaultIntrinsicMeasurable implements Measurable {
    public static final int $stable = 8;

    @k
    private final IntrinsicMeasurable measurable;

    @k
    private final IntrinsicMinMax minMax;

    @k
    private final IntrinsicWidthHeight widthHeight;

    public DefaultIntrinsicMeasurable(@k IntrinsicMeasurable intrinsicMeasurable, @k IntrinsicMinMax intrinsicMinMax, @k IntrinsicWidthHeight intrinsicWidthHeight) {
        this.measurable = intrinsicMeasurable;
        this.minMax = intrinsicMinMax;
        this.widthHeight = intrinsicWidthHeight;
    }

    @k
    public final IntrinsicMeasurable getMeasurable() {
        return this.measurable;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    @l
    public Object getParentData() {
        return this.measurable.getParentData();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i11) {
        return this.measurable.maxIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i11) {
        return this.measurable.maxIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.layout.Measurable
    @k
    /* renamed from: measure-BRTryo0, reason: not valid java name */
    public Placeable mo3857measureBRTryo0(long j11) {
        if (this.widthHeight == IntrinsicWidthHeight.Width) {
            return new FixedSizeIntrinsicsPlaceable(this.minMax == IntrinsicMinMax.Max ? this.measurable.maxIntrinsicWidth(Constraints.m5067getMaxHeightimpl(j11)) : this.measurable.minIntrinsicWidth(Constraints.m5067getMaxHeightimpl(j11)), Constraints.m5063getHasBoundedHeightimpl(j11) ? Constraints.m5067getMaxHeightimpl(j11) : 32767);
        }
        return new FixedSizeIntrinsicsPlaceable(Constraints.m5064getHasBoundedWidthimpl(j11) ? Constraints.m5068getMaxWidthimpl(j11) : 32767, this.minMax == IntrinsicMinMax.Max ? this.measurable.maxIntrinsicHeight(Constraints.m5068getMaxWidthimpl(j11)) : this.measurable.minIntrinsicHeight(Constraints.m5068getMaxWidthimpl(j11)));
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i11) {
        return this.measurable.minIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i11) {
        return this.measurable.minIntrinsicWidth(i11);
    }
}
