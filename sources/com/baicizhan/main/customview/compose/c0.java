package com.baicizhan.main.customview.compose;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c0 f20270a = new c0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.q<AnimatedVisibilityScope, Composer, Integer, g2> f20271b = ComposableLambdaKt.composableLambdaInstance(-840575315, false, new x00.q() { // from class: com.baicizhan.main.customview.compose.b0
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            g2 c11;
            c11 = c0.c((AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return c11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 c(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i11) {
        g0.p(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-840575315, i11, -1, "com.baicizhan.main.customview.compose.ComposableSingletons$BusinessKt.lambda$-840575315.<anonymous> (Business.kt:119)");
        }
        BoxKt.Box(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth$default(BackgroundKt.m235backgroundbw27NRU$default(Modifier.Companion, bk.b.H(), null, 2, null), 0.0f, 1, null), 0.0f, 1, null), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return g2.f100423a;
    }

    @m80.k
    public final x00.q<AnimatedVisibilityScope, Composer, Integer, g2> b() {
        return f20271b;
    }
}
