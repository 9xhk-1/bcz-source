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
@u0({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,484:1\n1247#2,6:485\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n*L\n229#1:485,6\n*E\n"})
/* loaded from: classes.dex */
public final class CheckboxDefaults {
    public static final int $stable = 0;

    @k
    public static final CheckboxDefaults INSTANCE = new CheckboxDefaults();

    private CheckboxDefaults() {
    }

    @Composable
    @k
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final CheckboxColors m1578colorszjMxDiM(long j11, long j12, long j13, long j14, long j15, @l Composer composer, int i11, int i12) {
        long j16;
        long j17;
        long m1602getSecondary0d7_KjU = (i12 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1602getSecondary0d7_KjU() : j11;
        long m2508copywmQWz5c$default = (i12 & 2) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m1604getSurface0d7_KjU = (i12 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU() : j13;
        long m2508copywmQWz5c$default2 = (i12 & 8) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        if ((i12 & 16) != 0) {
            long j18 = m1602getSecondary0d7_KjU;
            j17 = Color.m2508copywmQWz5c$default(j18, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
            j16 = j18;
        } else {
            j16 = m1602getSecondary0d7_KjU;
            j17 = j15;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(469524104, i11, -1, "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:227)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(j16)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(m2508copywmQWz5c$default)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(m1604getSurface0d7_KjU)) || (i11 & 384) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && composer.changed(m2508copywmQWz5c$default2)) || (i11 & 3072) == 2048) | ((((57344 & i11) ^ 24576) > 16384 && composer.changed(j17)) || (i11 & 24576) == 16384);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            long j19 = j16;
            long j21 = m2508copywmQWz5c$default2;
            DefaultCheckboxColors defaultCheckboxColors = new DefaultCheckboxColors(m1604getSurface0d7_KjU, Color.m2508copywmQWz5c$default(m1604getSurface0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j19, Color.m2508copywmQWz5c$default(j19, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j21, Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default2, 0.0f, 0.0f, 0.0f, 0.0f, 14, null), j17, j19, m2508copywmQWz5c$default, m2508copywmQWz5c$default2, j17, null);
            composer.updateRememberedValue(defaultCheckboxColors);
            rememberedValue = defaultCheckboxColors;
        }
        DefaultCheckboxColors defaultCheckboxColors2 = (DefaultCheckboxColors) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultCheckboxColors2;
    }
}
