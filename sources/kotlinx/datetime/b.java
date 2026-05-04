package kotlinx.datetime;

import com.handmark.pulltorefresh.library.internal.RotateLoadingLayout;
import f50.a0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import x40.n0;
import x40.s0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a0(with = x40.l.class)
/* loaded from: classes8.dex */
public abstract class b {

    @m80.k
    public static final a Companion = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final e f68490a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final e f68491b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final e f68492c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final e f68493d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final e f68494e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final e f68495f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final c f68496g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final c f68497h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final d f68498i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final d f68499j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final d f68500k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final d f68501l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final d a() {
            return b.f68501l;
        }

        @m80.k
        public final c b() {
            return b.f68496g;
        }

        @m80.k
        public final e c() {
            return b.f68495f;
        }

        @m80.k
        public final e d() {
            return b.f68491b;
        }

        @m80.k
        public final e e() {
            return b.f68492c;
        }

        @m80.k
        public final e f() {
            return b.f68494e;
        }

        @m80.k
        public final d g() {
            return b.f68498i;
        }

        @m80.k
        public final e h() {
            return b.f68490a;
        }

        @m80.k
        public final d i() {
            return b.f68499j;
        }

        @m80.k
        public final e j() {
            return b.f68493d;
        }

        @m80.k
        public final c k() {
            return b.f68497h;
        }

        @m80.k
        public final d l() {
            return b.f68500k;
        }

        @m80.k
        public final f50.i<b> serializer() {
            return x40.l.f97446a;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @a0(with = x40.b.class)
    /* renamed from: kotlinx.datetime.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0827b extends b {

        @m80.k
        public static final a Companion = new a(null);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlinx.datetime.b$b$a */
        public static final class a {
            public a() {
            }

            @m80.k
            public final f50.i<AbstractC0827b> serializer() {
                return x40.b.f97413a;
            }

            public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
                this();
            }
        }

        public /* synthetic */ AbstractC0827b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public AbstractC0827b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @a0(with = x40.p.class)
    @u0({"SMAP\nDateTimeUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeUnit.kt\nkotlinx/datetime/DateTimeUnit$DayBased\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    public static final class c extends AbstractC0827b {

        @m80.k
        public static final a Companion = new a(null);

        /* renamed from: m, reason: collision with root package name */
        public final int f68502m;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            public a() {
            }

            @m80.k
            public final f50.i<c> serializer() {
                return x40.p.f97452a;
            }

            public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
                this();
            }
        }

        public c(int i11) {
            super(null);
            this.f68502m = i11;
            if (i11 > 0) {
                return;
            }
            throw new IllegalArgumentException(("Unit duration must be positive, but was " + i11 + " days.").toString());
        }

        public boolean equals(@m80.l Object obj) {
            if (this != obj) {
                return (obj instanceof c) && this.f68502m == ((c) obj).f68502m;
            }
            return true;
        }

        public int hashCode() {
            return this.f68502m ^ 65536;
        }

        public final int p() {
            return this.f68502m;
        }

        @Override // kotlinx.datetime.b
        @m80.k
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public c o(int i11) {
            return new c(t40.e.c(this.f68502m, i11));
        }

