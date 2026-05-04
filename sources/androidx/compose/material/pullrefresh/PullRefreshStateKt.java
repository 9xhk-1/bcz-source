package androidx.compose.material.pullrefresh;

import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import c40.r0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,241:1\n149#2:242\n1#3:243\n557#4:244\n554#4,6:245\n1247#5,3:251\n1250#5,3:255\n1247#5,6:259\n1247#5,6:265\n555#6:254\n75#7:258\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshStateKt\n*L\n63#1:242\n65#1:244\n65#1:245,6\n65#1:251,3\n65#1:255,3\n76#1:259,6\n78#1:265,6\n65#1:254\n70#1:258\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshStateKt {
    private static final float DragMultiplier = 0.5f;

    @Composable
    @ExperimentalMaterialApi
    @k
    /* renamed from: rememberPullRefreshState-UuyPYSY, reason: not valid java name */
    public static final PullRefreshState m1864rememberPullRefreshStateUuyPYSY(final boolean z11, @k a<g2> aVar, float f11, float f12, @l Composer composer, int i11, int i12) {
        if ((i12 & 4) != 0) {
            f11 = PullRefreshDefaults.INSTANCE.m1857getRefreshThresholdD9Ej5fM();
        }
        if ((i12 & 8) != 0) {
            f12 = PullRefreshDefaults.INSTANCE.m1858getRefreshingOffsetD9Ej5fM();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-174977512, i11, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:61)");
        }
        if (Dp.m5114compareTo0680j_4(f11, Dp.m5115constructorimpl(0)) <= 0) {
            throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
        }
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
            composer.updateRememberedValue(rememberedValue);
        }
        r0 r0Var = (r0) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(aVar, composer, (i11 >> 3) & 14);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.FloatRef floatRef2 = new Ref.FloatRef();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        floatRef.element = density.mo377toPx0680j_4(f11);
        floatRef2.element = density.mo377toPx0680j_4(f12);
        boolean changed = composer.changed(r0Var);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new PullRefreshState(r0Var, rememberUpdatedState, floatRef2.element, floatRef.element);
            composer.updateRememberedValue(rememberedValue2);
        }
        final PullRefreshState pullRefreshState = (PullRefreshState) rememberedValue2;
        boolean changedInstance = composer.changedInstance(pullRefreshState) | ((((i11 & 14) ^ 6) > 4 && composer.changed(z11)) || (i11 & 6) == 4) | composer.changed(floatRef.element) | composer.changed(floatRef2.element);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new a<g2>() { // from class: androidx.compose.material.pullrefresh.PullRefreshStateKt$rememberPullRefreshState$3$1
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
                    PullRefreshState.this.setRefreshing$material_release(z11);
                    PullRefreshState.this.setThreshold$material_release(floatRef.element);
                    PullRefreshState.this.setRefreshingOffset$material_release(floatRef2.element);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        EffectsKt.SideEffect((a) rememberedValue3, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pullRefreshState;
    }
}
