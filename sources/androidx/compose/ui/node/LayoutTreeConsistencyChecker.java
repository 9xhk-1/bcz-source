package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l50.b;
import m80.k;
import zr.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n34#2,6:155\n117#2,2:161\n34#2,6:163\n119#2:169\n102#2,2:170\n34#2,6:172\n104#2:178\n117#2,2:179\n34#2,6:181\n119#2:187\n34#2,6:188\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n45#1:155,6\n59#1:161,2\n59#1:163,6\n59#1:169\n86#1:170,2\n86#1:172,6\n86#1:178\n93#1:179,2\n93#1:181,6\n93#1:187\n147#1:188,6\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutTreeConsistencyChecker {
    public static final int $stable = 8;

    @k
    private final List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests;

    @k
    private final DepthSortedSetsForDifferentPasses relayoutNodes;

    @k
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(@k LayoutNode layoutNode, @k DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses, @k List<MeasureAndLayoutDelegate.PostponedRequest> list) {
        this.root = layoutNode;
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.postponedMeasureRequests = list;
    }

    private final boolean consistentLayoutState(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest;
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        MeasureAndLayoutDelegate.PostponedRequest postponedRequest2 = null;
        LayoutNode.LayoutState layoutState$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null;
        if (layoutNode.isPlaced() || (layoutNode.getPlaceOrder$ui_release() != Integer.MAX_VALUE && parent$ui_release != null && parent$ui_release.isPlaced())) {
            if (layoutNode.getMeasurePending$ui_release()) {
                List<MeasureAndLayoutDelegate.PostponedRequest> list = this.postponedMeasureRequests;
                int size = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        postponedRequest = null;
                        break;
                    }
                    postponedRequest = list.get(i11);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest3 = postponedRequest;
                    if (g0.g(postponedRequest3.getNode(), layoutNode) && !postponedRequest3.isLookahead()) {
                        break;
                    }
                    i11++;
                }
                if (postponedRequest != null) {
                    return true;
                }
            }
            if (layoutNode.isDeactivated()) {
                return true;
            }
            if (layoutNode.getMeasurePending$ui_release()) {
                return this.relayoutNodes.contains(layoutNode) || layoutNode.getLayoutState$ui_release() == LayoutNode.LayoutState.LookaheadMeasuring || (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) || ((parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release()) || layoutState$ui_release == LayoutNode.LayoutState.Measuring);
            }
            if (layoutNode.getLayoutPending$ui_release()) {
                if (!this.relayoutNodes.contains(layoutNode) && parent$ui_release != null && !parent$ui_release.getMeasurePending$ui_release() && !parent$ui_release.getLayoutPending$ui_release() && layoutState$ui_release != LayoutNode.LayoutState.Measuring && layoutState$ui_release != LayoutNode.LayoutState.LayingOut) {
                    List<MeasureAndLayoutDelegate.PostponedRequest> list2 = this.postponedMeasureRequests;
                    int size2 = list2.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            if (layoutNode.getLayoutState$ui_release() == LayoutNode.LayoutState.Measuring) {
                                break;
                            }
                            return false;
                        }
                        if (g0.g(list2.get(i12).getNode(), layoutNode)) {
                            break;
                        }
                        i12++;
                    }
                }
                return true;
            }
        }
        if (g0.g(layoutNode.isPlacedInLookahead(), Boolean.TRUE)) {
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                List<MeasureAndLayoutDelegate.PostponedRequest> list3 = this.postponedMeasureRequests;
                int size3 = list3.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        break;
                    }
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest4 = list3.get(i13);
                    MeasureAndLayoutDelegate.PostponedRequest postponedRequest5 = postponedRequest4;
                    if (g0.g(postponedRequest5.getNode(), layoutNode) && postponedRequest5.isLookahead()) {
                        postponedRequest2 = postponedRequest4;
                        break;
                    }
                    i13++;
                }
                if (postponedRequest2 != null) {
                    return true;
                }
            }
            if (layoutNode.getLookaheadMeasurePending$ui_release()) {
                return this.relayoutNodes.contains(layoutNode, true) || (parent$ui_release != null && parent$ui_release.getLookaheadMeasurePending$ui_release()) || layoutState$ui_release == LayoutNode.LayoutState.LookaheadMeasuring || (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release() && g0.g(layoutNode.getLookaheadRoot$ui_release(), layoutNode));
            }
            if (layoutNode.getLookaheadLayoutPending$ui_release() && !this.relayoutNodes.contains(layoutNode, true) && parent$ui_release != null && !parent$ui_release.getLookaheadMeasurePending$ui_release() && !parent$ui_release.getLookaheadLayoutPending$ui_release() && layoutState$ui_release != LayoutNode.LayoutState.LookaheadMeasuring && layoutState$ui_release != LayoutNode.LayoutState.LookaheadLayingOut && (!parent$ui_release.getLayoutPending$ui_release() || !g0.g(layoutNode.getLookaheadRoot$ui_release(), layoutNode))) {
                return false;
            }
        }
        return true;
    }

    private final boolean isTreeConsistent(LayoutNode layoutNode) {
        if (!consistentLayoutState(layoutNode)) {
            return false;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (!isTreeConsistent(children$ui_release.get(i11))) {
                return false;
            }
        }
        return true;
    }

    private final String logTree() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        g0.o(sb2, "append(...)");
        sb2.append('\n');
        g0.o(sb2, "append(...)");
        logTree$printSubTree(this, sb2, this.root, 0);
        return sb2.toString();
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb2, LayoutNode layoutNode, int i11) {
        String nodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        if (nodeToString.length() > 0) {
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append(m.f102856e);
            }
            sb2.append(nodeToString);
            g0.o(sb2, "append(...)");
            sb2.append('\n');
            g0.o(sb2, "append(...)");
            i11++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i13 = 0; i13 < size; i13++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb2, children$ui_release.get(i13), i11);
        }
    }

    private final String nodeToString(LayoutNode layoutNode) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(layoutNode);
        StringBuilder sb3 = new StringBuilder();
        sb3.append('[');
        sb3.append(layoutNode.getLayoutState$ui_release());
        sb3.append(b.f69930l);
        sb2.append(sb3.toString());
        if (!layoutNode.isPlaced()) {
            sb2.append("[!isPlaced]");
        }
        sb2.append("[measuredByParent=" + layoutNode.getMeasuredByParent$ui_release() + b.f69930l);
        if (!consistentLayoutState(layoutNode)) {
            sb2.append("[INCONSISTENT]");
        }
        return sb2.toString();
    }

    public final void assertConsistent() {
        if (isTreeConsistent(this.root)) {
            return;
        }
        System.out.println((Object) logTree());
        throw new IllegalStateException("Inconsistency found!");
    }
}
