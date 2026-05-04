package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,616:1\n149#2:617\n149#2:618\n149#2:619\n149#2:620\n149#2:621\n149#2:622\n149#2:623\n149#2:624\n149#2:625\n149#2:626\n149#2:633\n149#2:634\n149#2:635\n149#2:636\n149#2:637\n149#2:638\n149#2:639\n149#2:640\n1247#3,6:627\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n*L\n347#1:617\n348#1:618\n349#1:619\n355#1:620\n356#1:621\n373#1:622\n374#1:623\n375#1:624\n376#1:625\n377#1:626\n297#1:633\n298#1:634\n313#1:635\n319#1:636\n326#1:637\n333#1:638\n471#1:639\n482#1:640\n379#1:627,6\n*E\n"})
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;

    @k
    private static final PaddingValues ContentPadding;

    @k
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;

    @k
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    static {
        float m5115constructorimpl = Dp.m5115constructorimpl(16);
        ButtonHorizontalPadding = m5115constructorimpl;
        float f11 = 8;
        float m5115constructorimpl2 = Dp.m5115constructorimpl(f11);
        ButtonVerticalPadding = m5115constructorimpl2;
        PaddingValues m722PaddingValuesa9UjIt4 = PaddingKt.m722PaddingValuesa9UjIt4(m5115constructorimpl, m5115constructorimpl2, m5115constructorimpl, m5115constructorimpl2);
        ContentPadding = m722PaddingValuesa9UjIt4;
        MinWidth = Dp.m5115constructorimpl(64);
        MinHeight = Dp.m5115constructorimpl(36);
        IconSize = Dp.m5115constructorimpl(18);
        IconSpacing = Dp.m5115constructorimpl(f11);
        OutlinedBorderSize = Dp.m5115constructorimpl(1);
        float m5115constructorimpl3 = Dp.m5115constructorimpl(f11);
        TextButtonHorizontalPadding = m5115constructorimpl3;
        TextButtonContentPadding = PaddingKt.m722PaddingValuesa9UjIt4(m5115constructorimpl3, m722PaddingValuesa9UjIt4.mo678calculateTopPaddingD9Ej5fM(), m5115constructorimpl3, m722PaddingValuesa9UjIt4.mo675calculateBottomPaddingD9Ej5fM());
    }

    private ButtonDefaults() {
    }

    @Composable
    @k
    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m1566buttonColorsro_MJ88(long j11, long j12, long j13, long j14, @l Composer composer, int i11, int i12) {
        long j15;
        long m1600getPrimary0d7_KjU = (i12 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU() : j11;
        long m1618contentColorForek8zF_U = (i12 & 2) != 0 ? ColorsKt.m1618contentColorForek8zF_U(m1600getPrimary0d7_KjU, composer, i11 & 14) : j12;
        if ((i12 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j15 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(materialTheme.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1604getSurface0d7_KjU());
        } else {
            j15 = j13;
        }
        long m2508copywmQWz5c$default = (i12 & 8) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i11, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:415)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m1600getPrimary0d7_KjU, m1618contentColorForek8zF_U, j15, m2508copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors;
    }

    @Composable
    @k
    /* renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m1567elevationR_JCAzs(float f11, float f12, float f13, float f14, float f15, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(2);
        }
        float f16 = f11;
        if ((i12 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(8);
        }
        float f17 = f12;
        if ((i12 & 4) != 0) {
            f13 = Dp.m5115constructorimpl(0);
        }
        float f18 = f13;
        if ((i12 & 8) != 0) {
            f14 = Dp.m5115constructorimpl(4);
        }
        float f19 = f14;
        if ((i12 & 16) != 0) {
            f15 = Dp.m5115constructorimpl(4);
        }
        float f21 = f15;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i11, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:377)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(f16)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(f17)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(f18)) || (i11 & 384) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && composer.changed(f19)) || (i11 & 3072) == 2048) | ((((57344 & i11) ^ 24576) > 16384 && composer.changed(f21)) || (i11 & 24576) == 16384);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            DefaultButtonElevation defaultButtonElevation = new DefaultButtonElevation(f16, f17, f18, f19, f21, null);
            composer.updateRememberedValue(defaultButtonElevation);
            rememberedValue = defaultButtonElevation;
        }
        DefaultButtonElevation defaultButtonElevation2 = (DefaultButtonElevation) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonElevation2;
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    /* renamed from: elevation-yajeYGU, reason: not valid java name */
    public final /* synthetic */ ButtonElevation m1568elevationyajeYGU(float f11, float f12, float f13, Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(2);
        }
        float f14 = f11;
        if ((i12 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(8);
        }
        float f15 = f12;
        if ((i12 & 4) != 0) {
            f13 = Dp.m5115constructorimpl(0);
        }
        float f16 = f13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428576874, i11, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:350)");
        }
        float f17 = 4;
        ButtonElevation m1567elevationR_JCAzs = m1567elevationR_JCAzs(f14, f15, f16, Dp.m5115constructorimpl(f17), Dp.m5115constructorimpl(f17), composer, (i11 & 14) | 27648 | (i11 & 112) | (i11 & 896) | ((i11 << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1567elevationR_JCAzs;
    }

    @k
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1569getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m1570getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1571getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m1572getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @j(name = "getOutlinedBorder")
    @Composable
    @k
    public final BorderStroke getOutlinedBorder(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i11, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:476)");
        }
        BorderStroke m262BorderStrokecXLIe8U = BorderStrokeKt.m262BorderStrokecXLIe8U(OutlinedBorderSize, Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m262BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1573getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    @k
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Composable
    @k
    /* renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m1574outlinedButtonColorsRGew2ao(long j11, long j12, long j13, @l Composer composer, int i11, int i12) {
        long m1604getSurface0d7_KjU = (i12 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU() : j11;
        long m1600getPrimary0d7_KjU = (i12 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU() : j12;
        long m2508copywmQWz5c$default = (i12 & 4) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i11, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:437)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m1604getSurface0d7_KjU, m1600getPrimary0d7_KjU, m1604getSurface0d7_KjU, m2508copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors;
    }

    @Composable
    @k
    /* renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m1575textButtonColorsRGew2ao(long j11, long j12, long j13, @l Composer composer, int i11, int i12) {
        long m2544getTransparent0d7_KjU = (i12 & 1) != 0 ? Color.Companion.m2544getTransparent0d7_KjU() : j11;
        long m1600getPrimary0d7_KjU = (i12 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU() : j12;
        long m2508copywmQWz5c$default = (i12 & 4) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i11, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:459)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(m2544getTransparent0d7_KjU, m1600getPrimary0d7_KjU, m2544getTransparent0d7_KjU, m2508copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultButtonColors;
    }
}
