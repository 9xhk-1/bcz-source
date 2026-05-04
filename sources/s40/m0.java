package s40;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalDateFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDateFormat.kt\nkotlinx/datetime/format/DayOfWeekNames\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1#2:299\n1869#3,2:300\n*S KotlinDebug\n*F\n+ 1 LocalDateFormat.kt\nkotlinx/datetime/format/DayOfWeekNames\n*L\n38#1:300,2\n*E\n"})
/* loaded from: classes8.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f87732b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final m0 f87733c = new m0(a00.h0.Q("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final m0 f87734d = new m0(a00.h0.Q("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<String> f87735a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final m0 a() {
            return m0.f87734d;
        }

        @m80.k
        public final m0 b() {
            return m0.f87733c;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b extends FunctionReferenceImpl implements x00.l<String, String> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f87736a = new b();

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

    public m0(@m80.k List<String> names) {
        kotlin.jvm.internal.g0.p(names, "names");
        this.f87735a = names;
        if (names.size() != 7) {
            throw new IllegalArgumentException("Day of week names must contain exactly 7 elements");
        }
        Iterator<Integer> it = a00.h0.K(names).iterator();
        while (it.hasNext()) {
            int nextInt = ((a00.d1) it).nextInt();
            if (this.f87735a.get(nextInt).length() <= 0) {
                throw new IllegalArgumentException("A day-of-week name can not be empty");
            }
            for (int i11 = 0; i11 < nextInt; i11++) {
                if (kotlin.jvm.internal.g0.g(this.f87735a.get(nextInt), this.f87735a.get(i11))) {
                    throw new IllegalArgumentException(("Day-of-week names must be unique, but '" + this.f87735a.get(nextInt) + "' was repeated").toString());
                }
            }
        }
    }

    @m80.k
    public final List<String> c() {
        return this.f87735a;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof m0) && kotlin.jvm.internal.g0.g(this.f87735a, ((m0) obj).f87735a);
    }

    public int hashCode() {
        return this.f87735a.hashCode();
    }

    @m80.k
    public String toString() {
        return a00.r0.r3(this.f87735a, org.junit.jupiter.api.j2.O, "DayOfWeekNames(", pn.j.f81007d, 0, null, b.f87736a, 24, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(@m80.k String monday, @m80.k String tuesday, @m80.k String wednesday, @m80.k String thursday, @m80.k String friday, @m80.k String saturday, @m80.k String sunday) {
        this(a00.h0.Q(monday, tuesday, wednesday, thursday, friday, saturday, sunday));
        kotlin.jvm.internal.g0.p(monday, "monday");
        kotlin.jvm.internal.g0.p(tuesday, "tuesday");
        kotlin.jvm.internal.g0.p(wednesday, "wednesday");
        kotlin.jvm.internal.g0.p(thursday, "thursday");
        kotlin.jvm.internal.g0.p(friday, "friday");
        kotlin.jvm.internal.g0.p(saturday, "saturday");
        kotlin.jvm.internal.g0.p(sunday, "sunday");
    }
}
