package androidx.navigation.serialization;

import a00.l1;
import androidx.annotation.RestrictTo;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import f50.i;
import f50.k0;
import f50.o;
import h10.d;
import h10.r;
import h50.f;
import h50.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import l50.b;
import m80.k;
import w00.j;
import x00.a;
import x00.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRouteSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSerializer.kt\nandroidx/navigation/serialization/RouteSerializerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
/* loaded from: classes3.dex */
public final class RouteSerializerKt {
    private static final <T> void assertNotAbstractClass(i<T> iVar, a<g2> aVar) {
        if (iVar instanceof o) {
            aVar.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavType<Object> computeNavType(f fVar, Map<r, ? extends NavType<?>> map) {
        Object obj;
        Iterator<T> it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (NavTypeConverterKt.matchKType(fVar, (r) obj)) {
                break;
            }
        }
        r rVar = (r) obj;
        NavType<?> navType = rVar != null ? map.get(rVar) : null;
        if (navType == null) {
            navType = null;
        }
        if (navType == null) {
            navType = NavTypeConverterKt.getNavType(fVar);
        }
        if (g0.g(navType, UNKNOWN.INSTANCE)) {
            return null;
        }
        g0.n(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        return navType;
    }

    @j(name = "forEachIndexedKType")
    private static final <T> void forEachIndexedKType(i<T> iVar, Map<r, ? extends NavType<?>> map, q<? super Integer, ? super String, ? super NavType<Object>, g2> qVar) {
        int h11 = iVar.a().h();
        for (int i11 = 0; i11 < h11; i11++) {
            String i12 = iVar.a().i(i11);
            NavType<Object> computeNavType = computeNavType(iVar.a().e(i11), map);
            if (computeNavType == null) {
                throw new IllegalArgumentException(unknownNavTypeErrorMessage(i12, iVar.a().e(i11).k(), iVar.a().k(), map.toString()));
            }
            qVar.invoke(Integer.valueOf(i11), i12, computeNavType);
        }
    }

    public static /* synthetic */ void forEachIndexedKType$default(i iVar, Map map, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = l1.z();
        }
        forEachIndexedKType(iVar, map, qVar);
    }

    @j(name = "forEachIndexedName")
    private static final <T> void forEachIndexedName(i<T> iVar, Map<String, ? extends NavType<Object>> map, q<? super Integer, ? super String, ? super NavType<Object>, g2> qVar) {
        int h11 = iVar.a().h();
        for (int i11 = 0; i11 < h11; i11++) {
            String i12 = iVar.a().i(i11);
            NavType<Object> navType = map.get(i12);
            if (navType == null) {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + i12 + b.f69930l).toString());
            }
            qVar.invoke(Integer.valueOf(i11), i12, navType);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T> int generateHashCode(@k i<T> iVar) {
        g0.p(iVar, "<this>");
        int hashCode = iVar.a().k().hashCode();
        int h11 = iVar.a().h();
        for (int i11 = 0; i11 < h11; i11++) {
            hashCode = (hashCode * 31) + iVar.a().i(i11).hashCode();
        }
        return hashCode;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final <T> List<NamedNavArgument> generateNavArguments(@k final i<T> iVar, @k final Map<r, ? extends NavType<?>> typeMap) {
        g0.p(iVar, "<this>");
        g0.p(typeMap, "typeMap");
        assertNotAbstractClass(iVar, new a<g2>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateNavArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + iVar + ". Arguments can only be generated from concrete classes or objects.");
            }
        });
        int h11 = iVar.a().h();
        ArrayList arrayList = new ArrayList(h11);
        for (final int i11 = 0; i11 < h11; i11++) {
            final String i12 = iVar.a().i(i11);
            arrayList.add(NamedNavArgumentKt.navArgument(i12, new l<NavArgumentBuilder, g2>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateNavArguments$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(NavArgumentBuilder navArgumentBuilder) {
                    invoke2(navArgumentBuilder);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(NavArgumentBuilder navArgument) {
                    NavType<?> computeNavType;
                    String unknownNavTypeErrorMessage;
                    g0.p(navArgument, "$this$navArgument");
                    f e11 = iVar.a().e(i11);
                    boolean b11 = e11.b();
                    computeNavType = RouteSerializerKt.computeNavType(e11, typeMap);
                    if (computeNavType == null) {
                        unknownNavTypeErrorMessage = RouteSerializerKt.unknownNavTypeErrorMessage(i12, e11.k(), iVar.a().k(), typeMap.toString());
                        throw new IllegalArgumentException(unknownNavTypeErrorMessage);
                    }
                    navArgument.setType(computeNavType);
                    navArgument.setNullable(b11);
                    if (iVar.a().l(i11)) {
                        navArgument.setUnknownDefaultValuePresent$navigation_common_release(true);
                    }
                }
            }));
        }
        return arrayList;
    }

    public static /* synthetic */ List generateNavArguments$default(i iVar, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = l1.z();
        }
        return generateNavArguments(iVar, map);
    }

    @k
    public static final <T> String generateRoutePattern(@k final i<T> iVar, @k Map<r, ? extends NavType<?>> typeMap, @m80.l String str) {
        g0.p(iVar, "<this>");
        g0.p(typeMap, "typeMap");
        assertNotAbstractClass(iVar, new a<g2>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRoutePattern$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot generate route pattern from polymorphic class ");
                d<?> a11 = h50.b.a(iVar.a());
                sb2.append(a11 != null ? a11.C() : null);
                sb2.append(". Routes can only be generated from concrete classes or objects.");
                throw new IllegalArgumentException(sb2.toString());
            }
        });
        final RouteBuilder routeBuilder = str != null ? new RouteBuilder(str, iVar) : new RouteBuilder(iVar);
        forEachIndexedKType(iVar, typeMap, new q<Integer, String, NavType<Object>, g2>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRoutePattern$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Integer num, String str2, NavType<Object> navType) {
                invoke(num.intValue(), str2, navType);
                return g2.f100423a;
            }

            public final void invoke(int i11, String argName, NavType<Object> navType) {
                g0.p(argName, "argName");
                g0.p(navType, "navType");
                routeBuilder.appendPattern(i11, argName, navType);
            }
        });
        return routeBuilder.build();
    }

    public static /* synthetic */ String generateRoutePattern$default(i iVar, Map map, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = l1.z();
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return generateRoutePattern(iVar, map, str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @k
    public static final <T> String generateRouteWithArgs(@k T route, @k Map<String, ? extends NavType<Object>> typeMap) {
        g0.p(route, "route");
        g0.p(typeMap, "typeMap");
        i h11 = k0.h(o0.d(route.getClass()));
        final Map<String, List<String>> encodeToArgMap = new RouteEncoder(h11, typeMap).encodeToArgMap(route);
        final RouteBuilder routeBuilder = new RouteBuilder(h11);
        forEachIndexedName(h11, typeMap, new q<Integer, String, NavType<Object>, g2>() { // from class: androidx.navigation.serialization.RouteSerializerKt$generateRouteWithArgs$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(Integer num, String str, NavType<Object> navType) {
                invoke(num.intValue(), str, navType);
                return g2.f100423a;
            }

            public final void invoke(int i11, String argName, NavType<Object> navType) {
                g0.p(argName, "argName");
                g0.p(navType, "navType");
                List<String> list = encodeToArgMap.get(argName);
                g0.m(list);
                routeBuilder.appendArg(i11, argName, navType, list);
            }
        });
        return routeBuilder.build();
    }

    public static final boolean isValueClass(@k f fVar) {
        g0.p(fVar, "<this>");
        return g0.g(fVar.getKind(), n.a.f58541a) && fVar.isInline() && fVar.h() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unknownNavTypeErrorMessage(String str, String str2, String str3, String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }
}
