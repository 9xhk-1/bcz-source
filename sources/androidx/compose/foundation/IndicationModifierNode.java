package androidx.compose.foundation;

import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class IndicationModifierNode extends DelegatingNode {

    @m80.k
    private DelegatableNode indicationNode;

    public IndicationModifierNode(@m80.k DelegatableNode delegatableNode) {
        this.indicationNode = delegatableNode;
        delegate(delegatableNode);
    }

    public final void update(@m80.k DelegatableNode delegatableNode) {
        undelegate(this.indicationNode);
        this.indicationNode = delegatableNode;
        delegate(delegatableNode);
    }
}
