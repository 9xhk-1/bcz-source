package coil.compose;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.InspectionModeKt;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import q0.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,474:1\n1116#2,6:475\n74#3:481\n1#4:482\n159#5:483\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n*L\n204#1:475,6\n209#1:481\n462#1:483\n*E\n"})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final C0154a f9653a = new C0154a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: coil.compose.a$a, reason: collision with other inner class name */
    public static final class C0154a implements t0.d {
        @m80.k
        public Void e() {
            throw new UnsupportedOperationException();
        }

        @Override // t0.d
        public /* bridge */ /* synthetic */ View getView() {
            return (View) e();
        }

        @Override // t0.d
        @m80.l
        public Drawable h() {
            return null;
        }
    }

    @Composable
    @m80.k
    public static final AsyncImagePainter c(@m80.l Object obj, @m80.k b0.f fVar, @m80.l x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, @m80.l x00.l<? super AsyncImagePainter.c, g2> lVar2, @m80.l ContentScale contentScale, int i11, @m80.l f fVar2, @m80.l Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(1645646697);
        if ((i13 & 4) != 0) {
            lVar = AsyncImagePainter.f9551p.a();
        }
        if ((i13 & 8) != 0) {
            lVar2 = null;
        }
        if ((i13 & 16) != 0) {
            contentScale = ContentScale.Companion.getFit();
        }
        if ((i13 & 32) != 0) {
            i11 = DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I();
        }
        if ((i13 & 64) != 0) {
            fVar2 = g.a();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1645646697, i12, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:166)");
        }
        int i14 = i11;
        ContentScale contentScale2 = contentScale;
        x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar3 = lVar;
        AsyncImagePainter g11 = g(new b(obj, fVar2, fVar), lVar3, lVar2, contentScale2, i14, composer, (i12 >> 3) & 65520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return g11;
    }

    @Composable
    @m80.k
    public static final AsyncImagePainter d(@m80.l Object obj, @m80.k b0.f fVar, @m80.l Painter painter, @m80.l Painter painter2, @m80.l Painter painter3, @m80.l x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar, @m80.l x00.l<? super AsyncImagePainter.c.d, g2> lVar2, @m80.l x00.l<? super AsyncImagePainter.c.b, g2> lVar3, @m80.l ContentScale contentScale, int i11, @m80.l f fVar2, @m80.l Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(-79978785);
        Painter painter4 = (i14 & 4) != 0 ? null : painter;
        Painter painter5 = (i14 & 8) != 0 ? null : painter2;
        Painter painter6 = (i14 & 16) != 0 ? painter5 : painter3;
        x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar4 = (i14 & 32) != 0 ? null : lVar;
        x00.l<? super AsyncImagePainter.c.d, g2> lVar5 = (i14 & 64) != 0 ? null : lVar2;
        x00.l<? super AsyncImagePainter.c.b, g2> lVar6 = (i14 & 128) == 0 ? lVar3 : null;
        ContentScale fit = (i14 & 256) != 0 ? ContentScale.Companion.getFit() : contentScale;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 512) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        f a11 = (i14 & 1024) != 0 ? g.a() : fVar2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-79978785, i12, i13, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:100)");
        }
        AsyncImagePainter g11 = g(new b(obj, a11, fVar), q.n(painter4, painter5, painter6), q.g(lVar4, lVar5, lVar6), fit, m3063getDefaultFilterQualityfv9h1I, composer, (i12 >> 15) & 64512);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return g11;
    }

    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ AsyncImagePainter e(Object obj, b0.f fVar, Painter painter, Painter painter2, Painter painter3, x00.l lVar, x00.l lVar2, x00.l lVar3, ContentScale contentScale, int i11, Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(2140758544);
        if ((i13 & 4) != 0) {
            painter = null;
        }
        Painter painter4 = (i13 & 8) != 0 ? null : painter2;
        Painter painter5 = (i13 & 16) != 0 ? painter4 : painter3;
        x00.l lVar4 = (i13 & 32) != 0 ? null : lVar;
        x00.l lVar5 = (i13 & 64) != 0 ? null : lVar2;
        x00.l lVar6 = (i13 & 128) == 0 ? lVar3 : null;
        ContentScale fit = (i13 & 256) != 0 ? ContentScale.Companion.getFit() : contentScale;
        int m3063getDefaultFilterQualityfv9h1I = (i13 & 512) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2140758544, i12, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:122)");
        }
        AsyncImagePainter g11 = g(new b(obj, g.a(), fVar), q.n(painter, painter4, painter5), q.g(lVar4, lVar5, lVar6), fit, m3063getDefaultFilterQualityfv9h1I, composer, (i12 >> 15) & 64512);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return g11;
    }

    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ AsyncImagePainter f(Object obj, b0.f fVar, x00.l lVar, x00.l lVar2, ContentScale contentScale, int i11, Composer composer, int i12, int i13) {
        composer.startReplaceableGroup(-2020614074);
        if ((i13 & 4) != 0) {
            lVar = AsyncImagePainter.f9551p.a();
        }
        x00.l lVar3 = lVar;
        if ((i13 & 8) != 0) {
            lVar2 = null;
        }
        x00.l lVar4 = lVar2;
        if ((i13 & 16) != 0) {
            contentScale = ContentScale.Companion.getFit();
        }
        ContentScale contentScale2 = contentScale;
        if ((i13 & 32) != 0) {
            i11 = DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I();
        }
        int i14 = i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020614074, i12, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:184)");
        }
        AsyncImagePainter g11 = g(new b(obj, g.a(), fVar), lVar3, lVar4, contentScale2, i14, composer, (i12 >> 3) & 65520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return g11;
    }

    @Composable
    public static final AsyncImagePainter g(b bVar, x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, x00.l<? super AsyncImagePainter.c, g2> lVar2, ContentScale contentScale, int i11, Composer composer, int i12) {
        composer.startReplaceableGroup(952940650);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(952940650, i12, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:199)");
        }
        ImageRequest h11 = q.h(bVar.b(), composer, 8);
        k(h11);
        composer.startReplaceableGroup(294038899);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AsyncImagePainter(h11, bVar.a());
            composer.updateRememberedValue(rememberedValue);
        }
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) rememberedValue;
        composer.endReplaceableGroup();
        asyncImagePainter.D(lVar);
        asyncImagePainter.y(lVar2);
        asyncImagePainter.v(contentScale);
        asyncImagePainter.w(i11);
        asyncImagePainter.A(((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue());
        asyncImagePainter.x(bVar.a());
        asyncImagePainter.B(h11);
        asyncImagePainter.onRemembered();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asyncImagePainter;
    }

    public static final q0.g h(long j11) {
        if (j11 == Size.Companion.m2345getUnspecifiedNHjbRc()) {
            return q0.g.f81365d;
        }
        if (!q.f(j11)) {
            return null;
        }
        float m2337getWidthimpl = Size.m2337getWidthimpl(j11);
        q0.c a11 = (Float.isInfinite(m2337getWidthimpl) || Float.isNaN(m2337getWidthimpl)) ? c.b.f81359a : q0.a.a(c10.d.L0(Size.m2337getWidthimpl(j11)));
        float m2334getHeightimpl = Size.m2334getHeightimpl(j11);
        return new q0.g(a11, (Float.isInfinite(m2334getHeightimpl) || Float.isNaN(m2334getHeightimpl)) ? c.b.f81359a : q0.a.a(c10.d.L0(Size.m2334getHeightimpl(j11))));
    }

    public static final Void i(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    public static /* synthetic */ Void j(String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return i(str, str2);
    }

    public static final void k(ImageRequest imageRequest) {
        Object m11 = imageRequest.m();
        if (m11 instanceof ImageRequest.Builder) {
            i("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        }
        if (m11 instanceof ImageBitmap) {
            j("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (m11 instanceof ImageVector) {
            j("ImageVector", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (m11 instanceof Painter) {
            j("Painter", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (imageRequest.M() != null) {
            throw new IllegalArgumentException("request.target must be null.");
        }
    }
}
