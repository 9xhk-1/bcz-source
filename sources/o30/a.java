package o30;

import a00.h0;
import a00.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\ncollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1216#2,2:114\n1246#2,4:116\n1#3:120\n*S KotlinDebug\n*F\n+ 1 collections.kt\norg/jetbrains/kotlin/utils/CollectionsKt\n*L\n22#1:114,2\n22#1:116,4\n*E\n"})
/* loaded from: classes8.dex */
public final class a {
    public static final <T> void a(@m80.k Collection<T> collection, @m80.l T t11) {
        g0.p(collection, "<this>");
        if (t11 != null) {
            collection.add(t11);
        }
    }

    public static final int b(int i11) {
        if (i11 < 3) {
            return 3;
        }
        return i11 + (i11 / 3) + 1;
    }

    @m80.k
    public static final <T> List<T> c(@m80.k ArrayList<T> arrayList) {
        g0.p(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return h0.J();
        }
        if (size == 1) {
            return a00.g0.l(r0.G2(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    @m80.k
    public static final <K> Map<K, Integer> d(@m80.k Iterable<? extends K> iterable) {
        g0.p(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends K> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i11));
            i11++;
        }
        return linkedHashMap;
    }

    @m80.k
    public static final <K, V> HashMap<K, V> e(int i11) {
        return new HashMap<>(b(i11));
    }

    @m80.k
    public static final <E> HashSet<E> f(int i11) {
        return new HashSet<>(b(i11));
    }

    @m80.k
    public static final <E> LinkedHashSet<E> g(int i11) {
        return new LinkedHashSet<>(b(i11));
    }
}
