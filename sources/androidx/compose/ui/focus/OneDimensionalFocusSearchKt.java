package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.BeyondBoundsLayout;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import g10.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOneDimensionalFocusSearch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,280:1\n201#1,3:359\n204#1,2:363\n207#1,5:366\n216#1,3:371\n219#1,2:375\n222#1,5:378\n1083#2,2:281\n1101#2:297\n1083#2,2:383\n1101#2:398\n1083#2,2:467\n1101#2:482\n1101#2:595\n1083#2,2:596\n1#3:283\n119#4:284\n119#4:385\n119#4:469\n119#4:553\n283#5,5:285\n148#5:290\n149#5:296\n150#5,3:298\n153#5:302\n154#5,9:304\n437#5,6:313\n447#5,2:320\n449#5,17:325\n466#5,8:345\n163#5,6:353\n283#5,5:386\n148#5:391\n149#5:397\n150#5,3:399\n153#5:403\n154#5,9:405\n437#5,6:414\n447#5,2:421\n449#5,17:426\n466#5,8:446\n163#5,6:454\n283#5,5:470\n148#5:475\n149#5:481\n150#5,3:483\n153#5:487\n154#5,9:489\n437#5,6:498\n447#5,2:505\n449#5,17:510\n466#5,8:530\n163#5,6:538\n277#5:554\n247#5,5:555\n90#5:560\n91#5,8:566\n437#5,5:574\n278#5:579\n442#5:580\n447#5,2:582\n449#5,8:587\n457#5,9:598\n466#5,8:610\n100#5,7:618\n280#5:625\n56#6,5:291\n56#6,5:392\n56#6,5:476\n56#6,5:561\n519#7:301\n44#7:303\n48#7:362\n472#7:365\n48#7:374\n472#7:377\n519#7:402\n44#7:404\n194#7,7:460\n519#7:486\n44#7:488\n447#7,9:544\n48#7:626\n472#7:627\n472#7:628\n48#7:629\n472#7:630\n472#7:631\n246#8:319\n246#8:420\n246#8:504\n246#8:581\n240#9,3:322\n243#9,3:342\n240#9,3:423\n243#9,3:443\n240#9,3:507\n243#9,3:527\n240#9,3:584\n243#9,3:607\n*S KotlinDebug\n*F\n+ 1 OneDimensionalFocusSearch.kt\nandroidx/compose/ui/focus/OneDimensionalFocusSearchKt\n*L\n153#1:359,3\n153#1:363,2\n153#1:366,5\n157#1:371,3\n157#1:375,2\n157#1:378,5\n149#1:281,2\n149#1:297\n177#1:383,2\n177#1:398\n186#1:467,2\n186#1:482\n196#1:595\n196#1:596,2\n149#1:284\n177#1:385\n186#1:469\n196#1:553\n149#1:285,5\n149#1:290\n149#1:296\n149#1:298,3\n149#1:302\n149#1:304,9\n149#1:313,6\n149#1:320,2\n149#1:325,17\n149#1:345,8\n149#1:353,6\n177#1:386,5\n177#1:391\n177#1:397\n177#1:399,3\n177#1:403\n177#1:405,9\n177#1:414,6\n177#1:421,2\n177#1:426,17\n177#1:446,8\n177#1:454,6\n186#1:470,5\n186#1:475\n186#1:481\n186#1:483,3\n186#1:487\n186#1:489,9\n186#1:498,6\n186#1:505,2\n186#1:510,17\n186#1:530,8\n186#1:538,6\n196#1:554\n196#1:555,5\n196#1:560\n196#1:566,8\n196#1:574,5\n196#1:579\n196#1:580\n196#1:582,2\n196#1:587,8\n196#1:598,9\n196#1:610,8\n196#1:618,7\n196#1:625\n149#1:291,5\n177#1:392,5\n186#1:476,5\n196#1:561,5\n149#1:301\n149#1:303\n153#1:362\n153#1:365\n157#1:374\n157#1:377\n177#1:402\n177#1:404\n179#1:460,7\n186#1:486\n186#1:488\n188#1:544,9\n203#1:626\n205#1:627\n207#1:628\n218#1:629\n220#1:630\n222#1:631\n149#1:319\n177#1:420\n186#1:504\n196#1:581\n149#1:322,3\n149#1:342,3\n177#1:423,3\n177#1:443,3\n186#1:507,3\n186#1:527,3\n196#1:584,3\n196#1:607,3\n*E\n"})
/* loaded from: classes.dex */
public final class OneDimensionalFocusSearchKt {

    @k
    private static final String InvalidFocusDirection = "This function should only be used for 1-D focus search";

