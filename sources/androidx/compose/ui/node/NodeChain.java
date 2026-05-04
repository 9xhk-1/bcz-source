package androidx.compose.ui.node;

import a00.h0;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 9 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n1#1,807:1\n712#1,6:861\n683#1,6:867\n683#1,6:873\n691#1,3:880\n694#1,3:886\n712#1,6:889\n712#1,6:895\n662#1,6:908\n683#1,3:914\n668#1,2:917\n671#1,2:962\n686#1,3:964\n673#1:967\n663#1:968\n666#1,2:969\n683#1,3:971\n668#1,2:974\n671#1,2:1019\n686#1,3:1021\n673#1:1024\n683#1,6:1025\n703#1,12:1031\n715#1,3:1086\n709#1:1089\n712#1,6:1090\n699#1,16:1096\n715#1,3:1155\n709#1:1158\n700#1:1159\n662#1,6:1160\n683#1,3:1166\n668#1,2:1169\n671#1,2:1214\n686#1,3:1216\n673#1:1219\n663#1:1220\n691#1,6:1221\n56#2,5:808\n56#2,5:813\n56#2,5:818\n76#2,7:826\n76#2,7:835\n76#2,7:842\n76#2,7:850\n56#2,5:903\n1101#3:823\n1083#3,2:824\n1083#3,2:858\n1084#3:879\n1101#3:939\n1083#3,2:940\n1101#3:996\n1083#3,2:997\n1101#3:1063\n1083#3,2:1064\n1101#3:1132\n1083#3,2:1133\n1101#3:1191\n1083#3,2:1192\n472#4:833\n472#4:834\n472#4:849\n472#4:857\n472#4:883\n641#4,2:884\n1#5:860\n83#6:901\n246#7:902\n246#7:925\n246#7:982\n246#7:1049\n246#7:1118\n246#7:1177\n437#8,6:919\n447#8,2:926\n449#8,8:931\n457#8,9:942\n466#8,8:954\n437#8,6:976\n447#8,2:983\n449#8,8:988\n457#8,9:999\n466#8,8:1011\n437#8,6:1043\n447#8,2:1050\n449#8,8:1055\n457#8,9:1066\n466#8,8:1078\n437#8,6:1112\n447#8,2:1119\n449#8,8:1124\n457#8,9:1135\n466#8,8:1147\n437#8,6:1171\n447#8,2:1178\n449#8,8:1183\n457#8,9:1194\n466#8,8:1206\n240#9,3:928\n243#9,3:951\n240#9,3:985\n243#9,3:1008\n240#9,3:1052\n243#9,3:1075\n240#9,3:1121\n243#9,3:1144\n240#9,3:1180\n243#9,3:1203\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n*L\n226#1:861,6\n285#1:867,6\n302#1:873,6\n327#1:880,3\n327#1:886,3\n366#1:889,6\n370#1:895,6\n657#1:908,6\n657#1:914,3\n657#1:917,2\n657#1:962,2\n657#1:964,3\n657#1:967\n657#1:968\n662#1:969,2\n662#1:971,3\n662#1:974,2\n662#1:1019,2\n662#1:1021,3\n662#1:1024\n667#1:1025,6\n699#1:1031,12\n699#1:1086,3\n699#1:1089\n704#1:1090,6\n720#1:1096,16\n720#1:1155,3\n720#1:1158\n720#1:1159\n727#1:1160,6\n727#1:1166,3\n727#1:1169,2\n727#1:1214,2\n727#1:1216,3\n727#1:1219\n727#1:1220\n743#1:1221,6\n69#1:808,5\n77#1:813,5\n85#1:818,5\n131#1:826,7\n161#1:835,7\n162#1:842,7\n191#1:850,7\n599#1:903,5\n121#1:823\n121#1:824,2\n203#1:858,2\n325#1:879\n657#1:939\n657#1:940,2\n662#1:996\n662#1:997,2\n699#1:1063\n699#1:1064,2\n720#1:1132\n720#1:1133,2\n727#1:1191\n727#1:1192,2\n132#1:833\n133#1:834\n183#1:849\n195#1:857\n360#1:883\n360#1:884,2\n420#1:901\n420#1:902\n657#1:925\n662#1:982\n699#1:1049\n720#1:1118\n727#1:1177\n657#1:919,6\n657#1:926,2\n657#1:931,8\n657#1:942,9\n657#1:954,8\n662#1:976,6\n662#1:983,2\n662#1:988,8\n662#1:999,9\n662#1:1011,8\n699#1:1043,6\n699#1:1050,2\n699#1:1055,8\n699#1:1066,9\n699#1:1078,8\n720#1:1112,6\n720#1:1119,2\n720#1:1124,8\n720#1:1135,9\n720#1:1147,8\n727#1:1171,6\n727#1:1178,2\n727#1:1183,8\n727#1:1194,9\n727#1:1206,8\n657#1:928,3\n657#1:951,3\n662#1:985,3\n662#1:1008,3\n699#1:1052,3\n699#1:1075,3\n720#1:1121,3\n720#1:1144,3\n727#1:1180,3\n727#1:1203,3\n*E\n"})
/* loaded from: classes2.dex */
public final class NodeChain {
    public static final int $stable = 8;

