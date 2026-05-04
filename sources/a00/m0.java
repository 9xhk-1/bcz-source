package a00;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class m0 extends l0 {
    @o00.f
    public static final <T> void A0(Collection<? super T> collection, q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        L0(collection, elements);
    }

    @o00.f
    public static final <T> void B0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        M0(collection, elements);
    }

    @o00.f
    public static final <T> void C0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        s0(collection, elements);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00.f
    public static final <T> void D0(Collection<? super T> collection, T t11) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        collection.add(t11);
    }

    @o00.f
    public static final <T> void E0(Collection<? super T> collection, q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        t0(collection, elements);
    }

    @o00.f
    public static final <T> void F0(Collection<? super T> collection, T[] elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        u0(collection, elements);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @yz.w0(expression = "removeAt(index)", imports = {}))
    @o00.f
    public static final <T> T G0(List<T> list, int i11) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        return list.remove(i11);
    }

    @o00.f
    public static final <T> boolean H0(Collection<? extends T> collection, T t11) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        return kotlin.jvm.internal.x0.a(collection).remove(t11);
    }

    public static <T> boolean I0(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        return w0(iterable, predicate, true);
    }

    public static <T> boolean J0(@m80.k Collection<? super T> collection, @m80.k Iterable<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return collection.removeAll(v0(elements));
    }

    @o00.f
    public static final <T> boolean K0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return kotlin.jvm.internal.x0.a(collection).removeAll(elements);
    }

    public static <T> boolean L0(@m80.k Collection<? super T> collection, @m80.k q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        List I3 = q30.k0.I3(elements);
        return !I3.isEmpty() && collection.removeAll(I3);
    }

    public static <T> boolean M0(@m80.k Collection<? super T> collection, @m80.k T[] elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return !(elements.length == 0) && collection.removeAll(q.t(elements));
    }

    public static <T> boolean N0(@m80.k List<T> list, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        return x0(list, predicate, true);
    }

    @yz.y0(version = "1.4")
    public static <T> T O0(@m80.k List<T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static <T> T P0(@m80.k List<T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @yz.y0(version = "1.4")
    public static <T> T Q0(@m80.k List<T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(h0.L(list));
    }

    @m80.l
    @yz.y0(version = "1.4")
    public static <T> T R0(@m80.k List<T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(h0.L(list));
    }

    public static <T> boolean S0(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        return w0(iterable, predicate, false);
    }

    public static <T> boolean T0(@m80.k Collection<? super T> collection, @m80.k Iterable<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return collection.retainAll(v0(elements));
    }

    @o00.f
    public static final <T> boolean U0(Collection<? extends T> collection, Collection<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return kotlin.jvm.internal.x0.a(collection).retainAll(elements);
    }

    public static final <T> boolean V0(@m80.k Collection<? super T> collection, @m80.k q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        List I3 = q30.k0.I3(elements);
        return !I3.isEmpty() ? collection.retainAll(I3) : Y0(collection);
    }

    public static final <T> boolean W0(@m80.k Collection<? super T> collection, @m80.k T[] elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return !(elements.length == 0) ? collection.retainAll(q.t(elements)) : Y0(collection);
    }

    public static final <T> boolean X0(@m80.k List<T> list, @m80.k x00.l<? super T, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        return x0(list, predicate, false);
    }

    public static final boolean Y0(Collection<?> collection) {
        boolean z11 = !collection.isEmpty();
        collection.clear();
        return z11;
    }

    public static <T> boolean s0(@m80.k Collection<? super T> collection, @m80.k Iterable<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        if (elements instanceof Collection) {
            return collection.addAll((Collection) elements);
        }
        Iterator<? extends T> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    public static <T> boolean t0(@m80.k Collection<? super T> collection, @m80.k q30.m<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        Iterator<? extends T> it = elements.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z11 = true;
            }
        }
        return z11;
    }

    public static <T> boolean u0(@m80.k Collection<? super T> collection, @m80.k T[] elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        return collection.addAll(q.t(elements));
    }

    @m80.k
    public static <T> Collection<T> v0(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return iterable instanceof Collection ? (Collection) iterable : r0.a6(iterable);
    }

    public static final <T> boolean w0(Iterable<? extends T> iterable, x00.l<? super T, Boolean> lVar, boolean z11) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z11) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }

    public static final <T> boolean x0(List<T> list, x00.l<? super T, Boolean> lVar, boolean z11) {
        int i11;
        if (!(list instanceof RandomAccess)) {
            kotlin.jvm.internal.g0.n(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return w0(kotlin.jvm.internal.x0.c(list), lVar, z11);
        }
        int L = h0.L(list);
        if (L >= 0) {
            int i12 = 0;
            i11 = 0;
            while (true) {
                T t11 = list.get(i12);
                if (lVar.invoke(t11).booleanValue() != z11) {
                    if (i11 != i12) {
                        list.set(i11, t11);
                    }
                    i11++;
                }
                if (i12 == L) {
                    break;
                }
                i12++;
            }
        } else {
            i11 = 0;
        }
        if (i11 >= list.size()) {
            return false;
        }
        int L2 = h0.L(list);
        if (i11 > L2) {
            return true;
        }
        while (true) {
            list.remove(L2);
            if (L2 == i11) {
                return true;
            }
            L2--;
        }
    }

    @o00.f
    public static final <T> void y0(Collection<? super T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        kotlin.jvm.internal.g0.p(elements, "elements");
        J0(collection, elements);
    }

    @o00.f
    public static final <T> void z0(Collection<? super T> collection, T t11) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        collection.remove(t11);
    }
}
