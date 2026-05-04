package com.baicizhan.main.home.player.settings;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.MaterialTheme;
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
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.player.l7;
import com.baicizhan.main.home.player.settings.UserKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.Lambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 User.kt\ncom/baicizhan/main/home/player/settings/UserKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,2303:1\n92#2,2:2304\n94#2:2307\n98#2,3:2314\n103#2,10:2323\n115#2:2339\n116#2,9:2377\n128#2,2:2390\n132#2:2398\n133#2,3:2400\n127#2,8:2403\n126#2:2411\n139#2,3:2412\n144#2:2422\n148#2:2430\n138#2:2431\n153#2,2:2432\n157#2:2441\n161#2:2449\n152#2:2450\n151#2:2451\n163#2:2452\n113#3:2306\n113#3:2399\n113#3:2415\n113#3:2423\n113#3:2434\n113#3:2442\n1247#4,6:2308\n1247#4,6:2317\n1247#4,6:2333\n1247#4,6:2392\n1247#4,6:2416\n1247#4,6:2424\n1247#4,6:2435\n1247#4,6:2443\n1225#4,6:2453\n99#5:2340\n96#5,9:2341\n106#5:2389\n79#6,6:2350\n86#6,3:2365\n89#6,2:2374\n93#6:2388\n347#7,9:2356\n356#7:2376\n357#7,2:2386\n4206#8,6:2368\n*S KotlinDebug\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/UserKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n93#1:2306\n132#1:2399\n141#1:2415\n144#1:2423\n154#1:2434\n157#1:2442\n94#1:2308,6\n100#1:2317,6\n112#1:2333,6\n129#1:2392,6\n141#1:2416,6\n144#1:2424,6\n154#1:2435,6\n157#1:2443,6\n112#1:2340\n112#1:2341,9\n112#1:2389\n112#1:2350,6\n112#1:2365,3\n112#1:2374,2\n112#1:2388\n112#1:2356,9\n112#1:2376\n112#1:2386,2\n112#1:2368,6\n384#2:2453,6\n*E\n"})
/* loaded from: classes4.dex */
public final class UserKt$UserPage$lambda$0$0$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, g2> {
    final /* synthetic */ String $avatarUrl$inlined;
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ int $id$inlined;
    final /* synthetic */ String $levelDescription$inlined;
    final /* synthetic */ String $name$inlined;
    final /* synthetic */ x00.l $onIdClick$inlined;
    final /* synthetic */ x00.a $onLevelClick$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ c40.r0 $scope$inlined;
    final /* synthetic */ MutableState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserKt$UserPage$lambda$0$0$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, c40.r0 r0Var, String str, String str2, int i11, x00.l lVar, x00.a aVar, String str3) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$scope$inlined = r0Var;
        this.$avatarUrl$inlined = str;
        this.$name$inlined = str2;
        this.$id$inlined = i11;
        this.$onIdClick$inlined = lVar;
        this.$onLevelClick$inlined = aVar;
        this.$levelDescription$inlined = str3;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        String A;
        if ((i11 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74958949, i11, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
        }
        this.$contentTracker.setValue(g2.f100423a);
        if (this.$compositionSource.getValue() == CompositionSource.Unknown) {
            this.$compositionSource.setValue(CompositionSource.Content);
        }
        this.$scope.reset();
        ConstraintLayoutScope constraintLayoutScope = this.$scope;
        composer.startReplaceGroup(990669020);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        ConstrainedLayoutReference component4 = createRefs.component4();
        ConstrainedLayoutReference component5 = createRefs.component5();
        ConstrainedLayoutReference component6 = createRefs.component6();
        float m5115constructorimpl = Dp.m5115constructorimpl(3);
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.bg_home_user_info, composer, 6);
        Modifier.Companion companion = Modifier.Companion;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = new UserKt.a(m5115constructorimpl);
            composer.updateRememberedValue(rememberedValue);
        }
        ImageKt.Image(painterResource, (String) null, constraintLayoutScope.constrainAs(companion, component1, (x00.l) rememberedValue), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, composer, 24624, 104);
        boolean changed = composer.changed(component1);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new UserKt.d(component1, m5115constructorimpl);
            composer.updateRememberedValue(rememberedValue2);
        }
        Modifier constrainAs = constraintLayoutScope.constrainAs(companion, component2, (x00.l) rememberedValue2);
        composer.startReplaceGroup(2110198106);
        composer.endReplaceGroup();
        UserKt.o(constrainAs.then(companion), this.$avatarUrl$inlined, null, composer, 0, 4);
        boolean changed2 = composer.changed(component2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = new UserKt.e(component2, m5115constructorimpl);
            composer.updateRememberedValue(rememberedValue3);
        }
        Modifier constrainAs2 = constraintLayoutScope.constrainAs(companion, component6, (x00.l) rememberedValue3);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), composer, 48);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, constrainAs2);
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
        x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m2499boximpl(ColorKt.Color(4292141307L))), f.f24033a.b(), composer, ProvidedValue.$stable | 48);
        composer.endNode();
        long Color = ColorKt.Color(4294244350L);
        boolean changed3 = composer.changed(component2);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == companion2.getEmpty()) {
            rememberedValue4 = new UserKt.f(component2);
            composer.updateRememberedValue(rememberedValue4);
        }
        Modifier m780widthInVpY3zN4$default = SizeKt.m780widthInVpY3zN4$default(constraintLayoutScope.constrainAs(companion, component3, (x00.l) rememberedValue4), 0.0f, Dp.m5115constructorimpl(200), 1, null);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i12 = MaterialTheme.$stable;
        TextKt.m1845Text4IGK_g(this.$name$inlined, m780widthInVpY3zN4$default, Color, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, l7.P(materialTheme.getTypography(composer, i12).getH4(), 0L, 0, composer, 0, 3), composer, 384, 3120, 55288);
        A = UserKt.A(this.$id$inlined);
        String str = "百词斩id：" + A;
        long Color2 = ColorKt.Color(4292141307L);
        float f11 = -4;
        Modifier m686offsetVpY3zN4$default = OffsetKt.m686offsetVpY3zN4$default(companion, 0.0f, Dp.m5115constructorimpl(f11), 1, null);
        boolean changed4 = composer.changed(this.$onIdClick$inlined) | composer.changed(this.$id$inlined);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed4 || rememberedValue5 == companion2.getEmpty()) {
            rememberedValue5 = new UserKt.g(this.$onIdClick$inlined, this.$id$inlined);
            composer.updateRememberedValue(rememberedValue5);
        }
        Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(ComposeUtilsKt.k(m686offsetVpY3zN4$default, 0L, false, (x00.a) rememberedValue5, 3, null), 0.0f, Dp.m5115constructorimpl(8), 1, null);
        boolean changed5 = composer.changed(component3);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed5 || rememberedValue6 == companion2.getEmpty()) {
            rememberedValue6 = new UserKt.h(component3);
            composer.updateRememberedValue(rememberedValue6);
        }
        Modifier constrainAs3 = constraintLayoutScope.constrainAs(m728paddingVpY3zN4$default, component4, (x00.l) rememberedValue6);
        TextStyle subtitle2 = materialTheme.getTypography(composer, i12).getSubtitle2();
        FontWeight.Companion companion4 = FontWeight.Companion;
        TextKt.m1845Text4IGK_g(str, constrainAs3, Color2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(subtitle2, 0L, 0L, companion4.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 384, 0, 65528);
        long Color3 = ColorKt.Color(4289643768L);
        Modifier m686offsetVpY3zN4$default2 = OffsetKt.m686offsetVpY3zN4$default(companion, 0.0f, Dp.m5115constructorimpl(f11), 1, null);
        boolean changed6 = composer.changed(this.$onLevelClick$inlined);
        Object rememberedValue7 = composer.rememberedValue();
        if (changed6 || rememberedValue7 == companion2.getEmpty()) {
            rememberedValue7 = new UserKt.b(this.$onLevelClick$inlined);
            composer.updateRememberedValue(rememberedValue7);
        }
        Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(ComposeUtilsKt.k(m686offsetVpY3zN4$default2, 0L, false, (x00.a) rememberedValue7, 3, null), Dp.m5115constructorimpl(12));
        boolean changed7 = composer.changed(component4);
        Object rememberedValue8 = composer.rememberedValue();
        if (changed7 || rememberedValue8 == companion2.getEmpty()) {
            rememberedValue8 = new UserKt.c(component4);
            composer.updateRememberedValue(rememberedValue8);
        }
        TextKt.m1845Text4IGK_g(this.$levelDescription$inlined, constraintLayoutScope.constrainAs(m726padding3ABfNKs, component5, (x00.l) rememberedValue8), Color3, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer, i12).getH5(), 0L, 0L, companion4.getMedium(), null, null, null, null, 0L, null, null, null, 0L, TextDecoration.Companion.getUnderline(), null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16773115, null), composer, 384, 0, 65528);
        composer.endReplaceGroup();
        boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final MutableState mutableState = this.$start;
        final MutableState mutableState2 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue9 = composer.rememberedValue();
        if (changedInstance || rememberedValue9 == companion2.getEmpty()) {
            rememberedValue9 = new x00.a<g2>() { // from class: com.baicizhan.main.home.player.settings.UserKt$UserPage$lambda$0$0$$inlined$ConstraintLayout$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
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
