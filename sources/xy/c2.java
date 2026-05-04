package xy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n1863#2,2:417\n1246#2,4:419\n1368#2:423\n1454#2,2:424\n1557#2:426\n1628#2,3:427\n1456#2,3:430\n1863#2:433\n865#2,2:434\n1864#2:436\n1863#2,2:437\n1863#2,2:439\n865#2,2:441\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesKt\n*L\n324#1:417,2\n332#1:419,4\n337#1:423\n337#1:424,2\n338#1:426\n338#1:427,3\n337#1:430,3\n357#1:433\n358#1:434,2\n357#1:436\n388#1:437,2\n345#1:439,2\n377#1:441,2\n*E\n"})
/* loaded from: classes8.dex */
public final class c2 {
    public static /* synthetic */ u1 A(Pair[] pairArr, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return w(pairArr, z11);
    }

    @m80.k
    public static final v1 e(@m80.k v1 v1Var, @m80.k v1 builder) {
        kotlin.jvm.internal.g0.p(v1Var, "<this>");
        kotlin.jvm.internal.g0.p(builder, "builder");
        Iterator<T> it = builder.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            v1Var.f((String) entry.getKey(), (List) entry.getValue());
        }
        return v1Var;
    }

    public static final void f(@m80.k final v1 v1Var, @m80.k u1 source, final boolean z11, @m80.k final x00.p<? super String, ? super String, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(v1Var, "<this>");
        kotlin.jvm.internal.g0.p(source, "source");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        source.d(new x00.p() { // from class: xy.b2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 h11;
                h11 = c2.h(z11, v1Var, predicate, (String) obj, (List) obj2);
                return h11;
            }
        });
    }

    public static /* synthetic */ void g(v1 v1Var, u1 u1Var, boolean z11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        f(v1Var, u1Var, z11, pVar);
    }

    public static final g2 h(boolean z11, v1 v1Var, x00.p pVar, String name, List value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        ArrayList arrayList = new ArrayList(value.size());
        for (Object obj : value) {
            if (((Boolean) pVar.invoke(name, (String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        if (z11 || !arrayList.isEmpty()) {
            v1Var.f(name, arrayList);
        }
        return g2.f100423a;
    }

    @m80.k
    public static final v1 i(@m80.k v1 v1Var, @m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(v1Var, "<this>");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        if (!v1Var.contains(name)) {
            v1Var.k(name, value);
        }
        return v1Var;
    }

    @m80.k
    public static final v1 j(@m80.k v1 v1Var, @m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(v1Var, "<this>");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        if (!v1Var.c(name, value)) {
            v1Var.k(name, value);
        }
        return v1Var;
    }

    public static final boolean k(Set<? extends Map.Entry<String, ? extends List<String>>> set, Set<? extends Map.Entry<String, ? extends List<String>>> set2) {
        return kotlin.jvm.internal.g0.g(set, set2);
    }

    public static final int l(Set<? extends Map.Entry<String, ? extends List<String>>> set, int i11) {
        return (i11 * 31) + set.hashCode();
    }

    @m80.k
    public static final u1 m(@m80.k u1 u1Var, boolean z11, @m80.k x00.p<? super String, ? super String, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(u1Var, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        Set<Map.Entry<String, List<String>>> entries = u1Var.entries();
        Map a11 = u1Var.b() ? x.a() : new LinkedHashMap(entries.size());
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(((List) entry.getValue()).size());
            for (Object obj : iterable) {
                if (predicate.invoke(entry.getKey(), (String) obj).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            if (z11 || !arrayList.isEmpty()) {
                a11.put(entry.getKey(), arrayList);
            }
        }
        return new z1(u1Var.b(), a11);
    }

    public static /* synthetic */ u1 n(u1 u1Var, boolean z11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return m(u1Var, z11, pVar);
    }

    @m80.k
    public static final List<Pair<String, String>> o(@m80.k u1 u1Var) {
        kotlin.jvm.internal.g0.p(u1Var, "<this>");
        Set<Map.Entry<String, List<String>>> entries = u1Var.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(yz.h1.a(entry.getKey(), (String) it2.next()));
            }
            a00.m0.s0(arrayList, arrayList2);
        }
        return arrayList;
    }

    public static final void p(@m80.k u1 u1Var, @m80.k final x00.p<? super String, ? super String, g2> block) {
        kotlin.jvm.internal.g0.p(u1Var, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        u1Var.d(new x00.p() { // from class: xy.a2
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 q11;
                q11 = c2.q(x00.p.this, (String) obj, (List) obj2);
                return q11;
            }
        });
    }

    public static final g2 q(x00.p pVar, String name, List items) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(items, "items");
        Iterator it = items.iterator();
        while (it.hasNext()) {
            pVar.invoke(name, (String) it.next());
        }
        return g2.f100423a;
    }

    @m80.k
    public static final Map<String, List<String>> r(@m80.k u1 u1Var) {
        kotlin.jvm.internal.g0.p(u1Var, "<this>");
        Set<Map.Entry<String, List<String>>> entries = u1Var.entries();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put((String) entry.getKey(), a00.r0.a6((Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }

    @m80.k
    public static final u1 s() {
        return u1.f98657c.c();
    }

    @m80.k
    public static final u1 t(@m80.k String name, @m80.k String value, boolean z11) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        return new d2(z11, name, a00.g0.l(value));
    }

    @m80.k
    public static final u1 u(@m80.k String name, @m80.k List<String> values, boolean z11) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
        return new d2(z11, name, values);
    }

    @m80.k
    public static final u1 v(@m80.k Map<String, ? extends Iterable<String>> map, boolean z11) {
        kotlin.jvm.internal.g0.p(map, "map");
        int size = map.size();
        if (size == 1) {
            Map.Entry entry = (Map.Entry) a00.r0.k5(map.entrySet());
            return new d2(z11, (String) entry.getKey(), a00.r0.a6((Iterable) entry.getValue()));
        }
        Map a11 = z11 ? x.a() : new LinkedHashMap(size);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            a11.put(entry2.getKey(), a00.r0.a6((Iterable) entry2.getValue()));
        }
        return new z1(z11, a11);
    }

    @m80.k
    public static final u1 w(@m80.k Pair<String, ? extends List<String>>[] pairs, boolean z11) {
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        return new z1(z11, a00.l1.B0(a00.q.t(pairs)));
    }

    public static /* synthetic */ u1 x(String str, String str2, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return t(str, str2, z11);
    }

    public static /* synthetic */ u1 y(String str, List list, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return u(str, list, z11);
    }

    public static /* synthetic */ u1 z(Map map, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return v(map, z11);
    }
}
