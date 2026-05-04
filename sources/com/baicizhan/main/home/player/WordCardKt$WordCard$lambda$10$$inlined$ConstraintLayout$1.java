package com.baicizhan.main.home.player;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonKt;
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
import androidx.compose.ui.graphics.ColorKt;
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
import androidx.constraintlayout.compose.ChainStyle;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.LayoutReference;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.player.WordCardKt;
import com.baicizhan.main.home.player.ya;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2303:1\n249#2,2:2304\n255#2:2312\n257#2,2:2315\n261#2:2323\n256#2,7:2325\n265#2:2333\n266#2:2335\n267#2:2337\n268#2,2:2339\n270#2:2342\n264#2:2349\n263#2:2350\n277#2,2:2351\n1247#3,6:2306\n1247#3,6:2317\n1247#3,6:2343\n1225#3,6:2353\n18#4,2:2313\n20#4:2332\n113#5:2324\n113#5:2334\n113#5:2336\n113#5:2338\n113#5:2341\n*S KotlinDebug\n*F\n+ 1 WordCard.kt\ncom/baicizhan/main/home/player/WordCardKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n250#1:2306,6\n258#1:2317,6\n270#1:2343,6\n255#1:2313,2\n255#1:2332\n261#1:2324\n265#1:2334\n266#1:2336\n267#1:2338\n269#1:2341\n384#2:2353,6\n*E\n"})
/* loaded from: classes4.dex */
public final class WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ x00.a $onRefresh$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $start;
    final /* synthetic */ ya $status$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, ya yaVar, x00.a aVar) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$status$inlined = yaVar;
        this.$onRefresh$inlined = aVar;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        ConstrainedLayoutReference constrainedLayoutReference;
        Modifier.Companion companion;
        ConstraintLayoutScope constraintLayoutScope;
        ConstrainedLayoutReference constrainedLayoutReference2;
        ConstrainedLayoutReference constrainedLayoutReference3;
        char c11;
        Composer composer2 = composer;
        if ((i11 & 3) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
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
        composer2.startReplaceGroup(-1973727964);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_common_page_oops_small, composer2, 6);
        Modifier.Companion companion2 = Modifier.Companion;
        Object rememberedValue = composer2.rememberedValue();
        Composer.Companion companion3 = Composer.Companion;
        if (rememberedValue == companion3.getEmpty()) {
            rememberedValue = WordCardKt.q.f23435a;
            composer2.updateRememberedValue(rememberedValue);
        }
        ImageKt.Image(painterResource, "image", constraintLayoutScope2.constrainAs(companion2, component1, (x00.l) rememberedValue), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
        composer2.startReplaceGroup(-1033488050);
        Throwable f11 = ((ya.b) this.$status$inlined).f();
        String message = f11 != null ? f11.getMessage() : null;
        if (message == null || message.length() == 0) {
            constrainedLayoutReference = component3;
            companion = companion2;
            constraintLayoutScope = constraintLayoutScope2;
            constrainedLayoutReference2 = component1;
            constrainedLayoutReference3 = component2;
            c11 = 2;
        } else {
            long Color = ColorKt.Color(4289243836L);
            long sp2 = TextUnitKt.getSp(16);
            boolean changed = composer2.changed(component1);
            Object rememberedValue2 = composer2.rememberedValue();
            if (changed || rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new WordCardKt.r(component1);
                composer2.updateRememberedValue(rememberedValue2);
            }
            constraintLayoutScope = constraintLayoutScope2;
            constrainedLayoutReference3 = component2;
            c11 = 2;
            constrainedLayoutReference = component3;
            companion = companion2;
            constrainedLayoutReference2 = component1;
            TextKt.m1845Text4IGK_g(message, PaddingKt.m730paddingqDBjuR0$default(constraintLayoutScope2.constrainAs(companion2, component2, (x00.l) rememberedValue2), 0.0f, Dp.m5115constructorimpl(6), 0.0f, Dp.m5115constructorimpl(12), 5, null), Color, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer, 3456, 0, 131056);
            composer2 = composer;
        }
        composer2.endReplaceGroup();
        RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100));
        BorderStroke m262BorderStrokecXLIe8U = BorderStrokeKt.m262BorderStrokecXLIe8U(Dp.m5115constructorimpl(1), ColorKt.Color(4285822599L));
        PaddingValues m720PaddingValuesYgX7TsA = PaddingKt.m720PaddingValuesYgX7TsA(Dp.m5115constructorimpl(36), Dp.m5115constructorimpl(0));
        Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(48));
        ConstrainedLayoutReference constrainedLayoutReference4 = constrainedLayoutReference2;
        boolean changed2 = composer2.changed(constrainedLayoutReference4);
        Object rememberedValue3 = composer2.rememberedValue();
        if (changed2 || rememberedValue3 == companion3.getEmpty()) {
            rememberedValue3 = new WordCardKt.s(constrainedLayoutReference4);
            composer2.updateRememberedValue(rememberedValue3);
        }
        ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
        ButtonKt.OutlinedButton(this.$onRefresh$inlined, constraintLayoutScope3.constrainAs(m759height3ABfNKs, constrainedLayoutReference, (x00.l) rememberedValue3), false, null, null, m1019RoundedCornerShape0680j_4, m262BorderStrokecXLIe8U, null, m720PaddingValuesYgX7TsA, o1.f23826a.k(), composer, 907542528, 156);
        LayoutReference[] layoutReferenceArr = new LayoutReference[3];
        layoutReferenceArr[0] = constrainedLayoutReference4;
        layoutReferenceArr[1] = constrainedLayoutReference3;
        layoutReferenceArr[c11] = constrainedLayoutReference;
        constraintLayoutScope3.createVerticalChain(layoutReferenceArr, ChainStyle.Companion.getPacked());
        composer.endReplaceGroup();
        boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope4 = this.$scope;
        final MutableState mutableState = this.$start;
        final MutableState mutableState2 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue4 = composer.rememberedValue();
        if (changedInstance || rememberedValue4 == companion3.getEmpty()) {
            rememberedValue4 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.WordCardKt$WordCard$lambda$10$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(rememberedValue4);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
