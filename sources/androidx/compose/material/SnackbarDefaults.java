package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SnackbarDefaults {
    public static final int $stable = 0;

    @k
    public static final SnackbarDefaults INSTANCE = new SnackbarDefaults();
    private static final float SnackbarOverlayAlpha = 0.8f;

    private SnackbarDefaults() {
    }

    @j(name = "getBackgroundColor")
    @Composable
    public final long getBackgroundColor(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1630911716, i11, -1, "androidx.compose.material.SnackbarDefaults.<get-backgroundColor> (Snackbar.kt:203)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        long m2554compositeOverOWjLjI = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(materialTheme.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1604getSurface0d7_KjU());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2554compositeOverOWjLjI;
    }

    @j(name = "getPrimaryActionColor")
    @Composable
    public final long getPrimaryActionColor(@l Composer composer, int i11) {
        long m1601getPrimaryVariant0d7_KjU;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-810329402, i11, -1, "androidx.compose.material.SnackbarDefaults.<get-primaryActionColor> (Snackbar.kt:223)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (colors.isLight()) {
            m1601getPrimaryVariant0d7_KjU = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(colors.m1604getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), colors.m1600getPrimary0d7_KjU());
        } else {
            m1601getPrimaryVariant0d7_KjU = colors.m1601getPrimaryVariant0d7_KjU();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1601getPrimaryVariant0d7_KjU;
    }
}
