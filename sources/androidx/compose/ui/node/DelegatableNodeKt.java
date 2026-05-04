package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.semantics.SemanticsInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDelegatableNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 5 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 6 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,478:1\n209#1:517\n210#1,10:523\n209#1:543\n210#1,6:549\n437#1,6:555\n447#1,2:562\n449#1,8:567\n457#1,9:578\n466#1,8:590\n217#1,3:598\n202#1,8:601\n210#1,6:614\n437#1,6:620\n447#1,2:627\n449#1,8:632\n457#1,9:643\n466#1,8:655\n217#1,3:663\n222#1:666\n223#1,4:672\n437#1,6:676\n447#1,2:683\n449#1,8:688\n457#1,9:699\n466#1,8:711\n228#1,3:719\n90#1:722\n91#1,8:728\n437#1,6:736\n447#1,2:743\n449#1,8:748\n457#1,9:759\n466#1,8:771\n100#1,7:779\n90#1,9:786\n437#1,12:795\n449#1,8:810\n457#1,9:821\n466#1,8:833\n100#1,7:841\n90#1:848\n91#1,8:854\n437#1,6:864\n447#1,2:871\n449#1,8:876\n457#1,9:887\n466#1,8:899\n100#1,7:907\n247#1,5:914\n90#1:919\n91#1,8:925\n437#1,6:933\n447#1,2:940\n449#1,8:945\n457#1,9:956\n466#1,8:968\n100#1,7:976\n247#1,5:983\n90#1:988\n91#1,8:994\n437#1,6:1002\n447#1,2:1009\n449#1,8:1014\n457#1,9:1025\n466#1,8:1037\n100#1,7:1045\n148#1:1052\n149#1:1058\n150#1,3:1062\n153#1:1066\n154#1,9:1068\n437#1,6:1077\n447#1,2:1084\n449#1,17:1089\n466#1,8:1109\n163#1,6:1117\n148#1,2:1123\n150#1,3:1128\n153#1:1132\n154#1,9:1134\n437#1,12:1143\n449#1,17:1158\n466#1,8:1178\n163#1,6:1186\n437#1,6:1192\n447#1,2:1199\n449#1,8:1204\n457#1,9:1215\n466#1,8:1227\n148#1:1235\n149#1:1241\n150#1,3:1245\n153#1:1249\n154#1,9:1251\n437#1,6:1260\n447#1,2:1267\n449#1,8:1272\n457#1,9:1283\n466#1,8:1295\n163#1,6:1303\n437#1,6:1309\n447#1,2:1316\n449#1,8:1321\n457#1,9:1332\n466#1,8:1344\n148#1,2:1352\n150#1,3:1357\n153#1:1361\n154#1,9:1363\n437#1,6:1372\n447#1,2:1379\n449#1,8:1384\n457#1,9:1395\n466#1,8:1407\n163#1,6:1415\n179#1:1421\n180#1:1427\n181#1,3:1431\n184#1,6:1435\n437#1,6:1441\n447#1,2:1448\n449#1,8:1453\n457#1,9:1464\n466#1,8:1476\n190#1,8:1484\n179#1,2:1492\n181#1,9:1497\n437#1,12:1506\n449#1,8:1521\n457#1,9:1532\n466#1,8:1544\n190#1,8:1552\n179#1:1560\n180#1:1566\n181#1,3:1570\n184#1,6:1574\n437#1,6:1580\n447#1,2:1587\n449#1,8:1592\n457#1,9:1603\n466#1,8:1615\n190#1,8:1623\n179#1,2:1631\n181#1,9:1636\n437#1,12:1645\n449#1,8:1660\n457#1,9:1671\n466#1,8:1683\n190#1,8:1691\n56#2,5:479\n56#2,5:484\n56#2,5:498\n56#2,5:508\n56#2,5:518\n56#2,5:533\n56#2,5:538\n56#2,5:544\n56#2,5:609\n56#2,5:667\n56#2,5:723\n56#2,5:849\n56#2,5:920\n56#2,5:989\n56#2,5:1053\n56#2,5:1236\n56#2,5:1422\n56#2,5:1561\n76#2,7:1699\n76#2,7:1706\n56#2,5:1713\n56#2,5:1719\n447#3,9:489\n519#3:506\n44#3:507\n519#3:516\n519#3:1065\n44#3:1067\n519#3:1131\n44#3:1133\n519#3:1248\n44#3:1250\n519#3:1360\n44#3:1362\n519#3:1434\n519#3:1573\n516#3:1739\n1101#4:503\n1083#4,2:504\n1101#4:513\n1083#4,2:514\n1101#4:575\n1083#4,2:576\n1101#4:640\n1083#4,2:641\n1101#4:696\n1083#4,2:697\n1101#4:756\n1083#4,2:757\n1101#4:818\n1083#4,2:819\n1101#4:884\n1083#4,2:885\n1101#4:953\n1083#4,2:954\n1101#4:1022\n1083#4,2:1023\n1101#4:1059\n1083#4,2:1060\n1101#4:1125\n1083#4,2:1126\n1101#4:1212\n1083#4,2:1213\n1101#4:1242\n1083#4,2:1243\n1101#4:1280\n1083#4,2:1281\n1101#4:1329\n1083#4,2:1330\n1101#4:1354\n1083#4,2:1355\n1101#4:1392\n1083#4,2:1393\n1101#4:1428\n1083#4,2:1429\n1101#4:1461\n1083#4,2:1462\n1101#4:1494\n1083#4,2:1495\n1101#4:1529\n1083#4,2:1530\n1101#4:1567\n1083#4,2:1568\n1101#4:1600\n1083#4,2:1601\n1101#4:1633\n1083#4,2:1634\n1101#4:1668\n1083#4,2:1669\n1101#4:1733\n1083#4,2:1734\n246#5:561\n246#5:626\n246#5:682\n246#5:742\n246#5:862\n246#5:863\n246#5:870\n246#5:939\n246#5:1008\n246#5:1083\n246#5:1198\n246#5:1266\n246#5:1315\n246#5:1378\n246#5:1447\n246#5:1586\n246#5:1725\n246#5:1727\n246#5:1728\n246#5:1732\n240#6,3:564\n243#6,3:587\n240#6,3:629\n243#6,3:652\n240#6,3:685\n243#6,3:708\n240#6,3:745\n243#6,3:768\n240#6,3:807\n243#6,3:830\n240#6,3:873\n243#6,3:896\n240#6,3:942\n243#6,3:965\n240#6,3:1011\n243#6,3:1034\n240#6,3:1086\n243#6,3:1106\n240#6,3:1155\n243#6,3:1175\n240#6,3:1201\n243#6,3:1224\n240#6,3:1269\n243#6,3:1292\n240#6,3:1318\n243#6,3:1341\n240#6,3:1381\n243#6,3:1404\n240#6,3:1450\n243#6,3:1473\n240#6,3:1518\n243#6,3:1541\n240#6,3:1589\n243#6,3:1612\n240#6,3:1657\n243#6,3:1680\n240#6,3:1729\n243#6,3:1736\n83#7:1718\n83#7:1724\n83#7:1726\n*S KotlinDebug\n*F\n+ 1 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n*L\n202#1:517\n202#1:523,10\n235#1:543\n235#1:549,6\n235#1:555,6\n235#1:562,2\n235#1:567,8\n235#1:578,9\n235#1:590,8\n235#1:598,3\n240#1:601,8\n240#1:614,6\n240#1:620,6\n240#1:627,2\n240#1:632,8\n240#1:643,9\n240#1:655,8\n240#1:663,3\n245#1:666\n245#1:672,4\n245#1:676,6\n245#1:683,2\n245#1:688,8\n245#1:699,9\n245#1:711,8\n245#1:719,3\n251#1:722\n251#1:728,8\n251#1:736,6\n251#1:743,2\n251#1:748,8\n251#1:759,9\n251#1:771,8\n251#1:779,7\n251#1:786,9\n251#1:795,12\n251#1:810,8\n251#1:821,9\n251#1:833,8\n251#1:841,7\n259#1:848\n259#1:854,8\n262#1:864,6\n262#1:871,2\n262#1:876,8\n262#1:887,9\n262#1:899,8\n259#1:907,7\n269#1:914,5\n269#1:919\n269#1:925,8\n269#1:933,6\n269#1:940,2\n269#1:945,8\n269#1:956,9\n269#1:968,8\n269#1:976,7\n277#1:983,5\n277#1:988\n277#1:994,8\n277#1:1002,6\n277#1:1009,2\n277#1:1014,8\n277#1:1025,9\n277#1:1037,8\n277#1:1045,7\n287#1:1052\n287#1:1058\n287#1:1062,3\n287#1:1066\n287#1:1068,9\n287#1:1077,6\n287#1:1084,2\n287#1:1089,17\n287#1:1109,8\n287#1:1117,6\n287#1:1123,2\n287#1:1128,3\n287#1:1132\n287#1:1134,9\n287#1:1143,12\n287#1:1158,17\n287#1:1178,8\n287#1:1186,6\n294#1:1192,6\n294#1:1199,2\n294#1:1204,8\n294#1:1215,9\n294#1:1227,8\n295#1:1235\n295#1:1241\n295#1:1245,3\n295#1:1249\n295#1:1251,9\n295#1:1260,6\n295#1:1267,2\n295#1:1272,8\n295#1:1283,9\n295#1:1295,8\n295#1:1303,6\n294#1:1309,6\n294#1:1316,2\n294#1:1321,8\n294#1:1332,9\n294#1:1344,8\n295#1:1352,2\n295#1:1357,3\n295#1:1361\n295#1:1363,9\n295#1:1372,6\n295#1:1379,2\n295#1:1384,8\n295#1:1395,9\n295#1:1407,8\n295#1:1415,6\n303#1:1421\n303#1:1427\n303#1:1431,3\n303#1:1435,6\n304#1:1441,6\n304#1:1448,2\n304#1:1453,8\n304#1:1464,9\n304#1:1476,8\n303#1:1484,8\n303#1:1492,2\n303#1:1497,9\n304#1:1506,12\n304#1:1521,8\n304#1:1532,9\n304#1:1544,8\n303#1:1552,8\n313#1:1560\n313#1:1566\n313#1:1570,3\n313#1:1574,6\n314#1:1580,6\n314#1:1587,2\n314#1:1592,8\n314#1:1603,9\n314#1:1615,8\n313#1:1623,8\n313#1:1631,2\n313#1:1636,9\n314#1:1645,12\n314#1:1660,8\n314#1:1671,9\n314#1:1683,8\n313#1:1691,8\n90#1:479,5\n110#1:484,5\n148#1:498,5\n179#1:508,5\n202#1:518,5\n209#1:533,5\n222#1:538,5\n235#1:544,5\n240#1:609,5\n245#1:667,5\n251#1:723,5\n259#1:849,5\n269#1:920,5\n277#1:989,5\n287#1:1053,5\n295#1:1236,5\n303#1:1422,5\n313#1:1561,5\n328#1:1699,7\n336#1:1706,7\n370#1:1713,5\n374#1:1719,5\n140#1:489,9\n152#1:506\n153#1:507\n183#1:516\n287#1:1065\n287#1:1067\n287#1:1131\n287#1:1133\n295#1:1248\n295#1:1250\n295#1:1360\n295#1:1362\n303#1:1434\n313#1:1573\n476#1:1739\n149#1:503\n149#1:504,2\n180#1:513\n180#1:514,2\n235#1:575\n235#1:576,2\n240#1:640\n240#1:641,2\n245#1:696\n245#1:697,2\n251#1:756\n251#1:757,2\n251#1:818\n251#1:819,2\n262#1:884\n262#1:885,2\n269#1:953\n269#1:954,2\n277#1:1022\n277#1:1023,2\n287#1:1059\n287#1:1060,2\n287#1:1125\n287#1:1126,2\n294#1:1212\n294#1:1213,2\n295#1:1242\n295#1:1243,2\n295#1:1280\n295#1:1281,2\n294#1:1329\n294#1:1330,2\n295#1:1354\n295#1:1355,2\n295#1:1392\n295#1:1393,2\n303#1:1428\n303#1:1429,2\n304#1:1461\n304#1:1462,2\n303#1:1494\n303#1:1495,2\n304#1:1529\n304#1:1530,2\n313#1:1567\n313#1:1568,2\n314#1:1600\n314#1:1601,2\n313#1:1633\n313#1:1634,2\n314#1:1668\n314#1:1669,2\n456#1:1733\n456#1:1734,2\n235#1:561\n240#1:626\n245#1:682\n251#1:742\n260#1:862\n261#1:863\n262#1:870\n269#1:939\n277#1:1008\n287#1:1083\n294#1:1198\n295#1:1266\n294#1:1315\n295#1:1378\n304#1:1447\n314#1:1586\n395#1:1725\n402#1:1727\n442#1:1728\n449#1:1732\n235#1:564,3\n235#1:587,3\n240#1:629,3\n240#1:652,3\n245#1:685,3\n245#1:708,3\n251#1:745,3\n251#1:768,3\n251#1:807,3\n251#1:830,3\n262#1:873,3\n262#1:896,3\n269#1:942,3\n269#1:965,3\n277#1:1011,3\n277#1:1034,3\n287#1:1086,3\n287#1:1106,3\n287#1:1155,3\n287#1:1175,3\n294#1:1201,3\n294#1:1224,3\n295#1:1269,3\n295#1:1292,3\n294#1:1318,3\n294#1:1341,3\n295#1:1381,3\n295#1:1404,3\n304#1:1450,3\n304#1:1473,3\n304#1:1518,3\n304#1:1541,3\n314#1:1589,3\n314#1:1612,3\n314#1:1657,3\n314#1:1680,3\n448#1:1729,3\n448#1:1736,3\n373#1:1718\n395#1:1724\n402#1:1726\n*E\n"})
/* loaded from: classes2.dex */
public final class DelegatableNodeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addLayoutNodeChildren(MutableVector<Modifier.Node> mutableVector, Modifier.Node node, boolean z11) {
        MutableVector<LayoutNode> children = getChildren(requireLayoutNode(node), z11);
        int size = children.getSize() - 1;
        LayoutNode[] layoutNodeArr = children.content;
        if (size < layoutNodeArr.length) {
            while (size >= 0) {
                mutableVector.add(layoutNodeArr[size].getNodes$ui_release().getHead$ui_release());
                size--;
            }
        }
    }

    /* renamed from: ancestors-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> List<T> m3975ancestors64DMado(DelegatableNode delegatableNode, int i11) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        ArrayList arrayList = null;
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & i11) != 0) {
                        for (Modifier.Node node = parent$ui_release; node != null; node = pop(null)) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(node);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public static final LayoutModifierNode asLayoutModifierNode(@k Modifier.Node node) {
        if ((NodeKind.m4118constructorimpl(2) & node.getKindSet$ui_release()) != 0) {
            if (node instanceof LayoutModifierNode) {
                return (LayoutModifierNode) node;
            }
            if (node instanceof DelegatingNode) {
                Modifier.Node delegate$ui_release = ((DelegatingNode) node).getDelegate$ui_release();
                while (delegate$ui_release != 0) {
                    if (delegate$ui_release instanceof LayoutModifierNode) {
                        return (LayoutModifierNode) delegate$ui_release;
                    }
                    delegate$ui_release = (!(delegate$ui_release instanceof DelegatingNode) || (NodeKind.m4118constructorimpl(2) & delegate$ui_release.getKindSet$ui_release()) == 0) ? delegate$ui_release.getChild$ui_release() : ((DelegatingNode) delegate$ui_release).getDelegate$ui_release();
                }
            }
        }
        return null;
    }

    /* renamed from: dispatchForKind-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3976dispatchForKind6rFNWt0(Modifier.Node node, int i11, x00.l<? super T, g2> lVar) {
        while (node != null) {
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            lVar.invoke(node);
            node = pop(null);
        }
    }

    private static final MutableVector<LayoutNode> getChildren(LayoutNode layoutNode, boolean z11) {
        return z11 ? layoutNode.getZSortedChildren() : layoutNode.get_children$ui_release();
    }

    /* renamed from: has-64DMado, reason: not valid java name */
    public static final boolean m3977has64DMado(@k DelegatableNode delegatableNode, int i11) {
        return (delegatableNode.getNode().getAggregateChildKindSet$ui_release() & i11) != 0;
    }

    public static final void invalidateSubtree(@k DelegatableNode delegatableNode) {
        if (delegatableNode.getNode().isAttached()) {
            LayoutNode.invalidateSubtree$default(requireLayoutNode(delegatableNode), false, 1, null);
        }
    }

    public static final boolean isDelegationRoot(@k DelegatableNode delegatableNode) {
        return delegatableNode.getNode() == delegatableNode;
    }

    @l
    public static final Modifier.Node nearestAncestor(@k DelegatableNode delegatableNode, int i11) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("nearestAncestor called on an unattached node");
        }
        Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & i11) != 0) {
                        return parent$ui_release;
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* renamed from: nearestAncestor-64DMado, reason: not valid java name */
    public static final /* synthetic */ <T> T m3978nearestAncestor64DMado(DelegatableNode delegatableNode, int i11) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Object parent$ui_release = delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (parent$ui_release != null) {
                    if ((((Modifier.Node) parent$ui_release).getKindSet$ui_release() & i11) != 0) {
                        g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                        return (T) parent$ui_release;
                    }
                    parent$ui_release = (T) ((Modifier.Node) parent$ui_release).getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            parent$ui_release = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? (T) null : (T) nodes$ui_release.getTail$ui_release();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier.Node pop(MutableVector<Modifier.Node> mutableVector) {
        if (mutableVector == null || mutableVector.getSize() == 0) {
            return null;
        }
        return mutableVector.removeAt(mutableVector.getSize() - 1);
    }

    public static final void requestAutofill(@k DelegatableNode delegatableNode) {
        requireLayoutNode(delegatableNode).requestAutofill$ui_release();
    }

    @k
    /* renamed from: requireCoordinator-64DMado, reason: not valid java name */
    public static final NodeCoordinator m3979requireCoordinator64DMado(@k DelegatableNode delegatableNode, int i11) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        g0.m(coordinator$ui_release);
        if (coordinator$ui_release.getTail() != delegatableNode || !NodeKindKt.m4127getIncludeSelfInTraversalH91voCI(i11)) {
            return coordinator$ui_release;
        }
        NodeCoordinator wrapped$ui_release = coordinator$ui_release.getWrapped$ui_release();
        g0.m(wrapped$ui_release);
        return wrapped$ui_release;
    }

    @k
    public static final Density requireDensity(@k DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getDensity();
    }

    @k
    public static final GraphicsContext requireGraphicsContext(@k DelegatableNode delegatableNode) {
        return requireOwner(delegatableNode).getGraphicsContext();
    }

    @k
    public static final LayoutCoordinates requireLayoutCoordinates(@k DelegatableNode delegatableNode) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        LayoutCoordinates coordinates = m3979requireCoordinator64DMado(delegatableNode, NodeKind.m4118constructorimpl(2)).getCoordinates();
        if (!coordinates.isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("LayoutCoordinates is not attached.");
        }
        return coordinates;
    }

    @k
    public static final LayoutDirection requireLayoutDirection(@k DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode).getLayoutDirection();
    }

    @k
    public static final LayoutNode requireLayoutNode(@k DelegatableNode delegatableNode) {
        NodeCoordinator coordinator$ui_release = delegatableNode.getNode().getCoordinator$ui_release();
        if (coordinator$ui_release != null) {
            return coordinator$ui_release.getLayoutNode();
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new KotlinNothingValueException();
    }

    @k
    public static final Owner requireOwner(@k DelegatableNode delegatableNode) {
        Owner owner$ui_release = requireLayoutNode(delegatableNode).getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("This node does not have an owner.");
        throw new KotlinNothingValueException();
    }

    @k
    public static final SemanticsInfo requireSemanticsInfo(@k DelegatableNode delegatableNode) {
        return requireLayoutNode(delegatableNode);
    }

    public static final void visitAncestors(@k DelegatableNode delegatableNode, int i11, boolean z11, @k x00.l<? super Modifier.Node, g2> lVar) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z11 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i11) != 0) {
                        lVar.invoke(node);
                    }
                    node = node.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    public static /* synthetic */ void visitAncestors$default(DelegatableNode delegatableNode, int i11, boolean z11, x00.l lVar, int i12, Object obj) {
        NodeChain nodes$ui_release;
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z11 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i11) != 0) {
                        lVar.invoke(node);
                    }
                    node = node.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* renamed from: visitAncestors-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m3980visitAncestorsYYKmho(DelegatableNode delegatableNode, int i11, boolean z11, x00.l<? super T, g2> lVar) {
        NodeChain nodes$ui_release;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z11 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i11) != 0) {
                        for (Modifier.Node node2 = node; node2 != null; node2 = pop(null)) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            lVar.invoke(node2);
                        }
                    }
                    node = node.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* renamed from: visitAncestors-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m3981visitAncestorsYYKmho$default(DelegatableNode delegatableNode, int i11, boolean z11, x00.l lVar, int i12, Object obj) {
        NodeChain nodes$ui_release;
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node = z11 ? delegatableNode.getNode() : delegatableNode.getNode().getParent$ui_release();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i11) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & i11) != 0) {
                        for (Modifier.Node node2 = node; node2 != null; node2 = pop(null)) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            lVar.invoke(node2);
                        }
                    }
                    node = node.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    public static final void visitChildren(@k DelegatableNode delegatableNode, int i11, boolean z11, @k x00.l<? super Modifier.Node, g2> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z11);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i11) == 0) {
                addLayoutNodeChildren(mutableVector, node, z11);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui_release() & i11) != 0) {
                        lVar.invoke(node);
                        break;
                    }
                    node = node.getChild$ui_release();
                }
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m3982visitChildrenYYKmho(DelegatableNode delegatableNode, int i11, boolean z11, x00.l<? super T, g2> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z11);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i11) == 0) {
                addLayoutNodeChildren(mutableVector, node, z11);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui_release() & i11) != 0) {
                        while (node != null) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            lVar.invoke(node);
                            node = pop(null);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
    }

    /* renamed from: visitChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m3983visitChildrenYYKmho$default(DelegatableNode delegatableNode, int i11, boolean z11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z11);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i11) == 0) {
                addLayoutNodeChildren(mutableVector, node, z11);
            } else {
                while (true) {
                    if (node == null) {
                        break;
                    }
                    if ((node.getKindSet$ui_release() & i11) != 0) {
                        while (node != null) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            lVar.invoke(node);
                            node = pop(null);
                        }
                    } else {
                        node = node.getChild$ui_release();
                    }
                }
            }
        }
    }

    public static final void visitLocalAncestors(@k DelegatableNode delegatableNode, int i11, @k x00.l<? super Modifier.Node, g2> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((parent$ui_release.getKindSet$ui_release() & i11) != 0) {
                lVar.invoke(parent$ui_release);
            }
        }
    }

    /* renamed from: visitLocalAncestors-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3984visitLocalAncestors6rFNWt0(DelegatableNode delegatableNode, int i11, x00.l<? super T, g2> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalAncestors called on an unattached node");
        }
        for (Modifier.Node parent$ui_release = delegatableNode.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((parent$ui_release.getKindSet$ui_release() & i11) != 0) {
                for (Modifier.Node node = parent$ui_release; node != null; node = pop(null)) {
                    g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                    lVar.invoke(node);
                }
            }
        }
    }

    public static final void visitLocalDescendants(@k DelegatableNode delegatableNode, int i11, boolean z11, @k x00.l<? super Modifier.Node, g2> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i11) == 0) {
            return;
        }
        if (!z11) {
            node = node.getChild$ui_release();
        }
        while (node != null) {
            if ((node.getKindSet$ui_release() & i11) != 0) {
                lVar.invoke(node);
            }
            node = node.getChild$ui_release();
        }
    }

    public static /* synthetic */ void visitLocalDescendants$default(DelegatableNode delegatableNode, int i11, boolean z11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i11) == 0) {
            return;
        }
        if (!z11) {
            node = node.getChild$ui_release();
        }
        while (node != null) {
            if ((node.getKindSet$ui_release() & i11) != 0) {
                lVar.invoke(node);
            }
            node = node.getChild$ui_release();
        }
    }

    /* renamed from: visitLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3985visitLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i11, x00.l<? super T, g2> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i11) != 0) {
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & i11) != 0) {
                    for (Modifier.Node node2 = child$ui_release; node2 != null; node2 = pop(null)) {
                        g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                        lVar.invoke(node2);
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndAncestors-5BbP62I, reason: not valid java name */
    public static final /* synthetic */ <T> void m3986visitSelfAndAncestors5BbP62I(DelegatableNode delegatableNode, int i11, int i12, x00.l<? super T, g2> lVar) {
        NodeChain nodes$ui_release;
        Modifier.Node node = delegatableNode.getNode();
        int i13 = i11 | i12;
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node node2 = delegatableNode.getNode();
        LayoutNode requireLayoutNode = requireLayoutNode(delegatableNode);
        while (requireLayoutNode != null) {
            if ((requireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & i13) != 0) {
                while (node2 != null) {
                    if ((node2.getKindSet$ui_release() & i13) != 0) {
                        if (node2 != node && (node2.getKindSet$ui_release() & i12) != 0) {
                            return;
                        }
                        if ((node2.getKindSet$ui_release() & i11) != 0) {
                            for (Modifier.Node node3 = node2; node3 != null; node3 = pop(null)) {
                                g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                                lVar.invoke(node3);
                            }
                        }
                    }
                    node2 = node2.getParent$ui_release();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui_release();
            node2 = (requireLayoutNode == null || (nodes$ui_release = requireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m3987visitSelfAndChildrenYYKmho(DelegatableNode delegatableNode, int i11, boolean z11, x00.l<? super T, g2> lVar) {
        for (Modifier.Node node = delegatableNode.getNode(); node != null; node = pop(null)) {
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            lVar.invoke(node);
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z11);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node2.getAggregateChildKindSet$ui_release() & i11) == 0) {
                addLayoutNodeChildren(mutableVector, node2, z11);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet$ui_release() & i11) != 0) {
                        while (node2 != null) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            lVar.invoke(node2);
                            node2 = pop(null);
                        }
                    } else {
                        node2 = node2.getChild$ui_release();
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndChildren-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m3988visitSelfAndChildrenYYKmho$default(DelegatableNode delegatableNode, int i11, boolean z11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        for (Modifier.Node node = delegatableNode.getNode(); node != null; node = pop(null)) {
            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
            lVar.invoke(node);
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitChildren called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z11);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node2 = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node2.getAggregateChildKindSet$ui_release() & i11) == 0) {
                addLayoutNodeChildren(mutableVector, node2, z11);
            } else {
                while (true) {
                    if (node2 == null) {
                        break;
                    }
                    if ((node2.getKindSet$ui_release() & i11) != 0) {
                        while (node2 != null) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            lVar.invoke(node2);
                            node2 = pop(null);
                        }
                    } else {
                        node2 = node2.getChild$ui_release();
                    }
                }
            }
        }
    }

    /* renamed from: visitSelfAndLocalDescendants-6rFNWt0, reason: not valid java name */
    public static final /* synthetic */ <T> void m3989visitSelfAndLocalDescendants6rFNWt0(DelegatableNode delegatableNode, int i11, x00.l<? super T, g2> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i11) != 0) {
            while (node != null) {
                if ((node.getKindSet$ui_release() & i11) != 0) {
                    for (Modifier.Node node2 = node; node2 != null; node2 = pop(null)) {
                        g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                        lVar.invoke(node2);
                    }
                }
                node = node.getChild$ui_release();
            }
        }
    }

    /* renamed from: visitSubtree-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m3990visitSubtreeYYKmho(DelegatableNode delegatableNode, int i11, boolean z11, x00.l<? super T, g2> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z11);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i11) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                    if ((node2.getKindSet$ui_release() & i11) != 0) {
                        for (Modifier.Node node3 = node2; node3 != null; node3 = pop(null)) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            lVar.invoke(node3);
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z11);
        }
    }

    /* renamed from: visitSubtree-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m3991visitSubtreeYYKmho$default(DelegatableNode delegatableNode, int i11, boolean z11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z11);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i11) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                    if ((node2.getKindSet$ui_release() & i11) != 0) {
                        for (Modifier.Node node3 = node2; node3 != null; node3 = pop(null)) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            lVar.invoke(node3);
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z11);
        }
    }

    public static final void visitSubtreeIf(@k DelegatableNode delegatableNode, int i11, boolean z11, @k x00.l<? super Modifier.Node, Boolean> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z11);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i11) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                    if ((node2.getKindSet$ui_release() & i11) == 0 || lVar.invoke(node2).booleanValue()) {
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z11);
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho, reason: not valid java name */
    public static final /* synthetic */ <T> void m3992visitSubtreeIfYYKmho(DelegatableNode delegatableNode, int i11, boolean z11, x00.l<? super T, Boolean> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z11);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i11) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                    if ((node2.getKindSet$ui_release() & i11) != 0) {
                        for (Modifier.Node node3 = node2; node3 != null; node3 = pop(null)) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (!lVar.invoke(node3).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z11);
        }
    }

    /* renamed from: visitSubtreeIf-Y-YKmho$default, reason: not valid java name */
    public static /* synthetic */ void m3993visitSubtreeIfYYKmho$default(DelegatableNode delegatableNode, int i11, boolean z11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitSubtreeIf called on an unattached node");
        }
        MutableVector mutableVector = new MutableVector(new Modifier.Node[16], 0);
        Modifier.Node child$ui_release = delegatableNode.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            addLayoutNodeChildren(mutableVector, delegatableNode.getNode(), z11);
        } else {
            mutableVector.add(child$ui_release);
        }
        while (mutableVector.getSize() != 0) {
            Modifier.Node node = (Modifier.Node) mutableVector.removeAt(mutableVector.getSize() - 1);
            if ((node.getAggregateChildKindSet$ui_release() & i11) != 0) {
                for (Modifier.Node node2 = node; node2 != null; node2 = node2.getChild$ui_release()) {
                    if ((node2.getKindSet$ui_release() & i11) != 0) {
                        for (Modifier.Node node3 = node2; node3 != null; node3 = pop(null)) {
                            g0.y(3, ExifInterface.GPS_DIRECTION_TRUE);
                            if (!((Boolean) lVar.invoke(node3)).booleanValue()) {
                                break;
                            }
                        }
                    }
                }
            }
            addLayoutNodeChildren(mutableVector, node, z11);
        }
    }

    public static final void visitLocalDescendants(@k DelegatableNode delegatableNode, int i11, @k x00.l<? super Modifier.Node, g2> lVar) {
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitLocalDescendants called on an unattached node");
        }
        Modifier.Node node = delegatableNode.getNode();
        if ((node.getAggregateChildKindSet$ui_release() & i11) != 0) {
            for (Modifier.Node child$ui_release = node.getChild$ui_release(); child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & i11) != 0) {
                    lVar.invoke(child$ui_release);
                }
            }
        }
    }
}
