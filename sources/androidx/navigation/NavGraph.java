package androidx.navigation;

import a00.h0;
import a00.k1;
import a00.r0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import com.alipay.sdk.m.u.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import q30.k0;
import q30.m;
import q30.x;
import u30.f0;
import w00.o;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 SparseArray.kt\nandroidx/collection/SparseArrayKt\n*L\n1#1,677:1\n232#2,3:678\n1603#3,9:681\n1855#3:690\n1856#3:692\n1612#3:693\n1603#3,9:694\n1855#3:703\n1856#3:705\n1612#3:706\n1#4:691\n1#4:704\n1#4:707\n179#5,2:708\n1224#5,2:711\n22#6:710\n62#6,4:713\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n61#1:678,3\n84#1:681,9\n84#1:690\n84#1:692\n84#1:693\n129#1:694,9\n129#1:703\n129#1:705\n129#1:706\n84#1:691\n129#1:704\n322#1:708,2\n561#1:711,2\n559#1:710\n566#1:713,4\n*E\n"})
/* loaded from: classes3.dex */
public class NavGraph extends NavDestination implements Iterable<NavDestination>, y00.a {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private final SparseArrayCompat<NavDestination> nodes;
    private int startDestId;

    @l
    private String startDestIdName;

    @l
    private String startDestinationRoute;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public final m<NavDestination> childHierarchy(@k NavGraph navGraph) {
            g0.p(navGraph, "<this>");
            return x.t(navGraph, new x00.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavGraph$Companion$childHierarchy$1
                @Override // x00.l
                public final NavDestination invoke(NavDestination it) {
                    g0.p(it, "it");
                    if (!(it instanceof NavGraph)) {
                        return null;
                    }
                    NavGraph navGraph2 = (NavGraph) it;
                    return navGraph2.findNode(navGraph2.getStartDestinationId());
                }
            });
        }

        @o
        @k
        public final NavDestination findStartDestination(@k NavGraph navGraph) {
            g0.p(navGraph, "<this>");
            return (NavDestination) k0.I1(childHierarchy(navGraph));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(@k Navigator<? extends NavGraph> navGraphNavigator) {
        super(navGraphNavigator);
        g0.p(navGraphNavigator, "navGraphNavigator");
        this.nodes = new SparseArrayCompat<>(0, 1, null);
    }

    public static /* synthetic */ NavDestination findNodeComprehensive$default(NavGraph navGraph, int i11, NavDestination navDestination, boolean z11, NavDestination navDestination2, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i12 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraph.findNodeComprehensive(i11, navDestination, z11, navDestination2);
    }

    @o
    @k
    public static final NavDestination findStartDestination(@k NavGraph navGraph) {
        return Companion.findStartDestination(navGraph);
    }

    private final void setStartDestinationId(int i11) {
        if (i11 != getId()) {
            if (this.startDestinationRoute != null) {
                setStartDestinationRoute(null);
            }
            this.startDestId = i11;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i11 + " cannot use the same id as the graph " + this).toString());
    }

    private final void setStartDestinationRoute(String str) {
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else {
            if (g0.g(str, getRoute())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (u30.k0.O3(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            hashCode = NavDestination.Companion.createRoute(str).hashCode();
        }
        this.startDestId = hashCode;
        this.startDestinationRoute = str;
    }

    public final void addAll(@k NavGraph other) {
        g0.p(other, "other");
        Iterator<NavDestination> it = other.iterator();
        while (it.hasNext()) {
            NavDestination next = it.next();
            it.remove();
            addDestination(next);
        }
    }

    public final void addDestination(@k NavDestination node) {
        g0.p(node, "node");
        int id2 = node.getId();
        String route = node.getRoute();
        if (id2 == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (getRoute() != null && g0.g(route, getRoute())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (id2 == getId()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        NavDestination navDestination = this.nodes.get(id2);
        if (navDestination == node) {
            return;
        }
        if (node.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (navDestination != null) {
            navDestination.setParent(null);
        }
        node.setParent(this);
        this.nodes.put(node.getId(), node);
    }

    public final void addDestinations(@k Collection<? extends NavDestination> nodes) {
        g0.p(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            if (navDestination != null) {
                addDestination(navDestination);
            }
        }
    }

    public final void clear() {
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof NavGraph) && super.equals(obj)) {
            NavGraph navGraph = (NavGraph) obj;
            if (this.nodes.size() == navGraph.nodes.size() && getStartDestinationId() == navGraph.getStartDestinationId()) {
                for (NavDestination navDestination : x.j(SparseArrayKt.valueIterator(this.nodes))) {
                    if (!g0.g(navDestination, navGraph.nodes.get(navDestination.getId()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @l
    public final NavDestination findNode(@IdRes int i11) {
        return findNodeComprehensive$default(this, i11, this, false, null, 8, null);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findNodeComprehensive(@IdRes int i11, @l NavDestination navDestination, boolean z11, @l NavDestination navDestination2) {
        NavDestination navDestination3 = this.nodes.get(i11);
        if (navDestination2 != null) {
            if (g0.g(navDestination3, navDestination2) && g0.g(navDestination3.getParent(), navDestination2.getParent())) {
                return navDestination3;
            }
            navDestination3 = null;
        } else if (navDestination3 != null) {
            return navDestination3;
        }
        if (z11) {
            Iterator it = x.j(SparseArrayKt.valueIterator(this.nodes)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    navDestination3 = null;
                    break;
                }
                NavDestination navDestination4 = (NavDestination) it.next();
                NavDestination findNodeComprehensive = (!(navDestination4 instanceof NavGraph) || g0.g(navDestination4, navDestination)) ? null : ((NavGraph) navDestination4).findNodeComprehensive(i11, this, true, navDestination2);
                if (findNodeComprehensive != null) {
                    navDestination3 = findNodeComprehensive;
                    break;
                }
            }
        }
        if (navDestination3 != null) {
            return navDestination3;
        }
        if (getParent() == null || g0.g(getParent(), navDestination)) {
            return null;
        }
        NavGraph parent = getParent();
        g0.m(parent);
        return parent.findNodeComprehensive(i11, this, z11, navDestination2);
    }

    @Override // androidx.navigation.NavDestination
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public String getDisplayName() {
        return getId() != 0 ? super.getDisplayName() : "the root navigation";
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final SparseArrayCompat<NavDestination> getNodes() {
        return this.nodes;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final String getStartDestDisplayName() {
        if (this.startDestIdName == null) {
            String str = this.startDestinationRoute;
            if (str == null) {
                str = String.valueOf(this.startDestId);
            }
            this.startDestIdName = str;
        }
        String str2 = this.startDestIdName;
        g0.m(str2);
        return str2;
    }

    @IdRes
    @n(message = "Use getStartDestinationId instead.", replaceWith = @w0(expression = "startDestinationId", imports = {}))
    public final int getStartDestination() {
        return getStartDestinationId();
    }

    @IdRes
    public final int getStartDestinationId() {
        return this.startDestId;
    }

    @l
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int startDestinationId = getStartDestinationId();
        SparseArrayCompat<NavDestination> sparseArrayCompat = this.nodes;
        int size = sparseArrayCompat.size();
        for (int i11 = 0; i11 < size; i11++) {
            startDestinationId = (((startDestinationId * 31) + sparseArrayCompat.keyAt(i11)) * 31) + sparseArrayCompat.valueAt(i11).hashCode();
        }
        return startDestinationId;
    }

    @Override // java.lang.Iterable
    @k
    public final Iterator<NavDestination> iterator() {
        return new NavGraph$iterator$1(this);
    }

    @Override // androidx.navigation.NavDestination
    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDestination.DeepLinkMatch matchDeepLink(@k NavDeepLinkRequest navDeepLinkRequest) {
        g0.p(navDeepLinkRequest, "navDeepLinkRequest");
        return matchDeepLinkComprehensive(navDeepLinkRequest, true, false, this);
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.DeepLinkMatch matchDeepLinkComprehensive(@k NavDeepLinkRequest navDeepLinkRequest, boolean z11, boolean z12, @k NavDestination lastVisited) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        g0.p(navDeepLinkRequest, "navDeepLinkRequest");
        g0.p(lastVisited, "lastVisited");
        NavDestination.DeepLinkMatch matchDeepLink = super.matchDeepLink(navDeepLinkRequest);
        NavDestination.DeepLinkMatch deepLinkMatch2 = null;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : this) {
                NavDestination.DeepLinkMatch matchDeepLink2 = !g0.g(navDestination, lastVisited) ? navDestination.matchDeepLink(navDeepLinkRequest) : null;
                if (matchDeepLink2 != null) {
                    arrayList.add(matchDeepLink2);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) r0.U3(arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = getParent();
        if (parent != null && z12 && !g0.g(parent, lastVisited)) {
            deepLinkMatch2 = parent.matchDeepLinkComprehensive(navDeepLinkRequest, z11, true, this);
        }
        return (NavDestination.DeepLinkMatch) r0.U3(h0.S(matchDeepLink, deepLinkMatch, deepLinkMatch2));
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.DeepLinkMatch matchRouteComprehensive(@k String route, boolean z11, boolean z12, @k NavDestination lastVisited) {
        NavDestination.DeepLinkMatch deepLinkMatch;
        g0.p(route, "route");
        g0.p(lastVisited, "lastVisited");
        NavDestination.DeepLinkMatch matchRoute = matchRoute(route);
        NavDestination.DeepLinkMatch deepLinkMatch2 = null;
        if (z11) {
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : this) {
                NavDestination.DeepLinkMatch matchRouteComprehensive = g0.g(navDestination, lastVisited) ? null : navDestination instanceof NavGraph ? ((NavGraph) navDestination).matchRouteComprehensive(route, true, false, this) : navDestination.matchRoute(route);
                if (matchRouteComprehensive != null) {
                    arrayList.add(matchRouteComprehensive);
                }
            }
            deepLinkMatch = (NavDestination.DeepLinkMatch) r0.U3(arrayList);
        } else {
            deepLinkMatch = null;
        }
        NavGraph parent = getParent();
        if (parent != null && z12 && !g0.g(parent, lastVisited)) {
            deepLinkMatch2 = parent.matchRouteComprehensive(route, z11, true, this);
        }
        return (NavDestination.DeepLinkMatch) r0.U3(h0.S(matchRoute, deepLinkMatch, deepLinkMatch2));
    }

    @Override // androidx.navigation.NavDestination
    public void onInflate(@k Context context, @k AttributeSet attrs) {
        g0.p(context, "context");
        g0.p(attrs, "attrs");
        super.onInflate(context, attrs);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.NavGraphNavigator);
        g0.o(obtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        setStartDestinationId(obtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavGraphNavigator_startDestination, 0));
        this.startDestIdName = NavDestination.Companion.getDisplayName(context, this.startDestId);
        g2 g2Var = g2.f100423a;
        obtainAttributes.recycle();
    }

    public final void remove(@k NavDestination node) {
        g0.p(node, "node");
        int indexOfKey = this.nodes.indexOfKey(node.getId());
        if (indexOfKey >= 0) {
            this.nodes.valueAt(indexOfKey).setParent(null);
            this.nodes.removeAt(indexOfKey);
        }
    }

    public final void setStartDestination(int i11) {
        setStartDestinationId(i11);
    }

    @Override // androidx.navigation.NavDestination
    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        NavDestination findNode = findNode(this.startDestinationRoute);
        if (findNode == null) {
            findNode = findNode(getStartDestinationId());
        }
        sb2.append(" startDestination=");
        if (findNode == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.startDestId));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(findNode.toString());
            sb2.append(i.f11099d);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "sb.toString()");
        return sb3;
    }

    @l
    public final NavDestination findNode(@l String str) {
        if (str == null || u30.k0.O3(str)) {
            return null;
        }
        return findNode(str, true);
    }

    public final void setStartDestination(@k String startDestRoute) {
        g0.p(startDestRoute, "startDestRoute");
        setStartDestinationRoute(startDestRoute);
    }

    public final void addDestinations(@k NavDestination... nodes) {
        g0.p(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            addDestination(navDestination);
        }
    }

    public final /* synthetic */ <T> NavDestination findNode() {
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        return findNode(RouteSerializerKt.generateHashCode(f50.k0.j(null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> void setStartDestination() {
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.simple");
        setStartDestination(f50.k0.j(null), new x00.l<NavDestination, String>() { // from class: androidx.navigation.NavGraph$setStartDestination$1
            @Override // x00.l
            public final String invoke(NavDestination startDestination) {
                g0.p(startDestination, "startDestination");
                String route = startDestination.getRoute();
                g0.m(route);
                return route;
            }
        });
    }

    @l
    public final <T> NavDestination findNode(@l T t11) {
        if (t11 != null) {
            return findNode(RouteSerializerKt.generateHashCode(f50.k0.h(o0.d(t11.getClass()))));
        }
        return null;
    }

    public final <T> void setStartDestination(@k final T startDestRoute) {
        g0.p(startDestRoute, "startDestRoute");
        setStartDestination(f50.k0.h(o0.d(startDestRoute.getClass())), new x00.l<NavDestination, String>() { // from class: androidx.navigation.NavGraph$setStartDestination$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final String invoke(NavDestination startDestination) {
                g0.p(startDestination, "startDestination");
                Map<String, NavArgument> arguments = startDestination.getArguments();
                LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(arguments.size()));
                Iterator<T> it = arguments.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).getType());
                }
                return RouteSerializerKt.generateRouteWithArgs(startDestRoute, linkedHashMap);
            }
        });
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination findNode(@k String route, boolean z11) {
        Object obj;
        g0.p(route, "route");
        Iterator it = x.j(SparseArrayKt.valueIterator(this.nodes)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            NavDestination navDestination = (NavDestination) obj;
            if (f0.d2(navDestination.getRoute(), route, false, 2, null) || navDestination.matchRoute(route) != null) {
                break;
            }
        }
        NavDestination navDestination2 = (NavDestination) obj;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!z11 || getParent() == null) {
            return null;
        }
        NavGraph parent = getParent();
        g0.m(parent);
        return parent.findNode(route);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T> void setStartDestination(@k f50.i<T> serializer, @k x00.l<? super NavDestination, String> parseRoute) {
        g0.p(serializer, "serializer");
        g0.p(parseRoute, "parseRoute");
        int generateHashCode = RouteSerializerKt.generateHashCode(serializer);
        NavDestination findNode = findNode(generateHashCode);
        if (findNode != null) {
            setStartDestinationRoute(parseRoute.invoke(findNode));
            this.startDestId = generateHashCode;
        } else {
            throw new IllegalStateException(("Cannot find startDestination " + serializer.a().k() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
    }
}
