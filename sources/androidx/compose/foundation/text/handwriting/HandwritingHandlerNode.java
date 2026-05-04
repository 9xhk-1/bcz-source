package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.a;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class HandwritingHandlerNode extends Modifier.Node implements FocusEventModifierNode {

    @k
    private final c0 composeImm$delegate = e0.b(LazyThreadSafetyMode.NONE, new a<ComposeInputMethodManager>() { // from class: androidx.compose.foundation.text.handwriting.HandwritingHandlerNode$composeImm$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final ComposeInputMethodManager invoke() {
            return ComposeInputMethodManager_androidKt.ComposeInputMethodManager(DelegatableNode_androidKt.requireView(HandwritingHandlerNode.this));
        }
    });

    @l
    private FocusState focusState;

    /* JADX INFO: Access modifiers changed from: private */
    public final ComposeInputMethodManager getComposeImm() {
        return (ComposeInputMethodManager) this.composeImm$delegate.getValue();
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@k FocusState focusState) {
        if (g0.g(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        if (focusState.getHasFocus()) {
            c40.k.f(getCoroutineScope(), null, null, new HandwritingHandlerNode$onFocusEvent$1(this, null), 3, null);
        }
    }
}
