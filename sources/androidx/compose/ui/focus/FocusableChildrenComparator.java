package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import java.util.Comparator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,280:1\n44#2:281\n472#2:282\n472#2:283\n1101#3:284\n1083#3,2:285\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/FocusableChildrenComparator\n*L\n259#1:281\n263#1:282\n264#1:283\n271#1:284\n271#1:285,2\n*E\n"})
/* loaded from: classes.dex */
final class FocusableChildrenComparator implements Comparator<FocusTargetNode> {

    @k
    public static final FocusableChildrenComparator INSTANCE = new FocusableChildrenComparator();

    private FocusableChildrenComparator() {
    }

    private final MutableVector<LayoutNode> pathFromRoot(LayoutNode layoutNode) {
        MutableVector<LayoutNode> mutableVector = new MutableVector<>(new LayoutNode[16], 0);
        while (layoutNode != null) {
            mutableVector.add(0, layoutNode);
            layoutNode = layoutNode.getParent$ui_release();
        }
        return mutableVector;
    }

    @Override // java.util.Comparator
    public int compare(@k FocusTargetNode focusTargetNode, @k FocusTargetNode focusTargetNode2) {
        int i11 = 0;
        if (!FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode) || !FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2)) {
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode)) {
                return -1;
            }
            return FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) ? 1 : 0;
        }
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        LayoutNode requireLayoutNode2 = DelegatableNodeKt.requireLayoutNode(focusTargetNode2);
        if (g0.g(requireLayoutNode, requireLayoutNode2)) {
            return 0;
        }
        MutableVector<LayoutNode> pathFromRoot = pathFromRoot(requireLayoutNode);
        MutableVector<LayoutNode> pathFromRoot2 = pathFromRoot(requireLayoutNode2);
        int min = Math.min(pathFromRoot.getSize() - 1, pathFromRoot2.getSize() - 1);
        if (min >= 0) {
            while (g0.g(pathFromRoot.content[i11], pathFromRoot2.content[i11])) {
                if (i11 != min) {
                    i11++;
                }
            }
            return g0.t(pathFromRoot.content[i11].getPlaceOrder$ui_release(), pathFromRoot2.content[i11].getPlaceOrder$ui_release());
        }
        throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
    }
}
