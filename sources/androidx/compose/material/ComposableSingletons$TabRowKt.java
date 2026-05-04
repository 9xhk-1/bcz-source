package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ComposableSingletons$TabRowKt {

    @k
    public static final ComposableSingletons$TabRowKt INSTANCE = new ComposableSingletons$TabRowKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    private static p<Composer, Integer, g2> f20lambda1 = ComposableLambdaKt.composableLambdaInstance(182187156, false, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-1$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(182187156, i11, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-1.<anonymous> (TabRow.kt:143)");
            }
            TabRowDefaults.INSTANCE.m1808Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    @k
    private static p<Composer, Integer, g2> f21lambda2 = ComposableLambdaKt.composableLambdaInstance(-1480449365, false, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$lambda-2$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1480449365, i11, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda-2.<anonymous> (TabRow.kt:234)");
            }
            TabRowDefaults.INSTANCE.m1808Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final p<Composer, Integer, g2> m1638getLambda1$material_release() {
        return f20lambda1;
    }

    @k
    /* renamed from: getLambda-2$material_release, reason: not valid java name */
    public final p<Composer, Integer, g2> m1639getLambda2$material_release() {
        return f21lambda2;
    }
}
