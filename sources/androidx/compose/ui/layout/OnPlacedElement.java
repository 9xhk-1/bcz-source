package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OnPlacedElement extends ModifierNodeElement<OnPlacedNode> {

    @k
    private final l<LayoutCoordinates, g2> onPlaced;

    /* JADX WARN: Multi-variable type inference failed */
    public OnPlacedElement(@k l<? super LayoutCoordinates, g2> lVar) {
        this.onPlaced = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnPlacedElement copy$default(OnPlacedElement onPlacedElement, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = onPlacedElement.onPlaced;
        }
        return onPlacedElement.copy(lVar);
    }

    @k
    public final l<LayoutCoordinates, g2> component1() {
        return this.onPlaced;
    }

    @k
    public final OnPlacedElement copy(@k l<? super LayoutCoordinates, g2> lVar) {
        return new OnPlacedElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && g0.g(this.onPlaced, ((OnPlacedElement) obj).onPlaced);
    }

    @k
    public final l<LayoutCoordinates, g2> getOnPlaced() {
        return this.onPlaced;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onPlaced.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onPlaced");
        inspectorInfo.getProperties().set("onPlaced", this.onPlaced);
    }

    @k
    public String toString() {
        return "OnPlacedElement(onPlaced=" + this.onPlaced + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public OnPlacedNode create() {
        return new OnPlacedNode(this.onPlaced);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k OnPlacedNode onPlacedNode) {
        onPlacedNode.setCallback(this.onPlaced);
    }
}
