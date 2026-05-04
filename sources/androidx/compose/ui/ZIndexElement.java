package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ZIndexElement extends ModifierNodeElement<ZIndexNode> {
    public static final int $stable = 0;
    private final float zIndex;

    public ZIndexElement(float f11) {
        this.zIndex = f11;
    }

    public static /* synthetic */ ZIndexElement copy$default(ZIndexElement zIndexElement, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = zIndexElement.zIndex;
        }
        return zIndexElement.copy(f11);
    }

    public final float component1() {
        return this.zIndex;
    }

    @k
    public final ZIndexElement copy(float f11) {
        return new ZIndexElement(f11);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.zIndex, ((ZIndexElement) obj).zIndex) == 0;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.hashCode(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("zIndex");
        inspectorInfo.getProperties().set("zIndex", Float.valueOf(this.zIndex));
    }

    @k
    public String toString() {
        return "ZIndexElement(zIndex=" + this.zIndex + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public ZIndexNode create() {
        return new ZIndexNode(this.zIndex);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k ZIndexNode zIndexNode) {
        zIndexNode.setZIndex(this.zIndex);
    }
}
