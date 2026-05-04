package com.baicizhan.main.home.player;

import android.content.Context;
import android.util.Log;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import c40.l2;
import c40.n0;
import com.baicizhan.client.business.util.Standard_extKt;
import com.baicizhan.main.home.player.IslandsKt;
import com.baicizhan.main.home.player.data.PromptBehavior;
import com.baicizhan.main.home.player.model.AudioEffect;
import com.baicizhan.main.home.player.u4;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.esotericsoftware.spine.Animation;
import com.esotericsoftware.spine.a;
import com.esotericsoftware.spine.android.SpineView;
import com.google.android.material.timepicker.TimeModel;
import com.jiongji.andriod.card.R;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nIslands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Islands.kt\ncom/baicizhan/main/home/player/IslandsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 10 HiltViewModel.kt\nandroidx/hilt/navigation/compose/HiltViewModelKt\n+ 11 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 12 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 13 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 14 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 15 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 16 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 17 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 18 Composer.kt\nandroidx/compose/runtime/Updater\n+ 19 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 20 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 21 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 22 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 23 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 24 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 25 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 26 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 27 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1149:1\n1788#2,4:1150\n774#2:1173\n865#2,2:1174\n1247#3,6:1154\n1247#3,6:1160\n1247#3,6:1167\n1247#3,6:1176\n1247#3,6:1182\n1247#3,6:1188\n1247#3,3:1201\n1250#3,3:1205\n1247#3,6:1208\n1247#3,6:1214\n1247#3,6:1223\n1247#3,6:1229\n1247#3,6:1236\n1225#3,6:1250\n1247#3,6:1315\n1247#3,6:1321\n1247#3,3:1334\n1250#3,3:1338\n1247#3,6:1341\n1247#3,6:1347\n1247#3,6:1353\n1247#3,6:1359\n1247#3,6:1365\n1247#3,6:1371\n1247#3,6:1377\n1247#3,6:1425\n1247#3,6:1431\n1247#3,6:1437\n1247#3,6:1443\n1247#3,6:1450\n1247#3,6:1456\n1247#3,6:1467\n1247#3,6:1553\n1247#3,6:1657\n1247#3,6:1700\n1247#3,6:1710\n1247#3,6:1753\n1247#3,6:1759\n1247#3,6:1840\n113#4:1166\n113#4:1222\n113#4:1235\n113#4:1242\n123#4:1386\n113#4:1449\n113#4:1466\n113#4:1552\n113#4:1596\n123#4:1600\n113#4:1771\n113#4:1772\n113#4:1792\n113#4:1803\n113#4:1846\n113#4:1883\n113#4:1929\n123#4:1933\n123#4:1937\n113#4:1944\n113#4:1948\n113#4:1952\n113#4:1953\n113#4:1954\n113#4:1955\n113#4:1956\n557#5:1194\n554#5,6:1195\n557#5:1327\n554#5,6:1328\n555#6:1204\n555#6:1337\n75#7:1220\n77#7:1281\n1#8:1221\n1#8:1258\n354#9,7:1243\n361#9,2:1256\n363#9,7:1259\n401#9,10:1266\n400#9:1276\n412#9,4:1277\n416#9,7:1282\n446#9,12:1289\n472#9:1301\n46#10,7:1302\n86#11,6:1309\n57#12:1383\n61#12:1387\n61#12:1597\n57#12:1773\n57#12:1776\n61#12:1779\n61#12:1781\n57#12:1784\n61#12:1786\n57#12:1788\n61#12:1790\n57#12:1930\n61#12:1934\n57#12:1938\n57#12:1941\n57#12:1945\n57#12:1949\n60#13:1384\n70#13:1388\n70#13:1598\n80#13:1770\n60#13:1774\n60#13:1777\n70#13:1780\n70#13:1782\n60#13:1785\n70#13:1787\n60#13:1789\n70#13:1791\n60#13:1931\n70#13:1935\n60#13:1939\n60#13:1942\n60#13:1946\n60#13:1950\n53#13,3:1958\n22#14:1385\n22#14:1599\n22#14:1775\n22#14:1778\n22#14:1783\n22#14:1932\n22#14:1936\n22#14:1940\n22#14:1943\n22#14:1947\n22#14:1951\n70#15:1389\n68#15,8:1390\n77#15:1465\n70#15:1559\n67#15,9:1560\n77#15:1606\n70#15:1663\n67#15,9:1664\n77#15:1709\n70#15:1716\n67#15,9:1717\n77#15:1768\n70#15:1804\n68#15,8:1805\n70#15:1847\n68#15,8:1848\n77#15:1924\n77#15:1928\n79#16,6:1398\n86#16,3:1413\n89#16,2:1422\n93#16:1464\n79#16,6:1484\n86#16,3:1499\n89#16,2:1508\n93#16:1513\n79#16,6:1525\n86#16,3:1540\n89#16,2:1549\n79#16,6:1569\n86#16,3:1584\n89#16,2:1593\n93#16:1605\n93#16:1609\n79#16,6:1622\n86#16,3:1637\n89#16,2:1646\n93#16:1651\n79#16,6:1673\n86#16,3:1688\n89#16,2:1697\n93#16:1708\n79#16,6:1726\n86#16,3:1741\n89#16,2:1750\n93#16:1767\n79#16,6:1813\n86#16,3:1828\n89#16,2:1837\n79#16,6:1856\n86#16,3:1871\n89#16,2:1880\n79#16,6:1890\n86#16,3:1905\n89#16,2:1914\n93#16:1919\n93#16:1923\n93#16:1927\n347#17,9:1404\n356#17:1424\n357#17,2:1462\n347#17,9:1490\n356#17,3:1510\n347#17,9:1531\n356#17:1551\n347#17,9:1575\n356#17:1595\n357#17,2:1603\n357#17,2:1607\n347#17,9:1628\n356#17,3:1648\n347#17,9:1679\n356#17:1699\n357#17,2:1706\n347#17,9:1732\n356#17:1752\n357#17,2:1765\n347#17,9:1819\n356#17:1839\n347#17,9:1862\n356#17:1882\n347#17,9:1896\n356#17,3:1916\n357#17,2:1921\n357#17,2:1925\n4206#18,6:1416\n4206#18,6:1502\n4206#18,6:1543\n4206#18,6:1587\n4206#18,6:1640\n4206#18,6:1691\n4206#18,6:1744\n4206#18,6:1831\n4206#18,6:1874\n4206#18,6:1908\n87#19:1473\n83#19,10:1474\n94#19:1514\n87#19:1611\n83#19,10:1612\n94#19:1652\n87#19,6:1884\n94#19:1920\n99#20:1515\n96#20,9:1516\n106#20:1610\n60#21:1601\n49#21:1602\n85#22:1653\n85#22:1654\n113#22,2:1655\n85#22:1793\n113#22,2:1794\n85#22:1796\n113#22,2:1797\n32#23:1769\n47#24,4:1799\n33#25:1957\n11561#26:1961\n11896#26,3:1962\n11561#26:1965\n11896#26,3:1966\n37#27,2:1969\n*S KotlinDebug\n*F\n+ 1 Islands.kt\ncom/baicizhan/main/home/player/IslandsKt\n*L\n112#1:1150,4\n178#1:1173\n178#1:1174,2\n171#1:1154,6\n172#1:1160,6\n175#1:1167,6\n179#1:1176,6\n180#1:1182,6\n186#1:1188,6\n193#1:1201,3\n193#1:1205,3\n194#1:1208,6\n199#1:1214,6\n312#1:1223,6\n332#1:1229,6\n355#1:1236,6\n381#1:1250,6\n671#1:1315,6\n672#1:1321,6\n674#1:1334,3\n674#1:1338,3\n675#1:1341,6\n676#1:1347,6\n677#1:1353,6\n678#1:1359,6\n700#1:1365,6\n701#1:1371,6\n702#1:1377,6\n781#1:1425,6\n785#1:1431,6\n803#1:1437,6\n811#1:1443,6\n818#1:1450,6\n825#1:1456,6\n909#1:1467,6\n1095#1:1553,6\n206#1:1657,6\n247#1:1700,6\n291#1:1710,6\n293#1:1753,6\n295#1:1759,6\n872#1:1840,6\n173#1:1166\n309#1:1222\n355#1:1235\n381#1:1242\n773#1:1386\n817#1:1449\n869#1:1466\n1095#1:1552\n1131#1:1596\n1131#1:1600\n298#1:1771\n356#1:1772\n369#1:1792\n871#1:1803\n898#1:1846\n900#1:1883\n1096#1:1929\n1097#1:1933\n1098#1:1937\n1103#1:1944\n1105#1:1948\n1107#1:1952\n1113#1:1953\n1115#1:1954\n1117#1:1955\n1125#1:1956\n193#1:1194\n193#1:1195,6\n674#1:1327\n674#1:1328,6\n193#1:1204\n674#1:1337\n309#1:1220\n381#1:1281\n381#1:1258\n381#1:1243,7\n381#1:1256,2\n381#1:1259,7\n381#1:1266,10\n381#1:1276\n381#1:1277,4\n381#1:1282,7\n381#1:1289,12\n381#1:1301\n670#1:1302,7\n670#1:1309,6\n773#1:1383\n773#1:1387\n1131#1:1597\n359#1:1773\n360#1:1776\n360#1:1779\n363#1:1781\n363#1:1784\n363#1:1786\n363#1:1788\n363#1:1790\n1097#1:1930\n1098#1:1934\n1101#1:1938\n1103#1:1941\n1105#1:1945\n1107#1:1949\n773#1:1384\n773#1:1388\n1131#1:1598\n294#1:1770\n359#1:1774\n360#1:1777\n360#1:1780\n363#1:1782\n363#1:1785\n363#1:1787\n363#1:1789\n363#1:1791\n1097#1:1931\n1098#1:1935\n1101#1:1939\n1103#1:1942\n1105#1:1946\n1107#1:1950\n110#1:1958,3\n773#1:1385\n1131#1:1599\n359#1:1775\n360#1:1778\n363#1:1783\n1097#1:1932\n1098#1:1936\n1101#1:1940\n1103#1:1943\n1105#1:1947\n1107#1:1951\n772#1:1389\n772#1:1390,8\n772#1:1465\n1095#1:1559\n1095#1:1560,9\n1095#1:1606\n206#1:1663\n206#1:1664,9\n206#1:1709\n291#1:1716\n291#1:1717,9\n291#1:1768\n871#1:1804\n871#1:1805,8\n872#1:1847\n872#1:1848,8\n872#1:1924\n871#1:1928\n772#1:1398,6\n772#1:1413,3\n772#1:1422,2\n772#1:1464\n1047#1:1484,6\n1047#1:1499,3\n1047#1:1508,2\n1047#1:1513\n1092#1:1525,6\n1092#1:1540,3\n1092#1:1549,2\n1095#1:1569,6\n1095#1:1584,3\n1095#1:1593,2\n1095#1:1605\n1092#1:1609\n1145#1:1622,6\n1145#1:1637,3\n1145#1:1646,2\n1145#1:1651\n206#1:1673,6\n206#1:1688,3\n206#1:1697,2\n206#1:1708\n291#1:1726,6\n291#1:1741,3\n291#1:1750,2\n291#1:1767\n871#1:1813,6\n871#1:1828,3\n871#1:1837,2\n872#1:1856,6\n872#1:1871,3\n872#1:1880,2\n900#1:1890,6\n900#1:1905,3\n900#1:1914,2\n900#1:1919\n872#1:1923\n871#1:1927\n772#1:1404,9\n772#1:1424\n772#1:1462,2\n1047#1:1490,9\n1047#1:1510,3\n1092#1:1531,9\n1092#1:1551\n1095#1:1575,9\n1095#1:1595\n1095#1:1603,2\n1092#1:1607,2\n1145#1:1628,9\n1145#1:1648,3\n206#1:1679,9\n206#1:1699\n206#1:1706,2\n291#1:1732,9\n291#1:1752\n291#1:1765,2\n871#1:1819,9\n871#1:1839\n872#1:1862,9\n872#1:1882\n900#1:1896,9\n900#1:1916,3\n872#1:1921,2\n871#1:1925,2\n772#1:1416,6\n1047#1:1502,6\n1092#1:1543,6\n1095#1:1587,6\n1145#1:1640,6\n206#1:1691,6\n291#1:1744,6\n871#1:1831,6\n872#1:1874,6\n900#1:1908,6\n1047#1:1473\n1047#1:1474,10\n1047#1:1514\n1145#1:1611\n1145#1:1612,10\n1145#1:1652\n900#1:1884,6\n900#1:1920\n1092#1:1515\n1092#1:1516,9\n1092#1:1610\n1131#1:1601\n1131#1:1602\n182#1:1653\n194#1:1654\n194#1:1655,2\n677#1:1793\n677#1:1794,2\n678#1:1796\n678#1:1797,2\n294#1:1769\n683#1:1799,4\n110#1:1957\n526#1:1961\n526#1:1962,3\n538#1:1965\n538#1:1966,3\n547#1:1969,2\n*E\n"})
/* loaded from: classes4.dex */
public final class IslandsKt {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f23296a = "Islands_Compose";

