package androidx.compose.ui.spatial;

import android.annotation.SuppressLint;
import androidx.compose.ui.node.ModifierNodeElement;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ModifierNodeInspectableProperties"})
/* loaded from: classes2.dex */
final class RectListDebuggerModifierElement extends ModifierNodeElement<RectListDebuggerModifierNode> {

    @k
    public static final RectListDebuggerModifierElement INSTANCE = new RectListDebuggerModifierElement();

    private RectListDebuggerModifierElement() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return 123;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k RectListDebuggerModifierNode rectListDebuggerModifierNode) {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public RectListDebuggerModifierNode create() {
        return new RectListDebuggerModifierNode();
    }
}
