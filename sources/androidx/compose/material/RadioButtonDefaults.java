package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,224:1\n1247#2,6:225\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n*L\n164#1:225,6\n*E\n"})
/* loaded from: classes.dex */
public final class RadioButtonDefaults {
    public static final int $stable = 0;

    @k
    public static final RadioButtonDefaults INSTANCE = new RadioButtonDefaults();

    private RadioButtonDefaults() {
    }

    @Composable
    @k
    /* renamed from: colors-RGew2ao, reason: not valid java name */
    public final RadioButtonColors m1743colorsRGew2ao(long j11, long j12, long j13, @l Composer composer, int i11, int i12) {
        long m1602getSecondary0d7_KjU = (i12 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1602getSecondary0d7_KjU() : j11;
        long m2508copywmQWz5c$default = (i12 & 2) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m2508copywmQWz5c$default2 = (i12 & 4) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1370708026, i11, -1, "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:162)");
        }
        boolean z11 = (((6 ^ (i11 & 14)) > 4 && composer.changed(m1602getSecondary0d7_KjU)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(m2508copywmQWz5c$default)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(m2508copywmQWz5c$default2)) || (i11 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            DefaultRadioButtonColors defaultRadioButtonColors = new DefaultRadioButtonColors(m1602getSecondary0d7_KjU, m2508copywmQWz5c$default, m2508copywmQWz5c$default2, null);
            composer.updateRememberedValue(defaultRadioButtonColors);
            rememberedValue = defaultRadioButtonColors;
        }
        DefaultRadioButtonColors defaultRadioButtonColors2 = (DefaultRadioButtonColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultRadioButtonColors2;
    }
}
