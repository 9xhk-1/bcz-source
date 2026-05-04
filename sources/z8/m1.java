package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m1 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f101769g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<m1, a> f101770h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101771a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101772b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<l1> f101773c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101774d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final l1 f101775e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final List<p1> f101776f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<m1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m1 read(@m80.k ws.i protocol, @m80.k a builder) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(builder, "builder");
            protocol.u0();
            while (true) {
                ws.d a62 = protocol.a6();
                byte b11 = a62.f96796b;
                if (b11 == 0) {
                    protocol.I4();
                    return builder.build();
                }
                int i11 = 0;
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i12 = v42.f96838b;
                            while (i11 < i12) {
                                arrayList.add(l1.f101744f.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.e(arrayList);
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(l1.f101744f.read(protocol));
                            break;
                        }
                    case 6:
                        if (b11 != 15) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            ws.f v43 = protocol.v4();
                            ArrayList arrayList2 = new ArrayList(v43.f96838b);
                            int i13 = v43.f96838b;
                            while (i11 < i13) {
                                arrayList2.add(p1.f101880e.read(protocol));
                                i11++;
                            }
                            protocol.l8();
                            builder.f(arrayList2);
                            break;
                        }
                    default:
                        at.b.a(protocol, b11);
                        break;
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k m1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserDakaRequest");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f101771a);
            protocol.N2();
            protocol.Q6("count", 2, (byte) 8);
            protocol.l5(struct.f101772b);
            protocol.N2();
            protocol.Q6("daka_dates", 3, (byte) 15);
            protocol.y2((byte) 12, struct.f101773c.size());
            Iterator<l1> it = struct.f101773c.iterator();
            while (it.hasNext()) {
                l1.f101744f.write(protocol, it.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.Q6("timezone", 4, (byte) 11);
            protocol.p1(struct.f101774d);
            protocol.N2();
            protocol.Q6("client_date", 5, (byte) 12);
            l1.f101744f.write(protocol, struct.f101775e);
            protocol.N2();
            protocol.Q6("poster_topic_ids", 6, (byte) 15);
            protocol.y2((byte) 12, struct.f101776f.size());
            Iterator<p1> it2 = struct.f101776f.iterator();
            while (it2.hasNext()) {
                p1.f101880e.write(protocol, it2.next());
            }
            protocol.i5();
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public m1(int i11, int i12, @m80.k List<l1> daka_dates, @m80.k String timezone, @m80.k l1 client_date, @m80.k List<p1> poster_topic_ids) {
        kotlin.jvm.internal.g0.p(daka_dates, "daka_dates");
        kotlin.jvm.internal.g0.p(timezone, "timezone");
        kotlin.jvm.internal.g0.p(client_date, "client_date");
        kotlin.jvm.internal.g0.p(poster_topic_ids, "poster_topic_ids");
        this.f101771a = i11;
        this.f101772b = i12;
        this.f101773c = daka_dates;
        this.f101774d = timezone;
        this.f101775e = client_date;
        this.f101776f = poster_topic_ids;
    }

    public static /* synthetic */ m1 h(m1 m1Var, int i11, int i12, List list, String str, l1 l1Var, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = m1Var.f101771a;
        }
        if ((i13 & 2) != 0) {
            i12 = m1Var.f101772b;
        }
        if ((i13 & 4) != 0) {
            list = m1Var.f101773c;
        }
        if ((i13 & 8) != 0) {
            str = m1Var.f101774d;
        }
        if ((i13 & 16) != 0) {
            l1Var = m1Var.f101775e;
        }
        if ((i13 & 32) != 0) {
            list2 = m1Var.f101776f;
        }
        l1 l1Var2 = l1Var;
        List list3 = list2;
        return m1Var.g(i11, i12, list, str, l1Var2, list3);
    }

    public final int a() {
        return this.f101771a;
    }

    public final int b() {
        return this.f101772b;
    }

    @m80.k
    public final List<l1> c() {
        return this.f101773c;
    }

    @m80.k
    public final String d() {
        return this.f101774d;
    }

    @m80.k
    public final l1 e() {
        return this.f101775e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f101771a == m1Var.f101771a && this.f101772b == m1Var.f101772b && kotlin.jvm.internal.g0.g(this.f101773c, m1Var.f101773c) && kotlin.jvm.internal.g0.g(this.f101774d, m1Var.f101774d) && kotlin.jvm.internal.g0.g(this.f101775e, m1Var.f101775e) && kotlin.jvm.internal.g0.g(this.f101776f, m1Var.f101776f);
    }

    @m80.k
    public final List<p1> f() {
        return this.f101776f;
    }

    @m80.k
    public final m1 g(int i11, int i12, @m80.k List<l1> daka_dates, @m80.k String timezone, @m80.k l1 client_date, @m80.k List<p1> poster_topic_ids) {
        kotlin.jvm.internal.g0.p(daka_dates, "daka_dates");
        kotlin.jvm.internal.g0.p(timezone, "timezone");
        kotlin.jvm.internal.g0.p(client_date, "client_date");
        kotlin.jvm.internal.g0.p(poster_topic_ids, "poster_topic_ids");
        return new m1(i11, i12, daka_dates, timezone, client_date, poster_topic_ids);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f101771a) * 31) + Integer.hashCode(this.f101772b)) * 31) + this.f101773c.hashCode()) * 31) + this.f101774d.hashCode()) * 31) + this.f101775e.hashCode()) * 31) + this.f101776f.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserDakaRequest(book_id=" + this.f101771a + ", count=" + this.f101772b + ", daka_dates=" + this.f101773c + ", timezone=" + this.f101774d + ", client_date=" + this.f101775e + ", poster_topic_ids=" + this.f101776f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101770h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserDakaRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDakaRequest.kt\ncom/baicizhan/biz/online/user_study_api/UserDakaRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
    public static final class a implements ts.f<m1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101777a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101778b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public List<l1> f101779c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101780d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public l1 f101781e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public List<p1> f101782f;

        public a() {
            this.f101777a = null;
            this.f101778b = null;
            this.f101779c = null;
            this.f101780d = null;
            this.f101781e = null;
            this.f101782f = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f101777a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m1 build() {
            Integer num = this.f101777a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101778b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'count' is missing");
            }
            int intValue2 = num2.intValue();
            List<l1> list = this.f101779c;
            if (list == null) {
                throw new IllegalStateException("Required field 'daka_dates' is missing");
            }
            String str = this.f101780d;
            if (str == null) {
                throw new IllegalStateException("Required field 'timezone' is missing");
            }
            l1 l1Var = this.f101781e;
            if (l1Var == null) {
                throw new IllegalStateException("Required field 'client_date' is missing");
            }
            List<p1> list2 = this.f101782f;
            if (list2 != null) {
                return new m1(intValue, intValue2, list, str, l1Var, list2);
            }
            throw new IllegalStateException("Required field 'poster_topic_ids' is missing");
        }

        @m80.k
        public final a c(@m80.k l1 client_date) {
            kotlin.jvm.internal.g0.p(client_date, "client_date");
            this.f101781e = client_date;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101778b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.k List<l1> daka_dates) {
            kotlin.jvm.internal.g0.p(daka_dates, "daka_dates");
            this.f101779c = daka_dates;
            return this;
        }

        @m80.k
        public final a f(@m80.k List<p1> poster_topic_ids) {
            kotlin.jvm.internal.g0.p(poster_topic_ids, "poster_topic_ids");
            this.f101782f = poster_topic_ids;
            return this;
        }

        @m80.k
        public final a g(@m80.k String timezone) {
            kotlin.jvm.internal.g0.p(timezone, "timezone");
            this.f101780d = timezone;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101777a = null;
            this.f101778b = null;
            this.f101779c = null;
            this.f101780d = null;
            this.f101781e = null;
            this.f101782f = null;
        }

        public a(@m80.k m1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101777a = Integer.valueOf(source.f101771a);
            this.f101778b = Integer.valueOf(source.f101772b);
            this.f101779c = source.f101773c;
            this.f101780d = source.f101774d;
            this.f101781e = source.f101775e;
            this.f101782f = source.f101776f;
        }
    }
}
