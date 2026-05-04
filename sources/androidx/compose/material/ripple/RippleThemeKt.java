package androidx.compose.material.ripple;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.DeprecationLevel;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class RippleThemeKt {

    @k
    private static final String RippleThemeDeprecationMessage = "RippleTheme and LocalRippleTheme have been deprecated - they are not compatible with the new ripple implementation using the new Indication APIs that provide notable performance improvements. For a migration guide and background information, please visit developer.android.com";

    @k
    private static final ProvidableCompositionLocal<RippleTheme> LocalRippleTheme = CompositionLocalKt.staticCompositionLocalOf(new x00.a<RippleTheme>() { // from class: androidx.compose.material.ripple.RippleThemeKt$LocalRippleTheme$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final RippleTheme invoke() {
            return DebugRippleTheme.INSTANCE;
        }
    });

    @k
    private static final RippleAlpha LightThemeHighContrastRippleAlpha = new RippleAlpha(0.16f, 0.24f, 0.08f, 0.24f);

    @k
    private static final RippleAlpha LightThemeLowContrastRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.12f);

    @k
    private static final RippleAlpha DarkThemeRippleAlpha = new RippleAlpha(0.08f, 0.12f, 0.04f, 0.1f);

    @k
    public static final ProvidableCompositionLocal<RippleTheme> getLocalRippleTheme() {
        return LocalRippleTheme;
    }

    @n(level = DeprecationLevel.ERROR, message = RippleThemeDeprecationMessage)
    public static /* synthetic */ void getLocalRippleTheme$annotations() {
    }
}
