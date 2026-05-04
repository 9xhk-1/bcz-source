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
public final class ComposableSingletons$SnackbarHostKt {

    @k
    public static final ComposableSingletons$SnackbarHostKt INSTANCE = new ComposableSingletons$SnackbarHostKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    private static q<SnackbarData, Composer, Integer, g2> f19lambda1 = ComposableLambdaKt.composableLambdaInstance(996639038, false, new q<SnackbarData, Composer, Integer, g2>() { // from class: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1
        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(SnackbarData snackbarData, Composer composer, Integer num) {
            invoke(snackbarData, composer, num.intValue());
            return g2.f100423a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(SnackbarData snackbarData, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | ((i11 & 8) == 0 ? composer.changed(snackbarData) : composer.changedInstance(snackbarData) ? 4 : 2);
            } else {
                i12 = i11;
            }
            if (!composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(996639038, i12, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:154)");
            }
            SnackbarKt.m1767SnackbarsPrSdHI(snackbarData, null, false, null, 0L, 0L, 0L, 0.0f, composer, i12 & 14, 254);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final q<SnackbarData, Composer, Integer, g2> m1637getLambda1$material_release() {
        return f19lambda1;
    }
}
