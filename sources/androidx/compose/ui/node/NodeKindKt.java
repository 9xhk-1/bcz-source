package androidx.compose.ui.node;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.ObjectIntMapKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.ComposeUiFlags;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.focus.FocusEventModifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusEventModifierNodeKt;
import androidx.compose.ui.focus.FocusOrderModifier;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.focus.FocusPropertiesModifierNodeKt;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.focus.FocusTargetNodeKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode;
import androidx.compose.ui.input.pointer.PointerInputModifier;
import androidx.compose.ui.input.rotary.RotaryInputModifierNode;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.modifier.ModifierLocalConsumer;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalProvider;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.semantics.SemanticsModifier;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNodeKind.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 ObjectIntMap.kt\nandroidx/collection/MutableObjectIntMap\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 9 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,407:1\n61#1:411\n61#1:413\n61#1:415\n61#1:417\n61#1:419\n61#1:421\n61#1:423\n61#1:425\n61#1:427\n61#1:429\n61#1:431\n61#1:439\n61#1:441\n61#1:443\n61#1:445\n61#1:447\n61#1:449\n61#1:451\n61#1:453\n61#1:455\n61#1:457\n61#1:459\n61#1:461\n61#1:463\n61#1:465\n61#1:467\n61#1:469\n61#1:471\n61#1:473\n61#1:475\n64#1:500\n64#1:503\n64#1:505\n64#1:507\n64#1:509\n64#1:511\n64#1:513\n64#1:515\n107#2:408\n79#2:409\n83#2:410\n87#2:412\n91#2:414\n95#2:416\n99#2:418\n127#2:420\n123#2:422\n111#2:424\n103#2:426\n107#2:428\n151#2:430\n79#2:437\n83#2:438\n87#2:440\n91#2:442\n95#2:444\n99#2:446\n103#2:448\n107#2:450\n111#2:452\n115#2:454\n119#2:456\n123#2:458\n127#2:460\n131#2:462\n135#2:464\n139#2:466\n143#2:468\n147#2:470\n151#2:472\n155#2:474\n83#2:499\n83#2:501\n107#2:502\n111#2:504\n87#2:506\n91#2:508\n103#2:510\n123#2:512\n127#2:514\n119#2:516\n688#3,5:432\n693#3,2:476\n56#4,5:478\n56#4,5:483\n56#4,5:488\n56#4,5:523\n240#5,6:493\n240#5,3:556\n243#5,3:576\n240#5,6:593\n283#6,5:517\n148#6:522\n149#6:528\n150#6,3:532\n153#6:536\n154#6,9:538\n437#6,6:547\n447#6,2:554\n449#6,17:559\n466#6,8:579\n163#6,6:587\n1101#7:529\n1083#7,2:530\n519#8:535\n44#8:537\n246#9:553\n*S KotlinDebug\n*F\n+ 1 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n162#1:411\n165#1:413\n168#1:415\n171#1:417\n174#1:419\n178#1:421\n182#1:423\n185#1:425\n188#1:427\n191#1:429\n194#1:431\n209#1:439\n212#1:441\n215#1:443\n218#1:445\n221#1:447\n224#1:449\n227#1:451\n230#1:453\n233#1:455\n236#1:457\n239#1:459\n242#1:461\n245#1:463\n248#1:465\n251#1:467\n254#1:469\n257#1:471\n260#1:473\n263#1:475\n309#1:500\n316#1:503\n323#1:505\n330#1:507\n333#1:509\n336#1:511\n340#1:513\n353#1:515\n71#1:408\n160#1:409\n162#1:410\n165#1:412\n168#1:414\n171#1:416\n174#1:418\n178#1:420\n182#1:422\n185#1:424\n188#1:426\n191#1:428\n194#1:430\n207#1:437\n209#1:438\n212#1:440\n215#1:442\n218#1:444\n221#1:446\n224#1:448\n227#1:450\n230#1:452\n233#1:454\n236#1:456\n239#1:458\n242#1:460\n245#1:462\n248#1:464\n251#1:466\n254#1:468\n257#1:470\n260#1:472\n263#1:474\n309#1:499\n312#1:501\n316#1:502\n323#1:504\n330#1:506\n333#1:508\n336#1:510\n340#1:512\n353#1:514\n359#1:516\n206#1:432,5\n206#1:476,2\n274#1:478,5\n279#1:483,5\n284#1:488,5\n359#1:523,5\n296#1:493,6\n359#1:556,3\n359#1:576,3\n399#1:593,6\n359#1:517,5\n359#1:522\n359#1:528\n359#1:532,3\n359#1:536\n359#1:538,9\n359#1:547,6\n359#1:554,2\n359#1:559,17\n359#1:579,8\n359#1:587,6\n359#1:529\n359#1:530,2\n359#1:535\n359#1:537\n359#1:553\n*E\n"})
/* loaded from: classes2.dex */
public final class NodeKindKt {
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private static final int Updated = 0;

