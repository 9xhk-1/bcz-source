package androidx.navigation;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.m0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Navigator.Name(NotificationCompat.CATEGORY_NAVIGATION)
@u0({"SMAP\nNavGraphNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
/* loaded from: classes3.dex */
public class NavGraphNavigator extends Navigator<NavGraph> {

    @k
    private final NavigatorProvider navigatorProvider;

    public NavGraphNavigator(@k NavigatorProvider navigatorProvider) {
        g0.p(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    @k
    public final m0<List<NavBackStackEntry>> getBackStack() {
        return getState().getBackStack();
    }

    @Override // androidx.navigation.Navigator
    public void navigate(@k List<NavBackStackEntry> entries, @l NavOptions navOptions, @l Navigator.Extras extras) {
        g0.p(entries, "entries");
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            navigate(it.next(), navOptions, extras);
        }
    }

    @Override // androidx.navigation.Navigator
    @k
    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, android.os.Bundle] */
    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        NavDestination navDestination;
        NavDestination destination = navBackStackEntry.getDestination();
        g0.n(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph navGraph = (NavGraph) destination;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = navBackStackEntry.getArguments();
        int startDestinationId = navGraph.getStartDestinationId();
        String startDestinationRoute = navGraph.getStartDestinationRoute();
        if (startDestinationId == 0 && startDestinationRoute == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.getDisplayName()).toString());
        }
        if (startDestinationRoute != null) {
            navDestination = navGraph.findNode(startDestinationRoute, false);
        } else {
            navDestination = navGraph.getNodes().get(startDestinationId);
        }
        if (navDestination != null) {
            if (startDestinationRoute != null) {
                if (!g0.g(startDestinationRoute, navDestination.getRoute())) {
                    NavDestination.DeepLinkMatch matchRoute = navDestination.matchRoute(startDestinationRoute);
                    Bundle matchingArgs = matchRoute != null ? matchRoute.getMatchingArgs() : null;
                    if (matchingArgs != null && !matchingArgs.isEmpty()) {
                        ?? bundle = new Bundle();
                        bundle.putAll(matchingArgs);
                        T t11 = objectRef.element;
                        if (((Bundle) t11) != null) {
                            bundle.putAll((Bundle) t11);
                        }
                        objectRef.element = bundle;
                    }
                }
                if (!navDestination.getArguments().isEmpty()) {
                    List<String> missingRequiredArguments = NavArgumentKt.missingRequiredArguments(navDestination.getArguments(), new x00.l<String, Boolean>() { // from class: androidx.navigation.NavGraphNavigator$navigate$missingRequiredArgs$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // x00.l
                        public final Boolean invoke(String key) {
                            g0.p(key, "key");
                            Bundle bundle2 = objectRef.element;
                            boolean z11 = true;
                            if (bundle2 != null && bundle2.containsKey(key)) {
                                z11 = false;
                            }
                            return Boolean.valueOf(z11);
                        }
                    });
                    if (!missingRequiredArguments.isEmpty()) {
                        throw new IllegalArgumentException(("Cannot navigate to startDestination " + navDestination + ". Missing required arguments [" + missingRequiredArguments + l50.b.f69930l).toString());
                    }
                }
            }
            this.navigatorProvider.getNavigator(navDestination.getNavigatorName()).navigate(a00.g0.l(getState().createBackStackEntry(navDestination, navDestination.addInDefaultArgs((Bundle) objectRef.element))), navOptions, extras);
            return;
        }
        throw new IllegalArgumentException("navigation destination " + navGraph.getStartDestDisplayName() + " is not a direct child of this NavGraph");
    }
}
