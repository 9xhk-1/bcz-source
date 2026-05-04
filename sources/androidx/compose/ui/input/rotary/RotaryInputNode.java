package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {

    @l
    private x00.l<? super RotaryScrollEvent, Boolean> onEvent;

    @l
    private x00.l<? super RotaryScrollEvent, Boolean> onPreEvent;

    public RotaryInputNode(@l x00.l<? super RotaryScrollEvent, Boolean> lVar, @l x00.l<? super RotaryScrollEvent, Boolean> lVar2) {
        this.onEvent = lVar;
        this.onPreEvent = lVar2;
    }

    @l
    public final x00.l<RotaryScrollEvent, Boolean> getOnEvent() {
        return this.onEvent;
    }

    @l
    public final x00.l<RotaryScrollEvent, Boolean> getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onPreRotaryScrollEvent(@k RotaryScrollEvent rotaryScrollEvent) {
        x00.l<? super RotaryScrollEvent, Boolean> lVar = this.onPreEvent;
        if (lVar != null) {
            return lVar.invoke(rotaryScrollEvent).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public boolean onRotaryScrollEvent(@k RotaryScrollEvent rotaryScrollEvent) {
        x00.l<? super RotaryScrollEvent, Boolean> lVar = this.onEvent;
        if (lVar != null) {
            return lVar.invoke(rotaryScrollEvent).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(@l x00.l<? super RotaryScrollEvent, Boolean> lVar) {
        this.onEvent = lVar;
    }

    public final void setOnPreEvent(@l x00.l<? super RotaryScrollEvent, Boolean> lVar) {
        this.onPreEvent = lVar;
    }
}
