package androidx.compose.ui.node;

import java.util.Comparator;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class DepthSortedSetKt {

    @k
    private static final Comparator<LayoutNode> DepthComparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSetKt$DepthComparator$1
        @Override // java.util.Comparator
        public int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
            int t11 = g0.t(layoutNode.getDepth$ui_release(), layoutNode2.getDepth$ui_release());
            return t11 != 0 ? t11 : g0.t(layoutNode.hashCode(), layoutNode2.hashCode());
        }
    };
}
