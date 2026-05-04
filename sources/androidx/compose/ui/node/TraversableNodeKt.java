package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Actual_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.TraversableNode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTraversableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,217:1\n147#2:218\n147#2:288\n147#2:358\n147#2:428\n147#2:498\n147#2:575\n147#2:652\n147#2:730\n247#3,5:219\n90#3:224\n91#3,8:230\n437#3,6:238\n447#3,2:245\n449#3,8:250\n457#3,9:261\n466#3,8:273\n100#3,7:281\n247#3,5:289\n90#3:294\n91#3,8:300\n437#3,6:308\n447#3,2:315\n449#3,8:320\n457#3,9:331\n466#3,8:343\n100#3,7:351\n247#3,5:359\n90#3:364\n91#3,8:370\n437#3,6:378\n447#3,2:385\n449#3,8:390\n457#3,9:401\n466#3,8:413\n100#3,7:421\n247#3,5:429\n90#3:434\n91#3,8:440\n437#3,6:448\n447#3,2:455\n449#3,8:460\n457#3,9:471\n466#3,8:483\n100#3,7:491\n283#3,5:499\n148#3:504\n149#3:510\n150#3,3:514\n153#3:518\n154#3,9:520\n437#3,6:529\n447#3,2:536\n449#3,17:541\n466#3,8:561\n163#3,6:569\n283#3,5:576\n148#3:581\n149#3:587\n150#3,3:591\n153#3:595\n154#3,9:597\n437#3,6:606\n447#3,2:613\n449#3,17:618\n466#3,8:638\n163#3,6:646\n298#3,6:653\n179#3:659\n180#3:665\n181#3,3:669\n184#3,6:673\n304#3:679\n437#3,6:680\n447#3,2:687\n449#3,17:692\n466#3,8:712\n305#3:720\n190#3,8:721\n306#3:729\n298#3,6:731\n179#3:737\n180#3:743\n181#3,3:747\n184#3,6:751\n304#3:757\n437#3,6:758\n447#3,2:765\n449#3,17:770\n466#3,8:790\n305#3:798\n190#3,8:799\n306#3:807\n56#4,5:225\n56#4,5:295\n56#4,5:365\n56#4,5:435\n56#4,5:505\n56#4,5:582\n56#4,5:660\n56#4,5:738\n246#5:244\n246#5:314\n246#5:384\n246#5:454\n246#5:535\n246#5:612\n246#5:686\n246#5:764\n240#6,3:247\n243#6,3:270\n240#6,3:317\n243#6,3:340\n240#6,3:387\n243#6,3:410\n240#6,3:457\n243#6,3:480\n240#6,3:538\n243#6,3:558\n240#6,3:615\n243#6,3:635\n240#6,3:689\n243#6,3:709\n240#6,3:767\n243#6,3:787\n1101#7:258\n1083#7,2:259\n1101#7:328\n1083#7,2:329\n1101#7:398\n1083#7,2:399\n1101#7:468\n1083#7,2:469\n1101#7:511\n1083#7,2:512\n1101#7:588\n1083#7,2:589\n1101#7:666\n1083#7,2:667\n1101#7:744\n1083#7,2:745\n519#8:517\n44#8:519\n519#8:594\n44#8:596\n519#8:672\n519#8:750\n*S KotlinDebug\n*F\n+ 1 TraversableNode.kt\nandroidx/compose/ui/node/TraversableNodeKt\n*L\n54#1:218\n64#1:288\n82#1:358\n102#1:428\n125#1:498\n147#1:575\n174#1:652\n202#1:730\n54#1:219,5\n54#1:224\n54#1:230,8\n54#1:238,6\n54#1:245,2\n54#1:250,8\n54#1:261,9\n54#1:273,8\n54#1:281,7\n64#1:289,5\n64#1:294\n64#1:300,8\n64#1:308,6\n64#1:315,2\n64#1:320,8\n64#1:331,9\n64#1:343,8\n64#1:351,7\n82#1:359,5\n82#1:364\n82#1:370,8\n82#1:378,6\n82#1:385,2\n82#1:390,8\n82#1:401,9\n82#1:413,8\n82#1:421,7\n102#1:429,5\n102#1:434\n102#1:440,8\n102#1:448,6\n102#1:455,2\n102#1:460,8\n102#1:471,9\n102#1:483,8\n102#1:491,7\n125#1:499,5\n125#1:504\n125#1:510\n125#1:514,3\n125#1:518\n125#1:520,9\n125#1:529,6\n125#1:536,2\n125#1:541,17\n125#1:561,8\n125#1:569,6\n147#1:576,5\n147#1:581\n147#1:587\n147#1:591,3\n147#1:595\n147#1:597,9\n147#1:606,6\n147#1:613,2\n147#1:618,17\n147#1:638,8\n147#1:646,6\n174#1:653,6\n174#1:659\n174#1:665\n174#1:669,3\n174#1:673,6\n174#1:679\n174#1:680,6\n174#1:687,2\n174#1:692,17\n174#1:712,8\n174#1:720\n174#1:721,8\n174#1:729\n202#1:731,6\n202#1:737\n202#1:743\n202#1:747,3\n202#1:751,6\n202#1:757\n202#1:758,6\n202#1:765,2\n202#1:770,17\n202#1:790,8\n202#1:798\n202#1:799,8\n202#1:807\n54#1:225,5\n64#1:295,5\n82#1:365,5\n102#1:435,5\n125#1:505,5\n147#1:582,5\n174#1:660,5\n202#1:738,5\n54#1:244\n64#1:314\n82#1:384\n102#1:454\n125#1:535\n147#1:612\n174#1:686\n202#1:764\n54#1:247,3\n54#1:270,3\n64#1:317,3\n64#1:340,3\n82#1:387,3\n82#1:410,3\n102#1:457,3\n102#1:480,3\n125#1:538,3\n125#1:558,3\n147#1:615,3\n147#1:635,3\n174#1:689,3\n174#1:709,3\n202#1:767,3\n202#1:787,3\n54#1:258\n54#1:259,2\n64#1:328\n64#1:329,2\n82#1:398\n82#1:399,2\n102#1:468\n102#1:469,2\n125#1:511\n125#1:512,2\n147#1:588\n147#1:589,2\n174#1:666\n174#1:667,2\n202#1:744\n202#1:745,2\n125#1:517\n125#1:519\n147#1:594\n147#1:596\n174#1:672\n202#1:750\n*E\n"})
/* loaded from: classes2.dex */
public final class TraversableNodeKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @l
    public static final TraversableNode findNearestAncestor(@k DelegatableNode delegatableNode, @l Object obj) {
        NodeChain nodes$ui_release;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(262144);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        DelegatingNode delegatingNode = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                if (g0.g(obj, traversableNode.getTraverseKey())) {
                                    return traversableNode;
                                }
                            } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i11 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i11 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final void traverseAncestors(@k DelegatableNode delegatableNode, @l Object obj, @k x00.l<? super TraversableNode, Boolean> lVar) {
        NodeChain nodes$ui_release;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(262144);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        DelegatingNode delegatingNode = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                if (!(g0.g(obj, traversableNode.getTraverseKey()) ? lVar.invoke(traversableNode).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0) && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i11 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0034, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r10v7, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void traverseChildren(@m80.k androidx.compose.ui.node.DelegatableNode r10, @m80.l java.lang.Object r11, @m80.k x00.l<? super androidx.compose.ui.node.TraversableNode, java.lang.Boolean> r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.ui.node.NodeKind.m4118constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r10.getNode()
            boolean r1 = r1.isAttached()
            if (r1 != 0) goto L15
            java.lang.String r1 = "visitChildren called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r1)
        L15:
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r10.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            if (r3 != 0) goto L31
            androidx.compose.ui.Modifier$Node r10 = r10.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r10, r4)
            goto L34
        L31:
            r1.add(r3)
        L34:
            int r10 = r1.getSize()
            if (r10 == 0) goto Lcd
            int r10 = r1.getSize()
            r3 = 1
            int r10 = r10 - r3
            java.lang.Object r10 = r1.removeAt(r10)
            androidx.compose.ui.Modifier$Node r10 = (androidx.compose.ui.Modifier.Node) r10
            int r5 = r10.getAggregateChildKindSet$ui_release()
            r5 = r5 & r0
            if (r5 != 0) goto L51
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r10, r4)
            goto L34
        L51:
            if (r10 == 0) goto L34
            int r5 = r10.getKindSet$ui_release()
            r5 = r5 & r0
            if (r5 == 0) goto Lc8
            r5 = 0
            r6 = r5
        L5c:
            if (r10 == 0) goto L34
            boolean r7 = r10 instanceof androidx.compose.ui.node.TraversableNode
            if (r7 == 0) goto L7d
            androidx.compose.ui.node.TraversableNode r10 = (androidx.compose.ui.node.TraversableNode) r10
            java.lang.Object r7 = r10.getTraverseKey()
            boolean r7 = kotlin.jvm.internal.g0.g(r11, r7)
            if (r7 == 0) goto L79
            java.lang.Object r10 = r12.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            goto L7a
        L79:
            r10 = r3
        L7a:
            if (r10 != 0) goto Lc3
            return
        L7d:
            int r7 = r10.getKindSet$ui_release()
            r7 = r7 & r0
            if (r7 == 0) goto L86
            r7 = r3
            goto L87
        L86:
            r7 = r4
        L87:
            if (r7 == 0) goto Lc3
            boolean r7 = r10 instanceof androidx.compose.ui.node.DelegatingNode
            if (r7 == 0) goto Lc3
            r7 = r10
            androidx.compose.ui.node.DelegatingNode r7 = (androidx.compose.ui.node.DelegatingNode) r7
            androidx.compose.ui.Modifier$Node r7 = r7.getDelegate$ui_release()
            r8 = r4
        L95:
            if (r7 == 0) goto Lc0
            int r9 = r7.getKindSet$ui_release()
            r9 = r9 & r0
            if (r9 == 0) goto La0
            r9 = r3
            goto La1
        La0:
            r9 = r4
        La1:
            if (r9 == 0) goto Lbb
            int r8 = r8 + 1
            if (r8 != r3) goto La9
            r10 = r7
            goto Lbb
        La9:
            if (r6 != 0) goto Lb2
            androidx.compose.runtime.collection.MutableVector r6 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r9 = new androidx.compose.ui.Modifier.Node[r2]
            r6.<init>(r9, r4)
        Lb2:
            if (r10 == 0) goto Lb8
            r6.add(r10)
            r10 = r5
        Lb8:
            r6.add(r7)
        Lbb:
            androidx.compose.ui.Modifier$Node r7 = r7.getChild$ui_release()
            goto L95
        Lc0:
            if (r8 != r3) goto Lc3
            goto L5c
        Lc3:
            androidx.compose.ui.Modifier$Node r10 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r6)
            goto L5c
        Lc8:
            androidx.compose.ui.Modifier$Node r10 = r10.getChild$ui_release()
            goto L51
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.DelegatableNode, java.lang.Object, x00.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    public static final void traverseDescendants(@k DelegatableNode delegatableNode, @l Object obj, @k x00.l<? super TraversableNode, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        int m4118constructorimpl = NodeKind.m4118constructorimpl(262144);
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), false);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                    if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        DelegatingNode delegatingNode = node2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                TraversableNode.Companion.TraverseDescendantsAction invoke = g0.g(obj, traversableNode.getTraverseKey()) ? lVar.invoke(traversableNode) : TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                if (invoke == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (invoke == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i11 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector2.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i11 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @l
    public static final <T extends TraversableNode> T findNearestAncestor(@k T t11) {
        NodeChain nodes$ui_release;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(262144);
        if (!t11.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = t11.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(t11);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        DelegatingNode delegatingNode = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                T t12 = (T) delegatingNode;
                                if (g0.g(t11.getTraverseKey(), t12.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t11, t12)) {
                                    return t12;
                                }
                            } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i11 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i11 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    public static final <T extends TraversableNode> void traverseAncestors(@k T t11, @k x00.l<? super T, Boolean> lVar) {
        NodeChain nodes$ui_release;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(262144);
        if (!t11.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = t11.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = DelegatableNodeKt.requireLayoutNode(t11);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        DelegatingNode delegatingNode = parent$ui_release;
                        MutableVector mutableVector = null;
                        while (delegatingNode != 0) {
                            boolean z11 = true;
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                if (g0.g(t11.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t11, traversableNode)) {
                                    z11 = lVar.invoke(traversableNode).booleanValue();
                                }
                                if (!z11) {
                                    return;
                                }
                            } else {
                                if (((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0) && (delegatingNode instanceof DelegatingNode)) {
                                    Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                    int i11 = 0;
                                    delegatingNode = delegatingNode;
                                    while (delegate$ui_release != null) {
                                        if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                            i11++;
                                            if (i11 == 1) {
                                                delegatingNode = delegate$ui_release;
                                            } else {
                                                if (mutableVector == null) {
                                                    mutableVector = new MutableVector(new Modifier.Node[16], 0);
                                                }
                                                if (delegatingNode != 0) {
                                                    mutableVector.add(delegatingNode);
                                                    delegatingNode = 0;
                                                }
                                                mutableVector.add(delegate$ui_release);
                                            }
                                        }
                                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                        delegatingNode = delegatingNode;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0034, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r3v9, types: [androidx.compose.ui.Modifier$Node] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.compose.ui.node.TraversableNode> void traverseChildren(@m80.k T r11, @m80.k x00.l<? super T, java.lang.Boolean> r12) {
        /*
            r0 = 262144(0x40000, float:3.67342E-40)
            int r0 = androidx.compose.ui.node.NodeKind.m4118constructorimpl(r0)
            androidx.compose.ui.Modifier$Node r1 = r11.getNode()
            boolean r1 = r1.isAttached()
            if (r1 != 0) goto L15
            java.lang.String r1 = "visitChildren called on an unattached node"
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(r1)
        L15:
            androidx.compose.runtime.collection.MutableVector r1 = new androidx.compose.runtime.collection.MutableVector
            r2 = 16
            androidx.compose.ui.Modifier$Node[] r3 = new androidx.compose.ui.Modifier.Node[r2]
            r4 = 0
            r1.<init>(r3, r4)
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            if (r3 != 0) goto L31
            androidx.compose.ui.Modifier$Node r3 = r11.getNode()
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3, r4)
            goto L34
        L31:
            r1.add(r3)
        L34:
            int r3 = r1.getSize()
            if (r3 == 0) goto Ld8
            int r3 = r1.getSize()
            r5 = 1
            int r3 = r3 - r5
            java.lang.Object r3 = r1.removeAt(r3)
            androidx.compose.ui.Modifier$Node r3 = (androidx.compose.ui.Modifier.Node) r3
            int r6 = r3.getAggregateChildKindSet$ui_release()
            r6 = r6 & r0
            if (r6 != 0) goto L51
            androidx.compose.ui.node.DelegatableNodeKt.access$addLayoutNodeChildren(r1, r3, r4)
            goto L34
        L51:
            if (r3 == 0) goto L34
            int r6 = r3.getKindSet$ui_release()
            r6 = r6 & r0
            if (r6 == 0) goto Ld2
            r6 = 0
            r7 = r6
        L5c:
            if (r3 == 0) goto L34
            boolean r8 = r3 instanceof androidx.compose.ui.node.TraversableNode
            if (r8 == 0) goto L87
            androidx.compose.ui.node.TraversableNode r3 = (androidx.compose.ui.node.TraversableNode) r3
            java.lang.Object r8 = r11.getTraverseKey()
            java.lang.Object r9 = r3.getTraverseKey()
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r9)
            if (r8 == 0) goto L83
            boolean r8 = androidx.compose.ui.Actual_jvmKt.areObjectsOfSameType(r11, r3)
            if (r8 == 0) goto L83
            java.lang.Object r3 = r12.invoke(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            goto L84
        L83:
            r3 = r5
        L84:
            if (r3 != 0) goto Lcd
            return
        L87:
            int r8 = r3.getKindSet$ui_release()
            r8 = r8 & r0
            if (r8 == 0) goto L90
            r8 = r5
            goto L91
        L90:
            r8 = r4
        L91:
            if (r8 == 0) goto Lcd
            boolean r8 = r3 instanceof androidx.compose.ui.node.DelegatingNode
            if (r8 == 0) goto Lcd
            r8 = r3
            androidx.compose.ui.node.DelegatingNode r8 = (androidx.compose.ui.node.DelegatingNode) r8
            androidx.compose.ui.Modifier$Node r8 = r8.getDelegate$ui_release()
            r9 = r4
        L9f:
            if (r8 == 0) goto Lca
            int r10 = r8.getKindSet$ui_release()
            r10 = r10 & r0
            if (r10 == 0) goto Laa
            r10 = r5
            goto Lab
        Laa:
            r10 = r4
        Lab:
            if (r10 == 0) goto Lc5
            int r9 = r9 + 1
            if (r9 != r5) goto Lb3
            r3 = r8
            goto Lc5
        Lb3:
            if (r7 != 0) goto Lbc
            androidx.compose.runtime.collection.MutableVector r7 = new androidx.compose.runtime.collection.MutableVector
            androidx.compose.ui.Modifier$Node[] r10 = new androidx.compose.ui.Modifier.Node[r2]
            r7.<init>(r10, r4)
        Lbc:
            if (r3 == 0) goto Lc2
            r7.add(r3)
            r3 = r6
        Lc2:
            r7.add(r8)
        Lc5:
            androidx.compose.ui.Modifier$Node r8 = r8.getChild$ui_release()
            goto L9f
        Lca:
            if (r9 != r5) goto Lcd
            goto L5c
        Lcd:
            androidx.compose.ui.Modifier$Node r3 = androidx.compose.ui.node.DelegatableNodeKt.access$pop(r7)
            goto L5c
        Ld2:
            androidx.compose.ui.Modifier$Node r3 = r3.getChild$ui_release()
            goto L51
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.TraversableNodeKt.traverseChildren(androidx.compose.ui.node.TraversableNode, x00.l):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    public static final <T extends TraversableNode> void traverseDescendants(@k T t11, @k x00.l<? super T, ? extends TraversableNode.Companion.TraverseDescendantsAction> lVar) {
        TraversableNode.Companion.TraverseDescendantsAction traverseDescendantsAction;
        int m4118constructorimpl = NodeKind.m4118constructorimpl(262144);
        if (!t11.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = t11.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, t11.getNode(), false);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & m4118constructorimpl) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                    if ((node2.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                        DelegatingNode delegatingNode = node2;
                        MutableVector mutableVector2 = null;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof TraversableNode) {
                                TraversableNode traversableNode = (TraversableNode) delegatingNode;
                                if (g0.g(t11.getTraverseKey(), traversableNode.getTraverseKey()) && Actual_jvmKt.areObjectsOfSameType(t11, traversableNode)) {
                                    traverseDescendantsAction = lVar.invoke(traversableNode);
                                } else {
                                    traverseDescendantsAction = TraversableNode.Companion.TraverseDescendantsAction.ContinueTraversal;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.CancelTraversal) {
                                    return;
                                }
                                if (traverseDescendantsAction == TraversableNode.Companion.TraverseDescendantsAction.SkipSubtreeAndContinueTraversal) {
                                    break;
                                }
                            } else if ((delegatingNode.getKindSet$ui_release() & m4118constructorimpl) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node delegate$ui_release = delegatingNode.getDelegate$ui_release();
                                int i11 = 0;
                                delegatingNode = delegatingNode;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & m4118constructorimpl) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            delegatingNode = delegate$ui_release;
                                        } else {
                                            if (mutableVector2 == null) {
                                                mutableVector2 = new MutableVector(new Modifier.Node[16], 0);
                                            }
                                            if (delegatingNode != 0) {
                                                mutableVector2.add(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            mutableVector2.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    delegatingNode = delegatingNode;
                                }
                                if (i11 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.pop(mutableVector2);
                        }
                    }
                }
            }
            DelegatableNodeKt.addLayoutNodeChildren(mutableVector, node, false);
        }
    }
}
