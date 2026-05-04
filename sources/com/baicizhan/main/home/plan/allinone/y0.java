package com.baicizhan.main.home.plan.allinone;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.media3.extractor.WavUtil;
import coil.request.ImageRequest;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCardWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardWidget.kt\ncom/baicizhan/main/home/plan/allinone/CardWidgetKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,817:1\n99#2:818\n96#2,9:819\n99#2,6:893\n106#2:937\n106#2:947\n99#2:1022\n95#2,10:1023\n106#2:1151\n99#2,6:1293\n99#2,6:1326\n106#2:1367\n106#2:1371\n99#2,6:1372\n106#2:1414\n99#2,6:1448\n106#2:1485\n99#2:1499\n96#2,9:1500\n106#2:1540\n99#2,6:1575\n106#2:1618\n99#2:2095\n95#2,10:2096\n106#2:2137\n79#3,6:828\n86#3,3:843\n89#3,2:852\n79#3,6:866\n86#3,3:881\n89#3,2:890\n79#3,6:899\n86#3,3:914\n89#3,2:923\n93#3:936\n93#3:942\n93#3:946\n79#3,6:954\n86#3,3:969\n89#3,2:978\n93#3:986\n79#3,6:994\n86#3,3:1009\n89#3,2:1018\n79#3,6:1033\n86#3,3:1048\n89#3,2:1057\n79#3,6:1071\n86#3,3:1086\n89#3,2:1095\n93#3:1102\n79#3,6:1115\n86#3,3:1130\n89#3,2:1139\n93#3:1146\n93#3:1150\n93#3:1154\n79#3,6:1169\n86#3,3:1184\n89#3,2:1193\n93#3:1198\n79#3,6:1218\n86#3,3:1233\n89#3,2:1242\n93#3:1247\n79#3,6:1258\n86#3,3:1273\n89#3,2:1282\n93#3:1291\n79#3,6:1299\n86#3,3:1314\n89#3,2:1323\n79#3,6:1332\n86#3,3:1347\n89#3,2:1356\n93#3:1366\n93#3:1370\n79#3,6:1378\n86#3,3:1393\n89#3,2:1402\n93#3:1413\n79#3,6:1421\n86#3,3:1436\n89#3,2:1445\n79#3,6:1454\n86#3,3:1469\n89#3,2:1478\n93#3:1484\n93#3:1489\n79#3,6:1509\n86#3,3:1524\n89#3,2:1533\n93#3:1539\n79#3,6:1547\n86#3,3:1562\n89#3,2:1571\n79#3,6:1581\n86#3,3:1596\n89#3,2:1605\n93#3:1617\n93#3:1621\n79#3,6:1640\n86#3,3:1655\n89#3,2:1664\n93#3:1669\n79#3,6:1688\n86#3,3:1703\n89#3,2:1712\n93#3:1717\n79#3,6:1725\n86#3,3:1740\n89#3,2:1749\n79#3,6:1761\n86#3,3:1776\n89#3,2:1785\n93#3:1797\n93#3:1806\n79#3,6:1817\n86#3,3:1832\n89#3,2:1841\n79#3,6:1850\n86#3,3:1865\n89#3,2:1874\n93#3:1885\n93#3:1889\n79#3,6:1900\n86#3,3:1915\n89#3,2:1924\n93#3:1930\n79#3,6:1942\n86#3,3:1957\n89#3,2:1966\n93#3:1976\n79#3,6:1987\n86#3,3:2002\n89#3,2:2011\n79#3,6:2020\n86#3,3:2035\n89#3,2:2044\n93#3:2055\n93#3:2059\n79#3,6:2067\n86#3,3:2082\n89#3,2:2091\n79#3,6:2106\n86#3,3:2121\n89#3,2:2130\n93#3:2136\n93#3:2140\n79#3,6:2153\n86#3,3:2168\n89#3,2:2177\n93#3:2195\n347#4,9:834\n356#4:854\n347#4,9:872\n356#4:892\n347#4,9:905\n356#4:925\n357#4,2:934\n357#4,2:940\n357#4,2:944\n347#4,9:960\n356#4:980\n357#4,2:984\n347#4,9:1000\n356#4:1020\n347#4,9:1039\n356#4:1059\n347#4,9:1077\n356#4:1097\n357#4,2:1100\n347#4,9:1121\n356#4:1141\n357#4,2:1144\n357#4,2:1148\n357#4,2:1152\n347#4,9:1175\n356#4,3:1195\n347#4,9:1224\n356#4,3:1244\n347#4,9:1264\n356#4:1284\n357#4,2:1289\n347#4,9:1305\n356#4:1325\n347#4,9:1338\n356#4:1358\n357#4,2:1364\n357#4,2:1368\n347#4,9:1384\n356#4:1404\n357#4,2:1411\n347#4,9:1427\n356#4:1447\n347#4,9:1460\n356#4:1480\n357#4,2:1482\n357#4,2:1487\n347#4,9:1515\n356#4:1535\n357#4,2:1537\n347#4,9:1553\n356#4:1573\n347#4,9:1587\n356#4:1607\n357#4,2:1615\n357#4,2:1619\n347#4,9:1646\n356#4,3:1666\n347#4,9:1694\n356#4,3:1714\n347#4,9:1731\n356#4:1751\n347#4,9:1767\n356#4:1787\n357#4,2:1795\n357#4,2:1804\n347#4,9:1823\n356#4:1843\n347#4,9:1856\n356#4:1876\n357#4,2:1883\n357#4,2:1887\n347#4,9:1906\n356#4:1926\n357#4,2:1928\n347#4,9:1948\n356#4:1968\n357#4,2:1974\n347#4,9:1993\n356#4:2013\n347#4,9:2026\n356#4:2046\n357#4,2:2053\n357#4,2:2057\n347#4,9:2073\n356#4:2093\n347#4,9:2112\n356#4:2132\n357#4,2:2134\n357#4,2:2138\n347#4,9:2159\n356#4:2179\n357#4,2:2193\n4206#5,6:846\n4206#5,6:884\n4206#5,6:917\n4206#5,6:972\n4206#5,6:1012\n4206#5,6:1051\n4206#5,6:1089\n4206#5,6:1133\n4206#5,6:1187\n4206#5,6:1236\n4206#5,6:1276\n4206#5,6:1317\n4206#5,6:1350\n4206#5,6:1396\n4206#5,6:1439\n4206#5,6:1472\n4206#5,6:1527\n4206#5,6:1565\n4206#5,6:1599\n4206#5,6:1658\n4206#5,6:1706\n4206#5,6:1743\n4206#5,6:1779\n4206#5,6:1835\n4206#5,6:1868\n4206#5,6:1918\n4206#5,6:1960\n4206#5,6:2005\n4206#5,6:2038\n4206#5,6:2085\n4206#5,6:2124\n4206#5,6:2171\n87#6:855\n83#6,10:856\n94#6:943\n87#6,6:948\n94#6:987\n87#6,6:988\n87#6:1061\n84#6,9:1062\n94#6:1103\n87#6:1105\n84#6,9:1106\n94#6:1147\n94#6:1155\n87#6,6:1415\n94#6:1490\n87#6,6:1541\n94#6:1622\n87#6,6:1719\n94#6:1807\n87#6,6:1844\n94#6:1886\n87#6:1932\n84#6,9:1933\n94#6:1977\n87#6,6:2014\n94#6:2056\n87#6,6:2061\n94#6:2141\n87#6:2142\n83#6,10:2143\n94#6:2196\n1247#7,6:926\n1247#7,6:1202\n1247#7,6:1405\n1247#7,6:1491\n1247#7,3:1608\n1250#7,3:1612\n1247#7,6:1624\n1247#7,6:1672\n1247#7,6:1788\n1247#7,6:2180\n1247#7,6:2187\n113#8:932\n113#8:933\n113#8:938\n113#8:939\n113#8:981\n113#8:982\n113#8:983\n113#8:1021\n113#8:1060\n113#8:1098\n113#8:1099\n113#8:1104\n113#8:1142\n113#8:1143\n113#8:1156\n113#8:1158\n113#8:1159\n113#8:1200\n113#8:1201\n113#8:1285\n113#8:1286\n113#8:1287\n113#8:1288\n113#8:1359\n113#8:1360\n113#8:1361\n113#8:1362\n113#8:1363\n113#8:1481\n113#8:1486\n113#8:1497\n113#8:1498\n113#8:1536\n113#8:1574\n113#8:1623\n113#8:1630\n113#8:1671\n113#8:1678\n113#8:1794\n113#8:1799\n113#8:1800\n113#8:1801\n113#8:1802\n113#8:1877\n113#8:1878\n113#8:1879\n113#8:1880\n113#8:1881\n113#8:1882\n113#8:1927\n113#8:1969\n113#8:1970\n113#8:1971\n113#8:1972\n113#8:1973\n113#8:2048\n113#8:2049\n113#8:2050\n113#8:2051\n113#8:2052\n113#8:2094\n113#8:2133\n113#8:2186\n75#9:1157\n75#9:2047\n70#10:1160\n68#10,8:1161\n77#10:1199\n70#10:1208\n67#10,9:1209\n77#10:1248\n70#10:1249\n68#10,8:1250\n77#10:1292\n70#10:1631\n68#10,8:1632\n77#10:1670\n70#10:1679\n68#10,8:1680\n77#10:1718\n70#10:1752\n68#10,8:1753\n77#10:1798\n70#10:1808\n68#10,8:1809\n77#10:1890\n70#10:1891\n68#10,8:1892\n77#10:1931\n70#10:1978\n68#10,8:1979\n77#10:2060\n1565#11:1611\n1#12:1803\n85#13:2197\n*S KotlinDebug\n*F\n+ 1 CardWidget.kt\ncom/baicizhan/main/home/plan/allinone/CardWidgetKt\n*L\n80#1:818\n80#1:819,9\n87#1:893,6\n87#1:937\n80#1:947\n203#1:1022\n203#1:1023,10\n203#1:1151\n324#1:1293,6\n329#1:1326,6\n329#1:1367\n324#1:1371\n371#1:1372,6\n371#1:1414\n410#1:1448,6\n410#1:1485\n430#1:1499\n430#1:1500,9\n430#1:1540\n475#1:1575,6\n475#1:1618\n786#1:2095\n786#1:2096,10\n786#1:2137\n80#1:828,6\n80#1:843,3\n80#1:852,2\n85#1:866,6\n85#1:881,3\n85#1:890,2\n87#1:899,6\n87#1:914,3\n87#1:923,2\n87#1:936\n85#1:942\n80#1:946\n149#1:954,6\n149#1:969,3\n149#1:978,2\n149#1:986\n189#1:994,6\n189#1:1009,3\n189#1:1018,2\n203#1:1033,6\n203#1:1048,3\n203#1:1057,2\n204#1:1071,6\n204#1:1086,3\n204#1:1095,2\n204#1:1102\n223#1:1115,6\n223#1:1130,3\n223#1:1139,2\n223#1:1146\n203#1:1150\n189#1:1154\n253#1:1169,6\n253#1:1184,3\n253#1:1193,2\n253#1:1198\n272#1:1218,6\n272#1:1233,3\n272#1:1242,2\n272#1:1247\n297#1:1258,6\n297#1:1273,3\n297#1:1282,2\n297#1:1291\n324#1:1299,6\n324#1:1314,3\n324#1:1323,2\n329#1:1332,6\n329#1:1347,3\n329#1:1356,2\n329#1:1366\n324#1:1370\n371#1:1378,6\n371#1:1393,3\n371#1:1402,2\n371#1:1413\n404#1:1421,6\n404#1:1436,3\n404#1:1445,2\n410#1:1454,6\n410#1:1469,3\n410#1:1478,2\n410#1:1484\n404#1:1489\n430#1:1509,6\n430#1:1524,3\n430#1:1533,2\n430#1:1539\n461#1:1547,6\n461#1:1562,3\n461#1:1571,2\n475#1:1581,6\n475#1:1596,3\n475#1:1605,2\n475#1:1617\n461#1:1621\n527#1:1640,6\n527#1:1655,3\n527#1:1664,2\n527#1:1669\n553#1:1688,6\n553#1:1703,3\n553#1:1712,2\n553#1:1717\n587#1:1725,6\n587#1:1740,3\n587#1:1749,2\n594#1:1761,6\n594#1:1776,3\n594#1:1785,2\n594#1:1797\n587#1:1806\n628#1:1817,6\n628#1:1832,3\n628#1:1841,2\n632#1:1850,6\n632#1:1865,3\n632#1:1874,2\n632#1:1885\n628#1:1889\n664#1:1900,6\n664#1:1915,3\n664#1:1924,2\n664#1:1930\n690#1:1942,6\n690#1:1957,3\n690#1:1966,2\n690#1:1976\n721#1:1987,6\n721#1:2002,3\n721#1:2011,2\n735#1:2020,6\n735#1:2035,3\n735#1:2044,2\n735#1:2055\n721#1:2059\n776#1:2067,6\n776#1:2082,3\n776#1:2091,2\n786#1:2106,6\n786#1:2121,3\n786#1:2130,2\n786#1:2136\n776#1:2140\n805#1:2153,6\n805#1:2168,3\n805#1:2177,2\n805#1:2195\n80#1:834,9\n80#1:854\n85#1:872,9\n85#1:892\n87#1:905,9\n87#1:925\n87#1:934,2\n85#1:940,2\n80#1:944,2\n149#1:960,9\n149#1:980\n149#1:984,2\n189#1:1000,9\n189#1:1020\n203#1:1039,9\n203#1:1059\n204#1:1077,9\n204#1:1097\n204#1:1100,2\n223#1:1121,9\n223#1:1141\n223#1:1144,2\n203#1:1148,2\n189#1:1152,2\n253#1:1175,9\n253#1:1195,3\n272#1:1224,9\n272#1:1244,3\n297#1:1264,9\n297#1:1284\n297#1:1289,2\n324#1:1305,9\n324#1:1325\n329#1:1338,9\n329#1:1358\n329#1:1364,2\n324#1:1368,2\n371#1:1384,9\n371#1:1404\n371#1:1411,2\n404#1:1427,9\n404#1:1447\n410#1:1460,9\n410#1:1480\n410#1:1482,2\n404#1:1487,2\n430#1:1515,9\n430#1:1535\n430#1:1537,2\n461#1:1553,9\n461#1:1573\n475#1:1587,9\n475#1:1607\n475#1:1615,2\n461#1:1619,2\n527#1:1646,9\n527#1:1666,3\n553#1:1694,9\n553#1:1714,3\n587#1:1731,9\n587#1:1751\n594#1:1767,9\n594#1:1787\n594#1:1795,2\n587#1:1804,2\n628#1:1823,9\n628#1:1843\n632#1:1856,9\n632#1:1876\n632#1:1883,2\n628#1:1887,2\n664#1:1906,9\n664#1:1926\n664#1:1928,2\n690#1:1948,9\n690#1:1968\n690#1:1974,2\n721#1:1993,9\n721#1:2013\n735#1:2026,9\n735#1:2046\n735#1:2053,2\n721#1:2057,2\n776#1:2073,9\n776#1:2093\n786#1:2112,9\n786#1:2132\n786#1:2134,2\n776#1:2138,2\n805#1:2159,9\n805#1:2179\n805#1:2193,2\n80#1:846,6\n85#1:884,6\n87#1:917,6\n149#1:972,6\n189#1:1012,6\n203#1:1051,6\n204#1:1089,6\n223#1:1133,6\n253#1:1187,6\n272#1:1236,6\n297#1:1276,6\n324#1:1317,6\n329#1:1350,6\n371#1:1396,6\n404#1:1439,6\n410#1:1472,6\n430#1:1527,6\n461#1:1565,6\n475#1:1599,6\n527#1:1658,6\n553#1:1706,6\n587#1:1743,6\n594#1:1779,6\n628#1:1835,6\n632#1:1868,6\n664#1:1918,6\n690#1:1960,6\n721#1:2005,6\n735#1:2038,6\n776#1:2085,6\n786#1:2124,6\n805#1:2171,6\n85#1:855\n85#1:856,10\n85#1:943\n149#1:948,6\n149#1:987\n189#1:988,6\n204#1:1061\n204#1:1062,9\n204#1:1103\n223#1:1105\n223#1:1106,9\n223#1:1147\n189#1:1155\n404#1:1415,6\n404#1:1490\n461#1:1541,6\n461#1:1622\n587#1:1719,6\n587#1:1807\n632#1:1844,6\n632#1:1886\n690#1:1932\n690#1:1933,9\n690#1:1977\n735#1:2014,6\n735#1:2056\n776#1:2061,6\n776#1:2141\n805#1:2142\n805#1:2143,10\n805#1:2196\n98#1:926,6\n280#1:1202,6\n381#1:1405,6\n436#1:1491,6\n481#1:1608,3\n481#1:1612,3\n534#1:1624,6\n559#1:1672,6\n604#1:1788,6\n806#1:2180,6\n810#1:2187,6\n100#1:932\n101#1:933\n118#1:938\n129#1:939\n162#1:981\n168#1:982\n170#1:983\n202#1:1021\n208#1:1060\n215#1:1098\n217#1:1099\n227#1:1104\n234#1:1142\n236#1:1143\n249#1:1156\n255#1:1158\n257#1:1159\n275#1:1200\n276#1:1201\n305#1:1285\n306#1:1286\n314#1:1287\n315#1:1288\n337#1:1359\n340#1:1360\n345#1:1361\n349#1:1362\n352#1:1363\n417#1:1481\n423#1:1486\n438#1:1497\n439#1:1498\n451#1:1536\n474#1:1574\n530#1:1623\n536#1:1630\n555#1:1671\n561#1:1678\n606#1:1794\n612#1:1799\n615#1:1800\n618#1:1801\n619#1:1802\n641#1:1877\n642#1:1878\n647#1:1879\n649#1:1880\n653#1:1881\n654#1:1882\n679#1:1927\n694#1:1969\n699#1:1970\n704#1:1971\n709#1:1972\n711#1:1973\n747#1:2048\n748#1:2049\n756#1:2050\n757#1:2051\n758#1:2052\n785#1:2094\n795#1:2133\n810#1:2186\n252#1:1157\n741#1:2047\n253#1:1160\n253#1:1161,8\n253#1:1199\n272#1:1208\n272#1:1209,9\n272#1:1248\n297#1:1249\n297#1:1250,8\n297#1:1292\n527#1:1631\n527#1:1632,8\n527#1:1670\n553#1:1679\n553#1:1680,8\n553#1:1718\n594#1:1752\n594#1:1753,8\n594#1:1798\n628#1:1808\n628#1:1809,8\n628#1:1890\n664#1:1891\n664#1:1892,8\n664#1:1931\n721#1:1978\n721#1:1979,8\n721#1:2060\n482#1:1611\n669#1:2197\n*E\n"})
/* loaded from: classes4.dex */
public final class y0 {
    public static final yz.g2 A(Modifier modifier, int i11, int i12, int i13, int i14, int i15, Composer composer, int i16) {
        z(modifier, i11, i12, i13, composer, RecomposeScopeImplKt.updateChangedFlags(i14 | 1), i15);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void B(final x00.a<yz.g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1429186446);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1429186446, i12, -1, "com.baicizhan.main.home.plan.allinone.ChangeBookButton (CardWidget.kt:270)");
            }
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(BackgroundKt.m234backgroundbw27NRU(SizeKt.wrapContentSize$default(Modifier.Companion, null, false, 3, null), bk.b.f0(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4))), Dp.m5115constructorimpl(6), Dp.m5115constructorimpl(2));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m727paddingVpY3zN4, (MutableInteractionSource) rememberedValue, null, false, null, null, aVar, 28, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m267clickableO2vRcR0$default);
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
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_edit_book, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, new TextStyle(bk.b.e0(), TextUnitKt.getSp(12), new FontWeight(400), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (kotlin.jvm.internal.v) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.d0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 C;
                    C = y0.C(x00.a.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return C;
                }
            });
        }
    }

    public static final yz.g2 C(x00.a aVar, int i11, Composer composer, int i12) {
        B(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void D(Modifier modifier, final String str, Composer composer, final int i11, final int i12) {
        final Modifier modifier2;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1108386760);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = i11 | (startRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1108386760, i13, -1, "com.baicizhan.main.home.plan.allinone.Congrats (CardWidget.kt:719)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier modifier4 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_card_4in1_finish, startRestartGroup, 6), "", AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.4325397f, false, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion3, null, false, 3, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion.getCenterHorizontally(), startRestartGroup, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
            x00.a<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            coil.compose.l.b(new ImageRequest.Builder((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(str).L(R.drawable.ic_book_cover_default).r(R.drawable.ic_book_cover_default).f(), "cover", SizeKt.m759height3ABfNKs(SizeKt.m778width3ABfNKs(companion3, Dp.m5115constructorimpl(87)), Dp.m5115constructorimpl(116)), PainterResources_androidKt.painterResource(R.drawable.ic_book_cover_default, startRestartGroup, 6), null, null, null, null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, startRestartGroup, 432, 6, 64496);
            startRestartGroup = startRestartGroup;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_card_4in1_congrats, startRestartGroup, 6), "congrats", OffsetKt.m686offsetVpY3zN4$default(SizeKt.m759height3ABfNKs(SizeKt.m778width3ABfNKs(companion3, Dp.m5115constructorimpl(192)), Dp.m5115constructorimpl(46)), 0.0f, Dp.m5115constructorimpl(-24), 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.b0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 E;
                    E = y0.E(Modifier.this, str, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return E;
                }
            });
        }
    }

    public static final yz.g2 E(Modifier modifier, String str, int i11, int i12, Composer composer, int i13) {
        D(modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void F(Modifier modifier, final int i11, final int i12, final int i13, Composer composer, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        Composer composer2;
        final Modifier modifier3;
        Composer composer3;
        int i17;
        Composer startRestartGroup = composer.startRestartGroup(208369868);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= startRestartGroup.changed(i12) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= startRestartGroup.changed(i13) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i16 & 1171) != 1170, i16 & 1)) {
            Modifier modifier4 = i18 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(208369868, i16, -1, "com.baicizhan.main.home.plan.allinone.DataArea (CardWidget.kt:322)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            Alignment.Companion companion = Alignment.Companion;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion3, null, false, 3, null);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), startRestartGroup, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
            x00.a<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            if (i12 > 0) {
                startRestartGroup.startReplaceGroup(1387339487);
                float f11 = 6;
                BoxKt.Box(BackgroundKt.m234backgroundbw27NRU(SizeKt.m773size3ABfNKs(companion3, Dp.m5115constructorimpl(f11)), bk.b.e0(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
                SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion3, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
                i17 = 0;
                TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_mastered_word, new Object[]{Integer.valueOf(i12)}, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, o1.c(), startRestartGroup, 0, 1572864, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                composer3 = startRestartGroup;
                SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion3, Dp.m5115constructorimpl(12)), composer3, 6);
            } else {
                composer3 = startRestartGroup;
                i17 = 0;
                composer3.startReplaceGroup(1375941934);
            }
            composer3.endReplaceGroup();
            float f12 = 6;
            BoxKt.Box(BackgroundKt.m234backgroundbw27NRU(SizeKt.m773size3ABfNKs(companion3, Dp.m5115constructorimpl(f12)), bk.b.g0(), RoundedCornerShapeKt.getCircleShape()), composer3, i17);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion3, Dp.m5115constructorimpl(f12)), composer3, 6);
            composer2 = composer3;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_learned_word, new Object[]{Integer.valueOf(i11)}, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, o1.c(), composer2, 0, 1572864, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            composer2.endNode();
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_word, new Object[]{Integer.valueOf(i13)}, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, o1.c(), composer2, 0, 1572864, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.c0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 G;
                    G = y0.G(Modifier.this, i11, i12, i13, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                    return G;
                }
            });
        }
    }

    public static final yz.g2 G(Modifier modifier, int i11, int i12, int i13, int i14, int i15, Composer composer, int i16) {
        F(modifier, i11, i12, i13, composer, RecomposeScopeImplKt.updateChangedFlags(i14 | 1), i15);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void H(@m80.l Modifier modifier, @m80.k final String text, @m80.k final x00.a<yz.g2> click, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(text, "text");
        kotlin.jvm.internal.g0.p(click, "click");
        Composer startRestartGroup = composer.startRestartGroup(31742264);
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
            i13 |= startRestartGroup.changed(text) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(click) ? 256 : 128;
        }
        int i15 = i13;
        if (startRestartGroup.shouldExecute((i15 & 147) != 146, i15 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(31742264, i15, -1, "com.baicizhan.main.home.plan.allinone.ErrBtn (CardWidget.kt:551)");
            }
            Modifier m246borderxT4_qwU = BorderKt.m246borderxT4_qwU(modifier4, Dp.m5115constructorimpl(1), bk.b.H(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4)));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(ClickableKt.m267clickableO2vRcR0$default(m246borderxT4_qwU, (MutableInteractionSource) rememberedValue, null, false, null, null, click, 28, null), Dp.m5115constructorimpl(8));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m726padding3ABfNKs);
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
            composer2 = startRestartGroup;
            Modifier modifier5 = modifier4;
            TextKt.m1845Text4IGK_g(text, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, new TextStyle(bk.b.x(), TextUnitKt.getSp(16), new FontWeight(400), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (kotlin.jvm.internal.v) null), composer2, (i15 >> 3) & 14, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.n0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 I;
                    I = y0.I(Modifier.this, text, click, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return I;
                }
            });
        }
    }

    public static final yz.g2 I(Modifier modifier, String str, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        H(modifier, str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void J(@m80.l Modifier modifier, @m80.k final String msg, @m80.k final String btnMsg, @m80.k final x00.a<yz.g2> retry, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(msg, "msg");
        kotlin.jvm.internal.g0.p(btnMsg, "btnMsg");
        kotlin.jvm.internal.g0.p(retry, "retry");
        Composer startRestartGroup = composer.startRestartGroup(-2119666006);
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
            i13 |= startRestartGroup.changed(msg) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(btnMsg) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(retry) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2119666006, i13, -1, "com.baicizhan.main.home.plan.allinone.ErrorCard (CardWidget.kt:626)");
            }
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion3, null, false, 3, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), companion.getCenterHorizontally(), startRestartGroup, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
            x00.a<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifier5 = modifier4;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_card_4in1_oops, startRestartGroup, 6), "", SizeKt.m759height3ABfNKs(SizeKt.m778width3ABfNKs(companion3, Dp.m5115constructorimpl(160)), Dp.m5115constructorimpl(166)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(16)), startRestartGroup, 6);
            int i15 = i13 >> 3;
            TextKt.m1845Text4IGK_g(msg, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, o1.e(), startRestartGroup, i15 & 14, 1572864, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            startRestartGroup = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(24)), startRestartGroup, 6);
            H(SizeKt.m778width3ABfNKs(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(38)), Dp.m5115constructorimpl(89)), btnMsg, retry, startRestartGroup, (i15 & 112) | 6 | (i15 & 896), 0);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.x0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 K;
                    K = y0.K(Modifier.this, msg, btnMsg, retry, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return K;
                }
            });
        }
    }

    public static final yz.g2 K(Modifier modifier, String str, String str2, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        J(modifier, str, str2, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void L(Modifier modifier, final int i11, final String str, final boolean z11, final x00.a<yz.g2> aVar, Composer composer, final int i12, final int i13) {
        Modifier modifier2;
        int i14;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(1154310896);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
            modifier2 = modifier;
        } else if ((i12 & 6) == 0) {
            modifier2 = modifier;
            i14 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i12;
        } else {
            modifier2 = modifier;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= startRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= startRestartGroup.changedInstance(aVar) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i14 & 9363) != 9362, i14 & 1)) {
            Modifier modifier4 = i15 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1154310896, i14, -1, "com.baicizhan.main.home.plan.allinone.FinishTitleArea (CardWidget.kt:774)");
            }
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(modifier4, null, false, 3, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getCenterHorizontally(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i16 = i14;
            TextKt.m1845Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, o1.a(), startRestartGroup, (i14 >> 6) & 14, 1572864, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            Modifier.Companion companion3 = Modifier.Companion;
            float f11 = 8;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
            x00.a<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.word_plan_card_done_summary_all_learnt, new Object[]{Integer.valueOf(i11)}, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, o1.e(), startRestartGroup, 0, 1572864, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            composer2 = startRestartGroup;
            if (z11) {
                composer2.startReplaceGroup(-285400569);
                SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion3, Dp.m5115constructorimpl(f11)), composer2, 6);
                R(aVar, composer2, (i16 >> 12) & 14);
            } else {
                composer2.startReplaceGroup(-311304200);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.p0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 M;
                    M = y0.M(Modifier.this, i11, str, z11, aVar, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return M;
                }
            });
        }
    }

    public static final yz.g2 M(Modifier modifier, int i11, String str, boolean z11, x00.a aVar, int i12, int i13, Composer composer, int i14) {
        L(modifier, i11, str, z11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void N(final x00.a<yz.g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(530721585);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changedInstance(aVar) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(530721585, i12, -1, "com.baicizhan.main.home.plan.allinone.FinishTodayTitle (CardWidget.kt:402)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier wrapContentSize$default2 = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), startRestartGroup, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default2);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_title_fucking_great, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, o1.b(), startRestartGroup, 0, 1572864, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_card_4in1_bouquet, startRestartGroup, 6), "", SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            startRestartGroup.endNode();
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_title_today_plan_done, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 0, 0, 131070);
            startRestartGroup = startRestartGroup;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(12)), startRestartGroup, 6);
            R(aVar, startRestartGroup, i12 & 14);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.q0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 O;
                    O = y0.O(x00.a.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return O;
                }
            });
        }
    }

    public static final yz.g2 O(x00.a aVar, int i11, Composer composer, int i12) {
        N(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void P(@m80.l Modifier modifier, final boolean z11, final boolean z12, @m80.k final String bookName, final int i11, @m80.k final String bookImg, @m80.k final x00.a<yz.g2> buttonClick, @m80.k final x00.a<yz.g2> daka, @m80.k final x00.a<yz.g2> showOff, @m80.l Composer composer, final int i12, final int i13) {
        Modifier modifier2;
        int i14;
        Composer composer2;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(bookName, "bookName");
        kotlin.jvm.internal.g0.p(bookImg, "bookImg");
        kotlin.jvm.internal.g0.p(buttonClick, "buttonClick");
        kotlin.jvm.internal.g0.p(daka, "daka");
        kotlin.jvm.internal.g0.p(showOff, "showOff");
        Composer startRestartGroup = composer.startRestartGroup(2002842748);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
            modifier2 = modifier;
        } else if ((i12 & 6) == 0) {
            modifier2 = modifier;
            i14 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i12;
        } else {
            modifier2 = modifier;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= startRestartGroup.changed(z11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= startRestartGroup.changed(z12) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i14 |= startRestartGroup.changed(bookName) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i14 |= startRestartGroup.changed(i11) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i14 |= startRestartGroup.changed(bookImg) ? 131072 : 65536;
        }
        if ((1572864 & i12) == 0) {
            i14 |= startRestartGroup.changedInstance(buttonClick) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i14 |= startRestartGroup.changedInstance(daka) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i14 |= startRestartGroup.changedInstance(showOff) ? 67108864 : 33554432;
        }
        if (startRestartGroup.shouldExecute((38347923 & i14) != 38347922, i14 & 1)) {
            Modifier modifier4 = i15 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002842748, i14, -1, "com.baicizhan.main.home.plan.allinone.FinishWidget (CardWidget.kt:585)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, 3, null);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getCenterHorizontally(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion3, null, false, 3, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopEnd(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
            x00.a<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            ColumnScopeInstance columnScopeInstance2 = columnScopeInstance;
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i16 = i14 >> 12;
            D(null, bookImg, startRestartGroup, i16 & 112, 1);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i17 = i14;
            float f11 = 16;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_format_show_off, startRestartGroup, 6), PaddingKt.m730paddingqDBjuR0$default(ClickableKt.m267clickableO2vRcR0$default(companion3, (MutableInteractionSource) rememberedValue, null, false, null, null, showOff, 28, null), 0.0f, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, 9, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(o1.e(), bk.b.D(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, 0, 0, 65532);
            startRestartGroup.endNode();
            int i18 = i17 >> 9;
            Modifier modifier5 = modifier4;
            L(OffsetKt.m686offsetVpY3zN4$default(companion3, 0.0f, Dp.m5115constructorimpl(-34), 1, null), i11, bookName, z11, daka, startRestartGroup, (i18 & 57344) | (i18 & 112) | 6 | ((i17 >> 3) & 896) | ((i17 << 6) & 7168), 0);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(14)), startRestartGroup, 6);
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(PaddingKt.m730paddingqDBjuR0$default(companion3, Dp.m5115constructorimpl(f11), 0.0f, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 2, null), Dp.m5115constructorimpl(56));
            if (!z12) {
                columnScopeInstance2 = null;
            }
            i0(m759height3ABfNKs, columnScopeInstance2 != null ? Integer.valueOf(R.string.card_4in1_format_all_done_learn_other).intValue() : R.string.card_4in1_button_review, buttonClick, startRestartGroup, (i16 & 896) | 6, 0);
            composer2 = startRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.f0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Q;
                    Q = y0.Q(Modifier.this, z11, z12, bookName, i11, bookImg, buttonClick, daka, showOff, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return Q;
                }
            });
        }
    }

    public static final yz.g2 Q(Modifier modifier, boolean z11, boolean z12, String str, int i11, String str2, x00.a aVar, x00.a aVar2, x00.a aVar3, int i12, int i13, Composer composer, int i14) {
        P(modifier, z11, z12, str, i11, str2, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void R(final x00.a<yz.g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1587614764);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1587614764, i12, -1, "com.baicizhan.main.home.plan.allinone.GoDakaButton (CardWidget.kt:428)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            float f11 = 1;
            Modifier m729paddingqDBjuR0 = PaddingKt.m729paddingqDBjuR0(BackgroundKt.m234backgroundbw27NRU(ClickableKt.m267clickableO2vRcR0$default(wrapContentSize$default, (MutableInteractionSource) rememberedValue, null, false, null, null, aVar, 28, null), bk.b.p0(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(2))), Dp.m5115constructorimpl(6), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m729paddingqDBjuR0);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_title_daka, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, new TextStyle(bk.b.A0(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (kotlin.jvm.internal.v) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_card_4in1_daka_right, startRestartGroup, 6), "", SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(16)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 432, 120);
            composer2 = startRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.m0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 S;
                    S = y0.S(x00.a.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return S;
                }
            });
        }
    }

    public static final yz.g2 S(x00.a aVar, int i11, Composer composer, int i12) {
        R(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void T(@m80.l PaddingValues paddingValues, @m80.k final x00.p<? super Composer, ? super Integer, yz.g2> content, @m80.l Composer composer, final int i11, final int i12) {
        PaddingValues paddingValues2;
        int i13;
        final PaddingValues paddingValues3;
        kotlin.jvm.internal.g0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(705147313);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            paddingValues2 = paddingValues;
        } else if ((i11 & 6) == 0) {
            paddingValues2 = paddingValues;
            i13 = (startRestartGroup.changed(paddingValues2) ? 4 : 2) | i11;
        } else {
            paddingValues2 = paddingValues;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            paddingValues3 = i14 != 0 ? PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(0)) : paddingValues2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(705147313, i13, -1, "com.baicizhan.main.home.plan.allinone.LearnCard4in1 (CardWidget.kt:250)");
            }
            Configuration configuration = (Configuration) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
            Modifier padding = PaddingKt.padding(BackgroundKt.m235backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(PaddingKt.m728paddingVpY3zN4$default(Modifier.Companion, Dp.m5115constructorimpl(16), 0.0f, 2, null), 0.0f, 1, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4))), bk.b.A0(), null, 2, null), paddingValues3);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
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
            startRestartGroup.startReplaceGroup(-939755081);
            qb.c.b("LearnCard", "width = " + configuration.screenWidthDp + ", height = " + configuration.screenHeightDp, new Object[0]);
            content.invoke(startRestartGroup, Integer.valueOf((i13 >> 3) & 14));
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            paddingValues3 = paddingValues2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.w0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 U;
                    U = y0.U(PaddingValues.this, content, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return U;
                }
            });
        }
    }

    public static final yz.g2 U(PaddingValues paddingValues, x00.p pVar, int i11, int i12, Composer composer, int i13) {
        T(paddingValues, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void V(final int i11, int i12, int i13, Composer composer, final int i14) {
        int i15;
        final int i16;
        Composer composer2;
        final int i17;
        Composer startRestartGroup = composer.startRestartGroup(1091169561);
        if ((i14 & 6) == 0) {
            i15 = (startRestartGroup.changed(i11) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= startRestartGroup.changed(i12) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= startRestartGroup.changed(i13) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i15 & 147) != 146, i15 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1091169561, i15, -1, "com.baicizhan.main.home.plan.allinone.LearningDataArea (CardWidget.kt:459)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            int i18 = i15;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(i11, startRestartGroup, i18 & 14), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, new TextStyle(bk.b.B(), TextUnitKt.getSp(14), new FontWeight(400), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777208, (kotlin.jvm.internal.v) null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(16)), startRestartGroup, 6);
            Modifier wrapContentSize$default2 = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getBottom(), startRestartGroup, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default2);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            boolean z11 = ((i18 & 896) == 256) | ((i18 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.pushStyle(new SpanStyle(bk.b.x(), TextUnitKt.getSp(24), new FontWeight(600), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (kotlin.jvm.internal.v) null));
                StringBuilder sb2 = new StringBuilder();
                i17 = i12;
                sb2.append(i17);
                sb2.append(" ");
                builder.append(sb2.toString());
                builder.pop();
                builder.pushStyle(new SpanStyle(bk.b.B(), TextUnitKt.getSp(16), new FontWeight(400), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65528, (kotlin.jvm.internal.v) null));
                StringBuilder sb3 = new StringBuilder();
                sb3.append("/ ");
                i16 = i13;
                sb3.append(i16);
                builder.append(sb3.toString());
                rememberedValue = builder.toAnnotatedString();
                startRestartGroup.updateRememberedValue(rememberedValue);
            } else {
                i17 = i12;
                i16 = i13;
            }
            BasicTextKt.m1032BasicTextCL7eQgs((AnnotatedString) rememberedValue, null, null, null, 0, false, 0, 0, null, null, null, startRestartGroup, 0, 0, 2046);
            composer2 = startRestartGroup;
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i16 = i13;
            composer2 = startRestartGroup;
            i17 = i12;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.i0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 W;
                    W = y0.W(i11, i17, i16, i14, (Composer) obj, ((Integer) obj2).intValue());
                    return W;
                }
            });
        }
    }

    public static final yz.g2 W(int i11, int i12, int i13, int i14, Composer composer, int i15) {
        V(i11, i12, i13, composer, RecomposeScopeImplKt.updateChangedFlags(i14 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void X(@m80.l Modifier modifier, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(564012986);
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
        if (startRestartGroup.shouldExecute((i13 & 3) != 2, i13 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(564012986, i13, -1, "com.baicizhan.main.home.plan.allinone.Loading (CardWidget.kt:662)");
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.loading_dots_normal_default, startRestartGroup, 6), "", RotateKt.rotate(SizeKt.m773size3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(30)), Y(InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition(null, startRestartGroup, 0, 1), 0.0f, 360.0f, AnimationSpecKt.m136infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(1500, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), null, startRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.r0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Z;
                    Z = y0.Z(Modifier.this, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return Z;
                }
            });
        }
    }

    public static final float Y(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final yz.g2 Z(Modifier modifier, int i11, int i12, Composer composer, int i13) {
        X(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a0(@m80.l Modifier modifier, @m80.k final m1 learnModel, @m80.k final m1 reviewModel, final boolean z11, @m80.l final th.a aVar, @m80.k final x00.a<yz.g2> adClick, @m80.k final x00.a<yz.g2> learn, @m80.k final x00.a<yz.g2> review, @m80.k final x00.a<yz.g2> daka, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(learnModel, "learnModel");
        kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
        kotlin.jvm.internal.g0.p(adClick, "adClick");
        kotlin.jvm.internal.g0.p(learn, "learn");
        kotlin.jvm.internal.g0.p(review, "review");
        kotlin.jvm.internal.g0.p(daka, "daka");
        Composer startRestartGroup = composer.startRestartGroup(482224564);
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
            i13 |= startRestartGroup.changed(learnModel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(reviewModel) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changed(z11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= startRestartGroup.changed(aVar) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= startRestartGroup.changedInstance(adClick) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= startRestartGroup.changedInstance(learn) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= startRestartGroup.changedInstance(review) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i13 |= startRestartGroup.changedInstance(daka) ? 67108864 : 33554432;
        }
        int i15 = i13;
        if (startRestartGroup.shouldExecute((38347923 & i15) != 38347922, i15 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(482224564, i15, -1, "com.baicizhan.main.home.plan.allinone.PlanAreaDouble (CardWidget.kt:187)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, false, 3, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion.getStart(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i16 = i15 >> 15;
            k0(null, z11, aVar != null ? aVar.m() : null, daka, adClick, startRestartGroup, ((i15 >> 6) & 112) | (i16 & 7168) | ((i15 >> 3) & 57344), 1);
            composer2 = startRestartGroup;
            Modifier.Companion companion3 = Modifier.Companion;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(28)), composer2, 6);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer2, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion3);
            x00.a<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f11 = 6;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), 0.0f, 0.0f, Dp.m5115constructorimpl(f11), 0.0f, 11, null);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m730paddingqDBjuR0$default);
            x00.a<ComposeUiNode> constructor3 = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion2.getSetModifier());
            V(R.string.card_4in1_title_learned, learnModel.h(), learnModel.g(), composer2, 6);
            float f12 = 32;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(f12)), composer2, 6);
            float f13 = 56;
            i0(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(f13)), R.string.card_4in1_button_learn, learn, composer2, ((i15 >> 12) & 896) | 54, 0);
            composer2.endNode();
            Modifier m730paddingqDBjuR0$default2 = PaddingKt.m730paddingqDBjuR0$default(RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m730paddingqDBjuR0$default2);
            x00.a<ComposeUiNode> constructor4 = companion2.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl4, columnMeasurePolicy3, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion2.getSetModifier());
            V(R.string.card_4in1_title_reviewed, reviewModel.h(), reviewModel.g(), composer2, 6);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(f12)), composer2, 6);
            i0(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(f13)), R.string.card_4in1_button_review, review, composer2, (i16 & 896) | 54, 0);
            composer2.endNode();
            composer2.endNode();
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.k0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 b02;
                    b02 = y0.b0(Modifier.this, learnModel, reviewModel, z11, aVar, adClick, learn, review, daka, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return b02;
                }
            });
        }
    }

    public static final yz.g2 b0(Modifier modifier, m1 m1Var, m1 m1Var2, boolean z11, th.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, x00.a aVar5, int i11, int i12, Composer composer, int i13) {
        a0(modifier, m1Var, m1Var2, z11, aVar, aVar2, aVar3, aVar4, aVar5, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c0(@m80.l Modifier modifier, @m80.k final m1 reviewModel, final boolean z11, @m80.l final th.a aVar, @m80.k final x00.a<yz.g2> adClick, @m80.k final x00.a<yz.g2> study, @m80.k final x00.a<yz.g2> daka, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        boolean z12;
        kotlin.jvm.internal.g0.p(reviewModel, "reviewModel");
        kotlin.jvm.internal.g0.p(adClick, "adClick");
        kotlin.jvm.internal.g0.p(study, "study");
        kotlin.jvm.internal.g0.p(daka, "daka");
        Composer startRestartGroup = composer.startRestartGroup(943088249);
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
            i13 |= startRestartGroup.changed(reviewModel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            z12 = z11;
            i13 |= startRestartGroup.changed(z12) ? 256 : 128;
        } else {
            z12 = z11;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changed(aVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= startRestartGroup.changedInstance(adClick) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= startRestartGroup.changedInstance(study) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= startRestartGroup.changedInstance(daka) ? 1048576 : 524288;
        }
        if (startRestartGroup.shouldExecute((599187 & i13) != 599186, i13 & 1)) {
            Modifier modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(943088249, i13, -1, "com.baicizhan.main.home.plan.allinone.PlanAreaSingle (CardWidget.kt:147)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, false, 3, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i15 = i13 >> 9;
            k0(null, z12, aVar != null ? aVar.m() : null, daka, adClick, startRestartGroup, ((i13 >> 3) & 112) | (i15 & 7168) | (57344 & i13), 1);
            startRestartGroup = startRestartGroup;
            Modifier.Companion companion2 = Modifier.Companion;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion2, Dp.m5115constructorimpl(28)), startRestartGroup, 6);
            V(R.string.card_4in1_title_reviewed, reviewModel.h(), reviewModel.g(), startRestartGroup, 6);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion2, Dp.m5115constructorimpl(32)), startRestartGroup, 6);
            i0(SizeKt.m759height3ABfNKs(companion2, Dp.m5115constructorimpl(56)), R.string.card_4in1_button_review, study, startRestartGroup, (i15 & 896) | 54, 0);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.j0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 d02;
                    d02 = y0.d0(Modifier.this, reviewModel, z11, aVar, adClick, study, daka, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return d02;
                }
            });
        }
    }

    public static final yz.g2 d0(Modifier modifier, m1 m1Var, boolean z11, th.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, int i11, int i12, Composer composer, int i13) {
        c0(modifier, m1Var, z11, aVar, aVar2, aVar3, aVar4, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void e0(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1404211214);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1404211214, i11, -1, "com.baicizhan.main.home.plan.allinone.PreviewContent (CardWidget.kt:803)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.s0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 f02;
                        f02 = y0.f0();
                        return f02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            N((x00.a) rememberedValue, startRestartGroup, 6);
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(56));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.plan.allinone.t0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 g02;
                        g02 = y0.g0();
                        return g02;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            i0(m759height3ABfNKs, R.string.card_4in1_button_learn, (x00.a) rememberedValue2, startRestartGroup, 438, 0);
            D(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), "", startRestartGroup, 54, 0);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.u0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 h02;
                    h02 = y0.h0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return h02;
                }
            });
        }
    }

    public static final yz.g2 f0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 g0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 h0(int i11, Composer composer, int i12) {
        e0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void i0(@m80.l Modifier modifier, final int i11, @m80.k final x00.a<yz.g2> click, @m80.l Composer composer, final int i12, final int i13) {
        Modifier modifier2;
        int i14;
        Composer composer2;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(click, "click");
        Composer startRestartGroup = composer.startRestartGroup(205026282);
        int i15 = i13 & 1;
        if (i15 != 0) {
            i14 = i12 | 6;
            modifier2 = modifier;
        } else if ((i12 & 6) == 0) {
            modifier2 = modifier;
            i14 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i12;
        } else {
            modifier2 = modifier;
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i14 |= startRestartGroup.changedInstance(click) ? 256 : 128;
        }
        int i16 = i14;
        if (startRestartGroup.shouldExecute((i16 & 147) != 146, i16 & 1)) {
            Modifier modifier4 = i15 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(205026282, i16, -1, "com.baicizhan.main.home.plan.allinone.StudyButton (CardWidget.kt:525)");
            }
            float f11 = 7;
            Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), bk.b.e0(), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f11)));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(ClickableKt.m267clickableO2vRcR0$default(m234backgroundbw27NRU, (MutableInteractionSource) rememberedValue, null, false, null, null, click, 28, null), Dp.m5115constructorimpl(f11));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m726padding3ABfNKs);
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
            composer2 = startRestartGroup;
            modifier3 = modifier4;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(i11, startRestartGroup, (i16 >> 3) & 14), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, new TextStyle(bk.b.A0(), TextUnitKt.getSp(18), new FontWeight(600), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (kotlin.jvm.internal.v) null), composer2, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.o0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 j02;
                    j02 = y0.j0(Modifier.this, i11, click, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return j02;
                }
            });
        }
    }

    public static final yz.g2 j0(Modifier modifier, int i11, x00.a aVar, int i12, int i13, Composer composer, int i14) {
        i0(modifier, i11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void k0(@m80.l Modifier modifier, final boolean z11, @m80.l final String str, @m80.k final x00.a<yz.g2> daka, @m80.k final x00.a<yz.g2> bookAdClick, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        Modifier modifier3;
        kotlin.jvm.internal.g0.p(daka, "daka");
        kotlin.jvm.internal.g0.p(bookAdClick, "bookAdClick");
        Composer startRestartGroup = composer.startRestartGroup(-1022147878);
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
            i13 |= startRestartGroup.changed(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(daka) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= startRestartGroup.changedInstance(bookAdClick) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i13 & 9363) != 9362, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1022147878, i13, -1, "com.baicizhan.main.home.plan.allinone.TitleArea (CardWidget.kt:369)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.Companion.getTop(), startRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            int i15 = i13 >> 6;
            m0(z11, daka, startRestartGroup, ((i13 >> 3) & 14) | (i15 & 112));
            if (str != null) {
                startRestartGroup.startReplaceGroup(-1467841266);
                Modifier.Companion companion2 = Modifier.Companion;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                int i16 = i15 & 14;
                modifier3 = modifier4;
                TextKt.m1845Text4IGK_g(str, ClickableKt.m267clickableO2vRcR0$default(companion2, (MutableInteractionSource) rememberedValue, null, false, null, null, bookAdClick, 28, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, new TextStyle(bk.b.e0(), TextUnitKt.getSp(12), new FontWeight(500), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (kotlin.jvm.internal.v) null), startRestartGroup, i16, 0, 65532);
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                modifier3 = modifier4;
                composer2.startReplaceGroup(-1480655612);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.l0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 l02;
                    l02 = y0.l0(Modifier.this, z11, str, daka, bookAdClick, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return l02;
                }
            });
        }
    }

    public static final yz.g2 l0(Modifier modifier, boolean z11, String str, x00.a aVar, x00.a aVar2, int i11, int i12, Composer composer, int i13) {
        k0(modifier, z11, str, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void m0(final boolean z11, final x00.a<yz.g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1564296038);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1564296038, i12, -1, "com.baicizhan.main.home.plan.allinone.TodayTitle (CardWidget.kt:393)");
            }
            if (z11) {
                startRestartGroup.startReplaceGroup(-1548027685);
                N(aVar, startRestartGroup, (i12 >> 3) & 14);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(-1547975357);
                composer2 = startRestartGroup;
                TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_title_today_plan, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, o1.b(), composer2, 0, 1572864, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.e0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 n02;
                    n02 = y0.n0(z11, aVar, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return n02;
                }
            });
        }
    }

    public static final yz.g2 n0(boolean z11, x00.a aVar, int i11, Composer composer, int i12) {
        m0(z11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void o0(@m80.l Modifier modifier, @m80.k final x00.a<yz.g2> onUpgrade, @m80.l Composer composer, final int i11, final int i12) {
        final Modifier modifier2;
        int i13;
        Composer composer2;
        kotlin.jvm.internal.g0.p(onUpgrade, "onUpgrade");
        Composer startRestartGroup = composer.startRestartGroup(-300235255);
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
            i13 |= startRestartGroup.changedInstance(onUpgrade) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-300235255, i13, -1, "com.baicizhan.main.home.plan.allinone.Upgrading (CardWidget.kt:688)");
            }
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.Companion;
            float f11 = 45;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion2, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_card_4in1_upgrading, startRestartGroup, 6), "", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion2, Dp.m5115constructorimpl(24)), startRestartGroup, 6);
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_upgrading_title, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(o1.d(), bk.b.x(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion2, Dp.m5115constructorimpl(8)), startRestartGroup, 6);
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_upgrading_content, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(o1.e(), bk.b.B(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion2, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            Modifier modifier4 = modifier3;
            i0(SizeKt.m759height3ABfNKs(companion2, Dp.m5115constructorimpl(56)), R.string.card_4in1_button_upgrading, onUpgrade, startRestartGroup, ((i13 << 3) & 896) | 54, 0);
            composer2 = startRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.g0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 p02;
                    p02 = y0.p0(Modifier.this, onUpgrade, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return p02;
                }
            });
        }
    }

    public static final yz.g2 p0(Modifier modifier, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        o0(modifier, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void x(@m80.l Modifier modifier, @m80.k final p1 model, @m80.k final x00.a<yz.g2> editBook, @m80.k final x00.a<yz.g2> upgrade, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Modifier.Companion companion;
        Modifier modifier4;
        int i14;
        int i15;
        Composer composer2;
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(editBook, "editBook");
        kotlin.jvm.internal.g0.p(upgrade, "upgrade");
        Composer startRestartGroup = composer.startRestartGroup(-1880335620);
        int i16 = i12 & 1;
        if (i16 != 0) {
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
            i13 |= startRestartGroup.changed(model) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(editBook) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(upgrade) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            Modifier modifier5 = i16 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1880335620, i13, -1, "com.baicizhan.main.home.plan.allinone.BookArea (CardWidget.kt:78)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), null, false, 3, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion2.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier modifier6 = modifier5;
            Modifier.Companion companion4 = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion4);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i17 = i13;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.card_4in1_study_now, startRestartGroup, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, o1.c(), startRestartGroup, 0, 1572864, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), startRestartGroup, 54);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            if (model.o()) {
                startRestartGroup.startReplaceGroup(1892793897);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = InteractionSourceKt.MutableInteractionSource();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                modifier4 = modifier6;
                i14 = 6;
                i15 = 0;
                Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(companion4, (MutableInteractionSource) rememberedValue, null, false, null, null, upgrade, 28, null);
                companion = companion4;
                float f11 = 0;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_word_plan_book_upgrade, startRestartGroup, 6), "", SizeKt.m773size3ABfNKs(PaddingKt.m729paddingqDBjuR0(m267clickableO2vRcR0$default, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(8), Dp.m5115constructorimpl(f11)), Dp.m5115constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
                composer2 = startRestartGroup;
            } else {
                companion = companion4;
                modifier4 = modifier6;
                i14 = 6;
                i15 = 0;
                composer2 = startRestartGroup;
                composer2.startReplaceGroup(1888883464);
            }
            composer2.endReplaceGroup();
            Composer composer3 = composer2;
            int i18 = i14;
            TextKt.m1845Text4IGK_g(model.l(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, new TextStyle(bk.b.x(), TextUnitKt.getSp(20), new FontWeight(600), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646136, (kotlin.jvm.internal.v) null), composer3, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            startRestartGroup = composer3;
            Modifier.Companion companion5 = companion;
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion5, 1.0f, false, 2, null), startRestartGroup, i15);
            B(editBook, startRestartGroup, (i17 >> 6) & 14);
            startRestartGroup.endNode();
            float f12 = 16;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion5, Dp.m5115constructorimpl(f12)), startRestartGroup, i18);
            z(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), model.m(), model.n(), model.p(), startRestartGroup, 6, 0);
            F(PaddingKt.m730paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.0f, Dp.m5115constructorimpl(f12), 0.0f, 0.0f, 13, null), model.m(), model.n(), model.p(), startRestartGroup, 6, 0);
            startRestartGroup.endNode();
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.h0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 y11;
                    y11 = y0.y(Modifier.this, model, editBook, upgrade, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return y11;
                }
            });
        }
    }

    public static final yz.g2 y(Modifier modifier, p1 p1Var, x00.a aVar, x00.a aVar2, int i11, int i12, Composer composer, int i13) {
        x(modifier, p1Var, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void z(Modifier modifier, final int i11, final int i12, final int i13, Composer composer, final int i14, final int i15) {
        Modifier modifier2;
        int i16;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-1391512563);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            modifier2 = modifier;
        } else if ((i14 & 6) == 0) {
            modifier2 = modifier;
            i16 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i14;
        } else {
            modifier2 = modifier;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= startRestartGroup.changed(i12) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= startRestartGroup.changed(i13) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i16 & 1171) != 1170, i16 & 1)) {
            Modifier modifier4 = i17 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1391512563, i16, -1, "com.baicizhan.main.home.plan.allinone.BookProgress (CardWidget.kt:295)");
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            float f11 = i13;
            Modifier.Companion companion2 = Modifier.Companion;
            float f12 = 4;
            Modifier modifier5 = modifier4;
            ProgressIndicatorKt.m1729LinearProgressIndicator_5eSRE(i11 / f11, SizeKt.m759height3ABfNKs(ClipKt.clip(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f12))), Dp.m5115constructorimpl(f12)), bk.b.g0(), bk.b.J(), 0, startRestartGroup, 3456, 16);
            ProgressIndicatorKt.m1729LinearProgressIndicator_5eSRE(i12 / f11, SizeKt.m759height3ABfNKs(ClipKt.clip(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(f12))), Dp.m5115constructorimpl(f12)), bk.b.e0(), bk.b.J(), 0, startRestartGroup, 3456, 16);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.v0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 A;
                    A = y0.A(Modifier.this, i11, i12, i13, i14, i15, (Composer) obj, ((Integer) obj2).intValue());
                    return A;
                }
            });
        }
    }
}
