package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.Measurable;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,497:1\n210#2:498\n435#3,9:499\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n390#1:498\n390#1:499,9\n*E\n"})
/* loaded from: classes2.dex */
public final class LayoutNodeLayoutDelegateKt {

    @k
    public static final String MeasuredTwiceErrorMessage = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final boolean isOutMostLookaheadRoot(@k LayoutNode layoutNode) {
        if (layoutNode.getLookaheadRoot$ui_release() == null) {
            return false;
        }
        LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
        return (parent$ui_release != null ? parent$ui_release.getLookaheadRoot$ui_release() : null) == null || layoutNode.getLayoutDelegate$ui_release().getDetachedFromParentLookaheadPass$ui_release();
    }

    public static final <T extends Measurable> void updateChildMeasurables(@k LayoutNode layoutNode, @k MutableVector<T> mutableVector, @k l<? super LayoutNode, ? extends T> lVar) {
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
        LayoutNode[] layoutNodeArr = mutableVector2.content;
        int size = mutableVector2.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutNode layoutNode2 = layoutNodeArr[i11];
            if (mutableVector.getSize() <= i11) {
                mutableVector.add(lVar.invoke(layoutNode2));
            } else {
                mutableVector.set(i11, lVar.invoke(layoutNode2));
            }
        }
        mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
    }
}
