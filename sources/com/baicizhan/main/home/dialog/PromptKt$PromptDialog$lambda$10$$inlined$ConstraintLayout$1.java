package com.baicizhan.main.home.dialog;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SurfaceKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.dialog.PromptKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.Lambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2303:1\n172#2,3:2304\n175#2:2313\n179#2:2320\n292#2,3:2322\n298#2,6:2331\n309#2:2343\n313#2:2350\n1247#3,6:2307\n1247#3,6:2314\n1247#3,6:2325\n1247#3,6:2337\n1247#3,6:2344\n1225#3,6:2351\n113#4:2321\n*S KotlinDebug\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/PromptKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n174#1:2307,6\n175#1:2314,6\n294#1:2325,6\n303#1:2337,6\n309#1:2344,6\n179#1:2321\n384#2:2351,6\n*E\n"})
/* loaded from: classes4.dex */
public final class PromptKt$PromptDialog$lambda$10$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, g2> {
    final /* synthetic */ AnnotatedString $annotatedMessage$inlined;
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ String $checkDescription$inlined;
    final /* synthetic */ boolean $checked$inlined;
    final /* synthetic */ boolean $closeOn$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ x00.r $contentMessage$inlined;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ int $icon$inlined;
    final /* synthetic */ String $message$inlined;
    final /* synthetic */ String $negative$inlined;
    final /* synthetic */ x00.a $onCancel$inlined;
    final /* synthetic */ x00.l $onCheckConfirm$inlined;
    final /* synthetic */ x00.a $onClose$inlined;
    final /* synthetic */ x00.a $onConfirm$inlined;
    final /* synthetic */ String $positive$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $start;
    final /* synthetic */ String $title$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromptKt$PromptDialog$lambda$10$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, boolean z11, x00.a aVar, int i11, String str, x00.r rVar, AnnotatedString annotatedString, String str2, String str3, String str4, String str5, boolean z12, x00.a aVar2, x00.l lVar, x00.a aVar3) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$closeOn$inlined = z11;
        this.$onClose$inlined = aVar;
        this.$icon$inlined = i11;
        this.$title$inlined = str;
        this.$contentMessage$inlined = rVar;
        this.$annotatedMessage$inlined = annotatedString;
        this.$message$inlined = str2;
        this.$checkDescription$inlined = str3;
        this.$negative$inlined = str4;
        this.$positive$inlined = str5;
        this.$checked$inlined = z12;
        this.$onCancel$inlined = aVar2;
        this.$onCheckConfirm$inlined = lVar;
        this.$onConfirm$inlined = aVar3;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        Modifier.Companion companion;
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
        composer.startReplaceGroup(965404337);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        Modifier.Companion companion2 = Modifier.Companion;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.Companion;
        if (rememberedValue == companion3.getEmpty()) {
            rememberedValue = PromptKt.a.f20838a;
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier q11 = ComposeUtilsKt.q(companion2, 0L, false, null, null, false, (x00.a) rememberedValue, 31, null);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion3.getEmpty()) {
            rememberedValue2 = PromptKt.b.f20839a;
            composer.updateRememberedValue(rememberedValue2);
        }
        SurfaceKt.m1784SurfaceFjzlyU(constraintLayoutScope.constrainAs(q11, component1, (x00.l) rememberedValue2), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(24)), 0L, 0L, null, 0.0f, ComposableLambdaKt.rememberComposableLambda(566956671, true, new PromptKt.c(this.$title$inlined, this.$contentMessage$inlined, this.$annotatedMessage$inlined, this.$message$inlined, this.$checkDescription$inlined, this.$negative$inlined, this.$positive$inlined, this.$checked$inlined, this.$onCancel$inlined, this.$onCheckConfirm$inlined, this.$onConfirm$inlined), composer, 54), composer, 1572864, 60);
        if (this.$closeOn$inlined) {
            composer.startReplaceGroup(971764637);
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_home_prompt_close, composer, 6);
            boolean changed = composer.changed(component1);
            Object rememberedValue3 = composer.rememberedValue();
            if (changed || rememberedValue3 == companion3.getEmpty()) {
                rememberedValue3 = new PromptKt.d(component1);
                composer.updateRememberedValue(rememberedValue3);
            }
            companion = companion2;
            ImageKt.Image(painterResource, "prompt-close", ComposeUtilsKt.k(constraintLayoutScope.constrainAs(companion, component3, (x00.l) rememberedValue3), 0L, false, this.$onClose$inlined, 3, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        } else {
            companion = companion2;
            composer.startReplaceGroup(959354407);
        }
        composer.endReplaceGroup();
        if (this.$icon$inlined != 0) {
            composer.startReplaceGroup(972156322);
            Painter painterResource2 = PainterResources_androidKt.painterResource(this.$icon$inlined, composer, 0);
            boolean changed2 = composer.changed(component1);
            Object rememberedValue4 = composer.rememberedValue();
            if (changed2 || rememberedValue4 == companion3.getEmpty()) {
                rememberedValue4 = new PromptKt.e(component1);
                composer.updateRememberedValue(rememberedValue4);
            }
            Modifier constrainAs = constraintLayoutScope.constrainAs(companion, component2, (x00.l) rememberedValue4);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion3.getEmpty()) {
                rememberedValue5 = PromptKt.f.f20857a;
                composer.updateRememberedValue(rememberedValue5);
            }
            ImageKt.Image(painterResource2, "prompt-image", ComposeUtilsKt.q(constrainAs, 0L, false, null, null, false, (x00.a) rememberedValue5, 31, null), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, composer, 24624, 104);
        } else {
            composer.startReplaceGroup(959354407);
        }
        composer.endReplaceGroup();
        composer.endReplaceGroup();
        boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final MutableState mutableState = this.$start;
        final MutableState mutableState2 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance || rememberedValue6 == companion3.getEmpty()) {
            rememberedValue6 = new x00.a<g2>() { // from class: com.baicizhan.main.home.dialog.PromptKt$PromptDialog$lambda$10$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(rememberedValue6);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue6, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
