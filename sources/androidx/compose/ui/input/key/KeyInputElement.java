package androidx.compose.ui.input.key;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class KeyInputElement extends ModifierNodeElement<KeyInputNode> {

    @l
    private final x00.l<KeyEvent, Boolean> onKeyEvent;

    @l
    private final x00.l<KeyEvent, Boolean> onPreKeyEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyInputElement(@l x00.l<? super KeyEvent, Boolean> lVar, @l x00.l<? super KeyEvent, Boolean> lVar2) {
        this.onKeyEvent = lVar;
        this.onPreKeyEvent = lVar2;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.onKeyEvent == keyInputElement.onKeyEvent && this.onPreKeyEvent == keyInputElement.onPreKeyEvent;
    }

    @l
    public final x00.l<KeyEvent, Boolean> getOnKeyEvent() {
        return this.onKeyEvent;
    }

    @l
    public final x00.l<KeyEvent, Boolean> getOnPreKeyEvent() {
        return this.onPreKeyEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        x00.l<KeyEvent, Boolean> lVar = this.onKeyEvent;
        int hashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        x00.l<KeyEvent, Boolean> lVar2 = this.onPreKeyEvent;
        return hashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        x00.l<KeyEvent, Boolean> lVar = this.onKeyEvent;
        if (lVar != null) {
            inspectorInfo.setName("onKeyEvent");
            inspectorInfo.getProperties().set("onKeyEvent", lVar);
        }
        x00.l<KeyEvent, Boolean> lVar2 = this.onPreKeyEvent;
        if (lVar2 != null) {
            inspectorInfo.setName("onPreviewKeyEvent");
            inspectorInfo.getProperties().set("onPreviewKeyEvent", lVar2);
        }
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public KeyInputNode create() {
        return new KeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k KeyInputNode keyInputNode) {
        keyInputNode.setOnEvent(this.onKeyEvent);
        keyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
