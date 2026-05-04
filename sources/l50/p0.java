package l50;

import h50.m;
import h50.n;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.internal.JsonException;
import l50.a0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nJsonNamesMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n808#2,11:156\n1761#2,3:170\n13472#3,2:167\n1#4:169\n*S KotlinDebug\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt\n*L\n35#1:156,11\n154#1:170,3\n35#1:167,2\n*E\n"})
/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a0.a<Map<String, Integer>> f70045a = new a0.a<>();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a0.a<String[]> f70046b = new a0.a<>();

    public static final Map<String, Integer> c(h50.f fVar, k50.a aVar) {
        String a11;
        String[] names;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean e11 = e(aVar, fVar);
        k50.e0 p11 = p(fVar, aVar);
        int h11 = fVar.h();
        for (int i11 = 0; i11 < h11; i11++) {
            List<Annotation> j11 = fVar.j(i11);
            ArrayList arrayList = new ArrayList();
            for (Object obj : j11) {
                if (obj instanceof k50.d0) {
                    arrayList.add(obj);
                }
            }
            k50.d0 d0Var = (k50.d0) a00.r0.p5(arrayList);
            if (d0Var != null && (names = d0Var.names()) != null) {
                for (String str : names) {
                    if (e11) {
                        str = str.toLowerCase(Locale.ROOT);
                        kotlin.jvm.internal.g0.o(str, "toLowerCase(...)");
                    }
                    d(linkedHashMap, fVar, str, i11);
                }
            }
            if (e11) {
                a11 = fVar.i(i11).toLowerCase(Locale.ROOT);
                kotlin.jvm.internal.g0.o(a11, "toLowerCase(...)");
            } else {
                a11 = p11 != null ? p11.a(fVar, i11, fVar.i(i11)) : null;
            }
            if (a11 != null) {
                d(linkedHashMap, fVar, a11, i11);
            }
        }
        return linkedHashMap.isEmpty() ? a00.l1.z() : linkedHashMap;
    }

    public static final void d(Map<String, Integer> map, h50.f fVar, String str, int i11) {
        String str2 = kotlin.jvm.internal.g0.g(fVar.getKind(), m.b.f58540a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i11));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + fVar.i(i11) + " is already one of the names for " + str2 + ' ' + fVar.i(((Number) a00.l1.K(map, str)).intValue()) + " in " + fVar);
    }

    public static final boolean e(k50.a aVar, h50.f fVar) {
        return aVar.i().k() && kotlin.jvm.internal.g0.g(fVar.getKind(), m.b.f58540a);
    }

    @m80.k
    public static final Map<String, Integer> f(@m80.k final k50.a aVar, @m80.k final h50.f descriptor) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return (Map) k50.n0.a(aVar).b(descriptor, f70045a, new x00.a() { // from class: l50.n0
            @Override // x00.a
            public final Object invoke() {
                Map g11;
                g11 = p0.g(h50.f.this, aVar);
                return g11;
            }
        });
    }

    public static final Map g(h50.f fVar, k50.a aVar) {
        return c(fVar, aVar);
    }

    @m80.k
    public static final a0.a<Map<String, Integer>> h() {
        return f70045a;
    }

    @m80.k
    public static final String i(@m80.k h50.f fVar, @m80.k k50.a json, int i11) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(json, "json");
        k50.e0 p11 = p(fVar, json);
        return p11 == null ? fVar.i(i11) : q(fVar, json, p11)[i11];
    }

    public static final int j(@m80.k h50.f fVar, @m80.k k50.a json, @m80.k String name) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(name, "name");
        if (e(json, fVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
            return m(fVar, json, lowerCase);
        }
        if (p(fVar, json) != null) {
            return m(fVar, json, name);
        }
        int d11 = fVar.d(name);
        return (d11 == -3 && json.i().u()) ? m(fVar, json, name) : d11;
    }

    public static final int k(@m80.k h50.f fVar, @m80.k k50.a json, @m80.k String name, @m80.k String suffix) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(suffix, "suffix");
        int j11 = j(fVar, json, name);
        if (j11 != -3) {
            return j11;
        }
        throw new SerializationException(fVar.k() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int l(h50.f fVar, k50.a aVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return k(fVar, aVar, str, str2);
    }

    public static final int m(h50.f fVar, k50.a aVar, String str) {
        Integer num = f(aVar, fVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @m80.k
    public static final a0.a<String[]> n() {
        return f70046b;
    }

    public static final boolean o(@m80.k h50.f fVar, @m80.k k50.a json) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(json, "json");
        if (json.i().o()) {
            return true;
        }
        List<Annotation> annotations = fVar.getAnnotations();
        if ((annotations instanceof Collection) && annotations.isEmpty()) {
            return false;
        }
        Iterator<T> it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof k50.y) {
                return true;
            }
        }
        return false;
    }

    @m80.l
    public static final k50.e0 p(@m80.k h50.f fVar, @m80.k k50.a json) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(json, "json");
        if (kotlin.jvm.internal.g0.g(fVar.getKind(), n.a.f58541a)) {
            return json.i().p();
        }
        return null;
    }

    @m80.k
    public static final String[] q(@m80.k final h50.f fVar, @m80.k k50.a json, @m80.k final k50.e0 strategy) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(json, "json");
        kotlin.jvm.internal.g0.p(strategy, "strategy");
        return (String[]) k50.n0.a(json).b(fVar, f70046b, new x00.a() { // from class: l50.o0
            @Override // x00.a
            public final Object invoke() {
                String[] r11;
                r11 = p0.r(h50.f.this, strategy);
                return r11;
            }
        });
    }

    public static final String[] r(h50.f fVar, k50.e0 e0Var) {
        int h11 = fVar.h();
        String[] strArr = new String[h11];
        for (int i11 = 0; i11 < h11; i11++) {
            strArr[i11] = e0Var.a(fVar, i11, fVar.i(i11));
        }
        return strArr;
    }

    public static final boolean s(@m80.k k50.a aVar, @m80.k h50.f descriptor, int i11, @m80.k x00.l<? super Boolean, Boolean> peekNull, @m80.k x00.a<String> peekString, @m80.k x00.a<g2> onEnumCoercing) {
        String invoke;
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(peekNull, "peekNull");
        kotlin.jvm.internal.g0.p(peekString, "peekString");
        kotlin.jvm.internal.g0.p(onEnumCoercing, "onEnumCoercing");
        boolean l11 = descriptor.l(i11);
        h50.f e11 = descriptor.e(i11);
        if (l11 && !e11.b() && peekNull.invoke(Boolean.TRUE).booleanValue()) {
            return true;
        }
        if (!kotlin.jvm.internal.g0.g(e11.getKind(), m.b.f58540a) || ((e11.b() && peekNull.invoke(Boolean.FALSE).booleanValue()) || (invoke = peekString.invoke()) == null)) {
            return false;
        }
        int j11 = j(e11, aVar, invoke);
        boolean z11 = !aVar.i().n() && e11.b();
        if (j11 == -3 && (l11 || z11)) {
            onEnumCoercing.invoke();
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean t(k50.a aVar, h50.f descriptor, int i11, x00.l peekNull, x00.a peekString, x00.a onEnumCoercing, int i12, Object obj) {
        String str;
        if ((i12 & 16) != 0) {
            onEnumCoercing = a.f70047a;
        }
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(peekNull, "peekNull");
        kotlin.jvm.internal.g0.p(peekString, "peekString");
        kotlin.jvm.internal.g0.p(onEnumCoercing, "onEnumCoercing");
        boolean l11 = descriptor.l(i11);
        h50.f e11 = descriptor.e(i11);
        if (l11 && !e11.b() && ((Boolean) peekNull.invoke(Boolean.TRUE)).booleanValue()) {
            return true;
        }
        if (!kotlin.jvm.internal.g0.g(e11.getKind(), m.b.f58540a) || ((e11.b() && ((Boolean) peekNull.invoke(Boolean.FALSE)).booleanValue()) || (str = (String) peekString.invoke()) == null)) {
            return false;
        }
        int j11 = j(e11, aVar, str);
        boolean z11 = !aVar.i().n() && e11.b();
        if (j11 == -3 && (l11 || z11)) {
            onEnumCoercing.invoke();
            return true;
        }
        return false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nJsonNamesMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamesMap.kt\nkotlinx/serialization/json/internal/JsonNamesMapKt$tryCoerceValue$1\n*L\n1#1,155:1\n*E\n"})
    public static final class a implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f70047a = new a();

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            a();
            return g2.f100423a;
        }

        public final void a() {
        }
    }
}
