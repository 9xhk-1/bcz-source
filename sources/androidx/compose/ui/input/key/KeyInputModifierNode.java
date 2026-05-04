package androidx.compose.ui.input.key;

import androidx.compose.ui.node.DelegatableNode;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface KeyInputModifierNode extends DelegatableNode {
    /* renamed from: onKeyEvent-ZmokQxo */
    boolean mo204onKeyEventZmokQxo(@k android.view.KeyEvent keyEvent);

    /* renamed from: onPreKeyEvent-ZmokQxo */
    boolean mo206onPreKeyEventZmokQxo(@k android.view.KeyEvent keyEvent);
}
