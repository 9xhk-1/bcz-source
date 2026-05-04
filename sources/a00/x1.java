package a00;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n865#2,2:141\n855#2,2:143\n1#3:145\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n29#1:141,2\n53#1:143,2\n*E\n"})
/* loaded from: classes8.dex */
public class x1 extends w1 {
    @m80.k
    public static final <T> Set<T> A(@m80.k Set<? extends T> set, @m80.k T[] elements) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        m0.M0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @o00.f
    public static final <T> Set<T> B(Set<? extends T> set, T t11) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        return y(set, t11);
    }

    @m80.k
    public static <T> Set<T> C(@m80.k Set<? extends T> set, @m80.k Iterable<? extends T> elements) {
        int size;
        kotlin.jvm.internal.g0.p(set, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        Integer e02 = i0.e0(elements);
        if (e02 != null) {
            size = set.size() + e02.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(k1.j(size));
        linkedHashSet.addAll(set);
        m0.s0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @m80.k
    public static <T> Set<T> D(@m80.k Set<? extends T> set, T t11) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(k1.j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t11);
        return linkedHashSet;
    }

    @m80.k
    public static final <T> Set<T> E(@m80.k Set<? extends T> set, @m80.k q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(k1.j(set.size() * 2));
        linkedHashSet.addAll(set);
        m0.t0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @m80.k
    public static final <T> Set<T> F(@m80.k Set<? extends T> set, @m80.k T[] elements) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(k1.j(set.size() + elements.length));
        linkedHashSet.addAll(set);
        m0.u0(linkedHashSet, elements);
        return linkedHashSet;
    }

    @o00.f
    public static final <T> Set<T> G(Set<? extends T> set, T t11) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        return D(set, t11);
    }

    @m80.k
    public static <T> Set<T> x(@m80.k Set<? extends T> set, @m80.k Iterable<? extends T> elements) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        Collection<?> v02 = m0.v0(elements);
        if (v02.isEmpty()) {
            return r0.f6(set);
        }
        if (!(v02 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(v02);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t11 : set) {
            if (!((Set) v02).contains(t11)) {
                linkedHashSet2.add(t11);
            }
        }
        return linkedHashSet2;
    }

    @m80.k
    public static <T> Set<T> y(@m80.k Set<? extends T> set, T t11) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(k1.j(set.size()));
        boolean z11 = false;
        for (T t12 : set) {
            boolean z12 = true;
            if (!z11 && kotlin.jvm.internal.g0.g(t12, t11)) {
                z11 = true;
                z12 = false;
            }
            if (z12) {
                linkedHashSet.add(t12);
            }
        }
        return linkedHashSet;
    }

    @m80.k
    public static final <T> Set<T> z(@m80.k Set<? extends T> set, @m80.k q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(set, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        m0.L0(linkedHashSet, elements);
        return linkedHashSet;
    }
}
