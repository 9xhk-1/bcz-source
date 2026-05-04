package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FillCrossAxisSizeElement extends ModifierNodeElement<FillCrossAxisSizeNode> {
    public static final int $stable = 0;
    private final float fraction;

    public FillCrossAxisSizeElement(float f11) {
        this.fraction = f11;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        FillCrossAxisSizeNode fillCrossAxisSizeNode = obj instanceof FillCrossAxisSizeNode ? (FillCrossAxisSizeNode) obj : null;
        return fillCrossAxisSizeNode != null && this.fraction == fillCrossAxisSizeNode.getFraction();
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.hashCode(this.fraction) * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("fraction");
        inspectorInfo.setValue(Float.valueOf(this.fraction));
        inspectorInfo.getProperties().set("fraction", Float.valueOf(this.fraction));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public FillCrossAxisSizeNode create() {
        return new FillCrossAxisSizeNode(this.fraction);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k FillCrossAxisSizeNode fillCrossAxisSizeNode) {
        fillCrossAxisSizeNode.setFraction(this.fraction);
    }
}
