package a00;

import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,111:1\n348#2,6:112\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:112,6\n*E\n"})
/* loaded from: classes8.dex */
public class j1 {
    @w00.j(name = "getOrImplicitDefaultNullable")
    @yz.v0
    public static final <K, V> V a(@m80.k Map<K, ? extends V> map, K k11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        if (map instanceof g1) {
            return (V) ((g1) map).c0(k11);
        }
        V v11 = map.get(k11);
        if (v11 != null || map.containsKey(k11)) {
            return v11;
        }
        throw new NoSuchElementException("Key " + k11 + " is missing in the map.");
    }

    @m80.k
    public static final <K, V> Map<K, V> b(@m80.k Map<K, ? extends V> map, @m80.k x00.l<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return map instanceof g1 ? b(((g1) map).q(), defaultValue) : new h1(map, defaultValue);
    }

    @w00.j(name = "withDefaultMutable")
    @m80.k
    public static final <K, V> Map<K, V> c(@m80.k Map<K, V> map, @m80.k x00.l<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return map instanceof p1 ? c(((p1) map).q(), defaultValue) : new q1(map, defaultValue);
    }
}
