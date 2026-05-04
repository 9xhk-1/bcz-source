package a00;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,814:1\n413#1:824\n424#1:829\n521#1,6:834\n546#1,6:840\n1#2:815\n1252#3,4:816\n1252#3,4:820\n1252#3,4:825\n1252#3,4:830\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n463#1:824\n478#1:829\n536#1:834,6\n561#1:840,6\n413#1:816,4\n424#1:820,4\n463#1:825,4\n478#1:830,4\n*E\n"})
/* loaded from: classes8.dex */
public class l1 extends k1 {
    @m80.k
    public static final <K, V> Map<K, V> A(@m80.k Map<? extends K, ? extends V> map, @m80.k x00.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @o00.f
    public static final <K, V> void A0(Map<K, V> map, K k11, V v11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        map.put(k11, v11);
    }

    @m80.k
    public static final <K, V> Map<K, V> B(@m80.k Map<? extends K, ? extends V> map, @m80.k x00.l<? super K, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getKey()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @m80.k
    public static <K, V> Map<K, V> B0(@m80.k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k0(C0(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return z();
        }
        if (size != 1) {
            return C0(iterable, new LinkedHashMap(k1.j(collection.size())));
        }
        return k1.k((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    @m80.k
    public static final <K, V> Map<K, V> C(@m80.k Map<? extends K, ? extends V> map, @m80.k x00.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M C0(@m80.k Iterable<? extends Pair<? extends K, ? extends V>> iterable, @m80.k M destination) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        w0(destination, iterable);
        return destination;
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M D(@m80.k Map<? extends K, ? extends V> map, @m80.k M destination, @m80.k x00.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (!predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @yz.y0(version = "1.1")
    @m80.k
    public static <K, V> Map<K, V> D0(@m80.k Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? J0(map) : k1.o(map) : z();
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M E(@m80.k Map<? extends K, ? extends V> map, @m80.k M destination, @m80.k x00.l<? super Map.Entry<? extends K, ? extends V>, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry).booleanValue()) {
                destination.put(entry.getKey(), entry.getValue());
            }
        }
        return destination;
    }

    @yz.y0(version = "1.1")
    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M E0(@m80.k Map<? extends K, ? extends V> map, @m80.k M destination) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        destination.putAll(map);
        return destination;
    }

    @m80.k
    public static final <K, V> Map<K, V> F(@m80.k Map<? extends K, ? extends V> map, @m80.k x00.l<? super V, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            if (predicate.invoke(entry.getValue()).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @m80.k
    public static <K, V> Map<K, V> F0(@m80.k q30.m<? extends Pair<? extends K, ? extends V>> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return k0(G0(mVar, new LinkedHashMap()));
    }

    @o00.f
    public static final <K, V> V G(Map<? extends K, ? extends V> map, K k11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return map.get(k11);
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M G0(@m80.k q30.m<? extends Pair<? extends K, ? extends V>> mVar, @m80.k M destination) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        x0(destination, mVar);
        return destination;
    }

    @o00.f
    public static final <K, V> V H(Map<K, ? extends V> map, K k11, x00.a<? extends V> defaultValue) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        V v11 = map.get(k11);
        return v11 == null ? defaultValue.invoke() : v11;
    }

    @m80.k
    public static <K, V> Map<K, V> H0(@m80.k Pair<? extends K, ? extends V>[] pairArr) {
        kotlin.jvm.internal.g0.p(pairArr, "<this>");
        int length = pairArr.length;
        return length != 0 ? length != 1 ? I0(pairArr, new LinkedHashMap(k1.j(pairArr.length))) : k1.k(pairArr[0]) : z();
    }

    public static final <K, V> V I(@m80.k Map<K, ? extends V> map, K k11, @m80.k x00.a<? extends V> defaultValue) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        V v11 = map.get(k11);
        return (v11 != null || map.containsKey(k11)) ? v11 : defaultValue.invoke();
    }

    @m80.k
    public static final <K, V, M extends Map<? super K, ? super V>> M I0(@m80.k Pair<? extends K, ? extends V>[] pairArr, @m80.k M destination) {
        kotlin.jvm.internal.g0.p(pairArr, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        y0(destination, pairArr);
        return destination;
    }

    public static final <K, V> V J(@m80.k Map<K, V> map, K k11, @m80.k x00.a<? extends V> defaultValue) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        V v11 = map.get(k11);
        if (v11 != null) {
            return v11;
        }
        V invoke = defaultValue.invoke();
        map.put(k11, invoke);
        return invoke;
    }

    @yz.y0(version = "1.1")
    @m80.k
    public static <K, V> Map<K, V> J0(@m80.k Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return new LinkedHashMap(map);
    }

    @yz.y0(version = "1.1")
    public static <K, V> V K(@m80.k Map<K, ? extends V> map, K k11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return (V) j1.a(map, k11);
    }

    @o00.f
    public static final <K, V> Pair<K, V> K0(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.g0.p(entry, "<this>");
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <K, V> HashMap<K, V> L() {
        return new HashMap<>();
    }

    @m80.k
    public static <K, V> HashMap<K, V> M(@m80.k Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(k1.j(pairs.length));
        y0(hashMap, pairs);
        return hashMap;
    }

    /* JADX WARN: Incorrect types in method signature: <M::Ljava/util/Map<**>;:TR;R:Ljava/lang/Object;>(TM;Lx00/a<+TR;>;)TR; */
    @yz.y0(version = "1.3")
    @o00.f
    public static final Object N(Map map, x00.a defaultValue) {
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return map.isEmpty() ? defaultValue.invoke() : map;
    }

    @o00.f
    public static final <K, V> boolean O(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return !map.isEmpty();
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final <K, V> boolean P(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @o00.f
    public static final <K, V> Iterator<Map.Entry<K, V>> Q(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <K, V> LinkedHashMap<K, V> R() {
        return new LinkedHashMap<>();
    }

    @m80.k
    public static final <K, V> LinkedHashMap<K, V> S(@m80.k Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        return (LinkedHashMap) I0(pairs, new LinkedHashMap(k1.j(pairs.length)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, R> Map<R, V> T(@m80.k Map<? extends K, ? extends V> map, @m80.k x00.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(transform.invoke(entry), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, R, M extends Map<? super R, ? super V>> M U(@m80.k Map<? extends K, ? extends V> map, @m80.k M destination, @m80.k x00.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(transform.invoke(entry), entry.getValue());
        }
        return destination;
    }

    @o00.f
    public static final <K, V> Map<K, V> V() {
        return z();
    }

    @m80.k
    public static <K, V> Map<K, V> W(@m80.k Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        return pairs.length > 0 ? I0(pairs, new LinkedHashMap(k1.j(pairs.length))) : z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, R> Map<K, R> X(@m80.k Map<? extends K, ? extends V> map, @m80.k x00.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            linkedHashMap.put(entry.getKey(), transform.invoke(entry));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V, R, M extends Map<? super K, ? super R>> M Y(@m80.k Map<? extends K, ? extends V> map, @m80.k M destination, @m80.k x00.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> transform) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(transform, "transform");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Object) it.next();
            destination.put(entry.getKey(), transform.invoke(entry));
        }
        return destination;
    }

    @yz.y0(version = "1.1")
    @m80.k
    public static final <K, V> Map<K, V> Z(@m80.k Map<? extends K, ? extends V> map, @m80.k Iterable<? extends K> keys) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(keys, "keys");
        Map J0 = J0(map);
        m0.J0(J0.keySet(), keys);
        return k0(J0);
    }

    @yz.y0(version = "1.1")
    @m80.k
    public static final <K, V> Map<K, V> a0(@m80.k Map<? extends K, ? extends V> map, K k11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        Map J0 = J0(map);
        J0.remove(k11);
        return k0(J0);
    }

    @yz.y0(version = "1.1")
    @m80.k
    public static final <K, V> Map<K, V> b0(@m80.k Map<? extends K, ? extends V> map, @m80.k q30.m<? extends K> keys) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(keys, "keys");
        Map J0 = J0(map);
        m0.L0(J0.keySet(), keys);
        return k0(J0);
    }

    @yz.y0(version = "1.1")
    @m80.k
    public static final <K, V> Map<K, V> c0(@m80.k Map<? extends K, ? extends V> map, @m80.k K[] keys) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(keys, "keys");
        Map J0 = J0(map);
        m0.M0(J0.keySet(), keys);
        return k0(J0);
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <K, V> void d0(Map<K, V> map, Iterable<? extends K> keys) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(keys, "keys");
        m0.J0(map.keySet(), keys);
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <K, V> void e0(Map<K, V> map, K k11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        map.remove(k11);
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <K, V> void f0(Map<K, V> map, q30.m<? extends K> keys) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(keys, "keys");
        m0.L0(map.keySet(), keys);
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <K, V> void g0(Map<K, V> map, K[] keys) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(keys, "keys");
        m0.M0(map.keySet(), keys);
    }

    @w00.j(name = "mutableIterator")
    @o00.f
    public static final <K, V> Iterator<Map.Entry<K, V>> h0(Map<K, V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return map.entrySet().iterator();
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <K, V> Map<K, V> i0() {
        return new LinkedHashMap();
    }

    @m80.k
    public static <K, V> Map<K, V> j0(@m80.k Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(pairs.length));
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <K, V> Map<K, V> k0(@m80.k Map<K, ? extends V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : k1.o(map) : z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00.f
    public static final <K, V> Map<K, V> l0(Map<K, ? extends V> map) {
        return map == 0 ? z() : map;
    }

    @m80.k
    public static final <K, V> Map<K, V> m0(@m80.k Map<? extends K, ? extends V> map, @m80.k Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        if (map.isEmpty()) {
            return B0(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        w0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @m80.k
    public static <K, V> Map<K, V> n0(@m80.k Map<? extends K, ? extends V> map, @m80.k Map<? extends K, ? extends V> map2) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @m80.k
    public static final <K, V> Map<K, V> o0(@m80.k Map<? extends K, ? extends V> map, @m80.k Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(pair, "pair");
        if (map.isEmpty()) {
            return k1.k(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.getFirst(), pair.getSecond());
        return linkedHashMap;
    }

    @m80.k
    public static final <K, V> Map<K, V> p0(@m80.k Map<? extends K, ? extends V> map, @m80.k q30.m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        x0(linkedHashMap, pairs);
        return k0(linkedHashMap);
    }

    @m80.k
    public static final <K, V> Map<K, V> q0(@m80.k Map<? extends K, ? extends V> map, @m80.k Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        if (map.isEmpty()) {
            return H0(pairs);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        y0(linkedHashMap, pairs);
        return linkedHashMap;
    }

    @o00.f
    public static final <K, V> void r0(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        w0(map, pairs);
    }

    @yz.y0(version = "1.6")
    @o00.f
    public static final <K, V> Map<K, V> s(int i11, @yz.b x00.l<? super Map<K, V>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        Map h11 = k1.h(i11);
        builderAction.invoke(h11);
        return k1.d(h11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00.f
    public static final <K, V> void s0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(map2, "map");
        map.putAll(map2);
    }

    @yz.y0(version = "1.6")
    @o00.f
    public static final <K, V> Map<K, V> t(@yz.b x00.l<? super Map<K, V>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        Map g11 = k1.g();
        builderAction.invoke(g11);
        return k1.d(g11);
    }

    @o00.f
    public static final <K, V> void t0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(pair, "pair");
        map.put(pair.getFirst(), pair.getSecond());
    }

    @o00.f
    public static final <K, V> K u(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.g0.p(entry, "<this>");
        return entry.getKey();
    }

    @o00.f
    public static final <K, V> void u0(Map<? super K, ? super V> map, q30.m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        x0(map, pairs);
    }

    @o00.f
    public static final <K, V> V v(Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.g0.p(entry, "<this>");
        return entry.getValue();
    }

    @o00.f
    public static final <K, V> void v0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        y0(map, pairs);
    }

    @o00.f
    public static final <K, V> boolean w(Map<? extends K, ? extends V> map, K k11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return map.containsKey(k11);
    }

    public static <K, V> void w0(@m80.k Map<? super K, ? super V> map, @m80.k Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    @o00.f
    public static final <K> boolean x(Map<? extends K, ?> map, K k11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return map.containsKey(k11);
    }

    public static <K, V> void x0(@m80.k Map<? super K, ? super V> map, @m80.k q30.m<? extends Pair<? extends K, ? extends V>> pairs) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    @o00.f
    public static final <K, V> boolean y(Map<K, ? extends V> map, V v11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return map.containsValue(v11);
    }

    public static <K, V> void y0(@m80.k Map<? super K, ? super V> map, @m80.k Pair<? extends K, ? extends V>[] pairs) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            map.put(pair.component1(), pair.component2());
        }
    }

    @m80.k
    public static <K, V> Map<K, V> z() {
        u0 u0Var = u0.f1154a;
        kotlin.jvm.internal.g0.n(u0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return u0Var;
    }

    @o00.f
    public static final <K, V> V z0(Map<? extends K, V> map, K k11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return (V) kotlin.jvm.internal.x0.k(map).remove(k11);
    }
}
