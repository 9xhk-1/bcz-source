package a00;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1999#2,14:169\n2423#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
/* loaded from: classes8.dex */
public class o0 extends n0 {
    @m80.k
    public static <R> List<R> h1(@m80.k Iterable<?> iterable, @m80.k Class<R> klass) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(klass, "klass");
        return (List) i1(iterable, new ArrayList(), klass);
    }

    @m80.k
    public static final <C extends Collection<? super R>, R> C i1(@m80.k Iterable<?> iterable, @m80.k C destination, @m80.k Class<R> klass) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(klass, "klass");
        for (Object obj : iterable) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable j1(Iterable iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return r0.U3(iterable);
    }

    @yz.y0(version = "1.1")
    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double k1(Iterable iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return r0.V3(iterable);
    }

    @yz.y0(version = "1.1")
    @yz.n(message = "Use maxOrNull instead.", replaceWith = @yz.w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float l1(Iterable iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return r0.W3(iterable);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @yz.w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m1(Iterable<? extends T> iterable, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = selector.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) < 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @yz.w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object n1(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return r0.a4(iterable, comparator);
    }

    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable o1(Iterable iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return r0.m4(iterable);
    }

    @yz.y0(version = "1.1")
    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double p1(Iterable iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return r0.n4(iterable);
    }

    @yz.y0(version = "1.1")
    @yz.n(message = "Use minOrNull instead.", replaceWith = @yz.w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float q1(Iterable iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return r0.o4(iterable);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @yz.n(message = "Use minByOrNull instead.", replaceWith = @yz.w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T r1(Iterable<? extends T> iterable, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R invoke = selector.invoke(next);
        do {
            T next2 = it.next();
            R invoke2 = selector.invoke(next2);
            next = next;
            if (invoke.compareTo(invoke2) > 0) {
                invoke = invoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @yz.w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object s1(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return r0.s4(iterable, comparator);
    }

    public static <T> void t1(@m80.k List<T> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        Collections.reverse(list);
    }

    @w00.j(name = "sumOfBigDecimal")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> BigDecimal u1(Iterable<? extends T> iterable, x00.l<? super T, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(selector.invoke(it.next()));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @w00.j(name = "sumOfBigInteger")
    @yz.y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> BigInteger v1(Iterable<? extends T> iterable, x00.l<? super T, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(selector.invoke(it.next()));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static <T extends Comparable<? super T>> SortedSet<T> w1(@m80.k Iterable<? extends T> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        return (SortedSet) r0.V5(iterable, new TreeSet());
    }

    @m80.k
    public static final <T> SortedSet<T> x1(@m80.k Iterable<? extends T> iterable, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return (SortedSet) r0.V5(iterable, new TreeSet(comparator));
    }
}
