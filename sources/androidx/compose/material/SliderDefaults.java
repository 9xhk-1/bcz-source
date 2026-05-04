package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final float DisabledActiveTrackAlpha = 0.32f;
    public static final float DisabledInactiveTrackAlpha = 0.12f;
    public static final float DisabledTickAlpha = 0.12f;

    @k
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    public static final float InactiveTrackAlpha = 0.24f;
    public static final float TickAlpha = 0.54f;

    private SliderDefaults() {
    }

    @Composable
    @k
    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m1758colorsq0g_0yA(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, @l Composer composer, int i11, int i12, int i13) {
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long j31;
        long j32;
        long j33;
        long j34;
        long m1600getPrimary0d7_KjU = (i13 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU() : j11;
        if ((i13 & 2) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j22 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(materialTheme.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1604getSurface0d7_KjU());
        } else {
            j22 = j12;
        }
        long m1600getPrimary0d7_KjU2 = (i13 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1600getPrimary0d7_KjU() : j13;
        if ((i13 & 8) != 0) {
            long j35 = m1600getPrimary0d7_KjU2;
            j24 = Color.m2508copywmQWz5c$default(j35, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
            j23 = j35;
        } else {
            j23 = m1600getPrimary0d7_KjU2;
            j24 = j14;
        }
        long m2508copywmQWz5c$default = (i13 & 16) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        if ((i13 & 32) != 0) {
            long j36 = m2508copywmQWz5c$default;
            j26 = Color.m2508copywmQWz5c$default(j36, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j36;
        } else {
            j25 = m2508copywmQWz5c$default;
            j26 = j16;
        }
        long m2508copywmQWz5c$default2 = (i13 & 64) != 0 ? Color.m2508copywmQWz5c$default(ColorsKt.m1618contentColorForek8zF_U(j23, composer, (i11 >> 6) & 14), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        if ((i13 & 128) != 0) {
            long j37 = j23;
            j28 = Color.m2508copywmQWz5c$default(j37, 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j27 = j37;
        } else {
            j27 = j23;
            j28 = j18;
        }
        if ((i13 & 256) != 0) {
            long j38 = m2508copywmQWz5c$default2;
            j31 = Color.m2508copywmQWz5c$default(j38, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j29 = j38;
        } else {
            j29 = m2508copywmQWz5c$default2;
            j31 = j19;
        }
        if ((i13 & 512) != 0) {
            long j39 = j26;
            j33 = Color.m2508copywmQWz5c$default(j39, 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
            j32 = j39;
        } else {
            j32 = j26;
            j33 = j21;
        }
        if (ComposerKt.isTraceInProgress()) {
            j34 = j33;
            ComposerKt.traceEventStart(436017687, i11, i12, "androidx.compose.material.SliderDefaults.colors (Slider.kt:607)");
        } else {
            j34 = j33;
        }
        DefaultSliderColors defaultSliderColors = new DefaultSliderColors(m1600getPrimary0d7_KjU, j22, j27, j24, j25, j32, j29, j28, j31, j34, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSliderColors;
    }
}
