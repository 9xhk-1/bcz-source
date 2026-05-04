package androidx.compose.ui.platform;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class TestTagNode extends Modifier.Node implements SemanticsModifierNode {

    @m80.k
    private String tag;

    public TestTagNode(@m80.k String str) {
        this.tag = str;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@m80.k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, this.tag);
    }

    @m80.k
    public final String getTag() {
        return this.tag;
    }

    public final void setTag(@m80.k String str) {
        this.tag = str;
    }
}
