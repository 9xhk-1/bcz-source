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
@u0({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 2 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n*L\n1#1,2927:1\n45#2:2928\n59#2:2929\n77#2:2930\n95#2:2931\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavControllerKt\n*L\n2879#1:2928\n2892#1:2929\n2909#1:2930\n2926#1:2931\n*E\n"})
/* loaded from: classes3.dex */
public final class NavControllerKt {
    @n(message = "Use routes to create your NavGraph instead", replaceWith = @w0(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    @k
    public static final NavGraph createGraph(@k NavController navController, @IdRes int i11, @IdRes int i12, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navController, "<this>");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), i11, i12);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, int i11, int i12, l builder, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        g0.p(navController, "<this>");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), i11, i12);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @k
    public static final NavGraph createGraph(@k NavController navController, @k String startDestination, @m80.l String str, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navController, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, String startDestination, String str, l builder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        g0.p(navController, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @k
    public static final NavGraph createGraph(@k NavController navController, @k d<?> startDestination, @m80.l d<?> dVar, @k Map<r, NavType<?>> typeMap, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navController, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @k
    public static final NavGraph createGraph(@k NavController navController, @k Object startDestination, @m80.l d<?> dVar, @k Map<r, NavType<?>> typeMap, @k l<? super NavGraphBuilder, g2> builder) {
        g0.p(navController, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, d startDestination, d dVar, Map typeMap, l builder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = null;
        }
        if ((i11 & 4) != 0) {
            typeMap = l1.z();
        }
        g0.p(navController, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), (d<?>) startDestination, (d<?>) dVar, (Map<r, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavController navController, Object startDestination, d dVar, Map typeMap, l builder, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dVar = null;
        }
        if ((i11 & 4) != 0) {
            typeMap = l1.z();
        }
        g0.p(navController, "<this>");
        g0.p(startDestination, "startDestination");
        g0.p(typeMap, "typeMap");
        g0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.getNavigatorProvider(), startDestination, (d<?>) dVar, (Map<r, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
