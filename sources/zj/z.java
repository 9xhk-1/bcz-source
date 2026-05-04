package zj;

import android.util.Log;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmodifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifier.kt\ncom/baicizhan/platform/base/guide/ModifierKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 10 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,93:1\n1#2:94\n75#3:95\n75#3:96\n75#3:97\n75#3:98\n75#3:121\n1247#4,6:99\n1247#4,6:122\n57#5:105\n57#5:108\n61#5:111\n61#5:113\n60#6:106\n60#6:109\n70#6:112\n70#6:114\n70#6:118\n53#6,3:129\n22#7:107\n22#7:110\n22#7:115\n22#7:119\n1869#8:116\n1870#8:120\n69#9:117\n30#10:128\n*S KotlinDebug\n*F\n+ 1 modifier.kt\ncom/baicizhan/platform/base/guide/ModifierKt\n*L\n35#1:95\n36#1:96\n37#1:97\n38#1:98\n80#1:121\n41#1:99,6\n82#1:122,6\n43#1:105\n44#1:108\n44#1:111\n45#1:113\n43#1:106\n44#1:109\n44#1:112\n45#1:114\n58#1:118\n85#1:129,3\n43#1:107\n44#1:110\n45#1:115\n58#1:119\n49#1:116\n49#1:120\n58#1:117\n85#1:128\n*E\n"})
/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final long f102766a = ColorKt.Color(2566914048L);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final ProvidableCompositionLocal<Color> f102767b = CompositionLocalKt.staticCompositionLocalOf(a.f102769a);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final ProvidableCompositionLocal<Brush> f102768c = CompositionLocalKt.staticCompositionLocalOf(new x00.a() { // from class: zj.t
        @Override // x00.a
        public final Object invoke() {
            Brush g11;
            g11 = z.g();
            return g11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.a<Color> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f102769a = new a();

        public final long a() {
            return z.h();
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ Color invoke() {
            return Color.m2499boximpl(a());
        }
    }

    public static final Brush g() {
        return null;
    }

    public static final long h() {
        return f102766a;
    }

    @m80.k
    public static final ProvidableCompositionLocal<Brush> i() {
        return f102768c;
    }

    @m80.k
    public static final ProvidableCompositionLocal<Color> j() {
        return f102767b;
    }

    @m80.k
    public static final Modifier k(@m80.k Modifier modifier, @m80.k final d state, @m80.k final Shape shape) {
        g0.p(modifier, "<this>");
        g0.p(state, "state");
        g0.p(shape, "shape");
        return ComposedModifierKt.composed$default(modifier, null, new x00.q() { // from class: zj.x
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier m11;
                m11 = z.m(d.this, shape, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return m11;
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier l(Modifier modifier, d dVar, Shape shape, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return k(modifier, dVar, shape);
    }

    @Composable
    public static final Modifier m(final d dVar, Shape shape, Modifier composed, Composer composer, int i11) {
        g0.p(composed, "$this$composed");
        composer.startReplaceGroup(1837730033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1837730033, i11, -1, "com.baicizhan.platform.base.guide.guideAnchor.<anonymous> (modifier.kt:79)");
        }
        final float top = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, composer, 6).getTop((Density) composer.consume(CompositionLocalsKt.getLocalDensity()));
        dVar.g(shape);
        boolean changed = composer.changed(dVar) | composer.changed(top);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.l() { // from class: zj.v
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 n11;
                    n11 = z.n(d.this, top, (LayoutCoordinates) obj);
                    return n11;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(composed, (x00.l) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return onGloballyPositioned;
    }

    public static final g2 n(d dVar, float f11, LayoutCoordinates it) {
        g0.p(it, "it");
        dVar.h(it.mo3865getSizeYbymL2g());
        dVar.f(Offset.m2272minusMKHz9U(LayoutCoordinatesKt.positionInRoot(it), Offset.m2260constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))));
        return g2.f100423a;
    }

    @m80.k
    public static final Modifier o(@m80.k Modifier modifier, @m80.l d dVar, @m80.k Shape shape) {
        Modifier modifier2;
        g0.p(modifier, "<this>");
        g0.p(shape, "shape");
        if (dVar == null || (modifier2 = k(Modifier.Companion, dVar, shape)) == null) {
            modifier2 = Modifier.Companion;
        }
        return modifier.then(modifier2);
    }

    public static /* synthetic */ Modifier p(Modifier modifier, d dVar, Shape shape, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return o(modifier, dVar, shape);
    }

    @m80.k
    public static final Modifier q(@m80.k Modifier modifier, @m80.k final List<d> anchors, final float f11) {
        g0.p(modifier, "<this>");
        g0.p(anchors, "anchors");
        return ComposedModifierKt.composed$default(modifier, null, new x00.q() { // from class: zj.w
            @Override // x00.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Modifier s11;
                s11 = z.s(f11, anchors, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return s11;
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier r(Modifier modifier, List list, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return q(modifier, list, f11);
    }

    @Composable
    public static final Modifier s(final float f11, final List list, Modifier composed, Composer composer, int i11) {
        g0.p(composed, "$this$composed");
        composer.startReplaceGroup(62645213);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(62645213, i11, -1, "com.baicizhan.platform.base.guide.overlayBackground.<anonymous> (modifier.kt:34)");
        }
        final Brush brush = (Brush) composer.consume(f102768c);
        final long m2519unboximpl = ((Color) composer.consume(f102767b)).m2519unboximpl();
        final LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Log.d("djx", "status: " + f11);
        boolean changedInstance = composer.changedInstance(list) | composer.changed(layoutDirection.ordinal()) | composer.changed(density) | composer.changed(f11) | composer.changed(brush) | composer.changed(m2519unboximpl);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.l() { // from class: zj.y
                @Override // x00.l
                public final Object invoke(Object obj) {
                    DrawResult t11;
                    t11 = z.t(list, layoutDirection, density, f11, brush, m2519unboximpl, (CacheDrawScope) obj);
                    return t11;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier drawWithCache = DrawModifierKt.drawWithCache(composed, (x00.l) rememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return drawWithCache;
    }

    public static final DrawResult t(List list, LayoutDirection layoutDirection, Density density, float f11, final Brush brush, final long j11, CacheDrawScope drawWithCache) {
        g0.p(drawWithCache, "$this$drawWithCache");
        final Path Path = AndroidPath_androidKt.Path();
        Path.lineTo(Float.intBitsToFloat((int) (drawWithCache.m2129getSizeNHjbRc() >> 32)), 0.0f);
        Path.lineTo(Float.intBitsToFloat((int) (drawWithCache.m2129getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawWithCache.m2129getSizeNHjbRc() & 4294967295L)));
        Path.lineTo(0.0f, Float.intBitsToFloat((int) (drawWithCache.m2129getSizeNHjbRc() & 4294967295L)));
        Path.lineTo(0.0f, 0.0f);
        Path.close();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            Path Path2 = AndroidPath_androidKt.Path();
            OutlineKt.addOutline(Path2, dVar.d().mo291createOutlinePq9zytI(IntSizeKt.m5298toSizeozmzZPI(dVar.e()), layoutDirection, density));
            Path2.mo2404translatek4lQ0M(Offset.m2262copydBAh8RU$default(dVar.c(), 0.0f, Float.intBitsToFloat((int) (dVar.c() & 4294967295L)) + f11, 1, null));
            Path2.close();
            Path.mo2401opN5in7k0(Path, Path2, PathOperation.Companion.m2805getXorb3I0S0c());
        }
        return drawWithCache.onDrawWithContent(new x00.l() { // from class: zj.u
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 u11;
                u11 = z.u(Brush.this, Path, j11, (ContentDrawScope) obj);
                return u11;
            }
        });
    }

    public static final g2 u(Brush brush, Path path, long j11, ContentDrawScope onDrawWithContent) {
        g0.p(onDrawWithContent, "$this$onDrawWithContent");
        if (brush != null) {
            DrawScope.m3049drawPathGBMwjPU$default(onDrawWithContent, path, brush, 0.0f, null, null, 0, 60, null);
        } else {
            DrawScope.m3050drawPathLG529CI$default(onDrawWithContent, path, j11, 0.0f, null, null, 0, 60, null);
        }
        onDrawWithContent.drawContent();
        return g2.f100423a;
    }
}
