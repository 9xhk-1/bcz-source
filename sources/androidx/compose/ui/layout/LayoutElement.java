package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {

    @k
    private final q<MeasureScope, Measurable, Constraints, MeasureResult> measure;

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutElement(@k q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        this.measure = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LayoutElement copy$default(LayoutElement layoutElement, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            qVar = layoutElement.measure;
        }
        return layoutElement.copy(qVar);
    }

    @k
    public final q<MeasureScope, Measurable, Constraints, MeasureResult> component1() {
        return this.measure;
    }

    @k
    public final LayoutElement copy(@k q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        return new LayoutElement(qVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && g0.g(this.measure, ((LayoutElement) obj).measure);
    }

    @k
    public final q<MeasureScope, Measurable, Constraints, MeasureResult> getMeasure() {
        return this.measure;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layout");
        inspectorInfo.getProperties().set("measure", this.measure);
    }

    @k
    public String toString() {
        return "LayoutElement(measure=" + this.measure + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public LayoutModifierImpl create() {
        return new LayoutModifierImpl(this.measure);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k LayoutModifierImpl layoutModifierImpl) {
        layoutModifierImpl.setMeasureBlock(this.measure);
    }
}
