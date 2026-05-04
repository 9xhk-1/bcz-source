package androidx.compose.ui.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class LayoutIdElement extends ModifierNodeElement<LayoutIdModifier> {

    @k
    private final Object layoutId;

    public LayoutIdElement(@k Object obj) {
        this.layoutId = obj;
    }

    private final Object component1() {
        return this.layoutId;
    }

    public static /* synthetic */ LayoutIdElement copy$default(LayoutIdElement layoutIdElement, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = layoutIdElement.layoutId;
        }
        return layoutIdElement.copy(obj);
    }

    @k
    public final LayoutIdElement copy(@k Object obj) {
        return new LayoutIdElement(obj);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && g0.g(this.layoutId, ((LayoutIdElement) obj).layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.layoutId.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layoutId");
        inspectorInfo.setValue(this.layoutId);
    }

    @k
    public String toString() {
        return "LayoutIdElement(layoutId=" + this.layoutId + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public LayoutIdModifier create() {
        return new LayoutIdModifier(this.layoutId);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k LayoutIdModifier layoutIdModifier) {
        layoutIdModifier.setLayoutId$ui_release(this.layoutId);
    }
}
