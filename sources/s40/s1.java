package s40;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nYearMonthFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearMonthFormat.kt\nkotlinx/datetime/format/MonthNames\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,301:1\n1#2:302\n1869#3,2:303\n*S KotlinDebug\n*F\n+ 1 YearMonthFormat.kt\nkotlinx/datetime/format/MonthNames\n*L\n36#1:303,2\n*E\n"})
/* loaded from: classes8.dex */
public final class s1 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f87766b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final s1 f87767c = new s1(a00.h0.Q("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final s1 f87768d = new s1(a00.h0.Q("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<String> f87769a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final s1 a() {
            return s1.f87768d;
        }

        @m80.k
        public final s1 b() {
            return s1.f87767c;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReferenceImpl implements x00.l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f87770a = new b();

        public b() {
            super(1, String.class, "toString", "toString()Ljava/lang/String;", 0);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return p02.toString();
        }
    }

    public s1(@m80.k List<String> names) {
        kotlin.jvm.internal.g0.p(names, "names");
        this.f87769a = names;
        if (names.size() != 12) {
            throw new IllegalArgumentException("Month names must contain exactly 12 elements");
        }
        Iterator<Integer> it = a00.h0.K(names).iterator();
        while (it.hasNext()) {
            int nextInt = ((a00.d1) it).nextInt();
            if (this.f87769a.get(nextInt).length() <= 0) {
                throw new IllegalArgumentException("A month name can not be empty");
            }
            for (int i11 = 0; i11 < nextInt; i11++) {
                if (kotlin.jvm.internal.g0.g(this.f87769a.get(nextInt), this.f87769a.get(i11))) {
                    throw new IllegalArgumentException(("Month names must be unique, but '" + this.f87769a.get(nextInt) + "' was repeated").toString());
                }
            }
        }
    }

    @m80.k
    public final List<String> c() {
        return this.f87769a;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof s1) && kotlin.jvm.internal.g0.g(this.f87769a, ((s1) obj).f87769a);
    }

    public int hashCode() {
        return this.f87769a.hashCode();
    }

    @m80.k
    public String toString() {
        return a00.r0.r3(this.f87769a, org.junit.jupiter.api.j2.O, "MonthNames(", pn.j.f81007d, 0, null, b.f87770a, 24, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s1(@m80.k String january, @m80.k String february, @m80.k String march, @m80.k String april, @m80.k String may, @m80.k String june, @m80.k String july, @m80.k String august, @m80.k String september, @m80.k String october, @m80.k String november, @m80.k String december) {
        this(a00.h0.Q(january, february, march, april, may, june, july, august, september, october, november, december));
        kotlin.jvm.internal.g0.p(january, "january");
        kotlin.jvm.internal.g0.p(february, "february");
        kotlin.jvm.internal.g0.p(march, "march");
        kotlin.jvm.internal.g0.p(april, "april");
        kotlin.jvm.internal.g0.p(may, "may");
        kotlin.jvm.internal.g0.p(june, "june");
        kotlin.jvm.internal.g0.p(july, "july");
        kotlin.jvm.internal.g0.p(august, "august");
        kotlin.jvm.internal.g0.p(september, "september");
        kotlin.jvm.internal.g0.p(october, "october");
        kotlin.jvm.internal.g0.p(november, "november");
        kotlin.jvm.internal.g0.p(december, "december");
    }
}
