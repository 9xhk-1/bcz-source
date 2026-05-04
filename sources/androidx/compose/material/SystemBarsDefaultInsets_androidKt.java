package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class SystemBarsDefaultInsets_androidKt {
    @j(name = "getSystemBarsForVisualComponents")
    @Composable
    @k
    public static final WindowInsets getSystemBarsForVisualComponents(@k WindowInsets.Companion companion, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1520067638, i11, -1, "androidx.compose.material.<get-systemBarsForVisualComponents> (SystemBarsDefaultInsets.android.kt:25)");
        }
        int i12 = i11 & 14;
        WindowInsets union = WindowInsetsKt.union(WindowInsets_androidKt.getSystemBars(companion, composer, i12), WindowInsets_androidKt.getDisplayCutout(companion, composer, i12));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return union;
    }
}
