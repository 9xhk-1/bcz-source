package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIcon.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,169:1\n75#2:170\n75#2:171\n75#2:178\n1247#3,6:172\n1247#3,6:179\n1247#3,6:185\n149#4:191\n*S KotlinDebug\n*F\n+ 1 Icon.kt\nandroidx/compose/material/IconKt\n*L\n66#1:170\n100#1:171\n134#1:178\n102#1:172,6\n137#1:179,6\n140#1:185,6\n168#1:191\n*E\n"})
/* loaded from: classes.dex */
public final class IconKt {

    @k
    private static final Modifier DefaultIconSizeModifier = SizeKt.m773size3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(24));

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1692Iconww6aTOc(@k ImageVector imageVector, @l String str, @l Modifier modifier, long j11, @l Composer composer, int i11, int i12) {
        Modifier modifier2 = (i12 & 4) != 0 ? Modifier.Companion : modifier;
        long m2508copywmQWz5c$default = (i12 & 8) != 0 ? Color.m2508copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-800853103, i11, -1, "androidx.compose.material.Icon (Icon.kt:66)");
        }
        m1691Iconww6aTOc(VectorPainterKt.rememberVectorPainter(imageVector, composer, i11 & 14), str, modifier2, m2508copywmQWz5c$default, composer, VectorPainter.$stable | (i11 & 112) | (i11 & 896) | (i11 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    private static final Modifier defaultSizeFor(Modifier modifier, Painter painter) {
        return modifier.then((Size.m2333equalsimpl0(painter.mo3180getIntrinsicSizeNHjbRc(), Size.Companion.m2345getUnspecifiedNHjbRc()) || m1693isInfiniteuvyYCjk(painter.mo3180getIntrinsicSizeNHjbRc())) ? DefaultIconSizeModifier : Modifier.Companion);
    }

    /* renamed from: isInfinite-uvyYCjk, reason: not valid java name */
    private static final boolean m1693isInfiniteuvyYCjk(long j11) {
        return Float.isInfinite(Size.m2337getWidthimpl(j11)) && Float.isInfinite(Size.m2334getHeightimpl(j11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    public static final void m1690Iconww6aTOc(@k ImageBitmap imageBitmap, @l String str, @l Modifier modifier, long j11, @l Composer composer, int i11, int i12) {
        Modifier modifier2 = (i12 & 4) != 0 ? Modifier.Companion : modifier;
        long m2508copywmQWz5c$default = (i12 & 8) != 0 ? Color.m2508copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-554892675, i11, -1, "androidx.compose.material.Icon (Icon.kt:100)");
        }
        boolean changed = composer.changed(imageBitmap);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            BitmapPainter bitmapPainter = new BitmapPainter(imageBitmap, 0L, 0L, 6, null);
            composer.updateRememberedValue(bitmapPainter);
            rememberedValue = bitmapPainter;
        }
        m1691Iconww6aTOc((BitmapPainter) rememberedValue, str, modifier2, m2508copywmQWz5c$default, composer, i11 & 8176, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0071  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1691Iconww6aTOc(@m80.k final androidx.compose.ui.graphics.painter.Painter r26, @m80.l final java.lang.String r27, @m80.l androidx.compose.ui.Modifier r28, long r29, @m80.l androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.IconKt.m1691Iconww6aTOc(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, long, androidx.compose.runtime.Composer, int, int):void");
    }
}
