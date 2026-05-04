package androidx.navigation;

import a00.i0;
import a00.l1;
import a00.r0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDeepLink;
import androidx.navigation.serialization.RouteSerializerKt;
import f50.k0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;
import q30.m;
import q30.x;
import w00.o;
import yz.c0;
import yz.e0;
import yz.g2;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,865:1\n232#2,3:866\n1#3:869\n29#4:870\n1549#5:871\n1620#5,3:872\n1855#5,2:879\n1855#5,2:882\n1855#5,2:885\n1224#6,2:875\n1224#6,2:877\n32#7:881\n33#7:884\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n*L\n188#1:866,3\n380#1:870\n485#1:871\n485#1:872,3\n728#1:879,2\n736#1:882,2\n740#1:885,2\n709#1:875,2\n713#1:877,2\n733#1:881\n733#1:884\n*E\n"})
/* loaded from: classes3.dex */
public class NavDestination {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Map<String, Class<?>> classes = new LinkedHashMap();

    @k
    private Map<String, NavArgument> _arguments;

    @k
    private final SparseArrayCompat<NavAction> actions;

    @k
    private final List<NavDeepLink> deepLinks;

    /* renamed from: id, reason: collision with root package name */
    private int f5292id;

    @l
    private String idName;

    @l
    private CharSequence label;

    @k
    private final String navigatorName;

    @l
    private NavGraph parent;

    @l
    private String route;

