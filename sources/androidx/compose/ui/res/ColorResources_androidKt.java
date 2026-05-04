package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nColorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,38:1\n75#2:39\n*S KotlinDebug\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n*L\n35#1:39\n*E\n"})
/* loaded from: classes2.dex */
public final class ColorResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final long colorResource(@ColorRes int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1777644873, i12, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:33)");
        }
        long Color = ColorKt.Color(ResourcesCompat.getColor(Resources_androidKt.resources(composer, 0), i11, ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getTheme()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Color;
    }
}
