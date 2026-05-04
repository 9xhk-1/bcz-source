package com.baicizhan.main.home.player;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
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
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.player.HomeActivityKt;
import com.baicizhan.main.home.player.b8;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,2303:1\n2175#2,5:2304\n2185#2,2:2315\n2190#2:2323\n2184#2,11:2330\n2199#2:2347\n2202#2:2354\n2203#2:2391\n2205#2,4:2395\n2204#2,6:2399\n2212#2,5:2408\n2217#2:2415\n2211#2:2416\n2222#2,3:2417\n2221#2,6:2420\n2230#2,3:2430\n2229#2:2439\n2228#2:2440\n2241#2,2:2441\n2245#2:2449\n2246#2:2484\n2247#2,3:2523\n2250#2:2530\n2281#2,6:2532\n2280#2,9:2538\n2289#2,2:2551\n2294#2:2560\n2340#2:2561\n1247#3,6:2309\n1247#3,6:2317\n1247#3,6:2324\n1247#3,6:2341\n1247#3,6:2348\n1247#3,3:2392\n1250#3,3:2405\n1247#3,6:2433\n1247#3,6:2443\n1247#3,6:2554\n1225#3,6:2562\n70#4:2355\n68#4,8:2356\n77#4:2429\n79#5,6:2364\n86#5,3:2379\n89#5,2:2388\n93#5:2428\n79#5,6:2457\n86#5,3:2472\n89#5,2:2481\n79#5,6:2496\n86#5,3:2511\n89#5,2:2520\n93#5:2528\n93#5:2549\n347#6,9:2370\n356#6:2390\n357#6,2:2426\n347#6,9:2463\n356#6:2483\n347#6,9:2502\n356#6:2522\n357#6,2:2526\n357#6,2:2547\n4206#7,6:2382\n4206#7,6:2475\n4206#7,6:2514\n1#8:2413\n113#9:2414\n113#9:2450\n113#9:2531\n113#9:2553\n87#10,6:2451\n94#10:2550\n99#11:2485\n95#11,10:2486\n106#11:2529\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n2179#1:2309,6\n2186#1:2317,6\n2190#1:2324,6\n2194#1:2341,6\n2199#1:2348,6\n2203#1:2392,3\n2203#1:2405,3\n2232#1:2433,6\n2242#1:2443,6\n2290#1:2554,6\n2199#1:2355\n2199#1:2356,8\n2199#1:2429\n2199#1:2364,6\n2199#1:2379,3\n2199#1:2388,2\n2199#1:2428\n2242#1:2457,6\n2242#1:2472,3\n2242#1:2481,2\n2246#1:2496,6\n2246#1:2511,3\n2246#1:2520,2\n2246#1:2528\n2242#1:2549\n2199#1:2370,9\n2199#1:2390\n2199#1:2426,2\n2242#1:2463,9\n2242#1:2483\n2246#1:2502,9\n2246#1:2522\n2246#1:2526,2\n2242#1:2547,2\n2199#1:2382,6\n2242#1:2475,6\n2246#1:2514,6\n2216#1:2414\n2245#1:2450\n2250#1:2531\n2290#1:2553\n2242#1:2451,6\n2242#1:2550\n2246#1:2485\n2246#1:2486,10\n2246#1:2529\n384#2:2562,6\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeActivityKt$StreakPromptSheet$lambda$0$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ Density $density$inlined;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ x00.a $onDismiss$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $start;
    final /* synthetic */ b8 $streakInfo$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivityKt$StreakPromptSheet$lambda$0$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, x00.a aVar, b8 b8Var, Density density) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$onDismiss$inlined = aVar;
        this.$streakInfo$inlined = b8Var;
        this.$density$inlined = density;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        TextStyle m4604mergedA7vx0o;
        if ((i11 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i11, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(yz.g2.f100423a);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope = this.$scope;
        composer.startReplaceGroup(2015764733);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        ConstrainedLayoutReference component4 = createRefs.component4();
        ConstrainedLayoutReference component5 = createRefs.component5();
        ConstrainedLayoutReference component6 = createRefs.component6();
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.bg_streak_sheet_sparkling, composer, 6);
        Modifier.Companion companion = Modifier.Companion;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = HomeActivityKt.p0.f23248a;
            composer.updateRememberedValue(rememberedValue);
        }
        ImageKt.Image(painterResource, "sparkle", constraintLayoutScope.constrainAs(companion, component2, (x00.l) rememberedValue), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        Painter painterResource2 = PainterResources_androidKt.painterResource(R.drawable.btn_streak_sheet_continue, composer, 6);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = HomeActivityKt.s0.f23260a;
            composer.updateRememberedValue(rememberedValue2);
        }
        Modifier constrainAs = constraintLayoutScope.constrainAs(companion, component1, (x00.l) rememberedValue2);
        boolean changed = composer.changed(this.$onDismiss$inlined);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = new HomeActivityKt.t0(this.$onDismiss$inlined);
            composer.updateRememberedValue(rememberedValue3);
        }
        ImageKt.Image(painterResource2, "streak-continue", ComposeUtilsKt.k(constrainAs, 0L, false, (x00.a) rememberedValue3, 3, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i12 = MaterialTheme.$stable;
        TextStyle h42 = materialTheme.getTypography(composer, i12).getH4();
        Color.Companion companion3 = Color.Companion;
        long m2546getWhite0d7_KjU = companion3.m2546getWhite0d7_KjU();
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion2.getEmpty()) {
            rememberedValue4 = HomeActivityKt.u0.f23269a;
            composer.updateRememberedValue(rememberedValue4);
        }
        TextKt.m1845Text4IGK_g("不断电连续学习", constraintLayoutScope.constrainAs(companion, component3, (x00.l) rememberedValue4), m2546getWhite0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, h42, composer, 390, 0, 65528);
        boolean changed2 = composer.changed(component2) | composer.changed(component3);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed2 || rememberedValue5 == companion2.getEmpty()) {
            rememberedValue5 = new HomeActivityKt.v0(component2, component3);
            composer.updateRememberedValue(rememberedValue5);
        }
        Modifier constrainAs2 = constraintLayoutScope.constrainAs(companion, component4, (x00.l) rememberedValue5);
        Alignment.Companion companion4 = Alignment.Companion;
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, constrainAs2);
        ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
        x00.a<ComposeUiNode> constructor = companion5.getConstructor();
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
        Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
        x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion5.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == companion2.getEmpty()) {
            rememberedValue6 = new TextStyle(0L, TextUnitKt.getSp(82), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, bk.k.n(), (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(0), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645981, (kotlin.jvm.internal.v) null);
            composer.updateRememberedValue(rememberedValue6);
        }
        TextStyle textStyle = (TextStyle) rememberedValue6;
        String valueOf = String.valueOf(this.$streakInfo$inlined.a());
        long m2546getWhite0d7_KjU2 = companion3.m2546getWhite0d7_KjU();
        float f11 = 8;
        m4604mergedA7vx0o = textStyle.m4604mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 256) != 0 ? null : null, (r60 & 512) != 0 ? null : null, (r60 & 1024) != 0 ? null : null, (r60 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 4096) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & 16384) != 0 ? null : new Stroke(this.$density$inlined.mo377toPx0680j_4(Dp.m5115constructorimpl(f11)), 0.0f, 0, StrokeJoin.Companion.m2874getRoundLxFBmk8(), null, 22, null), (r60 & 32768) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : 0, (r60 & 131072) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 262144) != 0 ? null : null, (r60 & 524288) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
        int i13 = 0;
        TextKt.m1845Text4IGK_g(valueOf, (Modifier) null, m2546getWhite0d7_KjU2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4604mergedA7vx0o, composer, 384, 0, 65530);
        TextKt.m1845Text4IGK_g(String.valueOf(this.$streakInfo$inlined.a()), (Modifier) null, ColorKt.Color(4290398719L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, textStyle, composer, 384, 1572864, 65530);
        composer.endNode();
        long m2546getWhite0d7_KjU3 = companion3.m2546getWhite0d7_KjU();
        TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer, i12).getH4(), 0L, TextUnitKt.getSp(22), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, TextUnitKt.getSp(0), null, null, null, 0, 0, null, 16646141, null);
        boolean changed3 = composer.changed(component4);
        Object rememberedValue7 = composer.rememberedValue();
        if (changed3 || rememberedValue7 == companion2.getEmpty()) {
            rememberedValue7 = new HomeActivityKt.w0(component4);
            composer.updateRememberedValue(rememberedValue7);
        }
        TextKt.m1845Text4IGK_g("天", constraintLayoutScope.constrainAs(companion, component5, (x00.l) rememberedValue7), m2546getWhite0d7_KjU3, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4572copyp1EtxEg$default, composer, 390, 0, 65528);
        Composer composer2 = composer;
        b8 b8Var = this.$streakInfo$inlined;
        if (b8Var instanceof b8.a) {
            composer2.startReplaceGroup(2018363927);
            boolean changed4 = composer2.changed(component1);
            Object rememberedValue8 = composer2.rememberedValue();
            if (changed4 || rememberedValue8 == companion2.getEmpty()) {
                rememberedValue8 = new HomeActivityKt.x0(component1);
                composer2.updateRememberedValue(rememberedValue8);
            }
            Modifier constrainAs3 = constraintLayoutScope.constrainAs(companion, component6, (x00.l) rememberedValue8);
            Alignment.Horizontal centerHorizontally = companion4.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11)), centerHorizontally, composer2, 54);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, constrainAs3);
            x00.a<ComposeUiNode> constructor2 = companion5.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion5.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion4.getTop(), composer2, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
            x00.a<ComposeUiNode> constructor3 = companion5.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion5.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            i13 = 0;
            TextKt.m1845Text4IGK_g("获得奖励: ", (Modifier) null, companion3.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, materialTheme.getTypography(composer2, i12).getSubtitle2(), composer, 390, 0, 65530);
            TextKt.m1845Text4IGK_g(((b8.a) this.$streakInfo$inlined).k(), (Modifier) null, ColorKt.Color(4294952729L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, materialTheme.getTypography(composer, i12).getSubtitle2(), composer, 384, 0, 65530);
            composer.endNode();
            SurfaceKt.m1784SurfaceFjzlyU(null, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(12)), Color.m2508copywmQWz5c$default(companion3.m2535getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-617642222, true, new HomeActivityKt.y0(this.$streakInfo$inlined, this.$density$inlined), composer, 54), composer, 1573248, 57);
            TextKt.m1845Text4IGK_g("连续学习 " + ((b8.a) this.$streakInfo$inlined).i() + " 天，你将解锁更多奖励", (Modifier) null, Color.m2508copywmQWz5c$default(companion3.m2546getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, null), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, new TextStyle(0L, TextUnitKt.getSp(12), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, bk.k.l(), (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(12), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645981, (kotlin.jvm.internal.v) null), composer, 384, 0, 65530);
            composer2 = composer;
            composer2.endNode();
            composer2.endReplaceGroup();
        } else {
            if (b8Var instanceof b8.b) {
                composer2.startReplaceGroup(2021152625);
                long m2508copywmQWz5c$default = Color.m2508copywmQWz5c$default(companion3.m2535getBlack0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
                RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(12));
                boolean changed5 = composer2.changed(component1);
                Object rememberedValue9 = composer2.rememberedValue();
                if (changed5 || rememberedValue9 == companion2.getEmpty()) {
                    rememberedValue9 = new HomeActivityKt.q0(component1);
                    composer2.updateRememberedValue(rememberedValue9);
                }
                SurfaceKt.m1784SurfaceFjzlyU(constraintLayoutScope.constrainAs(companion, component6, (x00.l) rememberedValue9), m1019RoundedCornerShape0680j_4, m2508copywmQWz5c$default, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(10919749, true, new HomeActivityKt.r0(this.$streakInfo$inlined), composer2, 54), composer, 1573248, 56);
                composer2 = composer;
            } else {
                composer2.startReplaceGroup(1896525309);
            }
            composer2.endReplaceGroup();
        }
        composer2.endReplaceGroup();
        boolean changedInstance = composer2.changedInstance(this.$scope) | composer2.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final MutableState mutableState = this.$start;
        final MutableState mutableState2 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue10 = composer2.rememberedValue();
        if (changedInstance || rememberedValue10 == companion2.getEmpty()) {
            rememberedValue10 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$StreakPromptSheet$lambda$0$$inlined$ConstraintLayout$1.1
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
                    RawConstraintSet rawConstraintSet = new RawConstraintSet(ConstraintLayoutScope.this.getContainerObject().mo5597clone());
                    if (mutableState.getValue() != null && mutableState2.getValue() != null) {
                        oVar.m(rawConstraintSet);
                    } else {
                        mutableState.setValue(rawConstraintSet);
                        mutableState2.setValue(mutableState.getValue());
                    }
                }
            };
            composer2.updateRememberedValue(rememberedValue10);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue10, composer2, i13);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
