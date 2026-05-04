package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,696:1\n149#2:697\n149#2:698\n149#2:699\n149#2:700\n149#2:701\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldDefaults\n*L\n620#1:697\n621#1:698\n610#1:699\n613#1:700\n625#1:701\n*E\n"})
/* loaded from: classes.dex */
public final class BackdropScaffoldDefaults {

    @k
    public static final BackdropScaffoldDefaults INSTANCE = new BackdropScaffoldDefaults();
    private static final float PeekHeight = Dp.m5115constructorimpl(56);
    private static final float HeaderHeight = Dp.m5115constructorimpl(48);
    private static final float FrontLayerElevation = Dp.m5115constructorimpl(1);

    @k
    private static final AnimationSpec<Float> AnimationSpec = AnimationSpecKt.tween$default(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
    public static final int $stable = 8;

    private BackdropScaffoldDefaults() {
    }

    @k
    public final AnimationSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getFrontLayerElevation-D9Ej5fM, reason: not valid java name */
    public final float m1534getFrontLayerElevationD9Ej5fM() {
        return FrontLayerElevation;
    }

    @j(name = "getFrontLayerScrimColor")
    @Composable
    public final long getFrontLayerScrimColor(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1806270648, i11, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerScrimColor> (BackdropScaffold.kt:628)");
        }
        long m2508copywmQWz5c$default = Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2508copywmQWz5c$default;
    }

    @j(name = "getFrontLayerShape")
    @Composable
    @k
    public final Shape getFrontLayerShape(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1580588700, i11, -1, "androidx.compose.material.BackdropScaffoldDefaults.<get-frontLayerShape> (BackdropScaffold.kt:618)");
        }
        CornerBasedShape large = MaterialTheme.INSTANCE.getShapes(composer, 6).getLarge();
        float f11 = 16;
        CornerBasedShape copy$default = CornerBasedShape.copy$default(large, CornerSizeKt.m1011CornerSize0680j_4(Dp.m5115constructorimpl(f11)), CornerSizeKt.m1011CornerSize0680j_4(Dp.m5115constructorimpl(f11)), null, null, 12, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return copy$default;
    }

    /* renamed from: getHeaderHeight-D9Ej5fM, reason: not valid java name */
    public final float m1535getHeaderHeightD9Ej5fM() {
        return HeaderHeight;
    }

    /* renamed from: getPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m1536getPeekHeightD9Ej5fM() {
        return PeekHeight;
    }
}
