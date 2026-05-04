package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FocusRestorerElement extends ModifierNodeElement<FocusRestorerNode> {

    @k
    private final FocusRequester fallback;

    public FocusRestorerElement(@k FocusRequester focusRequester) {
        this.fallback = focusRequester;
    }

    public static /* synthetic */ FocusRestorerElement copy$default(FocusRestorerElement focusRestorerElement, FocusRequester focusRequester, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            focusRequester = focusRestorerElement.fallback;
        }
        return focusRestorerElement.copy(focusRequester);
    }

    @k
    public final FocusRequester component1() {
        return this.fallback;
    }

    @k
    public final FocusRestorerElement copy(@k FocusRequester focusRequester) {
        return new FocusRestorerElement(focusRequester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRestorerElement) && g0.g(this.fallback, ((FocusRestorerElement) obj).fallback);
    }

    @k
    public final FocusRequester getFallback() {
        return this.fallback;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.fallback.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusRestorer");
        inspectorInfo.getProperties().set("fallback", this.fallback);
    }

    @k
    public String toString() {
        return "FocusRestorerElement(fallback=" + this.fallback + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public FocusRestorerNode create() {
        return new FocusRestorerNode(this.fallback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k FocusRestorerNode focusRestorerNode) {
        focusRestorerNode.setFallback(this.fallback);
    }
}
