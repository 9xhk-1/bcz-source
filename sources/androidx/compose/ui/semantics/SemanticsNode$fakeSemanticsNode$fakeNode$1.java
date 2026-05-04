package androidx.compose.ui.semantics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SemanticsNode$fakeSemanticsNode$fakeNode$1 extends Modifier.Node implements SemanticsModifierNode {
    final /* synthetic */ l<SemanticsPropertyReceiver, g2> $properties;

    /* JADX WARN: Multi-variable type inference failed */
    public SemanticsNode$fakeSemanticsNode$fakeNode$1(l<? super SemanticsPropertyReceiver, g2> lVar) {
        this.$properties = lVar;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.$properties.invoke(semanticsPropertyReceiver);
    }
}
