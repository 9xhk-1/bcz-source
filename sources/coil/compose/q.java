package coil.compose;

import android.content.Context;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSizeKt;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.request.NullRequestDataException;
import coil.size.Scale;
import g10.u;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import q0.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\ncoil/compose/UtilsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,190:1\n74#2:191\n74#2:210\n1116#3,6:192\n1116#3,6:198\n1116#3,6:204\n1116#3,6:211\n*S KotlinDebug\n*F\n+ 1 utils.kt\ncoil/compose/UtilsKt\n*L\n36#1:191\n69#1:210\n37#1:192,6\n59#1:198,6\n63#1:204,6\n70#1:211,6\n*E\n"})
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final long f9693a = Constraints.Companion.m5078fixedJhjzzOo(0, 0);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final q0.h f9694b = q0.i.a(q0.g.f81365d);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Lambda implements x00.l<SemanticsPropertyReceiver, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f9695a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f9695a = str;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            invoke2(semanticsPropertyReceiver);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@m80.k SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, this.f9695a);
            SemanticsPropertiesKt.m4342setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m4327getImageo7Vup1c());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.l<AsyncImagePainter.c, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l<AsyncImagePainter.c.C0153c, g2> f9696a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<AsyncImagePainter.c.d, g2> f9697b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<AsyncImagePainter.c.b, g2> f9698c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar, x00.l<? super AsyncImagePainter.c.d, g2> lVar2, x00.l<? super AsyncImagePainter.c.b, g2> lVar3) {
            super(1);
            this.f9696a = lVar;
            this.f9697b = lVar2;
            this.f9698c = lVar3;
        }

        public final void a(@m80.k AsyncImagePainter.c cVar) {
            x00.l<AsyncImagePainter.c.b, g2> lVar;
            if (cVar instanceof AsyncImagePainter.c.C0153c) {
                x00.l<AsyncImagePainter.c.C0153c, g2> lVar2 = this.f9696a;
                if (lVar2 != null) {
                    lVar2.invoke(cVar);
                    return;
                }
                return;
            }
            if (cVar instanceof AsyncImagePainter.c.d) {
                x00.l<AsyncImagePainter.c.d, g2> lVar3 = this.f9697b;
                if (lVar3 != null) {
                    lVar3.invoke(cVar);
                    return;
                }
                return;
            }
            if (!(cVar instanceof AsyncImagePainter.c.b) || (lVar = this.f9698c) == null) {
                return;
            }
            lVar.invoke(cVar);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(AsyncImagePainter.c cVar) {
            a(cVar);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.l<AsyncImagePainter.c, AsyncImagePainter.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Painter f9699a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Painter f9700b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Painter f9701c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Painter painter, Painter painter2, Painter painter3) {
            super(1);
            this.f9699a = painter;
            this.f9700b = painter2;
            this.f9701c = painter3;
        }

        @Override // x00.l
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AsyncImagePainter.c invoke(@m80.k AsyncImagePainter.c cVar) {
            if (cVar instanceof AsyncImagePainter.c.C0153c) {
                Painter painter = this.f9699a;
                AsyncImagePainter.c.C0153c c0153c = (AsyncImagePainter.c.C0153c) cVar;
                return painter != null ? c0153c.c(painter) : c0153c;
            }
            if (!(cVar instanceof AsyncImagePainter.c.b)) {
                return cVar;
            }
            AsyncImagePainter.c.b bVar = (AsyncImagePainter.c.b) cVar;
            if (bVar.f().e() instanceof NullRequestDataException) {
                Painter painter2 = this.f9700b;
                return painter2 != null ? AsyncImagePainter.c.b.e(bVar, painter2, null, 2, null) : bVar;
            }
            Painter painter3 = this.f9701c;
            return painter3 != null ? AsyncImagePainter.c.b.e(bVar, painter3, null, 2, null) : bVar;
        }
    }

    public static final float a(long j11, float f11) {
        return u.H(f11, Constraints.m5069getMinHeightimpl(j11), Constraints.m5067getMaxHeightimpl(j11));
    }

    public static final float b(long j11, float f11) {
        return u.H(f11, Constraints.m5070getMinWidthimpl(j11), Constraints.m5068getMaxWidthimpl(j11));
    }

    @Stable
    @m80.k
    public static final Modifier c(@m80.k Modifier modifier, @m80.l String str) {
        return str != null ? SemanticsModifierKt.semantics$default(modifier, false, new a(str), 1, null) : modifier;
    }

    @m80.k
    public static final q0.h d() {
        return f9694b;
    }

    public static final long e() {
        return f9693a;
    }

    public static final boolean f(long j11) {
        return ((double) Size.m2337getWidthimpl(j11)) >= 0.5d && ((double) Size.m2334getHeightimpl(j11)) >= 0.5d;
    }

    @Stable
    @m80.l
    public static final x00.l<AsyncImagePainter.c, g2> g(@m80.l x00.l<? super AsyncImagePainter.c.C0153c, g2> lVar, @m80.l x00.l<? super AsyncImagePainter.c.d, g2> lVar2, @m80.l x00.l<? super AsyncImagePainter.c.b, g2> lVar3) {
        if (lVar == null && lVar2 == null && lVar3 == null) {
            return null;
        }
        return new b(lVar, lVar2, lVar3);
    }

    @Composable
    @m80.k
    public static final ImageRequest h(@m80.l Object obj, @m80.l Composer composer, int i11) {
        composer.startReplaceableGroup(1087186730);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1087186730, i11, -1, "coil.compose.requestOf (utils.kt:31)");
        }
        if (obj instanceof ImageRequest) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return imageRequest;
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(375474364);
        boolean changed = composer.changed(context) | composer.changed(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new ImageRequest.Builder(context).j(obj).f();
            composer.updateRememberedValue(rememberedValue);
        }
        ImageRequest imageRequest2 = (ImageRequest) rememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageRequest2;
    }

    @Composable
    @m80.k
    public static final ImageRequest i(@m80.l Object obj, @m80.k ContentScale contentScale, @m80.l Composer composer, int i11) {
        q0.h hVar;
        composer.startReplaceableGroup(1677680258);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1677680258, i11, -1, "coil.compose.requestOfWithSizeResolver (utils.kt:50)");
        }
        boolean z11 = obj instanceof ImageRequest;
        if (z11) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (imageRequest.q().o() != null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return imageRequest;
            }
        }
        composer.startReplaceableGroup(-679565543);
        if (g0.g(contentScale, ContentScale.Companion.getNone())) {
            hVar = f9694b;
        } else {
            composer.startReplaceableGroup(-679565452);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ConstraintsSizeResolver();
                composer.updateRememberedValue(rememberedValue);
            }
            hVar = (ConstraintsSizeResolver) rememberedValue;
            composer.endReplaceableGroup();
        }
        composer.endReplaceableGroup();
        if (z11) {
            composer.startReplaceableGroup(-679565365);
            composer.startReplaceableGroup(-679565358);
            boolean changed = composer.changed(obj) | composer.changed(hVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = ImageRequest.S((ImageRequest) obj, null, 1, null).h0(hVar).f();
                composer.updateRememberedValue(rememberedValue2);
            }
            ImageRequest imageRequest2 = (ImageRequest) rememberedValue2;
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return imageRequest2;
        }
        composer.startReplaceableGroup(-679565199);
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.startReplaceableGroup(-679565153);
        boolean changed2 = composer.changed(context) | composer.changed(obj) | composer.changed(hVar);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed2 || rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new ImageRequest.Builder(context).j(obj).h0(hVar).f();
            composer.updateRememberedValue(rememberedValue3);
        }
        ImageRequest imageRequest3 = (ImageRequest) rememberedValue3;
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageRequest3;
    }

    public static final float j(float f11, @m80.k x00.a<Float> aVar) {
        return (Float.isInfinite(f11) || Float.isNaN(f11)) ? aVar.invoke().floatValue() : f11;
    }

    public static final long k(long j11) {
        return IntSizeKt.IntSize(c10.d.L0(Size.m2337getWidthimpl(j11)), c10.d.L0(Size.m2334getHeightimpl(j11)));
    }

    @Stable
    @m80.k
    public static final Scale l(@m80.k ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.Companion;
        return g0.g(contentScale, companion.getFit()) ? true : g0.g(contentScale, companion.getInside()) ? Scale.FIT : Scale.FILL;
    }

    @Stable
    @m80.l
    public static final q0.g m(long j11) {
        if (Constraints.m5072isZeroimpl(j11)) {
            return null;
        }
        return new q0.g(Constraints.m5064getHasBoundedWidthimpl(j11) ? q0.a.a(Constraints.m5068getMaxWidthimpl(j11)) : c.b.f81359a, Constraints.m5063getHasBoundedHeightimpl(j11) ? q0.a.a(Constraints.m5067getMaxHeightimpl(j11)) : c.b.f81359a);
    }

    @Stable
    @m80.k
    public static final x00.l<AsyncImagePainter.c, AsyncImagePainter.c> n(@m80.l Painter painter, @m80.l Painter painter2, @m80.l Painter painter3) {
        return (painter == null && painter2 == null && painter3 == null) ? AsyncImagePainter.f9551p.a() : new c(painter, painter3, painter2);
    }
}
