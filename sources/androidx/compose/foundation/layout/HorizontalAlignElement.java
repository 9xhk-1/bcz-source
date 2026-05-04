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
public final class HorizontalAlignElement extends ModifierNodeElement<HorizontalAlignNode> {
    public static final int $stable = 0;

    @m80.k
    private final Alignment.Horizontal horizontal;

    public HorizontalAlignElement(@m80.k Alignment.Horizontal horizontal) {
        this.horizontal = horizontal;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return g0.g(this.horizontal, horizontalAlignElement.horizontal);
    }

    @m80.k
    public final Alignment.Horizontal getHorizontal() {
        return this.horizontal;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.horizontal.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("align");
        inspectorInfo.setValue(this.horizontal);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public HorizontalAlignNode create() {
        return new HorizontalAlignNode(this.horizontal);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k HorizontalAlignNode horizontalAlignNode) {
        horizontalAlignNode.setHorizontal(this.horizontal);
    }
}
