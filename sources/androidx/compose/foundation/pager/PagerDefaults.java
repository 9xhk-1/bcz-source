package androidx.compose.foundation.pager;

import androidx.annotation.FloatRange;
import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,592:1\n96#2,5:593\n75#3:598\n75#3:599\n1247#4,6:600\n1247#4,6:606\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerDefaults\n*L\n385#1:593,5\n389#1:598\n390#1:599\n391#1:600,6\n434#1:606,6\n*E\n"})
/* loaded from: classes.dex */
public final class PagerDefaults {
    public static final int $stable = 0;
    public static final int BeyondViewportPageCount = 0;

    @k
    public static final PagerDefaults INSTANCE = new PagerDefaults();

    private PagerDefaults() {
    }

    @Composable
    @k
    public final TargetedFlingBehavior flingBehavior(@k final PagerState pagerState, @l PagerSnapDistance pagerSnapDistance, @l DecayAnimationSpec<Float> decayAnimationSpec, @l AnimationSpec<Float> animationSpec, @FloatRange(from = 0.0d, to = 1.0d) final float f11, @l Composer composer, int i11, int i12) {
        boolean z11 = true;
        if ((i12 & 2) != 0) {
            pagerSnapDistance = PagerSnapDistance.Companion.atMost(1);
        }
        if ((i12 & 4) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if ((i12 & 8) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, Float.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(e0.f66981a)), 1, null);
        }
        if ((i12 & 16) != 0) {
            f11 = 0.5f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1559769181, i11, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:383)");
        }
        if (!(0.0f <= f11 && f11 <= 1.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f11);
        }
        Object obj = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        final LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        boolean changed = ((((i11 & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i11 & 6) == 4) | composer.changed(decayAnimationSpec) | composer.changed(animationSpec);
        if ((((i11 & 112) ^ 48) <= 32 || !composer.changed(pagerSnapDistance)) && (i11 & 48) != 32) {
            z11 = false;
        }
        boolean changed2 = changed | z11 | composer.changed(obj) | composer.changed(layoutDirection);
        Object rememberedValue = composer.rememberedValue();
        if (changed2 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapFlingBehaviorKt.snapFlingBehavior(PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider(pagerState, pagerSnapDistance, new q<Float, Float, Float, Float>() { // from class: androidx.compose.foundation.pager.PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // x00.q
                public /* bridge */ /* synthetic */ Float invoke(Float f12, Float f13, Float f14) {
                    return invoke(f12.floatValue(), f13.floatValue(), f14.floatValue());
                }

                public final Float invoke(float f12, float f13, float f14) {
                    return Float.valueOf(PagerSnapLayoutInfoProviderKt.calculateFinalSnappingBound(PagerState.this, layoutDirection, f11, f12, f13, f14));
                }
            }), decayAnimationSpec, animationSpec);
            composer.updateRememberedValue(rememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehavior;
    }

    @Composable
    @k
    public final NestedScrollConnection pageNestedScrollConnection(@k PagerState pagerState, @k Orientation orientation, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(877583120, i11, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:432)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(orientation)) || (i11 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultPagerNestedScrollConnection(pagerState, orientation);
            composer.updateRememberedValue(rememberedValue);
        }
        DefaultPagerNestedScrollConnection defaultPagerNestedScrollConnection = (DefaultPagerNestedScrollConnection) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultPagerNestedScrollConnection;
    }
}
