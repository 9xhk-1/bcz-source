package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FocusPropertiesElement extends ModifierNodeElement<FocusPropertiesNode> {

    @k
    private final FocusPropertiesScope scope;

    public FocusPropertiesElement(@k FocusPropertiesScope focusPropertiesScope) {
        this.scope = focusPropertiesScope;
    }

    public static /* synthetic */ FocusPropertiesElement copy$default(FocusPropertiesElement focusPropertiesElement, FocusPropertiesScope focusPropertiesScope, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            focusPropertiesScope = focusPropertiesElement.scope;
        }
        return focusPropertiesElement.copy(focusPropertiesScope);
    }

    @k
    public final FocusPropertiesScope component1() {
        return this.scope;
    }

    @k
    public final FocusPropertiesElement copy(@k FocusPropertiesScope focusPropertiesScope) {
        return new FocusPropertiesElement(focusPropertiesScope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && g0.g(this.scope, ((FocusPropertiesElement) obj).scope);
    }

    @k
    public final FocusPropertiesScope getScope() {
        return this.scope;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.scope.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusProperties");
        inspectorInfo.getProperties().set("scope", this.scope);
    }

    @k
    public String toString() {
        return "FocusPropertiesElement(scope=" + this.scope + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public FocusPropertiesNode create() {
        return new FocusPropertiesNode(this.scope);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k FocusPropertiesNode focusPropertiesNode) {
        focusPropertiesNode.setFocusPropertiesScope(this.scope);
    }
}
