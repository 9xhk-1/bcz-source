package ix;

import ix.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nFileContentType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileContentType.kt\nio/ktor/http/FileContentTypeKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n992#2:105\n1021#2,3:106\n1024#2,3:116\n381#3,7:109\n462#3:119\n412#3:120\n1246#4,2:121\n1557#4:123\n1628#4,3:124\n1249#4:127\n1#5:128\n*S KotlinDebug\n*F\n+ 1 FileContentType.kt\nio/ktor/http/FileContentTypeKt\n*L\n96#1:105\n96#1:106,3\n96#1:116,3\n96#1:109,7\n97#1:119\n97#1:120\n97#1:121,2\n97#1:123\n97#1:124,3\n97#1:127\n*E\n"})
/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f62921a = yz.e0.c(new x00.a() { // from class: ix.j0
        @Override // x00.a
        public final Object invoke() {
            Map d11;
            d11 = l0.d();
            return d11;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f62922b = yz.e0.c(new x00.a() { // from class: ix.k0
        @Override // x00.a
        public final Object invoke() {
            Map g11;
            g11 = l0.g();
            return g11;
        }
    });

    public static final Map d() {
        Map a11 = xy.x.a();
        a11.putAll(n(a00.r0.E1(o1.c())));
        return a11;
    }

    @m80.k
    public static final k e(@m80.k k.c cVar, @m80.k String extension) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(extension, "extension");
        return p(j(k.f62843f, extension));
    }

    @m80.k
    public static final k f(@m80.k k.c cVar, @m80.k String path) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        return p(k(k.f62843f, path));
    }

    public static final Map g() {
        return n(q30.k0.N1(a00.r0.E1(o1.c()), new x00.l() { // from class: ix.i0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Pair h11;
                h11 = l0.h((Pair) obj);
                return h11;
            }
        }));
    }

    public static final Pair h(Pair pair) {
        kotlin.jvm.internal.g0.p(pair, "<destruct>");
        return yz.h1.a((k) pair.component2(), (String) pair.component1());
    }

    @m80.k
    public static final List<String> i(@m80.k k kVar) {
        kotlin.jvm.internal.g0.p(kVar, "<this>");
        List<String> list = m().get(kVar);
        if (list != null) {
            return list;
        }
        List<String> list2 = m().get(kVar.k());
        return list2 == null ? a00.h0.J() : list2;
    }

    @m80.k
    public static final List<k> j(@m80.k k.c cVar, @m80.k String ext) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(ext, "ext");
        for (String e11 = xy.e2.e(u30.k0.x4(ext, ".")); e11.length() > 0; e11 = u30.k0.K5(e11, ".", "")) {
            List<k> list = l().get(e11);
            if (list != null) {
                return list;
            }
        }
        return a00.h0.J();
    }

    @m80.k
    public static final List<k> k(@m80.k k.c cVar, @m80.k String path) {
        kotlin.jvm.internal.g0.p(cVar, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        int I3 = u30.k0.I3(path, '.', u30.k0.c4(path, xy.v.b("/\\"), 0, false, 6, null) + 1, false, 4, null);
        if (I3 == -1) {
            return a00.h0.J();
        }
        String substring = path.substring(I3 + 1);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return j(cVar, substring);
    }

    public static final Map<String, List<k>> l() {
        return (Map) f62921a.getValue();
    }

    public static final Map<k, List<String>> m() {
        return (Map) f62922b.getValue();
    }

    @m80.k
    public static final <A, B> Map<A, List<B>> n(@m80.k q30.m<? extends Pair<? extends A, ? extends B>> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair<? extends A, ? extends B> pair : mVar) {
            A first = pair.getFirst();
            Object obj = linkedHashMap.get(first);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(first, obj);
            }
            ((List) obj).add(pair);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a00.k1.j(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(a00.i0.d0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((Pair) it.next()).getSecond());
            }
            linkedHashMap2.put(key, arrayList);
        }
        return linkedHashMap2;
    }

    public static final boolean o(k kVar) {
        k.a aVar = k.a.f62847a;
        if (kVar.h(aVar.a())) {
            return kVar.h(aVar.b()) || kVar.h(aVar.h()) || kVar.h(aVar.p()) || kVar.h(aVar.t()) || kVar.h(aVar.u());
        }
        return false;
    }

    @m80.k
    public static final k p(@m80.k List<k> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        k kVar = (k) a00.r0.L2(list);
        if (kVar == null) {
            kVar = k.a.f62847a.j();
        }
        return kVar.h(k.h.f62902a.a()) ? r(kVar) : kVar.h(k.e.f62883a.e()) ? r(kVar) : o(kVar) ? r(kVar) : kVar;
    }

    @m80.k
    public static final k q(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<this>");
        try {
            return k.f62843f.b(str);
        } catch (Throwable th2) {
            throw new IllegalArgumentException("Failed to parse " + str, th2);
        }
    }

    public static final k r(k kVar) {
        return m.a(kVar) != null ? kVar : m.b(kVar, u30.d.f91599b);
    }
}
