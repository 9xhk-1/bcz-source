package com.baicizhan.main.home.player;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/ComposableSingletons$HomeActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n1#1,2633:1\n1247#2,6:2634\n70#3:2640\n67#3,9:2641\n77#3:2680\n70#3:2720\n68#3,8:2721\n77#3:2760\n79#4,6:2650\n86#4,3:2665\n89#4,2:2674\n93#4:2679\n79#4,6:2688\n86#4,3:2703\n89#4,2:2712\n93#4:2717\n79#4,6:2729\n86#4,3:2744\n89#4,2:2753\n93#4:2759\n347#5,9:2656\n356#5,3:2676\n347#5,9:2694\n356#5,3:2714\n347#5,9:2735\n356#5:2755\n357#5,2:2757\n4206#6,6:2668\n4206#6,6:2706\n4206#6,6:2747\n113#7:2681\n113#7:2719\n113#7:2756\n87#8,6:2682\n94#8:2718\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/ComposableSingletons$HomeActivityKt\n*L\n545#1:2634,6\n542#1:2640\n542#1:2641,9\n542#1:2680\n2580#1:2720\n2580#1:2721,8\n2580#1:2760\n542#1:2650,6\n542#1:2665,3\n542#1:2674,2\n542#1:2679\n2084#1:2688,6\n2084#1:2703,3\n2084#1:2712,2\n2084#1:2717\n2580#1:2729,6\n2580#1:2744,3\n2580#1:2753,2\n2580#1:2759\n542#1:2656,9\n542#1:2676,3\n2084#1:2694,9\n2084#1:2714,3\n2580#1:2735,9\n2580#1:2755\n2580#1:2757,2\n542#1:2668,6\n2084#1:2706,6\n2580#1:2747,6\n2086#1:2681\n2126#1:2719\n2581#1:2756\n2084#1:2682,6\n2084#1:2718\n*E\n"})
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final s f23970a = new s();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.q<AnimatedVisibilityScope, Composer, Integer, yz.g2> f23971b = ComposableLambdaKt.composableLambdaInstance(1428287123, false, new x00.q() { // from class: com.baicizhan.main.home.player.m
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            yz.g2 l11;
            l11 = s.l((AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return l11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.q<AnimatedVisibilityScope, Composer, Integer, yz.g2> f23972c = ComposableLambdaKt.composableLambdaInstance(35679342, false, new x00.q() { // from class: com.baicizhan.main.home.player.n
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            yz.g2 n11;
            n11 = s.n((AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return n11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23973d = ComposableLambdaKt.composableLambdaInstance(707596334, false, new x00.p() { // from class: com.baicizhan.main.home.player.o
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 o11;
            o11 = s.o((Composer) obj, ((Integer) obj2).intValue());
            return o11;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23974e = ComposableLambdaKt.composableLambdaInstance(-535317226, false, new x00.p() { // from class: com.baicizhan.main.home.player.p
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 q11;
            q11 = s.q((Composer) obj, ((Integer) obj2).intValue());
            return q11;
        }
    });

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23975f = ComposableLambdaKt.composableLambdaInstance(-1779623894, false, new x00.p() { // from class: com.baicizhan.main.home.player.q
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 p11;
            p11 = s.p((Composer) obj, ((Integer) obj2).intValue());
            return p11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 l(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428287123, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$HomeActivityKt.lambda$1428287123.<anonymous> (HomeActivity.kt:541)");
        }
        Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), Color.m2508copywmQWz5c$default(Color.Companion.m2535getBlack0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.r
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 m11;
                    m11 = s.m();
                    return m11;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier k11 = ComposeUtilsKt.k(m235backgroundbw27NRU$default, 0L, false, (x00.a) rememberedValue, 3, null);
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, k11);
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
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 m() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 n(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(35679342, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$HomeActivityKt.lambda$35679342.<anonymous> (HomeActivity.kt:2037)");
        }
        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_home_sea, composer, 6), "sea-bg", SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), (Alignment) null, ContentScale.Companion.getCrop(), 0.0f, (ColorFilter) null, composer, 25008, 104);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 o(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(707596334, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$HomeActivityKt.lambda$707596334.<anonymous> (HomeActivity.kt:2083)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 24;
            Modifier m729paddingqDBjuR0 = PaddingKt.m729paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(46), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(54));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(8)), Alignment.Companion.getCenterHorizontally(), composer, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m729paddingqDBjuR0);
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
            TextKt.m1845Text4IGK_g("新学", (Modifier) companion, ColorKt.Color(4286744232L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH6(), 0L, TextUnitKt.getSp(16), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(16), null, null, null, 0, 0, null, 16646141, null), composer, 438, 0, 65528);
            TextKt.m1845Text4IGK_g("第一组", (Modifier) companion, ColorKt.Color(4281151299L), TextUnitKt.getSp(32), (FontStyle) null, FontWeight.Companion.getSemiBold(), bk.k.l(), 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(32), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 1772982, 6, 129936);
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
    public static final yz.g2 p(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1779623894, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$HomeActivityKt.lambda$-1779623894.<anonymous> (HomeActivity.kt:2579)");
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
            IconKt.m1692Iconww6aTOc(VectorResources_androidKt.vectorResource(ImageVector.Companion, R.drawable.ic_tip_close, composer, 54), "", SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(20)), Color.Companion.m2546getWhite0d7_KjU(), composer, 3504, 0);
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
    public static final yz.g2 q(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-535317226, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$HomeActivityKt.lambda$-535317226.<anonymous> (HomeActivity.kt:2123)");
            }
            IconKt.m1691Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_freshman_clock, composer, 6), "", (Modifier) null, 0L, composer, 48, 12);
            TextKt.m1845Text4IGK_g("预计用时 2 分钟", PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, Dp.m5115constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), ColorKt.Color(4286744232L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle2(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 438, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> g() {
        return f23975f;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> h() {
        return f23974e;
    }

    @m80.k
    public final x00.q<AnimatedVisibilityScope, Composer, Integer, yz.g2> i() {
        return f23971b;
    }

    @m80.k
    public final x00.q<AnimatedVisibilityScope, Composer, Integer, yz.g2> j() {
        return f23972c;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> k() {
        return f23973d;
    }
}
