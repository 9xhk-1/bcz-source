package com.baicizhan.main.home.player;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.player.HomeActivityKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2303:1\n2068#2,3:2304\n2075#2,2:2313\n2074#2,6:2315\n2083#2:2327\n2107#2,2:2329\n2112#2:2337\n2119#2:2344\n2122#2:2351\n2123#2,10:2389\n2133#2:2403\n1247#3,6:2307\n1247#3,6:2321\n1247#3,6:2331\n1247#3,6:2338\n1247#3,6:2345\n1225#3,6:2404\n113#4:2328\n99#5:2352\n96#5,9:2353\n106#5:2402\n79#6,6:2362\n86#6,3:2377\n89#6,2:2386\n93#6:2401\n347#7,9:2368\n356#7:2388\n357#7,2:2399\n4206#8,6:2380\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n2070#1:2307,6\n2079#1:2321,6\n2108#1:2331,6\n2112#1:2338,6\n2119#1:2345,6\n2083#1:2328\n2119#1:2352\n2119#1:2353,9\n2119#1:2402\n2119#1:2362,6\n2119#1:2377,3\n2119#1:2386,2\n2119#1:2401\n2119#1:2368,9\n2119#1:2388\n2119#1:2399,2\n2119#1:2380,6\n384#2:2404,6\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeActivityKt$Freshman$lambda$1$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ wg.q $model$inlined;
    final /* synthetic */ x00.a $onDismiss$inlined;
    final /* synthetic */ x00.p $onStart$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivityKt$Freshman$lambda$1$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, wg.q qVar, x00.p pVar, x00.a aVar) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$model$inlined = qVar;
        this.$onStart$inlined = pVar;
        this.$onDismiss$inlined = aVar;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
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
        composer.startReplaceGroup(-1873002527);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        ConstrainedLayoutReference component4 = createRefs.component4();
        Modifier.Companion companion = Modifier.Companion;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = HomeActivityKt.h.f23201a;
            composer.updateRememberedValue(rememberedValue);
        }
        TextKt.m1845Text4IGK_g("今日计划", constraintLayoutScope.constrainAs(companion, component1, (x00.l) rememberedValue), ColorKt.Color(4281151299L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getH4(), composer, 390, 0, 65528);
        boolean changed = composer.changed(component1);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new HomeActivityKt.i(component1);
            composer.updateRememberedValue(rememberedValue2);
        }
        Modifier constrainAs = constraintLayoutScope.constrainAs(companion, component2, (x00.l) rememberedValue2);
        RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(32));
        s sVar = s.f23970a;
        SurfaceKt.m1784SurfaceFjzlyU(constrainAs, m1019RoundedCornerShape0680j_4, 0L, 0L, null, 0.0f, sVar.k(), composer, 1572864, 60);
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.btn_start_freshman_learning, composer, 6);
        boolean changed2 = composer.changed(component2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = new HomeActivityKt.j(component2);
            composer.updateRememberedValue(rememberedValue3);
        }
        Modifier constrainAs2 = constraintLayoutScope.constrainAs(companion, component4, (x00.l) rememberedValue3);
        boolean changedInstance = composer.changedInstance(this.$model$inlined) | composer.changedInstance(this.$onStart$inlined) | composer.changed(this.$onDismiss$inlined);
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == companion2.getEmpty()) {
            rememberedValue4 = new HomeActivityKt.k(this.$model$inlined, this.$onStart$inlined, this.$onDismiss$inlined);
            composer.updateRememberedValue(rememberedValue4);
        }
        ImageKt.Image(painterResource, "", ComposeUtilsKt.k(constrainAs2, 0L, false, (x00.a) rememberedValue4, 3, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        boolean changed3 = composer.changed(component4);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed3 || rememberedValue5 == companion2.getEmpty()) {
            rememberedValue5 = new HomeActivityKt.l(component4);
            composer.updateRememberedValue(rememberedValue5);
        }
        Modifier constrainAs3 = constraintLayoutScope.constrainAs(companion, component3, (x00.l) rememberedValue5);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer, 48);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, constrainAs3);
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
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(ColorKt.Color(4286744232L))), sVar.h(), composer, 48 | ProvidedValue.$stable);
        composer.endNode();
        composer.endReplaceGroup();
        boolean changedInstance2 = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final MutableState mutableState = this.$start;
        final MutableState mutableState2 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue6 == companion2.getEmpty()) {
            rememberedValue6 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$Freshman$lambda$1$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(rememberedValue6);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue6, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
