package androidx.compose.animation;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AndroidActualDefaultDecayAnimationSpec_androidKt {
    @Composable
    @n(message = "Replace with rememberSplineBasedDecay<Float>")
    @k
    public static final DecayAnimationSpec<Float> defaultDecayAnimationSpec(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1468328074, i11, -1, "androidx.compose.animation.defaultDecayAnimationSpec (AndroidActualDefaultDecayAnimationSpec.android.kt:23)");
        }
        DecayAnimationSpec<Float> rememberSplineBasedDecay = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return rememberSplineBasedDecay;
    }
}
