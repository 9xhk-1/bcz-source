package com.baicizhan.main.home.player;

import android.content.Context;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.esotericsoftware.spine.android.SpineView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPathAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathAnimation.kt\ncom/baicizhan/main/home/player/ComposableSingletons$PathAnimationKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,465:1\n1247#2,6:466\n1247#2,6:473\n113#3:472\n*S KotlinDebug\n*F\n+ 1 PathAnimation.kt\ncom/baicizhan/main/home/player/ComposableSingletons$PathAnimationKt\n*L\n104#1:466,6\n111#1:473,6\n110#1:472\n*E\n"})
/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final s0 f23976a = new s0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.r<BoxScope, Modifier, Composer, Integer, yz.g2> f23977b = ComposableLambdaKt.composableLambdaInstance(-1415259359, false, new x00.r() { // from class: com.baicizhan.main.home.player.r0
        @Override // x00.r
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            yz.g2 e11;
            e11 = s0.e((BoxScope) obj, (Modifier) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            return e11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 e(BoxScope PathAnimation, Modifier it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(PathAnimation, "$this$PathAnimation");
        kotlin.jvm.internal.g0.p(it, "it");
        if ((i11 & 48) == 0) {
            i11 |= composer.changed(it) ? 32 : 16;
        }
        if (composer.shouldExecute((i11 & 145) != 144, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1415259359, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$PathAnimationKt.lambda$-1415259359.<anonymous> (PathAnimation.kt:103)");
            }
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new com.esotericsoftware.spine.android.c(new ml.d() { // from class: com.baicizhan.main.home.player.p0
                    @Override // ml.d
                    public final void a(com.esotericsoftware.spine.android.c cVar) {
                        s0.f(cVar);
                    }
                });
                composer.updateRememberedValue(rememberedValue);
            }
            final com.esotericsoftware.spine.android.c cVar = (com.esotericsoftware.spine.android.c) rememberedValue;
            Modifier then = it.then(SizeKt.m773size3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(32)));
            boolean changedInstance = composer.changedInstance(cVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.home.player.q0
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        SpineView g11;
                        g11 = s0.g(com.esotericsoftware.spine.android.c.this, (Context) obj);
                        return g11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            AndroidView_androidKt.AndroidView((x00.l) rememberedValue2, then, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final void f(com.esotericsoftware.spine.android.c cVar) {
        cVar.i().x(0, "ani_idle", true);
    }

    public static final SpineView g(com.esotericsoftware.spine.android.c cVar, Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        return new SpineView.b(context, cVar).e("spine/ui_coin.atlas.txt", "spine/ui_coin.skel.bytes").c(new ll.e("ani_idle")).a();
    }

    @m80.k
    public final x00.r<BoxScope, Modifier, Composer, Integer, yz.g2> d() {
        return f23977b;
    }
}
