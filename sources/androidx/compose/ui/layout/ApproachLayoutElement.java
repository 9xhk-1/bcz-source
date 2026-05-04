package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ApproachLayoutElement extends ModifierNodeElement<ApproachLayoutModifierNodeImpl> {

    @k
    private final q<ApproachMeasureScope, Measurable, Constraints, MeasureResult> approachMeasure;

    @k
    private final l<IntSize, Boolean> isMeasurementApproachInProgress;

    @k
    private final p<Placeable.PlacementScope, LayoutCoordinates, Boolean> isPlacementApproachInProgress;

    public /* synthetic */ ApproachLayoutElement(q qVar, l lVar, p pVar, int i11, v vVar) {
        this(qVar, lVar, (i11 & 4) != 0 ? LookaheadScopeKt.defaultPlacementApproachInProgress : pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApproachLayoutElement copy$default(ApproachLayoutElement approachLayoutElement, q qVar, l lVar, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qVar = approachLayoutElement.approachMeasure;
        }
        if ((i11 & 2) != 0) {
            lVar = approachLayoutElement.isMeasurementApproachInProgress;
        }
        if ((i11 & 4) != 0) {
            pVar = approachLayoutElement.isPlacementApproachInProgress;
        }
        return approachLayoutElement.copy(qVar, lVar, pVar);
    }

    @k
    public final q<ApproachMeasureScope, Measurable, Constraints, MeasureResult> component1() {
        return this.approachMeasure;
    }

    @k
    public final l<IntSize, Boolean> component2() {
        return this.isMeasurementApproachInProgress;
    }

    @k
    public final p<Placeable.PlacementScope, LayoutCoordinates, Boolean> component3() {
        return this.isPlacementApproachInProgress;
    }

    @k
    public final ApproachLayoutElement copy(@k q<? super ApproachMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar, @k l<? super IntSize, Boolean> lVar, @k p<? super Placeable.PlacementScope, ? super LayoutCoordinates, Boolean> pVar) {
        return new ApproachLayoutElement(qVar, lVar, pVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproachLayoutElement)) {
            return false;
        }
        ApproachLayoutElement approachLayoutElement = (ApproachLayoutElement) obj;
        return g0.g(this.approachMeasure, approachLayoutElement.approachMeasure) && g0.g(this.isMeasurementApproachInProgress, approachLayoutElement.isMeasurementApproachInProgress) && g0.g(this.isPlacementApproachInProgress, approachLayoutElement.isPlacementApproachInProgress);
    }

    @k
    public final q<ApproachMeasureScope, Measurable, Constraints, MeasureResult> getApproachMeasure() {
        return this.approachMeasure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.approachMeasure.hashCode() * 31) + this.isMeasurementApproachInProgress.hashCode()) * 31) + this.isPlacementApproachInProgress.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("approachLayout");
        inspectorInfo.getProperties().set("approachMeasure", this.approachMeasure);
        inspectorInfo.getProperties().set("isMeasurementApproachInProgress", this.isMeasurementApproachInProgress);
        inspectorInfo.getProperties().set("isPlacementApproachInProgress", this.isPlacementApproachInProgress);
    }

    @k
    public final l<IntSize, Boolean> isMeasurementApproachInProgress() {
        return this.isMeasurementApproachInProgress;
    }

    @k
    public final p<Placeable.PlacementScope, LayoutCoordinates, Boolean> isPlacementApproachInProgress() {
        return this.isPlacementApproachInProgress;
    }

    @k
    public String toString() {
        return "ApproachLayoutElement(approachMeasure=" + this.approachMeasure + ", isMeasurementApproachInProgress=" + this.isMeasurementApproachInProgress + ", isPlacementApproachInProgress=" + this.isPlacementApproachInProgress + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public ApproachLayoutModifierNodeImpl create() {
        return new ApproachLayoutModifierNodeImpl(this.approachMeasure, this.isMeasurementApproachInProgress, this.isPlacementApproachInProgress);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k ApproachLayoutModifierNodeImpl approachLayoutModifierNodeImpl) {
        approachLayoutModifierNodeImpl.setMeasureBlock(this.approachMeasure);
        approachLayoutModifierNodeImpl.setMeasurementApproachInProgress(this.isMeasurementApproachInProgress);
        approachLayoutModifierNodeImpl.setPlacementApproachInProgress(this.isPlacementApproachInProgress);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApproachLayoutElement(@k q<? super ApproachMeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar, @k l<? super IntSize, Boolean> lVar, @k p<? super Placeable.PlacementScope, ? super LayoutCoordinates, Boolean> pVar) {
        this.approachMeasure = qVar;
        this.isMeasurementApproachInProgress = lVar;
        this.isPlacementApproachInProgress = pVar;
    }
}
