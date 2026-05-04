package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FocusChangedElement extends ModifierNodeElement<FocusChangedNode> {

    @k
    private final l<FocusState, g2> onFocusChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusChangedElement(@k l<? super FocusState, g2> lVar) {
        this.onFocusChanged = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FocusChangedElement copy$default(FocusChangedElement focusChangedElement, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = focusChangedElement.onFocusChanged;
        }
        return focusChangedElement.copy(lVar);
    }

    @k
    public final l<FocusState, g2> component1() {
        return this.onFocusChanged;
    }

    @k
    public final FocusChangedElement copy(@k l<? super FocusState, g2> lVar) {
        return new FocusChangedElement(lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusChangedElement) && g0.g(this.onFocusChanged, ((FocusChangedElement) obj).onFocusChanged);
    }

    @k
    public final l<FocusState, g2> getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusChanged.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusChanged");
        inspectorInfo.getProperties().set("onFocusChanged", this.onFocusChanged);
    }

    @k
    public String toString() {
        return "FocusChangedElement(onFocusChanged=" + this.onFocusChanged + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public FocusChangedNode create() {
        return new FocusChangedNode(this.onFocusChanged);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k FocusChangedNode focusChangedNode) {
        focusChangedNode.setOnFocusChanged(this.onFocusChanged);
    }
}
