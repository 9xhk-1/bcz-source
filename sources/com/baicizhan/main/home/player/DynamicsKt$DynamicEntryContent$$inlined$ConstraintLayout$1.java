package com.baicizhan.main.home.player;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.player.DynamicsKt;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2303:1\n116#2,11:2304\n132#2,7:2321\n140#2,3:2364\n143#2:2368\n165#2:2369\n168#2,3:2374\n175#2:2383\n167#2:2384\n179#2,2:2385\n185#2:2393\n189#2,10:2395\n203#2:2411\n204#2:2413\n205#2:2415\n195#2:2417\n209#2,4:2418\n215#2:2428\n208#2,11:2430\n220#2,5:2444\n228#2:2455\n229#2:2462\n222#2:2469\n240#2,3:2470\n1247#3,6:2315\n1247#3,6:2377\n1247#3,6:2387\n1247#3,6:2405\n1247#3,6:2422\n1247#3,6:2449\n1247#3,6:2456\n1247#3,6:2463\n1225#3,6:2473\n70#4:2328\n68#4,8:2329\n77#4:2373\n79#5,6:2337\n86#5,3:2352\n89#5,2:2361\n93#5:2372\n347#6,9:2343\n356#6:2363\n357#6,2:2370\n4206#7,6:2355\n113#8:2367\n113#8:2394\n113#8:2412\n113#8:2414\n113#8:2416\n113#8:2429\n113#8:2443\n75#9:2441\n1#10:2442\n*S KotlinDebug\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/DynamicsKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n126#1:2315,6\n170#1:2377,6\n180#1:2387,6\n198#1:2405,6\n212#1:2422,6\n224#1:2449,6\n228#1:2456,6\n229#1:2463,6\n125#1:2328\n125#1:2329,8\n125#1:2373\n125#1:2337,6\n125#1:2352,3\n125#1:2361,2\n125#1:2372\n125#1:2343,9\n125#1:2363\n125#1:2370,2\n125#1:2355,6\n142#1:2367\n185#1:2394\n203#1:2412\n204#1:2414\n205#1:2416\n215#1:2429\n218#1:2443\n218#1:2441\n384#2:2473,6\n*E\n"})
/* loaded from: classes4.dex */
public final class DynamicsKt$DynamicEntryContent$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ q1 $item$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $slotContent$delegate$inlined;
    final /* synthetic */ MutableState $start;
    final /* synthetic */ x00.r $status$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicsKt$DynamicEntryContent$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, q1 q1Var, x00.r rVar) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$slotContent$delegate$inlined = mutableState4;
        this.$item$inlined = q1Var;
        this.$status$inlined = rVar;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        ConstraintLayoutScope constraintLayoutScope;
        ConstrainedLayoutReference constrainedLayoutReference;
        Modifier.Companion companion;
        ConstrainedLayoutReference constrainedLayoutReference2;
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
        ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        composer.startReplaceGroup(1736545425);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        ConstrainedLayoutReference component4 = createRefs.component4();
        ConstrainedLayoutReference component5 = createRefs.component5();
        ConstrainedLayoutReference component6 = createRefs.component6();
        Modifier.Companion companion2 = Modifier.Companion;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.Companion;
        if (rememberedValue == companion3.getEmpty()) {
            rememberedValue = DynamicsKt.a.f23095a;
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier m2669graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(constraintLayoutScope2.constrainAs(companion2, component1, (x00.l) rememberedValue), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 126975, null);
        composer.startReplaceGroup(-221059305);
        composer.endReplaceGroup();
        Modifier then = m2669graphicsLayerAp8cVGQ$default.then(companion2);
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
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
        Color.Companion companion5 = Color.Companion;
        BoxKt.Box(SizeKt.fillMaxSize$default(BackgroundKt.m234backgroundbw27NRU(companion2, Color.m2508copywmQWz5c$default(companion5.m2535getBlack0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(12))), 0.0f, 1, null), composer, 0);
        composer.endNode();
        Painter painterResource = PainterResources_androidKt.painterResource(this.$item$inlined.m(), composer, 0);
        boolean changed = composer.changed(component1);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion3.getEmpty()) {
            rememberedValue2 = new DynamicsKt.b(component1);
            composer.updateRememberedValue(rememberedValue2);
        }
        ImageKt.Image(painterResource, "de-image", constraintLayoutScope2.constrainAs(companion2, component2, (x00.l) rememberedValue2), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, composer, 24624, 104);
        Composer composer2 = composer;
        if (this.$item$inlined.q() != null) {
            composer2.startReplaceGroup(1738821630);
            x00.r rVar = this.$status$inlined;
            q1 q1Var = this.$item$inlined;
            boolean changed2 = composer2.changed(component1);
            Object rememberedValue3 = composer2.rememberedValue();
            if (changed2 || rememberedValue3 == companion3.getEmpty()) {
                rememberedValue3 = new DynamicsKt.c(component1);
                composer2.updateRememberedValue(rememberedValue3);
            }
            rVar.invoke(q1Var, OffsetKt.m685offsetVpY3zN4(constraintLayoutScope2.constrainAs(companion2, component6, (x00.l) rememberedValue3), Dp.m5115constructorimpl(10), Dp.m5115constructorimpl(-10)), composer2, 0);
        } else {
            composer2.startReplaceGroup(1732279731);
        }
        composer2.endReplaceGroup();
        if (this.$item$inlined.n().length() > 0) {
            composer2.startReplaceGroup(1739163002);
            String n11 = this.$item$inlined.n();
            long m2546getWhite0d7_KjU = companion5.m2546getWhite0d7_KjU();
            TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getCaption(), 0L, 0L, FontWeight.Companion.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
            int m4977getCentere0LSkKk = TextAlign.Companion.m4977getCentere0LSkKk();
            int m5029getEllipsisgIe3tQ8 = TextOverflow.Companion.m5029getEllipsisgIe3tQ8();
            boolean changed3 = composer2.changed(component1);
            Object rememberedValue4 = composer2.rememberedValue();
            if (changed3 || rememberedValue4 == companion3.getEmpty()) {
                rememberedValue4 = new DynamicsKt.d(component1);
                composer2.updateRememberedValue(rememberedValue4);
            }
            float f11 = 1;
            companion = companion2;
            constrainedLayoutReference2 = component3;
            constrainedLayoutReference = component1;
            constraintLayoutScope = constraintLayoutScope2;
            TextKt.m1845Text4IGK_g(n11, PaddingKt.m727paddingVpY3zN4(BackgroundKt.m234backgroundbw27NRU(OffsetKt.m686offsetVpY3zN4$default(constraintLayoutScope2.constrainAs(companion2, component4, (x00.l) rememberedValue4), 0.0f, Dp.m5115constructorimpl(9), 1, null), ColorKt.Color(4285235629L), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100))), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(f11)), m2546getWhite0d7_KjU, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(m4977getCentere0LSkKk), 0L, m5029getEllipsisgIe3tQ8, false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4572copyp1EtxEg$default, composer, 384, 3120, 54776);
            composer2 = composer;
        } else {
            constraintLayoutScope = constraintLayoutScope2;
            constrainedLayoutReference = component1;
            companion = companion2;
            constrainedLayoutReference2 = component3;
            composer2.startReplaceGroup(1732279731);
        }
        composer2.endReplaceGroup();
        String r11 = this.$item$inlined.r();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i12 = MaterialTheme.$stable;
        long Q = bk.b.Q(materialTheme.getColors(composer2, i12));
        TextStyle caption = materialTheme.getTypography(composer2, i12).getCaption();
        ConstrainedLayoutReference constrainedLayoutReference3 = constrainedLayoutReference;
        boolean changed4 = composer2.changed(constrainedLayoutReference3);
        Object rememberedValue5 = composer2.rememberedValue();
        if (changed4 || rememberedValue5 == companion3.getEmpty()) {
            rememberedValue5 = new DynamicsKt.e(constrainedLayoutReference3);
            composer2.updateRememberedValue(rememberedValue5);
        }
        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
        Modifier.Companion companion6 = companion;
        TextKt.m1845Text4IGK_g(r11, PaddingKt.m730paddingqDBjuR0$default(constraintLayoutScope3.constrainAs(companion6, constrainedLayoutReference2, (x00.l) rememberedValue5), 0.0f, Dp.m5115constructorimpl(this.$item$inlined.n().length() > 0 ? 11 : 2), 0.0f, 0.0f, 13, null), Q, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, caption, composer, 0, 0, 65528);
        int mo371roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo371roundToPx0680j_4(Dp.m5115constructorimpl(-6));
        Pair k11 = DynamicsKt.k(this.$slotContent$delegate$inlined);
        if (k11 == null) {
            composer.startReplaceGroup(1740396150);
        } else {
            composer.startReplaceGroup(1740396151);
            int intValue = ((Number) k11.component1()).intValue();
            String str = (String) k11.component2();
            boolean z11 = intValue == 1;
            Modifier m2669graphicsLayerAp8cVGQ$default2 = GraphicsLayerModifierKt.m2669graphicsLayerAp8cVGQ$default(companion6, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 126975, null);
            boolean changed5 = composer.changed(constrainedLayoutReference3);
            Object rememberedValue6 = composer.rememberedValue();
            if (changed5 || rememberedValue6 == companion3.getEmpty()) {
                rememberedValue6 = new DynamicsKt.f(constrainedLayoutReference3);
                composer.updateRememberedValue(rememberedValue6);
            }
            Modifier constrainAs = constraintLayoutScope3.constrainAs(m2669graphicsLayerAp8cVGQ$default2, component5, (x00.l) rememberedValue6);
            EnterTransition plus = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.m77scaleInL8ZKhE$default(null, 0.5f, TransformOriginKt.TransformOrigin(0.0f, 0.5f), 1, null));
            boolean changed6 = composer.changed(mo371roundToPx0680j_4);
            Object rememberedValue7 = composer.rememberedValue();
            if (changed6 || rememberedValue7 == companion3.getEmpty()) {
                rememberedValue7 = new DynamicsKt.g(mo371roundToPx0680j_4);
                composer.updateRememberedValue(rememberedValue7);
            }
            EnterTransition plus2 = plus.plus(EnterExitTransitionKt.slideInHorizontally$default(null, (x00.l) rememberedValue7, 1, null));
            ExitTransition plus3 = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.m79scaleOutL8ZKhE$default(null, 0.5f, TransformOriginKt.TransformOrigin(0.0f, 0.5f), 1, null));
            boolean changed7 = composer.changed(mo371roundToPx0680j_4);
            Object rememberedValue8 = composer.rememberedValue();
            if (changed7 || rememberedValue8 == companion3.getEmpty()) {
                rememberedValue8 = new DynamicsKt.h(mo371roundToPx0680j_4);
                composer.updateRememberedValue(rememberedValue8);
            }
            AnimatedVisibilityKt.AnimatedVisibility(z11, constrainAs, plus2, plus3.plus(EnterExitTransitionKt.slideOutHorizontally$default(null, (x00.l) rememberedValue8, 1, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-1269710046, true, new DynamicsKt.i(str), composer, 54), composer, 196608, 16);
        }
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope4 = this.$scope;
        final MutableState mutableState = this.$start;
        final MutableState mutableState2 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue9 = composer.rememberedValue();
        if (changedInstance || rememberedValue9 == companion3.getEmpty()) {
            rememberedValue9 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.DynamicsKt$DynamicEntryContent$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(rememberedValue9);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue9, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
