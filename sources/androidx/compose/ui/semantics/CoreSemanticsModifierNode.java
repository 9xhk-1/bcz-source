package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CoreSemanticsModifierNode extends Modifier.Node implements SemanticsModifierNode {
    public static final int $stable = 8;
    private boolean isClearingSemantics;
    private boolean mergeDescendants;

    @k
    private l<? super SemanticsPropertyReceiver, g2> properties;

    public CoreSemanticsModifierNode(boolean z11, boolean z12, @k l<? super SemanticsPropertyReceiver, g2> lVar) {
        this.mergeDescendants = z11;
        this.isClearingSemantics = z12;
        this.properties = lVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.properties.invoke(semanticsPropertyReceiver);
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    @k
    public final l<SemanticsPropertyReceiver, g2> getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldClearDescendantSemantics() {
        return this.isClearingSemantics;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return this.mergeDescendants;
    }

    public final boolean isClearingSemantics() {
        return this.isClearingSemantics;
    }

    public final void setClearingSemantics(boolean z11) {
        this.isClearingSemantics = z11;
    }

    public final void setMergeDescendants(boolean z11) {
        this.mergeDescendants = z11;
    }

    public final void setProperties(@k l<? super SemanticsPropertyReceiver, g2> lVar) {
        this.properties = lVar;
    }
}
