package androidx.compose.ui.spatial;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nThrottledCallbacks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,488:1\n83#2:489\n*S KotlinDebug\n*F\n+ 1 ThrottledCallbacks.kt\nandroidx/compose/ui/spatial/ThrottledCallbacksKt\n*L\n459#1:489\n*E\n"})
/* loaded from: classes2.dex */
public final class ThrottledCallbacksKt {
    @l
    /* renamed from: rectInfoFor-Q-MZNJw, reason: not valid java name */
    public static final RelativeLayoutBounds m4366rectInfoForQMZNJw(@k DelegatableNode delegatableNode, long j11, long j12, long j13, long j14, @l float[] fArr) {
        NodeCoordinator m3979requireCoordinator64DMado = DelegatableNodeKt.m3979requireCoordinator64DMado(delegatableNode, NodeKind.m4118constructorimpl(2));
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!requireLayoutNode.isPlaced()) {
            return null;
        }
        if (requireLayoutNode.getOuterCoordinator$ui_release() == m3979requireCoordinator64DMado) {
            return new RelativeLayoutBounds(j11, j12, j13, j14, fArr, delegatableNode, null);
        }
        Rect localBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(requireLayoutNode.getOuterCoordinator$ui_release().getCoordinates(), m3979requireCoordinator64DMado, false, 2, null);
        return new RelativeLayoutBounds(IntOffsetKt.m5260roundk4lQ0M(localBoundingBoxOf$default.m2303getTopLeftF1C5BW0()), IntOffsetKt.m5260roundk4lQ0M(localBoundingBoxOf$default.m2297getBottomRightF1C5BW0()), j13, j14, fArr, delegatableNode, null);
    }
}
