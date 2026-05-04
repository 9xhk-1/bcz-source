package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {

    @k
    private l<? super FocusState, g2> onFocusEvent;

    public FocusEventNode(@k l<? super FocusState, g2> lVar) {
        this.onFocusEvent = lVar;
    }

    @k
    public final l<FocusState, g2> getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@k FocusState focusState) {
        this.onFocusEvent.invoke(focusState);
    }

    public final void setOnFocusEvent(@k l<? super FocusState, g2> lVar) {
        this.onFocusEvent = lVar;
    }
}
