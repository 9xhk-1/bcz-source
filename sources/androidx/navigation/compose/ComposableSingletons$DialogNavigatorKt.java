package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import m80.k;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ComposableSingletons$DialogNavigatorKt {

    @k
    public static final ComposableSingletons$DialogNavigatorKt INSTANCE = new ComposableSingletons$DialogNavigatorKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    public static q<NavBackStackEntry, Composer, Integer, g2> f36lambda1 = ComposableLambdaKt.composableLambdaInstance(-1092249270, false, new q<NavBackStackEntry, Composer, Integer, g2>() { // from class: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$lambda-1$1
        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(navBackStackEntry, composer, num.intValue());
            return g2.f100423a;
        }

        @Composable
        public final void invoke(NavBackStackEntry navBackStackEntry, Composer composer, int i11) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1092249270, i11, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda-1.<anonymous> (DialogNavigator.kt:58)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$navigation_compose_release, reason: not valid java name */
    public final q<NavBackStackEntry, Composer, Integer, g2> m5616getLambda1$navigation_compose_release() {
        return f36lambda1;
    }
}
