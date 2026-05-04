package zj;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import zj.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGuideController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideController.kt\ncom/baicizhan/platform/base/guide/GuideControllerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,94:1\n1247#2,6:95\n1247#2,6:101\n*S KotlinDebug\n*F\n+ 1 GuideController.kt\ncom/baicizhan/platform/base/guide/GuideControllerKt\n*L\n81#1:95,6\n86#1:101,6\n*E\n"})
/* loaded from: classes6.dex */
public final class i {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final f c(ProvidedValue<?> providedValue, f.a aVar, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            aVar = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-74145710, i11, -1, "com.baicizhan.platform.base.guide.rememberGuideController (GuideController.kt:79)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new f(aVar);
            composer.updateRememberedValue(rememberedValue);
        }
        final f fVar = (f) rememberedValue;
        final d b11 = fVar.b();
        if (b11 == null) {
            composer.startReplaceGroup(-1261444611);
        } else {
            composer.startReplaceGroup(-1261444610);
            CompositionLocalKt.CompositionLocalProvider(providedValue, ComposableLambdaKt.rememberComposableLambda(1625573443, true, new x00.p() { // from class: zj.g
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 e11;
                    e11 = i.e(d.this, fVar, (Composer) obj, ((Integer) obj2).intValue());
                    return e11;
                }
            }, composer, 54), composer, (i11 & 14) | ProvidedValue.$stable | 48);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fVar;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @m80.k
    public static final f d(@m80.k Brush overlay, @m80.l Composer composer, int i11) {
        g0.p(overlay, "overlay");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1113578137, i11, -1, "com.baicizhan.platform.base.guide.rememberGuideController (GuideController.kt:69)");
        }
        f c11 = c(z.i().provides(overlay), null, composer, ProvidedValue.$stable, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return c11;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 e(final d dVar, final f fVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1625573443, i11, -1, "com.baicizhan.platform.base.guide.rememberGuideController.<anonymous>.<anonymous> (GuideController.kt:83)");
            }
            boolean changed = composer.changed(dVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: zj.h
                    @Override // x00.a
                    public final Object invoke() {
                        g2 f11;
                        f11 = i.f(f.this, dVar);
                        return f11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            p.g(dVar, (x00.a) rememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 f(f fVar, d dVar) {
        fVar.c(dVar);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @m80.k
    public static final f g(long j11, @m80.l f.a aVar, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            j11 = z.h();
        }
        if ((i12 & 2) != 0) {
            aVar = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1638394023, i11, -1, "com.baicizhan.platform.base.guide.rememberGuideController (GuideController.kt:74)");
        }
        f c11 = c(z.j().provides(Color.m2499boximpl(j11)), aVar, composer, ProvidedValue.$stable | (i11 & 112), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return c11;
    }
}
