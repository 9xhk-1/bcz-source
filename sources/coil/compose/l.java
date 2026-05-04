package coil.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import kotlin.DeprecationLevel;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class l {
    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ void a(Object obj, String str, Modifier modifier, x00.l lVar, x00.l lVar2, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(-941517612);
        Modifier modifier2 = (i13 & 4) != 0 ? Modifier.Companion : modifier;
        x00.l a11 = (i13 & 8) != 0 ? AsyncImagePainter.f9551p.a() : lVar;
        x00.l lVar3 = (i13 & 16) != 0 ? null : lVar2;
        Alignment center = (i13 & 32) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i13 & 64) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i13 & 128) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i13 & 256) == 0 ? colorFilter : null;
        int m3063getDefaultFilterQualityfv9h1I = (i13 & 512) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-941517612, i12, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:191)");
        }
        int i14 = i12 << 3;
        AsyncImageKt.e(obj, str, h.f(j.a(), composer, 6), modifier2, a11, lVar3, center, fit, f12, colorFilter2, m3063getDefaultFilterQualityfv9h1I, false, null, composer, (i12 & 112) | 520 | (i14 & 7168) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), (i12 >> 27) & 14, com.badlogic.gdx.graphics.g.f11731e5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void b(@m80.l Object obj, @m80.l String str, @m80.l Modifier modifier, @m80.l Painter painter, @m80.l Painter painter2, @m80.l Painter painter3, @m80.l x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar, @m80.l x00.l<? super AsyncImagePainter.c.d, g2> lVar2, @m80.l x00.l<? super AsyncImagePainter.c.b, g2> lVar3, @m80.l Alignment alignment, @m80.l ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter, int i11, boolean z11, @m80.l f fVar, @m80.l Composer composer, int i12, int i13, int i14) {
        boolean z12;
        composer.startReplaceableGroup(1693837359);
        Modifier modifier2 = (i14 & 4) != 0 ? Modifier.Companion : modifier;
        Painter painter4 = (i14 & 8) != 0 ? null : painter;
        Painter painter5 = (i14 & 16) != 0 ? null : painter2;
        Painter painter6 = (i14 & 32) != 0 ? painter5 : painter3;
        x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar4 = (i14 & 64) != 0 ? null : lVar;
        x00.l<? super AsyncImagePainter.c.d, g2> lVar5 = (i14 & 128) != 0 ? null : lVar2;
        x00.l<? super AsyncImagePainter.c.b, g2> lVar6 = (i14 & 256) != 0 ? null : lVar3;
        Alignment center = (i14 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 2048) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 4096) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 8192) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        boolean z13 = (i14 & 16384) != 0 ? true : z11;
        f a11 = (i14 & 32768) != 0 ? g.a() : fVar;
        if (ComposerKt.isTraceInProgress()) {
            z12 = z13;
            ComposerKt.traceEventStart(1693837359, i12, i13, "coil.compose.AsyncImage (SingletonAsyncImage.kt:65)");
        } else {
            z12 = z13;
        }
        int i15 = i12 << 3;
        int i16 = (i15 & 7168) | (i12 & 112) | 2392584 | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192);
        int i17 = i13 << 3;
        Modifier modifier3 = modifier2;
        Painter painter7 = painter4;
        Painter painter8 = painter5;
        Painter painter9 = painter6;
        AsyncImageKt.b(obj, str, h.f(j.a(), composer, 6), modifier3, painter7, painter8, painter9, lVar4, lVar5, lVar6, center, fit, f12, colorFilter2, m3063getDefaultFilterQualityfv9h1I, z12, a11, composer, i16, ((i12 >> 27) & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (57344 & i17) | (458752 & i17) | (i17 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void c(@m80.l Object obj, @m80.l String str, @m80.l Modifier modifier, @m80.l x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, @m80.l x00.l<? super AsyncImagePainter.c, g2> lVar2, @m80.l Alignment alignment, @m80.l ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter, int i11, boolean z11, @m80.l f fVar, @m80.l Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(1451072229);
        Modifier modifier2 = (i14 & 4) != 0 ? Modifier.Companion : modifier;
        x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> a11 = (i14 & 8) != 0 ? AsyncImagePainter.f9551p.a() : lVar;
        x00.l<? super AsyncImagePainter.c, g2> lVar3 = (i14 & 16) != 0 ? null : lVar2;
        Alignment center = (i14 & 32) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 64) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 128) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 256) == 0 ? colorFilter : null;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 512) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        boolean z12 = (i14 & 1024) != 0 ? true : z11;
        f a12 = (i14 & 2048) != 0 ? g.a() : fVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1451072229, i12, i13, "coil.compose.AsyncImage (SingletonAsyncImage.kt:161)");
        }
        int i15 = i12 << 3;
        int i16 = i13 << 3;
        AsyncImageKt.e(obj, str, h.f(j.a(), composer, 6), modifier2, a11, lVar3, center, fit, f12, colorFilter2, m3063getDefaultFilterQualityfv9h1I, z12, a12, composer, (1879048192 & i15) | (i15 & 7168) | (i12 & 112) | 520 | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15), ((i12 >> 27) & 14) | (i16 & 112) | (i16 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ void d(Object obj, String str, Modifier modifier, Painter painter, Painter painter2, Painter painter3, x00.l lVar, x00.l lVar2, x00.l lVar3, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(2027616330);
        Modifier modifier2 = (i14 & 4) != 0 ? Modifier.Companion : modifier;
        Painter painter4 = (i14 & 8) != 0 ? null : painter;
        Painter painter5 = (i14 & 16) != 0 ? null : painter2;
        Painter painter6 = (i14 & 32) != 0 ? painter5 : painter3;
        x00.l lVar4 = (i14 & 64) != 0 ? null : lVar;
        x00.l lVar5 = (i14 & 128) != 0 ? null : lVar2;
        x00.l lVar6 = (i14 & 256) != 0 ? null : lVar3;
        Alignment center = (i14 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 2048) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 4096) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 8192) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2027616330, i12, i13, "coil.compose.AsyncImage (SingletonAsyncImage.kt:103)");
        }
        int i15 = i12 << 3;
        int i16 = (i15 & 7168) | (i12 & 112) | 2392584 | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192);
        int i17 = i13 << 3;
        Alignment alignment2 = center;
        ColorFilter colorFilter3 = colorFilter2;
        Modifier modifier3 = modifier2;
        Painter painter7 = painter5;
        AsyncImageKt.b(obj, str, h.f(j.a(), composer, 6), modifier3, painter4, painter7, painter6, lVar4, lVar5, lVar6, alignment2, fit, f12, colorFilter3, m3063getDefaultFilterQualityfv9h1I, false, null, composer, i16, ((i12 >> 27) & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344), 98304);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
