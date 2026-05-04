package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalMaterialApi
@u0({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,730:1\n149#2:731\n149#2:732\n149#2:733\n149#2:734\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipDefaults\n*L\n361#1:731\n557#1:732\n560#1:733\n563#1:734\n*E\n"})
/* loaded from: classes.dex */
public final class ChipDefaults {
    public static final int $stable = 0;
    public static final float ContentOpacity = 0.87f;
    public static final float LeadingIconOpacity = 0.54f;
    public static final float OutlinedBorderOpacity = 0.12f;

    @k
    public static final ChipDefaults INSTANCE = new ChipDefaults();
    private static final float MinHeight = Dp.m5115constructorimpl(32);
    private static final float OutlinedBorderSize = Dp.m5115constructorimpl(1);
    private static final float LeadingIconSize = Dp.m5115constructorimpl(20);
    private static final float SelectedIconSize = Dp.m5115constructorimpl(18);

    private ChipDefaults() {
    }

    @Composable
    @k
    /* renamed from: chipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1583chipColors5tl4gsc(long j11, long j12, long j13, long j14, long j15, long j16, @l Composer composer, int i11, int i12) {
        long j17;
        long j18;
        long j19;
        long j21;
        if ((i12 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j17 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(materialTheme.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1604getSurface0d7_KjU());
        } else {
            j17 = j11;
        }
        long m2508copywmQWz5c$default = (i12 & 2) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m2508copywmQWz5c$default2 = (i12 & 4) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i12 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j18 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(materialTheme2.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m1604getSurface0d7_KjU());
        } else {
            j18 = j14;
        }
        if ((i12 & 16) != 0) {
            long j22 = m2508copywmQWz5c$default;
            j21 = Color.m2508copywmQWz5c$default(j22, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j19 = j22;
        } else {
            j19 = m2508copywmQWz5c$default;
            j21 = j15;
        }
        long m2508copywmQWz5c$default3 = (i12 & 32) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1838505436, i11, -1, "androidx.compose.material.ChipDefaults.chipColors (Chip.kt:391)");
        }
        DefaultChipColors defaultChipColors = new DefaultChipColors(j17, j19, m2508copywmQWz5c$default2, j18, j21, m2508copywmQWz5c$default3, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultChipColors;
    }

    @Composable
    @k
    /* renamed from: filterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1584filterChipColorsJ08w3E(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @l Composer composer, int i11, int i12) {
        long j21;
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
        if ((i12 & 1) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            j21 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(materialTheme.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m1604getSurface0d7_KjU());
        } else {
            j21 = j11;
        }
        long m2508copywmQWz5c$default = (i12 & 2) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m2508copywmQWz5c$default2 = (i12 & 4) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        if ((i12 & 8) != 0) {
            MaterialTheme materialTheme2 = MaterialTheme.INSTANCE;
            j22 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(materialTheme2.getColors(composer, 6).m1599getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme2.getColors(composer, 6).m1604getSurface0d7_KjU());
        } else {
            j22 = j14;
        }
        if ((i12 & 16) != 0) {
            long j33 = m2508copywmQWz5c$default;
            j24 = Color.m2508copywmQWz5c$default(j33, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j23 = j33;
        } else {
            j23 = m2508copywmQWz5c$default;
            j24 = j15;
        }
        if ((i12 & 32) != 0) {
            long j34 = m2508copywmQWz5c$default2;
            j26 = Color.m2508copywmQWz5c$default(j34, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j25 = j34;
        } else {
            j25 = m2508copywmQWz5c$default2;
            j26 = j16;
        }
        if ((i12 & 64) != 0) {
            j27 = j26;
            j28 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), j21);
        } else {
            j27 = j26;
            j28 = j17;
        }
        if ((i12 & 128) != 0) {
            j29 = j21;
            j31 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j23);
        } else {
            j29 = j21;
            j31 = j18;
        }
        long m2554compositeOverOWjLjI = (i12 & 256) != 0 ? ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j25) : j19;
        if (ComposerKt.isTraceInProgress()) {
            j32 = m2554compositeOverOWjLjI;
            ComposerKt.traceEventStart(830140629, i11, -1, "androidx.compose.material.ChipDefaults.filterChipColors (Chip.kt:476)");
        } else {
            j32 = m2554compositeOverOWjLjI;
        }
        long j35 = j22;
        long j36 = j23;
        long j37 = j25;
        long j38 = j29;
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j38, j36, j37, j35, j24, j27, j28, j31, j32, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSelectableChipColors;
    }

    /* renamed from: getLeadingIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1585getLeadingIconSizeD9Ej5fM() {
        return LeadingIconSize;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m1586getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    @j(name = "getOutlinedBorder")
    @Composable
    @k
    public final BorderStroke getOutlinedBorder(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1650225597, i11, -1, "androidx.compose.material.ChipDefaults.<get-outlinedBorder> (Chip.kt:541)");
        }
        BorderStroke m262BorderStrokecXLIe8U = BorderStrokeKt.m262BorderStrokecXLIe8U(OutlinedBorderSize, Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m262BorderStrokecXLIe8U;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m1587getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    /* renamed from: getSelectedIconSize-D9Ej5fM, reason: not valid java name */
    public final float m1588getSelectedIconSizeD9Ej5fM() {
        return SelectedIconSize;
    }

    @Composable
    @k
    /* renamed from: outlinedChipColors-5tl4gsc, reason: not valid java name */
    public final ChipColors m1589outlinedChipColors5tl4gsc(long j11, long j12, long j13, long j14, long j15, long j16, @l Composer composer, int i11, int i12) {
        long m1604getSurface0d7_KjU = (i12 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU() : j11;
        long m2508copywmQWz5c$default = (i12 & 2) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m2508copywmQWz5c$default2 = (i12 & 4) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long j17 = (i12 & 8) != 0 ? m1604getSurface0d7_KjU : j14;
        long m2508copywmQWz5c$default3 = (i12 & 16) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m2508copywmQWz5c$default4 = (i12 & 32) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default2, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1763922662, i11, -1, "androidx.compose.material.ChipDefaults.outlinedChipColors (Chip.kt:424)");
        }
        ChipColors m1583chipColors5tl4gsc = m1583chipColors5tl4gsc(m1604getSurface0d7_KjU, m2508copywmQWz5c$default, m2508copywmQWz5c$default2, j17, m2508copywmQWz5c$default3, m2508copywmQWz5c$default4, composer, i11 & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1583chipColors5tl4gsc;
    }

    @Composable
    @k
    /* renamed from: outlinedFilterChipColors-J08w3-E, reason: not valid java name */
    public final SelectableChipColors m1590outlinedFilterChipColorsJ08w3E(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @l Composer composer, int i11, int i12) {
        long j21;
        long j22;
        long j23;
        long j24;
        long j25;
        long j26;
        long j27;
        long j28;
        long j29;
        long m1604getSurface0d7_KjU = (i12 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU() : j11;
        long m2508copywmQWz5c$default = (i12 & 2) != 0 ? Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.87f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long m2508copywmQWz5c$default2 = (i12 & 4) != 0 ? Color.m2508copywmQWz5c$default(m2508copywmQWz5c$default, 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long j31 = (i12 & 8) != 0 ? m1604getSurface0d7_KjU : j14;
        if ((i12 & 16) != 0) {
            long j32 = m2508copywmQWz5c$default;
            j22 = Color.m2508copywmQWz5c$default(j32, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.87f, 0.0f, 0.0f, 0.0f, 14, null);
            j21 = j32;
        } else {
            j21 = m2508copywmQWz5c$default;
            j22 = j15;
        }
        if ((i12 & 32) != 0) {
            long j33 = m2508copywmQWz5c$default2;
            j24 = Color.m2508copywmQWz5c$default(j33, ContentAlpha.INSTANCE.getDisabled(composer, 6) * 0.54f, 0.0f, 0.0f, 0.0f, 14, null);
            j23 = j33;
        } else {
            j23 = m2508copywmQWz5c$default2;
            j24 = j16;
        }
        if ((i12 & 64) != 0) {
            j25 = j24;
            j26 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), m1604getSurface0d7_KjU);
        } else {
            j25 = j24;
            j26 = j17;
        }
        if ((i12 & 128) != 0) {
            j27 = m1604getSurface0d7_KjU;
            j28 = ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j21);
        } else {
            j27 = m1604getSurface0d7_KjU;
            j28 = j18;
        }
        long m2554compositeOverOWjLjI = (i12 & 256) != 0 ? ColorKt.m2554compositeOverOWjLjI(Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.16f, 0.0f, 0.0f, 0.0f, 14, null), j23) : j19;
        if (ComposerKt.isTraceInProgress()) {
            j29 = m2554compositeOverOWjLjI;
            ComposerKt.traceEventStart(346878099, i11, -1, "androidx.compose.material.ChipDefaults.outlinedFilterChipColors (Chip.kt:525)");
        } else {
            j29 = m2554compositeOverOWjLjI;
        }
        long j34 = j31;
        long j35 = j21;
        long j36 = j23;
        long j37 = j27;
        DefaultSelectableChipColors defaultSelectableChipColors = new DefaultSelectableChipColors(j37, j35, j36, j34, j22, j25, j26, j28, j29, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSelectableChipColors;
    }
}
