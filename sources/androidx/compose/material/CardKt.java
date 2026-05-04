package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,131:1\n149#2:132\n149#2:133\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material/CardKt\n*L\n63#1:132\n114#1:133\n*E\n"})
/* loaded from: classes.dex */
public final class CardKt {
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Card-F-jzlyU, reason: not valid java name */
    public static final void m1576CardFjzlyU(@l Modifier modifier, @l Shape shape, long j11, long j12, @l BorderStroke borderStroke, float f11, @k p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        if ((i12 & 2) != 0) {
            shape = MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium();
        }
        Shape shape2 = shape;
        long m1604getSurface0d7_KjU = (i12 & 4) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU() : j11;
        long m1618contentColorForek8zF_U = (i12 & 8) != 0 ? ColorsKt.m1618contentColorForek8zF_U(m1604getSurface0d7_KjU, composer, (i11 >> 6) & 14) : j12;
        BorderStroke borderStroke2 = (i12 & 16) != 0 ? null : borderStroke;
        float m5115constructorimpl = (i12 & 32) != 0 ? Dp.m5115constructorimpl(1) : f11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956755640, i11, -1, "androidx.compose.material.Card (Card.kt:64)");
        }
        SurfaceKt.m1784SurfaceFjzlyU(modifier, shape2, m1604getSurface0d7_KjU, m1618contentColorForek8zF_U, borderStroke2, m5115constructorimpl, pVar, composer, i11 & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Card-LPr_se0, reason: not valid java name */
    public static final void m1577CardLPr_se0(@k a<g2> aVar, @l Modifier modifier, boolean z11, @l Shape shape, long j11, long j12, @l BorderStroke borderStroke, float f11, @l MutableInteractionSource mutableInteractionSource, @k p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, int i11, int i12) {
        Modifier modifier2 = (i12 & 2) != 0 ? Modifier.Companion : modifier;
        boolean z12 = (i12 & 4) != 0 ? true : z11;
        Shape medium = (i12 & 8) != 0 ? MaterialTheme.INSTANCE.getShapes(composer, 6).getMedium() : shape;
        long m1604getSurface0d7_KjU = (i12 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU() : j11;
        long m1618contentColorForek8zF_U = (i12 & 32) != 0 ? ColorsKt.m1618contentColorForek8zF_U(m1604getSurface0d7_KjU, composer, (i11 >> 12) & 14) : j12;
        BorderStroke borderStroke2 = (i12 & 64) != 0 ? null : borderStroke;
        float m5115constructorimpl = (i12 & 128) != 0 ? Dp.m5115constructorimpl(1) : f11;
        MutableInteractionSource mutableInteractionSource2 = (i12 & 256) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(778538979, i11, -1, "androidx.compose.material.Card (Card.kt:116)");
        }
        float f12 = m5115constructorimpl;
        SurfaceKt.m1785SurfaceLPr_se0(aVar, modifier2, z12, medium, m1604getSurface0d7_KjU, m1618contentColorForek8zF_U, borderStroke2, f12, mutableInteractionSource2, pVar, composer, i11 & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
