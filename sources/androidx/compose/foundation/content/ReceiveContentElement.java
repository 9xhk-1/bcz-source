package androidx.compose.foundation.content;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ReceiveContentElement extends ModifierNodeElement<ReceiveContentNode> {
    public static final int $stable = 0;

    @k
    private final ReceiveContentListener receiveContentListener;

    public ReceiveContentElement(@k ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }

    public static /* synthetic */ ReceiveContentElement copy$default(ReceiveContentElement receiveContentElement, ReceiveContentListener receiveContentListener, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            receiveContentListener = receiveContentElement.receiveContentListener;
        }
        return receiveContentElement.copy(receiveContentListener);
    }

    @k
    public final ReceiveContentListener component1() {
        return this.receiveContentListener;
    }

    @k
    public final ReceiveContentElement copy(@k ReceiveContentListener receiveContentListener) {
        return new ReceiveContentElement(receiveContentListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiveContentElement) && g0.g(this.receiveContentListener, ((ReceiveContentElement) obj).receiveContentListener);
    }

    @k
    public final ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.receiveContentListener.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("receiveContent");
    }

    @k
    public String toString() {
        return "ReceiveContentElement(receiveContentListener=" + this.receiveContentListener + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public ReceiveContentNode create() {
        return new ReceiveContentNode(this.receiveContentListener);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k ReceiveContentNode receiveContentNode) {
        receiveContentNode.updateNode(this.receiveContentListener);
    }
}
