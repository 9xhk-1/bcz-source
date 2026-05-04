package coil.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.ContentScale;
import coil.compose.AsyncImagePainter;
import kotlin.DeprecationLevel;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class o {
    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ void a(Object obj, String str, Modifier modifier, x00.l lVar, x00.l lVar2, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, x00.q qVar, Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(1571662781);
        Modifier modifier2 = (i14 & 4) != 0 ? Modifier.Companion : modifier;
        x00.l a11 = (i14 & 8) != 0 ? AsyncImagePainter.f9551p.a() : lVar;
        x00.l lVar3 = (i14 & 16) != 0 ? null : lVar2;
        Alignment center = (i14 & 32) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 64) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 128) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 256) == 0 ? colorFilter : null;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 512) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1571662781, i12, i13, "coil.compose.SubcomposeAsyncImage (SingletonSubcomposeAsyncImage.kt:198)");
        }
        int i15 = i12 << 3;
        SubcomposeAsyncImageKt.a(obj, str, h.f(j.a(), composer, 6), modifier2, a11, lVar3, center, fit, f12, colorFilter2, m3063getDefaultFilterQualityfv9h1I, false, null, qVar, composer, (i12 & 112) | 520 | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192), ((i12 >> 27) & 14) | ((i13 << 9) & 7168), com.badlogic.gdx.graphics.g.f11731e5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void b(@m80.l Object obj, @m80.l String str, @m80.l Modifier modifier, @m80.l x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, @m80.l r<? super p, ? super AsyncImagePainter.c.C0153c, ? super Composer, ? super Integer, g2> rVar, @m80.l r<? super p, ? super AsyncImagePainter.c.d, ? super Composer, ? super Integer, g2> rVar2, @m80.l r<? super p, ? super AsyncImagePainter.c.b, ? super Composer, ? super Integer, g2> rVar3, @m80.l x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar2, @m80.l x00.l<? super AsyncImagePainter.c.d, g2> lVar3, @m80.l x00.l<? super AsyncImagePainter.c.b, g2> lVar4, @m80.l Alignment alignment, @m80.l ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter, int i11, boolean z11, @m80.l f fVar, @m80.l Composer composer, int i12, int i13, int i14) {
        int i15;
        composer.startReplaceableGroup(1925822313);
        Modifier modifier2 = (i14 & 4) != 0 ? Modifier.Companion : modifier;
        x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> a11 = (i14 & 8) != 0 ? AsyncImagePainter.f9551p.a() : lVar;
        r<? super p, ? super AsyncImagePainter.c.C0153c, ? super Composer, ? super Integer, g2> rVar4 = (i14 & 16) != 0 ? null : rVar;
        r<? super p, ? super AsyncImagePainter.c.d, ? super Composer, ? super Integer, g2> rVar5 = (i14 & 32) != 0 ? null : rVar2;
        r<? super p, ? super AsyncImagePainter.c.b, ? super Composer, ? super Integer, g2> rVar6 = (i14 & 64) != 0 ? null : rVar3;
        x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar5 = (i14 & 128) != 0 ? null : lVar2;
        x00.l<? super AsyncImagePainter.c.d, g2> lVar6 = (i14 & 256) != 0 ? null : lVar3;
        x00.l<? super AsyncImagePainter.c.b, g2> lVar7 = (i14 & 512) != 0 ? null : lVar4;
        Alignment center = (i14 & 1024) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 2048) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 4096) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 8192) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 16384) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        boolean z12 = (i14 & 32768) != 0 ? true : z11;
        f a12 = (i14 & 65536) != 0 ? g.a() : fVar;
        if (ComposerKt.isTraceInProgress()) {
            i15 = m3063getDefaultFilterQualityfv9h1I;
            ComposerKt.traceEventStart(1925822313, i12, i13, "coil.compose.SubcomposeAsyncImage (SingletonSubcomposeAsyncImage.kt:66)");
        } else {
            i15 = m3063getDefaultFilterQualityfv9h1I;
        }
        int i16 = i12 << 3;
        int i17 = i13 << 3;
        float f13 = f12;
        x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar8 = lVar5;
        Alignment alignment2 = center;
        SubcomposeAsyncImageKt.c(obj, str, h.f(j.a(), composer, 6), modifier2, a11, rVar4, rVar5, rVar6, lVar8, lVar6, lVar7, alignment2, fit, f13, colorFilter2, i15, z12, a12, composer, (i16 & 1879048192) | (i16 & 7168) | (i12 & 112) | 520 | (i16 & 57344) | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128) | (i16 & 234881024), ((i12 >> 27) & 14) | (i17 & 112) | (i17 & 896) | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void c(@m80.l Object obj, @m80.l String str, @m80.l Modifier modifier, @m80.l x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, @m80.l x00.l<? super AsyncImagePainter.c, g2> lVar2, @m80.l Alignment alignment, @m80.l ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter, int i11, boolean z11, @m80.l f fVar, @m80.k x00.q<? super p, ? super Composer, ? super Integer, g2> qVar, @m80.l Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(241832818);
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
            ComposerKt.traceEventStart(241832818, i12, i13, "coil.compose.SubcomposeAsyncImage (SingletonSubcomposeAsyncImage.kt:166)");
        }
        int i15 = i12 << 3;
        int i16 = i13 << 3;
        SubcomposeAsyncImageKt.a(obj, str, h.f(j.a(), composer, 6), modifier2, a11, lVar3, center, fit, f12, colorFilter2, m3063getDefaultFilterQualityfv9h1I, z12, a12, qVar, composer, (i15 & 7168) | (i12 & 112) | 520 | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (1879048192 & i15), ((i12 >> 27) & 14) | (i16 & 112) | (i16 & 896) | (i16 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ void d(Object obj, String str, Modifier modifier, r rVar, r rVar2, r rVar3, x00.l lVar, x00.l lVar2, x00.l lVar3, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(1047090393);
        Modifier modifier2 = (i14 & 4) != 0 ? Modifier.Companion : modifier;
        r rVar4 = (i14 & 8) != 0 ? null : rVar;
        r rVar5 = (i14 & 16) != 0 ? null : rVar2;
        r rVar6 = (i14 & 32) != 0 ? null : rVar3;
        x00.l lVar4 = (i14 & 64) != 0 ? null : lVar;
        x00.l lVar5 = (i14 & 128) != 0 ? null : lVar2;
        x00.l lVar6 = (i14 & 256) != 0 ? null : lVar3;
        Alignment center = (i14 & 512) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 1024) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 2048) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 4096) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 8192) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1047090393, i12, i13, "coil.compose.SubcomposeAsyncImage (SingletonSubcomposeAsyncImage.kt:105)");
        }
        int i15 = i12 << 6;
        int i16 = i13 << 6;
        Modifier modifier3 = modifier2;
        r rVar7 = rVar4;
        r rVar8 = rVar5;
        x00.l lVar7 = lVar4;
        x00.l lVar8 = lVar6;
        ContentScale contentScale2 = fit;
        ColorFilter colorFilter3 = colorFilter2;
        SubcomposeAsyncImageKt.c(obj, str, h.f(j.a(), composer, 6), modifier3, AsyncImagePainter.f9551p.a(), rVar7, rVar8, rVar6, lVar7, lVar5, lVar8, center, contentScale2, f12, colorFilter3, m3063getDefaultFilterQualityfv9h1I, false, null, composer, ((i12 << 3) & 7168) | (i12 & 112) | 520 | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192), ((i12 >> 24) & 126) | (i16 & 896) | (i16 & 7168) | (57344 & i16) | (i16 & 458752), 196608);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
