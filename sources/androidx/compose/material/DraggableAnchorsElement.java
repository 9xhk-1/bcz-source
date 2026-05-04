package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/DraggableAnchorsElement\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,879:1\n135#2:880\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/DraggableAnchorsElement\n*L\n831#1:880\n*E\n"})
/* loaded from: classes.dex */
final class DraggableAnchorsElement<T> extends ModifierNodeElement<DraggableAnchorsNode<T>> {

    @k
    private final p<IntSize, Constraints, Pair<DraggableAnchors<T>, T>> anchors;

    @k
    private final Orientation orientation;

    @k
    private final AnchoredDraggableState<T> state;

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableAnchorsElement(@k AnchoredDraggableState<T> anchoredDraggableState, @k p<? super IntSize, ? super Constraints, ? extends Pair<? extends DraggableAnchors<T>, ? extends T>> pVar, @k Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = pVar;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return g0.g(this.state, draggableAnchorsElement.state) && this.anchors == draggableAnchorsElement.anchors && this.orientation == draggableAnchorsElement.orientation;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((this.state.hashCode() * 31) + this.anchors.hashCode()) * 31) + this.orientation.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            new x00.l<InspectorInfo, g2>() { // from class: androidx.compose.material.DraggableAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo2) {
                    invoke2(inspectorInfo2);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@k InspectorInfo inspectorInfo2) {
                    AnchoredDraggableState anchoredDraggableState;
                    p pVar;
                    Orientation orientation;
                    ValueElementSequence properties = inspectorInfo2.getProperties();
                    anchoredDraggableState = DraggableAnchorsElement.this.state;
                    properties.set("state", anchoredDraggableState);
                    ValueElementSequence properties2 = inspectorInfo2.getProperties();
                    pVar = DraggableAnchorsElement.this.anchors;
                    properties2.set("anchors", pVar);
                    ValueElementSequence properties3 = inspectorInfo2.getProperties();
                    orientation = DraggableAnchorsElement.this.orientation;
                    properties3.set("orientation", orientation);
                }
            };
        } else {
            InspectableValueKt.getNoInspectorInfo();
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public DraggableAnchorsNode<T> create() {
        return new DraggableAnchorsNode<>(this.state, this.anchors, this.orientation);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k DraggableAnchorsNode<T> draggableAnchorsNode) {
        draggableAnchorsNode.setState(this.state);
        draggableAnchorsNode.setAnchors(this.anchors);
        draggableAnchorsNode.setOrientation(this.orientation);
    }
}
