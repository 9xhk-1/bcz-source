package androidx.compose.ui.tooling;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ComposableSingletons$ComposeViewAdapter_androidKt {

    @k
    public static final ComposableSingletons$ComposeViewAdapter_androidKt INSTANCE = new ComposableSingletons$ComposeViewAdapter_androidKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    private static p<Composer, Integer, g2> f28lambda1 = ComposableLambdaKt.composableLambdaInstance(-1163195098, false, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt$lambda-1$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        @Composable
        public final void invoke(Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1163195098, i11, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda-1.<anonymous> (ComposeViewAdapter.android.kt:79)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    @k
    private static p<Composer, Integer, g2> f29lambda2 = ComposableLambdaKt.composableLambdaInstance(2086912010, false, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt$lambda-2$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        @Composable
        public final void invoke(Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2086912010, i11, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda-2.<anonymous> (ComposeViewAdapter.android.kt:159)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    @k
    private static p<Composer, Integer, g2> f30lambda3 = ComposableLambdaKt.composableLambdaInstance(290922684, false, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt$lambda-3$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        @Composable
        public final void invoke(Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(290922684, i11, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda-3.<anonymous> (ComposeViewAdapter.android.kt:363)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$ui_tooling_release, reason: not valid java name */
    public final p<Composer, Integer, g2> m5033getLambda1$ui_tooling_release() {
        return f28lambda1;
    }

    @k
    /* renamed from: getLambda-2$ui_tooling_release, reason: not valid java name */
    public final p<Composer, Integer, g2> m5034getLambda2$ui_tooling_release() {
        return f29lambda2;
    }

    @k
    /* renamed from: getLambda-3$ui_tooling_release, reason: not valid java name */
    public final p<Composer, Integer, g2> m5035getLambda3$ui_tooling_release() {
        return f30lambda3;
    }
}
