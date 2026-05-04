package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nElevationOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,101:1\n149#2:102\n*S KotlinDebug\n*F\n+ 1 ElevationOverlay.kt\nandroidx/compose/material/DefaultElevationOverlay\n*L\n70#1:102\n*E\n"})
/* loaded from: classes.dex */
final class DefaultElevationOverlay implements ElevationOverlay {

    @k
    public static final DefaultElevationOverlay INSTANCE = new DefaultElevationOverlay();

    private DefaultElevationOverlay() {
    }

    @Override // androidx.compose.material.ElevationOverlay
    @Composable
    @ReadOnlyComposable
    /* renamed from: apply-7g2Lkgo, reason: not valid java name */
    public long mo1641apply7g2Lkgo(long j11, float f11, @l Composer composer, int i11) {
        long m1667calculateForegroundColorCLU3JFs;
        composer.startReplaceGroup(-1687113661);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1687113661, i11, -1, "androidx.compose.material.DefaultElevationOverlay.apply (ElevationOverlay.kt:67)");
        }
        Colors colors = MaterialTheme.INSTANCE.getColors(composer, 6);
        if (Dp.m5114compareTo0680j_4(f11, Dp.m5115constructorimpl(0)) <= 0 || colors.isLight()) {
            composer.startReplaceGroup(1169156439);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1169017931);
            m1667calculateForegroundColorCLU3JFs = ElevationOverlayKt.m1667calculateForegroundColorCLU3JFs(j11, f11, composer, i11 & 126);
            j11 = ColorKt.m2554compositeOverOWjLjI(m1667calculateForegroundColorCLU3JFs, j11);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return j11;
    }
}
