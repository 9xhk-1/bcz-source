package androidx.compose.material.ripple;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes.dex */
final class DebugRippleTheme implements RippleTheme {

    @k
    public static final DebugRippleTheme INSTANCE = new DebugRippleTheme();

    private DebugRippleTheme() {
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    @n(message = "Super method is deprecated")
    /* renamed from: defaultColor-WaAFU9c, reason: not valid java name */
    public long mo1868defaultColorWaAFU9c(@l Composer composer, int i11) {
        composer.startReplaceGroup(2042140174);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2042140174, i11, -1, "androidx.compose.material.ripple.DebugRippleTheme.defaultColor (RippleTheme.kt:237)");
        }
        long m1880defaultRippleColor5vOe2sY = RippleTheme.Companion.m1880defaultRippleColor5vOe2sY(Color.Companion.m2535getBlack0d7_KjU(), true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m1880defaultRippleColor5vOe2sY;
    }

    @Override // androidx.compose.material.ripple.RippleTheme
    @Composable
    @n(message = "Super method is deprecated")
    @k
    public RippleAlpha rippleAlpha(@l Composer composer, int i11) {
        composer.startReplaceGroup(-1629816343);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1629816343, i11, -1, "androidx.compose.material.ripple.DebugRippleTheme.rippleAlpha (RippleTheme.kt:242)");
        }
        RippleAlpha m1879defaultRippleAlphaDxMtmZc = RippleTheme.Companion.m1879defaultRippleAlphaDxMtmZc(Color.Companion.m2535getBlack0d7_KjU(), true);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m1879defaultRippleAlphaDxMtmZc;
    }
}
