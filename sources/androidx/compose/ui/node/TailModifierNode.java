package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TailModifierNode extends Modifier.Node {
    public static final int $stable = 8;
    private boolean attachHasBeenRun;

    public TailModifierNode() {
        setAggregateChildKindSet$ui_release(0);
    }

    public final boolean getAttachHasBeenRun() {
        return this.attachHasBeenRun;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        this.attachHasBeenRun = true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        this.attachHasBeenRun = false;
    }

    public final void setAttachHasBeenRun(boolean z11) {
        this.attachHasBeenRun = z11;
    }

    @k
    public String toString() {
        return "<tail>";
    }
}
