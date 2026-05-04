package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import g10.u;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {

    @m80.k
    private p<? super IntSize, ? super LayoutDirection, IntOffset> alignmentCallback;

    @m80.k
    private Direction direction;
    private boolean unbounded;

    public WrapContentNode(@m80.k Direction direction, boolean z11, @m80.k p<? super IntSize, ? super LayoutDirection, IntOffset> pVar) {
        this.direction = direction;
        this.unbounded = z11;
        this.alignmentCallback = pVar;
    }

    @m80.k
    public final p<IntSize, LayoutDirection, IntOffset> getAlignmentCallback() {
        return this.alignmentCallback;
    }

    @m80.k
    public final Direction getDirection() {
        return this.direction;
    }

    public final boolean getUnbounded() {
        return this.unbounded;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k final MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        Direction direction = this.direction;
        Direction direction2 = Direction.Vertical;
        int m5070getMinWidthimpl = direction != direction2 ? 0 : Constraints.m5070getMinWidthimpl(j11);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.Horizontal;
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(ConstraintsKt.Constraints(m5070getMinWidthimpl, (this.direction == direction2 || !this.unbounded) ? Constraints.m5068getMaxWidthimpl(j11) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.m5069getMinHeightimpl(j11) : 0, (this.direction == direction4 || !this.unbounded) ? Constraints.m5067getMaxHeightimpl(j11) : Integer.MAX_VALUE));
        final int I = u.I(mo3857measureBRTryo0.getWidth(), Constraints.m5070getMinWidthimpl(j11), Constraints.m5068getMaxWidthimpl(j11));
        final int I2 = u.I(mo3857measureBRTryo0.getHeight(), Constraints.m5069getMinHeightimpl(j11), Constraints.m5067getMaxHeightimpl(j11));
        return MeasureScope.layout$default(measureScope, I, I2, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.WrapContentNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.m3921place70tqf50$default(placementScope, mo3857measureBRTryo0, WrapContentNode.this.getAlignmentCallback().invoke(IntSize.m5278boximpl(IntSize.m5281constructorimpl(((I2 - mo3857measureBRTryo0.getHeight()) & 4294967295L) | ((I - mo3857measureBRTryo0.getWidth()) << 32))), measureScope.getLayoutDirection()).m5252unboximpl(), 0.0f, 2, null);
            }
        }, 4, null);
    }

    public final void setAlignmentCallback(@m80.k p<? super IntSize, ? super LayoutDirection, IntOffset> pVar) {
        this.alignmentCallback = pVar;
    }

    public final void setDirection(@m80.k Direction direction) {
        this.direction = direction;
    }

    public final void setUnbounded(boolean z11) {
        this.unbounded = z11;
    }
}
