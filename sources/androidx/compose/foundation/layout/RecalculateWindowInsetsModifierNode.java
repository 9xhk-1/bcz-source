package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import x00.l;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class RecalculateWindowInsetsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, LayoutModifierNode, GlobalPositionAwareModifierNode {

    @m80.k
    private final ValueInsets insets;
    private long oldPosition;

    @m80.k
    private final ModifierLocalMap providedValues;

    public RecalculateWindowInsetsModifierNode() {
        ValueInsets valueInsets = new ValueInsets(new InsetsValues(0, 0, 0, 0), "reset");
        this.insets = valueInsets;
        this.oldPosition = IntOffset.Companion.m5254getZeronOccac();
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(h1.a(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), valueInsets));
    }

    @m80.k
    public final ValueInsets getInsets() {
        return this.insets;
    }

    /* renamed from: getOldPosition-nOcc-ac, reason: not valid java name */
    public final long m751getOldPositionnOccac() {
        return this.oldPosition;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @m80.k
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return intrinsicMeasurable.maxIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return intrinsicMeasurable.maxIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @m80.k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k final Measurable measurable, long j11) {
        if (Constraints.m5066getHasFixedWidthimpl(j11) && Constraints.m5065getHasFixedHeightimpl(j11)) {
            final int m5068getMaxWidthimpl = Constraints.m5068getMaxWidthimpl(j11);
            final int m5067getMaxHeightimpl = Constraints.m5067getMaxHeightimpl(j11);
            return MeasureScope.layout$default(measureScope, m5068getMaxWidthimpl, m5067getMaxHeightimpl, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$2
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
                    WindowInsets insets;
                    LayoutCoordinates coordinates = placementScope.getCoordinates();
                    if (coordinates != null) {
                        RecalculateWindowInsetsModifierNode.this.m752setOldPositiongyyYBs(IntOffsetKt.m5260roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(coordinates)));
                    }
                    if (coordinates == null) {
                        insets = (WindowInsets) RecalculateWindowInsetsModifierNode.this.getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets());
                    } else {
                        long positionInRoot = LayoutCoordinatesKt.positionInRoot(coordinates);
                        long mo3865getSizeYbymL2g = coordinates.mo3865getSizeYbymL2g();
                        long mo3868localToRootMKHz9U = coordinates.mo3868localToRootMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits((int) (mo3865getSizeYbymL2g & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (mo3865getSizeYbymL2g >> 32)) << 32)));
                        long mo3865getSizeYbymL2g2 = LayoutCoordinatesKt.findRootCoordinates(coordinates).mo3865getSizeYbymL2g();
                        int round = Math.round(Float.intBitsToFloat((int) (positionInRoot >> 32)));
                        int round2 = Math.round(Float.intBitsToFloat((int) (positionInRoot & 4294967295L)));
                        int round3 = ((int) (mo3865getSizeYbymL2g2 >> 32)) - Math.round(Float.intBitsToFloat((int) (mo3868localToRootMKHz9U >> 32)));
                        int round4 = ((int) (mo3865getSizeYbymL2g2 & 4294967295L)) - Math.round(Float.intBitsToFloat((int) (mo3868localToRootMKHz9U & 4294967295L)));
                        InsetsValues value$foundation_layout_release = RecalculateWindowInsetsModifierNode.this.getInsets().getValue$foundation_layout_release();
                        if (value$foundation_layout_release.getLeft() != round || value$foundation_layout_release.getTop() != round2 || value$foundation_layout_release.getRight() != round3 || value$foundation_layout_release.getBottom() != round4) {
                            RecalculateWindowInsetsModifierNode.this.getInsets().setValue$foundation_layout_release(new InsetsValues(round, round2, round3, round4));
                        }
                        insets = RecalculateWindowInsetsModifierNode.this.getInsets();
                    }
                    RecalculateWindowInsetsModifierNode.this.provide(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), insets);
                    Placeable.PlacementScope.place$default(placementScope, measurable.mo3857measureBRTryo0(Constraints.Companion.m5078fixedJhjzzOo(m5068getMaxWidthimpl, m5067getMaxHeightimpl)), 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        provide(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets(), getCurrent(WindowInsetsPaddingKt.getModifierLocalConsumedWindowInsets()));
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$1
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
                Placeable.PlacementScope.place$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return intrinsicMeasurable.minIntrinsicHeight(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(@m80.k IntrinsicMeasureScope intrinsicMeasureScope, @m80.k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        return intrinsicMeasurable.minIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@m80.k LayoutCoordinates layoutCoordinates) {
        long m5260roundk4lQ0M = IntOffsetKt.m5260roundk4lQ0M(LayoutCoordinatesKt.positionInRoot(layoutCoordinates));
        boolean m5242equalsimpl0 = IntOffset.m5242equalsimpl0(this.oldPosition, m5260roundk4lQ0M);
        this.oldPosition = m5260roundk4lQ0M;
        if (m5242equalsimpl0) {
            return;
        }
        LayoutModifierNodeKt.invalidatePlacement(this);
    }

    /* renamed from: setOldPosition--gyyYBs, reason: not valid java name */
    public final void m752setOldPositiongyyYBs(long j11) {
        this.oldPosition = j11;
    }
}
