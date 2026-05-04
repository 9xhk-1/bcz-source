package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OffsetPxElement extends ModifierNodeElement<OffsetPxNode> {

    @m80.k
    private final l<InspectorInfo, g2> inspectorInfo;

    @m80.k
    private final l<Density, IntOffset> offset;
    private final boolean rtlAware;

    /* JADX WARN: Multi-variable type inference failed */
    public OffsetPxElement(@m80.k l<? super Density, IntOffset> lVar, boolean z11, @m80.k l<? super InspectorInfo, g2> lVar2) {
        this.offset = lVar;
        this.rtlAware = z11;
        this.inspectorInfo = lVar2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.offset == offsetPxElement.offset && this.rtlAware == offsetPxElement.rtlAware;
    }

    @m80.k
    public final l<InspectorInfo, g2> getInspectorInfo() {
        return this.inspectorInfo;
    }

    @m80.k
    public final l<Density, IntOffset> getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.offset.hashCode() * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @m80.k
    public String toString() {
        return "OffsetPxModifier(offset=" + this.offset + ", rtlAware=" + this.rtlAware + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public OffsetPxNode create() {
        return new OffsetPxNode(this.offset, this.rtlAware);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k OffsetPxNode offsetPxNode) {
        offsetPxNode.update(this.offset, this.rtlAware);
    }
}
