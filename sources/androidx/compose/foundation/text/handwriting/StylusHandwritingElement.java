package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class StylusHandwritingElement extends ModifierNodeElement<StylusHandwritingNode> {

    @k
    private final a<g2> onHandwritingSlopExceeded;

    public StylusHandwritingElement(@k a<g2> aVar) {
        this.onHandwritingSlopExceeded = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StylusHandwritingElement copy$default(StylusHandwritingElement stylusHandwritingElement, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = stylusHandwritingElement.onHandwritingSlopExceeded;
        }
        return stylusHandwritingElement.copy(aVar);
    }

    @k
    public final a<g2> component1() {
        return this.onHandwritingSlopExceeded;
    }

    @k
    public final StylusHandwritingElement copy(@k a<g2> aVar) {
        return new StylusHandwritingElement(aVar);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElement) && g0.g(this.onHandwritingSlopExceeded, ((StylusHandwritingElement) obj).onHandwritingSlopExceeded);
    }

    @k
    public final a<g2> getOnHandwritingSlopExceeded() {
        return this.onHandwritingSlopExceeded;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onHandwritingSlopExceeded.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("stylusHandwriting");
        inspectorInfo.getProperties().set("onHandwritingSlopExceeded", this.onHandwritingSlopExceeded);
    }

    @k
    public String toString() {
        return "StylusHandwritingElement(onHandwritingSlopExceeded=" + this.onHandwritingSlopExceeded + ')';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public StylusHandwritingNode create() {
        return new StylusHandwritingNode(this.onHandwritingSlopExceeded);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k StylusHandwritingNode stylusHandwritingNode) {
        stylusHandwritingNode.setOnHandwritingSlopExceeded(this.onHandwritingSlopExceeded);
    }
}
