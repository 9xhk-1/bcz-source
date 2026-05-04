package com.baicizhan.main.home.player;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
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
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.LayoutReference;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.plan.view.WordPlanInfoView;
import com.baicizhan.main.home.player.WordCardKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.baicizhan.platform.base.widget.WidgetsKt;
import java.util.List;
import k3.m3;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2303:1\n448#2,4:2304\n454#2:2314\n455#2:2322\n456#2:2324\n458#2:2358\n471#2:2359\n474#2:2364\n478#2:2371\n473#2,20:2373\n498#2:2399\n497#2:2400\n480#2:2401\n501#2:2402\n502#2,2:2409\n506#2:2417\n539#2:2419\n541#2:2427\n549#2,6:2434\n555#2:2441\n548#2:2448\n563#2,4:2449\n562#2,11:2459\n576#2,3:2476\n581#2,6:2485\n591#2,3:2497\n583#2:2506\n608#2:2507\n1247#3,6:2308\n1247#3,6:2315\n1247#3,6:2365\n1247#3,6:2393\n1247#3,6:2403\n1247#3,6:2411\n1247#3,6:2421\n1247#3,6:2428\n1247#3,6:2442\n1247#3,6:2453\n1247#3,6:2470\n1247#3,6:2479\n1247#3,6:2491\n1247#3,6:2500\n1225#3,6:2508\n113#4:2321\n113#4:2323\n113#4:2418\n113#4:2420\n113#4:2440\n99#5,6:2325\n106#5:2363\n79#6,6:2331\n86#6,3:2346\n89#6,2:2355\n93#6:2362\n347#7,9:2337\n356#7:2357\n357#7,2:2360\n4206#8,6:2349\n1#9:2372\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n451#1:2308,6\n454#1:2315,6\n474#1:2365,6\n492#1:2393,6\n501#1:2403,6\n503#1:2411,6\n539#1:2421,6\n541#1:2428,6\n555#1:2442,6\n566#1:2453,6\n572#1:2470,6\n578#1:2479,6\n586#1:2491,6\n593#1:2500,6\n454#1:2321\n455#1:2323\n506#1:2418\n539#1:2420\n554#1:2440\n450#1:2325,6\n450#1:2363\n450#1:2331,6\n450#1:2346,3\n450#1:2355,2\n450#1:2362\n450#1:2337,9\n450#1:2357\n450#1:2360,2\n450#1:2349,6\n384#2:2508,6\n*E\n"})
/* loaded from: classes4.dex */
public final class WordCardKt$BehaviorContent$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {
    final /* synthetic */ List $behaviors$inlined;
    final /* synthetic */ f $bookInfo$inlined;
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ zj.d $guideButtonLearning$inlined;
    final /* synthetic */ zj.d $guideButtonReviewing$inlined;
    final /* synthetic */ zj.d $guideEdit$inlined;
    final /* synthetic */ int $learntCount$inlined;
    final /* synthetic */ int $masteredCount$inlined;
    final /* synthetic */ tg.a $navigator$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $start;
    final /* synthetic */ m3.b $unitContent$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordCardKt$BehaviorContent$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, tg.a aVar, zj.d dVar, f fVar, m3.b bVar, int i11, int i12, List list, zj.d dVar2, zj.d dVar3) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$navigator$inlined = aVar;
        this.$guideEdit$inlined = dVar;
        this.$bookInfo$inlined = fVar;
        this.$unitContent$inlined = bVar;
        this.$masteredCount$inlined = i11;
        this.$learntCount$inlined = i12;
        this.$behaviors$inlined = list;
        this.$guideButtonLearning$inlined = dVar2;
        this.$guideButtonReviewing$inlined = dVar3;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        Modifier modifier;
        MutableIntState mutableIntState;
        ConstraintLayoutScope constraintLayoutScope;
        ConstrainedLayoutReference constrainedLayoutReference;
        Modifier.Companion companion;
        MaterialTheme materialTheme;
        int i12;
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
        composer.startReplaceGroup(-347112820);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        ConstrainedLayoutReference component4 = createRefs.component4();
        ConstrainedLayoutReference component5 = createRefs.component5();
        ConstrainedLayoutReference component6 = createRefs.component6();
        ConstrainedLayoutReference component7 = createRefs.component7();
        ConstrainedLayoutReference component8 = createRefs.component8();
        ConstrainedLayoutReference component9 = createRefs.component9();
        ConstrainedLayoutReference component10 = createRefs.component10();
        ConstraintLayoutBaseScope.HorizontalAnchor m5407createBottomBarrier3ABfNKs$default = ConstraintLayoutBaseScope.m5407createBottomBarrier3ABfNKs$default(constraintLayoutScope2, new LayoutReference[]{component1, component10}, 0.0f, 2, null);
        Modifier.Companion companion2 = Modifier.Companion;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.Companion;
        if (rememberedValue == companion3.getEmpty()) {
            rememberedValue = WordCardKt.a.f23407a;
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier constrainAs = constraintLayoutScope2.constrainAs(companion2, component4, (x00.l) rememberedValue);
        boolean changedInstance = composer.changedInstance(this.$navigator$inlined);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion3.getEmpty()) {
            rememberedValue2 = new WordCardKt.i(this.$navigator$inlined);
            composer.updateRememberedValue(rememberedValue2);
        }
        Modifier k11 = ComposeUtilsKt.k(constrainAs, 0L, false, (x00.a) rememberedValue2, 3, null);
        float f11 = 4;
        Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(k11, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(6));
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11)), Alignment.Companion.getCenterVertically(), composer, 54);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m727paddingVpY3zN4);
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
        Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        ProvidableCompositionLocal<Color> localContentColor = ContentColorKt.getLocalContentColor();
        MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
        int i13 = MaterialTheme.$stable;
        CompositionLocalKt.CompositionLocalProvider(localContentColor.provides(Color.m2499boximpl(bk.b.S(materialTheme2.getColors(composer, i13)))), ComposableLambdaKt.rememberComposableLambda(-404711757, true, new WordCardKt.j(this.$navigator$inlined), composer, 54), composer, ProvidedValue.$stable | 48);
        composer.endNode();
        boolean changed = composer.changed(component4);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion3.getEmpty()) {
            rememberedValue3 = new WordCardKt.k(component4);
            composer.updateRememberedValue(rememberedValue3);
        }
        Modifier constrainAs2 = constraintLayoutScope2.constrainAs(companion2, component5, (x00.l) rememberedValue3);
        zj.d dVar = this.$guideEdit$inlined;
        if (dVar == null || (modifier = zj.z.k(companion2, dVar, RoundedCornerShapeKt.getCircleShape())) == null) {
            modifier = companion2;
        }
        BoxKt.Box(constrainAs2.then(modifier), composer, 0);
        String j11 = this.$bookInfo$inlined.j();
        long M = bk.b.M(materialTheme2.getColors(composer, i13));
        TextStyle h42 = materialTheme2.getTypography(composer, i13).getH4();
        FontWeight.Companion companion5 = FontWeight.Companion;
        TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(h42, 0L, 0L, companion5.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
        boolean changed2 = composer.changed(component4);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed2 || rememberedValue4 == companion3.getEmpty()) {
            rememberedValue4 = new WordCardKt.l(component4);
            composer.updateRememberedValue(rememberedValue4);
        }
        TextKt.m1845Text4IGK_g(j11, constraintLayoutScope2.constrainAs(companion2, component1, (x00.l) rememberedValue4), M, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.Companion.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4572copyp1EtxEg$default, composer, 0, 3120, 55288);
        Composer composer2 = composer;
        boolean changed3 = composer2.changed(this.$unitContent$inlined);
        Object rememberedValue5 = composer2.rememberedValue();
        if (changed3 || rememberedValue5 == companion3.getEmpty()) {
            m3.b bVar = this.$unitContent$inlined;
            rememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(bVar != null ? bVar.e() : 0);
            composer2.updateRememberedValue(rememberedValue5);
        }
        MutableIntState mutableIntState2 = (MutableIntState) rememberedValue5;
        if (this.$unitContent$inlined != null) {
            composer2.startReplaceGroup(-344631085);
            constrainedLayoutReference = component1;
            boolean changed4 = composer2.changed(constrainedLayoutReference);
            Object rememberedValue6 = composer2.rememberedValue();
            if (changed4 || rememberedValue6 == companion3.getEmpty()) {
                rememberedValue6 = new WordCardKt.m(constrainedLayoutReference);
                composer2.updateRememberedValue(rememberedValue6);
            }
            constraintLayoutScope = constraintLayoutScope2;
            Modifier constrainAs3 = constraintLayoutScope.constrainAs(companion2, component10, (x00.l) rememberedValue6);
            long Z = bk.b.Z(materialTheme2.getColors(composer2, i13));
            RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(8));
            ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(387146047, true, new WordCardKt.n(mutableIntState2, this.$unitContent$inlined), composer2, 54);
            companion = companion2;
            mutableIntState = mutableIntState2;
            i12 = i13;
            materialTheme = materialTheme2;
            com.baicizhan.platform.base.widget.d.d(constrainAs3, m1019RoundedCornerShape0680j_4, Z, 0L, null, rememberComposableLambda, composer, 196608, 24);
            composer2 = composer;
        } else {
            mutableIntState = mutableIntState2;
            constraintLayoutScope = constraintLayoutScope2;
            constrainedLayoutReference = component1;
            companion = companion2;
            materialTheme = materialTheme2;
            i12 = i13;
            composer2.startReplaceGroup(-364685109);
        }
        composer2.endReplaceGroup();
        long Color = ColorKt.Color(4294244350L);
        RoundedCornerShape m1019RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100));
        boolean changedInstance2 = composer2.changedInstance(this.$navigator$inlined);
        Object rememberedValue7 = composer2.rememberedValue();
        if (changedInstance2 || rememberedValue7 == companion3.getEmpty()) {
            rememberedValue7 = new WordCardKt.o(this.$navigator$inlined);
            composer2.updateRememberedValue(rememberedValue7);
        }
        Modifier k12 = ComposeUtilsKt.k(companion, 0L, false, (x00.a) rememberedValue7, 3, null);
        boolean changed5 = composer2.changed(constrainedLayoutReference);
        Object rememberedValue8 = composer2.rememberedValue();
        if (changed5 || rememberedValue8 == companion3.getEmpty()) {
            rememberedValue8 = new WordCardKt.b(constrainedLayoutReference);
            composer2.updateRememberedValue(rememberedValue8);
        }
        Modifier.Companion companion6 = companion;
        com.baicizhan.platform.base.widget.d.d(constraintLayoutScope.constrainAs(k12, component2, (x00.l) rememberedValue8), m1019RoundedCornerShape0680j_42, Color, 0L, null, o1.f23826a.m(), composer, 196992, 24);
        float k13 = this.$bookInfo$inlined.k() > 0 ? this.$masteredCount$inlined / this.$bookInfo$inlined.k() : 0.0f;
        float k14 = this.$bookInfo$inlined.k() > 0 ? this.$learntCount$inlined / this.$bookInfo$inlined.k() : 0.0f;
        long m1600getPrimary0d7_KjU = materialTheme.getColors(composer, i12).m1600getPrimary0d7_KjU();
        long Color2 = ColorKt.Color(4290301439L);
        long Z2 = bk.b.Z(materialTheme.getColors(composer, i12));
        float m5115constructorimpl = Dp.m5115constructorimpl(2);
        float f12 = k13;
        boolean changed6 = composer.changed(m5407createBottomBarrier3ABfNKs$default) | composer.changed(constrainedLayoutReference) | composer.changed(component4);
        float f13 = k14;
        Object rememberedValue9 = composer.rememberedValue();
        if (changed6 || rememberedValue9 == companion3.getEmpty()) {
            rememberedValue9 = new WordCardKt.c(m5407createBottomBarrier3ABfNKs$default, constrainedLayoutReference, component4);
            composer.updateRememberedValue(rememberedValue9);
        }
        int i14 = i12;
        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
        WidgetsKt.D(f12, f13, constraintLayoutScope.constrainAs(companion6, component3, (x00.l) rememberedValue9), m5115constructorimpl, m1600getPrimary0d7_KjU, Color2, Z2, composer, 199680, 0);
        String str = "共 " + this.$bookInfo$inlined.k() + WordPlanInfoView.f22926m;
        TextStyle m4572copyp1EtxEg$default2 = TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer, i14).getH5(), 0L, 0L, companion5.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null);
        long S = bk.b.S(materialTheme.getColors(composer, i14));
        boolean changed7 = composer.changed(component3);
        Object rememberedValue10 = composer.rememberedValue();
        if (changed7 || rememberedValue10 == companion3.getEmpty()) {
            rememberedValue10 = new WordCardKt.d(component3);
            composer.updateRememberedValue(rememberedValue10);
        }
        MaterialTheme materialTheme3 = materialTheme;
        MutableIntState mutableIntState3 = mutableIntState;
        TextKt.m1845Text4IGK_g(str, constraintLayoutScope3.constrainAs(companion6, component8, (x00.l) rememberedValue10), S, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4572copyp1EtxEg$default2, composer, 0, 0, 65528);
        boolean changed8 = composer.changed(component3) | composer.changed(component8);
        Object rememberedValue11 = composer.rememberedValue();
        if (changed8 || rememberedValue11 == companion3.getEmpty()) {
            rememberedValue11 = new WordCardKt.e(component3, component8);
            composer.updateRememberedValue(rememberedValue11);
        }
        WordCardKt.K(constraintLayoutScope3.constrainAs(companion6, component6, (x00.l) rememberedValue11), "已掌握 " + this.$masteredCount$inlined, materialTheme3.getColors(composer, i14).m1600getPrimary0d7_KjU(), composer, 0, 0);
        boolean changed9 = composer.changed(component6) | composer.changed(component8);
        Object rememberedValue12 = composer.rememberedValue();
        if (changed9 || rememberedValue12 == companion3.getEmpty()) {
            rememberedValue12 = new WordCardKt.f(component6, component8);
            composer.updateRememberedValue(rememberedValue12);
        }
        WordCardKt.K(constraintLayoutScope3.constrainAs(companion6, component7, (x00.l) rememberedValue12), "已学习 " + this.$learntCount$inlined, ColorKt.Color(4290301439L), composer, 384, 0);
        List list = this.$behaviors$inlined;
        boolean changed10 = composer.changed(component8);
        Object rememberedValue13 = composer.rememberedValue();
        if (changed10 || rememberedValue13 == companion3.getEmpty()) {
            rememberedValue13 = new WordCardKt.g(component8);
            composer.updateRememberedValue(rememberedValue13);
        }
        Modifier constrainAs4 = constraintLayoutScope3.constrainAs(companion6, component9, (x00.l) rememberedValue13);
        zj.d dVar2 = this.$guideButtonLearning$inlined;
        zj.d dVar3 = this.$guideButtonReviewing$inlined;
        boolean changedInstance3 = composer.changedInstance(this.$navigator$inlined) | composer.changedInstance(this.$unitContent$inlined) | composer.changed(mutableIntState3);
        Object rememberedValue14 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue14 == companion3.getEmpty()) {
            rememberedValue14 = new WordCardKt.h(this.$navigator$inlined, this.$unitContent$inlined, mutableIntState3);
            composer.updateRememberedValue(rememberedValue14);
        }
        WordCardKt.F(list, constrainAs4, dVar2, dVar3, (x00.l) rememberedValue14, composer, 0, 0);
        composer.endReplaceGroup();
        boolean changedInstance4 = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope4 = this.$scope;
        final MutableState mutableState = this.$start;
        final MutableState mutableState2 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue15 = composer.rememberedValue();
        if (changedInstance4 || rememberedValue15 == companion3.getEmpty()) {
            rememberedValue15 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.WordCardKt$BehaviorContent$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(rememberedValue15);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue15, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
