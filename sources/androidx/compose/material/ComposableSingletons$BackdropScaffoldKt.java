package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import m80.k;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ComposableSingletons$BackdropScaffoldKt {

    @k
    public static final ComposableSingletons$BackdropScaffoldKt INSTANCE = new ComposableSingletons$BackdropScaffoldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    private static q<SnackbarHostState, Composer, Integer, g2> f7lambda1 = ComposableLambdaKt.composableLambdaInstance(-1054097158, false, new q<SnackbarHostState, Composer, Integer, g2>() { // from class: androidx.compose.material.ComposableSingletons$BackdropScaffoldKt$lambda-1$1
        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(SnackbarHostState snackbarHostState, Composer composer, Integer num) {
            invoke(snackbarHostState, composer, num.intValue());
            return g2.f100423a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(SnackbarHostState snackbarHostState, Composer composer, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= composer.changed(snackbarHostState) ? 4 : 2;
            }
            if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1054097158, i11, -1, "androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.lambda-1.<anonymous> (BackdropScaffold.kt:351)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer, i11 & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final q<SnackbarHostState, Composer, Integer, g2> m1625getLambda1$material_release() {
        return f7lambda1;
    }
}
