package e00;

import java.util.Comparator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, Comparable<?>> f48256a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(x00.l<? super T, ? extends Comparable<?>> lVar) {
            this.f48256a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            x00.l<T, Comparable<?>> lVar = this.f48256a;
            return g.l(lVar.invoke(t11), lVar.invoke(t12));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    public static final class b<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f48257a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, K> f48258b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Comparator<? super K> comparator, x00.l<? super T, ? extends K> lVar) {
            this.f48257a = comparator;
            this.f48258b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Comparator<? super K> comparator = this.f48257a;
            x00.l<T, K> lVar = this.f48258b;
            return comparator.compare(lVar.invoke(t11), lVar.invoke(t12));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class c<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, Comparable<?>> f48259a;

        /* JADX WARN: Multi-variable type inference failed */
        public c(x00.l<? super T, ? extends Comparable<?>> lVar) {
            this.f48259a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            x00.l<T, Comparable<?>> lVar = this.f48259a;
            return g.l(lVar.invoke(t12), lVar.invoke(t11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class d<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f48260a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, K> f48261b;

        /* JADX WARN: Multi-variable type inference failed */
        public d(Comparator<? super K> comparator, x00.l<? super T, ? extends K> lVar) {
            this.f48260a = comparator;
            this.f48261b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            Comparator<? super K> comparator = this.f48260a;
            x00.l<T, K> lVar = this.f48261b;
            return comparator.compare(lVar.invoke(t12), lVar.invoke(t11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    public static final class e<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f48262a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, Comparable<?>> f48263b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(Comparator<T> comparator, x00.l<? super T, ? extends Comparable<?>> lVar) {
            this.f48262a = comparator;
            this.f48263b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f48262a.compare(t11, t12);
            if (compare != 0) {
                return compare;
            }
            x00.l<T, Comparable<?>> lVar = this.f48263b;
            return g.l(lVar.invoke(t11), lVar.invoke(t12));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class f<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f48264a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f48265b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, K> f48266c;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Comparator<T> comparator, Comparator<? super K> comparator2, x00.l<? super T, ? extends K> lVar) {
            this.f48264a = comparator;
            this.f48265b = comparator2;
            this.f48266c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f48264a.compare(t11, t12);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f48265b;
            x00.l<T, K> lVar = this.f48266c;
            return comparator.compare(lVar.invoke(t11), lVar.invoke(t12));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: e00.g$g, reason: collision with other inner class name */
    public static final class C0580g<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f48267a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, Comparable<?>> f48268b;

        /* JADX WARN: Multi-variable type inference failed */
        public C0580g(Comparator<T> comparator, x00.l<? super T, ? extends Comparable<?>> lVar) {
            this.f48267a = comparator;
            this.f48268b = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f48267a.compare(t11, t12);
            if (compare != 0) {
                return compare;
            }
            x00.l<T, Comparable<?>> lVar = this.f48268b;
            return g.l(lVar.invoke(t12), lVar.invoke(t11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class h<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f48269a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator<? super K> f48270b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, K> f48271c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(Comparator<T> comparator, Comparator<? super K> comparator2, x00.l<? super T, ? extends K> lVar) {
            this.f48269a = comparator;
            this.f48270b = comparator2;
            this.f48271c = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f48269a.compare(t11, t12);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f48270b;
            x00.l<T, K> lVar = this.f48271c;
            return comparator.compare(lVar.invoke(t12), lVar.invoke(t11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    public static final class i<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator<T> f48272a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<T, T, Integer> f48273b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Comparator<T> comparator, p<? super T, ? super T, Integer> pVar) {
            this.f48272a = comparator;
            this.f48273b = pVar;
        }

        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f48272a.compare(t11, t12);
            return compare != 0 ? compare : this.f48273b.invoke(t11, t12).intValue();
        }
    }

    public static final int A(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj, obj2);
    }

    @o00.f
    public static final <T, K> Comparator<T> B(Comparator<T> comparator, Comparator<? super K> comparator2, x00.l<? super T, ? extends K> selector) {
        g0.p(comparator, "<this>");
        g0.p(comparator2, "comparator");
        g0.p(selector, "selector");
        return new f(comparator, comparator2, selector);
    }

    @o00.f
    public static final <T> Comparator<T> C(Comparator<T> comparator, x00.l<? super T, ? extends Comparable<?>> selector) {
        g0.p(comparator, "<this>");
        g0.p(selector, "selector");
        return new e(comparator, selector);
    }

    @o00.f
    public static final <T, K> Comparator<T> D(Comparator<T> comparator, Comparator<? super K> comparator2, x00.l<? super T, ? extends K> selector) {
        g0.p(comparator, "<this>");
        g0.p(comparator2, "comparator");
        g0.p(selector, "selector");
        return new h(comparator, comparator2, selector);
    }

    @o00.f
    public static final <T> Comparator<T> E(Comparator<T> comparator, x00.l<? super T, ? extends Comparable<?>> selector) {
        g0.p(comparator, "<this>");
        g0.p(selector, "selector");
        return new C0580g(comparator, selector);
    }

    @o00.f
    public static final <T> Comparator<T> F(Comparator<T> comparator, p<? super T, ? super T, Integer> comparison) {
        g0.p(comparator, "<this>");
        g0.p(comparison, "comparison");
        return new i(comparator, comparison);
    }

    @m80.k
    public static final <T> Comparator<T> G(@m80.k final Comparator<T> comparator, @m80.k final Comparator<? super T> comparator2) {
        g0.p(comparator, "<this>");
        g0.p(comparator2, "comparator");
        return new Comparator() { // from class: e00.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int H;
                H = g.H(comparator, comparator2, obj, obj2);
                return H;
            }
        };
    }

    public static final int H(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        int compare = comparator.compare(obj, obj2);
        return compare != 0 ? compare : comparator2.compare(obj2, obj);
    }

    @o00.f
    public static final <T, K> Comparator<T> f(Comparator<? super K> comparator, x00.l<? super T, ? extends K> selector) {
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        return new b(comparator, selector);
    }

    @o00.f
    public static final <T> Comparator<T> g(x00.l<? super T, ? extends Comparable<?>> selector) {
        g0.p(selector, "selector");
        return new a(selector);
    }

    @m80.k
    public static <T> Comparator<T> h(@m80.k final x00.l<? super T, ? extends Comparable<?>>... selectors) {
        g0.p(selectors, "selectors");
        if (selectors.length > 0) {
            return new Comparator() { // from class: e00.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i11;
                    i11 = g.i(selectors, obj, obj2);
                    return i11;
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final int i(x00.l[] lVarArr, Object obj, Object obj2) {
        return p(obj, obj2, lVarArr);
    }

    @o00.f
    public static final <T, K> Comparator<T> j(Comparator<? super K> comparator, x00.l<? super T, ? extends K> selector) {
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        return new d(comparator, selector);
    }

    @o00.f
    public static final <T> Comparator<T> k(x00.l<? super T, ? extends Comparable<?>> selector) {
        g0.p(selector, "selector");
        return new c(selector);
    }

    public static <T extends Comparable<?>> int l(@m80.l T t11, @m80.l T t12) {
        if (t11 == t12) {
            return 0;
        }
        if (t11 == null) {
            return -1;
        }
        if (t12 == null) {
            return 1;
        }
        return t11.compareTo(t12);
    }

    @o00.f
    public static final <T, K> int m(T t11, T t12, Comparator<? super K> comparator, x00.l<? super T, ? extends K> selector) {
        g0.p(comparator, "comparator");
        g0.p(selector, "selector");
        return comparator.compare(selector.invoke(t11), selector.invoke(t12));
    }

    @o00.f
    public static final <T> int n(T t11, T t12, x00.l<? super T, ? extends Comparable<?>> selector) {
        g0.p(selector, "selector");
        return l(selector.invoke(t11), selector.invoke(t12));
    }

    public static <T> int o(T t11, T t12, @m80.k x00.l<? super T, ? extends Comparable<?>>... selectors) {
        g0.p(selectors, "selectors");
        if (selectors.length > 0) {
            return p(t11, t12, selectors);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final <T> int p(T t11, T t12, x00.l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (x00.l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int l11 = l(lVar.invoke(t11), lVar.invoke(t12));
            if (l11 != 0) {
                return l11;
            }
        }
        return 0;
    }

    @m80.k
    public static <T extends Comparable<? super T>> Comparator<T> q() {
        j jVar = j.f48274a;
        g0.n(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return jVar;
    }

    @o00.f
    public static final <T extends Comparable<? super T>> Comparator<T> r() {
        return s(q());
    }

    @m80.k
    public static final <T> Comparator<T> s(@m80.k final Comparator<? super T> comparator) {
        g0.p(comparator, "comparator");
        return new Comparator() { // from class: e00.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int t11;
                t11 = g.t(comparator, obj, obj2);
                return t11;
            }
        };
    }

    public static final int t(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @o00.f
    public static final <T extends Comparable<? super T>> Comparator<T> u() {
        return v(q());
    }

    @m80.k
    public static final <T> Comparator<T> v(@m80.k final Comparator<? super T> comparator) {
        g0.p(comparator, "comparator");
        return new Comparator() { // from class: e00.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int w11;
                w11 = g.w(comparator, obj, obj2);
                return w11;
            }
        };
    }

    public static final int w(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @m80.k
    public static <T extends Comparable<? super T>> Comparator<T> x() {
        k kVar = k.f48275a;
        g0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>");
        return kVar;
    }

    @m80.k
    public static final <T> Comparator<T> y(@m80.k Comparator<T> comparator) {
        g0.p(comparator, "<this>");
        if (comparator instanceof l) {
            return ((l) comparator).a();
        }
        j jVar = j.f48274a;
        if (g0.g(comparator, jVar)) {
            k kVar = k.f48275a;
            g0.n(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
            return kVar;
        }
        if (!g0.g(comparator, k.f48275a)) {
            return new l(comparator);
        }
        g0.n(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>");
        return jVar;
    }

    @m80.k
    public static final <T> Comparator<T> z(@m80.k final Comparator<T> comparator, @m80.k final Comparator<? super T> comparator2) {
        g0.p(comparator, "<this>");
        g0.p(comparator2, "comparator");
        return new Comparator() { // from class: e00.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int A;
                A = g.A(comparator, comparator2, obj, obj2);
                return A;
            }
        };
    }
}
