package androidx.navigation;

import androidx.annotation.IdRes;
import f50.k0;
import h10.d;
import h10.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@NavDestinationDsl
@u0({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,305:1\n157#2:306\n157#2:307\n157#2:308\n157#2:309\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n*L\n197#1:306\n214#1:307\n235#1:308\n256#1:309\n*E\n"})
/* loaded from: classes3.dex */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {

    @k
    private final List<NavDestination> destinations;

    @k
    private final NavigatorProvider provider;

    @l
    private d<?> startDestinationClass;

    @IdRes
    private int startDestinationId;

    @l
    private Object startDestinationObject;

    @l
    private String startDestinationRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @n(message = "Use routes to build your NavGraph instead", replaceWith = @w0(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public NavGraphBuilder(@k NavigatorProvider provider, @IdRes int i11, @IdRes int i12) {
        super(provider.getNavigator(NavGraphNavigator.class), i11);
        g0.p(provider, "provider");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationId = i12;
    }

    public final void addDestination(@k NavDestination destination) {
        g0.p(destination, "destination");
        this.destinations.add(destination);
    }

    public final <D extends NavDestination> void destination(@k NavDestinationBuilder<? extends D> navDestination) {
        g0.p(navDestination, "navDestination");
        this.destinations.add(navDestination.build());
    }

    @k
    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    public final void unaryPlus(@k NavDestination navDestination) {
        g0.p(navDestination, "<this>");
        addDestination(navDestination);
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @k
    public NavGraph build() {
        NavGraph navGraph = (NavGraph) super.build();
        navGraph.addDestinations(this.destinations);
        int i11 = this.startDestinationId;
        if (i11 == 0 && this.startDestinationRoute == null && this.startDestinationClass == null && this.startDestinationObject == null) {
            if (getRoute() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            g0.m(str);
            navGraph.setStartDestination(str);
            return navGraph;
        }
        d<?> dVar = this.startDestinationClass;
        if (dVar != null) {
            g0.m(dVar);
            navGraph.setStartDestination(k0.h(dVar), new x00.l<NavDestination, String>() { // from class: androidx.navigation.NavGraphBuilder$build$1$1
                @Override // x00.l
                public final String invoke(NavDestination it) {
                    g0.p(it, "it");
                    String route = it.getRoute();
                    g0.m(route);
                    return route;
                }
            });
            return navGraph;
        }
        Object obj = this.startDestinationObject;
        if (obj == null) {
            navGraph.setStartDestination(i11);
            return navGraph;
        }
        g0.m(obj);
        navGraph.setStartDestination((NavGraph) obj);
        return navGraph;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(@k NavigatorProvider provider, @k String startDestination, @l String str) {
        super(provider.getNavigator(NavGraphNavigator.class), str);
        g0.p(provider, "provider");
        g0.p(startDestination, "startDestination");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationRoute = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(@k NavigatorProvider provider, @k d<?> startDestination, @l d<?> dVar, @k Map<r, NavType<?>> typeMap) {
        super(provider.getNavigator(NavGraphNavigator.class), dVar, typeMap);
        g0.p(provider, "provider");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationClass = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(@k NavigatorProvider provider, @k Object startDestination, @l d<?> dVar, @k Map<r, NavType<?>> typeMap) {
        super(provider.getNavigator(NavGraphNavigator.class), dVar, typeMap);
        g0.p(provider, "provider");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationObject = startDestination;
    }
}
