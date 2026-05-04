package coil.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import kotlin.DeprecationLevel;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m {
    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ AsyncImagePainter a(Object obj, x00.l lVar, x00.l lVar2, ContentScale contentScale, int i11, Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(-1494234083);
        x00.l a11 = (i13 & 2) != 0 ? AsyncImagePainter.f9551p.a() : lVar;
        x00.l lVar3 = (i13 & 4) != 0 ? null : lVar2;
        ContentScale fit = (i13 & 8) != 0 ? ContentScale.Companion.getFit() : contentScale;
        int m3063getDefaultFilterQualityfv9h1I = (i13 & 16) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1494234083, i12, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:152)");
        }
        int i14 = i12 << 3;
        AsyncImagePainter c11 = a.c(obj, h.f(j.a(), composer, 6), a11, lVar3, fit, m3063getDefaultFilterQualityfv9h1I, null, composer, (i14 & 896) | 72 | (i14 & 7168) | (57344 & i14) | (i14 & 458752), 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c11;
    }

    @Composable
    @m80.k
    public static final AsyncImagePainter b(@m80.l Object obj, @m80.l x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, @m80.l x00.l<? super AsyncImagePainter.c, g2> lVar2, @m80.l ContentScale contentScale, int i11, @m80.l f fVar, @m80.l Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(236159766);
        if ((i13 & 2) != 0) {
            lVar = AsyncImagePainter.f9551p.a();
        }
        x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar3 = lVar;
        if ((i13 & 4) != 0) {
            lVar2 = null;
        }
        x00.l<? super AsyncImagePainter.c, g2> lVar4 = lVar2;
        if ((i13 & 8) != 0) {
            contentScale = ContentScale.Companion.getFit();
        }
        ContentScale contentScale2 = contentScale;
        if ((i13 & 16) != 0) {
            i11 = DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I();
        }
        int i14 = i11;
        if ((i13 & 32) != 0) {
            fVar = g.a();
        }
        f fVar2 = fVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(236159766, i12, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:133)");
        }
        int i15 = i12 << 3;
        AsyncImagePainter c11 = a.c(obj, h.f(j.a(), composer, 6), lVar3, lVar4, contentScale2, i14, fVar2, composer, (i15 & 896) | 72 | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (i15 & 3670016), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return c11;
    }

    @Composable
    @m80.k
    public static final AsyncImagePainter c(@m80.l Object obj, @m80.l Painter painter, @m80.l Painter painter2, @m80.l Painter painter3, @m80.l x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar, @m80.l x00.l<? super AsyncImagePainter.c.d, g2> lVar2, @m80.l x00.l<? super AsyncImagePainter.c.b, g2> lVar3, @m80.l ContentScale contentScale, int i11, @m80.l f fVar, @m80.l Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(1445305568);
        Painter painter4 = (i13 & 2) != 0 ? null : painter;
        Painter painter5 = (i13 & 4) != 0 ? null : painter2;
        Painter painter6 = (i13 & 8) != 0 ? painter5 : painter3;
        x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar4 = (i13 & 16) != 0 ? null : lVar;
        x00.l<? super AsyncImagePainter.c.d, g2> lVar5 = (i13 & 32) != 0 ? null : lVar2;
        x00.l<? super AsyncImagePainter.c.b, g2> lVar6 = (i13 & 64) == 0 ? lVar3 : null;
        ContentScale fit = (i13 & 128) != 0 ? ContentScale.Companion.getFit() : contentScale;
        int m3063getDefaultFilterQualityfv9h1I = (i13 & 256) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        f a11 = (i13 & 512) != 0 ? g.a() : fVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1445305568, i12, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:59)");
        }
        int i14 = i12 << 3;
        AsyncImagePainter d11 = a.d(obj, h.f(j.a(), composer, 6), painter4, painter5, painter6, lVar4, lVar5, lVar6, fit, m3063getDefaultFilterQualityfv9h1I, a11, composer, (i14 & 1879048192) | (458752 & i14) | 37448 | (3670016 & i14) | (29360128 & i14) | (234881024 & i14), (i12 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return d11;
    }

    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ AsyncImagePainter d(Object obj, Painter painter, Painter painter2, Painter painter3, x00.l lVar, x00.l lVar2, x00.l lVar3, ContentScale contentScale, int i11, Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(533921043);
        Painter painter4 = (i13 & 2) != 0 ? null : painter;
        Painter painter5 = (i13 & 4) != 0 ? null : painter2;
        Painter painter6 = (i13 & 8) != 0 ? painter5 : painter3;
        x00.l lVar4 = (i13 & 16) != 0 ? null : lVar;
        x00.l lVar5 = (i13 & 32) != 0 ? null : lVar2;
        x00.l lVar6 = (i13 & 64) == 0 ? lVar3 : null;
        ContentScale fit = (i13 & 128) != 0 ? ContentScale.Companion.getFit() : contentScale;
        int m3063getDefaultFilterQualityfv9h1I = (i13 & 256) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(533921043, i12, -1, "coil.compose.rememberAsyncImagePainter (SingletonAsyncImagePainter.kt:86)");
        }
        int i14 = i12 << 3;
        AsyncImagePainter d11 = a.d(obj, h.f(j.a(), composer, 6), painter4, painter5, painter6, lVar4, lVar5, lVar6, fit, m3063getDefaultFilterQualityfv9h1I, null, composer, (458752 & i14) | 37448 | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), 0, 1024);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return d11;
    }
}
