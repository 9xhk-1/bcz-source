package androidx.navigation;

import a00.l1;
import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import h10.d;
import h10.r;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class NavGraphBuilderKt {
    @n(message = "Use routes to build your NavGraph instead", replaceWith = @w0(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @k
    public static final NavGraph navigation(@k NavigatorProvider navigatorProvider, @IdRes int i11, @IdRes int i12, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navigatorProvider, "<this>");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i11, i12);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, int i11, int i12, l builder, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        g0.p(navigatorProvider, "<this>");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i11, i12);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @k
    public static final NavGraph navigation(@k NavigatorProvider navigatorProvider, @k String startDestination, @m80.l String str, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navigatorProvider, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @k
    public static final NavGraph navigation(@k NavigatorProvider navigatorProvider, @k d<?> startDestination, @m80.l d<?> dVar, @k Map<r, NavType<?>> typeMap, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navigatorProvider, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, String startDestination, String str, l builder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        g0.p(navigatorProvider, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @k
    public static final NavGraph navigation(@k NavigatorProvider navigatorProvider, @k Object startDestination, @m80.l d<?> dVar, @k Map<r, NavType<?>> typeMap, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navigatorProvider, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @n(message = "Use routes to build your nested NavGraph instead", replaceWith = @w0(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void navigation(@k NavGraphBuilder navGraphBuilder, @IdRes int i11, @IdRes int i12, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navGraphBuilder, "<this>");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), i11, i12);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, d startDestination, d dVar, Map typeMap, l builder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = null;
        }
        if ((i11 & 4) != 0) {
            typeMap = l1.z();
        }
        g0.p(navigatorProvider, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, (d<?>) startDestination, (d<?>) dVar, (Map<r, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final void navigation(@k NavGraphBuilder navGraphBuilder, @k String startDestination, @k String route, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navGraphBuilder, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(route, "route");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, d<?> startDestination, Map<r, NavType<?>> typeMap, l<? super NavGraphBuilder, g2> builder) {
        g0.p(navGraphBuilder, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavigatorProvider provider = navGraphBuilder.getProvider();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(provider, startDestination, (d<?>) o0.d(Object.class), typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, Object startDestination, Map<r, NavType<?>> typeMap, l<? super NavGraphBuilder, g2> builder) {
        g0.p(navGraphBuilder, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavigatorProvider provider = navGraphBuilder.getProvider();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(provider, startDestination, (d<?>) o0.d(Object.class), typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, Object startDestination, d dVar, Map typeMap, l builder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = null;
        }
        if ((i11 & 4) != 0) {
            typeMap = l1.z();
        }
        g0.p(navigatorProvider, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, (d<?>) dVar, (Map<r, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, d startDestination, Map typeMap, l builder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typeMap = l1.z();
        }
        g0.p(navGraphBuilder, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavigatorProvider provider = navGraphBuilder.getProvider();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(provider, (d<?>) startDestination, (d<?>) o0.d(Object.class), (Map<r, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, Object startDestination, Map typeMap, l builder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            typeMap = l1.z();
        }
        g0.p(navGraphBuilder, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavigatorProvider provider = navGraphBuilder.getProvider();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(provider, startDestination, (d<?>) o0.d(Object.class), (Map<r, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }
}
