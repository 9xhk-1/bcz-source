package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.v;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SizeElement extends ModifierNodeElement<SizeNode> {
    private final boolean enforceIncoming;

    @m80.k
    private final l<InspectorInfo, g2> inspectorInfo;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeElement(float f11, float f12, float f13, float f14, boolean z11, l lVar, v vVar) {
        this(f11, f12, f13, f14, z11, lVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return Dp.m5120equalsimpl0(this.minWidth, sizeElement.minWidth) && Dp.m5120equalsimpl0(this.minHeight, sizeElement.minHeight) && Dp.m5120equalsimpl0(this.maxWidth, sizeElement.maxWidth) && Dp.m5120equalsimpl0(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((Dp.m5121hashCodeimpl(this.minWidth) * 31) + Dp.m5121hashCodeimpl(this.minHeight)) * 31) + Dp.m5121hashCodeimpl(this.maxWidth)) * 31) + Dp.m5121hashCodeimpl(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public /* synthetic */ SizeElement(float f11, float f12, float f13, float f14, boolean z11, l lVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f11, (i11 & 2) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f12, (i11 & 4) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f13, (i11 & 8) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f14, z11, lVar, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public SizeNode create() {
        return new SizeNode(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k SizeNode sizeNode) {
        sizeNode.m789setMinWidth0680j_4(this.minWidth);
        sizeNode.m788setMinHeight0680j_4(this.minHeight);
        sizeNode.m787setMaxWidth0680j_4(this.maxWidth);
        sizeNode.m786setMaxHeight0680j_4(this.maxHeight);
        sizeNode.setEnforceIncoming(this.enforceIncoming);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SizeElement(float f11, float f12, float f13, float f14, boolean z11, l<? super InspectorInfo, g2> lVar) {
        this.minWidth = f11;
        this.minHeight = f12;
        this.maxWidth = f13;
        this.maxHeight = f14;
        this.enforceIncoming = z11;
        this.inspectorInfo = lVar;
    }
}
