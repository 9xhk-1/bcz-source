package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.spatial.RelativeLayoutBounds;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class OnLayoutRectChangedModifierKt {
    @Stable
    @k
    public static final Modifier onLayoutRectChanged(@k Modifier modifier, long j11, long j12, @k l<? super RelativeLayoutBounds, g2> lVar) {
        return modifier.then(new OnLayoutRectChangedElement(j11, j12, lVar));
    }

    public static /* synthetic */ Modifier onLayoutRectChanged$default(Modifier modifier, long j11, long j12, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = 64;
        }
        return onLayoutRectChanged(modifier, j13, j12, lVar);
    }

    @k
    public static final DelegatableNode.RegistrationHandle registerOnLayoutRectChanged(@k DelegatableNode delegatableNode, long j11, long j12, @k l<? super RelativeLayoutBounds, g2> lVar) {
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        return LayoutNodeKt.requireOwner(requireLayoutNode).getRectManager().registerOnRectChangedCallback(requireLayoutNode.getSemanticsId(), j11, j12, delegatableNode, lVar);
    }
}
