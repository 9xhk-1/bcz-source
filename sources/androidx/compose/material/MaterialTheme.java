package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nMaterialTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialTheme\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,113:1\n75#2:114\n75#2:115\n75#2:116\n*S KotlinDebug\n*F\n+ 1 MaterialTheme.kt\nandroidx/compose/material/MaterialTheme\n*L\n99#1:114\n107#1:115\n111#1:116\n*E\n"})
/* loaded from: classes.dex */
public final class MaterialTheme {
    public static final int $stable = 0;

    @k
    public static final MaterialTheme INSTANCE = new MaterialTheme();

    private MaterialTheme() {
    }

    @j(name = "getColors")
    @k
    @Composable
    @ReadOnlyComposable
    public final Colors getColors(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1462282791, i11, -1, "androidx.compose.material.MaterialTheme.<get-colors> (MaterialTheme.kt:98)");
        }
        Colors colors = (Colors) composer.consume(ColorsKt.getLocalColors());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colors;
    }

    @j(name = "getShapes")
    @k
    @Composable
    @ReadOnlyComposable
    public final Shapes getShapes(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1586253541, i11, -1, "androidx.compose.material.MaterialTheme.<get-shapes> (MaterialTheme.kt:110)");
        }
        Shapes shapes = (Shapes) composer.consume(ShapesKt.getLocalShapes());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shapes;
    }

    @j(name = "getTypography")
    @k
    @Composable
    @ReadOnlyComposable
    public final Typography getTypography(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1630198856, i11, -1, "androidx.compose.material.MaterialTheme.<get-typography> (MaterialTheme.kt:106)");
        }
        Typography typography = (Typography) composer.consume(TypographyKt.getLocalTypography());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return typography;
    }
}
