package com.baicizhan.main.home.player;

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
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.player.IslandsKt;
import com.jiongji.andriod.card.R;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 Islands.kt\ncom/baicizhan/main/home/player/IslandsKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2303:1\n382#2,3:2304\n392#2,2:2313\n391#2,14:2316\n408#2:2336\n1247#3,6:2307\n1247#3,6:2330\n1225#3,6:2337\n113#4:2315\n*S KotlinDebug\n*F\n+ 1 Islands.kt\ncom/baicizhan/main/home/player/IslandsKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n384#1:2307,6\n404#1:2330,6\n393#1:2315\n384#2:2337,6\n*E\n"})
/* loaded from: classes4.dex */
public final class IslandsKt$BuildingBoard$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {
    final /* synthetic */ long $background$inlined;
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ int $cost$inlined;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $start;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IslandsKt$BuildingBoard$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, long j11, int i11) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$background$inlined = j11;
        this.$cost$inlined = i11;
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
        composer.startReplaceGroup(867218872);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
        ConstrainedLayoutReference component1 = createRefs.component1();
        ConstrainedLayoutReference component2 = createRefs.component2();
        Modifier.Companion companion = Modifier.Companion;
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue == companion2.getEmpty()) {
            rememberedValue = IslandsKt.a.f23323a;
            composer.updateRememberedValue(rememberedValue);
        }
        SurfaceKt.m1784SurfaceFjzlyU(constraintLayoutScope.constrainAs(companion, component1, (x00.l) rememberedValue), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100)), this.$background$inlined, bk.b.L0(this.$background$inlined, composer, 6), null, 0.0f, ComposableLambdaKt.rememberComposableLambda(-193338476, true, new IslandsKt.b(this.$cost$inlined), composer, 54), composer, 1573248, 48);
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_home_forwarding, composer, 6);
        boolean changed = composer.changed(component1);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion2.getEmpty()) {
            rememberedValue2 = new IslandsKt.c(component1);
            composer.updateRememberedValue(rememberedValue2);
        }
        ImageKt.Image(painterResource, "icon", constraintLayoutScope.constrainAs(companion, component2, (x00.l) rememberedValue2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
        composer.endReplaceGroup();
        boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final MutableState mutableState = this.$start;
        final MutableState mutableState2 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion2.getEmpty()) {
            rememberedValue3 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.IslandsKt$BuildingBoard$$inlined$ConstraintLayout$1.1
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
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.SideEffect((x00.a) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
