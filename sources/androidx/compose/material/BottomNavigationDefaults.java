package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,448:1\n149#2:449\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationDefaults\n*L\n254#1:449\n*E\n"})
/* loaded from: classes.dex */
public final class BottomNavigationDefaults {
    public static final int $stable = 0;

    @k
    public static final BottomNavigationDefaults INSTANCE = new BottomNavigationDefaults();
    private static final float Elevation = Dp.m5115constructorimpl(8);

    private BottomNavigationDefaults() {
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1548getElevationD9Ej5fM() {
        return Elevation;
    }

    @j(name = "getWindowInsets")
    @Composable
    @k
    public final WindowInsets getWindowInsets(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1427252235, i11, -1, "androidx.compose.material.BottomNavigationDefaults.<get-windowInsets> (BottomNavigation.kt:259)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m799onlybOOhFvg = WindowInsetsKt.m799onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m811plusgK_yJZ4(companion.m821getHorizontalJoeWqyM(), companion.m819getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m799onlybOOhFvg;
    }
}