    /* renamed from: b, reason: collision with root package name */
    public static final int f23297b = 8;

    /* renamed from: d, reason: collision with root package name */
    public static final float f23299d = 529.0f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f23300e = 0.6616257f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final s4 f23302g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final s4 f23303h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final s4[] f23304i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final String[] f23305j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final List<s4> f23306k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final Map<String, s4> f23307l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final String f23308m = "none";

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public static final String f23309n = "none_pending";

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public static final String f23310o = "growing";

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final String f23311p = "interaction";

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final String f23312q = "idle";

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public static final String f23313r = "idle_pending";

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final String f23314s = "growing2";

    /* renamed from: t, reason: collision with root package name */
    @m80.k
    public static final String f23315t = "idle2";

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final String f23316u = "unlock";

    /* renamed from: v, reason: collision with root package name */
    public static final long f23317v = 5000;

    /* renamed from: c, reason: collision with root package name */
    public static final long f23298c = Size.m2328constructorimpl((Float.floatToRawIntBits(171.0f) << 32) | (Float.floatToRawIntBits(131.0f) & 4294967295L));

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final s4 f23301f = new s4("ui_xiaodao.atlas.txt", "ui_xiaodao.skel.bytes", a00.h0.Q("role_start", "role_grow_2", "role_chuji", "role_xunhuan1", "role_xunhuan2"), null, null, 24, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIslands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Islands.kt\ncom/baicizhan/main/home/player/IslandsKt$BuildingBoard$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1149:1\n113#2:1150\n113#2:1151\n*S KotlinDebug\n*F\n+ 1 Islands.kt\ncom/baicizhan/main/home/player/IslandsKt$BuildingBoard$1$1$1\n*L\n388#1:1150\n389#1:1151\n*E\n"})
    public static final class a implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23323a = new a();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, (Object) null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, (Object) null);
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            Dimension.Companion companion = Dimension.Companion;
            constrainAs.setWidth(companion.m5473value0680j_4(Dp.m5115constructorimpl(60)));
            constrainAs.setHeight(companion.m5473value0680j_4(Dp.m5115constructorimpl(24)));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nIslands.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Islands.kt\ncom/baicizhan/main/home/player/IslandsKt$BuildingBoard$1$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1149:1\n113#2:1150\n*S KotlinDebug\n*F\n+ 1 Islands.kt\ncom/baicizhan/main/home/player/IslandsKt$BuildingBoard$1$2\n*L\n400#1:1150\n*E\n"})
    public static final class b implements x00.p<Composer, Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f23324a;

