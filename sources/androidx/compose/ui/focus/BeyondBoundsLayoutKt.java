package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBeyondBoundsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,59:1\n119#2:60\n277#3:61\n247#3,5:62\n90#3:67\n91#3,8:73\n437#3,5:81\n278#3:86\n442#3:87\n447#3,2:89\n449#3,8:94\n457#3,9:105\n466#3,8:117\n100#3,7:125\n280#3:132\n56#4,5:68\n246#5:88\n240#6,3:91\n243#6,3:114\n1101#7:102\n1083#7,2:103\n*S KotlinDebug\n*F\n+ 1 BeyondBoundsLayout.kt\nandroidx/compose/ui/focus/BeyondBoundsLayoutKt\n*L\n39#1:60\n39#1:61\n39#1:62,5\n39#1:67\n39#1:73,8\n39#1:81,5\n39#1:86\n39#1:87\n39#1:89,2\n39#1:94,8\n39#1:105,9\n39#1:117,8\n39#1:125,7\n39#1:132\n39#1:68,5\n39#1:88\n39#1:91,3\n39#1:114,3\n39#1:102\n39#1:103,2\n*E\n"})
/* loaded from: classes.dex */
public final class BeyondBoundsLayoutKt {
    @l
    /* renamed from: searchBeyondBounds--OM-vw8, reason: not valid java name */
    public static final <T> T m2147searchBeyondBoundsOMvw8(@k FocusTargetNode focusTargetNode, int i11, @k x00.l<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> lVar) {
        Modifier.Node node;
        BeyondBoundsLayout beyondBoundsLayoutParent;
        int m3845getBeforehoxUOeE;
        NodeChain nodes$ui_release;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            if (requireLayoutNode == null) {
                node = null;
                break;
            }
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        node = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                break loop0;
                            }
                            if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i12 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
        if ((focusTargetNode2 != null && g0.g(focusTargetNode2.getBeyondBoundsLayoutParent(), focusTargetNode.getBeyondBoundsLayoutParent())) || (beyondBoundsLayoutParent = focusTargetNode.getBeyondBoundsLayoutParent()) == null) {
            return null;
        }
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2163getUpdhqQ8s())) {
            m3845getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m3843getAbovehoxUOeE();
        } else if (FocusDirection.m2152equalsimpl0(i11, companion.m2156getDowndhqQ8s())) {
            m3845getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m3846getBelowhoxUOeE();
        } else if (FocusDirection.m2152equalsimpl0(i11, companion.m2159getLeftdhqQ8s())) {
            m3845getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m3847getLefthoxUOeE();
        } else if (FocusDirection.m2152equalsimpl0(i11, companion.m2162getRightdhqQ8s())) {
            m3845getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m3848getRighthoxUOeE();
        } else if (FocusDirection.m2152equalsimpl0(i11, companion.m2160getNextdhqQ8s())) {
            m3845getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m3844getAfterhoxUOeE();
        } else {
            if (!FocusDirection.m2152equalsimpl0(i11, companion.m2161getPreviousdhqQ8s())) {
                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
            }
            m3845getBeforehoxUOeE = BeyondBoundsLayout.LayoutDirection.Companion.m3845getBeforehoxUOeE();
        }
        return (T) beyondBoundsLayoutParent.mo882layouto7g1Pn8(m3845getBeforehoxUOeE, lVar);
    }
}
