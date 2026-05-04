package com.baicizhan.main.home.player;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
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
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.player.AwardsKt;
import com.handmark.pulltorefresh.library.internal.RotateLoadingLayout;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2303:1\n86#2,2:2304\n88#2:2312\n89#2,10:2316\n100#2:2329\n101#2:2336\n106#2:2343\n109#2:2351\n112#2:2359\n115#2:2367\n118#2:2375\n121#2:2382\n124#2,4:2389\n128#2,4:2395\n132#2:2405\n143#2:2412\n149#2,2:2419\n142#2:2427\n160#2,2:2428\n166#2,3:2436\n159#2:2439\n187#2:2440\n192#2:2447\n186#2:2454\n201#2:2455\n209#2:2462\n215#2:2469\n216#2:2506\n218#2,4:2510\n217#2,6:2514\n225#2,5:2523\n230#2,6:2529\n224#2:2535\n238#2,6:2536\n237#2,9:2542\n248#2,2:2555\n254#2,3:2563\n247#2:2566\n288#2:2567\n291#2:2574\n1247#3,6:2306\n1247#3,3:2313\n1250#3,3:2326\n1247#3,6:2330\n1247#3,6:2337\n1247#3,6:2345\n1247#3,6:2353\n1247#3,6:2361\n1247#3,6:2369\n1247#3,6:2376\n1247#3,6:2383\n1247#3,6:2399\n1247#3,6:2406\n1247#3,6:2413\n1247#3,6:2421\n1247#3,6:2430\n1247#3,6:2441\n1247#3,6:2448\n1247#3,6:2456\n1247#3,6:2463\n1247#3,3:2507\n1250#3,3:2520\n1247#3,6:2557\n1247#3,6:2568\n1225#3,6:2575\n113#4:2344\n113#4:2352\n113#4:2360\n113#4:2368\n113#4:2394\n113#4:2528\n1#5:2393\n70#6:2470\n68#6,8:2471\n77#6:2554\n79#7,6:2479\n86#7,3:2494\n89#7,2:2503\n93#7:2553\n347#8,9:2485\n356#8:2505\n357#8,2:2551\n4206#9,6:2497\n*S KotlinDebug\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/AwardsKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n87#1:2306,6\n88#1:2313,3\n88#1:2326,3\n100#1:2330,6\n101#1:2337,6\n106#1:2345,6\n109#1:2353,6\n112#1:2361,6\n115#1:2369,6\n118#1:2376,6\n121#1:2383,6\n131#1:2399,6\n132#1:2406,6\n143#1:2413,6\n150#1:2421,6\n161#1:2430,6\n187#1:2441,6\n192#1:2448,6\n201#1:2456,6\n209#1:2463,6\n216#1:2507,3\n216#1:2520,3\n249#1:2557,6\n288#1:2568,6\n106#1:2344\n109#1:2352\n112#1:2360\n115#1:2368\n127#1:2394\n229#1:2528\n201#1:2470\n201#1:2471,8\n201#1:2554\n201#1:2479,6\n201#1:2494,3\n201#1:2503,2\n201#1:2553\n201#1:2485,9\n201#1:2505\n201#1:2551,2\n201#1:2497,6\n384#2:2575,6\n*E\n"})
/* loaded from: classes4.dex */
public final class AwardsKt$BookPlanMilestone$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {
    final /* synthetic */ String $bookName$inlined;
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ int $coinsCount$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ Density $density$inlined;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ int $learntCount$inlined;
    final /* synthetic */ x00.l $onDismiss$inlined;
    final /* synthetic */ x00.a $onOpen$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ c40.r0 $scope$inlined;
    final /* synthetic */ MutableState $start;
    final /* synthetic */ int $targetProgress$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwardsKt$BookPlanMilestone$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, int i11, int i12, Density density, c40.r0 r0Var, x00.a aVar, x00.l lVar, String str, int i13) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$targetProgress$inlined = i11;
        this.$coinsCount$inlined = i12;
        this.$density$inlined = density;
        this.$scope$inlined = r0Var;
        this.$onOpen$inlined = aVar;
        this.$onDismiss$inlined = lVar;
        this.$bookName$inlined = str;
        this.$learntCount$inlined = i13;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        boolean q11;
        boolean q12;
        boolean q13;
        boolean q14;
        boolean q15;
        boolean q16;
        boolean q17;
        boolean e11;
        boolean n11;
        MutableState mutableState;
        float p11;
        boolean e12;
        int l11;
        TextStyle m4604mergedA7vx0o;
        int l12;
        boolean q18;
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
        composer.startReplaceGroup(-1846378759);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        ConstrainedLayoutReference component4 = createRefs.component4();
        ConstrainedLayoutReference component5 = createRefs.component5();
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState2 = (MutableState) rememberedValue;
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new com.esotericsoftware.spine.android.c(AwardsKt.m.f23075a);
            composer.updateRememberedValue(rememberedValue2);
        }
        com.esotericsoftware.spine.android.c cVar = (com.esotericsoftware.spine.android.c) rememberedValue2;
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        q11 = AwardsKt.q(mutableState3);
        float f11 = q11 ? 1.0f : 0.0f;
        TweenSpec tween$default = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        Object rememberedValue4 = composer.rememberedValue();
        if (rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new AwardsKt.t(mutableState2);
            composer.updateRememberedValue(rememberedValue4);
        }
        State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f11, tween$default, 0.0f, null, (x00.l) rememberedValue4, composer, 24624, 12);
        q12 = AwardsKt.q(mutableState3);
        float m5115constructorimpl = Dp.m5115constructorimpl(q12 ? 0 : 4);
        TweenSpec tween$default2 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        Object rememberedValue5 = composer.rememberedValue();
        if (rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = AwardsKt.n.f23077a;
            composer.updateRememberedValue(rememberedValue5);
        }
        State<Dp> m125animateDpAsStateAjpBEmI = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(m5115constructorimpl, tween$default2, null, (x00.l) rememberedValue5, composer, 3120, 4);
        q13 = AwardsKt.q(mutableState3);
        float m5115constructorimpl2 = Dp.m5115constructorimpl(q13 ? 0 : 66);
        TweenSpec tween$default3 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        Object rememberedValue6 = composer.rememberedValue();
        if (rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = AwardsKt.p.f23079a;
            composer.updateRememberedValue(rememberedValue6);
        }
        State<Dp> m125animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(m5115constructorimpl2, tween$default3, null, (x00.l) rememberedValue6, composer, 3120, 4);
        q14 = AwardsKt.q(mutableState3);
        float m5115constructorimpl3 = Dp.m5115constructorimpl(q14 ? 0 : -4);
        TweenSpec tween$default4 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        Object rememberedValue7 = composer.rememberedValue();
        if (rememberedValue7 == companion.getEmpty()) {
            rememberedValue7 = AwardsKt.o.f23078a;
            composer.updateRememberedValue(rememberedValue7);
        }
        State<Dp> m125animateDpAsStateAjpBEmI3 = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(m5115constructorimpl3, tween$default4, null, (x00.l) rememberedValue7, composer, 3120, 4);
        q15 = AwardsKt.q(mutableState3);
        float m5115constructorimpl4 = Dp.m5115constructorimpl(q15 ? 0 : 80);
        TweenSpec tween$default5 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        Object rememberedValue8 = composer.rememberedValue();
        if (rememberedValue8 == companion.getEmpty()) {
            rememberedValue8 = AwardsKt.q.f23080a;
            composer.updateRememberedValue(rememberedValue8);
        }
        State<Dp> m125animateDpAsStateAjpBEmI4 = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(m5115constructorimpl4, tween$default5, null, (x00.l) rememberedValue8, composer, 3120, 4);
        q16 = AwardsKt.q(mutableState3);
        int i12 = q16 ? this.$targetProgress$inlined : 0;
        TweenSpec tween$default6 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        Object rememberedValue9 = composer.rememberedValue();
        if (rememberedValue9 == companion.getEmpty()) {
            rememberedValue9 = AwardsKt.r.f23081a;
            composer.updateRememberedValue(rememberedValue9);
        }
        State<Integer> animateIntAsState = AnimateAsStateKt.animateIntAsState(i12, tween$default6, null, (x00.l) rememberedValue9, composer, 3120, 4);
        q17 = AwardsKt.q(mutableState3);
        int i13 = q17 ? this.$coinsCount$inlined : 0;
        TweenSpec tween$default7 = AnimationSpecKt.tween$default(500, 0, null, 6, null);
        Object rememberedValue10 = composer.rememberedValue();
        if (rememberedValue10 == companion.getEmpty()) {
            rememberedValue10 = AwardsKt.l.f23074a;
            composer.updateRememberedValue(rememberedValue10);
        }
        State<Integer> animateIntAsState2 = AnimateAsStateKt.animateIntAsState(i13, tween$default7, null, (x00.l) rememberedValue10, composer, 3120, 4);
        InfiniteTransition rememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composer, 0, 1);
        e11 = AwardsKt.e(mutableState2);
        State<Float> animateFloat = InfiniteTransitionKt.animateFloat(rememberInfiniteTransition, 0.0f, e11 ? this.$density$inlined.mo377toPx0680j_4(Dp.m5115constructorimpl(8)) : 0.0f, new InfiniteRepeatableSpec(AnimationSpecKt.tween$default(RotateLoadingLayout.f35182s, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Reverse, StartOffset.m168constructorimpl$default(200, 0, 2, null), (kotlin.jvm.internal.v) null), "offset-anim", composer, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
        Object rememberedValue11 = composer.rememberedValue();
        if (rememberedValue11 == companion.getEmpty()) {
            rememberedValue11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState4 = (MutableState) rememberedValue11;
        n11 = AwardsKt.n(mutableState4);
        float f12 = n11 ? 1.0f : 0.1f;
        TweenSpec tween$default8 = AnimationSpecKt.tween$default(400, 0, null, 6, null);
        boolean changedInstance = composer.changedInstance(cVar) | composer.changedInstance(this.$scope$inlined) | composer.changed(this.$onOpen$inlined);
        Object rememberedValue12 = composer.rememberedValue();
        if (changedInstance || rememberedValue12 == companion.getEmpty()) {
            mutableState = mutableState3;
            rememberedValue12 = new AwardsKt.s(cVar, this.$scope$inlined, this.$onOpen$inlined, mutableState);
            composer.updateRememberedValue(rememberedValue12);
        } else {
            mutableState = mutableState3;
        }
        MutableState mutableState5 = mutableState;
        State<Float> animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f12, tween$default8, 0.0f, null, (x00.l) rememberedValue12, composer, 48, 12);
        Modifier.Companion companion2 = Modifier.Companion;
        Object rememberedValue13 = composer.rememberedValue();
        if (rememberedValue13 == companion.getEmpty()) {
            rememberedValue13 = AwardsKt.a.f23053a;
            composer.updateRememberedValue(rememberedValue13);
        }
        Modifier constrainAs = constraintLayoutScope.constrainAs(companion2, component1, (x00.l) rememberedValue13);
        p11 = AwardsKt.p(animateFloatAsState2);
        Modifier scale = ScaleKt.scale(constrainAs, p11);
        boolean changedInstance2 = composer.changedInstance(cVar);
        Object rememberedValue14 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue14 == companion.getEmpty()) {
            rememberedValue14 = new AwardsKt.e(cVar);
            composer.updateRememberedValue(rememberedValue14);
        }
        AndroidView_androidKt.AndroidView((x00.l) rememberedValue14, scale, null, composer, 0, 4);
        e12 = AwardsKt.e(mutableState2);
        boolean changed = composer.changed(component1);
        Object rememberedValue15 = composer.rememberedValue();
        if (changed || rememberedValue15 == companion.getEmpty()) {
            rememberedValue15 = new AwardsKt.f(component1);
            composer.updateRememberedValue(rememberedValue15);
        }
        AnimatedVisibilityKt.AnimatedVisibility(e12, constraintLayoutScope.constrainAs(companion2, component2, (x00.l) rememberedValue15), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-827587979, true, new AwardsKt.g(this.$onDismiss$inlined), composer, 54), composer, 200064, 16);
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_home_coin_bonus, composer, 6);
        boolean changed2 = composer.changed(component1);
        Object rememberedValue16 = composer.rememberedValue();
        if (changed2 || rememberedValue16 == companion.getEmpty()) {
            rememberedValue16 = new AwardsKt.h(component1);
            composer.updateRememberedValue(rememberedValue16);
        }
        Modifier constrainAs2 = constraintLayoutScope.constrainAs(companion2, component3, (x00.l) rememberedValue16);
        boolean changed3 = composer.changed(animateFloatAsState) | composer.changed(m125animateDpAsStateAjpBEmI) | composer.changed(m125animateDpAsStateAjpBEmI2) | composer.changed(animateFloat);
        Object rememberedValue17 = composer.rememberedValue();
        if (changed3 || rememberedValue17 == companion.getEmpty()) {
            rememberedValue17 = new AwardsKt.i(animateFloatAsState, m125animateDpAsStateAjpBEmI, m125animateDpAsStateAjpBEmI2, animateFloat);
            composer.updateRememberedValue(rememberedValue17);
        }
        ImageKt.Image(painterResource, "", GraphicsLayerModifierKt.graphicsLayer(constrainAs2, (x00.l) rememberedValue17), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        boolean changed4 = composer.changed(component1);
        Object rememberedValue18 = composer.rememberedValue();
        if (changed4 || rememberedValue18 == companion.getEmpty()) {
            rememberedValue18 = new AwardsKt.j(component1);
            composer.updateRememberedValue(rememberedValue18);
        }
        Modifier constrainAs3 = constraintLayoutScope.constrainAs(companion2, component4, (x00.l) rememberedValue18);
        boolean changed5 = composer.changed(animateFloatAsState) | composer.changed(m125animateDpAsStateAjpBEmI3) | composer.changed(m125animateDpAsStateAjpBEmI4) | composer.changed(animateFloat);
        Object rememberedValue19 = composer.rememberedValue();
        if (changed5 || rememberedValue19 == companion.getEmpty()) {
            rememberedValue19 = new AwardsKt.k(animateFloatAsState, m125animateDpAsStateAjpBEmI3, m125animateDpAsStateAjpBEmI4, animateFloat);
            composer.updateRememberedValue(rememberedValue19);
        }
        Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(constrainAs3, (x00.l) rememberedValue19);
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, graphicsLayer);
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
        Object rememberedValue20 = composer.rememberedValue();
        if (rememberedValue20 == companion.getEmpty()) {
            rememberedValue20 = new TextStyle(0L, TextUnitKt.getSp(24), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, bk.k.n(), (String) null, TextUnitKt.getSp(0), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645981, (kotlin.jvm.internal.v) null);
            composer.updateRememberedValue(rememberedValue20);
        }
        TextStyle textStyle = (TextStyle) rememberedValue20;
        l11 = AwardsKt.l(animateIntAsState2);
        long Color = ColorKt.Color(4292510720L);
        m4604mergedA7vx0o = textStyle.m4604mergedA7vx0o((r60 & 1) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 2) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 4) != 0 ? null : null, (r60 & 8) != 0 ? null : null, (r60 & 16) != 0 ? null : null, (r60 & 32) != 0 ? null : null, (r60 & 64) != 0 ? null : null, (r60 & 128) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 256) != 0 ? null : null, (r60 & 512) != 0 ? null : null, (r60 & 1024) != 0 ? null : null, (r60 & 2048) != 0 ? Color.Companion.m2545getUnspecified0d7_KjU() : 0L, (r60 & 4096) != 0 ? null : null, (r60 & 8192) != 0 ? null : null, (r60 & 16384) != 0 ? null : new Stroke(this.$density$inlined.mo377toPx0680j_4(Dp.m5115constructorimpl(2)), 0.0f, 0, StrokeJoin.Companion.m2874getRoundLxFBmk8(), null, 22, null), (r60 & 32768) != 0 ? TextAlign.Companion.m4983getUnspecifiede0LSkKk() : 0, (r60 & 65536) != 0 ? TextDirection.Companion.m4996getUnspecifieds_7Xco() : 0, (r60 & 131072) != 0 ? TextUnit.Companion.m5320getUnspecifiedXSAIIZE() : 0L, (r60 & 262144) != 0 ? null : null, (r60 & 524288) != 0 ? null : null, (r60 & 1048576) != 0 ? LineBreak.Companion.m4898getUnspecifiedrAG3T2k() : 0, (r60 & 2097152) != 0 ? Hyphens.Companion.m4877getUnspecifiedvmbZdU8() : 0, (r60 & 4194304) != 0 ? null : null, (r60 & 8388608) != 0 ? null : null);
        TextOverflow.Companion companion4 = TextOverflow.Companion;
        int m5029getEllipsisgIe3tQ8 = companion4.m5029getEllipsisgIe3tQ8();
        TextAlign.Companion companion5 = TextAlign.Companion;
        TextKt.m1845Text4IGK_g("+" + l11, (Modifier) null, Color, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(companion5.m4977getCentere0LSkKk()), 0L, m5029getEllipsisgIe3tQ8, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4604mergedA7vx0o, composer, 384, 3120, 54778);
        l12 = AwardsKt.l(animateIntAsState2);
        TextKt.m1845Text4IGK_g("+" + l12, (Modifier) null, Color.Companion.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(companion5.m4977getCentere0LSkKk()), 0L, companion4.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, textStyle, composer, 384, 1575984, 54778);
        composer.endNode();
        q18 = AwardsKt.q(mutableState5);
        boolean changed6 = composer.changed(component1);
        Object rememberedValue21 = composer.rememberedValue();
        if (changed6 || rememberedValue21 == companion.getEmpty()) {
            rememberedValue21 = new AwardsKt.b(component1);
            composer.updateRememberedValue(rememberedValue21);
        }
        AnimatedVisibilityKt.AnimatedVisibility(q18, constraintLayoutScope.constrainAs(companion2, component5, (x00.l) rememberedValue21), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1500768404, true, new AwardsKt.c(this.$bookName$inlined, this.$learntCount$inlined, animateIntAsState), composer, 54), composer, 200064, 16);
        Object rememberedValue22 = composer.rememberedValue();
        if (rememberedValue22 == companion.getEmpty()) {
            rememberedValue22 = new AwardsKt.d(mutableState4, null);
            composer.updateRememberedValue(rememberedValue22);
        }
        EffectsKt.LaunchedEffect(cVar, (x00.p<? super c40.r0, ? super j00.c<? super yz.g2>, ? extends Object>) rememberedValue22, composer, 0);
        composer.endReplaceGroup();
        boolean changedInstance3 = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final MutableState mutableState6 = this.$start;
        final MutableState mutableState7 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue23 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue23 == companion.getEmpty()) {
            rememberedValue23 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.AwardsKt$BookPlanMilestone$$inlined$ConstraintLayout$1.1
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
                    if (mutableState6.getValue() != null && mutableState7.getValue() != null) {
                        oVar.m(rawConstraintSet);
                    } else {
                        mutableState6.setValue(rawConstraintSet);
                        mutableState7.setValue(mutableState6.getValue());
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue23);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue23, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
