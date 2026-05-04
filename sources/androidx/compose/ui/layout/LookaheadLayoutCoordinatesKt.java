package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LookaheadLayoutCoordinatesKt {
    @k
    public static final LookaheadDelegate getRootLookaheadDelegate(@k LookaheadDelegate lookaheadDelegate) {
        LayoutNode layoutNode = lookaheadDelegate.getLayoutNode();
        while (true) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if ((parent$ui_release != null ? parent$ui_release.getLookaheadRoot$ui_release() : null) == null) {
                LookaheadDelegate lookaheadDelegate2 = layoutNode.getOuterCoordinator$ui_release().getLookaheadDelegate();
                g0.m(lookaheadDelegate2);
                return lookaheadDelegate2;
            }
            LayoutNode parent$ui_release2 = layoutNode.getParent$ui_release();
            LayoutNode lookaheadRoot$ui_release = parent$ui_release2 != null ? parent$ui_release2.getLookaheadRoot$ui_release() : null;
            g0.m(lookaheadRoot$ui_release);
            if (lookaheadRoot$ui_release.isVirtualLookaheadRoot$ui_release()) {
                layoutNode = layoutNode.getParent$ui_release();
                g0.m(layoutNode);
            } else {
                LayoutNode parent$ui_release3 = layoutNode.getParent$ui_release();
                g0.m(parent$ui_release3);
                layoutNode = parent$ui_release3.getLookaheadRoot$ui_release();
                g0.m(layoutNode);
            }
        }
    }
}