    @l
    private MutableVector<Modifier.Element> buffer;

    @l
    private Differ cachedDiffer;

    @l
    private MutableVector<Modifier.Element> current;

    @k
    private Modifier.Node head;

    @k
    private final InnerNodeCoordinator innerCoordinator;

    @k
    private final LayoutNode layoutNode;

    @l
    private Logger logger;

    @k
    private NodeCoordinator outerCoordinator;

    @k
    private final Modifier.Node tail;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNodeChain.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n*L\n1#1,807:1\n472#2:808\n472#2:809\n472#2:810\n472#2:811\n472#2:814\n472#2:815\n83#3:812\n246#4:813\n*S KotlinDebug\n*F\n+ 1 NodeChain.kt\nandroidx/compose/ui/node/NodeChain$Differ\n*L\n434#1:808\n441#1:809\n442#1:810\n467#1:811\n483#1:814\n484#1:815\n468#1:812\n468#1:813\n*E\n"})
    public final class Differ implements DiffCallback {

        @k
        private MutableVector<Modifier.Element> after;

        @k
        private MutableVector<Modifier.Element> before;

        @k
        private Modifier.Node node;
        private int offset;
        private boolean shouldAttachOnInsert;

        public Differ(@k Modifier.Node node, int i11, @k MutableVector<Modifier.Element> mutableVector, @k MutableVector<Modifier.Element> mutableVector2, boolean z11) {
            this.node = node;
            this.offset = i11;
            this.before = mutableVector;
            this.after = mutableVector2;
            this.shouldAttachOnInsert = z11;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public boolean areItemsTheSame(int i11, int i12) {
            MutableVector<Modifier.Element> mutableVector = this.before;
            int i13 = this.offset;
            return NodeChainKt.actionForModifiers(mutableVector.content[i11 + i13], this.after.content[i13 + i12]) != 0;
        }

        @k
        public final MutableVector<Modifier.Element> getAfter() {
            return this.after;
        }

        @k
        public final MutableVector<Modifier.Element> getBefore() {
            return this.before;
        }

        @k
        public final Modifier.Node getNode() {
            return this.node;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final boolean getShouldAttachOnInsert() {
            return this.shouldAttachOnInsert;
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void insert(int i11) {
            int i12 = this.offset + i11;
            Modifier.Node node = this.node;
            this.node = NodeChain.this.createAndInsertNodeAsChild(this.after.content[i12], node);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                logger.nodeInserted(i12, i12, this.after.content[i12], node, this.node);
            }
            if (!this.shouldAttachOnInsert) {
                this.node.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            g0.m(child$ui_release);
            NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
            g0.m(coordinator$ui_release);
            LayoutModifierNode asLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(this.node);
            if (asLayoutModifierNode != null) {
                LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(NodeChain.this.getLayoutNode(), asLayoutModifierNode);
                this.node.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                NodeChain.this.propagateCoordinator(this.node, layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrappedBy$ui_release(coordinator$ui_release.getWrappedBy$ui_release());
                layoutModifierNodeCoordinator.setWrapped$ui_release(coordinator$ui_release);
                coordinator$ui_release.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
            } else {
                this.node.updateCoordinator$ui_release(coordinator$ui_release);
            }
            this.node.markAsAttached$ui_release();
            this.node.runAttachLifecycle$ui_release();
            NodeKindKt.autoInvalidateInsertedNode(this.node);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void remove(int i11, int i12) {
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            g0.m(child$ui_release);
            Logger logger = NodeChain.this.logger;
            if (logger != null) {
                MutableVector<Modifier.Element> mutableVector = this.before;
                logger.nodeRemoved(i12, mutableVector.content[this.offset + i12], child$ui_release);
            }
            if ((NodeKind.m4118constructorimpl(2) & child$ui_release.getKindSet$ui_release()) != 0) {
                NodeCoordinator coordinator$ui_release = child$ui_release.getCoordinator$ui_release();
                g0.m(coordinator$ui_release);
                NodeCoordinator wrappedBy$ui_release = coordinator$ui_release.getWrappedBy$ui_release();
                NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
                g0.m(wrapped$ui_release);
                if (wrappedBy$ui_release != null) {
                    wrappedBy$ui_release.setWrapped$ui_release(wrapped$ui_release);
                }
                wrapped$ui_release.setWrappedBy$ui_release(wrappedBy$ui_release);
                NodeChain.this.propagateCoordinator(this.node, wrapped$ui_release);
            }
            this.node = NodeChain.this.detachAndRemoveNode(child$ui_release);
        }

        @Override // androidx.compose.ui.node.DiffCallback
        public void same(int i11, int i12) {
            Modifier.Node child$ui_release = this.node.getChild$ui_release();
            g0.m(child$ui_release);
            this.node = child$ui_release;
            MutableVector<Modifier.Element> mutableVector = this.before;
            int i13 = this.offset;
            Modifier.Element element = mutableVector.content[i13 + i11];
            Modifier.Element element2 = this.after.content[i13 + i12];
            if (g0.g(element, element2)) {
                Logger logger = NodeChain.this.logger;
                if (logger != null) {
                    int i14 = this.offset;
                    logger.nodeReused(i14 + i11, i14 + i12, element, element2, this.node);
                    return;
                }
                return;
            }
            NodeChain.this.updateNode(element, element2, this.node);
            Logger logger2 = NodeChain.this.logger;
            if (logger2 != null) {
                int i15 = this.offset;
                logger2.nodeUpdated(i15 + i11, i15 + i12, element, element2, this.node);
            }
        }

        public final void setAfter(@k MutableVector<Modifier.Element> mutableVector) {
            this.after = mutableVector;
        }

        public final void setBefore(@k MutableVector<Modifier.Element> mutableVector) {
            this.before = mutableVector;
        }

        public final void setNode(@k Modifier.Node node) {
            this.node = node;
        }

        public final void setOffset(int i11) {
            this.offset = i11;
        }

        public final void setShouldAttachOnInsert(boolean z11) {
            this.shouldAttachOnInsert = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Logger {
        void linearDiffAborted(int i11, @k Modifier.Element element, @k Modifier.Element element2, @k Modifier.Node node);

        void nodeInserted(int i11, int i12, @k Modifier.Element element, @k Modifier.Node node, @k Modifier.Node node2);

        void nodeRemoved(int i11, @k Modifier.Element element, @k Modifier.Node node);

        void nodeReused(int i11, int i12, @k Modifier.Element element, @k Modifier.Element element2, @k Modifier.Node node);

        void nodeUpdated(int i11, int i12, @k Modifier.Element element, @k Modifier.Element element2, @k Modifier.Node node);
    }

    public NodeChain(@k LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
        InnerNodeCoordinator innerNodeCoordinator = new InnerNodeCoordinator(layoutNode);
        this.innerCoordinator = innerNodeCoordinator;
        this.outerCoordinator = innerNodeCoordinator;
        TailModifierNode tail = innerNodeCoordinator.getTail();
        this.tail = tail;
        this.head = tail;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node createAndInsertNodeAsChild(Modifier.Element element, Modifier.Node node) {
        Modifier.Node backwardsCompatNode;
        if (element instanceof ModifierNodeElement) {
            backwardsCompatNode = ((ModifierNodeElement) element).create();
            backwardsCompatNode.setKindSet$ui_release(NodeKindKt.calculateNodeKindSetFromIncludingDelegates(backwardsCompatNode));
        } else {
            backwardsCompatNode = new BackwardsCompatNode(element);
        }
        if (backwardsCompatNode.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        backwardsCompatNode.setInsertedNodeAwaitingAttachForInvalidation$ui_release(true);
        return insertChild(backwardsCompatNode, node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Modifier.Node detachAndRemoveNode(Modifier.Node node) {
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateRemovedNode(node);
            node.runDetachLifecycle$ui_release();
            node.markAsDetached$ui_release();
        }
        return removeNode(node);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAggregateChildKindSet() {
        return this.head.getAggregateChildKindSet$ui_release();
    }

    private final Differ getDiffer(Modifier.Node node, int i11, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, boolean z11) {
        Differ differ = this.cachedDiffer;
        if (differ == null) {
            Differ differ2 = new Differ(node, i11, mutableVector, mutableVector2, z11);
            this.cachedDiffer = differ2;
            return differ2;
        }
        differ.setNode(node);
        differ.setOffset(i11);
        differ.setBefore(mutableVector);
        differ.setAfter(mutableVector2);
        differ.setShouldAttachOnInsert(z11);
        return differ;
    }

    private final Modifier.Node insertChild(Modifier.Node node, Modifier.Node node2) {
        Modifier.Node child$ui_release = node2.getChild$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(node);
            node.setChild$ui_release(child$ui_release);
        }
        node2.setChild$ui_release(node);
        node.setParent$ui_release(node2);
        return node;
    }

    private final Modifier.Node padChain() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        Modifier.Node node = this.head;
        nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
        if (!(node != nodeChainKt$SentinelHead$1)) {
            InlineClassHelperKt.throwIllegalStateException("padChain called on already padded chain");
        }
        Modifier.Node node2 = this.head;
        nodeChainKt$SentinelHead$12 = NodeChainKt.SentinelHead;
        node2.setParent$ui_release(nodeChainKt$SentinelHead$12);
        nodeChainKt$SentinelHead$13 = NodeChainKt.SentinelHead;
        nodeChainKt$SentinelHead$13.setChild$ui_release(node2);
        nodeChainKt$SentinelHead$14 = NodeChainKt.SentinelHead;
        return nodeChainKt$SentinelHead$14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void propagateCoordinator(Modifier.Node node, NodeCoordinator nodeCoordinator) {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        for (Modifier.Node parent$ui_release = node.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
            if (parent$ui_release == nodeChainKt$SentinelHead$1) {
                LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
                nodeCoordinator.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
                this.outerCoordinator = nodeCoordinator;
                return;
            } else {
                if ((NodeKind.m4118constructorimpl(2) & parent$ui_release.getKindSet$ui_release()) != 0) {
                    return;
                }
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
            }
        }
    }

    private final Modifier.Node removeNode(Modifier.Node node) {
        Modifier.Node child$ui_release = node.getChild$ui_release();
        Modifier.Node parent$ui_release = node.getParent$ui_release();
        if (child$ui_release != null) {
            child$ui_release.setParent$ui_release(parent$ui_release);
            node.setChild$ui_release(null);
        }
        if (parent$ui_release != null) {
            parent$ui_release.setChild$ui_release(child$ui_release);
            node.setParent$ui_release(null);
        }
        g0.m(parent$ui_release);
        return parent$ui_release;
    }

    private final void structuralUpdate(int i11, MutableVector<Modifier.Element> mutableVector, MutableVector<Modifier.Element> mutableVector2, Modifier.Node node, boolean z11) {
        MyersDiffKt.executeDiff(mutableVector.getSize() - i11, mutableVector2.getSize() - i11, getDiffer(node, i11, mutableVector, mutableVector2, z11));
        syncAggregateChildKindSet();
    }

    private final void syncAggregateChildKindSet() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        int i11 = 0;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
            if (parent$ui_release == nodeChainKt$SentinelHead$1) {
                return;
            }
            i11 |= parent$ui_release.getKindSet$ui_release();
            parent$ui_release.setAggregateChildKindSet$ui_release(i11);
        }
    }

    private final Modifier.Node trimChain(Modifier.Node node) {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$12;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$13;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$14;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$15;
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$16;
        nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
        if (!(node == nodeChainKt$SentinelHead$1)) {
            InlineClassHelperKt.throwIllegalStateException("trimChain called on already trimmed chain");
        }
        nodeChainKt$SentinelHead$12 = NodeChainKt.SentinelHead;
        Modifier.Node child$ui_release = nodeChainKt$SentinelHead$12.getChild$ui_release();
        if (child$ui_release == null) {
            child$ui_release = this.tail;
        }
        child$ui_release.setParent$ui_release(null);
        nodeChainKt$SentinelHead$13 = NodeChainKt.SentinelHead;
        nodeChainKt$SentinelHead$13.setChild$ui_release(null);
        nodeChainKt$SentinelHead$14 = NodeChainKt.SentinelHead;
        nodeChainKt$SentinelHead$14.setAggregateChildKindSet$ui_release(-1);
        nodeChainKt$SentinelHead$15 = NodeChainKt.SentinelHead;
        nodeChainKt$SentinelHead$15.updateCoordinator$ui_release(null);
        nodeChainKt$SentinelHead$16 = NodeChainKt.SentinelHead;
        if (!(child$ui_release != nodeChainKt$SentinelHead$16)) {
            InlineClassHelperKt.throwIllegalStateException("trimChain did not update the head");
        }
        return child$ui_release;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNode(Modifier.Element element, Modifier.Element element2, Modifier.Node node) {
        if ((element instanceof ModifierNodeElement) && (element2 instanceof ModifierNodeElement)) {
            NodeChainKt.updateUnsafe((ModifierNodeElement) element2, node);
            if (node.isAttached()) {
                NodeKindKt.autoInvalidateUpdatedNode(node);
                return;
            } else {
                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                return;
            }
        }
        if (!(node instanceof BackwardsCompatNode)) {
            InlineClassHelperKt.throwIllegalStateException("Unknown Modifier.Node type");
            return;
        }
        ((BackwardsCompatNode) node).setElement(element2);
        if (node.isAttached()) {
            NodeKindKt.autoInvalidateUpdatedNode(node);
        } else {
            node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
        }
    }

    /* renamed from: firstFromHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m4078firstFromHeadaLcG6gQ$ui_release(int i11, x00.l<? super T, Boolean> lVar) {
        if ((getAggregateChildKindSet() & i11) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i11) != 0) {
                    for (Modifier.Node node = head$ui_release; node != null; node = DelegatableNodeKt.pop(null)) {
                        g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                        if (lVar.invoke(node).booleanValue()) {
                            return node;
                        }
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i11) == 0) {
                    break;
                }
            }
        }
        return null;
    }

    @k
    public final Modifier.Node getHead$ui_release() {
        return this.head;
    }

    @k
    public final InnerNodeCoordinator getInnerCoordinator$ui_release() {
        return this.innerCoordinator;
    }

    @k
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @k
    public final List<ModifierInfo> getModifierInfo() {
        MutableVector<Modifier.Element> mutableVector = this.current;
        if (mutableVector == null) {
            return h0.J();
        }
        int i11 = 0;
        MutableVector mutableVector2 = new MutableVector(new ModifierInfo[mutableVector.getSize()], 0);
        Modifier.Node head$ui_release = getHead$ui_release();
        while (head$ui_release != null && head$ui_release != getTail$ui_release()) {
            NodeCoordinator coordinator$ui_release = head$ui_release.getCoordinator$ui_release();
            if (coordinator$ui_release == null) {
                throw new IllegalArgumentException("getModifierInfo called on node with no coordinator");
            }
            OwnedLayer layer = coordinator$ui_release.getLayer();
            OwnedLayer layer2 = this.innerCoordinator.getLayer();
            Modifier.Node child$ui_release = head$ui_release.getChild$ui_release();
            if (child$ui_release != this.tail || head$ui_release.getCoordinator$ui_release() == child$ui_release.getCoordinator$ui_release()) {
                layer2 = null;
            }
            if (layer == null) {
                layer = layer2;
            }
            mutableVector2.add(new ModifierInfo(mutableVector.content[i11], coordinator$ui_release, layer));
            head$ui_release = head$ui_release.getChild$ui_release();
            i11++;
        }
        return mutableVector2.asMutableList();
    }

    @k
    public final NodeCoordinator getOuterCoordinator$ui_release() {
        return this.outerCoordinator;
    }

    @k
    public final Modifier.Node getTail$ui_release() {
        return this.tail;
    }

    public final boolean has$ui_release(int i11) {
        return (i11 & getAggregateChildKindSet()) != 0;
    }

    /* renamed from: has-H91voCI$ui_release, reason: not valid java name */
    public final boolean m4079hasH91voCI$ui_release(int i11) {
        return (i11 & getAggregateChildKindSet()) != 0;
    }

    /* renamed from: head-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m4080headH91voCI$ui_release(int i11) {
        if ((getAggregateChildKindSet() & i11) == 0) {
            return null;
        }
        for (Object obj = (T) getHead$ui_release(); obj != null; obj = (T) ((Modifier.Node) obj).getChild$ui_release()) {
            if ((((Modifier.Node) obj).getKindSet$ui_release() & i11) != 0) {
                g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) obj;
            }
            if ((((Modifier.Node) obj).getAggregateChildKindSet$ui_release() & i11) == 0) {
                return null;
            }
        }
        return null;
    }

    public final void headToTail$ui_release(int i11, @k x00.l<? super Modifier.Node, g2> lVar) {
        if ((getAggregateChildKindSet() & i11) == 0) {
            return;
        }
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((head$ui_release.getKindSet$ui_release() & i11) != 0) {
                lVar.invoke(head$ui_release);
            }
            if ((head$ui_release.getAggregateChildKindSet$ui_release() & i11) == 0) {
                return;
            }
        }
    }

    /* renamed from: headToTail-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m4081headToTailaLcG6gQ$ui_release(int i11, x00.l<? super T, g2> lVar) {
        if ((getAggregateChildKindSet() & i11) != 0) {
            for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & i11) != 0) {
                    for (Modifier.Node node = head$ui_release; node != null; node = DelegatableNodeKt.pop(null)) {
                        g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                        lVar.invoke(node);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & i11) == 0) {
                    return;
                }
            }
        }
    }

    public final void headToTailExclusive$ui_release(@k x00.l<? super Modifier.Node, g2> lVar) {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null && head$ui_release != getTail$ui_release(); head$ui_release = head$ui_release.getChild$ui_release()) {
            lVar.invoke(head$ui_release);
        }
    }

    public final boolean isUpdating$ui_release() {
        NodeChainKt$SentinelHead$1 nodeChainKt$SentinelHead$1;
        nodeChainKt$SentinelHead$1 = NodeChainKt.SentinelHead;
        return nodeChainKt$SentinelHead$1.getChild$ui_release() != null;
    }

    public final void markAsAttached() {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.markAsAttached$ui_release();
        }
    }

    public final void markAsDetached$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.markAsDetached$ui_release();
            }
        }
    }

    public final void resetState$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.reset$ui_release();
            }
        }
        runDetachLifecycle$ui_release();
        markAsDetached$ui_release();
    }

    public final void runAttachLifecycle() {
        NodeCoordinator nodeCoordinator = this.outerCoordinator;
        InnerNodeCoordinator innerNodeCoordinator = this.innerCoordinator;
        while (nodeCoordinator != innerNodeCoordinator) {
            nodeCoordinator.onAttach();
            nodeCoordinator = nodeCoordinator.getWrapped$ui_release();
            g0.m(nodeCoordinator);
        }
        innerNodeCoordinator.onAttach();
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            head$ui_release.runAttachLifecycle$ui_release();
            if (head$ui_release.getInsertedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateInsertedNode(head$ui_release);
            }
            if (head$ui_release.getUpdatedNodeAwaitingAttachForInvalidation$ui_release()) {
                NodeKindKt.autoInvalidateUpdatedNode(head$ui_release);
            }
            head$ui_release.setInsertedNodeAwaitingAttachForInvalidation$ui_release(false);
            head$ui_release.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(false);
        }
    }

    public final void runDetachLifecycle$ui_release() {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if (tail$ui_release.isAttached()) {
                tail$ui_release.runDetachLifecycle$ui_release();
            }
        }
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        NodeCoordinator nodeCoordinator2 = this.outerCoordinator;
        while (nodeCoordinator != nodeCoordinator2) {
            nodeCoordinator.onDetach();
            nodeCoordinator = nodeCoordinator.getWrappedBy$ui_release();
            g0.m(nodeCoordinator);
        }
        nodeCoordinator2.onDetach();
    }

    public final void syncCoordinators() {
        NodeCoordinator layoutModifierNodeCoordinator;
        NodeCoordinator nodeCoordinator = this.innerCoordinator;
        for (Modifier.Node parent$ui_release = this.tail.getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            LayoutModifierNode asLayoutModifierNode = DelegatableNodeKt.asLayoutModifierNode(parent$ui_release);
            if (asLayoutModifierNode != null) {
                if (parent$ui_release.getCoordinator$ui_release() != null) {
                    NodeCoordinator coordinator$ui_release = parent$ui_release.getCoordinator$ui_release();
                    g0.n(coordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                    layoutModifierNodeCoordinator = (LayoutModifierNodeCoordinator) coordinator$ui_release;
                    LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
                    layoutModifierNodeCoordinator.setLayoutModifierNode$ui_release(asLayoutModifierNode);
                    if (layoutModifierNode != parent$ui_release) {
                        layoutModifierNodeCoordinator.onLayoutModifierNodeChanged();
                    }
                } else {
                    layoutModifierNodeCoordinator = new LayoutModifierNodeCoordinator(this.layoutNode, asLayoutModifierNode);
                    parent$ui_release.updateCoordinator$ui_release(layoutModifierNodeCoordinator);
                }
                nodeCoordinator.setWrappedBy$ui_release(layoutModifierNodeCoordinator);
                layoutModifierNodeCoordinator.setWrapped$ui_release(nodeCoordinator);
                nodeCoordinator = layoutModifierNodeCoordinator;
            } else {
                parent$ui_release.updateCoordinator$ui_release(nodeCoordinator);
            }
        }
        LayoutNode parent$ui_release2 = this.layoutNode.getParent$ui_release();
        nodeCoordinator.setWrappedBy$ui_release(parent$ui_release2 != null ? parent$ui_release2.getInnerCoordinator$ui_release() : null);
        this.outerCoordinator = nodeCoordinator;
    }

    /* renamed from: tail-H91voCI$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> T m4082tailH91voCI$ui_release(int i11) {
        if ((getAggregateChildKindSet() & i11) == 0) {
            return null;
        }
        for (Object obj = (T) getTail$ui_release(); obj != null; obj = (T) ((Modifier.Node) obj).getParent$ui_release()) {
            if ((((Modifier.Node) obj).getKindSet$ui_release() & i11) != 0) {
                g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                return (T) obj;
            }
        }
        return null;
    }

    public final void tailToHead$ui_release(int i11, @k x00.l<? super Modifier.Node, g2> lVar) {
        if ((getAggregateChildKindSet() & i11) == 0) {
            return;
        }
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((tail$ui_release.getKindSet$ui_release() & i11) != 0) {
                lVar.invoke(tail$ui_release);
            }
        }
    }

    /* renamed from: tailToHead-aLcG6gQ$ui_release, reason: not valid java name */
    public final /* synthetic */ <T> void m4083tailToHeadaLcG6gQ$ui_release(int i11, x00.l<? super T, g2> lVar) {
        if ((getAggregateChildKindSet() & i11) != 0) {
            for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                if ((tail$ui_release.getKindSet$ui_release() & i11) != 0) {
                    for (Modifier.Node node = tail$ui_release; node != null; node = DelegatableNodeKt.pop(null)) {
                        g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                        lVar.invoke(node);
                    }
                }
            }
        }
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        if (this.head != this.tail) {
            Modifier.Node head$ui_release = getHead$ui_release();
            while (true) {
                if (head$ui_release == null || head$ui_release == getTail$ui_release()) {
                    break;
                }
                sb2.append(String.valueOf(head$ui_release));
                if (head$ui_release.getChild$ui_release() == this.tail) {
                    sb2.append("]");
                    break;
                }
                sb2.append(",");
                head$ui_release = head$ui_release.getChild$ui_release();
            }
        } else {
            sb2.append("]");
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateFrom$ui_release(@m80.k androidx.compose.ui.Modifier r18) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeChain.updateFrom$ui_release(androidx.compose.ui.Modifier):void");
    }

    public final void useLogger$ui_release(@l Logger logger) {
        this.logger = logger;
    }

    public final void tailToHead$ui_release(@k x00.l<? super Modifier.Node, g2> lVar) {
        for (Modifier.Node tail$ui_release = getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            lVar.invoke(tail$ui_release);
        }
    }

    public final void headToTail$ui_release(@k x00.l<? super Modifier.Node, g2> lVar) {
        for (Modifier.Node head$ui_release = getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            lVar.invoke(head$ui_release);
        }
    }
}
