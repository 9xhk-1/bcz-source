package y10;

import a00.l1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import n20.b;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFakePureImplementationsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FakePureImplementationsProvider.kt\norg/jetbrains/kotlin/load/java/FakePureImplementationsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,38:1\n1293#2,4:39\n11165#3:43\n11500#3,3:44\n126#4:47\n153#4,3:48\n*S KotlinDebug\n*F\n+ 1 FakePureImplementationsProvider.kt\norg/jetbrains/kotlin/load/java/FakePureImplementationsProvider\n*L\n18#1:39,4\n36#1:43\n36#1:44,3\n32#1:47\n32#1:48,3\n*E\n"})
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final o f99100a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Map<n20.b, n20.b> f99101b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Map<n20.c, n20.c> f99102c;

    static {
        o oVar = new o();
        f99100a = oVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f99101b = linkedHashMap;
        n20.i iVar = n20.i.f74318a;
        oVar.c(iVar.l(), oVar.a("java.util.ArrayList", "java.util.LinkedList"));
        oVar.c(iVar.n(), oVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        oVar.c(iVar.m(), oVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b.a aVar = n20.b.f74280d;
        oVar.c(aVar.c(new n20.c("java.util.function.Function")), oVar.a("java.util.function.UnaryOperator"));
        oVar.c(aVar.c(new n20.c("java.util.function.BiFunction")), oVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(h1.a(((n20.b) entry.getKey()).a(), ((n20.b) entry.getValue()).a()));
        }
        f99102c = l1.B0(arrayList);
    }

    public final List<n20.b> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(n20.b.f74280d.c(new n20.c(str)));
        }
        return arrayList;
    }

    @m80.l
    public final n20.c b(@m80.k n20.c classFqName) {
        kotlin.jvm.internal.g0.p(classFqName, "classFqName");
        return f99102c.get(classFqName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(n20.b bVar, List<n20.b> list) {
        Map<n20.b, n20.b> map = f99101b;
        for (Object obj : list) {
            map.put(obj, bVar);
        }
    }
}
