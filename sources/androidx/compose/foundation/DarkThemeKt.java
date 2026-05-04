package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class DarkThemeKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean isSystemInDarkTheme(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1100791446, i11, -1, "androidx.compose.foundation.isSystemInDarkTheme (DarkTheme.kt:36)");
        }
        boolean _isSystemInDarkTheme = DarkTheme_androidKt._isSystemInDarkTheme(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return _isSystemInDarkTheme;
    }
}
