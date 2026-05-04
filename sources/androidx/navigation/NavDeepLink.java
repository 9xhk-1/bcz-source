package androidx.navigation;

import a00.h0;
import a00.i0;
import a00.l1;
import a00.m0;
import a00.r0;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavDeepLink;
import androidx.navigation.serialization.RouteSerializerKt;
import f50.k0;
import h10.d;
import h10.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import m80.k;
import m80.l;
import u30.f0;
import w00.o;
import yz.c0;
import yz.e0;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,766:1\n1360#2:767\n1446#2,5:768\n1559#2:773\n1590#2,4:774\n1559#2:778\n1590#2,4:779\n1855#2,2:785\n1855#2:787\n1559#2:788\n1590#2,4:789\n1856#2:793\n215#3,2:783\n1#4:794\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n86#1:767\n86#1:768,5\n232#1:773\n232#1:774,4\n249#1:778\n249#1:779,4\n310#1:785,2\n319#1:787\n331#1:788\n331#1:789,4\n319#1:793\n271#1:783,2\n*E\n"})
/* loaded from: classes3.dex */
public final class NavDeepLink {

    @l
    private final String action;

    @k
    private final c0 fragArgs$delegate;

    @k
    private final c0 fragArgsAndRegex$delegate;

    @k
    private final c0 fragPattern$delegate;

    @k
    private final c0 fragRegex$delegate;
    private boolean isExactDeepLink;

    @k
    private final c0 isParameterizedQuery$delegate;
    private boolean isSingleQueryParamValueOnly;

    @l
    private final String mimeType;

    @k
    private final c0 mimeTypePattern$delegate;

    @l
    private String mimeTypeRegex;

    @k
    private final List<String> pathArgs;

    @k
    private final c0 pathPattern$delegate;

    @l
    private String pathRegex;

    @k
    private final c0 queryArgsMap$delegate;

    @l
    private final String uriPattern;

    @k
    private static final Companion Companion = new Companion(null);
    private static final Pattern SCHEME_PATTERN = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    private static final Pattern FILL_IN_PATTERN = Pattern.compile("\\{(.+?)\\}");

    @k
    private static final String SCHEME_REGEX = "http[s]?://";

    @k
    private static final String WILDCARD_REGEX = ".*";

    @k
    private static final String WILDCARD_REGEX_ESCAPED = "\\E.*\\Q";

    @k
    private static final String PATH_REGEX = "([^/]*?|)";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,766:1\n1#2:767\n*E\n"})
    public static final class Builder {

        @k
        public static final Companion Companion = new Companion(null);

        @l
        private String action;

        @l
        private String mimeType;

        @l
        private String uriPattern;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,766:1\n1#2:767\n*E\n"})
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Builder fromUriPattern$default(Companion companion, String basePath, Map typeMap, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    typeMap = l1.z();
                }
                g0.p(basePath, "basePath");
                g0.p(typeMap, "typeMap");
                Builder builder = new Builder();
                g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
                builder.setUriPattern(basePath, o0.d(Object.class), typeMap);
                return builder;
            }