    @k
    private static final MutableObjectIntMap<Object> classToKindSetMap = ObjectIntMapKt.mutableObjectIntMapOf();

    public static final void autoInvalidateInsertedNode(@k Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateInsertedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 1);
    }

    public static final void autoInvalidateNodeIncludingDelegates(@k Modifier.Node node, int i11, int i12) {
        if (!(node instanceof DelegatingNode)) {
            autoInvalidateNodeSelf(node, i11 & node.getKindSet$ui_release(), i12);
            return;
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        autoInvalidateNodeSelf(node, delegatingNode.getSelfKindSet$ui_release() & i11, i12);
        int i13 = (~delegatingNode.getSelfKindSet$ui_release()) & i11;
        for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            autoInvalidateNodeIncludingDelegates(delegate$ui_release, i13, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void autoInvalidateNodeSelf(Modifier.Node node, int i11, int i12) {
        if (i12 != 0 || node.getShouldAutoInvalidate()) {
            if ((NodeKind.m4118constructorimpl(2) & i11) != 0 && (node instanceof LayoutModifierNode)) {
                LayoutModifierNodeKt.invalidateMeasurement((LayoutModifierNode) node);
                if (i12 == 2) {
                    DelegatableNodeKt.m3979requireCoordinator64DMado(node, NodeKind.m4118constructorimpl(2)).onRelease();
                }
            }
            if ((NodeKind.m4118constructorimpl(128) & i11) != 0 && (node instanceof LayoutAwareModifierNode) && i12 != 2) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateMeasurements$ui_release();
            }
            if ((NodeKind.m4118constructorimpl(256) & i11) != 0 && (node instanceof GlobalPositionAwareModifierNode) && i12 != 2) {
                DelegatableNodeKt.requireLayoutNode(node).invalidateOnPositioned$ui_release();
            }
            if ((NodeKind.m4118constructorimpl(4) & i11) != 0 && (node instanceof DrawModifierNode)) {
                DrawModifierNodeKt.invalidateDraw((DrawModifierNode) node);
            }
            if ((NodeKind.m4118constructorimpl(8) & i11) != 0 && (node instanceof SemanticsModifierNode)) {
                DelegatableNodeKt.requireLayoutNode(node).setSemanticsInvalidated$ui_release(true);
            }
            if ((NodeKind.m4118constructorimpl(64) & i11) != 0 && (node instanceof ParentDataModifierNode)) {
                ParentDataModifierNodeKt.invalidateParentData((ParentDataModifierNode) node);
            }
            if ((NodeKind.m4118constructorimpl(2048) & i11) != 0 && (node instanceof FocusPropertiesModifierNode)) {
                FocusPropertiesModifierNode focusPropertiesModifierNode = (FocusPropertiesModifierNode) node;
                if (specifiesCanFocusProperty(focusPropertiesModifierNode)) {
                    if (ComposeUiFlags.isTrackFocusEnabled) {
                        scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                    } else if (i12 == 2) {
                        scheduleInvalidationOfAssociatedFocusTargets(focusPropertiesModifierNode);
                    } else {
                        FocusPropertiesModifierNodeKt.invalidateFocusProperties(focusPropertiesModifierNode);
                    }
                }
            }
            if ((i11 & NodeKind.m4118constructorimpl(4096)) == 0 || !(node instanceof FocusEventModifierNode)) {
                return;
            }
            FocusEventModifierNodeKt.invalidateFocusEvent((FocusEventModifierNode) node);
        }
    }

    public static final void autoInvalidateRemovedNode(@k Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateRemovedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 2);
    }

    public static final void autoInvalidateUpdatedNode(@k Modifier.Node node) {
        if (!node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("autoInvalidateUpdatedNode called on unattached node");
        }
        autoInvalidateNodeIncludingDelegates(node, -1, 0);
    }

    public static final int calculateNodeKindSetFrom(@k Modifier.Node node) {
        if (node.getKindSet$ui_release() != 0) {
            return node.getKindSet$ui_release();
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = classToKindSetMap;
        Object classKeyForObject = Actual_jvmKt.classKeyForObject(node);
        int findKeyIndex = mutableObjectIntMap.findKeyIndex(classKeyForObject);
        if (findKeyIndex >= 0) {
            return mutableObjectIntMap.values[findKeyIndex];
        }
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1);
        if (node instanceof LayoutModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(2);
        }
        if (node instanceof DrawModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(4);
        }
        if (node instanceof SemanticsModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(8);
        }
        if (node instanceof PointerInputModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(16);
        }
        if (node instanceof ModifierLocalModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(32);
        }
        if (node instanceof ParentDataModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(64);
        }
        if (node instanceof LayoutAwareModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(128);
        }
        if (node instanceof GlobalPositionAwareModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(256);
        }
        if (node instanceof ApproachLayoutModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(512);
        }
        if (node instanceof FocusTargetNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(1024);
        }
        if (node instanceof FocusPropertiesModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(2048);
        }
        if (node instanceof FocusEventModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(4096);
        }
        if (node instanceof KeyInputModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(8192);
        }
        if (node instanceof RotaryInputModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(16384);
        }
        if (node instanceof CompositionLocalConsumerModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(32768);
        }
        if (node instanceof SoftKeyboardInterceptionModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(131072);
        }
        if (node instanceof TraversableNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(262144);
        }
        if (node instanceof BringIntoViewModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(524288);
        }
        if (node instanceof OnUnplacedModifierNode) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(1048576);
        }
        mutableObjectIntMap.set(classKeyForObject, m4118constructorimpl);
        return m4118constructorimpl;
    }

    public static final int calculateNodeKindSetFromIncludingDelegates(@k Modifier.Node node) {
        if (!(node instanceof DelegatingNode)) {
            return calculateNodeKindSetFrom(node);
        }
        DelegatingNode delegatingNode = (DelegatingNode) node;
        int selfKindSet$ui_release = delegatingNode.getSelfKindSet$ui_release();
        for (Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            selfKindSet$ui_release |= calculateNodeKindSetFromIncludingDelegates(delegate$ui_release);
        }
        return selfKindSet$ui_release;
    }

    /* renamed from: contains-64DMado, reason: not valid java name */
    public static final boolean m4126contains64DMado(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    /* renamed from: getIncludeSelfInTraversal-H91voCI, reason: not valid java name */
    public static final boolean m4127getIncludeSelfInTraversalH91voCI(int i11) {
        return (i11 & NodeKind.m4118constructorimpl(128)) != 0;
    }

    /* renamed from: or-64DMado, reason: not valid java name */
    public static final int m4128or64DMado(int i11, int i12) {
        return i11 | i12;
    }

    private static final void scheduleInvalidationOfAssociatedFocusTargets(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1024);
        if (!focusPropertiesModifierNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = focusPropertiesModifierNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, focusPropertiesModifierNode.getNode(), false);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) == 0) {
                DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        MutableVector mutableVector2 = null;
                        while (node != null) {
                            if (node instanceof FocusTargetNode) {
                                FocusTargetNodeKt.invalidateFocusTarget((FocusTargetNode) node);
                            } else if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
                                int i11 = 0;
                                for (Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            node = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (node != null) {
                                                mutableVector2.add(node);
                                                node = null;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            node = DelegatableNodeKt.pop(mutableVector2);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
    }

    private static final boolean specifiesCanFocusProperty(FocusPropertiesModifierNode focusPropertiesModifierNode) {
        CanFocusChecker canFocusChecker = CanFocusChecker.INSTANCE;
        canFocusChecker.reset();
        focusPropertiesModifierNode.applyFocusProperties(canFocusChecker);
        return canFocusChecker.isCanFocusSet();
    }

    private static /* synthetic */ void getInserted$annotations() {
    }

    private static /* synthetic */ void getRemoved$annotations() {
    }

    private static /* synthetic */ void getUpdated$annotations() {
    }

    public static final int calculateNodeKindSetFrom(@k Modifier.Element element) {
        int m4118constructorimpl = NodeKind.m4118constructorimpl(1);
        if (element instanceof LayoutModifier) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(2);
        }
        if (element instanceof DrawModifier) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(4);
        }
        if (element instanceof SemanticsModifier) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(8);
        }
        if (element instanceof PointerInputModifier) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(16);
        }
        if ((element instanceof ModifierLocalConsumer) || (element instanceof ModifierLocalProvider)) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(32);
        }
        if (element instanceof FocusEventModifier) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(4096);
        }
        if (element instanceof FocusOrderModifier) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(2048);
        }
        if (element instanceof OnGloballyPositionedModifier) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(256);
        }
        if (element instanceof ParentDataModifier) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(64);
        }
        if ((element instanceof OnPlacedModifier) || (element instanceof OnRemeasuredModifier)) {
            m4118constructorimpl |= NodeKind.m4118constructorimpl(128);
        }
        return element instanceof BringIntoViewModifierNode ? NodeKind.m4118constructorimpl(524288) | m4118constructorimpl : m4118constructorimpl;
    }
}
