package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.shape.CornerBasedShape;
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
@StabilityInferred(parameters = 1)
@u0({"SMAP\nDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,842:1\n149#2:843\n*S KotlinDebug\n*F\n+ 1 Drawer.kt\nandroidx/compose/material/DrawerDefaults\n*L\n712#1:843\n*E\n"})
/* loaded from: classes.dex */
public final class DrawerDefaults {
    public static final int $stable = 0;
    public static final float ScrimOpacity = 0.32f;

    @k
    public static final DrawerDefaults INSTANCE = new DrawerDefaults();

    @k
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(256, 0, null, 6, null);
    private static final float Elevation = Dp.m5115constructorimpl(16);

    private DrawerDefaults() {
    }

    @k
    public final TweenSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    @j(name = "getBackgroundColor")
    @Composable
    public final long getBackgroundColor(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-788676020, i11, -1, "androidx.compose.material.DrawerDefaults.<get-backgroundColor> (Drawer.kt:708)");
        }
        long m1604getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1604getSurface0d7_KjU;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1648getElevationD9Ej5fM() {
        return Elevation;
    }

    @j(name = "getScrimColor")
    @Composable
    public final long getScrimColor(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(617225966, i11, -1, "androidx.compose.material.DrawerDefaults.<get-scrimColor> (Drawer.kt:719)");
        }
        long m2508copywmQWz5c$default = Color.m2508copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1599getOnSurface0d7_KjU(), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m2508copywmQWz5c$default;
    }

    @j(name = "getShape")
    @Composable
    @k
    public final Shape getShape(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2041803618, i11, -1, "androidx.compose.material.DrawerDefaults.<get-shape> (Drawer.kt:715)");
        }
        CornerBasedShape large = MaterialTheme.INSTANCE.getShapes(composer, 6).getLarge();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return large;
    }
}