            @o
            @k
            public final Builder fromAction(@k String action) {
                g0.p(action, "action");
                if (action.length() <= 0) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
                }
                Builder builder = new Builder();
                builder.setAction(action);
                return builder;
            }

            @o
            @k
            public final Builder fromMimeType(@k String mimeType) {
                g0.p(mimeType, "mimeType");
                Builder builder = new Builder();
                builder.setMimeType(mimeType);
                return builder;
            }

            @o
            @k
            public final Builder fromUriPattern(@k String uriPattern) {
                g0.p(uriPattern, "uriPattern");
                Builder builder = new Builder();
                builder.setUriPattern(uriPattern);
                return builder;
            }

            private Companion() {
            }

            @o
            public final /* synthetic */ <T> Builder fromUriPattern(String basePath, Map<r, NavType<?>> typeMap) {
                g0.p(basePath, "basePath");
                g0.p(typeMap, "typeMap");
                Builder builder = new Builder();
                g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
                builder.setUriPattern(basePath, o0.d(Object.class), typeMap);
                return builder;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Builder() {
        }

        @o
        @k
        public static final Builder fromAction(@k String str) {
            return Companion.fromAction(str);
        }

        @o
        @k
        public static final Builder fromMimeType(@k String str) {
            return Companion.fromMimeType(str);
        }

        @o
        @k
        public static final Builder fromUriPattern(@k String str) {
            return Companion.fromUriPattern(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setUriPattern$default(Builder builder, String basePath, Map typeMap, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                typeMap = l1.z();
            }
            g0.p(basePath, "basePath");
            g0.p(typeMap, "typeMap");
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return builder.setUriPattern(basePath, o0.d(Object.class), typeMap);
        }

        @k
        public final NavDeepLink build() {
            return new NavDeepLink(this.uriPattern, this.action, this.mimeType);
        }

        @k
        public final Builder setAction(@k String action) {
            g0.p(action, "action");
            if (action.length() <= 0) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
            }
            this.action = action;
            return this;
        }

        @k
        public final Builder setMimeType(@k String mimeType) {
            g0.p(mimeType, "mimeType");
            this.mimeType = mimeType;
            return this;
        }

        @k
        public final Builder setUriPattern(@k String uriPattern) {
            g0.p(uriPattern, "uriPattern");
            this.uriPattern = uriPattern;
            return this;
        }

        public final /* synthetic */ <T> Builder setUriPattern(String basePath, Map<r, NavType<?>> typeMap) {
            g0.p(basePath, "basePath");
            g0.p(typeMap, "typeMap");
            g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
            return setUriPattern(basePath, o0.d(Object.class), typeMap);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public final <T> Builder setUriPattern(@k String basePath, @k d<T> route, @k Map<r, ? extends NavType<?>> typeMap) {
            g0.p(basePath, "basePath");
            g0.p(route, "route");
            g0.p(typeMap, "typeMap");
            this.uriPattern = RouteSerializerKt.generateRoutePattern(k0.h(route), typeMap, basePath);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder setUriPattern$default(Builder builder, String str, d dVar, Map map, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                map = l1.z();
            }
            return builder.setUriPattern(str, dVar, map);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,766:1\n731#2,9:767\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n*L\n448#1:767,9\n*E\n"})
    public static final class MimeType implements Comparable<MimeType> {

        @k
        private String subType;

        @k
        private String type;

        public MimeType(@k String mimeType) {
            List J;
            g0.p(mimeType, "mimeType");
            List<String> split = new Regex("/").split(mimeType, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        J = r0.O5(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            J = h0.J();
            this.type = (String) J.get(0);
            this.subType = (String) J.get(1);
        }

        @k
        public final String getSubType() {
            return this.subType;
        }

        @k
        public final String getType() {
            return this.type;
        }

        public final void setSubType(@k String str) {
            g0.p(str, "<set-?>");
            this.subType = str;
        }

        public final void setType(@k String str) {
            g0.p(str, "<set-?>");
            this.type = str;
        }

        @Override // java.lang.Comparable
        public int compareTo(@k MimeType other) {
            g0.p(other, "other");
            int i11 = g0.g(this.type, other.type) ? 2 : 0;
            return g0.g(this.subType, other.subType) ? i11 + 1 : i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ParamQuery {

        @k
        private final List<String> arguments = new ArrayList();

        @l
        private String paramRegex;

        public final void addArgumentName(@k String name) {
            g0.p(name, "name");
            this.arguments.add(name);
        }

        @k
        public final String getArgumentName(int i11) {
            return this.arguments.get(i11);
        }

        @k
        public final List<String> getArguments() {
            return this.arguments;
        }

        @l
        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void setParamRegex(@l String str) {
            this.paramRegex = str;
        }

        public final int size() {
            return this.arguments.size();
        }
    }

    public NavDeepLink(@l String str, @l String str2, @l String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        this.pathArgs = new ArrayList();
        this.pathPattern$delegate = e0.c(new x00.a<Pattern>() { // from class: androidx.navigation.NavDeepLink$pathPattern$2
            {
                super(0);
            }

            @Override // x00.a
            public final Pattern invoke() {
                String str4;
                str4 = NavDeepLink.this.pathRegex;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            }
        });
        this.isParameterizedQuery$delegate = e0.c(new x00.a<Boolean>() { // from class: androidx.navigation.NavDeepLink$isParameterizedQuery$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                return Boolean.valueOf((NavDeepLink.this.getUriPattern() == null || Uri.parse(NavDeepLink.this.getUriPattern()).getQuery() == null) ? false : true);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.queryArgsMap$delegate = e0.b(lazyThreadSafetyMode, new x00.a<Map<String, ParamQuery>>() { // from class: androidx.navigation.NavDeepLink$queryArgsMap$2
            {
                super(0);
            }

            @Override // x00.a
            public final Map<String, NavDeepLink.ParamQuery> invoke() {
                Map<String, NavDeepLink.ParamQuery> parseQuery;
                parseQuery = NavDeepLink.this.parseQuery();
                return parseQuery;
            }
        });
        this.fragArgsAndRegex$delegate = e0.b(lazyThreadSafetyMode, new x00.a<Pair<? extends List<String>, ? extends String>>() { // from class: androidx.navigation.NavDeepLink$fragArgsAndRegex$2
            {
                super(0);
            }

            @Override // x00.a
            public final Pair<? extends List<String>, ? extends String> invoke() {
                Pair<? extends List<String>, ? extends String> parseFragment;
                parseFragment = NavDeepLink.this.parseFragment();
                return parseFragment;
            }
        });
        this.fragArgs$delegate = e0.b(lazyThreadSafetyMode, new x00.a<List<String>>() { // from class: androidx.navigation.NavDeepLink$fragArgs$2
            {
                super(0);
            }

            @Override // x00.a
            public final List<String> invoke() {
                Pair fragArgsAndRegex;
                List<String> list;
                fragArgsAndRegex = NavDeepLink.this.getFragArgsAndRegex();
                return (fragArgsAndRegex == null || (list = (List) fragArgsAndRegex.getFirst()) == null) ? new ArrayList() : list;
            }
        });
        this.fragRegex$delegate = e0.b(lazyThreadSafetyMode, new x00.a<String>() { // from class: androidx.navigation.NavDeepLink$fragRegex$2
            {
                super(0);
            }

            @Override // x00.a
            public final String invoke() {
                Pair fragArgsAndRegex;
                fragArgsAndRegex = NavDeepLink.this.getFragArgsAndRegex();
                if (fragArgsAndRegex != null) {
                    return (String) fragArgsAndRegex.getSecond();
                }
                return null;
            }
        });
        this.fragPattern$delegate = e0.c(new x00.a<Pattern>() { // from class: androidx.navigation.NavDeepLink$fragPattern$2
            {
                super(0);
            }

            @Override // x00.a
            public final Pattern invoke() {
                String fragRegex;
                fragRegex = NavDeepLink.this.getFragRegex();
                if (fragRegex != null) {
                    return Pattern.compile(fragRegex, 2);
                }
                return null;
            }
        });
        this.mimeTypePattern$delegate = e0.c(new x00.a<Pattern>() { // from class: androidx.navigation.NavDeepLink$mimeTypePattern$2
            {
                super(0);
            }

            @Override // x00.a
            public final Pattern invoke() {
                String str4;
                str4 = NavDeepLink.this.mimeTypeRegex;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            }
        });
        parsePath();
        parseMime();
    }

    private final void buildRegex(String str, List<String> list, StringBuilder sb2) {
        Matcher matcher = FILL_IN_PATTERN.matcher(str);
        int i11 = 0;
        while (matcher.find()) {
            String group = matcher.group(1);
            g0.n(group, "null cannot be cast to non-null type kotlin.String");
            list.add(group);
            if (matcher.start() > i11) {
                String substring = str.substring(i11, matcher.start());
                g0.o(substring, "substring(...)");
                sb2.append(Pattern.quote(substring));
            }
            sb2.append(PATH_REGEX);
            i11 = matcher.end();
        }
        if (i11 < str.length()) {
            String substring2 = str.substring(i11);
            g0.o(substring2, "substring(...)");
            sb2.append(Pattern.quote(substring2));
        }
    }

    private final List<String> getFragArgs() {
        return (List) this.fragArgs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> getFragArgsAndRegex() {
        return (Pair) this.fragArgsAndRegex$delegate.getValue();
    }

    private final Pattern getFragPattern() {
        return (Pattern) this.fragPattern$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getFragRegex() {
        return (String) this.fragRegex$delegate.getValue();
    }

    private final boolean getMatchingPathArguments(Matcher matcher, Bundle bundle, Map<String, NavArgument> map) {
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                h0.b0();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i12));
            NavArgument navArgument = map.get(str);
            try {
                g0.o(value, "value");
                parseArgument(bundle, str, value, navArgument);
                arrayList.add(g2.f100423a);
                i11 = i12;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean getMatchingQueryArguments(Uri uri, Bundle bundle, Map<String, NavArgument> map) {
        String query;
        for (Map.Entry<String, ParamQuery> entry : getQueryArgsMap().entrySet()) {
            String key = entry.getKey();
            ParamQuery value = entry.getValue();
            List<String> inputParams = uri.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = uri.getQuery()) != null && !g0.g(query, uri.toString())) {
                inputParams = a00.g0.l(query);
            }
            g0.o(inputParams, "inputParams");
            if (!parseInputParams(inputParams, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void getMatchingUriFragment(String str, Bundle bundle, Map<String, NavArgument> map) {
        Pattern fragPattern = getFragPattern();
        Matcher matcher = fragPattern != null ? fragPattern.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            List<String> fragArgs = getFragArgs();
            ArrayList arrayList = new ArrayList(i0.d0(fragArgs, 10));
            int i11 = 0;
            for (Object obj : fragArgs) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                String str2 = (String) obj;
                String value = Uri.decode(matcher.group(i12));
                NavArgument navArgument = map.get(str2);
                try {
                    g0.o(value, "value");
                    parseArgument(bundle, str2, value, navArgument);
                    arrayList.add(g2.f100423a);
                    i11 = i12;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private final Pattern getMimeTypePattern() {
        return (Pattern) this.mimeTypePattern$delegate.getValue();
    }

    private final Pattern getPathPattern() {
        return (Pattern) this.pathPattern$delegate.getValue();
    }

    private final Map<String, ParamQuery> getQueryArgsMap() {
        return (Map) this.queryArgsMap$delegate.getValue();
    }

    private final boolean isParameterizedQuery() {
        return ((Boolean) this.isParameterizedQuery$delegate.getValue()).booleanValue();
    }

    private final boolean matchAction(String str) {
        String str2 = this.action;
        if (str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return g0.g(str2, str);
    }

    private final boolean matchMimeType(String str) {
        if (this.mimeType == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        Pattern mimeTypePattern = getMimeTypePattern();
        g0.m(mimeTypePattern);
        return mimeTypePattern.matcher(str).matches();
    }

    private final boolean matchUri(Uri uri) {
        if (getPathPattern() == null) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        Pattern pathPattern = getPathPattern();
        g0.m(pathPattern);
        return pathPattern.matcher(uri.toString()).matches();
    }

    private final void parseArgument(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (navArgument != null) {
            navArgument.getType().parseAndPut(bundle, str, str2);
        } else {
            bundle.putString(str, str2);
        }
    }

    private final boolean parseArgumentForRepeatedParam(Bundle bundle, String str, String str2, NavArgument navArgument) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (navArgument == null) {
            return false;
        }
        NavType<Object> type = navArgument.getType();
        type.parseAndPut(bundle, str, str2, type.get(bundle, str));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> parseFragment() {
        String str = this.uriPattern;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.uriPattern).getFragment();
        StringBuilder sb2 = new StringBuilder();
        g0.m(fragment);
        buildRegex(fragment, arrayList, sb2);
        String sb3 = sb2.toString();
        g0.o(sb3, "fragRegex.toString()");
        return h1.a(arrayList, sb3);
    }

    private final boolean parseInputParams(List<String> list, ParamQuery paramQuery, Bundle bundle, Map<String, NavArgument> map) {
        Object obj;
        Bundle bundleOf = BundleKt.bundleOf(new Pair[0]);
        Iterator<T> it = paramQuery.getArguments().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            NavArgument navArgument = map.get(str);
            NavType<Object> type = navArgument != null ? navArgument.getType() : null;
            if ((type instanceof CollectionNavType) && !navArgument.isDefaultValuePresent()) {
                type.put(bundleOf, str, ((CollectionNavType) type).emptyCollection());
            }
        }
        for (String str2 : list) {
            String paramRegex = paramQuery.getParamRegex();
            Matcher matcher = paramRegex != null ? Pattern.compile(paramRegex, 32).matcher(str2) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            List<String> arguments = paramQuery.getArguments();
            ArrayList arrayList = new ArrayList(i0.d0(arguments, 10));
            int i11 = 0;
            for (Object obj2 : arguments) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    h0.b0();
                }
                String str3 = (String) obj2;
                String group = matcher.group(i12);
                if (group == null) {
                    group = "";
                } else {
                    g0.o(group, "argMatcher.group(index + 1) ?: \"\"");
                }
                NavArgument navArgument2 = map.get(str3);
                try {
                    if (bundleOf.containsKey(str3)) {
                        obj = Boolean.valueOf(parseArgumentForRepeatedParam(bundleOf, str3, group, navArgument2));
                    } else {
                        parseArgument(bundleOf, str3, group, navArgument2);
                        obj = g2.f100423a;
                    }
                } catch (IllegalArgumentException unused) {
                    obj = g2.f100423a;
                }
                arrayList.add(obj);
                i11 = i12;
            }
        }
        bundle.putAll(bundleOf);
        return true;
    }

    private final void parseMime() {
        if (this.mimeType == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.mimeType).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
        }
        MimeType mimeType = new MimeType(this.mimeType);
        this.mimeTypeRegex = f0.z2("^(" + mimeType.getType() + "|[*]+)/(" + mimeType.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void parsePath() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!SCHEME_PATTERN.matcher(this.uriPattern).find()) {
            sb2.append(SCHEME_REGEX);
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.uriPattern);
        matcher.find();
        boolean z11 = false;
        String substring = this.uriPattern.substring(0, matcher.start());
        g0.o(substring, "substring(...)");
        buildRegex(substring, this.pathArgs, sb2);
        String str = WILDCARD_REGEX;
        if (!u30.k0.n3(sb2, str, false, 2, null) && !u30.k0.n3(sb2, PATH_REGEX, false, 2, null)) {
            z11 = true;
        }
        this.isExactDeepLink = z11;
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        String sb3 = sb2.toString();
        g0.o(sb3, "uriRegex.toString()");
        this.pathRegex = f0.z2(sb3, str, WILDCARD_REGEX_ESCAPED, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, ParamQuery> parseQuery() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (isParameterizedQuery()) {
            Uri parse = Uri.parse(this.uriPattern);
            for (String paramName : parse.getQueryParameterNames()) {
                StringBuilder sb2 = new StringBuilder();
                List<String> queryParams = parse.getQueryParameters(paramName);
                if (queryParams.size() > 1) {
                    throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                g0.o(queryParams, "queryParams");
                String queryParam = (String) r0.L2(queryParams);
                if (queryParam == null) {
                    this.isSingleQueryParamValueOnly = true;
                    queryParam = paramName;
                }
                Matcher matcher = FILL_IN_PATTERN.matcher(queryParam);
                ParamQuery paramQuery = new ParamQuery();
                int i11 = 0;
                while (matcher.find()) {
                    String group = matcher.group(1);
                    g0.n(group, "null cannot be cast to non-null type kotlin.String");
                    paramQuery.addArgumentName(group);
                    g0.o(queryParam, "queryParam");
                    String substring = queryParam.substring(i11, matcher.start());
                    g0.o(substring, "substring(...)");
                    sb2.append(Pattern.quote(substring));
                    sb2.append("(.+?)?");
                    i11 = matcher.end();
                }
                if (i11 < queryParam.length()) {
                    g0.o(queryParam, "queryParam");
                    String substring2 = queryParam.substring(i11);
                    g0.o(substring2, "substring(...)");
                    sb2.append(Pattern.quote(substring2));
                }
                String sb3 = sb2.toString();
                g0.o(sb3, "argRegex.toString()");
                paramQuery.setParamRegex(f0.z2(sb3, WILDCARD_REGEX, WILDCARD_REGEX_ESCAPED, false, 4, null));
                g0.o(paramName, "paramName");
                linkedHashMap.put(paramName, paramQuery);
            }
        }
        return linkedHashMap;
    }

    public final int calculateMatchingPathSegments$navigation_common_release(@l Uri uri) {
        if (uri == null || this.uriPattern == null) {
            return 0;
        }
        List<String> requestedPathSegments = uri.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.uriPattern).getPathSegments();
        g0.o(requestedPathSegments, "requestedPathSegments");
        g0.o(uriPathSegments, "uriPathSegments");
        return r0.n3(requestedPathSegments, uriPathSegments).size();
    }

    public boolean equals(@l Object obj) {
        if (obj != null && (obj instanceof NavDeepLink)) {
            NavDeepLink navDeepLink = (NavDeepLink) obj;
            if (g0.g(this.uriPattern, navDeepLink.uriPattern) && g0.g(this.action, navDeepLink.action) && g0.g(this.mimeType, navDeepLink.mimeType)) {
                return true;
            }
        }
        return false;
    }

    @l
    public final String getAction() {
        return this.action;
    }

    @k
    public final List<String> getArgumentsNames$navigation_common_release() {
        List<String> list = this.pathArgs;
        Collection<ParamQuery> values = getQueryArgsMap().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList, ((ParamQuery) it.next()).getArguments());
        }
        return r0.I4(r0.I4(list, arrayList), getFragArgs());
    }

    @l
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle getMatchingArguments(@k Uri deepLink, @k Map<String, NavArgument> arguments) {
        g0.p(deepLink, "deepLink");
        g0.p(arguments, "arguments");
        Pattern pathPattern = getPathPattern();
        Matcher matcher = pathPattern != null ? pathPattern.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        final Bundle bundle = new Bundle();
        if (!getMatchingPathArguments(matcher, bundle, arguments)) {
            return null;
        }
        if (isParameterizedQuery() && !getMatchingQueryArguments(deepLink, bundle, arguments)) {
            return null;
        }
        getMatchingUriFragment(deepLink.getFragment(), bundle, arguments);
        if (NavArgumentKt.missingRequiredArguments(arguments, new x00.l<String, Boolean>() { // from class: androidx.navigation.NavDeepLink$getMatchingArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Boolean invoke(String argName) {
                g0.p(argName, "argName");
                return Boolean.valueOf(!bundle.containsKey(argName));
            }
        }).isEmpty()) {
            return bundle;
        }
        return null;
    }

    @k
    public final Bundle getMatchingPathAndQueryArgs$navigation_common_release(@l Uri uri, @k Map<String, NavArgument> arguments) {
        g0.p(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri != null) {
            Pattern pathPattern = getPathPattern();
            Matcher matcher = pathPattern != null ? pathPattern.matcher(uri.toString()) : null;
            if (matcher != null && matcher.matches()) {
                getMatchingPathArguments(matcher, bundle, arguments);
                if (isParameterizedQuery()) {
                    getMatchingQueryArguments(uri, bundle, arguments);
                }
            }
        }
        return bundle;
    }

    @l
    public final String getMimeType() {
        return this.mimeType;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int getMimeTypeMatchRating(@k String mimeType) {
        g0.p(mimeType, "mimeType");
        if (this.mimeType == null) {
            return -1;
        }
        Pattern mimeTypePattern = getMimeTypePattern();
        g0.m(mimeTypePattern);
        if (mimeTypePattern.matcher(mimeType).matches()) {
            return new MimeType(this.mimeType).compareTo(new MimeType(mimeType));
        }
        return -1;
    }

    @l
    public final String getUriPattern() {
        return this.uriPattern;
    }

    public int hashCode() {
        String str = this.uriPattern;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final boolean matches$navigation_common_release(@k Uri uri) {
        g0.p(uri, "uri");
        return matches$navigation_common_release(new NavDeepLinkRequest(uri, null, null));
    }

    public final void setExactDeepLink$navigation_common_release(boolean z11) {
        this.isExactDeepLink = z11;
    }

    public final boolean matches$navigation_common_release(@k NavDeepLinkRequest deepLinkRequest) {
        g0.p(deepLinkRequest, "deepLinkRequest");
        return matchUri(deepLinkRequest.getUri()) && matchAction(deepLinkRequest.getAction()) && matchMimeType(deepLinkRequest.getMimeType());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(@k String uri) {
        this(uri, null, null);
        g0.p(uri, "uri");
    }
}
