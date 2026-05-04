package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import m80.k;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ComposableSingletons$AppBarKt {

    @k
    public static final ComposableSingletons$AppBarKt INSTANCE = new ComposableSingletons$AppBarKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    private static q<RowScope, Composer, Integer, g2> f5lambda1 = ComposableLambdaKt.composableLambdaInstance(-636475396, false, new q<RowScope, Composer, Integer, g2>() { // from class: androidx.compose.material.ComposableSingletons$AppBarKt$lambda-1$1
        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return g2.f100423a;
        }

        @Composable
        public final void invoke(RowScope rowScope, Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-636475396, i11, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda-1.<anonymous> (AppBar.kt:89)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    @k
    private static q<RowScope, Composer, Integer, g2> f6lambda2 = ComposableLambdaKt.composableLambdaInstance(-771938130, false, new q<RowScope, Composer, Integer, g2>() { // from class: androidx.compose.material.ComposableSingletons$AppBarKt$lambda-2$1
        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return g2.f100423a;
        }

        @Composable
        public final void invoke(RowScope rowScope, Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-771938130, i11, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda-2.<anonymous> (AppBar.kt:166)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final q<RowScope, Composer, Integer, g2> m1623getLambda1$material_release() {
        return f5lambda1;
    }

    @k
    /* renamed from: getLambda-2$material_release, reason: not valid java name */
    public final q<RowScope, Composer, Integer, g2> m1624getLambda2$material_release() {
        return f6lambda2;
    }
}
