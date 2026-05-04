package zj;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGuideOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideOverlay.kt\ncom/baicizhan/platform/base/guide/GuideOverlayKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,36:1\n75#2:37\n1247#3,6:38\n1247#3,6:44\n*S KotlinDebug\n*F\n+ 1 GuideOverlay.kt\ncom/baicizhan/platform/base/guide/GuideOverlayKt\n*L\n16#1:37\n17#1:38,6\n33#1:44,6\n*E\n"})
/* loaded from: classes6.dex */
public final class p {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void f(@m80.k final x00.a<? extends List<d>> anchors, @m80.k final x00.a<g2> onDismiss, @m80.l Composer composer, final int i11) {
        int i12;
        g0.p(anchors, "anchors");
        g0.p(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(-1046691112);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(anchors) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1046691112, i12, -1, "com.baicizhan.platform.base.guide.GuideOverlay (GuideOverlay.kt:14)");
            }
            final float top = WindowInsets_androidKt.getStatusBars(WindowInsets.Companion, startRestartGroup, 6).getTop((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity()));
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: zj.k
                    @Override // x00.a
                    public final Object invoke() {
                        g2 h11;
                        h11 = p.h();
                        return h11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            e0.e(true, (x00.a) rememberedValue, ComposableLambdaKt.rememberComposableLambda(1586315517, true, new x00.p() { // from class: zj.l
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 i13;
                    i13 = p.i(x00.a.this, top, onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                    return i13;
                }
            }, startRestartGroup, 54), startRestartGroup, 438, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: zj.m
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 j11;
                    j11 = p.j(x00.a.this, onDismiss, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return j11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void g(@m80.k final d anchor, @m80.k final x00.a<g2> onDismiss, @m80.l Composer composer, final int i11) {
        int i12;
        g0.p(anchor, "anchor");
        g0.p(onDismiss, "onDismiss");
        Composer startRestartGroup = composer.startRestartGroup(557037644);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(anchor) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(557037644, i12, -1, "com.baicizhan.platform.base.guide.GuideOverlay (GuideOverlay.kt:30)");
            }
            boolean z11 = (i12 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: zj.n
                    @Override // x00.a
                    public final Object invoke() {
                        List k11;
                        k11 = p.k(d.this);
                        return k11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            f((x00.a) rememberedValue, onDismiss, startRestartGroup, i12 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: zj.o
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 l11;
                    l11 = p.l(d.this, onDismiss, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return l11;
                }
            });
        }
    }

    public static final g2 h() {
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 i(x00.a aVar, float f11, x00.a aVar2, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1586315517, i11, -1, "com.baicizhan.platform.base.guide.GuideOverlay.<anonymous> (GuideOverlay.kt:17)");
            }
            s.b(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), aVar, f11, aVar2, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 j(x00.a aVar, x00.a aVar2, int i11, Composer composer, int i12) {
        f(aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    public static final List k(d dVar) {
        return a00.g0.l(dVar);
    }

    public static final g2 l(d dVar, x00.a aVar, int i11, Composer composer, int i12) {
        g(dVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }
}
