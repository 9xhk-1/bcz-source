package androidx.compose.foundation;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.FilterQuality;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.BitmapPainterKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.layout.ContentScale;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.u0;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,276:1\n1247#2,6:277\n1247#2,6:283\n121#3,6:289\n128#3,4:304\n132#3:314\n134#3:317\n272#4,9:295\n281#4,2:315\n4206#5,6:308\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n158#1:277,6\n251#1:283,6\n261#1:289,6\n261#1:304,4\n261#1:314\n261#1:317\n261#1:295,9\n261#1:315,2\n261#1:308,6\n*E\n"})
/* loaded from: classes.dex */
public final class ImageKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @n(level = DeprecationLevel.HIDDEN, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @w0(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    public static final /* synthetic */ void Image(ImageBitmap imageBitmap, String str, Modifier modifier, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, Composer composer, int i11, int i12) {
        if ((i12 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        Alignment center = (i12 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i12 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i12 & 32) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i12 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2123228673, i11, -1, "androidx.compose.foundation.Image (Image.kt:98)");
        }
        m292Image5hnEew(imageBitmap, str, modifier2, center, fit, f12, colorFilter2, FilterQuality.Companion.m2608getLowfv9h1I(), composer, i11 & 4194302, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Image-5h-nEew, reason: not valid java name */
    public static final void m292Image5hnEew(@m80.k ImageBitmap imageBitmap, @l String str, @l Modifier modifier, @l Alignment alignment, @l ContentScale contentScale, float f11, @l ColorFilter colorFilter, int i11, @l Composer composer, int i12, int i13) {
        Modifier modifier2 = (i13 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i13 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i13 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i13 & 32) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i13 & 64) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i13 & 128) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1396260732, i12, -1, "androidx.compose.foundation.Image (Image.kt:156)");
        }
        boolean changed = composer.changed(imageBitmap);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = BitmapPainterKt.m3183BitmapPainterQZhYCtY$default(imageBitmap, 0L, 0L, m3063getDefaultFilterQualityfv9h1I, 6, null);
            composer.updateRememberedValue(rememberedValue);
        }
        Image((BitmapPainter) rememberedValue, str, modifier2, center, fit, f12, colorFilter2, composer, i12 & 4194288, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Image(@m80.k ImageVector imageVector, @l String str, @l Modifier modifier, @l Alignment alignment, @l ContentScale contentScale, float f11, @l ColorFilter colorFilter, @l Composer composer, int i11, int i12) {
        if ((i12 & 4) != 0) {
            modifier = Modifier.Companion;
        }
        Modifier modifier2 = modifier;
        if ((i12 & 8) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        Alignment alignment2 = alignment;
        ContentScale fit = (i12 & 16) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i12 & 32) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i12 & 64) != 0 ? null : colorFilter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1595907091, i11, -1, "androidx.compose.foundation.Image (Image.kt:202)");
        }
        Image(VectorPainterKt.rememberVectorPainter(imageVector, composer, i11 & 14), str, modifier2, alignment2, fit, f12, colorFilter2, composer, VectorPainter.$stable | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Image(@m80.k final androidx.compose.ui.graphics.painter.Painter r20, @m80.l final java.lang.String r21, @m80.l androidx.compose.ui.Modifier r22, @m80.l androidx.compose.ui.Alignment r23, @m80.l androidx.compose.ui.layout.ContentScale r24, float r25, @m80.l androidx.compose.ui.graphics.ColorFilter r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter, androidx.compose.runtime.Composer, int, int):void");
    }
}
