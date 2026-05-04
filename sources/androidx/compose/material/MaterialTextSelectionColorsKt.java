package androidx.compose.material;

import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,244:1\n708#2:245\n696#2:246\n75#3:247\n1247#4,6:248\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n45#1:245\n45#1:246\n45#1:247\n47#1:248,6\n*E\n"})
/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m1696binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j11, long j12, long j13) {
        int i11 = 0;
        float f11 = 0.2f;
        float f12 = 0.4f;
        float f13 = 0.4f;
        while (i11 < 7) {
            long j14 = j11;
            long j15 = j12;
            long j16 = j13;
            float m1698calculateContrastRationb2GgbA = (m1698calculateContrastRationb2GgbA(j14, f12, j15, j16) / 4.5f) - 1.0f;
            if (0.0f <= m1698calculateContrastRationb2GgbA && m1698calculateContrastRationb2GgbA <= 0.01f) {
                return f12;
            }
            if (m1698calculateContrastRationb2GgbA < 0.0f) {
                f13 = f12;
            } else {
                f11 = f12;
            }
            f12 = (f13 + f11) / 2.0f;
            i11++;
            j11 = j14;
            j12 = j15;
            j13 = j16;
        }
        return f12;
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m1697calculateContrastRatioOWjLjI(long j11, long j12) {
        float m2561luminance8_81llA = ColorKt.m2561luminance8_81llA(j11) + 0.05f;
        float m2561luminance8_81llA2 = ColorKt.m2561luminance8_81llA(j12) + 0.05f;
        return Math.max(m2561luminance8_81llA, m2561luminance8_81llA2) / Math.min(m2561luminance8_81llA, m2561luminance8_81llA2);
    }

    /* renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m1698calculateContrastRationb2GgbA(long j11, float f11, long j12, long j13) {
        long m2554compositeOverOWjLjI = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(j11, f11, 0.0f, 0.0f, 0.0f, 14, null), j13);
        return m1697calculateContrastRatioOWjLjI(ColorKt.m2554compositeOverOWjLjI(j12, m2554compositeOverOWjLjI), m2554compositeOverOWjLjI);
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m1699calculateSelectionBackgroundColorysEtTa8(long j11, long j12, long j13) {
        return Color.m2508copywmQWz5c$default(j11, m1698calculateContrastRationb2GgbA(j11, 0.4f, j12, j13) >= 4.5f ? 0.4f : m1698calculateContrastRationb2GgbA(j11, 0.2f, j12, j13) < 4.5f ? 0.2f : m1696binarySearchForAccessibleSelectionColorAlphaysEtTa8(j11, j12, j13), 0.0f, 0.0f, 0.0f, 14, null);
    }

    @Composable
    @k
    public static final TextSelectionColors rememberTextSelectionColors(@k Colors colors, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i11, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long m1600getPrimary0d7_KjU = colors.m1600getPrimary0d7_KjU();
        long m1593getBackground0d7_KjU = colors.m1593getBackground0d7_KjU();
        composer.startReplaceGroup(1102762852);
        long m1617contentColorFor4WTKRHQ = ColorsKt.m1617contentColorFor4WTKRHQ(colors, m1593getBackground0d7_KjU);
        if (m1617contentColorFor4WTKRHQ == 16) {
            m1617contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl();
        }
        long j11 = m1617contentColorFor4WTKRHQ;
        composer.endReplaceGroup();
        long m2508copywmQWz5c$default = Color.m2508copywmQWz5c$default(j11, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        boolean changed = composer.changed(m1600getPrimary0d7_KjU) | composer.changed(m1593getBackground0d7_KjU) | composer.changed(m2508copywmQWz5c$default);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            TextSelectionColors textSelectionColors = new TextSelectionColors(colors.m1600getPrimary0d7_KjU(), m1699calculateSelectionBackgroundColorysEtTa8(m1600getPrimary0d7_KjU, m2508copywmQWz5c$default, m1593getBackground0d7_KjU), null);
            composer.updateRememberedValue(textSelectionColors);
            rememberedValue = textSelectionColors;
        }
        TextSelectionColors textSelectionColors2 = (TextSelectionColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textSelectionColors2;
    }
}
