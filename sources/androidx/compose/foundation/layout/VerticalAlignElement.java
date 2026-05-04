package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class VerticalAlignElement extends ModifierNodeElement<VerticalAlignNode> {
    public static final int $stable = 0;

    @m80.k
    private final Alignment.Vertical alignment;

    public VerticalAlignElement(@m80.k Alignment.Vertical vertical) {
        this.alignment = vertical;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return g0.g(this.alignment, verticalAlignElement.alignment);
    }

    @m80.k
    public final Alignment.Vertical getAlignment() {
        return this.alignment;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.alignment.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("align");
        inspectorInfo.setValue(this.alignment);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public VerticalAlignNode create() {
        return new VerticalAlignNode(this.alignment);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k VerticalAlignNode verticalAlignNode) {
        verticalAlignNode.setVertical(this.alignment);
    }
}
