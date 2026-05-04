package androidx.compose.foundation;

import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(33)
/* loaded from: classes.dex */
final class PreferKeepClearElement extends ModifierNodeElement<PreferKeepClearNode> {

    @l
    private final x00.l<LayoutCoordinates, Rect> clearRect;

    /* JADX WARN: Multi-variable type inference failed */
    public PreferKeepClearElement(@l x00.l<? super LayoutCoordinates, Rect> lVar) {
        this.clearRect = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        return (obj instanceof PreferKeepClearNode) && this.clearRect == ((PreferKeepClearNode) obj).getRect();
    }

    @l
    public final x00.l<LayoutCoordinates, Rect> getClearRect() {
        return this.clearRect;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        x00.l<LayoutCoordinates, Rect> lVar = this.clearRect;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@m80.k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("preferKeepClearBounds");
        if (this.clearRect != null) {
            inspectorInfo.getProperties().set("clearRect", this.clearRect);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @m80.k
    public PreferKeepClearNode create() {
        return new PreferKeepClearNode(this.clearRect);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@m80.k PreferKeepClearNode preferKeepClearNode) {
        preferKeepClearNode.setRect(this.clearRect);
    }
}
