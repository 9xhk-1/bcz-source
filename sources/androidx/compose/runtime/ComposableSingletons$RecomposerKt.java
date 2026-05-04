package androidx.compose.runtime;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ComposableSingletons$RecomposerKt {

    @k
    public static final ComposableSingletons$RecomposerKt INSTANCE = new ComposableSingletons$RecomposerKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    private static p<Composer, Integer, g2> f25lambda1 = ComposableLambdaKt.composableLambdaInstance(-1091980426, false, new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.ComposableSingletons$RecomposerKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1091980426, i11, -1, "androidx.compose.runtime.ComposableSingletons$RecomposerKt.lambda-1.<anonymous> (Recomposer.kt:417)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$runtime_release, reason: not valid java name */
    public final p<Composer, Integer, g2> m1889getLambda1$runtime_release() {
        return f25lambda1;
    }
}
