package androidx.compose.ui.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextMeasurerHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,51:1\n75#2:52\n75#2:53\n75#2:54\n1247#3,6:55\n*S KotlinDebug\n*F\n+ 1 TextMeasurerHelper.kt\nandroidx/compose/ui/text/TextMeasurerHelperKt\n*L\n43#1:52\n44#1:53\n45#1:54\n47#1:55,6\n*E\n"})
/* loaded from: classes2.dex */
public final class TextMeasurerHelperKt {
    private static final int DefaultCacheSize = 8;

    @Composable
    @k
    public static final TextMeasurer rememberTextMeasurer(int i11, @l Composer composer, int i12, int i13) {
        boolean z11 = true;
        if ((i13 & 1) != 0) {
            i11 = DefaultCacheSize;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1538166871, i12, -1, "androidx.compose.ui.text.rememberTextMeasurer (TextMeasurerHelper.kt:41)");
        }
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        boolean changed = composer.changed(resolver) | composer.changed(density) | composer.changed(layoutDirection);
        if ((((i12 & 14) ^ 6) <= 4 || !composer.changed(i11)) && (i12 & 6) != 4) {
            z11 = false;
        }
        boolean z12 = changed | z11;
        Object rememberedValue = composer.rememberedValue();
        if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextMeasurer(resolver, density, layoutDirection, i11);
            composer.updateRememberedValue(rememberedValue);
        }
        TextMeasurer textMeasurer = (TextMeasurer) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textMeasurer;
    }
}