    @k
    private static final String NoActiveChild = "ActiveParent must have a focusedChild";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FocusStateImpl.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FocusStateImpl.Captured.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FocusStateImpl.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final boolean backwardFocusSearch(FocusTargetNode focusTargetNode, l<? super FocusTargetNode, Boolean> lVar) {
        FocusStateImpl focusState = focusTargetNode.getFocusState();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i11 = iArr[focusState.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return pickChildForBackwardSearch(focusTargetNode, lVar);
            }
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (!pickChildForBackwardSearch(focusTargetNode, lVar)) {
                if (!(focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? lVar.invoke(focusTargetNode).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
        if (activeChild == null) {
            throw new IllegalStateException(NoActiveChild);
        }
        int i12 = iArr[activeChild.getFocusState().ordinal()];
        if (i12 == 1) {
            return backwardFocusSearch(activeChild, lVar) || m2208generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m2161getPreviousdhqQ8s(), lVar) || (activeChild.fetchFocusProperties$ui_release().getCanFocus() && lVar.invoke(activeChild).booleanValue());
        }
        if (i12 == 2 || i12 == 3) {
            return m2208generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m2161getPreviousdhqQ8s(), lVar);
        }
        if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException(NoActiveChild);
    }

    private static final <T> void forEachItemAfter(MutableVector<T> mutableVector, T t11, l<? super T, g2> lVar) {
        boolean z11 = false;
        g10.l W1 = u.W1(0, mutableVector.getSize());
        int d11 = W1.d();
        int f11 = W1.f();
        if (d11 > f11) {
            return;
        }
        while (true) {
            if (z11) {
                lVar.invoke(mutableVector.content[d11]);
            }
            if (g0.g(mutableVector.content[d11], t11)) {
                z11 = true;
            }
            if (d11 == f11) {
                return;
            } else {
                d11++;
            }
        }
    }

    private static final <T> void forEachItemBefore(MutableVector<T> mutableVector, T t11, l<? super T, g2> lVar) {
        boolean z11 = false;
        g10.l W1 = u.W1(0, mutableVector.getSize());
        int d11 = W1.d();
        int f11 = W1.f();
        if (d11 > f11) {
            return;
        }
        while (true) {
            if (z11) {
                lVar.invoke(mutableVector.content[f11]);
            }
            if (g0.g(mutableVector.content[f11], t11)) {
                z11 = true;
            }
            if (f11 == d11) {
                return;
            } else {
                f11--;
            }
        }
    }

    private static final boolean forwardFocusSearch(FocusTargetNode focusTargetNode, l<? super FocusTargetNode, Boolean> lVar) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[focusTargetNode.getFocusState().ordinal()];
        if (i11 == 1) {
            FocusTargetNode activeChild = FocusTraversalKt.getActiveChild(focusTargetNode);
            if (activeChild != null) {
                return forwardFocusSearch(activeChild, lVar) || m2208generateAndSearchChildren4C6V_qg(focusTargetNode, activeChild, FocusDirection.Companion.m2160getNextdhqQ8s(), lVar);
            }
            throw new IllegalStateException(NoActiveChild);
        }
        if (i11 == 2 || i11 == 3) {
            return pickChildForForwardSearch(focusTargetNode, lVar);
        }
        if (i11 == 4) {
            return focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() ? lVar.invoke(focusTargetNode).booleanValue() : pickChildForForwardSearch(focusTargetNode, lVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: generateAndSearchChildren-4C6V_qg, reason: not valid java name */
    private static final boolean m2208generateAndSearchChildren4C6V_qg(final FocusTargetNode focusTargetNode, final FocusTargetNode focusTargetNode2, final int i11, final l<? super FocusTargetNode, Boolean> lVar) {
        if (m2210searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i11, lVar)) {
            return true;
        }
        final FocusTransactionManager requireTransactionManager = FocusTargetNodeKt.requireTransactionManager(focusTargetNode);
        final int generation = requireTransactionManager.getGeneration();
        final FocusTargetNode activeFocusTargetNode = DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode();
        Boolean bool = (Boolean) BeyondBoundsLayoutKt.m2147searchBeyondBoundsOMvw8(focusTargetNode, i11, new l<BeyondBoundsLayout.BeyondBoundsScope, Boolean>() { // from class: androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(BeyondBoundsLayout.BeyondBoundsScope beyondBoundsScope) {
                boolean m2210searchChildren4C6V_qg;
                if (generation != requireTransactionManager.getGeneration() || (ComposeUiFlags.isTrackFocusEnabled && activeFocusTargetNode != DelegatableNodeKt.requireOwner(focusTargetNode).getFocusOwner().getActiveFocusTargetNode())) {
                    return Boolean.TRUE;
                }
                m2210searchChildren4C6V_qg = OneDimensionalFocusSearchKt.m2210searchChildren4C6V_qg(focusTargetNode, focusTargetNode2, i11, lVar);
                Boolean valueOf = Boolean.valueOf(m2210searchChildren4C6V_qg);
                if (m2210searchChildren4C6V_qg || !beyondBoundsScope.getHasMoreContent()) {
                    return valueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean isRoot(FocusTargetNode focusTargetNode) {
        Modifier.Node node;
        NodeChain nodes$ui_release;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = focusTargetNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(focusTargetNode);
        loop0: while (true) {
            node = null;
            if (requireLayoutNode == null) {
                break;
            }
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        Modifier.Node node2 = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node2 != null) {
                            if (node2 instanceof FocusTargetNode) {
                                node = node2;
                                break loop0;
                            }
                            if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            node2 = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node2 != null) {
                                                mutableVector.add(node2);
                                                node2 = null;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            node2 = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return node == null;
    }

    /* renamed from: oneDimensionalFocusSearch--OM-vw8, reason: not valid java name */
    public static final boolean m2209oneDimensionalFocusSearchOMvw8(@k FocusTargetNode focusTargetNode, int i11, @k l<? super FocusTargetNode, Boolean> lVar) {
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2160getNextdhqQ8s())) {
            return forwardFocusSearch(focusTargetNode, lVar);
        }
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2161getPreviousdhqQ8s())) {
            return backwardFocusSearch(focusTargetNode, lVar);
        }
        throw new IllegalStateException(InvalidFocusDirection);
    }

    private static final boolean pickChildForBackwardSearch(FocusTargetNode focusTargetNode, l<? super FocusTargetNode, Boolean> lVar) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[size];
                if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && backwardFocusSearch(focusTargetNode2, lVar)) {
                    return true;
                }
                size--;
            }
        }
        return false;
    }

    private static final boolean pickChildForForwardSearch(FocusTargetNode focusTargetNode, l<? super FocusTargetNode, Boolean> lVar) {
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        Object[] objArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i12 = 0; i12 < size; i12++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i12];
            if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode2) && forwardFocusSearch(focusTargetNode2, lVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchChildren-4C6V_qg, reason: not valid java name */
    public static final boolean m2210searchChildren4C6V_qg(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i11, l<? super FocusTargetNode, Boolean> lVar) {
        if (focusTargetNode.getFocusState() != FocusStateImpl.ActiveParent) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        MutableVector mutableVector = new MutableVector(new FocusTargetNode[16], 0);
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusTargetNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusTargetNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusTargetNode.getNode(), false);
        } else {
            mutableVector2.add(child$ui_release);
        }
        while (mutableVector2.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        MutableVector mutableVector3 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                mutableVector.add((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i12 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector3 == null) {
                                                mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector3.add(node);
                                                node = null;
                                            }
                                            mutableVector3.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector3);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
        mutableVector.sortWith(FocusableChildrenComparator.INSTANCE);
        FocusDirection.Companion companion = FocusDirection.Companion;
        if (FocusDirection.m2152equalsimpl0(i11, companion.m2160getNextdhqQ8s())) {
            g10.l W1 = u.W1(0, mutableVector.getSize());
            int d11 = W1.d();
            int f11 = W1.f();
            if (d11 <= f11) {
                boolean z11 = false;
                while (true) {
                    if (z11) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) mutableVector.content[d11];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode3) && forwardFocusSearch(focusTargetNode3, lVar)) {
                            return true;
                        }
                    }
                    if (g0.g(mutableVector.content[d11], focusTargetNode2)) {
                        z11 = true;
                    }
                    if (d11 == f11) {
                        break;
                    }
                    d11++;
                }
            }
        } else {
            if (!FocusDirection.m2152equalsimpl0(i11, companion.m2161getPreviousdhqQ8s())) {
                throw new IllegalStateException(InvalidFocusDirection);
            }
            g10.l W12 = u.W1(0, mutableVector.getSize());
            int d12 = W12.d();
            int f12 = W12.f();
            if (d12 <= f12) {
                boolean z12 = false;
                while (true) {
                    if (z12) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) mutableVector.content[f12];
                        if (FocusTraversalKt.isEligibleForFocusSearch(focusTargetNode4) && backwardFocusSearch(focusTargetNode4, lVar)) {
                            return true;
                        }
                    }
                    if (g0.g(mutableVector.content[f12], focusTargetNode2)) {
                        z12 = true;
                    }
                    if (f12 == d12) {
                        break;
                    }
                    f12--;
                }
            }
        }
        if (FocusDirection.m2152equalsimpl0(i11, FocusDirection.Companion.m2160getNextdhqQ8s()) || !focusTargetNode.fetchFocusProperties$ui_release().getCanFocus() || isRoot(focusTargetNode)) {
            return false;
        }
        return lVar.invoke(focusTargetNode).booleanValue();
    }

    private static /* synthetic */ void getInvalidFocusDirection$annotations() {
    }

    private static /* synthetic */ void getNoActiveChild$annotations() {
    }
}
