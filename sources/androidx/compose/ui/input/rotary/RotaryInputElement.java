package androidx.compose.ui.input.rotary;

import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {

    @l
    private final x00.l<RotaryScrollEvent, Boolean> onPreRotaryScrollEvent;

    @l
    private final x00.l<RotaryScrollEvent, Boolean> onRotaryScrollEvent;

    /* JADX WARN: Multi-variable type inference failed */
    public RotaryInputElement(@l x00.l<? super RotaryScrollEvent, Boolean> lVar, @l x00.l<? super RotaryScrollEvent, Boolean> lVar2) {
        this.onRotaryScrollEvent = lVar;
        this.onPreRotaryScrollEvent = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RotaryInputElement copy$default(RotaryInputElement rotaryInputElement, x00.l lVar, x00.l lVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = rotaryInputElement.onRotaryScrollEvent;
        }
        if ((i11 & 2) != 0) {
            lVar2 = rotaryInputElement.onPreRotaryScrollEvent;
        }
        return rotaryInputElement.copy(lVar, lVar2);
    }

    @l
    public final x00.l<RotaryScrollEvent, Boolean> component1() {
        return this.onRotaryScrollEvent;
    }

    @l
    public final x00.l<RotaryScrollEvent, Boolean> component2() {
        return this.onPreRotaryScrollEvent;
    }

    @k
    public final RotaryInputElement copy(@l x00.l<? super RotaryScrollEvent, Boolean> lVar, @l x00.l<? super RotaryScrollEvent, Boolean> lVar2) {
        return new RotaryInputElement(lVar, lVar2);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return g0.g(this.onRotaryScrollEvent, rotaryInputElement.onRotaryScrollEvent) && g0.g(this.onPreRotaryScrollEvent, rotaryInputElement.onPreRotaryScrollEvent);
    }

    @l
    public final x00.l<RotaryScrollEvent, Boolean> getOnPreRotaryScrollEvent() {
        return this.onPreRotaryScrollEvent;
    }

    @l
    public final x00.l<RotaryScrollEvent, Boolean> getOnRotaryScrollEvent() {
        return this.onRotaryScrollEvent;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        x00.l<RotaryScrollEvent, Boolean> lVar = this.onRotaryScrollEvent;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        x00.l<RotaryScrollEvent, Boolean> lVar2 = this.onPreRotaryScrollEvent;
        return hashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        x00.l<RotaryScrollEvent, Boolean> lVar = this.onRotaryScrollEvent;
        if (lVar != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getProperties().set("onRotaryScrollEvent", lVar);
        }
        x00.l<RotaryScrollEvent, Boolean> lVar2 = this.onPreRotaryScrollEvent;
        if (lVar2 != null) {
            inspectorInfo.setName("onPreRotaryScrollEvent");
            inspectorInfo.getProperties().set("onPreRotaryScrollEvent", lVar2);
        }
    }

    @k
    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.onRotaryScrollEvent + ", onPreRotaryScrollEvent=" + this.onPreRotaryScrollEvent + ')';
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public RotaryInputNode create() {
        return new RotaryInputNode(this.onRotaryScrollEvent, this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k RotaryInputNode rotaryInputNode) {
        rotaryInputNode.setOnEvent(this.onRotaryScrollEvent);
        rotaryInputNode.setOnPreEvent(this.onPreRotaryScrollEvent);
    }
}
