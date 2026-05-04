package androidx.compose.ui.relocation;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.unit.IntSizeKt;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBringIntoViewModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewModifierNode.kt\nandroidx/compose/ui/relocation/BringIntoViewModifierNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,75:1\n151#2:76\n277#3:77\n247#3,5:78\n90#3:83\n91#3,8:89\n437#3,5:97\n278#3:102\n442#3:103\n447#3,2:105\n449#3,8:110\n457#3,9:121\n466#3,8:133\n100#3,7:141\n280#3:148\n56#4,5:84\n246#5:104\n240#6,3:107\n243#6,3:130\n1101#7:118\n1083#7,2:119\n*S KotlinDebug\n*F\n+ 1 BringIntoViewModifierNode.kt\nandroidx/compose/ui/relocation/BringIntoViewModifierNodeKt\n*L\n64#1:76\n64#1:77\n64#1:78,5\n64#1:83\n64#1:89,8\n64#1:97,5\n64#1:102\n64#1:103\n64#1:105,2\n64#1:110,8\n64#1:121,9\n64#1:133,8\n64#1:141,7\n64#1:148\n64#1:84,5\n64#1:104\n64#1:107,3\n64#1:130,3\n64#1:118\n64#1:119,2\n*E\n"})
/* loaded from: classes2.dex */
public final class BringIntoViewModifierNodeKt {
    @l
    public static final Object bringIntoView(@k DelegatableNode delegatableNode, @l final a<Rect> aVar, @k c<? super g2> cVar) {
        Object obj;
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            return g2.f100423a;
        }
        int m4118constructorimpl = NodeKind.m4118constructorimpl(524288);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        loop0: while (true) {
            obj = null;
            if (requireLayoutNode == null) {
                break;
            }
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        Modifier.Node node = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof BringIntoViewModifierNode) {
                                obj = node;
                                break loop0;
                            }
                            if ((node.getKindSet$ui_release() & m4118constructorimpl) != 0 && (node instanceof DelegatingNode)) {
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
                                                l00.a.a(mutableVector.add(node));
                                                node = null;
                                            }
                                            l00.a.a(mutableVector.add(delegate$ui_release));
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
        BringIntoViewModifierNode bringIntoViewModifierNode = (BringIntoViewModifierNode) obj;
        if (bringIntoViewModifierNode == null) {
            return g2.f100423a;
        }
        final LayoutCoordinates requireLayoutCoordinates = DelegatableNodeKt.requireLayoutCoordinates(delegatableNode);
        Object bringIntoView = bringIntoViewModifierNode.bringIntoView(requireLayoutCoordinates, new a<Rect>() { // from class: androidx.compose.ui.relocation.BringIntoViewModifierNodeKt$bringIntoView$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Rect invoke() {
                Rect invoke;
                a<Rect> aVar2 = aVar;
                if (aVar2 != null && (invoke = aVar2.invoke()) != null) {
                    return invoke;
                }
                LayoutCoordinates layoutCoordinates = requireLayoutCoordinates;
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return SizeKt.m2358toRectuvyYCjk(IntSizeKt.m5298toSizeozmzZPI(layoutCoordinates.mo3865getSizeYbymL2g()));
                }
                return null;
            }
        }, cVar);
        return bringIntoView == b.l() ? bringIntoView : g2.f100423a;
    }

    public static /* synthetic */ Object bringIntoView$default(DelegatableNode delegatableNode, a aVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = null;
        }
        return bringIntoView(delegatableNode, aVar, cVar);
    }
}
