package a00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.random.Random;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,527:1\n1#2:528\n*E\n"})
/* loaded from: classes8.dex */
public class h0 extends g0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX WARN: Incorrect field signature: TK; */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,527:1\n*E\n"})
    public static final class a<T> implements x00.l<T, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, K> f1103a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparable f1104b;

        /* JADX WARN: Incorrect types in method signature: (Lx00/l<-TT;+TK;>;TK;)V */
        public a(x00.l lVar, Comparable comparable) {
            this.f1103a = lVar;
            this.f1104b = comparable;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(T t11) {
            return Integer.valueOf(e00.g.l((Comparable) this.f1103a.invoke(t11), this.f1104b));
        }
    }

    public static /* synthetic */ int A(List list, Comparable comparable, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = list.size();
        }
        return x(list, comparable, i11, i12);
    }

    public static /* synthetic */ int B(List list, Object obj, Comparator comparator, int i11, int i12, int i13, Object obj2) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = list.size();
        }
        return y(list, obj, comparator, i11, i12);
    }

    public static final <T, K extends Comparable<? super K>> int C(@m80.k List<? extends T> list, @m80.l K k11, int i11, int i12, @m80.k x00.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return w(list, i11, i12, new a(selector, k11));
    }

    public static /* synthetic */ int D(List list, Comparable comparable, int i11, int i12, x00.l selector, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = list.size();
        }
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        return w(list, i11, i12, new a(selector, comparable));
    }

    @yz.y0(version = "1.6")
    @o00.f
    public static final <E> List<E> E(int i11, @yz.b x00.l<? super List<E>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        List k11 = g0.k(i11);
        builderAction.invoke(k11);
        return g0.b(k11);
    }

    @yz.y0(version = "1.6")
    @o00.f
    public static final <E> List<E> F(@yz.b x00.l<? super List<E>, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        List j11 = g0.j();
        builderAction.invoke(j11);
        return g0.b(j11);
    }

    @m80.k
    public static final Object[] G(@m80.k Collection<?> collection) {
        kotlin.jvm.internal.g0.p(collection, "collection");
        int i11 = 0;
        if (collection.isEmpty()) {
            return new Object[0];
        }
        Object[] objArr = new Object[collection.size()];
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
        return objArr;
    }

    @m80.k
    public static final <T> T[] H(@m80.k Collection<?> collection, @m80.k T[] array) {
        kotlin.jvm.internal.g0.p(collection, "collection");
        kotlin.jvm.internal.g0.p(array, "array");
        int i11 = 0;
        if (collection.isEmpty()) {
            return (T[]) g0.o(0, array);
        }
        int length = array.length;
        Object[] objArr = array;
        if (length < collection.size()) {
            objArr = (T[]) o.a(array, collection.size());
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
        return (T[]) g0.o(collection.size(), objArr);
    }

    @o00.f
    public static final <T> boolean I(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return collection.containsAll(elements);
    }

    @m80.k
    public static <T> List<T> J() {
        return EmptyList.INSTANCE;
    }

    @m80.k
    public static g10.l K(@m80.k Collection<?> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        return new g10.l(0, collection.size() - 1);
    }

    public static <T> int L(@m80.k List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;Lx00/a<+TR;>;)TR; */
    @yz.y0(version = "1.3")
    @o00.f
    public static final Object M(Collection collection, x00.a defaultValue) {
        kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
        return collection.isEmpty() ? defaultValue.invoke() : collection;
    }

    @o00.f
    public static final <T> boolean N(Collection<? extends T> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        return !collection.isEmpty();
    }

    @yz.y0(version = "1.3")
    @o00.f
    public static final <T> boolean O(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @o00.f
    public static final <T> List<T> P() {
        return J();
    }

    @m80.k
    public static <T> List<T> Q(@m80.k T... elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return elements.length > 0 ? q.t(elements) : J();
    }

    @m80.k
    public static <T> List<T> R(@m80.l T t11) {
        return t11 != null ? g0.l(t11) : J();
    }

    @m80.k
    public static <T> List<T> S(@m80.k T... elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return a0.lb(elements);
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <T> List<T> T() {
        return new ArrayList();
    }

    @m80.k
    public static <T> List<T> U(@m80.k T... elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(u(elements, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final <T> List<T> V(@m80.k List<? extends T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : g0.l(list.get(0)) : J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00.f
    public static final <T> Collection<T> W(Collection<? extends T> collection) {
        return collection == 0 ? J() : collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00.f
    public static final <T> List<T> X(List<? extends T> list) {
        return list == 0 ? J() : list;
    }

    public static final void Y(int i11, int i12, int i13) {
        if (i12 > i13) {
            throw new IllegalArgumentException("fromIndex (" + i12 + ") is greater than toIndex (" + i13 + ").");
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i12 + ") is less than zero.");
        }
        if (i13 <= i11) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i13 + ") is greater than size (" + i11 + ").");
    }

    @yz.y0(version = "1.3")
    @m80.k
    public static final <T> List<T> Z(@m80.k Iterable<? extends T> iterable, @m80.k Random random) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(random, "random");
        List<T> c62 = r0.c6(iterable);
        r0.j5(c62, random);
        return c62;
    }

    @yz.y0(version = "1.3")
    @yz.v0
    public static void a0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @yz.y0(version = "1.3")
    @yz.v0
    public static void b0() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <T> List<T> q(int i11, x00.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.g0.p(init, "init");
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(init.invoke(Integer.valueOf(i12)));
        }
        return arrayList;
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <T> List<T> r(int i11, x00.l<? super Integer, ? extends T> init) {
        kotlin.jvm.internal.g0.p(init, "init");
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(init.invoke(Integer.valueOf(i12)));
        }
        return arrayList;
    }

    @yz.y0(version = "1.1")
    @o00.f
    public static final <T> ArrayList<T> s() {
        return new ArrayList<>();
    }

    @m80.k
    public static <T> ArrayList<T> t(@m80.k T... elements) {
        kotlin.jvm.internal.g0.p(elements, "elements");
        return elements.length == 0 ? new ArrayList<>() : new ArrayList<>(u(elements, true));
    }

    @m80.k
    public static final <T> Collection<T> u(@m80.k T[] tArr, boolean z11) {
        kotlin.jvm.internal.g0.p(tArr, "<this>");
        return new l(tArr, z11);
    }

    public static /* synthetic */ Collection v(Object[] objArr, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return u(objArr, z11);
    }

    public static <T> int w(@m80.k List<? extends T> list, int i11, int i12, @m80.k x00.l<? super T, Integer> comparison) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(comparison, "comparison");
        Y(list.size(), i11, i12);
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int intValue = comparison.invoke(list.get(i14)).intValue();
            if (intValue < 0) {
                i11 = i14 + 1;
            } else {
                if (intValue <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final <T extends Comparable<? super T>> int x(@m80.k List<? extends T> list, @m80.l T t11, int i11, int i12) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        Y(list.size(), i11, i12);
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int l11 = e00.g.l(list.get(i14), t11);
            if (l11 < 0) {
                i11 = i14 + 1;
            } else {
                if (l11 <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static final <T> int y(@m80.k List<? extends T> list, T t11, @m80.k Comparator<? super T> comparator, int i11, int i12) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        Y(list.size(), i11, i12);
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int compare = comparator.compare(list.get(i14), t11);
            if (compare < 0) {
                i11 = i14 + 1;
            } else {
                if (compare <= 0) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return -(i11 + 1);
    }

    public static /* synthetic */ int z(List list, int i11, int i12, x00.l lVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = list.size();
        }
        return w(list, i11, i12, lVar);
    }
}
