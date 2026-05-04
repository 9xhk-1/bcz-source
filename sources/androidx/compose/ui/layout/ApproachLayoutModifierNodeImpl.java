package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import m80.k;
import x00.l;
import x00.p;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ApproachLayoutModifierNodeImpl extends Modifier.Node implements ApproachLayoutModifierNode {

    @k
    private l<? super IntSize, Boolean> isMeasurementApproachInProgress;

    @k
    private p<? super Placeable.PlacementScope, ? super LayoutCoordinates, Boolean> isPlacementApproachInProgress;

    @k
    private q<? super ApproachMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock;

    public ApproachLayoutModifierNodeImpl(@k q<? super ApproachMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar, @k l<? super IntSize, Boolean> lVar, @k p<? super Placeable.PlacementScope, ? super LayoutCoordinates, Boolean> pVar) {
        this.measureBlock = qVar;
        this.isMeasurementApproachInProgress = lVar;
        this.isPlacementApproachInProgress = pVar;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    @k
    /* renamed from: approachMeasure-3p2s80s */
    public MeasureResult mo66approachMeasure3p2s80s(@k ApproachMeasureScope approachMeasureScope, @k Measurable measurable, long j11) {
        return this.measureBlock.invoke(approachMeasureScope, measurable, Constraints.m5055boximpl(j11));
    }

    @k
    public final q<ApproachMeasureScope, Measurable, Constraints, MeasureResult> getMeasureBlock() {
        return this.measureBlock;
    }

    @k
    public final l<IntSize, Boolean> isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    /* renamed from: isMeasurementApproachInProgress-ozmzZPI */
    public boolean mo67isMeasurementApproachInProgressozmzZPI(long j11) {
        return this.isMeasurementApproachInProgress.invoke(IntSize.m5278boximpl(j11)).booleanValue();
    }

    @k
    public final p<Placeable.PlacementScope, LayoutCoordinates, Boolean> isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    public final void setMeasureBlock(@k q<? super ApproachMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        this.measureBlock = qVar;
    }

    public final void setMeasurementApproachInProgress(@k l<? super IntSize, Boolean> lVar) {
        this.isMeasurementApproachInProgress = lVar;
    }

    public final void setPlacementApproachInProgress(@k p<? super Placeable.PlacementScope, ? super LayoutCoordinates, Boolean> pVar) {
        this.isPlacementApproachInProgress = pVar;
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public boolean isPlacementApproachInProgress(@k Placeable.PlacementScope placementScope, @k LayoutCoordinates layoutCoordinates) {
        return this.isPlacementApproachInProgress.invoke(placementScope, layoutCoordinates).booleanValue();
    }
}
