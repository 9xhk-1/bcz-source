package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class IntrinsicHeightNode extends IntrinsicSizeModifier {
    private boolean enforceIncoming;

    @m80.k
    private IntrinsicSize height;

    public IntrinsicHeightNode(@m80.k IntrinsicSize intrinsicSize, boolean z11) {
        this.height = intrinsicSize;
        this.enforceIncoming = z11;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0, reason: not valid java name */
    public long mo679calculateContentConstraintsl58MMJ0(@m80.k MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        int minIntrinsicHeight = this.height == IntrinsicSize.Min ? measurable.minIntrinsicHeight(Constraints.m5068getMaxWidthimpl(j11)) : measurable.maxIntrinsicHeight(Constraints.m5068getMaxWidthimpl(j11));
        if (minIntrinsicHeight < 0) {
            minIntrinsicHeight = 0;
        }
        return Constraints.Companion.m5079fixedHeightOenEA2s(minIntrinsicHeight);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    @m80.k
    public final IntrinsicSize getHeight() {
        return this.height;
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return this.height == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicHeight(i11) : intrinsicMeasurable.maxIntrinsicHeight(i11);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return this.height == IntrinsicSize.Min ? intrinsicMeasurable.minIntrinsicHeight(i11) : intrinsicMeasurable.maxIntrinsicHeight(i11);
    }

    public void setEnforceIncoming(boolean z11) {
        this.enforceIncoming = z11;
    }

    public final void setHeight(@m80.k IntrinsicSize intrinsicSize) {
        this.height = intrinsicSize;
    }
}
