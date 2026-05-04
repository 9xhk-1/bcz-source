package com.baicizhan.platform.base.widget;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.platform.base.widget.WidgetsKt;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 Widgets.kt\ncom/baicizhan/platform/base/widget/WidgetsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2303:1\n75#2,6:2304\n81#2:2311\n90#2,4:2318\n89#2:2328\n88#2:2329\n99#2,6:2330\n105#2,2:2337\n110#2:2345\n101#2:2347\n113#2:2354\n113#3:2310\n113#3:2336\n113#3:2346\n1247#4,6:2312\n1247#4,6:2322\n1247#4,6:2339\n1247#4,6:2348\n1225#4,6:2355\n*S KotlinDebug\n*F\n+ 1 Widgets.kt\ncom/baicizhan/platform/base/widget/WidgetsKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n80#1:2310\n104#1:2336\n110#1:2346\n81#1:2312,6\n93#1:2322,6\n106#1:2339,6\n101#1:2348,6\n384#2:2355,6\n*E\n"})
/* loaded from: classes6.dex */
public final class WidgetsKt$Empty$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {
    final /* synthetic */ String $action$inlined;
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ String $description$inlined;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ int $icon$inlined;
    final /* synthetic */ x00.a $onAction$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetsKt$Empty$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, int i11, String str, String str2, x00.a aVar) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$icon$inlined = i11;
        this.$description$inlined = str;
        this.$action$inlined = str2;
        this.$onAction$inlined = aVar;
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
        composer.startReplaceGroup(-1538553750);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        Painter painterResource = PainterResources_androidKt.painterResource(this.$icon$inlined, composer, 0);
        Modifier.Companion companion = Modifier.Companion;
        Modifier m773size3ABfNKs = SizeKt.m773size3ABfNKs(companion, Dp.m5115constructorimpl(128));
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = WidgetsKt.a.f28183a;
            composer.updateRememberedValue(rememberedValue);
        }
        ImageKt.Image(painterResource, "empty", constraintLayoutScope.constrainAs(m773size3ABfNKs, component1, (x00.l) rememberedValue), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        int i12 = MaterialTheme.$stable;
        TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer, i12).getBody2(), bk.b.E(materialTheme.getColors(composer, i12)), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
        int m4977getCentere0LSkKk = TextAlign.Companion.m4977getCentere0LSkKk();
        long sp2 = TextUnitKt.getSp(22);
        boolean changed = composer.changed(component1);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new WidgetsKt.b(component1);
            composer.updateRememberedValue(rememberedValue2);
        }
        TextKt.m1845Text4IGK_g(this.$description$inlined, constraintLayoutScope.constrainAs(companion, component2, (x00.l) rememberedValue2), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(m4977getCentere0LSkKk), sp2, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4572copyp1EtxEg$default, composer, 0, 6, 63996);
        String str = this.$action$inlined;
        if (str == null || str.length() == 0) {
            composer.startReplaceGroup(-1541781130);
        } else {
            composer.startReplaceGroup(-1537715108);
            String str2 = this.$action$inlined;
            long l11 = bk.d.l();
            RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(18));
            ButtonType buttonType = ButtonType.PRIMARY_VARIANT;
            boolean changed2 = composer.changed(component2);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed2 || rememberedValue3 == companion2.getEmpty()) {
                rememberedValue3 = new WidgetsKt.c(component2);
                composer.updateRememberedValue(rememberedValue3);
            }
            Modifier constrainAs = constraintLayoutScope.constrainAs(companion, component3, (x00.l) rememberedValue3);
            PaddingValues m720PaddingValuesYgX7TsA = PaddingKt.m720PaddingValuesYgX7TsA(bk.d.b(), Dp.m5115constructorimpl(0));
            boolean changed3 = composer.changed(this.$onAction$inlined);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed3 || rememberedValue4 == companion2.getEmpty()) {
                rememberedValue4 = new WidgetsKt.d(this.$onAction$inlined);
                composer.updateRememberedValue(rememberedValue4);
            }
            r.I(constrainAs, (x00.a) rememberedValue4, str2, l11, null, 0, false, false, m1019RoundedCornerShape0680j_4, buttonType, m720PaddingValuesYgX7TsA, composer, 805309440, 6, 240);
        }
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final MutableState mutableState = this.$start;
        final MutableState mutableState2 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue5 = composer.rememberedValue();
        if (changedInstance || rememberedValue5 == companion2.getEmpty()) {
            rememberedValue5 = new x00.a<yz.g2>() { // from class: com.baicizhan.platform.base.widget.WidgetsKt$Empty$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(rememberedValue5);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue5, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
