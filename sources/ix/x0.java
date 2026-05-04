package ix;

import ix.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHttpHeaderValueParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n1062#2:225\n1557#2:226\n1628#2,3:227\n*S KotlinDebug\n*F\n+ 1 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n*L\n49#1:225\n96#1:226\n96#1:227,3\n*E\n"})
/* loaded from: classes8.dex */
public final class x0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n*L\n1#1,121:1\n55#2:122\n*E\n"})
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Double.valueOf(((m0) t12).f()), Double.valueOf(((m0) t11).f()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n+ 2 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n*L\n1#1,145:1\n56#2,9:146\n*E\n"})
    public static final class b<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f63004a;

        public b(Comparator comparator) {
            this.f63004a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f63004a.compare(t11, t12);
            if (compare != 0) {
                return compare;
            }
            k.c cVar = k.f62843f;
            k b11 = cVar.b(((m0) t11).g());
            int i11 = kotlin.jvm.internal.g0.g(b11.f(), "*") ? 2 : 0;
            if (kotlin.jvm.internal.g0.g(b11.e(), "*")) {
                i11++;
            }
            Integer valueOf = Integer.valueOf(i11);
            k b12 = cVar.b(((m0) t12).g());
            int i12 = kotlin.jvm.internal.g0.g(b12.f(), "*") ? 2 : 0;
            if (kotlin.jvm.internal.g0.g(b12.e(), "*")) {
                i12++;
            }
            return e00.g.l(valueOf, Integer.valueOf(i12));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n+ 2 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n*L\n1#1,171:1\n65#2:172\n*E\n"})
    public static final class c<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f63005a;

        public c(Comparator comparator) {
            this.f63005a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            int compare = this.f63005a.compare(t11, t12);
            return compare != 0 ? compare : e00.g.l(Integer.valueOf(((m0) t12).e().size()), Integer.valueOf(((m0) t11).e().size()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 HttpHeaderValueParser.kt\nio/ktor/http/HttpHeaderValueParserKt\n*L\n1#1,121:1\n49#2:122\n*E\n"})
    public static final class d<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Double.valueOf(((m0) t12).f()), Double.valueOf(((m0) t11).f()));
        }
    }

    public static final boolean c(String str, int i11) {
        int i12 = i11 + 1;
        while (i12 < str.length() && str.charAt(i12) == ' ') {
            i12++;
        }
        return i12 == str.length() || str.charAt(i12) == ';';
    }

    @m80.k
    public static final List<m0> d(@m80.l String str) {
        return a00.r0.z5(f(str), new c(new b(new a())));
    }

    @m80.k
    public static final List<m0> e(@m80.l String str) {
        return a00.r0.z5(f(str), new d());
    }

    @m80.k
    public static final List<m0> f(@m80.l String str) {
        return g(str, false);
    }

    @m80.k
    public static final List<m0> g(@m80.l String str, boolean z11) {
        if (str == null) {
            return a00.h0.J();
        }
        yz.c0 b11 = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a() { // from class: ix.v0
            @Override // x00.a
            public final Object invoke() {
                ArrayList h11;
                h11 = x0.h();
                return h11;
            }
        });
        int i11 = 0;
        while (i11 <= u30.k0.A3(str)) {
            i11 = i(str, i11, b11, z11);
        }
        return q(b11);
    }

    public static final ArrayList h() {
        return new ArrayList();
    }

    public static final int i(String str, int i11, yz.c0<? extends ArrayList<m0>> c0Var, boolean z11) {
        yz.c0 b11 = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a() { // from class: ix.w0
            @Override // x00.a
            public final Object invoke() {
                ArrayList j11;
                j11 = x0.j();
                return j11;
            }
        });
        Integer valueOf = z11 ? Integer.valueOf(i11) : null;
        int i12 = i11;
        while (i12 <= u30.k0.A3(str)) {
            char charAt = str.charAt(i12);
            if (charAt == ',') {
                c0Var.getValue().add(new m0(o(str, i11, valueOf != null ? valueOf.intValue() : i12), q(b11)));
                return i12 + 1;
            }
            if (charAt != ';') {
                i12 = z11 ? k(str, i12, b11) : i12 + 1;
            } else {
                if (valueOf == null) {
                    valueOf = Integer.valueOf(i12);
                }
                i12 = k(str, i12 + 1, b11);
            }
        }
        c0Var.getValue().add(new m0(o(str, i11, valueOf != null ? valueOf.intValue() : i12), q(b11)));
        return i12;
    }

    public static final ArrayList j() {
        return new ArrayList();
    }

    public static final int k(String str, int i11, yz.c0<? extends ArrayList<n0>> c0Var) {
        int i12 = i11;
        while (i12 <= u30.k0.A3(str)) {
            char charAt = str.charAt(i12);
            if (charAt == ',' || charAt == ';') {
                l(c0Var, str, i11, i12, "");
                return i12;
            }
            if (charAt == '=') {
                Pair<Integer, String> m11 = m(str, i12 + 1);
                int intValue = m11.component1().intValue();
                l(c0Var, str, i11, i12, m11.component2());
                return intValue;
            }
            i12++;
        }
        l(c0Var, str, i11, i12, "");
        return i12;
    }

    public static final void l(yz.c0<? extends ArrayList<n0>> c0Var, String str, int i11, int i12, String str2) {
        String o11 = o(str, i11, i12);
        if (o11.length() == 0) {
            return;
        }
        c0Var.getValue().add(new n0(o11, str2));
    }

    public static final Pair<Integer, String> m(String str, int i11) {
        if (str.length() == i11) {
            return yz.h1.a(Integer.valueOf(i11), "");
        }
        if (str.charAt(i11) == '\"') {
            return n(str, i11 + 1);
        }
        int i12 = i11;
        while (i12 <= u30.k0.A3(str)) {
            char charAt = str.charAt(i12);
            if (charAt == ',' || charAt == ';') {
                return yz.h1.a(Integer.valueOf(i12), o(str, i11, i12));
            }
            i12++;
        }
        return yz.h1.a(Integer.valueOf(i12), o(str, i11, i12));
    }

    public static final Pair<Integer, String> n(String str, int i11) {
        StringBuilder sb2 = new StringBuilder();
        while (i11 <= u30.k0.A3(str)) {
            char charAt = str.charAt(i11);
            if (charAt == '\"' && c(str, i11)) {
                return yz.h1.a(Integer.valueOf(i11 + 1), sb2.toString());
            }
            if (charAt != '\\' || i11 >= u30.k0.A3(str) - 2) {
                sb2.append(charAt);
                i11++;
            } else {
                sb2.append(str.charAt(i11 + 1));
                i11 += 2;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return yz.h1.a(valueOf, '\"' + sb3);
    }

    public static final String o(String str, int i11, int i12) {
        String substring = str.substring(i11, i12);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return u30.k0.b6(substring).toString();
    }

    @m80.k
    public static final List<n0> p(@m80.k Iterable<Pair<String, String>> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        ArrayList arrayList = new ArrayList(a00.i0.d0(iterable, 10));
        for (Pair<String, String> pair : iterable) {
            arrayList.add(new n0(pair.getFirst(), pair.getSecond()));
        }
        return arrayList;
    }

    public static final <T> List<T> q(yz.c0<? extends List<? extends T>> c0Var) {
        return c0Var.isInitialized() ? c0Var.getValue() : a00.h0.J();
    }
}
