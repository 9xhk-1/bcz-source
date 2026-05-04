package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
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
@u0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,741:1\n149#2:742\n149#2:743\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarDefaults\n*L\n437#1:742\n440#1:743\n*E\n"})
/* loaded from: classes.dex */
public final class AppBarDefaults {
    public static final int $stable = 0;

    @k
    private static final PaddingValues ContentPadding;

    @k
    public static final AppBarDefaults INSTANCE = new AppBarDefaults();
    private static final float TopAppBarElevation = Dp.m5115constructorimpl(4);
    private static final float BottomAppBarElevation = Dp.m5115constructorimpl(8);

    static {
        float f11;
        float f12;
        f11 = AppBarKt.AppBarHorizontalPadding;
        f12 = AppBarKt.AppBarHorizontalPadding;
        ContentPadding = PaddingKt.m723PaddingValuesa9UjIt4$default(f11, 0.0f, f12, 0.0f, 10, null);
    }

    private AppBarDefaults() {
    }

    /* renamed from: getBottomAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m1524getBottomAppBarElevationD9Ej5fM() {
        return BottomAppBarElevation;
    }

    @j(name = "getBottomAppBarWindowInsets")
    @Composable
    @k
    public final WindowInsets getBottomAppBarWindowInsets(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1469837023, i11, -1, "androidx.compose.material.AppBarDefaults.<get-bottomAppBarWindowInsets> (AppBar.kt:456)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m799onlybOOhFvg = WindowInsetsKt.m799onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m811plusgK_yJZ4(companion.m821getHorizontalJoeWqyM(), companion.m819getBottomJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m799onlybOOhFvg;
    }

    @k
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getTopAppBarElevation-D9Ej5fM, reason: not valid java name */
    public final float m1525getTopAppBarElevationD9Ej5fM() {
        return TopAppBarElevation;
    }

    @j(name = "getTopAppBarWindowInsets")
    @Composable
    @k
    public final WindowInsets getTopAppBarWindowInsets(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-427176825, i11, -1, "androidx.compose.material.AppBarDefaults.<get-topAppBarWindowInsets> (AppBar.kt:449)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.Companion, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
        WindowInsets m799onlybOOhFvg = WindowInsetsKt.m799onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m811plusgK_yJZ4(companion.m821getHorizontalJoeWqyM(), companion.m825getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m799onlybOOhFvg;
    }
}
