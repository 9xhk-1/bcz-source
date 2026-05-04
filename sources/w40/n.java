package w40;

import a00.h0;
import a00.l0;
import a00.m0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.datetime.internal.format.parser.ParseException;
import w40.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@u0({"SMAP\nParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parser.kt\nkotlinx/datetime/internal/format/parser/Parser\n+ 2 ParseResult.kt\nkotlinx/datetime/internal/format/parser/ParseResult\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,227:1\n155#1,9:233\n164#1:244\n166#1,2:246\n171#1,14:250\n155#1,9:266\n164#1:277\n166#1,2:279\n171#1,14:283\n19#2,5:228\n19#2,2:242\n21#2:245\n22#2,2:248\n19#2,2:275\n21#2:278\n22#2,2:281\n1021#3,2:264\n*S KotlinDebug\n*F\n+ 1 Parser.kt\nkotlinx/datetime/internal/format/parser/Parser\n*L\n188#1:233,9\n188#1:244\n188#1:246,2\n188#1:250,14\n201#1:266,9\n201#1:277\n201#1:279,2\n201#1:283,14\n163#1:228,5\n188#1:242,2\n188#1:245\n188#1:248,2\n201#1:275,2\n201#1:278\n201#1:281,2\n195#1:264,2\n*E\n"})
/* loaded from: classes8.dex */
public final class n<Output extends w40.c<Output>> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t<Output> f95275a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<Output> {

        /* renamed from: a, reason: collision with root package name */
        public final Output f95276a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final t<Output> f95277b;

