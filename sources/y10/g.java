package y10;

import a00.k1;
import a00.l1;
import a00.r0;
import ix.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import n10.o;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,47:1\n1557#2:48\n1628#2,3:49\n1498#2:52\n1528#2,3:53\n1531#2,3:63\n1246#2,4:68\n1557#2:75\n1628#2,3:76\n381#3,7:56\n462#3:66\n412#3:67\n153#4,3:72\n*S KotlinDebug\n*F\n+ 1 BuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/BuiltinSpecialProperties\n*L\n28#1:48\n28#1:49,3\n29#1:52\n29#1:53,3\n29#1:63,3\n30#1:68,4\n39#1:75\n39#1:76,3\n29#1:56,7\n30#1:66\n30#1:67\n34#1:72,3\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final g f99079a = new g();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Map<n20.c, n20.f> f99080b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Map<n20.f, List<n20.f>> f99081c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Set<n20.c> f99082d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final Set<n20.c> f99083e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final Set<n20.f> f99084f;

    static {
        n20.c d11;
        n20.c d12;
        n20.c c11;
        n20.c c12;
        n20.c d13;
        n20.c c13;
        n20.c c14;
        n20.c c15;
        n20.d dVar = o.a.f74065s;
        d11 = h.d(dVar, "name");
        Pair a11 = h1.a(d11, n10.o.f74015m);
        d12 = h.d(dVar, "ordinal");
        Pair a12 = h1.a(d12, n20.f.f("ordinal"));
        c11 = h.c(o.a.X, g.b.f62794h);
        Pair a13 = h1.a(c11, n20.f.f(g.b.f62794h));
        n20.c cVar = o.a.f74032b0;
        c12 = h.c(cVar, g.b.f62794h);
        Pair a14 = h1.a(c12, n20.f.f(g.b.f62794h));
        d13 = h.d(o.a.f74041g, "length");
        Pair a15 = h1.a(d13, n20.f.f("length"));
        c13 = h.c(cVar, "keys");
        Pair a16 = h1.a(c13, n20.f.f("keySet"));
        c14 = h.c(cVar, "values");
        Pair a17 = h1.a(c14, n20.f.f("values"));
        c15 = h.c(cVar, "entries");
        Map<n20.c, n20.f> W = l1.W(a11, a12, a13, a14, a15, a16, a17, h1.a(c15, n20.f.f("entrySet")));
        f99080b = W;
        Set<Map.Entry<n20.c, n20.f>> entrySet = W.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(a00.i0.d0(entrySet, 10));
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((n20.c) entry.getKey()).g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            n20.f fVar = (n20.f) pair.getSecond();
            Object obj = linkedHashMap.get(fVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(fVar, obj);
            }
            ((List) obj).add((n20.f) pair.getFirst());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(k1.j(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), r0.e2((Iterable) entry2.getValue()));
        }
        f99081c = linkedHashMap2;
        Map<n20.c, n20.f> map = f99080b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<n20.c, n20.f> entry3 : map.entrySet()) {
            o10.a aVar = o10.a.f75522a;
            n20.d j11 = entry3.getKey().e().j();
            kotlin.jvm.internal.g0.o(j11, "toUnsafe(...)");
            n20.b n11 = aVar.n(j11);
            kotlin.jvm.internal.g0.m(n11);
            linkedHashSet.add(n11.a().c(entry3.getValue()));
        }
        f99082d = linkedHashSet;
        Set<n20.c> keySet = f99080b.keySet();
        f99083e = keySet;
        Set<n20.c> set = keySet;
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(set, 10));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((n20.c) it2.next()).g());
        }
        f99084f = r0.f6(arrayList2);
    }

    @m80.k
    public final Map<n20.c, n20.f> a() {
        return f99080b;
    }

    @m80.k
    public final List<n20.f> b(@m80.k n20.f name1) {
        kotlin.jvm.internal.g0.p(name1, "name1");
        List<n20.f> list = f99081c.get(name1);
        return list == null ? a00.h0.J() : list;
    }

    @m80.k
    public final Set<n20.c> c() {
        return f99083e;
    }

    @m80.k
    public final Set<n20.f> d() {
        return f99084f;
    }
}
