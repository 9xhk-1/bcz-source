package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDelegatingNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n*L\n1#1,279:1\n240#1,6:280\n240#1,6:286\n240#1,6:308\n240#1,6:314\n240#1,6:320\n240#1,6:326\n240#1,6:332\n56#2,5:292\n56#2,5:303\n83#3:297\n83#3:299\n83#3:301\n64#4:298\n64#4:300\n64#4:302\n*S KotlinDebug\n*F\n+ 1 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n*L\n44#1:280,6\n61#1:286,6\n249#1:308,6\n260#1:314,6\n266#1:320,6\n270#1:326,6\n276#1:332,6\n90#1:292,5\n187#1:303,5\n112#1:297\n168#1:299\n182#1:301\n112#1:298\n168#1:300\n182#1:302\n*E\n"})
/* loaded from: classes2.dex */
public abstract class DelegatingNode extends Modifier.Node {
    public static final int $stable = 8;

    @l
    private Modifier.Node delegate;
    private final int selfKindSet = NodeKindKt.calculateNodeKindSetFrom(this);

    private final void updateNodeKindSet(int i11, boolean z11) {
        Modifier.Node child$ui_release;
        int kindSet$ui_release = getKindSet$ui_release();
        setKindSet$ui_release(i11);
        if (kindSet$ui_release != i11) {
            if (DelegatableNodeKt.isDelegationRoot(this)) {
                setAggregateChildKindSet$ui_release(i11);
            }
            if (isAttached()) {
                Modifier.Node node = getNode();
                Modifier.Node node2 = this;
                while (node2 != null) {
                    i11 |= node2.getKindSet$ui_release();
                    node2.setKindSet$ui_release(i11);
                    if (node2 == node) {
                        break;
                    } else {
                        node2 = node2.getParent$ui_release();
                    }
                }
                if (z11 && node2 == node) {
                    i11 = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
                    node.setKindSet$ui_release(i11);
                }
                int aggregateChildKindSet$ui_release = i11 | ((node2 == null || (child$ui_release = node2.getChild$ui_release()) == null) ? 0 : child$ui_release.getAggregateChildKindSet$ui_release());
                while (node2 != null) {
                    aggregateChildKindSet$ui_release |= node2.getKindSet$ui_release();
                    node2.setAggregateChildKindSet$ui_release(aggregateChildKindSet$ui_release);
                    node2 = node2.getParent$ui_release();
                }
            }
        }
    }

