package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nApproachLayoutModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApproachLayoutModifierNode.kt\nandroidx/compose/ui/layout/ApproachLayoutModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,221:1\n1#2:222\n*E\n"})
/* loaded from: classes.dex */
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    @k
    /* renamed from: approachMeasure-3p2s80s */
    MeasureResult mo66approachMeasure3p2s80s(@k ApproachMeasureScope approachMeasureScope, @k Measurable measurable, long j11);

    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    boolean mo67isMeasurementApproachInProgressozmzZPI(long j11);

    default boolean isPlacementApproachInProgress(@k Placeable.PlacementScope placementScope, @k LayoutCoordinates layoutCoordinates) {
        return false;
    }

    default int maxApproachIntrinsicHeight(@k ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        NodeCoordinator coordinator$ui_release = getNode().getCoordinator$ui_release();
        g0.m(coordinator$ui_release);
        LookaheadDelegate lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxHeight$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s, reason: not valid java name */
            public final MeasureResult mo3835measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j11) {
                return ApproachLayoutModifierNode.this.mo66approachMeasure3p2s80s(approachMeasureScope, measurable, j11);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i11) : intrinsicMeasurable.maxIntrinsicHeight(i11);
    }

    default int maxApproachIntrinsicWidth(@k ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        NodeCoordinator coordinator$ui_release = getNode().getCoordinator$ui_release();
        g0.m(coordinator$ui_release);
        LookaheadDelegate lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.maxWidth$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo3835measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j11) {
                return ApproachLayoutModifierNode.this.mo66approachMeasure3p2s80s(approachMeasureScope, measurable, j11);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i11) : intrinsicMeasurable.maxIntrinsicWidth(i11);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    default MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$measure$1$1
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

    default int minApproachIntrinsicHeight(@k ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        NodeCoordinator coordinator$ui_release = getNode().getCoordinator$ui_release();
        g0.m(coordinator$ui_release);
        LookaheadDelegate lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minHeight$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo3835measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j11) {
                return ApproachLayoutModifierNode.this.mo66approachMeasure3p2s80s(approachMeasureScope, measurable, j11);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i11) : intrinsicMeasurable.minIntrinsicHeight(i11);
    }

    default int minApproachIntrinsicWidth(@k ApproachIntrinsicMeasureScope approachIntrinsicMeasureScope, @k IntrinsicMeasurable intrinsicMeasurable, int i11) {
        NodeCoordinator coordinator$ui_release = getNode().getCoordinator$ui_release();
        g0.m(coordinator$ui_release);
        LookaheadDelegate lookaheadDelegate = coordinator$ui_release.getLookaheadDelegate();
        g0.m(lookaheadDelegate);
        return lookaheadDelegate.getHasMeasureResult() ? NodeMeasuringIntrinsics.INSTANCE.minWidth$ui_release(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            /* renamed from: measure-3p2s80s */
            public final MeasureResult mo3835measure3p2s80s(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j11) {
                return ApproachLayoutModifierNode.this.mo66approachMeasure3p2s80s(approachMeasureScope, measurable, j11);
            }
        }, approachIntrinsicMeasureScope, intrinsicMeasurable, i11) : intrinsicMeasurable.minIntrinsicWidth(i11);
    }
}
