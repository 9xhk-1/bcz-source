package androidx.compose.ui;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SensitiveNodeElement extends ModifierNodeElement<SensitiveContentNode> {
    private final boolean isContentSensitive;

    public SensitiveNodeElement(boolean z11) {
        this.isContentSensitive = z11;
    }

    public static /* synthetic */ SensitiveNodeElement copy$default(SensitiveNodeElement sensitiveNodeElement, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = sensitiveNodeElement.isContentSensitive;
        }
        return sensitiveNodeElement.copy(z11);
    }

    public final boolean component1() {
        return this.isContentSensitive;
    }

    @k
    public final SensitiveNodeElement copy(boolean z11) {
        return new SensitiveNodeElement(z11);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveNodeElement) && this.isContentSensitive == ((SensitiveNodeElement) obj).isContentSensitive;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.isContentSensitive);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sensitiveContent");
        inspectorInfo.getProperties().set("isContentSensitive", Boolean.valueOf(this.isContentSensitive));
    }

    public final boolean isContentSensitive() {
        return this.isContentSensitive;
    }

    @k
    public String toString() {
        return "SensitiveNodeElement(isContentSensitive=" + this.isContentSensitive + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public SensitiveContentNode create() {
        return new SensitiveContentNode(this.isContentSensitive);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k SensitiveContentNode sensitiveContentNode) {
        sensitiveContentNode.setContentSensitive(this.isContentSensitive);
    }
}
