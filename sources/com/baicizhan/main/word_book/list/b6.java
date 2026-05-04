package com.baicizhan.main.word_book.list;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import android.view.View;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.view.PreviewView;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialThemeKt;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.MimeTypes;
import c40.l2;
import c40.n0;
import coil.request.ImageRequest;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.SystemSettingHelperKt;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.word_book.list.FavoriteMatchingMode;
import com.baicizhan.main.word_book.list.b6;
import com.baicizhan.main.word_book.list.f;
import com.jiongji.andriod.card.R;
import com.squareup.picasso.Picasso;
import com.tencent.connect.common.Constants;
import com.tencent.liteav.TXLiteAVCode;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kc.d;
import kc.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWordFavoriteAddActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordFavoriteAddActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteAddActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 12 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 13 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 14 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 15 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 16 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 17 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 18 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 19 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 20 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1261:1\n1247#2,6:1262\n1247#2,6:1269\n1247#2,6:1351\n1247#2,6:1361\n1247#2,6:1372\n1247#2,6:1378\n1247#2,6:1385\n1247#2,6:1391\n1247#2,6:1397\n1247#2,6:1441\n1247#2,6:1484\n1247#2,6:1528\n1247#2,6:1540\n1247#2,6:1561\n1247#2,6:1609\n1247#2,6:1618\n1247#2,6:1707\n1247#2,6:1713\n1247#2,6:1724\n1247#2,3:1737\n1250#2,3:1741\n1247#2,6:1744\n1247#2,6:1750\n1247#2,6:1833\n1247#2,6:1883\n1247#2,6:1893\n1247#2,6:1899\n1247#2,6:1944\n1247#2,6:1954\n1247#2,6:2008\n1247#2,6:2014\n1247#2,6:2020\n1247#2,6:2026\n1247#2,6:2032\n1247#2,6:2038\n1247#2,3:2051\n1250#2,3:2055\n1247#2,6:2058\n1247#2,6:2064\n1247#2,6:2070\n1247#2,6:2076\n1247#2,6:2082\n1247#2,6:2088\n1247#2,6:2094\n1247#2,6:2101\n1247#2,6:2107\n1247#2,3:2120\n1250#2,3:2124\n1247#2,6:2144\n1247#2,6:2150\n1247#2,6:2156\n1247#2,6:2164\n1247#2,6:2170\n1247#2,6:2176\n1247#2,6:2182\n1247#2,6:2188\n75#3:1268\n75#3:1371\n75#3:1384\n75#3:2006\n75#3:2007\n75#3:2100\n75#3:2127\n75#3:2128\n113#4:1275\n113#4:1350\n113#4:1403\n113#4:1527\n113#4:1534\n113#4:1535\n113#4:1571\n113#4:1615\n113#4:1616\n113#4:1617\n113#4:1669\n113#4:1719\n113#4:1756\n113#4:1757\n113#4:1843\n113#4:1905\n113#4:2194\n113#4:2195\n113#4:2196\n70#5:1276\n67#5,9:1277\n77#5:1370\n70#5:1447\n67#5,9:1448\n77#5:1549\n70#5:1624\n67#5,9:1625\n77#5:1664\n70#5:1670\n67#5,9:1671\n77#5:1723\n70#5:1960\n67#5,9:1961\n77#5:2000\n79#6,6:1286\n86#6,3:1301\n89#6,2:1310\n79#6,6:1323\n86#6,3:1338\n89#6,2:1347\n93#6:1359\n93#6:1369\n79#6,6:1414\n86#6,3:1429\n89#6,2:1438\n79#6,6:1457\n86#6,3:1472\n89#6,2:1481\n79#6,6:1500\n86#6,3:1515\n89#6,2:1524\n93#6:1538\n93#6:1548\n93#6:1569\n79#6,6:1582\n86#6,3:1597\n89#6,2:1606\n79#6,6:1634\n86#6,3:1649\n89#6,2:1658\n93#6:1663\n93#6:1667\n79#6,6:1680\n86#6,3:1695\n89#6,2:1704\n93#6:1722\n79#6,6:1768\n86#6,3:1783\n89#6,2:1792\n79#6,6:1806\n86#6,3:1821\n89#6,2:1830\n93#6:1841\n79#6,6:1856\n86#6,3:1871\n89#6,2:1880\n93#6:1891\n79#6,6:1917\n86#6,3:1932\n89#6,2:1941\n93#6:1952\n79#6,6:1970\n86#6,3:1985\n89#6,2:1994\n93#6:1999\n93#6:2003\n347#7,9:1292\n356#7:1312\n347#7,9:1329\n356#7:1349\n357#7,2:1357\n357#7,2:1367\n347#7,9:1420\n356#7:1440\n347#7,9:1463\n356#7:1483\n347#7,9:1506\n356#7:1526\n357#7,2:1536\n357#7,2:1546\n357#7,2:1567\n347#7,9:1588\n356#7:1608\n347#7,9:1640\n356#7,3:1660\n357#7,2:1665\n347#7,9:1686\n356#7:1706\n357#7,2:1720\n347#7,9:1774\n356#7:1794\n347#7,9:1812\n356#7:1832\n357#7,2:1839\n347#7,9:1862\n356#7:1882\n357#7,2:1889\n347#7,9:1923\n356#7:1943\n357#7,2:1950\n347#7,9:1976\n356#7,3:1996\n357#7,2:2001\n4206#8,6:1304\n4206#8,6:1341\n4206#8,6:1432\n4206#8,6:1475\n4206#8,6:1518\n4206#8,6:1600\n4206#8,6:1652\n4206#8,6:1698\n4206#8,6:1786\n4206#8,6:1824\n4206#8,6:1874\n4206#8,6:1935\n4206#8,6:1988\n99#9:1313\n96#9,9:1314\n106#9:1360\n99#9:1572\n96#9,9:1573\n106#9:1668\n99#9:1758\n96#9,9:1759\n106#9:2004\n87#10:1404\n84#10,9:1405\n87#10:1490\n84#10,9:1491\n94#10:1539\n94#10:1570\n87#10:1795\n83#10,10:1796\n94#10:1842\n87#10:1845\n83#10,10:1846\n94#10:1892\n87#10:1906\n83#10,10:1907\n94#10:1953\n490#11,11:1550\n557#12:1730\n554#12,6:1731\n557#12:2044\n554#12,6:2045\n557#12:2113\n554#12,6:2114\n555#13:1740\n555#13:2054\n555#13:2123\n49#14:1844\n1#15:2005\n54#16:2129\n59#16:2131\n54#16:2136\n59#16:2138\n85#17:2130\n90#17:2132\n85#17:2137\n90#17:2139\n85#18:2133\n113#18,2:2134\n47#19,4:2140\n37#20,2:2162\n*S KotlinDebug\n*F\n+ 1 WordFavoriteAddActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteAddActivityKt\n*L\n282#1:1262,6\n284#1:1269,6\n306#1:1351,6\n325#1:1361,6\n391#1:1372,6\n392#1:1378,6\n394#1:1385,6\n395#1:1391,6\n437#1:1397,6\n455#1:1441,6\n460#1:1484,6\n472#1:1528,6\n486#1:1540,6\n508#1:1561,6\n534#1:1609,6\n554#1:1618,6\n603#1:1707,6\n612#1:1713,6\n638#1:1724,6\n645#1:1737,3\n645#1:1741,3\n646#1:1744,6\n651#1:1750,6\n691#1:1833,6\n700#1:1883,6\n707#1:1893,6\n717#1:1899,6\n728#1:1944,6\n737#1:1954,6\n906#1:2008,6\n907#1:2014,6\n908#1:2020,6\n910#1:2026,6\n911#1:2032,6\n929#1:2038,6\n931#1:2051,3\n931#1:2055,3\n933#1:2058,6\n949#1:2064,6\n980#1:2070,6\n1021#1:2076,6\n1022#1:2082,6\n1037#1:2088,6\n1163#1:2094,6\n1165#1:2101,6\n1167#1:2107,6\n1173#1:2120,3\n1173#1:2124,3\n1182#1:2144,6\n1205#1:2150,6\n1210#1:2156,6\n1222#1:2164,6\n1233#1:2170,6\n1237#1:2176,6\n1248#1:2182,6\n1239#1:2188,6\n283#1:1268\n390#1:1371\n393#1:1384\n904#1:2006\n905#1:2007\n1164#1:2100\n1176#1:2127\n355#1:2128\n287#1:1275\n303#1:1350\n446#1:1403\n470#1:1527\n477#1:1534\n479#1:1535\n531#1:1571\n547#1:1615\n550#1:1616\n552#1:1617\n596#1:1669\n617#1:1719\n679#1:1756\n681#1:1757\n697#1:1843\n721#1:1905\n518#1:2194\n632#1:2195\n633#1:2196\n285#1:1276\n285#1:1277,9\n285#1:1370\n451#1:1447\n451#1:1448,9\n451#1:1549\n548#1:1624\n548#1:1625,9\n548#1:1664\n593#1:1670\n593#1:1671,9\n593#1:1723\n735#1:1960\n735#1:1961,9\n735#1:2000\n285#1:1286,6\n285#1:1301,3\n285#1:1310,2\n292#1:1323,6\n292#1:1338,3\n292#1:1347,2\n292#1:1359\n285#1:1369\n444#1:1414,6\n444#1:1429,3\n444#1:1438,2\n451#1:1457,6\n451#1:1472,3\n451#1:1481,2\n462#1:1500,6\n462#1:1515,3\n462#1:1524,2\n462#1:1538\n451#1:1548\n444#1:1569\n531#1:1582,6\n531#1:1597,3\n531#1:1606,2\n548#1:1634,6\n548#1:1649,3\n548#1:1658,2\n548#1:1663\n531#1:1667\n593#1:1680,6\n593#1:1695,3\n593#1:1704,2\n593#1:1722\n676#1:1768,6\n676#1:1783,3\n676#1:1792,2\n690#1:1806,6\n690#1:1821,3\n690#1:1830,2\n690#1:1841\n699#1:1856,6\n699#1:1871,3\n699#1:1880,2\n699#1:1891\n724#1:1917,6\n724#1:1932,3\n724#1:1941,2\n724#1:1952\n735#1:1970,6\n735#1:1985,3\n735#1:1994,2\n735#1:1999\n676#1:2003\n285#1:1292,9\n285#1:1312\n292#1:1329,9\n292#1:1349\n292#1:1357,2\n285#1:1367,2\n444#1:1420,9\n444#1:1440\n451#1:1463,9\n451#1:1483\n462#1:1506,9\n462#1:1526\n462#1:1536,2\n451#1:1546,2\n444#1:1567,2\n531#1:1588,9\n531#1:1608\n548#1:1640,9\n548#1:1660,3\n531#1:1665,2\n593#1:1686,9\n593#1:1706\n593#1:1720,2\n676#1:1774,9\n676#1:1794\n690#1:1812,9\n690#1:1832\n690#1:1839,2\n699#1:1862,9\n699#1:1882\n699#1:1889,2\n724#1:1923,9\n724#1:1943\n724#1:1950,2\n735#1:1976,9\n735#1:1996,3\n676#1:2001,2\n285#1:1304,6\n292#1:1341,6\n444#1:1432,6\n451#1:1475,6\n462#1:1518,6\n531#1:1600,6\n548#1:1652,6\n593#1:1698,6\n676#1:1786,6\n690#1:1824,6\n699#1:1874,6\n724#1:1935,6\n735#1:1988,6\n292#1:1313\n292#1:1314,9\n292#1:1360\n531#1:1572\n531#1:1573,9\n531#1:1668\n676#1:1758\n676#1:1759,9\n676#1:2004\n444#1:1404\n444#1:1405,9\n462#1:1490\n462#1:1491,9\n462#1:1539\n444#1:1570\n690#1:1795\n690#1:1796,10\n690#1:1842\n699#1:1845\n699#1:1846,10\n699#1:1892\n724#1:1906\n724#1:1907,10\n724#1:1953\n497#1:1550,11\n645#1:1730\n645#1:1731,6\n931#1:2044\n931#1:2045,6\n1173#1:2113\n1173#1:2114,6\n645#1:1740\n931#1:2054\n1173#1:2123\n697#1:1844\n456#1:2129\n456#1:2131\n1043#1:2136\n1043#1:2138\n456#1:2130\n456#1:2132\n1043#1:2137\n1043#1:2139\n929#1:2133\n929#1:2134,2\n1105#1:2140,4\n1214#1:2162,2\n*E\n"})
/* loaded from: classes5.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f26918a = "WordFavoriteAddActivity";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f26922e = "yyyy-MM-dd-HH-mm-ss-SSS";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f26923f = ".jpg";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f26924g = "tmp_words_parser.jpg";

    /* renamed from: b, reason: collision with root package name */
    public static final float f26919b = Dp.m5115constructorimpl(40);

    /* renamed from: c, reason: collision with root package name */
    public static final float f26920c = Dp.m5115constructorimpl(70);

    /* renamed from: d, reason: collision with root package name */
    public static final float f26921d = Dp.m5115constructorimpl(6);

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final Size f26925h = new Size(pd.a.f80340j, 2340);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraPreviewView$2$1", f = "WordFavoriteAddActivity.kt", i = {0, 0}, l = {412}, m = "invokeSuspend", n = {"imageAnalysis", "cameraSelector"}, s = {"L$0", "L$1"}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26926a;

        /* renamed from: b, reason: collision with root package name */
        public Object f26927b;

        /* renamed from: c, reason: collision with root package name */
        public int f26928c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.main.word_book.list.g f26929d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ImageCapture f26930e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f26931f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Context f26932g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ MutableState<Camera> f26933h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Preview f26934i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ PreviewView f26935j;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.word_book.list.b6$a$a, reason: collision with other inner class name */
        public static final class C0331a implements DefaultLifecycleObserver {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Preview f26936a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PreviewView f26937b;

            public C0331a(Preview preview, PreviewView previewView) {
                this.f26936a = preview;
                this.f26937b = previewView;
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onCreate(LifecycleOwner lifecycleOwner) {
                super.onCreate(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onDestroy(LifecycleOwner lifecycleOwner) {
                super.onDestroy(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onPause(LifecycleOwner lifecycleOwner) {
                super.onPause(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(LifecycleOwner owner) {
                kotlin.jvm.internal.g0.p(owner, "owner");
                super.onResume(owner);
                this.f26936a.setSurfaceProvider(this.f26937b.getSurfaceProvider());
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStart(LifecycleOwner lifecycleOwner) {
                super.onStart(lifecycleOwner);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public /* bridge */ void onStop(LifecycleOwner lifecycleOwner) {
                super.onStop(lifecycleOwner);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.baicizhan.main.word_book.list.g gVar, ImageCapture imageCapture, LifecycleOwner lifecycleOwner, Context context, MutableState<Camera> mutableState, Preview preview, PreviewView previewView, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f26929d = gVar;
            this.f26930e = imageCapture;
            this.f26931f = lifecycleOwner;
            this.f26932g = context;
            this.f26933h = mutableState;
            this.f26934i = preview;
            this.f26935j = previewView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f26929d, this.f26930e, this.f26931f, this.f26932g, this.f26933h, this.f26934i, this.f26935j, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ImageAnalysis build;
            CameraSelector cameraSelector;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26928c;
            if (i11 == 0) {
                kotlin.e.n(obj);
                qb.c.b(b6.f26918a, "cam state [" + this.f26929d + "], image capture [" + (this.f26930e != null) + "]", new Object[0]);
                if (this.f26929d != com.baicizhan.main.word_book.list.g.f27146d) {
                    return yz.g2.f100423a;
                }
                if (this.f26930e == null) {
                    return yz.g2.f100423a;
                }
                if (this.f26931f.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                    qb.c.q(b6.f26918a, "no binding for lifecycle state already DESTROYED!", new Object[0]);
                    return yz.g2.f100423a;
                }
                build = new ImageAnalysis.Builder().build();
                kotlin.jvm.internal.g0.o(build, "build(...)");
                CameraSelector build2 = new CameraSelector.Builder().requireLensFacing(1).build();
                kotlin.jvm.internal.g0.o(build2, "build(...)");
                Context context = this.f26932g;
                this.f26926a = build;
                this.f26927b = build2;
                this.f26928c = 1;
                obj = b6.g2(context, this);
                if (obj == l11) {
                    return l11;
                }
                cameraSelector = build2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cameraSelector = (CameraSelector) this.f26927b;
                build = (ImageAnalysis) this.f26926a;
                kotlin.e.n(obj);
            }
            ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) obj;
            if (!processCameraProvider.hasCamera(cameraSelector)) {
                qb.c.d(b6.f26918a, "no back camera!", new Object[0]);
                return yz.g2.f100423a;
            }
            processCameraProvider.unbindAll();
            this.f26933h.setValue(processCameraProvider.bindToLifecycle(this.f26931f, cameraSelector, this.f26934i, this.f26930e, build));
            this.f26934i.setSurfaceProvider(this.f26935j.getSurfaceProvider());
            this.f26931f.getLifecycle().addObserver(new C0331a(this.f26934i, this.f26935j));
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$saveTemporaryParserPic$2", f = "WordFavoriteAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a0 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26938a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2 f26939b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FileOutputStream f26940c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(e2 e2Var, FileOutputStream fileOutputStream, j00.c<? super a0> cVar) {
            super(2, cVar);
            this.f26939b = e2Var;
            this.f26940c = fileOutputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new a0(this.f26939b, this.f26940c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super Boolean> cVar) {
            return ((a0) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26938a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(this.f26939b.e(), 0, this.f26939b.e().length);
            kotlin.jvm.internal.g0.o(decodeByteArray, "decodeByteArray(...)");
            return l00.a.a(b6.h2(decodeByteArray, this.f26939b.f()).compress(Bitmap.CompressFormat.JPEG, 100, this.f26940c));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraPreviewView$3$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26941a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2 f26942b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Preview f26943c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ PreviewView f26944d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MutableState<Camera> f26945e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f26946f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e2 e2Var, Preview preview, PreviewView previewView, MutableState<Camera> mutableState, boolean z11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f26942b = e2Var;
            this.f26943c = preview;
            this.f26944d = previewView;
            this.f26945e = mutableState;
            this.f26946f = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f26942b, this.f26943c, this.f26944d, this.f26945e, this.f26946f, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CameraControl cameraControl;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26941a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (this.f26942b == null) {
                this.f26943c.setSurfaceProvider(this.f26944d.getSurfaceProvider());
                Camera value = this.f26945e.getValue();
                if (value != null && (cameraControl = value.getCameraControl()) != null) {
                    cameraControl.enableTorch(this.f26946f);
                }
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraPreviewView$4$2$3$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26947a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.a<yz.g2> f26948b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x00.a<yz.g2> aVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f26948b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f26948b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26947a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f26948b.invoke();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraView$2$1$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {935}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class e extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26949a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.platform.base.widget.q3 f26950b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.baicizhan.platform.base.widget.q3 q3Var, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f26950b = q3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new e(this.f26950b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26949a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.platform.base.widget.q3 q3Var = this.f26950b;
                this.f26949a = 1;
                if (q3Var.a(this) == l11) {
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
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraView$3$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {952}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26951a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ um.h f26952b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f26953c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f26954d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f26955e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.platform.base.widget.q3 f26956f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(um.h hVar, Context context, MutableState<Boolean> mutableState, c40.r0 r0Var, com.baicizhan.platform.base.widget.q3 q3Var, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f26952b = hVar;
            this.f26953c = context;
            this.f26954d = mutableState;
            this.f26955e = r0Var;
            this.f26956f = q3Var;
        }

        public static final yz.g2 k(MutableState mutableState, View view) {
            b6.N0(mutableState, true);
            return yz.g2.f100423a;
        }

        public static final yz.g2 m(um.h hVar, c40.r0 r0Var, com.baicizhan.platform.base.widget.q3 q3Var, Context context, View view) {
            b6.P0(hVar, r0Var, q3Var, context);
            return yz.g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new f(this.f26952b, this.f26953c, this.f26954d, this.f26955e, this.f26956f, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Type inference failed for: r11v16, types: [kc.d, kc.h] */
        /* JADX WARN: Type inference failed for: r4v0, types: [kc.d$a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26951a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                if (!this.f26952b.d() && !this.f26952b.b()) {
                    this.f26951a = 1;
                    if (c40.a1.b(350L, this) == l11) {
                        return l11;
                    }
                }
                return yz.g2.f100423a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (this.f26952b.a()) {
                Context context = this.f26953c;
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity != null) {
                    u.a U = new u.a(context).U(R.string.common_permission_camera_needed);
                    final MutableState<Boolean> mutableState = this.f26954d;
                    ?? o11 = U.o(R.string.dialog_permission_cancel, new x00.l() { // from class: com.baicizhan.main.word_book.list.c6
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            yz.g2 k11;
                            k11 = b6.f.k(MutableState.this, (View) obj2);
                            return k11;
                        }
                    });
                    final um.h hVar = this.f26952b;
                    final c40.r0 r0Var = this.f26955e;
                    final com.baicizhan.platform.base.widget.q3 q3Var = this.f26956f;
                    final Context context2 = this.f26953c;
                    mc.a.p(fragmentActivity, ((u.a) d.a.I(o11, R.string.dialog_permission_confirm, null, new x00.l() { // from class: com.baicizhan.main.word_book.list.d6
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            yz.g2 m11;
                            m11 = b6.f.m(um.h.this, r0Var, q3Var, context2, (View) obj2);
                            return m11;
                        }
                    }, 2, null)).d(), null, 2, null);
                }
            } else {
                b6.P0(this.f26952b, this.f26955e, this.f26956f, this.f26953c);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g implements ImageCapture.OnImageSavedCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f26957a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f26958b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<e2> f26959c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f26960d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraView$5$1$onImageSaved$1", f = "WordFavoriteAddActivity.kt", i = {0}, l = {1067}, m = "invokeSuspend", n = {"filePath"}, s = {"L$0"}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f26961a;

            /* renamed from: b, reason: collision with root package name */
            public int f26962b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Context f26963c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ MutableState<e2> f26964d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ ImageCapture.OutputFileResults f26965e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ MutableState<String> f26966f;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraView$5$1$onImageSaved$1$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
            /* renamed from: com.baicizhan.main.word_book.list.b6$g$a$a, reason: collision with other inner class name */
            public static final class C0332a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f26967a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MutableState<String> f26968b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f26969c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0332a(MutableState<String> mutableState, String str, j00.c<? super C0332a> cVar) {
                    super(2, cVar);
                    this.f26968b = mutableState;
                    this.f26969c = str;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                    return new C0332a(this.f26968b, this.f26969c, cVar);
                }

                @Override // x00.p
                public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                    return ((C0332a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.l();
                    if (this.f26967a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                    this.f26968b.setValue(this.f26969c);
                    return yz.g2.f100423a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Context context, MutableState<e2> mutableState, ImageCapture.OutputFileResults outputFileResults, MutableState<String> mutableState2, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f26963c = context;
                this.f26964d = mutableState;
                this.f26965e = outputFileResults;
                this.f26966f = mutableState2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f26963c, this.f26964d, this.f26965e, this.f26966f, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String str;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f26962b;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    String absolutePath = new File(this.f26963c.getCacheDir(), "captureTemp").getAbsolutePath();
                    c40.v2 e11 = c40.h1.e();
                    C0332a c0332a = new C0332a(this.f26966f, absolutePath, null);
                    this.f26961a = absolutePath;
                    this.f26962b = 1;
                    if (c40.i.h(e11, c0332a, this) == l11) {
                        return l11;
                    }
                    str = absolutePath;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f26961a;
                    kotlin.e.n(obj);
                }
                byte[] bytes = FileUtils.getBytes(new FileInputStream(new File(this.f26963c.getCacheDir(), "captureTemp")));
                MutableState<e2> mutableState = this.f26964d;
                kotlin.jvm.internal.g0.m(str);
                int f22 = b6.f2(str);
                kotlin.jvm.internal.g0.m(bytes);
                mutableState.setValue(new e2(f22, bytes));
                qb.c.b(b6.f26918a, "captured rotation: " + this.f26965e + " " + bytes.length + " ", new Object[0]);
                return yz.g2.f100423a;
            }
        }

        public g(c40.r0 r0Var, Context context, MutableState<e2> mutableState, MutableState<String> mutableState2) {
            this.f26957a = r0Var;
            this.f26958b = context;
            this.f26959c = mutableState;
            this.f26960d = mutableState2;
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onError(ImageCaptureException exception) {
            kotlin.jvm.internal.g0.p(exception, "exception");
            qb.c.c(b6.f26918a, "", exception);
        }

        @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
        public void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
            kotlin.jvm.internal.g0.p(outputFileResults, "outputFileResults");
            c40.k.f(this.f26957a, null, null, new a(this.f26958b, this.f26959c, outputFileResults, this.f26960d, null), 3, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraView$5$3$2", f = "WordFavoriteAddActivity.kt", i = {}, l = {TXLiteAVCode.WARNING_SW_ENCODER_START_FAIL}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26970a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f26971b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<e2> f26972c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Context context, MutableState<e2> mutableState, j00.c<? super h> cVar) {
            super(2, cVar);
            this.f26971b = context;
            this.f26972c = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new h(this.f26971b, this.f26972c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((h) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            byte[] e11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26970a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                Context context = this.f26971b;
                e2 value = this.f26972c.getValue();
                if (value == null || (e11 = value.e()) == null) {
                    return yz.g2.f100423a;
                }
                this.f26970a = 1;
                obj = b6.j2(context, e11, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            va.g.g(((Boolean) obj).booleanValue() ? R.string.word_favorites_add_toast_camera_capture_saved : R.string.word_favorites_add_toast_camera_capture_save_failed, 0);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraView$5$4", f = "WordFavoriteAddActivity.kt", i = {}, l = {1120}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f26973a;

        /* renamed from: b, reason: collision with root package name */
        public int f26974b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<Uri, yz.g2> f26975c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f26976d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MutableState<e2> f26977e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(x00.l<? super Uri, yz.g2> lVar, Context context, MutableState<e2> mutableState, j00.c<? super i> cVar) {
            super(2, cVar);
            this.f26975c = lVar;
            this.f26976d = context;
            this.f26977e = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new i(this.f26975c, this.f26976d, this.f26977e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((i) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x00.l<Uri, yz.g2> lVar;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26974b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                x00.l<Uri, yz.g2> lVar2 = this.f26975c;
                Context context = this.f26976d;
                e2 value = this.f26977e.getValue();
                if (value == null) {
                    return yz.g2.f100423a;
                }
                this.f26973a = lVar2;
                this.f26974b = 1;
                Object k22 = b6.k2(context, value, this);
                if (k22 == l11) {
                    return l11;
                }
                lVar = lVar2;
                obj = k22;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lVar = (x00.l) this.f26973a;
                kotlin.e.n(obj);
            }
            Uri uri = (Uri) obj;
            if (uri == null) {
                return yz.g2.f100423a;
            }
            lVar.invoke(uri);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends ActivityResultContracts.GetContent {
        @Override // androidx.activity.result.contract.ActivityResultContracts.GetContent, androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String input) {
            kotlin.jvm.internal.g0.p(context, "context");
            kotlin.jvm.internal.g0.p(input, "input");
            Intent createIntent = super.createIntent(context, input);
            createIntent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/jpeg", MimeTypes.IMAGE_PNG});
            return createIntent;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraView$galleryLauncher$2$1$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class k extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26978a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<Uri, yz.g2> f26979b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f26980c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(x00.l<? super Uri, yz.g2> lVar, Uri uri, j00.c<? super k> cVar) {
            super(2, cVar);
            this.f26979b = lVar;
            this.f26980c = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new k(this.f26979b, this.f26980c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((k) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26978a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f26979b.invoke(this.f26980c);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 WordFavoriteAddActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteAddActivityKt\n*L\n1#1,49:1\n1106#2,2:50\n*E\n"})
    public static final class l extends kotlin.coroutines.a implements c40.n0 {
        public l(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
            qb.c.d(b6.f26918a, "camera action - on-save: " + th2.getMessage(), new Object[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraView$requestCamera$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {942, 944}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class m extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26981a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ um.h f26982b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.platform.base.widget.q3 f26983c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f26984d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(um.h hVar, com.baicizhan.platform.base.widget.q3 q3Var, Context context, j00.c<? super m> cVar) {
            super(2, cVar);
            this.f26982b = hVar;
            this.f26983c = q3Var;
            this.f26984d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new m(this.f26982b, this.f26983c, this.f26984d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((m) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
        
            if (r6.e("百词斩请求\"相机\"权限", r1, r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
        
            if (c40.a1.b(200, r5) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f26981a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                goto L4f
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.e.n(r6)
                goto L2c
            L1e:
                kotlin.e.n(r6)
                r5.f26981a = r3
                r3 = 200(0xc8, double:9.9E-322)
                java.lang.Object r6 = c40.a1.b(r3, r5)
                if (r6 != r0) goto L2c
                goto L4e
            L2c:
                um.h r6 = r5.f26982b
                boolean r6 = r6.b()
                if (r6 != 0) goto L4f
                com.baicizhan.platform.base.widget.q3 r6 = r5.f26983c
                android.content.Context r1 = r5.f26984d
                r3 = 2131821377(0x7f110341, float:1.9275495E38)
                java.lang.String r1 = r1.getString(r3)
                java.lang.String r3 = "getString(...)"
                kotlin.jvm.internal.g0.o(r1, r3)
                r5.f26981a = r2
                java.lang.String r2 = "百词斩请求\"相机\"权限"
                java.lang.Object r6 = r6.e(r2, r1, r5)
                if (r6 != r0) goto L4f
            L4e:
                return r0
            L4f:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.b6.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraView$storagePermission$1$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {916}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class n extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26985a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.platform.base.widget.q3 f26986b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.baicizhan.platform.base.widget.q3 q3Var, j00.c<? super n> cVar) {
            super(2, cVar);
            this.f26986b = q3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new n(this.f26986b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((n) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26985a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.platform.base.widget.q3 q3Var = this.f26986b;
                this.f26985a = 1;
                if (q3Var.a(this) == l11) {
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
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraView$withStoragePermissionCheck$1$1$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {1000}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class o extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26987a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.platform.base.widget.q3 f26988b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f26989c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(com.baicizhan.platform.base.widget.q3 q3Var, Context context, j00.c<? super o> cVar) {
            super(2, cVar);
            this.f26988b = q3Var;
            this.f26989c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new o(this.f26988b, this.f26989c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((o) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26987a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                com.baicizhan.platform.base.widget.q3 q3Var = this.f26988b;
                String string = this.f26989c.getString(R.string.permission_storage_banner_content);
                kotlin.jvm.internal.g0.o(string, "getString(...)");
                this.f26987a = 1;
                if (q3Var.e("百词斩请求\"存储\"权限", string, this) == l11) {
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
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$CameraView$withStoragePermissionCheck$1$2", f = "WordFavoriteAddActivity.kt", i = {}, l = {1009, 1010}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class p extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26990a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.baicizhan.platform.base.widget.q3 f26991b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f26992c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(com.baicizhan.platform.base.widget.q3 q3Var, Context context, j00.c<? super p> cVar) {
            super(2, cVar);
            this.f26991b = q3Var;
            this.f26992c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new p(this.f26991b, this.f26992c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((p) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
        
            if (r6.e("百词斩请求\"存储\"权限", r1, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            if (c40.a1.b(200, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f26990a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.e.n(r6)
                goto L2c
            L1e:
                kotlin.e.n(r6)
                r5.f26990a = r3
                r3 = 200(0xc8, double:9.9E-322)
                java.lang.Object r6 = c40.a1.b(r3, r5)
                if (r6 != r0) goto L2c
                goto L46
            L2c:
                com.baicizhan.platform.base.widget.q3 r6 = r5.f26991b
                android.content.Context r1 = r5.f26992c
                r3 = 2131821385(0x7f110349, float:1.9275512E38)
                java.lang.String r1 = r1.getString(r3)
                java.lang.String r3 = "getString(...)"
                kotlin.jvm.internal.g0.o(r1, r3)
                r5.f26990a = r2
                java.lang.String r2 = "百词斩请求\"存储\"权限"
                java.lang.Object r6 = r6.e(r2, r1, r5)
                if (r6 != r0) goto L47
            L46:
                return r0
            L47:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.b6.p.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$ControlButton$2$1$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {655}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class q extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26993a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f26994b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(MutableState<Boolean> mutableState, j00.c<? super q> cVar) {
            super(2, cVar);
            this.f26994b = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new q(this.f26994b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((q) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f26993a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f26993a = 1;
                if (c40.a1.b(1000L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            this.f26994b.setValue(l00.a.a(true));
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$FavoriteEditContent$3$2$6$1$1$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class r extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f26995a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> f26996b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f26997c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f26998d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f26999e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ long f27000f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, Context context, Uri uri, long j11, long j12, j00.c<? super r> cVar) {
            super(2, cVar);
            this.f26996b = managedActivityResultLauncher;
            this.f26997c = context;
            this.f26998d = uri;
            this.f26999e = j11;
            this.f27000f = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new r(this.f26996b, this.f26997c, this.f26998d, this.f26999e, this.f27000f, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((r) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f26995a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f26996b.launch(WordFavoriteMatchActivity.f26824c.a(this.f26997c, new FavoriteMatchingMode.Bytes(this.f26998d, this.f26999e), this.f27000f));
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$FavoriteEditContent$3$2$7$1$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class s extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f27001a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ManagedActivityResultLauncher<Intent, ActivityResult> f27002b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f27003c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Uri f27004d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f27005e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ManagedActivityResultLauncher<Intent, ActivityResult> managedActivityResultLauncher, Context context, Uri uri, long j11, j00.c<? super s> cVar) {
            super(2, cVar);
            this.f27002b = managedActivityResultLauncher;
            this.f27003c = context;
            this.f27004d = uri;
            this.f27005e = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new s(this.f27002b, this.f27003c, this.f27004d, this.f27005e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((s) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f27001a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f27002b.launch(WordFavoriteMatchActivity.f26824c.a(this.f27003c, new FavoriteMatchingMode.BytesByOcr(this.f27004d), this.f27005e));
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class t {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27006a;

        static {
            int[] iArr = new int[FavoriteAddingMode.values().length];
            try {
                iArr[FavoriteAddingMode.DESCRIPTION_AND_CAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FavoriteAddingMode.CAM_OCR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27006a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$WordsEdit$1$2$1", f = "WordFavoriteAddActivity.kt", i = {}, l = {326}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class u extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f27007a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextInputService f27008b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ FocusRequester f27009c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(TextInputService textInputService, FocusRequester focusRequester, j00.c<? super u> cVar) {
            super(2, cVar);
            this.f27008b = textInputService;
            this.f27009c = focusRequester;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new u(this.f27008b, this.f27009c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((u) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f27007a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f27007a = 1;
                if (c40.a1.b(150L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            TextInputService textInputService = this.f27008b;
            if (textInputService != null) {
                textInputService.showSoftwareKeyboard();
            }
            FocusRequester.m2179requestFocus3ESFkO8$default(this.f27009c, 0, 1, null);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt", f = "WordFavoriteAddActivity.kt", i = {0, 0, 0}, l = {792}, m = "asPictureBytes", n = {"$this$asPictureBytes", c90.k.f8409a, "limit"}, s = {"L$0", "L$1", "J$0"}, v = 1)
    public static final class v extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f27010a;

        /* renamed from: b, reason: collision with root package name */
        public Object f27011b;

        /* renamed from: c, reason: collision with root package name */
        public long f27012c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f27013d;

        /* renamed from: e, reason: collision with root package name */
        public int f27014e;

        public v(j00.c<? super v> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f27013d = obj;
            this.f27014e |= Integer.MIN_VALUE;
            return b6.d2(null, null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$asPictureBytes$2", f = "WordFavoriteAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class w extends SuspendLambda implements x00.p<c40.r0, j00.c<? super byte[]>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f27015a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f27016b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f27017c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f27018d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Context context, Uri uri, long j11, j00.c<? super w> cVar) {
            super(2, cVar);
            this.f27016b = context;
            this.f27017c = uri;
            this.f27018d = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new w(this.f27016b, this.f27017c, this.f27018d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super byte[]> cVar) {
            return ((w) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i11;
            byte[] byteArray;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f27015a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            InputStream openInputStream = this.f27016b.getContentResolver().openInputStream(this.f27017c);
            if (openInputStream != null) {
                try {
                    String attribute = new ExifInterface(openInputStream).getAttribute(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION);
                    if (attribute != null) {
                        int hashCode = attribute.hashCode();
                        if (hashCode != 51) {
                            if (hashCode != 54) {
                                if (hashCode == 56 && attribute.equals(Constants.VIA_SHARE_TYPE_PUBLISHVIDEO)) {
                                    i11 = 270;
                                    qb.c.b(b6.f26918a, "rotate for " + i11, new Object[0]);
                                    yz.g2 g2Var = yz.g2.f100423a;
                                    r00.b.a(openInputStream, null);
                                }
                            } else if (attribute.equals(Constants.VIA_SHARE_TYPE_INFO)) {
                                i11 = 90;
                                qb.c.b(b6.f26918a, "rotate for " + i11, new Object[0]);
                                yz.g2 g2Var2 = yz.g2.f100423a;
                                r00.b.a(openInputStream, null);
                            }
                        } else if (attribute.equals("3")) {
                            i11 = 180;
                            qb.c.b(b6.f26918a, "rotate for " + i11, new Object[0]);
                            yz.g2 g2Var22 = yz.g2.f100423a;
                            r00.b.a(openInputStream, null);
                        }
                    }
                    i11 = 0;
                    qb.c.b(b6.f26918a, "rotate for " + i11, new Object[0]);
                    yz.g2 g2Var222 = yz.g2.f100423a;
                    r00.b.a(openInputStream, null);
                } finally {
                }
            } else {
                i11 = 0;
            }
            Bitmap l11 = Picasso.k().s(this.f27017c).G(b6.f26925h.getWidth(), b6.f26925h.getHeight()).c().I(i11).l();
            if (l11 == null) {
                return new byte[0];
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i12 = 100;
            do {
                byteArrayOutputStream.reset();
                l11.compress(Bitmap.CompressFormat.JPEG, i12, byteArrayOutputStream);
                byteArray = byteArrayOutputStream.toByteArray();
                kotlin.jvm.internal.g0.o(byteArray, "toByteArray(...)");
                i12 -= 5;
                long j11 = this.f27018d;
                if (j11 <= 0 || byteArray.length <= j11) {
                    break;
                }
            } while (i12 > 0);
            qb.c.b(b6.f26918a, "bytes final to " + (byteArray.length / 1024), new Object[0]);
            return byteArray;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class x implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j00.c<ProcessCameraProvider> f27019a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.google.common.util.concurrent.p1<ProcessCameraProvider> f27020b;

        /* JADX WARN: Multi-variable type inference failed */
        public x(j00.c<? super ProcessCameraProvider> cVar, com.google.common.util.concurrent.p1<ProcessCameraProvider> p1Var) {
            this.f27019a = cVar;
            this.f27020b = p1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j00.c<ProcessCameraProvider> cVar = this.f27019a;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(this.f27020b.get()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt$saveCapture$2", f = "WordFavoriteAddActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class y extends SuspendLambda implements x00.p<c40.r0, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f27021a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f27022b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f27023c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Context context, byte[] bArr, j00.c<? super y> cVar) {
            super(2, cVar);
            this.f27022b = context;
            this.f27023c = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new y(this.f27022b, this.f27023c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super Boolean> cVar) {
            return ((y) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f27021a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return l00.a.a(b9.d.c().f(this.f27022b, this.f27023c, new SimpleDateFormat(b6.f26922e, Locale.US).format(l00.a.g(System.currentTimeMillis())), ".jpg"));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.word_book.list.WordFavoriteAddActivityKt", f = "WordFavoriteAddActivity.kt", i = {0, 0, 0}, l = {879}, m = "saveTemporaryParserPic", n = {c90.k.f8409a, "image", TypedValues.AttributesType.S_TARGET}, s = {"L$0", "L$1", "L$2"}, v = 1)
    public static final class z extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f27024a;

        /* renamed from: b, reason: collision with root package name */
        public Object f27025b;

        /* renamed from: c, reason: collision with root package name */
        public Object f27026c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f27027d;

        /* renamed from: e, reason: collision with root package name */
        public int f27028e;

        public z(j00.c<? super z> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f27027d = obj;
            this.f27028e |= Integer.MIN_VALUE;
            return b6.k2(null, null, this);
        }
    }

    public static final PreviewView A0(PreviewView previewView, Context it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return previewView;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void A1(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-404152031);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-404152031, i11, -1, "com.baicizhan.main.word_book.list.PreviewControlPreviewOff (WordFavoriteAddActivity.kt:574)");
            }
            bk.k.e(null, null, null, b0.f26887a.q(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.q3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 B1;
                    B1 = b6.B1(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return B1;
                }
            });
        }
    }

    public static final yz.g2 B0(Context context) {
        SystemSettingHelperKt.goAppSetting(context);
        return yz.g2.f100423a;
    }

    public static final yz.g2 B1(int i11, Composer composer, int i12) {
        A1(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 C0(x00.l lVar, x00.l lVar2, MutableState mutableState, com.baicizhan.main.word_book.list.f it) {
        CameraControl cameraControl;
        kotlin.jvm.internal.g0.p(it, "it");
        lVar.invoke(it);
        if (it instanceof f.b) {
            lVar2.invoke(Boolean.FALSE);
            Camera camera = (Camera) mutableState.getValue();
            if (camera != null && (cameraControl = camera.getCameraControl()) != null) {
                cameraControl.enableTorch(false);
            }
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void C1(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(108463867);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(108463867, i11, -1, "com.baicizhan.main.word_book.list.PreviewControlPreviewOn (WordFavoriteAddActivity.kt:565)");
            }
            bk.k.e(null, null, null, b0.f26887a.w(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.r4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 D1;
                    D1 = b6.D1(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return D1;
                }
            });
        }
    }

    public static final yz.g2 D0(FavoriteAddingMode favoriteAddingMode, com.baicizhan.main.word_book.list.g gVar, e2 e2Var, ImageCapture imageCapture, PreviewView previewView, String str, x00.l lVar, x00.a aVar, x00.l lVar2, int i11, Composer composer, int i12) {
        y0(favoriteAddingMode, gVar, e2Var, imageCapture, previewView, str, lVar, aVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 D1(int i11, Composer composer, int i12) {
        C1(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [T, c40.l2] */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, java.lang.Runnable] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void E0(@m80.k final FavoriteAddingMode mode, @m80.k final com.baicizhan.platform.base.widget.q3 permissionTipState, @m80.k final x00.a<yz.g2> onCameraGuide, @m80.k final x00.l<? super Uri, yz.g2> onMatch, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        final LifecycleOwner lifecycleOwner;
        kotlin.jvm.internal.g0.p(mode, "mode");
        kotlin.jvm.internal.g0.p(permissionTipState, "permissionTipState");
        kotlin.jvm.internal.g0.p(onCameraGuide, "onCameraGuide");
        kotlin.jvm.internal.g0.p(onMatch, "onMatch");
        Composer startRestartGroup = composer.startRestartGroup(-1758654139);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(mode.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(permissionTipState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(onCameraGuide) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(onMatch) ? 2048 : 1024;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1758654139, i13, -1, "com.baicizhan.main.word_book.list.CameraView (WordFavoriteAddActivity.kt:902)");
            }
            final Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final LifecycleOwner lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            final ImageCapture imageCapture = (ImageCapture) mutableState.component1();
            final x00.l component2 = mutableState.component2();
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue3;
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                startRestartGroup.updateRememberedValue(null);
                rememberedValue4 = null;
            }
            objectRef.element = (c40.l2) rememberedValue4;
            final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                startRestartGroup.updateRememberedValue(null);
                rememberedValue5 = null;
            }
            objectRef2.element = (Runnable) rememberedValue5;
            final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(new ActivityResultContracts.RequestPermission(), new x00.l() { // from class: com.baicizhan.main.word_book.list.r3
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 L0;
                    L0 = b6.L0(Ref.ObjectRef.this, lifecycleOwner2, objectRef2, context, permissionTipState, ((Boolean) obj).booleanValue());
                    return L0;
                }
            }, startRestartGroup, 0);
            um.h a11 = um.i.a("android.permission.CAMERA", startRestartGroup, 6);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState4 = (MutableState) rememberedValue6;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion.getEmpty()) {
                rememberedValue7 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            final c40.r0 r0Var = (c40.r0) rememberedValue7;
            if (a11.b()) {
                startRestartGroup.startReplaceGroup(-2052783730);
                boolean changedInstance = startRestartGroup.changedInstance(r0Var) | startRestartGroup.changedInstance(permissionTipState);
                Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue8 == companion.getEmpty()) {
                    rememberedValue8 = new x00.a() { // from class: com.baicizhan.main.word_book.list.s3
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 O0;
                            O0 = b6.O0(c40.r0.this, permissionTipState);
                            return O0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                }
                EffectsKt.SideEffect((x00.a) rememberedValue8, startRestartGroup, 0);
            } else {
                startRestartGroup.startReplaceGroup(-2089487203);
            }
            startRestartGroup.endReplaceGroup();
            boolean changed = startRestartGroup.changed(a11) | startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(r0Var) | startRestartGroup.changedInstance(permissionTipState);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue9 == companion.getEmpty()) {
                lifecycleOwner = lifecycleOwner2;
                f fVar = new f(a11, context, mutableState4, r0Var, permissionTipState, null);
                startRestartGroup.updateRememberedValue(fVar);
                rememberedValue9 = fVar;
            } else {
                lifecycleOwner = lifecycleOwner2;
            }
            EffectsKt.LaunchedEffect(a11, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue9, startRestartGroup, 0);
            j jVar = new j();
            boolean changedInstance2 = ((i13 & 7168) == 2048) | startRestartGroup.changedInstance(lifecycleOwner);
            Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue10 == companion.getEmpty()) {
                rememberedValue10 = new x00.l() { // from class: com.baicizhan.main.word_book.list.t3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 F0;
                        F0 = b6.F0(LifecycleOwner.this, onMatch, (Uri) obj);
                        return F0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            final ManagedActivityResultLauncher rememberLauncherForActivityResult2 = ActivityResultRegistryKt.rememberLauncherForActivityResult(jVar, (x00.l) rememberedValue10, startRestartGroup, 0);
            Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (rememberedValue11 == companion.getEmpty()) {
                rememberedValue11 = new PreviewView(context);
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            PreviewView previewView = (PreviewView) rememberedValue11;
            Object rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == companion.getEmpty()) {
                rememberedValue12 = Executors.newSingleThreadExecutor();
                startRestartGroup.updateRememberedValue(rememberedValue12);
            }
            final ExecutorService executorService = (ExecutorService) rememberedValue12;
            com.baicizhan.main.word_book.list.g gVar = M0(mutableState4) ? com.baicizhan.main.word_book.list.g.f27145c : a11.d() ? com.baicizhan.main.word_book.list.g.f27146d : (a11.b() || !a11.a()) ? a11.b() ? com.baicizhan.main.word_book.list.g.f27145c : com.baicizhan.main.word_book.list.g.f27143a : com.baicizhan.main.word_book.list.g.f27144b;
            e2 e2Var = (e2) mutableState3.getValue();
            String str = (String) mutableState2.getValue();
            boolean changedInstance3 = startRestartGroup.changedInstance(imageCapture) | startRestartGroup.changed(component2);
            Object rememberedValue13 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue13 == companion.getEmpty()) {
                rememberedValue13 = new x00.l() { // from class: com.baicizhan.main.word_book.list.u3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 G0;
                        G0 = b6.G0(ImageCapture.this, component2, (IntSize) obj);
                        return G0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue13);
            }
            final LifecycleOwner lifecycleOwner3 = lifecycleOwner;
            y0(mode, gVar, e2Var, imageCapture, previewView, str, (x00.l) rememberedValue13, onCameraGuide, new x00.l() { // from class: com.baicizhan.main.word_book.list.v3
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 H0;
                    H0 = b6.H0(ImageCapture.this, context, executorService, mode, mutableState2, mutableState3, lifecycleOwner3, r0Var, rememberLauncherForActivityResult2, rememberLauncherForActivityResult, objectRef, objectRef2, permissionTipState, onMatch, (f) obj);
                    return H0;
                }
            }, startRestartGroup, (i13 & 14) | ((i13 << 15) & 29360128));
            composer2 = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.w3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 K0;
                    K0 = b6.K0(FavoriteAddingMode.this, permissionTipState, onCameraGuide, onMatch, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return K0;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void E1(Modifier modifier, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(2089278963);
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
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2089278963, i13, -1, "com.baicizhan.main.word_book.list.PreviewFrame (WordFavoriteAddActivity.kt:591)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier then = modifier4.then(SizeKt.fillMaxSize$default(PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(4)), 0.0f, 1, null));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifier5 = modifier4;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_word_fav_add_ocr_frame_top, startRestartGroup, 6), "frame_top_left", (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_word_fav_add_ocr_frame_top, startRestartGroup, 6);
            Modifier align = boxScopeInstance.align(companion, companion2.getTopEnd());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.Companion;
            if (rememberedValue == companion4.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.word_book.list.z4
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 F1;
                        F1 = b6.F1((GraphicsLayerScope) obj);
                        return F1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ImageKt.Image(painterResource, "frame_top_right", GraphicsLayerModifierKt.graphicsLayer(align, (x00.l) rememberedValue), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_word_fav_add_ocr_frame_bottom, startRestartGroup, 6), "frame_bottom_left", boxScopeInstance.align(companion, companion2.getBottomStart()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.ic_word_fav_add_ocr_frame_bottom, startRestartGroup, 6);
            Modifier align2 = boxScopeInstance.align(companion, companion2.getBottomEnd());
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion4.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.word_book.list.a5
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 G1;
                        G1 = b6.G1((GraphicsLayerScope) obj);
                        return G1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ImageKt.Image(painterResource2, "frame_bottom_right", GraphicsLayerModifierKt.graphicsLayer(align2, (x00.l) rememberedValue2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            modifier3 = modifier5;
            TextKt.m1845Text4IGK_g("竖向拍摄，识别更准确", boxScopeInstance.align(PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m5115constructorimpl(20), 7, null), companion2.getBottomCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBody2(), bk.b.A0(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, 6, 0, 65532);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.b5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 H1;
                    H1 = b6.H1(Modifier.this, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return H1;
                }
            });
        }
    }

    public static final yz.g2 F0(LifecycleOwner lifecycleOwner, x00.l lVar, Uri uri) {
        if (uri != null) {
            c40.k.f(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new k(lVar, uri, null), 3, null);
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 F1(GraphicsLayerScope graphicsLayer) {
        kotlin.jvm.internal.g0.p(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationY(180.0f);
        return yz.g2.f100423a;
    }

    public static final yz.g2 G0(ImageCapture imageCapture, x00.l lVar, IntSize intSize) {
        if (imageCapture == null) {
            qb.c.b(f26918a, "setup capture as " + intSize, new Object[0]);
            lVar.invoke(new ImageCapture.Builder().setCaptureMode(1).setTargetResolution(new Size((int) (intSize.m5290unboximpl() >> 32), (int) (intSize.m5290unboximpl() & 4294967295L))).build());
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 G1(GraphicsLayerScope graphicsLayer) {
        kotlin.jvm.internal.g0.p(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationY(180.0f);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kc.d, kc.h] */
    public static final yz.g2 H0(ImageCapture imageCapture, final Context context, ExecutorService executorService, FavoriteAddingMode favoriteAddingMode, MutableState mutableState, final MutableState mutableState2, final LifecycleOwner lifecycleOwner, c40.r0 r0Var, final ManagedActivityResultLauncher managedActivityResultLauncher, ManagedActivityResultLauncher managedActivityResultLauncher2, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, com.baicizhan.platform.base.widget.q3 q3Var, x00.l lVar, com.baicizhan.main.word_book.list.f action) {
        kotlin.jvm.internal.g0.p(action, "action");
        if (kotlin.jvm.internal.g0.g(action, f.a.f27087a)) {
            if (imageCapture != null) {
                imageCapture.setTargetRotation(0);
            }
            if (imageCapture != null) {
                imageCapture.takePicture(new ImageCapture.OutputFileOptions.Builder(new File(context.getCacheDir(), "captureTemp")).build(), executorService, new g(r0Var, context, mutableState2, mutableState));
            }
            if (favoriteAddingMode == FavoriteAddingMode.CAM_OCR) {
                ma.l.b(ma.t.D, ma.a.f72766i4, ma.u.a("taking_bottom_type", 2));
            }
        } else if (kotlin.jvm.internal.g0.g(action, f.b.f27089a)) {
            Q0(context, managedActivityResultLauncher2, objectRef, lifecycleOwner, objectRef2, q3Var, new x00.a() { // from class: com.baicizhan.main.word_book.list.r5
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 I0;
                    I0 = b6.I0(ManagedActivityResultLauncher.this);
                    return I0;
                }
            });
            if (favoriteAddingMode == FavoriteAddingMode.CAM_OCR) {
                ma.l.b(ma.t.D, ma.a.f72766i4, ma.u.a("taking_bottom_type", 1));
            }
        } else if (kotlin.jvm.internal.g0.g(action, f.c.f27091a)) {
            mutableState.setValue(null);
            mutableState2.setValue(null);
        } else if (kotlin.jvm.internal.g0.g(action, f.d.f27093a)) {
            Q0(context, managedActivityResultLauncher2, objectRef, lifecycleOwner, objectRef2, q3Var, new x00.a() { // from class: com.baicizhan.main.word_book.list.s5
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 J0;
                    J0 = b6.J0(LifecycleOwner.this, context, mutableState2);
                    return J0;
                }
            });
        } else if (kotlin.jvm.internal.g0.g(action, f.C0333f.f27097a)) {
            c40.k.f(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new i(lVar, context, mutableState2, null), 3, null);
            if (favoriteAddingMode == FavoriteAddingMode.CAM_OCR) {
                ma.l.a(ma.t.D, ma.a.f72773j4);
            }
        } else {
            if (!kotlin.jvm.internal.g0.g(action, f.e.f27095a)) {
                throw new NoWhenBranchMatchedException();
            }
            FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
            if (fragmentActivity != null) {
                mc.a.p(fragmentActivity, ((u.a) d.a.I(new u.a(context).X(R.drawable.ic_word_favorites_add_camera_prompt).U(R.string.word_favorites_add_camera_prompt).b0(ButtonType.SINGLE_POSITIVE), R.string.i_know, null, null, 6, null)).d(), null, 2, null);
            }
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 H1(Modifier modifier, int i11, int i12, Composer composer, int i13) {
        E1(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 I0(ManagedActivityResultLauncher managedActivityResultLauncher) {
        try {
            managedActivityResultLauncher.launch("image/*");
        } catch (Exception e11) {
            qb.c.d(f26918a, "attempt to gallery launch: " + e11.getMessage(), new Object[0]);
            va.g.i("出错啦，请重新尝试", 0);
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @androidx.compose.ui.tooling.preview.Preview(backgroundColor = 4278190080L, showBackground = true)
    public static final void I1(final Modifier modifier, Composer composer, final int i11, final int i12) {
        Composer startRestartGroup = composer.startRestartGroup(-1278087979);
        int i13 = i11 & 1;
        if (startRestartGroup.shouldExecute(i13 != 0, i13)) {
            if ((i12 & 1) != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1278087979, i11, -1, "com.baicizhan.main.word_book.list.PreviewFramePreview (WordFavoriteAddActivity.kt:624)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, b0.f26887a.u(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.v4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 J1;
                    J1 = b6.J1(Modifier.this, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return J1;
                }
            });
        }
    }

    public static final yz.g2 J0(LifecycleOwner lifecycleOwner, Context context, MutableState mutableState) {
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), new l(c40.n0.f7891d0), null, new h(context, mutableState, null), 2, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 J1(Modifier modifier, int i11, int i12, Composer composer, int i13) {
        I1(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 K0(FavoriteAddingMode favoriteAddingMode, com.baicizhan.platform.base.widget.q3 q3Var, x00.a aVar, x00.l lVar, int i11, Composer composer, int i12) {
        E0(favoriteAddingMode, q3Var, aVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void K1(final MutableState<TextFieldValue> mutableState, final int i11, final FocusManager focusManager, Composer composer, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(744685391);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(mutableState) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(focusManager) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(744685391, i13, -1, "com.baicizhan.main.word_book.list.WordsEdit (WordFavoriteAddActivity.kt:279)");
            }
            final TextFieldValue component1 = mutableState.component1();
            x00.l<TextFieldValue, yz.g2> component2 = mutableState.component2();
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            TextInputService textInputService = (TextInputService) startRestartGroup.consume(CompositionLocalsKt.getLocalTextInputService());
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier fillMaxHeight$default = SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m729paddingqDBjuR0(companion2, bk.d.c(), Dp.m5115constructorimpl(20), bk.d.c(), bk.d.c()), 0.0f, 1, null), 0.0f, 1, null);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i14 = MaterialTheme.$stable;
            Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(fillMaxHeight$default, bk.b.L(materialTheme.getColors(startRestartGroup, i14)), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(bk.d.h()));
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m234backgroundbw27NRU);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            Modifier align = BoxScopeInstance.INSTANCE.align(companion2, companion3.getCenter());
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion3.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion4.getSetModifier());
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(startRestartGroup, i14).getBody2(), bk.b.A(materialTheme.getColors(startRestartGroup, i14)), 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(22), null, null, null, 0, 0, null, 16646138, null);
            Modifier focusRequester2 = FocusRequesterModifierKt.focusRequester(PaddingKt.m726padding3ABfNKs(RowScope.weight$default(rowScopeInstance, SizeKt.fillMaxHeight$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), Dp.m5115constructorimpl(16)), focusRequester);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.Companion.m4792getAsciiPjHm6EE(), ImeAction.Companion.m4739getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (kotlin.jvm.internal.v) null);
            boolean changedInstance = startRestartGroup.changedInstance(focusManager);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.word_book.list.x3
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 L1;
                        L1 = b6.L1(FocusManager.this, (KeyboardActionScope) obj);
                        return L1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            BasicTextFieldKt.BasicTextField(component1, (x00.l<? super TextFieldValue, yz.g2>) component2, focusRequester2, false, false, m4572copyp1EtxEg$default, keyboardOptions, new KeyboardActions((x00.l) rememberedValue3, null, null, null, null, null, 62, null), false, 0, 0, (VisualTransformation) null, (x00.l<? super TextLayoutResult, yz.g2>) null, mutableInteractionSource, (Brush) new SolidColor(bk.b.t(), null), (x00.q<? super x00.p<? super Composer, ? super Integer, yz.g2>, ? super Composer, ? super Integer, yz.g2>) ComposableLambdaKt.rememberComposableLambda(1920449096, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.y3
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 M1;
                    M1 = b6.M1(TextFieldValue.this, i11, rowScopeInstance, (x00.p) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return M1;
                }
            }, startRestartGroup, 54), startRestartGroup, 1572864, 224256, 7960);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            boolean changedInstance2 = startRestartGroup.changedInstance(textInputService);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new u(textInputService, focusRequester, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            EffectsKt.LaunchedEffect("ime", (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue4, startRestartGroup, 6);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.z3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 N1;
                    N1 = b6.N1(MutableState.this, i11, focusManager, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return N1;
                }
            });
        }
    }

    public static final yz.g2 L0(Ref.ObjectRef objectRef, LifecycleOwner lifecycleOwner, Ref.ObjectRef objectRef2, Context context, com.baicizhan.platform.base.widget.q3 q3Var, boolean z11) {
        c40.l2 l2Var = (c40.l2) objectRef.element;
        if (l2Var != null) {
            l2.a.b(l2Var, null, 1, null);
        }
        objectRef.element = null;
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new n(q3Var, null), 3, null);
        if (z11) {
            Runnable runnable = (Runnable) objectRef2.element;
            if (runnable != null) {
                runnable.run();
            }
            objectRef2.element = null;
        } else {
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null) {
                return yz.g2.f100423a;
            }
            if (!ActivityCompat.shouldShowRequestPermissionRationale(activity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                va.g.g(R.string.common_permission_storage_needed, 0);
            }
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 L1(FocusManager focusManager, KeyboardActionScope KeyboardActions) {
        kotlin.jvm.internal.g0.p(KeyboardActions, "$this$KeyboardActions");
        FocusManager.clearFocus$default(focusManager, false, 1, null);
        return yz.g2.f100423a;
    }

    public static final boolean M0(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final yz.g2 M1(TextFieldValue textFieldValue, int i11, RowScope rowScope, x00.p it, Composer composer, int i12) {
        int i13;
        int i14;
        Composer composer2 = composer;
        kotlin.jvm.internal.g0.p(it, "it");
        if ((i12 & 6) == 0) {
            i13 = i12 | (composer2.changedInstance(it) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if (composer2.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1920449096, i13, -1, "com.baicizhan.main.word_book.list.WordsEdit.<anonymous>.<anonymous>.<anonymous> (WordFavoriteAddActivity.kt:311)");
            }
            if (textFieldValue.getText().length() == 0) {
                composer2.startReplaceGroup(-1160245394);
                i14 = i13;
                TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.word_favorites_add_edit_hint, new Object[]{Integer.valueOf(Math.max(3000 - i11, 0)), 500}, composer2, 6), rowScope.align(Modifier.Companion, Alignment.Companion.getCenterVertically()), bk.b.G(MaterialTheme.INSTANCE.getColors(composer2, MaterialTheme.$stable)), bk.d.m(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(22), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3072, 6, 130032);
                composer2 = composer;
            } else {
                i14 = i13;
                composer2.startReplaceGroup(-1174224038);
            }
            composer2.endReplaceGroup();
            it.invoke(composer2, Integer.valueOf(i14 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final void N0(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final yz.g2 N1(MutableState mutableState, int i11, FocusManager focusManager, int i12, Composer composer, int i13) {
        K1(mutableState, i11, focusManager, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 O0(c40.r0 r0Var, com.baicizhan.platform.base.widget.q3 q3Var) {
        c40.k.f(r0Var, null, null, new e(q3Var, null), 3, null);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void O1(@PreviewParameter(provider = k9.class) final Pair<? extends MutableState<TextFieldValue>, Integer> pair, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1719066112);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(pair) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1719066112, i12, -1, "com.baicizhan.main.word_book.list.WordsEditPreview (WordFavoriteAddActivity.kt:352)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(-204538156, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.u5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 P1;
                    P1 = b6.P1(Pair.this, (Composer) obj, ((Integer) obj2).intValue());
                    return P1;
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.v5
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Q1;
                    Q1 = b6.Q1(Pair.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return Q1;
                }
            });
        }
    }

    public static final void P0(um.h hVar, c40.r0 r0Var, com.baicizhan.platform.base.widget.q3 q3Var, Context context) {
        hVar.c();
        c40.k.f(r0Var, null, null, new m(hVar, q3Var, context, null), 3, null);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 P1(Pair pair, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-204538156, i11, -1, "com.baicizhan.main.word_book.list.WordsEditPreview.<anonymous> (WordFavoriteAddActivity.kt:354)");
            }
            K1((MutableState) pair.getFirst(), ((Number) pair.getSecond()).intValue(), (FocusManager) composer.consume(CompositionLocalsKt.getLocalFocusManager()), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kc.d, kc.h] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, c40.l2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.baicizhan.main.word_book.list.a6] */
    public static final void Q0(final Context context, final ManagedActivityResultLauncher<String, Boolean> managedActivityResultLauncher, Ref.ObjectRef<c40.l2> objectRef, final LifecycleOwner lifecycleOwner, final Ref.ObjectRef<Runnable> objectRef2, final com.baicizhan.platform.base.widget.q3 q3Var, final x00.a<yz.g2> aVar) {
        ?? f11;
        if (Build.VERSION.SDK_INT > 28 || ContextCompat.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            aVar.invoke();
            return;
        }
        boolean z11 = context instanceof FragmentActivity;
        yz.g2 g2Var = null;
        FragmentActivity fragmentActivity = z11 ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(fragmentActivity, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                FragmentActivity fragmentActivity2 = z11 ? (FragmentActivity) context : null;
                if (fragmentActivity2 != null) {
                    mc.a.p(fragmentActivity2, ((u.a) d.a.I(new u.a(context).U(R.string.common_permission_storage_needed), R.string.dialog_permission_confirm, null, new x00.l() { // from class: com.baicizhan.main.word_book.list.z5
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            yz.g2 R0;
                            R0 = b6.R0(ManagedActivityResultLauncher.this, lifecycleOwner, objectRef2, q3Var, context, aVar, (View) obj);
                            return R0;
                        }
                    }, 2, null)).d(), null, 2, null);
                    g2Var = yz.g2.f100423a;
                }
            } else {
                managedActivityResultLauncher.launch("android.permission.WRITE_EXTERNAL_STORAGE");
                f11 = c40.k.f(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new p(q3Var, context, null), 3, null);
                objectRef.element = f11;
                objectRef2.element = new Runnable() { // from class: com.baicizhan.main.word_book.list.a6
                    @Override // java.lang.Runnable
                    public final void run() {
                        b6.T0(x00.a.this);
                    }
                };
                g2Var = yz.g2.f100423a;
            }
            if (g2Var != null) {
                return;
            }
        }
        qb.c.q(f26918a, "Not a Activity!", new Object[0]);
        va.g.g(R.string.common_permission_storage_needed, 0);
    }

    public static final yz.g2 Q1(Pair pair, int i11, Composer composer, int i12) {
        O1(pair, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [T, com.baicizhan.main.word_book.list.c4] */
    public static final yz.g2 R0(ManagedActivityResultLauncher managedActivityResultLauncher, LifecycleOwner lifecycleOwner, Ref.ObjectRef objectRef, com.baicizhan.platform.base.widget.q3 q3Var, Context context, final x00.a aVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        managedActivityResultLauncher.launch("android.permission.WRITE_EXTERNAL_STORAGE");
        c40.k.f(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new o(q3Var, context, null), 3, null);
        objectRef.element = new Runnable() { // from class: com.baicizhan.main.word_book.list.c4
            @Override // java.lang.Runnable
            public final void run() {
                b6.S0(x00.a.this);
            }
        };
        return yz.g2.f100423a;
    }

    public static final void S0(x00.a aVar) {
        aVar.invoke();
    }

    public static final void T0(x00.a aVar) {
        aVar.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c1  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void U0(final int r28, androidx.compose.foundation.interaction.MutableInteractionSource r29, androidx.compose.runtime.State<java.lang.Boolean> r30, kotlin.Pair<androidx.compose.ui.graphics.Color, androidx.compose.ui.graphics.Color> r31, androidx.compose.ui.graphics.ColorFilter r32, boolean r33, final x00.a<yz.g2> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.b6.U0(int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.State, kotlin.Pair, androidx.compose.ui.graphics.ColorFilter, boolean, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 V0(x00.a aVar, MutableState mutableState, c40.r0 r0Var) {
        aVar.invoke();
        mutableState.setValue(Boolean.FALSE);
        c40.k.f(r0Var, null, null, new q(mutableState, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 W0(int i11, MutableInteractionSource mutableInteractionSource, State state, Pair pair, ColorFilter colorFilter, boolean z11, x00.a aVar, int i12, int i13, Composer composer, int i14) {
        U0(i11, mutableInteractionSource, state, pair, colorFilter, z11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void X0(Modifier modifier, final int i11, Composer composer, final int i12, final int i13) {
        Modifier modifier2;
        int i14;
        Composer composer2;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(1301191426);
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
        if (startRestartGroup.shouldExecute((i14 & 19) != 18, i14 & 1)) {
            Modifier modifier4 = i15 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1301191426, i14, -1, "com.baicizhan.main.word_book.list.ControlLabel (WordFavoriteAddActivity.kt:669)");
            }
            modifier3 = modifier4;
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(i11, startRestartGroup, (i14 >> 3) & 14), modifier4.then(PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, 0.0f, f26921d, 0.0f, 0.0f, 13, null)), bk.b.A(MaterialTheme.INSTANCE.getColors(startRestartGroup, MaterialTheme.$stable)), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3072, 0, 131056);
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.a4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 Y0;
                    Y0 = b6.Y0(Modifier.this, i11, i12, i13, (Composer) obj, ((Integer) obj2).intValue());
                    return Y0;
                }
            });
        }
    }

    public static final yz.g2 Y0(Modifier modifier, int i11, int i12, int i13, Composer composer, int i14) {
        X0(modifier, i11, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Z0(final int r31, final long r32, final com.baicizhan.main.word_book.list.FavoriteAddingMode r34, final long r35, x00.a<yz.g2> r37, x00.a<yz.g2> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.b6.Z0(int, long, com.baicizhan.main.word_book.list.FavoriteAddingMode, long, x00.a, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 a1() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 b1() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 c1(x00.a aVar, ActivityResult it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (it.getResultCode() == -1) {
            aVar.invoke();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 d1(final com.baicizhan.platform.base.widget.q3 q3Var, final boolean z11, final Context context, final x00.a aVar, final FavoriteAddingMode favoriteAddingMode, final MutableState mutableState, final ManagedActivityResultLauncher managedActivityResultLauncher, final long j11, final long j12, final MutableState mutableState2, final x00.a aVar2, final c40.r0 r0Var, final int i11, final FocusManager focusManager, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-366659781, i12, -1, "com.baicizhan.main.word_book.list.FavoriteEditContent.<anonymous> (WordFavoriteAddActivity.kt:1177)");
            }
            com.baicizhan.platform.base.widget.s4.B(null, null, q3Var, ComposableLambdaKt.rememberComposableLambda(1637298468, true, new x00.p() { // from class: com.baicizhan.main.word_book.list.w4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 e12;
                    e12 = b6.e1(z11, context, aVar, favoriteAddingMode, mutableState, managedActivityResultLauncher, j11, j12, mutableState2, (Composer) obj, ((Integer) obj2).intValue());
                    return e12;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-884537300, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.y4
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 k12;
                    k12 = b6.k1(FavoriteAddingMode.this, mutableState, q3Var, aVar2, r0Var, managedActivityResultLauncher, context, j12, mutableState2, i11, focusManager, j11, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return k12;
                }
            }, composer, 54), composer, 3072, 12582912, 131059);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d2(@m80.k android.net.Uri r10, @m80.k android.content.Context r11, long r12, @m80.k j00.c<? super byte[]> r14) {
        /*
            boolean r0 = r14 instanceof com.baicizhan.main.word_book.list.b6.v
            if (r0 == 0) goto L13
            r0 = r14
            com.baicizhan.main.word_book.list.b6$v r0 = (com.baicizhan.main.word_book.list.b6.v) r0
            int r1 = r0.f27014e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27014e = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.list.b6$v r0 = new com.baicizhan.main.word_book.list.b6$v
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f27013d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f27014e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r10 = r0.f27011b
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r10 = r0.f27010a
            android.net.Uri r10 = (android.net.Uri) r10
            kotlin.e.n(r14)     // Catch: java.lang.Exception -> L63
            goto L60
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            kotlin.e.n(r14)
            c40.m0 r14 = c40.h1.c()     // Catch: java.lang.Exception -> L63
            com.baicizhan.main.word_book.list.b6$w r4 = new com.baicizhan.main.word_book.list.b6$w     // Catch: java.lang.Exception -> L63
            r9 = 0
            r6 = r10
            r5 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r9)     // Catch: java.lang.Exception -> L63
            java.lang.Object r10 = l00.k.a(r6)     // Catch: java.lang.Exception -> L63
            r0.f27010a = r10     // Catch: java.lang.Exception -> L63
            java.lang.Object r10 = l00.k.a(r5)     // Catch: java.lang.Exception -> L63
            r0.f27011b = r10     // Catch: java.lang.Exception -> L63
            r0.f27012c = r7     // Catch: java.lang.Exception -> L63
            r0.f27014e = r3     // Catch: java.lang.Exception -> L63
            java.lang.Object r14 = c40.i.h(r14, r4, r0)     // Catch: java.lang.Exception -> L63
            if (r14 != r1) goto L60
            return r1
        L60:
            byte[] r14 = (byte[]) r14     // Catch: java.lang.Exception -> L63
            return r14
        L63:
            r0 = move-exception
            r10 = r0
            java.lang.String r11 = "WordFavoriteAddActivity"
            java.lang.String r12 = "as picture:"
            qb.c.c(r11, r12, r10)
            r10 = 0
            byte[] r10 = new byte[r10]
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.b6.d2(android.net.Uri, android.content.Context, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01cd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final yz.g2 e1(final boolean r19, final android.content.Context r20, final x00.a r21, final com.baicizhan.main.word_book.list.FavoriteAddingMode r22, final androidx.compose.runtime.MutableState r23, final androidx.activity.compose.ManagedActivityResultLauncher r24, final long r25, final long r27, final androidx.compose.runtime.MutableState r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.b6.e1(boolean, android.content.Context, x00.a, com.baicizhan.main.word_book.list.FavoriteAddingMode, androidx.compose.runtime.MutableState, androidx.activity.compose.ManagedActivityResultLauncher, long, long, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):yz.g2");
    }

    public static /* synthetic */ Object e2(Uri uri, Context context, long j11, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = -1;
        }
        return d2(uri, context, j11, cVar);
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [kc.d, kc.h] */
    public static final yz.g2 f1(boolean z11, Context context, final x00.a aVar) {
        if (z11 && (context instanceof FragmentActivity)) {
            mc.a.p((FragmentActivity) context, ((u.a) d.a.J(new u.a(context).M("确认退出吗？").V("退出后添加内容将不会保存"), null, null, new x00.l() { // from class: com.baicizhan.main.word_book.list.t4
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 g12;
                    g12 = b6.g1(x00.a.this, (View) obj);
                    return g12;
                }
            }, 3, null)).d(), null, 2, null);
        } else {
            aVar.invoke();
        }
        return yz.g2.f100423a;
    }

    public static final int f2(String str) {
        int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 3) {
            return 180;
        }
        if (attributeInt != 6) {
            return attributeInt != 8 ? 0 : 270;
        }
        return 90;
    }

    public static final yz.g2 g1(x00.a aVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final Object g2(Context context, j00.c<? super ProcessCameraProvider> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        com.google.common.util.concurrent.p1<ProcessCameraProvider> companion = ProcessCameraProvider.Companion.getInstance(context);
        companion.addListener(new x(gVar, companion), ContextCompat.getMainExecutor(context));
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11;
    }

    public static final yz.g2 h1(MutableState mutableState) {
        mutableState.setValue(0);
        return yz.g2.f100423a;
    }

    public static final Bitmap h2(Bitmap bitmap, float f11) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate(f11);
        yz.g2 g2Var = yz.g2.f100423a;
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        kotlin.jvm.internal.g0.o(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    public static final yz.g2 i1(MutableState mutableState) {
        mutableState.setValue(1);
        return yz.g2.f100423a;
    }

    public static final Bitmap i2(Bitmap bitmap, int i11) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        kotlin.jvm.internal.g0.o(createBitmap, "createBitmap(...)");
        bitmap.recycle();
        return createBitmap;
    }

    public static final yz.g2 j1(FavoriteAddingMode favoriteAddingMode, Context context, ManagedActivityResultLauncher managedActivityResultLauncher, MutableState mutableState, long j11, long j12) {
        if (favoriteAddingMode == FavoriteAddingMode.CAM_OCR) {
            BczWebExecutorKt.startNormalWeb$default(context, "https://learn.baicizhan.com/bcz_activities/ocr_pdf_qna", null, false, 0, null, 60, null);
        } else {
            managedActivityResultLauncher.launch(WordFavoriteMatchActivity.f26824c.a(context, new FavoriteMatchingMode.Description(((TextFieldValue) mutableState.getValue()).getText(), j11), j12));
        }
        return yz.g2.f100423a;
    }

    public static final Object j2(Context context, byte[] bArr, j00.c<? super Boolean> cVar) {
        return c40.i.h(c40.h1.c(), new y(context, bArr, null), cVar);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 k1(final FavoriteAddingMode favoriteAddingMode, MutableState mutableState, final com.baicizhan.platform.base.widget.q3 q3Var, final x00.a aVar, final c40.r0 r0Var, final ManagedActivityResultLauncher managedActivityResultLauncher, final Context context, final long j11, final MutableState mutableState2, final int i11, final FocusManager focusManager, final long j12, PaddingValues it, Composer composer, int i12) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i12 & 17) != 16, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-884537300, i12, -1, "com.baicizhan.main.word_book.list.FavoriteEditContent.<anonymous>.<anonymous> (WordFavoriteAddActivity.kt:1230)");
            }
            int i13 = t.f27006a[favoriteAddingMode.ordinal()];
            if (i13 == 1) {
                composer.startReplaceGroup(-1626230405);
                boolean z11 = ((Number) mutableState.getValue()).intValue() == 0;
                Object rememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.Companion;
                if (rememberedValue == companion.getEmpty()) {
                    rememberedValue = new x00.l() { // from class: com.baicizhan.main.word_book.list.j4
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            int l12;
                            l12 = b6.l1(((Integer) obj).intValue());
                            return Integer.valueOf(l12);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                EnterTransition slideInHorizontally$default = EnterExitTransitionKt.slideInHorizontally$default(null, (x00.l) rememberedValue, 1, null);
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == companion.getEmpty()) {
                    rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.word_book.list.k4
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            int m12;
                            m12 = b6.m1(((Integer) obj).intValue());
                            return Integer.valueOf(m12);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                AnimatedVisibilityKt.AnimatedVisibility(z11, (Modifier) null, slideInHorizontally$default, EnterExitTransitionKt.slideOutHorizontally$default(null, (x00.l) rememberedValue2, 1, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1462993444, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.l4
                    @Override // x00.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        yz.g2 n12;
                        n12 = b6.n1(MutableState.this, i11, focusManager, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return n12;
                    }
                }, composer, 54), composer, 200064, 18);
                boolean z12 = ((Number) mutableState.getValue()).intValue() == 1;
                Object rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == companion.getEmpty()) {
                    rememberedValue3 = new x00.l() { // from class: com.baicizhan.main.word_book.list.n4
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            int o12;
                            o12 = b6.o1(((Integer) obj).intValue());
                            return Integer.valueOf(o12);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                EnterTransition slideInHorizontally$default2 = EnterExitTransitionKt.slideInHorizontally$default(null, (x00.l) rememberedValue3, 1, null);
                Object rememberedValue4 = composer.rememberedValue();
                if (rememberedValue4 == companion.getEmpty()) {
                    rememberedValue4 = new x00.l() { // from class: com.baicizhan.main.word_book.list.o4
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            int p12;
                            p12 = b6.p1(((Integer) obj).intValue());
                            return Integer.valueOf(p12);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                AnimatedVisibilityKt.AnimatedVisibility(z12, (Modifier) null, slideInHorizontally$default2, EnterExitTransitionKt.slideOutHorizontally$default(null, (x00.l) rememberedValue4, 1, null), (String) null, ComposableLambdaKt.rememberComposableLambda(1052324869, true, new x00.q() { // from class: com.baicizhan.main.word_book.list.p4
                    @Override // x00.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        yz.g2 q12;
                        q12 = b6.q1(FocusManager.this, favoriteAddingMode, q3Var, aVar, r0Var, managedActivityResultLauncher, context, j12, j11, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        return q12;
                    }
                }, composer, 54), composer, 200064, 18);
                composer.endReplaceGroup();
            } else if (i13 != 2) {
                composer.startReplaceGroup(-1624973603);
                K1(mutableState2, i11, focusManager, composer, 6);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1625316401);
                boolean changedInstance = composer.changedInstance(r0Var) | composer.changedInstance(managedActivityResultLauncher) | composer.changedInstance(context) | composer.changed(j11);
                Object rememberedValue5 = composer.rememberedValue();
                if (changedInstance || rememberedValue5 == Composer.Companion.getEmpty()) {
                    rememberedValue5 = new x00.l() { // from class: com.baicizhan.main.word_book.list.q4
                        @Override // x00.l
                        public final Object invoke(Object obj) {
                            yz.g2 s12;
                            s12 = b6.s1(c40.r0.this, managedActivityResultLauncher, context, j11, (Uri) obj);
                            return s12;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                E0(favoriteAddingMode, q3Var, aVar, (x00.l) rememberedValue5, composer, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k2(android.content.Context r8, com.baicizhan.main.word_book.list.e2 r9, j00.c<? super android.net.Uri> r10) {
        /*
            boolean r0 = r10 instanceof com.baicizhan.main.word_book.list.b6.z
            if (r0 == 0) goto L13
            r0 = r10
            com.baicizhan.main.word_book.list.b6$z r0 = (com.baicizhan.main.word_book.list.b6.z) r0
            int r1 = r0.f27028e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27028e = r1
            goto L18
        L13:
            com.baicizhan.main.word_book.list.b6$z r0 = new com.baicizhan.main.word_book.list.b6$z
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f27027d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f27028e
            r3 = 0
            r4 = 0
            java.lang.String r5 = "tmp_words_parser.jpg"
            r6 = 1
            if (r2 == 0) goto L43
            if (r2 != r6) goto L3b
            java.lang.Object r8 = r0.f27026c
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r8 = r0.f27025b
            com.baicizhan.main.word_book.list.e2 r8 = (com.baicizhan.main.word_book.list.e2) r8
            java.lang.Object r8 = r0.f27024a
            android.content.Context r8 = (android.content.Context) r8
            kotlin.e.n(r10)     // Catch: java.lang.Exception -> L39
            goto L6a
        L39:
            r8 = move-exception
            goto L73
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            kotlin.e.n(r10)
            java.io.FileOutputStream r10 = r8.openFileOutput(r5, r4)     // Catch: java.lang.Exception -> L39
            c40.m0 r2 = c40.h1.c()     // Catch: java.lang.Exception -> L39
            com.baicizhan.main.word_book.list.b6$a0 r7 = new com.baicizhan.main.word_book.list.b6$a0     // Catch: java.lang.Exception -> L39
            r7.<init>(r9, r10, r3)     // Catch: java.lang.Exception -> L39
            r0.f27024a = r8     // Catch: java.lang.Exception -> L39
            java.lang.Object r9 = l00.k.a(r9)     // Catch: java.lang.Exception -> L39
            r0.f27025b = r9     // Catch: java.lang.Exception -> L39
            java.lang.Object r9 = l00.k.a(r10)     // Catch: java.lang.Exception -> L39
            r0.f27026c = r9     // Catch: java.lang.Exception -> L39
            r0.f27028e = r6     // Catch: java.lang.Exception -> L39
            java.lang.Object r9 = c40.i.h(r2, r7, r0)     // Catch: java.lang.Exception -> L39
            if (r9 != r1) goto L6a
            return r1
        L6a:
            java.io.File r8 = r8.getFileStreamPath(r5)     // Catch: java.lang.Exception -> L39
            android.net.Uri r8 = android.net.Uri.fromFile(r8)     // Catch: java.lang.Exception -> L39
            return r8
        L73:
            java.lang.String r9 = "WordFavoriteAddActivity"
            java.lang.String r10 = ""
            qb.c.c(r9, r10, r8)
            va.g.j(r8, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.b6.k2(android.content.Context, com.baicizhan.main.word_book.list.e2, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0396  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l0(final com.baicizhan.main.word_book.list.g r37, final boolean r38, final x00.l<? super com.baicizhan.main.word_book.list.f, yz.g2> r39, androidx.compose.runtime.Composer r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.b6.l0(com.baicizhan.main.word_book.list.g, boolean, x00.l, androidx.compose.runtime.Composer, int):void");
    }

    public static final int l1(int i11) {
        return -i11;
    }

    public static final byte[] l2(ImageProxy imageProxy) {
        if (imageProxy == null) {
            return new byte[0];
        }
        ByteBuffer buffer = imageProxy.getPlanes()[0].getBuffer();
        kotlin.jvm.internal.g0.o(buffer, "getBuffer(...)");
        int remaining = buffer.remaining();
        byte[] bArr = new byte[remaining];
        buffer.get(bArr, 0, remaining);
        return bArr;
    }

    public static final yz.g2 m0(x00.l lVar) {
        lVar.invoke(f.c.f27091a);
        return yz.g2.f100423a;
    }

    public static final int m1(int i11) {
        return -i11;
    }

    public static final yz.g2 n0(x00.l lVar) {
        lVar.invoke(f.d.f27093a);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 n1(MutableState mutableState, int i11, FocusManager focusManager, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i12) {
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1462993444, i12, -1, "com.baicizhan.main.word_book.list.FavoriteEditContent.<anonymous>.<anonymous>.<anonymous> (WordFavoriteAddActivity.kt:1233)");
        }
        K1(mutableState, i11, focusManager, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 o0(x00.l lVar) {
        lVar.invoke(f.a.f27087a);
        return yz.g2.f100423a;
    }

    public static final yz.g2 p0(x00.l lVar) {
        lVar.invoke(f.C0333f.f27097a);
        return yz.g2.f100423a;
    }

    public static final yz.g2 q0(com.baicizhan.main.word_book.list.g gVar, x00.l lVar) {
        if (gVar == com.baicizhan.main.word_book.list.g.f27143a) {
            qb.c.q(f26918a, "camera state unavailable!", new Object[0]);
            return yz.g2.f100423a;
        }
        lVar.invoke(f.b.f27089a);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 q1(FocusManager focusManager, FavoriteAddingMode favoriteAddingMode, com.baicizhan.platform.base.widget.q3 q3Var, x00.a aVar, final c40.r0 r0Var, final ManagedActivityResultLauncher managedActivityResultLauncher, final Context context, final long j11, final long j12, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1052324869, i11, -1, "com.baicizhan.main.word_book.list.FavoriteEditContent.<anonymous>.<anonymous>.<anonymous> (WordFavoriteAddActivity.kt:1237)");
        }
        focusManager.clearFocus(true);
        boolean changedInstance = composer.changedInstance(r0Var) | composer.changedInstance(managedActivityResultLauncher) | composer.changedInstance(context) | composer.changed(j11) | composer.changed(j12);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.l() { // from class: com.baicizhan.main.word_book.list.w5
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 r12;
                    r12 = b6.r1(c40.r0.this, managedActivityResultLauncher, context, j11, j12, (Uri) obj);
                    return r12;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        E0(favoriteAddingMode, q3Var, aVar, (x00.l) rememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 r0(com.baicizhan.main.word_book.list.g gVar, boolean z11, x00.l lVar, int i11, Composer composer, int i12) {
        l0(gVar, z11, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 r1(c40.r0 r0Var, ManagedActivityResultLauncher managedActivityResultLauncher, Context context, long j11, long j12, Uri uri) {
        kotlin.jvm.internal.g0.p(uri, "uri");
        c40.k.f(r0Var, null, null, new r(managedActivityResultLauncher, context, uri, j11, j12, null), 3, null);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void s0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1915725430);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1915725430, i11, -1, "com.baicizhan.main.word_book.list.CameraControlsPreview (WordFavoriteAddActivity.kt:764)");
            }
            bk.k.e(null, null, null, b0.f26887a.t(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.d4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 t02;
                    t02 = b6.t0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return t02;
                }
            });
        }
    }

    public static final yz.g2 s1(c40.r0 r0Var, ManagedActivityResultLauncher managedActivityResultLauncher, Context context, long j11, Uri uri) {
        kotlin.jvm.internal.g0.p(uri, "uri");
        c40.k.f(r0Var, null, null, new s(managedActivityResultLauncher, context, uri, j11, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 t0(int i11, Composer composer, int i12) {
        s0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 t1(int i11, long j11, FavoriteAddingMode favoriteAddingMode, long j12, x00.a aVar, x00.a aVar2, int i12, int i13, Composer composer, int i14) {
        Z0(i11, j11, favoriteAddingMode, j12, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void u0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1911777788);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1911777788, i11, -1, "com.baicizhan.main.word_book.list.CameraControlsPreviewNonGranted (WordFavoriteAddActivity.kt:772)");
            }
            bk.k.e(null, null, null, b0.f26887a.r(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.s4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 v02;
                    v02 = b6.v0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return v02;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b8  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void u1(androidx.compose.ui.Modifier r42, final com.baicizhan.main.word_book.list.FavoriteAddingMode r43, final boolean r44, final androidx.compose.runtime.State<? extends androidx.camera.core.Camera> r45, final boolean r46, final x00.l<? super java.lang.Boolean, yz.g2> r47, final x00.l<? super com.baicizhan.main.word_book.list.f, yz.g2> r48, androidx.compose.runtime.Composer r49, final int r50, final int r51) {
        /*
            Method dump skipped, instructions count: 1003
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.word_book.list.b6.u1(androidx.compose.ui.Modifier, com.baicizhan.main.word_book.list.FavoriteAddingMode, boolean, androidx.compose.runtime.State, boolean, x00.l, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 v0(int i11, Composer composer, int i12) {
        u0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 v1(State state, boolean z11, x00.l lVar) {
        CameraControl cameraControl;
        Camera camera = (Camera) state.getValue();
        if (camera != null && (cameraControl = camera.getCameraControl()) != null) {
            cameraControl.enableTorch(!z11);
        }
        lVar.invoke(Boolean.valueOf(!z11));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void w0(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-786718657);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-786718657, i11, -1, "com.baicizhan.main.word_book.list.CameraControlsPreviewTaken (WordFavoriteAddActivity.kt:780)");
            }
            bk.k.e(null, null, null, b0.f26887a.s(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.u4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 x02;
                    x02 = b6.x0(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return x02;
                }
            });
        }
    }

    public static final yz.g2 w1(x00.l lVar) {
        lVar.invoke(f.e.f27095a);
        return yz.g2.f100423a;
    }

    public static final yz.g2 x0(int i11, Composer composer, int i12) {
        w0(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 x1(Modifier modifier, FavoriteAddingMode favoriteAddingMode, boolean z11, State state, boolean z12, x00.l lVar, x00.l lVar2, int i11, int i12, Composer composer, int i13) {
        u1(modifier, favoriteAddingMode, z11, state, z12, lVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @SuppressLint({"RestrictedApi"})
    public static final void y0(final FavoriteAddingMode favoriteAddingMode, com.baicizhan.main.word_book.list.g gVar, final e2 e2Var, final ImageCapture imageCapture, final PreviewView previewView, final String str, final x00.l<? super IntSize, yz.g2> lVar, final x00.a<yz.g2> aVar, x00.l<? super com.baicizhan.main.word_book.list.f, yz.g2> lVar2, Composer composer, final int i11) {
        int i12;
        com.baicizhan.main.word_book.list.g gVar2;
        final x00.l<? super com.baicizhan.main.word_book.list.f, yz.g2> lVar3;
        Composer composer2;
        Object aVar2;
        boolean z11;
        Preview preview;
        int i13;
        Object obj;
        ImageCapture imageCapture2;
        com.baicizhan.main.word_book.list.g gVar3;
        Object bVar;
        int i14;
        e2 e2Var2;
        final Context context;
        final PreviewView previewView2;
        MutableState mutableState;
        boolean z12;
        final x00.l lVar4;
        final MutableState mutableState2;
        boolean z13;
        boolean z14;
        Composer composer3;
        com.baicizhan.main.word_book.list.g gVar4;
        boolean z15;
        PreviewView previewView3 = previewView;
        Composer startRestartGroup = composer.startRestartGroup(-1765426068);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(favoriteAddingMode.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(gVar.ordinal()) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(e2Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(imageCapture) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(previewView3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changed(str) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(lVar) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(lVar2) ? 67108864 : 33554432;
        }
        if (startRestartGroup.shouldExecute((38347923 & i12) != 38347922, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1765426068, i12, -1, "com.baicizhan.main.word_book.list.CameraPreviewView (WordFavoriteAddActivity.kt:388)");
            }
            Context context2 = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            boolean booleanValue = ((Boolean) mutableState3.component1()).booleanValue();
            x00.l component2 = mutableState3.component2();
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new Preview.Builder().build();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Preview preview2 = (Preview) rememberedValue3;
            kotlin.jvm.internal.g0.m(preview2);
            int i15 = i12;
            boolean changedInstance = ((i12 & 112) == 32) | startRestartGroup.changedInstance(imageCapture) | startRestartGroup.changedInstance(lifecycleOwner) | startRestartGroup.changedInstance(context2) | startRestartGroup.changedInstance(preview2) | startRestartGroup.changedInstance(previewView3);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                z11 = booleanValue;
                preview = preview2;
                i13 = i15;
                obj = null;
                aVar2 = new a(gVar, imageCapture, lifecycleOwner, context2, mutableState4, preview, previewView, null);
                imageCapture2 = imageCapture;
                mutableState4 = mutableState4;
                previewView3 = previewView;
                gVar3 = gVar;
                startRestartGroup.updateRememberedValue(aVar2);
            } else {
                z11 = booleanValue;
                preview = preview2;
                aVar2 = rememberedValue4;
                i13 = i15;
                obj = null;
                gVar3 = gVar;
                imageCapture2 = imageCapture;
            }
            int i16 = (i13 >> 3) & 14;
            int i17 = i13 >> 6;
            EffectsKt.LaunchedEffect(gVar3, imageCapture2, (x00.p) aVar2, startRestartGroup, (i17 & 112) | i16);
            boolean changedInstance2 = startRestartGroup.changedInstance(e2Var) | startRestartGroup.changedInstance(preview) | startRestartGroup.changedInstance(previewView3) | startRestartGroup.changed(z11);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue5 == companion.getEmpty()) {
                boolean z16 = z11;
                i14 = i16;
                e2Var2 = e2Var;
                context = context2;
                MutableState mutableState5 = mutableState4;
                PreviewView previewView4 = previewView3;
                bVar = new b(e2Var2, preview, previewView4, mutableState5, z16, null);
                previewView2 = previewView4;
                mutableState = mutableState5;
                z12 = z16;
                startRestartGroup.updateRememberedValue(bVar);
            } else {
                bVar = rememberedValue5;
                mutableState = mutableState4;
                previewView2 = previewView3;
                z12 = z11;
                i14 = i16;
                e2Var2 = e2Var;
                context = context2;
            }
            EffectsKt.LaunchedEffect(e2Var2, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) bVar, startRestartGroup, i17 & 14);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(SizeKt.fillMaxSize$default(PaddingKt.m730paddingqDBjuR0$default(companion2, 0.0f, Dp.m5115constructorimpl(8), 0.0f, 0.0f, 13, null), 0.0f, 1, obj), Color.Companion.m2535getBlack0d7_KjU(), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion3.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m235backgroundbw27NRU$default);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            if (e2Var == null) {
                startRestartGroup.startReplaceGroup(15115210);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, companion2, 1.0f, false, 2, null), 0.0f, 1, null);
                boolean z17 = (i13 & 3670016) == 1048576;
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (z17 || rememberedValue6 == companion.getEmpty()) {
                    rememberedValue6 = new x00.l() { // from class: com.baicizhan.main.word_book.list.e4
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            yz.g2 z02;
                            z02 = b6.z0(x00.l.this, (IntSize) obj2);
                            return z02;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(fillMaxWidth$default, (x00.l) rememberedValue6);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, onSizeChanged);
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
                Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                com.baicizhan.main.word_book.list.g gVar5 = com.baicizhan.main.word_book.list.g.f27146d;
                if (gVar3 == gVar5) {
                    startRestartGroup.startReplaceGroup(-1552220296);
                    boolean changedInstance3 = startRestartGroup.changedInstance(previewView2);
                    Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue7 == companion.getEmpty()) {
                        rememberedValue7 = new x00.l() { // from class: com.baicizhan.main.word_book.list.f4
                            @Override // x00.l
                            public final Object invoke(Object obj2) {
                                PreviewView A0;
                                A0 = b6.A0(PreviewView.this, (Context) obj2);
                                return A0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    composer3 = startRestartGroup;
                    AndroidView_androidKt.AndroidView((x00.l) rememberedValue7, SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), null, composer3, 48, 4);
                    composer3.endReplaceGroup();
                    gVar4 = gVar5;
                } else {
                    composer3 = startRestartGroup;
                    if (gVar3 == com.baicizhan.main.word_book.list.g.f27145c) {
                        composer3.startReplaceGroup(-1552033273);
                        Modifier align = boxScopeInstance.align(companion2, companion3.getCenter());
                        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, 0);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, align);
                        x00.a<ComposeUiNode> constructor3 = companion4.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer3);
                        Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                        x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                        if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion4.getSetModifier());
                        gVar4 = gVar5;
                        TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.word_favorites_add_camera_permission_forbidden_tip, composer3, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getSubtitle1(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer3, 0, 0, 65022);
                        Modifier align2 = columnScopeInstance.align(PaddingKt.m730paddingqDBjuR0$default(companion2, 0.0f, Dp.m5115constructorimpl(16), 0.0f, 0.0f, 13, null), companion3.getCenterHorizontally());
                        boolean changedInstance4 = composer3.changedInstance(context);
                        Object rememberedValue8 = composer3.rememberedValue();
                        if (changedInstance4 || rememberedValue8 == companion.getEmpty()) {
                            rememberedValue8 = new x00.a() { // from class: com.baicizhan.main.word_book.list.g4
                                @Override // x00.a
                                public final Object invoke() {
                                    yz.g2 B0;
                                    B0 = b6.B0(context);
                                    return B0;
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue8);
                        }
                        com.baicizhan.platform.base.widget.r.C(align2, (x00.a) rememberedValue8, StringResources_androidKt.stringResource(R.string.dialog_permission_confirm, composer3, 6), bk.d.l(), null, 0, false, false, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(18)), bk.f.a(ColorKt.Color(4293389820L), ColorKt.Color(4293389820L), 0L, 0L, composer3, 54, 12), PaddingKt.m720PaddingValuesYgX7TsA(bk.d.b(), Dp.m5115constructorimpl(0)), composer3, 3072, 6, 240);
                        composer3.endNode();
                    } else {
                        gVar4 = gVar5;
                        composer3.startReplaceGroup(-1571139937);
                    }
                    composer3.endReplaceGroup();
                }
                if (favoriteAddingMode == FavoriteAddingMode.CAM_OCR) {
                    composer3.startReplaceGroup(-1550838471);
                    if (gVar3 == gVar4) {
                        composer3.startReplaceGroup(-1550774642);
                        z15 = false;
                        E1(null, composer3, 0, 1);
                        boolean z18 = (i13 & 29360128) == 8388608;
                        Object rememberedValue9 = composer3.rememberedValue();
                        if (z18 || rememberedValue9 == companion.getEmpty()) {
                            rememberedValue9 = new c(aVar, null);
                            composer3.updateRememberedValue(rememberedValue9);
                        }
                        EffectsKt.LaunchedEffect("", (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue9, composer3, 6);
                    } else {
                        z15 = false;
                        composer3.startReplaceGroup(-1571139937);
                    }
                    composer3.endReplaceGroup();
                } else {
                    z15 = false;
                    composer3.startReplaceGroup(-1571139937);
                }
                composer3.endReplaceGroup();
                Modifier align3 = boxScopeInstance.align(companion2, companion3.getTopEnd());
                boolean z19 = gVar3 == gVar4 ? true : z15;
                lVar3 = lVar2;
                z13 = z15;
                Composer composer4 = composer3;
                lVar4 = component2;
                mutableState2 = mutableState;
                u1(align3, favoriteAddingMode, z19, mutableState2, z12, lVar4, lVar3, composer4, ((i13 << 3) & 112) | 3072 | (i17 & 3670016), 0);
                composer2 = composer4;
                composer2.endNode();
                composer2.endReplaceGroup();
                gVar2 = gVar;
                z14 = true;
            } else {
                lVar3 = lVar2;
                composer2 = startRestartGroup;
                lVar4 = component2;
                mutableState2 = mutableState;
                z13 = false;
                if (str != null) {
                    composer2.startReplaceGroup(17288124);
                    z14 = true;
                    gVar2 = gVar;
                    coil.compose.l.c(new ImageRequest.Builder(context).j(str).D(new d()).f(), "preview", ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 1.0f, false, 2, null), null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, composer2, 1572912, 0, 4024);
                } else {
                    gVar2 = gVar;
                    z14 = true;
                    composer2.startReplaceGroup(-3487456);
                }
                composer2.endReplaceGroup();
            }
            boolean z21 = e2Var != null ? z14 : z13;
            if ((i13 & 234881024) == 67108864) {
                z13 = z14;
            }
            boolean changed = z13 | composer2.changed(lVar4);
            Object rememberedValue10 = composer2.rememberedValue();
            if (changed || rememberedValue10 == companion.getEmpty()) {
                rememberedValue10 = new x00.l() { // from class: com.baicizhan.main.word_book.list.h4
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 C0;
                        C0 = b6.C0(x00.l.this, lVar4, mutableState2, (f) obj2);
                        return C0;
                    }
                };
                composer2.updateRememberedValue(rememberedValue10);
            }
            l0(gVar2, z21, (x00.l) rememberedValue10, composer2, i14);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            gVar2 = gVar;
            lVar3 = lVar2;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final x00.l<? super com.baicizhan.main.word_book.list.f, yz.g2> lVar5 = lVar3;
            final com.baicizhan.main.word_book.list.g gVar6 = gVar2;
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.i4
                @Override // x00.p
                public final Object invoke(Object obj2, Object obj3) {
                    yz.g2 D0;
                    D0 = b6.D0(FavoriteAddingMode.this, gVar6, e2Var, imageCapture, previewView, str, lVar, aVar, lVar5, i11, (Composer) obj2, ((Integer) obj3).intValue());
                    return D0;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void y1(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(405881034);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(405881034, i11, -1, "com.baicizhan.main.word_book.list.PreviewControlPreviewNonGranted (WordFavoriteAddActivity.kt:583)");
            }
            bk.k.e(null, null, null, b0.f26887a.v(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.b4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 z12;
                    z12 = b6.z1(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return z12;
                }
            });
        }
    }

    public static final yz.g2 z0(x00.l lVar, IntSize intSize) {
        long m5290unboximpl = intSize.m5290unboximpl();
        if (((int) (m5290unboximpl >> 32)) <= 0 || ((int) (m5290unboximpl & 4294967295L)) <= 0) {
            intSize = null;
        }
        if (intSize == null) {
            return yz.g2.f100423a;
        }
        lVar.invoke(IntSize.m5278boximpl(intSize.m5290unboximpl()));
        return yz.g2.f100423a;
    }

    public static final yz.g2 z1(int i11, Composer composer, int i12) {
        y1(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$5\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$1\n+ 3 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$2\n+ 4 WordFavoriteAddActivity.kt\ncom/baicizhan/main/word_book/list/WordFavoriteAddActivityKt\n+ 5 ImageRequest.kt\ncoil/request/ImageRequest$Builder$listener$4\n*L\n1#1,1057:1\n491#2:1058\n492#3:1059\n498#4,2:1060\n494#5:1062\n*E\n"})
    public static final class d implements ImageRequest.a {
        @Override // coil.request.ImageRequest.a
        public void b(@m80.k ImageRequest imageRequest, @m80.k o0.e eVar) {
            qb.c.c(b6.f26918a, "", eVar.e());
        }

        @Override // coil.request.ImageRequest.a
        public void a(@m80.k ImageRequest imageRequest) {
        }

        @Override // coil.request.ImageRequest.a
        public void d(@m80.k ImageRequest imageRequest) {
        }

        @Override // coil.request.ImageRequest.a
        public void c(@m80.k ImageRequest imageRequest, @m80.k o0.m mVar) {
        }
    }

    public static final int o1(int i11) {
        return i11;
    }

    public static final int p1(int i11) {
        return i11;
    }
}
