package q30;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;
import yz.w0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1463#2,14:173\n1923#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
/* loaded from: classes8.dex */
public class z extends x {
    @m80.k
    public static final <R> m<R> H(@m80.k m<?> mVar, @m80.k final Class<R> klass) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(klass, "klass");
        m<R> P0 = k0.P0(mVar, new x00.l() { // from class: q30.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean I;
                I = z.I(klass, obj);
                return Boolean.valueOf(I);
            }
        });
        kotlin.jvm.internal.g0.n(P0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return P0;
    }

    public static final boolean I(Class cls, Object obj) {
        return cls.isInstance(obj);
    }

    @m80.k
    public static final <C extends Collection<? super R>, R> C J(@m80.k m<?> mVar, @m80.k C destination, @m80.k Class<R> klass) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        kotlin.jvm.internal.g0.p(klass, "klass");
        for (Object obj : mVar) {
            if (klass.isInstance(obj)) {
                destination.add(obj);
            }
        }
        return destination;
    }

    @yz.n(message = "Use maxOrNull instead.", replaceWith = @w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable K(m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return k0.f2(mVar);
    }

    @y0(version = "1.1")
    @yz.n(message = "Use maxOrNull instead.", replaceWith = @w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double L(m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return k0.g2(mVar);
    }

    @y0(version = "1.1")
    @yz.n(message = "Use maxOrNull instead.", replaceWith = @w0(expression = "this.maxOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float M(m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return k0.h2(mVar);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @yz.n(message = "Use maxByOrNull instead.", replaceWith = @w0(expression = "this.maxByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T N(m<? extends T> mVar, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @yz.n(message = "Use maxWithOrNull instead.", replaceWith = @w0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object O(m mVar, Comparator comparator) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return k0.l2(mVar, comparator);
    }

    @yz.n(message = "Use minOrNull instead.", replaceWith = @w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Comparable P(m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return k0.x2(mVar);
    }

    @y0(version = "1.1")
    @yz.n(message = "Use minOrNull instead.", replaceWith = @w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Double Q(m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return k0.y2(mVar);
    }

    @y0(version = "1.1")
    @yz.n(message = "Use minOrNull instead.", replaceWith = @w0(expression = "this.minOrNull()", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Float R(m mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return k0.z2(mVar);
    }

    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @yz.n(message = "Use minByOrNull instead.", replaceWith = @w0(expression = "this.minByOrNull(selector)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T S(m<? extends T> mVar, x00.l<? super T, ? extends R> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @yz.n(message = "Use minWithOrNull instead.", replaceWith = @w0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @yz.o(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    public static final /* synthetic */ Object T(m mVar, Comparator comparator) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return k0.D2(mVar, comparator);
    }

    @w00.j(name = "sumOfBigDecimal")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> BigDecimal U(m<? extends T> mVar, x00.l<? super T, ? extends BigDecimal> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(selector.invoke(it.next()));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @w00.j(name = "sumOfBigInteger")
    @y0(version = "1.4")
    @yz.p0
    @o00.f
    public static final <T> BigInteger V(m<? extends T> mVar, x00.l<? super T, ? extends BigInteger> selector) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        kotlin.jvm.internal.g0.o(valueOf, "valueOf(...)");
        Iterator<? extends T> it = mVar.iterator();
        while (it.hasNext()) {
            valueOf = valueOf.add(selector.invoke(it.next()));
            kotlin.jvm.internal.g0.o(valueOf, "add(...)");
        }
        return valueOf;
    }

    @m80.k
    public static final <T extends Comparable<? super T>> SortedSet<T> W(@m80.k m<? extends T> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        return (SortedSet) k0.G3(mVar, new TreeSet());
    }

    @m80.k
    public static final <T> SortedSet<T> X(@m80.k m<? extends T> mVar, @m80.k Comparator<? super T> comparator) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(comparator, "comparator");
        return (SortedSet) k0.G3(mVar, new TreeSet(comparator));
    }
}
