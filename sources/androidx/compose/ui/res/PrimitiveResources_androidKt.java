package androidx.compose.ui.res;

import androidx.annotation.ArrayRes;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.IntegerRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPrimitiveResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,77:1\n75#2:78\n*S KotlinDebug\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n*L\n73#1:78\n*E\n"})
/* loaded from: classes2.dex */
public final class PrimitiveResources_androidKt {
    @Composable
    @ReadOnlyComposable
    public static final boolean booleanResource(@BoolRes int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-432394447, i12, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:59)");
        }
        boolean z11 = Resources_androidKt.resources(composer, 0).getBoolean(i11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return z11;
    }

    @Composable
    @ReadOnlyComposable
    public static final float dimensionResource(@DimenRes int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(804324951, i12, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:71)");
        }
        float m5115constructorimpl = Dp.m5115constructorimpl(Resources_androidKt.resources(composer, 0).getDimension(i11) / ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m5115constructorimpl;
    }

    @Composable
    @ReadOnlyComposable
    @k
    public static final int[] integerArrayResource(@ArrayRes int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-93991766, i12, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:47)");
        }
        int[] intArray = Resources_androidKt.resources(composer, 0).getIntArray(i11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return intArray;
    }

    @Composable
    @ReadOnlyComposable
    public static final int integerResource(@IntegerRes int i11, @l Composer composer, int i12) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(916701108, i12, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:35)");
        }
        int integer = Resources_androidKt.resources(composer, 0).getInteger(i11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return integer;
    }
}
