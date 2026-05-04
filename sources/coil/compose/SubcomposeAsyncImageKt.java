package coil.compose;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import coil.compose.AsyncImagePainter;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSubcomposeAsyncImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeAsyncImage.kt\ncoil/compose/SubcomposeAsyncImageKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n72#2,2:407\n74#2:437\n78#2:442\n79#3,11:409\n92#3:441\n124#3,5:444\n130#3,5:457\n135#3:468\n137#3:471\n456#4,8:420\n464#4,3:434\n467#4,3:438\n286#4,8:449\n294#4,2:469\n3737#5,6:428\n3737#5,6:462\n1#6:443\n*S KotlinDebug\n*F\n+ 1 SubcomposeAsyncImage.kt\ncoil/compose/SubcomposeAsyncImageKt\n*L\n248#1:407,2\n248#1:437\n248#1:442\n248#1:409,11\n248#1:441\n336#1:444,5\n336#1:457,5\n336#1:468\n336#1:471\n248#1:420,8\n248#1:434,3\n248#1:438,3\n336#1:449,8\n336#1:469,2\n248#1:428,6\n336#1:462,6\n*E\n"})
/* loaded from: classes3.dex */
public final class SubcomposeAsyncImageKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.q<BoxWithConstraintsScope, Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0.h f9603a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.q<p, Composer, Integer, g2> f9604b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AsyncImagePainter f9605c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9606d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Alignment f9607e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ContentScale f9608f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f9609g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f9610h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f9611i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(q0.h hVar, x00.q<? super p, ? super Composer, ? super Integer, g2> qVar, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, boolean z11) {
            super(3);
            this.f9603a = hVar;
            this.f9604b = qVar;
            this.f9605c = asyncImagePainter;
            this.f9606d = str;
            this.f9607e = alignment;
            this.f9608f = contentScale;
            this.f9609g = f11;
            this.f9610h = colorFilter;
            this.f9611i = z11;
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            invoke(boxWithConstraintsScope, composer, num.intValue());
            return g2.f100423a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@m80.k BoxWithConstraintsScope boxWithConstraintsScope, @m80.l Composer composer, int i11) {
            if ((i11 & 14) == 0) {
                i11 |= composer.changed(boxWithConstraintsScope) ? 4 : 2;
            }
            if ((i11 & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(748478484, i11, -1, "coil.compose.SubcomposeAsyncImage.<anonymous> (SubcomposeAsyncImage.kt:274)");
            }
            ((ConstraintsSizeResolver) this.f9603a).j(boxWithConstraintsScope.mo631getConstraintsmsEJaDk());
            this.f9604b.invoke(new k(boxWithConstraintsScope, this.f9605c, this.f9606d, this.f9607e, this.f9608f, this.f9609g, this.f9610h, this.f9611i), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ coil.compose.b f9612a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f9613b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Modifier f9614c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.l<AsyncImagePainter.c, AsyncImagePainter.c> f9615d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.l<AsyncImagePainter.c, g2> f9616e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Alignment f9617f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ContentScale f9618g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f9619h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f9620i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f9621j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f9622k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x00.q<p, Composer, Integer, g2> f9623l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f9624m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f9625n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f9626o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(coil.compose.b bVar, String str, Modifier modifier, x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, x00.l<? super AsyncImagePainter.c, g2> lVar2, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, boolean z11, x00.q<? super p, ? super Composer, ? super Integer, g2> qVar, int i12, int i13, int i14) {
            super(2);
            this.f9612a = bVar;
            this.f9613b = str;
            this.f9614c = modifier;
            this.f9615d = lVar;
            this.f9616e = lVar2;
            this.f9617f = alignment;
            this.f9618g = contentScale;
            this.f9619h = f11;
            this.f9620i = colorFilter;
            this.f9621j = i11;
            this.f9622k = z11;
            this.f9623l = qVar;
            this.f9624m = i12;
            this.f9625n = i13;
            this.f9626o = i14;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            SubcomposeAsyncImageKt.d(this.f9612a, this.f9613b, this.f9614c, this.f9615d, this.f9616e, this.f9617f, this.f9618g, this.f9619h, this.f9620i, this.f9621j, this.f9622k, this.f9623l, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9624m | 1), RecomposeScopeImplKt.updateChangedFlags(this.f9625n), this.f9626o);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final c f9627a = new c();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a extends Lambda implements x00.l<Placeable.PlacementScope, g2> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f9628a = new a();

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
            return MeasureScope.layout$default(measureScope, Constraints.m5070getMinWidthimpl(j11), Constraints.m5069getMinHeightimpl(j11), null, a.f9628a, 4, null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f9629a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Modifier f9630b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Painter f9631c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9632d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Alignment f9633e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ContentScale f9634f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f9635g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f9636h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f9637i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f9638j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ int f9639k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(p pVar, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, boolean z11, int i11, int i12) {
            super(2);
            this.f9629a = pVar;
            this.f9630b = modifier;
            this.f9631c = painter;
            this.f9632d = str;
            this.f9633e = alignment;
            this.f9634f = contentScale;
            this.f9635g = f11;
            this.f9636h = colorFilter;
            this.f9637i = z11;
            this.f9638j = i11;
            this.f9639k = i12;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            SubcomposeAsyncImageKt.g(this.f9629a, this.f9630b, this.f9631c, this.f9632d, this.f9633e, this.f9634f, this.f9635g, this.f9636h, this.f9637i, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9638j | 1), this.f9639k);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends Lambda implements x00.p<Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f9640a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Modifier f9641b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Painter f9642c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f9643d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Alignment f9644e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ContentScale f9645f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f9646g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ColorFilter f9647h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ int f9648i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f9649j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(p pVar, Modifier modifier, Painter painter, String str, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, int i12) {
            super(2);
            this.f9640a = pVar;
            this.f9641b = modifier;
            this.f9642c = painter;
            this.f9643d = str;
            this.f9644e = alignment;
            this.f9645f = contentScale;
            this.f9646g = f11;
            this.f9647h = colorFilter;
            this.f9648i = i11;
            this.f9649j = i12;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        public final void invoke(@m80.l Composer composer, int i11) {
            SubcomposeAsyncImageKt.f(this.f9640a, this.f9641b, this.f9642c, this.f9643d, this.f9644e, this.f9645f, this.f9646g, this.f9647h, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9648i | 1), this.f9649j);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSubcomposeAsyncImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeAsyncImage.kt\ncoil/compose/SubcomposeAsyncImageKt$contentOf$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n1#2:407\n*E\n"})
    public static final class f extends Lambda implements x00.q<p, Composer, Integer, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r<p, AsyncImagePainter.c.C0153c, Composer, Integer, g2> f9650a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ r<p, AsyncImagePainter.c.d, Composer, Integer, g2> f9651b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r<p, AsyncImagePainter.c.b, Composer, Integer, g2> f9652c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(r<? super p, ? super AsyncImagePainter.c.C0153c, ? super Composer, ? super Integer, g2> rVar, r<? super p, ? super AsyncImagePainter.c.d, ? super Composer, ? super Integer, g2> rVar2, r<? super p, ? super AsyncImagePainter.c.b, ? super Composer, ? super Integer, g2> rVar3) {
            super(3);
            this.f9650a = rVar;
            this.f9651b = rVar2;
            this.f9652c = rVar3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
        @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @androidx.compose.runtime.Composable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(@m80.k coil.compose.p r13, @m80.l androidx.compose.runtime.Composer r14, int r15) {
            /*
                r12 = this;
                r1 = r15 & 14
                if (r1 != 0) goto Lf
                boolean r1 = r14.changed(r13)
                if (r1 == 0) goto Lc
                r1 = 4
                goto Ld
            Lc:
                r1 = 2
            Ld:
                r1 = r1 | r15
                goto L10
            Lf:
                r1 = r15
            L10:
                r2 = r1 & 91
                r3 = 18
                if (r2 != r3) goto L21
                boolean r2 = r14.getSkipping()
                if (r2 != 0) goto L1d
                goto L21
            L1d:
                r14.skipToGroupEnd()
                return
            L21:
                boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r2 == 0) goto L30
                r2 = -1
                java.lang.String r3 = "coil.compose.contentOf.<anonymous> (SubcomposeAsyncImage.kt:381)"
                r4 = -1302781228(0xffffffffb25922d4, float:-1.2638981E-8)
                androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
            L30:
                coil.compose.AsyncImagePainter r2 = r13.b()
                coil.compose.AsyncImagePainter$c r2 = r2.p()
                boolean r3 = r2 instanceof coil.compose.AsyncImagePainter.c.C0153c
                r4 = 0
                r5 = -418317557(0xffffffffe710fb0b, float:-6.846517E23)
                r6 = 1
                if (r3 == 0) goto L5c
                r14.startReplaceableGroup(r5)
                x00.r<coil.compose.p, coil.compose.AsyncImagePainter$c$c, androidx.compose.runtime.Composer, java.lang.Integer, yz.g2> r3 = r12.f9650a
                if (r3 == 0) goto L56
                r5 = r1 & 14
                r5 = r5 | 64
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3.invoke(r13, r2, r14, r5)
                yz.g2 r2 = yz.g2.f100423a
                goto L57
            L56:
                r4 = r6
            L57:
                r14.endReplaceableGroup()
            L5a:
                r6 = r4
                goto Laf
            L5c:
                boolean r3 = r2 instanceof coil.compose.AsyncImagePainter.c.d
                if (r3 == 0) goto L7a
                r14.startReplaceableGroup(r5)
                x00.r<coil.compose.p, coil.compose.AsyncImagePainter$c$d, androidx.compose.runtime.Composer, java.lang.Integer, yz.g2> r3 = r12.f9651b
                if (r3 == 0) goto L75
                r5 = r1 & 14
                r5 = r5 | 64
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3.invoke(r13, r2, r14, r5)
                yz.g2 r2 = yz.g2.f100423a
                goto L76
            L75:
                r4 = r6
            L76:
                r14.endReplaceableGroup()
                goto L5a
            L7a:
                boolean r3 = r2 instanceof coil.compose.AsyncImagePainter.c.b
                if (r3 == 0) goto L98
                r14.startReplaceableGroup(r5)
                x00.r<coil.compose.p, coil.compose.AsyncImagePainter$c$b, androidx.compose.runtime.Composer, java.lang.Integer, yz.g2> r3 = r12.f9652c
                if (r3 == 0) goto L93
                r5 = r1 & 14
                r5 = r5 | 64
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r3.invoke(r13, r2, r14, r5)
                yz.g2 r2 = yz.g2.f100423a
                goto L94
            L93:
                r4 = r6
            L94:
                r14.endReplaceableGroup()
                goto L5a
            L98:
                boolean r2 = r2 instanceof coil.compose.AsyncImagePainter.c.a
                if (r2 == 0) goto La6
                r2 = -418301399(0xffffffffe7113a29, float:-6.85816E23)
                r14.startReplaceableGroup(r2)
                r14.endReplaceableGroup()
                goto Laf
            La6:
                r2 = -418301339(0xffffffffe7113a65, float:-6.858203E23)
                r14.startReplaceableGroup(r2)
                r14.endReplaceableGroup()
            Laf:
                if (r6 == 0) goto Lc2
                r10 = r1 & 14
                r11 = 255(0xff, float:3.57E-43)
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r0 = r13
                r9 = r14
                coil.compose.SubcomposeAsyncImageKt.g(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            Lc2:
                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                if (r0 == 0) goto Lcb
                androidx.compose.runtime.ComposerKt.traceEventEnd()
            Lcb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: coil.compose.SubcomposeAsyncImageKt.f.a(coil.compose.p, androidx.compose.runtime.Composer, int):void");
        }

        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(p pVar, Composer composer, Integer num) {
            a(pVar, composer, num.intValue());
            return g2.f100423a;
        }
    }

    @Composable
    public static final void a(@m80.l Object obj, @m80.l String str, @m80.k b0.f fVar, @m80.l Modifier modifier, @m80.l x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, @m80.l x00.l<? super AsyncImagePainter.c, g2> lVar2, @m80.l Alignment alignment, @m80.l ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter, int i11, boolean z11, @m80.l coil.compose.f fVar2, @m80.k x00.q<? super p, ? super Composer, ? super Integer, g2> qVar, @m80.l Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(-2125038415);
        Modifier modifier2 = (i14 & 8) != 0 ? Modifier.Companion : modifier;
        x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> a11 = (i14 & 16) != 0 ? AsyncImagePainter.f9551p.a() : lVar;
        x00.l<? super AsyncImagePainter.c, g2> lVar3 = (i14 & 32) != 0 ? null : lVar2;
        Alignment center = (i14 & 64) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 128) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 256) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 512) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 1024) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        boolean z12 = (i14 & 2048) != 0 ? true : z11;
        coil.compose.f a12 = (i14 & 4096) != 0 ? g.a() : fVar2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2125038415, i12, i13, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:168)");
        }
        int i15 = i12 >> 3;
        d(new coil.compose.b(obj, a12, fVar), str, modifier2, a11, lVar3, center, fit, f12, colorFilter2, m3063getDefaultFilterQualityfv9h1I, z12, qVar, composer, (i15 & 234881024) | (i12 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | ((i13 << 27) & 1879048192), ((i13 >> 3) & 14) | ((i13 >> 6) & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ void b(Object obj, String str, b0.f fVar, Modifier modifier, r rVar, r rVar2, r rVar3, x00.l lVar, x00.l lVar2, x00.l lVar3, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(934816934);
        Modifier modifier2 = (i14 & 8) != 0 ? Modifier.Companion : modifier;
        r rVar4 = (i14 & 16) != 0 ? null : rVar;
        r rVar5 = (i14 & 32) != 0 ? null : rVar2;
        r rVar6 = (i14 & 64) != 0 ? null : rVar3;
        x00.l lVar4 = (i14 & 128) != 0 ? null : lVar;
        x00.l lVar5 = (i14 & 256) != 0 ? null : lVar2;
        x00.l lVar6 = (i14 & 512) != 0 ? null : lVar3;
        Alignment center = (i14 & 1024) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 2048) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 4096) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 8192) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 16384) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(934816934, i12, i13, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:109)");
        }
        int i15 = i13 << 15;
        d(new coil.compose.b(obj, g.a(), fVar), str, modifier2, AsyncImagePainter.f9551p.a(), q.g(lVar4, lVar5, lVar6), center, fit, f12, colorFilter2, m3063getDefaultFilterQualityfv9h1I, true, i(rVar4, rVar5, rVar6), composer, (i12 & 112) | 3072 | ((i12 >> 3) & 896) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192), 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    public static final void c(@m80.l Object obj, @m80.l String str, @m80.k b0.f fVar, @m80.l Modifier modifier, @m80.l x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> lVar, @m80.l r<? super p, ? super AsyncImagePainter.c.C0153c, ? super Composer, ? super Integer, g2> rVar, @m80.l r<? super p, ? super AsyncImagePainter.c.d, ? super Composer, ? super Integer, g2> rVar2, @m80.l r<? super p, ? super AsyncImagePainter.c.b, ? super Composer, ? super Integer, g2> rVar3, @m80.l x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar2, @m80.l x00.l<? super AsyncImagePainter.c.d, g2> lVar3, @m80.l x00.l<? super AsyncImagePainter.c.b, g2> lVar4, @m80.l Alignment alignment, @m80.l ContentScale contentScale, float f11, @m80.l ColorFilter colorFilter, int i11, boolean z11, @m80.l coil.compose.f fVar2, @m80.l Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(428575962);
        Modifier modifier2 = (i14 & 8) != 0 ? Modifier.Companion : modifier;
        x00.l<? super AsyncImagePainter.c, ? extends AsyncImagePainter.c> a11 = (i14 & 16) != 0 ? AsyncImagePainter.f9551p.a() : lVar;
        r<? super p, ? super AsyncImagePainter.c.C0153c, ? super Composer, ? super Integer, g2> rVar4 = (i14 & 32) != 0 ? null : rVar;
        r<? super p, ? super AsyncImagePainter.c.d, ? super Composer, ? super Integer, g2> rVar5 = (i14 & 64) != 0 ? null : rVar2;
        r<? super p, ? super AsyncImagePainter.c.b, ? super Composer, ? super Integer, g2> rVar6 = (i14 & 128) != 0 ? null : rVar3;
        x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar5 = (i14 & 256) != 0 ? null : lVar2;
        x00.l<? super AsyncImagePainter.c.d, g2> lVar6 = (i14 & 512) != 0 ? null : lVar3;
        x00.l<? super AsyncImagePainter.c.b, g2> lVar7 = (i14 & 1024) != 0 ? null : lVar4;
        Alignment center = (i14 & 2048) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 4096) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 8192) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 16384) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 32768) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        boolean z12 = (i14 & 65536) != 0 ? true : z11;
        coil.compose.f a12 = (i14 & 131072) != 0 ? g.a() : fVar2;
        ColorFilter colorFilter3 = colorFilter2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428575962, i12, i13, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:75)");
        }
        coil.compose.b bVar = new coil.compose.b(obj, a12, fVar);
        x00.l<AsyncImagePainter.c, g2> g11 = q.g(lVar5, lVar6, lVar7);
        x00.q<p, Composer, Integer, g2> i15 = i(rVar4, rVar5, rVar6);
        int i16 = i12 >> 3;
        int i17 = (i12 & 112) | (i16 & 896) | (i16 & 7168);
        int i18 = i13 << 12;
        d(bVar, str, modifier2, a11, g11, center, fit, f12, colorFilter3, m3063getDefaultFilterQualityfv9h1I, z12, i15, composer, i17 | (458752 & i18) | (3670016 & i18) | (29360128 & i18) | (234881024 & i18) | (i18 & 1879048192), (i13 >> 18) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013b  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(coil.compose.b r24, java.lang.String r25, androidx.compose.ui.Modifier r26, x00.l<? super coil.compose.AsyncImagePainter.c, ? extends coil.compose.AsyncImagePainter.c> r27, x00.l<? super coil.compose.AsyncImagePainter.c, yz.g2> r28, androidx.compose.ui.Alignment r29, androidx.compose.ui.layout.ContentScale r30, float r31, androidx.compose.ui.graphics.ColorFilter r32, int r33, boolean r34, x00.q<? super coil.compose.p, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r35, androidx.compose.runtime.Composer r36, int r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.SubcomposeAsyncImageKt.d(coil.compose.b, java.lang.String, androidx.compose.ui.Modifier, x00.l, x00.l, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter, int, boolean, x00.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @yz.n(level = DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    public static final /* synthetic */ void e(Object obj, String str, b0.f fVar, Modifier modifier, x00.l lVar, x00.l lVar2, Alignment alignment, ContentScale contentScale, float f11, ColorFilter colorFilter, int i11, x00.q qVar, Composer composer, int i12, int i13, int i14) {
        composer.startReplaceableGroup(10937794);
        Modifier modifier2 = (i14 & 8) != 0 ? Modifier.Companion : modifier;
        x00.l a11 = (i14 & 16) != 0 ? AsyncImagePainter.f9551p.a() : lVar;
        x00.l lVar3 = (i14 & 32) != 0 ? null : lVar2;
        Alignment center = (i14 & 64) != 0 ? Alignment.Companion.getCenter() : alignment;
        ContentScale fit = (i14 & 128) != 0 ? ContentScale.Companion.getFit() : contentScale;
        float f12 = (i14 & 256) != 0 ? 1.0f : f11;
        ColorFilter colorFilter2 = (i14 & 512) != 0 ? null : colorFilter;
        int m3063getDefaultFilterQualityfv9h1I = (i14 & 1024) != 0 ? DrawScope.Companion.m3063getDefaultFilterQualityfv9h1I() : i11;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(10937794, i12, i13, "coil.compose.SubcomposeAsyncImage (SubcomposeAsyncImage.kt:199)");
        }
        int i15 = i12 >> 3;
        d(new coil.compose.b(obj, g.a(), fVar), str, modifier2, a11, lVar3, center, fit, f12, colorFilter2, m3063getDefaultFilterQualityfv9h1I, true, qVar, composer, (i15 & 234881024) | (i12 & 112) | (i15 & 896) | (i15 & 7168) | (57344 & i15) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | ((i13 << 27) & 1879048192), (i13 & 112) | 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0158  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Kept for binary compatibility.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void f(coil.compose.p r22, androidx.compose.ui.Modifier r23, androidx.compose.ui.graphics.painter.Painter r24, java.lang.String r25, androidx.compose.ui.Alignment r26, androidx.compose.ui.layout.ContentScale r27, float r28, androidx.compose.ui.graphics.ColorFilter r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.SubcomposeAsyncImageKt.f(coil.compose.p, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(@m80.k coil.compose.p r21, @m80.l androidx.compose.ui.Modifier r22, @m80.l androidx.compose.ui.graphics.painter.Painter r23, @m80.l java.lang.String r24, @m80.l androidx.compose.ui.Alignment r25, @m80.l androidx.compose.ui.layout.ContentScale r26, float r27, @m80.l androidx.compose.ui.graphics.ColorFilter r28, boolean r29, @m80.l androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.compose.SubcomposeAsyncImageKt.g(coil.compose.p, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.painter.Painter, java.lang.String, androidx.compose.ui.Alignment, androidx.compose.ui.layout.ContentScale, float, androidx.compose.ui.graphics.ColorFilter, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    @Stable
    @ComposableInferredTarget(scheme = "[_[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]:[_]]")
    public static final x00.q<p, Composer, Integer, g2> i(r<? super p, ? super AsyncImagePainter.c.C0153c, ? super Composer, ? super Integer, g2> rVar, r<? super p, ? super AsyncImagePainter.c.d, ? super Composer, ? super Integer, g2> rVar2, r<? super p, ? super AsyncImagePainter.c.b, ? super Composer, ? super Integer, g2> rVar3) {
        return (rVar == null && rVar2 == null && rVar3 == null) ? coil.compose.c.f9658a.a() : ComposableLambdaKt.composableLambdaInstance(-1302781228, true, new f(rVar, rVar2, rVar3));
    }
}
