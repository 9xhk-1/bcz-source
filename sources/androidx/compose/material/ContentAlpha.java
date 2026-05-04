package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nContentAlpha.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,134:1\n75#2:135\n*S KotlinDebug\n*F\n+ 1 ContentAlpha.kt\nandroidx/compose/material/ContentAlpha\n*L\n79#1:135\n*E\n"})
/* loaded from: classes.dex */
public final class ContentAlpha {
    public static final int $stable = 0;

    @k
    public static final ContentAlpha INSTANCE = new ContentAlpha();

    private ContentAlpha() {
    }

    @Composable
    private final float contentAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12, Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1528360391, i11, -1, "androidx.compose.material.ContentAlpha.contentAlpha (ContentAlpha.kt:77)");
        }
        long m2519unboximpl = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl();
        if (!MaterialTheme.INSTANCE.getColors(composer, 6).isLight() ? ColorKt.m2561luminance8_81llA(m2519unboximpl) >= 0.5d : ColorKt.m2561luminance8_81llA(m2519unboximpl) <= 0.5d) {
            f11 = f12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return f11;
    }

    @j(name = "getDisabled")
    @Composable
    public final float getDisabled(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(621183615, i11, -1, "androidx.compose.material.ContentAlpha.<get-disabled> (ContentAlpha.kt:60)");
        }
        float contentAlpha = contentAlpha(0.38f, 0.38f, composer, ((i11 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return contentAlpha;
    }

    @j(name = "getHigh")
    @Composable
    public final float getHigh(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(629162431, i11, -1, "androidx.compose.material.ContentAlpha.<get-high> (ContentAlpha.kt:36)");
        }
        float contentAlpha = contentAlpha(1.0f, 0.87f, composer, ((i11 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return contentAlpha;
    }

    @j(name = "getMedium")
    @Composable
    public final float getMedium(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1999054879, i11, -1, "androidx.compose.material.ContentAlpha.<get-medium> (ContentAlpha.kt:48)");
        }
        float contentAlpha = contentAlpha(0.74f, 0.6f, composer, ((i11 << 6) & 896) | 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return contentAlpha;
    }
}
