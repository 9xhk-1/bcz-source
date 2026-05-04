package androidx.compose.foundation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OverscrollModifierElement extends ModifierNodeElement<OverscrollModifierNode> {

    @l
    private final OverscrollEffect overscrollEffect;

    public OverscrollModifierElement(@l OverscrollEffect overscrollEffect) {
        this.overscrollEffect = overscrollEffect;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverscrollModifierElement) && g0.g(this.overscrollEffect, ((OverscrollModifierElement) obj).overscrollEffect);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect != null) {
            return overscrollEffect.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("overscroll");
        inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public OverscrollModifierNode create() {
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return new OverscrollModifierNode(overscrollEffect != null ? overscrollEffect.getNode() : null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k OverscrollModifierNode overscrollModifierNode) {
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        overscrollModifierNode.update(overscrollEffect != null ? overscrollEffect.getNode() : null);
    }
}
