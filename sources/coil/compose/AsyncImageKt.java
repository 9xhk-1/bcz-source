package coil.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAsyncImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImage.kt\ncoil/compose/AsyncImageKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,277:1\n1#2:278\n124#3,5:279\n130#3,5:292\n135#3:303\n137#3:306\n286#4,8:284\n294#4,2:304\n3737#5,6:297\n*S KotlinDebug\n*F\n+ 1 AsyncImage.kt\ncoil/compose/AsyncImageKt\n*L\n260#1:279,5\n260#1:292,5\n260#1:303\n260#1:306\n260#1:284,8\n260#1:304,2\n260#1:297,6\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncImageKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ coil.compose.b f9527a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f9528b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Modifier f9529c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.l<AsyncImagePainter.c, AsyncImagePainter.c> f9530d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.l<AsyncImagePainter.c, g2> f9531e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Alignment f9532f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ContentScale f9533g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f9534h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f9535i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f9536j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f9537k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f9538l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f9539m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(coil.compose.b bVar, String str, Modifier modifier, x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, x00.l<? super AsyncImagePainter.c, g2> lVar2, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, boolean z11, int i12, int i13) {
            super(2);
            this.f9527a = bVar;
            this.f9528b = str;
            this.f9529c = modifier;
            this.f9530d = lVar;
            this.f9531e = lVar2;
            this.f9532f = alignment;
            this.f9533g = contentScale;
            this.f9534h = f11;
            this.f9535i = colorFilter;
            this.f9536j = i11;
            this.f9537k = z11;
            this.f9538l = i12;
            this.f9539m = i13;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            AsyncImageKt.a(this.f9527a, this.f9528b, this.f9529c, this.f9530d, this.f9531e, this.f9532f, this.f9533g, this.f9534h, this.f9535i, this.f9536j, this.f9537k, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9538l | 1), RecomposeScopeImplKt.updateChangedFlags(this.f9539m));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final b f9540a = new b();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends Lambda implements x00.l<Placeable.PlacementScope, g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f9541a = new a();

            public a() {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@m80.k Placeable.PlacementScope placementScope) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        @m80.k
        /* renamed from: measure-3p2s80s */
        public final MeasureResult mo33measure3p2s80s(@m80.k MeasureScope measureScope, @m80.k List<? extends Measurable> list, long j11) {
            return MeasureScope.layout$default(measureScope, Constraints.m5070getMinWidthimpl(j11), Constraints.m5069getMinHeightimpl(j11), null, a.f9541a, 4, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Modifier f9542a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AsyncImagePainter f9543b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f9544c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Alignment f9545d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ContentScale f9546e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f9547f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f9548g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f9549h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f9550i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Modifier modifier, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, boolean z11, int i11) {
            super(2);
            this.f9542a = modifier;
            this.f9543b = asyncImagePainter;
            this.f9544c = str;
            this.f9545d = alignment;
            this.f9546e = contentScale;
            this.f9547f = f11;
            this.f9548g = colorFilter;
            this.f9549h = z11;
            this.f9550i = i11;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            AsyncImageKt.f(this.f9542a, this.f9543b, this.f9544c, this.f9545d, this.f9546e, this.f9547f, this.f9548g, this.f9549h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9550i | 1));
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(coil.compose.b bVar, String str, Modifier modifier, x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, x00.l<? super AsyncImagePainter.c, g2> lVar2, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, boolean z11, Composer composer, int i12, int i13) {
        coil.compose.b bVar2;
        int i14;
        x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar3;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-421592773);
        if ((i12 & 14) == 0) {
            bVar2 = bVar;
            i14 = (startRestartGroup.changed(bVar2) ? 4 : 2) | i12;
        } else {
            bVar2 = bVar;
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i14 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            lVar3 = lVar;
            i14 |= startRestartGroup.changedInstance(lVar3) ? 2048 : 1024;
        } else {
            lVar3 = lVar;
        }
        if ((i12 & 57344) == 0) {
            i14 |= startRestartGroup.changedInstance(lVar2) ? 16384 : 8192;
        }
        if ((i12 & 458752) == 0) {
            i14 |= startRestartGroup.changed(alignment) ? 131072 : 65536;
        }
        if ((i12 & 3670016) == 0) {
            i14 |= startRestartGroup.changed(contentScale) ? 1048576 : 524288;
        }
        if ((i12 & 29360128) == 0) {
            i14 |= startRestartGroup.changed(f11) ? 8388608 : 4194304;
        }
        if ((i12 & 234881024) == 0) {
            i14 |= startRestartGroup.changed(colorFilter) ? 67108864 : 33554432;
        }
        if ((i12 & 1879048192) == 0) {
            i14 |= startRestartGroup.changed(i11) ? 536870912 : 268435456;
        }
        if ((i13 & 14) == 0) {
            i15 = i13 | (startRestartGroup.changed(z11) ? 4 : 2);
        } else {
            i15 = i13;
        }
        if ((i14 & 1533916891) == 306783378 && (i15 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-421592773, i14, i15, "coil.compose.AsyncImage (AsyncImage.kt:213)");
            }
            ImageRequest i16 = q.i(bVar2.b(), contentScale, startRestartGroup, ((i14 >> 15) & 112) | 8);
            int i17 = i14 >> 3;
            int i18 = (i17 & 896) | 72 | (i17 & 7168);
            int i19 = i14 >> 6;
            int i21 = i19 & 57344;
            int i22 = i18 | i21 | ((i14 >> 12) & 458752);
            int i23 = i15;
            int i24 = i14;
            AsyncImagePainter c11 = coil.compose.a.c(i16, bVar2.a(), lVar3, lVar2, contentScale, i11, bVar2.c(), startRestartGroup, i22, 0);
            q0.h K = i16.K();
            f(K instanceof ConstraintsSizeResolver ? modifier.then((Modifier) K) : modifier, c11, str, alignment, contentScale, f11, colorFilter, z11, startRestartGroup, ((i24 << 3) & 896) | (i19 & 7168) | i21 | (i19 & 458752) | (i19 & 3670016) | ((i23 << 21) & 29360128));
            startRestartGroup = startRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new a(bVar2, str, modifier, lVar, lVar2, alignment, contentScale, f11, colorFilter, i11, z11, i12, i13));
        }
    }

    @Composable
    public static final void b(@m80.l Object obj, @m80.l String str, @m80.k b0.f fVar, @m80.l Modifier modifier, @m80.l Painter painter, @m80.l Painter painter2, @m80.l Painter painter3, @m80.l x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar, @m80.l x00.l<? super AsyncImagePainter.c.d, g2> lVar2, @m80.l x00.l<? super AsyncImagePainter.c.b, g2> lVar3, @m80.l Alignment alignment, @m80.l ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter, int i11, boolean z11, @m80.l f fVar2, @m80.l Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(-1481548872);
        Modifier modifier2 = (i14 & 8) != 0 ? Modifier.Companion : modifier;
        Painter painter4 = (i14 & 16) != 0 ? null : painter;
        Painter painter5 = (i14 & 32) != 0 ? null : painter2;
        Painter painter6 = (i14 & 64) != 0 ? painter5 : painter3;
        x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar4 = (i14 & 128) != 0 ? null : lVar;
        x00.l<? super AsyncImagePainter.c.d, g2> lVar5 = (i14 & 256) != 0 ? null : lVar2;
        x00.l<? super AsyncImagePainter.c.b, g2> lVar6 = (i14 & 512) != 0 ? null : lVar3;
        Alignment center = (i14 & 1024) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 2048) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 4096) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 8192) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 16384) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        boolean z12 = (i14 & 32768) != 0 ? true : z11;
        f a11 = (i14 & 65536) != 0 ? g.a() : fVar2;
        int i15 = m3063getDefaultFilterQualityfv9h1I;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1481548872, i12, i13, "coil.compose.AsyncImage (AsyncImage.kt:68)");
        }
        int i16 = i13 << 15;
        Alignment alignment2 = center;
        ContentScale contentScale2 = fit;
        float f13 = f12;
        a(new coil.compose.b(obj, a11, fVar), str, modifier2, q.n(painter4, painter5, painter6), q.g(lVar4, lVar5, lVar6), alignment2, contentScale2, f13, colorFilter2, i15, z12, composer, (i12 & 112) | ((i12 >> 3) & 896) | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), (i13 >> 15) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ void c(Object obj, String str, b0.f fVar, Modifier modifier, x00.l lVar, x00.l lVar2, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(-2030202961);
        Modifier modifier2 = (i14 & 8) != 0 ? Modifier.Companion : modifier;
        x00.l a11 = (i14 & 16) != 0 ? AsyncImagePainter.f9551p.a() : lVar;
        x00.l lVar3 = (i14 & 32) != 0 ? null : lVar2;
        Alignment center = (i14 & 64) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 128) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 256) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 512) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 1024) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2030202961, i12, i13, "coil.compose.AsyncImage (AsyncImage.kt:186)");
        }
        int i15 = i12 >> 3;
        a(new coil.compose.b(obj, g.a(), fVar), str, modifier2, a11, lVar3, center, fit, f12, colorFilter2, m3063getDefaultFilterQualityfv9h1I, true, composer, (i15 & 234881024) | (i12 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | ((i13 << 27) & 1879048192), 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ void d(Object obj, String str, b0.f fVar, Modifier modifier, Painter painter, Painter painter2, Painter painter3, x00.l lVar, x00.l lVar2, x00.l lVar3, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(-245964807);
        Modifier modifier2 = (i14 & 8) != 0 ? Modifier.Companion : modifier;
        Painter painter4 = (i14 & 16) != 0 ? null : painter;
        Painter painter5 = (i14 & 32) != 0 ? null : painter2;
        Painter painter6 = (i14 & 64) != 0 ? painter5 : painter3;
        x00.l lVar4 = (i14 & 128) != 0 ? null : lVar;
        x00.l lVar5 = (i14 & 256) != 0 ? null : lVar2;
        x00.l lVar6 = (i14 & 512) != 0 ? null : lVar3;
        Alignment center = (i14 & 1024) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 2048) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 4096) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 8192) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 16384) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-245964807, i12, i13, "coil.compose.AsyncImage (AsyncImage.kt:101)");
        }
        int i15 = i13 << 15;
        Alignment alignment2 = center;
        ContentScale contentScale2 = fit;
        a(new coil.compose.b(obj, g.a(), fVar), str, modifier2, q.n(painter4, painter5, painter6), q.g(lVar4, lVar5, lVar6), alignment2, contentScale2, f12, colorFilter2, m3063getDefaultFilterQualityfv9h1I, true, composer, (i12 & 112) | ((i12 >> 3) & 896) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192), 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void e(@m80.l Object obj, @m80.l String str, @m80.k b0.f fVar, @m80.l Modifier modifier, @m80.l x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, @m80.l x00.l<? super AsyncImagePainter.c, g2> lVar2, @m80.l Alignment alignment, @m80.l ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter, int i11, boolean z11, @m80.l f fVar2, @m80.l Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(2032051394);
        Modifier modifier2 = (i14 & 8) != 0 ? Modifier.Companion : modifier;
        x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> a11 = (i14 & 16) != 0 ? AsyncImagePainter.f9551p.a() : lVar;
        x00.l<? super AsyncImagePainter.c, g2> lVar3 = (i14 & 32) != 0 ? null : lVar2;
        Alignment center = (i14 & 64) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 128) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 256) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 512) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 1024) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        boolean z12 = (i14 & 2048) != 0 ? true : z11;
        f a12 = (i14 & 4096) != 0 ? g.a() : fVar2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2032051394, i12, i13, "coil.compose.AsyncImage (AsyncImage.kt:157)");
        }
        int i15 = i12 >> 3;
        a(new coil.compose.b(obj, a12, fVar), str, modifier2, a11, lVar3, center, fit, f12, colorFilter2, m3063getDefaultFilterQualityfv9h1I, z12, composer, (i15 & 234881024) | (i12 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | ((i13 << 27) & 1879048192), (i13 >> 3) & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(Modifier modifier, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, boolean z11, Composer composer, int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(777774312);
        if ((i11 & 14) == 0) {
            i12 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= startRestartGroup.changed(asyncImagePainter) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= startRestartGroup.changed(alignment) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= startRestartGroup.changed(contentScale) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i12 |= startRestartGroup.changed(f11) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= startRestartGroup.changed(colorFilter) ? 1048576 : 524288;
        }
        if ((29360128 & i11) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 8388608 : 4194304;
        }
        if ((23967451 & i12) == 4793490 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(777774312, i12, -1, "coil.compose.Content (AsyncImage.kt:259)");
            }
            Modifier c11 = q.c(modifier, str);
            if (z11) {
                c11 = ClipKt.clipToBounds(c11);
            }
            Modifier then = c11.then(new ContentPainterElement(asyncImagePainter, alignment, contentScale, f11, colorFilter));
            b bVar = b.f9540a;
            startRestartGroup.startReplaceableGroup(544976794);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            final x00.a<ComposeUiNode> constructor = companion.getConstructor();
            startRestartGroup.startReplaceableGroup(1405779621);
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(new x00.a<ComposeUiNode>() { // from class: coil.compose.AsyncImageKt$Content$$inlined$Layout$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                    @Override // x00.a
                    @m80.k
                    public final ComposeUiNode invoke() {
                        return x00.a.this.invoke();
                    }
                });
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, bVar, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new c(modifier, asyncImagePainter, str, alignment, contentScale, f11, colorFilter, z11, i11));
        }
    }
}
