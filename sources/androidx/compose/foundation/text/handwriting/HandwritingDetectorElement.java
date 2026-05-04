package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class HandwritingDetectorElement extends ModifierNodeElement<HandwritingDetectorNode> {

    @k
    private final a<g2> callback;

    public HandwritingDetectorElement(@k a<g2> aVar) {
        this.callback = aVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        boolean z11 = false;
        boolean z12 = this == obj;
        if ((obj instanceof HandwritingDetectorElement) && this.callback == ((HandwritingDetectorElement) obj).callback) {
            z11 = true;
        }
        return z12 | z11;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.callback.hashCode() * 31;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("handwritingDetector");
        inspectorInfo.getProperties().set("callback", this.callback);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public HandwritingDetectorNode create() {
        return new HandwritingDetectorNode(this.callback);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k HandwritingDetectorNode handwritingDetectorNode) {
        handwritingDetectorNode.setCallback(this.callback);
    }
}
