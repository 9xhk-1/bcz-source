package androidx.compose.ui.focus;

import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class InvalidateSemantics {

    @k
    public static final InvalidateSemantics INSTANCE = new InvalidateSemantics();

    private InvalidateSemantics() {
    }

    public final void onDispatchEventsCompleted(@k FocusTargetNode focusTargetNode) {
        Object node = focusTargetNode.getNode();
        SemanticsModifierNode semanticsModifierNode = node instanceof SemanticsModifierNode ? (SemanticsModifierNode) node : null;
        if (semanticsModifierNode != null) {
            SemanticsModifierNodeKt.invalidateSemantics(semanticsModifierNode);
        }
    }
}
