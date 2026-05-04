package w40;

import a00.h0;
import a00.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nParserOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserOperation.kt\nkotlinx/datetime/internal/format/parser/StringSetParserOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,557:1\n1#2:558\n403#3,7:559\n1056#4:566\n*S KotlinDebug\n*F\n+ 1 ParserOperation.kt\nkotlinx/datetime/internal/format/parser/StringSetParserOperation\n*L\n288#1:559,7\n312#1:566\n*E\n"})
/* loaded from: classes8.dex */
public final class b0<Output> implements q<Output> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final w40.a<Output, String> f95224a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f95225b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final a f95226c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<Pair<String, a>> f95227a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f95228b;

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        @m80.k
        public final List<Pair<String, a>> a() {
            return this.f95227a;
        }

        public final boolean b() {
            return this.f95228b;
        }

        public final void c(boolean z11) {
            this.f95228b = z11;
        }

        public a(@m80.k List<Pair<String, a>> children, boolean z11) {
            g0.p(children, "children");
            this.f95227a = children;
            this.f95228b = z11;
        }

        public /* synthetic */ a(List list, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
            this((i11 & 1) != 0 ? new ArrayList() : list, (i11 & 2) != 0 ? false : z11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ParserOperation.kt\nkotlinx/datetime/internal/format/parser/StringSetParserOperation\n*L\n1#1,102:1\n312#2:103\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l((String) ((Pair) t11).getFirst(), (String) ((Pair) t12).getFirst());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n+ 2 ParserOperation.kt\nkotlinx/datetime/internal/format/parser/StringSetParserOperation\n*L\n1#1,409:1\n288#2:410\n*E\n"})
    public static final class c implements x00.l<Pair<? extends String, ? extends a>, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparable f95229a;

        public c(Comparable comparable) {
            this.f95229a = comparable;
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(Pair<? extends String, ? extends a> pair) {
            return Integer.valueOf(e00.g.l(pair.getFirst(), this.f95229a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(@m80.k Collection<String> strings, @m80.k w40.a<? super Output, String> setter, @m80.k String whatThisExpects) {
        g0.p(strings, "strings");
        g0.p(setter, "setter");
        g0.p(whatThisExpects, "whatThisExpects");
        this.f95224a = setter;
        this.f95225b = whatThisExpects;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        boolean z11 = false;
        int i11 = 3;
        this.f95226c = new a(null, z11, i11, 0 == true ? 1 : 0);
        for (String str : strings) {
            if (str.length() <= 0) {
                throw new IllegalArgumentException(("Found an empty string in " + this.f95225b).toString());
            }
            a aVar = this.f95226c;
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                char charAt = str.charAt(i12);
                List<Pair<String, a>> a11 = aVar.a();
                int w11 = h0.w(a11, 0, a11.size(), new c(String.valueOf(charAt)));
                if (w11 < 0) {
                    a aVar2 = new a(objArr2 == true ? 1 : 0, z11, i11, objArr == true ? 1 : 0);
                    aVar.a().add((-w11) - 1, h1.a(String.valueOf(charAt), aVar2));
                    aVar = aVar2;
                } else {
                    aVar = aVar.a().get(w11).getSecond();
                }
            }
            if (aVar.b()) {
                throw new IllegalArgumentException(("The string '" + str + "' was passed several times").toString());
            }
            aVar.c(true);
        }
        c(this.f95226c);
    }

    public static final void c(a aVar) {
        Iterator<Pair<String, a>> it = aVar.a().iterator();
        while (it.hasNext()) {
            c(it.next().component2());
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, a> pair : aVar.a()) {
            String component1 = pair.component1();
            a component2 = pair.component2();
            if (component2.b() || component2.a().size() != 1) {
                arrayList.add(h1.a(component1, component2));
            } else {
                Pair pair2 = (Pair) r0.m5(component2.a());
                String str = (String) pair2.component1();
                arrayList.add(h1.a(component1 + str, (a) pair2.component2()));
            }
        }
        aVar.a().clear();
        aVar.a().addAll(r0.z5(arrayList, new b()));
    }

    public static final String d(b0 b0Var, CharSequence charSequence, int i11, Ref.IntRef intRef) {
        return "Expected " + b0Var.f95225b + " but got " + charSequence.subSequence(i11, intRef.element).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r1.element += r6.length();
        r0 = r3;
        r13 = r5;
     */
    @Override // w40.q
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(Output r12, @m80.k java.lang.CharSequence r13, final int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r13, r0)
            w40.b0$a r0 = r11.f95226c
            kotlin.jvm.internal.Ref$IntRef r1 = new kotlin.jvm.internal.Ref$IntRef
            r1.<init>()
            r1.element = r14
            r2 = 0
        Lf:
            int r3 = r1.element
            int r4 = r13.length()
            if (r3 > r4) goto L5e
            boolean r3 = r0.b()
            if (r3 == 0) goto L23
            int r2 = r1.element
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L23:
            java.util.List r0 = r0.a()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r0.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r4 = r3.component1()
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r3.component2()
            w40.b0$a r3 = (w40.b0.a) r3
            int r7 = r1.element
            r9 = 4
            r10 = 0
            r8 = 0
            r5 = r13
            boolean r13 = u30.k0.B5(r5, r6, r7, r8, r9, r10)
            if (r13 == 0) goto L5c
            int r13 = r1.element
            int r0 = r6.length()
            int r13 = r13 + r0
            r1.element = r13
            r0 = r3
            r13 = r5
            goto Lf
        L5c:
            r13 = r5
            goto L2b
        L5e:
            r5 = r13
            if (r2 == 0) goto L78
            w40.a<Output, java.lang.String> r13 = r11.f95224a
            int r0 = r2.intValue()
            java.lang.CharSequence r0 = r5.subSequence(r14, r0)
            java.lang.String r0 = r0.toString()
            int r1 = r2.intValue()
            java.lang.Object r12 = w40.s.d(r13, r12, r0, r14, r1)
            return r12
        L78:
            w40.m$a r12 = w40.m.f95273b
            w40.a0 r13 = new w40.a0
            r13.<init>()
            java.lang.Object r12 = r12.a(r14, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w40.b0.a(java.lang.Object, java.lang.CharSequence, int):java.lang.Object");
    }
}
