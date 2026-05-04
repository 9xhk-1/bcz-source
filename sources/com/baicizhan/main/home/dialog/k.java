package com.baicizhan.main.home.dialog;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final k f20935a = new k();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f20936b = ComposableLambdaKt.composableLambdaInstance(859595770, false, new x00.p() { // from class: com.baicizhan.main.home.dialog.i
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 e11;
            e11 = k.e((Composer) obj, ((Integer) obj2).intValue());
            return e11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f20937c = ComposableLambdaKt.composableLambdaInstance(-816583193, false, new x00.p() { // from class: com.baicizhan.main.home.dialog.j
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 f11;
            f11 = k.f((Composer) obj, ((Integer) obj2).intValue());
            return f11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 e(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(859595770, i11, -1, "com.baicizhan.main.home.dialog.ComposableSingletons$LoadingKt.lambda$859595770.<anonymous> (loading.kt:33)");
            }
            z.c(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 f(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-816583193, i11, -1, "com.baicizhan.main.home.dialog.ComposableSingletons$LoadingKt.lambda$-816583193.<anonymous> (loading.kt:37)");
            }
            z.c(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> c() {
        return f20937c;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> d() {
        return f20936b;
    }
}
