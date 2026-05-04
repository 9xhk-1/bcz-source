package androidx.navigation;

import a00.l1;
import androidx.annotation.IdRes;
import h10.d;
import h10.r;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt\n+ 2 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 3 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n*L\n1#1,105:1\n2879#2:106\n2892#2:108\n2909#2:110\n2926#2:112\n45#3:107\n59#3:109\n77#3:111\n95#3:113\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt\n*L\n63#1:106\n70#1:108\n87#1:110\n104#1:112\n63#1:107\n70#1:109\n87#1:111\n104#1:113\n*E\n"})
/* loaded from: classes3.dex */
public final class NavHostKt {
    @n(message = "Use routes to create your NavGraph instead", replaceWith = @w0(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @k
    public static final NavGraph createGraph(@k NavHost navHost, @IdRes int i11, @IdRes int i12, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navHost, "<this>");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i11, i12);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, int i11, int i12, l builder, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        g0.p(navHost, "<this>");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i11, i12);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @k
    public static final NavGraph createGraph(@k NavHost navHost, @k String startDestination, @m80.l String str, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navHost, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, String startDestination, String str, l builder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        g0.p(navHost, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @k
    public static final NavGraph createGraph(@k NavHost navHost, @k d<?> startDestination, @m80.l d<?> dVar, @k Map<r, NavType<?>> typeMap, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navHost, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, d startDestination, d dVar, Map typeMap, l builder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = null;
        }
        if ((i11 & 4) != 0) {
            typeMap = l1.z();
        }
        g0.p(navHost, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), (d<?>) startDestination, (d<?>) dVar, (Map<r, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @k
    public static final NavGraph createGraph(@k NavHost navHost, @k Object startDestination, @m80.l d<?> dVar, @k Map<r, NavType<?>> typeMap, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navHost, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, Object startDestination, d dVar, Map typeMap, l builder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = null;
        }
        if ((i11 & 4) != 0) {
            typeMap = l1.z();
        }
        g0.p(navHost, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, (d<?>) dVar, (Map<r, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
