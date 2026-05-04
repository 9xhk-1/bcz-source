package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OffsetPxNode extends Modifier.Node implements LayoutModifierNode {

    @m80.k
    private l<? super Density, IntOffset> offset;
    private boolean rtlAware;
    private final boolean shouldAutoInvalidate;

    public OffsetPxNode(@m80.k l<? super Density, IntOffset> lVar, boolean z11) {
        this.offset = lVar;
        this.rtlAware = z11;
    }

    @m80.k
    public final l<Density, IntOffset> getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k final MeasureScope measureScope, @m80.k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.OffsetPxNode$measure$1
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
                long m5252unboximpl = OffsetPxNode.this.getOffset().invoke(measureScope).m5252unboximpl();
                if (OffsetPxNode.this.getRtlAware()) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, mo3857measureBRTryo0, IntOffset.m5243getXimpl(m5252unboximpl), IntOffset.m5244getYimpl(m5252unboximpl), 0.0f, (l) null, 12, (Object) null);
                } else {
                    Placeable.PlacementScope.placeWithLayer$default(placementScope, mo3857measureBRTryo0, IntOffset.m5243getXimpl(m5252unboximpl), IntOffset.m5244getYimpl(m5252unboximpl), 0.0f, (l) null, 12, (Object) null);
                }
            }
        }, 4, null);
    }

    public final void setOffset(@m80.k l<? super Density, IntOffset> lVar) {
        this.offset = lVar;
    }

    public final void setRtlAware(boolean z11) {
        this.rtlAware = z11;
    }

    public final void update(@m80.k l<? super Density, IntOffset> lVar, boolean z11) {
        if (this.offset != lVar || this.rtlAware != z11) {
            LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.offset = lVar;
        this.rtlAware = z11;
    }
}
