package androidx.compose.ui.focus;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nFocusInvalidationManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 8 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 9 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 10 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 11 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 12 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,275:1\n231#2,3:276\n200#2,7:279\n211#2,3:287\n214#2,9:291\n234#2:300\n231#2,3:334\n200#2,7:337\n211#2,3:345\n214#2,9:349\n234#2:358\n1399#3:286\n1270#3:290\n1399#3:344\n1270#3:348\n119#4,9:301\n119#4:325\n119#4:375\n119#4:497\n55#5:310\n90#6:311\n91#6,8:317\n100#6,7:327\n289#6,6:376\n437#6,6:382\n447#6,2:389\n449#6,8:394\n457#6,9:405\n466#6,8:417\n295#6:425\n148#6:426\n149#6,4:432\n153#6:437\n154#6,9:439\n437#6,37:448\n163#6,6:485\n296#6:491\n289#6,6:498\n437#6,6:504\n447#6,2:511\n449#6,8:516\n457#6,9:527\n466#6,8:539\n295#6:547\n148#6:548\n149#6,4:554\n153#6:559\n154#6,9:561\n437#6,37:570\n163#6,6:607\n296#6:613\n56#7,5:312\n56#7,5:427\n56#7,5:549\n56#7,5:621\n56#7,5:626\n56#7,5:631\n246#8:326\n246#8:388\n246#8:510\n34#9,6:359\n34#9,6:365\n34#9,4:371\n39#9:492\n34#9,4:493\n39#9:614\n34#9,6:615\n240#10,3:391\n243#10,3:414\n240#10,3:513\n243#10,3:536\n1101#11:402\n1083#11,2:403\n1101#11:524\n1083#11,2:525\n519#12:436\n44#12:438\n519#12:558\n44#12:560\n*S KotlinDebug\n*F\n+ 1 FocusInvalidationManager.kt\nandroidx/compose/ui/focus/FocusInvalidationManager\n*L\n124#1:276,3\n124#1:279,7\n124#1:287,3\n124#1:291,9\n124#1:300\n161#1:334,3\n161#1:337,7\n161#1:345,3\n161#1:349,9\n161#1:358\n124#1:286\n124#1:290\n161#1:344\n161#1:348\n133#1:301,9\n139#1:325\n193#1:375\n214#1:497\n133#1:310\n132#1:311\n132#1:317,8\n132#1:327,7\n193#1:376,6\n193#1:382,6\n193#1:389,2\n193#1:394,8\n193#1:405,9\n193#1:417,8\n193#1:425\n193#1:426\n193#1:432,4\n193#1:437\n193#1:439,9\n193#1:448,37\n193#1:485,6\n193#1:491\n214#1:498,6\n214#1:504,6\n214#1:511,2\n214#1:516,8\n214#1:527,9\n214#1:539,8\n214#1:547\n214#1:548\n214#1:554,4\n214#1:559\n214#1:561,9\n214#1:570,37\n214#1:607,6\n214#1:613\n132#1:312,5\n193#1:427,5\n214#1:549,5\n268#1:621,5\n271#1:626,5\n272#1:631,5\n139#1:326\n193#1:388\n214#1:510\n173#1:359,6\n174#1:365,6\n188#1:371,4\n188#1:492\n200#1:493,4\n200#1:614\n248#1:615,6\n193#1:391,3\n193#1:414,3\n214#1:513,3\n214#1:536,3\n193#1:402\n193#1:403,2\n214#1:524\n214#1:525,2\n193#1:436\n193#1:438\n214#1:558\n214#1:560\n*E\n"})
/* loaded from: classes.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;

    @k
    private final a<FocusTargetNode> activeFocusTargetNodeFetcher;

    @k
    private final a<g2> invalidateOwnerFocusState;
    private boolean isInvalidationScheduled;

    @k
    private final l<a<g2>, g2> onRequestApplyChangesListener;

    @k
    private final a<FocusState> rootFocusStateFetcher;

    @k
    private final MutableScatterSet<FocusTargetNode> focusTargetNodes = ScatterSetKt.mutableScatterSetOf();

    @k
    private final MutableScatterSet<FocusEventModifierNode> focusEventNodes = ScatterSetKt.mutableScatterSetOf();

    @k
    private final List<FocusTargetNode> focusTargetNodesLegacy = new ArrayList();

    @k
    private final List<FocusEventModifierNode> focusEventNodesLegacy = new ArrayList();

    @k
    private final List<FocusPropertiesModifierNode> focusPropertiesNodesLegacy = new ArrayList();

    @k
    private final List<FocusTargetNode> focusTargetsWithInvalidatedFocusEventsLegacy = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(@k l<? super a<g2>, g2> lVar, @k a<g2> aVar, @k a<? extends FocusState> aVar2, @k a<FocusTargetNode> aVar3) {
        this.onRequestApplyChangesListener = lVar;
        this.invalidateOwnerFocusState = aVar;
        this.rootFocusStateFetcher = aVar2;
        this.activeFocusTargetNodeFetcher = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateNodes() {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            invalidateNodesOptimized();
        } else {
            invalidateNodesLegacy();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    private final void invalidateNodesLegacy() {
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14;
        FocusState focusState;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = 0;
        if (!this.rootFocusStateFetcher.invoke().getHasFocus()) {
            List<FocusEventModifierNode> list = this.focusEventNodesLegacy;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                list.get(i15).onFocusEvent(FocusStateImpl.Inactive);
            }
            List<FocusTargetNode> list2 = this.focusTargetNodesLegacy;
            int size2 = list2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                FocusTargetNode focusTargetNode = list2.get(i16);
                if (focusTargetNode.isAttached() && !focusTargetNode.isInitialized$ui_release()) {
                    focusTargetNode.initializeFocusState$ui_release(FocusStateImpl.Inactive);
                }
            }
            this.focusTargetNodesLegacy.clear();
            this.focusEventNodesLegacy.clear();
            this.focusPropertiesNodesLegacy.clear();
            this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
            this.invalidateOwnerFocusState.invoke();
            return;
        }
        List<FocusPropertiesModifierNode> list3 = this.focusPropertiesNodesLegacy;
        int size3 = list3.size();
        int i17 = 0;
        while (true) {
            i11 = 1024;
            i12 = 16;
            i13 = 1;
            if (i17 >= size3) {
                break;
            }
            FocusPropertiesModifierNode focusPropertiesModifierNode = list3.get(i17);
            if (focusPropertiesModifierNode.getNode().isAttached()) {
                int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
                Modifier.Node node = focusPropertiesModifierNode.getNode();
                MutableVector mutableVector = null;
                while (node != null) {
                    if (node instanceof FocusTargetNode) {
                        this.focusTargetNodesLegacy.add((FocusTargetNode) node);
                    } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                        int i18 = 0;
                        for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                            if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                i18++;
                                if (i18 == 1) {
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
                        if (i18 == 1) {
                        }
                    }
                    node = DelegatableNodeKt.pop(mutableVector);
                }
                if (!focusPropertiesModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                Modifier.Node child$ui_release = focusPropertiesModifierNode.getNode().getChild$ui_release();
                if (child$ui_release == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, focusPropertiesModifierNode.getNode(), false);
                } else {
                    mutableVector2.add(child$ui_release);
                }
                while (mutableVector2.getSize() != 0) {
                    Modifier.Node node2 = (Modifier.Node) mutableVector2.removeAt(mutableVector2.getSize() - 1);
                    if ((node2.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector2, node2, false);
                    } else {
                        while (true) {
                            if (node2 == null) {
                                break;
                            }
                            if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                MutableVector mutableVector3 = null;
                                while (node2 != null) {
                                    if (node2 instanceof FocusTargetNode) {
                                        this.focusTargetNodesLegacy.add((FocusTargetNode) node2);
                                    } else if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node2 instanceof DelegatingNode)) {
                                        int i19 = 0;
                                        for (Modifier.Node delegate$ui_release2 = ((DelegatingNode) node2).getDelegate$ui_release(); delegate$ui_release2 != null; delegate$ui_release2 = delegate$ui_release2.getChild$ui_release()) {
                                            if ((delegate$ui_release2.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                                i19++;
                                                if (i19 == 1) {
                                                    node2 = delegate$ui_release2;
                                                } else {
                                                    if (mutableVector3 == null) {
                                                        mutableVector3 = new MutableVector(new Modifier.Node[16], 0);
                                                    }
                                                    if (node2 != null) {
                                                        mutableVector3.add(node2);
                                                        node2 = null;
                                                    }
                                                    mutableVector3.add(delegate$ui_release2);
                                                }
                                            }
                                        }
                                        if (i19 == 1) {
                                        }
                                    }
                                    node2 = DelegatableNodeKt.pop(mutableVector3);
                                }
                            } else {
                                node2 = node2.getChild$ui_release();
                            }
                        }
                    }
                }
            }
            i17++;
        }
        this.focusPropertiesNodesLegacy.clear();
        List<FocusEventModifierNode> list4 = this.focusEventNodesLegacy;
        int size4 = list4.size();
        int i21 = 0;
        while (i21 < size4) {
            FocusEventModifierNode focusEventModifierNode = list4.get(i21);
            if (focusEventModifierNode.getNode().isAttached()) {
                int m4118constructorimpl2 = NodeKind.m4118constructorimpl(i11);
                Modifier.Node node3 = focusEventModifierNode.getNode();
                int i22 = z15;
                int i23 = i13;
                FocusTargetNode focusTargetNode2 = null;
                MutableVector mutableVector4 = null;
                while (node3 != null) {
                    if (node3 instanceof FocusTargetNode) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) node3;
                        if (focusTargetNode2 != null) {
                            i22 = i13;
                        }
                        if (this.focusTargetNodesLegacy.contains(focusTargetNode3)) {
                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode3);
                            i23 = z15;
                        }
                        focusTargetNode2 = focusTargetNode3;
                    } else if ((node3.getKindSet$ui_release() & m4118constructorimpl2) != 0 && (node3 instanceof DelegatingNode)) {
                        Modifier.Node delegate$ui_release3 = ((DelegatingNode) node3).getDelegate$ui_release();
                        int i24 = z15;
                        while (delegate$ui_release3 != null) {
                            if ((delegate$ui_release3.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                                i24++;
                                if (i24 == i13) {
                                    node3 = delegate$ui_release3;
                                } else {
                                    if (mutableVector4 == null) {
                                        mutableVector4 = new MutableVector(new Modifier.Node[i12], z15);
                                    }
                                    if (node3 != null) {
                                        mutableVector4.add(node3);
                                        node3 = null;
                                    }
                                    mutableVector4.add(delegate$ui_release3);
                                }
                            }
                            delegate$ui_release3 = delegate$ui_release3.getChild$ui_release();
                            i13 = 1;
                        }
                        int i25 = i13;
                        if (i24 == i25) {
                            i13 = i25;
                        }
                    }
                    node3 = DelegatableNodeKt.pop(mutableVector4);
                    i13 = 1;
                }
                if (!focusEventModifierNode.getNode().isAttached()) {
                    InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
                }
                MutableVector mutableVector5 = new MutableVector(new Modifier.Node[i12], z15);
                Modifier.Node child$ui_release2 = focusEventModifierNode.getNode().getChild$ui_release();
                if (child$ui_release2 == null) {
                    DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, focusEventModifierNode.getNode(), z15);
                } else {
                    mutableVector5.add(child$ui_release2);
                }
                while (mutableVector5.getSize() != 0) {
                    Modifier.Node node4 = (Modifier.Node) mutableVector5.removeAt(mutableVector5.getSize() - 1);
                    z15 = z15;
                    if ((node4.getAggregateChildKindSet$ui_release() & m4118constructorimpl2) == 0) {
                        DelegatableNodeKt.addLayoutNodeChildren(mutableVector5, node4, z15);
                    } else {
                        while (node4 != null) {
                            if ((node4.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                                MutableVector mutableVector6 = null;
                                z15 = z15;
                                while (node4 != null) {
                                    if (node4 instanceof FocusTargetNode) {
                                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) node4;
                                        if (focusTargetNode2 != null) {
                                            i22 = 1;
                                        }
                                        if (this.focusTargetNodesLegacy.contains(focusTargetNode4)) {
                                            this.focusTargetsWithInvalidatedFocusEventsLegacy.add(focusTargetNode4);
                                            i23 = z15 == true ? 1 : 0;
                                        }
                                        z12 = z15 == true ? 1 : 0;
                                        focusTargetNode2 = focusTargetNode4;
                                    } else if ((node4.getKindSet$ui_release() & m4118constructorimpl2) == 0 || !(node4 instanceof DelegatingNode)) {
                                        z12 = z15 == true ? 1 : 0;
                                    } else {
                                        Modifier.Node delegate$ui_release4 = ((DelegatingNode) node4).getDelegate$ui_release();
                                        int i26 = z15 == true ? 1 : 0;
                                        boolean z16 = z15;
                                        while (delegate$ui_release4 != null) {
                                            if ((delegate$ui_release4.getKindSet$ui_release() & m4118constructorimpl2) != 0) {
                                                i26++;
                                                if (i26 == 1) {
                                                    node4 = delegate$ui_release4;
                                                    z14 = false;
                                                } else {
                                                    if (mutableVector6 == null) {
                                                        Modifier.Node[] nodeArr = new Modifier.Node[i12];
                                                        z14 = false;
                                                        mutableVector6 = new MutableVector(nodeArr, 0);
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (node4 != null) {
                                                        mutableVector6.add(node4);
                                                        node4 = null;
                                                    }
                                                    mutableVector6.add(delegate$ui_release4);
                                                }
                                            } else {
                                                z14 = z16;
                                            }
                                            delegate$ui_release4 = delegate$ui_release4.getChild$ui_release();
                                            z16 = z14;
                                            i12 = 16;
                                        }
                                        z13 = z16;
                                        z13 = z13;
                                        if (i26 == 1) {
                                            z15 = z13;
                                            i12 = 16;
                                        }
                                        node4 = DelegatableNodeKt.pop(mutableVector6);
                                        z15 = z13;
                                        i12 = 16;
                                    }
                                    z13 = z12;
                                    node4 = DelegatableNodeKt.pop(mutableVector6);
                                    z15 = z13;
                                    i12 = 16;
                                }
                                boolean z17 = z15 == true ? 1 : 0;
                                i12 = 16;
                            } else {
                                boolean z18 = z15 == true ? 1 : 0;
                                node4 = node4.getChild$ui_release();
                                z15 = z18 ? 1 : 0;
                                i12 = 16;
                            }
                        }
                    }
                    z15 = z15 ? 1 : 0;
                    i12 = 16;
                }
                z11 = z15 == true ? 1 : 0;
                i14 = 1;
                if (i23 != 0) {
                    if (i22 != 0) {
                        focusState = FocusEventModifierNodeKt.getFocusState(focusEventModifierNode);
                    } else if (focusTargetNode2 == null || (focusState = focusTargetNode2.getFocusState()) == null) {
                        focusState = FocusStateImpl.Inactive;
                    }
                    focusEventModifierNode.onFocusEvent(focusState);
                }
            } else {
                focusEventModifierNode.onFocusEvent(FocusStateImpl.Inactive);
                z11 = z15;
                i14 = i13;
            }
            i21++;
            i13 = i14;
            z15 = z11;
            i11 = 1024;
            i12 = 16;
        }
        this.focusEventNodesLegacy.clear();
        List<FocusTargetNode> list5 = this.focusTargetNodesLegacy;
        int size5 = list5.size();
        for (int i27 = z15; i27 < size5; i27++) {
            FocusTargetNode focusTargetNode5 = list5.get(i27);
            if (focusTargetNode5.isAttached()) {
                FocusStateImpl focusState2 = focusTargetNode5.getFocusState();
                focusTargetNode5.invalidateFocus$ui_release();
                if (focusState2 != focusTargetNode5.getFocusState() || this.focusTargetsWithInvalidatedFocusEventsLegacy.contains(focusTargetNode5)) {
                    focusTargetNode5.dispatchFocusCallbacks$ui_release();
                }
            }
        }
        this.focusTargetNodesLegacy.clear();
        this.focusTargetsWithInvalidatedFocusEventsLegacy.clear();
        this.invalidateOwnerFocusState.invoke();
        if (!this.focusPropertiesNodesLegacy.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusProperties nodes");
        }
        if (!this.focusEventNodesLegacy.isEmpty()) {
            InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusEvent nodes");
        }
        if (this.focusTargetNodesLegacy.isEmpty()) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Unprocessed FocusTarget nodes");
    }

    private final void invalidateNodesOptimized() {
        NodeChain nodes$ui_release;
        long j11;
        long j12;
        FocusTargetNode invoke = this.activeFocusTargetNodeFetcher.invoke();
        long j13 = 255;
        if (invoke == null) {
            MutableScatterSet<FocusEventModifierNode> mutableScatterSet = this.focusEventNodes;
            Object[] objArr = mutableScatterSet.elements;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j14 = jArr[i11];
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j14 & j13) < 128) {
                                j12 = j13;
                                ((FocusEventModifierNode) objArr[(i11 << 3) + i13]).onFocusEvent(FocusStateImpl.Inactive);
                            } else {
                                j12 = j13;
                            }
                            j14 >>= 8;
                            i13++;
                            j13 = j12;
                        }
                        j11 = j13;
                        if (i12 != 8) {
                            break;
                        }
                    } else {
                        j11 = j13;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                    j13 = j11;
                }
            }
        } else if (invoke.isAttached()) {
            if (this.focusTargetNodes.contains(invoke)) {
                invoke.invalidateFocus$ui_release();
            }
            FocusStateImpl focusState = invoke.getFocusState();
            int m4118constructorimpl = NodeKind.m4118constructorimpl(1024) | NodeKind.m4118constructorimpl(4096);
            if (!invoke.getNode().isAttached()) {
                InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
            }
            Modifier.Node node = invoke.getNode();
            LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(invoke);
            int i14 = 0;
            while (requireLayoutNode != null) {
                if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                    while (node != null) {
                        if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                            if ((NodeKind.m4118constructorimpl(1024) & node.getKindSet$ui_release()) != 0) {
                                i14++;
                            }
                            if ((node instanceof FocusEventModifierNode) && this.focusEventNodes.contains(node)) {
                                if (i14 <= 1) {
                                    ((FocusEventModifierNode) node).onFocusEvent(focusState);
                                } else {
                                    ((FocusEventModifierNode) node).onFocusEvent(FocusStateImpl.ActiveParent);
                                }
                                this.focusEventNodes.remove(node);
                            }
                        }
                        node = node.getParent$ui_release();
                    }
                }
                requireLayoutNode = requireLayoutNode.getParent$ui_release();
                node = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
            }
            MutableScatterSet<FocusEventModifierNode> mutableScatterSet2 = this.focusEventNodes;
            Object[] objArr2 = mutableScatterSet2.elements;
            long[] jArr2 = mutableScatterSet2.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i15 = 0;
                while (true) {
                    long j15 = jArr2[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length2)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j15 & 255) < 128) {
                                ((FocusEventModifierNode) objArr2[(i15 << 3) + i17]).onFocusEvent(FocusStateImpl.Inactive);
                            }
                            j15 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length2) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        this.invalidateOwnerFocusState.invoke();
        this.focusTargetNodes.clear();
        this.focusEventNodes.clear();
        this.isInvalidationScheduled = false;
    }

    private final <T> void scheduleInvalidationLegacy(List<T> list, T t11) {
        if (list.add(t11) && this.focusTargetNodesLegacy.size() + this.focusEventNodesLegacy.size() + this.focusPropertiesNodesLegacy.size() == 1) {
            this.onRequestApplyChangesListener.invoke(new FocusInvalidationManager$scheduleInvalidationLegacy$1(this));
        }
    }

    private final void setUpOnRequestApplyChangesListener() {
        if (this.isInvalidationScheduled) {
            return;
        }
        this.onRequestApplyChangesListener.invoke(new FocusInvalidationManager$setUpOnRequestApplyChangesListener$1(this));
        this.isInvalidationScheduled = true;
    }

    public final boolean hasPendingInvalidation() {
        return ComposeUiFlags.isTrackFocusEnabled ? this.isInvalidationScheduled : (this.focusTargetNodesLegacy.isEmpty() && this.focusPropertiesNodesLegacy.isEmpty() && this.focusEventNodesLegacy.isEmpty()) ? false : true;
    }

    public final void scheduleInvalidation(@k FocusTargetNode focusTargetNode) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusTargetNodes, focusTargetNode);
        } else {
            scheduleInvalidationLegacy(this.focusTargetNodesLegacy, focusTargetNode);
        }
    }

    public final void scheduleInvalidationForOwner() {
        setUpOnRequestApplyChangesListener();
    }

    public final void scheduleInvalidation(@k FocusEventModifierNode focusEventModifierNode) {
        if (ComposeUiFlags.isTrackFocusEnabled) {
            scheduleInvalidation(this.focusEventNodes, focusEventModifierNode);
        } else {
            scheduleInvalidationLegacy(this.focusEventNodesLegacy, focusEventModifierNode);
        }
    }

    public final void scheduleInvalidation(@k FocusPropertiesModifierNode focusPropertiesModifierNode) {
        scheduleInvalidationLegacy(this.focusPropertiesNodesLegacy, focusPropertiesModifierNode);
    }

    private final <T> void scheduleInvalidation(MutableScatterSet<T> mutableScatterSet, T t11) {
        if (mutableScatterSet.add(t11)) {
            setUpOnRequestApplyChangesListener();
        }
    }
}