        @m80.k
        public String toString() {
            int i11 = this.f68502m;
            return i11 % 7 == 0 ? m(i11 / 7, "WEEK") : m(i11, "DAY");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @a0(with = n0.class)
    @u0({"SMAP\nDateTimeUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeUnit.kt\nkotlinx/datetime/DateTimeUnit$MonthBased\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    public static final class d extends AbstractC0827b {

        @m80.k
        public static final a Companion = new a(null);

        /* renamed from: m, reason: collision with root package name */
        public final int f68503m;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            public a() {
            }

            @m80.k
            public final f50.i<d> serializer() {
                return n0.f97448a;
            }

            public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
                this();
            }
        }

        public d(int i11) {
            super(null);
            this.f68503m = i11;
            if (i11 > 0) {
                return;
            }
            throw new IllegalArgumentException(("Unit duration must be positive, but was " + i11 + " months.").toString());
        }

        public boolean equals(@m80.l Object obj) {
            if (this != obj) {
                return (obj instanceof d) && this.f68503m == ((d) obj).f68503m;
            }
            return true;
        }

        public int hashCode() {
            return this.f68503m ^ 131072;
        }

        public final int p() {
            return this.f68503m;
        }

        @Override // kotlinx.datetime.b
        @m80.k
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public d o(int i11) {
            return new d(t40.e.c(this.f68503m, i11));
        }

        @m80.k
        public String toString() {
            int i11 = this.f68503m;
            return i11 % RotateLoadingLayout.f35182s == 0 ? m(i11 / RotateLoadingLayout.f35182s, "CENTURY") : i11 % 12 == 0 ? m(i11 / 12, "YEAR") : i11 % 3 == 0 ? m(i11 / 3, "QUARTER") : m(i11, "MONTH");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @a0(with = s0.class)
    @u0({"SMAP\nDateTimeUnit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeUnit.kt\nkotlinx/datetime/DateTimeUnit$TimeBased\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    public static final class e extends b {

        @m80.k
        public static final a Companion = new a(null);

        /* renamed from: m, reason: collision with root package name */
        public final long f68504m;

        /* renamed from: n, reason: collision with root package name */
        @m80.k
        public final String f68505n;

        /* renamed from: o, reason: collision with root package name */
        public final long f68506o;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a {
            public a() {
            }

            @m80.k
            public final f50.i<e> serializer() {
                return s0.f97460a;
            }

            public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
                this();
            }
        }

        public e(long j11) {
            super(null);
            this.f68504m = j11;
            if (j11 <= 0) {
                throw new IllegalArgumentException(("Unit duration must be positive, but was " + j11 + " ns.").toString());
            }
            if (j11 % t40.b.f89493k == 0) {
                this.f68505n = "HOUR";
                this.f68506o = j11 / t40.b.f89493k;
                return;
            }
            if (j11 % t40.b.f89492j == 0) {
                this.f68505n = "MINUTE";
                this.f68506o = j11 / t40.b.f89492j;
                return;
            }
            long j12 = 1000000000;
            if (j11 % j12 == 0) {
                this.f68505n = "SECOND";
                this.f68506o = j11 / j12;
                return;
            }
            long j13 = 1000000;
            if (j11 % j13 == 0) {
                this.f68505n = "MILLISECOND";
                this.f68506o = j11 / j13;
                return;
            }
            long j14 = 1000;
            if (j11 % j14 == 0) {
                this.f68505n = "MICROSECOND";
                this.f68506o = j11 / j14;
            } else {
                this.f68505n = "NANOSECOND";
                this.f68506o = j11;
            }
        }

        public boolean equals(@m80.l Object obj) {
            if (this != obj) {
                return (obj instanceof e) && this.f68504m == ((e) obj).f68504m;
            }
            return true;
        }

        public int hashCode() {
            long j11 = this.f68504m;
            return ((int) (j11 >> 32)) ^ ((int) j11);
        }

        public final long p() {
            e.a aVar = kotlin.time.e.f67757b;
            return kotlin.time.f.x(this.f68504m, DurationUnit.NANOSECONDS);
        }

        public final long q() {
            return this.f68504m;
        }

        @Override // kotlinx.datetime.b
        @m80.k
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public e o(int i11) {
            return new e(t40.e.d(this.f68504m, i11));
        }

        @m80.k
        public String toString() {
            return n(this.f68506o, this.f68505n);
        }
    }

    static {
        e eVar = new e(1L);
        f68490a = eVar;
        e o11 = eVar.o(1000);
        f68491b = o11;
        e o12 = o11.o(1000);
        f68492c = o12;
        e o13 = o12.o(1000);
        f68493d = o13;
        e o14 = o13.o(60);
        f68494e = o14;
        f68495f = o14.o(60);
        c cVar = new c(1);
        f68496g = cVar;
        f68497h = cVar.o(7);
        d dVar = new d(1);
        f68498i = dVar;
        f68499j = dVar.o(3);
        d o15 = dVar.o(12);
        f68500k = o15;
        f68501l = o15.o(100);
    }

    public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
        this();
    }

    @m80.k
    public final String m(int i11, @m80.k String unit) {
        g0.p(unit, "unit");
        if (i11 == 1) {
            return unit;
        }
        return i11 + '-' + unit;
    }

    @m80.k
    public final String n(long j11, @m80.k String unit) {
        g0.p(unit, "unit");
        if (j11 == 1) {
            return unit;
        }
        return j11 + '-' + unit;
    }

    @m80.k
    public abstract b o(int i11);

    public b() {
    }
}
