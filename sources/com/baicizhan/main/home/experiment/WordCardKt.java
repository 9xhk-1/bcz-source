package com.baicizhan.main.home.experiment;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ChainStyle;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.LayoutReference;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.constraintlayout.compose.Visibility;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.home.experiment.WordCardKt;
import com.baicizhan.main.home.experiment.e;
import com.baicizhan.main.home.experiment.n5;
import com.baicizhan.main.home.experiment.u3;
import com.baicizhan.main.home.experiment.w5;
import com.baicizhan.main.home.plan.view.WordPlanInfoView;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.baicizhan.platform.base.widget.WidgetsKt;
import com.jiongji.andriod.card.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kc.d;
import kc.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 14 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 15 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 16 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 17 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 18 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 19 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 20 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 21 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 22 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,826:1\n1247#2,6:827\n1247#2,6:833\n1247#2,6:840\n1247#2,6:846\n1247#2,6:852\n1247#2,6:858\n1247#2,3:942\n1250#2,3:952\n1247#2,6:993\n1247#2,6:999\n1247#2,6:1010\n1247#2,6:1061\n1225#2,6:1189\n1225#2,6:1290\n1247#2,6:1460\n1247#2,6:1722\n113#3:839\n113#3:864\n113#3:865\n113#3:899\n113#3:992\n113#3:1020\n113#3:1058\n113#3:1059\n113#3:1060\n113#3:1074\n113#3:1076\n113#3:1082\n113#3:1092\n113#3:1181\n113#3:1241\n113#3:1242\n113#3:1416\n113#3:1417\n113#3:1422\n113#3:1423\n113#3:1466\n113#3:1482\n113#3:1572\n113#3:1639\n113#3:1683\n113#3:1721\n113#3:1728\n113#3:1730\n113#3:1770\n113#3:1771\n99#4,6:866\n106#4:903\n99#4:1021\n97#4,8:1022\n106#4:1071\n99#4:1732\n96#4,9:1733\n106#4:1815\n79#5,6:872\n86#5,3:887\n89#5,2:896\n93#5:902\n79#5,6:915\n86#5,3:930\n89#5,2:939\n79#5,6:965\n86#5,3:980\n89#5,2:989\n93#5:1007\n93#5:1018\n79#5,6:1030\n86#5,3:1045\n89#5,2:1054\n93#5:1070\n79#5,6:1103\n86#5,3:1118\n89#5,2:1127\n93#5:1132\n79#5,6:1149\n86#5,3:1164\n89#5,2:1173\n93#5:1179\n79#5,6:1252\n86#5,3:1267\n89#5,2:1276\n93#5:1281\n79#5,6:1352\n86#5,3:1367\n89#5,2:1376\n79#5,6:1389\n86#5,3:1404\n89#5,2:1413\n93#5:1420\n79#5,6:1433\n86#5,3:1448\n89#5,2:1457\n93#5:1469\n93#5:1473\n79#5,6:1494\n86#5,3:1509\n89#5,2:1518\n93#5:1524\n79#5,6:1742\n86#5,3:1757\n89#5,2:1766\n79#5,6:1781\n86#5,3:1796\n89#5,2:1805\n93#5:1810\n93#5:1814\n347#6,9:878\n356#6:898\n357#6,2:900\n347#6,9:921\n356#6:941\n347#6,9:971\n356#6:991\n357#6,2:1005\n357#6,2:1016\n347#6,9:1036\n356#6:1056\n357#6,2:1068\n347#6,9:1109\n356#6,3:1129\n347#6,9:1155\n356#6:1175\n357#6,2:1177\n347#6,9:1258\n356#6,3:1278\n347#6,9:1358\n356#6:1378\n347#6,9:1395\n356#6:1415\n357#6,2:1418\n347#6,9:1439\n356#6:1459\n357#6,2:1467\n357#6,2:1471\n347#6,9:1500\n356#6:1520\n357#6,2:1522\n347#6,9:1748\n356#6:1768\n347#6,9:1787\n356#6,3:1807\n357#6,2:1812\n4206#7,6:890\n4206#7,6:933\n4206#7,6:983\n4206#7,6:1048\n4206#7,6:1121\n4206#7,6:1167\n4206#7,6:1270\n4206#7,6:1370\n4206#7,6:1407\n4206#7,6:1451\n4206#7,6:1512\n4206#7,6:1760\n4206#7,6:1799\n75#8:904\n75#8:1009\n75#8:1072\n75#8:1075\n75#8:1081\n75#8:1087\n75#8:1176\n77#8:1220\n77#8:1321\n75#8:1521\n75#8:1769\n70#9:905\n67#9,9:906\n77#9:1019\n70#9:1093\n67#9,9:1094\n77#9:1133\n70#9:1140\n68#9,8:1141\n77#9:1180\n70#9:1243\n68#9,8:1244\n77#9:1282\n70#9:1342\n67#9,9:1343\n70#9:1379\n67#9,9:1380\n77#9:1421\n77#9:1474\n70#9:1772\n68#9,8:1773\n77#9:1811\n360#10,7:945\n1869#10:1057\n1870#10:1067\n87#11:955\n84#11,9:956\n94#11:1008\n87#11:1424\n85#11,8:1425\n94#11:1470\n87#11:1483\n83#11,10:1484\n94#11:1525\n1#12:1073\n1#12:1197\n1#12:1298\n30#13:1077\n53#14,3:1078\n53#14,3:1084\n70#14:1089\n90#14:1479\n90#14:1481\n70#14:1527\n60#14:1531\n60#14:1534\n60#14:1537\n70#14:1540\n60#14:1542\n70#14:1545\n60#14:1547\n70#14:1549\n60#14:1551\n70#14:1555\n70#14:1557\n60#14:1560\n60#14:1562\n60#14:1565\n70#14:1569\n60#14:1574\n70#14:1578\n60#14:1581\n60#14:1583\n70#14:1586\n60#14:1588\n70#14:1591\n70#14:1594\n60#14:1598\n60#14:1601\n60#14:1604\n70#14:1607\n60#14:1609\n70#14:1612\n60#14:1614\n70#14:1616\n60#14:1618\n70#14:1622\n70#14:1624\n60#14:1627\n60#14:1629\n60#14:1632\n70#14:1636\n60#14:1641\n70#14:1645\n60#14:1648\n60#14:1650\n70#14:1654\n70#14:1656\n70#14:1659\n70#14:1662\n60#14:1666\n70#14:1669\n60#14:1672\n60#14:1674\n60#14:1677\n70#14:1681\n60#14:1685\n60#14:1689\n60#14:1692\n60#14:1696\n60#14:1699\n60#14:1702\n70#14:1705\n60#14:1707\n70#14:1710\n60#14:1712\n70#14:1714\n70#14:1716\n70#14:1719\n33#15:1083\n69#16:1088\n69#16:1526\n65#16:1553\n65#16:1564\n69#16:1571\n65#16:1573\n65#16:1582\n65#16:1587\n69#16:1593\n65#16:1620\n65#16:1634\n69#16:1638\n65#16:1643\n65#16:1652\n69#16:1661\n65#16:1665\n65#16:1676\n69#16:1680\n65#16:1684\n65#16:1691\n22#17:1090\n22#17:1528\n22#17:1532\n22#17:1535\n22#17:1538\n22#17:1543\n22#17:1552\n22#17:1558\n22#17:1563\n22#17:1566\n22#17:1570\n22#17:1575\n22#17:1579\n22#17:1584\n22#17:1589\n22#17:1592\n22#17:1595\n22#17:1599\n22#17:1602\n22#17:1605\n22#17:1610\n22#17:1619\n22#17:1625\n22#17:1630\n22#17:1633\n22#17:1637\n22#17:1642\n22#17:1646\n22#17:1651\n22#17:1657\n22#17:1660\n22#17:1663\n22#17:1667\n22#17:1670\n22#17:1675\n22#17:1678\n22#17:1682\n22#17:1686\n22#17:1690\n22#17:1693\n22#17:1697\n22#17:1700\n22#17:1703\n22#17:1708\n22#17:1717\n22#17:1720\n61#18:1091\n61#18:1529\n57#18:1530\n57#18:1533\n57#18:1536\n61#18:1539\n57#18:1541\n61#18:1544\n57#18:1546\n61#18:1548\n57#18:1550\n61#18:1554\n61#18:1556\n57#18:1559\n57#18:1561\n57#18:1567\n61#18:1568\n57#18:1576\n61#18:1577\n57#18:1580\n61#18:1585\n61#18:1590\n61#18:1596\n57#18:1597\n57#18:1600\n57#18:1603\n61#18:1606\n57#18:1608\n61#18:1611\n57#18:1613\n61#18:1615\n57#18:1617\n61#18:1621\n61#18:1623\n57#18:1626\n57#18:1628\n57#18:1631\n61#18:1635\n57#18:1640\n61#18:1644\n57#18:1647\n57#18:1649\n61#18:1653\n61#18:1655\n61#18:1658\n61#18:1664\n61#18:1668\n57#18:1671\n57#18:1673\n57#18:1679\n57#18:1687\n57#18:1688\n57#18:1694\n57#18:1695\n57#18:1698\n57#18:1701\n61#18:1704\n57#18:1706\n61#18:1709\n57#18:1711\n61#18:1713\n61#18:1715\n61#18:1718\n85#19:1134\n113#19,2:1135\n85#19:1137\n113#19,2:1138\n85#19:1475\n113#19,2:1476\n354#20,7:1182\n361#20,2:1195\n363#20,7:1198\n401#20,10:1205\n400#20:1215\n412#20,4:1216\n416#20,7:1221\n446#20,12:1228\n472#20:1240\n354#20,7:1283\n361#20,2:1296\n363#20,7:1299\n401#20,10:1306\n400#20:1316\n412#20,4:1317\n416#20,7:1322\n446#20,12:1329\n472#20:1341\n59#21:1478\n59#21:1480\n49#22:1729\n49#22:1731\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt\n*L\n173#1:827,6\n174#1:833,6\n184#1:840,6\n204#1:846,6\n193#1:852,6\n187#1:858,6\n463#1:942,3\n463#1:952,3\n474#1:993,6\n477#1:999,6\n536#1:1010,6\n551#1:1061,6\n226#1:1189,6\n260#1:1290,6\n412#1:1460,6\n755#1:1722,6\n181#1:839\n216#1:864\n448#1:865\n451#1:899\n473#1:992\n548#1:1020\n569#1:1058\n570#1:1059\n572#1:1060\n775#1:1074\n776#1:1076\n777#1:1082\n779#1:1092\n226#1:1181\n259#1:1241\n373#1:1242\n389#1:1416\n397#1:1417\n403#1:1422\n404#1:1423\n415#1:1466\n576#1:1482\n621#1:1572\n645#1:1639\n665#1:1683\n755#1:1721\n794#1:1728\n796#1:1730\n801#1:1770\n804#1:1771\n448#1:866,6\n448#1:903\n548#1:1021\n548#1:1022,8\n548#1:1071\n792#1:1732\n792#1:1733,9\n792#1:1815\n448#1:872,6\n448#1:887,3\n448#1:896,2\n448#1:902\n462#1:915,6\n462#1:930,3\n462#1:939,2\n469#1:965,6\n469#1:980,3\n469#1:989,2\n469#1:1007\n462#1:1018\n548#1:1030,6\n548#1:1045,3\n548#1:1054,2\n548#1:1070\n780#1:1103,6\n780#1:1118,3\n780#1:1127,2\n780#1:1132\n220#1:1149,6\n220#1:1164,3\n220#1:1173,2\n220#1:1179\n436#1:1252,6\n436#1:1267,3\n436#1:1276,2\n436#1:1281\n374#1:1352,6\n374#1:1367,3\n374#1:1376,2\n380#1:1389,6\n380#1:1404,3\n380#1:1413,2\n380#1:1420\n401#1:1433,6\n401#1:1448,3\n401#1:1457,2\n401#1:1469\n374#1:1473\n576#1:1494,6\n576#1:1509,3\n576#1:1518,2\n576#1:1524\n792#1:1742,6\n792#1:1757,3\n792#1:1766,2\n802#1:1781,6\n802#1:1796,3\n802#1:1805,2\n802#1:1810\n792#1:1814\n448#1:878,9\n448#1:898\n448#1:900,2\n462#1:921,9\n462#1:941\n469#1:971,9\n469#1:991\n469#1:1005,2\n462#1:1016,2\n548#1:1036,9\n548#1:1056\n548#1:1068,2\n780#1:1109,9\n780#1:1129,3\n220#1:1155,9\n220#1:1175\n220#1:1177,2\n436#1:1258,9\n436#1:1278,3\n374#1:1358,9\n374#1:1378\n380#1:1395,9\n380#1:1415\n380#1:1418,2\n401#1:1439,9\n401#1:1459\n401#1:1467,2\n374#1:1471,2\n576#1:1500,9\n576#1:1520\n576#1:1522,2\n792#1:1748,9\n792#1:1768\n802#1:1787,9\n802#1:1807,3\n792#1:1812,2\n448#1:890,6\n462#1:933,6\n469#1:983,6\n548#1:1048,6\n780#1:1121,6\n220#1:1167,6\n436#1:1270,6\n374#1:1370,6\n380#1:1407,6\n401#1:1451,6\n576#1:1512,6\n792#1:1760,6\n802#1:1799,6\n461#1:904\n526#1:1009\n775#1:1072\n776#1:1075\n777#1:1081\n778#1:1087\n221#1:1176\n226#1:1220\n260#1:1321\n579#1:1521\n801#1:1769\n462#1:905\n462#1:906,9\n462#1:1019\n780#1:1093\n780#1:1094,9\n780#1:1133\n220#1:1140\n220#1:1141,8\n220#1:1180\n436#1:1243\n436#1:1244,8\n436#1:1282\n374#1:1342\n374#1:1343,9\n380#1:1379\n380#1:1380,9\n380#1:1421\n374#1:1474\n802#1:1772\n802#1:1773,8\n802#1:1811\n463#1:945,7\n549#1:1057\n549#1:1067\n469#1:955\n469#1:956,9\n469#1:1008\n401#1:1424\n401#1:1425,8\n401#1:1470\n576#1:1483\n576#1:1484,10\n576#1:1525\n226#1:1197\n260#1:1298\n776#1:1077\n776#1:1078,3\n777#1:1084,3\n778#1:1089\n475#1:1479\n476#1:1481\n608#1:1527\n611#1:1531\n612#1:1534\n613#1:1537\n613#1:1540\n614#1:1542\n614#1:1545\n614#1:1547\n614#1:1549\n615#1:1551\n615#1:1555\n616#1:1557\n616#1:1560\n618#1:1562\n620#1:1565\n621#1:1569\n622#1:1574\n623#1:1578\n623#1:1581\n625#1:1583\n625#1:1586\n626#1:1588\n627#1:1591\n632#1:1594\n635#1:1598\n636#1:1601\n637#1:1604\n637#1:1607\n638#1:1609\n638#1:1612\n638#1:1614\n638#1:1616\n639#1:1618\n639#1:1622\n640#1:1624\n640#1:1627\n642#1:1629\n644#1:1632\n645#1:1636\n646#1:1641\n647#1:1645\n647#1:1648\n649#1:1650\n649#1:1654\n650#1:1656\n651#1:1659\n656#1:1662\n659#1:1666\n660#1:1669\n660#1:1672\n662#1:1674\n664#1:1677\n665#1:1681\n666#1:1685\n667#1:1689\n669#1:1692\n670#1:1696\n671#1:1699\n672#1:1702\n672#1:1705\n673#1:1707\n673#1:1710\n673#1:1712\n673#1:1714\n674#1:1716\n675#1:1719\n777#1:1083\n778#1:1088\n608#1:1526\n615#1:1553\n620#1:1564\n621#1:1571\n622#1:1573\n625#1:1582\n626#1:1587\n632#1:1593\n639#1:1620\n644#1:1634\n645#1:1638\n646#1:1643\n649#1:1652\n656#1:1661\n659#1:1665\n664#1:1676\n665#1:1680\n666#1:1684\n669#1:1691\n778#1:1090\n608#1:1528\n611#1:1532\n612#1:1535\n613#1:1538\n614#1:1543\n615#1:1552\n616#1:1558\n618#1:1563\n620#1:1566\n621#1:1570\n622#1:1575\n623#1:1579\n625#1:1584\n626#1:1589\n627#1:1592\n632#1:1595\n635#1:1599\n636#1:1602\n637#1:1605\n638#1:1610\n639#1:1619\n640#1:1625\n642#1:1630\n644#1:1633\n645#1:1637\n646#1:1642\n647#1:1646\n649#1:1651\n650#1:1657\n651#1:1660\n656#1:1663\n659#1:1667\n660#1:1670\n662#1:1675\n664#1:1678\n665#1:1682\n666#1:1686\n667#1:1690\n669#1:1693\n670#1:1697\n671#1:1700\n672#1:1703\n673#1:1708\n674#1:1717\n675#1:1720\n778#1:1091\n608#1:1529\n611#1:1530\n612#1:1533\n613#1:1536\n613#1:1539\n614#1:1541\n614#1:1544\n614#1:1546\n614#1:1548\n615#1:1550\n615#1:1554\n616#1:1556\n616#1:1559\n618#1:1561\n620#1:1567\n621#1:1568\n622#1:1576\n623#1:1577\n623#1:1580\n625#1:1585\n627#1:1590\n632#1:1596\n635#1:1597\n636#1:1600\n637#1:1603\n637#1:1606\n638#1:1608\n638#1:1611\n638#1:1613\n638#1:1615\n639#1:1617\n639#1:1621\n640#1:1623\n640#1:1626\n642#1:1628\n644#1:1631\n645#1:1635\n646#1:1640\n647#1:1644\n647#1:1647\n649#1:1649\n649#1:1653\n650#1:1655\n651#1:1658\n656#1:1664\n660#1:1668\n660#1:1671\n662#1:1673\n664#1:1679\n666#1:1687\n667#1:1688\n669#1:1694\n670#1:1695\n671#1:1698\n672#1:1701\n672#1:1704\n673#1:1706\n673#1:1709\n673#1:1711\n673#1:1713\n674#1:1715\n675#1:1718\n173#1:1134\n173#1:1135,2\n174#1:1137\n174#1:1138,2\n463#1:1475\n463#1:1476,2\n226#1:1182,7\n226#1:1195,2\n226#1:1198,7\n226#1:1205,10\n226#1:1215\n226#1:1216,4\n226#1:1221,7\n226#1:1228,12\n226#1:1240\n260#1:1283,7\n260#1:1296,2\n260#1:1299,7\n260#1:1306,10\n260#1:1316\n260#1:1317,4\n260#1:1322,7\n260#1:1329,12\n260#1:1341\n475#1:1478\n476#1:1480\n795#1:1729\n797#1:1731\n*E\n"})
/* loaded from: classes4.dex */
public final class WordCardKt {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f21032a = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.experiment.q4
        @Override // x00.a
        public final Object invoke() {
            List L0;
            L0 = WordCardKt.L0();
            return L0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21043a;

        static {
            int[] iArr = new int[PointerPosition.values().length];
            try {
                iArr[PointerPosition.BOTTOM_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerPosition.BOTTOM_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerPosition.TOP_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PointerPosition.TOP_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f21043a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,826:1\n113#2:827\n113#2:828\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$2$1$1\n*L\n230#1:827\n231#1:828\n*E\n"})
    public static final class b implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f21044a = new b();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            Dimension.Companion companion = Dimension.Companion;
            float f11 = 80;
            constrainAs.setWidth(companion.m5473value0680j_4(Dp.m5115constructorimpl(f11)));
            constrainAs.setHeight(companion.m5473value0680j_4(Dp.m5115constructorimpl(f11)));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21045a;

        public c(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f21045a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, this.f21045a.getStart(), this.f21045a.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21046a;

        public d(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f21046a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, this.f21046a.getStart(), this.f21046a.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final e f21047a = new e();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$3$1$10$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,826:1\n113#2:827\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$3$1$10$1\n*L\n340#1:827\n*E\n"})
    public static final class f implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21048a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21049b;

        public f(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f21048a = constrainedLayoutReference;
            this.f21049b = constrainedLayoutReference2;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f21048a.getEnd(), Dp.m5115constructorimpl(12), 0.0f, 4, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, this.f21049b.getTop(), this.f21049b.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$3$1$11$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,826:1\n113#2:827\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$3$1$11$1\n*L\n351#1:827\n*E\n"})
    public static final class g implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21050a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21051b;

        public g(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f21050a = constrainedLayoutReference;
            this.f21051b = constrainedLayoutReference2;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), this.f21050a.getTop(), Dp.m5115constructorimpl(16), 0.0f, 4, (Object) null);
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, this.f21051b.getStart(), this.f21050a.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            constrainAs.setWidth(Dimension.Companion.getFillToConstraints());
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21052a;

        public h(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f21052a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f21052a.getStart(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f21052a.getBottom(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f21053a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n5 f21054b;

        public i(MutableState<Boolean> mutableState, n5 n5Var) {
            this.f21053a = mutableState;
            this.f21054b = n5Var;
        }

        public final void a() {
            this.f21053a.setValue(Boolean.FALSE);
            this.f21054b.a().invoke();
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3 f21055a;

        public j(x3 x3Var) {
            this.f21055a = x3Var;
        }

        public final void a() {
            this.f21055a.b(SimpleNavigation.PLAN_EDIT);
            ma.l.a(ma.t.f73003b, ma.a.f72769j0);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21056a;

        public k(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f21056a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f21056a.getBottom(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$3$1$4$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,826:1\n1#2:827\n*E\n"})
    public static final class l implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3 f21057a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f21058b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w5 f21059c;

        public l(x3 x3Var, MutableState<Boolean> mutableState, w5 w5Var) {
            this.f21057a = x3Var;
            this.f21058b = mutableState;
            this.f21059c = w5Var;
        }

        public final void a() {
            Object obj;
            x00.a<yz.g2> a11;
            this.f21057a.b(SimpleNavigation.WORDS_LIST);
            if (this.f21058b.getValue().booleanValue()) {
                this.f21058b.setValue(Boolean.FALSE);
                Iterator<T> it = ((w5.c) this.f21059c).j().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((n5) obj) instanceof n5.a) {
                            break;
                        }
                    }
                }
                n5 n5Var = (n5) obj;
                if (n5Var == null || (a11 = n5Var.a()) == null) {
                    return;
                }
                a11.invoke();
            }
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$3$1$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,826:1\n113#2:827\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$3$1$5$1\n*L\n308#1:827\n*E\n"})
    public static final class m implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21060a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21061b;

        public m(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f21060a = constrainedLayoutReference;
            this.f21061b = constrainedLayoutReference2;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f21060a.getStart(), 0.0f, 0.0f, 6, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, this.f21061b.getTop(), this.f21061b.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            constrainAs.setWidth(ConstraintLayoutKt.m5454atMost3ABfNKs(Dimension.Companion.getPreferredWrapContent(), Dp.m5115constructorimpl(268)));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$3$1$6$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,826:1\n1#2:827\n*E\n"})
    public static final class n implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3 f21062a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f21063b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ w5 f21064c;

        public n(x3 x3Var, MutableState<Boolean> mutableState, w5 w5Var) {
            this.f21062a = x3Var;
            this.f21063b = mutableState;
            this.f21064c = w5Var;
        }

        public final void a() {
            Object obj;
            x00.a<yz.g2> a11;
            this.f21062a.b(SimpleNavigation.WORDS_LIST);
            if (this.f21063b.getValue().booleanValue()) {
                this.f21063b.setValue(Boolean.FALSE);
                Iterator<T> it = ((w5.c) this.f21064c).j().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((n5) obj) instanceof n5.a) {
                            break;
                        }
                    }
                }
                n5 n5Var = (n5) obj;
                if (n5Var == null || (a11 = n5Var.a()) == null) {
                    return;
                }
                a11.invoke();
            }
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$3$1$7$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,826:1\n113#2:827\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/experiment/WordCardKt$WordCard$5$3$1$7$1\n*L\n324#1:827\n*E\n"})
    public static final class o implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21065a;

        public o(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f21065a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f21065a.getEnd(), Dp.m5115constructorimpl(4), 0.0f, 4, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, this.f21065a.getTop(), this.f21065a.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class p implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final p f21066a = new p();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class q implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f21067a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ w5 f21068b;

        public q(ConstrainedLayoutReference constrainedLayoutReference, w5 w5Var) {
            this.f21067a = constrainedLayoutReference;
            this.f21068b = w5Var;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, this.f21067a.getTop(), this.f21067a.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            constrainAs.setVisibility(((w5.c) this.f21068b).i().f() > 0 ? Visibility.Companion.getVisible() : Visibility.Companion.getGone());
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class r implements x3 {
        @Override // com.baicizhan.main.home.experiment.x3
        public void a(String intent) {
            kotlin.jvm.internal.g0.p(intent, "intent");
        }

        @Override // com.baicizhan.main.home.experiment.x3
        public void b(SimpleNavigation action) {
            kotlin.jvm.internal.g0.p(action, "action");
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 A0(w5 w5Var, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-90099511, i11, -1, "com.baicizhan.main.home.experiment.WordCardPreview.<anonymous> (WordCard.kt:748)");
            }
            r rVar = new r();
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(16));
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.x4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 B0;
                        B0 = WordCardKt.B0();
                        return B0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            m0(w5Var, rVar, m726padding3ABfNKs, (x00.a) rememberedValue, composer, 3456, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 B0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 C0(w5 w5Var, int i11, Composer composer, int i12) {
        z0(w5Var, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final List<w5> H0() {
        return (List) f21032a.getValue();
    }

    @m80.k
    public static final Modifier I0(@m80.k Modifier pointerBackground, final long j11, @m80.k final PointerPosition position, final long j12, final long j13, final long j14, final float f11, final float f12) {
        kotlin.jvm.internal.g0.p(pointerBackground, "$this$pointerBackground");
        kotlin.jvm.internal.g0.p(position, "position");
        return pointerBackground.then(DrawModifierKt.drawBehind(Modifier.Companion, new x00.l() { // from class: com.baicizhan.main.home.experiment.z4
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 K0;
                K0 = WordCardKt.K0(PointerPosition.this, j11, j14, f11, j12, j13, f12, (DrawScope) obj);
                return K0;
            }
        }));
    }

    public static /* synthetic */ Modifier J0(Modifier modifier, long j11, PointerPosition pointerPosition, long j12, long j13, long j14, float f11, float f12, int i11, Object obj) {
        return I0(modifier, j11, pointerPosition, j12, (i11 & 8) != 0 ? Size.Companion.m2346getZeroNHjbRc() : j13, (i11 & 16) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j14, (i11 & 32) != 0 ? 0.0f : f11, (i11 & 64) != 0 ? 0.0f : f12);
    }

    public static final yz.g2 K0(PointerPosition pointerPosition, long j11, long j12, float f11, long j13, long j14, float f12, DrawScope drawBehind) {
        Path Path;
        kotlin.jvm.internal.g0.p(drawBehind, "$this$drawBehind");
        int i11 = a.f21043a[pointerPosition.ordinal()];
        if (i11 == 1) {
            Path = AndroidPath_androidKt.Path();
            int i12 = (int) (j13 & 4294967295L);
            int i13 = (int) (j14 & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat(i12) + Float.intBitsToFloat(i13);
            Path.moveTo(0.0f, f12);
            float f13 = 2;
            float f14 = f12 * f13;
            Path.arcTo(new Rect(0.0f, 0.0f, f14, f14), 180.0f, 90.0f, false);
            Path.lineTo(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f12, 0.0f);
            Path.arcTo(new Rect(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f14, 0.0f, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)), f14), -90.0f, 90.0f, false);
            Path.lineTo(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)), (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - f12) - intBitsToFloat);
            Path.arcTo(new Rect(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f14, (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - f14) - intBitsToFloat, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - intBitsToFloat), 0.0f, 90.0f, false);
            int i14 = (int) (j14 >> 32);
            int i15 = (int) (j13 >> 32);
            Path.lineTo(Float.intBitsToFloat(i14) + Float.intBitsToFloat(i15) + f12, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - intBitsToFloat);
            float intBitsToFloat2 = (Float.intBitsToFloat(i13) / Float.intBitsToFloat(i14)) * f13;
            Path.relativeLineTo((-Float.intBitsToFloat(i14)) * 0.3f, Float.intBitsToFloat(i14) * 0.3f * intBitsToFloat2);
            Path.quadraticBezierTo(Float.intBitsToFloat(i15) + f12 + (Float.intBitsToFloat(i14) / f13), (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat(i12)) + drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(1)), Float.intBitsToFloat(i15) + f12 + (Float.intBitsToFloat(i14) * 0.3f), (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - intBitsToFloat) + (Float.intBitsToFloat(i14) * 0.3f * intBitsToFloat2));
            Path.lineTo(Float.intBitsToFloat(i15) + f12, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - intBitsToFloat);
            Path.relativeLineTo(-Float.intBitsToFloat(i15), 0.0f);
            Path.arcTo(new Rect(0.0f, (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - f14) - intBitsToFloat, f14, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - intBitsToFloat), 90.0f, 90.0f, false);
            Path.close();
        } else if (i11 == 2) {
            Path = AndroidPath_androidKt.Path();
            int i16 = (int) (j13 & 4294967295L);
            int i17 = (int) (j14 & 4294967295L);
            float intBitsToFloat3 = Float.intBitsToFloat(i16) + Float.intBitsToFloat(i17);
            Path.moveTo(0.0f, f12);
            float f15 = 2;
            float f16 = f12 * f15;
            Path.arcTo(new Rect(0.0f, 0.0f, f16, f16), 180.0f, 90.0f, false);
            Path.lineTo(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f12, 0.0f);
            Path.arcTo(new Rect(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f16, 0.0f, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)), f16), -90.0f, 90.0f, false);
            Path.lineTo(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)), (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - f12) - intBitsToFloat3);
            Path.arcTo(new Rect(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f16, (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - f16) - intBitsToFloat3, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - intBitsToFloat3), 0.0f, 90.0f, false);
            int i18 = (int) (j13 >> 32);
            Path.lineTo((Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f12) - Float.intBitsToFloat(i18), Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - intBitsToFloat3);
            float intBitsToFloat4 = Float.intBitsToFloat(i17);
            int i19 = (int) (j14 >> 32);
            float intBitsToFloat5 = (intBitsToFloat4 / Float.intBitsToFloat(i19)) * f15;
            Path.relativeLineTo((-Float.intBitsToFloat(i19)) * 0.3f, Float.intBitsToFloat(i19) * 0.3f * intBitsToFloat5);
            float intBitsToFloat6 = ((Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f12) - Float.intBitsToFloat(i18)) - (Float.intBitsToFloat(i19) / f15);
            float intBitsToFloat7 = Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - Float.intBitsToFloat(i16);
            float f17 = 1;
            Path.quadraticBezierTo(intBitsToFloat6, intBitsToFloat7 + drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f17)), ((Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f12) - Float.intBitsToFloat(i18)) - (Float.intBitsToFloat(i19) * (f17 - 0.3f)), (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - intBitsToFloat3) + (Float.intBitsToFloat(i19) * 0.3f * intBitsToFloat5));
            Path.lineTo(((Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f12) - Float.intBitsToFloat(i18)) - Float.intBitsToFloat(i19), Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - intBitsToFloat3);
            Path.lineTo(f12, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - intBitsToFloat3);
            Path.arcTo(new Rect(0.0f, (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - f16) - intBitsToFloat3, f16, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - intBitsToFloat3), 90.0f, 90.0f, false);
            Path.close();
        } else {
            if (i11 != 3) {
                if (i11 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new NotImplementedError(null, 1, null);
            }
            Path = AndroidPath_androidKt.Path();
            int i21 = (int) (j13 & 4294967295L);
            int i22 = (int) (j14 & 4294967295L);
            float intBitsToFloat8 = Float.intBitsToFloat(i21) + Float.intBitsToFloat(i22);
            Path.moveTo(0.0f, intBitsToFloat8 + f12);
            float f18 = 2;
            float f19 = f12 * f18;
            float f21 = f19 + intBitsToFloat8;
            Path.arcTo(new Rect(0.0f, intBitsToFloat8, f19, f21), 180.0f, 90.0f, false);
            int i23 = (int) (j13 >> 32);
            Path.lineTo(Float.intBitsToFloat(i23) + f12, intBitsToFloat8);
            int i24 = (int) (j14 >> 32);
            float intBitsToFloat9 = (Float.intBitsToFloat(i22) / Float.intBitsToFloat(i24)) * f18;
            Path.relativeLineTo(Float.intBitsToFloat(i24) * 0.3f, (-Float.intBitsToFloat(i24)) * 0.3f * intBitsToFloat9);
            float f22 = 1;
            Path.quadraticBezierTo(Float.intBitsToFloat(i23) + f12 + (Float.intBitsToFloat(i24) / f18), Float.intBitsToFloat(i21) - drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f22)), Float.intBitsToFloat(i23) + f12 + (Float.intBitsToFloat(i24) * (f22 - 0.3f)), intBitsToFloat8 - ((Float.intBitsToFloat(i24) * 0.3f) * intBitsToFloat9));
            Path.lineTo(Float.intBitsToFloat(i23) + f12 + Float.intBitsToFloat(i24), intBitsToFloat8);
            Path.lineTo(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f12, intBitsToFloat8);
            Path.arcTo(new Rect(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f19, intBitsToFloat8, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)), f21), -90.0f, 90.0f, false);
            Path.lineTo(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - f12);
            Path.arcTo(new Rect(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f19, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - f19, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L))), 0.0f, 90.0f, false);
            Path.lineTo(f12, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)));
            Path.arcTo(new Rect(0.0f, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - f19, f19, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L))), 90.0f, 90.0f, false);
            Path.close();
        }
        Path path = Path;
        DrawScope.m3050drawPathLG529CI$default(drawBehind, path, j11, 0.0f, null, null, 0, 60, null);
        if (!Color.m2510equalsimpl0(j12, Color.Companion.m2545getUnspecified0d7_KjU())) {
            DrawScope.m3050drawPathLG529CI$default(drawBehind, path, j12, 0.0f, new Stroke(f11, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        }
        return yz.g2.f100423a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void L(Modifier modifier, final List<com.baicizhan.main.home.experiment.b> list, final x3 x3Var, final x00.q<? super ColumnScope, ? super Composer, ? super Integer, yz.g2> qVar, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-1445117041);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= (i11 & 512) == 0 ? startRestartGroup.changed(x3Var) : startRestartGroup.changedInstance(x3Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(qVar) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            Modifier modifier5 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1445117041, i13, -1, "com.baicizhan.main.home.experiment.BehaviorContentContainer (WordCard.kt:459)");
            }
            final Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier5);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            com.baicizhan.main.home.experiment.b bVar = (com.baicizhan.main.home.experiment.b) a00.r0.b3(list, 0);
            Object m11 = bVar != null ? bVar.m() : null;
            com.baicizhan.main.home.experiment.b bVar2 = (com.baicizhan.main.home.experiment.b) a00.r0.b3(list, 1);
            boolean changed = startRestartGroup.changed(m11) | startRestartGroup.changed(bVar2 != null ? bVar2.m() : null);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                Iterator<com.baicizhan.main.home.experiment.b> it = list.iterator();
                int i15 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i15 = -1;
                        break;
                    } else if (!u30.k0.O3(it.next().m())) {
                        break;
                    } else {
                        i15++;
                    }
                }
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(yz.h1.a(Integer.valueOf(i15), 0), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion4.getSetModifier());
            qVar.invoke(ColumnScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i13 >> 6) & 112) | 6));
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion2, 0.0f, Dp.m5115constructorimpl(24), 0.0f, 0.0f, 13, null);
            boolean changed2 = startRestartGroup.changed(mutableState);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.home.experiment.a5
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 O;
                        O = WordCardKt.O(MutableState.this, (IntSize) obj);
                        return O;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(m730paddingqDBjuR0$default, (x00.l) rememberedValue2);
            boolean changed3 = startRestartGroup.changed(mutableState) | ((i13 & 896) == 256 || ((i13 & 512) != 0 && startRestartGroup.changedInstance(x3Var))) | startRestartGroup.changedInstance(context);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.home.experiment.b5
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 P;
                        P = WordCardKt.P(x3.this, context, mutableState, (b) obj);
                        return P;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            b0(list, onSizeChanged, (x00.l) rememberedValue3, startRestartGroup, (i13 >> 3) & 14, 0);
            startRestartGroup.endNode();
            if (W(M(mutableState))) {
                startRestartGroup.startReplaceGroup(1103092363);
                float mo374toDpu2uoSUM = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo374toDpu2uoSUM(M(mutableState).getSecond().intValue());
                final com.baicizhan.main.home.experiment.b bVar3 = list.get(M(mutableState).getFirst().intValue());
                modifier4 = modifier5;
                String m12 = bVar3.m();
                PointerPosition pointerPosition = M(mutableState).getFirst().intValue() == 0 ? PointerPosition.BOTTOM_LEFT : PointerPosition.BOTTOM_RIGHT;
                Modifier m730paddingqDBjuR0$default2 = PaddingKt.m730paddingqDBjuR0$default(boxScopeInstance.align(companion2, M(mutableState).getFirst().intValue() == 0 ? companion3.getBottomStart() : companion3.getBottomEnd()), 0.0f, 0.0f, 0.0f, mo374toDpu2uoSUM, 7, null);
                boolean changed4 = startRestartGroup.changed(mutableState) | startRestartGroup.changedInstance(bVar3);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.home.experiment.c5
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 V;
                            V = WordCardKt.V(b.this, mutableState);
                            return V;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                h0(m12, pointerPosition, m730paddingqDBjuR0$default2, (x00.a) rememberedValue4, startRestartGroup, 0, 0);
            } else {
                modifier4 = modifier5;
                startRestartGroup.startReplaceGroup(1079640429);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.d5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Y;
                    Y = WordCardKt.Y(Modifier.this, list, x3Var, qVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return Y;
                }
            });
        }
    }

    public static final List L0() {
        return a00.h0.Q(new w5.c(new com.baicizhan.main.home.experiment.c(1, "四级核心词汇", "", 1000), new com.baicizhan.main.home.experiment.d(700, 780), a00.h0.Q(new com.baicizhan.main.home.experiment.b(com.baicizhan.main.home.experiment.repo.q.f21581c, new u3.a(new x00.a() { // from class: com.baicizhan.main.home.experiment.h4
            @Override // x00.a
            public final Object invoke() {
                yz.g2 M0;
                M0 = WordCardKt.M0();
                return M0;
            }
        }), "", "学习一下吧", null, 16, null), new com.baicizhan.main.home.experiment.b(com.baicizhan.main.home.experiment.repo.q.f21582d, new u3.a(new x00.a() { // from class: com.baicizhan.main.home.experiment.i4
            @Override // x00.a
            public final Object invoke() {
                yz.g2 N0;
                N0 = WordCardKt.N0();
                return N0;
            }
        }), "", null, null, 24, null)), null, 8, null), new w5.c(new com.baicizhan.main.home.experiment.c(1, "四级核心词汇四级核心词汇四级核心词汇", "", 1000), new com.baicizhan.main.home.experiment.d(1001, 1001), a00.h0.Q(new com.baicizhan.main.home.experiment.b(com.baicizhan.main.home.experiment.repo.q.f21581c, new u3.a(new x00.a() { // from class: com.baicizhan.main.home.experiment.j4
            @Override // x00.a
            public final Object invoke() {
                yz.g2 O0;
                O0 = WordCardKt.O0();
                return O0;
            }
        }), "已学 3 词", null, null, 24, null), new com.baicizhan.main.home.experiment.b(com.baicizhan.main.home.experiment.repo.q.f21582d, new u3.a(new x00.a() { // from class: com.baicizhan.main.home.experiment.k4
            @Override // x00.a
            public final Object invoke() {
                yz.g2 P0;
                P0 = WordCardKt.P0();
                return P0;
            }
        }), "已复习 100 词", "复习不复习重要，因为复习了也不能学好，难道不是吗？确实不是，这句话是瞎说的，纯粹占个长度", null, 16, null)), null, 8, null), new w5.c(new com.baicizhan.main.home.experiment.c(1, "四级核心词汇", "", 1000), new com.baicizhan.main.home.experiment.d(0, 1000), a00.g0.l(new com.baicizhan.main.home.experiment.b(com.baicizhan.main.home.experiment.repo.q.f21582d, new u3.a(new x00.a() { // from class: com.baicizhan.main.home.experiment.l4
            @Override // x00.a
            public final Object invoke() {
                yz.g2 Q0;
                Q0 = WordCardKt.Q0();
                return Q0;
            }
        }), null, null, null, 28, null)), a00.g0.l(new n5.a(new x00.a() { // from class: com.baicizhan.main.home.experiment.m4
            @Override // x00.a
            public final Object invoke() {
                yz.g2 R0;
                R0 = WordCardKt.R0();
                return R0;
            }
        }))), new w5.a(new com.baicizhan.main.home.experiment.c(1, "四级核心词汇", "", 1000), e.a.f21147a, a00.g0.l(new com.baicizhan.main.home.experiment.b(com.baicizhan.main.home.experiment.repo.q.f21582d, new u3.a(new x00.a() { // from class: com.baicizhan.main.home.experiment.o4
            @Override // x00.a
            public final Object invoke() {
                yz.g2 S0;
                S0 = WordCardKt.S0();
                return S0;
            }
        }), "", "复习一下吧", null, 16, null))), new w5.a(new com.baicizhan.main.home.experiment.c(1, "四级核心词汇四级核心词汇四级核心词汇", "", 1000), e.b.f21149a, a00.g0.l(new com.baicizhan.main.home.experiment.b("学习其他计划", new u3.b("bcz://com.baicizhan.plan/edit", null, 2, null), "", "切计划喽", null, 16, null))), new w5.b(new Error("出错了"), null, 2, null), w5.d.f21740b);
    }

    public static final Pair<Integer, Integer> M(MutableState<Pair<Integer, Integer>> mutableState) {
        return mutableState.getValue();
    }

    public static final yz.g2 M0() {
        return yz.g2.f100423a;
    }

    public static final void N(MutableState<Pair<Integer, Integer>> mutableState, Pair<Integer, Integer> pair) {
        mutableState.setValue(pair);
    }

    public static final yz.g2 N0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 O(MutableState mutableState, IntSize intSize) {
        if (((int) (intSize.m5290unboximpl() & 4294967295L)) > 0) {
            N(mutableState, Pair.copy$default(M(mutableState), null, Integer.valueOf((int) (intSize.m5290unboximpl() & 4294967295L)), 1, null));
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 O0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 P(final x3 x3Var, Context context, final MutableState mutableState, final com.baicizhan.main.home.experiment.b it) {
        kotlin.jvm.internal.g0.p(it, "it");
        u3 j11 = it.j();
        if (j11 instanceof u3.b) {
            X(mutableState);
            x3Var.a(((u3.b) it.j()).g());
            ((u3.b) it.j()).h().invoke();
            x00.a<yz.g2> l11 = it.l();
            if (u30.k0.O3(it.m())) {
                l11 = null;
            }
            if (l11 != null) {
                l11.invoke();
            }
        } else if (j11 instanceof u3.a) {
            if (!(context instanceof AppCompatActivity)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            mc.a.j((FragmentActivity) context, null, null, new x00.l() { // from class: com.baicizhan.main.home.experiment.v4
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 Q;
                    Q = WordCardKt.Q(b.this, (u.a) obj);
                    return Q;
                }
            }, 3, null);
        } else {
            if (!(j11 instanceof u3.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!(context instanceof AppCompatActivity)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            mc.a.j((FragmentActivity) context, null, null, new x00.l() { // from class: com.baicizhan.main.home.experiment.w4
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 R;
                    R = WordCardKt.R(b.this, x3Var, mutableState, (u.a) obj);
                    return R;
                }
            }, 3, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 P0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 Q(com.baicizhan.main.home.experiment.b bVar, u.a prompt) {
        kotlin.jvm.internal.g0.p(prompt, "$this$prompt");
        prompt.M("少侠，今日没有需要复习的单词\n建议你明日再来哦~");
        prompt.b0(ButtonType.SINGLE_POSITIVE);
        d.a.J(prompt, "我知道了", null, null, 6, null);
        ((u3.a) bVar.j()).d().invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 Q0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 R(final com.baicizhan.main.home.experiment.b bVar, final x3 x3Var, final MutableState mutableState, u.a prompt) {
        kotlin.jvm.internal.g0.p(prompt, "$this$prompt");
        prompt.M("温故知新，建议新学前先复习喔");
        prompt.V("及时复习，单词被长久记住的可能性\n会提升 3 倍");
        prompt.O(true, "以后不再提醒我", new x00.p() { // from class: com.baicizhan.main.home.experiment.l5
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 S;
                S = WordCardKt.S(b.this, mutableState, ((Boolean) obj).booleanValue(), ((Integer) obj2).intValue());
                return S;
            }
        });
        prompt.R(true);
        prompt.q("仍然学习", new x00.l() { // from class: com.baicizhan.main.home.experiment.m5
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 T;
                T = WordCardKt.T(x3.this, bVar, mutableState, (View) obj);
                return T;
            }
        });
        d.a.J(prompt, "开始复习", null, new x00.l() { // from class: com.baicizhan.main.home.experiment.d4
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 U;
                U = WordCardKt.U(x3.this, bVar, mutableState, (View) obj);
                return U;
            }
        }, 2, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 R0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 S(com.baicizhan.main.home.experiment.b bVar, MutableState mutableState, boolean z11, int i11) {
        String j11;
        X(mutableState);
        x00.p<Boolean, String, yz.g2> h11 = ((u3.c) bVar.j()).h();
        Boolean valueOf = Boolean.valueOf(z11);
        if (i11 == 0) {
            j11 = ((u3.c) bVar.j()).j();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("Unexpected index");
            }
            j11 = ((u3.c) bVar.j()).i();
        }
        h11.invoke(valueOf, j11);
        return yz.g2.f100423a;
    }

    public static final yz.g2 S0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 T(x3 x3Var, com.baicizhan.main.home.experiment.b bVar, MutableState mutableState, View view) {
        kotlin.jvm.internal.g0.p(view, "<unused var>");
        X(mutableState);
        x3Var.a(((u3.c) bVar.j()).j());
        x00.a<yz.g2> l11 = bVar.l();
        if (u30.k0.O3(bVar.m())) {
            l11 = null;
        }
        if (l11 != null) {
            l11.invoke();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 U(x3 x3Var, com.baicizhan.main.home.experiment.b bVar, MutableState mutableState, View view) {
        kotlin.jvm.internal.g0.p(view, "<unused var>");
        X(mutableState);
        x3Var.a(((u3.c) bVar.j()).i());
        x00.a<yz.g2> l11 = bVar.l();
        if (u30.k0.O3(bVar.m())) {
            l11 = null;
        }
        if (l11 != null) {
            l11.invoke();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 V(com.baicizhan.main.home.experiment.b bVar, MutableState mutableState) {
        X(mutableState);
        bVar.l().invoke();
        return yz.g2.f100423a;
    }

    public static final boolean W(Pair<Integer, Integer> pair) {
        return pair.getFirst().intValue() >= 0 && pair.getSecond().intValue() > 0;
    }

    public static final void X(MutableState<Pair<Integer, Integer>> mutableState) {
        if (W(M(mutableState))) {
            N(mutableState, yz.h1.a(-1, 0));
        }
    }

    public static final yz.g2 Y(Modifier modifier, List list, x3 x3Var, x00.q qVar, int i11, int i12, Composer composer, int i13) {
        L(modifier, list, x3Var, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 16777215, showBackground = true)
    public static final void Z(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1502211294);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1502211294, i11, -1, "com.baicizhan.main.home.experiment.BehaviorsPreview (WordCard.kt:760)");
            }
            bk.k.e(null, null, null, p0.f21332a.l(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.u4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 a02;
                    a02 = WordCardKt.a0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return a02;
                }
            });
        }
    }

    public static final yz.g2 a0(int i11, Composer composer, int i12) {
        Z(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0055  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b0(final java.util.List<com.baicizhan.main.home.experiment.b> r23, androidx.compose.ui.Modifier r24, final x00.l<? super com.baicizhan.main.home.experiment.b, yz.g2> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.WordCardKt.b0(java.util.List, androidx.compose.ui.Modifier, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 c0(x00.l lVar, com.baicizhan.main.home.experiment.b bVar) {
        lVar.invoke(bVar);
        if (kotlin.jvm.internal.g0.g(bVar.n(), com.baicizhan.main.home.experiment.repo.q.f21581c)) {
            ma.l.e(ma.t.f73003b, ma.a.E, a00.l1.W(yz.h1.a("plan_type", "FirstTimeLearning"), yz.h1.a(ma.b.Q1, 200)));
        }
        if (kotlin.jvm.internal.g0.g(bVar.n(), com.baicizhan.main.home.experiment.repo.q.f21582d)) {
            ma.l.e(ma.t.f73003b, ma.a.E, a00.l1.W(yz.h1.a("plan_type", "ReviewLearning"), yz.h1.a(ma.b.Q1, 200)));
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 d0(com.baicizhan.main.home.experiment.b bVar, RowScope Button, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(Button, "$this$Button");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(754793946, i11, -1, "com.baicizhan.main.home.experiment.ButtonBehavior.<anonymous>.<anonymous>.<anonymous> (WordCard.kt:575)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(4));
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m607spacedBy0680j_4, centerHorizontally, composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(bVar.n(), (Modifier) null, 0L, TextUnitKt.getSp(17), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 199680, 0, 131030);
            Composer composer2 = composer;
            if (u30.k0.O3(bVar.k())) {
                composer2.startReplaceGroup(-2144797070);
            } else {
                composer2.startReplaceGroup(-2119115399);
                TextKt.m1845Text4IGK_g(bVar.k(), (Modifier) null, Color.m2508copywmQWz5c$default(((Color) composer2.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3072, 0, 131058);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 e0(List list, Modifier modifier, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        b0(list, modifier, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f0(Modifier modifier, final String str, final long j11, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-1447191077);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(j11) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1447191077, i13, -1, "com.baicizhan.main.home.experiment.DotDescription (WordCard.kt:446)");
            }
            float f11 = 6;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11)), Alignment.Companion.getCenterVertically(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            BoxKt.Box(BackgroundKt.m234backgroundbw27NRU(SizeKt.m773size3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(f11)), j11, RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(str, (Modifier) null, ColorKt.Color(4289243836L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, ((i13 >> 3) & 14) | 3456, 0, 131058);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.p4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 g02;
                    g02 = WordCardKt.g0(Modifier.this, str, j11, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return g02;
                }
            });
        }
    }

    public static final yz.g2 g0(Modifier modifier, String str, long j11, int i11, int i12, Composer composer, int i13) {
        f0(modifier, str, j11, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h0(final java.lang.String r30, com.baicizhan.main.home.experiment.PointerPosition r31, androidx.compose.ui.Modifier r32, final x00.a<yz.g2> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.WordCardKt.h0(java.lang.String, com.baicizhan.main.home.experiment.PointerPosition, androidx.compose.ui.Modifier, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 i0(PointerPosition pointerPosition, float f11, float f12, String str, x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(316915618, i11, -1, "com.baicizhan.main.home.experiment.Tip.<anonymous>.<anonymous> (WordCard.kt:791)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float m5115constructorimpl = Dp.m5115constructorimpl(12);
            PointerPosition pointerPosition2 = PointerPosition.TOP_RIGHT;
            Modifier m729paddingqDBjuR0 = PaddingKt.m729paddingqDBjuR0(companion, m5115constructorimpl, pointerPosition.compareTo(pointerPosition2) > 0 ? f11 : Dp.m5115constructorimpl(f11 + f12), Dp.m5115constructorimpl(4), pointerPosition.compareTo(pointerPosition2) > 0 ? Dp.m5115constructorimpl(f11 + f12) : f11);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m729paddingqDBjuR0);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(str, SizeKt.m772requiredWidthInVpY3zN4$default(companion, 0.0f, Dp.m5115constructorimpl(288), 1, null), ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 2, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3120, 3120, 120816);
            Modifier k11 = ComposeUtilsKt.k(SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(32)), 0L, false, aVar, 3, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, k11);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconKt.m1692Iconww6aTOc(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_tip_close, composer, 54), "tip-close", (Modifier) null, 0L, composer, 48, 12);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 j0(String str, PointerPosition pointerPosition, Modifier modifier, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        h0(str, pointerPosition, modifier, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 16777215, showBackground = true)
    public static final void k0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1759535972);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1759535972, i11, -1, "com.baicizhan.main.home.experiment.TipPreview (WordCard.kt:817)");
            }
            bk.k.e(null, null, null, p0.f21332a.k(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.e4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 l02;
                    l02 = WordCardKt.l0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return l02;
                }
            });
        }
    }

    public static final yz.g2 l0(int i11, Composer composer, int i12) {
        k0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007f  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(message = "Former experimental version")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m0(@m80.k final com.baicizhan.main.home.experiment.w5 r29, @m80.k final com.baicizhan.main.home.experiment.x3 r30, @m80.l androidx.compose.ui.Modifier r31, @m80.k final x00.a<yz.g2> r32, @m80.l androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.WordCardKt.m0(com.baicizhan.main.home.experiment.w5, com.baicizhan.main.home.experiment.x3, androidx.compose.ui.Modifier, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Boolean n0(MutableState<Boolean> mutableState) {
        return mutableState.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 o0(final w5 w5Var, final x3 x3Var, final x00.a aVar, Composer composer, int i11) {
        final MutableState mutableState;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626457753, i11, -1, "com.baicizhan.main.home.experiment.WordCard.<anonymous> (WordCard.kt:217)");
            }
            if (kotlin.jvm.internal.g0.g(w5Var, w5.e.f21742b)) {
                composer.startReplaceGroup(1170093556);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                x00.a<ComposeUiNode> constructor = companion.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
                Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                TextKt.m1845Text4IGK_g("施工中……", (Modifier) null, Color.m2508copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), TextUnitKt.getSp(24), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3078, 0, 131058);
                composer.endNode();
                composer.endReplaceGroup();
            } else if (w5Var instanceof w5.b) {
                composer.startReplaceGroup(1170391745);
                Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(16));
                composer.startReplaceGroup(-1003410150);
                composer.startReplaceGroup(212064437);
                composer.endReplaceGroup();
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                if (rememberedValue == companion2.getEmpty()) {
                    rememberedValue = new Measurer2(density);
                    composer.updateRememberedValue(rememberedValue);
                }
                final Measurer2 measurer2 = (Measurer2) rememberedValue;
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == companion2.getEmpty()) {
                    rememberedValue2 = new ConstraintLayoutScope();
                    composer.updateRememberedValue(rememberedValue2);
                }
                final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
                Object rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == companion2.getEmpty()) {
                    rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer.updateRememberedValue(rememberedValue3);
                }
                final MutableState mutableState2 = (MutableState) rememberedValue3;
                Object rememberedValue4 = composer.rememberedValue();
                if (rememberedValue4 == companion2.getEmpty()) {
                    rememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                    composer.updateRememberedValue(rememberedValue4);
                }
                final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) rememberedValue4;
                Object rememberedValue5 = composer.rememberedValue();
                if (rememberedValue5 == companion2.getEmpty()) {
                    rememberedValue5 = SnapshotStateKt.mutableStateOf(yz.g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                    composer.updateRememberedValue(rememberedValue5);
                }
                final MutableState mutableState3 = (MutableState) rememberedValue5;
                final int i12 = 257;
                boolean changedInstance = composer.changedInstance(measurer2) | composer.changed(257);
                Object rememberedValue6 = composer.rememberedValue();
                if (changedInstance || rememberedValue6 == companion2.getEmpty()) {
                    Object obj = new MeasurePolicy() { // from class: com.baicizhan.main.home.experiment.WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$2
                        @Override // androidx.compose.ui.layout.MeasurePolicy
                        /* renamed from: measure-3p2s80s */
                        public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            MutableState.this.getValue();
                            long m5516performMeasureDjhGOtQ = measurer2.m5516performMeasureDjhGOtQ(j11, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i12);
                            mutableState2.getValue();
                            int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
                            int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
                            final Measurer2 measurer22 = measurer2;
                            return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: com.baicizhan.main.home.experiment.WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // x00.l
                                public /* bridge */ /* synthetic */ yz.g2 invoke(Placeable.PlacementScope placementScope) {
                                    invoke2(placementScope);
                                    return yz.g2.f100423a;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Placeable.PlacementScope placementScope) {
                                    Measurer2.this.performLayout(placementScope, list, linkedHashMap);
                                }
                            }, 4, null);
                        }
                    };
                    mutableState = mutableState2;
                    composer.updateRememberedValue(obj);
                    rememberedValue6 = obj;
                } else {
                    mutableState = mutableState2;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue6;
                Object rememberedValue7 = composer.rememberedValue();
                if (rememberedValue7 == companion2.getEmpty()) {
                    rememberedValue7 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.experiment.WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // x00.a
                        public /* bridge */ /* synthetic */ yz.g2 invoke() {
                            invoke2();
                            return yz.g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            MutableState.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            constraintSetForInlineDsl.setKnownDirty(true);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue7);
                }
                final x00.a aVar2 = (x00.a) rememberedValue7;
                boolean changedInstance2 = composer.changedInstance(measurer2);
                Object rememberedValue8 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue8 == companion2.getEmpty()) {
                    rememberedValue8 = new x00.l<SemanticsPropertyReceiver, yz.g2>() { // from class: com.baicizhan.main.home.experiment.WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public /* bridge */ /* synthetic */ yz.g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return yz.g2.f100423a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, Measurer2.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue8);
                }
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(m726padding3ABfNKs, false, (x00.l) rememberedValue8, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.home.experiment.WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return yz.g2.f100423a;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(Composer composer2, int i13) {
                        Modifier.Companion companion3;
                        int i14;
                        ConstraintLayoutScope constraintLayoutScope2;
                        ConstrainedLayoutReference constrainedLayoutReference;
                        ConstrainedLayoutReference constrainedLayoutReference2;
                        char c11;
                        Composer composer3 = composer2;
                        if ((i13 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i13, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        MutableState.this.setValue(yz.g2.f100423a);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                        composer3.startReplaceGroup(-770135172);
                        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope3.createRefs();
                        ConstrainedLayoutReference component1 = createRefs.component1();
                        ConstrainedLayoutReference component2 = createRefs.component2();
                        ConstrainedLayoutReference component3 = createRefs.component3();
                        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_common_page_oops_small, composer3, 6);
                        Modifier.Companion companion4 = Modifier.Companion;
                        Object rememberedValue9 = composer3.rememberedValue();
                        Composer.Companion companion5 = Composer.Companion;
                        if (rememberedValue9 == companion5.getEmpty()) {
                            rememberedValue9 = WordCardKt.b.f21044a;
                            composer3.updateRememberedValue(rememberedValue9);
                        }
                        ImageKt.Image(painterResource, "image", constraintLayoutScope3.constrainAs(companion4, component1, (x00.l) rememberedValue9), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                        composer3.startReplaceGroup(1222094838);
                        Throwable f11 = ((w5.b) w5Var).f();
                        String message = f11 != null ? f11.getMessage() : null;
                        if (message == null || message.length() == 0) {
                            companion3 = companion4;
                            i14 = helpersHashCode;
                            constraintLayoutScope2 = constraintLayoutScope3;
                            constrainedLayoutReference = component1;
                            constrainedLayoutReference2 = component2;
                            c11 = 2;
                        } else {
                            long Color = ColorKt.Color(4289243836L);
                            long sp2 = TextUnitKt.getSp(16);
                            boolean changed = composer3.changed(component1);
                            Object rememberedValue10 = composer3.rememberedValue();
                            if (changed || rememberedValue10 == companion5.getEmpty()) {
                                rememberedValue10 = new WordCardKt.c(component1);
                                composer3.updateRememberedValue(rememberedValue10);
                            }
                            constraintLayoutScope2 = constraintLayoutScope3;
                            constrainedLayoutReference = component1;
                            constrainedLayoutReference2 = component2;
                            companion3 = companion4;
                            i14 = helpersHashCode;
                            c11 = 2;
                            TextKt.m1845Text4IGK_g(message, PaddingKt.m730paddingqDBjuR0$default(constraintLayoutScope3.constrainAs(companion4, component2, (x00.l) rememberedValue10), 0.0f, Dp.m5115constructorimpl(12), 0.0f, Dp.m5115constructorimpl(16), 5, null), Color, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3456, 0, 131056);
                            composer3 = composer2;
                        }
                        composer3.endReplaceGroup();
                        RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100));
                        BorderStroke m262BorderStrokecXLIe8U = BorderStrokeKt.m262BorderStrokecXLIe8U(Dp.m5115constructorimpl(1), ColorKt.Color(4285822599L));
                        PaddingValues m720PaddingValuesYgX7TsA = PaddingKt.m720PaddingValuesYgX7TsA(Dp.m5115constructorimpl(36), Dp.m5115constructorimpl(0));
                        Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(48));
                        ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReference;
                        boolean changed2 = composer3.changed(constrainedLayoutReference3);
                        Object rememberedValue11 = composer3.rememberedValue();
                        if (changed2 || rememberedValue11 == companion5.getEmpty()) {
                            rememberedValue11 = new WordCardKt.d(constrainedLayoutReference3);
                            composer3.updateRememberedValue(rememberedValue11);
                        }
                        ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                        ButtonKt.OutlinedButton(aVar, constraintLayoutScope4.constrainAs(m759height3ABfNKs, component3, (x00.l) rememberedValue11), false, null, null, m1019RoundedCornerShape0680j_4, m262BorderStrokecXLIe8U, null, m720PaddingValuesYgX7TsA, p0.f21332a.j(), composer2, 907542528, 156);
                        LayoutReference[] layoutReferenceArr = new LayoutReference[3];
                        layoutReferenceArr[0] = constrainedLayoutReference3;
                        layoutReferenceArr[1] = constrainedLayoutReference2;
                        layoutReferenceArr[c11] = component3;
                        constraintLayoutScope4.createVerticalChain(layoutReferenceArr, ChainStyle.Companion.getPacked());
                        composer2.endReplaceGroup();
                        if (constraintLayoutScope.getHelpersHashCode() != i14) {
                            EffectsKt.SideEffect(aVar2, composer2, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), measurePolicy, composer, 48, 0);
                composer.endReplaceGroup();
                composer.endReplaceGroup();
            } else if (w5Var instanceof w5.c) {
                composer.startReplaceGroup(1172245204);
                L(PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(16)), ((w5.c) w5Var).h(), x3Var, ComposableLambdaKt.rememberComposableLambda(-1977668685, true, new x00.q() { // from class: com.baicizhan.main.home.experiment.r4
                    @Override // x00.q
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        yz.g2 p02;
                        p02 = WordCardKt.p0(w5.this, x3Var, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                        return p02;
                    }
                }, composer, 54), composer, 3078, 0);
                composer.endReplaceGroup();
            } else if (w5Var instanceof w5.a) {
                composer.startReplaceGroup(1178652284);
                L(PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(16)), ((w5.a) w5Var).g(), x3Var, ComposableLambdaKt.rememberComposableLambda(1633068306, true, new x00.q() { // from class: com.baicizhan.main.home.experiment.s4
                    @Override // x00.q
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        yz.g2 q02;
                        q02 = WordCardKt.q0(w5.this, x3Var, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                        return q02;
                    }
                }, composer, 54), composer, 3078, 0);
                composer.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.g0.g(w5Var, w5.d.f21740b)) {
                    composer.startReplaceGroup(730491506);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1181757957);
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
                x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer);
                Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ProgressIndicatorKt.m1724CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer, 0, 31);
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 p0(final w5 w5Var, final x3 x3Var, ColumnScope BehaviorContentContainer, Composer composer, int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(BehaviorContentContainer, "$this$BehaviorContentContainer");
        if ((i11 & 6) == 0) {
            i12 = i11 | (composer.changed(BehaviorContentContainer) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1977668685, i12, -1, "com.baicizhan.main.home.experiment.WordCard.<anonymous>.<anonymous> (WordCard.kt:259)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(BehaviorContentContainer, Modifier.Companion, 1.0f, false, 2, null), 0.0f, 1, null);
            composer.startReplaceGroup(-1003410150);
            composer.startReplaceGroup(212064437);
            composer.endReplaceGroup();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new Measurer2(density);
                composer.updateRememberedValue(rememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new ConstraintLayoutScope();
                composer.updateRememberedValue(rememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState = (MutableState) rememberedValue3;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composer.updateRememberedValue(rememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt.mutableStateOf(yz.g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue5;
            final int i13 = 257;
            boolean changedInstance = composer.changedInstance(measurer2) | composer.changed(257);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance || rememberedValue6 == companion.getEmpty()) {
                Object obj = new MeasurePolicy() { // from class: com.baicizhan.main.home.experiment.WordCardKt$WordCard$lambda$10$2$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        MutableState.this.getValue();
                        long m5516performMeasureDjhGOtQ = measurer2.m5516performMeasureDjhGOtQ(j11, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i13);
                        mutableState.getValue();
                        int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
                        int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: com.baicizhan.main.home.experiment.WordCardKt$WordCard$lambda$10$2$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ yz.g2 invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return yz.g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Measurer2.this.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                composer.updateRememberedValue(obj);
                rememberedValue6 = obj;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue6;
            Object rememberedValue7 = composer.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.experiment.WordCardKt$WordCard$lambda$10$2$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // x00.a
                    public /* bridge */ /* synthetic */ yz.g2 invoke() {
                        invoke2();
                        return yz.g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        MutableState.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composer.updateRememberedValue(rememberedValue7);
            }
            final x00.a aVar = (x00.a) rememberedValue7;
            boolean changedInstance2 = composer.changedInstance(measurer2);
            Object rememberedValue8 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new x00.l<SemanticsPropertyReceiver, yz.g2>() { // from class: com.baicizhan.main.home.experiment.WordCardKt$WordCard$lambda$10$2$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ yz.g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return yz.g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, Measurer2.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(fillMaxWidth$default, false, (x00.l) rememberedValue8, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.home.experiment.WordCardKt$WordCard$lambda$10$2$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return yz.g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer2, int i14) {
                    Object obj2;
                    Object obj3;
                    if ((i14 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i14, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    MutableState.this.setValue(yz.g2.f100423a);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer2.startReplaceGroup(185703496);
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                    ConstrainedLayoutReference component1 = createRefs.component1();
                    ConstrainedLayoutReference component2 = createRefs.component2();
                    ConstrainedLayoutReference component3 = createRefs.component3();
                    ConstrainedLayoutReference component4 = createRefs.component4();
                    ConstrainedLayoutReference component5 = createRefs.component5();
                    ConstrainedLayoutReference component6 = createRefs.component6();
                    ConstrainedLayoutReference component7 = createRefs.component7();
                    ConstrainedLayoutReference component8 = createRefs.component8();
                    ConstrainedLayoutReference component9 = createRefs.component9();
                    boolean changed = composer2.changed(((w5.c) w5Var).j());
                    Object rememberedValue9 = composer2.rememberedValue();
                    if (changed || rememberedValue9 == Composer.Companion.getEmpty()) {
                        Iterator<T> it = ((w5.c) w5Var).j().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            } else {
                                obj2 = it.next();
                                if (((n5) obj2) instanceof n5.a) {
                                    break;
                                }
                            }
                        }
                        rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(obj2 != null), null, 2, null);
                        composer2.updateRememberedValue(rememberedValue9);
                    }
                    MutableState mutableState3 = (MutableState) rememberedValue9;
                    long sp2 = TextUnitKt.getSp(12);
                    long Color = ColorKt.Color(4289243836L);
                    Modifier.Companion companion2 = Modifier.Companion;
                    Object rememberedValue10 = composer2.rememberedValue();
                    Composer.Companion companion3 = Composer.Companion;
                    if (rememberedValue10 == companion3.getEmpty()) {
                        rememberedValue10 = WordCardKt.e.f21047a;
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    TextKt.m1845Text4IGK_g("当前在学", constraintLayoutScope2.constrainAs(companion2, component1, (x00.l) rememberedValue10), Color, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3462, 0, 131056);
                    long sp3 = TextUnitKt.getSp(12);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i15 = MaterialTheme.$stable;
                    long m1600getPrimary0d7_KjU = materialTheme.getColors(composer2, i15).m1600getPrimary0d7_KjU();
                    boolean changedInstance3 = composer2.changedInstance(x3Var);
                    Object rememberedValue11 = composer2.rememberedValue();
                    if (changedInstance3 || rememberedValue11 == companion3.getEmpty()) {
                        rememberedValue11 = new WordCardKt.j(x3Var);
                        composer2.updateRememberedValue(rememberedValue11);
                    }
                    Modifier k11 = ComposeUtilsKt.k(companion2, 0L, false, (x00.a) rememberedValue11, 3, null);
                    float f11 = 10;
                    Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(k11, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, Dp.m5115constructorimpl(f11), 4, null);
                    boolean changed2 = composer2.changed(component1);
                    Object rememberedValue12 = composer2.rememberedValue();
                    if (changed2 || rememberedValue12 == companion3.getEmpty()) {
                        rememberedValue12 = new WordCardKt.k(component1);
                        composer2.updateRememberedValue(rememberedValue12);
                    }
                    TextKt.m1845Text4IGK_g("修改", ZIndexModifierKt.zIndex(constraintLayoutScope2.constrainAs(m730paddingqDBjuR0$default, component5, (x00.l) rememberedValue12), 1.0f), m1600getPrimary0d7_KjU, sp3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3078, 0, 131056);
                    String j11 = ((w5.c) w5Var).a().j();
                    long sp4 = TextUnitKt.getSp(20);
                    FontWeight medium = FontWeight.Companion.getMedium();
                    long m1599getOnSurface0d7_KjU = materialTheme.getColors(composer2, i15).m1599getOnSurface0d7_KjU();
                    boolean changedInstance4 = composer2.changedInstance(x3Var) | composer2.changed(mutableState3) | composer2.changed(w5Var);
                    Object rememberedValue13 = composer2.rememberedValue();
                    if (changedInstance4 || rememberedValue13 == companion3.getEmpty()) {
                        rememberedValue13 = new WordCardKt.l(x3Var, mutableState3, w5Var);
                        composer2.updateRememberedValue(rememberedValue13);
                    }
                    Modifier k12 = ComposeUtilsKt.k(companion2, 0L, false, (x00.a) rememberedValue13, 3, null);
                    boolean changed3 = composer2.changed(component1) | composer2.changed(component5);
                    Object rememberedValue14 = composer2.rememberedValue();
                    if (changed3 || rememberedValue14 == companion3.getEmpty()) {
                        rememberedValue14 = new WordCardKt.m(component1, component5);
                        composer2.updateRememberedValue(rememberedValue14);
                    }
                    TextKt.m1845Text4IGK_g(j11, constraintLayoutScope2.constrainAs(k12, component2, (x00.l) rememberedValue14), m1599getOnSurface0d7_KjU, sp4, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 199680, 3120, 120784);
                    ImageVector vectorResource = VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_word_card_arrow_right, composer2, 54);
                    boolean changedInstance5 = composer2.changedInstance(x3Var) | composer2.changed(mutableState3) | composer2.changed(w5Var);
                    Object rememberedValue15 = composer2.rememberedValue();
                    if (changedInstance5 || rememberedValue15 == companion3.getEmpty()) {
                        rememberedValue15 = new WordCardKt.n(x3Var, mutableState3, w5Var);
                        composer2.updateRememberedValue(rememberedValue15);
                    }
                    Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(ComposeUtilsKt.k(companion2, 0L, false, (x00.a) rememberedValue15, 3, null), Dp.m5115constructorimpl(16));
                    boolean changed4 = composer2.changed(component2);
                    Object rememberedValue16 = composer2.rememberedValue();
                    if (changed4 || rememberedValue16 == companion3.getEmpty()) {
                        rememberedValue16 = new WordCardKt.o(component2);
                        composer2.updateRememberedValue(rememberedValue16);
                    }
                    ImageKt.Image(vectorResource, "arrow", constraintLayoutScope2.constrainAs(m773size3ABfNKs, component3, (x00.l) rememberedValue16), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    String str = ((w5.c) w5Var).a().k() + WordPlanInfoView.f22926m;
                    long sp5 = TextUnitKt.getSp(12);
                    long Color2 = ColorKt.Color(4289243836L);
                    Object rememberedValue17 = composer2.rememberedValue();
                    if (rememberedValue17 == companion3.getEmpty()) {
                        rememberedValue17 = WordCardKt.p.f21066a;
                        composer2.updateRememberedValue(rememberedValue17);
                    }
                    TextKt.m1845Text4IGK_g(str, constraintLayoutScope2.constrainAs(companion2, component8, (x00.l) rememberedValue17), Color2, sp5, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3456, 0, 131056);
                    boolean changed5 = composer2.changed(component8) | composer2.changed(w5Var);
                    Object rememberedValue18 = composer2.rememberedValue();
                    if (changed5 || rememberedValue18 == companion3.getEmpty()) {
                        rememberedValue18 = new WordCardKt.q(component8, w5Var);
                        composer2.updateRememberedValue(rememberedValue18);
                    }
                    WordCardKt.f0(constraintLayoutScope2.constrainAs(companion2, component6, (x00.l) rememberedValue18), "已掌握 " + ((w5.c) w5Var).i().f(), materialTheme.getColors(composer2, i15).m1600getPrimary0d7_KjU(), composer2, 0, 0);
                    boolean changed6 = composer2.changed(component6) | composer2.changed(component8);
                    Object rememberedValue19 = composer2.rememberedValue();
                    if (changed6 || rememberedValue19 == companion3.getEmpty()) {
                        rememberedValue19 = new WordCardKt.f(component6, component8);
                        composer2.updateRememberedValue(rememberedValue19);
                    }
                    WordCardKt.f0(constraintLayoutScope2.constrainAs(companion2, component7, (x00.l) rememberedValue19), "已学 " + ((w5.c) w5Var).i().e(), ColorKt.Color(4292665855L), composer2, 384, 0);
                    float f12 = ((w5.c) w5Var).a().k() > 0 ? ((w5.c) w5Var).i().f() / ((w5.c) w5Var).a().k() : 0.0f;
                    float e11 = ((w5.c) w5Var).a().k() > 0 ? ((w5.c) w5Var).i().e() / ((w5.c) w5Var).a().k() : 0.0f;
                    long m1600getPrimary0d7_KjU2 = materialTheme.getColors(composer2, i15).m1600getPrimary0d7_KjU();
                    long Color3 = ColorKt.Color(4292665855L);
                    long Color4 = ColorKt.Color(4294177535L);
                    boolean changed7 = composer2.changed(component8) | composer2.changed(component6);
                    Object rememberedValue20 = composer2.rememberedValue();
                    if (changed7 || rememberedValue20 == companion3.getEmpty()) {
                        rememberedValue20 = new WordCardKt.g(component8, component6);
                        composer2.updateRememberedValue(rememberedValue20);
                    }
                    WidgetsKt.D(f12, e11, constraintLayoutScope2.constrainAs(companion2, component4, (x00.l) rememberedValue20), 0.0f, m1600getPrimary0d7_KjU2, Color3, Color4, composer2, 1769472, 8);
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        composer2.startReplaceGroup(-270928764);
                        Iterator<T> it2 = ((w5.c) w5Var).j().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            } else {
                                obj3 = it2.next();
                                if (((n5) obj3) instanceof n5.a) {
                                    break;
                                }
                            }
                        }
                        n5 n5Var = (n5) obj3;
                        if (n5Var == null) {
                            composer2.startReplaceGroup(191142909);
                        } else {
                            composer2.startReplaceGroup(191142910);
                            String b11 = n5Var.b();
                            PointerPosition pointerPosition = PointerPosition.TOP_LEFT;
                            Modifier.Companion companion4 = Modifier.Companion;
                            boolean changed8 = composer2.changed(component2);
                            Object rememberedValue21 = composer2.rememberedValue();
                            if (changed8 || rememberedValue21 == Composer.Companion.getEmpty()) {
                                rememberedValue21 = new WordCardKt.h(component2);
                                composer2.updateRememberedValue(rememberedValue21);
                            }
                            Modifier constrainAs = constraintLayoutScope2.constrainAs(companion4, component9, (x00.l) rememberedValue21);
                            boolean changed9 = composer2.changed(mutableState3) | composer2.changed(n5Var);
                            Object rememberedValue22 = composer2.rememberedValue();
                            if (changed9 || rememberedValue22 == Composer.Companion.getEmpty()) {
                                rememberedValue22 = new WordCardKt.i(mutableState3, n5Var);
                                composer2.updateRememberedValue(rememberedValue22);
                            }
                            WordCardKt.h0(b11, pointerPosition, constrainAs, (x00.a) rememberedValue22, composer2, 48, 0);
                            yz.g2 g2Var = yz.g2.f100423a;
                        }
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(175231416);
                    }
                    composer2.endReplaceGroup();
                    composer2.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(aVar, composer2, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), measurePolicy, composer, 48, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 q0(w5 w5Var, final x3 x3Var, ColumnScope BehaviorContentContainer, Composer composer, int i11) {
        int i12;
        String str;
        String str2;
        kotlin.jvm.internal.g0.p(BehaviorContentContainer, "$this$BehaviorContentContainer");
        if ((i11 & 6) == 0) {
            i12 = i11 | (composer.changed(BehaviorContentContainer) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1633068306, i12, -1, "com.baicizhan.main.home.experiment.WordCard.<anonymous>.<anonymous> (WordCard.kt:373)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(BehaviorContentContainer, companion, 1.0f, false, 2, null), 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            w5.a aVar = (w5.a) w5Var;
            if (aVar.h() instanceof e.b) {
                str = "已掌握";
                str2 = "可以更换词书继续学习喔～";
            } else {
                str = "已学完";
                str2 = "加油把所有词都复习完吧~";
            }
            Pair a11 = yz.h1.a(str, str2);
            Object component1 = a11.component1();
            kotlin.jvm.internal.g0.o(component1, "component1(...)");
            String str3 = (String) component1;
            Object component2 = a11.component2();
            kotlin.jvm.internal.g0.o(component2, "component2(...)");
            String str4 = (String) component2;
            Modifier align = boxScopeInstance.align(companion, companion2.getCenterEnd());
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, align);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_word_card_cover_background, composer, 6), "bg", boxScopeInstance.align(companion, companion2.getCenter()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            coil.compose.l.b(aVar.a().h(), "cover", RotateKt.rotate(AspectRatioKt.aspectRatio$default(SizeKt.m778width3ABfNKs(boxScopeInstance.align(companion, companion2.getCenter()), Dp.m5115constructorimpl(60)), 0.75f, false, 2, null), -15.0f), PainterResources_androidKt.painterResource(R.drawable.ic_book_cover_default, composer, 6), PainterResources_androidKt.painterResource(R.drawable.ic_book_cover_default, composer, 6), null, null, null, null, null, null, 0.0f, null, 0, false, null, composer, 48, 0, 65504);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_word_card_done_clapping, composer, 6), "clapping", PaddingKt.m730paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getBottomEnd()), 0.0f, 0.0f, 0.0f, Dp.m5115constructorimpl(20), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            composer.endNode();
            Modifier align2 = boxScopeInstance.align(PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), companion2.getCenterStart());
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(8)), companion2.getStart(), composer, 6);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, align2);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            String j11 = aVar.a().j();
            long sp2 = TextUnitKt.getSp(20);
            FontWeight.Companion companion4 = FontWeight.Companion;
            FontWeight medium = companion4.getMedium();
            long sp3 = TextUnitKt.getSp(28);
            boolean changedInstance = composer.changedInstance(x3Var);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.t4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 r02;
                        r02 = WordCardKt.r0(x3.this);
                        return r02;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            TextKt.m1845Text4IGK_g(j11, SizeKt.m772requiredWidthInVpY3zN4$default(ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue, 3, null), 0.0f, Dp.m5115constructorimpl(R.styleable.Theme_drawable_share), 1, null), 0L, sp2, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp3, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 199680, 3126, 119764);
            TextKt.m1845Text4IGK_g("全部 " + aVar.a().k() + WordPlanInfoView.f22926m + str3, (Modifier) null, 0L, TextUnitKt.getSp(20), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(28), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 199680, 6, 130006);
            TextKt.m1845Text4IGK_g(str4, (Modifier) null, ColorKt.Color(4289243836L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3456, 0, 131058);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 r0(x3 x3Var) {
        x3Var.b(SimpleNavigation.WORDS_LIST);
        return yz.g2.f100423a;
    }

    public static final yz.g2 s0(w5 w5Var, x3 x3Var, Modifier modifier, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        m0(w5Var, x3Var, modifier, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final void t0(MutableState<Boolean> mutableState, Boolean bool) {
        mutableState.setValue(bool);
    }

    public static final int u0(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final void v0(MutableState<Integer> mutableState, int i11) {
        mutableState.setValue(Integer.valueOf(i11));
    }

    public static final yz.g2 w0(MutableState mutableState, MutableState mutableState2) {
        Boolean n02 = n0(mutableState);
        if (kotlin.jvm.internal.g0.g(n02, Boolean.TRUE)) {
            return yz.g2.f100423a;
        }
        Boolean bool = Boolean.FALSE;
        if (kotlin.jvm.internal.g0.g(n02, bool)) {
            v0(mutableState2, -1);
            bool = null;
        } else if (n02 != null) {
            throw new NoWhenBranchMatchedException();
        }
        t0(mutableState, bool);
        return yz.g2.f100423a;
    }

    public static final yz.g2 x0(MutableState mutableState, MutableState mutableState2) {
        Boolean n02 = n0(mutableState);
        boolean z11 = false;
        if (!kotlin.jvm.internal.g0.g(n02, Boolean.TRUE)) {
            if (!kotlin.jvm.internal.g0.g(n02, Boolean.FALSE)) {
                if (n02 == null) {
                    return yz.g2.f100423a;
                }
                throw new NoWhenBranchMatchedException();
            }
            v0(mutableState2, 0);
            z11 = true;
        }
        t0(mutableState, Boolean.valueOf(z11));
        return yz.g2.f100423a;
    }

    public static final yz.g2 y0(MutableState mutableState) {
        if (u0(mutableState) == -1) {
            return yz.g2.f100423a;
        }
        int u02 = u0(mutableState) + 1;
        int size = H0().size();
        int i11 = u02 % size;
        v0(mutableState, i11 + (size & (((i11 ^ size) & ((-i11) | i11)) >> 31)));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4294441724L, device = "spec:width=360dp,height=248dp,dpi=480,isRound=false,chinSize=0dp", showBackground = true)
    public static final void z0(@PreviewParameter(provider = x5.class) final w5 w5Var, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(585353717);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(w5Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585353717, i12, -1, "com.baicizhan.main.home.experiment.WordCardPreview (WordCard.kt:746)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-90099511, true, new x00.p() { // from class: com.baicizhan.main.home.experiment.f4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 A0;
                    A0 = WordCardKt.A0(w5.this, (Composer) obj, ((Integer) obj2).intValue());
                    return A0;
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.g4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 C0;
                    C0 = WordCardKt.C0(w5.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return C0;
                }
            });
        }
    }
}