    private final void validateDelegateKindSet(int i11, Modifier.Node node) {
        int kindSet$ui_release = getKindSet$ui_release();
        if ((i11 & NodeKind.m4118constructorimpl(2)) == 0 || (NodeKind.m4118constructorimpl(2) & kindSet$ui_release) == 0 || (this instanceof LayoutModifierNode)) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + node);
    }

    @k
    public final <T extends DelegatableNode> T delegate(@k T t11) {
        Modifier.Node node = t11.getNode();
        if (node != t11) {
            Modifier.Node node2 = t11 instanceof Modifier.Node ? (Modifier.Node) t11 : null;
            Modifier.Node parent$ui_release = node2 != null ? node2.getParent$ui_release() : null;
            if (node == getNode() && g0.g(parent$ui_release, this)) {
                return t11;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node");
        }
        if (node.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot delegate to an already attached node");
        }
        node.setAsDelegateTo$ui_release(getNode());
        int kindSet$ui_release = getKindSet$ui_release();
        int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(node);
        node.setKindSet$ui_release(calculateNodeKindSetFromIncludingDelegates);
        validateDelegateKindSet(calculateNodeKindSetFromIncludingDelegates, node);
        node.setChild$ui_release(this.delegate);
        this.delegate = node;
        node.setParent$ui_release(this);
        updateNodeKindSet(getKindSet$ui_release() | calculateNodeKindSetFromIncludingDelegates, false);
        if (isAttached()) {
            if ((calculateNodeKindSetFromIncludingDelegates & NodeKind.m4118constructorimpl(2)) == 0 || (kindSet$ui_release & NodeKind.m4118constructorimpl(2)) != 0) {
                updateCoordinator$ui_release(getCoordinator$ui_release());
            } else {
                NodeChain nodes$ui_release = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                getNode().updateCoordinator$ui_release(null);
                nodes$ui_release.syncCoordinators();
            }
            node.markAsAttached$ui_release();
            node.runAttachLifecycle$ui_release();
            NodeKindKt.autoInvalidateInsertedNode(node);
        }
        return t11;
    }

    @k
    public final <T extends DelegatableNode> T delegateUnprotected$ui_release(@k T t11) {
        return (T) delegate(t11);
    }

    public final void forEachImmediateDelegate$ui_release(@k x00.l<? super Modifier.Node, g2> lVar) {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            lVar.invoke(delegate$ui_release);
        }
    }

    @l
    public final Modifier.Node getDelegate$ui_release() {
        return this.delegate;
    }

    public final int getSelfKindSet$ui_release() {
        return this.selfKindSet;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsAttached$ui_release() {
        super.markAsAttached$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(getCoordinator$ui_release());
            if (!delegate$ui_release.isAttached()) {
                delegate$ui_release.markAsAttached$ui_release();
            }
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void markAsDetached$ui_release() {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.markAsDetached$ui_release();
        }
        super.markAsDetached$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void reset$ui_release() {
        super.reset$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.reset$ui_release();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runAttachLifecycle$ui_release() {
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runAttachLifecycle$ui_release();
        }
        super.runAttachLifecycle$ui_release();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void runDetachLifecycle$ui_release() {
        super.runDetachLifecycle$ui_release();
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.runDetachLifecycle$ui_release();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void setAsDelegateTo$ui_release(@k Modifier.Node node) {
        super.setAsDelegateTo$ui_release(node);
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.setAsDelegateTo$ui_release(node);
        }
    }

    public final void setDelegate$ui_release(@l Modifier.Node node) {
        this.delegate = node;
    }

    public final void undelegate(@k DelegatableNode delegatableNode) {
        Modifier.Node node = null;
        for (Modifier.Node node2 = this.delegate; node2 != null; node2 = node2.getChild$ui_release()) {
            if (node2 == delegatableNode) {
                if (node2.isAttached()) {
                    NodeKindKt.autoInvalidateRemovedNode(node2);
                    node2.runDetachLifecycle$ui_release();
                    node2.markAsDetached$ui_release();
                }
                node2.setAsDelegateTo$ui_release(node2);
                node2.setAggregateChildKindSet$ui_release(0);
                if (node == null) {
                    this.delegate = node2.getChild$ui_release();
                } else {
                    node.setChild$ui_release(node2.getChild$ui_release());
                }
                node2.setChild$ui_release(null);
                node2.setParent$ui_release(null);
                int kindSet$ui_release = getKindSet$ui_release();
                int calculateNodeKindSetFromIncludingDelegates = NodeKindKt.calculateNodeKindSetFromIncludingDelegates(this);
                updateNodeKindSet(calculateNodeKindSetFromIncludingDelegates, true);
                if (isAttached() && (kindSet$ui_release & NodeKind.m4118constructorimpl(2)) != 0 && (NodeKind.m4118constructorimpl(2) & calculateNodeKindSetFromIncludingDelegates) == 0) {
                    NodeChain nodes$ui_release = DelegatableNodeKt.requireLayoutNode(this).getNodes$ui_release();
                    getNode().updateCoordinator$ui_release(null);
                    nodes$ui_release.syncCoordinators();
                    return;
                }
                return;
            }
            node = node2;
        }
        throw new IllegalStateException(("Could not find delegate: " + delegatableNode).toString());
    }

    public final void undelegateUnprotected$ui_release(@k DelegatableNode delegatableNode) {
        undelegate(delegatableNode);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void updateCoordinator$ui_release(@l NodeCoordinator nodeCoordinator) {
        super.updateCoordinator$ui_release(nodeCoordinator);
        for (Modifier.Node delegate$ui_release = getDelegate$ui_release(); delegate$ui_release != null; delegate$ui_release = delegate$ui_release.getChild$ui_release()) {
            delegate$ui_release.updateCoordinator$ui_release(nodeCoordinator);
        }
    }

    public static /* synthetic */ void getSelfKindSet$ui_release$annotations() {
    }
}
