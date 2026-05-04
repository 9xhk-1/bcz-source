package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class InterceptedKeyInputNode extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {

    @l
    private x00.l<? super KeyEvent, Boolean> onEvent;

    @l
    private x00.l<? super KeyEvent, Boolean> onPreEvent;

    public InterceptedKeyInputNode(@l x00.l<? super KeyEvent, Boolean> lVar, @l x00.l<? super KeyEvent, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    @l
    public final x00.l<KeyEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    @l
    public final x00.l<KeyEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo3275onInterceptKeyBeforeSoftKeyboardZmokQxo(@k android.view.KeyEvent keyEvent) {
        x00.l<? super KeyEvent, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return lVar.invoke(KeyEvent.m3571boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    /* renamed from: onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo, reason: not valid java name */
    public boolean mo3276onPreInterceptKeyBeforeSoftKeyboardZmokQxo(@k android.view.KeyEvent keyEvent) {
        x00.l<? super KeyEvent, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.invoke(KeyEvent.m3571boximpl(keyEvent)).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(@l x00.l<? super KeyEvent, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void setOnPreEvent(@l x00.l<? super KeyEvent, Boolean> lVar) {
        this.onPreEvent = lVar;
    }
}
