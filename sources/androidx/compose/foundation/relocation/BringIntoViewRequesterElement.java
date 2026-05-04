package androidx.compose.foundation.relocation;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class BringIntoViewRequesterElement extends ModifierNodeElement<BringIntoViewRequesterNode> {

    @k
    private final BringIntoViewRequester requester;

    public BringIntoViewRequesterElement(@k BringIntoViewRequester bringIntoViewRequester) {
        this.requester = bringIntoViewRequester;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this != obj) {
            return (obj instanceof BringIntoViewRequesterElement) && g0.g(this.requester, ((BringIntoViewRequesterElement) obj).requester);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.requester.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("bringIntoViewRequester");
        inspectorInfo.getProperties().set("bringIntoViewRequester", this.requester);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public BringIntoViewRequesterNode create() {
        return new BringIntoViewRequesterNode(this.requester);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k BringIntoViewRequesterNode bringIntoViewRequesterNode) {
        bringIntoViewRequesterNode.updateRequester(this.requester);
    }
}
