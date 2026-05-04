package com.baicizhan.main.home.player;

import androidx.compose.foundation.ImageKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.player.TopStatusKt;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,2303:1\n179#2,3:2304\n220#2,2:2307\n229#2:2315\n232#2,4:2322\n243#2,2:2332\n246#2,3:2335\n245#2:2344\n256#2,5:2345\n268#2:2356\n1247#3,6:2309\n1247#3,6:2316\n1247#3,6:2326\n1247#3,6:2338\n1247#3,6:2350\n1225#3,6:2357\n75#4:2334\n*S KotlinDebug\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/TopStatusKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n221#1:2309,6\n229#1:2316,6\n235#1:2326,6\n248#1:2338,6\n260#1:2350,6\n244#1:2334\n384#2:2357,6\n*E\n"})
/* renamed from: com.baicizhan.main.home.player.TopStatusKt$Status-3csKH6Y$$inlined$ConstraintLayout$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class TopStatusKt$Status3csKH6Y$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {

    /* renamed from: $$v$c$androidx-compose-ui-graphics-Color$-descriptionBackground$0$inlined, reason: not valid java name */
    final /* synthetic */ long f38x406c0ea;
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ boolean $descriptionAutoSizeable$inlined;
    final /* synthetic */ x00.q $descriptionContent$inlined;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ MutableState $iconCoordinateInfo$inlined;
    final /* synthetic */ a8 $item$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopStatusKt$Status3csKH6Y$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, x00.q qVar, a8 a8Var, MutableState mutableState4, long j11, boolean z11) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$descriptionContent$inlined = qVar;
        this.$item$inlined = a8Var;
        this.$iconCoordinateInfo$inlined = mutableState4;
        this.f38x406c0ea = j11;
        this.$descriptionAutoSizeable$inlined = z11;
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
        ConstraintLayoutScope constraintLayoutScope;
        int i12;
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
        composer2.startReplaceGroup(1567990334);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope2.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        ConstrainedLayoutReference component4 = createRefs.component4();
        if (this.$descriptionContent$inlined == null) {
            composer2.startReplaceGroup(1568012560);
            ProvidedValue<Float> provides = ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(0.8f));
            TopStatusKt.a aVar = new TopStatusKt.a(constraintLayoutScope2, component1, this.f38x406c0ea, this.$descriptionAutoSizeable$inlined, this.$item$inlined);
            constrainedLayoutReference = component1;
            constraintLayoutScope = constraintLayoutScope2;
            CompositionLocalKt.CompositionLocalProvider(provides, ComposableLambdaKt.rememberComposableLambda(403437810, true, aVar, composer2, 54), composer2, ProvidedValue.$stable | 48);
            composer2.endReplaceGroup();
        } else {
            constrainedLayoutReference = component1;
            constraintLayoutScope = constraintLayoutScope2;
            composer2.startReplaceGroup(1569929321);
            x00.q qVar = this.$descriptionContent$inlined;
            Modifier.Companion companion = Modifier.Companion;
            Object rememberedValue = composer2.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = TopStatusKt.b.f23391a;
                composer2.updateRememberedValue(rememberedValue);
            }
            qVar.invoke(constraintLayoutScope.constrainAs(companion, constrainedLayoutReference, (x00.l) rememberedValue), composer2, 0);
            composer2.endReplaceGroup();
        }
        Painter painterResource = PainterResources_androidKt.painterResource(this.$item$inlined.h(), composer2, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        boolean changed = composer2.changed(constrainedLayoutReference);
        Object rememberedValue2 = composer2.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new TopStatusKt.c(constrainedLayoutReference);
            composer2.updateRememberedValue(rememberedValue2);
        }
        ImageKt.Image(painterResource, "icon", ComposeUtilsKt.h(constraintLayoutScope.constrainAs(companion2, component2, (x00.l) rememberedValue2), this.$iconCoordinateInfo$inlined), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
        if (this.$item$inlined.i() != null) {
            composer2.startReplaceGroup(1570462769);
            Painter painterResource2 = PainterResources_androidKt.painterResource(this.$item$inlined.i().intValue(), composer2, 0);
            boolean changed2 = composer2.changed(component2);
            Object rememberedValue3 = composer2.rememberedValue();
            if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new TopStatusKt.d(component2);
                composer2.updateRememberedValue(rememberedValue3);
            }
            i12 = 1561557771;
            ImageKt.Image(painterResource2, "iconBadge", constraintLayoutScope.constrainAs(companion2, component3, (x00.l) rememberedValue3), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
        } else {
            i12 = 1561557771;
            composer2.startReplaceGroup(1561557771);
        }
        composer2.endReplaceGroup();
        if (this.$item$inlined.j() != null) {
            composer2.startReplaceGroup(1570832971);
            if (((Boolean) composer2.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue() && (this.$item$inlined.j() instanceof Integer)) {
                composer2.startReplaceGroup(1570882075);
                Painter painterResource3 = PainterResources_androidKt.painterResource(((Number) this.$item$inlined.j()).intValue(), composer2, 0);
                Object rememberedValue4 = composer2.rememberedValue();
                if (rememberedValue4 == Composer.Companion.getEmpty()) {
                    rememberedValue4 = TopStatusKt.e.f23394a;
                    composer2.updateRememberedValue(rememberedValue4);
                }
                ImageKt.Image(painterResource3, "status", constraintLayoutScope.constrainAs(companion2, component4, (x00.l) rememberedValue4), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1571366016);
                Object j11 = this.$item$inlined.j();
                Painter painterResource4 = PainterResources_androidKt.painterResource(R.drawable.ic_home_status_label_exclamation_mark, composer2, 6);
                Object rememberedValue5 = composer2.rememberedValue();
                if (rememberedValue5 == Composer.Companion.getEmpty()) {
                    rememberedValue5 = TopStatusKt.f.f23395a;
                    composer2.updateRememberedValue(rememberedValue5);
                }
                coil.compose.l.b(j11, "status", constraintLayoutScope.constrainAs(companion2, component4, (x00.l) rememberedValue5), null, painterResource4, null, null, null, null, null, null, 0.0f, null, 0, false, null, composer, 48, 0, 65512);
                composer2 = composer;
                composer2.endReplaceGroup();
            }
        } else {
            composer2.startReplaceGroup(i12);
        }
        composer2.endReplaceGroup();
        composer2.endReplaceGroup();
        boolean changedInstance = composer2.changedInstance(this.$scope) | composer2.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope3 = this.$scope;
        final MutableState mutableState = this.$start;
        final MutableState mutableState2 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue6 = composer2.rememberedValue();
        if (changedInstance || rememberedValue6 == Composer.Companion.getEmpty()) {
            rememberedValue6 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.TopStatusKt$Status-3csKH6Y$$inlined$ConstraintLayout$1.1
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
            composer2.updateRememberedValue(rememberedValue6);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue6, composer2, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
