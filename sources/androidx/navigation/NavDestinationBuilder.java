package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import f50.i;
import f50.k0;
import h10.d;
import h10.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@NavDestinationDsl
@u0({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,398:1\n1855#2,2:399\n1855#2,2:401\n1855#2,2:405\n215#3,2:403\n215#3,2:407\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n*L\n95#1:399,2\n238#1:401,2\n295#1:405,2\n294#1:403,2\n296#1:407,2\n*E\n"})
/* loaded from: classes3.dex */
public class NavDestinationBuilder<D extends NavDestination> {

    @k
    private Map<Integer, NavAction> actions;

    @k
    private Map<String, NavArgument> arguments;

    @k
    private List<NavDeepLink> deepLinks;

    /* renamed from: id, reason: collision with root package name */
    private final int f5293id;

    @l
    private CharSequence label;

    @k
    private final Navigator<? extends D> navigator;

    @l
    private final String route;
    private Map<r, ? extends NavType<?>> typeMap;

    public NavDestinationBuilder(@k Navigator<? extends D> navigator, @IdRes int i11, @l String str) {
        g0.p(navigator, "navigator");
        this.navigator = navigator;
        this.f5293id = i11;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    @n(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void action(int i11, @k x00.l<? super NavActionBuilder, g2> actionBuilder) {
        g0.p(actionBuilder, "actionBuilder");
        Map<Integer, NavAction> map = this.actions;
        Integer valueOf = Integer.valueOf(i11);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        actionBuilder.invoke(navActionBuilder);
        map.put(valueOf, navActionBuilder.build$navigation_common_release());
    }

    public final void argument(@k String name, @k x00.l<? super NavArgumentBuilder, g2> argumentBuilder) {
        g0.p(name, "name");
        g0.p(argumentBuilder, "argumentBuilder");
        Map<String, NavArgument> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        argumentBuilder.invoke(navArgumentBuilder);
        map.put(name, navArgumentBuilder.build());
    }

    @k
    public D build() {
        D instantiateDestination = instantiateDestination();
        instantiateDestination.setLabel(this.label);
        for (Map.Entry<String, NavArgument> entry : this.arguments.entrySet()) {
            instantiateDestination.addArgument(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            instantiateDestination.addDeepLink((NavDeepLink) it.next());
        }
        for (Map.Entry<Integer, NavAction> entry2 : this.actions.entrySet()) {
            instantiateDestination.putAction(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.route;
        if (str != null) {
            instantiateDestination.setRoute(str);
        }
        int i11 = this.f5293id;
        if (i11 != -1) {
            instantiateDestination.setId(i11);
        }
        return instantiateDestination;
    }

    public final void deepLink(@k String uriPattern) {
        g0.p(uriPattern, "uriPattern");
        this.deepLinks.add(new NavDeepLink(uriPattern));
    }

    @j(name = "deepLinkSafeArgs")
    public final /* synthetic */ <T> void deepLinkSafeArgs(String basePath) {
        g0.p(basePath, "basePath");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        deepLink(basePath, o0.d(Object.class), new x00.l<NavDeepLinkDslBuilder, g2>() { // from class: androidx.navigation.NavDestinationBuilder$deepLink$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(NavDeepLinkDslBuilder deepLink) {
                g0.p(deepLink, "$this$deepLink");
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(NavDeepLinkDslBuilder navDeepLinkDslBuilder) {
                invoke2(navDeepLinkDslBuilder);
                return g2.f100423a;
            }
        });
    }

    public final int getId() {
        return this.f5293id;
    }

    @l
    public final CharSequence getLabel() {
        return this.label;
    }

    @k
    public final Navigator<? extends D> getNavigator() {
        return this.navigator;
    }

    @l
    public final String getRoute() {
        return this.route;
    }

    @k
    public D instantiateDestination() {
        return this.navigator.createDestination();
    }

    public final void setLabel(@l CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void argument(@k String name, @k NavArgument argument) {
        g0.p(name, "name");
        g0.p(argument, "argument");
        this.arguments.put(name, argument);
    }

    public final void deepLink(@k x00.l<? super NavDeepLinkDslBuilder, g2> navDeepLink) {
        g0.p(navDeepLink, "navDeepLink");
        List<NavDeepLink> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        navDeepLink.invoke(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common_release());
    }

    public final /* synthetic */ <T> void deepLink(String basePath, x00.l<? super NavDeepLinkDslBuilder, g2> navDeepLink) {
        g0.p(basePath, "basePath");
        g0.p(navDeepLink, "navDeepLink");
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        deepLink(basePath, o0.d(Object.class), navDeepLink);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T> void deepLink(@k String basePath, @k d<T> route, @k x00.l<? super NavDeepLinkDslBuilder, g2> navDeepLink) {
        g0.p(basePath, "basePath");
        g0.p(route, "route");
        g0.p(navDeepLink, "navDeepLink");
        if (this.typeMap != null) {
            i h11 = k0.h(route);
            Map<r, ? extends NavType<?>> map = this.typeMap;
            Map<r, ? extends NavType<?>> map2 = null;
            if (map == null) {
                g0.S("typeMap");
                map = null;
            }
            for (NamedNavArgument namedNavArgument : RouteSerializerKt.generateNavArguments(h11, map)) {
                NavArgument navArgument = this.arguments.get(namedNavArgument.getName());
                if (navArgument == null || !g0.g(navArgument.getType(), namedNavArgument.getArgument().getType())) {
                    throw new IllegalArgumentException(("Cannot add deeplink from KClass [" + route + "]. DeepLink contains unknown argument [" + namedNavArgument.getName() + "]. Ensure deeplink arguments matches the destination's route from KClass").toString());
                }
            }
            Map<r, ? extends NavType<?>> map3 = this.typeMap;
            if (map3 == null) {
                g0.S("typeMap");
            } else {
                map2 = map3;
            }
            deepLink(NavDeepLinkDslBuilderKt.navDeepLink(basePath, route, map2, navDeepLink));
            return;
        }
        throw new IllegalStateException(("Cannot add deeplink from KClass [" + route + "]. Use the NavDestinationBuilder constructor that takes a KClass with the same arguments.").toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @n(message = "Use routes to build your NavDestination instead", replaceWith = @w0(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public NavDestinationBuilder(@k Navigator<? extends D> navigator, @IdRes int i11) {
        this(navigator, i11, (String) null);
        g0.p(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(@k Navigator<? extends D> navigator, @l String str) {
        this(navigator, -1, str);
        g0.p(navigator, "navigator");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavDestinationBuilder(@m80.k androidx.navigation.Navigator<? extends D> r5, @m80.l h10.d<?> r6, @m80.k java.util.Map<h10.r, androidx.navigation.NavType<?>> r7) {
        /*
            r4 = this;
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "typeMap"
            kotlin.jvm.internal.g0.p(r7, r0)
            if (r6 == 0) goto L17
            f50.i r0 = f50.k0.h(r6)
            if (r0 == 0) goto L17
            int r0 = androidx.navigation.serialization.RouteSerializerKt.generateHashCode(r0)
            goto L18
        L17:
            r0 = -1
        L18:
            r1 = 0
            if (r6 == 0) goto L26
            f50.i r2 = f50.k0.h(r6)
            if (r2 == 0) goto L26
            r3 = 2
            java.lang.String r1 = androidx.navigation.serialization.RouteSerializerKt.generateRoutePattern$default(r2, r7, r1, r3, r1)
        L26:
            r4.<init>(r5, r0, r1)
            if (r6 == 0) goto L53
            f50.i r5 = f50.k0.h(r6)
            java.util.List r5 = androidx.navigation.serialization.RouteSerializerKt.generateNavArguments(r5, r7)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L39:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L53
            java.lang.Object r6 = r5.next()
            androidx.navigation.NamedNavArgument r6 = (androidx.navigation.NamedNavArgument) r6
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r0 = r4.arguments
            java.lang.String r1 = r6.getName()
            androidx.navigation.NavArgument r6 = r6.getArgument()
            r0.put(r1, r6)
            goto L39
        L53:
            r4.typeMap = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestinationBuilder.<init>(androidx.navigation.Navigator, h10.d, java.util.Map):void");
    }

    public final void deepLink(@k NavDeepLink navDeepLink) {
        g0.p(navDeepLink, "navDeepLink");
        this.deepLinks.add(navDeepLink);
    }
}