        public b(int i11) {
            this.f23324a = i11;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-193338476, i11, -1, "com.baicizhan.main.home.player.BuildingBoard.<anonymous>.<anonymous> (Islands.kt:394)");
            }
            TextKt.m1845Text4IGK_g(String.valueOf(this.f23324a), PaddingKt.m730paddingqDBjuR0$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Dp.m5115constructorimpl(4), Dp.m5115constructorimpl(2), 0.0f, Dp.m5115constructorimpl(1), 4, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle1(), 0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(24), null, null, null, 0, 0, null, 16646139, null), composer, 48, 3072, 56828);
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
    public static final class c implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23325a;

        public c(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23325a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            ConstrainScope.centerVerticallyTo$default(constrainAs, this.f23325a, 0.0f, 2, null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.IslandsKt$IslandAnimated$3$2$1$1", f = "Islands.kt", i = {}, l = {793}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23326a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23327b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MutableState<Boolean> mutableState, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f23327b = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f23327b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23326a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f23327b.setValue(l00.a.a(true));
                Log.d(IslandsKt.f23296a, "show board");
                this.f23326a = 1;
                if (c40.a1.b(2000L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.f23327b.setValue(l00.a.a(false));
            Log.d(IslandsKt.f23296a, "hide board");
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.IslandsKt$IslandAnimated$3$5$1", f = "Islands.kt", i = {}, l = {829, 832, 840}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23328a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f23329b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.esotericsoftware.spine.android.c f23330c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.esotericsoftware.spine.android.c f23331d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MutableState<Pair<String, String>> f23332e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ s4 f23333f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ x00.l<BuildingPhase, yz.g2> f23334g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f23335h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ MutableState<BuildingPhase> f23336i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ MutableState<c40.l2> f23337j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, com.esotericsoftware.spine.android.c cVar, com.esotericsoftware.spine.android.c cVar2, MutableState<Pair<String, String>> mutableState, s4 s4Var, x00.l<? super BuildingPhase, yz.g2> lVar, c40.r0 r0Var, MutableState<BuildingPhase> mutableState2, MutableState<c40.l2> mutableState3, j00.c<? super e> cVar3) {
            super(2, cVar3);
            this.f23329b = str;
            this.f23330c = cVar;
            this.f23331d = cVar2;
            this.f23332e = mutableState;
            this.f23333f = s4Var;
            this.f23334g = lVar;
            this.f23335h = r0Var;
            this.f23336i = mutableState2;
            this.f23337j = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new e(this.f23329b, this.f23330c, this.f23331d, this.f23332e, this.f23333f, this.f23334g, this.f23335h, this.f23336i, this.f23337j, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b6, code lost:
        
            if (c40.a1.b(900, r8) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
        
            if (c40.a1.b(250, r8) == r0) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r8.f23328a
                r2 = 3
                r3 = 2
                r4 = 1
                java.lang.String r5 = "Islands_Compose"
                if (r1 == 0) goto L28
                if (r1 == r4) goto L24
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                kotlin.e.n(r9)
                goto Lb9
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                kotlin.e.n(r9)
                goto L82
            L24:
                kotlin.e.n(r9)
                goto L6c
            L28:
                kotlin.e.n(r9)
                java.lang.String r9 = r8.f23329b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = "lock 1: "
                r1.append(r6)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                android.util.Log.i(r5, r9)
                java.lang.String r9 = r8.f23329b
                java.lang.String r1 = "none_pending"
                boolean r9 = kotlin.jvm.internal.g0.g(r9, r1)
                if (r9 == 0) goto Ld8
                java.lang.String r9 = r8.f23329b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = "lock 2: "
                r1.append(r6)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                android.util.Log.i(r5, r9)
                r8.f23328a = r4
                r6 = 250(0xfa, double:1.235E-321)
                java.lang.Object r9 = c40.a1.b(r6, r8)
                if (r9 != r0) goto L6c
                goto Lb8
            L6c:
                java.lang.String r9 = r8.f23329b
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "lock 3: "
                r1.append(r4)
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                android.util.Log.i(r5, r9)
            L82:
                com.esotericsoftware.spine.android.c r9 = r8.f23330c
                boolean r9 = r9.p()
                if (r9 != 0) goto L95
                r8.f23328a = r3
                r4 = 10
                java.lang.Object r9 = c40.a1.b(r4, r8)
                if (r9 != r0) goto L82
                goto Lb8
            L95:
                com.esotericsoftware.spine.android.c r9 = r8.f23330c
                com.esotericsoftware.spine.a r9 = r9.i()
                java.lang.String r1 = "ani_unlock"
                r3 = 0
                r9.x(r3, r1, r3)
                x00.l<com.baicizhan.main.home.player.BuildingPhase, yz.g2> r9 = r8.f23334g
                c40.r0 r1 = r8.f23335h
                androidx.compose.runtime.MutableState<com.baicizhan.main.home.player.BuildingPhase> r3 = r8.f23336i
                androidx.compose.runtime.MutableState<c40.l2> r4 = r8.f23337j
                com.baicizhan.main.home.player.BuildingPhase r5 = com.baicizhan.main.home.player.BuildingPhase.UNLOCKING
                com.baicizhan.main.home.player.IslandsKt.F0(r9, r1, r3, r4, r5)
                r8.f23328a = r2
                r1 = 900(0x384, double:4.447E-321)
                java.lang.Object r9 = c40.a1.b(r1, r8)
                if (r9 != r0) goto Lb9
            Lb8:
                return r0
            Lb9:
                com.esotericsoftware.spine.android.c r1 = r8.f23331d
                androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.String, java.lang.String>> r2 = r8.f23332e
                com.baicizhan.main.home.player.s4 r9 = r8.f23333f
                java.util.List r3 = r9.l()
                r6 = 12
                r7 = 0
                r4 = 0
                r5 = 0
                com.baicizhan.main.home.player.IslandsKt.W0(r1, r2, r3, r4, r5, r6, r7)
                x00.l<com.baicizhan.main.home.player.BuildingPhase, yz.g2> r9 = r8.f23334g
                c40.r0 r0 = r8.f23335h
                androidx.compose.runtime.MutableState<com.baicizhan.main.home.player.BuildingPhase> r1 = r8.f23336i
                androidx.compose.runtime.MutableState<c40.l2> r2 = r8.f23337j
                com.baicizhan.main.home.player.BuildingPhase r3 = com.baicizhan.main.home.player.BuildingPhase.UNLOCKING2
                com.baicizhan.main.home.player.IslandsKt.F0(r9, r0, r1, r2, r3)
            Ld8:
                yz.g2 r9 = yz.g2.f100423a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.IslandsKt.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.IslandsKt$IslandAnimated$4$2$1$1$1", f = "Islands.kt", i = {}, l = {889}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23338a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wg.q f23339b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.esotericsoftware.spine.android.c f23340c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<Pair<String, String>> f23341d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ s4 f23342e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.l<BuildingPhase, yz.g2> f23343f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f23344g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ MutableState<BuildingPhase> f23345h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ MutableState<c40.l2> f23346i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(wg.q qVar, com.esotericsoftware.spine.android.c cVar, MutableState<Pair<String, String>> mutableState, s4 s4Var, x00.l<? super BuildingPhase, yz.g2> lVar, c40.r0 r0Var, MutableState<BuildingPhase> mutableState2, MutableState<c40.l2> mutableState3, j00.c<? super f> cVar2) {
            super(2, cVar2);
            this.f23339b = qVar;
            this.f23340c = cVar;
            this.f23341d = mutableState;
            this.f23342e = s4Var;
            this.f23343f = lVar;
            this.f23344g = r0Var;
            this.f23345h = mutableState2;
            this.f23346i = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new f(this.f23339b, this.f23340c, this.f23341d, this.f23342e, this.f23343f, this.f23344g, this.f23345h, this.f23346i, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23338a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                wg.q.x(this.f23339b, AudioEffect.TRY_UNLOCKING, null, 2, null);
                this.f23338a = 1;
                if (c40.a1.b(500L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            if (IslandsKt.W0(this.f23340c, this.f23341d, this.f23342e.l(), true, false, 8, null)) {
                IslandsKt.Z(this.f23343f, this.f23344g, this.f23345h, this.f23346i, BuildingPhase.BUILDING);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.IslandsKt$IslandAnimated$5$1", f = "Islands.kt", i = {}, l = {911, 913}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23347a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f23348b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f23349c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23350d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.esotericsoftware.spine.android.c f23351e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableState<Pair<String, String>> f23352f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ s4 f23353g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z11, String str, MutableState<Boolean> mutableState, com.esotericsoftware.spine.android.c cVar, MutableState<Pair<String, String>> mutableState2, s4 s4Var, j00.c<? super g> cVar2) {
            super(2, cVar2);
            this.f23348b = z11;
            this.f23349c = str;
            this.f23350d = mutableState;
            this.f23351e = cVar;
            this.f23352f = mutableState2;
            this.f23353g = s4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new g(this.f23348b, this.f23349c, this.f23350d, this.f23351e, this.f23352f, this.f23353g, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((g) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
        
            if (c40.a1.b(50, r10) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f23347a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L17:
                kotlin.e.n(r11)
                goto L37
            L1b:
                kotlin.e.n(r11)
                boolean r11 = r10.f23348b
                if (r11 != 0) goto L62
                java.lang.String r11 = r10.f23349c
                java.lang.String r1 = "idle"
                boolean r11 = kotlin.jvm.internal.g0.g(r11, r1)
                if (r11 == 0) goto L62
                r10.f23347a = r3
                r3 = 50
                java.lang.Object r11 = c40.a1.b(r3, r10)
                if (r11 != r0) goto L37
                goto L4f
            L37:
                androidx.compose.runtime.MutableState<java.lang.Boolean> r11 = r10.f23350d
                java.lang.Object r11 = r11.getValue()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 != 0) goto L50
                r10.f23347a = r2
                r3 = 10
                java.lang.Object r11 = c40.a1.b(r3, r10)
                if (r11 != r0) goto L37
            L4f:
                return r0
            L50:
                com.esotericsoftware.spine.android.c r3 = r10.f23351e
                androidx.compose.runtime.MutableState<kotlin.Pair<java.lang.String, java.lang.String>> r4 = r10.f23352f
                com.baicizhan.main.home.player.s4 r11 = r10.f23353g
                java.util.List r5 = r11.l()
                r8 = 12
                r9 = 0
                r6 = 0
                r7 = 0
                com.baicizhan.main.home.player.IslandsKt.W0(r3, r4, r5, r6, r7, r8, r9)
            L62:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.IslandsKt.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends a.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState<Pair<String, String>> f23354a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s4 f23355b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<BuildingPhase, yz.g2> f23356c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f23357d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MutableState<BuildingPhase> f23358e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableState<c40.l2> f23359f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23360g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.esotericsoftware.spine.android.c f23361h;

        /* JADX WARN: Multi-variable type inference failed */
        public h(MutableState<Pair<String, String>> mutableState, s4 s4Var, x00.l<? super BuildingPhase, yz.g2> lVar, c40.r0 r0Var, MutableState<BuildingPhase> mutableState2, MutableState<c40.l2> mutableState3, MutableState<Boolean> mutableState4, com.esotericsoftware.spine.android.c cVar) {
            this.f23354a = mutableState;
            this.f23355b = s4Var;
            this.f23356c = lVar;
            this.f23357d = r0Var;
            this.f23358e = mutableState2;
            this.f23359f = mutableState3;
            this.f23360g = mutableState4;
            this.f23361h = cVar;
        }

        @Override // com.esotericsoftware.spine.a.c, com.esotericsoftware.spine.a.d
        public void a(a.g gVar) {
            super.a(gVar);
        }

        @Override // com.esotericsoftware.spine.a.c, com.esotericsoftware.spine.a.d
        public void c(a.g gVar) {
            Animation c11;
            String c12;
            c40.l2 W;
            if (gVar == null || (c11 = gVar.c()) == null || (c12 = c11.c()) == null) {
                return;
            }
            if (kotlin.jvm.internal.g0.g(c12, IslandsKt.K0(this.f23355b.l(), IslandsKt.f23310o))) {
                if (!this.f23360g.getValue().booleanValue()) {
                    IslandsKt.Z(this.f23356c, this.f23357d, this.f23358e, this.f23359f, BuildingPhase.UNLOCKED);
                    if (!this.f23360g.getValue().booleanValue()) {
                        this.f23360g.setValue(Boolean.TRUE);
                    }
                }
            } else if (kotlin.jvm.internal.g0.g(c12, IslandsKt.K0(this.f23355b.l(), IslandsKt.f23315t))) {
                if (IslandsKt.U(this.f23358e) == BuildingPhase.BUILDING && (W = IslandsKt.W(this.f23359f)) != null && W.isActive()) {
                    c40.l2 W2 = IslandsKt.W(this.f23359f);
                    if (W2 != null) {
                        l2.a.b(W2, null, 1, null);
                    }
                    IslandsKt.Z(this.f23356c, this.f23357d, this.f23358e, this.f23359f, BuildingPhase.BUILT);
                } else {
                    BuildingPhase U = IslandsKt.U(this.f23358e);
                    c40.l2 W3 = IslandsKt.W(this.f23359f);
                    Log.d(IslandsKt.f23296a, "idle2 but " + U + " and " + (W3 != null ? Boolean.valueOf(W3.isActive()) : null));
                }
            } else if (kotlin.jvm.internal.g0.g(c12, IslandsKt.K0(this.f23355b.l(), IslandsKt.f23311p))) {
                com.esotericsoftware.spine.android.c cVar = this.f23361h;
                kotlin.jvm.internal.g0.m(cVar);
                IslandsKt.W0(cVar, this.f23354a, this.f23355b.l(), false, false, 12, null);
            }
            super.c(gVar);
        }

        @Override // com.esotericsoftware.spine.a.c, com.esotericsoftware.spine.a.d
        public void f(a.g gVar) {
            Animation c11;
            String c12;
            if (gVar == null || (c11 = gVar.c()) == null || (c12 = c11.c()) == null) {
                return;
            }
            if (kotlin.jvm.internal.g0.g(c12, IslandsKt.K0(this.f23355b.l(), IslandsKt.f23311p))) {
                IslandsKt.Z(this.f23356c, this.f23357d, this.f23358e, this.f23359f, BuildingPhase.INTERACTING);
            }
            g(IslandsKt.S0(this.f23355b.l(), c12));
            super.f(gVar);
        }

        public final void g(String str) {
            if (str == null || kotlin.jvm.internal.g0.g(str, IslandsKt.I(this.f23354a))) {
                return;
            }
            Log.d(IslandsKt.f23296a, "forward: " + IslandsKt.I(this.f23354a) + " --> " + str);
            MutableState<Pair<String, String>> mutableState = this.f23354a;
            mutableState.setValue(yz.h1.a(IslandsKt.I(mutableState), str));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Islands.kt\ncom/baicizhan/main/home/player/IslandsKt\n*L\n1#1,49:1\n684#2,3:50\n*E\n"})
    public static final class i extends kotlin.coroutines.a implements c40.n0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState f23362a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(n0.b bVar, MutableState mutableState) {
            super(bVar);
            this.f23362a = mutableState;
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            Log.e(IslandsKt.f23296a, "pendingBuilt: " + th2.getMessage());
            IslandsKt.X(this.f23362a, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.IslandsKt$IslandAnimated$phaseTo$2", f = "Islands.kt", i = {}, l = {687}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class j extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23363a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<BuildingPhase> f23364b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<BuildingPhase, yz.g2> f23365c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f23366d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MutableState<c40.l2> f23367e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(MutableState<BuildingPhase> mutableState, x00.l<? super BuildingPhase, yz.g2> lVar, c40.r0 r0Var, MutableState<c40.l2> mutableState2, j00.c<? super j> cVar) {
            super(2, cVar);
            this.f23364b = mutableState;
            this.f23365c = lVar;
            this.f23366d = r0Var;
            this.f23367e = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new j(this.f23364b, this.f23365c, this.f23366d, this.f23367e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((j) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23363a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f23363a = 1;
                if (c40.a1.b(5000L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            if (IslandsKt.U(this.f23364b) == BuildingPhase.BUILDING) {
                IslandsKt.Z(this.f23365c, this.f23366d, this.f23364b, this.f23367e, BuildingPhase.BUILT);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.IslandsKt$PagedIslands$4$2$1$1$1", f = "Islands.kt", i = {}, l = {260, 264}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class k extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23368a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PagerState f23369b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<u4> f23370c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(PagerState pagerState, MutableState<u4> mutableState, j00.c<? super k> cVar) {
            super(2, cVar);
            this.f23369b = pagerState;
            this.f23370c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new k(this.f23369b, this.f23370c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((k) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
        
            if (androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(r4, r5, 0.0f, null, r11, 6, null) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0089, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x002a, code lost:
        
            if (c40.a1.b(1100, r11) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r11.f23368a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.e.n(r12)
                goto L8a
            L13:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1b:
                kotlin.e.n(r12)
                goto L2d
            L1f:
                kotlin.e.n(r12)
                r11.f23368a = r3
                r4 = 1100(0x44c, double:5.435E-321)
                java.lang.Object r12 = c40.a1.b(r4, r11)
                if (r12 != r0) goto L2d
                goto L89
            L2d:
                androidx.compose.foundation.pager.PagerState r12 = r11.f23369b
                int r12 = r12.getCurrentPage()
                androidx.compose.foundation.pager.PagerState r1 = r11.f23369b
                int r1 = r1.getPageCount()
                int r1 = r1 - r3
                if (r12 >= r1) goto L8a
                androidx.compose.runtime.MutableState<com.baicizhan.main.home.player.u4> r12 = r11.f23370c
                com.baicizhan.main.home.player.u4$c r1 = new com.baicizhan.main.home.player.u4$c
                androidx.compose.foundation.pager.PagerState r4 = r11.f23369b
                int r4 = r4.getCurrentPage()
                int r4 = r4 + r3
                r1.<init>(r4)
                com.baicizhan.main.home.player.IslandsKt.G0(r12, r1)
                androidx.compose.runtime.MutableState<com.baicizhan.main.home.player.u4> r12 = r11.f23370c
                com.baicizhan.main.home.player.u4 r12 = com.baicizhan.main.home.player.IslandsKt.H0(r12)
                java.lang.String r1 = "null cannot be cast to non-null type com.baicizhan.main.home.player.IslandTransformationState.UnLocking"
                kotlin.jvm.internal.g0.n(r12, r1)
                com.baicizhan.main.home.player.u4$c r12 = (com.baicizhan.main.home.player.u4.c) r12
                int r12 = r12.d()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "set auto transformation to "
                r1.append(r4)
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                java.lang.String r1 = "Islands_Compose"
                android.util.Log.d(r1, r12)
                androidx.compose.foundation.pager.PagerState r4 = r11.f23369b
                int r12 = r4.getCurrentPage()
                int r5 = r12 + 1
                r11.f23368a = r2
                r6 = 0
                r7 = 0
                r9 = 6
                r10 = 0
                r8 = r11
                java.lang.Object r12 = androidx.compose.foundation.pager.PagerState.animateScrollToPage$default(r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L8a
            L89:
                return r0
            L8a:
                yz.g2 r12 = yz.g2.f100423a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.IslandsKt.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.IslandsKt$PagedIslands$7$1", f = "Islands.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class l extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23371a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ PagerState f23372b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23373c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f23374d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<ug.b> f23375e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableState<u4> f23376f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(PagerState pagerState, MutableState<Boolean> mutableState, int i11, List<? extends ug.b> list, MutableState<u4> mutableState2, j00.c<? super l> cVar) {
            super(2, cVar);
            this.f23372b = pagerState;
            this.f23373c = mutableState;
            this.f23374d = i11;
            this.f23375e = list;
            this.f23376f = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new l(this.f23372b, this.f23373c, this.f23374d, this.f23375e, this.f23376f, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((l) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23371a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            Log.d(IslandsKt.f23296a, "current = " + this.f23372b.getCurrentPage() + ", target = " + this.f23372b.getTargetPage() + ", scroll = " + this.f23372b.isScrollInProgress() + ", state = " + IslandsKt.A0(this.f23376f));
            if (this.f23372b.getCurrentPage() == this.f23372b.getTargetPage() && !this.f23372b.isScrollInProgress() && kotlin.jvm.internal.g0.g(IslandsKt.A0(this.f23376f), u4.a.f24216a)) {
                this.f23373c.setValue(l00.a.a(this.f23372b.getCurrentPage() != Math.min(this.f23374d, a00.h0.L(this.f23375e))));
                Log.d(IslandsKt.f23296a, "page away " + this.f23373c.getValue());
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class m {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23377a;

        static {
            int[] iArr = new int[BuildingPhase.values().length];
            try {
                iArr[BuildingPhase.UNLOCKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BuildingPhase.BUILDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BuildingPhase.BUILT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23377a = iArr;
        }
    }

    static {
        s4 s4Var = new s4("ui_w_story_02.atlas.txt", "ui_w_story_02.skel.bytes", a00.h0.Q("ani_none", "ani_grow1", "ani_interact", "ani_idle1", "ani_grow2", "ani_idle2", "ani_unlock"), "satan", null, 16, null);
        f23302g = s4Var;
        f23303h = new s4("ui_w_story_06.atlas.txt", "ui_w_story_06.skel.bytes", a00.h0.Q("ani_none", "ani_grow", "ani_interact", "ani_idle"), "shatan", null, 16, null);
        f23304i = new s4[]{s4Var};
        String[] strArr = {"02", "03", "04", "06", "07", "08", "09", Constants.VIA_REPORT_TYPE_SHARE_TO_QZONE, Constants.VIA_REPORT_TYPE_SET_AVATAR, Constants.VIA_REPORT_TYPE_WPA_STATE, Constants.VIA_REPORT_TYPE_START_GROUP, "18", "20", "21", "27", "30", "32", "33"};
        f23305j = strArr;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new s4("ui_w_story_" + str + ".atlas.txt", "ui_w_story_" + str + ".skel.bytes", a00.h0.Q("ani_none", "ani_grow1", "ani_interact", "ani_idle1", "ani_grow2", "ani_idle2", "ani_unlock"), "satan", str));
        }
        f23306k = arrayList;
        String[] strArr2 = f23305j;
        ArrayList arrayList2 = new ArrayList(strArr2.length);
        for (String str2 : strArr2) {
            arrayList2.add(yz.h1.a(str2, new s4("ui_w_story_" + str2 + ".atlas.txt", "ui_w_story_" + str2 + ".skel.bytes", a00.h0.Q("ani_none", "ani_grow1", "ani_interact", "ani_idle1", "ani_grow2", "ani_idle2", "ani_unlock"), "satan", str2)));
        }
        Pair[] pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        f23307l = a00.l1.W((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    public static final u4 A0(MutableState<u4> mutableState) {
        return mutableState.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void F(Modifier modifier, final int i11, Composer composer, final int i12, final int i13) {
        final Modifier modifier2;
        int i14;
        final int i15;
        Composer composer2;
        final MutableState mutableState;
        ConstraintLayoutScope constraintLayoutScope;
        final MutableState mutableState2;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        Composer startRestartGroup = composer.startRestartGroup(-1388567161);
        int i16 = i13 & 1;
        if (i16 != 0) {
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
        if (startRestartGroup.shouldExecute((i14 & 19) != 18, i14 & 1)) {
            Modifier modifier3 = i16 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1388567161, i14, -1, "com.baicizhan.main.home.player.BuildingBoard (Islands.kt:378)");
            }
            final long Color = ColorKt.Color(4294963160L);
            Modifier then = modifier3.then(SizeKt.m775sizeVpY3zN4(Modifier.Companion, Dp.m5115constructorimpl(72), Dp.m5115constructorimpl(24)));
            startRestartGroup.startReplaceGroup(-1003410150);
            startRestartGroup.startReplaceGroup(212064437);
            startRestartGroup.endReplaceGroup();
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new Measurer2(density);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new ConstraintLayoutScope();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope2);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue4;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotStateKt.mutableStateOf(yz.g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue5;
            boolean changedInstance = startRestartGroup.changedInstance(measurer2) | startRestartGroup.changed(257);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue6 == companion.getEmpty()) {
                final int i17 = 257;
                rememberedValue6 = new MeasurePolicy() { // from class: com.baicizhan.main.home.player.IslandsKt$BuildingBoard$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        MutableState.this.getValue();
                        long m5516performMeasureDjhGOtQ = measurer2.m5516performMeasureDjhGOtQ(j11, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i17);
                        mutableState3.getValue();
                        int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
                        int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: com.baicizhan.main.home.player.IslandsKt$BuildingBoard$$inlined$ConstraintLayout$2.1
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
                mutableState = mutableState3;
                constraintLayoutScope = constraintLayoutScope2;
                mutableState2 = mutableState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                constraintLayoutScope = constraintLayoutScope2;
                mutableState2 = mutableState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState3;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue6;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.IslandsKt$BuildingBoard$$inlined$ConstraintLayout$3
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
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            final x00.a aVar = (x00.a) rememberedValue7;
            boolean changedInstance2 = startRestartGroup.changedInstance(measurer2);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new x00.l<SemanticsPropertyReceiver, yz.g2>() { // from class: com.baicizhan.main.home.player.IslandsKt$BuildingBoard$$inlined$ConstraintLayout$4
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
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            Modifier semantics$default = SemanticsModifierKt.semantics$default(then, false, (x00.l) rememberedValue8, 1, null);
            final ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
            i15 = i11;
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.home.player.IslandsKt$BuildingBoard$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return yz.g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer3, int i18) {
                    if ((i18 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i18, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    MutableState.this.setValue(yz.g2.f100423a);
                    int helpersHashCode = constraintLayoutScope3.getHelpersHashCode();
                    constraintLayoutScope3.reset();
                    ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope3;
                    composer3.startReplaceGroup(867218872);
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope4.createRefs();
                    ConstrainedLayoutReference component1 = createRefs.component1();
                    ConstrainedLayoutReference component2 = createRefs.component2();
                    Modifier.Companion companion2 = Modifier.Companion;
                    Object rememberedValue9 = composer3.rememberedValue();
                    Composer.Companion companion3 = Composer.Companion;
                    if (rememberedValue9 == companion3.getEmpty()) {
                        rememberedValue9 = IslandsKt.a.f23323a;
                        composer3.updateRememberedValue(rememberedValue9);
                    }
                    SurfaceKt.m1784SurfaceFjzlyU(constraintLayoutScope4.constrainAs(companion2, component1, (x00.l) rememberedValue9), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100)), Color, bk.b.L0(Color, composer3, 6), null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-193338476, true, new IslandsKt.b(i11), composer3, 54), composer3, 1573248, 48);
                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_home_forwarding, composer3, 6);
                    boolean changed = composer3.changed(component1);
                    Object rememberedValue10 = composer3.rememberedValue();
                    if (changed || rememberedValue10 == companion3.getEmpty()) {
                        rememberedValue10 = new IslandsKt.c(component1);
                        composer3.updateRememberedValue(rememberedValue10);
                    }
                    ImageKt.Image(painterResource, "icon", constraintLayoutScope4.constrainAs(companion2, component2, (x00.l) rememberedValue10), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer3, 48, 120);
                    composer3.endReplaceGroup();
                    if (constraintLayoutScope3.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(aVar, composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54);
            composer2 = startRestartGroup;
            LayoutKt.MultiMeasureLayout(semantics$default, rememberComposableLambda, measurePolicy, composer2, 48, 0);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            i15 = i11;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.s5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 G;
                    G = IslandsKt.G(Modifier.this, i15, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return G;
                }
            });
        }
    }

    public static final yz.g2 G(Modifier modifier, int i11, int i12, int i13, Composer composer, int i14) {
        F(modifier, i11, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x074c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(@m80.k final androidx.compose.foundation.layout.BoxScope r44, @m80.l androidx.compose.ui.Modifier r45, @m80.k final com.baicizhan.main.home.player.s4 r46, @m80.l java.lang.String r47, int r48, int r49, boolean r50, @m80.l zj.d r51, @m80.l wg.q r52, @m80.l x00.p<? super com.baicizhan.main.home.dialog.e0, ? super com.baicizhan.main.home.player.data.PromptBehavior, yz.g2> r53, @m80.l x00.l<? super com.baicizhan.main.home.player.BuildingPhase, yz.g2> r54, @m80.l androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.IslandsKt.H(androidx.compose.foundation.layout.BoxScope, androidx.compose.ui.Modifier, com.baicizhan.main.home.player.s4, java.lang.String, int, int, boolean, zj.d, wg.q, x00.p, x00.l, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final String I(MutableState<Pair<String, String>> mutableState) {
        String second = mutableState.getValue().getSecond();
        kotlin.jvm.internal.g0.o(second, "<get-second>(...)");
        return second;
    }

    public static final yz.g2 J(com.baicizhan.main.home.dialog.e0 e0Var, PromptBehavior promptBehavior) {
        kotlin.jvm.internal.g0.p(e0Var, "<unused var>");
        kotlin.jvm.internal.g0.p(promptBehavior, "<unused var>");
        return yz.g2.f100423a;
    }

    public static final yz.g2 K(BuildingPhase it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return yz.g2.f100423a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0065, code lost:
    
        return r1.get(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r2.equals(com.baicizhan.main.home.player.IslandsKt.f23312q) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r2.equals(com.baicizhan.main.home.player.IslandsKt.f23313r) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String K0(java.util.List<java.lang.String> r1, java.lang.String r2) {
        /*
            int r0 = r2.hashCode()
            switch(r0) {
                case -840442044: goto L66;
                case 3227604: goto L55;
                case 100055774: goto L44;
                case 293482223: goto L33;
                case 508014371: goto L22;
                case 1125014572: goto L19;
                case 1844104722: goto L8;
                default: goto L7;
            }
        L7:
            goto L6e
        L8:
            java.lang.String r0 = "interaction"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L11
            goto L6e
        L11:
            r2 = 2
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L19:
            java.lang.String r0 = "idle_pending"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5e
            goto L6e
        L22:
            java.lang.String r0 = "growing2"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2b
            goto L6e
        L2b:
            r2 = 4
            java.lang.Object r1 = a00.r0.b3(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L33:
            java.lang.String r0 = "growing"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3c
            goto L6e
        L3c:
            r2 = 1
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L44:
            java.lang.String r0 = "idle2"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4d
            goto L6e
        L4d:
            r2 = 5
            java.lang.Object r1 = a00.r0.b3(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L55:
            java.lang.String r0 = "idle"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5e
            goto L6e
        L5e:
            r2 = 3
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L66:
            java.lang.String r0 = "unlock"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L76
        L6e:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L76:
            r2 = 6
            java.lang.Object r1 = a00.r0.b3(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.IslandsKt.K0(java.util.List, java.lang.String):java.lang.String");
    }

    public static final void L(MutableState mutableState, s4 s4Var, String str, MutableState mutableState2, x00.l lVar, c40.r0 r0Var, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, com.esotericsoftware.spine.android.c cVar) {
        mutableState.setValue(Boolean.TRUE);
        com.esotericsoftware.spine.a i11 = cVar.i();
        String K0 = K0(s4Var.l(), str);
        if (K0 == null) {
            return;
        }
        i11.x(0, K0, Standard_extKt.anyOf(str, new String[]{f23312q, f23315t}));
        cVar.i().d(new h(mutableState2, s4Var, lVar, r0Var, mutableState3, mutableState4, mutableState5, cVar));
    }

    public static final boolean L0(int i11, List<? extends ug.b> list) {
        int i12;
        List<? extends ug.b> subList = list.subList(i11 + 1, list.size());
        if ((subList instanceof Collection) && subList.isEmpty()) {
            i12 = 0;
        } else {
            Iterator<T> it = subList.iterator();
            i12 = 0;
            while (it.hasNext()) {
                if ((((ug.b) it.next()) instanceof ug.c) && (i12 = i12 + 1) < 0) {
                    a00.h0.a0();
                }
            }
        }
        int i13 = i12 % 2;
        return i13 + ((((i13 ^ 2) & ((-i13) | i13)) >> 31) & 2) == 0;
    }

    public static final yz.g2 M(s4 s4Var) {
        va.g.i("island " + s4Var.j(), 0);
        return yz.g2.f100423a;
    }

    @m80.k
    public static final Map<String, s4> M0() {
        return f23307l;
    }

    public static final yz.g2 N(boolean z11, MutableState mutableState, c40.r0 r0Var, com.esotericsoftware.spine.android.c cVar, MutableState mutableState2, s4 s4Var) {
        if (z11 && Standard_extKt.anyOf(I(mutableState2), new String[]{f23315t, f23311p, f23312q})) {
            Log.d(f23296a, I(mutableState2) + org.junit.jupiter.api.j2.O + mutableState.getValue());
            if (kotlin.jvm.internal.g0.g(I(mutableState2), f23312q)) {
                if (!((Boolean) mutableState.getValue()).booleanValue()) {
                    c40.k.f(r0Var, null, null, new d(mutableState, null), 3, null);
                }
                return yz.g2.f100423a;
            }
            W0(cVar, mutableState2, s4Var.l(), true, false, 8, null);
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public static final String[] N0() {
        return f23305j;
    }

    public static final SpineView O(com.esotericsoftware.spine.android.c cVar, s4 s4Var, Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        return new SpineView.b(context, cVar).e("spine/" + s4Var.i(), "spine/" + s4Var.k()).c(new t4(K0(s4Var.l(), "none"), s4Var.h())).a();
    }

    @m80.k
    public static final s4 O0(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        Map<String, s4> map = f23307l;
        s4 s4Var = map.get("02");
        kotlin.jvm.internal.g0.m(s4Var);
        return map.getOrDefault(str, s4Var);
    }

    public static final void P(com.esotericsoftware.spine.android.c cVar) {
        cVar.i().x(0, "ani_idle", false);
    }

    @m80.k
    public static final String P0(int i11) {
        kotlin.jvm.internal.w0 w0Var = kotlin.jvm.internal.w0.f67050a;
        String format = String.format(Locale.US, TimeModel.f32587h, Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
        kotlin.jvm.internal.g0.o(format, "format(...)");
        if (a00.a0.bg(f23305j, format) == -1) {
            format = null;
        }
        return format == null ? "02" : format;
    }

    public static final SpineView Q(com.esotericsoftware.spine.android.c cVar, Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        return new SpineView.b(context, cVar).e("spine/ui_w_story_unlock.atlas.txt", "spine/ui_w_story_unlock.skel.bytes").c(new ll.e("ani_idle")).a();
    }

    @m80.k
    public static final s4[] Q0() {
        return f23304i;
    }

    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 R(zj.d dVar, final int i11, final int i12, final x00.p pVar, final MutableState mutableState, final x00.l lVar, final MutableState mutableState2, final c40.r0 r0Var, final wg.q qVar, final com.esotericsoftware.spine.android.c cVar, final MutableState mutableState3, final s4 s4Var, final MutableState mutableState4, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i13) {
        Modifier modifier;
        Modifier.Companion companion;
        ?? r14;
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1473048886, i13, -1, "com.baicizhan.main.home.player.IslandAnimated.<anonymous> (Islands.kt:870)");
        }
        Modifier.Companion companion2 = Modifier.Companion;
        Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(128));
        if (dVar == null || (modifier = zj.z.k(companion2, dVar, RoundedCornerShapeKt.getCircleShape())) == null) {
            modifier = companion2;
        }
        Modifier then = m773size3ABfNKs.then(modifier);
        Alignment.Companion companion3 = Alignment.Companion;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getCenter(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, then);
        ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
        x00.a<ComposeUiNode> constructor = companion4.getConstructor();
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
        Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        boolean changed = composer.changed(i11) | composer.changed(i12) | composer.changed(pVar) | composer.changed(mutableState) | composer.changed(lVar) | composer.changed(mutableState2) | composer.changedInstance(r0Var) | composer.changedInstance(qVar) | composer.changedInstance(cVar) | composer.changed(mutableState3) | composer.changedInstance(s4Var);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            companion = companion2;
            r14 = 0;
            x00.a aVar = new x00.a() { // from class: com.baicizhan.main.home.player.u5
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 S;
                    S = IslandsKt.S(i11, i12, pVar, mutableState, r0Var, lVar, mutableState2, mutableState4, qVar, cVar, mutableState3, s4Var);
                    return S;
                }
            };
            composer.updateRememberedValue(aVar);
            rememberedValue = aVar;
        } else {
            companion = companion2;
            r14 = 0;
        }
        Modifier.Companion companion5 = companion;
        float f11 = 8;
        Modifier m686offsetVpY3zN4$default = OffsetKt.m686offsetVpY3zN4$default(ComposeUtilsKt.k(companion5, 0L, false, (x00.a) rememberedValue, 3, null), 0.0f, Dp.m5115constructorimpl(f11), 1, null);
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopCenter(), r14);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, r14);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, m686offsetVpY3zN4$default);
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
        Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion4.getSetModifier());
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_home_build_board, composer, 6), "board", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
        Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(companion5, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(6));
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(4)), companion3.getCenterHorizontally(), composer, 54);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, r14);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, m727paddingVpY3zN4);
        x00.a<ComposeUiNode> constructor3 = companion4.getConstructor();
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
        Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
        x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
        if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion4.getSetModifier());
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i14 = MaterialTheme.$stable;
        TextKt.m1845Text4IGK_g("解锁小岛", (Modifier) null, bk.b.P(materialTheme.getColors(composer, i14)), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer, i14).getSubtitle2(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 6, 0, 65530);
        F(null, i12, composer, 0, 1);
        composer.endNode();
        composer.endNode();
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public static final List<s4> R0() {
        return f23306k;
    }

    public static final yz.g2 S(int i11, int i12, x00.p pVar, MutableState mutableState, c40.r0 r0Var, x00.l lVar, MutableState mutableState2, MutableState mutableState3, wg.q qVar, com.esotericsoftware.spine.android.c cVar, MutableState mutableState4, s4 s4Var) {
        if (i11 < i12) {
            pVar.invoke(new com.baicizhan.main.home.dialog.e0("望远镜数量不足", null, null, null, true, R.drawable.image_home_dialog_foward, "", "去学习", false, null, null, false, null, null, null, 32526, null), PromptBehavior.LEARN);
            mutableState.setValue(Boolean.FALSE);
            return yz.g2.f100423a;
        }
        Z(lVar, r0Var, mutableState2, mutableState3, BuildingPhase.PENDING_BUILD);
        c40.k.f(r0Var, null, null, new f(qVar, cVar, mutableState4, s4Var, lVar, r0Var, mutableState2, mutableState3, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final String S0(List<String> list, String str) {
        if (kotlin.jvm.internal.g0.g(str, list.get(0))) {
            return "none";
        }
        if (kotlin.jvm.internal.g0.g(str, list.get(1))) {
            return f23310o;
        }
        if (kotlin.jvm.internal.g0.g(str, list.get(2))) {
            return f23311p;
        }
        if (kotlin.jvm.internal.g0.g(str, list.get(3))) {
            return f23312q;
        }
        if (kotlin.jvm.internal.g0.g(str, "ani_grow2")) {
            return f23314s;
        }
        if (kotlin.jvm.internal.g0.g(str, "ani_idle2")) {
            return f23315t;
        }
        if (kotlin.jvm.internal.g0.g(str, "ani_unlock")) {
            return f23316u;
        }
        return null;
    }

    public static final yz.g2 T(BoxScope boxScope, Modifier modifier, s4 s4Var, String str, int i11, int i12, boolean z11, zj.d dVar, wg.q qVar, x00.p pVar, x00.l lVar, int i13, int i14, int i15, Composer composer, int i16) {
        H(boxScope, modifier, s4Var, str, i11, i12, z11, dVar, qVar, pVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), RecomposeScopeImplKt.updateChangedFlags(i14), i15);
        return yz.g2.f100423a;
    }

    @m80.k
    public static final s4 T0(int i11, int i12) {
        List<s4> list = f23306k;
        int i13 = (i12 - 1) - i11;
        int size = list.size();
        int i14 = i13 % size;
        return list.get(i14 + (size & (((i14 ^ size) & ((-i14) | i14)) >> 31)));
    }

    public static final BuildingPhase U(MutableState<BuildingPhase> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String U0(java.util.List<java.lang.String> r7, java.lang.String r8) {
        /*
            if (r8 == 0) goto L68
            int r0 = r8.hashCode()
            java.lang.String r1 = "unlock"
            java.lang.String r2 = "idle"
            java.lang.String r3 = "growing"
            java.lang.String r4 = "idle2"
            java.lang.String r5 = "growing2"
            java.lang.String r6 = "interaction"
            switch(r0) {
                case -1209194608: goto L5e;
                case -840442044: goto L56;
                case 3227604: goto L47;
                case 3387192: goto L3e;
                case 100055774: goto L36;
                case 293482223: goto L2e;
                case 508014371: goto L26;
                case 1125014572: goto L1d;
                case 1844104722: goto L16;
                default: goto L15;
            }
        L15:
            goto L68
        L16:
            boolean r7 = r8.equals(r6)
            if (r7 != 0) goto L3d
            goto L68
        L1d:
            java.lang.String r0 = "idle_pending"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L4e
            goto L68
        L26:
            boolean r7 = r8.equals(r5)
            if (r7 != 0) goto L2d
            goto L68
        L2d:
            return r4
        L2e:
            boolean r7 = r8.equals(r3)
            if (r7 != 0) goto L35
            goto L68
        L35:
            return r2
        L36:
            boolean r7 = r8.equals(r4)
            if (r7 != 0) goto L3d
            goto L68
        L3d:
            return r6
        L3e:
            java.lang.String r7 = "none"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L67
            goto L68
        L47:
            boolean r8 = r8.equals(r2)
            if (r8 != 0) goto L4e
            goto L68
        L4e:
            java.lang.String r7 = K0(r7, r5)
            if (r7 == 0) goto L55
            return r5
        L55:
            return r6
        L56:
            boolean r7 = r8.equals(r1)
            if (r7 != 0) goto L5d
            goto L68
        L5d:
            return r3
        L5e:
            java.lang.String r7 = "none_pending"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L67
            goto L68
        L67:
            return r1
        L68:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.IslandsKt.U0(java.util.List, java.lang.String):java.lang.String");
    }

    public static final void V(MutableState<BuildingPhase> mutableState, BuildingPhase buildingPhase) {
        mutableState.setValue(buildingPhase);
    }

    public static final boolean V0(com.esotericsoftware.spine.android.c cVar, MutableState<Pair<String, String>> mutableState, List<String> list, boolean z11, boolean z12) {
        Pair<String, String> value = mutableState.getValue();
        String component1 = value.component1();
        kotlin.jvm.internal.g0.o(component1, "component1(...)");
        String str = component1;
        String component2 = value.component2();
        kotlin.jvm.internal.g0.o(component2, "component2(...)");
        String str2 = component2;
        if (!cVar.p()) {
            Log.w(f23296a, "attempt to transform when uninitialized");
            return false;
        }
        Log.d(f23296a, "transform: started - " + mutableState.getValue());
        if (str2.hashCode() == 1844104722 && str2.equals(f23311p)) {
            if (z11) {
                com.esotericsoftware.spine.a i11 = cVar.i();
                String K0 = K0(list, f23311p);
                if (K0 == null) {
                    return false;
                }
                i11.x(0, K0, false);
            } else {
                com.esotericsoftware.spine.a i12 = cVar.i();
                String K02 = K0(list, str);
                if (K02 == null) {
                    return false;
                }
                i12.x(0, K02, Standard_extKt.anyOf(str, new String[]{f23312q, f23315t}));
            }
            return false;
        }
        String U0 = U0(list, str2);
        if (U0 == null) {
            return false;
        }
        Log.d(f23296a, "transform: target = " + U0);
        com.esotericsoftware.spine.a i13 = cVar.i();
        String K03 = K0(list, U0);
        if (K03 == null) {
            return false;
        }
        i13.x(0, K03, Standard_extKt.anyOf(U0, new String[]{f23312q, f23315t}));
        if (z12) {
            if (kotlin.jvm.internal.g0.g(U0, f23316u)) {
                cVar.i().b(0, K0(list, f23310o), false, 0.0f);
                cVar.i().b(0, K0(list, f23312q), true, 0.0f);
            } else if (kotlin.jvm.internal.g0.g(U0, f23314s)) {
                cVar.i().b(0, K0(list, f23315t), true, 0.0f);
            }
        }
        Pair<String, String> a11 = yz.h1.a(str2, U0);
        Log.d(f23296a, "transformed: succeeded to " + a11);
        mutableState.setValue(a11);
        return kotlin.jvm.internal.g0.g(str2, f23312q) && kotlin.jvm.internal.g0.g(U0, f23314s);
    }

    public static final c40.l2 W(MutableState<c40.l2> mutableState) {
        return mutableState.getValue();
    }

    public static /* synthetic */ boolean W0(com.esotericsoftware.spine.android.c cVar, MutableState mutableState, List list, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return V0(cVar, mutableState, list, z11, z12);
    }

    public static final void X(MutableState<c40.l2> mutableState, c40.l2 l2Var) {
        mutableState.setValue(l2Var);
    }

    public static final String Y(MutableState<Pair<String, String>> mutableState) {
        String first = mutableState.getValue().getFirst();
        kotlin.jvm.internal.g0.o(first, "<get-first>(...)");
        return first;
    }

    public static final void Z(x00.l<? super BuildingPhase, yz.g2> lVar, c40.r0 r0Var, MutableState<BuildingPhase> mutableState, final MutableState<c40.l2> mutableState2, BuildingPhase buildingPhase) {
        c40.l2 f11;
        lVar.invoke(buildingPhase);
        V(mutableState, buildingPhase);
        if (buildingPhase == BuildingPhase.BUILDING) {
            f11 = c40.k.f(r0Var, new i(c40.n0.f7891d0, mutableState2), null, new j(mutableState, lVar, r0Var, mutableState2, null), 2, null);
            f11.z0(new x00.l() { // from class: com.baicizhan.main.home.player.v4
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 a02;
                    a02 = IslandsKt.a0(MutableState.this, (Throwable) obj);
                    return a02;
                }
            });
            X(mutableState2, f11);
        }
    }

    public static final yz.g2 a0(MutableState mutableState, Throwable th2) {
        Log.d(f23296a, "pendingBuilt normally");
        X(mutableState, null);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0050  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b0(androidx.compose.ui.Modifier r26, long r27, boolean r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.IslandsKt.b0(androidx.compose.ui.Modifier, long, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1233155185);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1233155185, i11, -1, "com.baicizhan.main.home.player.IslandPathPreview (Islands.kt:1045)");
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
            b0(null, 0L, false, startRestartGroup, 0, 7);
            b0(null, 0L, false, startRestartGroup, 384, 3);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.d5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 d02;
                    d02 = IslandsKt.d0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return d02;
                }
            });
        }
    }

    public static final yz.g2 d0(int i11, Composer composer, int i12) {
        c0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 e0(long j11, boolean z11, DrawScope drawBehind) {
        kotlin.jvm.internal.g0.p(drawBehind, "$this$drawBehind");
        float mo377toPx0680j_4 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(8));
        Path Path = AndroidPath_androidKt.Path();
        if (z11) {
            float f11 = mo377toPx0680j_4 / 2;
            Path.moveTo(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f11, f11);
            Path.cubicTo(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f11, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) * 0.8f, 0.0f, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) * 0.2f, f11, Float.intBitsToFloat((int) (4294967295L & drawBehind.mo3060getSizeNHjbRc())));
        } else {
            float f12 = mo377toPx0680j_4 / 2;
            Path.moveTo(f12, f12);
            Path.cubicTo(0.0f, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) * 0.8f, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) * 0.2f, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - f12, Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)));
        }
        float f13 = 16;
        DrawScope.m3050drawPathLG529CI$default(drawBehind, Path, j11, 0.0f, new Stroke(mo377toPx0680j_4, 0.0f, StrokeCap.Companion.m2864getSquareKaPHkGw(), StrokeJoin.Companion.m2874getRoundLxFBmk8(), PathEffect.Companion.dashPathEffect$default(PathEffect.Companion, new float[]{drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f13)), drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f13)), drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f13))}, 0.0f, 2, null), 2, null), null, 0, 52, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 f0(Modifier modifier, long j11, boolean z11, int i11, int i12, Composer composer, int i13) {
        b0(modifier, j11, z11, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1744869941);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1744869941, i11, -1, "com.baicizhan.main.home.player.MileStonePreview (Islands.kt:1143)");
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
            i0(null, true, 0L, startRestartGroup, 48, 5);
            i0(null, false, 0L, startRestartGroup, 48, 5);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.g5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 h02;
                    h02 = IslandsKt.h0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return h02;
                }
            });
        }
    }

    public static final yz.g2 h0(int i11, Composer composer, int i12) {
        g0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0063  */
    /* JADX WARN: Type inference failed for: r20v3, types: [androidx.compose.ui.Modifier] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i0(androidx.compose.ui.Modifier r27, final boolean r28, long r29, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.IslandsKt.i0(androidx.compose.ui.Modifier, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 j0(long j11, boolean z11, DrawScope drawBehind) {
        kotlin.jvm.internal.g0.p(drawBehind, "$this$drawBehind");
        float mo377toPx0680j_4 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(8));
        long j12 = f23298c;
        float f11 = 2;
        float mo377toPx0680j_42 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(Float.intBitsToFloat((int) (j12 >> 32)))) / f11;
        float intBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L)) - (drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(Float.intBitsToFloat((int) (j12 & 4294967295L)))) / f11);
        Path Path = AndroidPath_androidKt.Path();
        if (z11) {
            float f12 = mo377toPx0680j_4 / f11;
            Path.moveTo((Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - mo377toPx0680j_42) - f12, f12);
            float intBitsToFloat2 = (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - mo377toPx0680j_42) - f12;
            float f13 = 201;
            Path.cubicTo(intBitsToFloat2 + (drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f13)) * 0.55f), intBitsToFloat * 0.73f, (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f13))) + f12, intBitsToFloat * 0.64f, (Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) - drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f13))) + f12, intBitsToFloat);
        } else {
            float f14 = mo377toPx0680j_4 / f11;
            Path.moveTo(f14 + mo377toPx0680j_42, f14);
            float f15 = 201;
            Path.cubicTo((drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f15)) * (-0.55f)) + mo377toPx0680j_42, intBitsToFloat * 0.73f, drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f15)) - f14, intBitsToFloat * 0.64f, drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f15)) - f14, intBitsToFloat);
        }
        float f16 = 16;
        DrawScope.m3050drawPathLG529CI$default(drawBehind, Path, j11, 0.0f, new Stroke(mo377toPx0680j_4, 0.0f, StrokeCap.Companion.m2864getSquareKaPHkGw(), StrokeJoin.Companion.m2874getRoundLxFBmk8(), PathEffect.Companion.dashPathEffect$default(PathEffect.Companion, new float[]{drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f16)), drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f16)), drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f16))}, 0.0f, 2, null), 2, null), null, 0, 52, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 k0(Modifier modifier, boolean z11, long j11, int i11, int i12, Composer composer, int i13) {
        i0(modifier, z11, j11, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x052c, code lost:
    
        if (r7.changed(r5) == false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x01e7, code lost:
    
        if (r9 == androidx.compose.runtime.Composer.Companion.getEmpty()) goto L147;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.animation.core.Easing, androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v55 */
    /* JADX WARN: Type inference failed for: r4v56 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l0(@m80.l androidx.compose.ui.Modifier r37, @m80.k final java.util.List<? extends ug.b> r38, int r39, int r40, @m80.l androidx.compose.foundation.pager.PagerState r41, @m80.l androidx.compose.runtime.MutableState<java.lang.Boolean> r42, @m80.l androidx.compose.foundation.layout.PaddingValues r43, @m80.l zj.d r44, @m80.l x00.p<? super com.baicizhan.main.home.dialog.e0, ? super com.baicizhan.main.home.player.data.PromptBehavior, yz.g2> r45, @m80.k final x00.p<? super com.baicizhan.main.home.player.BuildingPhase, ? super java.lang.Integer, yz.g2> r46, @m80.l androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.IslandsKt.l0(androidx.compose.ui.Modifier, java.util.List, int, int, androidx.compose.foundation.pager.PagerState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, zj.d, x00.p, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final int m0(List list) {
        return list.size();
    }

    public static final void n0(MutableState<u4> mutableState, u4 u4Var) {
        mutableState.setValue(u4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a5  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final yz.g2 o0(final androidx.compose.foundation.pager.PagerState r15, java.util.List r16, int r17, androidx.compose.runtime.MutableState r18, final androidx.compose.runtime.MutableState r19, int r20, zj.d r21, x00.p r22, final androidx.compose.runtime.MutableState r23, final c40.r0 r24, final androidx.compose.runtime.MutableState r25, final x00.p r26, androidx.compose.runtime.State r27, androidx.compose.foundation.pager.PagerScope r28, final int r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.IslandsKt.o0(androidx.compose.foundation.pager.PagerState, java.util.List, int, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, int, zj.d, x00.p, androidx.compose.runtime.MutableState, c40.r0, androidx.compose.runtime.MutableState, x00.p, androidx.compose.runtime.State, androidx.compose.foundation.pager.PagerScope, int, androidx.compose.runtime.Composer, int):yz.g2");
    }

    public static final yz.g2 p0(PagerState pagerState, int i11, GraphicsLayerScope graphicsLayer) {
        kotlin.jvm.internal.g0.p(graphicsLayer, "$this$graphicsLayer");
        float currentPage = (pagerState.getCurrentPage() - i11) + pagerState.getCurrentPageOffsetFraction();
        float abs = Math.abs(currentPage);
        graphicsLayer.setAlpha(MathHelpersKt.lerp(0.3f, 1.0f, 1.0f - g10.u.H(abs, 0.0f, 1.0f)));
        graphicsLayer.mo2701setTransformOrigin__ExYCQ(currentPage > 0.0f ? TransformOriginKt.TransformOrigin(1.0f, 0.6616257f) : TransformOriginKt.TransformOrigin(0.0f, 0.6616257f));
        graphicsLayer.setScaleX(MathHelpersKt.lerp(0.64f, 1.0f, 1.0f - g10.u.H(abs, 0.0f, 1.0f)));
        graphicsLayer.setScaleY(MathHelpersKt.lerp(0.64f, 1.0f, 1.0f - g10.u.H(abs, 0.0f, 1.0f)));
        return yz.g2.f100423a;
    }

    public static final yz.g2 q0(MutableState mutableState, s4 s4Var, c40.r0 r0Var, MutableState mutableState2, x00.p pVar, PagerState pagerState, MutableState mutableState3, BuildingPhase phase) {
        kotlin.jvm.internal.g0.p(phase, "phase");
        int i11 = m.f23377a[phase.ordinal()];
        if (i11 == 1) {
            n0(mutableState3, u4.b.f24218a);
        } else if (i11 == 2) {
            mutableState.setValue(yz.h1.a(Boolean.TRUE, s4Var));
        } else if (i11 == 3) {
            mutableState.setValue(yz.h1.a(Boolean.FALSE, ((Pair) mutableState.getValue()).getSecond()));
            c40.k.f(r0Var, null, null, new k(pagerState, mutableState3, null), 3, null);
        }
        mutableState2.setValue(phase);
        pVar.invoke(phase, Integer.valueOf(pagerState.getCurrentPage()));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 r0(MutableState mutableState, final State state, final MutableState mutableState2, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(171140285, i11, -1, "com.baicizhan.main.home.player.PagedIslands.<anonymous> (Islands.kt:289)");
        }
        s4 s4Var = (s4) ((Pair) mutableState.getValue()).getSecond();
        if (s4Var == null) {
            composer.startReplaceGroup(314104830);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(314104831);
            Modifier.Companion companion = Modifier.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.x5
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 s02;
                        s02 = IslandsKt.s0();
                        return s02;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Modifier k11 = ComposeUtilsKt.k(fillMaxSize$default, 0L, false, (x00.a) rememberedValue, 3, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, k11);
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
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.home.player.y5
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        IntOffset t02;
                        t02 = IslandsKt.t0(MutableState.this, (Density) obj);
                        return t02;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Modifier offset = OffsetKt.offset(companion, (x00.l) rememberedValue2);
            boolean changed = composer.changed(state);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.home.player.z5
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 u02;
                        u02 = IslandsKt.u0(State.this, (GraphicsLayerScope) obj);
                        return u02;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            H(boxScopeInstance, GraphicsLayerModifierKt.graphicsLayer(offset, (x00.l) rememberedValue3), s4Var, f23312q, 0, 0, false, null, null, null, null, composer, 1575942, 0, 984);
            composer.endNode();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 s0() {
        return yz.g2.f100423a;
    }

    public static final IntOffset t0(MutableState mutableState, Density offset) {
        kotlin.jvm.internal.g0.p(offset, "$this$offset");
        com.baicizhan.platform.base.widget.n2 n2Var = (com.baicizhan.platform.base.widget.n2) mutableState.getValue();
        if (n2Var == null) {
            return IntOffset.m5234boximpl(IntOffset.Companion.m5254getZeronOccac());
        }
        int g11 = (int) n2Var.g();
        kotlin.jvm.internal.g0.m(mutableState.getValue());
        return IntOffset.m5234boximpl(IntOffset.m5237constructorimpl((((int) ((com.baicizhan.platform.base.widget.n2) r4).h()) & 4294967295L) | (g11 << 32)));
    }

    public static final yz.g2 u0(State state, GraphicsLayerScope graphicsLayer) {
        kotlin.jvm.internal.g0.p(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setScaleX(z0(state));
        graphicsLayer.setScaleY(z0(state));
        graphicsLayer.setTranslationY(((z0(state) - 1.0f) / 0.3f) * graphicsLayer.mo377toPx0680j_4(Dp.m5115constructorimpl(80)));
        return yz.g2.f100423a;
    }

    public static final yz.g2 w0(Modifier modifier, List list, int i11, int i12, PagerState pagerState, MutableState mutableState, PaddingValues paddingValues, zj.d dVar, x00.p pVar, x00.p pVar2, int i13, int i14, Composer composer, int i15) {
        l0(modifier, list, i11, i12, pagerState, mutableState, paddingValues, dVar, pVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i14);
        return yz.g2.f100423a;
    }

    public static final yz.g2 x0(com.baicizhan.main.home.dialog.e0 e0Var, PromptBehavior promptBehavior) {
        kotlin.jvm.internal.g0.p(e0Var, "<unused var>");
        kotlin.jvm.internal.g0.p(promptBehavior, "<unused var>");
        return yz.g2.f100423a;
    }

    public static final yz.g2 y0(MutableState mutableState, float f11) {
        if (f11 <= 1.0f && kotlin.jvm.internal.g0.g(((Pair) mutableState.getValue()).getFirst(), Boolean.FALSE)) {
            mutableState.setValue(yz.h1.a(null, null));
        }
        return yz.g2.f100423a;
    }

    public static final float z0(State<Float> state) {
        return state.getValue().floatValue();
    }

    public static final int v0(int i11, int i12) {
        return i11;
    }
}
