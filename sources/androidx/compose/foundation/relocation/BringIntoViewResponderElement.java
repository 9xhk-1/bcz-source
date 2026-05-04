package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class BringIntoViewResponderElement extends ModifierNodeElement<BringIntoViewResponderNode> {

    @k
    private final BringIntoViewResponder responder;

    public BringIntoViewResponderElement(@k BringIntoViewResponder bringIntoViewResponder) {
        this.responder = bringIntoViewResponder;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewResponderElement) && g0.g(this.responder, ((BringIntoViewResponderElement) obj).responder);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.responder.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("bringIntoViewResponder");
        inspectorInfo.getProperties().set("responder", this.responder);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public BringIntoViewResponderNode create() {
        return new BringIntoViewResponderNode(this.responder);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k BringIntoViewResponderNode bringIntoViewResponderNode) {
        bringIntoViewResponderNode.setResponder(this.responder);
    }
}
