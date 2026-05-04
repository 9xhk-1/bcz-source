package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.u0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1073:1\n75#2:1074\n75#2:1075\n75#2:1076\n75#2:1077\n75#2:1078\n1247#3,6:1079\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt\n*L\n87#1:1074\n88#1:1075\n109#1:1076\n110#1:1077\n111#1:1078\n115#1:1079,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidOverscroll_androidKt {
    private static final long DefaultGlowColor = ColorKt.Color(4284900966L);

    @m80.k
    private static final PaddingValues DefaultGlowPaddingValues = PaddingKt.m721PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
    private static final float FlingDestretchFactor = 4.0f;

    @l
    public static final OverscrollFactory defaultOverscrollFactory(@m80.k CompositionLocalAccessorScope compositionLocalAccessorScope) {
        Context context = (Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext());
        Density density = (Density) compositionLocalAccessorScope.getCurrentValue(CompositionLocalsKt.getLocalDensity());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) compositionLocalAccessorScope.getCurrentValue(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration == null) {
            return null;
        }
        return new AndroidEdgeEffectOverscrollFactory(context, density, overscrollConfiguration.m324getGlowColor0d7_KjU(), overscrollConfiguration.getDrawPadding(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: destretchMultiplier-GyEprt8, reason: not valid java name */
    public static final float m232destretchMultiplierGyEprt8(int i11) {
        return NestedScrollSource.m3613equalsimpl0(i11, NestedScrollSource.Companion.m3624getSideEffectWNlRxjI()) ? 4.0f : 1.0f;
    }

    @l
    @Composable
    public static final OverscrollEffect rememberPlatformOverscrollEffect(@l Composer composer, int i11) {
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1569526143, i11, -1, "androidx.compose.foundation.rememberPlatformOverscrollEffect (AndroidOverscroll.android.kt:107)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) composer.consume(OverscrollConfiguration_androidKt.getLocalOverscrollConfiguration());
        if (overscrollConfiguration == null) {
            composer.startReplaceGroup(-461477086);
            composer.endReplaceGroup();
            androidEdgeEffectOverscrollEffect = null;
        } else {
            composer.startReplaceGroup(-461444412);
            boolean changed = composer.changed(context) | composer.changed(density) | composer.changed(overscrollConfiguration);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                Object androidEdgeEffectOverscrollEffect2 = new AndroidEdgeEffectOverscrollEffect(context, density, overscrollConfiguration.m324getGlowColor0d7_KjU(), overscrollConfiguration.getDrawPadding(), null);
                composer.updateRememberedValue(androidEdgeEffectOverscrollEffect2);
                rememberedValue = androidEdgeEffectOverscrollEffect2;
            }
            composer.endReplaceGroup();
            androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) rememberedValue;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidEdgeEffectOverscrollEffect;
    }

    @Composable
    @m80.k
    /* renamed from: rememberPlatformOverscrollFactory-3J-VO9M, reason: not valid java name */
    public static final OverscrollFactory m233rememberPlatformOverscrollFactory3JVO9M(long j11, @l PaddingValues paddingValues, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            j11 = DefaultGlowColor;
        }
        long j12 = j11;
        if ((i12 & 2) != 0) {
            paddingValues = DefaultGlowPaddingValues;
        }
        PaddingValues paddingValues2 = paddingValues;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2017030679, i11, -1, "androidx.compose.foundation.rememberPlatformOverscrollFactory (AndroidOverscroll.android.kt:85)");
        }
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = new AndroidEdgeEffectOverscrollFactory((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), (Density) composer.consume(CompositionLocalsKt.getLocalDensity()), j12, paddingValues2, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidEdgeEffectOverscrollFactory;
    }
}
