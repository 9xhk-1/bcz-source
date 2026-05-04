package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNode;
import kotlin.DeprecationLevel;
import m80.k;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface FocusTargetModifierNode extends DelegatableNode {
    /* renamed from: requestFocus-3ESFkO8$default, reason: not valid java name */
    static /* synthetic */ boolean m2181requestFocus3ESFkO8$default(FocusTargetModifierNode focusTargetModifierNode, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i12 & 1) != 0) {
            i11 = FocusDirection.Companion.m2157getEnterdhqQ8s();
        }
        return focusTargetModifierNode.mo2183requestFocus3ESFkO8(i11);
    }

    @k
    FocusState getFocusState();

    /* renamed from: getFocusability-LCbbffg, reason: not valid java name */
    int mo2182getFocusabilityLCbbffg();

    @n(level = DeprecationLevel.HIDDEN, message = "Use the version accepting FocusDirection", replaceWith = @w0(expression = "this.requestFocus()", imports = {}))
    /* synthetic */ boolean requestFocus();

    /* renamed from: requestFocus-3ESFkO8, reason: not valid java name */
    boolean mo2183requestFocus3ESFkO8(int i11);

    /* renamed from: setFocusability-josRg5g, reason: not valid java name */
    void mo2184setFocusabilityjosRg5g(int i11);
}
