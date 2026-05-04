package androidx.compose.material.ripple;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.DeprecationLevel;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(level = DeprecationLevel.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
/* loaded from: classes.dex */
public interface RippleTheme {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @n(level = DeprecationLevel.WARNING, message = "The default ripple alpha varies between design system versions: this function technically implements the default used by the material library, but is not used by the material3 library. To remove confusion and link the defaults more strongly to the design system library, these default values have been moved to the material and material3 libraries. For material, use RippleDefaults#rippleAlpha. For material3, use RippleDefaults#RippleAlpha.")
        @k
        /* renamed from: defaultRippleAlpha-DxMtmZc, reason: not valid java name */
        public final RippleAlpha m1879defaultRippleAlphaDxMtmZc(long j11, boolean z11) {
            RippleAlpha rippleAlpha;
            RippleAlpha rippleAlpha2;
            RippleAlpha rippleAlpha3;
            if (!z11) {
                rippleAlpha = RippleThemeKt.DarkThemeRippleAlpha;
                return rippleAlpha;
            }
            if (ColorKt.m2561luminance8_81llA(j11) > 0.5d) {
                rippleAlpha3 = RippleThemeKt.LightThemeHighContrastRippleAlpha;
                return rippleAlpha3;
            }
            rippleAlpha2 = RippleThemeKt.LightThemeLowContrastRippleAlpha;
            return rippleAlpha2;
        }

        @n(level = DeprecationLevel.WARNING, message = "The default ripple color varies between design system versions: this function technically implements the default used by the material library, but is not used by the material3 library. To remove confusion and link the defaults more strongly to the design system library, these default values have been moved to the material and material3 libraries. For material, use RippleDefaults#rippleColor. For material3, use content color directly.")
        /* renamed from: defaultRippleColor-5vOe2sY, reason: not valid java name */
        public final long m1880defaultRippleColor5vOe2sY(long j11, boolean z11) {
            return (z11 || ((double) ColorKt.m2561luminance8_81llA(j11)) >= 0.5d) ? j11 : Color.Companion.m2546getWhite0d7_KjU();
        }
    }

    @Composable
    @n(level = DeprecationLevel.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
    /* renamed from: defaultColor-WaAFU9c */
    long mo1868defaultColorWaAFU9c(@l Composer composer, int i11);

    @Composable
    @n(level = DeprecationLevel.ERROR, message = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com")
    @k
    RippleAlpha rippleAlpha(@l Composer composer, int i11);
}
