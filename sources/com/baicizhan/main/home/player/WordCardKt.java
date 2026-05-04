package com.baicizhan.main.home.player;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
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
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
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
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.LayoutReference;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.media3.extractor.WavUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.baicizhan.main.home.player.WordCardKt;
import com.baicizhan.main.home.player.behavior.SimpleNavigation;
import com.baicizhan.main.home.player.h;
import com.baicizhan.main.home.player.r4;
import com.baicizhan.main.home.player.ya;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import java.util.LinkedHashMap;
import java.util.List;
import k3.m3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 13 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 14 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 15 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 16 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 17 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 18 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 19 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 20 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 21 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,925:1\n1247#2,6:926\n1247#2,6:932\n1247#2,6:940\n1247#2,6:946\n1247#2,6:952\n1247#2,6:958\n1225#2,6:1011\n1247#2,6:1107\n1225#2,6:1235\n1247#2,6:1577\n113#3:938\n113#3:939\n113#3:964\n113#3:965\n113#3:999\n113#3:1063\n113#3:1102\n113#3:1103\n113#3:1104\n113#3:1105\n113#3:1106\n113#3:1120\n113#3:1122\n113#3:1128\n113#3:1138\n113#3:1227\n113#3:1330\n113#3:1368\n113#3:1369\n113#3:1370\n113#3,6:1375\n113#3:1427\n113#3:1494\n113#3:1538\n113#3:1576\n113#3:1583\n113#3:1585\n113#3:1625\n113#3:1626\n99#4,6:966\n106#4:1003\n99#4:1064\n97#4,8:1065\n106#4:1117\n99#4:1331\n96#4,9:1332\n106#4:1374\n99#4:1587\n96#4,9:1588\n106#4:1670\n79#5,6:972\n86#5,3:987\n89#5,2:996\n93#5:1002\n79#5,6:1073\n86#5,3:1088\n89#5,2:1097\n93#5:1116\n79#5,6:1149\n86#5,3:1164\n89#5,2:1173\n93#5:1178\n79#5,6:1195\n86#5,3:1210\n89#5,2:1219\n93#5:1225\n79#5,6:1296\n86#5,3:1311\n89#5,2:1320\n93#5:1325\n79#5,6:1341\n86#5,3:1356\n89#5,2:1365\n93#5:1373\n79#5,6:1597\n86#5,3:1612\n89#5,2:1621\n79#5,6:1636\n86#5,3:1651\n89#5,2:1660\n93#5:1665\n93#5:1669\n347#6,9:978\n356#6:998\n357#6,2:1000\n347#6,9:1079\n356#6:1099\n357#6,2:1114\n347#6,9:1155\n356#6,3:1175\n347#6,9:1201\n356#6:1221\n357#6,2:1223\n347#6,9:1302\n356#6,3:1322\n347#6,9:1347\n356#6:1367\n357#6,2:1371\n347#6,9:1603\n356#6:1623\n347#6,9:1642\n356#6,3:1662\n357#6,2:1667\n4206#7,6:990\n4206#7,6:1091\n4206#7,6:1167\n4206#7,6:1213\n4206#7,6:1314\n4206#7,6:1359\n4206#7,6:1615\n4206#7,6:1654\n354#8,7:1004\n361#8,2:1017\n363#8,7:1020\n401#8,10:1027\n400#8:1037\n412#8,4:1038\n416#8,7:1043\n446#8,12:1050\n472#8:1062\n354#8,7:1228\n361#8,2:1241\n363#8,7:1244\n401#8,10:1251\n400#8:1261\n412#8,4:1262\n416#8,7:1267\n446#8,12:1274\n472#8:1286\n1#9:1019\n1#9:1119\n1#9:1243\n77#10:1042\n75#10:1118\n75#10:1121\n75#10:1127\n75#10:1133\n75#10:1222\n77#10:1266\n75#10:1624\n1878#11,2:1100\n1880#11:1113\n30#12:1123\n53#13,3:1124\n53#13,3:1130\n70#13:1135\n70#13:1382\n60#13:1386\n60#13:1389\n60#13:1392\n70#13:1395\n60#13:1397\n70#13:1400\n60#13:1402\n70#13:1404\n60#13:1406\n70#13:1410\n70#13:1412\n60#13:1415\n60#13:1417\n60#13:1420\n70#13:1424\n60#13:1429\n70#13:1433\n60#13:1436\n60#13:1438\n70#13:1441\n60#13:1443\n70#13:1446\n70#13:1449\n60#13:1453\n60#13:1456\n60#13:1459\n70#13:1462\n60#13:1464\n70#13:1467\n60#13:1469\n70#13:1471\n60#13:1473\n70#13:1477\n70#13:1479\n60#13:1482\n60#13:1484\n60#13:1487\n70#13:1491\n60#13:1496\n70#13:1500\n60#13:1503\n60#13:1505\n70#13:1509\n70#13:1511\n70#13:1514\n70#13:1517\n60#13:1521\n70#13:1524\n60#13:1527\n60#13:1529\n60#13:1532\n70#13:1536\n60#13:1540\n60#13:1544\n60#13:1547\n60#13:1551\n60#13:1554\n60#13:1557\n70#13:1560\n60#13:1562\n70#13:1565\n60#13:1567\n70#13:1569\n70#13:1571\n70#13:1574\n33#14:1129\n69#15:1134\n69#15:1381\n65#15:1408\n65#15:1419\n69#15:1426\n65#15:1428\n65#15:1437\n65#15:1442\n69#15:1448\n65#15:1475\n65#15:1489\n69#15:1493\n65#15:1498\n65#15:1507\n69#15:1516\n65#15:1520\n65#15:1531\n69#15:1535\n65#15:1539\n65#15:1546\n22#16:1136\n22#16:1383\n22#16:1387\n22#16:1390\n22#16:1393\n22#16:1398\n22#16:1407\n22#16:1413\n22#16:1418\n22#16:1421\n22#16:1425\n22#16:1430\n22#16:1434\n22#16:1439\n22#16:1444\n22#16:1447\n22#16:1450\n22#16:1454\n22#16:1457\n22#16:1460\n22#16:1465\n22#16:1474\n22#16:1480\n22#16:1485\n22#16:1488\n22#16:1492\n22#16:1497\n22#16:1501\n22#16:1506\n22#16:1512\n22#16:1515\n22#16:1518\n22#16:1522\n22#16:1525\n22#16:1530\n22#16:1533\n22#16:1537\n22#16:1541\n22#16:1545\n22#16:1548\n22#16:1552\n22#16:1555\n22#16:1558\n22#16:1563\n22#16:1572\n22#16:1575\n61#17:1137\n61#17:1384\n57#17:1385\n57#17:1388\n57#17:1391\n61#17:1394\n57#17:1396\n61#17:1399\n57#17:1401\n61#17:1403\n57#17:1405\n61#17:1409\n61#17:1411\n57#17:1414\n57#17:1416\n57#17:1422\n61#17:1423\n57#17:1431\n61#17:1432\n57#17:1435\n61#17:1440\n61#17:1445\n61#17:1451\n57#17:1452\n57#17:1455\n57#17:1458\n61#17:1461\n57#17:1463\n61#17:1466\n57#17:1468\n61#17:1470\n57#17:1472\n61#17:1476\n61#17:1478\n57#17:1481\n57#17:1483\n57#17:1486\n61#17:1490\n57#17:1495\n61#17:1499\n57#17:1502\n57#17:1504\n61#17:1508\n61#17:1510\n61#17:1513\n61#17:1519\n61#17:1523\n57#17:1526\n57#17:1528\n57#17:1534\n57#17:1542\n57#17:1543\n57#17:1549\n57#17:1550\n57#17:1553\n57#17:1556\n61#17:1559\n57#17:1561\n61#17:1564\n57#17:1566\n61#17:1568\n61#17:1570\n61#17:1573\n70#18:1139\n67#18,9:1140\n77#18:1179\n70#18:1186\n68#18,8:1187\n77#18:1226\n70#18:1287\n68#18,8:1288\n77#18:1326\n70#18:1627\n68#18,8:1628\n77#18:1666\n85#19:1180\n113#19,2:1181\n78#20:1183\n107#20,2:1184\n78#20:1327\n107#20,2:1328\n49#21:1584\n49#21:1586\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt\n*L\n190#1:926,6\n191#1:932,6\n206#1:940,6\n226#1:946,6\n215#1:952,6\n209#1:958,6\n442#1:1011,6\n624#1:1107,6\n248#1:1235,6\n854#1:1577,6\n199#1:938\n200#1:939\n238#1:964\n325#1:965\n328#1:999\n620#1:1063\n643#1:1102\n644#1:1103\n646#1:1104\n650#1:1105\n653#1:1106\n874#1:1120\n875#1:1122\n876#1:1128\n878#1:1138\n248#1:1227\n658#1:1330\n663#1:1368\n665#1:1369\n667#1:1370\n679#1:1375,6\n724#1:1427\n748#1:1494\n768#1:1538\n854#1:1576\n893#1:1583\n895#1:1585\n900#1:1625\n903#1:1626\n325#1:966,6\n325#1:1003\n620#1:1064\n620#1:1065,8\n620#1:1117\n658#1:1331\n658#1:1332,9\n658#1:1374\n891#1:1587\n891#1:1588,9\n891#1:1670\n325#1:972,6\n325#1:987,3\n325#1:996,2\n325#1:1002\n620#1:1073,6\n620#1:1088,3\n620#1:1097,2\n620#1:1116\n879#1:1149,6\n879#1:1164,3\n879#1:1173,2\n879#1:1178\n242#1:1195,6\n242#1:1210,3\n242#1:1219,2\n242#1:1225\n313#1:1296,6\n313#1:1311,3\n313#1:1320,2\n313#1:1325\n658#1:1341,6\n658#1:1356,3\n658#1:1365,2\n658#1:1373\n891#1:1597,6\n891#1:1612,3\n891#1:1621,2\n901#1:1636,6\n901#1:1651,3\n901#1:1660,2\n901#1:1665\n891#1:1669\n325#1:978,9\n325#1:998\n325#1:1000,2\n620#1:1079,9\n620#1:1099\n620#1:1114,2\n879#1:1155,9\n879#1:1175,3\n242#1:1201,9\n242#1:1221\n242#1:1223,2\n313#1:1302,9\n313#1:1322,3\n658#1:1347,9\n658#1:1367\n658#1:1371,2\n891#1:1603,9\n891#1:1623\n901#1:1642,9\n901#1:1662,3\n891#1:1667,2\n325#1:990,6\n620#1:1091,6\n879#1:1167,6\n242#1:1213,6\n313#1:1314,6\n658#1:1359,6\n891#1:1615,6\n901#1:1654,6\n442#1:1004,7\n442#1:1017,2\n442#1:1020,7\n442#1:1027,10\n442#1:1037\n442#1:1038,4\n442#1:1043,7\n442#1:1050,12\n442#1:1062\n248#1:1228,7\n248#1:1241,2\n248#1:1244,7\n248#1:1251,10\n248#1:1261\n248#1:1262,4\n248#1:1267,7\n248#1:1274,12\n248#1:1286\n442#1:1019\n248#1:1243\n442#1:1042\n874#1:1118\n875#1:1121\n876#1:1127\n877#1:1133\n243#1:1222\n248#1:1266\n900#1:1624\n621#1:1100,2\n621#1:1113\n875#1:1123\n875#1:1124,3\n876#1:1130,3\n877#1:1135\n711#1:1382\n714#1:1386\n715#1:1389\n716#1:1392\n716#1:1395\n717#1:1397\n717#1:1400\n717#1:1402\n717#1:1404\n718#1:1406\n718#1:1410\n719#1:1412\n719#1:1415\n721#1:1417\n723#1:1420\n724#1:1424\n725#1:1429\n726#1:1433\n726#1:1436\n728#1:1438\n728#1:1441\n729#1:1443\n730#1:1446\n735#1:1449\n738#1:1453\n739#1:1456\n740#1:1459\n740#1:1462\n741#1:1464\n741#1:1467\n741#1:1469\n741#1:1471\n742#1:1473\n742#1:1477\n743#1:1479\n743#1:1482\n745#1:1484\n747#1:1487\n748#1:1491\n749#1:1496\n750#1:1500\n750#1:1503\n752#1:1505\n752#1:1509\n753#1:1511\n754#1:1514\n759#1:1517\n762#1:1521\n763#1:1524\n763#1:1527\n765#1:1529\n767#1:1532\n768#1:1536\n769#1:1540\n770#1:1544\n772#1:1547\n773#1:1551\n774#1:1554\n775#1:1557\n775#1:1560\n776#1:1562\n776#1:1565\n776#1:1567\n776#1:1569\n777#1:1571\n778#1:1574\n876#1:1129\n877#1:1134\n711#1:1381\n718#1:1408\n723#1:1419\n724#1:1426\n725#1:1428\n728#1:1437\n729#1:1442\n735#1:1448\n742#1:1475\n747#1:1489\n748#1:1493\n749#1:1498\n752#1:1507\n759#1:1516\n762#1:1520\n767#1:1531\n768#1:1535\n769#1:1539\n772#1:1546\n877#1:1136\n711#1:1383\n714#1:1387\n715#1:1390\n716#1:1393\n717#1:1398\n718#1:1407\n719#1:1413\n721#1:1418\n723#1:1421\n724#1:1425\n725#1:1430\n726#1:1434\n728#1:1439\n729#1:1444\n730#1:1447\n735#1:1450\n738#1:1454\n739#1:1457\n740#1:1460\n741#1:1465\n742#1:1474\n743#1:1480\n745#1:1485\n747#1:1488\n748#1:1492\n749#1:1497\n750#1:1501\n752#1:1506\n753#1:1512\n754#1:1515\n759#1:1518\n762#1:1522\n763#1:1525\n765#1:1530\n767#1:1533\n768#1:1537\n769#1:1541\n770#1:1545\n772#1:1548\n773#1:1552\n774#1:1555\n775#1:1558\n776#1:1563\n777#1:1572\n778#1:1575\n877#1:1137\n711#1:1384\n714#1:1385\n715#1:1388\n716#1:1391\n716#1:1394\n717#1:1396\n717#1:1399\n717#1:1401\n717#1:1403\n718#1:1405\n718#1:1409\n719#1:1411\n719#1:1414\n721#1:1416\n723#1:1422\n724#1:1423\n725#1:1431\n726#1:1432\n726#1:1435\n728#1:1440\n730#1:1445\n735#1:1451\n738#1:1452\n739#1:1455\n740#1:1458\n740#1:1461\n741#1:1463\n741#1:1466\n741#1:1468\n741#1:1470\n742#1:1472\n742#1:1476\n743#1:1478\n743#1:1481\n745#1:1483\n747#1:1486\n748#1:1490\n749#1:1495\n750#1:1499\n750#1:1502\n752#1:1504\n752#1:1508\n753#1:1510\n754#1:1513\n759#1:1519\n763#1:1523\n763#1:1526\n765#1:1528\n767#1:1534\n769#1:1542\n770#1:1543\n772#1:1549\n773#1:1550\n774#1:1553\n775#1:1556\n775#1:1559\n776#1:1561\n776#1:1564\n776#1:1566\n776#1:1568\n777#1:1570\n778#1:1573\n879#1:1139\n879#1:1140,9\n879#1:1179\n242#1:1186\n242#1:1187,8\n242#1:1226\n313#1:1287\n313#1:1288,8\n313#1:1326\n901#1:1627\n901#1:1628,8\n901#1:1666\n190#1:1180\n190#1:1181,2\n191#1:1183\n191#1:1184,2\n501#1:1327\n501#1:1328,2\n894#1:1584\n896#1:1586\n*E\n"})
/* loaded from: classes4.dex */
public final class WordCardKt {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f23396a = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.home.player.la
        @Override // x00.a
        public final Object invoke() {
            List p02;
            p02 = WordCardKt.p0();
            return p02;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,925:1\n113#2:926\n113#2:927\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$1$1\n*L\n452#1:926\n453#1:927\n*E\n"})
    public static final class a implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23407a = new a();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            float f11 = 16;
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), Dp.m5115constructorimpl(f11), 0.0f, 4, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), Dp.m5115constructorimpl(f11), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$10$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,925:1\n113#2:926\n113#2:927\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$10$1\n*L\n542#1:926\n543#1:927\n*E\n"})
    public static final class b implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23408a;

        public b(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23408a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f23408a.getEnd(), Dp.m5115constructorimpl(8), 0.0f, 4, null);
            float f11 = 4;
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, this.f23408a.getTop(), this.f23408a.getBottom(), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 112, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$11$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,925:1\n113#2:926\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$11$1\n*L\n556#1:926\n*E\n"})
    public static final class c implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstraintLayoutBaseScope.HorizontalAnchor f23409a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23410b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23411c;

        public c(ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor, ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f23409a = horizontalAnchor;
            this.f23410b = constrainedLayoutReference;
            this.f23411c = constrainedLayoutReference2;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f23409a, Dp.m5115constructorimpl(16), 0.0f, 4, (Object) null);
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, this.f23410b.getStart(), this.f23411c.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            constrainAs.setWidth(Dimension.Companion.getFillToConstraints());
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$12$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,925:1\n113#2:926\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$12$1\n*L\n568#1:926\n*E\n"})
    public static final class d implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23412a;

        public d(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23412a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), this.f23412a.getEnd(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f23412a.getBottom(), Dp.m5115constructorimpl(16), 0.0f, 4, (Object) null);
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
        public final /* synthetic */ ConstrainedLayoutReference f23413a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23414b;

        public e(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f23413a = constrainedLayoutReference;
            this.f23414b = constrainedLayoutReference2;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f23413a.getStart(), 0.0f, 0.0f, 6, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, this.f23414b.getTop(), this.f23414b.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$14$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,925:1\n113#2:926\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$14$1\n*L\n579#1:926\n*E\n"})
    public static final class f implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23415a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23416b;

        public f(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f23415a = constrainedLayoutReference;
            this.f23416b = constrainedLayoutReference2;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f23415a.getEnd(), Dp.m5115constructorimpl(12), 0.0f, 4, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, this.f23416b.getTop(), this.f23416b.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$15$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,925:1\n113#2:926\n113#2:927\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$15$1\n*L\n587#1:926\n588#1:927\n*E\n"})
    public static final class g implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23417a;

        public g(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23417a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            float f11 = 12;
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 112, (Object) null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f23417a.getBottom(), Dp.m5115constructorimpl(24), 0.0f, 4, (Object) null);
            constrainAs.setWidth(Dimension.Companion.getFillToConstraints());
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$16$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,925:1\n1#2:926\n*E\n"})
    public static final class h implements x00.l<com.baicizhan.main.home.player.e, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tg.a f23418a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m3.b f23419b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f23420c;

        public h(tg.a aVar, m3.b bVar, MutableIntState mutableIntState) {
            this.f23418a = aVar;
            this.f23419b = bVar;
            this.f23420c = mutableIntState;
        }

        public final void a(com.baicizhan.main.home.player.e it) {
            List<k3.l3> f11;
            k3.l3 l3Var;
            kotlin.jvm.internal.g0.p(it, "it");
            r4 n11 = it.n();
            if (!(n11 instanceof r4.a)) {
                if (!(n11 instanceof r4.b)) {
                    if (!kotlin.jvm.internal.g0.g(n11, r4.c.f23954a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    x00.l<Integer, yz.g2> d11 = ((r4.b) it.n()).d();
                    m3.b bVar = this.f23419b;
                    d11.invoke(Integer.valueOf((bVar == null || (f11 = bVar.f()) == null || (l3Var = (k3.l3) a00.r0.b3(f11, WordCardKt.A(this.f23420c))) == null) ? 0 : l3Var.f()));
                    return;
                }
            }
            this.f23418a.a(((r4.a) it.n()).g());
            ((r4.a) it.n()).h().invoke();
            x00.a<yz.g2> r11 = it.r();
            if (u30.k0.O3(it.s())) {
                r11 = null;
            }
            if (r11 != null) {
                r11.invoke();
            }
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(com.baicizhan.main.home.player.e eVar) {
            a(eVar);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tg.a f23421a;

        public i(tg.a aVar) {
            this.f23421a = aVar;
        }

        public final void a() {
            this.f23421a.b(SimpleNavigation.PLAN_EDIT);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$3$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,925:1\n1247#2,6:926\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$3$1\n*L\n465#1:926,6\n*E\n"})
    public static final class j implements x00.p<Composer, Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tg.a f23422a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements x00.a<yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ tg.a f23423a;

            public a(tg.a aVar) {
                this.f23423a = aVar;
            }

            public final void a() {
                this.f23423a.b(SimpleNavigation.PLAN_EDIT);
                ma.l.a(ma.t.f73003b, ma.a.f72769j0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ yz.g2 invoke() {
                a();
                return yz.g2.f100423a;
            }
        }

        public j(tg.a aVar) {
            this.f23422a = aVar;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-404711757, i11, -1, "com.baicizhan.main.home.player.BehaviorContent.<anonymous>.<anonymous>.<anonymous> (WordCard.kt:458)");
            }
            IconKt.m1692Iconww6aTOc(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_word_card_edit, composer, 54), "", (Modifier) null, 0L, composer, 48, 12);
            long sp2 = TextUnitKt.getSp(12);
            long sp3 = TextUnitKt.getSp(17);
            Modifier.Companion companion = Modifier.Companion;
            boolean changedInstance = composer.changedInstance(this.f23422a);
            tg.a aVar = this.f23422a;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(aVar);
                composer.updateRememberedValue(rememberedValue);
            }
            TextKt.m1845Text4IGK_g("修改", ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue, 3, null), 0L, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, sp3, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3078, 6, 130036);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,925:1\n113#2:926\n113#2:927\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$4$1\n*L\n476#1:926\n477#1:927\n*E\n"})
    public static final class k implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23424a;

        public k(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23424a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            constrainAs.centerTo(this.f23424a);
            Dimension.Companion companion = Dimension.Companion;
            float f11 = 56;
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
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$6$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,925:1\n113#2:926\n113#2:927\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$6$1\n*L\n493#1:926\n495#1:927\n*E\n"})
    public static final class l implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23425a;

        public l(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23425a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), Dp.m5115constructorimpl(16), 0.0f, 4, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, this.f23425a.getTop(), this.f23425a.getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            constrainAs.setWidth(ConstraintLayoutKt.m5454atMost3ABfNKs(Dimension.Companion.getPreferredWrapContent(), Dp.m5115constructorimpl(R.styleable.Theme_drawable_tab_mall_1111)));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$7$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,925:1\n113#2:926\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$7$1\n*L\n504#1:926\n*E\n"})
    public static final class m implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23426a;

        public m(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23426a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f23426a.getBottom(), Dp.m5115constructorimpl(8), 0.0f, 4, (Object) null);
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f23426a.getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$8\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,925:1\n99#2:926\n95#2,10:927\n106#2:997\n79#3,6:937\n86#3,3:952\n89#3,2:961\n93#3:996\n347#4,9:943\n356#4:963\n357#4,2:994\n4206#5,6:955\n1247#6,6:964\n1247#6,6:976\n1247#6,6:982\n113#7,6:970\n113#7,6:988\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$BehaviorContent$1$8\n*L\n507#1:926\n507#1:927,10\n507#1:997\n507#1:937,6\n507#1:952,3\n507#1:961,2\n507#1:996\n507#1:943,9\n507#1:963\n507#1:994,2\n507#1:955,6\n511#1:964,6\n525#1:976,6\n527#1:982,6\n515#1:970,6\n531#1:988,6\n*E\n"})
    public static final class n implements x00.p<Composer, Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f23427a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m3.b f23428b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements x00.a<yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ MutableIntState f23429a;

            public a(MutableIntState mutableIntState) {
                this.f23429a = mutableIntState;
            }

            public final void a() {
                if (WordCardKt.A(this.f23429a) > 0) {
                    WordCardKt.B(this.f23429a, WordCardKt.A(this.f23429a) - 1);
                }
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ yz.g2 invoke() {
                a();
                return yz.g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class b implements x00.l<GraphicsLayerScope, yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final b f23430a = new b();

            public final void a(GraphicsLayerScope graphicsLayer) {
                kotlin.jvm.internal.g0.p(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.setRotationY(180.0f);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(GraphicsLayerScope graphicsLayerScope) {
                a(graphicsLayerScope);
                return yz.g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class c implements x00.a<yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m3.b f23431a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutableIntState f23432b;

            public c(m3.b bVar, MutableIntState mutableIntState) {
                this.f23431a = bVar;
                this.f23432b = mutableIntState;
            }

            public final void a() {
                if (WordCardKt.A(this.f23432b) < a00.h0.L(this.f23431a.f())) {
                    WordCardKt.B(this.f23432b, WordCardKt.A(this.f23432b) + 1);
                }
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ yz.g2 invoke() {
                a();
                return yz.g2.f100423a;
            }
        }

        public n(MutableIntState mutableIntState, m3.b bVar) {
            this.f23427a = mutableIntState;
            this.f23428b = bVar;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(387146047, i11, -1, "com.baicizhan.main.home.player.BehaviorContent.<anonymous>.<anonymous> (WordCard.kt:506)");
            }
            Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
            MutableIntState mutableIntState = this.f23427a;
            m3.b bVar = this.f23428b;
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageVector.Companion companion3 = ImageVector.Companion;
            ImageVector vectorResource = VectorResources_androidKt.vectorResource(companion3, R.drawable.ic_home_word_card_triangle, composer, 54);
            boolean changed = composer.changed(mutableIntState);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(mutableIntState);
                composer.updateRememberedValue(rememberedValue);
            }
            float f11 = 4;
            float f12 = (float) 6.5d;
            float f13 = 12;
            float f14 = 16;
            Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(PaddingKt.m729paddingqDBjuR0(ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue, 3, null), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f13), Dp.m5115constructorimpl(f12)), Dp.m5115constructorimpl(f14));
            ColorFilter.Companion companion4 = ColorFilter.Companion;
            ColorFilter m2550tintxETnrds$default = ColorFilter.Companion.m2550tintxETnrds$default(companion4, ColorKt.Color(WordCardKt.A(mutableIntState) == 0 ? 1723910356L : 4290824404L), 0, 2, null);
            ContentScale.Companion companion5 = ContentScale.Companion;
            ImageKt.Image(vectorResource, TtmlNode.LEFT, m773size3ABfNKs, (Alignment) null, companion5.getInside(), 0.0f, m2550tintxETnrds$default, composer, 24624, 40);
            TextKt.m1845Text4IGK_g("Unit " + bVar.f().get(WordCardKt.A(mutableIntState)).f(), (Modifier) null, ColorKt.Color(4284508798L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH5(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 384, 0, 65530);
            ImageVector vectorResource2 = VectorResources_androidKt.vectorResource(companion3, R.drawable.ic_home_word_card_triangle, composer, 54);
            Object rememberedValue2 = composer.rememberedValue();
            Composer.Companion companion6 = Composer.Companion;
            if (rememberedValue2 == companion6.getEmpty()) {
                rememberedValue2 = b.f23430a;
                composer.updateRememberedValue(rememberedValue2);
            }
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(companion, (x00.l) rememberedValue2);
            boolean changed2 = composer.changed(mutableIntState) | composer.changedInstance(bVar);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == companion6.getEmpty()) {
                rememberedValue3 = new c(bVar, mutableIntState);
                composer.updateRememberedValue(rememberedValue3);
            }
            ImageKt.Image(vectorResource2, TtmlNode.RIGHT, SizeKt.m773size3ABfNKs(PaddingKt.m729paddingqDBjuR0(ComposeUtilsKt.k(graphicsLayer, 0L, false, (x00.a) rememberedValue3, 3, null), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f13), Dp.m5115constructorimpl(f12)), Dp.m5115constructorimpl(f14)), (Alignment) null, companion5.getInside(), 0.0f, ColorFilter.Companion.m2550tintxETnrds$default(companion4, ColorKt.Color(WordCardKt.A(mutableIntState) == a00.h0.L(bVar.f()) ? 1723910356L : 4290824404L), 0, 2, null), composer, 24624, 40);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class o implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ tg.a f23433a;

        public o(tg.a aVar) {
            this.f23433a = aVar;
        }

        public final void a() {
            this.f23433a.b(SimpleNavigation.WORDS_LIST);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class p {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23434a;

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
            f23434a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$WordCard$5$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,925:1\n113#2:926\n113#2:927\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt$WordCard$5$2$1$1\n*L\n252#1:926\n253#1:927\n*E\n"})
    public static final class q implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final q f23435a = new q();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            Dimension.Companion companion = Dimension.Companion;
            float f11 = 60;
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
    public static final class r implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23436a;

        public r(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23436a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, this.f23436a.getStart(), this.f23436a.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class s implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23437a;

        public s(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23437a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, this.f23437a.getStart(), this.f23437a.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t implements tg.a {
        @Override // tg.a
        public void a(String intent) {
            kotlin.jvm.internal.g0.p(intent, "intent");
        }

        @Override // tg.a
        public void b(SimpleNavigation action) {
            kotlin.jvm.internal.g0.p(action, "action");
        }
    }

    public static final int A(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void B(MutableIntState mutableIntState, int i11) {
        mutableIntState.setIntValue(i11);
    }

    public static final yz.g2 C(Modifier modifier, com.baicizhan.main.home.player.f fVar, int i11, int i12, List list, tg.a aVar, zj.d dVar, zj.d dVar2, zj.d dVar3, m3.b bVar, int i13, int i14, Composer composer, int i15) {
        z(modifier, fVar, i11, i12, list, aVar, dVar, dVar2, dVar3, bVar, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i14);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 16777215, showBackground = true)
    public static final void D(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1437467258);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1437467258, i11, -1, "com.baicizhan.main.home.player.BehaviorsPreview (WordCard.kt:859)");
            }
            bk.k.h(null, null, null, o1.f23826a.l(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.ka
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 E;
                    E = WordCardKt.E(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return E;
                }
            });
        }
    }

    public static final yz.g2 E(int i11, Composer composer, int i12) {
        D(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x008b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(final java.util.List<com.baicizhan.main.home.player.e> r33, androidx.compose.ui.Modifier r34, zj.d r35, zj.d r36, final x00.l<? super com.baicizhan.main.home.player.e, yz.g2> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.WordCardKt.F(java.util.List, androidx.compose.ui.Modifier, zj.d, zj.d, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 G(x00.l lVar, com.baicizhan.main.home.player.e eVar) {
        lVar.invoke(eVar);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 H(List list, final com.baicizhan.main.home.player.e eVar, RowScope Button, Composer composer, int i11) {
        RowScopeInstance rowScopeInstance;
        Modifier.Companion companion;
        boolean z11;
        int i12;
        Modifier.Companion companion2;
        int i13;
        Composer composer2 = composer;
        kotlin.jvm.internal.g0.p(Button, "$this$Button");
        if (composer2.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(393765386, i11, -1, "com.baicizhan.main.home.player.ButtonBehavior.<anonymous>.<anonymous>.<anonymous> (WordCard.kt:657)");
            }
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(companion3, Dp.m5115constructorimpl(16), 0.0f, 2, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer2, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m728paddingVpY3zN4$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            if (list.size() == 1) {
                composer2.startReplaceGroup(-1707596719);
                Modifier weight$default = RowScope.weight$default(rowScopeInstance2, companion3, 1.0f, false, 2, null);
                rowScopeInstance = rowScopeInstance2;
                companion = companion3;
                SpacerKt.Spacer(weight$default, composer2, 0);
            } else {
                rowScopeInstance = rowScopeInstance2;
                companion = companion3;
                composer2.startReplaceGroup(-1734830436);
            }
            composer2.endReplaceGroup();
            if (eVar.q() != 0) {
                composer2.startReplaceGroup(-1707474052);
                i12 = 8;
                z11 = -1734830436;
                ImageKt.Image(PainterResources_androidKt.painterResource(eVar.q(), composer2, 0), "icon", SizeKt.m773size3ABfNKs(PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl((list.size() == 1 && eVar.m()) ? 8 : 0), 0.0f, 0.0f, 0.0f, 14, null), Dp.m5115constructorimpl(32)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
                composer2 = composer;
            } else {
                z11 = -1734830436;
                i12 = 8;
                composer2.startReplaceGroup(-1734830436);
            }
            composer2.endReplaceGroup();
            float f11 = i12;
            Modifier.Companion companion5 = companion;
            TextKt.m1845Text4IGK_g(eVar.t(), PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getSubtitle1(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 48, 0, 65532);
            if (eVar.m()) {
                composer.startReplaceGroup(-1707078709);
                companion2 = companion5;
                IconKt.m1692Iconww6aTOc(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_arrow_right, composer, 54), (String) null, PaddingKt.m730paddingqDBjuR0$default(companion2, Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 14, null), 0L, composer, 432, 8);
                composer.endReplaceGroup();
                i13 = -1734830436;
            } else {
                companion2 = companion5;
                i13 = -1734830436;
                composer.startReplaceGroup(-1734830436);
                composer.endReplaceGroup();
            }
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), composer, 0);
            if (eVar.q() != 0 || eVar.m()) {
                composer.startReplaceGroup(i13);
            } else {
                composer.startReplaceGroup(-1706800980);
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(0.8f)), ComposableLambdaKt.rememberComposableLambda(1885770386, true, new x00.p() { // from class: com.baicizhan.main.home.player.da
                    @Override // x00.p
                    public final Object invoke(Object obj, Object obj2) {
                        yz.g2 I;
                        I = WordCardKt.I(e.this, (Composer) obj, ((Integer) obj2).intValue());
                        return I;
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 I(com.baicizhan.main.home.player.e eVar, Composer composer, int i11) {
        int i12;
        Composer composer2 = composer;
        if (composer2.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1885770386, i11, -1, "com.baicizhan.main.home.player.ButtonBehavior.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WordCard.kt:671)");
            }
            if (u30.k0.O3(eVar.o())) {
                i12 = 785251152;
                composer2.startReplaceGroup(785251152);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(813411397);
                TextKt.m1845Text4IGK_g(eVar.o(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getSubtitle2(), 0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                composer2 = composer;
                composer2.endReplaceGroup();
                i12 = 785251152;
            }
            if (u30.k0.O3(eVar.p())) {
                composer2.startReplaceGroup(i12);
            } else {
                composer2.startReplaceGroup(813691420);
                TextKt.m1845Text4IGK_g(eVar.p(), OffsetKt.m686offsetVpY3zN4$default(PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, Dp.m5115constructorimpl(3), 0.0f, 0.0f, 0.0f, 14, null), 0.0f, Dp.m5115constructorimpl((float) 0.5d), 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getH5(), 0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 48, 0, 65532);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 J(List list, Modifier modifier, zj.d dVar, zj.d dVar2, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        F(list, modifier, dVar, dVar2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void K(Modifier modifier, final String str, final long j11, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-1766606345);
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
                ComposerKt.traceEventStart(-1766606345, i13, -1, "com.baicizhan.main.home.player.DotDescription (WordCard.kt:323)");
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
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(str, (Modifier) null, bk.b.S(materialTheme.getColors(startRestartGroup, i15)), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(startRestartGroup, i15).getH5(), 0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, (i13 >> 3) & 14, 0, 65530);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.ea
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 L;
                    L = WordCardKt.L(Modifier.this, str, j11, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return L;
                }
            });
        }
    }

    public static final yz.g2 L(Modifier modifier, String str, long j11, int i11, int i12, Composer composer, int i13) {
        K(modifier, str, j11, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
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
    public static final void M(final java.lang.String r30, com.baicizhan.main.home.player.PointerPosition r31, androidx.compose.ui.Modifier r32, final x00.a<yz.g2> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.WordCardKt.M(java.lang.String, com.baicizhan.main.home.player.PointerPosition, androidx.compose.ui.Modifier, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 N(PointerPosition pointerPosition, float f11, float f12, String str, x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-850929858, i11, -1, "com.baicizhan.main.home.player.Tip.<anonymous>.<anonymous> (WordCard.kt:890)");
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

    public static final yz.g2 O(String str, PointerPosition pointerPosition, Modifier modifier, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        M(str, pointerPosition, modifier, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 16777215, showBackground = true)
    public static final void P(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(421571584);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(421571584, i11, -1, "com.baicizhan.main.home.player.TipPreview (WordCard.kt:916)");
            }
            bk.k.h(null, null, null, o1.f23826a.n(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.ma
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Q;
                    Q = WordCardKt.Q(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Q;
                }
            });
        }
    }

    public static final yz.g2 Q(int i11, Composer composer, int i12) {
        P(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R(@m80.k final com.baicizhan.main.home.player.ya r27, @m80.k final tg.a r28, @m80.l androidx.compose.ui.Modifier r29, @m80.l zj.d r30, @m80.l zj.d r31, @m80.l zj.d r32, @m80.k final x00.a<yz.g2> r33, @m80.l androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.WordCardKt.R(com.baicizhan.main.home.player.ya, tg.a, androidx.compose.ui.Modifier, zj.d, zj.d, zj.d, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Boolean S(MutableState<Boolean> mutableState) {
        return mutableState.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 T(final ya yaVar, tg.a aVar, zj.d dVar, zj.d dVar2, zj.d dVar3, final x00.a aVar2, Composer composer, int i11) {
        int k11;
        Object obj;
        final MutableState mutableState;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1072209087, i11, -1, "com.baicizhan.main.home.player.WordCard.<anonymous> (WordCard.kt:239)");
            }
            if (kotlin.jvm.internal.g0.g(yaVar, ya.e.f24390b)) {
                composer.startReplaceGroup(-509055412);
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
            } else if (yaVar instanceof ya.b) {
                composer.startReplaceGroup(-508756231);
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
                    obj = new MeasurePolicy() { // from class: com.baicizhan.main.home.player.WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$2
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
                            return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: com.baicizhan.main.home.player.WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$2.1
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
                } else {
                    obj = rememberedValue6;
                    mutableState = mutableState2;
                }
                MeasurePolicy measurePolicy = (MeasurePolicy) obj;
                Object rememberedValue7 = composer.rememberedValue();
                if (rememberedValue7 == companion2.getEmpty()) {
                    rememberedValue7 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$3
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
                final x00.a aVar3 = (x00.a) rememberedValue7;
                boolean changedInstance2 = composer.changedInstance(measurer2);
                Object rememberedValue8 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue8 == companion2.getEmpty()) {
                    rememberedValue8 = new x00.l<SemanticsPropertyReceiver, yz.g2>() { // from class: com.baicizhan.main.home.player.WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$4
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
                LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(m726padding3ABfNKs, false, (x00.l) rememberedValue8, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.home.player.WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$5
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
                        int i14;
                        Modifier.Companion companion3;
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
                        composer3.startReplaceGroup(-1973727964);
                        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope3.createRefs();
                        ConstrainedLayoutReference component1 = createRefs.component1();
                        ConstrainedLayoutReference component2 = createRefs.component2();
                        ConstrainedLayoutReference component3 = createRefs.component3();
                        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_common_page_oops_small, composer3, 6);
                        Modifier.Companion companion4 = Modifier.Companion;
                        Object rememberedValue9 = composer3.rememberedValue();
                        Composer.Companion companion5 = Composer.Companion;
                        if (rememberedValue9 == companion5.getEmpty()) {
                            rememberedValue9 = WordCardKt.q.f23435a;
                            composer3.updateRememberedValue(rememberedValue9);
                        }
                        ImageKt.Image(painterResource, "image", constraintLayoutScope3.constrainAs(companion4, component1, (x00.l) rememberedValue9), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                        composer3.startReplaceGroup(-1033488050);
                        Throwable f11 = ((ya.b) yaVar).f();
                        String message = f11 != null ? f11.getMessage() : null;
                        if (message == null || message.length() == 0) {
                            i14 = helpersHashCode;
                            companion3 = companion4;
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
                                rememberedValue10 = new WordCardKt.r(component1);
                                composer3.updateRememberedValue(rememberedValue10);
                            }
                            constraintLayoutScope2 = constraintLayoutScope3;
                            constrainedLayoutReference = component1;
                            constrainedLayoutReference2 = component2;
                            i14 = helpersHashCode;
                            companion3 = companion4;
                            c11 = 2;
                            TextKt.m1845Text4IGK_g(message, PaddingKt.m730paddingqDBjuR0$default(constraintLayoutScope3.constrainAs(companion4, component2, (x00.l) rememberedValue10), 0.0f, Dp.m5115constructorimpl(6), 0.0f, Dp.m5115constructorimpl(12), 5, null), Color, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3456, 0, 131056);
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
                            rememberedValue11 = new WordCardKt.s(constrainedLayoutReference3);
                            composer3.updateRememberedValue(rememberedValue11);
                        }
                        ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                        ButtonKt.OutlinedButton(aVar2, constraintLayoutScope4.constrainAs(m759height3ABfNKs, component3, (x00.l) rememberedValue11), false, null, null, m1019RoundedCornerShape0680j_4, m262BorderStrokecXLIe8U, null, m720PaddingValuesYgX7TsA, o1.f23826a.k(), composer2, 907542528, 156);
                        LayoutReference[] layoutReferenceArr = new LayoutReference[3];
                        layoutReferenceArr[0] = constrainedLayoutReference3;
                        layoutReferenceArr[1] = constrainedLayoutReference2;
                        layoutReferenceArr[c11] = component3;
                        constraintLayoutScope4.createVerticalChain(layoutReferenceArr, ChainStyle.Companion.getPacked());
                        composer2.endReplaceGroup();
                        if (constraintLayoutScope.getHelpersHashCode() != i14) {
                            EffectsKt.SideEffect(aVar3, composer2, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), measurePolicy, composer, 48, 0);
                composer.endReplaceGroup();
                composer.endReplaceGroup();
            } else if (yaVar instanceof ya.c) {
                composer.startReplaceGroup(-507056408);
                ya.c cVar = (ya.c) yaVar;
                z(null, cVar.a(), cVar.j().e(), cVar.j().f(), cVar.i(), aVar, dVar, dVar2, dVar3, cVar.l(), composer, 0, 1);
                composer.endReplaceGroup();
            } else if (yaVar instanceof ya.a) {
                composer.startReplaceGroup(-506441244);
                ya.a aVar4 = (ya.a) yaVar;
                com.baicizhan.main.home.player.f a11 = aVar4.a();
                int k12 = aVar4.a().k();
                com.baicizhan.main.home.player.h i13 = aVar4.i();
                if (i13 instanceof h.a) {
                    k11 = ((h.a) i13).d();
                } else {
                    if (!kotlin.jvm.internal.g0.g(i13, h.b.f23650a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k11 = aVar4.a().k();
                }
                z(null, a11, k12, k11, aVar4.h(), aVar, dVar, dVar2, dVar3, aVar4.j(), composer, 0, 1);
                composer.endReplaceGroup();
            } else {
                if (!kotlin.jvm.internal.g0.g(yaVar, ya.d.f24388b)) {
                    composer.startReplaceGroup(399222382);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-505688099);
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

    public static final yz.g2 U(ya yaVar, tg.a aVar, Modifier modifier, zj.d dVar, zj.d dVar2, zj.d dVar3, x00.a aVar2, int i11, int i12, Composer composer, int i13) {
        R(yaVar, aVar, modifier, dVar, dVar2, dVar3, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final void V(MutableState<Boolean> mutableState, Boolean bool) {
        mutableState.setValue(bool);
    }

    public static final int W(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final void X(MutableIntState mutableIntState, int i11) {
        mutableIntState.setIntValue(i11);
    }

    public static final yz.g2 Y(MutableState mutableState, MutableIntState mutableIntState) {
        Boolean S = S(mutableState);
        if (kotlin.jvm.internal.g0.g(S, Boolean.TRUE)) {
            return yz.g2.f100423a;
        }
        Boolean bool = Boolean.FALSE;
        if (kotlin.jvm.internal.g0.g(S, bool)) {
            X(mutableIntState, -1);
            bool = null;
        } else if (S != null) {
            throw new NoWhenBranchMatchedException();
        }
        V(mutableState, bool);
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z(MutableState mutableState, MutableIntState mutableIntState) {
        Boolean S = S(mutableState);
        boolean z11 = false;
        if (!kotlin.jvm.internal.g0.g(S, Boolean.TRUE)) {
            if (!kotlin.jvm.internal.g0.g(S, Boolean.FALSE)) {
                if (S == null) {
                    return yz.g2.f100423a;
                }
                throw new NoWhenBranchMatchedException();
            }
            X(mutableIntState, 0);
            z11 = true;
        }
        V(mutableState, Boolean.valueOf(z11));
        return yz.g2.f100423a;
    }

    public static final yz.g2 a0(MutableIntState mutableIntState) {
        if (W(mutableIntState) == -1) {
            return yz.g2.f100423a;
        }
        int W = W(mutableIntState) + 1;
        int size = l0().size();
        int i11 = W % size;
        X(mutableIntState, i11 + (size & (((i11 ^ size) & ((-i11) | i11)) >> 31)));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4294441724L, device = "spec:width=360dp,height=220dp,dpi=480,isRound=false,chinSize=0dp", showBackground = true)
    public static final void b0(@PreviewParameter(provider = za.class) final ya yaVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(733479697);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(yaVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(733479697, i12, -1, "com.baicizhan.main.home.player.WordCardPreview (WordCard.kt:845)");
            }
            bk.k.h(null, null, null, ComposableLambdaKt.rememberComposableLambda(889015, true, new x00.p() { // from class: com.baicizhan.main.home.player.ha
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 c02;
                    c02 = WordCardKt.c0(ya.this, (Composer) obj, ((Integer) obj2).intValue());
                    return c02;
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.ia
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 e02;
                    e02 = WordCardKt.e0(ya.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return e02;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 c0(ya yaVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(889015, i11, -1, "com.baicizhan.main.home.player.WordCardPreview.<anonymous> (WordCard.kt:847)");
            }
            t tVar = new t();
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(16));
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.fa
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 d02;
                        d02 = WordCardKt.d0();
                        return d02;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            R(yaVar, tVar, m726padding3ABfNKs, null, null, null, (x00.a) rememberedValue, composer, 1573248, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 d0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 e0(ya yaVar, int i11, Composer composer, int i12) {
        b0(yaVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final List<ya> l0() {
        return (List) f23396a.getValue();
    }

    @m80.k
    public static final Modifier m0(@m80.k Modifier pointerBackground, final long j11, @m80.k final PointerPosition position, final long j12, final long j13, final long j14, final float f11, final float f12) {
        kotlin.jvm.internal.g0.p(pointerBackground, "$this$pointerBackground");
        kotlin.jvm.internal.g0.p(position, "position");
        return pointerBackground.then(DrawModifierKt.drawBehind(Modifier.Companion, new x00.l() { // from class: com.baicizhan.main.home.player.qa
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 o02;
                o02 = WordCardKt.o0(PointerPosition.this, j11, j14, f11, j12, j13, f12, (DrawScope) obj);
                return o02;
            }
        }));
    }

    public static /* synthetic */ Modifier n0(Modifier modifier, long j11, PointerPosition pointerPosition, long j12, long j13, long j14, float f11, float f12, int i11, Object obj) {
        return m0(modifier, j11, pointerPosition, j12, (i11 & 8) != 0 ? Size.Companion.m2346getZeroNHjbRc() : j13, (i11 & 16) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : j14, (i11 & 32) != 0 ? 0.0f : f11, (i11 & 64) != 0 ? 0.0f : f12);
    }

    public static final yz.g2 o0(PointerPosition pointerPosition, long j11, long j12, float f11, long j13, long j14, float f12, DrawScope drawBehind) {
        Path Path;
        kotlin.jvm.internal.g0.p(drawBehind, "$this$drawBehind");
        int i11 = p.f23434a[pointerPosition.ordinal()];
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

    public static final List p0() {
        return a00.h0.Q(new ya.c(new com.baicizhan.main.home.player.f(1, "四级核心词汇", "", 1000), new com.baicizhan.main.home.player.g(700, 780), a00.h0.Q(new com.baicizhan.main.home.player.e(com.baicizhan.main.home.experiment.repo.q.f21581c, new r4.b(new x00.l() { // from class: com.baicizhan.main.home.player.ra
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 q02;
                q02 = WordCardKt.q0(((Integer) obj).intValue());
                return q02;
            }
        }), "", null, "学习一下吧", null, 0, false, R.styleable.Theme_drawable_tab_home, null), new com.baicizhan.main.home.player.e(com.baicizhan.main.home.experiment.repo.q.f21582d, new r4.b(new x00.l() { // from class: com.baicizhan.main.home.player.sa
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 r02;
                r02 = WordCardKt.r0(((Integer) obj).intValue());
                return r02;
            }
        }), "", null, null, null, 0, false, R.styleable.Theme_drawable_walk_sound4, null)), null, null, 24, null), new ya.c(new com.baicizhan.main.home.player.f(1, "四级核心词汇四级核心词汇四级核心词汇", "", 1000), new com.baicizhan.main.home.player.g(1001, 1001), a00.h0.Q(new com.baicizhan.main.home.player.e(com.baicizhan.main.home.experiment.repo.q.f21581c, new r4.b(new x00.l() { // from class: com.baicizhan.main.home.player.ta
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 s02;
                s02 = WordCardKt.s0(((Integer) obj).intValue());
                return s02;
            }
        }), "0/10", "组", null, null, 0, false, 240, null), new com.baicizhan.main.home.player.e(com.baicizhan.main.home.experiment.repo.q.f21582d, new r4.b(new x00.l() { // from class: com.baicizhan.main.home.player.ua
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 t02;
                t02 = WordCardKt.t0(((Integer) obj).intValue());
                return t02;
            }
        }), "22/45", "组", "复习不复习重要，因为复习了也不能学好，难道不是吗？确实不是，这句话是瞎说的，纯粹占个长度", null, 0, false, 224, null)), null, null, 24, null), new ya.a(new com.baicizhan.main.home.player.f(1, "四级核心词汇", "", 1000), new h.a(200), a00.h0.Q(new com.baicizhan.main.home.player.e("新学已完成", r4.c.f23954a, "不会显示", "不会显示", null, null, R.drawable.ic_home_word_card_sparkles_1, false, 176, null), new com.baicizhan.main.home.player.e(com.baicizhan.main.home.experiment.repo.q.f21582d, new r4.b(new x00.l() { // from class: com.baicizhan.main.home.player.va
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 u02;
                u02 = WordCardKt.u0(((Integer) obj).intValue());
                return u02;
            }
        }), "22/45", "组", null, null, 0, false, 240, null)), null, 8, null), new ya.a(new com.baicizhan.main.home.player.f(1, "四级核心词汇四级核心词汇四级核心词汇", "", 1000), h.b.f23650a, a00.g0.l(new com.baicizhan.main.home.player.e("探索新词书", new r4.a("bcz://com.baicizhan.plan/edit", null, 2, null), null, null, null, null, R.drawable.ic_home_word_card_sparkles_2, true, 60, null)), null, 8, null), new ya.b(new Error("出错了"), null, 2, null), ya.d.f24388b);
    }

    public static final yz.g2 q0(int i11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 r0(int i11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 s0(int i11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 t0(int i11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 u0(int i11) {
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z(androidx.compose.ui.Modifier r26, final com.baicizhan.main.home.player.f r27, final int r28, final int r29, final java.util.List<com.baicizhan.main.home.player.e> r30, final tg.a r31, zj.d r32, zj.d r33, zj.d r34, k3.m3.b r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.WordCardKt.z(androidx.compose.ui.Modifier, com.baicizhan.main.home.player.f, int, int, java.util.List, tg.a, zj.d, zj.d, zj.d, k3.m3$b, androidx.compose.runtime.Composer, int, int):void");
    }
}
