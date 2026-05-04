package androidx.compose.material;

import androidx.compose.material.ripple.RippleAlpha;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class RippleDefaults {
    public static final int $stable = 0;

    @k
    public static final RippleDefaults INSTANCE = new RippleDefaults();

    private RippleDefaults() {
    }

    @k
    /* renamed from: rippleAlpha-DxMtmZc, reason: not valid java name */
    public final RippleAlpha m1745rippleAlphaDxMtmZc(long j11, boolean z11) {
        RippleAlpha rippleAlpha;
        RippleAlpha rippleAlpha2;
        RippleAlpha rippleAlpha3;
        if (!z11) {
            rippleAlpha = RippleKt.DarkThemeRippleAlpha;
            return rippleAlpha;
        }
        if (ColorKt.m2561luminance8_81llA(j11) > 0.5d) {
            rippleAlpha3 = RippleKt.LightThemeHighContrastRippleAlpha;
            return rippleAlpha3;
        }
        rippleAlpha2 = RippleKt.LightThemeLowContrastRippleAlpha;
        return rippleAlpha2;
    }

    /* renamed from: rippleColor-5vOe2sY, reason: not valid java name */
    public final long m1746rippleColor5vOe2sY(long j11, boolean z11) {
        return (z11 || ((double) ColorKt.m2561luminance8_81llA(j11)) >= 0.5d) ? j11 : Color.Companion.m2546getWhite0d7_KjU();
    }
}
