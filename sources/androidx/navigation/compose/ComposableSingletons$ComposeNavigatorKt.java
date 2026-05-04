package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavBackStackEntry;
import m80.k;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ComposeNavigatorKt {

    @k
    public static final ComposableSingletons$ComposeNavigatorKt INSTANCE = new ComposableSingletons$ComposeNavigatorKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    public static r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, g2> f35lambda1 = ComposableLambdaKt.composableLambdaInstance(127448943, false, new r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, g2>() { // from class: androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt$lambda-1$1
        @Override // x00.r
        public /* bridge */ /* synthetic */ g2 invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
            return g2.f100423a;
        }

        @Composable
        public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i11) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(127448943, i11, -1, "androidx.navigation.compose.ComposableSingletons$ComposeNavigatorKt.lambda-1.<anonymous> (ComposeNavigator.kt:59)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$navigation_compose_release, reason: not valid java name */
    public final r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, g2> m5615getLambda1$navigation_compose_release() {
        return f35lambda1;
    }
}
