package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FocusEventElement extends ModifierNodeElement<FocusEventNode> {

    @k
    private final l<FocusState, g2> onFocusEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusEventElement(@k l<? super FocusState, g2> lVar) {
        this.onFocusEvent = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FocusEventElement copy$default(FocusEventElement focusEventElement, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = focusEventElement.onFocusEvent;
        }
        return focusEventElement.copy(lVar);
    }

    @k
    public final l<FocusState, g2> component1() {
        return this.onFocusEvent;
    }

    @k
    public final FocusEventElement copy(@k l<? super FocusState, g2> lVar) {
        return new FocusEventElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusEventElement) && g0.g(this.onFocusEvent, ((FocusEventElement) obj).onFocusEvent);
    }

    @k
    public final l<FocusState, g2> getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusEvent.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusEvent");
        inspectorInfo.getProperties().set("onFocusEvent", this.onFocusEvent);
    }

    @k
    public String toString() {
        return "FocusEventElement(onFocusEvent=" + this.onFocusEvent + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public FocusEventNode create() {
        return new FocusEventNode(this.onFocusEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k FocusEventNode focusEventNode) {
        focusEventNode.setOnFocusEvent(this.onFocusEvent);
    }
}
