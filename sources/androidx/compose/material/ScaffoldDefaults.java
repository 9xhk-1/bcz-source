package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ScaffoldDefaults {
    public static final int $stable = 0;

    @k
    public static final ScaffoldDefaults INSTANCE = new ScaffoldDefaults();

    private ScaffoldDefaults() {
    }

    @j(name = "getContentWindowInsets")
    @Composable
    @k
    public final WindowInsets getContentWindowInsets(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(423092031, i11, -1, "androidx.compose.material.ScaffoldDefaults.<get-contentWindowInsets> (Scaffold.kt:351)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return systemBarsForVisualComponents;
    }
}
