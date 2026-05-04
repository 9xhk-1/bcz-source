package com.baicizhan.main.home.player;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.compose.CompositionSource;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.RawConstraintSet;
import com.baicizhan.main.home.player.HomeActivityKt;
import com.baicizhan.main.home.player.model.HomeMode;
import k3.o4;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import ug.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n+ 2 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2303:1\n744#2:2304\n794#2,3:2305\n797#2:2309\n803#2,16:2316\n826#2:2338\n834#2:2345\n887#2:2352\n793#2:2359\n1505#2:2360\n113#3:2308\n1247#4,6:2310\n1247#4,6:2332\n1247#4,6:2339\n1247#4,6:2346\n1247#4,6:2353\n1225#4,6:2361\n*S KotlinDebug\n*F\n+ 1 HomeActivity.kt\ncom/baicizhan/main/home/player/HomeActivityKt\n+ 2 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt$ConstraintLayout$contentDelegate$1\n*L\n796#1:2308\n797#1:2310,6\n818#1:2332,6\n826#1:2339,6\n834#1:2346,6\n887#1:2353,6\n384#2:2361,6\n*E\n"})
/* loaded from: classes4.dex */
public final class HomeActivityKt$PlayerHome$lambda$2$0$7$5$0$0$$inlined$ConstraintLayout$1 extends Lambda implements x00.p<Composer, Integer, yz.g2> {
    final /* synthetic */ MutableState $buildingSource$inlined;
    final /* synthetic */ e40.o $channel;
    final /* synthetic */ MutableState $coinAnimation$inlined;
    final /* synthetic */ MutableState $coinIconCoordinate$inlined;
    final /* synthetic */ MutableState $coinsSource$inlined;
    final /* synthetic */ MutableState $coinsTip$inlined;
    final /* synthetic */ Ref $compositionSource;
    final /* synthetic */ MutableState $contentTracker;
    final /* synthetic */ HomeMode $currentMode$inlined;
    final /* synthetic */ MutableState $end;
    final /* synthetic */ MutableState $forwardAnimation$inlined;
    final /* synthetic */ MutableState $forwardIconCoordinate$inlined;
    final /* synthetic */ MutableState $forwardingTip$inlined;
    final /* synthetic */ MutableState $hammerTip$inlined;
    final /* synthetic */ State $homeAction$delegate$inlined;
    final /* synthetic */ State $homeState$delegate$inlined;
    final /* synthetic */ wg.q $model$inlined;
    final /* synthetic */ ConstraintLayoutScope $scope;
    final /* synthetic */ MutableState $settings$inlined;
    final /* synthetic */ MutableState $start;
    final /* synthetic */ MutableState $testReward$inlined;
    final /* synthetic */ MutableState $userInfo$inlined;
    final /* synthetic */ MutableState $vitalityIconCoordinate$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeActivityKt$PlayerHome$lambda$2$0$7$5$0$0$$inlined$ConstraintLayout$1(MutableState mutableState, Ref ref, ConstraintLayoutScope constraintLayoutScope, e40.o oVar, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, HomeMode homeMode, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, State state, wg.q qVar, State state2, MutableState mutableState9, MutableState mutableState10, MutableState mutableState11, MutableState mutableState12, MutableState mutableState13, MutableState mutableState14, MutableState mutableState15, MutableState mutableState16) {
        super(2);
        this.$contentTracker = mutableState;
        this.$compositionSource = ref;
        this.$scope = constraintLayoutScope;
        this.$channel = oVar;
        this.$start = mutableState2;
        this.$end = mutableState3;
        this.$coinsSource$inlined = mutableState4;
        this.$buildingSource$inlined = mutableState5;
        this.$currentMode$inlined = homeMode;
        this.$vitalityIconCoordinate$inlined = mutableState6;
        this.$coinIconCoordinate$inlined = mutableState7;
        this.$forwardIconCoordinate$inlined = mutableState8;
        this.$homeAction$delegate$inlined = state;
        this.$model$inlined = qVar;
        this.$homeState$delegate$inlined = state2;
        this.$testReward$inlined = mutableState9;
        this.$coinAnimation$inlined = mutableState10;
        this.$forwardAnimation$inlined = mutableState11;
        this.$userInfo$inlined = mutableState12;
        this.$coinsTip$inlined = mutableState13;
        this.$forwardingTip$inlined = mutableState14;
        this.$hammerTip$inlined = mutableState15;
        this.$settings$inlined = mutableState16;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ yz.g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        String str;
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
        composer.startReplaceGroup(570034298);
        ConstraintLayoutScope.ConstrainedLayoutReferences createRefs = constraintLayoutScope.createRefs();
        createRefs.component1();
        createRefs.component2();
        ConstrainedLayoutReference component3 = createRefs.component3();
        createRefs.component4();
        createRefs.component5();
        createRefs.component6();
        createRefs.component7();
        createRefs.component8();
        createRefs.component9();
        createRefs.component10();
        createRefs.component11();
        createRefs.component12();
        createRefs.component13();
        createRefs.component14();
        createRefs.component15();
        createRefs.component16();
        Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.Companion), Dp.m5115constructorimpl(56));
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = HomeActivityKt.r.f23253a;
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier constrainAs = constraintLayoutScope.constrainAs(m759height3ABfNKs, component3, (x00.l) rememberedValue);
        k3.o4 O0 = HomeActivityKt.O0(this.$homeState$delegate$inlined);
        kotlin.jvm.internal.g0.n(O0, "null cannot be cast to non-null type com.baicizhan.app.api.service.WordsHomeState.Content");
        String k11 = ((o4.a) O0).d().n().k();
        g.b bVar = new g.b(0L);
        Pair pair = (Pair) this.$coinsSource$inlined.getValue();
        Pair pair2 = (Pair) this.$buildingSource$inlined.getValue();
        HomeMode homeMode = this.$currentMode$inlined;
        if (homeMode == null) {
            homeMode = HomeMode.WORDS;
        }
        MutableState mutableState = this.$vitalityIconCoordinate$inlined;
        HomeMode homeMode2 = homeMode;
        MutableState mutableState2 = this.$coinIconCoordinate$inlined;
        MutableState mutableState3 = this.$forwardIconCoordinate$inlined;
        boolean changed = composer.changed(this.$homeAction$delegate$inlined) | composer.changedInstance(constraintLayoutScope);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new HomeActivityKt.s(this.$testReward$inlined, constraintLayoutScope, this.$coinAnimation$inlined, this.$homeAction$delegate$inlined);
            composer.updateRememberedValue(rememberedValue2);
        }
        x00.a aVar = (x00.a) rememberedValue2;
        boolean changed2 = composer.changed(this.$homeAction$delegate$inlined) | composer.changedInstance(constraintLayoutScope);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == companion.getEmpty()) {
            str = k11;
            rememberedValue3 = new HomeActivityKt.t(this.$testReward$inlined, constraintLayoutScope, this.$forwardAnimation$inlined, this.$homeAction$delegate$inlined);
            composer.updateRememberedValue(rememberedValue3);
        } else {
            str = k11;
        }
        x00.a aVar2 = (x00.a) rememberedValue3;
        boolean changed3 = composer.changed(this.$homeAction$delegate$inlined) | composer.changedInstance(constraintLayoutScope);
        Object rememberedValue4 = composer.rememberedValue();
        if (changed3 || rememberedValue4 == companion.getEmpty()) {
            rememberedValue4 = new HomeActivityKt.u(this.$testReward$inlined, constraintLayoutScope, this.$homeAction$delegate$inlined);
            composer.updateRememberedValue(rememberedValue4);
        }
        x00.a aVar3 = (x00.a) rememberedValue4;
        boolean changedInstance = composer.changedInstance(this.$model$inlined);
        HomeMode homeMode3 = this.$currentMode$inlined;
        boolean changed4 = changedInstance | composer.changed(homeMode3 == null ? -1 : homeMode3.ordinal());
        Object rememberedValue5 = composer.rememberedValue();
        if (changed4 || rememberedValue5 == companion.getEmpty()) {
            rememberedValue5 = new HomeActivityKt.v(this.$model$inlined, this.$userInfo$inlined, this.$coinsTip$inlined, this.$currentMode$inlined, this.$forwardingTip$inlined, this.$hammerTip$inlined, this.$settings$inlined);
            composer.updateRememberedValue(rememberedValue5);
        }
        TopStatusKt.F(constrainAs, str, bVar, pair, pair2, homeMode2, mutableState, mutableState2, mutableState3, aVar, aVar2, aVar3, null, (x00.l) rememberedValue5, composer, 114819072, 0, 4096);
        composer.endReplaceGroup();
        boolean changedInstance2 = composer.changedInstance(this.$scope) | composer.changedInstance(this.$channel);
        final ConstraintLayoutScope constraintLayoutScope2 = this.$scope;
        final MutableState mutableState4 = this.$start;
        final MutableState mutableState5 = this.$end;
        final e40.o oVar = this.$channel;
        Object rememberedValue6 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue6 == companion.getEmpty()) {
            rememberedValue6 = new x00.a<yz.g2>() { // from class: com.baicizhan.main.home.player.HomeActivityKt$PlayerHome$lambda$2$0$7$5$0$0$$inlined$ConstraintLayout$1.1
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
                    if (mutableState4.getValue() != null && mutableState5.getValue() != null) {
                        oVar.m(rawConstraintSet);
                    } else {
                        mutableState4.setValue(rawConstraintSet);
                        mutableState5.setValue(mutableState4.getValue());
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
