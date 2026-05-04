package com.baicizhan.main.home.experiment;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.BackHandlerKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material.SurfaceKt;
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
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import coil.compose.AsyncImagePainter;
import com.baicizhan.base.LoadingDialogActivity;
import com.baicizhan.client.business.util.Standard_extKt;
import com.baicizhan.main.home.experiment.a4;
import com.baicizhan.main.home.experiment.r0;
import com.baicizhan.main.home.experiment.t3;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.baicizhan.platform.base.widget.WidgetsKt;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/experiment/HomeActivityKt\n+ 2 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 10 Composer.kt\nandroidx/compose/runtime/Updater\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 13 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 14 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 15 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 16 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 17 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 18 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 19 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 20 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 21 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 22 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 23 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 24 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n+ 25 collections_ext.kt\ncom/baicizhan/client/business/util/Collections_extKt\n+ 26 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 27 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1233:1\n46#2,7:1234\n86#3,6:1241\n75#4:1247\n75#4:1571\n75#4:1574\n75#4:1580\n75#4:1586\n75#4:1588\n75#4:2051\n75#4:2289\n1247#5,6:1248\n1247#5,6:1258\n1247#5,6:1267\n1247#5,6:1314\n1247#5,6:1320\n1247#5,6:1399\n1247#5,6:1410\n1247#5,6:1534\n1247#5,6:1541\n1247#5,6:1548\n1247#5,6:1555\n1247#5,6:1565\n1247#5,6:1635\n1247#5,6:1679\n1247#5,6:1685\n1247#5,3:1698\n1250#5,3:1702\n1247#5,6:1705\n1247#5,6:1711\n1247#5,6:1760\n1247#5,6:1816\n1247#5,6:1863\n1247#5,6:1877\n1247#5,6:1921\n1247#5,6:1969\n1247#5,6:2024\n1247#5,6:2041\n1247#5,6:2052\n1247#5,6:2058\n1247#5,6:2064\n1247#5,6:2070\n1247#5,6:2076\n1247#5,6:2082\n1247#5,6:2088\n1247#5,6:2097\n1247#5,6:2103\n1247#5,6:2149\n1247#5,6:2155\n1247#5,6:2161\n1247#5,6:2213\n1247#5,6:2219\n1247#5,6:2230\n1247#5,6:2242\n1247#5,6:2337\n113#6:1254\n113#6:1255\n113#6:1256\n113#6:1257\n113#6:1264\n113#6:1265\n113#6:1266\n113#6:1405\n113#6:1453\n113#6:1495\n113#6:1500\n113#6:1540\n113#6:1547\n113#6:1554\n113#6:1573\n113#6:1575\n113#6:1581\n113#6:1587\n113#6:1593\n113#6:1754\n113#6:1759\n113#6:1869\n113#6:1870\n113#6:1920\n113#6:1929\n113#6:1968\n113#6:1983\n113#6:1984\n113#6:2023\n113#6:2040\n113#6:2094\n113#6:2095\n113#6:2096\n113#6:2109\n113#6:2148\n113#6:2171\n113#6:2209\n113#6:2210\n113#6:2211\n118#6:2212\n113#6:2248\n113#6:2286\n113#6:2287\n113#6:2288\n113#6:2294\n113#6:2295\n113#6:2329\n113#6:2334\n113#6:2344\n113#6:2418\n113#6:2423\n113#6:2463\n113#6:2465\n113#6:2467\n113#6:2501\n113#6:2510\n99#7:1273\n96#7,9:1274\n106#7:1313\n99#7,6:1501\n106#7:1564\n99#7:2249\n96#7,9:2250\n106#7:2293\n99#7,6:2296\n106#7:2333\n99#7,6:2345\n106#7:2381\n99#7:2425\n95#7,10:2426\n99#7,6:2468\n106#7:2505\n106#7:2509\n79#8,6:1283\n86#8,3:1298\n89#8,2:1307\n93#8:1312\n79#8,6:1335\n86#8,3:1350\n89#8,2:1359\n93#8:1364\n79#8,6:1372\n86#8,3:1387\n89#8,2:1396\n93#8:1408\n79#8,6:1426\n86#8,3:1441\n89#8,2:1450\n93#8:1456\n79#8,6:1468\n86#8,3:1483\n89#8,2:1492\n93#8:1498\n79#8,6:1507\n86#8,3:1522\n89#8,2:1531\n93#8:1563\n79#8,6:1604\n86#8,3:1619\n89#8,2:1628\n93#8:1633\n79#8,6:1652\n86#8,3:1667\n89#8,2:1676\n79#8,6:1727\n86#8,3:1742\n89#8,2:1751\n93#8:1757\n93#8:1768\n79#8,6:1789\n86#8,3:1804\n89#8,2:1813\n93#8:1824\n79#8,6:1836\n86#8,3:1851\n89#8,2:1860\n79#8,6:1893\n86#8,3:1908\n89#8,2:1917\n79#8,6:1939\n86#8,3:1954\n89#8,2:1963\n93#8:1978\n79#8,6:1994\n86#8,3:2009\n89#8,2:2018\n93#8:2033\n93#8:2038\n93#8:2049\n79#8,6:2121\n86#8,3:2136\n89#8,2:2145\n93#8:2169\n79#8,6:2182\n86#8,3:2197\n89#8,2:2206\n93#8:2240\n79#8,6:2259\n86#8,3:2274\n89#8,2:2283\n93#8:2292\n79#8,6:2302\n86#8,3:2317\n89#8,2:2326\n93#8:2332\n79#8,6:2351\n86#8,3:2366\n89#8,2:2375\n93#8:2380\n79#8,6:2391\n86#8,3:2406\n89#8,2:2415\n93#8:2421\n79#8,6:2436\n86#8,3:2451\n89#8,2:2460\n79#8,6:2474\n86#8,3:2489\n89#8,2:2498\n93#8:2504\n93#8:2508\n347#9,9:1289\n356#9,3:1309\n347#9,9:1341\n356#9,3:1361\n347#9,9:1378\n356#9:1398\n357#9,2:1406\n347#9,9:1432\n356#9:1452\n357#9,2:1454\n347#9,9:1474\n356#9:1494\n357#9,2:1496\n347#9,9:1513\n356#9:1533\n357#9,2:1561\n347#9,9:1610\n356#9,3:1630\n347#9,9:1658\n356#9:1678\n347#9,9:1733\n356#9:1753\n357#9,2:1755\n357#9,2:1766\n347#9,9:1795\n356#9:1815\n357#9,2:1822\n347#9,9:1842\n356#9:1862\n347#9,9:1899\n356#9:1919\n347#9,9:1945\n356#9:1965\n357#9,2:1976\n347#9,9:2000\n356#9:2020\n357#9,2:2031\n357#9,2:2036\n357#9,2:2047\n347#9,9:2127\n356#9:2147\n357#9,2:2167\n347#9,9:2188\n356#9:2208\n357#9,2:2238\n347#9,9:2265\n356#9:2285\n357#9,2:2290\n347#9,9:2308\n356#9:2328\n357#9,2:2330\n347#9,9:2357\n356#9,3:2377\n347#9,9:2397\n356#9:2417\n357#9,2:2419\n347#9,9:2442\n356#9:2462\n347#9,9:2480\n356#9:2500\n357#9,2:2502\n357#9,2:2506\n4206#10,6:1301\n4206#10,6:1353\n4206#10,6:1390\n4206#10,6:1444\n4206#10,6:1486\n4206#10,6:1525\n4206#10,6:1622\n4206#10,6:1670\n4206#10,6:1745\n4206#10,6:1807\n4206#10,6:1854\n4206#10,6:1911\n4206#10,6:1957\n4206#10,6:2012\n4206#10,6:2139\n4206#10,6:2200\n4206#10,6:2277\n4206#10,6:2320\n4206#10,6:2369\n4206#10,6:2409\n4206#10,6:2454\n4206#10,6:2492\n70#11:1326\n68#11,8:1327\n77#11:1365\n70#11:1416\n67#11,9:1417\n77#11:1457\n70#11:1458\n67#11,9:1459\n77#11:1499\n70#11:1594\n67#11,9:1595\n77#11:1634\n70#11:1641\n66#11,10:1642\n77#11:1769\n70#11:1780\n68#11,8:1781\n77#11:1825\n70#11:1883\n67#11,9:1884\n77#11:2039\n70#11:2382\n68#11,8:2383\n77#11:2422\n87#12,6:1366\n94#12:1409\n87#12:1717\n84#12,9:1718\n94#12:1758\n87#12:1826\n84#12,9:1827\n87#12:1930\n85#12,8:1931\n94#12:1979\n87#12:1985\n85#12,8:1986\n94#12:2034\n94#12:2050\n87#12:2110\n83#12,10:2111\n94#12:2170\n87#12:2172\n84#12,9:2173\n94#12:2241\n1#13:1572\n30#14:1576\n53#15,3:1577\n53#15,3:1583\n70#15:1590\n33#16:1582\n69#17:1589\n22#18:1591\n61#19:1592\n557#20:1691\n554#20,6:1692\n555#21:1701\n85#22:1770\n85#22:1771\n113#22,2:1772\n85#22:1774\n85#22:1775\n113#22,2:1776\n216#23,2:1778\n18#24,3:1871\n16#25,3:1874\n16#25,2:1927\n18#25:1980\n16#25,2:1981\n18#25:2035\n16#25,2:2225\n18#25:2237\n1878#26,2:1966\n1880#26:1975\n1878#26,2:2021\n1880#26:2030\n1563#26:2227\n1634#26,2:2228\n1636#26:2236\n1878#26,2:2335\n1880#26:2343\n49#27:2424\n49#27:2464\n49#27:2466\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/experiment/HomeActivityKt\n*L\n392#1:1234,7\n392#1:1241,6\n394#1:1247\n1180#1:1571\n1181#1:1574\n1182#1:1580\n1183#1:1586\n1184#1:1588\n600#1:2051\n842#1:2289\n396#1:1248,6\n855#1:1258,6\n881#1:1267,6\n944#1:1314,6\n947#1:1320,6\n971#1:1399,6\n1002#1:1410,6\n1116#1:1534,6\n1121#1:1541,6\n1126#1:1548,6\n1131#1:1555,6\n1179#1:1565,6\n804#1:1635,6\n408#1:1679,6\n423#1:1685,6\n425#1:1698,3\n425#1:1702,3\n442#1:1705,6\n447#1:1711,6\n798#1:1760,6\n453#1:1816,6\n463#1:1863,6\n478#1:1877,6\n521#1:1921,6\n537#1:1969,6\n567#1:2024,6\n589#1:2041,6\n601#1:2052,6\n611#1:2058,6\n612#1:2064,6\n633#1:2070,6\n643#1:2076,6\n691#1:2082,6\n694#1:2088,6\n619#1:2097,6\n620#1:2103,6\n662#1:2149,6\n656#1:2155,6\n673#1:2161,6\n753#1:2213,6\n758#1:2219,6\n776#1:2230,6\n791#1:2242,6\n1011#1:2337,6\n817#1:1254\n821#1:1255\n822#1:1256\n855#1:1257\n878#1:1264\n879#1:1265\n880#1:1266\n983#1:1405\n1056#1:1453\n1088#1:1495\n1114#1:1500\n1121#1:1540\n1126#1:1547\n1131#1:1554\n1180#1:1573\n1181#1:1575\n1182#1:1581\n1183#1:1587\n1185#1:1593\n726#1:1754\n788#1:1759\n466#1:1869\n467#1:1870\n519#1:1920\n530#1:1929\n536#1:1968\n558#1:1983\n559#1:1984\n566#1:2023\n588#1:2040\n611#1:2094\n612#1:2095\n616#1:2096\n652#1:2109\n660#1:2148\n739#1:2171\n744#1:2209\n745#1:2210\n746#1:2211\n747#1:2212\n829#1:2248\n834#1:2286\n835#1:2287\n840#1:2288\n859#1:2294\n861#1:2295\n864#1:2329\n884#1:2334\n1057#1:2344\n1090#1:2418\n1201#1:2423\n1204#1:2463\n1208#1:2465\n1210#1:2467\n1213#1:2501\n359#1:2510\n930#1:1273\n930#1:1274,9\n930#1:1313\n1114#1:1501,6\n1114#1:1564\n826#1:2249\n826#1:2250,9\n826#1:2293\n856#1:2296,6\n856#1:2333\n1057#1:2345,6\n1057#1:2381\n1203#1:2425\n1203#1:2426,10\n1205#1:2468,6\n1205#1:2505\n1203#1:2509\n930#1:1283,6\n930#1:1298,3\n930#1:1307,2\n930#1:1312\n947#1:1335,6\n947#1:1350,3\n947#1:1359,2\n947#1:1364\n963#1:1372,6\n963#1:1387,3\n963#1:1396,2\n963#1:1408\n1055#1:1426,6\n1055#1:1441,3\n1055#1:1450,2\n1055#1:1456\n1087#1:1468,6\n1087#1:1483,3\n1087#1:1492,2\n1087#1:1498\n1114#1:1507,6\n1114#1:1522,3\n1114#1:1531,2\n1114#1:1563\n1186#1:1604,6\n1186#1:1619,3\n1186#1:1628,2\n1186#1:1633\n407#1:1652,6\n407#1:1667,3\n407#1:1676,2\n717#1:1727,6\n717#1:1742,3\n717#1:1751,2\n717#1:1757\n407#1:1768\n452#1:1789,6\n452#1:1804,3\n452#1:1813,2\n452#1:1824\n458#1:1836,6\n458#1:1851,3\n458#1:1860,2\n500#1:1893,6\n500#1:1908,3\n500#1:1917,2\n530#1:1939,6\n530#1:1954,3\n530#1:1963,2\n530#1:1978\n556#1:1994,6\n556#1:2009,3\n556#1:2018,2\n556#1:2033\n500#1:2038\n458#1:2049\n652#1:2121,6\n652#1:2136,3\n652#1:2145,2\n652#1:2169\n736#1:2182,6\n736#1:2197,3\n736#1:2206,2\n736#1:2240\n826#1:2259,6\n826#1:2274,3\n826#1:2283,2\n826#1:2292\n856#1:2302,6\n856#1:2317,3\n856#1:2326,2\n856#1:2332\n1057#1:2351,6\n1057#1:2366,3\n1057#1:2375,2\n1057#1:2380\n1089#1:2391,6\n1089#1:2406,3\n1089#1:2415,2\n1089#1:2421\n1203#1:2436,6\n1203#1:2451,3\n1203#1:2460,2\n1205#1:2474,6\n1205#1:2489,3\n1205#1:2498,2\n1205#1:2504\n1203#1:2508\n930#1:1289,9\n930#1:1309,3\n947#1:1341,9\n947#1:1361,3\n963#1:1378,9\n963#1:1398\n963#1:1406,2\n1055#1:1432,9\n1055#1:1452\n1055#1:1454,2\n1087#1:1474,9\n1087#1:1494\n1087#1:1496,2\n1114#1:1513,9\n1114#1:1533\n1114#1:1561,2\n1186#1:1610,9\n1186#1:1630,3\n407#1:1658,9\n407#1:1678\n717#1:1733,9\n717#1:1753\n717#1:1755,2\n407#1:1766,2\n452#1:1795,9\n452#1:1815\n452#1:1822,2\n458#1:1842,9\n458#1:1862\n500#1:1899,9\n500#1:1919\n530#1:1945,9\n530#1:1965\n530#1:1976,2\n556#1:2000,9\n556#1:2020\n556#1:2031,2\n500#1:2036,2\n458#1:2047,2\n652#1:2127,9\n652#1:2147\n652#1:2167,2\n736#1:2188,9\n736#1:2208\n736#1:2238,2\n826#1:2265,9\n826#1:2285\n826#1:2290,2\n856#1:2308,9\n856#1:2328\n856#1:2330,2\n1057#1:2357,9\n1057#1:2377,3\n1089#1:2397,9\n1089#1:2417\n1089#1:2419,2\n1203#1:2442,9\n1203#1:2462\n1205#1:2480,9\n1205#1:2500\n1205#1:2502,2\n1203#1:2506,2\n930#1:1301,6\n947#1:1353,6\n963#1:1390,6\n1055#1:1444,6\n1087#1:1486,6\n1114#1:1525,6\n1186#1:1622,6\n407#1:1670,6\n717#1:1745,6\n452#1:1807,6\n458#1:1854,6\n500#1:1911,6\n530#1:1957,6\n556#1:2012,6\n652#1:2139,6\n736#1:2200,6\n826#1:2277,6\n856#1:2320,6\n1057#1:2369,6\n1089#1:2409,6\n1203#1:2454,6\n1205#1:2492,6\n947#1:1326\n947#1:1327,8\n947#1:1365\n1055#1:1416\n1055#1:1417,9\n1055#1:1457\n1087#1:1458\n1087#1:1459,9\n1087#1:1499\n1186#1:1594\n1186#1:1595,9\n1186#1:1634\n407#1:1641\n407#1:1642,10\n407#1:1769\n452#1:1780\n452#1:1781,8\n452#1:1825\n500#1:1883\n500#1:1884,9\n500#1:2039\n1089#1:2382\n1089#1:2383,8\n1089#1:2422\n963#1:1366,6\n963#1:1409\n717#1:1717\n717#1:1718,9\n717#1:1758\n458#1:1826\n458#1:1827,9\n530#1:1930\n530#1:1931,8\n530#1:1979\n556#1:1985\n556#1:1986,8\n556#1:2034\n458#1:2050\n652#1:2110\n652#1:2111,10\n652#1:2170\n736#1:2172\n736#1:2173,9\n736#1:2241\n1181#1:1576\n1181#1:1577,3\n1182#1:1583,3\n1184#1:1590\n1182#1:1582\n1184#1:1589\n1184#1:1591\n1184#1:1592\n425#1:1691\n425#1:1692,6\n425#1:1701\n412#1:1770\n423#1:1771\n423#1:1772,2\n441#1:1774\n442#1:1775\n442#1:1776,2\n705#1:1778,2\n476#1:1871,3\n477#1:1874,3\n529#1:1927,2\n529#1:1980\n555#1:1981,2\n555#1:2035\n772#1:2225,2\n772#1:2237\n531#1:1966,2\n531#1:1975\n561#1:2021,2\n561#1:2030\n775#1:2227\n775#1:2228,2\n775#1:2236\n1006#1:2335,2\n1006#1:2343\n1201#1:2424\n1204#1:2464\n1208#1:2466\n*E\n"})
/* loaded from: classes4.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f21276a = Dp.m5115constructorimpl(60);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String[] f21277b = {"完美一天，从背单词开始", "背几个试试看？", "查岗！今天学习了吗", "Every step counts!", "No vocab, no vibe!", "Vocab NOW or Never!"};

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String[] f21278c = {"还不晚，赶紧行动！", "404：Not found you背了单词", "It’s late, but not too late!", "Time is ticking. Start now!"};

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String[] f21279d = {"每天背一点，分数多一点", "今日到账：十分优秀！", "优秀五连！秀秀秀秀秀！"};

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final List<kg.l> f21280e = a00.h0.Q(new kg.l(new z3(R.drawable.ic_tab_word, R.drawable.ic_tab_word_press, 0, 4, null), "单词", xd.a.f98002r, null, 8, null), new kg.l(new z3(R.drawable.ic_tab_course, R.drawable.ic_tab_course_press, 0, 4, null), com.baicizhan.main.home.experiment.repo.q.f21581c, "training", null, 8, null), new kg.l(new z3(R.drawable.ic_tab_together, R.drawable.ic_tab_together_press, 0, 4, null), "一起背", "together_learning", null, 8, null), new kg.l(new z3(R.drawable.ic_tab_coin, R.drawable.ic_tab_coin_selected, 0, 4, null), "铜板购", "store", null, 8, null), new kg.l(new z3(R.drawable.ic_tab_mine, R.drawable.ic_tab_mine_press, 0, 4, null), "我", "me", null, 8, null));

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.HomeActivityKt$HomeContent$1$1$1$2$1$1$10$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21281a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21282b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f21283c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p5 f21284d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.experiment.HomeActivityKt$HomeContent$1$1$1$2$1$1$10$1$1$1", f = "HomeActivity.kt", i = {}, l = {697}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: com.baicizhan.main.home.experiment.n3$a$a, reason: collision with other inner class name */
        public static final class C0305a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f21285a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AppCompatActivity f21286b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p5 f21287c;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.main.home.experiment.HomeActivityKt$HomeContent$1$1$1$2$1$1$10$1$1$1$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: com.baicizhan.main.home.experiment.n3$a$a$a, reason: collision with other inner class name */
            public static final class C0306a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f21288a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p5 f21289b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0306a(p5 p5Var, j00.c<? super C0306a> cVar) {
                    super(2, cVar);
                    this.f21289b = p5Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                    return new C0306a(this.f21289b, cVar);
                }

                @Override // x00.p
                public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                    return ((C0306a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f21288a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    this.f21289b.o();
                    return yz.g2.f100423a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0305a(AppCompatActivity appCompatActivity, p5 p5Var, j00.c<? super C0305a> cVar) {
                super(2, cVar);
                this.f21286b = appCompatActivity;
                this.f21287c = p5Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new C0305a(this.f21286b, this.f21287c, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((C0305a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f21285a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    AppCompatActivity appCompatActivity = this.f21286b;
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    C0306a c0306a = new C0306a(this.f21287c, null);
                    this.f21285a = 1;
                    if (RepeatOnLifecycleKt.repeatOnLifecycle(appCompatActivity, state, c0306a, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return yz.g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, p5 p5Var, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f21283c = context;
            this.f21284d = p5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f21283c, this.f21284d, cVar);
            aVar.f21282b = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c40.r0 r0Var = (c40.r0) this.f21282b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21281a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            Context context = this.f21283c;
            AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            if (appCompatActivity == null) {
                return yz.g2.f100423a;
            }
            c40.k.f(r0Var, null, null, new C0305a(appCompatActivity, this.f21284d, null), 3, null);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements x00.a<yz.g2> {
        public b(Object obj) {
            super(0, obj, p5.class, "refreshWordsPlanStatus", "refreshWordsPlanStatus()V", 0);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            invoke2();
            return yz.g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((p5) this.receiver).p();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableTransitionState<Boolean> f21290a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r0.a f21291b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MutableTransitionState<Boolean> mutableTransitionState, r0.a aVar) {
            super(0, g0.a.class, "close", "HomeContent$lambda$1$0$0$10$0$0$close(Landroidx/compose/animation/core/MutableTransitionState;Lcom/baicizhan/main/home/experiment/HomeAction$DropAd;)V", 0);
            this.f21290a = mutableTransitionState;
            this.f21291b = aVar;
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            invoke2();
            return yz.g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            n3.T0(this.f21290a, this.f21291b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.HomeActivityKt$HomeContent$1$1$1$2$1$1$6$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21292a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableTransitionState<Boolean> f21293b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<r0> f21294c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MutableTransitionState<Boolean> mutableTransitionState, MutableState<r0> mutableState, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f21293b = mutableTransitionState;
            this.f21294c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f21293b, this.f21294c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21292a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (this.f21293b.isIdle() && !this.f21293b.getCurrentState().booleanValue()) {
                n3.f1(this.f21294c, r0.c.f21424b);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.HomeActivityKt$HomeContent$1$1$1$2$1$1$9$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21295a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f21296b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t3 f21297c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, t3 t3Var, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f21296b = context;
            this.f21297c = t3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new e(this.f21296b, this.f21297c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21295a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            Context context = this.f21296b;
            LoadingDialogActivity loadingDialogActivity = context instanceof LoadingDialogActivity ? (LoadingDialogActivity) context : null;
            if (loadingDialogActivity != null) {
                LoadingDialogActivity.setLoading$default(loadingDialogActivity, kotlin.jvm.internal.g0.g(this.f21297c, t3.b.f21673b), 350L, null, 4, null);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.HomeActivityKt$HomeContent$1$1$1$5$1$1$1", f = "HomeActivity.kt", i = {}, l = {793}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21298a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetState f21299b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ModalBottomSheetState modalBottomSheetState, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f21299b = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new f(this.f21299b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f21298a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ModalBottomSheetState modalBottomSheetState = this.f21299b;
                this.f21298a = 1;
                if (modalBottomSheetState.hide(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.HomeActivityKt$HomeContent$1$1$1$6$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21300a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f21301b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetState f21302c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(j jVar, ModalBottomSheetState modalBottomSheetState, j00.c<? super g> cVar) {
            super(2, cVar);
            this.f21301b = jVar;
            this.f21302c = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new g(this.f21301b, this.f21302c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21300a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f21301b.setEnabled(!this.f21302c.isVisible());
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.HomeActivityKt$HomeContent$1$1$1$setSheetType$1", f = "HomeActivity.kt", i = {}, l = {431, 435}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21303a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SheetType f21304b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetState f21305c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<SheetType> f21306d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f21307a;

            static {
                int[] iArr = new int[SheetType.values().length];
                try {
                    iArr[SheetType.UNKNOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f21307a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SheetType sheetType, ModalBottomSheetState modalBottomSheetState, MutableState<SheetType> mutableState, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f21304b = sheetType;
            this.f21305c = modalBottomSheetState;
            this.f21306d = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new h(this.f21304b, this.f21305c, this.f21306d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (r5.hide(r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        
            if (r5.show(r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f21303a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.e.n(r5)
                goto L47
            L1b:
                kotlin.e.n(r5)
                androidx.compose.runtime.MutableState<com.baicizhan.main.home.experiment.SheetType> r5 = r4.f21306d
                com.baicizhan.main.home.experiment.SheetType r1 = r4.f21304b
                com.baicizhan.main.home.experiment.n3.a2(r5, r1)
                com.baicizhan.main.home.experiment.SheetType r5 = r4.f21304b
                int[] r1 = com.baicizhan.main.home.experiment.n3.h.a.f21307a
                int r5 = r5.ordinal()
                r5 = r1[r5]
                if (r5 != r3) goto L3c
                androidx.compose.material.ModalBottomSheetState r5 = r4.f21305c
                r4.f21303a = r3
                java.lang.Object r5 = r5.hide(r4)
                if (r5 != r0) goto L47
                goto L46
            L3c:
                androidx.compose.material.ModalBottomSheetState r5 = r4.f21305c
                r4.f21303a = r2
                java.lang.Object r5 = r5.show(r4)
                if (r5 != r0) goto L47
            L46:
                return r0
            L47:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.n3.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.experiment.HomeActivityKt$HomeContent$1$2$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f21308a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcherOwner f21309b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f21310c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(OnBackPressedDispatcherOwner onBackPressedDispatcherOwner, j jVar, j00.c<? super i> cVar) {
            super(2, cVar);
            this.f21309b = onBackPressedDispatcherOwner;
            this.f21310c = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new i(this.f21309b, this.f21310c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OnBackPressedDispatcher onBackPressedDispatcher;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f21308a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = this.f21309b;
            if (onBackPressedDispatcherOwner != null && (onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher()) != null) {
                onBackPressedDispatcher.addCallback(this.f21310c);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends OnBackPressedCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f21311a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Context context) {
            super(true);
            this.f21311a = context;
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            Context context = this.f21311a;
            kotlin.jvm.internal.g0.n(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).moveTaskToBack(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class k {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21312a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f21313b;

        static {
            int[] iArr = new int[WinningType.values().length];
            try {
                iArr[WinningType.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WinningType.Hinting.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WinningType.Default.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21312a = iArr;
            int[] iArr2 = new int[Actions.values().length];
            try {
                iArr2[Actions.ACTION_WINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Actions.ACTION_SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Actions.ACTION_MESSAGES.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Actions.ACTION_TOOLS.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f21313b = iArr2;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 A0(OnBackPressedDispatcherOwner onBackPressedDispatcherOwner, final j jVar, final p5 p5Var, final x3 x3Var, final Context context, final Map map, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-535391761, i11, -1, "com.baicizhan.main.home.experiment.HomeContent.<anonymous> (HomeActivity.kt:403)");
            }
            com.baicizhan.platform.base.widget.s4.B(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, ColorKt.Color(4294637823L), 0L, ComposableLambdaKt.rememberComposableLambda(1582905822, true, new x00.q() { // from class: com.baicizhan.main.home.experiment.c1
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 B0;
                    B0 = n3.B0(p5.this, x3Var, context, map, jVar, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return B0;
                }
            }, composer, 54), composer, 0, 12779520, 98303);
            OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner != null ? onBackPressedDispatcherOwner.getOnBackPressedDispatcher() : null;
            boolean changedInstance = composer.changedInstance(onBackPressedDispatcherOwner) | composer.changedInstance(jVar);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new i(onBackPressedDispatcherOwner, jVar, null);
                composer.updateRememberedValue(rememberedValue);
            }
            EffectsKt.LaunchedEffect(onBackPressedDispatcher, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 A1(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 B0(final p5 p5Var, final x3 x3Var, final Context context, final Map map, j jVar, PaddingValues it, Composer composer, int i11) {
        Modifier.Companion companion;
        BoxScopeInstance boxScopeInstance;
        String str;
        NavHostController navHostController;
        State<NavBackStackEntry> state;
        SnapshotMutationPolicy snapshotMutationPolicy;
        c40.r0 r0Var;
        ModalBottomSheetState modalBottomSheetState;
        MutableState mutableState;
        float f11;
        Composer composer2 = composer;
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer2.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1582905822, i11, -1, "com.baicizhan.main.home.experiment.HomeContent.<anonymous>.<anonymous> (HomeActivity.kt:406)");
            }
            Modifier.Companion companion2 = Modifier.Companion;
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Object rememberedValue = composer2.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (rememberedValue == companion5.getEmpty()) {
                rememberedValue = f21280e.get(0).h();
                composer2.updateRememberedValue(rememberedValue);
            }
            String str2 = (String) rememberedValue;
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer2, 0);
            State<NavBackStackEntry> currentBackStackEntryAsState = NavHostControllerKt.currentBackStackEntryAsState(rememberNavController, composer2, 0);
            State<t3> l11 = p5Var.l();
            if (h1(rememberNavController, currentBackStackEntryAsState, str2) && (C0(l11) instanceof t3.c)) {
                composer2.startReplaceGroup(675948184);
                t3 C0 = C0(l11);
                kotlin.jvm.internal.g0.n(C0, "null cannot be cast to non-null type com.baicizhan.main.home.experiment.HomeState.Success");
                Object k11 = ((t3.c) C0).d().k();
                if (k11 == null) {
                    composer2.startReplaceGroup(-520442775);
                    composer2.endReplaceGroup();
                    companion = companion2;
                    boxScopeInstance = boxScopeInstance2;
                    str = str2;
                    navHostController = rememberNavController;
                    state = currentBackStackEntryAsState;
                    snapshotMutationPolicy = null;
                } else {
                    composer2.startReplaceGroup(-520442774);
                    navHostController = rememberNavController;
                    companion = companion2;
                    str = str2;
                    state = currentBackStackEntryAsState;
                    snapshotMutationPolicy = null;
                    boxScopeInstance = boxScopeInstance2;
                    coil.compose.l.c(k11, null, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer, 1573296, 0, 4024);
                    composer2 = composer;
                    yz.g2 g2Var = yz.g2.f100423a;
                    composer2.endReplaceGroup();
                }
            } else {
                companion = companion2;
                boxScopeInstance = boxScopeInstance2;
                str = str2;
                navHostController = rememberNavController;
                state = currentBackStackEntryAsState;
                snapshotMutationPolicy = null;
                composer2.startReplaceGroup(-536500898);
            }
            composer2.endReplaceGroup();
            Object rememberedValue2 = composer2.rememberedValue();
            if (rememberedValue2 == companion5.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(SheetType.UNKNOWN, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composer2.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            Composer composer3 = composer2;
            final ModalBottomSheetState rememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, false, composer3, 6, 14);
            Object rememberedValue3 = composer3.rememberedValue();
            if (rememberedValue3 == companion5.getEmpty()) {
                rememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer3);
                composer3.updateRememberedValue(rememberedValue3);
            }
            final c40.r0 r0Var2 = (c40.r0) rememberedValue3;
            final State<r0> m11 = p5Var.m();
            boolean changed = composer3.changed(d1(m11));
            Object rememberedValue4 = composer3.rememberedValue();
            if (changed || rememberedValue4 == companion5.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(d1(m11), snapshotMutationPolicy, 2, snapshotMutationPolicy);
                composer3.updateRememberedValue(rememberedValue4);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue4;
            Modifier.Companion companion6 = companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion6, 0.0f, 1, snapshotMutationPolicy);
            float f12 = f21276a;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(fillMaxSize$default, 0.0f, 0.0f, 0.0f, f12, 7, null);
            boolean changedInstance = composer3.changedInstance(p5Var) | composer3.changedInstance(r0Var2) | composer3.changedInstance(rememberModalBottomSheetState) | composer3.changedInstance(x3Var) | composer3.changed(mutableState3) | composer3.changed(m11) | composer3.changedInstance(context) | composer3.changedInstance(map);
            Object rememberedValue5 = composer3.rememberedValue();
            if (changedInstance || rememberedValue5 == companion5.getEmpty()) {
                final String str3 = str;
                Object obj = new x00.l() { // from class: com.baicizhan.main.home.experiment.p2
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 D0;
                        D0 = n3.D0(str3, map, p5Var, mutableState3, context, r0Var2, rememberModalBottomSheetState, x3Var, mutableState2, m11, (NavGraphBuilder) obj2);
                        return D0;
                    }
                };
                r0Var = r0Var2;
                modalBottomSheetState = rememberModalBottomSheetState;
                mutableState = mutableState2;
                composer3.updateRememberedValue(obj);
                rememberedValue5 = obj;
            } else {
                r0Var = r0Var2;
                modalBottomSheetState = rememberModalBottomSheetState;
                mutableState = mutableState2;
            }
            NavHostController navHostController2 = navHostController;
            String str4 = str;
            NavHostKt.NavHost(navHostController2, str4, m730paddingqDBjuR0$default, null, null, null, null, null, null, null, (x00.l) rememberedValue5, composer, 432, 0, 1016);
            State<NavBackStackEntry> state2 = state;
            Modifier navigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(boxScopeInstance.align(BackgroundKt.m235backgroundbw27NRU$default(companion6, h1(navHostController2, state2, str4) ? Color.Companion.m2544getTransparent0d7_KjU() : Color.Companion.m2546getWhite0d7_KjU(), null, 2, null), companion3.getBottomCenter()));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getStart(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, navigationBarsPadding);
            x00.a<ComposeUiNode> constructor2 = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (h1(navHostController2, state2, str4)) {
                f11 = 0.0f;
                composer.startReplaceGroup(1581683400);
            } else {
                composer.startReplaceGroup(1021983727);
                f11 = 0.0f;
                BoxKt.Box(BackgroundKt.m235backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(SizeKt.m759height3ABfNKs(companion6, Dp.m5115constructorimpl(1)), 0.0f, 1, null), Color.m2508copywmQWz5c$default(bk.b.A(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable)), 0.08f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), composer, 0);
            }
            composer.endReplaceGroup();
            j1(SizeKt.m759height3ABfNKs(companion6, f12), navHostController2, null, false, false, false, false, null, composer, 6, R.styleable.Theme_drawable_wiki_sound1);
            composer.endNode();
            float f13 = 28;
            final MutableState mutableState4 = mutableState;
            final ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
            final c40.r0 r0Var3 = r0Var;
            ModalBottomSheetKt.m1702ModalBottomSheetLayoutGs3lGvM(ComposableLambdaKt.rememberComposableLambda(-841445358, true, new x00.q() { // from class: com.baicizhan.main.home.experiment.q2
                @Override // x00.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    yz.g2 V0;
                    V0 = n3.V0(x3.this, r0Var3, modalBottomSheetState2, p5Var, mutableState4, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return V0;
                }
            }, composer, 54), SizeKt.fillMaxSize$default(companion6, f11, 1, null), modalBottomSheetState2, false, RoundedCornerShapeKt.m1021RoundedCornerShapea9UjIt4$default(Dp.m5115constructorimpl(f13), Dp.m5115constructorimpl(f13), 0.0f, 0.0f, 12, null), 0.0f, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(862645387, true, new x00.p() { // from class: com.baicizhan.main.home.experiment.r2
                @Override // x00.p
                public final Object invoke(Object obj2, Object obj3) {
                    yz.g2 Z0;
                    Z0 = n3.Z0(ModalBottomSheetState.this, r0Var3, (Composer) obj2, ((Integer) obj3).intValue());
                    return Z0;
                }
            }, composer, 54), composer, (ModalBottomSheetState.$stable << 6) | 805306422, 488);
            Boolean valueOf = Boolean.valueOf(modalBottomSheetState2.isVisible());
            boolean changedInstance2 = composer.changedInstance(jVar) | composer.changedInstance(modalBottomSheetState2);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue6 == companion5.getEmpty()) {
                rememberedValue6 = new g(jVar, modalBottomSheetState2, null);
                composer.updateRememberedValue(rememberedValue6);
            }
            EffectsKt.LaunchedEffect(valueOf, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue6, composer, 0);
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
    public static final yz.g2 B1(Object obj, String str, Composer composer, int i11) {
        Modifier.Companion companion;
        Composer composer2;
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-33886541, i11, -1, "com.baicizhan.main.home.experiment.SheetItem.<anonymous> (HomeActivity.kt:855)");
            }
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Dp.m5115constructorimpl(16), 0.0f, 2, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(12)), Alignment.Companion.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m728paddingVpY3zN4$default);
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
            if (obj != null) {
                composer.startReplaceGroup(-922368561);
                companion = companion2;
                coil.compose.l.c(obj, null, SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(40)), null, null, null, ContentScale.Companion.getInside(), 0.0f, null, 0, false, null, composer, 1573296, 0, 4024);
                composer2 = composer;
            } else {
                companion = companion2;
                composer2 = composer;
                composer2.startReplaceGroup(1429935883);
            }
            composer2.endReplaceGroup();
            TextKt.m1845Text4IGK_g(str, RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), ColorKt.Color(4279835428L), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 200064, 3120, 120784);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final t3 C0(State<? extends t3> state) {
        return state.getValue();
    }

    public static final yz.g2 C1(Modifier modifier, Object obj, String str, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        z1(modifier, obj, str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 D0(String str, Map map, final p5 p5Var, final MutableState mutableState, final Context context, final c40.r0 r0Var, final ModalBottomSheetState modalBottomSheetState, final x3 x3Var, final MutableState mutableState2, final State state, NavGraphBuilder NavHost) {
        kotlin.jvm.internal.g0.p(NavHost, "$this$NavHost");
        NavGraphBuilderKt.composable$default(NavHost, str, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1647005241, true, new x00.r() { // from class: com.baicizhan.main.home.experiment.e1
            @Override // x00.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                yz.g2 E0;
                E0 = n3.E0(p5.this, mutableState, context, r0Var, modalBottomSheetState, x3Var, mutableState2, state, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                return E0;
            }
        }), 254, null);
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            final x00.l lVar = (x00.l) entry.getValue();
            NavGraphBuilderKt.composable$default(NavHost, str2, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(2090142178, true, new x00.r() { // from class: com.baicizhan.main.home.experiment.f1
                @Override // x00.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    yz.g2 U0;
                    U0 = n3.U0(x00.l.this, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return U0;
                }
            }), 254, null);
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void D1(Modifier modifier, final List<? extends Triple<? extends Object, String, ? extends x00.a<yz.g2>>> list, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(1238695024);
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
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1238695024, i13, -1, "com.baicizhan.main.home.experiment.Sheets (HomeActivity.kt:873)");
            }
            Modifier modifier5 = modifier4;
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            PaddingValues m719PaddingValues0680j_4 = PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(20));
            Arrangement arrangement = Arrangement.INSTANCE;
            float f11 = 16;
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11));
            Arrangement.HorizontalOrVertical m607spacedBy0680j_42 = arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11));
            boolean changedInstance = startRestartGroup.changedInstance(list);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.experiment.w2
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 E1;
                        E1 = n3.E1(list, (LazyGridScope) obj);
                        return E1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            modifier3 = modifier5;
            LazyGridDslKt.LazyVerticalGrid(fixed, modifier3, null, m719PaddingValues0680j_4, false, m607spacedBy0680j_4, m607spacedBy0680j_42, null, false, null, (x00.l) rememberedValue, startRestartGroup, ((i13 << 3) & 112) | 1772544, 0, 916);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.x2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 G1;
                    G1 = n3.G1(Modifier.this, list, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return G1;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 E0(p5 p5Var, final MutableState mutableState, Context context, final c40.r0 r0Var, final ModalBottomSheetState modalBottomSheetState, final x3 x3Var, final MutableState mutableState2, final State state, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i11) {
        String str;
        t3 t3Var;
        b4 b4Var;
        t3 t3Var2;
        Object obj;
        Modifier.Companion companion;
        BoxScopeInstance boxScopeInstance;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        WinningState winningState;
        Composer composer2;
        int i12;
        j00.c cVar;
        final p5 p5Var2 = p5Var;
        final x3 x3Var2 = x3Var;
        kotlin.jvm.internal.g0.p(composable, "$this$composable");
        kotlin.jvm.internal.g0.p(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1647005241, i11, -1, "com.baicizhan.main.home.experiment.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:448)");
        }
        t3 value = p5Var2.l().getValue();
        if (value instanceof t3.a) {
            composer.startReplaceGroup(-226581755);
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            String d11 = va.g.d(((t3.a) value).d());
            kotlin.jvm.internal.g0.o(d11, "failedMsg(...)");
            boolean changedInstance = composer.changedInstance(p5Var2);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.n1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 F0;
                        F0 = n3.F0(p5.this);
                        return F0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Composer composer3 = composer;
            WidgetsKt.r(R.drawable.ic_common_page_oops_small, d11, "重试", (x00.a) rememberedValue, composer3, 390, 0);
            composer3.endNode();
            composer3.endReplaceGroup();
            str = "";
            t3Var = value;
            composer2 = composer3;
        } else {
            Composer composer4 = composer;
            if (value instanceof t3.c) {
                composer4.startReplaceGroup(-225902855);
                Modifier.Companion companion3 = Modifier.Companion;
                Modifier safeDrawingPadding = WindowInsetsPadding_androidKt.safeDrawingPadding(SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null));
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion4 = Alignment.Companion;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion4.getStart(), composer4, 0);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, safeDrawingPadding);
                ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
                x00.a<ComposeUiNode> constructor2 = companion5.getConstructor();
                if (composer4.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer4.startReusableNode();
                if (composer4.getInserting()) {
                    composer4.createNode(constructor2);
                } else {
                    composer4.useNode();
                }
                Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer4);
                Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion5.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion5.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                t3.c cVar2 = (t3.c) value;
                boolean changed = composer4.changed(cVar2.d().n());
                Object rememberedValue2 = composer4.rememberedValue();
                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(cVar2.d().n(), null, 2, null);
                    composer4.updateRememberedValue(rememberedValue2);
                }
                final MutableState mutableState3 = (MutableState) rememberedValue2;
                Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(SizeKt.m759height3ABfNKs(companion3, Dp.m5115constructorimpl(64)), Dp.m5115constructorimpl(14), 0.0f, 2, null);
                if (cVar2.d().q() instanceof a4.a) {
                    int i13 = k.f21312a[((a4.a) cVar2.d().q()).h().ordinal()];
                    if (i13 == 1) {
                        winningState = WinningState.COMPLETED;
                    } else if (i13 == 2) {
                        winningState = WinningState.ALERT;
                    } else {
                        if (i13 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        winningState = WinningState.NORMAL;
                    }
                    b4Var = new b4(winningState, ((a4.a) cVar2.d().q()).f());
                } else {
                    b4Var = null;
                }
                String f11 = cVar2.d().n().f();
                Boolean valueOf = (f11 == null || f11.length() == 0) ? null : Boolean.valueOf(((y3) mutableState3.getValue()).e());
                List<r3> l11 = cVar2.d().l();
                Boolean bool = (l11 == null || l11.isEmpty()) ? null : Boolean.FALSE;
                boolean changedInstance2 = composer4.changedInstance(r0Var) | composer4.changedInstance(modalBottomSheetState) | composer4.changedInstance(x3Var2) | composer4.changed(mutableState3);
                Object rememberedValue3 = composer4.rememberedValue();
                if (changedInstance2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    t3Var2 = value;
                    obj = null;
                    rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.home.experiment.y1
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            yz.g2 G0;
                            G0 = n3.G0(x3.this, mutableState3, r0Var, modalBottomSheetState, mutableState2, (Actions) obj2);
                            return G0;
                        }
                    };
                    composer4.updateRememberedValue(rememberedValue3);
                } else {
                    t3Var2 = value;
                    obj = null;
                }
                J1(m728paddingVpY3zN4$default, b4Var, valueOf, bool, (x00.l) rememberedValue3, composer, 6, 0);
                Modifier weight$default = ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxSize$default(companion3, 0.0f, 1, obj), 1.0f, false, 2, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, weight$default);
                x00.a<ComposeUiNode> constructor3 = companion5.getConstructor();
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
                Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion5.getSetModifier());
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                final x3 x3Var3 = x3Var;
                str = "";
                final t3 t3Var3 = t3Var2;
                BoxScopeInstance boxScopeInstance4 = boxScopeInstance3;
                coil.compose.l.c(cVar2.d().o(), null, boxScopeInstance3.align(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, obj), companion4.getCenter()), null, null, null, ContentScale.Companion.getFillWidth(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                Composer composer5 = composer;
                a4 q11 = cVar2.d().q();
                a4.a aVar = q11 instanceof a4.a ? (a4.a) q11 : null;
                if (aVar == null) {
                    composer5.startReplaceGroup(1971171229);
                    composer5.endReplaceGroup();
                    companion = companion3;
                } else {
                    composer5.startReplaceGroup(1971171230);
                    companion = companion3;
                    Modifier align = boxScopeInstance4.align(PaddingKt.m730paddingqDBjuR0$default(companion3, 0.0f, Dp.m5115constructorimpl(80), 0.0f, 0.0f, 13, null), companion4.getTopCenter());
                    a4.a aVar2 = aVar;
                    String g11 = aVar2.g();
                    String str7 = aVar2.h() == WinningType.Done ? "去打卡" : str;
                    boolean changed2 = composer5.changed(t3Var3) | composer5.changedInstance(x3Var3);
                    Object rememberedValue4 = composer5.rememberedValue();
                    if (changed2 || rememberedValue4 == Composer.Companion.getEmpty()) {
                        rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.home.experiment.j2
                            @Override // x00.a
                            public final Object invoke() {
                                yz.g2 H0;
                                H0 = n3.H0(t3.this, x3Var3);
                                return H0;
                            }
                        };
                        composer5.updateRememberedValue(rememberedValue4);
                    }
                    o0(align, g11, str7, (x00.a) rememberedValue4, composer, 0, 0);
                    composer5 = composer;
                    yz.g2 g2Var = yz.g2.f100423a;
                    composer5.endReplaceGroup();
                }
                composer5.startReplaceGroup(-629119630);
                List<q3> m11 = cVar2.d().m();
                String str8 = ma.b.Y1;
                String str9 = ma.b.X1;
                String str10 = ma.b.W1;
                String str11 = ma.a.B5;
                String str12 = ma.t.f73010i;
                int i14 = 56;
                if (m11 == null || m11.isEmpty()) {
                    boxScopeInstance = boxScopeInstance4;
                    t3Var = t3Var3;
                    str2 = ma.b.Y1;
                    str3 = ma.b.X1;
                    str4 = ma.b.W1;
                    str5 = ma.a.B5;
                    str6 = ma.t.f73010i;
                } else {
                    List<q3> list = m11;
                    float f12 = 16;
                    Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(companion, Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(8));
                    MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f12)), companion4.getStart(), composer5, 6);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer5, m727paddingVpY3zN4);
                    x00.a<ComposeUiNode> constructor4 = companion5.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor4);
                    } else {
                        composer5.useNode();
                    }
                    Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer5);
                    Updater.m1958setimpl(m1951constructorimpl4, columnMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                    x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                    if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion5.getSetModifier());
                    composer5.startReplaceGroup(1451930106);
                    final int i15 = 0;
                    for (Object obj2 : list) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            a00.h0.b0();
                        }
                        final q3 q3Var = (q3) obj2;
                        String f13 = q3Var.f();
                        String str13 = "left-ad-" + i15;
                        Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(i14));
                        boolean changedInstance3 = composer5.changedInstance(x3Var3) | composer5.changed(q3Var) | composer5.changed(i15);
                        Object rememberedValue5 = composer5.rememberedValue();
                        if (changedInstance3 || rememberedValue5 == Composer.Companion.getEmpty()) {
                            rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.home.experiment.u2
                                @Override // x00.a
                                public final Object invoke() {
                                    yz.g2 I0;
                                    I0 = n3.I0(x3.this, q3Var, i15);
                                    return I0;
                                }
                            };
                            composer5.updateRememberedValue(rememberedValue5);
                        }
                        Modifier k11 = ComposeUtilsKt.k(m773size3ABfNKs, 0L, false, (x00.a) rememberedValue5, 3, null);
                        String str14 = str10;
                        String str15 = str11;
                        String str16 = str12;
                        String str17 = str8;
                        String str18 = str9;
                        coil.compose.l.c(f13, str13, k11, null, null, null, null, 0.0f, null, 0, false, null, composer, 0, 0, 4088);
                        composer5 = composer;
                        ma.l.e(str16, str15, a00.l1.W(yz.h1.a(str14, TtmlNode.LEFT), yz.h1.a(str18, Integer.valueOf(i15)), yz.h1.a(str17, q3Var.g())));
                        str10 = str14;
                        str11 = str15;
                        str12 = str16;
                        boxScopeInstance4 = boxScopeInstance4;
                        i15 = i16;
                        i14 = 56;
                        str8 = str17;
                        str9 = str18;
                        x3Var3 = x3Var;
                        t3Var3 = t3Var3;
                    }
                    boxScopeInstance = boxScopeInstance4;
                    t3Var = t3Var3;
                    str2 = str8;
                    str3 = str9;
                    str4 = str10;
                    str5 = str11;
                    str6 = str12;
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    yz.g2 g2Var2 = yz.g2.f100423a;
                }
                composer5.endReplaceGroup();
                composer5.startReplaceGroup(-629053355);
                List<q3> p11 = cVar2.d().p();
                if (p11 != null && !p11.isEmpty()) {
                    List<q3> list2 = p11;
                    float f14 = 16;
                    Modifier m727paddingVpY3zN42 = PaddingKt.m727paddingVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(f14), Dp.m5115constructorimpl(8));
                    Alignment.Companion companion6 = Alignment.Companion;
                    Modifier align2 = boxScopeInstance.align(m727paddingVpY3zN42, companion6.getTopEnd());
                    char c11 = 6;
                    MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(f14)), companion6.getStart(), composer5, 6);
                    boolean z11 = false;
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer5.getCurrentCompositionLocalMap();
                    Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer5, align2);
                    ComposeUiNode.Companion companion7 = ComposeUiNode.Companion;
                    x00.a<ComposeUiNode> constructor5 = companion7.getConstructor();
                    if (composer5.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor5);
                    } else {
                        composer5.useNode();
                    }
                    Composer m1951constructorimpl5 = Updater.m1951constructorimpl(composer5);
                    Updater.m1958setimpl(m1951constructorimpl5, columnMeasurePolicy3, companion7.getSetMeasurePolicy());
                    Updater.m1958setimpl(m1951constructorimpl5, currentCompositionLocalMap5, companion7.getSetResolvedCompositionLocals());
                    x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash5 = companion7.getSetCompositeKeyHash();
                    if (m1951constructorimpl5.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        m1951constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        m1951constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m1958setimpl(m1951constructorimpl5, materializeModifier5, companion7.getSetModifier());
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    composer5.startReplaceGroup(-587467212);
                    final int i17 = 0;
                    for (Object obj3 : list2) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            a00.h0.b0();
                        }
                        final q3 q3Var2 = (q3) obj3;
                        String f15 = q3Var2.f();
                        String str19 = "right-ad-" + i17;
                        Modifier m773size3ABfNKs2 = SizeKt.m773size3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(56));
                        boolean changedInstance4 = composer5.changedInstance(x3Var) | composer5.changed(q3Var2) | composer5.changed(i17);
                        Object rememberedValue6 = composer5.rememberedValue();
                        if (changedInstance4 || rememberedValue6 == Composer.Companion.getEmpty()) {
                            rememberedValue6 = new x00.a() { // from class: com.baicizhan.main.home.experiment.f3
                                @Override // x00.a
                                public final Object invoke() {
                                    yz.g2 J0;
                                    J0 = n3.J0(x3.this, q3Var2, i17);
                                    return J0;
                                }
                            };
                            composer5.updateRememberedValue(rememberedValue6);
                        }
                        coil.compose.l.c(f15, str19, ComposeUtilsKt.k(m773size3ABfNKs2, 0L, false, (x00.a) rememberedValue6, 3, null), null, null, null, null, 0.0f, null, 0, false, null, composer, 0, 0, 4088);
                        composer5 = composer;
                        str5 = str5;
                        str6 = str6;
                        ma.l.e(str6, str5, a00.l1.W(yz.h1.a(str4, TtmlNode.RIGHT), yz.h1.a(str3, Integer.valueOf(i17)), yz.h1.a(str2, q3Var2.g())));
                        i17 = i18;
                        z11 = false;
                        c11 = 6;
                    }
                    composer5.endReplaceGroup();
                    composer5.endNode();
                    yz.g2 g2Var3 = yz.g2.f100423a;
                }
                composer5.endReplaceGroup();
                composer5.endNode();
                w5 r11 = cVar2.d().r();
                float f16 = 16;
                Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, Dp.m5115constructorimpl(f16), 0.0f, Dp.m5115constructorimpl(f16), Dp.m5115constructorimpl(24), 2, null);
                p5Var2 = p5Var;
                boolean changedInstance5 = composer5.changedInstance(p5Var2);
                Object rememberedValue7 = composer5.rememberedValue();
                if (changedInstance5 || rememberedValue7 == Composer.Companion.getEmpty()) {
                    rememberedValue7 = new b(p5Var2);
                    composer5.updateRememberedValue(rememberedValue7);
                }
                x3Var2 = x3Var;
                WordCardKt.m0(r11, x3Var2, m730paddingqDBjuR0$default, (x00.a) ((h10.i) rememberedValue7), composer, 384, 0);
                Composer composer6 = composer;
                composer6.endNode();
                composer6.endReplaceGroup();
                composer2 = composer6;
            } else {
                str = "";
                t3Var = value;
                composer4.startReplaceGroup(-216668327);
                composer4.endReplaceGroup();
                composer2 = composer4;
            }
        }
        r0 e12 = e1(mutableState);
        if (e12 instanceof r0.a) {
            composer2.startReplaceGroup(-216459666);
            r0 e13 = e1(mutableState);
            kotlin.jvm.internal.g0.n(e13, "null cannot be cast to non-null type com.baicizhan.main.home.experiment.HomeAction.DropAd");
            final r0.a aVar3 = (r0.a) e13;
            final Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue8 = composer2.rememberedValue();
            Composer.Companion companion8 = Composer.Companion;
            Object obj4 = rememberedValue8;
            if (rememberedValue8 == companion8.getEmpty()) {
                MutableTransitionState mutableTransitionState = new MutableTransitionState(Boolean.FALSE);
                mutableTransitionState.setTargetState$animation_core_release(Boolean.TRUE);
                composer2.updateRememberedValue(mutableTransitionState);
                obj4 = mutableTransitionState;
            }
            final MutableTransitionState mutableTransitionState2 = (MutableTransitionState) obj4;
            boolean changed3 = composer2.changed(density);
            Object rememberedValue9 = composer2.rememberedValue();
            if (changed3 || rememberedValue9 == companion8.getEmpty()) {
                rememberedValue9 = new x00.l() { // from class: com.baicizhan.main.home.experiment.j3
                    @Override // x00.l
                    public final Object invoke(Object obj5) {
                        int K0;
                        K0 = n3.K0(Density.this, ((Integer) obj5).intValue());
                        return Integer.valueOf(K0);
                    }
                };
                composer2.updateRememberedValue(rememberedValue9);
            }
            cVar = null;
            EnterTransition plus = EnterExitTransitionKt.slideInVertically$default(null, (x00.l) rememberedValue9, 1, null).plus(EnterExitTransitionKt.fadeIn$default(null, 0.3f, 1, null));
            boolean changed4 = composer2.changed(density);
            Object rememberedValue10 = composer2.rememberedValue();
            if (changed4 || rememberedValue10 == companion8.getEmpty()) {
                rememberedValue10 = new x00.l() { // from class: com.baicizhan.main.home.experiment.k3
                    @Override // x00.l
                    public final Object invoke(Object obj5) {
                        int L0;
                        L0 = n3.L0(Density.this, ((Integer) obj5).intValue());
                        return Integer.valueOf(L0);
                    }
                };
                composer2.updateRememberedValue(rememberedValue10);
            }
            AnimatedVisibilityKt.AnimatedVisibility((MutableTransitionState<Boolean>) mutableTransitionState2, (Modifier) null, plus, EnterExitTransitionKt.slideOutVertically$default(null, (x00.l) rememberedValue10, 1, null).plus(EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(1945902990, true, new x00.q() { // from class: com.baicizhan.main.home.experiment.l3
                @Override // x00.q
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    yz.g2 M0;
                    M0 = n3.M0(MutableTransitionState.this, aVar3, x3Var2, mutableState, (AnimatedVisibilityScope) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                    return M0;
                }
            }, composer2, 54), composer2, MutableTransitionState.$stable | 196608, 18);
            Boolean valueOf2 = Boolean.valueOf(mutableTransitionState2.isIdle());
            Object currentState = mutableTransitionState2.getCurrentState();
            boolean changedInstance6 = composer2.changedInstance(mutableTransitionState2) | composer2.changed(mutableState);
            Object rememberedValue11 = composer2.rememberedValue();
            if (changedInstance6 || rememberedValue11 == companion8.getEmpty()) {
                rememberedValue11 = new d(mutableTransitionState2, mutableState, null);
                composer2.updateRememberedValue(rememberedValue11);
            }
            i12 = 0;
            EffectsKt.LaunchedEffect(valueOf2, currentState, (x00.p) rememberedValue11, composer2, 0);
            composer2.endReplaceGroup();
        } else {
            i12 = 0;
            cVar = null;
            if (e12 instanceof r0.d) {
                composer2.startReplaceGroup(-213745895);
                r0 d12 = d1(state);
                kotlin.jvm.internal.g0.n(d12, "null cannot be cast to non-null type com.baicizhan.main.home.experiment.HomeAction.PopAd");
                final r0.d dVar = (r0.d) d12;
                boolean changed5 = composer2.changed(mutableState);
                Object rememberedValue12 = composer2.rememberedValue();
                if (changed5 || rememberedValue12 == Composer.Companion.getEmpty()) {
                    rememberedValue12 = new x00.a() { // from class: com.baicizhan.main.home.experiment.m3
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 O0;
                            O0 = n3.O0(MutableState.this);
                            return O0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue12);
                }
                AndroidDialog_androidKt.Dialog((x00.a) rememberedValue12, new DialogProperties(false, false, false), ComposableLambdaKt.rememberComposableLambda(-1348203786, true, new x00.p() { // from class: com.baicizhan.main.home.experiment.d1
                    @Override // x00.p
                    public final Object invoke(Object obj5, Object obj6) {
                        yz.g2 P0;
                        P0 = n3.P0(x3.this, state, dVar, mutableState, (Composer) obj5, ((Integer) obj6).intValue());
                        return P0;
                    }
                }, composer2, 54), composer2, 432, 0);
                ma.l.b("notify-popup", "notify-popup", a00.k1.k(yz.h1.a("adv_id", dVar.f())));
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-210723271);
                composer2.endReplaceGroup();
            }
        }
        t3 t3Var4 = t3Var;
        boolean changedInstance7 = composer2.changedInstance(context) | composer2.changed(t3Var4);
        Object rememberedValue13 = composer2.rememberedValue();
        if (changedInstance7 || rememberedValue13 == Composer.Companion.getEmpty()) {
            rememberedValue13 = new e(context, t3Var4, cVar);
            composer2.updateRememberedValue(rememberedValue13);
        }
        EffectsKt.LaunchedEffect(t3Var4, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue13, composer2, i12);
        boolean changedInstance8 = composer2.changedInstance(context) | composer2.changedInstance(p5Var2);
        Object rememberedValue14 = composer2.rememberedValue();
        if (changedInstance8 || rememberedValue14 == Composer.Companion.getEmpty()) {
            rememberedValue14 = new a(context, p5Var2, cVar);
            composer2.updateRememberedValue(rememberedValue14);
        }
        EffectsKt.LaunchedEffect(str, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue14, composer2, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 E1(final List list, LazyGridScope LazyVerticalGrid) {
        kotlin.jvm.internal.g0.p(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.items$default(LazyVerticalGrid, list.size(), null, null, null, ComposableLambdaKt.composableLambdaInstance(-1203756043, true, new x00.r() { // from class: com.baicizhan.main.home.experiment.r1
            @Override // x00.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                yz.g2 F1;
                F1 = n3.F1(list, (LazyGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
                return F1;
            }
        }), 14, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 F0(p5 p5Var) {
        p5Var.o();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 F1(List list, LazyGridItemScope items, int i11, Composer composer, int i12) {
        kotlin.jvm.internal.g0.p(items, "$this$items");
        if ((i12 & 48) == 0) {
            i12 |= composer.changed(i11) ? 32 : 16;
        }
        if (composer.shouldExecute((i12 & 145) != 144, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1203756043, i12, -1, "com.baicizhan.main.home.experiment.Sheets.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:882)");
            }
            Triple triple = (Triple) list.get(i11);
            z1(SizeKt.m759height3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(68)), triple.component1(), (String) triple.component2(), (x00.a) triple.component3(), composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 G0(x3 x3Var, MutableState mutableState, c40.r0 r0Var, ModalBottomSheetState modalBottomSheetState, MutableState mutableState2, Actions it) {
        kotlin.jvm.internal.g0.p(it, "it");
        int i11 = k.f21313b[it.ordinal()];
        if (i11 == 1) {
            g1(r0Var, modalBottomSheetState, mutableState2, SheetType.WINNING_SPACE);
        } else if (i11 == 2) {
            x3Var.b(SimpleNavigation.SEARCH);
        } else if (i11 == 3) {
            x3Var.a(((y3) mutableState.getValue()).f());
            if (((y3) mutableState.getValue()).e()) {
                mutableState.setValue(y3.d((y3) mutableState.getValue(), null, false, 1, null));
            }
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            g1(r0Var, modalBottomSheetState, mutableState2, SheetType.TOOLS);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 G1(Modifier modifier, List list, int i11, int i12, Composer composer, int i13) {
        D1(modifier, list, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 H0(t3 t3Var, x3 x3Var) {
        if (((a4.a) ((t3.c) t3Var).d().q()).h() == WinningType.Done) {
            x3Var.b(SimpleNavigation.PUNCH_CARD);
            ma.l.a(ma.t.f73003b, ma.a.f72768j);
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4294967295L, showBackground = true)
    public static final void H1(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(57954107);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(57954107, i11, -1, "com.baicizhan.main.home.experiment.SheetsPreview (HomeActivity.kt:891)");
            }
            bk.k.e(null, null, null, f0.f21173a.E(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.z2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 I1;
                    I1 = n3.I1(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return I1;
                }
            });
        }
    }

    public static final yz.g2 I0(x3 x3Var, q3 q3Var, int i11) {
        x3Var.a(q3Var.g());
        ma.l.e(ma.t.f73010i, ma.a.C5, a00.l1.W(yz.h1.a(ma.b.W1, TtmlNode.LEFT), yz.h1.a(ma.b.X1, Integer.valueOf(i11)), yz.h1.a(ma.b.Y1, q3Var.g())));
        return yz.g2.f100423a;
    }

    public static final yz.g2 I1(int i11, Composer composer, int i12) {
        H1(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 J0(x3 x3Var, q3 q3Var, int i11) {
        x3Var.a(q3Var.g());
        ma.l.e(ma.t.f73010i, ma.a.C5, a00.l1.W(yz.h1.a(ma.b.W1, TtmlNode.RIGHT), yz.h1.a(ma.b.X1, Integer.valueOf(i11)), yz.h1.a(ma.b.Y1, q3Var.g())));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void J1(Modifier modifier, final b4 b4Var, final Boolean bool, final Boolean bool2, final x00.l<? super Actions, yz.g2> lVar, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        int i14;
        int i15;
        int i16;
        Composer startRestartGroup = composer.startRestartGroup(-1052249927);
        int i17 = i12 & 1;
        if (i17 != 0) {
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
            i13 |= startRestartGroup.changed(b4Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(bool) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changed(bool2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i13 & 9363) != 9362, i13 & 1)) {
            Modifier modifier4 = i17 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1052249927, i13, -1, "com.baicizhan.main.home.experiment.TopActions (HomeActivity.kt:1112)");
            }
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(12)), Alignment.Companion.getCenterVertically(), startRestartGroup, 54);
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
            if (b4Var != null) {
                startRestartGroup.startReplaceGroup(-1440324213);
                WinningState g11 = b4Var.g();
                int i18 = i13;
                int f11 = b4Var.f();
                boolean z11 = (i18 & 57344) == 16384;
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.a3
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 K1;
                            K1 = n3.K1(x00.l.this);
                            return K1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                i14 = 57344;
                i15 = i18;
                i16 = 0;
                R1(g11, f11, null, (x00.a) rememberedValue, startRestartGroup, 0, 4);
            } else {
                i14 = 57344;
                i15 = i13;
                i16 = 0;
                startRestartGroup.startReplaceGroup(-1750889971);
            }
            startRestartGroup.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.Companion;
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion2, 1.0f, false, 2, null), startRestartGroup, i16);
            ImageVector.Companion companion3 = ImageVector.Companion;
            ImageVector vectorResource = VectorResources_androidKt.vectorResource(companion3, R.drawable.ic_home_words_action_search, startRestartGroup, 54);
            float f12 = 42;
            Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(f12));
            int i19 = i15 & i14;
            boolean z12 = i19 == 16384;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.experiment.b3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 L1;
                        L1 = n3.L1(x00.l.this);
                        return L1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier modifier5 = modifier4;
            l0(vectorResource, m773size3ABfNKs, false, (x00.a) rememberedValue2, startRestartGroup, 48, 4);
            if (j2(bool)) {
                startRestartGroup.startReplaceGroup(-1440306994);
                ImageVector vectorResource2 = VectorResources_androidKt.vectorResource(companion3, R.drawable.ic_home_words_action_messages, startRestartGroup, 54);
                Modifier m773size3ABfNKs2 = SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(f12));
                boolean g12 = kotlin.jvm.internal.g0.g(bool, Boolean.TRUE);
                boolean z13 = ((i15 & 896) == 256) | (i19 == 16384);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z13 || rememberedValue3 == Composer.Companion.getEmpty()) {
                    rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.experiment.c3
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 M1;
                            M1 = n3.M1(x00.l.this, bool);
                            return M1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                l0(vectorResource2, m773size3ABfNKs2, g12, (x00.a) rememberedValue3, startRestartGroup, 48, 0);
            } else {
                startRestartGroup.startReplaceGroup(-1750889971);
            }
            startRestartGroup.endReplaceGroup();
            if (j2(bool2)) {
                startRestartGroup.startReplaceGroup(-1440294745);
                ImageVector vectorResource3 = VectorResources_androidKt.vectorResource(companion3, R.drawable.ic_home_words_action_tools, startRestartGroup, 54);
                Modifier m773size3ABfNKs3 = SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(f12));
                boolean g13 = kotlin.jvm.internal.g0.g(bool2, Boolean.TRUE);
                boolean z14 = i19 == 16384;
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z14 || rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.home.experiment.d3
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 N1;
                            N1 = n3.N1(x00.l.this);
                            return N1;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                l0(vectorResource3, m773size3ABfNKs3, g13, (x00.a) rememberedValue4, startRestartGroup, 48, 0);
            } else {
                startRestartGroup.startReplaceGroup(-1750889971);
            }
            startRestartGroup.endReplaceGroup();
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.e3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 O1;
                    O1 = n3.O1(Modifier.this, b4Var, bool, bool2, lVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return O1;
                }
            });
        }
    }

    public static final int K0(Density density, int i11) {
        return -density.mo371roundToPx0680j_4(Dp.m5115constructorimpl(32));
    }

    public static final yz.g2 K1(x00.l lVar) {
        lVar.invoke(Actions.ACTION_WINNING);
        ma.l.a(ma.t.f73011j, ma.a.f72886z5);
        return yz.g2.f100423a;
    }

    public static final int L0(Density density, int i11) {
        return -density.mo371roundToPx0680j_4(Dp.m5115constructorimpl(24));
    }

    public static final yz.g2 L1(x00.l lVar) {
        lVar.invoke(Actions.ACTION_SEARCH);
        ma.l.a(ma.t.f73003b, ma.a.I);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 M0(final MutableTransitionState mutableTransitionState, final r0.a aVar, final x3 x3Var, final MutableState mutableState, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1945902990, i11, -1, "com.baicizhan.main.home.experiment.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:613)");
        }
        Modifier statusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(PaddingKt.m727paddingVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(16), Dp.m5115constructorimpl(8)));
        r0 e12 = e1(mutableState);
        kotlin.jvm.internal.g0.n(e12, "null cannot be cast to non-null type com.baicizhan.main.home.experiment.HomeAction.DropAd");
        String l11 = ((r0.a) e12).l();
        boolean changedInstance = composer.changedInstance(mutableTransitionState) | composer.changed(aVar);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new c(mutableTransitionState, aVar);
            composer.updateRememberedValue(rememberedValue);
        }
        x00.a aVar2 = (x00.a) ((h10.i) rememberedValue);
        boolean changedInstance2 = composer.changedInstance(x3Var) | composer.changed(mutableState) | composer.changed(aVar) | composer.changedInstance(mutableTransitionState);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.experiment.g2
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 N0;
                    N0 = n3.N0(x3.this, aVar, mutableState, mutableTransitionState);
                    return N0;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        w0(statusBarsPadding, l11, aVar2, (x00.a) rememberedValue2, composer, 0, 0);
        ma.l.b("notify-popup", "notify-popup", a00.k1.k(yz.h1.a("adv_id", aVar.i())));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 M1(x00.l lVar, Boolean bool) {
        lVar.invoke(Actions.ACTION_MESSAGES);
        ma.l.e("notify-popup", ma.a.f72734e0, a00.k1.k(yz.h1.a(ma.b.V1, Integer.valueOf(kotlin.jvm.internal.g0.g(bool, Boolean.TRUE) ? 1 : 0))));
        return yz.g2.f100423a;
    }

    public static final yz.g2 N0(x3 x3Var, r0.a aVar, MutableState mutableState, MutableTransitionState mutableTransitionState) {
        r0 e12 = e1(mutableState);
        kotlin.jvm.internal.g0.n(e12, "null cannot be cast to non-null type com.baicizhan.main.home.experiment.HomeAction.DropAd");
        x3Var.a(((r0.a) e12).k());
        ma.l.b("notify-popup", ma.a.V, a00.k1.k(yz.h1.a("adv_id", aVar.i())));
        T0(mutableTransitionState, aVar);
        return yz.g2.f100423a;
    }

    public static final yz.g2 N1(x00.l lVar) {
        lVar.invoke(Actions.ACTION_TOOLS);
        ma.l.a(ma.t.f73003b, ma.a.A5);
        return yz.g2.f100423a;
    }

    public static final yz.g2 O0(MutableState mutableState) {
        f1(mutableState, r0.c.f21424b);
        return yz.g2.f100423a;
    }

    public static final yz.g2 O1(Modifier modifier, b4 b4Var, Boolean bool, Boolean bool2, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        J1(modifier, b4Var, bool, bool2, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 P0(final x3 x3Var, final State state, final r0.d dVar, final MutableState mutableState, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1348203786, i11, -1, "com.baicizhan.main.home.experiment.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:651)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.Companion.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(16));
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
            r0 d12 = d1(state);
            kotlin.jvm.internal.g0.n(d12, "null cannot be cast to non-null type com.baicizhan.main.home.experiment.HomeAction.PopAd");
            String g11 = ((r0.d) d12).g();
            Modifier aspectRatio$default = AspectRatioKt.aspectRatio$default(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(300)), 0.75f, false, 2, null);
            boolean changedInstance = composer.changedInstance(x3Var) | composer.changed(state) | composer.changed(dVar) | composer.changed(mutableState);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.d2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 Q0;
                        Q0 = n3.Q0(x3.this, dVar, state, mutableState);
                        return Q0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Modifier k11 = ComposeUtilsKt.k(aspectRatio$default, 0L, false, (x00.a) rememberedValue, 3, null);
            ContentScale crop = ContentScale.Companion.getCrop();
            boolean changed = composer.changed(mutableState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.home.experiment.e2
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 R0;
                        R0 = n3.R0(MutableState.this, (AsyncImagePainter.c.b) obj);
                        return R0;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            coil.compose.l.b(g11, "popup-image", k11, null, null, null, null, null, (x00.l) rememberedValue2, null, crop, 0.0f, null, 0, false, null, composer, 48, 6, 64248);
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_close_image_popup, composer, 6);
            boolean changed2 = composer.changed(dVar) | composer.changed(mutableState);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.experiment.f2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 S0;
                        S0 = n3.S0(r0.d.this, mutableState);
                        return S0;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            ImageKt.Image(painterResource, "close", ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue3, 3, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            composer.endNode();
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
    @Preview
    public static final void P1(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-919154233);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-919154233, i11, -1, "com.baicizhan.main.home.experiment.TopActionsPreview (HomeActivity.kt:1139)");
            }
            bk.k.e(null, null, null, f0.f21173a.B(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.h2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Q1;
                    Q1 = n3.Q1(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Q1;
                }
            });
        }
    }

    public static final yz.g2 Q0(x3 x3Var, r0.d dVar, State state, MutableState mutableState) {
        r0 d12 = d1(state);
        kotlin.jvm.internal.g0.n(d12, "null cannot be cast to non-null type com.baicizhan.main.home.experiment.HomeAction.PopAd");
        x3Var.a(((r0.d) d12).h());
        ma.l.b("notify-popup", ma.a.V, a00.k1.k(yz.h1.a("adv_id", dVar.f())));
        f1(mutableState, r0.c.f21424b);
        return yz.g2.f100423a;
    }

    public static final yz.g2 Q1(int i11, Composer composer, int i12) {
        P1(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 R0(MutableState mutableState, AsyncImagePainter.c.b it) {
        kotlin.jvm.internal.g0.p(it, "it");
        f1(mutableState, r0.c.f21424b);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0062  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void R1(final com.baicizhan.main.home.experiment.WinningState r22, final int r23, androidx.compose.ui.Modifier r24, final x00.a<yz.g2> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.n3.R1(com.baicizhan.main.home.experiment.WinningState, int, androidx.compose.ui.Modifier, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 S0(r0.d dVar, MutableState mutableState) {
        ma.l.b("notify-popup", ma.a.W, a00.k1.k(yz.h1.a("adv_id", dVar.f())));
        f1(mutableState, r0.c.f21424b);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 S1(int i11, WinningState winningState, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2086183926, i12, -1, "com.baicizhan.main.home.experiment.Winning.<anonymous>.<anonymous> (HomeActivity.kt:1056)");
            }
            float f11 = 6;
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(12), Dp.m5115constructorimpl(f11));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11)), Alignment.Companion.getCenterVertically(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m727paddingVpY3zN4);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_home_words_actions_winning, composer, 6), "winning", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            TextKt.m1845Text4IGK_g(String.valueOf(i11), (Modifier) null, ColorKt.Color(winningState == WinningState.COMPLETED ? 4282598997L : 4289243836L), TextUnitKt.getSp(18), (FontStyle) null, FontWeight.Companion.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 199680, 0, 131026);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final void T0(MutableTransitionState<Boolean> mutableTransitionState, r0.a aVar) {
        mutableTransitionState.setTargetState$animation_core_release(Boolean.FALSE);
        ma.l.b("notify-popup", ma.a.W, a00.k1.k(yz.h1.a("adv_id", aVar.i())));
    }

    public static final yz.g2 T1(WinningState winningState, int i11, Modifier modifier, x00.a aVar, int i12, int i13, Composer composer, int i14) {
        R1(winningState, i11, modifier, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 U0(x00.l lVar, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(composable, "$this$composable");
        kotlin.jvm.internal.g0.p(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2090142178, i11, -1, "com.baicizhan.main.home.experiment.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:706)");
        }
        AndroidView_androidKt.AndroidView(lVar, WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null)), null, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 16777215, showBackground = true)
    public static final void U1(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(2005236283);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2005236283, i11, -1, "com.baicizhan.main.home.experiment.WinningPreview (HomeActivity.kt:1069)");
            }
            bk.k.e(null, null, null, f0.f21173a.D(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.y2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 V1;
                    V1 = n3.V1(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return V1;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 V0(x3 x3Var, c40.r0 r0Var, ModalBottomSheetState modalBottomSheetState, p5 p5Var, MutableState mutableState, ColumnScope ModalBottomSheetLayout, Composer composer, int i11) {
        s3 d11;
        final x3 x3Var2 = x3Var;
        final c40.r0 r0Var2 = r0Var;
        final ModalBottomSheetState modalBottomSheetState2 = modalBottomSheetState;
        final MutableState mutableState2 = mutableState;
        kotlin.jvm.internal.g0.p(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-841445358, i11, -1, "com.baicizhan.main.home.experiment.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:735)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier navigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(330)));
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, navigationBarsPadding);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxKt.Box(ColumnScopeInstance.INSTANCE.align(BackgroundKt.m234backgroundbw27NRU(SizeKt.m759height3ABfNKs(SizeKt.m778width3ABfNKs(PaddingKt.m728paddingVpY3zN4$default(companion, 0.0f, Dp.m5115constructorimpl(8), 1, null), Dp.m5115constructorimpl(28)), Dp.m5115constructorimpl(5)), ColorKt.Color(4289243836L), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl((float) 2.5d))), companion2.getCenterHorizontally()), composer, 0);
            if (b1(mutableState2) == SheetType.WINNING_SPACE) {
                composer.startReplaceGroup(-1448328644);
                Pair a11 = yz.h1.a(Integer.valueOf(R.drawable.ic_home_sheet_winning), "不断电");
                boolean changedInstance = composer.changedInstance(x3Var2) | composer.changedInstance(r0Var2) | composer.changedInstance(modalBottomSheetState2);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.l1
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 W0;
                            W0 = n3.W0(x3.this, r0Var2, modalBottomSheetState2, mutableState2);
                            return W0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Triple triplet = Standard_extKt.triplet(a11, (x00.a) rememberedValue);
                Pair a12 = yz.h1.a(Integer.valueOf(R.drawable.ic_home_sheet_ranking), "排行榜");
                boolean changedInstance2 = composer.changedInstance(x3Var2) | composer.changedInstance(r0Var2) | composer.changedInstance(modalBottomSheetState2);
                Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.experiment.m1
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 X0;
                            X0 = n3.X0(x3.this, r0Var2, modalBottomSheetState2, mutableState2);
                            return X0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                D1(null, a00.h0.Q(triplet, Standard_extKt.triplet(a12, (x00.a) rememberedValue2)), composer, 0, 1);
                composer.endReplaceGroup();
            } else {
                if (b1(mutableState2) == SheetType.TOOLS) {
                    composer.startReplaceGroup(-1446726161);
                    t3 value = p5Var.l().getValue();
                    t3.c cVar = value instanceof t3.c ? (t3.c) value : null;
                    List<r3> l11 = (cVar == null || (d11 = cVar.d()) == null) ? null : d11.l();
                    if (l11 != null && !l11.isEmpty()) {
                        composer.startReplaceGroup(923170976);
                        List<r3> list = l11;
                        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
                        for (final r3 r3Var : list) {
                            Pair a13 = yz.h1.a(Standard_extKt.getAvailable(r3Var.f()), r3Var.h());
                            boolean changedInstance3 = composer.changedInstance(x3Var2) | composer.changed(r3Var) | composer.changedInstance(r0Var2) | composer.changedInstance(modalBottomSheetState2);
                            Object rememberedValue3 = composer.rememberedValue();
                            if (changedInstance3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                                Object obj = new x00.a() { // from class: com.baicizhan.main.home.experiment.o1
                                    @Override // x00.a
                                    public final Object invoke() {
                                        yz.g2 Y0;
                                        Y0 = n3.Y0(x3.this, r3Var, r0Var2, modalBottomSheetState2, mutableState2);
                                        return Y0;
                                    }
                                };
                                composer.updateRememberedValue(obj);
                                rememberedValue3 = obj;
                            }
                            arrayList.add(Standard_extKt.triplet(a13, (x00.a) rememberedValue3));
                            x3Var2 = x3Var;
                            r0Var2 = r0Var;
                            modalBottomSheetState2 = modalBottomSheetState;
                            mutableState2 = mutableState;
                        }
                        composer.endReplaceGroup();
                        D1(null, arrayList, composer, 0, 1);
                    }
                } else {
                    composer.startReplaceGroup(-1484635782);
                }
                composer.endReplaceGroup();
            }
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 V1(int i11, Composer composer, int i12) {
        U1(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 W0(x3 x3Var, c40.r0 r0Var, ModalBottomSheetState modalBottomSheetState, MutableState mutableState) {
        x3Var.b(SimpleNavigation.WINNING);
        g1(r0Var, modalBottomSheetState, mutableState, SheetType.UNKNOWN);
        ma.l.e(ma.t.f73011j, ma.a.D5, a00.k1.k(yz.h1.a(ma.b.Z1, "不断电")));
        return yz.g2.f100423a;
    }

    public static final yz.g2 X0(x3 x3Var, c40.r0 r0Var, ModalBottomSheetState modalBottomSheetState, MutableState mutableState) {
        x3Var.b(SimpleNavigation.WINNING_RANK);
        g1(r0Var, modalBottomSheetState, mutableState, SheetType.UNKNOWN);
        ma.l.e(ma.t.f73011j, ma.a.D5, a00.k1.k(yz.h1.a(ma.b.Z1, "排行榜")));
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y0(x3 x3Var, r3 r3Var, c40.r0 r0Var, ModalBottomSheetState modalBottomSheetState, MutableState mutableState) {
        x3Var.a(r3Var.g());
        g1(r0Var, modalBottomSheetState, mutableState, SheetType.UNKNOWN);
        ma.l.e(ma.t.f73011j, ma.a.E5, a00.k1.k(yz.h1.a(ma.b.f72890a2, r3Var.h())));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 Z0(final ModalBottomSheetState modalBottomSheetState, final c40.r0 r0Var, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(862645387, i11, -1, "com.baicizhan.main.home.experiment.HomeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:790)");
            }
            boolean isVisible = modalBottomSheetState.isVisible();
            boolean changedInstance = composer.changedInstance(r0Var) | composer.changedInstance(modalBottomSheetState);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.c2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 a12;
                        a12 = n3.a1(c40.r0.this, modalBottomSheetState);
                        return a12;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            BackHandlerKt.BackHandler(isVisible, (x00.a) rememberedValue, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 a1(c40.r0 r0Var, ModalBottomSheetState modalBottomSheetState) {
        c40.k.f(r0Var, null, null, new f(modalBottomSheetState, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final SheetType b1(MutableState<SheetType> mutableState) {
        return mutableState.getValue();
    }

    public static final void c1(MutableState<SheetType> mutableState, SheetType sheetType) {
        mutableState.setValue(sheetType);
    }

    public static final r0 d1(State<? extends r0> state) {
        return state.getValue();
    }

    public static final r0 e1(MutableState<r0> mutableState) {
        return mutableState.getValue();
    }

    public static final void f1(MutableState<r0> mutableState, r0 r0Var) {
        mutableState.setValue(r0Var);
    }

    public static final void g1(c40.r0 r0Var, ModalBottomSheetState modalBottomSheetState, MutableState<SheetType> mutableState, SheetType sheetType) {
        c40.k.f(r0Var, null, null, new h(sheetType, modalBottomSheetState, mutableState, null), 3, null);
    }

    @m80.k
    public static final String[] g2() {
        return f21278c;
    }

    public static final boolean h1(NavHostController navHostController, State<NavBackStackEntry> state, String str) {
        NavDestination destination;
        NavBackStackEntry value = state.getValue();
        return kotlin.jvm.internal.g0.g((value == null || (destination = value.getDestination()) == null) ? null : destination.getRoute(), str);
    }

    @m80.k
    public static final String[] h2() {
        return f21279d;
    }

    public static final yz.g2 i1(x3 x3Var, Map map, p5 p5Var, int i11, int i12, Composer composer, int i13) {
        z0(x3Var, map, p5Var, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @m80.k
    public static final String[] i2() {
        return f21277b;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b9  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j1(@m80.l androidx.compose.ui.Modifier r19, @m80.k final androidx.navigation.NavController r20, @m80.l java.util.List<kg.l> r21, boolean r22, boolean r23, boolean r24, boolean r25, @m80.l x00.l<? super kg.l, yz.g2> r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.n3.j1(androidx.compose.ui.Modifier, androidx.navigation.NavController, java.util.List, boolean, boolean, boolean, boolean, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final boolean j2(Boolean bool) {
        return bool != null;
    }

    public static final yz.g2 k1(kg.l it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0042  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l0(final androidx.compose.ui.graphics.vector.ImageVector r23, androidx.compose.ui.Modifier r24, boolean r25, final x00.a<yz.g2> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.n3.l0(androidx.compose.ui.graphics.vector.ImageVector, androidx.compose.ui.Modifier, boolean, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 l1(NavController navController, List list, final boolean z11, final x00.l lVar, final boolean z12, final boolean z13, final boolean z14, RowScope rowScope, Composer composer, int i11) {
        NavDestination destination;
        final NavController navController2 = navController;
        RowScope HorizontalNavigation = rowScope;
        Composer composer2 = composer;
        kotlin.jvm.internal.g0.p(HorizontalNavigation, "$this$HorizontalNavigation");
        int i12 = (i11 & 6) == 0 ? i11 | (composer2.changed(HorizontalNavigation) ? 4 : 2) : i11;
        int i13 = 0;
        if (composer2.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740965003, i12, -1, "com.baicizhan.main.home.experiment.HomeNavigation.<anonymous> (HomeActivity.kt:1004)");
            }
            State<NavBackStackEntry> currentBackStackEntryAsState = NavHostControllerKt.currentBackStackEntryAsState(navController2, composer2, 0);
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    a00.h0.b0();
                }
                final kg.l lVar2 = (kg.l) obj;
                NavBackStackEntry value = currentBackStackEntryAsState.getValue();
                final String route = (value == null || (destination = value.getDestination()) == null) ? null : destination.getRoute();
                final boolean g11 = kotlin.jvm.internal.g0.g(route, lVar2.h());
                boolean changed = composer2.changed(z11) | composer2.changed(route) | composer2.changedInstance(lVar2) | composer2.changedInstance(navController2) | composer2.changed(lVar);
                Object rememberedValue = composer2.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    x00.a aVar = new x00.a() { // from class: com.baicizhan.main.home.experiment.s1
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 m12;
                            m12 = n3.m1(z11, route, lVar2, navController2, lVar);
                            return m12;
                        }
                    };
                    composer2.updateRememberedValue(aVar);
                    rememberedValue = aVar;
                }
                t1(rowScope, g11, (x00.a) rememberedValue, RowScope.weight$default(HorizontalNavigation, SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), 1.0f, false, 2, null), null, ComposableLambdaKt.rememberComposableLambda(1110371223, true, new x00.r() { // from class: com.baicizhan.main.home.experiment.t1
                    @Override // x00.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        yz.g2 p12;
                        p12 = n3.p1(kg.l.this, g11, z12, z13, z14, (BoxScope) obj2, ((Boolean) obj3).booleanValue(), (Composer) obj4, ((Integer) obj5).intValue());
                        return p12;
                    }
                }, composer2, 54), composer2, (i12 & 14) | 196608, 8);
                navController2 = navController;
                HorizontalNavigation = rowScope;
                composer2 = composer;
                i13 = i14;
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
    public static final yz.g2 m0(ImageVector imageVector, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(386604874, i11, -1, "com.baicizhan.main.home.experiment.Action.<anonymous>.<anonymous> (HomeActivity.kt:1088)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            IconKt.m1692Iconww6aTOc(imageVector, "action-" + imageVector, PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(8)), ColorKt.Color(4279835428L), composer, 3456, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 m1(boolean z11, String str, kg.l lVar, final NavController navController, x00.l lVar2) {
        if (!z11) {
            Log.d("HomeActivity_Player", "Navigation disabled");
            return yz.g2.f100423a;
        }
        if (!kotlin.jvm.internal.g0.g(str, lVar.h())) {
            navController.navigate(lVar.h(), new x00.l() { // from class: com.baicizhan.main.home.experiment.g3
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 n12;
                    n12 = n3.n1(NavController.this, (NavOptionsBuilder) obj);
                    return n12;
                }
            });
            lVar2.invoke(lVar);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 n0(ImageVector imageVector, Modifier modifier, boolean z11, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        l0(imageVector, modifier, z11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 n1(NavController navController, NavOptionsBuilder navigate) {
        kotlin.jvm.internal.g0.p(navigate, "$this$navigate");
        navigate.popUpTo(NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), new x00.l() { // from class: com.baicizhan.main.home.experiment.g1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 o12;
                o12 = n3.o1((PopUpToBuilder) obj);
                return o12;
            }
        });
        navigate.setLaunchSingleTop(true);
        navigate.setRestoreState(true);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0060  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o0(androidx.compose.ui.Modifier r48, final java.lang.String r49, java.lang.String r50, x00.a<yz.g2> r51, androidx.compose.runtime.Composer r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.n3.o0(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 o1(PopUpToBuilder popUpTo) {
        kotlin.jvm.internal.g0.p(popUpTo, "$this$popUpTo");
        popUpTo.setInclusive(false);
        popUpTo.setSaveState(true);
        return yz.g2.f100423a;
    }

    public static final yz.g2 p0() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 p1(kg.l lVar, boolean z11, boolean z12, boolean z13, boolean z14, BoxScope HorizontalNavigationItem, boolean z15, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(HorizontalNavigationItem, "$this$HorizontalNavigationItem");
        if (composer.shouldExecute((i11 & 129) != 128, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1110371223, i11, -1, "com.baicizhan.main.home.experiment.HomeNavigation.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:1031)");
            }
            w1(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), lVar, z11, z12, z13, z14, composer, 6, 0);
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
    public static final yz.g2 q0(String str, String str2, float f11, float f12, x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-72705792, i11, -1, "com.baicizhan.main.home.experiment.ActionCard.<anonymous>.<anonymous> (HomeActivity.kt:1199)");
            }
            if (u30.k0.O3(str)) {
                composer.startReplaceGroup(-1314691552);
                float f13 = 16;
                TextKt.m1845Text4IGK_g(str2, PaddingKt.m729paddingqDBjuR0(Modifier.Companion, Dp.m5115constructorimpl(f13), f11, Dp.m5115constructorimpl(f13), Dp.m5115constructorimpl(f11 + f12)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 0, 0, 131068);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1314502204);
                Alignment.Companion companion = Alignment.Companion;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier.Companion companion2 = Modifier.Companion;
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composer, 48);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion2);
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
                float f14 = 16;
                float f15 = f11 + f12;
                TextKt.m1845Text4IGK_g(str2, PaddingKt.m730paddingqDBjuR0$default(companion2, Dp.m5115constructorimpl(f14), f11, 0.0f, Dp.m5115constructorimpl(f15), 4, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 0, 0, 131068);
                Modifier m729paddingqDBjuR0 = PaddingKt.m729paddingqDBjuR0(ComposeUtilsKt.k(companion2, 0L, false, aVar, 3, null), Dp.m5115constructorimpl(8), f11, Dp.m5115constructorimpl(f14), Dp.m5115constructorimpl(f15));
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(2)), companion.getCenterVertically(), composer, 54);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m729paddingqDBjuR0);
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
                Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
                TextKt.m1845Text4IGK_g(str, (Modifier) null, MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable).m1600getPrimary0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 0, 0, 131066);
                IconKt.m1692Iconww6aTOc(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_word_card_arrow_right, composer, 54), "action-arrow", SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(12)), 0L, composer, 432, 8);
                composer.endNode();
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

    public static final yz.g2 q1(Modifier modifier, NavController navController, List list, boolean z11, boolean z12, boolean z13, boolean z14, x00.l lVar, int i11, int i12, Composer composer, int i13) {
        j1(modifier, navController, list, z11, z12, z13, z14, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 r0(Modifier modifier, String str, String str2, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        o0(modifier, str, str2, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void r1(@m80.l final Modifier modifier, @m80.k final x00.q<? super RowScope, ? super Composer, ? super Integer, yz.g2> content, @m80.l Composer composer, final int i11, final int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-569057948);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-569057948, i13, -1, "com.baicizhan.main.home.experiment.HorizontalNavigation (HomeActivity.kt:928)");
            }
            Modifier then = modifier.then(SelectableGroupKt.selectableGroup(Modifier.Companion));
            int i15 = (i13 << 6) & 7168;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
            content.invoke(RowScopeInstance.INSTANCE, startRestartGroup, Integer.valueOf(((i15 >> 6) & 112) | 6));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.l2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 s12;
                    s12 = n3.s1(Modifier.this, content, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return s12;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 15527148, showBackground = true)
    public static final void s0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1675656212);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1675656212, i11, -1, "com.baicizhan.main.home.experiment.ActionCardPreviews (HomeActivity.kt:1223)");
            }
            bk.k.e(null, null, null, f0.f21173a.J(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.k1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 t02;
                    t02 = n3.t0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return t02;
                }
            });
        }
    }

    public static final yz.g2 s1(Modifier modifier, x00.q qVar, int i11, int i12, Composer composer, int i13) {
        r1(modifier, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 t0(int i11, Composer composer, int i12) {
        s0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0069  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t1(@m80.k final androidx.compose.foundation.layout.RowScope r18, final boolean r19, @m80.k final x00.a<yz.g2> r20, @m80.l androidx.compose.ui.Modifier r21, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r22, @m80.k final x00.r<? super androidx.compose.foundation.layout.BoxScope, ? super java.lang.Boolean, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r23, @m80.l androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.n3.t1(androidx.compose.foundation.layout.RowScope, boolean, x00.a, androidx.compose.ui.Modifier, androidx.compose.foundation.interaction.MutableInteractionSource, x00.r, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 16777215, showBackground = true)
    public static final void u0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1821885895);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1821885895, i11, -1, "com.baicizhan.main.home.experiment.ActionPreview (HomeActivity.kt:1101)");
            }
            bk.k.e(null, null, null, f0.f21173a.I(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.h1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 v02;
                    v02 = n3.v0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return v02;
                }
            });
        }
    }

    public static final yz.g2 u1(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 v0(int i11, Composer composer, int i12) {
        u0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 v1(RowScope rowScope, boolean z11, x00.a aVar, Modifier modifier, MutableInteractionSource mutableInteractionSource, x00.r rVar, int i11, int i12, Composer composer, int i13) {
        t1(rowScope, z11, aVar, modifier, mutableInteractionSource, rVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void w0(Modifier modifier, final String str, final x00.a<yz.g2> aVar, final x00.a<yz.g2> aVar2, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(2097878207);
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
            i13 |= startRestartGroup.changedInstance(aVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(aVar2) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2097878207, i13, -1, "com.baicizhan.main.home.experiment.DropDownMessage (HomeActivity.kt:814)");
            }
            SurfaceKt.m1784SurfaceFjzlyU(ComposeUtilsKt.k(modifier3.then(ShadowKt.m2144shadows4CzXII$default(SizeKt.m759height3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(48)), Dp.m5115constructorimpl(12), null, false, ColorKt.Color(335544320), ColorKt.Color(335544320), 6, null)), 0L, false, aVar2, 3, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(8)), 0L, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-1264599805, true, new x00.p() { // from class: com.baicizhan.main.home.experiment.i1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 x02;
                    x02 = n3.x0(str, aVar, (Composer) obj, ((Integer) obj2).intValue());
                    return x02;
                }
            }, startRestartGroup, 54), startRestartGroup, 1572864, 60);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.j1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 y02;
                    y02 = n3.y0(Modifier.this, str, aVar, aVar2, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return y02;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void w1(androidx.compose.ui.Modifier r46, final kg.l r47, final boolean r48, final boolean r49, boolean r50, boolean r51, androidx.compose.runtime.Composer r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 727
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.n3.w1(androidx.compose.ui.Modifier, kg.l, boolean, boolean, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 x0(String str, x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1264599805, i11, -1, "com.baicizhan.main.home.experiment.DropDownMessage.<anonymous> (HomeActivity.kt:825)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(4), 0.0f, 2, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m728paddingVpY3zN4$default);
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
            ImageKt.Image(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_dropdown_message_broadcast, composer, 54), "broadcast", SizeKt.m773size3ABfNKs(PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null), Dp.m5115constructorimpl(24)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            TextKt.m1845Text4IGK_g(str, PaddingKt.m728paddingVpY3zN4$default(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), Dp.m5115constructorimpl(10), 0.0f, 2, null), 0L, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3072, 3120, 120820);
            com.baicizhan.platform.base.widget.r.w(null, aVar, R.drawable.ic_tip_close, ColorFilter.Companion.m2550tintxETnrds$default(ColorFilter.Companion, ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl(), 0, 2, null), false, null, null, composer, 384, 113);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 x1(boolean z11, GraphicsLayerScope graphicsLayer) {
        kotlin.jvm.internal.g0.p(graphicsLayer, "$this$graphicsLayer");
        if (z11) {
            graphicsLayer.setScaleX(1.143f);
            graphicsLayer.setScaleY(1.143f);
        } else {
            graphicsLayer.setScaleX(1.0f);
            graphicsLayer.setScaleY(1.0f);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 y0(Modifier modifier, String str, x00.a aVar, x00.a aVar2, int i11, int i12, Composer composer, int i13) {
        w0(modifier, str, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 y1(Modifier modifier, kg.l lVar, boolean z11, boolean z12, boolean z13, boolean z14, int i11, int i12, Composer composer, int i13) {
        w1(modifier, lVar, z11, z12, z13, z14, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void z0(final com.baicizhan.main.home.experiment.x3 r16, final java.util.Map<java.lang.String, ? extends x00.l<? super android.content.Context, ? extends android.view.View>> r17, com.baicizhan.main.home.experiment.p5 r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.experiment.n3.z0(com.baicizhan.main.home.experiment.x3, java.util.Map, com.baicizhan.main.home.experiment.p5, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public static final void z1(Modifier modifier, final Object obj, final String str, final x00.a<yz.g2> aVar, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(-255917969);
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
            i13 |= startRestartGroup.changedInstance(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(aVar) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-255917969, i13, -1, "com.baicizhan.main.home.experiment.SheetItem (HomeActivity.kt:853)");
            }
            long Color = ColorKt.Color(4293783033L);
            RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(12));
            Modifier.Companion companion = Modifier.Companion;
            boolean z11 = (i13 & 7168) == 2048;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.experiment.m2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 A1;
                        A1 = n3.A1(x00.a.this);
                        return A1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SurfaceKt.m1784SurfaceFjzlyU(modifier3.then(ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue, 3, null)), m1019RoundedCornerShape0680j_4, Color, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-33886541, true, new x00.p() { // from class: com.baicizhan.main.home.experiment.n2
                @Override // x00.p
                public final Object invoke(Object obj2, Object obj3) {
                    yz.g2 B1;
                    B1 = n3.B1(obj, str, (Composer) obj2, ((Integer) obj3).intValue());
                    return B1;
                }
            }, startRestartGroup, 54), startRestartGroup, 1573248, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.experiment.o2
                @Override // x00.p
                public final Object invoke(Object obj2, Object obj3) {
                    yz.g2 C1;
                    C1 = n3.C1(Modifier.this, obj, str, aVar, i11, i12, (Composer) obj2, ((Integer) obj3).intValue());
                    return C1;
                }
            });
        }
    }
}
