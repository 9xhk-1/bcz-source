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
public final class SwitchDefaults {
    public static final int $stable = 0;

    @k
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    @Composable
    @k
    /* renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m1796colorsSQMK_m0(long j11, long j12, float f11, long j13, long j14, float f12, long j15, long j16, long j17, long j18, @l Composer composer, int i11, int i12, int i13) {
        long j19;
        long j21;
        long j22;
        long j23;
        float f13;
        long j24;
        long j25;
        long j26;
        int i14;
        long j27;
        long m1603getSecondaryVariant0d7_KjU = (i13 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1603getSecondaryVariant0d7_KjU() : j11;
        long j28 = (i13 & 2) != 0 ? m1603getSecondaryVariant0d7_KjU : j12;
        float f14 = (i13 & 4) != 0 ? 0.54f : f11;
        long m1604getSurface0d7_KjU = (i13 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU() : j13;
        long m1599getOnSurface0d7_KjU = (i13 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU() : j14;
        float f15 = (i13 & 32) != 0 ? 0.38f : f12;
        if ((i13 & 64) != 0) {
            long j29 = m1603getSecondaryVariant0d7_KjU;
            long m2508copywmQWz5c$default = Color.m2508copywmQWz5c$default(j29, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j19 = j29;
            j21 = j28;
            j22 = ColorKt.m2554compositeOverOWjLjI(m2508copywmQWz5c$default, MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU());
        } else {
            j19 = m1603getSecondaryVariant0d7_KjU;
            j21 = j28;
            j22 = j15;
        }
        if ((i13 & 128) != 0) {
            j23 = j21;
            f13 = f14;
            j24 = j22;
            j25 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(j21, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU());
        } else {
            j23 = j21;
            f13 = f14;
            j24 = j22;
            j25 = j16;
        }
        if ((i13 & 256) != 0) {
            i14 = 6;
            j26 = j25;
            j27 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(m1604getSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU());
        } else {
            j26 = j25;
            i14 = 6;
            j27 = j17;
        }
        long m2554compositeOverOWjLjI = (i13 & 512) != 0 ? ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(m1599getOnSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, i14), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, i14).m1604getSurface0d7_KjU()) : j18;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1032127534, i11, i12, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:342)");
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j19, Color.m2508copywmQWz5c$default(j23, f13, 0.0f, 0.0f, 0.0f, 14, null), m1604getSurface0d7_KjU, Color.m2508copywmQWz5c$default(m1599getOnSurface0d7_KjU, f15, 0.0f, 0.0f, 0.0f, 14, null), j24, Color.m2508copywmQWz5c$default(j26, f13, 0.0f, 0.0f, 0.0f, 14, null), j27, Color.m2508copywmQWz5c$default(m2554compositeOverOWjLjI, f15, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSwitchColors;
    }
}
