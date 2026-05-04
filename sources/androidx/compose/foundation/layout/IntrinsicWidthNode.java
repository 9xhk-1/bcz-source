package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class IntrinsicWidthNode extends IntrinsicSizeModifier {
    private boolean enforceIncoming;

    @m80.k
    private IntrinsicSize width;

    public IntrinsicWidthNode(@m80.k IntrinsicSize intrinsicSize, boolean z11) {
        this.width = intrinsicSize;
        this.enforceIncoming = z11;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public long mo679calculateContentConstraintsl58MMJ0(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        int minIntrinsicWidth = this.width == IntrinsicSize.Min ? measurable.minIntrinsicWidth(Constraints.m5067getMaxHeightimpl(j11)) : measurable.maxIntrinsicWidth(Constraints.m5067getMaxHeightimpl(j11));
        if (minIntrinsicWidth < 0) {
            minIntrinsicWidth = 0;
        }
        return Constraints.Companion.m5080fixedWidthOenEA2s(minIntrinsicWidth);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    @m80.k
    public final IntrinsicSize getWidth() {
        return this.width;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i11) : intrinsicMeasurable.maxIntrinsicWidth(i11);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return this.width == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicWidth(i11) : intrinsicMeasurable.maxIntrinsicWidth(i11);
    }

    public void setEnforceIncoming(boolean z11) {
        this.enforceIncoming = z11;
    }

    public final void setWidth(@m80.k IntrinsicSize intrinsicSize) {
        this.width = intrinsicSize;
    }
}
