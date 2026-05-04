package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.serialization.RouteSerializerKt;
import f50.k0;
import h10.d;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraphKt\n+ 2 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n1#1,677:1\n306#2:678\n306#2:679\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraphKt\n*L\n621#1:678\n642#1:679\n*E\n"})
/* loaded from: classes3.dex */
public final class NavGraphKt {
    public static final boolean contains(@k NavGraph navGraph, @IdRes int i11) {
        g0.p(navGraph, "<this>");
        return navGraph.findNode(i11) != null;
    }

    @k
    public static final NavDestination get(@k NavGraph navGraph, @IdRes int i11) {
        g0.p(navGraph, "<this>");
        NavDestination findNode = navGraph.findNode(i11);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + i11 + " was found in " + navGraph);
    }

    public static final void minusAssign(@k NavGraph navGraph, @k NavDestination node) {
        g0.p(navGraph, "<this>");
        g0.p(node, "node");
        navGraph.remove(node);
    }

    public static final void plusAssign(@k NavGraph navGraph, @k NavDestination node) {
        g0.p(navGraph, "<this>");
        g0.p(node, "node");
        navGraph.addDestination(node);
    }

    public static final boolean contains(@k NavGraph navGraph, @k String route) {
        g0.p(navGraph, "<this>");
        g0.p(route, "route");
        return navGraph.findNode(route) != null;
    }

    @k
    public static final NavDestination get(@k NavGraph navGraph, @k String route) {
        g0.p(navGraph, "<this>");
        g0.p(route, "route");
        NavDestination findNode = navGraph.findNode(route);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    public static final void plusAssign(@k NavGraph navGraph, @k NavGraph other) {
        g0.p(navGraph, "<this>");
        g0.p(other, "other");
        navGraph.addAll(other);
    }

    public static final <T> boolean contains(@k NavGraph navGraph, @k T route) {
        g0.p(navGraph, "<this>");
        g0.p(route, "route");
        return navGraph.findNode((NavGraph) route) != null;
    }

    public static final /* synthetic */ <T> boolean contains(NavGraph navGraph, d<T> route) {
        g0.p(navGraph, "<this>");
        g0.p(route, "route");
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        return navGraph.findNode(RouteSerializerKt.generateHashCode(k0.j(null))) != null;
    }

    @k
    public static final <T> NavDestination get(@k NavGraph navGraph, @k T route) {
        g0.p(navGraph, "<this>");
        g0.p(route, "route");
        NavDestination findNode = navGraph.findNode((NavGraph) route);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }

    public static final /* synthetic */ <T> NavDestination get(NavGraph navGraph, d<T> route) {
        g0.p(navGraph, "<this>");
        g0.p(route, "route");
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        NavDestination findNode = navGraph.findNode(RouteSerializerKt.generateHashCode(k0.j(null)));
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + route + " was found in " + navGraph);
    }
}
