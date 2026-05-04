package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import m80.k;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt {

    @k
    public static final ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    private static q<SnackbarHostState, Composer, Integer, g2> f8lambda1 = ComposableLambdaKt.composableLambdaInstance(239945703, false, new q<SnackbarHostState, Composer, Integer, g2>() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$lambda-1$1
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
                ComposerKt.traceEventStart(239945703, i11, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-1.<anonymous> (BottomSheetScaffold.kt:324)");
            }
            SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer, i11 & 14, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    @k
    private static p<Composer, Integer, g2> f9lambda2 = ComposableLambdaKt.composableLambdaInstance(690018774, false, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$lambda-2$1
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
                ComposerKt.traceEventStart(690018774, i11, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-2.<anonymous> (BottomSheetScaffold.kt:473)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    @k
    private static p<Composer, Integer, g2> f10lambda3 = ComposableLambdaKt.composableLambdaInstance(1054313561, false, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$lambda-3$1
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
                ComposerKt.traceEventStart(1054313561, i11, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-3.<anonymous> (BottomSheetScaffold.kt:476)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final q<SnackbarHostState, Composer, Integer, g2> m1626getLambda1$material_release() {
        return f8lambda1;
    }

    @k
    /* renamed from: getLambda-2$material_release, reason: not valid java name */
    public final p<Composer, Integer, g2> m1627getLambda2$material_release() {
        return f9lambda2;
    }

    @k
    /* renamed from: getLambda-3$material_release, reason: not valid java name */
    public final p<Composer, Integer, g2> m1628getLambda3$material_release() {
        return f10lambda3;
    }
}
