package androidx.compose.ui.input.key;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SoftKeyboardInterceptionElement extends ModifierNodeElement<InterceptedKeyInputNode> {

    @l
    private final x00.l<KeyEvent, Boolean> onKeyEvent;

    @l
    private final x00.l<KeyEvent, Boolean> onPreKeyEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public SoftKeyboardInterceptionElement(@l x00.l<? super KeyEvent, Boolean> lVar, @l x00.l<? super KeyEvent, Boolean> lVar2) {
        this.onKeyEvent = lVar;
        this.onPreKeyEvent = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SoftKeyboardInterceptionElement copy$default(SoftKeyboardInterceptionElement softKeyboardInterceptionElement, x00.l lVar, x00.l lVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = softKeyboardInterceptionElement.onKeyEvent;
        }
        if ((i11 & 2) != 0) {
            lVar2 = softKeyboardInterceptionElement.onPreKeyEvent;
        }
        return softKeyboardInterceptionElement.copy(lVar, lVar2);
    }

    @l
    public final x00.l<KeyEvent, Boolean> component1() {
        return this.onKeyEvent;
    }

    @l
    public final x00.l<KeyEvent, Boolean> component2() {
        return this.onPreKeyEvent;
    }

    @k
    public final SoftKeyboardInterceptionElement copy(@l x00.l<? super KeyEvent, Boolean> lVar, @l x00.l<? super KeyEvent, Boolean> lVar2) {
        return new SoftKeyboardInterceptionElement(lVar, lVar2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SoftKeyboardInterceptionElement)) {
            return false;
        }
        SoftKeyboardInterceptionElement softKeyboardInterceptionElement = (SoftKeyboardInterceptionElement) obj;
        return g0.g(this.onKeyEvent, softKeyboardInterceptionElement.onKeyEvent) && g0.g(this.onPreKeyEvent, softKeyboardInterceptionElement.onPreKeyEvent);
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
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        x00.l<KeyEvent, Boolean> lVar2 = this.onPreKeyEvent;
        return hashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        x00.l<KeyEvent, Boolean> lVar = this.onKeyEvent;
        if (lVar != null) {
            inspectorInfo.setName("onKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onKeyToSoftKeyboardInterceptedEvent", lVar);
        }
        x00.l<KeyEvent, Boolean> lVar2 = this.onPreKeyEvent;
        if (lVar2 != null) {
            inspectorInfo.setName("onPreKeyToSoftKeyboardInterceptedEvent");
            inspectorInfo.getProperties().set("onPreKeyToSoftKeyboardInterceptedEvent", lVar2);
        }
    }

    @k
    public String toString() {
        return "SoftKeyboardInterceptionElement(onKeyEvent=" + this.onKeyEvent + ", onPreKeyEvent=" + this.onPreKeyEvent + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public InterceptedKeyInputNode create() {
        return new InterceptedKeyInputNode(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k InterceptedKeyInputNode interceptedKeyInputNode) {
        interceptedKeyInputNode.setOnEvent(this.onKeyEvent);
        interceptedKeyInputNode.setOnPreEvent(this.onPreKeyEvent);
    }
}