    @l
    private c0<NavDeepLink> routeDeepLink;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @zz.c(AnnotationRetention.BINARY)
    @d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.CLASS)
    public @interface ClassType {
        Class<?> value();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public final String createRoute(@l String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public final String getDisplayName(@k Context context, int i11) {
            String valueOf;
            g0.p(context, "context");
            if (i11 <= 16777215) {
                return String.valueOf(i11);
            }
            try {
                valueOf = context.getResources().getResourceName(i11);
            } catch (Resources.NotFoundException unused) {
                valueOf = String.valueOf(i11);
            }
            g0.o(valueOf, "try {\n                  …tring()\n                }");
            return valueOf;
        }

        @k
        public final m<NavDestination> getHierarchy(@k NavDestination navDestination) {
            g0.p(navDestination, "<this>");
            return x.t(navDestination, new x00.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavDestination$Companion$hierarchy$1
                @Override // x00.l
                public final NavDestination invoke(NavDestination it) {
                    g0.p(it, "it");
                    return it.getParent();
                }
            });
        }

        @o
        public final /* synthetic */ <T> boolean hasRoute(NavDestination navDestination) {
            g0.p(navDestination, "<this>");
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return hasRoute(navDestination, o0.d(Object.class));
        }

        @o
        @k
        public final <C> Class<? extends C> parseClassFromName(@k Context context, @k String name, @k Class<? extends C> expectedClassType) {
            String str;
            g0.p(context, "context");
            g0.p(name, "name");
            g0.p(expectedClassType, "expectedClassType");
            if (name.charAt(0) == '.') {
                str = context.getPackageName() + name;
            } else {
                str = name;
            }
            Class<? extends C> cls = (Class) NavDestination.classes.get(str);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                    NavDestination.classes.put(name, cls);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalArgumentException(e11);
                }
            }
            g0.m(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public final <C> Class<? extends C> parseClassFromNameInternal(@k Context context, @k String name, @k Class<? extends C> expectedClassType) {
            g0.p(context, "context");
            g0.p(name, "name");
            g0.p(expectedClassType, "expectedClassType");
            return NavDestination.parseClassFromName(context, name, expectedClassType);
        }

        private Companion() {
        }

        @o
        public final <T> boolean hasRoute(@k NavDestination navDestination, @k h10.d<T> route) {
            g0.p(navDestination, "<this>");
            g0.p(route, "route");
            return RouteSerializerKt.generateHashCode(k0.h(route)) == navDestination.getId();
        }

        @o
        public static /* synthetic */ void getHierarchy$annotations(NavDestination navDestination) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,865:1\n1855#2,2:866\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n128#1:866,2\n*E\n"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class DeepLinkMatch implements Comparable<DeepLinkMatch> {

        @k
        private final NavDestination destination;
        private final boolean hasMatchingAction;
        private final boolean isExactDeepLink;

        @l
        private final Bundle matchingArgs;
        private final int matchingPathSegments;
        private final int mimeTypeMatchLevel;

        public DeepLinkMatch(@k NavDestination destination, @l Bundle bundle, boolean z11, int i11, boolean z12, int i12) {
            g0.p(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z11;
            this.matchingPathSegments = i11;
            this.hasMatchingAction = z12;
            this.mimeTypeMatchLevel = i12;
        }

        @k
        public final NavDestination getDestination() {
            return this.destination;
        }

        @l
        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean hasMatchingArgs(@l Bundle bundle) {
            Bundle bundle2;
            Object obj;
            if (bundle == null || (bundle2 = this.matchingArgs) == null) {
                return false;
            }
            Set<String> keySet = bundle2.keySet();
            g0.o(keySet, "matchingArgs.keySet()");
            for (String key : keySet) {
                if (!bundle.containsKey(key)) {
                    return false;
                }
                NavArgument navArgument = (NavArgument) this.destination._arguments.get(key);
                Object obj2 = null;
                NavType<Object> type = navArgument != null ? navArgument.getType() : null;
                if (type != null) {
                    Bundle bundle3 = this.matchingArgs;
                    g0.o(key, "key");
                    obj = type.get(bundle3, key);
                } else {
                    obj = null;
                }
                if (type != null) {
                    g0.o(key, "key");
                    obj2 = type.get(bundle, key);
                }
                if (type != null && !type.valueEquals(obj, obj2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.lang.Comparable
        public int compareTo(@k DeepLinkMatch other) {
            g0.p(other, "other");
            boolean z11 = this.isExactDeepLink;
            if (z11 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z11 && other.isExactDeepLink) {
                return -1;
            }
            int i11 = this.matchingPathSegments - other.matchingPathSegments;
            if (i11 > 0) {
                return 1;
            }
            if (i11 < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.matchingArgs;
                g0.m(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z12 = this.hasMatchingAction;
            if (z12 && !other.hasMatchingAction) {
                return 1;
            }
            if (z12 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }
    }

    public NavDestination(@k String navigatorName) {
        g0.p(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.deepLinks = new ArrayList();
        this.actions = new SparseArrayCompat<>(0, 1, null);
        this._arguments = new LinkedHashMap();
    }

    public static /* synthetic */ int[] buildDeepLinkIds$default(NavDestination navDestination, NavDestination navDestination2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i11 & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.buildDeepLinkIds(navDestination2);
    }

    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final String getDisplayName(@k Context context, int i11) {
        return Companion.getDisplayName(context, i11);
    }

    @k
    public static final m<NavDestination> getHierarchy(@k NavDestination navDestination) {
        return Companion.getHierarchy(navDestination);
    }

    private final boolean hasRequiredArguments(NavDeepLink navDeepLink, Uri uri, Map<String, NavArgument> map) {
        final Bundle matchingPathAndQueryArgs$navigation_common_release = navDeepLink.getMatchingPathAndQueryArgs$navigation_common_release(uri, map);
        return NavArgumentKt.missingRequiredArguments(map, new x00.l<String, Boolean>() { // from class: androidx.navigation.NavDestination$hasRequiredArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(String key) {
                g0.p(key, "key");
                return Boolean.valueOf(!matchingPathAndQueryArgs$navigation_common_release.containsKey(key));
            }
        }).isEmpty();
    }

    @o
    public static final <T> boolean hasRoute(@k NavDestination navDestination, @k h10.d<T> dVar) {
        return Companion.hasRoute(navDestination, dVar);
    }

    @o
    @k
    public static final <C> Class<? extends C> parseClassFromName(@k Context context, @k String str, @k Class<? extends C> cls) {
        return Companion.parseClassFromName(context, str, cls);
    }

    @o
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final <C> Class<? extends C> parseClassFromNameInternal(@k Context context, @k String str, @k Class<? extends C> cls) {
        return Companion.parseClassFromNameInternal(context, str, cls);
    }

    public final void addArgument(@k String argumentName, @k NavArgument argument) {
        g0.p(argumentName, "argumentName");
        g0.p(argument, "argument");
        this._arguments.put(argumentName, argument);
    }

    public final void addDeepLink(@k String uriPattern) {
        g0.p(uriPattern, "uriPattern");
        addDeepLink(new NavDeepLink.Builder().setUriPattern(uriPattern).build());
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle addInDefaultArgs(@l Bundle bundle) {
        if (bundle == null && this._arguments.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, NavArgument> entry : this._arguments.entrySet()) {
            entry.getValue().putDefaultValue(entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry<String, NavArgument> entry2 : this._arguments.entrySet()) {
                String key = entry2.getKey();
                NavArgument value = entry2.getValue();
                if (!value.isDefaultValueUnknown$navigation_common_release() && !value.verify(key, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.getType().getName() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    @w00.k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final int[] buildDeepLinkIds() {
        return buildDeepLinkIds$default(this, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@m80.l java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Lb8
            boolean r2 = r9 instanceof androidx.navigation.NavDestination
            if (r2 != 0) goto Ld
            goto Lb8
        Ld:
            java.util.List<androidx.navigation.NavDeepLink> r2 = r8.deepLinks
            androidx.navigation.NavDestination r9 = (androidx.navigation.NavDestination) r9
            java.util.List<androidx.navigation.NavDeepLink> r3 = r9.deepLinks
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            int r3 = r3.size()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r4 = r9.actions
            int r4 = r4.size()
            if (r3 != r4) goto L58
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r3 = r8.actions
            a00.d1 r3 = androidx.collection.SparseArrayKt.keyIterator(r3)
            q30.m r3 = q30.x.j(r3)
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r3.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r5 = r8.actions
            java.lang.Object r5 = r5.get(r4)
            androidx.collection.SparseArrayCompat<androidx.navigation.NavAction> r6 = r9.actions
            java.lang.Object r4 = r6.get(r4)
            boolean r4 = kotlin.jvm.internal.g0.g(r5, r4)
            if (r4 != 0) goto L33
            goto L58
        L56:
            r3 = r0
            goto L59
        L58:
            r3 = r1
        L59:
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r4 = r8._arguments
            int r4 = r4.size()
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r5 = r9._arguments
            int r5 = r5.size()
            if (r4 != r5) goto La0
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r4 = r8._arguments
            q30.m r4 = a00.n1.T0(r4)
            java.util.Iterator r4 = r4.iterator()
        L71:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r6 = r9._arguments
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto La0
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r6 = r9._arguments
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.g0.g(r6, r5)
            if (r5 == 0) goto La0
            goto L71
        L9e:
            r4 = r0
            goto La1
        La0:
            r4 = r1
        La1:
            int r5 = r8.f5292id
            int r6 = r9.f5292id
            if (r5 != r6) goto Lb8
            java.lang.String r5 = r8.route
            java.lang.String r9 = r9.route
            boolean r9 = kotlin.jvm.internal.g0.g(r5, r9)
            if (r9 == 0) goto Lb8
            if (r2 == 0) goto Lb8
            if (r3 == 0) goto Lb8
            if (r4 == 0) goto Lb8
            return r0
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestination.equals(java.lang.Object):boolean");
    }

    @l
    public final String fillInLabel(@k Context context, @l Bundle bundle) {
        NavArgument navArgument;
        g0.p(context, "context");
        CharSequence charSequence = this.label;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String argName = matcher.group(1);
            if (bundle == null || !bundle.containsKey(argName)) {
                throw new IllegalArgumentException("Could not find \"" + argName + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + '\"');
            }
            matcher.appendReplacement(stringBuffer, "");
            NavType<Object> type = (argName == null || (navArgument = this._arguments.get(argName)) == null) ? null : navArgument.getType();
            NavType<Integer> navType = NavType.ReferenceType;
            if (g0.g(type, navType)) {
                g0.o(argName, "argName");
                Integer num = navType.get(bundle, argName);
                g0.n(num, "null cannot be cast to non-null type kotlin.Int");
                String string = context.getString(num.intValue());
                g0.o(string, "context.getString(\n     …                        )");
                stringBuffer.append(string);
            } else {
                g0.m(type);
                g0.o(argName, "argName");
                stringBuffer.append(String.valueOf(type.get(bundle, argName)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @l
    public final NavAction getAction(@IdRes int i11) {
        NavAction navAction = this.actions.getIsEmpty() ? null : this.actions.get(i11);
        if (navAction != null) {
            return navAction;
        }
        NavGraph navGraph = this.parent;
        if (navGraph != null) {
            return navGraph.getAction(i11);
        }
        return null;
    }

    @k
    public final Map<String, NavArgument> getArguments() {
        return l1.D0(this._arguments);
    }

    @IdRes
    public final int getId() {
        return this.f5292id;
    }

    @l
    public final CharSequence getLabel() {
        return this.label;
    }

    @k
    public final String getNavigatorName() {
        return this.navigatorName;
    }

    @l
    public final NavGraph getParent() {
        return this.parent;
    }

    @l
    public final String getRoute() {
        return this.route;
    }

    public boolean hasDeepLink(@k Uri deepLink) {
        g0.p(deepLink, "deepLink");
        return hasDeepLink(new NavDeepLinkRequest(deepLink, null, null));
    }

    public int hashCode() {
        Set<String> keySet;
        int i11 = this.f5292id * 31;
        String str = this.route;
        int hashCode = i11 + (str != null ? str.hashCode() : 0);
        for (NavDeepLink navDeepLink : this.deepLinks) {
            int i12 = hashCode * 31;
            String uriPattern = navDeepLink.getUriPattern();
            int hashCode2 = (i12 + (uriPattern != null ? uriPattern.hashCode() : 0)) * 31;
            String action = navDeepLink.getAction();
            int hashCode3 = (hashCode2 + (action != null ? action.hashCode() : 0)) * 31;
            String mimeType = navDeepLink.getMimeType();
            hashCode = hashCode3 + (mimeType != null ? mimeType.hashCode() : 0);
        }
        Iterator valueIterator = SparseArrayKt.valueIterator(this.actions);
        while (valueIterator.hasNext()) {
            NavAction navAction = (NavAction) valueIterator.next();
            int destinationId = ((hashCode * 31) + navAction.getDestinationId()) * 31;
            NavOptions navOptions = navAction.getNavOptions();
            hashCode = destinationId + (navOptions != null ? navOptions.hashCode() : 0);
            Bundle defaultArguments = navAction.getDefaultArguments();
            if (defaultArguments != null && (keySet = defaultArguments.keySet()) != null) {
                g0.o(keySet, "keySet()");
                for (String str2 : keySet) {
                    int i13 = hashCode * 31;
                    Bundle defaultArguments2 = navAction.getDefaultArguments();
                    g0.m(defaultArguments2);
                    Object obj = defaultArguments2.get(str2);
                    hashCode = i13 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this._arguments.keySet()) {
            int hashCode4 = ((hashCode * 31) + str3.hashCode()) * 31;
            NavArgument navArgument = this._arguments.get(str3);
            hashCode = hashCode4 + (navArgument != null ? navArgument.hashCode() : 0);
        }
        return hashCode;
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DeepLinkMatch matchDeepLink(@k NavDeepLinkRequest navDeepLinkRequest) {
        g0.p(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        DeepLinkMatch deepLinkMatch = null;
        for (NavDeepLink navDeepLink : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            if (navDeepLink.matches$navigation_common_release(navDeepLinkRequest)) {
                Bundle matchingArguments = uri != null ? navDeepLink.getMatchingArguments(uri, this._arguments) : null;
                int calculateMatchingPathSegments$navigation_common_release = navDeepLink.calculateMatchingPathSegments$navigation_common_release(uri);
                String action = navDeepLinkRequest.getAction();
                boolean z11 = action != null && g0.g(action, navDeepLink.getAction());
                String mimeType = navDeepLinkRequest.getMimeType();
                int mimeTypeMatchRating = mimeType != null ? navDeepLink.getMimeTypeMatchRating(mimeType) : -1;
                if (matchingArguments == null) {
                    if (z11 || mimeTypeMatchRating > -1) {
                        if (hasRequiredArguments(navDeepLink, uri, this._arguments)) {
                        }
                    }
                }
                DeepLinkMatch deepLinkMatch2 = new DeepLinkMatch(this, matchingArguments, navDeepLink.isExactDeepLink(), calculateMatchingPathSegments$navigation_common_release, z11, mimeTypeMatchRating);
                if (deepLinkMatch == null || deepLinkMatch2.compareTo(deepLinkMatch) > 0) {
                    deepLinkMatch = deepLinkMatch2;
                }
            }
        }
        return deepLinkMatch;
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final DeepLinkMatch matchRoute(@k String route) {
        NavDeepLink value;
        g0.p(route, "route");
        c0<NavDeepLink> c0Var = this.routeDeepLink;
        if (c0Var == null || (value = c0Var.getValue()) == null) {
            return null;
        }
        Uri parse = Uri.parse(Companion.createRoute(route));
        g0.h(parse, "Uri.parse(this)");
        Bundle matchingArguments = value.getMatchingArguments(parse, this._arguments);
        if (matchingArguments == null) {
            return null;
        }
        return new DeepLinkMatch(this, matchingArguments, value.isExactDeepLink(), value.calculateMatchingPathSegments$navigation_common_release(parse), false, -1);
    }

    @CallSuper
    public void onInflate(@k Context context, @k AttributeSet attrs) {
        g0.p(context, "context");
        g0.p(attrs, "attrs");
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.Navigator);
        g0.o(obtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        setRoute(obtainAttributes.getString(androidx.navigation.common.R.styleable.Navigator_route));
        int i11 = androidx.navigation.common.R.styleable.Navigator_android_id;
        if (obtainAttributes.hasValue(i11)) {
            setId(obtainAttributes.getResourceId(i11, 0));
            this.idName = Companion.getDisplayName(context, this.f5292id);
        }
        this.label = obtainAttributes.getText(androidx.navigation.common.R.styleable.Navigator_android_label);
        g2 g2Var = g2.f100423a;
        obtainAttributes.recycle();
    }

    public final void putAction(@IdRes int i11, @IdRes int i12) {
        putAction(i11, new NavAction(i12, null, null, 6, null));
    }

    public final void removeAction(@IdRes int i11) {
        this.actions.remove(i11);
    }

    public final void removeArgument(@k String argumentName) {
        g0.p(argumentName, "argumentName");
        this._arguments.remove(argumentName);
    }

    public final void setId(@IdRes int i11) {
        this.f5292id = i11;
        this.idName = null;
    }

    public final void setLabel(@l CharSequence charSequence) {
        this.label = charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setParent(@l NavGraph navGraph) {
        this.parent = navGraph;
    }

    public final void setRoute(@l String str) {
        if (str == null) {
            setId(0);
        } else {
            if (u30.k0.O3(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            final String createRoute = Companion.createRoute(str);
            final NavDeepLink build = new NavDeepLink.Builder().setUriPattern(createRoute).build();
            List<String> missingRequiredArguments = NavArgumentKt.missingRequiredArguments(this._arguments, new x00.l<String, Boolean>() { // from class: androidx.navigation.NavDestination$route$missingRequiredArguments$1
                {
                    super(1);
                }

                @Override // x00.l
                public final Boolean invoke(String key) {
                    g0.p(key, "key");
                    return Boolean.valueOf(!NavDeepLink.this.getArgumentsNames$navigation_common_release().contains(key));
                }
            });
            if (!missingRequiredArguments.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + missingRequiredArguments).toString());
            }
            this.routeDeepLink = e0.c(new x00.a<NavDeepLink>() { // from class: androidx.navigation.NavDestination$route$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final NavDeepLink invoke() {
                    return new NavDeepLink.Builder().setUriPattern(createRoute).build();
                }
            });
            setId(createRoute.hashCode());
        }
        this.route = str;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean supportsActions() {
        return true;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append(j.f81006c);
        String str = this.idName;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f5292id));
        } else {
            sb2.append(str);
        }
        sb2.append(j.f81007d);
        String str2 = this.route;
        if (str2 != null && !u30.k0.O3(str2)) {
            sb2.append(" route=");
            sb2.append(this.route);
        }
        if (this.label != null) {
            sb2.append(" label=");
            sb2.append(this.label);
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "sb.toString()");
        return sb3;
    }

    public final void addDeepLink(@k final NavDeepLink navDeepLink) {
        g0.p(navDeepLink, "navDeepLink");
        List<String> missingRequiredArguments = NavArgumentKt.missingRequiredArguments(this._arguments, new x00.l<String, Boolean>() { // from class: androidx.navigation.NavDestination$addDeepLink$missingRequiredArguments$1
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(String key) {
                g0.p(key, "key");
                return Boolean.valueOf(!NavDeepLink.this.getArgumentsNames$navigation_common_release().contains(key));
            }
        });
        if (missingRequiredArguments.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + missingRequiredArguments).toString());
    }

    @w00.k
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public final int[] buildDeepLinkIds(@l NavDestination navDestination) {
        a00.m mVar = new a00.m();
        NavDestination navDestination2 = this;
        while (true) {
            g0.m(navDestination2);
            NavGraph navGraph = navDestination2.parent;
            if ((navDestination != null ? navDestination.parent : null) != null) {
                NavGraph navGraph2 = navDestination.parent;
                g0.m(navGraph2);
                if (navGraph2.findNode(navDestination2.f5292id) == navDestination2) {
                    mVar.addFirst(navDestination2);
                    break;
                }
            }
            if (navGraph == null || navGraph.getStartDestinationId() != navDestination2.f5292id) {
                mVar.addFirst(navDestination2);
            }
            if (g0.g(navGraph, navDestination) || navGraph == null) {
                break;
            }
            navDestination2 = navGraph;
        }
        List a62 = r0.a6(mVar);
        ArrayList arrayList = new ArrayList(i0.d0(a62, 10));
        Iterator it = a62.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NavDestination) it.next()).f5292id));
        }
        return r0.Z5(arrayList);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public String getDisplayName() {
        String str = this.idName;
        return str == null ? String.valueOf(this.f5292id) : str;
    }

    public boolean hasDeepLink(@k NavDeepLinkRequest deepLinkRequest) {
        g0.p(deepLinkRequest, "deepLinkRequest");
        return matchDeepLink(deepLinkRequest) != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean hasRoute(@k String route, @l Bundle bundle) {
        g0.p(route, "route");
        if (g0.g(this.route, route)) {
            return true;
        }
        DeepLinkMatch matchRoute = matchRoute(route);
        if (g0.g(this, matchRoute != null ? matchRoute.getDestination() : null)) {
            return matchRoute.hasMatchingArgs(bundle);
        }
        return false;
    }

    public final void putAction(@IdRes int i11, @k NavAction action) {
        g0.p(action, "action");
        if (supportsActions()) {
            if (i11 == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.put(i11, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i11 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(@k Navigator<? extends NavDestination> navigator) {
        this(NavigatorProvider.Companion.getNameForNavigator$navigation_common_release(navigator.getClass()));
        g0.p(navigator, "navigator");
    }
}
