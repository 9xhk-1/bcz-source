package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nModalBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,590:1\n149#2:591\n*S KotlinDebug\n*F\n+ 1 ModalBottomSheet.kt\nandroidx/compose/material/ModalBottomSheetDefaults\n*L\n519#1:591\n*E\n"})
/* loaded from: classes.dex */
public final class ModalBottomSheetDefaults {

    @k
    public static final ModalBottomSheetDefaults INSTANCE = new ModalBottomSheetDefaults();
    private static final float Elevation = Dp.m5115constructorimpl(16);

    @k
    private static final AnimationSpec<Float> AnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    public static final int $stable = 8;

    private ModalBottomSheetDefaults() {
    }

    @k
    public final AnimationSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1701getElevationD9Ej5fM() {
        return Elevation;
    }

    @j(name = "getScrimColor")
    @Composable
    public final long getScrimColor(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-112572414, i11, -1, "androidx.compose.material.ModalBottomSheetDefaults.<get-scrimColor> (ModalBottomSheet.kt:522)");
        }
        long m2508copywmQWz5c$default = Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2508copywmQWz5c$default;
    }
}
