package com.baicizhan.main.home.player;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.SurfaceKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import androidx.media3.extractor.WavUtil;
import com.baicizhan.main.home.player.HomeActivityKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2303:1\n2565#2,2:2304\n2571#2,3:2312\n2579#2,8:2321\n2590#2:2335\n2591#2,7:2337\n2585#2:2344\n2601#2:2345\n2606#2,2:2352\n2605#2:2354\n2600#2:2355\n2611#2:2356\n2615#2:2363\n2619#2:2370\n2620#2:2372\n2621#2:2374\n2610#2:2375\n2631#2:2376\n1247#3,6:2306\n1247#3,6:2315\n1247#3,6:2329\n1247#3,6:2346\n1247#3,6:2357\n1247#3,6:2364\n1225#3,6:2377\n1565#4:2336\n113#5:2371\n113#5:2373\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n2566#1:2306,6\n2573#1:2315,6\n2586#1:2329,6\n2601#1:2346,6\n2611#1:2357,6\n2615#1:2364,6\n2590#1:2336\n2619#1:2371\n2620#1:2373\n384#2:2377,6\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeActivityKt$DynamicUnlockGuide$lambda$1$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {
    final /* synthetic */ String $action$inlined;
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ String $description$inlined;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ int $image$inlined;
    final /* synthetic */ String $name$inlined;
    final /* synthetic */ x00.a $onDismiss$inlined;
    final /* synthetic */ x00.a $onStart$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivityKt$DynamicUnlockGuide$lambda$1$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, int i11, x00.a aVar, String str, x00.a aVar2, String str2, String str3) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$image$inlined = i11;
        this.$onDismiss$inlined = aVar;
        this.$description$inlined = str;
        this.$onStart$inlined = aVar2;
        this.$name$inlined = str2;
        this.$action$inlined = str3;
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
        composer.startReplaceGroup(179461799);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        ConstrainedLayoutReference component4 = createRefs.component4();
        ConstrainedLayoutReference component5 = createRefs.component5();
        Painter painterResource = PainterResources_androidKt.painterResource(this.$image$inlined, composer, 0);
        Modifier.Companion companion = Modifier.Companion;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = HomeActivityKt.a.f23165a;
            composer.updateRememberedValue(rememberedValue);
        }
        ImageKt.Image(painterResource, "", constraintLayoutScope.constrainAs(companion, component2, (x00.l) rememberedValue), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        Modifier clip = ClipKt.clip(companion, RoundedCornerShapeKt.getCircleShape());
        boolean changed = composer.changed(component2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new HomeActivityKt.b(component2);
            composer.updateRememberedValue(rememberedValue2);
        }
        Modifier k11 = ComposeUtilsKt.k(constraintLayoutScope.constrainAs(clip, component1, (x00.l) rememberedValue2), 0L, false, this.$onDismiss$inlined, 3, null);
        Color.Companion companion3 = Color.Companion;
        SurfaceKt.m1784SurfaceFjzlyU(k11, null, Color.m2508copywmQWz5c$default(companion3.m2546getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, null, 0.0f, s.f23970a.g(), composer, 1573248, 58);
        boolean changed2 = composer.changed(component2);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = new HomeActivityKt.c(component2);
            composer.updateRememberedValue(rememberedValue3);
        }
        Modifier constrainAs = constraintLayoutScope.constrainAs(companion, component3, (x00.l) rememberedValue3);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(this.$name$inlined);
        builder.pushStyle(new SpanStyle(ColorKt.Color(4294956877L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (kotlin.jvm.internal.v) null));
        builder.append("已解锁！");
        builder.pop();
        AnnotatedString annotatedString = builder.toAnnotatedString();
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i12 = MaterialTheme.$stable;
        TextStyle h22 = materialTheme.getTypography(composer, i12).getH2();
        FontWeight.Companion companion4 = FontWeight.Companion;
        TextKt.m1846TextIbK3jfQ(annotatedString, constrainAs, companion3.m2546getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, TextStyle.m4572copyp1EtxEg$default(h22, 0L, 0L, companion4.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 384, 0, 131064);
        boolean changed3 = composer.changed(component2) | composer.changed(component3);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == companion2.getEmpty()) {
            rememberedValue4 = new HomeActivityKt.d(component2, component3);
            composer.updateRememberedValue(rememberedValue4);
        }
        TextKt.m1845Text4IGK_g(this.$description$inlined, constraintLayoutScope.constrainAs(companion, component4, (x00.l) rememberedValue4), companion3.m2546getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer, i12).getSubtitle1(), 0L, 0L, companion4.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 384, 0, 65528);
        boolean changed4 = composer.changed(this.$onStart$inlined) | composer.changed(this.$onDismiss$inlined);
        Object rememberedValue5 = composer.rememberedValue();
        if (changed4 || rememberedValue5 == companion2.getEmpty()) {
            rememberedValue5 = new HomeActivityKt.e(this.$onStart$inlined, this.$onDismiss$inlined);
            composer.updateRememberedValue(rememberedValue5);
        }
        x00.a aVar = (x00.a) rememberedValue5;
        boolean changed5 = composer.changed(component2) | composer.changed(component4);
        Object rememberedValue6 = composer.rememberedValue();
        if (changed5 || rememberedValue6 == companion2.getEmpty()) {
            rememberedValue6 = new HomeActivityKt.f(component2, component4);
            composer.updateRememberedValue(rememberedValue6);
        }
        ButtonKt.Button(aVar, constraintLayoutScope.constrainAs(companion, component5, (x00.l) rememberedValue6), false, null, null, RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100)), null, null, PaddingKt.m719PaddingValues0680j_4(Dp.m5115constructorimpl(0)), ComposableLambdaKt.rememberComposableLambda(192236510, true, new HomeActivityKt.g(this.$action$inlined), composer, 54), composer, 905969664, R.styleable.Theme_drawable_share);
        composer.endReplaceGroup();
        boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final MutableState mutableState = this.$start;
        final MutableState mutableState2 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue7 = composer.rememberedValue();
        if (changedInstance || rememberedValue7 == companion2.getEmpty()) {
            rememberedValue7 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$DynamicUnlockGuide$lambda$1$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(rememberedValue7);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue7, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
