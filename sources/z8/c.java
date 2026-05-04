package z8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final C1387c f101196g = new C1387c(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c, a> f101197h = new b();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101198a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101199b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101200c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final List<d> f101201d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101202e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101203f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ts.a<c, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol, @m80.k a builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 == 8) {
                            builder.f(protocol.s8());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 2:
                        if (b11 == 11) {
                            builder.c(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 3:
                        if (b11 == 8) {
                            builder.b(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 4:
                        if (b11 == 15) {
                            ws.f v42 = protocol.v4();
                            ArrayList arrayList = new ArrayList(v42.f96838b);
                            int i11 = v42.f96838b;
                            for (int i12 = 0; i12 < i11; i12++) {
                                arrayList.add(d.f101402h.read(protocol));
                            }
                            protocol.l8();
                            builder.g(arrayList);
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 5:
                        if (b11 == 8) {
                            builder.e(Integer.valueOf(protocol.s8()));
                            break;
                        } else {
                            at.b.a(protocol, b11);
                            break;
                        }
                    case 6:
                        if (b11 == 11) {
                            builder.d(protocol.readString());
                            break;
                        } else {
                            at.b.a(protocol, b11);
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
        public void write(@m80.k ws.i protocol, @m80.k c struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("CalendarDailyInfo");
            protocol.Q6("state", 1, (byte) 8);
            protocol.l5(struct.f101198a);
            protocol.N2();
            if (struct.f101199b != null) {
                protocol.Q6(kc.o.L, 2, (byte) 11);
                protocol.p1(struct.f101199b);
                protocol.N2();
            }
            if (struct.f101200c != null) {
                protocol.Q6("daily_word_count", 3, (byte) 8);
                protocol.l5(struct.f101200c.intValue());
                protocol.N2();
            }
            if (struct.f101201d != null) {
                protocol.Q6(xd.a.f98002r, 4, (byte) 15);
                protocol.y2((byte) 12, struct.f101201d.size());
                Iterator<d> it = struct.f101201d.iterator();
                while (it.hasNext()) {
                    d.f101402h.write(protocol, it.next());
                }
                protocol.i5();
                protocol.N2();
            }
            if (struct.f101202e != null) {
                protocol.Q6("resign_state", 5, (byte) 8);
                protocol.l5(struct.f101202e.intValue());
                protocol.N2();
            }
            if (struct.f101203f != null) {
                protocol.Q6("resign_message", 6, (byte) 11);
                protocol.p1(struct.f101203f);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: z8.c$c, reason: collision with other inner class name */
    public static final class C1387c {
        public /* synthetic */ C1387c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public C1387c() {
        }
    }

    public c(int i11, @m80.l String str, @m80.l Integer num, @m80.l List<d> list, @m80.l Integer num2, @m80.l String str2) {
        this.f101198a = i11;
        this.f101199b = str;
        this.f101200c = num;
        this.f101201d = list;
        this.f101202e = num2;
        this.f101203f = str2;
    }

    public static /* synthetic */ c h(c cVar, int i11, String str, Integer num, List list, Integer num2, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cVar.f101198a;
        }
        if ((i12 & 2) != 0) {
            str = cVar.f101199b;
        }
        if ((i12 & 4) != 0) {
            num = cVar.f101200c;
        }
        if ((i12 & 8) != 0) {
            list = cVar.f101201d;
        }
        if ((i12 & 16) != 0) {
            num2 = cVar.f101202e;
        }
        if ((i12 & 32) != 0) {
            str2 = cVar.f101203f;
        }
        Integer num3 = num2;
        String str3 = str2;
        return cVar.g(i11, str, num, list, num3, str3);
    }

    public final int a() {
        return this.f101198a;
    }

    @m80.l
    public final String b() {
        return this.f101199b;
    }

    @m80.l
    public final Integer c() {
        return this.f101200c;
    }

    @m80.l
    public final List<d> d() {
        return this.f101201d;
    }

    @m80.l
    public final Integer e() {
        return this.f101202e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f101198a == cVar.f101198a && kotlin.jvm.internal.g0.g(this.f101199b, cVar.f101199b) && kotlin.jvm.internal.g0.g(this.f101200c, cVar.f101200c) && kotlin.jvm.internal.g0.g(this.f101201d, cVar.f101201d) && kotlin.jvm.internal.g0.g(this.f101202e, cVar.f101202e) && kotlin.jvm.internal.g0.g(this.f101203f, cVar.f101203f);
    }

    @m80.l
    public final String f() {
        return this.f101203f;
    }

    @m80.k
    public final c g(int i11, @m80.l String str, @m80.l Integer num, @m80.l List<d> list, @m80.l Integer num2, @m80.l String str2) {
        return new c(i11, str, num, list, num2, str2);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f101198a) * 31;
        String str = this.f101199b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f101200c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<d> list = this.f101201d;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f101202e;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f101203f;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "CalendarDailyInfo(state=" + this.f101198a + ", hint=" + this.f101199b + ", daily_word_count=" + this.f101200c + ", words=" + this.f101201d + ", resign_state=" + this.f101202e + ", resign_message=" + this.f101203f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101197h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCalendarDailyInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarDailyInfo.kt\ncom/baicizhan/biz/online/user_study_api/CalendarDailyInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1#2:260\n*E\n"})
    public static final class a implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101204a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101205b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101206c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public List<d> f101207d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101208e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f101209f;

        public a() {
            this.f101204a = null;
            this.f101205b = null;
            this.f101206c = null;
            this.f101207d = null;
            this.f101208e = null;
            this.f101209f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c build() {
            Integer num = this.f101204a;
            if (num != null) {
                return new c(num.intValue(), this.f101205b, this.f101206c, this.f101207d, this.f101208e, this.f101209f);
            }
            throw new IllegalStateException("Required field 'state' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f101206c = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f101205b = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f101209f = str;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f101208e = num;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f101204a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(@m80.l List<d> list) {
            this.f101207d = list;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101204a = null;
            this.f101205b = null;
            this.f101206c = null;
            this.f101207d = null;
            this.f101208e = null;
            this.f101209f = null;
        }

        public a(@m80.k c source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101204a = Integer.valueOf(source.f101198a);
            this.f101205b = source.f101199b;
            this.f101206c = source.f101200c;
            this.f101207d = source.f101201d;
            this.f101208e = source.f101202e;
            this.f101209f = source.f101203f;
        }
    }
}
