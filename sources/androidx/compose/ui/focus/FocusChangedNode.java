package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {

    @l
    private FocusState focusState;

    @k
    private x00.l<? super FocusState, g2> onFocusChanged;

    public FocusChangedNode(@k x00.l<? super FocusState, g2> lVar) {
        this.onFocusChanged = lVar;
    }

    @k
    public final x00.l<FocusState, g2> getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(@k FocusState focusState) {
        if (g0.g(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }

    public final void setOnFocusChanged(@k x00.l<? super FocusState, g2> lVar) {
        this.onFocusChanged = lVar;
    }
}
