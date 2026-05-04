package androidx.compose.foundation.gestures;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.AndroidOverscroll_androidKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1037:1\n1247#2,6:1038\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableDefaults\n*L\n539#1:1038,6\n*E\n"})
/* loaded from: classes.dex */
public final class ScrollableDefaults {
    public static final int $stable = 0;

    @k
    public static final ScrollableDefaults INSTANCE = new ScrollableDefaults();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class NoOpOverscrollEffect implements OverscrollEffect {

        @k
        public static final NoOpOverscrollEffect INSTANCE = new NoOpOverscrollEffect();

        private NoOpOverscrollEffect() {
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        @l
        /* renamed from: applyToFling-BMRW4eQ */
        public Object mo213applyToFlingBMRW4eQ(long j11, @k p<? super Velocity, ? super c<? super Velocity>, ? extends Object> pVar, @k c<? super g2> cVar) {
            Object invoke = pVar.invoke(Velocity.m5344boximpl(j11), cVar);
            return invoke == b.l() ? invoke : g2.f100423a;
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        /* renamed from: applyToScroll-Rhakbz0 */
        public long mo214applyToScrollRhakbz0(long j11, int i11, @k x00.l<? super Offset, Offset> lVar) {
            return lVar.invoke(Offset.m2257boximpl(j11)).m2278unboximpl();
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        @k
        public DelegatableNode getNode() {
            return new Modifier.Node() { // from class: androidx.compose.foundation.gestures.ScrollableDefaults$NoOpOverscrollEffect$node$1
            };
        }

        @Override // androidx.compose.foundation.OverscrollEffect
        public boolean isInProgress() {
            return false;
        }
    }

    private ScrollableDefaults() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @k
    public final FlingBehavior flingBehavior(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1107739818, i11, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:536)");
        }
        DecayAnimationSpec rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        boolean changed = composer.changed(rememberSplineBasedDecay);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultFlingBehavior(rememberSplineBasedDecay, null, 2, 0 == true ? 1 : 0);
            composer.updateRememberedValue(rememberedValue);
        }
        DefaultFlingBehavior defaultFlingBehavior = (DefaultFlingBehavior) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFlingBehavior;
    }

    @Composable
    @n(message = "This API has been replaced with rememberOverscrollEffect, which queries theme provided OverscrollFactory values instead of the 'platform default' without customization.", replaceWith = @w0(expression = "rememberOverscrollEffect()", imports = {"androidx.compose.foundation.rememberOverscrollEffect"}))
    @k
    public final OverscrollEffect overscrollEffect(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1809802212, i11, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.overscrollEffect (Scrollable.kt:556)");
        }
        OverscrollEffect rememberPlatformOverscrollEffect = AndroidOverscroll_androidKt.rememberPlatformOverscrollEffect(composer, 0);
        if (rememberPlatformOverscrollEffect == null) {
            rememberPlatformOverscrollEffect = NoOpOverscrollEffect.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberPlatformOverscrollEffect;
    }

    public final boolean reverseDirection(@k LayoutDirection layoutDirection, @k Orientation orientation, boolean z11) {
        return (layoutDirection != LayoutDirection.Rtl || orientation == Orientation.Vertical) ? !z11 : z11;
    }
}
