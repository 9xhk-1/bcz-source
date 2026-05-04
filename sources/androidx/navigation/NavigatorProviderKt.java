package androidx.navigation;

import h10.d;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class NavigatorProviderKt {
    @k
    public static final <T extends Navigator<? extends NavDestination>> T get(@k NavigatorProvider navigatorProvider, @k String name) {
        g0.p(navigatorProvider, "<this>");
        g0.p(name, "name");
        return (T) navigatorProvider.getNavigator(name);
    }

    public static final void plusAssign(@k NavigatorProvider navigatorProvider, @k Navigator<? extends NavDestination> navigator) {
        g0.p(navigatorProvider, "<this>");
        g0.p(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    @l
    public static final Navigator<? extends NavDestination> set(@k NavigatorProvider navigatorProvider, @k String name, @k Navigator<? extends NavDestination> navigator) {
        g0.p(navigatorProvider, "<this>");
        g0.p(name, "name");
        g0.p(navigator, "navigator");
        return navigatorProvider.addNavigator(name, navigator);
    }

    @k
    public static final <T extends Navigator<? extends NavDestination>> T get(@k NavigatorProvider navigatorProvider, @k d<T> clazz) {
        g0.p(navigatorProvider, "<this>");
        g0.p(clazz, "clazz");
        return (T) navigatorProvider.getNavigator(w00.b.d(clazz));
    }
}