        /* renamed from: c, reason: collision with root package name */
        public final int f95278c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Output output, @m80.k t<? super Output> parserStructure, int i11) {
            g0.p(parserStructure, "parserStructure");
            this.f95276a = output;
            this.f95277b = parserStructure;
            this.f95278c = i11;
        }

        public final int a() {
            return this.f95278c;
        }

        public final Output b() {
            return this.f95276a;
        }

        @m80.k
        public final t<Output> c() {
            return this.f95277b;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 Parser.kt\nkotlinx/datetime/internal/format/parser/Parser\n*L\n1#1,121:1\n195#2:122\n*E\n"})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(Integer.valueOf(((l) t12).b()), Integer.valueOf(((l) t11).b()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements x00.a<String> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f95279a = new c();

        @Override // x00.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "There is more input to consume";
        }
    }

    public /* synthetic */ n(t tVar) {
        this.f95275a = tVar;
    }

    public static final /* synthetic */ n a(t tVar) {
        return new n(tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static <Output extends w40.c<Output>> t<Output> b(@m80.k t<? super Output> commands) {
        g0.p(commands, "commands");
        return commands;
    }

    public static boolean c(t<? super Output> tVar, Object obj) {
        return (obj instanceof n) && g0.g(tVar, ((n) obj).l());
    }

    public static final boolean d(t<? super Output> tVar, t<? super Output> tVar2) {
        return g0.g(tVar, tVar2);
    }

    public static int e(t<? super Output> tVar) {
        return tVar.hashCode();
    }

    @m80.k
    public static final Output f(t<? super Output> tVar, @m80.k CharSequence input, @m80.k Output initialContainer, int i11) {
        g0.p(input, "input");
        g0.p(initialContainer, "initialContainer");
        ArrayList arrayList = new ArrayList();
        List U = h0.U(new a(initialContainer, tVar, i11));
        while (true) {
            a aVar = (a) m0.R0(U);
            if (aVar == null) {
                if (arrayList.size() > 1) {
                    l0.r0(arrayList, new b());
                }
                throw new ParseException(arrayList);
            }
            Output output = (Output) ((w40.c) aVar.b()).copy();
            int a11 = aVar.a();
            t c11 = aVar.c();
            int size = c11.b().size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    Object a12 = ((q) c11.b().get(i12)).a(output, input, a11);
                    if (a12 instanceof Integer) {
                        a11 = ((Number) a12).intValue();
                        i12++;
                    } else {
                        if (!(a12 instanceof l)) {
                            throw new IllegalStateException(("Unexpected parse result: " + a12).toString());
                        }
                        arrayList.add((l) a12);
                    }
                } else if (!c11.a().isEmpty()) {
                    int size2 = c11.a().size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i13 = size2 - 1;
                            U.add(new a(output, (t) c11.a().get(size2), a11));
                            if (i13 < 0) {
                                break;
                            }
                            size2 = i13;
                        }
                    }
                } else {
                    if (a11 == input.length()) {
                        return output;
                    }
                    arrayList.add(new l(a11, c.f95279a));
                }
            }
        }
    }

    public static /* synthetic */ w40.c g(t tVar, CharSequence charSequence, w40.c cVar, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return f(tVar, charSequence, cVar, i11);
    }

    @m80.l
    public static final Output h(t<? super Output> tVar, @m80.k CharSequence input, @m80.k Output initialContainer, int i11) {
        g0.p(input, "input");
        g0.p(initialContainer, "initialContainer");
        List U = h0.U(new a(initialContainer, tVar, i11));
        while (true) {
            a aVar = (a) m0.R0(U);
            if (aVar == null) {
                return null;
            }
            Output output = (Output) ((w40.c) aVar.b()).copy();
            int a11 = aVar.a();
            t c11 = aVar.c();
            int size = c11.b().size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    Object a12 = ((q) c11.b().get(i12)).a(output, input, a11);
                    if (a12 instanceof Integer) {
                        a11 = ((Number) a12).intValue();
                        i12++;
                    } else if (!(a12 instanceof l)) {
                        throw new IllegalStateException(("Unexpected parse result: " + a12).toString());
                    }
                } else if (!c11.a().isEmpty()) {
                    int size2 = c11.a().size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i13 = size2 - 1;
                            U.add(new a(output, (t) c11.a().get(size2), a11));
                            if (i13 < 0) {
                                break;
                            }
                            size2 = i13;
                        }
                    }
                } else {
                    if (a11 == input.length()) {
                        return output;
                    }
                    new l(a11, c.f95279a);
                }
            }
        }
    }

    public static /* synthetic */ w40.c i(t tVar, CharSequence charSequence, w40.c cVar, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return h(tVar, charSequence, cVar, i11);
    }

    public static final void j(t<? super Output> tVar, CharSequence charSequence, int i11, Output output, boolean z11, x00.l<? super l, g2> lVar, x00.p<? super Integer, ? super Output, g2> pVar) {
        List U = h0.U(new a(output, tVar, i11));
        while (true) {
            a aVar = (a) m0.R0(U);
            if (aVar == null) {
                return;
            }
            w40.c cVar = (w40.c) ((w40.c) aVar.b()).copy();
            int a11 = aVar.a();
            t c11 = aVar.c();
            int size = c11.b().size();
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    Object a12 = ((q) c11.b().get(i12)).a(cVar, charSequence, a11);
                    if (a12 instanceof Integer) {
                        a11 = ((Number) a12).intValue();
                        i12++;
                    } else {
                        if (!(a12 instanceof l)) {
                            throw new IllegalStateException(("Unexpected parse result: " + a12).toString());
                        }
                        lVar.invoke((l) a12);
                    }
                } else if (!c11.a().isEmpty()) {
                    int size2 = c11.a().size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i13 = size2 - 1;
                            U.add(new a(cVar, (t) c11.a().get(size2), a11));
                            if (i13 < 0) {
                                break;
                            } else {
                                size2 = i13;
                            }
                        }
                    }
                } else if (z11 || a11 == charSequence.length()) {
                    pVar.invoke(Integer.valueOf(a11), cVar);
                } else {
                    lVar.invoke(new l(a11, c.f95279a));
                }
            }
        }
    }

    public static String k(t<? super Output> tVar) {
        return "Parser(commands=" + tVar + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f95275a, obj);
    }

    public int hashCode() {
        return e(this.f95275a);
    }

    public final /* synthetic */ t l() {
        return this.f95275a;
    }

    public String toString() {
        return k(this.f95275a);
    }
}
