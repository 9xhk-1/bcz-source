package androidx.compose.foundation;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(29)
/* loaded from: classes.dex */
final class ExcludeFromSystemGestureElement extends ModifierNodeElement<ExcludeFromSystemGestureNode> {

    @l
    private final x00.l<LayoutCoordinates, Rect> exclusion;

    /* JADX WARN: Multi-variable type inference failed */
    public ExcludeFromSystemGestureElement(@l x00.l<? super LayoutCoordinates, Rect> lVar) {
        this.exclusion = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        return (obj instanceof ExcludeFromSystemGestureElement) && this.exclusion == ((ExcludeFromSystemGestureElement) obj).exclusion;
    }

    @l
    public final x00.l<LayoutCoordinates, Rect> getExclusion() {
        return this.exclusion;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        x00.l<LayoutCoordinates, Rect> lVar = this.exclusion;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("systemGestureExclusion");
        if (this.exclusion != null) {
            inspectorInfo.getProperties().set("exclusion", this.exclusion);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @SuppressLint({"NewApi"})
    @m80.k
    public ExcludeFromSystemGestureNode create() {
        return new ExcludeFromSystemGestureNode(this.exclusion);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k ExcludeFromSystemGestureNode excludeFromSystemGestureNode) {
        excludeFromSystemGestureNode.setRect(this.exclusion);
    }
}
