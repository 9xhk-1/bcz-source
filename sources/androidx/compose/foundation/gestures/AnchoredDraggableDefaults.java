package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1753:1\n75#2:1754\n1247#3,6:1755\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableDefaults\n*L\n1522#1:1754\n1523#1:1755,6\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableDefaults {

    @k
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();

    @k
    private static final AnimationSpec<Float> SnapAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);

    @k
    private static final l<Float, Float> PositionalThreshold = new l<Float, Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableDefaults$PositionalThreshold$1
        public final Float invoke(float f11) {
            return Float.valueOf(f11 / 2.0f);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Float invoke(Float f11) {
            return invoke(f11.floatValue());
        }
    };

    @k
    private static final DecayAnimationSpec<Float> DecayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
    public static final int $stable = 8;

    private AnchoredDraggableDefaults() {
    }

    @Composable
    @k
    public final <T> TargetedFlingBehavior flingBehavior(@k AnchoredDraggableState<T> anchoredDraggableState, @m80.l l<? super Float, Float> lVar, @m80.l AnimationSpec<Float> animationSpec, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            lVar = PositionalThreshold;
        }
        if ((i12 & 4) != 0) {
            animationSpec = SnapAnimationSpec;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-952742024, i11, -1, "androidx.compose.foundation.gestures.AnchoredDraggableDefaults.flingBehavior (AnchoredDraggable.kt:1520)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean changed = ((((i11 & 14) ^ 6) > 4 && composer.changed(anchoredDraggableState)) || (i11 & 6) == 4) | composer.changed(density) | ((((i11 & 112) ^ 48) > 32 && composer.changed(lVar)) || (i11 & 48) == 32) | composer.changed(animationSpec);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = AnchoredDraggableKt.anchoredDraggableFlingBehavior(anchoredDraggableState, density, lVar, animationSpec);
            composer.updateRememberedValue(rememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    @k
    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        return DecayAnimationSpec;
    }

    @k
    public final l<Float, Float> getPositionalThreshold() {
        return PositionalThreshold;
    }

    @k
    public final AnimationSpec<Float> getSnapAnimationSpec() {
        return SnapAnimationSpec;
    }
}
