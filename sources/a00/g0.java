package a00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.collections.builders.ListBuilder;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* loaded from: classes8.dex */
public class g0 {
    @o00.f
    public static final <T> ArrayList<T> a(T[] tArr) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return new ArrayList<>(h0.u(tArr, true));
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @m80.k
    public static <E> List<E> b(@m80.k List<E> builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        return ((ListBuilder) builder).build();
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @o00.f
    public static final <E> List<E> c(int i11, x00.l<? super List<E>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        List k11 = k(i11);
        builderAction.invoke(k11);
        return b(k11);
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @o00.f
    public static final <E> List<E> d(x00.l<? super List<E>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        List j11 = j();
        builderAction.invoke(j11);
        return b(j11);
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @o00.f
    public static final int e(int i11) {
        if (i11 < 0) {
            h0.a0();
        }
        return i11;
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @o00.f
    public static final int f(int i11) {
        if (i11 < 0) {
            h0.b0();
        }
        return i11;
    }

    @o00.f
    public static final Object[] g(Collection<?> collection) {
        kotlin.jvm.internal.g0.p(collection, "collection");
        return kotlin.jvm.internal.u.a(collection);
    }

    @o00.f
    public static final <T> T[] h(Collection<?> collection, T[] array) {
        kotlin.jvm.internal.g0.p(collection, "collection");
        kotlin.jvm.internal.g0.p(array, "array");
        return (T[]) kotlin.jvm.internal.u.b(collection, array);
    }

    @m80.k
    public static final <T> Object[] i(@m80.k T[] tArr, boolean z11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        if (z11 && kotlin.jvm.internal.g0.g(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        kotlin.jvm.internal.g0.o(copyOf, "copyOf(...)");
        return copyOf;
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @m80.k
    public static <E> List<E> j() {
        return new ListBuilder(0, 1, null);
    }

    @yz.y0(version = "1.3")
    @yz.v0
    @m80.k
    public static <E> List<E> k(int i11) {
        return new ListBuilder(i11);
    }

    @m80.k
    public static <T> List<T> l(T t11) {
        List<T> singletonList = Collections.singletonList(t11);
        kotlin.jvm.internal.g0.o(singletonList, "singletonList(...)");
        return singletonList;
    }

    @yz.y0(version = "1.2")
    @m80.k
    public static <T> List<T> m(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        List<T> c62 = r0.c6(iterable);
        Collections.shuffle(c62);
        return c62;
    }

    @yz.y0(version = "1.2")
    @m80.k
    public static <T> List<T> n(@m80.k Iterable<? extends T> iterable, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        List<T> c62 = r0.c6(iterable);
        Collections.shuffle(c62, random);
        return c62;
    }

    @m80.k
    public static <T> T[] o(int i11, @m80.k T[] array) {
        kotlin.jvm.internal.g0.p(array, "array");
        if (i11 < array.length) {
            array[i11] = null;
        }
        return array;
    }

    @o00.f
    public static final <T> List<T> p(Enumeration<T> enumeration) {
        kotlin.jvm.internal.g0.p(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        kotlin.jvm.internal.g0.o(list, "list(...)");
        return list;
    }
}
