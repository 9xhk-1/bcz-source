package androidx.navigation.compose;

import a00.h0;
import a00.l1;
import androidx.annotation.RestrictTo;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.SizeTransform;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.window.DialogProperties;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavType;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import h10.d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.q;
import x00.r;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,627:1\n157#2:628\n157#2:633\n157#2:638\n157#2:643\n157#2:654\n157#2:659\n1855#3,2:629\n1855#3,2:631\n1855#3,2:634\n1855#3,2:636\n1855#3,2:639\n1855#3,2:641\n1855#3,2:644\n1855#3,2:646\n1855#3,2:648\n1855#3,2:650\n1855#3,2:652\n1855#3,2:655\n1855#3,2:657\n1855#3,2:661\n1#4:660\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n*L\n56#1:628\n106#1:633\n158#1:638\n212#1:643\n584#1:654\n618#1:659\n59#1:629,2\n62#1:631,2\n108#1:634,2\n109#1:636,2\n160#1:639,2\n161#1:641,2\n218#1:644,2\n347#1:646,2\n348#1:648,2\n449#1:650,2\n550#1:652,2\n590#1:655,2\n591#1:657,2\n624#1:661,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NavGraphBuilderKt {
    @n(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of composable builder that supports AnimatedContent")
    public static final /* synthetic */ void composable(NavGraphBuilder navGraphBuilder, String str, List list, List list2, final q qVar) {
        ComposeNavigator.Destination destination = new ComposeNavigator.Destination((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), (r<? super AnimatedContentScope, NavBackStackEntry, ? super Composer, ? super Integer, g2>) ComposableLambdaKt.composableLambdaInstance(484185514, true, new r<AnimatedContentScope, NavBackStackEntry, Composer, Integer, g2>() { // from class: androidx.navigation.compose.NavGraphBuilderKt$composable$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
                invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, int i11) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(484185514, i11, -1, "androidx.navigation.compose.composable.<anonymous> (NavGraphBuilder.kt:55)");
                }
                qVar.invoke(navBackStackEntry, composer, Integer.valueOf((i11 >> 3) & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        destination.setRoute(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            destination.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            destination.addDeepLink((NavDeepLink) it2.next());
        }
        navGraphBuilder.addDestination(destination);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, q qVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = h0.J();
        }
        if ((i11 & 4) != 0) {
            list2 = h0.J();
        }
        composable(navGraphBuilder, str, list, list2, qVar);
    }

    public static final void dialog(@k NavGraphBuilder navGraphBuilder, @k String str, @k List<NamedNavArgument> list, @k List<NavDeepLink> list2, @k DialogProperties dialogProperties, @k q<? super NavBackStackEntry, ? super Composer, ? super Integer, g2> qVar) {
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder = new DialogNavigatorDestinationBuilder((DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class), str, dialogProperties, qVar);
        for (NamedNavArgument namedNavArgument : list) {
            dialogNavigatorDestinationBuilder.argument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            dialogNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.destination(dialogNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, DialogProperties dialogProperties, q qVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = h0.J();
        }
        List list3 = list;
        if ((i11 & 4) != 0) {
            list2 = h0.J();
        }
        dialog(navGraphBuilder, str, list3, list2, (i11 & 8) != 0 ? new DialogProperties(false, false, false, 7, (v) null) : dialogProperties, qVar);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, l lVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = h0.J();
        }
        List list3 = list;
        if ((i11 & 8) != 0) {
            list2 = h0.J();
        }
        navigation(navGraphBuilder, str, str2, (List<NamedNavArgument>) list3, (List<NavDeepLink>) list2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) null, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) null, (l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, (l<? super NavGraphBuilder, g2>) lVar);
    }

    public static final void navigation(@k NavGraphBuilder navGraphBuilder, @k String str, @k String str2, @k List<NamedNavArgument> list, @k List<NavDeepLink> list2, @m80.l l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar, @m80.l l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar2, @m80.l l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar3, @m80.l l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar4, @m80.l l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> lVar5, @k l<? super NavGraphBuilder, g2> lVar6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), str, str2);
        lVar6.invoke(navGraphBuilder2);
        NavGraph build = navGraphBuilder2.build();
        for (NamedNavArgument namedNavArgument : list) {
            build.addArgument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            build.addDeepLink((NavDeepLink) it.next());
        }
        if (build instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) build;
            composeNavGraph.setEnterTransition$navigation_compose_release(lVar);
            composeNavGraph.setExitTransition$navigation_compose_release(lVar2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(lVar3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(lVar4);
            composeNavGraph.setSizeTransform$navigation_compose_release(lVar5);
        }
        navGraphBuilder.addDestination(build);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, l lVar, l lVar2, l lVar3, l lVar4, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = h0.J();
        }
        List list3 = list;
        if ((i11 & 4) != 0) {
            list2 = h0.J();
        }
        List list4 = list2;
        l lVar5 = (i11 & 8) != 0 ? null : lVar;
        l lVar6 = (i11 & 16) != 0 ? null : lVar2;
        composable(navGraphBuilder, str, list3, list4, lVar5, lVar6, (i11 & 32) != 0 ? lVar5 : lVar3, (i11 & 64) != 0 ? lVar6 : lVar4, rVar);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            list = h0.J();
        }
        List list3 = list;
        List J = (i11 & 8) != 0 ? h0.J() : list2;
        l lVar6 = (i11 & 16) != 0 ? null : lVar;
        l lVar7 = (i11 & 32) != 0 ? null : lVar2;
        navigation(navGraphBuilder, str, str2, (List<NamedNavArgument>) list3, (List<NavDeepLink>) J, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar6, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar7, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) ((i11 & 64) != 0 ? lVar6 : lVar3), (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) ((i11 & 128) != 0 ? lVar7 : lVar4), (l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) null, (l<? super NavGraphBuilder, g2>) lVar5);
    }

    public static /* synthetic */ void dialog$default(NavGraphBuilder navGraphBuilder, Map map, List list, DialogProperties dialogProperties, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = l1.z();
        }
        Map map2 = map;
        if ((i11 & 2) != 0) {
            list = h0.J();
        }
        DialogProperties dialogProperties2 = (i11 & 4) != 0 ? new DialogProperties(false, false, false, 7, (v) null) : dialogProperties;
        DialogNavigator dialogNavigator = (DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class);
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder = new DialogNavigatorDestinationBuilder(dialogNavigator, o0.d(Object.class), map2, dialogProperties2, qVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dialogNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.destination(dialogNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            list = h0.J();
        }
        List list3 = list;
        if ((i11 & 4) != 0) {
            list2 = h0.J();
        }
        List list4 = list2;
        l lVar6 = (i11 & 8) != 0 ? null : lVar;
        l lVar7 = (i11 & 16) != 0 ? null : lVar2;
        composable(navGraphBuilder, str, list3, list4, lVar6, lVar7, (i11 & 32) != 0 ? lVar6 : lVar3, (i11 & 64) != 0 ? lVar7 : lVar4, (i11 & 128) != 0 ? null : lVar5, rVar);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, String str, String str2, List list, List list2, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i11, Object obj) {
        l lVar7;
        NavGraphBuilder navGraphBuilder2;
        String str3;
        String str4;
        l lVar8;
        List J = (i11 & 4) != 0 ? h0.J() : list;
        List J2 = (i11 & 8) != 0 ? h0.J() : list2;
        l lVar9 = (i11 & 16) != 0 ? null : lVar;
        l lVar10 = (i11 & 32) != 0 ? null : lVar2;
        l lVar11 = (i11 & 64) != 0 ? lVar9 : lVar3;
        l lVar12 = (i11 & 128) != 0 ? lVar10 : lVar4;
        if ((i11 & 256) != 0) {
            lVar7 = null;
            str3 = str;
            str4 = str2;
            lVar8 = lVar6;
            navGraphBuilder2 = navGraphBuilder;
        } else {
            lVar7 = lVar5;
            navGraphBuilder2 = navGraphBuilder;
            str3 = str;
            str4 = str2;
            lVar8 = lVar6;
        }
        navigation(navGraphBuilder2, str3, str4, (List<NamedNavArgument>) J, (List<NavDeepLink>) J2, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar9, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar10, (l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar11, (l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar12, (l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) lVar7, (l<? super NavGraphBuilder, g2>) lVar8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void composable$default(NavGraphBuilder navGraphBuilder, Map map, List list, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, r rVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = l1.z();
        }
        if ((i11 & 2) != 0) {
            list = h0.J();
        }
        if ((i11 & 4) != 0) {
            lVar = null;
        }
        if ((i11 & 8) != 0) {
            lVar2 = null;
        }
        if ((i11 & 16) != 0) {
            lVar3 = lVar;
        }
        if ((i11 & 32) != 0) {
            lVar4 = lVar2;
        }
        if ((i11 & 64) != 0) {
            lVar5 = null;
        }
        ComposeNavigator composeNavigator = (ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class);
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder(composeNavigator, o0.d(Object.class), map, rVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(lVar);
        composeNavigatorDestinationBuilder.setExitTransition(lVar2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(lVar3);
        composeNavigatorDestinationBuilder.setPopExitTransition(lVar4);
        composeNavigatorDestinationBuilder.setSizeTransform(lVar5);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, d dVar, Map map, List list, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = l1.z();
        }
        Map map2 = map;
        List J = (i11 & 4) != 0 ? h0.J() : list;
        l lVar7 = (i11 & 8) != 0 ? null : lVar;
        l lVar8 = (i11 & 16) != 0 ? null : lVar2;
        l lVar9 = (i11 & 32) != 0 ? lVar7 : lVar3;
        l lVar10 = (i11 & 64) != 0 ? lVar8 : lVar4;
        l lVar11 = (i11 & 128) != 0 ? null : lVar5;
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, (d<?>) dVar, (d<?>) o0.d(Object.class), (Map<h10.r, NavType<?>>) map2, (List<NavDeepLink>) J, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar7, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar8, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar9, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar10, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) lVar11, (l<? super NavGraphBuilder, g2>) lVar6);
    }

    public static final /* synthetic */ <T> void dialog(NavGraphBuilder navGraphBuilder, Map<h10.r, NavType<?>> map, List<NavDeepLink> list, DialogProperties dialogProperties, q<? super NavBackStackEntry, ? super Composer, ? super Integer, g2> qVar) {
        DialogNavigator dialogNavigator = (DialogNavigator) navGraphBuilder.getProvider().getNavigator(DialogNavigator.class);
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        DialogNavigatorDestinationBuilder dialogNavigatorDestinationBuilder = new DialogNavigatorDestinationBuilder(dialogNavigator, o0.d(Object.class), map, dialogProperties, qVar);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            dialogNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        navGraphBuilder.destination(dialogNavigatorDestinationBuilder);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of composable builder that supports sizeTransform")
    public static final /* synthetic */ void composable(NavGraphBuilder navGraphBuilder, String str, List list, List list2, l lVar, l lVar2, l lVar3, l lVar4, r rVar) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), str, rVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NamedNavArgument namedNavArgument = (NamedNavArgument) it.next();
            composeNavigatorDestinationBuilder.argument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it2.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(lVar);
        composeNavigatorDestinationBuilder.setExitTransition(lVar2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(lVar3);
        composeNavigatorDestinationBuilder.setPopExitTransition(lVar4);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, d dVar, d dVar2, Map map, List list, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i11, Object obj) {
        l lVar7;
        NavGraphBuilder navGraphBuilder2;
        d dVar3;
        d dVar4;
        l lVar8;
        Map z11 = (i11 & 4) != 0 ? l1.z() : map;
        List J = (i11 & 8) != 0 ? h0.J() : list;
        l lVar9 = (i11 & 16) != 0 ? null : lVar;
        l lVar10 = (i11 & 32) != 0 ? null : lVar2;
        l lVar11 = (i11 & 64) != 0 ? lVar9 : lVar3;
        l lVar12 = (i11 & 128) != 0 ? lVar10 : lVar4;
        if ((i11 & 256) != 0) {
            lVar7 = null;
            dVar3 = dVar;
            dVar4 = dVar2;
            lVar8 = lVar6;
            navGraphBuilder2 = navGraphBuilder;
        } else {
            lVar7 = lVar5;
            navGraphBuilder2 = navGraphBuilder;
            dVar3 = dVar;
            dVar4 = dVar2;
            lVar8 = lVar6;
        }
        navigation(navGraphBuilder2, (d<?>) dVar3, (d<?>) dVar4, (Map<h10.r, NavType<?>>) z11, (List<NavDeepLink>) J, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar9, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar10, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar11, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar12, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) lVar7, (l<? super NavGraphBuilder, g2>) lVar8);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, d<?> dVar, Map<h10.r, NavType<?>> map, List<NavDeepLink> list, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar2, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar3, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar4, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> lVar5, l<? super NavGraphBuilder, g2> lVar6) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, dVar, (d<?>) o0.d(Object.class), map, list, lVar, lVar2, lVar3, lVar4, lVar5, lVar6);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, Object obj, Map map, List list, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            map = l1.z();
        }
        Map map2 = map;
        List J = (i11 & 4) != 0 ? h0.J() : list;
        l lVar7 = (i11 & 8) != 0 ? null : lVar;
        l lVar8 = (i11 & 16) != 0 ? null : lVar2;
        l lVar9 = (i11 & 32) != 0 ? lVar7 : lVar3;
        l lVar10 = (i11 & 64) != 0 ? lVar8 : lVar4;
        l lVar11 = (i11 & 128) != 0 ? null : lVar5;
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, obj, (d<?>) o0.d(Object.class), (Map<h10.r, NavType<?>>) map2, (List<NavDeepLink>) J, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar7, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar8, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar9, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar10, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) lVar11, (l<? super NavGraphBuilder, g2>) lVar6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final void navigation(@k NavGraphBuilder navGraphBuilder, @k d<?> dVar, @k d<?> dVar2, @k Map<h10.r, NavType<?>> map, @k List<NavDeepLink> list, @m80.l l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar, @m80.l l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar2, @m80.l l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar3, @m80.l l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar4, @m80.l l<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> lVar5, @k l<? super NavGraphBuilder, g2> lVar6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), dVar, dVar2, map);
        lVar6.invoke(navGraphBuilder2);
        NavGraph build = navGraphBuilder2.build();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            build.addDeepLink((NavDeepLink) it.next());
        }
        if (build instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) build;
            composeNavGraph.setEnterTransition$navigation_compose_release(lVar);
            composeNavGraph.setExitTransition$navigation_compose_release(lVar2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(lVar3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(lVar4);
            composeNavGraph.setSizeTransform$navigation_compose_release(lVar5);
        }
        navGraphBuilder.addDestination(build);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder navGraphBuilder, Object obj, d dVar, Map map, List list, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i11, Object obj2) {
        l lVar7;
        NavGraphBuilder navGraphBuilder2;
        Object obj3;
        d dVar2;
        l lVar8;
        Map z11 = (i11 & 4) != 0 ? l1.z() : map;
        List J = (i11 & 8) != 0 ? h0.J() : list;
        l lVar9 = (i11 & 16) != 0 ? null : lVar;
        l lVar10 = (i11 & 32) != 0 ? null : lVar2;
        l lVar11 = (i11 & 64) != 0 ? lVar9 : lVar3;
        l lVar12 = (i11 & 128) != 0 ? lVar10 : lVar4;
        if ((i11 & 256) != 0) {
            lVar7 = null;
            obj3 = obj;
            dVar2 = dVar;
            lVar8 = lVar6;
            navGraphBuilder2 = navGraphBuilder;
        } else {
            lVar7 = lVar5;
            navGraphBuilder2 = navGraphBuilder;
            obj3 = obj;
            dVar2 = dVar;
            lVar8 = lVar6;
        }
        navigation(navGraphBuilder2, obj3, (d<?>) dVar2, (Map<h10.r, NavType<?>>) z11, (List<NavDeepLink>) J, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar9, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar10, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition>) lVar11, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition>) lVar12, (l<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform>) lVar7, (l<? super NavGraphBuilder, g2>) lVar8);
    }

    public static final void composable(@k NavGraphBuilder navGraphBuilder, @k String str, @k List<NamedNavArgument> list, @k List<NavDeepLink> list2, @m80.l l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar, @m80.l l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar2, @m80.l l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar3, @m80.l l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar4, @m80.l l<AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> lVar5, @k r<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, g2> rVar) {
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder((ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class), str, rVar);
        for (NamedNavArgument namedNavArgument : list) {
            composeNavigatorDestinationBuilder.argument(namedNavArgument.component1(), namedNavArgument.component2());
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(lVar);
        composeNavigatorDestinationBuilder.setExitTransition(lVar2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(lVar3);
        composeNavigatorDestinationBuilder.setPopExitTransition(lVar4);
        composeNavigatorDestinationBuilder.setSizeTransform(lVar5);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder navGraphBuilder, Object obj, Map<h10.r, NavType<?>> map, List<NavDeepLink> list, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar2, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar3, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar4, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> lVar5, l<? super NavGraphBuilder, g2> lVar6) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        navigation(navGraphBuilder, obj, (d<?>) o0.d(Object.class), map, list, lVar, lVar2, lVar3, lVar4, lVar5, lVar6);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final void navigation(@k NavGraphBuilder navGraphBuilder, @k Object obj, @k d<?> dVar, @k Map<h10.r, NavType<?>> map, @k List<NavDeepLink> list, @m80.l l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar, @m80.l l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar2, @m80.l l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar3, @m80.l l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar4, @m80.l l<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> lVar5, @k l<? super NavGraphBuilder, g2> lVar6) {
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), obj, dVar, map);
        lVar6.invoke(navGraphBuilder2);
        NavGraph build = navGraphBuilder2.build();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            build.addDeepLink((NavDeepLink) it.next());
        }
        if (build instanceof ComposeNavGraphNavigator.ComposeNavGraph) {
            ComposeNavGraphNavigator.ComposeNavGraph composeNavGraph = (ComposeNavGraphNavigator.ComposeNavGraph) build;
            composeNavGraph.setEnterTransition$navigation_compose_release(lVar);
            composeNavGraph.setExitTransition$navigation_compose_release(lVar2);
            composeNavGraph.setPopEnterTransition$navigation_compose_release(lVar3);
            composeNavGraph.setPopExitTransition$navigation_compose_release(lVar4);
            composeNavGraph.setSizeTransform$navigation_compose_release(lVar5);
        }
        navGraphBuilder.addDestination(build);
    }

    public static final /* synthetic */ <T> void composable(NavGraphBuilder navGraphBuilder, Map<h10.r, NavType<?>> map, List<NavDeepLink> list, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar2, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> lVar3, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> lVar4, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, SizeTransform> lVar5, r<? super AnimatedContentScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, g2> rVar) {
        ComposeNavigator composeNavigator = (ComposeNavigator) navGraphBuilder.getProvider().getNavigator(ComposeNavigator.class);
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        ComposeNavigatorDestinationBuilder composeNavigatorDestinationBuilder = new ComposeNavigatorDestinationBuilder(composeNavigator, o0.d(Object.class), map, rVar);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            composeNavigatorDestinationBuilder.deepLink((NavDeepLink) it.next());
        }
        composeNavigatorDestinationBuilder.setEnterTransition(lVar);
        composeNavigatorDestinationBuilder.setExitTransition(lVar2);
        composeNavigatorDestinationBuilder.setPopEnterTransition(lVar3);
        composeNavigatorDestinationBuilder.setPopExitTransition(lVar4);
        composeNavigatorDestinationBuilder.setSizeTransform(lVar5);
        navGraphBuilder.destination(composeNavigatorDestinationBuilder);
    }
}
