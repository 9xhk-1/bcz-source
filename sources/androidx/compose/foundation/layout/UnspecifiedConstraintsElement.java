package androidx.compose.foundation.layout;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class UnspecifiedConstraintsElement extends ModifierNodeElement<UnspecifiedConstraintsNode> {
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ UnspecifiedConstraintsElement(float f11, float f12, v vVar) {
        this(f11, f12);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return Dp.m5120equalsimpl0(this.minWidth, unspecifiedConstraintsElement.minWidth) && Dp.m5120equalsimpl0(this.minHeight, unspecifiedConstraintsElement.minHeight);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m790getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m791getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return (Dp.m5121hashCodeimpl(this.minWidth) * 31) + Dp.m5121hashCodeimpl(this.minHeight);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("defaultMinSize");
        inspectorInfo.getProperties().set("minWidth", Dp.m5113boximpl(this.minWidth));
        inspectorInfo.getProperties().set("minHeight", Dp.m5113boximpl(this.minHeight));
    }

    public /* synthetic */ UnspecifiedConstraintsElement(float f11, float f12, int i11, v vVar) {
        this((i11 & 1) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f11, (i11 & 2) != 0 ? Dp.Companion.m5135getUnspecifiedD9Ej5fM() : f12, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public UnspecifiedConstraintsNode create() {
        return new UnspecifiedConstraintsNode(this.minWidth, this.minHeight, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k UnspecifiedConstraintsNode unspecifiedConstraintsNode) {
        unspecifiedConstraintsNode.m795setMinWidth0680j_4(this.minWidth);
        unspecifiedConstraintsNode.m794setMinHeight0680j_4(this.minHeight);
    }

    private UnspecifiedConstraintsElement(float f11, float f12) {
        this.minWidth = f11;
        this.minHeight = f12;
    }
}
