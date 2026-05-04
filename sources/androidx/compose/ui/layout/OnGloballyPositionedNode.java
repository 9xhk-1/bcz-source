package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class OnGloballyPositionedNode extends Modifier.Node implements GlobalPositionAwareModifierNode {

    @k
    private l<? super LayoutCoordinates, g2> callback;

    public OnGloballyPositionedNode(@k l<? super LayoutCoordinates, g2> lVar) {
        this.callback = lVar;
    }

    @k
    public final l<LayoutCoordinates, g2> getCallback() {
        return this.callback;
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@k LayoutCoordinates layoutCoordinates) {
        this.callback.invoke(layoutCoordinates);
    }

    public final void setCallback(@k l<? super LayoutCoordinates, g2> lVar) {
        this.callback = lVar;
    }
}
