package a00;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMapsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/* loaded from: classes8.dex */
public class k1 extends j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1109a = 1073741824;

    @yz.y0(version = "1.3")
    @yz.v0
    @m80.k
    public static <K, V> Map<K, V> d(@m80.k Map<K, V> builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        return ((MapBuilder) builder).build();
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @o00.f
    public static final <K, V> Map<K, V> e(int i11, x00.l<? super Map<K, V>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        Map h11 = h(i11);
        builderAction.invoke(h11);
        return d(h11);
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @o00.f
    public static final <K, V> Map<K, V> f(x00.l<? super Map<K, V>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        Map g11 = g();
        builderAction.invoke(g11);
        return d(g11);
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @m80.k
    public static <K, V> Map<K, V> g() {
        return new MapBuilder();
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @m80.k
    public static <K, V> Map<K, V> h(int i11) {
        return new MapBuilder(i11);
    }

    public static final <K, V> V i(@m80.k ConcurrentMap<K, V> concurrentMap, K k11, @m80.k x00.a<? extends V> defaultValue) {
        kotlin.jvm.internal.g0.p(concurrentMap, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        V v11 = concurrentMap.get(k11);
        if (v11 != null) {
            return v11;
        }
        V invoke = defaultValue.invoke();
        V putIfAbsent = concurrentMap.putIfAbsent(k11, invoke);
        return putIfAbsent == null ? invoke : putIfAbsent;
    }

    @yz.v0
    public static int j(int i11) {
        if (i11 < 0) {
            return i11;
        }
        if (i11 < 3) {
            return i11 + 1;
        }
        if (i11 < 1073741824) {
            return (int) ((i11 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @m80.k
    public static <K, V> Map<K, V> k(@m80.k Pair<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.g0.p(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        kotlin.jvm.internal.g0.o(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    @yz.y0(version = "1.4")
    @m80.k
    public static final <K, V> SortedMap<K, V> l(@m80.k Comparator<? super K> comparator, @m80.k Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        TreeMap treeMap = new TreeMap(comparator);
        l1.y0(treeMap, pairs);
        return treeMap;
    }

    @m80.k
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m(@m80.k Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.g0.p(pairs, "pairs");
        TreeMap treeMap = new TreeMap();
        l1.y0(treeMap, pairs);
        return treeMap;
    }

    @o00.f
    public static final Properties n(Map<String, String> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    @m80.k
    public static final <K, V> Map<K, V> o(@m80.k Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.g0.o(singletonMap, "with(...)");
        return singletonMap;
    }

    @o00.f
    public static final <K, V> Map<K, V> p(Map<K, ? extends V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return o(map);
    }

    @m80.k
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> q(@m80.k Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        return new TreeMap(map);
    }

    @m80.k
    public static <K, V> SortedMap<K, V> r(@m80.k Map<? extends K, ? extends V> map, @m80.k Comparator<? super K> comparator) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        return treeMap;
    }
}
