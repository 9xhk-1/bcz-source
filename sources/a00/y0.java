package a00;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1869#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
/* loaded from: classes8.dex */
public class y0 {
    @yz.y0(version = "1.1")
    @m80.k
    public static <T, K> Map<K, Integer> a(@m80.k w0<T, ? extends K> w0Var) {
        kotlin.jvm.internal.g0.p(w0Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b11 = w0Var.b();
        while (b11.hasNext()) {
            K a11 = w0Var.a(b11.next());
            Object obj = linkedHashMap.get(a11);
            if (obj == null && !linkedHashMap.containsKey(a11)) {
                obj = new Ref.IntRef();
            }
            Ref.IntRef intRef = (Ref.IntRef) obj;
            intRef.element++;
            linkedHashMap.put(a11, intRef);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            kotlin.jvm.internal.g0.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            kotlin.jvm.internal.x0.m(entry).setValue(Integer.valueOf(((Ref.IntRef) entry.getValue()).element));
        }
        return kotlin.jvm.internal.x0.k(linkedHashMap);
    }

    @yz.v0
    @o00.f
    public static final <K, V, R> Map<K, R> b(Map<K, V> map, x00.l<? super Map.Entry<? extends K, ? extends V>, ? extends R> f11) {
        kotlin.jvm.internal.g0.p(map, "<this>");
        kotlin.jvm.internal.g0.p(f11, "f");
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            kotlin.jvm.internal.g0.n(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            kotlin.jvm.internal.x0.m(entry).setValue(f11.invoke(entry));
        }
        return kotlin.jvm.internal.x0.k(map);
    }
}
