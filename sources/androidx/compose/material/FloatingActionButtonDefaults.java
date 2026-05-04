package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,398:1\n149#2:399\n149#2:400\n149#2:401\n149#2:402\n149#2:403\n149#2:404\n149#2:405\n149#2:406\n1247#3,6:407\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n*L\n213#1:399\n214#1:400\n219#1:401\n220#1:402\n235#1:403\n236#1:404\n237#1:405\n238#1:406\n240#1:407,6\n*E\n"})
/* loaded from: classes.dex */
public final class FloatingActionButtonDefaults {
    public static final int $stable = 0;

    @k
    public static final FloatingActionButtonDefaults INSTANCE = new FloatingActionButtonDefaults();

    private FloatingActionButtonDefaults() {
    }

    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    /* renamed from: elevation-ixp7dh8, reason: not valid java name */
    public final /* synthetic */ FloatingActionButtonElevation m1684elevationixp7dh8(float f11, float f12, Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(6);
        }
        float f13 = f11;
        if ((i12 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(12);
        }
        float f14 = f12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-654132828, i11, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:215)");
        }
        float f15 = 8;
        FloatingActionButtonElevation m1685elevationxZ9QkE = m1685elevationxZ9QkE(f13, f14, Dp.m5115constructorimpl(f15), Dp.m5115constructorimpl(f15), composer, (i11 & 14) | 3456 | (i11 & 112) | (57344 & (i11 << 6)), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1685elevationxZ9QkE;
    }

    @Composable
    @k
    /* renamed from: elevation-xZ9-QkE, reason: not valid java name */
    public final FloatingActionButtonElevation m1685elevationxZ9QkE(float f11, float f12, float f13, float f14, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(6);
        }
        float f15 = f11;
        if ((i12 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(12);
        }
        float f16 = f12;
        if ((i12 & 4) != 0) {
            f13 = Dp.m5115constructorimpl(8);
        }
        float f17 = f13;
        if ((i12 & 8) != 0) {
            f14 = Dp.m5115constructorimpl(8);
        }
        float f18 = f14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(380403812, i11, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:238)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(f15)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(f16)) || (i11 & 48) == 32) | ((((i11 & 896) ^ 384) > 256 && composer.changed(f17)) || (i11 & 384) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && composer.changed(f18)) || (i11 & 3072) == 2048);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation = new DefaultFloatingActionButtonElevation(f15, f16, f17, f18, null);
            composer.updateRememberedValue(defaultFloatingActionButtonElevation);
            rememberedValue = defaultFloatingActionButtonElevation;
        }
        DefaultFloatingActionButtonElevation defaultFloatingActionButtonElevation2 = (DefaultFloatingActionButtonElevation) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultFloatingActionButtonElevation2;
    }
}
