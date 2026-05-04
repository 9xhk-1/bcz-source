package com.baicizhan.main.home.player;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.LocalActivityKt;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.OptIn;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.database.StandaloneDatabaseProvider;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.DefaultHttpDataSource;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.CacheDataSink;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.NoOpCacheEvictor;
import androidx.media3.datasource.cache.SimpleCache;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import androidx.media3.extractor.WavUtil;
import androidx.media3.ui.PlayerView;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavGraphBuilderKt;
import c40.n0;
import com.baicizhan.app.api.service.GameType;
import com.baicizhan.app.api.service.model.StreakAwardType;
import com.baicizhan.base.ComposeBaseActivity;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.client.business.util.Standard_extKt;
import com.baicizhan.client.business.util.SystemUtil;
import com.baicizhan.client.fm.activity.AudioCenterActivity;
import com.baicizhan.client.framework.network.http.HttpRequest;
import com.baicizhan.client.video.activity.WordTVActivity;
import com.baicizhan.main.activity.FastTestActivity;
import com.baicizhan.main.activity.IntroductionPageActivity;
import com.baicizhan.main.activity.setting.SettingsActivity;
import com.baicizhan.main.home.player.HomeActivityKt;
import com.baicizhan.main.home.player.b8;
import com.baicizhan.main.home.player.behavior.SimpleNavigation;
import com.baicizhan.main.home.player.model.AudioEffect;
import com.baicizhan.main.home.player.model.HomeMode;
import com.baicizhan.main.home.player.settings.SettingBehavior;
import com.baicizhan.main.home.player.settings.UserKt;
import com.baicizhan.main.plusreview.activity.DefaultPreloadActivity;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.esotericsoftware.spine.a;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.bounds.ContentMode;
import com.jiongji.andriod.card.R;
import gs.li;
import java.io.File;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k3.o4;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l3.o;
import ug.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 12 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 13 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 14 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 15 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 16 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 17 utils.kt\ncom/baicizhan/base/UtilsKt\n+ 18 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n+ 19 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n*L\n1#1,2633:1\n75#2:2634\n75#2:2635\n75#2:2636\n75#2:2661\n75#2:2753\n77#2:2833\n75#2:2865\n77#2:2948\n77#2:3354\n77#2:3616\n77#2:3675\n1247#3,6:2637\n1247#3,6:2643\n1247#3,6:2649\n1247#3,6:2655\n1247#3,6:2662\n1247#3,6:2668\n1247#3,3:2681\n1250#3,3:2685\n1247#3,6:2688\n1247#3,6:2731\n1247#3,6:2741\n1247#3,6:2747\n1225#3,6:2802\n1247#3,6:2855\n1225#3,6:2917\n1247#3,6:2970\n1247#3,6:2980\n1247#3,6:2986\n1247#3,3:2999\n1250#3,3:3003\n1247#3,6:3006\n1247#3,6:3012\n1247#3,6:3018\n1247#3,6:3024\n1247#3,6:3030\n1247#3,6:3073\n1247#3,6:3081\n1247#3,6:3087\n1247#3,6:3093\n1247#3,6:3099\n1247#3,6:3105\n1247#3,6:3116\n1247#3,6:3122\n1247#3,6:3128\n1247#3,6:3134\n1247#3,6:3140\n1247#3,6:3187\n1247#3,6:3202\n1247#3,6:3208\n1247#3,6:3214\n1247#3,6:3220\n1247#3,6:3226\n1247#3,6:3232\n1247#3,6:3238\n1247#3,6:3244\n1247#3,6:3250\n1247#3,6:3256\n1247#3,6:3262\n1247#3,6:3268\n1247#3,6:3274\n1247#3,6:3280\n1247#3,6:3286\n1247#3,6:3292\n1247#3,6:3298\n1247#3,6:3304\n1247#3,6:3310\n1225#3,6:3323\n1247#3,6:3375\n1247#3,6:3381\n1247#3,6:3387\n1247#3,6:3393\n1247#3,6:3399\n1247#3,6:3405\n1247#3,6:3411\n1247#3,6:3417\n1247#3,6:3423\n1247#3,6:3429\n1247#3,6:3435\n1247#3,6:3441\n1247#3,6:3447\n1247#3,6:3453\n1247#3,6:3459\n1247#3,6:3465\n1247#3,6:3471\n1247#3,6:3477\n1247#3,6:3483\n1247#3,6:3489\n1247#3,6:3504\n1247#3,6:3510\n1247#3,6:3535\n1247#3,6:3541\n1247#3,6:3547\n1247#3,6:3553\n1247#3,6:3559\n1225#3,6:3585\n1225#3,6:3644\n557#4:2674\n554#4,6:2675\n557#4:2992\n554#4,6:2993\n555#5:2684\n555#5:3002\n70#6:2694\n67#6,9:2695\n77#6:2740\n70#6:2756\n68#6,8:2757\n77#6:2864\n70#6:2871\n68#6,8:2872\n77#6:2979\n70#6:3036\n67#6,9:3037\n70#6:3146\n67#6,9:3147\n77#6:3186\n77#6:3196\n79#7,6:2704\n86#7,3:2719\n89#7,2:2728\n93#7:2739\n79#7,6:2765\n86#7,3:2780\n89#7,2:2789\n93#7:2863\n79#7,6:2880\n86#7,3:2895\n89#7,2:2904\n93#7:2978\n79#7,6:3046\n86#7,3:3061\n89#7,2:3070\n79#7,6:3156\n86#7,3:3171\n89#7,2:3180\n93#7:3185\n93#7:3195\n347#8,9:2710\n356#8:2730\n357#8,2:2737\n347#8,9:2771\n356#8:2791\n357#8,2:2861\n347#8,9:2886\n356#8:2906\n357#8,2:2976\n347#8,9:3052\n356#8:3072\n347#8,9:3162\n356#8,3:3182\n357#8,2:3193\n4206#9,6:2722\n4206#9,6:2783\n4206#9,6:2898\n4206#9,6:3064\n4206#9,6:3174\n113#10:2754\n113#10:2755\n113#10:2792\n113#10:2793\n113#10:2794\n113#10:2854\n113#10:2869\n113#10:2870\n113#10:2907\n113#10:2908\n113#10:2909\n113#10:2969\n113#10:3079\n113#10:3111\n113#10:3113\n113#10:3114\n113#10:3696\n354#11,7:2795\n361#11,2:2808\n363#11,7:2811\n401#11,10:2818\n400#11:2828\n412#11,4:2829\n416#11,7:2834\n446#11,12:2841\n472#11:2853\n354#11,7:2910\n361#11,2:2923\n363#11,7:2926\n401#11,10:2933\n400#11:2943\n412#11,4:2944\n416#11,7:2949\n446#11,12:2956\n472#11:2968\n354#11,7:3316\n361#11,2:3329\n363#11,7:3332\n401#11,10:3339\n400#11:3349\n412#11,4:3350\n416#11,7:3355\n446#11,12:3362\n472#11:3374\n354#11,7:3578\n361#11,2:3591\n363#11,7:3594\n401#11,10:3601\n400#11:3611\n412#11,4:3612\n416#11,7:3617\n446#11,12:3624\n472#11:3636\n354#11,7:3637\n361#11,2:3650\n363#11,7:3653\n401#11,10:3660\n400#11:3670\n412#11,4:3671\n416#11,7:3676\n446#11,12:3683\n472#11:3695\n1#12:2810\n1#12:2925\n1#12:3115\n1#12:3331\n1#12:3593\n1#12:3652\n1761#13,3:2866\n49#14:3080\n49#14:3112\n85#15:3197\n113#15,2:3198\n85#15:3495\n113#15,2:3496\n85#15:3498\n113#15,2:3499\n85#15:3501\n85#15:3502\n85#15:3503\n85#15:3534\n216#16,2:3200\n14#17,6:3516\n14#17,6:3522\n14#17,6:3528\n64#18,5:3565\n64#18,5:3573\n78#19:3570\n107#19,2:3571\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n*L\n481#1:2634\n482#1:2635\n483#1:2636\n1970#1:2661\n2160#1:2753\n2168#1:2833\n2357#1:2865\n2366#1:2948\n743#1:3354\n2065#1:3616\n2562#1:3675\n485#1:2637,6\n492#1:2643,6\n1924#1:2649,6\n1930#1:2655,6\n1971#1:2662,6\n1972#1:2668,6\n1979#1:2681,3\n1979#1:2685,3\n1980#1:2688,6\n2025#1:2731,6\n2047#1:2741,6\n2061#1:2747,6\n2168#1:2802,6\n2345#1:2855,6\n2366#1:2917,6\n2544#1:2970,6\n2558#1:2980,6\n1919#1:2986,6\n517#1:2999,3\n517#1:3003,3\n518#1:3006,6\n519#1:3012,6\n520#1:3018,6\n521#1:3024,6\n523#1:3030,6\n525#1:3073,6\n553#1:3081,6\n554#1:3087,6\n555#1:3093,6\n556#1:3099,6\n562#1:3105,6\n1766#1:3116,6\n1775#1:3122,6\n1799#1:3128,6\n1837#1:3134,6\n1907#1:3140,6\n1911#1:3187,6\n564#1:3202,6\n565#1:3208,6\n566#1:3214,6\n567#1:3220,6\n568#1:3226,6\n569#1:3232,6\n570#1:3238,6\n571#1:3244,6\n573#1:3250,6\n574#1:3256,6\n578#1:3262,6\n579#1:3268,6\n580#1:3274,6\n581#1:3280,6\n582#1:3286,6\n583#1:3292,6\n588#1:3298,6\n723#1:3304,6\n733#1:3310,6\n743#1:3323,6\n1532#1:3375,6\n1543#1:3381,6\n1546#1:3387,6\n1549#1:3393,6\n1594#1:3399,6\n1597#1:3405,6\n1602#1:3411,6\n1605#1:3417,6\n1608#1:3423,6\n1611#1:3429,6\n1623#1:3435,6\n1629#1:3441,6\n1633#1:3447,6\n1644#1:3453,6\n1650#1:3459,6\n1654#1:3465,6\n1659#1:3471,6\n1662#1:3477,6\n1664#1:3483,6\n1668#1:3489,6\n1694#1:3504,6\n1723#1:3510,6\n1826#1:3535,6\n1829#1:3541,6\n1875#1:3547,6\n1885#1:3553,6\n1897#1:3559,6\n2065#1:3585,6\n2562#1:3644,6\n1979#1:2674\n1979#1:2675,6\n517#1:2992\n517#1:2993,6\n1979#1:2684\n517#1:3002\n2021#1:2694\n2021#1:2695,9\n2021#1:2740\n2161#1:2756\n2161#1:2757,8\n2161#1:2864\n2359#1:2871\n2359#1:2872,8\n2359#1:2979\n524#1:3036\n524#1:3037,9\n1905#1:3146\n1905#1:3147,9\n1905#1:3186\n524#1:3196\n2021#1:2704,6\n2021#1:2719,3\n2021#1:2728,2\n2021#1:2739\n2161#1:2765,6\n2161#1:2780,3\n2161#1:2789,2\n2161#1:2863\n2359#1:2880,6\n2359#1:2895,3\n2359#1:2904,2\n2359#1:2978\n524#1:3046,6\n524#1:3061,3\n524#1:3070,2\n1905#1:3156,6\n1905#1:3171,3\n1905#1:3180,2\n1905#1:3185\n524#1:3195\n2021#1:2710,9\n2021#1:2730\n2021#1:2737,2\n2161#1:2771,9\n2161#1:2791\n2161#1:2861,2\n2359#1:2886,9\n2359#1:2906\n2359#1:2976,2\n524#1:3052,9\n524#1:3072\n1905#1:3162,9\n1905#1:3182,3\n524#1:3193,2\n2021#1:2722,6\n2161#1:2783,6\n2359#1:2898,6\n524#1:3064,6\n1905#1:3174,6\n2164#1:2754\n2165#1:2755\n2170#1:2792\n2172#1:2793\n2173#1:2794\n2344#1:2854\n2362#1:2869\n2363#1:2870\n2368#1:2907\n2373#1:2908\n2375#1:2909\n2543#1:2969\n561#1:3079\n1741#1:3111\n1744#1:3113\n1751#1:3114\n457#1:3696\n2168#1:2795,7\n2168#1:2808,2\n2168#1:2811,7\n2168#1:2818,10\n2168#1:2828\n2168#1:2829,4\n2168#1:2834,7\n2168#1:2841,12\n2168#1:2853\n2366#1:2910,7\n2366#1:2923,2\n2366#1:2926,7\n2366#1:2933,10\n2366#1:2943\n2366#1:2944,4\n2366#1:2949,7\n2366#1:2956,12\n2366#1:2968\n743#1:3316,7\n743#1:3329,2\n743#1:3332,7\n743#1:3339,10\n743#1:3349\n743#1:3350,4\n743#1:3355,7\n743#1:3362,12\n743#1:3374\n2065#1:3578,7\n2065#1:3591,2\n2065#1:3594,7\n2065#1:3601,10\n2065#1:3611\n2065#1:3612,4\n2065#1:3617,7\n2065#1:3624,12\n2065#1:3636\n2562#1:3637,7\n2562#1:3650,2\n2562#1:3653,7\n2562#1:3660,10\n2562#1:3670\n2562#1:3671,4\n2562#1:3676,7\n2562#1:3683,12\n2562#1:3695\n2168#1:2810\n2366#1:2925\n743#1:3331\n2065#1:3593\n2562#1:3652\n2358#1:2866,3\n561#1:3080\n1741#1:3112\n519#1:3197\n519#1:3198,2\n564#1:3495\n564#1:3496,2\n565#1:3498\n565#1:3499,2\n584#1:3501\n585#1:3502\n586#1:3503\n1743#1:3534\n1728#1:3200,2\n1705#1:3516,6\n1712#1:3522,6\n1713#1:3528,6\n1950#1:3565,5\n2048#1:3573,5\n1971#1:3570\n1971#1:3571,2\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeActivityKt {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f23135a = "HomeActivity_Player";

    /* renamed from: c, reason: collision with root package name */
    public static final int f23137c = 68;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final List<kg.l> f23136b = a00.h0.Q(new kg.l(new com.baicizhan.main.home.experiment.z3(R.drawable.ic_home_navigation_words_normal, R.drawable.ic_home_navigation_words_selected, 0, 4, null), "单词", xd.a.f98002r, null, 8, null), new kg.l(new com.baicizhan.main.home.experiment.z3(R.drawable.ic_home_navigation_courses_normal, R.drawable.ic_home_navigation_courses_selected, 0, 4, null), com.baicizhan.main.home.experiment.repo.q.f21581c, "courses", null, 8, null), new kg.l(new com.baicizhan.main.home.experiment.z3(R.drawable.ic_home_navigation_training_normal, R.drawable.ic_home_navigation_training_selected, 0, 4, null), "训练场", "training", null, 8, null), new kg.l(new com.baicizhan.main.home.experiment.z3(R.drawable.ic_home_navigation_together_learn_normal, R.drawable.ic_home_navigation_together_learn_selected, 0, 4, null), "一起背", "together_learning", null, 8, null), new kg.l(new com.baicizhan.main.home.experiment.z3(R.drawable.ic_home_navigation_store_normal, R.drawable.ic_home_navigation_store_selected, 0, 4, null), "铜板购", "store", null, 8, null));

    /* renamed from: d, reason: collision with root package name */
    public static final float f23138d = Dp.m5115constructorimpl(56);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final Triple f23139e = new Triple(null, 0, Boolean.FALSE);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f23165a = new a();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getTop(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.364f, 60, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$5$1$1$19$1", f = "HomeActivity.kt", i = {0}, l = {1665}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
    public static final class a0 extends SuspendLambda implements x00.p<GameType, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23166a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f23167b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wg.q f23168c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(wg.q qVar, j00.c<? super a0> cVar) {
            super(2, cVar);
            this.f23168c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            a0 a0Var = new a0(this.f23168c, cVar);
            a0Var.f23167b = obj;
            return a0Var;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(GameType gameType, j00.c<? super yz.g2> cVar) {
            return ((a0) create(gameType, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            GameType gameType = (GameType) this.f23167b;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23166a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                wg.q qVar = this.f23168c;
                this.f23167b = l00.k.a(gameType);
                this.f23166a = 1;
                if (HomeActivityKt.s1(qVar, gameType, false, 0, this, 8, null) == l11) {
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
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$DynamicUnlockGuide$2$1$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n113#2:2635\n113#2:2636\n113#2:2637\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$DynamicUnlockGuide$2$1$2$1\n*L\n2574#1:2634\n2575#1:2635\n2576#1:2636\n2577#1:2637\n*E\n"})
    public static final class b implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23169a;

        public b(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23169a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f23169a.getEnd(), Dp.m5115constructorimpl(12), 0.0f, 4, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), this.f23169a.getTop(), Dp.m5115constructorimpl(64), 0.0f, 4, (Object) null);
            Dimension.Companion companion = Dimension.Companion;
            float f11 = 32;
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
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$5$1$1$20$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b0 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23170a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<com.baicizhan.main.home.dialog.e0> f23171b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f23172c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ State<k3.o4> f23173d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23174e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f23175f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23176g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$5$1$1$20$1$1$1", f = "HomeActivity.kt", i = {}, l = {1682}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f23177a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l3.g2 f23178b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l3.g2 g2Var, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f23178b = g2Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f23178b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f23177a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    qb.c.b("HomeActivity_Player", "try to refresh...", new Object[0]);
                    l3.g2 g2Var = this.f23178b;
                    this.f23177a = 1;
                    if (g2Var.a(this) == l11) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public b0(MutableState<com.baicizhan.main.home.dialog.e0> mutableState, AppCompatActivity appCompatActivity, State<? extends k3.o4> state, MutableState<Boolean> mutableState2, c40.r0 r0Var, MutableState<Boolean> mutableState3, j00.c<? super b0> cVar) {
            super(2, cVar);
            this.f23171b = mutableState;
            this.f23172c = appCompatActivity;
            this.f23173d = state;
            this.f23174e = mutableState2;
            this.f23175f = r0Var;
            this.f23176g = mutableState3;
        }

        public static final yz.g2 k(c40.r0 r0Var, l3.g2 g2Var) {
            c40.k.f(r0Var, null, null, new a(g2Var, null), 3, null);
            return yz.g2.f100423a;
        }

        public static final yz.g2 m(MutableState mutableState, boolean z11) {
            HomeActivityKt.i1(mutableState, Boolean.valueOf(z11));
            return yz.g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b0(this.f23171b, this.f23172c, this.f23173d, this.f23174e, this.f23175f, this.f23176g, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b0) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23170a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            qb.c.b("HomeActivity_Player", "homeState to " + HomeActivityKt.O0(this.f23173d), new Object[0]);
            HomeActivityKt.N0(this.f23174e, HomeActivityKt.O0(this.f23173d) instanceof o4.c);
            if (HomeActivityKt.O0(this.f23173d) instanceof o4.b) {
                k3.o4 O0 = HomeActivityKt.O0(this.f23173d);
                kotlin.jvm.internal.g0.n(O0, "null cannot be cast to non-null type com.baicizhan.app.api.service.WordsHomeState.Error");
                final l3.g2 f11 = ((o4.b) O0).f();
                MutableState<com.baicizhan.main.home.dialog.e0> mutableState = this.f23171b;
                final c40.r0 r0Var = this.f23175f;
                mutableState.setValue(new com.baicizhan.main.home.dialog.e0("加载失败", "数据加载失败，请重新尝试", null, null, false, 0, "", "重试", false, null, null, false, null, null, new x00.a() { // from class: com.baicizhan.main.home.player.k4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 k11;
                        k11 = HomeActivityKt.b0.k(c40.r0.this, f11);
                        return k11;
                    }
                }, 14140, null));
            } else if ((HomeActivityKt.O0(this.f23173d) instanceof o4.a) && (this.f23172c instanceof HomeActivity) && HomeActivityKt.d1(this.f23176g) == null) {
                ComposeBaseActivity composeBaseActivity = (ComposeBaseActivity) this.f23172c;
                final MutableState<Boolean> mutableState2 = this.f23176g;
                kg.k.j(composeBaseActivity, new x00.l() { // from class: com.baicizhan.main.home.player.l4
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 m11;
                        m11 = HomeActivityKt.b0.m(MutableState.this, ((Boolean) obj2).booleanValue());
                        return m11;
                    }
                });
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23179a;

        public c(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23179a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, this.f23179a, 0.0f, 2, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f23179a.getBottom(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$5$1$2$2$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c0 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23180a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AppCompatActivity f23181b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(AppCompatActivity appCompatActivity, j00.c<? super c0> cVar) {
            super(2, cVar);
            this.f23181b = appCompatActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new c0(this.f23181b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c0) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23180a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            AppCompatActivity appCompatActivity = this.f23181b;
            HomeActivity homeActivity = appCompatActivity instanceof HomeActivity ? (HomeActivity) appCompatActivity : null;
            if (homeActivity != null) {
                kg.k.k(homeActivity);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$DynamicUnlockGuide$2$1$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$DynamicUnlockGuide$2$1$5$1\n*L\n2603#1:2634\n*E\n"})
    public static final class d implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23182a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23183b;

        public d(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f23182a = constrainedLayoutReference;
            this.f23183b = constrainedLayoutReference2;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, this.f23182a, 0.0f, 2, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f23183b.getBottom(), Dp.m5115constructorimpl(12), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$7$1$1", f = "HomeActivity.kt", i = {}, l = {1769}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class d0 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23184a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wg.q f23185b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ HomeMode f23186c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(wg.q qVar, HomeMode homeMode, j00.c<? super d0> cVar) {
            super(2, cVar);
            this.f23185b = qVar;
            this.f23186c = homeMode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d0(this.f23185b, this.f23186c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d0) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23184a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                this.f23184a = 1;
                if (c40.a1.b(500L, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            wg.q qVar = this.f23185b;
            HomeMode homeMode = this.f23186c;
            if (homeMode == null) {
                return yz.g2.f100423a;
            }
            qVar.V(homeMode);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<yz.g2> f23187a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.a<yz.g2> f23188b;

        public e(x00.a<yz.g2> aVar, x00.a<yz.g2> aVar2) {
            this.f23187a = aVar;
            this.f23188b = aVar2;
        }

        public final void a() {
            this.f23187a.invoke();
            this.f23188b.invoke();
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$8$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$PlayerHome$1$1$1$8$1\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,2633:1\n47#2,4:2634\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$PlayerHome$1$1$1$8$1\n*L\n1778#1:2634,4\n*E\n"})
    public static final class e0 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23189a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f23190b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Pair<BuildingPhase, c40.l2>> f23191c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @kotlin.jvm.internal.u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$PlayerHome$1$1$1$8$1\n*L\n1#1,49:1\n1779#2,2:50\n*E\n"})
        public static final class a extends kotlin.coroutines.a implements c40.n0 {
            public a(n0.b bVar) {
                super(bVar);
            }

            @Override // c40.n0
            public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
                qb.c.q("HomeActivity_Player", "build reset protection: " + th2.getMessage(), new Object[0]);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$8$1$protection$2", f = "HomeActivity.kt", i = {}, l = {1782}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f23192a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutableState<Pair<BuildingPhase, c40.l2>> f23193b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(MutableState<Pair<BuildingPhase, c40.l2>> mutableState, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f23193b = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new b(this.f23193b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f23192a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    qb.c.i("HomeActivity_Player", "build reset protection waiting...", new Object[0]);
                    this.f23192a = 1;
                    if (c40.a1.b(20000L, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                HomeActivityKt.u0(this.f23193b, yz.h1.a(null, null));
                qb.c.i("HomeActivity_Player", "build reset protected", new Object[0]);
                return yz.g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(c40.r0 r0Var, MutableState<Pair<BuildingPhase, c40.l2>> mutableState, j00.c<? super e0> cVar) {
            super(2, cVar);
            this.f23190b = r0Var;
            this.f23191c = mutableState;
        }

        public static final yz.g2 j(Throwable th2) {
            qb.c.q("HomeActivity_Player", "build reset protection done: " + (th2 != null ? th2.getMessage() : null), new Object[0]);
            return yz.g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new e0(this.f23190b, this.f23191c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((e0) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c40.l2 f11;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23189a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            Pair t02 = HomeActivityKt.t0(this.f23191c);
            BuildingPhase buildingPhase = (BuildingPhase) t02.component1();
            c40.l2 l2Var = (c40.l2) t02.component2();
            if (buildingPhase == BuildingPhase.PENDING_BUILD && l2Var == null) {
                f11 = c40.k.f(this.f23190b, new a(c40.n0.f7891d0), null, new b(this.f23191c, null), 2, null);
                f11.z0(new x00.l() { // from class: com.baicizhan.main.home.player.m4
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        yz.g2 j11;
                        j11 = HomeActivityKt.e0.j((Throwable) obj2);
                        return j11;
                    }
                });
                MutableState<Pair<BuildingPhase, c40.l2>> mutableState = this.f23191c;
                HomeActivityKt.u0(mutableState, Pair.copy$default(HomeActivityKt.t0(mutableState), null, f11, 1, null));
            } else if (buildingPhase == BuildingPhase.UNLOCKED && l2Var != null && l2Var.isActive()) {
                l2Var.cancel(new CancellationException("unlocked and protection removed"));
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23194a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23195b;

        public f(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f23194a = constrainedLayoutReference;
            this.f23195b = constrainedLayoutReference2;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, this.f23194a, 0.0f, 2, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, this.f23195b.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.562f, 60, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f0 extends a.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState<Triple<HomeMode, HomeMode, Boolean>> f23196a;

        public f0(MutableState<Triple<HomeMode, HomeMode, Boolean>> mutableState) {
            this.f23196a = mutableState;
        }

        @Override // com.esotericsoftware.spine.a.c, com.esotericsoftware.spine.a.d
        public void c(a.g trackEntry) {
            kotlin.jvm.internal.g0.p(trackEntry, "trackEntry");
            if (kotlin.jvm.internal.g0.g(trackEntry.c().c(), "ani_trans")) {
                MutableState<Triple<HomeMode, HomeMode, Boolean>> mutableState = this.f23196a;
                mutableState.setValue(Standard_extKt.triplet(yz.h1.a(mutableState.getValue().getSecond(), this.f23196a.getValue().getSecond()), Boolean.FALSE));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$DynamicUnlockGuide$2$1$8\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n113#2:2635\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$DynamicUnlockGuide$2$1$8\n*L\n2625#1:2634\n2626#1:2635\n*E\n"})
    public static final class g implements x00.q<RowScope, Composer, Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23197a;

        public g(String str) {
            this.f23197a = str;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(RowScope Button, Composer composer, int i11) {
            kotlin.jvm.internal.g0.p(Button, "$this$Button");
            if (!composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(192236510, i11, -1, "com.baicizhan.main.home.player.DynamicUnlockGuide.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:2621)");
            }
            TextKt.m1845Text4IGK_g(this.f23197a, SizeKt.m778width3ABfNKs(PaddingKt.m728paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5115constructorimpl(12), 1, null), Dp.m5115constructorimpl(202)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle1(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 48, 0, 65020);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ yz.g2 invoke(RowScope rowScope, Composer composer, Integer num) {
            a(rowScope, composer, num.intValue());
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$2$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class g0 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23198a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedDispatcherOwner f23199b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j0 f23200c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(OnBackPressedDispatcherOwner onBackPressedDispatcherOwner, j0 j0Var, j00.c<? super g0> cVar) {
            super(2, cVar);
            this.f23199b = onBackPressedDispatcherOwner;
            this.f23200c = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new g0(this.f23199b, this.f23200c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((g0) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OnBackPressedDispatcher onBackPressedDispatcher;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23198a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = this.f23199b;
            if (onBackPressedDispatcherOwner != null && (onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher()) != null) {
                onBackPressedDispatcher.addCallback(this.f23200c);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f23201a = new h();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5392linkToR7zmacU$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getTop(), constrainAs.getParent().getEnd(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16368, null);
            constrainAs.setVerticalBias(0.24f);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$2$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h0 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23202a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f23203b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ HomeMode f23204c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ wg.q f23205d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(boolean z11, HomeMode homeMode, wg.q qVar, j00.c<? super h0> cVar) {
            super(2, cVar);
            this.f23203b = z11;
            this.f23204c = homeMode;
            this.f23205d = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new h0(this.f23203b, this.f23204c, this.f23205d, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((h0) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            HomeMode homeMode;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23202a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (this.f23203b && (homeMode = this.f23204c) != null) {
                this.f23205d.V(homeMode);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$Freshman$2$1$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n113#2:2635\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$Freshman$2$1$2$1\n*L\n2080#1:2634\n2081#1:2635\n*E\n"})
    public static final class i implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23206a;

        public i(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23206a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f23206a.getBottom(), Dp.m5115constructorimpl(40), 0.0f, 4, (Object) null);
            float f11 = 24;
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 112, (Object) null);
            constrainAs.setWidth(Dimension.Companion.getFillToConstraints());
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i0 implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wg.q f23207a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HomeMode f23208b;

        public i0(wg.q qVar, HomeMode homeMode) {
            this.f23207a = qVar;
            this.f23208b = homeMode;
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
            this.f23207a.Z();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(LifecycleOwner owner) {
            kotlin.jvm.internal.g0.p(owner, "owner");
            super.onStart(owner);
            wg.q qVar = this.f23207a;
            HomeMode homeMode = this.f23208b;
            if (homeMode == null) {
                return;
            }
            qVar.V(homeMode);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStop(LifecycleOwner owner) {
            kotlin.jvm.internal.g0.p(owner, "owner");
            super.onStop(owner);
            wg.q qVar = this.f23207a;
            HomeMode homeMode = this.f23208b;
            if (homeMode == null) {
                return;
            }
            qVar.W(homeMode);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23209a;

        public j(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23209a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            ConstrainScope.m5390linkTo8ZKsbrE$default(constrainAs, this.f23209a.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 0.0f, 0.0f, 0.64f, 60, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j0 extends OnBackPressedCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f23210a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(Context context) {
            super(true);
            this.f23210a = context;
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            Context context = this.f23210a;
            kotlin.jvm.internal.g0.n(context, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) context).moveTaskToBack(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wg.q f23211a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.p<GameType, j00.c<? super yz.g2>, Object> f23212b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.a<yz.g2> f23213c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$Freshman$2$1$4$1$1", f = "HomeActivity.kt", i = {0}, l = {2114}, m = "invokeSuspend", n = {"it"}, s = {"L$0"}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<GameType, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f23214a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f23215b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x00.p<GameType, j00.c<? super yz.g2>, Object> f23216c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ x00.a<yz.g2> f23217d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(x00.p<? super GameType, ? super j00.c<? super yz.g2>, ? extends Object> pVar, x00.a<yz.g2> aVar, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f23216c = pVar;
                this.f23217d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f23216c, this.f23217d, cVar);
                aVar.f23215b = obj;
                return aVar;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(GameType gameType, j00.c<? super yz.g2> cVar) {
                return ((a) create(gameType, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                GameType gameType = (GameType) this.f23215b;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f23214a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    x00.p<GameType, j00.c<? super yz.g2>, Object> pVar = this.f23216c;
                    this.f23215b = l00.k.a(gameType);
                    this.f23214a = 1;
                    if (pVar.invoke(gameType, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                this.f23217d.invoke();
                return yz.g2.f100423a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public k(wg.q qVar, x00.p<? super GameType, ? super j00.c<? super yz.g2>, ? extends Object> pVar, x00.a<yz.g2> aVar) {
            this.f23211a = qVar;
            this.f23212b = pVar;
            this.f23213c = aVar;
        }

        public final void a() {
            this.f23211a.d0(new a(this.f23212b, this.f23213c, null));
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n*L\n1#1,67:1\n1951#2,2:68\n*E\n"})
    public static final class k0 implements DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f23218a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i0 f23219b;

        public k0(Lifecycle lifecycle, i0 i0Var) {
            this.f23218a = lifecycle;
            this.f23219b = i0Var;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            Lifecycle lifecycle = this.f23218a;
            if (lifecycle != null) {
                lifecycle.removeObserver(this.f23219b);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$Freshman$2$1$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$Freshman$2$1$5$1\n*L\n2121#1:2634\n*E\n"})
    public static final class l implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23220a;

        public l(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23220a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), this.f23220a.getTop(), Dp.m5115constructorimpl(16), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt", f = "HomeActivity.kt", i = {0, 0, 0, 0}, l = {500}, m = "PlayerHome$startLearning", n = {"$model", q9.h.f81954r, "going", "unit"}, s = {"L$0", "L$1", "Z$0", "I$0"}, v = 1)
    public static final class l0 extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f23221a;

        /* renamed from: b, reason: collision with root package name */
        public Object f23222b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f23223c;

        /* renamed from: d, reason: collision with root package name */
        public int f23224d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f23225e;

        /* renamed from: f, reason: collision with root package name */
        public int f23226f;

        public l0(j00.c<? super l0> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f23225e = obj;
            this.f23226f |= Integer.MIN_VALUE;
            return HomeActivityKt.r1(null, null, false, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$10$2$1$1", f = "HomeActivity.kt", i = {}, l = {1831, 1832}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class m extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23227a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Pair<Triple<Boolean, Integer, Integer>, o.y>> f23228b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(MutableState<Pair<Triple<Boolean, Integer, Integer>, o.y>> mutableState, j00.c<? super m> cVar) {
            super(2, cVar);
            this.f23228b = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new m(this.f23228b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((m) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        
            if (r11.a(r10) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
        
            if (r11.a(r10) == r0) goto L23;
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
                int r1 = r10.f23227a
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                kotlin.e.n(r11)
                goto L5f
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.e.n(r11)
                goto L40
            L1e:
                kotlin.e.n(r11)
                androidx.compose.runtime.MutableState<kotlin.Pair<kotlin.Triple<java.lang.Boolean, java.lang.Integer, java.lang.Integer>, l3.o$y>> r11 = r10.f23228b
                java.lang.Object r11 = r11.getValue()
                kotlin.Pair r11 = (kotlin.Pair) r11
                java.lang.Object r11 = r11.getSecond()
                l3.o$y r11 = (l3.o.y) r11
                if (r11 == 0) goto L40
                l3.g2 r11 = r11.a()
                if (r11 == 0) goto L40
                r10.f23227a = r2
                java.lang.Object r11 = r11.a(r10)
                if (r11 != r0) goto L40
                goto L5e
            L40:
                androidx.compose.runtime.MutableState<kotlin.Pair<kotlin.Triple<java.lang.Boolean, java.lang.Integer, java.lang.Integer>, l3.o$y>> r11 = r10.f23228b
                java.lang.Object r11 = r11.getValue()
                kotlin.Pair r11 = (kotlin.Pair) r11
                java.lang.Object r11 = r11.getSecond()
                l3.o$y r11 = (l3.o.y) r11
                if (r11 == 0) goto L5f
                l3.g2 r11 = r11.b()
                if (r11 == 0) goto L5f
                r10.f23227a = r3
                java.lang.Object r11 = r11.a(r10)
                if (r11 != r0) goto L5f
            L5e:
                return r0
            L5f:
                androidx.compose.runtime.MutableState<kotlin.Pair<kotlin.Triple<java.lang.Boolean, java.lang.Integer, java.lang.Integer>, l3.o$y>> r11 = r10.f23228b
                java.lang.Object r0 = r11.getValue()
                kotlin.Pair r0 = (kotlin.Pair) r0
                androidx.compose.runtime.MutableState<kotlin.Pair<kotlin.Triple<java.lang.Boolean, java.lang.Integer, java.lang.Integer>, l3.o$y>> r1 = r10.f23228b
                java.lang.Object r1 = r1.getValue()
                kotlin.Pair r1 = (kotlin.Pair) r1
                java.lang.Object r1 = r1.getFirst()
                r4 = r1
                kotlin.Triple r4 = (kotlin.Triple) r4
                r1 = 0
                java.lang.Boolean r5 = l00.a.a(r1)
                r8 = 6
                r9 = 0
                r6 = 0
                r7 = 0
                kotlin.Triple r1 = kotlin.Triple.copy$default(r4, r5, r6, r7, r8, r9)
                r2 = 0
                kotlin.Pair r0 = kotlin.Pair.copy$default(r0, r1, r2, r3, r2)
                r11.setValue(r0)
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.HomeActivityKt.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$startLearningAsync$1", f = "HomeActivity.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class m0 extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23229a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GameType f23230b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f23231c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f23232d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ wg.q f23233e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(GameType gameType, boolean z11, int i11, wg.q qVar, j00.c<? super m0> cVar) {
            super(2, cVar);
            this.f23230b = gameType;
            this.f23231c = z11;
            this.f23232d = i11;
            this.f23233e = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new m0(this.f23230b, this.f23231c, this.f23232d, this.f23233e, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((m0) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23229a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                wg.q qVar = this.f23233e;
                GameType gameType = this.f23230b;
                boolean z11 = this.f23231c;
                int i12 = this.f23232d;
                this.f23229a = 1;
                if (HomeActivityKt.r1(qVar, gameType, z11, i12, this) == l11) {
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
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$11$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class n extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23234a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Pair<Triple<Boolean, Integer, Integer>, o.y>> f23235b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ wg.q f23236c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(MutableState<Pair<Triple<Boolean, Integer, Integer>, o.y>> mutableState, wg.q qVar, j00.c<? super n> cVar) {
            super(2, cVar);
            this.f23235b = mutableState;
            this.f23236c = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new n(this.f23235b, this.f23236c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((n) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23234a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            if (this.f23235b.getValue().getFirst().getFirst().booleanValue()) {
                wg.q.x(this.f23236c, AudioEffect.TREASURE_CHEST_DISPLAY, null, 2, null);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n0 implements Player.Listener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.r0 f23237a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableIntState f23238b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$SeaBackground$exoPlayer$1$1$1$onIsPlayingChanged$1", f = "HomeActivity.kt", i = {}, l = {2004}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f23239a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutableIntState f23240b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MutableIntState mutableIntState, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f23240b = mutableIntState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f23240b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f23239a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    this.f23239a = 1;
                    if (c40.a1.b(20L, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                HomeActivityKt.y1(this.f23240b, HomeActivityKt.x1(this.f23240b) + 1);
                return yz.g2.f100423a;
            }
        }

        public n0(c40.r0 r0Var, MutableIntState mutableIntState) {
            this.f23237a = r0Var;
            this.f23238b = mutableIntState;
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsPlayingChanged(boolean z11) {
            if (z11) {
                HomeActivityKt.y1(this.f23238b, HomeActivityKt.x1(this.f23238b) + 1);
                c40.k.f(this.f23237a, null, null, new a(this.f23238b, null), 3, null);
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException error) {
            kotlin.jvm.internal.g0.p(error, "error");
            super.onPlayerError(error);
            qb.c.c("HomeActivity_Player", "", error);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$12$1$1$1", f = "HomeActivity.kt", i = {}, l = {1877, 1878}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class o extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23241a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetState f23242b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l3.o f23243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ModalBottomSheetState modalBottomSheetState, l3.o oVar, j00.c<? super o> cVar) {
            super(2, cVar);
            this.f23242b = modalBottomSheetState;
            this.f23243c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new o(this.f23242b, this.f23243c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((o) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (r5.a(r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
        
            if (r5.hide(r4) == r0) goto L15;
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
                int r1 = r4.f23241a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.e.n(r5)
                goto L3d
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.e.n(r5)
                goto L2c
            L1e:
                kotlin.e.n(r5)
                androidx.compose.material.ModalBottomSheetState r5 = r4.f23242b
                r4.f23241a = r3
                java.lang.Object r5 = r5.hide(r4)
                if (r5 != r0) goto L2c
                goto L3c
            L2c:
                l3.o r5 = r4.f23243c
                l3.o$v r5 = (l3.o.v) r5
                l3.g2 r5 = r5.b()
                r4.f23241a = r2
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L3d
            L3c:
                return r0
            L3d:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.HomeActivityKt.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope$onDispose$1\n+ 2 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n*L\n1#1,67:1\n2049#2,4:68\n*E\n"})
    public static final class o0 implements DisposableEffectResult {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SimpleCache f23244a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExoPlayer f23245b;

        public o0(SimpleCache simpleCache, ExoPlayer exoPlayer) {
            this.f23244a = simpleCache;
            this.f23245b = exoPlayer;
        }

        @Override // androidx.compose.runtime.DisposableEffectResult
        public void dispose() {
            this.f23244a.release();
            this.f23245b.release();
            qb.c.i("HomeActivity_Player", "release player and cache", new Object[0]);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$13$1$1$1", f = "HomeActivity.kt", i = {}, l = {1899}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class p extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23246a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetState f23247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ModalBottomSheetState modalBottomSheetState, j00.c<? super p> cVar) {
            super(2, cVar);
            this.f23247b = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new p(this.f23247b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((p) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23246a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                ModalBottomSheetState modalBottomSheetState = this.f23247b;
                this.f23246a = 1;
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
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$1$1\n*L\n2181#1:2634\n*E\n"})
    public static final class p0 implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final p0 f23248a = new p0();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), Dp.m5115constructorimpl(8), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$17$1", f = "HomeActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class q extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23249a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f23250b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ModalBottomSheetState f23251c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(j0 j0Var, ModalBottomSheetState modalBottomSheetState, j00.c<? super q> cVar) {
            super(2, cVar);
            this.f23250b = j0Var;
            this.f23251c = modalBottomSheetState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new q(this.f23250b, this.f23251c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((q) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f23249a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            this.f23250b.setEnabled(!this.f23251c.isVisible());
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$10$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n113#2:2635\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$10$1\n*L\n2291#1:2634\n2292#1:2635\n*E\n"})
    public static final class q0 implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23252a;

        public q0(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23252a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            float f11 = 36;
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 112, (Object) null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), this.f23252a.getTop(), Dp.m5115constructorimpl(28), 0.0f, 4, (Object) null);
            constrainAs.setWidth(Dimension.Companion.getFillToConstraints());
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
        public static final r f23253a = new r();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, (Object) null);
            constrainAs.setWidth(Dimension.Companion.getFillToConstraints());
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$11\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,2633:1\n113#2,6:2634\n113#2:2677\n113#2:2714\n113#2:2765\n99#3:2640\n96#3,9:2641\n106#3:2769\n79#4,6:2650\n86#4,3:2665\n89#4,2:2674\n79#4,6:2687\n86#4,3:2702\n89#4,2:2711\n79#4,6:2730\n86#4,3:2745\n89#4,2:2754\n93#4:2759\n93#4:2763\n93#4:2768\n347#5,9:2656\n356#5:2676\n347#5,9:2693\n356#5:2713\n347#5,9:2736\n356#5,3:2756\n357#5,2:2761\n357#5,2:2766\n4206#6,6:2668\n4206#6,6:2705\n4206#6,6:2748\n87#7:2678\n85#7,8:2679\n94#7:2764\n1247#8,6:2715\n70#9:2721\n68#9,8:2722\n77#9:2760\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$11\n*L\n2295#1:2634,6\n2296#1:2677\n2305#1:2714\n2335#1:2765\n2295#1:2640\n2295#1:2641,9\n2295#1:2769\n2295#1:2650,6\n2295#1:2665,3\n2295#1:2674,2\n2296#1:2687,6\n2296#1:2702,3\n2296#1:2711,2\n2303#1:2730,6\n2303#1:2745,3\n2303#1:2754,2\n2303#1:2759\n2296#1:2763\n2295#1:2768\n2295#1:2656,9\n2295#1:2676\n2296#1:2693,9\n2296#1:2713\n2303#1:2736,9\n2303#1:2756,3\n2296#1:2761,2\n2295#1:2766,2\n2295#1:2668,6\n2296#1:2705,6\n2303#1:2748,6\n2296#1:2678\n2296#1:2679,8\n2296#1:2764\n2306#1:2715,6\n2303#1:2721\n2303#1:2722,8\n2303#1:2760\n*E\n"})
    public static final class r0 implements x00.p<Composer, Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b8 f23254a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$11$1$1$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,2633:1\n113#2:2634\n113#2:2642\n113#2:2650\n33#3:2635\n33#3:2651\n53#4,3:2636\n60#4:2640\n70#4:2644\n53#4,3:2647\n53#4,3:2652\n57#5:2639\n61#5:2643\n22#6:2641\n22#6:2645\n33#7:2646\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$11$1$1$1$1\n*L\n2311#1:2634\n2314#1:2642\n2320#1:2650\n2311#1:2635\n2320#1:2651\n2311#1:2636,3\n2314#1:2640\n2315#1:2644\n2313#1:2647,3\n2320#1:2652,3\n2314#1:2639\n2315#1:2643\n2314#1:2641\n2315#1:2645\n2313#1:2646\n*E\n"})
        public static final class a implements x00.l<DrawScope, yz.g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b8 f23255a;

            public a(b8 b8Var) {
                this.f23255a = b8Var;
            }

            public final void a(DrawScope drawBehind) {
                kotlin.jvm.internal.g0.p(drawBehind, "$this$drawBehind");
                long Color = ColorKt.Color(4292785407L);
                float f11 = 100;
                float mo377toPx0680j_4 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f11));
                float mo377toPx0680j_42 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f11));
                DrawScope.m3056drawRoundRectuAw5IA$default(drawBehind, Color, 0L, 0L, CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(mo377toPx0680j_4) << 32)), null, 0.0f, null, 0, R.styleable.Theme_drawable_walk_sound2, null);
                float max = Math.max(Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)) * Math.min(((b8.b) this.f23255a).a() / ((b8.b) this.f23255a).f(), 1.0f), drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(18)));
                float intBitsToFloat = Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L));
                long m2328constructorimpl = Size.m2328constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(max) << 32));
                long Color2 = ColorKt.Color(4294957612L);
                float mo377toPx0680j_43 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f11));
                float mo377toPx0680j_44 = drawBehind.mo377toPx0680j_4(Dp.m5115constructorimpl(f11));
                DrawScope.m3056drawRoundRectuAw5IA$default(drawBehind, Color2, 0L, m2328constructorimpl, CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(mo377toPx0680j_44) & 4294967295L) | (Float.floatToRawIntBits(mo377toPx0680j_43) << 32)), null, 0.0f, null, 0, R.styleable.Theme_drawable_time, null);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ yz.g2 invoke(DrawScope drawScope) {
                a(drawScope);
                return yz.g2.f100423a;
            }
        }

        public r0(b8 b8Var) {
            this.f23254a = b8Var;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(10919749, i11, -1, "com.baicizhan.main.home.player.StreakPromptSheet.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:2294)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m729paddingqDBjuR0 = PaddingKt.m729paddingqDBjuR0(companion, Dp.m5115constructorimpl(13), Dp.m5115constructorimpl((float) 13.5d), Dp.m5115constructorimpl((float) 11.5d), Dp.m5115constructorimpl((float) 10.5d));
            Alignment.Companion companion2 = Alignment.Companion;
            Alignment.Vertical bottom = companion2.getBottom();
            b8 b8Var = this.f23254a;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), bottom, composer, 48);
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
            Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, companion, 1.0f, false, 2, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(12)), companion2.getStart(), composer, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, weight$default);
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            b8.b bVar = (b8.b) b8Var;
            String str = "挑战 " + bVar.f() + " 天不断电";
            Color.Companion companion4 = Color.Companion;
            long m2546getWhite0d7_KjU = companion4.m2546getWhite0d7_KjU();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i12 = MaterialTheme.$stable;
            TextKt.m1845Text4IGK_g(str, (Modifier) null, m2546getWhite0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer, i12).getSubtitle2(), 0L, TextUnitKt.getSp(16), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(16), null, null, null, 0, 0, null, 16646141, null), composer, 384, 0, 65530);
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(18));
            boolean changed = composer.changed(b8Var);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new a(b8Var);
                composer.updateRememberedValue(rememberedValue);
            }
            Modifier drawBehind = DrawModifierKt.drawBehind(m759height3ABfNKs, (x00.l) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, drawBehind);
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
            Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g(bVar.a() + "/" + bVar.f(), (Modifier) null, companion4.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer, i12).getSubtitle2(), 0L, 0L, FontWeight.Companion.getNormal(), null, null, bk.k.n(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777179, null), composer, 384, 0, 65530);
            composer.endNode();
            composer.endNode();
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_streak_sheet_award_box, composer, 6), "box", PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl((float) 16), 0.0f, 0.0f, 0.0f, 14, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
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
    public static final class s implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState<o.z> f23256a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstraintLayoutScope f23257b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Triple<Boolean, Integer, Boolean>> f23258c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ State<l3.o> f23259d;

        /* JADX WARN: Multi-variable type inference failed */
        public s(MutableState<o.z> mutableState, ConstraintLayoutScope constraintLayoutScope, MutableState<Triple<Boolean, Integer, Boolean>> mutableState2, State<? extends l3.o> state) {
            this.f23256a = mutableState;
            this.f23257b = constraintLayoutScope;
            this.f23258c = mutableState2;
            this.f23259d = state;
        }

        public final void a() {
            l3.u h11;
            l3.o P0 = HomeActivityKt.P0(this.f23259d);
            l3.u uVar = null;
            o.z zVar = P0 instanceof o.z ? (o.z) P0 : null;
            if (zVar == null || (h11 = zVar.h()) == null) {
                o.z value = this.f23256a.getValue();
                if (value != null) {
                    uVar = value.h();
                }
            } else {
                uVar = h11;
            }
            if (uVar != null) {
                this.f23258c.setValue(Standard_extKt.triplet(yz.h1.a(Boolean.TRUE, Integer.valueOf((int) uVar.g())), Boolean.FALSE));
            }
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$2$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$2$1\n*L\n2188#1:2634\n*E\n"})
    public static final class s0 implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final s0 f23260a = new s0();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), Dp.m5115constructorimpl(48), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState<o.z> f23261a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstraintLayoutScope f23262b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Triple<Boolean, Integer, Boolean>> f23263c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ State<l3.o> f23264d;

        /* JADX WARN: Multi-variable type inference failed */
        public t(MutableState<o.z> mutableState, ConstraintLayoutScope constraintLayoutScope, MutableState<Triple<Boolean, Integer, Boolean>> mutableState2, State<? extends l3.o> state) {
            this.f23261a = mutableState;
            this.f23262b = constraintLayoutScope;
            this.f23263c = mutableState2;
            this.f23264d = state;
        }

        public final void a() {
            l3.u h11;
            l3.o P0 = HomeActivityKt.P0(this.f23264d);
            l3.u uVar = null;
            o.z zVar = P0 instanceof o.z ? (o.z) P0 : null;
            if (zVar == null || (h11 = zVar.h()) == null) {
                o.z value = this.f23261a.getValue();
                if (value != null) {
                    uVar = value.h();
                }
            } else {
                uVar = h11;
            }
            if (uVar != null) {
                this.f23263c.setValue(Standard_extKt.triplet(yz.h1.a(Boolean.TRUE, Integer.valueOf(uVar.h())), Boolean.FALSE));
            }
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class t0 implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.a<yz.g2> f23265a;

        public t0(x00.a<yz.g2> aVar) {
            this.f23265a = aVar;
        }

        public final void a() {
            this.f23265a.invoke();
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class u implements x00.a<yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MutableState<o.z> f23266a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstraintLayoutScope f23267b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ State<l3.o> f23268c;

        /* JADX WARN: Multi-variable type inference failed */
        public u(MutableState<o.z> mutableState, ConstraintLayoutScope constraintLayoutScope, State<? extends l3.o> state) {
            this.f23266a = mutableState;
            this.f23267b = constraintLayoutScope;
            this.f23268c = state;
        }

        public final void a() {
            l3.u h11;
            l3.o P0 = HomeActivityKt.P0(this.f23268c);
            l3.u uVar = null;
            o.z zVar = P0 instanceof o.z ? (o.z) P0 : null;
            if (zVar == null || (h11 = zVar.h()) == null) {
                o.z value = this.f23266a.getValue();
                if (value != null) {
                    uVar = value.h();
                }
            } else {
                uVar = h11;
            }
            if (uVar != null) {
                uVar.j();
            }
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ yz.g2 invoke() {
            a();
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$4$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$4$1\n*L\n2196#1:2634\n*E\n"})
    public static final class u0 implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final u0 f23269a = new u0();

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.centerHorizontallyTo$default(constrainAs, constrainAs.getParent(), 0.0f, 2, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), Dp.m5115constructorimpl(30), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class v implements x00.l<StatusType, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ wg.q f23270a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23271b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23272c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ HomeMode f23273d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23274e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23275f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f23276g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23277a;

            static {
                int[] iArr = new int[StatusType.values().length];
                try {
                    iArr[StatusType.ME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StatusType.VITALITY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StatusType.COINS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StatusType.FORWARDING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StatusType.SETTING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f23277a = iArr;
            }
        }

        public v(wg.q qVar, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, HomeMode homeMode, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5) {
            this.f23270a = qVar;
            this.f23271b = mutableState;
            this.f23272c = mutableState2;
            this.f23273d = homeMode;
            this.f23274e = mutableState3;
            this.f23275f = mutableState4;
            this.f23276g = mutableState5;
        }

        public final void a(StatusType it) {
            kotlin.jvm.internal.g0.p(it, "it");
            wg.q.x(this.f23270a, AudioEffect.COMMON_HOME_CLICK, null, 2, null);
            int i11 = a.f23277a[it.ordinal()];
            if (i11 == 1) {
                this.f23270a.a0();
                this.f23271b.setValue(Boolean.TRUE);
                return;
            }
            if (i11 != 2) {
                if (i11 == 3) {
                    this.f23272c.setValue(Boolean.TRUE);
                    return;
                }
                if (i11 != 4) {
                    if (i11 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f23276g.setValue(Boolean.TRUE);
                } else if (this.f23273d == HomeMode.WORDS) {
                    this.f23274e.setValue(Boolean.TRUE);
                } else {
                    this.f23275f.setValue(Boolean.TRUE);
                }
            }
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(StatusType statusType) {
            a(statusType);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$5$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$5$1\n*L\n2201#1:2634\n*E\n"})
    public static final class v0 implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23278a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23279b;

        public v0(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f23278a = constrainedLayoutReference;
            this.f23279b = constrainedLayoutReference2;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, this.f23278a.getStart(), this.f23278a.getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getTop(), this.f23279b.getBottom(), Dp.m5115constructorimpl(35), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$5$1$1$11$1$1", f = "HomeActivity.kt", i = {}, l = {1626}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class w extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23280a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ State<l3.o> f23281b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public w(State<? extends l3.o> state, j00.c<? super w> cVar) {
            super(2, cVar);
            this.f23281b = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new w(this.f23281b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((w) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l3.g2 b11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23280a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                l3.o P0 = HomeActivityKt.P0(this.f23281b);
                o.j jVar = P0 instanceof o.j ? (o.j) P0 : null;
                if (jVar != null && (b11 = jVar.b()) != null) {
                    this.f23280a = 1;
                    if (b11.a(this) == l11) {
                        return l11;
                    }
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
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$7$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n113#2:2635\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$7$1\n*L\n2233#1:2634\n2234#1:2635\n*E\n"})
    public static final class w0 implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23282a;

        public w0(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23282a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            float f11 = 10;
            VerticalAnchorable.m5588linkToVpY3zN4$default(constrainAs.getStart(), this.f23282a.getEnd(), Dp.m5115constructorimpl(f11), 0.0f, 4, null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), this.f23282a.getBottom(), Dp.m5115constructorimpl(f11), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$5$1$1$13$1", f = "HomeActivity.kt", i = {}, l = {1634}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class x extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23283a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ State<l3.o> f23284b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public x(State<? extends l3.o> state, j00.c<? super x> cVar) {
            super(2, cVar);
            this.f23284b = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new x(this.f23284b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((x) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l3.g2 a11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23283a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                l3.o P0 = HomeActivityKt.P0(this.f23284b);
                o.j jVar = P0 instanceof o.j ? (o.j) P0 : null;
                if (jVar != null && (a11 = jVar.a()) != null) {
                    this.f23283a = 1;
                    if (a11.a(this) == l11) {
                        return l11;
                    }
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
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$8$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2633:1\n113#2:2634\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$8$1\n*L\n2244#1:2634\n*E\n"})
    public static final class x0 implements x00.l<ConstrainScope, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ConstrainedLayoutReference f23285a;

        public x0(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f23285a = constrainedLayoutReference;
        }

        public final void a(ConstrainScope constrainAs) {
            kotlin.jvm.internal.g0.p(constrainAs, "$this$constrainAs");
            ConstrainScope.m5391linkTo8ZKsbrE$default(constrainAs, constrainAs.getParent().getStart(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 124, (Object) null);
            HorizontalAnchorable.m5491linkToVpY3zN4$default(constrainAs.getBottom(), this.f23285a.getTop(), Dp.m5115constructorimpl(15), 0.0f, 4, (Object) null);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ yz.g2 invoke(ConstrainScope constrainScope) {
            a(constrainScope);
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$5$1$1$14$1$1", f = "HomeActivity.kt", i = {}, l = {1647}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class y extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23286a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ State<l3.o> f23287b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public y(State<? extends l3.o> state, j00.c<? super y> cVar) {
            super(2, cVar);
            this.f23287b = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new y(this.f23287b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((y) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l3.g2 b11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23286a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                l3.o P0 = HomeActivityKt.P0(this.f23287b);
                o.h hVar = P0 instanceof o.h ? (o.h) P0 : null;
                if (hVar != null && (b11 = hVar.b()) != null) {
                    this.f23286a = 1;
                    if (b11.a(this) == l11) {
                        return l11;
                    }
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
    @kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$9$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2633:1\n113#2:2634\n113#2:2671\n113#2:2717\n87#3:2635\n85#3,8:2636\n94#3:2725\n79#4,6:2644\n86#4,3:2659\n89#4,2:2668\n79#4,6:2683\n86#4,3:2698\n89#4,2:2707\n93#4:2720\n93#4:2724\n347#5,9:2650\n356#5:2670\n347#5,9:2689\n356#5:2709\n357#5,2:2718\n357#5,2:2722\n4206#6,6:2662\n4206#6,6:2701\n70#7:2672\n66#7,10:2673\n77#7:2721\n1247#8,6:2710\n1#9:2716\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt$StreakPromptSheet$1$1$9$2\n*L\n2251#1:2634\n2252#1:2671\n2268#1:2717\n2251#1:2635\n2251#1:2636,8\n2251#1:2725\n2251#1:2644,6\n2251#1:2659,3\n2251#1:2668,2\n2254#1:2683,6\n2254#1:2698,3\n2254#1:2707,2\n2254#1:2720\n2251#1:2724\n2251#1:2650,9\n2251#1:2670\n2254#1:2689,9\n2254#1:2709\n2254#1:2718,2\n2251#1:2722,2\n2251#1:2662,6\n2254#1:2701,6\n2254#1:2672\n2254#1:2673,10\n2254#1:2721\n2255#1:2710,6\n*E\n"})
    public static final class y0 implements x00.p<Composer, Integer, yz.g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b8 f23288a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Density f23289b;

        public y0(b8 b8Var, Density density) {
            this.f23288a = b8Var;
            this.f23289b = density;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void a(Composer composer, int i11) {
            TextStyle m4604mergedA7vx0o;
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-617642222, i11, -1, "com.baicizhan.main.home.player.StreakPromptSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:2250)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(companion, Dp.m5115constructorimpl(8), Dp.m5115constructorimpl(6));
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(-16));
            b8 b8Var = this.f23288a;
            Density density = this.f23289b;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m607spacedBy0680j_4, companion2.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m727paddingVpY3zN4);
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            b8.a aVar = (b8.a) b8Var;
            ImageKt.Image(PainterResources_androidKt.painterResource(aVar.l(), composer, 0), "", SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(52)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextStyle(0L, TextUnitKt.getSp(18), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, bk.k.n(), (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645981, (kotlin.jvm.internal.v) null);
                composer.updateRememberedValue(rememberedValue);
            }
            TextStyle textStyle = (TextStyle) rememberedValue;
            String j11 = aVar.j();
            long Color = ColorKt.Color(4285026359L);
            m4604mergedA7vx0o = textStyle.m4604mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 256) != 0 ? null : null, (r60 & 512) != 0 ? null : null, (r60 & 1024) != 0 ? null : null, (r60 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 4096) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & 16384) != 0 ? null : new Stroke(density.mo377toPx0680j_4(Dp.m5115constructorimpl(3)), 0.0f, 0, StrokeJoin.Companion.m2874getRoundLxFBmk8(), null, 22, null), (r60 & 32768) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : 0, (r60 & 131072) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 262144) != 0 ? null : null, (r60 & 524288) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
            TextKt.m1845Text4IGK_g(j11, (Modifier) null, Color, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4604mergedA7vx0o, composer, 384, 0, 65530);
            TextKt.m1845Text4IGK_g(aVar.j(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4570copyNs73l9s$default(textStyle, Brush.Companion.m2458horizontalGradient8A3gB4$default(Brush.Companion, a00.h0.Q(Color.m2499boximpl(ColorKt.Color(4294964952L)), Color.m2499boximpl(ColorKt.Color(4294832544L))), 0.0f, 0.0f, 0, 14, (Object) null), 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            composer.endNode();
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
    @l00.d(c = "com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$1$1$1$5$1$1$16$1", f = "HomeActivity.kt", i = {}, l = {1655}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class z extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f23290a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ State<l3.o> f23291b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public z(State<? extends l3.o> state, j00.c<? super z> cVar) {
            super(2, cVar);
            this.f23291b = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new z(this.f23291b, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((z) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l3.g2 a11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f23290a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                l3.o P0 = HomeActivityKt.P0(this.f23291b);
                o.h hVar = P0 instanceof o.h ? (o.h) P0 : null;
                if (hVar != null && (a11 = hVar.a()) != null) {
                    this.f23290a = 1;
                    if (a11.a(this) == l11) {
                        return l11;
                    }
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
    public static final /* synthetic */ class z0 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23292a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f23293b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f23294c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f23295d;

        static {
            int[] iArr = new int[SettingBehavior.values().length];
            try {
                iArr[SettingBehavior.NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SettingBehavior.LEARNING_CONFIGURATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SettingBehavior.JAPANESE_SPELLING_CONFIGURATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SettingBehavior.FEEDBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SettingBehavior.RATE_US.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SettingBehavior.ABOUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SettingBehavior.MORE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f23292a = iArr;
            int[] iArr2 = new int[FastsTrainingType.values().length];
            try {
                iArr2[FastsTrainingType.SELF_TEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[FastsTrainingType.LISTENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f23293b = iArr2;
            int[] iArr3 = new int[ExtraTrainingType.values().length];
            try {
                iArr3[ExtraTrainingType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ExtraTrainingType.FM.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            f23294c = iArr3;
            int[] iArr4 = new int[StreakAwardType.values().length];
            try {
                iArr4[StreakAwardType.Coin.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[StreakAwardType.AvatarFrame.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[StreakAwardType.Skin.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[StreakAwardType.CardSlot.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            f23295d = iArr4;
        }
    }

    public static final yz.g2 A0(c40.r0 r0Var, MutableState mutableState, boolean z11) {
        c40.k.f(r0Var, null, null, new m(mutableState, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final DisposableEffectResult A1(SimpleCache simpleCache, ExoPlayer exoPlayer, DisposableEffectScope DisposableEffect) {
        kotlin.jvm.internal.g0.p(DisposableEffect, "$this$DisposableEffect");
        return new o0(simpleCache, exoPlayer);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 B0(MutableState mutableState, final c40.r0 r0Var, final ModalBottomSheetState modalBottomSheetState, ColumnScope ModalBottomSheetLayout, Composer composer, int i11) {
        b8 bVar;
        int i12;
        kotlin.jvm.internal.g0.p(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-364526743, i11, -1, "com.baicizhan.main.home.player.PlayerHome.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:1844)");
            }
            final l3.o oVar = (l3.o) mutableState.getValue();
            if (oVar instanceof o.v) {
                composer.startReplaceGroup(1877123994);
                o.v vVar = (o.v) oVar;
                if (vVar.p() >= vVar.r()) {
                    int r11 = vVar.r();
                    int q11 = vVar.q();
                    String o11 = vVar.o();
                    int i13 = z0.f23295d[vVar.m().ordinal()];
                    if (i13 == 1) {
                        i12 = R.drawable.ic_award_coin;
                    } else if (i13 == 2) {
                        i12 = R.drawable.ic_award_avatar_crown;
                    } else if (i13 == 3) {
                        i12 = R.drawable.ic_award_garment;
                    } else {
                        if (i13 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i12 = R.drawable.ic_award_vitality;
                    }
                    bVar = new b8.a(r11, q11, o11, i12, vVar.n());
                } else {
                    bVar = new b8.b(vVar.p(), vVar.r());
                }
                boolean changedInstance = composer.changedInstance(r0Var) | composer.changedInstance(modalBottomSheetState) | composer.changedInstance(oVar);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.h2
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 C0;
                            C0 = HomeActivityKt.C0(c40.r0.this, modalBottomSheetState, oVar);
                            return C0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                C1(bVar, (x00.a) rememberedValue, composer, 0);
                composer.endReplaceGroup();
            } else if (oVar instanceof o.x) {
                composer.startReplaceGroup(-1936679143);
                o.x xVar = (o.x) oVar;
                Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.player.i2
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 D0;
                            D0 = HomeActivityKt.D0();
                            return D0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                F1(xVar, (x00.a) rememberedValue2, composer, 48);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1936456873);
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

    public static final yz.g2 B1(Modifier modifier, String str, int i11, int i12, Composer composer, int i13) {
        w1(modifier, str, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 C0(c40.r0 r0Var, ModalBottomSheetState modalBottomSheetState, l3.o oVar) {
        c40.k.f(r0Var, null, null, new o(modalBottomSheetState, oVar, null), 3, null);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void C1(@m80.k final b8 streakInfo, @m80.k x00.a<yz.g2> aVar, @m80.l Composer composer, final int i11) {
        int i12;
        final b8 b8Var;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final MutableState mutableState;
        final x00.a<yz.g2> onDismiss = aVar;
        kotlin.jvm.internal.g0.p(streakInfo, "streakInfo");
        kotlin.jvm.internal.g0.p(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-1219418904);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(streakInfo) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1219418904, i13, -1, "com.baicizhan.main.home.player.StreakPromptSheet (HomeActivity.kt:2158)");
            }
            final Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 8;
            Modifier m686offsetVpY3zN4$default = OffsetKt.m686offsetVpY3zN4$default(SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(463)), 0.0f, Dp.m5115constructorimpl(f11), 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopEnd(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m686offsetVpY3zN4$default);
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
            float f12 = 24;
            Modifier border = BorderKt.border(BackgroundKt.background$default(SizeKt.fillMaxSize$default(PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(20), 0.0f, 0.0f, 13, null), 0.0f, 1, null), Brush.Companion.m2466verticalGradient8A3gB4$default(Brush.Companion, a00.h0.Q(Color.m2499boximpl(ColorKt.Color(4289736703L)), Color.m2499boximpl(ColorKt.Color(4290336511L))), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m1021RoundedCornerShapea9UjIt4$default(Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f12), 0.0f, 0.0f, 12, null), 0.0f, 4, null), BorderStrokeKt.m262BorderStrokecXLIe8U(Dp.m5115constructorimpl(f11), ColorKt.Color(4292785407L)), RoundedCornerShapeKt.m1021RoundedCornerShapea9UjIt4$default(Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f12), 0.0f, 0.0f, 12, null));
            startRestartGroup.startReplaceGroup(-1003410150);
            startRestartGroup.startReplaceGroup(212064437);
            startRestartGroup.endReplaceGroup();
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = new Measurer2(density2);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new ConstraintLayoutScope();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion3.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState2 = (MutableState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion3.getEmpty()) {
                rememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue4;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion3.getEmpty()) {
                rememberedValue5 = SnapshotStateKt.mutableStateOf(yz.g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue5;
            final int i14 = 257;
            boolean changedInstance = startRestartGroup.changedInstance(measurer2) | startRestartGroup.changed(257);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue6 == companion3.getEmpty()) {
                rememberedValue6 = new MeasurePolicy() { // from class: com.baicizhan.main.home.player.HomeActivityKt$StreakPromptSheet$lambda$0$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        MutableState.this.getValue();
                        long m5516performMeasureDjhGOtQ = measurer2.m5516performMeasureDjhGOtQ(j11, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i14);
                        mutableState2.getValue();
                        int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
                        int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$StreakPromptSheet$lambda$0$$inlined$ConstraintLayout$2.1
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
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState2;
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue6;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion3.getEmpty()) {
                rememberedValue7 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$StreakPromptSheet$lambda$0$$inlined$ConstraintLayout$3
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
            final x00.a aVar2 = (x00.a) rememberedValue7;
            boolean changedInstance2 = startRestartGroup.changedInstance(measurer2);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue8 == companion3.getEmpty()) {
                rememberedValue8 = new x00.l<SemanticsPropertyReceiver, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$StreakPromptSheet$lambda$0$$inlined$ConstraintLayout$4
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
            Modifier semantics$default = SemanticsModifierKt.semantics$default(border, false, (x00.l) rememberedValue8, 1, null);
            b8Var = streakInfo;
            LayoutKt.MultiMeasureLayout(semantics$default, ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$StreakPromptSheet$lambda$0$$inlined$ConstraintLayout$5
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
                public final void invoke(Composer composer2, int i15) {
                    TextStyle m4604mergedA7vx0o;
                    if ((i15 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    MutableState.this.setValue(yz.g2.f100423a);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer2.startReplaceGroup(2015764733);
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                    ConstrainedLayoutReference component1 = createRefs.component1();
                    ConstrainedLayoutReference component2 = createRefs.component2();
                    ConstrainedLayoutReference component3 = createRefs.component3();
                    ConstrainedLayoutReference component4 = createRefs.component4();
                    ConstrainedLayoutReference component5 = createRefs.component5();
                    ConstrainedLayoutReference component6 = createRefs.component6();
                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.bg_streak_sheet_sparkling, composer2, 6);
                    Modifier.Companion companion4 = Modifier.Companion;
                    Object rememberedValue9 = composer2.rememberedValue();
                    Composer.Companion companion5 = Composer.Companion;
                    if (rememberedValue9 == companion5.getEmpty()) {
                        rememberedValue9 = HomeActivityKt.p0.f23248a;
                        composer2.updateRememberedValue(rememberedValue9);
                    }
                    ImageKt.Image(painterResource, "sparkle", constraintLayoutScope2.constrainAs(companion4, component2, (x00.l) rememberedValue9), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.btn_streak_sheet_continue, composer2, 6);
                    Object rememberedValue10 = composer2.rememberedValue();
                    if (rememberedValue10 == companion5.getEmpty()) {
                        rememberedValue10 = HomeActivityKt.s0.f23260a;
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    Modifier constrainAs = constraintLayoutScope2.constrainAs(companion4, component1, (x00.l) rememberedValue10);
                    boolean changed = composer2.changed(onDismiss);
                    Object rememberedValue11 = composer2.rememberedValue();
                    if (changed || rememberedValue11 == companion5.getEmpty()) {
                        rememberedValue11 = new HomeActivityKt.t0(onDismiss);
                        composer2.updateRememberedValue(rememberedValue11);
                    }
                    ImageKt.Image(painterResource2, "streak-continue", ComposeUtilsKt.k(constrainAs, 0L, false, (x00.a) rememberedValue11, 3, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i16 = MaterialTheme.$stable;
                    TextStyle h42 = materialTheme.getTypography(composer2, i16).getH4();
                    Color.Companion companion6 = Color.Companion;
                    long m2546getWhite0d7_KjU = companion6.m2546getWhite0d7_KjU();
                    Object rememberedValue12 = composer2.rememberedValue();
                    if (rememberedValue12 == companion5.getEmpty()) {
                        rememberedValue12 = HomeActivityKt.u0.f23269a;
                        composer2.updateRememberedValue(rememberedValue12);
                    }
                    TextKt.m1845Text4IGK_g("不断电连续学习", constraintLayoutScope2.constrainAs(companion4, component3, (x00.l) rememberedValue12), m2546getWhite0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, h42, composer2, 390, 0, 65528);
                    boolean changed2 = composer2.changed(component2) | composer2.changed(component3);
                    Object rememberedValue13 = composer2.rememberedValue();
                    if (changed2 || rememberedValue13 == companion5.getEmpty()) {
                        rememberedValue13 = new HomeActivityKt.v0(component2, component3);
                        composer2.updateRememberedValue(rememberedValue13);
                    }
                    Modifier constrainAs2 = constraintLayoutScope2.constrainAs(companion4, component4, (x00.l) rememberedValue13);
                    Alignment.Companion companion7 = Alignment.Companion;
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getCenter(), false);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, constrainAs2);
                    ComposeUiNode.Companion companion8 = ComposeUiNode.Companion;
                    x00.a<ComposeUiNode> constructor2 = companion8.getConstructor();
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
                    Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy2, companion8.getSetMeasurePolicy());
                    Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion8.getSetResolvedCompositionLocals());
                    x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion8.getSetCompositeKeyHash();
                    if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion8.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    Object rememberedValue14 = composer2.rememberedValue();
                    if (rememberedValue14 == companion5.getEmpty()) {
                        rememberedValue14 = new TextStyle(0L, TextUnitKt.getSp(82), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, bk.k.n(), (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(0), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645981, (kotlin.jvm.internal.v) null);
                        composer2.updateRememberedValue(rememberedValue14);
                    }
                    TextStyle textStyle = (TextStyle) rememberedValue14;
                    String valueOf = String.valueOf(streakInfo.a());
                    long m2546getWhite0d7_KjU2 = companion6.m2546getWhite0d7_KjU();
                    float f13 = 8;
                    m4604mergedA7vx0o = textStyle.m4604mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 256) != 0 ? null : null, (r60 & 512) != 0 ? null : null, (r60 & 1024) != 0 ? null : null, (r60 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 4096) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & 16384) != 0 ? null : new Stroke(density.mo377toPx0680j_4(Dp.m5115constructorimpl(f13)), 0.0f, 0, StrokeJoin.Companion.m2874getRoundLxFBmk8(), null, 22, null), (r60 & 32768) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : 0, (r60 & 131072) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 262144) != 0 ? null : null, (r60 & 524288) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
                    TextKt.m1845Text4IGK_g(valueOf, (Modifier) null, m2546getWhite0d7_KjU2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4604mergedA7vx0o, composer2, 384, 0, 65530);
                    TextKt.m1845Text4IGK_g(String.valueOf(streakInfo.a()), (Modifier) null, ColorKt.Color(4290398719L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, textStyle, composer2, 384, 1572864, 65530);
                    composer2.endNode();
                    long m2546getWhite0d7_KjU3 = companion6.m2546getWhite0d7_KjU();
                    TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer2, i16).getH4(), 0L, TextUnitKt.getSp(22), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(0), null, null, null, 0, 0, null, 16646141, null);
                    boolean changed3 = composer2.changed(component4);
                    Object rememberedValue15 = composer2.rememberedValue();
                    if (changed3 || rememberedValue15 == companion5.getEmpty()) {
                        rememberedValue15 = new HomeActivityKt.w0(component4);
                        composer2.updateRememberedValue(rememberedValue15);
                    }
                    TextKt.m1845Text4IGK_g("天", constraintLayoutScope2.constrainAs(companion4, component5, (x00.l) rememberedValue15), m2546getWhite0d7_KjU3, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4572copyp1EtxEg$default, composer2, 390, 0, 65528);
                    Composer composer3 = composer2;
                    b8 b8Var2 = streakInfo;
                    if (b8Var2 instanceof b8.a) {
                        composer3.startReplaceGroup(2018363927);
                        boolean changed4 = composer3.changed(component1);
                        Object rememberedValue16 = composer3.rememberedValue();
                        if (changed4 || rememberedValue16 == companion5.getEmpty()) {
                            rememberedValue16 = new HomeActivityKt.x0(component1);
                            composer3.updateRememberedValue(rememberedValue16);
                        }
                        Modifier constrainAs3 = constraintLayoutScope2.constrainAs(companion4, component6, (x00.l) rememberedValue16);
                        Alignment.Horizontal centerHorizontally = companion7.getCenterHorizontally();
                        Arrangement arrangement = Arrangement.INSTANCE;
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f13)), centerHorizontally, composer3, 54);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, constrainAs3);
                        x00.a<ComposeUiNode> constructor3 = companion8.getConstructor();
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
                        Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy, companion8.getSetMeasurePolicy());
                        Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                        x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                        if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion8.getSetModifier());
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion7.getTop(), composer3, 0);
                        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, companion4);
                        x00.a<ComposeUiNode> constructor4 = companion8.getConstructor();
                        if (composer3.getApplier() == null) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer3);
                        Updater.m1958setimpl(m1951constructorimpl4, rowMeasurePolicy, companion8.getSetMeasurePolicy());
                        Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion8.getSetResolvedCompositionLocals());
                        x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion8.getSetCompositeKeyHash();
                        if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                            m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                            m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion8.getSetModifier());
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        TextKt.m1845Text4IGK_g("获得奖励: ", (Modifier) null, companion6.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, materialTheme.getTypography(composer3, i16).getSubtitle2(), composer2, 390, 0, 65530);
                        TextKt.m1845Text4IGK_g(((b8.a) streakInfo).k(), (Modifier) null, ColorKt.Color(4294952729L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, materialTheme.getTypography(composer2, i16).getSubtitle2(), composer2, 384, 0, 65530);
                        composer2.endNode();
                        SurfaceKt.m1784SurfaceFjzlyU(null, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(12)), Color.m2508copywmQWz5c$default(companion6.m2535getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-617642222, true, new HomeActivityKt.y0(streakInfo, density), composer2, 54), composer2, 1573248, 57);
                        TextKt.m1845Text4IGK_g("连续学习 " + ((b8.a) streakInfo).i() + " 天，你将解锁更多奖励", (Modifier) null, Color.m2508copywmQWz5c$default(companion6.m2546getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, new TextStyle(0L, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, bk.k.l(), (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(12), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645981, (kotlin.jvm.internal.v) null), composer2, 384, 0, 65530);
                        composer3 = composer2;
                        composer3.endNode();
                        composer3.endReplaceGroup();
                    } else {
                        if (b8Var2 instanceof b8.b) {
                            composer3.startReplaceGroup(2021152625);
                            long m2508copywmQWz5c$default = Color.m2508copywmQWz5c$default(companion6.m2535getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                            RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(12));
                            boolean changed5 = composer3.changed(component1);
                            Object rememberedValue17 = composer3.rememberedValue();
                            if (changed5 || rememberedValue17 == companion5.getEmpty()) {
                                rememberedValue17 = new HomeActivityKt.q0(component1);
                                composer3.updateRememberedValue(rememberedValue17);
                            }
                            SurfaceKt.m1784SurfaceFjzlyU(constraintLayoutScope2.constrainAs(companion4, component6, (x00.l) rememberedValue17), m1019RoundedCornerShape0680j_4, m2508copywmQWz5c$default, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(10919749, true, new HomeActivityKt.r0(streakInfo), composer3, 54), composer2, 1573248, 56);
                            composer3 = composer2;
                        } else {
                            composer3.startReplaceGroup(1896525309);
                        }
                        composer3.endReplaceGroup();
                    }
                    composer3.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(aVar2, composer3, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), measurePolicy, startRestartGroup, 48, 0);
            startRestartGroup.endReplaceGroup();
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_home_prompt_close, startRestartGroup, 6);
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5115constructorimpl(6), 0.0f, 11, null);
            boolean z11 = (i13 & 112) == 32;
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue9 == companion3.getEmpty()) {
                rememberedValue9 = new x00.a() { // from class: com.baicizhan.main.home.player.w3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 D1;
                        D1 = HomeActivityKt.D1(x00.a.this);
                        return D1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            onDismiss = aVar;
            ImageKt.Image(painterResource, "prompt-close", ComposeUtilsKt.k(m730paddingqDBjuR0$default, 0L, false, (x00.a) rememberedValue9, 3, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            b8Var = streakInfo;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.x3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 E1;
                    E1 = HomeActivityKt.E1(b8.this, onDismiss, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return E1;
                }
            });
        }
    }

    public static final yz.g2 D0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 D1(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 E0(final ModalBottomSheetState modalBottomSheetState, final c40.r0 r0Var, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1685657054, i11, -1, "com.baicizhan.main.home.player.PlayerHome.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:1896)");
            }
            boolean isVisible = modalBottomSheetState.isVisible();
            boolean changedInstance = composer.changedInstance(r0Var) | composer.changedInstance(modalBottomSheetState);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.c4
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 F0;
                        F0 = HomeActivityKt.F0(c40.r0.this, modalBottomSheetState);
                        return F0;
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

    public static final yz.g2 E1(b8 b8Var, x00.a aVar, int i11, Composer composer, int i12) {
        C1(b8Var, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final yz.g2 F0(c40.r0 r0Var, ModalBottomSheetState modalBottomSheetState) {
        c40.k.f(r0Var, null, null, new p(modalBottomSheetState, null), 3, null);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void F1(@m80.k final o.x effect, @m80.k final x00.a<yz.g2> onDismiss, @m80.l Composer composer, final int i11) {
        boolean z11;
        Object obj;
        final MutableState mutableState;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final MutableState mutableState2;
        kotlin.jvm.internal.g0.p(effect, "effect");
        kotlin.jvm.internal.g0.p(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-363813033);
        int i12 = (i11 & 6) == 0 ? (startRestartGroup.changedInstance(effect) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-363813033, i13, -1, "com.baicizhan.main.home.player.TaskPromptSheet (HomeActivity.kt:2355)");
            }
            List<l3.c0> j11 = effect.j();
            if (!(j11 instanceof Collection) || !j11.isEmpty()) {
                for (l3.c0 c0Var : j11) {
                    if (c0Var.h() >= c0Var.l()) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 8;
            Modifier m686offsetVpY3zN4$default = OffsetKt.m686offsetVpY3zN4$default(SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(463)), 0.0f, Dp.m5115constructorimpl(f11), 1, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopEnd(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m686offsetVpY3zN4$default);
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
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(20), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
            Brush m2466verticalGradient8A3gB4$default = z11 ? Brush.Companion.m2466verticalGradient8A3gB4$default(Brush.Companion, a00.h0.Q(Color.m2499boximpl(ColorKt.Color(4294928679L)), Color.m2499boximpl(ColorKt.Color(4294947076L))), 0.0f, 0.0f, 0, 14, (Object) null) : new SolidColor(ColorKt.Color(4294947076L), null);
            float f12 = 24;
            Modifier border = BorderKt.border(BackgroundKt.background$default(fillMaxSize$default, m2466verticalGradient8A3gB4$default, RoundedCornerShapeKt.m1021RoundedCornerShapea9UjIt4$default(Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f12), 0.0f, 0.0f, 12, null), 0.0f, 4, null), BorderStrokeKt.m262BorderStrokecXLIe8U(Dp.m5115constructorimpl(f11), ColorKt.Color(4294965467L)), RoundedCornerShapeKt.m1021RoundedCornerShapea9UjIt4$default(Dp.m5115constructorimpl(f12), Dp.m5115constructorimpl(f12), 0.0f, 0.0f, 12, null));
            startRestartGroup.startReplaceGroup(-1003410150);
            startRestartGroup.startReplaceGroup(212064437);
            startRestartGroup.endReplaceGroup();
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = new Measurer2(density);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new ConstraintLayoutScope();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion3.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState3 = (MutableState) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == companion3.getEmpty()) {
                rememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue4;
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == companion3.getEmpty()) {
                rememberedValue5 = SnapshotStateKt.mutableStateOf(yz.g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            final MutableState mutableState4 = (MutableState) rememberedValue5;
            final int i14 = 257;
            boolean changedInstance = startRestartGroup.changedInstance(measurer2) | startRestartGroup.changed(257);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue6 == companion3.getEmpty()) {
                obj = new MeasurePolicy() { // from class: com.baicizhan.main.home.player.HomeActivityKt$TaskPromptSheet$lambda$1$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j12) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        MutableState.this.getValue();
                        long m5516performMeasureDjhGOtQ = measurer2.m5516performMeasureDjhGOtQ(j12, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i14);
                        mutableState3.getValue();
                        int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
                        int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$TaskPromptSheet$lambda$1$$inlined$ConstraintLayout$2.1
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
                mutableState = mutableState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState2 = mutableState3;
                startRestartGroup.updateRememberedValue(obj);
            } else {
                obj = rememberedValue6;
                mutableState = mutableState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState2 = mutableState3;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) obj;
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == companion3.getEmpty()) {
                rememberedValue7 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$TaskPromptSheet$lambda$1$$inlined$ConstraintLayout$3
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
            if (changedInstance2 || rememberedValue8 == companion3.getEmpty()) {
                rememberedValue8 = new x00.l<SemanticsPropertyReceiver, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$TaskPromptSheet$lambda$1$$inlined$ConstraintLayout$4
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(border, false, (x00.l) rememberedValue8, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$TaskPromptSheet$lambda$1$$inlined$ConstraintLayout$5
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
                public final void invoke(Composer composer2, int i15) {
                    if ((i15 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    MutableState.this.setValue(yz.g2.f100423a);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer2.startReplaceGroup(-324821349);
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                    createRefs.component1();
                    createRefs.component2();
                    createRefs.component3();
                    createRefs.component4();
                    createRefs.component5();
                    createRefs.component6();
                    composer2.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(aVar, composer2, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), measurePolicy, startRestartGroup, 48, 0);
            startRestartGroup.endReplaceGroup();
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_home_prompt_close, startRestartGroup, 6);
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5115constructorimpl(6), 0.0f, 11, null);
            boolean z12 = (i13 & 112) == 32;
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue9 == companion3.getEmpty()) {
                rememberedValue9 = new x00.a() { // from class: com.baicizhan.main.home.player.t3
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 G1;
                        G1 = HomeActivityKt.G1(x00.a.this);
                        return G1;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            ImageKt.Image(painterResource, "prompt-close", ComposeUtilsKt.k(m730paddingqDBjuR0$default, 0L, false, (x00.a) rememberedValue9, 3, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.u3
                @Override // x00.p
                public final Object invoke(Object obj2, Object obj3) {
                    yz.g2 H1;
                    H1 = HomeActivityKt.H1(o.x.this, onDismiss, i11, (Composer) obj2, ((Integer) obj3).intValue());
                    return H1;
                }
            });
        }
    }

    public static final yz.g2 G0() {
        qb.c.q("HomeActivity_Player", "no response when building...", new Object[0]);
        return yz.g2.f100423a;
    }

    public static final yz.g2 G1(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final ExitTransition H0(AnimatedContentTransitionScope NavHost) {
        kotlin.jvm.internal.g0.p(NavHost, "$this$NavHost");
        return ExitTransition.Companion.getNone();
    }

    public static final yz.g2 H1(o.x xVar, x00.a aVar, int i11, Composer composer, int i12) {
        F1(xVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    public static final EnterTransition I0(AnimatedContentTransitionScope NavHost) {
        kotlin.jvm.internal.g0.p(NavHost, "$this$NavHost");
        return EnterTransition.Companion.getNone();
    }

    public static final ExitTransition J0(AnimatedContentTransitionScope NavHost) {
        kotlin.jvm.internal.g0.p(NavHost, "$this$NavHost");
        return ExitTransition.Companion.getNone();
    }

    public static final yz.g2 K0(String str, Map map, final wg.q qVar, final HomeMode homeMode, final AppCompatActivity appCompatActivity, final tg.a aVar, final Context context, final c40.r0 r0Var, final MutableState mutableState, NavGraphBuilder NavHost) {
        kotlin.jvm.internal.g0.p(NavHost, "$this$NavHost");
        NavGraphBuilderKt.composable$default(NavHost, str, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-1831285154, true, new x00.r() { // from class: com.baicizhan.main.home.player.p3
            @Override // x00.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                yz.g2 L0;
                L0 = HomeActivityKt.L0(wg.q.this, homeMode, appCompatActivity, aVar, context, r0Var, mutableState, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                return L0;
            }
        }), 254, null);
        NavGraphBuilderKt.composable$default(NavHost, f23136b.get(2).h(), null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1724418901, true, new x00.r() { // from class: com.baicizhan.main.home.player.q3
            @Override // x00.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                yz.g2 j12;
                j12 = HomeActivityKt.j1(AppCompatActivity.this, aVar, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                return j12;
            }
        }), 254, null);
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            final x00.l lVar = (x00.l) entry.getValue();
            NavGraphBuilderKt.composable$default(NavHost, str2, null, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(-495554247, true, new x00.r() { // from class: com.baicizhan.main.home.player.r3
                @Override // x00.r
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    yz.g2 l12;
                    l12 = HomeActivityKt.l1(x00.l.this, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                    return l12;
                }
            }), 254, null);
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 L0(wg.q qVar, final HomeMode homeMode, final AppCompatActivity appCompatActivity, final tg.a aVar, final Context context, c40.r0 r0Var, MutableState mutableState, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i11) {
        final State state;
        Composer composer2;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        final State state2;
        final wg.q qVar2;
        final MutableState mutableState6;
        String str;
        String str2;
        final tg.a aVar2;
        final c40.r0 r0Var2;
        final State state3;
        Object obj;
        j00.c cVar;
        int i12;
        final MutableState mutableState7;
        final MutableState mutableState8;
        Composer composer3;
        int i13;
        Object mutableStateOf$default;
        State state4;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final MutableState mutableState9;
        k3.q4 d11;
        l3.e0 n11;
        kotlin.jvm.internal.g0.p(composable, "$this$composable");
        kotlin.jvm.internal.g0.p(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1831285154, i11, -1, "com.baicizhan.main.home.player.PlayerHome.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:563)");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState10 = (MutableState) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState11 = (MutableState) rememberedValue2;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        final MutableState mutableState12 = (MutableState) rememberedValue3;
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue4);
        }
        final MutableState mutableState13 = (MutableState) rememberedValue4;
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue5);
        }
        final MutableState mutableState14 = (MutableState) rememberedValue5;
        Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue6);
        }
        final MutableState mutableState15 = (MutableState) rememberedValue6;
        Object rememberedValue7 = composer.rememberedValue();
        if (rememberedValue7 == companion.getEmpty()) {
            rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue7);
        }
        final MutableState mutableState16 = (MutableState) rememberedValue7;
        Object rememberedValue8 = composer.rememberedValue();
        if (rememberedValue8 == companion.getEmpty()) {
            rememberedValue8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue8);
        }
        MutableState mutableState17 = (MutableState) rememberedValue8;
        Object rememberedValue9 = composer.rememberedValue();
        if (rememberedValue9 == companion.getEmpty()) {
            rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState18 = (MutableState) rememberedValue9;
        Object rememberedValue10 = composer.rememberedValue();
        if (rememberedValue10 == companion.getEmpty()) {
            rememberedValue10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue10);
        }
        MutableState mutableState19 = (MutableState) rememberedValue10;
        Object rememberedValue11 = composer.rememberedValue();
        if (rememberedValue11 == companion.getEmpty()) {
            rememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(f23139e, null, 2, null);
            composer.updateRememberedValue(rememberedValue11);
        }
        final MutableState mutableState20 = (MutableState) rememberedValue11;
        Object rememberedValue12 = composer.rememberedValue();
        if (rememberedValue12 == companion.getEmpty()) {
            rememberedValue12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(f23139e, null, 2, null);
            composer.updateRememberedValue(rememberedValue12);
        }
        final MutableState mutableState21 = (MutableState) rememberedValue12;
        Object rememberedValue13 = composer.rememberedValue();
        if (rememberedValue13 == companion.getEmpty()) {
            rememberedValue13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue13);
        }
        final MutableState mutableState22 = (MutableState) rememberedValue13;
        Object rememberedValue14 = composer.rememberedValue();
        if (rememberedValue14 == companion.getEmpty()) {
            rememberedValue14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue14);
        }
        Object rememberedValue15 = composer.rememberedValue();
        if (rememberedValue15 == companion.getEmpty()) {
            rememberedValue15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue15);
        }
        final MutableState mutableState23 = (MutableState) rememberedValue15;
        Object rememberedValue16 = composer.rememberedValue();
        if (rememberedValue16 == companion.getEmpty()) {
            rememberedValue16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue16);
        }
        final MutableState mutableState24 = (MutableState) rememberedValue16;
        State collectAsState = SnapshotStateKt.collectAsState(qVar.K(), null, composer, 0, 1);
        State collectAsState2 = SnapshotStateKt.collectAsState(qVar.A(), null, null, composer, 48, 2);
        SnapshotStateKt.collectAsState(qVar.L(), null, composer, 0, 1);
        Object rememberedValue17 = composer.rememberedValue();
        if (rememberedValue17 == companion.getEmpty()) {
            rememberedValue17 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(rememberedValue17);
        }
        final MutableState mutableState25 = (MutableState) rememberedValue17;
        if (homeMode == HomeMode.WORDS && (O0(collectAsState) instanceof o4.a)) {
            composer.startReplaceGroup(-1137337795);
            k3.o4 O0 = O0(collectAsState);
            o4.a aVar3 = O0 instanceof o4.a ? (o4.a) O0 : null;
            boolean changed = composer.changed((aVar3 == null || (d11 = aVar3.d()) == null || (n11 = d11.n()) == null) ? null : Long.valueOf(n11.l()));
            Object rememberedValue18 = composer.rememberedValue();
            if (changed || rememberedValue18 == companion.getEmpty()) {
                i13 = 2;
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(yz.h1.a(0L, 0), null, 2, null);
                composer.updateRememberedValue(mutableStateOf$default);
            } else {
                mutableStateOf$default = rememberedValue18;
                i13 = 2;
            }
            final MutableState mutableState26 = (MutableState) mutableStateOf$default;
            Object rememberedValue19 = composer.rememberedValue();
            if (rememberedValue19 == companion.getEmpty()) {
                rememberedValue19 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(yz.h1.a(0L, 0), null, i13, null);
                composer.updateRememberedValue(rememberedValue19);
            }
            final MutableState mutableState27 = (MutableState) rememberedValue19;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
            composer.startReplaceGroup(-1003410150);
            composer.startReplaceGroup(212064437);
            composer.endReplaceGroup();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Object rememberedValue20 = composer.rememberedValue();
            if (rememberedValue20 == companion.getEmpty()) {
                rememberedValue20 = new Measurer2(density);
                composer.updateRememberedValue(rememberedValue20);
            }
            final Measurer2 measurer2 = (Measurer2) rememberedValue20;
            Object rememberedValue21 = composer.rememberedValue();
            if (rememberedValue21 == companion.getEmpty()) {
                rememberedValue21 = new ConstraintLayoutScope();
                composer.updateRememberedValue(rememberedValue21);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) rememberedValue21;
            Object rememberedValue22 = composer.rememberedValue();
            if (rememberedValue22 == companion.getEmpty()) {
                state4 = collectAsState2;
                rememberedValue22 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(rememberedValue22);
            } else {
                state4 = collectAsState2;
            }
            final MutableState mutableState28 = (MutableState) rememberedValue22;
            Object rememberedValue23 = composer.rememberedValue();
            if (rememberedValue23 == companion.getEmpty()) {
                rememberedValue23 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composer.updateRememberedValue(rememberedValue23);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue23;
            Object rememberedValue24 = composer.rememberedValue();
            if (rememberedValue24 == companion.getEmpty()) {
                rememberedValue24 = SnapshotStateKt.mutableStateOf(yz.g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue24);
            }
            final MutableState mutableState29 = (MutableState) rememberedValue24;
            final int i14 = 257;
            boolean changedInstance = composer.changedInstance(measurer2) | composer.changed(257);
            Object rememberedValue25 = composer.rememberedValue();
            if (changedInstance || rememberedValue25 == companion.getEmpty()) {
                rememberedValue25 = new MeasurePolicy() { // from class: com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$lambda$2$0$7$5$0$0$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        MutableState.this.getValue();
                        long m5516performMeasureDjhGOtQ = measurer2.m5516performMeasureDjhGOtQ(j11, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i14);
                        mutableState28.getValue();
                        int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
                        int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$lambda$2$0$7$5$0$0$$inlined$ConstraintLayout$2.1
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
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState9 = mutableState28;
                composer.updateRememberedValue(rememberedValue25);
            } else {
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState9 = mutableState28;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue25;
            Object rememberedValue26 = composer.rememberedValue();
            if (rememberedValue26 == companion.getEmpty()) {
                rememberedValue26 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$lambda$2$0$7$5$0$0$$inlined$ConstraintLayout$3
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
                composer.updateRememberedValue(rememberedValue26);
            }
            final x00.a aVar4 = (x00.a) rememberedValue26;
            boolean changedInstance2 = composer.changedInstance(measurer2);
            Object rememberedValue27 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue27 == companion.getEmpty()) {
                rememberedValue27 = new x00.l<SemanticsPropertyReceiver, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$lambda$2$0$7$5$0$0$$inlined$ConstraintLayout$4
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
                composer.updateRememberedValue(rememberedValue27);
            }
            mutableState5 = mutableState19;
            mutableState3 = mutableState11;
            mutableState4 = mutableState18;
            state2 = collectAsState;
            state = state4;
            mutableState2 = mutableState10;
            qVar2 = qVar;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (x00.l) rememberedValue27, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$lambda$2$0$7$5$0$0$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer4, Integer num) {
                    invoke(composer4, num.intValue());
                    return yz.g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(Composer composer4, int i15) {
                    Modifier modifier;
                    g.b bVar;
                    Pair pair;
                    if ((i15 & 3) == 2 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i15, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    MutableState.this.setValue(yz.g2.f100423a);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer4.startReplaceGroup(570034298);
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                    createRefs.component1();
                    createRefs.component2();
                    ConstrainedLayoutReference component3 = createRefs.component3();
                    createRefs.component4();
                    createRefs.component5();
                    createRefs.component6();
                    createRefs.component7();
                    createRefs.component8();
                    createRefs.component9();
                    createRefs.component10();
                    createRefs.component11();
                    createRefs.component12();
                    createRefs.component13();
                    createRefs.component14();
                    createRefs.component15();
                    createRefs.component16();
                    Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.Companion), Dp.m5115constructorimpl(56));
                    Object rememberedValue28 = composer4.rememberedValue();
                    Composer.Companion companion2 = Composer.Companion;
                    if (rememberedValue28 == companion2.getEmpty()) {
                        rememberedValue28 = HomeActivityKt.r.f23253a;
                        composer4.updateRememberedValue(rememberedValue28);
                    }
                    Modifier constrainAs = constraintLayoutScope2.constrainAs(m759height3ABfNKs, component3, (x00.l) rememberedValue28);
                    k3.o4 O02 = HomeActivityKt.O0(state2);
                    kotlin.jvm.internal.g0.n(O02, "null cannot be cast to non-null type com.baicizhan.app.api.service.WordsHomeState.Content");
                    String k11 = ((o4.a) O02).d().n().k();
                    g.b bVar2 = new g.b(0L);
                    Pair pair2 = (Pair) mutableState26.getValue();
                    Pair pair3 = (Pair) mutableState27.getValue();
                    HomeMode homeMode2 = homeMode;
                    if (homeMode2 == null) {
                        homeMode2 = HomeMode.WORDS;
                    }
                    MutableState mutableState30 = mutableState22;
                    MutableState mutableState31 = mutableState23;
                    MutableState mutableState32 = mutableState24;
                    boolean changed2 = composer4.changed(state) | composer4.changedInstance(constraintLayoutScope2);
                    Object rememberedValue29 = composer4.rememberedValue();
                    if (changed2 || rememberedValue29 == companion2.getEmpty()) {
                        modifier = constrainAs;
                        bVar = bVar2;
                        rememberedValue29 = new HomeActivityKt.s(mutableState25, constraintLayoutScope2, mutableState21, state);
                        composer4.updateRememberedValue(rememberedValue29);
                    } else {
                        modifier = constrainAs;
                        bVar = bVar2;
                    }
                    x00.a aVar5 = (x00.a) rememberedValue29;
                    boolean changed3 = composer4.changed(state) | composer4.changedInstance(constraintLayoutScope2);
                    Object rememberedValue30 = composer4.rememberedValue();
                    if (changed3 || rememberedValue30 == companion2.getEmpty()) {
                        pair = pair2;
                        rememberedValue30 = new HomeActivityKt.t(mutableState25, constraintLayoutScope2, mutableState20, state);
                        composer4.updateRememberedValue(rememberedValue30);
                    } else {
                        pair = pair2;
                    }
                    x00.a aVar6 = (x00.a) rememberedValue30;
                    boolean changed4 = composer4.changed(state) | composer4.changedInstance(constraintLayoutScope2);
                    Object rememberedValue31 = composer4.rememberedValue();
                    if (changed4 || rememberedValue31 == companion2.getEmpty()) {
                        rememberedValue31 = new HomeActivityKt.u(mutableState25, constraintLayoutScope2, state);
                        composer4.updateRememberedValue(rememberedValue31);
                    }
                    x00.a aVar7 = (x00.a) rememberedValue31;
                    boolean changedInstance3 = composer4.changedInstance(qVar2);
                    HomeMode homeMode3 = homeMode;
                    boolean changed5 = changedInstance3 | composer4.changed(homeMode3 == null ? -1 : homeMode3.ordinal());
                    Object rememberedValue32 = composer4.rememberedValue();
                    if (changed5 || rememberedValue32 == companion2.getEmpty()) {
                        rememberedValue32 = new HomeActivityKt.v(qVar2, mutableState15, mutableState14, homeMode, mutableState12, mutableState13, mutableState16);
                        composer4.updateRememberedValue(rememberedValue32);
                    }
                    TopStatusKt.F(modifier, k11, bVar, pair, pair3, homeMode2, mutableState30, mutableState31, mutableState32, aVar5, aVar6, aVar7, null, (x00.l) rememberedValue32, composer4, 114819072, 0, 4096);
                    composer4.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(aVar4, composer4, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), measurePolicy, composer, 48, 0);
            composer2 = composer;
            composer2.endReplaceGroup();
            composer2.endReplaceGroup();
        } else {
            state = collectAsState2;
            composer2 = composer;
            mutableState2 = mutableState10;
            mutableState3 = mutableState11;
            mutableState4 = mutableState18;
            mutableState5 = mutableState19;
            state2 = collectAsState;
            qVar2 = qVar;
            composer2.startReplaceGroup(-1167037500);
            composer2.endReplaceGroup();
        }
        ActivityResultContracts.StartActivityForResult startActivityForResult = new ActivityResultContracts.StartActivityForResult();
        boolean changedInstance3 = composer2.changedInstance(appCompatActivity);
        Object rememberedValue28 = composer2.rememberedValue();
        if (changedInstance3 || rememberedValue28 == companion.getEmpty()) {
            rememberedValue28 = new x00.l() { // from class: com.baicizhan.main.home.player.l2
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 R0;
                    R0 = HomeActivityKt.R0(AppCompatActivity.this, (ActivityResult) obj2);
                    return R0;
                }
            };
            composer2.updateRememberedValue(rememberedValue28);
        }
        final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(startActivityForResult, (x00.l) rememberedValue28, composer2, 0);
        boolean booleanValue = qVar2.I().getValue().booleanValue();
        boolean booleanValue2 = qVar2.J().getValue().booleanValue();
        boolean changedInstance4 = composer2.changedInstance(qVar2);
        Object rememberedValue29 = composer2.rememberedValue();
        if (changedInstance4 || rememberedValue29 == companion.getEmpty()) {
            rememberedValue29 = new x00.l() { // from class: com.baicizhan.main.home.player.t2
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 S0;
                    S0 = HomeActivityKt.S0(wg.q.this, ((Boolean) obj2).booleanValue());
                    return S0;
                }
            };
            composer2.updateRememberedValue(rememberedValue29);
        }
        x00.l lVar = (x00.l) rememberedValue29;
        boolean changedInstance5 = composer2.changedInstance(qVar2);
        Object rememberedValue30 = composer2.rememberedValue();
        if (changedInstance5 || rememberedValue30 == companion.getEmpty()) {
            rememberedValue30 = new x00.l() { // from class: com.baicizhan.main.home.player.u2
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    yz.g2 T0;
                    T0 = HomeActivityKt.T0(wg.q.this, ((Boolean) obj2).booleanValue());
                    return T0;
                }
            };
            composer2.updateRememberedValue(rememberedValue30);
        }
        x00.l lVar2 = (x00.l) rememberedValue30;
        boolean changedInstance6 = composer2.changedInstance(aVar) | composer2.changedInstance(qVar2) | composer2.changedInstance(rememberLauncherForActivityResult) | composer2.changedInstance(appCompatActivity);
        Object rememberedValue31 = composer2.rememberedValue();
        if (changedInstance6 || rememberedValue31 == companion.getEmpty()) {
            final wg.q qVar3 = qVar2;
            mutableState6 = mutableState17;
            Object obj2 = new x00.l() { // from class: com.baicizhan.main.home.player.v2
                @Override // x00.l
                public final Object invoke(Object obj3) {
                    yz.g2 U0;
                    U0 = HomeActivityKt.U0(tg.a.this, qVar3, mutableState6, rememberLauncherForActivityResult, appCompatActivity, (SettingBehavior) obj3);
                    return U0;
                }
            };
            composer2.updateRememberedValue(obj2);
            rememberedValue31 = obj2;
        } else {
            mutableState6 = mutableState17;
        }
        MutableState mutableState30 = mutableState6;
        com.baicizhan.main.home.player.settings.y.D(mutableState16, booleanValue, booleanValue2, lVar, lVar2, (x00.l) rememberedValue31, composer2, 6);
        Composer composer4 = composer2;
        ug.f value = qVar2.R().getValue();
        if (value == null || (str = value.g()) == null) {
            str = "";
        }
        ug.f value2 = qVar2.R().getValue();
        if (value2 == null || (str2 = value2.j()) == null) {
            str2 = HttpRequest.f17578o;
        }
        ug.f value3 = qVar2.R().getValue();
        int h11 = value3 != null ? value3.h() : 0;
        ug.f value4 = qVar2.R().getValue();
        String available = Standard_extKt.getAvailable(ee.m.c(value4 != null ? value4.i() : 0, context));
        if (available == null) {
            available = "填写年级";
        }
        int intValue = qVar2.P().getValue().intValue();
        int intValue2 = qVar2.M().getValue().intValue();
        int intValue3 = qVar2.Q().getValue().intValue();
        int intValue4 = qVar2.N().getValue().intValue();
        int intValue5 = qVar2.O().getValue().intValue();
        boolean changedInstance7 = composer4.changedInstance(aVar);
        Object rememberedValue32 = composer4.rememberedValue();
        if (changedInstance7 || rememberedValue32 == companion.getEmpty()) {
            rememberedValue32 = new x00.a() { // from class: com.baicizhan.main.home.player.w2
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 V0;
                    V0 = HomeActivityKt.V0(tg.a.this);
                    return V0;
                }
            };
            composer4.updateRememberedValue(rememberedValue32);
        }
        x00.a aVar5 = (x00.a) rememberedValue32;
        boolean changedInstance8 = composer4.changedInstance(qVar2) | composer4.changedInstance(context);
        String str3 = str;
        Object rememberedValue33 = composer4.rememberedValue();
        if (changedInstance8 || rememberedValue33 == companion.getEmpty()) {
            rememberedValue33 = new x00.l() { // from class: com.baicizhan.main.home.player.x2
                @Override // x00.l
                public final Object invoke(Object obj3) {
                    yz.g2 W0;
                    W0 = HomeActivityKt.W0(wg.q.this, context, ((Integer) obj3).intValue());
                    return W0;
                }
            };
            composer4.updateRememberedValue(rememberedValue33);
        }
        x00.l lVar3 = (x00.l) rememberedValue33;
        boolean changedInstance9 = composer4.changedInstance(aVar);
        Object rememberedValue34 = composer4.rememberedValue();
        if (changedInstance9 || rememberedValue34 == companion.getEmpty()) {
            rememberedValue34 = new x00.a() { // from class: com.baicizhan.main.home.player.y2
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 X0;
                    X0 = HomeActivityKt.X0(tg.a.this);
                    return X0;
                }
            };
            composer4.updateRememberedValue(rememberedValue34);
        }
        x00.a aVar6 = (x00.a) rememberedValue34;
        boolean changedInstance10 = composer4.changedInstance(aVar);
        Object rememberedValue35 = composer4.rememberedValue();
        if (changedInstance10 || rememberedValue35 == companion.getEmpty()) {
            rememberedValue35 = new x00.a() { // from class: com.baicizhan.main.home.player.z2
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 Y0;
                    Y0 = HomeActivityKt.Y0(tg.a.this);
                    return Y0;
                }
            };
            composer4.updateRememberedValue(rememberedValue35);
        }
        x00.a aVar7 = (x00.a) rememberedValue35;
        boolean changedInstance11 = composer4.changedInstance(aVar);
        Object rememberedValue36 = composer4.rememberedValue();
        if (changedInstance11 || rememberedValue36 == companion.getEmpty()) {
            rememberedValue36 = new x00.a() { // from class: com.baicizhan.main.home.player.a3
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 Z0;
                    Z0 = HomeActivityKt.Z0(tg.a.this);
                    return Z0;
                }
            };
            composer4.updateRememberedValue(rememberedValue36);
        }
        x00.a aVar8 = (x00.a) rememberedValue36;
        boolean changedInstance12 = composer4.changedInstance(aVar);
        Object rememberedValue37 = composer4.rememberedValue();
        if (changedInstance12 || rememberedValue37 == companion.getEmpty()) {
            rememberedValue37 = new x00.a() { // from class: com.baicizhan.main.home.player.b3
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 a12;
                    a12 = HomeActivityKt.a1(tg.a.this);
                    return a12;
                }
            };
            composer4.updateRememberedValue(rememberedValue37);
        }
        State state5 = state;
        State state6 = state2;
        UserKt.q(mutableState15, str3, str2, h11, available, intValue, intValue2, intValue3, intValue4, intValue5, aVar5, lVar3, aVar6, aVar7, aVar8, (x00.a) rememberedValue37, composer, 6, 0);
        Composer composer5 = composer;
        com.baicizhan.main.home.dialog.h.h(mutableState30, composer5, 6);
        if (((Boolean) mutableState4.getValue()).booleanValue()) {
            composer5.startReplaceGroup(-1072127931);
            r0Var2 = r0Var;
            state3 = state5;
            boolean changedInstance13 = composer5.changedInstance(r0Var2) | composer5.changed(state3);
            Object rememberedValue38 = composer5.rememberedValue();
            if (changedInstance13 || rememberedValue38 == companion.getEmpty()) {
                final MutableState mutableState31 = mutableState4;
                rememberedValue38 = new x00.a() { // from class: com.baicizhan.main.home.player.m2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 b12;
                        b12 = HomeActivityKt.b1(MutableState.this, r0Var2, state3);
                        return b12;
                    }
                };
                composer5.updateRememberedValue(rememberedValue38);
            }
            x00.a aVar9 = (x00.a) rememberedValue38;
            aVar2 = aVar;
            boolean changedInstance14 = composer5.changedInstance(aVar2);
            Object rememberedValue39 = composer5.rememberedValue();
            if (changedInstance14 || rememberedValue39 == companion.getEmpty()) {
                rememberedValue39 = new x00.a() { // from class: com.baicizhan.main.home.player.n2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 c12;
                        c12 = HomeActivityKt.c1(tg.a.this);
                        return c12;
                    }
                };
                composer5.updateRememberedValue(rememberedValue39);
            }
            i0("学习任务", "每天3个小任务，学更好", R.drawable.img_home_guide_task_unlock, "去做任务", aVar9, (x00.a) rememberedValue39, composer, 3510, 0);
            composer5 = composer;
            boolean changed2 = composer5.changed(state3);
            Object rememberedValue40 = composer5.rememberedValue();
            if (changed2 || rememberedValue40 == companion.getEmpty()) {
                cVar = null;
                rememberedValue40 = new x(state3, null);
                composer5.updateRememberedValue(rememberedValue40);
            } else {
                cVar = null;
            }
            obj = "";
            EffectsKt.LaunchedEffect(obj, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue40, composer5, 6);
            composer5.endReplaceGroup();
            i12 = -1167037500;
        } else {
            aVar2 = aVar;
            r0Var2 = r0Var;
            state3 = state5;
            obj = "";
            cVar = null;
            i12 = -1167037500;
            composer5.startReplaceGroup(-1167037500);
            composer5.endReplaceGroup();
        }
        if (((Boolean) mutableState5.getValue()).booleanValue()) {
            composer5.startReplaceGroup(-1071060570);
            boolean changedInstance15 = composer5.changedInstance(r0Var2) | composer5.changed(state3);
            Object rememberedValue41 = composer5.rememberedValue();
            if (changedInstance15 || rememberedValue41 == companion.getEmpty()) {
                final MutableState mutableState32 = mutableState5;
                rememberedValue41 = new x00.a() { // from class: com.baicizhan.main.home.player.o2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 e12;
                        e12 = HomeActivityKt.e1(MutableState.this, r0Var2, state3);
                        return e12;
                    }
                };
                composer5.updateRememberedValue(rememberedValue41);
            }
            x00.a aVar10 = (x00.a) rememberedValue41;
            boolean changedInstance16 = composer5.changedInstance(aVar2);
            Object rememberedValue42 = composer5.rememberedValue();
            if (changedInstance16 || rememberedValue42 == companion.getEmpty()) {
                rememberedValue42 = new x00.a() { // from class: com.baicizhan.main.home.player.p2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 f12;
                        f12 = HomeActivityKt.f1(tg.a.this);
                        return f12;
                    }
                };
                composer5.updateRememberedValue(rememberedValue42);
            }
            i0("排行榜", "与同路人竞争，学习更有劲", R.drawable.img_home_guide_rank_unlock, "查看我的排名", aVar10, (x00.a) rememberedValue42, composer, 3510, 0);
            composer5 = composer;
            boolean changed3 = composer5.changed(state3);
            Object rememberedValue43 = composer5.rememberedValue();
            if (changed3 || rememberedValue43 == companion.getEmpty()) {
                rememberedValue43 = new z(state3, cVar);
                composer5.updateRememberedValue(rememberedValue43);
            }
            EffectsKt.LaunchedEffect(obj, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue43, composer5, 6);
        } else {
            composer5.startReplaceGroup(i12);
        }
        composer5.endReplaceGroup();
        boolean M0 = M0(mutableState2);
        Object rememberedValue44 = composer5.rememberedValue();
        if (rememberedValue44 == companion.getEmpty()) {
            mutableState7 = mutableState2;
            rememberedValue44 = new x00.a() { // from class: com.baicizhan.main.home.player.q2
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 g12;
                    g12 = HomeActivityKt.g1(MutableState.this);
                    return g12;
                }
            };
            composer5.updateRememberedValue(rememberedValue44);
        } else {
            mutableState7 = mutableState2;
        }
        com.baicizhan.main.home.dialog.z.e(M0, false, (x00.a) rememberedValue44, composer5, 384, 2);
        if (kotlin.jvm.internal.g0.g(d1(mutableState3), Boolean.TRUE)) {
            composer5.startReplaceGroup(1073864804);
            Object rememberedValue45 = composer5.rememberedValue();
            if (rememberedValue45 == companion.getEmpty()) {
                mutableState8 = mutableState3;
                rememberedValue45 = new x00.a() { // from class: com.baicizhan.main.home.player.s2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 h12;
                        h12 = HomeActivityKt.h1(MutableState.this);
                        return h12;
                    }
                };
                composer5.updateRememberedValue(rememberedValue45);
            } else {
                mutableState8 = mutableState3;
            }
            x00.a aVar11 = (x00.a) rememberedValue45;
            boolean changedInstance17 = composer5.changedInstance(qVar);
            Object rememberedValue46 = composer5.rememberedValue();
            if (changedInstance17 || rememberedValue46 == companion.getEmpty()) {
                rememberedValue46 = new a0(qVar, cVar);
                composer5.updateRememberedValue(rememberedValue46);
            }
            m0(qVar, aVar11, (x00.p) rememberedValue46, composer5, 48, 0);
            composer3 = composer5;
        } else {
            mutableState8 = mutableState3;
            composer3 = composer5;
            composer3.startReplaceGroup(i12);
        }
        composer3.endReplaceGroup();
        k3.o4 O02 = O0(state6);
        boolean changed4 = composer3.changed(state6) | composer3.changedInstance(r0Var2) | composer3.changedInstance(appCompatActivity);
        Object rememberedValue47 = composer3.rememberedValue();
        if (changed4 || rememberedValue47 == companion.getEmpty()) {
            Object b0Var = new b0(mutableState, appCompatActivity, state6, mutableState7, r0Var2, mutableState8, null);
            composer3.updateRememberedValue(b0Var);
            rememberedValue47 = b0Var;
        }
        EffectsKt.LaunchedEffect(O02, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue47, composer3, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final boolean M0(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void N0(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final k3.o4 O0(State<? extends k3.o4> state) {
        return state.getValue();
    }

    public static final l3.o P0(State<? extends l3.o> state) {
        return state.getValue();
    }

    public static final k3.u2 Q0(State<? extends k3.u2> state) {
        return state.getValue();
    }

    public static final yz.g2 R0(AppCompatActivity appCompatActivity, ActivityResult result) {
        kotlin.jvm.internal.g0.p(result, "result");
        Intent data = result.getData();
        Object parcelableExtra = data != null ? data.getParcelableExtra("loggedOutUser") : null;
        UserRecord userRecord = parcelableExtra instanceof UserRecord ? (UserRecord) parcelableExtra : null;
        if (userRecord == null) {
            return yz.g2.f100423a;
        }
        if (result.getResultCode() == -1) {
            if (appCompatActivity == null) {
                return yz.g2.f100423a;
            }
            IntroductionPageActivity.x1(appCompatActivity, userRecord);
            appCompatActivity.finish();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 S0(wg.q qVar, boolean z11) {
        qVar.b0(z11);
        return yz.g2.f100423a;
    }

    public static final yz.g2 T0(wg.q qVar, boolean z11) {
        qVar.c0(z11);
        return yz.g2.f100423a;
    }

    public static final yz.g2 U0(tg.a aVar, wg.q qVar, MutableState mutableState, ManagedActivityResultLauncher managedActivityResultLauncher, AppCompatActivity appCompatActivity, SettingBehavior it) {
        kotlin.jvm.internal.g0.p(it, "it");
        switch (z0.f23292a[it.ordinal()]) {
            case 1:
                aVar.b(SimpleNavigation.NOTIFICATION);
                break;
            case 2:
                aVar.b(SimpleNavigation.LEARNING_CONFIGURATION);
                break;
            case 3:
                va.g.i("TODO 注音设置", 0);
                break;
            case 4:
                aVar.b(SimpleNavigation.FEEDBACK);
                break;
            case 5:
                wg.q.x(qVar, AudioEffect.COMMON_HOME_CLICK, null, 2, null);
                mutableState.setValue(Boolean.TRUE);
                break;
            case 6:
                aVar.b(SimpleNavigation.ABOUT);
                break;
            case 7:
                wg.q.x(qVar, AudioEffect.COMMON_HOME_CLICK, null, 2, null);
                if (appCompatActivity != null) {
                    managedActivityResultLauncher.launch(new Intent(appCompatActivity, (Class<?>) SettingsActivity.class));
                    break;
                } else {
                    return yz.g2.f100423a;
                }
            default:
                throw new NoWhenBranchMatchedException();
        }
        return yz.g2.f100423a;
    }

    public static final void U1(MutableState<Triple<Boolean, Integer, Boolean>> mutableState, MutableState<Pair<Long, Integer>> mutableState2) {
        mutableState.setValue(Triple.copy$default(mutableState.getValue(), Boolean.FALSE, null, null, 6, null));
        Pair<Long, Integer> value = mutableState2.getValue();
        mutableState2.setValue(value.copy(value.getFirst(), mutableState.getValue().getSecond()));
    }

    public static final yz.g2 V0(tg.a aVar) {
        aVar.b(SimpleNavigation.SCAN);
        return yz.g2.f100423a;
    }

    public static final void V1(MutableState<Triple<Boolean, Integer, Boolean>> mutableState) {
        mutableState.setValue(new Triple<>(null, 0, Boolean.FALSE));
    }

    public static final yz.g2 W0(wg.q qVar, Context context, int i11) {
        wg.q.x(qVar, AudioEffect.COMMON_HOME_CLICK, null, 2, null);
        SystemUtil.copyToClipboard(context, String.valueOf(i11));
        va.g.i(context.getString(R.string.my_tab_study_copied_bcz_id), 0);
        return yz.g2.f100423a;
    }

    public static final yz.g2 X0(tg.a aVar) {
        aVar.b(SimpleNavigation.MINE_USER_GRADE_EDIT);
        return yz.g2.f100423a;
    }

    public static final yz.g2 Y0(tg.a aVar) {
        aVar.b(SimpleNavigation.MINE_VOCABULARY_LISTENING_TEST);
        return yz.g2.f100423a;
    }

    public static final yz.g2 Z0(tg.a aVar) {
        aVar.b(SimpleNavigation.MINE_VOCABULARY_READING_TEST);
        return yz.g2.f100423a;
    }

    public static final yz.g2 a1(tg.a aVar) {
        aVar.b(SimpleNavigation.MINE_USER_CENTER);
        return yz.g2.f100423a;
    }

    public static final yz.g2 b1(MutableState mutableState, c40.r0 r0Var, State state) {
        mutableState.setValue(Boolean.FALSE);
        c40.k.f(r0Var, null, null, new w(state, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 c1(tg.a aVar) {
        aVar.b(SimpleNavigation.WINNING_TASKS);
        return yz.g2.f100423a;
    }

    public static final Boolean d1(MutableState<Boolean> mutableState) {
        return mutableState.getValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e0(Modifier modifier, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(62656061);
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
                ComposerKt.traceEventStart(62656061, i13, -1, "com.baicizhan.main.home.player.ColorBackground (HomeActivity.kt:1956)");
            }
            BoxKt.Box(modifier3.then(BackgroundKt.background$default(Modifier.Companion, Brush.Companion.m2466verticalGradient8A3gB4$default(Brush.Companion, a00.h0.Q(Color.m2499boximpl(ColorKt.Color(4288334847L)), Color.m2499boximpl(ColorKt.Color(4294506745L))), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null)), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.s3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 f02;
                    f02 = HomeActivityKt.f0(Modifier.this, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return f02;
                }
            });
        }
    }

    public static final yz.g2 e1(MutableState mutableState, c40.r0 r0Var, State state) {
        mutableState.setValue(Boolean.FALSE);
        c40.k.f(r0Var, null, null, new y(state, null), 3, null);
        return yz.g2.f100423a;
    }

    public static final yz.g2 f0(Modifier modifier, int i11, int i12, Composer composer, int i13) {
        e0(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 f1(tg.a aVar) {
        aVar.b(SimpleNavigation.WINNING_RANK);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g0(Modifier modifier, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Composer startRestartGroup = composer.startRestartGroup(660182199);
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
                ComposerKt.traceEventStart(660182199, i13, -1, "com.baicizhan.main.home.player.ColorBackgroundTraining (HomeActivity.kt:1961)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Brush.Companion companion2 = Brush.Companion;
            Pair a11 = yz.h1.a(Float.valueOf(0.0f), Color.m2499boximpl(ColorKt.Color(4288334847L)));
            Float valueOf = Float.valueOf(0.27f);
            Color.Companion companion3 = Color.Companion;
            BoxKt.Box(modifier3.then(BackgroundKt.background$default(companion, Brush.Companion.m2467verticalGradient8A3gB4$default(companion2, new Pair[]{a11, yz.h1.a(valueOf, Color.m2499boximpl(companion3.m2544getTransparent0d7_KjU())), yz.h1.a(Float.valueOf(1.0f), Color.m2499boximpl(companion3.m2544getTransparent0d7_KjU()))}, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null)), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.n3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 h02;
                    h02 = HomeActivityKt.h0(Modifier.this, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return h02;
                }
            });
        }
    }

    public static final yz.g2 g1(MutableState mutableState) {
        N0(mutableState, false);
        return yz.g2.f100423a;
    }

    public static final yz.g2 h0(Modifier modifier, int i11, int i12, Composer composer, int i13) {
        g0(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final yz.g2 h1(MutableState mutableState) {
        i1(mutableState, Boolean.FALSE);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x009a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i0(@m80.k final java.lang.String r12, @m80.k final java.lang.String r13, final int r14, @m80.k final java.lang.String r15, @m80.l x00.a<yz.g2> r16, @m80.k final x00.a<yz.g2> r17, @m80.l androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.HomeActivityKt.i0(java.lang.String, java.lang.String, int, java.lang.String, x00.a, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void i1(MutableState<Boolean> mutableState, Boolean bool) {
        mutableState.setValue(bool);
    }

    public static final yz.g2 j0() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 j1(final AppCompatActivity appCompatActivity, final tg.a aVar, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(composable, "$this$composable");
        kotlin.jvm.internal.g0.p(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1724418901, i11, -1, "com.baicizhan.main.home.player.PlayerHome.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:1693)");
        }
        boolean changedInstance = composer.changedInstance(appCompatActivity) | composer.changedInstance(aVar);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.player.d4
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 k12;
                    k12 = HomeActivityKt.k1(AppCompatActivity.this, aVar, (d9) obj);
                    return k12;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        x9.v(null, null, null, null, (x00.l) rememberedValue, composer, 0, 15);
        boolean changedInstance2 = composer.changedInstance(appCompatActivity);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new c0(appCompatActivity, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.LaunchedEffect("", (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue2, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 k0(final int i11, final x00.a aVar, final String str, final x00.a aVar2, final String str2, final String str3, Composer composer, int i12) {
        if (composer.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1872899753, i12, -1, "com.baicizhan.main.home.player.DynamicUnlockGuide.<anonymous> (HomeActivity.kt:2561)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m235backgroundbw27NRU$default(Modifier.Companion, Color.m2508copywmQWz5c$default(Color.Companion.m2535getBlack0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), 0.0f, 1, null);
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
                Object obj = new MeasurePolicy() { // from class: com.baicizhan.main.home.player.HomeActivityKt$DynamicUnlockGuide$lambda$1$$inlined$ConstraintLayout$2
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
                        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$DynamicUnlockGuide$lambda$1$$inlined$ConstraintLayout$2.1
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
                rememberedValue7 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$DynamicUnlockGuide$lambda$1$$inlined$ConstraintLayout$3
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
            if (changedInstance2 || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new x00.l<SemanticsPropertyReceiver, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$DynamicUnlockGuide$lambda$1$$inlined$ConstraintLayout$4
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (x00.l) rememberedValue8, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$DynamicUnlockGuide$lambda$1$$inlined$ConstraintLayout$5
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
                    composer2.startReplaceGroup(179461799);
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                    ConstrainedLayoutReference component1 = createRefs.component1();
                    ConstrainedLayoutReference component2 = createRefs.component2();
                    ConstrainedLayoutReference component3 = createRefs.component3();
                    ConstrainedLayoutReference component4 = createRefs.component4();
                    ConstrainedLayoutReference component5 = createRefs.component5();
                    Painter painterResource = PainterResources_androidKt.painterResource(i11, composer2, 0);
                    Modifier.Companion companion2 = Modifier.Companion;
                    Object rememberedValue9 = composer2.rememberedValue();
                    Composer.Companion companion3 = Composer.Companion;
                    if (rememberedValue9 == companion3.getEmpty()) {
                        rememberedValue9 = HomeActivityKt.a.f23165a;
                        composer2.updateRememberedValue(rememberedValue9);
                    }
                    ImageKt.Image(painterResource, "", constraintLayoutScope2.constrainAs(companion2, component2, (x00.l) rememberedValue9), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    Modifier clip = ClipKt.clip(companion2, RoundedCornerShapeKt.getCircleShape());
                    boolean changed = composer2.changed(component2);
                    Object rememberedValue10 = composer2.rememberedValue();
                    if (changed || rememberedValue10 == companion3.getEmpty()) {
                        rememberedValue10 = new HomeActivityKt.b(component2);
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    Modifier k11 = ComposeUtilsKt.k(constraintLayoutScope2.constrainAs(clip, component1, (x00.l) rememberedValue10), 0L, false, aVar, 3, null);
                    Color.Companion companion4 = Color.Companion;
                    SurfaceKt.m1784SurfaceFjzlyU(k11, null, Color.m2508copywmQWz5c$default(companion4.m2546getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, 0.0f, s.f23970a.g(), composer2, 1573248, 58);
                    boolean changed2 = composer2.changed(component2);
                    Object rememberedValue11 = composer2.rememberedValue();
                    if (changed2 || rememberedValue11 == companion3.getEmpty()) {
                        rememberedValue11 = new HomeActivityKt.c(component2);
                        composer2.updateRememberedValue(rememberedValue11);
                    }
                    Modifier constrainAs = constraintLayoutScope2.constrainAs(companion2, component3, (x00.l) rememberedValue11);
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    builder.append(str2);
                    builder.pushStyle(new SpanStyle(ColorKt.Color(4294956877L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (kotlin.jvm.internal.v) null));
                    builder.append("已解锁！");
                    builder.pop();
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                    int i15 = MaterialTheme.$stable;
                    TextStyle h22 = materialTheme.getTypography(composer2, i15).getH2();
                    FontWeight.Companion companion5 = FontWeight.Companion;
                    TextKt.m1846TextIbK3jfQ(annotatedString, constrainAs, companion4.m2546getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TextStyle.m4572copyp1EtxEg$default(h22, 0L, 0L, companion5.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 384, 0, 131064);
                    boolean changed3 = composer2.changed(component2) | composer2.changed(component3);
                    Object rememberedValue12 = composer2.rememberedValue();
                    if (changed3 || rememberedValue12 == companion3.getEmpty()) {
                        rememberedValue12 = new HomeActivityKt.d(component2, component3);
                        composer2.updateRememberedValue(rememberedValue12);
                    }
                    TextKt.m1845Text4IGK_g(str, constraintLayoutScope2.constrainAs(companion2, component4, (x00.l) rememberedValue12), companion4.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer2, i15).getSubtitle1(), 0L, 0L, companion5.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 384, 0, 65528);
                    boolean changed4 = composer2.changed(aVar2) | composer2.changed(aVar);
                    Object rememberedValue13 = composer2.rememberedValue();
                    if (changed4 || rememberedValue13 == companion3.getEmpty()) {
                        rememberedValue13 = new HomeActivityKt.e(aVar2, aVar);
                        composer2.updateRememberedValue(rememberedValue13);
                    }
                    x00.a aVar4 = (x00.a) rememberedValue13;
                    boolean changed5 = composer2.changed(component2) | composer2.changed(component4);
                    Object rememberedValue14 = composer2.rememberedValue();
                    if (changed5 || rememberedValue14 == companion3.getEmpty()) {
                        rememberedValue14 = new HomeActivityKt.f(component2, component4);
                        composer2.updateRememberedValue(rememberedValue14);
                    }
                    ButtonKt.Button(aVar4, constraintLayoutScope2.constrainAs(companion2, component5, (x00.l) rememberedValue14), false, null, null, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100)), null, null, PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(0)), ComposableLambdaKt.rememberComposableLambda(192236510, true, new HomeActivityKt.g(str3), composer2, 54), composer2, 905969664, R.styleable.Theme_drawable_share);
                    composer2.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(aVar3, composer2, 6);
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

    public static final yz.g2 k1(AppCompatActivity appCompatActivity, tg.a aVar, d9 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (it instanceof TrainingType) {
            if (it == TrainingType.NONE) {
                return yz.g2.f100423a;
            }
            DefaultPreloadActivity.Z0(appCompatActivity, ((TrainingType) it).getType());
        } else if (it instanceof FastsTrainingType) {
            int i11 = z0.f23293b[((FastsTrainingType) it).ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                DefaultPreloadActivity.Z0(appCompatActivity, 7);
            } else if (appCompatActivity != null) {
                appCompatActivity.startActivity(new Intent(appCompatActivity, (Class<?>) FastTestActivity.class));
            }
        } else if (it instanceof ExtraTrainingType) {
            int i12 = z0.f23294c[((ExtraTrainingType) it).ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (appCompatActivity != null) {
                    appCompatActivity.startActivity(new Intent(appCompatActivity, (Class<?>) AudioCenterActivity.class));
                }
            } else if (appCompatActivity != null) {
                appCompatActivity.startActivity(new Intent(appCompatActivity, (Class<?>) WordTVActivity.class));
            }
        } else {
            if (!(it instanceof x1)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar.a(((x1) it).h());
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 l0(String str, String str2, int i11, String str3, x00.a aVar, x00.a aVar2, int i12, int i13, Composer composer, int i14) {
        i0(str, str2, i11, str3, aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 l1(x00.l lVar, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(composable, "$this$composable");
        kotlin.jvm.internal.g0.p(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-495554247, i11, -1, "com.baicizhan.main.home.player.PlayerHome.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:1729)");
        }
        AndroidView_androidKt.AndroidView(lVar, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, composer, 48, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void m0(@m80.k final wg.q model, @m80.l x00.a<yz.g2> aVar, @m80.k final x00.p<? super GameType, ? super j00.c<? super yz.g2>, ? extends Object> onStart, @m80.l Composer composer, final int i11, final int i12) {
        int i13;
        final x00.a<yz.g2> aVar2;
        kotlin.jvm.internal.g0.p(model, "model");
        kotlin.jvm.internal.g0.p(onStart, "onStart");
        Composer startRestartGroup = composer.startRestartGroup(2037666998);
        if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changedInstance(model) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(onStart) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (i14 != 0) {
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.z3
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 n02;
                            n02 = HomeActivityKt.n0();
                            return n02;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                aVar = (x00.a) rememberedValue;
            }
            final x00.a<yz.g2> aVar3 = aVar;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2037666998, i13, -1, "com.baicizhan.main.home.player.Freshman (HomeActivity.kt:2062)");
            }
            zj.e0.e(false, aVar3, ComposableLambdaKt.rememberComposableLambda(612877147, true, new x00.p() { // from class: com.baicizhan.main.home.player.a4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 o02;
                    o02 = HomeActivityKt.o0(wg.q.this, onStart, aVar3, (Composer) obj, ((Integer) obj2).intValue());
                    return o02;
                }
            }, startRestartGroup, 54), startRestartGroup, (i13 & 112) | 390, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            aVar2 = aVar3;
        } else {
            startRestartGroup.skipToGroupEnd();
            aVar2 = aVar;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.b4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 p02;
                    p02 = HomeActivityKt.p0(wg.q.this, aVar2, onStart, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return p02;
                }
            });
        }
    }

    public static final float m1(State<Dp> state) {
        return state.getValue().m5129unboximpl();
    }

    public static final yz.g2 n0() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 n1(String str, c40.r0 r0Var, wg.q qVar, HomeMode homeMode, kg.l it) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (kotlin.jvm.internal.g0.g(it.h(), str)) {
            c40.k.f(r0Var, null, null, new d0(qVar, homeMode, null), 3, null);
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 o0(final wg.q qVar, final x00.p pVar, final x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(612877147, i11, -1, "com.baicizhan.main.home.player.Freshman.<anonymous> (HomeActivity.kt:2064)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m235backgroundbw27NRU$default(Modifier.Companion, ColorKt.Color(4293718525L), null, 2, null), 0.0f, 1, null);
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
            final int i12 = 257;
            boolean changedInstance = composer.changedInstance(measurer2) | composer.changed(257);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance || rememberedValue6 == companion.getEmpty()) {
                Object obj = new MeasurePolicy() { // from class: com.baicizhan.main.home.player.HomeActivityKt$Freshman$lambda$1$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo33measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j11) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        MutableState.this.getValue();
                        long m5516performMeasureDjhGOtQ = measurer2.m5516performMeasureDjhGOtQ(j11, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i12);
                        mutableState.getValue();
                        int m5286getWidthimpl = IntSize.m5286getWidthimpl(m5516performMeasureDjhGOtQ);
                        int m5285getHeightimpl = IntSize.m5285getHeightimpl(m5516performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, m5286getWidthimpl, m5285getHeightimpl, null, new x00.l<Placeable.PlacementScope, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$Freshman$lambda$1$$inlined$ConstraintLayout$2.1
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
                rememberedValue7 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$Freshman$lambda$1$$inlined$ConstraintLayout$3
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
            if (changedInstance2 || rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = new x00.l<SemanticsPropertyReceiver, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$Freshman$lambda$1$$inlined$ConstraintLayout$4
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(fillMaxSize$default, false, (x00.l) rememberedValue8, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new x00.p<Composer, Integer, yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$Freshman$lambda$1$$inlined$ConstraintLayout$5
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
                    if ((i13 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i13, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    MutableState.this.setValue(yz.g2.f100423a);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer2.startReplaceGroup(-1873002527);
                    ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
                    ConstrainedLayoutReference component1 = createRefs.component1();
                    ConstrainedLayoutReference component2 = createRefs.component2();
                    ConstrainedLayoutReference component3 = createRefs.component3();
                    ConstrainedLayoutReference component4 = createRefs.component4();
                    Modifier.Companion companion2 = Modifier.Companion;
                    Object rememberedValue9 = composer2.rememberedValue();
                    Composer.Companion companion3 = Composer.Companion;
                    if (rememberedValue9 == companion3.getEmpty()) {
                        rememberedValue9 = HomeActivityKt.h.f23201a;
                        composer2.updateRememberedValue(rememberedValue9);
                    }
                    TextKt.m1845Text4IGK_g("今日计划", constraintLayoutScope2.constrainAs(companion2, component1, (x00.l) rememberedValue9), ColorKt.Color(4281151299L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getH4(), composer2, 390, 0, 65528);
                    boolean changed = composer2.changed(component1);
                    Object rememberedValue10 = composer2.rememberedValue();
                    if (changed || rememberedValue10 == companion3.getEmpty()) {
                        rememberedValue10 = new HomeActivityKt.i(component1);
                        composer2.updateRememberedValue(rememberedValue10);
                    }
                    Modifier constrainAs = constraintLayoutScope2.constrainAs(companion2, component2, (x00.l) rememberedValue10);
                    RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(32));
                    s sVar = s.f23970a;
                    SurfaceKt.m1784SurfaceFjzlyU(constrainAs, m1019RoundedCornerShape0680j_4, 0L, 0L, null, 0.0f, sVar.k(), composer2, 1572864, 60);
                    Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.btn_start_freshman_learning, composer2, 6);
                    boolean changed2 = composer2.changed(component2);
                    Object rememberedValue11 = composer2.rememberedValue();
                    if (changed2 || rememberedValue11 == companion3.getEmpty()) {
                        rememberedValue11 = new HomeActivityKt.j(component2);
                        composer2.updateRememberedValue(rememberedValue11);
                    }
                    Modifier constrainAs2 = constraintLayoutScope2.constrainAs(companion2, component4, (x00.l) rememberedValue11);
                    boolean changedInstance3 = composer2.changedInstance(qVar) | composer2.changedInstance(pVar) | composer2.changed(aVar);
                    Object rememberedValue12 = composer2.rememberedValue();
                    if (changedInstance3 || rememberedValue12 == companion3.getEmpty()) {
                        rememberedValue12 = new HomeActivityKt.k(qVar, pVar, aVar);
                        composer2.updateRememberedValue(rememberedValue12);
                    }
                    ImageKt.Image(painterResource, "", ComposeUtilsKt.k(constrainAs2, 0L, false, (x00.a) rememberedValue12, 3, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    boolean changed3 = composer2.changed(component4);
                    Object rememberedValue13 = composer2.rememberedValue();
                    if (changed3 || rememberedValue13 == companion3.getEmpty()) {
                        rememberedValue13 = new HomeActivityKt.l(component4);
                        composer2.updateRememberedValue(rememberedValue13);
                    }
                    Modifier constrainAs3 = constraintLayoutScope2.constrainAs(companion2, component3, (x00.l) rememberedValue13);
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer2, 48);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, constrainAs3);
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
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(ColorKt.Color(4286744232L))), sVar.h(), composer2, ProvidedValue.$stable | 48);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(aVar2, composer2, 6);
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

    public static final boolean o1(NavHostController navHostController, State<NavBackStackEntry> state, String str) {
        NavDestination destination;
        NavBackStackEntry value = state.getValue();
        return kotlin.jvm.internal.g0.g((value == null || (destination = value.getDestination()) == null) ? null : destination.getRoute(), str);
    }

    public static final yz.g2 p0(wg.q qVar, x00.a aVar, x00.p pVar, int i11, int i12, Composer composer, int i13) {
        m0(qVar, aVar, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    public static final DisposableEffectResult p1(Context context, wg.q qVar, HomeMode homeMode, DisposableEffectScope DisposableEffect) {
        kotlin.jvm.internal.g0.p(DisposableEffect, "$this$DisposableEffect");
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        Lifecycle lifecycle = appCompatActivity != null ? appCompatActivity.getLifecycle() : null;
        i0 i0Var = new i0(qVar, homeMode);
        if (lifecycle != null) {
            lifecycle.addObserver(i0Var);
        }
        return new k0(lifecycle, i0Var);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void q0(final tg.a aVar, final Map<String, ? extends x00.l<? super Context, ? extends View>> map, final wg.q qVar, Composer composer, final int i11) {
        int i12;
        final wg.q qVar2;
        final tg.a aVar2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(907011820);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(aVar) : startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(map) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(qVar) ? 256 : 128;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(907011820, i13, -1, "com.baicizhan.main.home.player.PlayerHome (HomeActivity.kt:479)");
            }
            final Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object consume = startRestartGroup.consume(LocalActivityKt.getLocalActivity());
            AppCompatActivity appCompatActivity = consume instanceof AppCompatActivity ? (AppCompatActivity) consume : null;
            final OnBackPressedDispatcherOwner current = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(startRestartGroup, LocalOnBackPressedDispatcherOwner.$stable);
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new j0(context);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final j0 j0Var = (j0) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                HomeMode homeMode = HomeMode.WORDS;
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Standard_extKt.triplet(yz.h1.a(homeMode, homeMode), Boolean.FALSE), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final MutableState mutableState = (MutableState) rememberedValue2;
            Triple triple = (Triple) mutableState.getValue();
            final HomeMode homeMode2 = (HomeMode) triple.component1();
            final HomeMode homeMode3 = (HomeMode) triple.component2();
            Boolean bool = (Boolean) triple.component3();
            boolean booleanValue = bool.booleanValue();
            final AppCompatActivity appCompatActivity2 = appCompatActivity;
            x00.p pVar = new x00.p() { // from class: com.baicizhan.main.home.player.h4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 r02;
                    r02 = HomeActivityKt.r0(OnBackPressedDispatcherOwner.this, j0Var, qVar, homeMode3, appCompatActivity2, aVar, context, map, density, homeMode2, mutableState, (Composer) obj, ((Integer) obj2).intValue());
                    return r02;
                }
            };
            qVar2 = qVar;
            aVar2 = aVar;
            composer2 = startRestartGroup;
            bk.k.h(null, null, null, ComposableLambdaKt.rememberComposableLambda(686069894, true, pVar, startRestartGroup, 54), composer2, 3072, 7);
            boolean changed = composer2.changed(booleanValue) | composer2.changed(homeMode3 == null ? -1 : homeMode3.ordinal()) | composer2.changedInstance(qVar2);
            Object rememberedValue3 = composer2.rememberedValue();
            if (changed || rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new h0(booleanValue, homeMode3, qVar2, null);
                composer2.updateRememberedValue(rememberedValue3);
            }
            EffectsKt.LaunchedEffect(homeMode3, bool, (x00.p) rememberedValue3, composer2, 0);
            boolean changedInstance = composer2.changedInstance(context) | composer2.changedInstance(qVar2) | composer2.changed(homeMode3 == null ? -1 : homeMode3.ordinal());
            Object rememberedValue4 = composer2.rememberedValue();
            if (changedInstance || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.l() { // from class: com.baicizhan.main.home.player.i4
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        DisposableEffectResult p12;
                        p12 = HomeActivityKt.p1(context, qVar2, homeMode3, (DisposableEffectScope) obj);
                        return p12;
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            }
            EffectsKt.DisposableEffect(qVar2, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue4, composer2, (i13 >> 6) & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            qVar2 = qVar;
            aVar2 = aVar;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.j4
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 q12;
                    q12 = HomeActivityKt.q1(tg.a.this, map, qVar2, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return q12;
                }
            });
        }
    }

    public static final yz.g2 q1(tg.a aVar, Map map, wg.q qVar, int i11, Composer composer, int i12) {
        q0(aVar, map, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 r0(OnBackPressedDispatcherOwner onBackPressedDispatcherOwner, final j0 j0Var, final wg.q qVar, final HomeMode homeMode, final AppCompatActivity appCompatActivity, final tg.a aVar, final Context context, final Map map, final Density density, final HomeMode homeMode2, final MutableState mutableState, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(686069894, i11, -1, "com.baicizhan.main.home.player.PlayerHome.<anonymous> (HomeActivity.kt:513)");
            }
            com.baicizhan.platform.base.widget.s4.B(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, ColorKt.Color(4294637823L), 0L, ComposableLambdaKt.rememberComposableLambda(-1774292939, true, new x00.q() { // from class: com.baicizhan.main.home.player.v3
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 s02;
                    s02 = HomeActivityKt.s0(wg.q.this, homeMode, appCompatActivity, aVar, context, map, density, homeMode2, j0Var, mutableState, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return s02;
                }
            }, composer, 54), composer, 0, 12779520, 98303);
            OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner != null ? onBackPressedDispatcherOwner.getOnBackPressedDispatcher() : null;
            boolean changedInstance = composer.changedInstance(onBackPressedDispatcherOwner) | composer.changedInstance(j0Var);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new g0(onBackPressedDispatcherOwner, j0Var, null);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r1(wg.q r4, com.baicizhan.app.api.service.GameType r5, boolean r6, int r7, j00.c<? super yz.g2> r8) {
        /*
            boolean r0 = r8 instanceof com.baicizhan.main.home.player.HomeActivityKt.l0
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.main.home.player.HomeActivityKt$l0 r0 = (com.baicizhan.main.home.player.HomeActivityKt.l0) r0
            int r1 = r0.f23226f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23226f = r1
            goto L18
        L13:
            com.baicizhan.main.home.player.HomeActivityKt$l0 r0 = new com.baicizhan.main.home.player.HomeActivityKt$l0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23225e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f23226f
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r4 = r0.f23222b
            com.baicizhan.app.api.service.GameType r4 = (com.baicizhan.app.api.service.GameType) r4
            java.lang.Object r4 = r0.f23221a
            wg.q r4 = (wg.q) r4
            kotlin.e.n(r8)
            goto L57
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            kotlin.e.n(r8)
            if (r6 != 0) goto L5b
            java.lang.Object r8 = l00.k.a(r4)
            r0.f23221a = r8
            java.lang.Object r8 = l00.k.a(r5)
            r0.f23222b = r8
            r0.f23223c = r6
            r0.f23224d = r7
            r0.f23226f = r3
            java.lang.Object r4 = r4.e0(r5, r7, r0)
            if (r4 != r1) goto L57
            return r1
        L57:
            t1()
            goto L5e
        L5b:
            t1()
        L5e:
            yz.g2 r4 = yz.g2.f100423a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.HomeActivityKt.r1(wg.q, com.baicizhan.app.api.service.GameType, boolean, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04cd  */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.compose.animation.core.Easing, androidx.compose.animation.core.FiniteAnimationSpec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v14 */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final yz.g2 s0(final wg.q r45, final com.baicizhan.main.home.player.model.HomeMode r46, final androidx.appcompat.app.AppCompatActivity r47, final tg.a r48, final android.content.Context r49, final java.util.Map r50, androidx.compose.ui.unit.Density r51, com.baicizhan.main.home.player.model.HomeMode r52, com.baicizhan.main.home.player.HomeActivityKt.j0 r53, final androidx.compose.runtime.MutableState r54, androidx.compose.foundation.layout.PaddingValues r55, androidx.compose.runtime.Composer r56, int r57) {
        /*
            Method dump skipped, instructions count: 1815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.player.HomeActivityKt.s0(wg.q, com.baicizhan.main.home.player.model.HomeMode, androidx.appcompat.app.AppCompatActivity, tg.a, android.content.Context, java.util.Map, androidx.compose.ui.unit.Density, com.baicizhan.main.home.player.model.HomeMode, com.baicizhan.main.home.player.HomeActivityKt$j0, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):yz.g2");
    }

    public static /* synthetic */ Object s1(wg.q qVar, GameType gameType, boolean z11, int i11, j00.c cVar, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return r1(qVar, gameType, z11, i11, cVar);
    }

    public static final Pair<BuildingPhase, c40.l2> t0(MutableState<Pair<BuildingPhase, c40.l2>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u0(MutableState<Pair<BuildingPhase, c40.l2>> mutableState, Pair<? extends BuildingPhase, ? extends c40.l2> pair) {
        mutableState.setValue(pair);
    }

    public static final void u1(AppCompatActivity appCompatActivity, wg.q qVar, GameType gameType, boolean z11, int i11) {
        LifecycleCoroutineScope lifecycleScope;
        if (appCompatActivity == null) {
            appCompatActivity = null;
        }
        if (appCompatActivity == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(appCompatActivity)) == null) {
            return;
        }
        c40.k.f(lifecycleScope, null, null, new m0(gameType, z11, i11, qVar, null), 3, null);
    }

    public static final EnterTransition v0(AnimatedContentTransitionScope NavHost) {
        kotlin.jvm.internal.g0.p(NavHost, "$this$NavHost");
        return EnterTransition.Companion.getNone();
    }

    public static /* synthetic */ void v1(AppCompatActivity appCompatActivity, wg.q qVar, GameType gameType, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            i11 = 0;
        }
        u1(appCompatActivity, qVar, gameType, z11, i11);
    }

    public static final SpineView w0(final MutableState mutableState, Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        return new SpineView.b(context, new com.esotericsoftware.spine.android.c(new ml.d() { // from class: com.baicizhan.main.home.player.e4
            @Override // ml.d
            public final void a(com.esotericsoftware.spine.android.c cVar) {
                HomeActivityKt.x0(MutableState.this, cVar);
            }
        })).e("spine/ui_trans.atlas.txt", "spine/ui_trans.skel.bytes").c(new ll.e(a.r.C0259a.f16300m)).d(ContentMode.FILL).a();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @OptIn(markerClass = {UnstableApi.class})
    @Composable
    public static final void w1(Modifier modifier, final String str, Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        final Modifier modifier3;
        Composer composer2;
        SimpleCache simpleCache;
        Composer startRestartGroup = composer.startRestartGroup(-986459764);
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
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-986459764, i13, -1, "com.baicizhan.main.home.player.SeaBackground (HomeActivity.kt:1968)");
            }
            Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new SimpleCache(new File(context.getCacheDir(), "des_video"), new NoOpCacheEvictor(), new StandaloneDatabaseProvider(context));
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            SimpleCache simpleCache2 = (SimpleCache) rememberedValue2;
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            c40.r0 r0Var = (c40.r0) rememberedValue3;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            Object obj = rememberedValue4;
            if (rememberedValue4 == companion.getEmpty()) {
                ExoPlayer build = new ExoPlayer.Builder(context).build();
                build.setPlayWhenReady(true);
                build.setVideoScalingMode(2);
                build.setRepeatMode(2);
                CacheDataSource.Factory flags = new CacheDataSource.Factory().setCache(simpleCache2).setCacheWriteDataSinkFactory(new CacheDataSink.Factory().setCache(simpleCache2)).setCacheReadDataSourceFactory(new FileDataSource.Factory()).setUpstreamDataSourceFactory(new DefaultDataSource.Factory(context, new DefaultHttpDataSource.Factory())).setFlags(2);
                kotlin.jvm.internal.g0.o(flags, "setFlags(...)");
                ProgressiveMediaSource createMediaSource = new ProgressiveMediaSource.Factory(flags).createMediaSource(MediaItem.fromUri(str));
                kotlin.jvm.internal.g0.o(createMediaSource, "createMediaSource(...)");
                build.addListener(new n0(r0Var, mutableIntState));
                build.setMediaSource(createMediaSource);
                build.prepare();
                startRestartGroup.updateRememberedValue(build);
                obj = build;
            }
            final ExoPlayer exoPlayer = (ExoPlayer) obj;
            kotlin.jvm.internal.g0.m(exoPlayer);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier3);
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
            if (x1(mutableIntState) >= 1) {
                startRestartGroup.startReplaceGroup(559624053);
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null);
                boolean changedInstance = startRestartGroup.changedInstance(exoPlayer);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue5 == companion.getEmpty()) {
                    rememberedValue5 = new x00.l() { // from class: com.baicizhan.main.home.player.g2
                        @Override // x00.l
                        public final Object invoke(Object obj2) {
                            PlayerView z12;
                            z12 = HomeActivityKt.z1(ExoPlayer.this, (Context) obj2);
                            return z12;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                simpleCache = simpleCache2;
                AndroidView_androidKt.AndroidView((x00.l) rememberedValue5, fillMaxSize$default, null, startRestartGroup, 48, 4);
            } else {
                simpleCache = simpleCache2;
                startRestartGroup.startReplaceGroup(446078524);
            }
            startRestartGroup.endReplaceGroup();
            AnimatedVisibilityKt.AnimatedVisibility(x1(mutableIntState) < 2, (Modifier) null, (EnterTransition) null, EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(150, 0, null, 6, null), 0.0f, 2, null), (String) null, com.baicizhan.main.home.player.s.f23970a.j(), startRestartGroup, 199680, 22);
            Composer composer3 = startRestartGroup;
            composer3.endNode();
            final SimpleCache simpleCache3 = simpleCache;
            boolean changedInstance2 = composer3.changedInstance(simpleCache3) | composer3.changedInstance(exoPlayer);
            Object rememberedValue6 = composer3.rememberedValue();
            if (changedInstance2 || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new x00.l() { // from class: com.baicizhan.main.home.player.r2
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        DisposableEffectResult A1;
                        A1 = HomeActivityKt.A1(SimpleCache.this, exoPlayer, (DisposableEffectScope) obj2);
                        return A1;
                    }
                };
                composer3.updateRememberedValue(rememberedValue6);
            }
            EffectsKt.DisposableEffect("", (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue6, composer3, 6);
            composer2 = composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer2 = composer3;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.player.c3
                @Override // x00.p
                public final Object invoke(Object obj2, Object obj3) {
                    yz.g2 B1;
                    B1 = HomeActivityKt.B1(Modifier.this, str, i11, i12, (Composer) obj2, ((Integer) obj3).intValue());
                    return B1;
                }
            });
        }
    }

    public static final void x0(MutableState mutableState, com.esotericsoftware.spine.android.c cVar) {
        cVar.i().x(0, "ani_trans", false);
        cVar.i().d(new f0(mutableState));
    }

    public static final int x1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 y0(final MutableState mutableState, final wg.q qVar, final c40.r0 r0Var, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        String str;
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1580004938, i11, -1, "com.baicizhan.main.home.player.PlayerHome.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeActivity.kt:1820)");
        }
        o.y yVar = (o.y) ((Pair) mutableState.getValue()).getSecond();
        if (yVar == null || (str = yVar.k()) == null) {
            str = "";
        }
        String str2 = str;
        int intValue = ((Number) ((Triple) ((Pair) mutableState.getValue()).getFirst()).getSecond()).intValue();
        o.y yVar2 = (o.y) ((Pair) mutableState.getValue()).getSecond();
        int l11 = yVar2 != null ? yVar2.l() : 0;
        int intValue2 = ((Number) ((Triple) ((Pair) mutableState.getValue()).getFirst()).getThird()).intValue();
        boolean changedInstance = composer.changedInstance(qVar);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.j2
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 z02;
                    z02 = HomeActivityKt.z0(wg.q.this);
                    return z02;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        x00.a aVar = (x00.a) rememberedValue;
        boolean changedInstance2 = composer.changedInstance(r0Var);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.home.player.k2
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 A0;
                    A0 = HomeActivityKt.A0(c40.r0.this, mutableState, ((Boolean) obj).booleanValue());
                    return A0;
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        AwardsKt.c(str2, intValue, l11, intValue2, aVar, (x00.l) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final void y1(MutableIntState mutableIntState, int i11) {
        mutableIntState.setIntValue(i11);
    }

    public static final yz.g2 z0(wg.q qVar) {
        wg.q.x(qVar, AudioEffect.TREASURE_CHEST_OPEN, null, 2, null);
        return yz.g2.f100423a;
    }

    public static final PlayerView z1(ExoPlayer exoPlayer, Context it) {
        kotlin.jvm.internal.g0.p(it, "it");
        li c11 = li.c(LayoutInflater.from(it));
        PlayerView playerView = c11.f55779b;
        playerView.hideController();
        playerView.setUseController(false);
        playerView.setResizeMode(4);
        playerView.setPlayer(exoPlayer);
        playerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return c11.getRoot();
    }

    public static final void t1() {
    }
}
