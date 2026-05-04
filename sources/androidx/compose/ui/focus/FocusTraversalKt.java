package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFocusTraversal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,206:1\n1#2:207\n119#3:208\n119#3:285\n119#3:362\n283#4,5:209\n148#4:214\n149#4:220\n150#4,3:224\n153#4:228\n154#4,9:230\n437#4,6:239\n447#4,2:246\n449#4,17:251\n466#4,8:271\n163#4,6:279\n283#4,5:286\n148#4:291\n149#4:297\n150#4,3:301\n153#4:305\n154#4,9:307\n437#4,6:316\n447#4,2:323\n449#4,17:328\n466#4,8:348\n163#4,6:356\n247#4,5:363\n90#4:368\n91#4,8:374\n437#4,6:382\n447#4,2:389\n449#4,8:394\n457#4,9:405\n466#4,8:417\n100#4,7:425\n56#5,5:215\n56#5,5:292\n56#5,5:369\n1101#6:221\n1083#6,2:222\n1101#6:298\n1083#6,2:299\n1101#6:402\n1083#6,2:403\n519#7:227\n44#7:229\n519#7:304\n44#7:306\n246#8:245\n246#8:322\n246#8:388\n240#9,3:248\n243#9,3:268\n240#9,3:325\n243#9,3:345\n240#9,3:391\n243#9,3:414\n*S KotlinDebug\n*F\n+ 1 FocusTraversal.kt\nandroidx/compose/ui/focus/FocusTraversalKt\n*L\n168#1:208\n189#1:285\n203#1:362\n168#1:209,5\n168#1:214\n168#1:220\n168#1:224,3\n168#1:228\n168#1:230,9\n168#1:239,6\n168#1:246,2\n168#1:251,17\n168#1:271,8\n168#1:279,6\n189#1:286,5\n189#1:291\n189#1:297\n189#1:301,3\n189#1:305\n189#1:307,9\n189#1:316,6\n189#1:323,2\n189#1:328,17\n189#1:348,8\n189#1:356,6\n203#1:363,5\n203#1:368\n203#1:374,8\n203#1:382,6\n203#1:389,2\n203#1:394,8\n203#1:405,9\n203#1:417,8\n203#1:425,7\n168#1:215,5\n189#1:292,5\n203#1:369,5\n168#1:221\n168#1:222,2\n189#1:298\n189#1:299,2\n203#1:402\n203#1:403,2\n168#1:227\n168#1:229\n189#1:304\n189#1:306\n168#1:245\n189#1:322\n203#1:388\n168#1:248,3\n168#1:268,3\n189#1:325,3\n189#1:345,3\n203#1:391,3\n203#1:414,3\n*E\n"})
/* loaded from: classes.dex */
public final class FocusTraversalKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[FocusStateImpl.values().length];
            try {
                iArr2[FocusStateImpl.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[FocusStateImpl.ActiveParent.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @k
    /* renamed from: customFocusSearch--OM-vw8, reason: not valid java name */
    public static final FocusRequester m2194customFocusSearchOMvw8(@k FocusTargetNode focusTargetNode, int i11, @k LayoutDirection layoutDirection) {
        FocusRequester end;
        FocusRequester focusRequester;
        FocusRequester start;
        FocusProperties fetchFocusProperties$ui_release = focusTargetNode.fetchFocusProperties$ui_release();
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2160getNextdhqQ8s())) {
            return fetchFocusProperties$ui_release.getNext();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2161getPreviousdhqQ8s())) {
            return fetchFocusProperties$ui_release.getPrevious();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2163getUpdhqQ8s())) {
            return fetchFocusProperties$ui_release.getUp();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2156getDowndhqQ8s())) {
            return fetchFocusProperties$ui_release.getDown();
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2159getLeftdhqQ8s())) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i12 == 1) {
                start = fetchFocusProperties$ui_release.getStart();
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                start = fetchFocusProperties$ui_release.getEnd();
            }
            focusRequester = start != FocusRequester.Companion.getDefault() ? start : null;
            return focusRequester == null ? fetchFocusProperties$ui_release.getLeft() : focusRequester;
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2162getRightdhqQ8s())) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
            if (i13 == 1) {
                end = fetchFocusProperties$ui_release.getEnd();
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                end = fetchFocusProperties$ui_release.getStart();
            }
            focusRequester = end != FocusRequester.Companion.getDefault() ? end : null;
            return focusRequester == null ? fetchFocusProperties$ui_release.getRight() : focusRequester;
        }
        if (!(FocusDirection.m2152equalsimpl0(i11, companion.m2157getEnterdhqQ8s()) ? true : FocusDirection.m2152equalsimpl0(i11, companion.m2158getExitdhqQ8s()))) {
            throw new IllegalStateException("invalid FocusDirection");
        }
        CancelIndicatingFocusBoundaryScope cancelIndicatingFocusBoundaryScope = new CancelIndicatingFocusBoundaryScope(i11, null);
        FocusTransactionManager focusTransactionManager = FocusTargetNodeKt.getFocusTransactionManager(focusTargetNode);
        int generation = focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0;
        FocusOwner focusOwner = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner();
        FocusTargetNode activeFocusTargetNode = focusOwner.getActiveFocusTargetNode();
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2157getEnterdhqQ8s())) {
            fetchFocusProperties$ui_release.getOnEnter().invoke(cancelIndicatingFocusBoundaryScope);
        } else {
            fetchFocusProperties$ui_release.getOnExit().invoke(cancelIndicatingFocusBoundaryScope);
        }
        return cancelIndicatingFocusBoundaryScope.isCanceled() ? FocusRequester.Companion.getCancel() : (generation != (focusTransactionManager != null ? focusTransactionManager.getGeneration() : 0) || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != focusOwner.getActiveFocusTargetNode())) ? FocusRequester.Companion.getRedirect$ui_release() : FocusRequester.Companion.getDefault();
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x006e, code lost:
    
        continue;
     */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode findActiveFocusNode(@m80.k androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.findActiveFocusNode(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    private static final FocusTargetNode findNonDeactivatedParent(FocusTargetNode focusTargetNode) {
        NodeChain nodes$ui_release;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        Modifier.Node node = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) node;
                                if (focusTargetNode2.fetchFocusProperties$ui_release().getCanFocus()) {
                                    return focusTargetNode2;
                                }
                            } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
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
                                if (i11 == 1) {
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
        return null;
    }

    @k
    public static final Rect focusRect(@k FocusTargetNode focusTargetNode) {
        Rect localBoundingBoxOf;
        NodeCoordinator coordinator$ui_release = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release == null || (localBoundingBoxOf = LayoutCoordinatesKt.findRootCoordinates(coordinator$ui_release).localBoundingBoxOf(coordinator$ui_release, false)) == null) ? Rect.Companion.getZero() : localBoundingBoxOf;
    }

    @l
    /* renamed from: focusSearch-0X8WOeE, reason: not valid java name */
    public static final Boolean m2195focusSearch0X8WOeE(@k FocusTargetNode focusTargetNode, int i11, @k LayoutDirection layoutDirection, @l Rect rect, @k x00.l<? super FocusTargetNode, Boolean> lVar) {
        int m2162getRightdhqQ8s;
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2160getNextdhqQ8s()) ? true : FocusDirection.m2152equalsimpl0(i11, companion.m2161getPreviousdhqQ8s())) {
            return Boolean.valueOf(OneDimensionalFocusSearchKt.m2209oneDimensionalFocusSearchOMvw8(focusTargetNode, i11, lVar));
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2159getLeftdhqQ8s()) ? true : FocusDirection.m2152equalsimpl0(i11, companion.m2162getRightdhqQ8s()) ? true : FocusDirection.m2152equalsimpl0(i11, companion.m2163getUpdhqQ8s()) ? true : FocusDirection.m2152equalsimpl0(i11, companion.m2156getDowndhqQ8s())) {
            return TwoDimensionalFocusSearchKt.m2218twoDimensionalFocusSearchsMXa3k8(focusTargetNode, i11, rect, lVar);
        }
        if (!FocusDirection.m2152equalsimpl0(i11, companion.m2157getEnterdhqQ8s())) {
            if (FocusDirection.m2152equalsimpl0(i11, companion.m2158getExitdhqQ8s())) {
                FocusTargetNode findActiveFocusNode = findActiveFocusNode(focusTargetNode);
                FocusTargetNode findNonDeactivatedParent = findActiveFocusNode != null ? findNonDeactivatedParent(findActiveFocusNode) : null;
                return Boolean.valueOf((findNonDeactivatedParent == null || g0.g(findNonDeactivatedParent, focusTargetNode)) ? false : lVar.invoke(findNonDeactivatedParent).booleanValue());
            }
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) FocusDirection.m2154toStringimpl(i11))).toString());
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i12 == 1) {
            m2162getRightdhqQ8s = companion.m2162getRightdhqQ8s();
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m2162getRightdhqQ8s = companion.m2159getLeftdhqQ8s();
        }
        FocusTargetNode findActiveFocusNode2 = findActiveFocusNode(focusTargetNode);
        if (findActiveFocusNode2 != null) {
            return TwoDimensionalFocusSearchKt.m2218twoDimensionalFocusSearchsMXa3k8(findActiveFocusNode2, m2162getRightdhqQ8s, rect, lVar);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0040, code lost:
    
        continue;
     */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode getActiveChild(@m80.k androidx.compose.ui.focus.FocusTargetNode r10) {
        /*
            androidx.compose.ui.Modifier$Node r0 = r10.getNode()
            boolean r0 = r0.isAttached()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r0 = 1024(0x400, float:1.435E-42)
            int r0 = androidx.compose.ui.node.NodeKind.m4118constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r2 = r10.getNode()
            boolean r2 = r2.isAttached()
            if (r2 != 0) goto L21
            java.lang.String r2 = "visitChildren called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r2)
        L21:
            androidx.compose.runtime.collection.MutableVector r2 = new androidx.compose.runtime.collection.MutableVector
            r3 = 16
            androidx.compose.ui.Modifier$Node[] r4 = new androidx.compose.ui.Modifier.Node[r3]
            r5 = 0
            r2.<init>(r4, r5)
            androidx.compose.ui.Modifier$Node r4 = r10.getNode()
            androidx.compose.ui.Modifier$Node r4 = r4.getChild$ui_release()
            if (r4 != 0) goto L3d
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10, r5)
            goto L40
        L3d:
            r2.add(r4)
        L40:
            int r10 = r2.getSize()
            if (r10 == 0) goto Ld5
            int r10 = r2.getSize()
            r4 = 1
            int r10 = r10 - r4
            java.lang.Object r10 = r2.removeAt(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.ui.Modifier.Node) r10
            int r6 = r10.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L5d
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r2, r10, r5)
            goto L40
        L5d:
            if (r10 == 0) goto L40
            int r6 = r10.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Ld0
            r6 = r1
        L67:
            if (r10 == 0) goto L40
            boolean r7 = r10 instanceof androidx.compose.ui.focus.FocusTargetNode
            if (r7 == 0) goto L8f
            androidx.compose.ui.focus.FocusTargetNode r10 = (androidx.compose.ui.focus.FocusTargetNode) r10
            androidx.compose.ui.Modifier$Node r7 = r10.getNode()
            boolean r7 = r7.isAttached()
            if (r7 == 0) goto Lcb
            androidx.compose.ui.focus.FocusStateImpl r7 = r10.getFocusState()
            int[] r8 = androidx.compose.ui.focus.FocusTraversalKt.WhenMappings.$EnumSwitchMapping$1
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L8e
            r8 = 2
            if (r7 == r8) goto L8e
            r8 = 3
            if (r7 == r8) goto L8e
            goto Lcb
        L8e:
            return r10
        L8f:
            int r7 = r10.getKindSet$ui_release()
            r7 = r7 & r0
            if (r7 == 0) goto Lcb
            boolean r7 = r10 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto Lcb
            r7 = r10
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui_release()
            r8 = r5
        La2:
            if (r7 == 0) goto Lc8
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r0
            if (r9 == 0) goto Lc3
            int r8 = r8 + 1
            if (r8 != r4) goto Lb1
            r10 = r7
            goto Lc3
        Lb1:
            if (r6 != 0) goto Lba
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r3]
            r6.<init>(r9, r5)
        Lba:
            if (r10 == 0) goto Lc0
            r6.add(r10)
            r10 = r1
        Lc0:
            r6.add(r7)
        Lc3:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui_release()
            goto La2
        Lc8:
            if (r8 != r4) goto Lcb
            goto L67
        Lcb:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L67
        Ld0:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild$ui_release()
            goto L5d
        Ld5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusTraversalKt.getActiveChild(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final boolean isEligibleForFocusSearch(@k FocusTargetNode focusTargetNode) {
        LayoutNode layoutNode;
        NodeCoordinator coordinator$ui_release;
        LayoutNode layoutNode2;
        NodeCoordinator coordinator$ui_release2 = focusTargetNode.getCoordinator$ui_release();
        return (coordinator$ui_release2 == null || (layoutNode = coordinator$ui_release2.getLayoutNode()) == null || !layoutNode.isPlaced() || (coordinator$ui_release = focusTargetNode.getCoordinator$ui_release()) == null || (layoutNode2 = coordinator$ui_release.getLayoutNode()) == null || !layoutNode2.isAttached()) ? false : true;
    }
}
