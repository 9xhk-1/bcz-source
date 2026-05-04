package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import j00.c;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDragGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1045:1\n787#1,17:1046\n804#1,4:1072\n808#1,9:1083\n817#1,11:1093\n746#1,4:1104\n750#1,2:1117\n752#1,8:1126\n787#1,17:1134\n804#1,4:1160\n808#1,9:1171\n817#1:1181\n818#1,10:1185\n787#1,17:1195\n804#1,4:1221\n808#1,9:1232\n817#1:1242\n818#1,10:1246\n702#1,7:1256\n746#1,4:1263\n750#1,2:1276\n752#1,7:1285\n709#1,6:1292\n715#1:1301\n710#1,8:1304\n759#1:1312\n718#1:1313\n707#1:1314\n720#1,10:1315\n746#1,4:1325\n750#1,2:1338\n752#1,7:1347\n759#1:1357\n787#1,17:1358\n804#1,4:1384\n808#1,9:1395\n817#1:1405\n818#1,10:1409\n787#1,17:1419\n804#1,4:1445\n808#1,9:1456\n817#1:1466\n818#1,10:1470\n702#1,7:1480\n746#1,4:1487\n750#1,2:1500\n752#1,7:1509\n709#1,6:1516\n715#1:1525\n710#1,8:1528\n759#1:1536\n718#1:1537\n707#1:1538\n720#1,10:1539\n746#1,4:1549\n750#1,2:1562\n752#1,7:1571\n759#1:1581\n746#1,4:1582\n750#1,2:1595\n752#1,7:1604\n759#1:1617\n746#1,4:1618\n750#1,2:1631\n752#1,7:1640\n759#1:1653\n117#2,2:1063\n34#2,6:1065\n119#2:1071\n34#2,6:1076\n119#2:1082\n117#2,2:1108\n34#2,6:1110\n119#2:1116\n34#2,6:1119\n119#2:1125\n117#2,2:1151\n34#2,6:1153\n119#2:1159\n34#2,6:1164\n119#2:1170\n117#2,2:1212\n34#2,6:1214\n119#2:1220\n34#2,6:1225\n119#2:1231\n117#2,2:1267\n34#2,6:1269\n119#2:1275\n34#2,6:1278\n119#2:1284\n117#2,2:1329\n34#2,6:1331\n119#2:1337\n34#2,6:1340\n119#2:1346\n117#2,2:1375\n34#2,6:1377\n119#2:1383\n34#2,6:1388\n119#2:1394\n117#2,2:1436\n34#2,6:1438\n119#2:1444\n34#2,6:1449\n119#2:1455\n117#2,2:1491\n34#2,6:1493\n119#2:1499\n34#2,6:1502\n119#2:1508\n117#2,2:1553\n34#2,6:1555\n119#2:1561\n34#2,6:1564\n119#2:1570\n117#2,2:1586\n34#2,6:1588\n119#2:1594\n34#2,6:1597\n119#2:1603\n117#2,2:1622\n34#2,6:1624\n119#2:1630\n34#2,6:1633\n119#2:1639\n117#2,2:1654\n34#2,6:1656\n119#2:1662\n117#2,2:1663\n34#2,6:1665\n119#2:1671\n117#2,2:1672\n34#2,6:1674\n119#2:1680\n117#2,2:1681\n34#2,6:1683\n119#2:1689\n117#2,2:1691\n34#2,6:1693\n119#2:1699\n117#2,2:1700\n34#2,6:1702\n119#2:1708\n117#2,2:1709\n34#2,6:1711\n119#2:1717\n117#2,2:1718\n34#2,6:1720\n119#2:1726\n117#2,2:1727\n34#2,6:1729\n119#2:1735\n117#2,2:1736\n34#2,6:1738\n119#2:1744\n102#2,2:1746\n34#2,6:1748\n104#2:1754\n117#2,2:1755\n34#2,6:1757\n119#2:1763\n117#2,2:1764\n34#2,6:1766\n119#2:1772\n273#3:1092\n273#3:1180\n273#3:1241\n273#3:1404\n273#3:1465\n273#3:1690\n273#3:1745\n69#4:1182\n69#4:1243\n69#4:1298\n65#4:1302\n69#4:1354\n65#4:1406\n65#4:1467\n69#4:1522\n65#4:1526\n65#4:1578\n69#4:1611\n65#4:1614\n69#4:1647\n65#4:1650\n70#5:1183\n70#5:1244\n70#5:1299\n60#5:1303\n70#5:1355\n60#5:1407\n60#5:1468\n70#5:1523\n60#5:1527\n60#5:1579\n70#5:1612\n60#5:1615\n70#5:1648\n60#5:1651\n22#6:1184\n22#6:1245\n22#6:1300\n22#6:1356\n22#6:1408\n22#6:1469\n22#6:1524\n22#6:1580\n22#6:1613\n22#6:1616\n22#6:1649\n22#6:1652\n118#7:1773\n113#7:1774\n63#8:1775\n*S KotlinDebug\n*F\n+ 1 DragGestureDetector.kt\nandroidx/compose/foundation/gestures/DragGestureDetectorKt\n*L\n81#1:1046,17\n81#1:1072,4\n81#1:1083,9\n81#1:1093,11\n144#1:1104,4\n144#1:1117,2\n144#1:1126,8\n406#1:1134,17\n406#1:1160,4\n406#1:1171,9\n406#1:1181\n406#1:1185,10\n418#1:1195,17\n418#1:1221,4\n418#1:1232,9\n418#1:1242\n418#1:1246,10\n445#1:1256,7\n445#1:1263,4\n445#1:1276,2\n445#1:1285,7\n445#1:1292,6\n445#1:1301\n445#1:1304,8\n445#1:1312\n445#1:1313\n445#1:1314\n445#1:1315,10\n474#1:1325,4\n474#1:1338,2\n474#1:1347,7\n474#1:1357\n560#1:1358,17\n560#1:1384,4\n560#1:1395,9\n560#1:1405\n560#1:1409,10\n572#1:1419,17\n572#1:1445,4\n572#1:1456,9\n572#1:1466\n572#1:1470,10\n596#1:1480,7\n596#1:1487,4\n596#1:1500,2\n596#1:1509,7\n596#1:1516,6\n596#1:1525\n596#1:1528,8\n596#1:1536\n596#1:1537\n596#1:1538\n596#1:1539,10\n625#1:1549,4\n625#1:1562,2\n625#1:1571,7\n625#1:1581\n708#1:1582,4\n708#1:1595,2\n708#1:1604,7\n708#1:1617\n708#1:1618,4\n708#1:1631,2\n708#1:1640,7\n708#1:1653\n81#1:1063,2\n81#1:1065,6\n81#1:1071\n81#1:1076,6\n81#1:1082\n144#1:1108,2\n144#1:1110,6\n144#1:1116\n144#1:1119,6\n144#1:1125\n406#1:1151,2\n406#1:1153,6\n406#1:1159\n406#1:1164,6\n406#1:1170\n418#1:1212,2\n418#1:1214,6\n418#1:1220\n418#1:1225,6\n418#1:1231\n445#1:1267,2\n445#1:1269,6\n445#1:1275\n445#1:1278,6\n445#1:1284\n474#1:1329,2\n474#1:1331,6\n474#1:1337\n474#1:1340,6\n474#1:1346\n560#1:1375,2\n560#1:1377,6\n560#1:1383\n560#1:1388,6\n560#1:1394\n572#1:1436,2\n572#1:1438,6\n572#1:1444\n572#1:1449,6\n572#1:1455\n596#1:1491,2\n596#1:1493,6\n596#1:1499\n596#1:1502,6\n596#1:1508\n625#1:1553,2\n625#1:1555,6\n625#1:1561\n625#1:1564,6\n625#1:1570\n708#1:1586,2\n708#1:1588,6\n708#1:1594\n708#1:1597,6\n708#1:1603\n708#1:1622,2\n708#1:1624,6\n708#1:1630\n708#1:1633,6\n708#1:1639\n749#1:1654,2\n749#1:1656,6\n749#1:1662\n751#1:1663,2\n751#1:1665,6\n751#1:1671\n803#1:1672,2\n803#1:1674,6\n803#1:1680\n807#1:1681,2\n807#1:1683,6\n807#1:1689\n803#1:1691,2\n803#1:1693,6\n803#1:1699\n807#1:1700,2\n807#1:1702,6\n807#1:1708\n803#1:1709,2\n803#1:1711,6\n803#1:1717\n807#1:1718,2\n807#1:1720,6\n807#1:1726\n852#1:1727,2\n852#1:1729,6\n852#1:1735\n854#1:1736,2\n854#1:1738,6\n854#1:1744\n867#1:1746,2\n867#1:1748,6\n867#1:1754\n960#1:1755,2\n960#1:1757,6\n960#1:1763\n1025#1:1764,2\n1025#1:1766,6\n1025#1:1772\n81#1:1092\n406#1:1180\n418#1:1241\n560#1:1404\n572#1:1465\n816#1:1690\n863#1:1745\n409#1:1182\n421#1:1243\n445#1:1298\n445#1:1302\n474#1:1354\n563#1:1406\n575#1:1467\n596#1:1522\n596#1:1526\n625#1:1578\n714#1:1611\n715#1:1614\n714#1:1647\n715#1:1650\n409#1:1183\n421#1:1244\n445#1:1299\n445#1:1303\n474#1:1355\n563#1:1407\n575#1:1468\n596#1:1523\n596#1:1527\n625#1:1579\n714#1:1612\n715#1:1615\n714#1:1648\n715#1:1651\n409#1:1184\n421#1:1245\n445#1:1300\n474#1:1356\n563#1:1408\n575#1:1469\n596#1:1524\n625#1:1580\n714#1:1613\n715#1:1616\n714#1:1649\n715#1:1652\n1031#1:1773\n1032#1:1774\n1033#1:1775\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float m5115constructorimpl = Dp.m5115constructorimpl((float) 0.125d);
        mouseSlop = m5115constructorimpl;
        float m5115constructorimpl2 = Dp.m5115constructorimpl(18);
        defaultTouchSlop = m5115constructorimpl2;
        mouseToTouchSlopRatio = m5115constructorimpl / m5115constructorimpl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x009e -> B:10:0x00a3). Please report as a decompilation issue!!! */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitAllPointersUpWithSlopDetection(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, @m80.k androidx.compose.ui.input.pointer.PointerInputChange r19, @m80.k androidx.compose.ui.input.pointer.PointerEventPass r20, @m80.k j00.c<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.awaitAllPointersUpWithSlopDetection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerInputChange, androidx.compose.ui.input.pointer.PointerEventPass, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object awaitAllPointersUpWithSlopDetection$default(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, PointerEventPass pointerEventPass, c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitAllPointersUpWithSlopDetection(awaitPointerEventScope, pointerInputChange, pointerEventPass, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventKt.positionChangedIgnoreConsumed(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: awaitDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m418awaitDragOrCancellationrnUCldI(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m418awaitDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, j00.c):java.lang.Object");
    }

    /* renamed from: awaitDragOrUp-jO51t88, reason: not valid java name */
    private static final Object m419awaitDragOrUpjO51t88(AwaitPointerEventScope awaitPointerEventScope, long j11, l<? super PointerInputChange, Boolean> lVar, c<? super PointerInputChange> cVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j11;
        while (true) {
            int i11 = 0;
            d0.e(0);
            PointerInputChange pointerInputChange3 = null;
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, cVar, 1, null);
            d0.e(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i12);
                if (Boolean.valueOf(PointerId.m3714equalsimpl0(pointerInputChange.m3730getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                    break;
                }
                i12++;
            }
            pointerInputChange2 = pointerInputChange;
            if (pointerInputChange2 == null) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    PointerInputChange pointerInputChange4 = changes2.get(i11);
                    if (Boolean.valueOf(pointerInputChange4.getPressed()).booleanValue()) {
                        pointerInputChange3 = pointerInputChange4;
                        break;
                    }
                    i11++;
                }
                PointerInputChange pointerInputChange5 = pointerInputChange3;
                if (pointerInputChange5 == null) {
                    break;
                }
                longRef.element = pointerInputChange5.m3730getIdJ3iCeTQ();
            } else if (lVar.invoke(pointerInputChange2).booleanValue()) {
                break;
            }
        }
        return pointerInputChange2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00de, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) >> 32)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: awaitHorizontalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m420awaitHorizontalDragOrCancellationrnUCldI(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m420awaitHorizontalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x017e -> B:11:0x0184). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m421awaitHorizontalPointerSlopOrCancellationgDDlDlE(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, @m80.k x00.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, yz.g2> r25, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r26) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m421awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0190 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0184 -> B:11:0x018a). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: awaitHorizontalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m422awaitHorizontalTouchSlopOrCancellationjO51t88(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, @m80.k x00.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, yz.g2> r24, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m422awaitHorizontalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ad A[Catch: PointerEventTimeoutCancellationException -> 0x00b6, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x00b6, blocks: (B:11:0x0032, B:12:0x00a9, B:14:0x00ad, B:36:0x008f), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v3, types: [T, androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Object] */
    @m80.l
    /* renamed from: awaitLongPressOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m423awaitLongPressOrCancellationrnUCldI(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, long r10, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r9 = r0.L$2
            kotlin.jvm.internal.Ref$BooleanRef r9 = (kotlin.jvm.internal.Ref.BooleanRef) r9
            java.lang.Object r10 = r0.L$1
            kotlin.jvm.internal.Ref$ObjectRef r10 = (kotlin.jvm.internal.Ref.ObjectRef) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            kotlin.e.n(r12)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            goto La9
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            kotlin.e.n(r12)
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            boolean r12 = m435isPointerUpDmW0f2w(r12, r10)
            if (r12 == 0) goto L4d
            return r4
        L4d:
            androidx.compose.ui.input.pointer.PointerEvent r12 = r9.getCurrentEvent()
            java.util.List r12 = r12.getChanges()
            r2 = r12
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r5 = 0
        L5d:
            if (r5 >= r2) goto L74
            java.lang.Object r6 = r12.get(r5)
            r7 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            long r7 = r7.m3730getIdJ3iCeTQ()
            boolean r7 = androidx.compose.ui.input.pointer.PointerId.m3714equalsimpl0(r7, r10)
            if (r7 == 0) goto L71
            goto L75
        L71:
            int r5 = r5 + 1
            goto L5d
        L74:
            r6 = r4
        L75:
            r11 = r6
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            if (r11 != 0) goto L7b
            return r4
        L7b:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            kotlin.jvm.internal.Ref$ObjectRef r12 = new kotlin.jvm.internal.Ref$ObjectRef
            r12.<init>()
            r12.element = r11
            androidx.compose.ui.platform.ViewConfiguration r2 = r9.getViewConfiguration()
            long r5 = r2.getLongPressTimeoutMillis()
            kotlin.jvm.internal.Ref$BooleanRef r2 = new kotlin.jvm.internal.Ref$BooleanRef     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r2.<init>()     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2 r7 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r7.<init>(r2, r12, r10, r4)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.L$0 = r11     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.L$1 = r10     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.L$2 = r2     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            r0.label = r3     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            java.lang.Object r9 = r9.withTimeout(r5, r7, r0)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 != r1) goto La8
            return r1
        La8:
            r9 = r2
        La9:
            boolean r9 = r9.element     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 == 0) goto Lb5
            T r9 = r10.element     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> Lb6
            if (r9 != 0) goto Lb4
            return r11
        Lb4:
            return r9
        Lb5:
            return r4
        Lb6:
            T r9 = r10.element
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            if (r9 != 0) goto Lbd
            goto Lbe
        Lbd:
            r11 = r9
        Lbe:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m423awaitLongPressOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x017d -> B:11:0x0183). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m424awaitPointerSlopOrCancellation6ksA65w(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, @m80.l androidx.compose.foundation.gestures.Orientation r23, long r24, @m80.k x00.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, yz.g2> r26, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r27) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m424awaitPointerSlopOrCancellation6ksA65w(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, androidx.compose.foundation.gestures.Orientation, long, x00.p, j00.c):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$$forInline, reason: not valid java name */
    private static final Object m425awaitPointerSlopOrCancellation6ksA65w$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j11, int i11, Orientation orientation, long j12, p<? super PointerInputChange, ? super Offset, g2> pVar, c<? super PointerInputChange> cVar) {
        int i12;
        PointerEvent pointerEvent;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m435isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j11)) {
            return null;
        }
        float m436pointerSlopE8SPZFQ = m436pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i11);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j11;
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, j12, null);
        while (true) {
            int i13 = 0;
            d0.e(0);
            int i14 = 1;
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, cVar, 1, null);
            d0.e(1);
            PointerEvent pointerEvent2 = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent2.getChanges();
            int size = changes.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    i12 = i14;
                    pointerEvent = pointerEvent2;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i15);
                i12 = i14;
                pointerEvent = pointerEvent2;
                if (Boolean.valueOf(PointerId.m3714equalsimpl0(pointerInputChange.m3730getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                    break;
                }
                i15++;
                i14 = i12;
                pointerEvent2 = pointerEvent;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i13 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i13);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i13++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.m3730getIdJ3iCeTQ();
            } else {
                long m522addPointerInputChangedBAh8RU = touchSlopDetector.m522addPointerInputChangedBAh8RU(pointerInputChange3, m436pointerSlopE8SPZFQ);
                if ((9223372034707292159L & m522addPointerInputChangedBAh8RU) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    pVar.invoke(pointerInputChange3, Offset.m2257boximpl(m522addPointerInputChangedBAh8RU));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    touchSlopDetector.reset();
                } else {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    d0.e(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, cVar);
                    d0.e(i12);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-6ksA65w$default, reason: not valid java name */
    public static /* synthetic */ Object m426awaitPointerSlopOrCancellation6ksA65w$default(AwaitPointerEventScope awaitPointerEventScope, long j11, int i11, Orientation orientation, long j12, p pVar, c cVar, int i12, Object obj) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        long m2284getZeroF1C5BW0 = (i12 & 8) != 0 ? Offset.Companion.m2284getZeroF1C5BW0() : j12;
        long j13 = j11;
        if (m435isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j13)) {
            return null;
        }
        float m436pointerSlopE8SPZFQ = m436pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i11);
        TouchSlopDetector touchSlopDetector = new TouchSlopDetector(orientation, m2284getZeroF1C5BW0, null);
        while (true) {
            int i13 = 0;
            d0.e(0);
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, cVar, 1, null);
            d0.e(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i14);
                if (PointerId.m3714equalsimpl0(pointerInputChange.m3730getIdJ3iCeTQ(), j13)) {
                    break;
                }
                i14++;
            }
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3 == null || pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                while (true) {
                    if (i13 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i13);
                    if (pointerInputChange2.getPressed()) {
                        break;
                    }
                    i13++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                j13 = pointerInputChange4.m3730getIdJ3iCeTQ();
            } else {
                long m522addPointerInputChangedBAh8RU = touchSlopDetector.m522addPointerInputChangedBAh8RU(pointerInputChange3, m436pointerSlopE8SPZFQ);
                if ((9223372034707292159L & m522addPointerInputChangedBAh8RU) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                    pVar.invoke(pointerInputChange3, Offset.m2257boximpl(m522addPointerInputChangedBAh8RU));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    touchSlopDetector.reset();
                } else {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    d0.e(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, cVar);
                    d0.e(1);
                    if (pointerInputChange3.isConsumed()) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0180 -> B:11:0x0186). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: awaitTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m427awaitTouchSlopOrCancellationjO51t88(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, @m80.k x00.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super androidx.compose.ui.geometry.Offset, yz.g2> r22, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r23) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m427awaitTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        if ((java.lang.Float.intBitsToFloat((int) (androidx.compose.ui.input.pointer.PointerEventKt.positionChangeIgnoreConsumed(r11) & 4294967295L)) == 0.0f ? 1 : 0) == 0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0067 -> B:10:0x006c). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: awaitVerticalDragOrCancellation-rnUCldI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m428awaitVerticalDragOrCancellationrnUCldI(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m428awaitVerticalDragOrCancellationrnUCldI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0181 -> B:11:0x0187). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: awaitVerticalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m429awaitVerticalPointerSlopOrCancellationgDDlDlE(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, int r24, @m80.k x00.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, yz.g2> r25, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r26) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m429awaitVerticalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0193 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0187 -> B:11:0x018d). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: awaitVerticalTouchSlopOrCancellation-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m430awaitVerticalTouchSlopOrCancellationjO51t88(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r21, long r22, @m80.k x00.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, yz.g2> r24, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m430awaitVerticalTouchSlopOrCancellationjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x00.p, j00.c):java.lang.Object");
    }

    @m80.l
    public static final Object detectDragGestures(@k PointerInputScope pointerInputScope, @k final l<? super Offset, g2> lVar, @k final a<g2> aVar, @k a<g2> aVar2, @k p<? super PointerInputChange, ? super Offset, g2> pVar, @k c<? super g2> cVar) {
        Object detectDragGestures = detectDragGestures(pointerInputScope, new q<PointerInputChange, PointerInputChange, Offset, g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, Offset offset) {
                m439invoke0AR0LA0(pointerInputChange, pointerInputChange2, offset.m2278unboximpl());
                return g2.f100423a;
            }

            /* renamed from: invoke-0AR0LA0, reason: not valid java name */
            public final void m439invoke0AR0LA0(PointerInputChange pointerInputChange, PointerInputChange pointerInputChange2, long j11) {
                lVar.invoke(Offset.m2257boximpl(pointerInputChange2.m3732getPositionF1C5BW0()));
            }
        }, new l<PointerInputChange, g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(PointerInputChange pointerInputChange) {
                invoke2(pointerInputChange);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PointerInputChange pointerInputChange) {
                aVar.invoke();
            }
        }, aVar2, new a<Boolean>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        }, null, pVar, cVar);
        return detectDragGestures == b.l() ? detectDragGestures : g2.f100423a;
    }

    public static /* synthetic */ Object detectDragGestures$default(PointerInputScope pointerInputScope, l lVar, a aVar, a aVar2, p pVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new l<Offset, g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$2
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                    m438invokek4lQ0M(offset.m2278unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m438invokek4lQ0M(long j11) {
                }
            };
        }
        if ((i11 & 2) != 0) {
            aVar = new a<g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 4) != 0) {
            aVar2 = new a<g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }
            };
        }
        a aVar3 = aVar2;
        return detectDragGestures(pointerInputScope, lVar, aVar, aVar3, pVar, cVar);
    }

    @m80.l
    public static final Object detectDragGesturesAfterLongPress(@k PointerInputScope pointerInputScope, @k l<? super Offset, g2> lVar, @k a<g2> aVar, @k a<g2> aVar2, @k p<? super PointerInputChange, ? super Offset, g2> pVar, @k c<? super g2> cVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(lVar, aVar, aVar2, pVar, null), cVar);
        return awaitEachGesture == b.l() ? awaitEachGesture : g2.f100423a;
    }

    public static /* synthetic */ Object detectDragGesturesAfterLongPress$default(PointerInputScope pointerInputScope, l lVar, a aVar, a aVar2, p pVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new l<Offset, g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$2
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                    m440invokek4lQ0M(offset.m2278unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m440invokek4lQ0M(long j11) {
                }
            };
        }
        if ((i11 & 2) != 0) {
            aVar = new a<g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 4) != 0) {
            aVar2 = new a<g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }
            };
        }
        a aVar3 = aVar2;
        return detectDragGesturesAfterLongPress(pointerInputScope, lVar, aVar, aVar3, pVar, cVar);
    }

    @m80.l
    public static final Object detectHorizontalDragGestures(@k PointerInputScope pointerInputScope, @k l<? super Offset, g2> lVar, @k a<g2> aVar, @k a<g2> aVar2, @k p<? super PointerInputChange, ? super Float, g2> pVar, @k c<? super g2> cVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectHorizontalDragGestures$5(lVar, pVar, aVar, aVar2, null), cVar);
        return awaitEachGesture == b.l() ? awaitEachGesture : g2.f100423a;
    }

    public static /* synthetic */ Object detectHorizontalDragGestures$default(PointerInputScope pointerInputScope, l lVar, a aVar, a aVar2, p pVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new l<Offset, g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$2
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                    m441invokek4lQ0M(offset.m2278unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m441invokek4lQ0M(long j11) {
                }
            };
        }
        if ((i11 & 2) != 0) {
            aVar = new a<g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 4) != 0) {
            aVar2 = new a<g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectHorizontalDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }
            };
        }
        a aVar3 = aVar2;
        return detectHorizontalDragGestures(pointerInputScope, lVar, aVar, aVar3, pVar, cVar);
    }

    @m80.l
    public static final Object detectVerticalDragGestures(@k PointerInputScope pointerInputScope, @k l<? super Offset, g2> lVar, @k a<g2> aVar, @k a<g2> aVar2, @k p<? super PointerInputChange, ? super Float, g2> pVar, @k c<? super g2> cVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectVerticalDragGestures$5(lVar, pVar, aVar, aVar2, null), cVar);
        return awaitEachGesture == b.l() ? awaitEachGesture : g2.f100423a;
    }

    public static /* synthetic */ Object detectVerticalDragGestures$default(PointerInputScope pointerInputScope, l lVar, a aVar, a aVar2, p pVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = new l<Offset, g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$2
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Offset offset) {
                    m442invokek4lQ0M(offset.m2278unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                public final void m442invokek4lQ0M(long j11) {
                }
            };
        }
        if ((i11 & 2) != 0) {
            aVar = new a<g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }
            };
        }
        if ((i11 & 4) != 0) {
            aVar2 = new a<g2>() { // from class: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectVerticalDragGestures$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }
            };
        }
        a aVar3 = aVar2;
        return detectVerticalDragGestures(pointerInputScope, lVar, aVar, aVar3, pVar, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x012b, code lost:
    
        if (((r3 != null ? r3 == androidx.compose.foundation.gestures.Orientation.Vertical ? java.lang.Float.intBitsToFloat((int) (r4 & 4294967295L)) : java.lang.Float.intBitsToFloat((int) (r4 >> 32)) : androidx.compose.ui.geometry.Offset.m2266getDistanceimpl(r4)) == 0.0f) == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008d -> B:10:0x0093). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: drag-VnAYq1g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m431dragVnAYq1g(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, @m80.k x00.l<? super androidx.compose.ui.input.pointer.PointerInputChange, yz.g2> r22, @m80.l androidx.compose.foundation.gestures.Orientation r23, @m80.k x00.l<? super androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Boolean> r24, @m80.k j00.c<? super androidx.compose.ui.input.pointer.PointerInputChange> r25) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m431dragVnAYq1g(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x00.l, androidx.compose.foundation.gestures.Orientation, x00.l, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: drag-VnAYq1g$$forInline, reason: not valid java name */
    private static final Object m432dragVnAYq1g$$forInline(AwaitPointerEventScope awaitPointerEventScope, long j11, l<? super PointerInputChange, g2> lVar, Orientation orientation, l<? super PointerInputChange, Boolean> lVar2, c<? super PointerInputChange> cVar) {
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        long j12 = j11;
        if (m435isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j12)) {
            return null;
        }
        while (true) {
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = j12;
            while (true) {
                d0.e(0);
                Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, cVar, 1, null);
                d0.e(1);
                PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
                List<PointerInputChange> changes = pointerEvent.getChanges();
                int size = changes.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes.get(i11);
                    if (Boolean.valueOf(PointerId.m3714equalsimpl0(pointerInputChange.m3730getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                        break;
                    }
                    i11++;
                }
                pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 == null) {
                    pointerInputChange2 = null;
                    break;
                }
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                    List<PointerInputChange> changes2 = pointerEvent.getChanges();
                    int size2 = changes2.size();
                    while (true) {
                        if (r2 >= size2) {
                            pointerInputChange3 = null;
                            break;
                        }
                        pointerInputChange3 = changes2.get(r2);
                        if (Boolean.valueOf(pointerInputChange3.getPressed()).booleanValue()) {
                            break;
                        }
                        r2++;
                    }
                    PointerInputChange pointerInputChange4 = pointerInputChange3;
                    if (pointerInputChange4 == null) {
                        break;
                    }
                    longRef.element = pointerInputChange4.m3730getIdJ3iCeTQ();
                } else {
                    long positionChangeIgnoreConsumed = PointerEventKt.positionChangeIgnoreConsumed(pointerInputChange2);
                    if (Boolean.valueOf(((orientation == null ? Offset.m2266getDistanceimpl(positionChangeIgnoreConsumed) : orientation == Orientation.Vertical ? Float.intBitsToFloat((int) (positionChangeIgnoreConsumed & 4294967295L)) : Float.intBitsToFloat((int) (positionChangeIgnoreConsumed >> 32))) == 0.0f ? 1 : 0) ^ 1).booleanValue()) {
                        break;
                    }
                }
            }
            if (pointerInputChange2 == null || lVar2.invoke(pointerInputChange2).booleanValue()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                return pointerInputChange2;
            }
            lVar.invoke(pointerInputChange2);
            j12 = pointerInputChange2.m3730getIdJ3iCeTQ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: drag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m433dragjO51t88(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r4, long r5, @m80.k x00.l<? super androidx.compose.ui.input.pointer.PointerInputChange, yz.g2> r7, @m80.k j00.c<? super java.lang.Boolean> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = (androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1 r0 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$drag$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.L$1
            x00.l r4 = (x00.l) r4
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
            kotlin.e.n(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e.n(r8)
        L3e:
            r0.L$0 = r4
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r8 = m418awaitDragOrCancellationrnUCldI(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = l00.a.a(r4)
            return r4
        L55:
            boolean r5 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = l00.a.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.m3730getIdJ3iCeTQ()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m433dragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x00.l, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0083 -> B:10:0x0089). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: horizontalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m434horizontalDragjO51t88(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @m80.k x00.l<? super androidx.compose.ui.input.pointer.PointerInputChange, yz.g2> r20, @m80.k j00.c<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m434horizontalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x00.l, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    public static final boolean m435isPointerUpDmW0f2w(PointerEvent pointerEvent, long j11) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z11 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i11);
            if (PointerId.m3714equalsimpl0(pointerInputChange.m3730getIdJ3iCeTQ(), j11)) {
                break;
            }
            i11++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z11 = true;
        }
        return true ^ z11;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m436pointerSlopE8SPZFQ(@k ViewConfiguration viewConfiguration, int i11) {
        return PointerType.m3803equalsimpl0(i11, PointerType.Companion.m3808getMouseT8wyACA()) ? viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio : viewConfiguration.getTouchSlop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0118, code lost:
    
        if ((r0 == 0.0f) == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0083 -> B:10:0x0089). Please report as a decompilation issue!!! */
    @m80.l
    /* renamed from: verticalDrag-jO51t88, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m437verticalDragjO51t88(@m80.k androidx.compose.ui.input.pointer.AwaitPointerEventScope r17, long r18, @m80.k x00.l<? super androidx.compose.ui.input.pointer.PointerInputChange, yz.g2> r20, @m80.k j00.c<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt.m437verticalDragjO51t88(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, x00.l, j00.c):java.lang.Object");
    }

    @m80.l
    public static final Object detectDragGestures(@k PointerInputScope pointerInputScope, @k q<? super PointerInputChange, ? super PointerInputChange, ? super Offset, g2> qVar, @k l<? super PointerInputChange, g2> lVar, @k a<g2> aVar, @k a<Boolean> aVar2, @m80.l Orientation orientation, @k p<? super PointerInputChange, ? super Offset, g2> pVar, @k c<? super g2> cVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new DragGestureDetectorKt$detectDragGestures$9(aVar2, new Ref.LongRef(), orientation, qVar, pVar, aVar, lVar, null), cVar);
        return awaitEachGesture == b.l() ? awaitEachGesture : g2.f100423a;
    }
}
