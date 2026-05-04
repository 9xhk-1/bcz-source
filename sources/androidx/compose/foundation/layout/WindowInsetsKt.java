package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,710:1\n75#2:711\n113#3:712\n113#3:713\n113#3:714\n113#3:715\n*S KotlinDebug\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/WindowInsetsKt\n*L\n221#1:711\n252#1:712\n253#1:713\n254#1:714\n255#1:715\n*E\n"})
/* loaded from: classes.dex */
public final class WindowInsetsKt {
    @m80.k
    public static final WindowInsets WindowInsets(int i11, int i12, int i13, int i14) {
        return new FixedIntInsets(i11, i12, i13, i14);
    }

    public static /* synthetic */ WindowInsets WindowInsets$default(int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = 0;
        }
        if ((i15 & 2) != 0) {
            i12 = 0;
        }
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        return WindowInsets(i11, i12, i13, i14);
    }

    @m80.k
    /* renamed from: WindowInsets-a9UjIt4, reason: not valid java name */
    public static final WindowInsets m797WindowInsetsa9UjIt4(float f11, float f12, float f13, float f14) {
        return new FixedDpInsets(f11, f12, f13, f14, null);
    }

    /* renamed from: WindowInsets-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ WindowInsets m798WindowInsetsa9UjIt4$default(float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 4) != 0) {
            f13 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 8) != 0) {
            f14 = Dp.m5115constructorimpl(0);
        }
        return m797WindowInsetsa9UjIt4(f11, f12, f13, f14);
    }

    @m80.k
    public static final WindowInsets add(@m80.k WindowInsets windowInsets, @m80.k WindowInsets windowInsets2) {
        return new AddedInsets(windowInsets, windowInsets2);
    }

    @m80.k
    public static final WindowInsets asInsets(@m80.k PaddingValues paddingValues) {
        return new PaddingValuesInsets(paddingValues);
    }

    @Composable
    @ReadOnlyComposable
    @m80.k
    public static final PaddingValues asPaddingValues(@m80.k WindowInsets windowInsets, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1485016250, i11, -1, "androidx.compose.foundation.layout.asPaddingValues (WindowInsets.kt:220)");
        }
        InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(windowInsets, (Density) composer.consume(CompositionLocalsKt.getLocalDensity()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return insetsPaddingValues;
    }

    @m80.k
    public static final WindowInsets exclude(@m80.k WindowInsets windowInsets, @m80.k WindowInsets windowInsets2) {
        return new ExcludeInsets(windowInsets, windowInsets2);
    }

    @m80.k
    /* renamed from: only-bOOhFvg, reason: not valid java name */
    public static final WindowInsets m799onlybOOhFvg(@m80.k WindowInsets windowInsets, int i11) {
        return new LimitInsets(windowInsets, i11, null);
    }

    @m80.k
    public static final WindowInsets union(@m80.k WindowInsets windowInsets, @m80.k WindowInsets windowInsets2) {
        return new UnionInsets(windowInsets, windowInsets2);
    }

    @m80.k
    public static final PaddingValues asPaddingValues(@m80.k WindowInsets windowInsets, @m80.k Density density) {
        return new InsetsPaddingValues(windowInsets, density);
    }
}
