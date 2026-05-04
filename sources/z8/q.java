package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class q implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f101887h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<q, a> f101888i = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101889a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101890b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f101891c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101892d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101893e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101894f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Boolean f101895g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<q, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 7:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Boolean.valueOf(protocol.readBool()));
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
        public void write(@m80.k ws.i protocol, @m80.k q struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("EducationInfo");
            if (struct.f101889a != null) {
                protocol.Q6("school_id", 1, (byte) 8);
                protocol.l5(struct.f101889a.intValue());
                protocol.N2();
            }
            if (struct.f101890b != null) {
                protocol.Q6("school_name", 2, (byte) 11);
                protocol.p1(struct.f101890b);
                protocol.N2();
            }
            if (struct.f101891c != null) {
                protocol.Q6("school_year", 3, (byte) 10);
                protocol.q7(struct.f101891c.longValue());
                protocol.N2();
            }
            if (struct.f101892d != null) {
                protocol.Q6("major_id", 4, (byte) 8);
                protocol.l5(struct.f101892d.intValue());
                protocol.N2();
            }
            if (struct.f101893e != null) {
                protocol.Q6("school_major", 5, (byte) 11);
                protocol.p1(struct.f101893e);
                protocol.N2();
            }
            if (struct.f101894f != null) {
                protocol.Q6("school_bg", 6, (byte) 8);
                protocol.l5(struct.f101894f.intValue());
                protocol.N2();
            }
            if (struct.f101895g != null) {
                protocol.Q6("is_university", 7, (byte) 2);
                protocol.a4(struct.f101895g.booleanValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public q(@m80.l Integer num, @m80.l String str, @m80.l Long l11, @m80.l Integer num2, @m80.l String str2, @m80.l Integer num3, @m80.l Boolean bool) {
        this.f101889a = num;
        this.f101890b = str;
        this.f101891c = l11;
        this.f101892d = num2;
        this.f101893e = str2;
        this.f101894f = num3;
        this.f101895g = bool;
    }

    public static /* synthetic */ q i(q qVar, Integer num, String str, Long l11, Integer num2, String str2, Integer num3, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = qVar.f101889a;
        }
        if ((i11 & 2) != 0) {
            str = qVar.f101890b;
        }
        if ((i11 & 4) != 0) {
            l11 = qVar.f101891c;
        }
        if ((i11 & 8) != 0) {
            num2 = qVar.f101892d;
        }
        if ((i11 & 16) != 0) {
            str2 = qVar.f101893e;
        }
        if ((i11 & 32) != 0) {
            num3 = qVar.f101894f;
        }
        if ((i11 & 64) != 0) {
            bool = qVar.f101895g;
        }
        Integer num4 = num3;
        Boolean bool2 = bool;
        String str3 = str2;
        Long l12 = l11;
        return qVar.h(num, str, l12, num2, str3, num4, bool2);
    }

    @m80.l
    public final Integer a() {
        return this.f101889a;
    }

    @m80.l
    public final String b() {
        return this.f101890b;
    }

    @m80.l
    public final Long c() {
        return this.f101891c;
    }

    @m80.l
    public final Integer d() {
        return this.f101892d;
    }

    @m80.l
    public final String e() {
        return this.f101893e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.g0.g(this.f101889a, qVar.f101889a) && kotlin.jvm.internal.g0.g(this.f101890b, qVar.f101890b) && kotlin.jvm.internal.g0.g(this.f101891c, qVar.f101891c) && kotlin.jvm.internal.g0.g(this.f101892d, qVar.f101892d) && kotlin.jvm.internal.g0.g(this.f101893e, qVar.f101893e) && kotlin.jvm.internal.g0.g(this.f101894f, qVar.f101894f) && kotlin.jvm.internal.g0.g(this.f101895g, qVar.f101895g);
    }

    @m80.l
    public final Integer f() {
        return this.f101894f;
    }

    @m80.l
    public final Boolean g() {
        return this.f101895g;
    }

    @m80.k
    public final q h(@m80.l Integer num, @m80.l String str, @m80.l Long l11, @m80.l Integer num2, @m80.l String str2, @m80.l Integer num3, @m80.l Boolean bool) {
        return new q(num, str, l11, num2, str2, num3, bool);
    }

    public int hashCode() {
        Integer num = this.f101889a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f101890b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.f101891c;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num2 = this.f101892d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f101893e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.f101894f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.f101895g;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "EducationInfo(school_id=" + this.f101889a + ", school_name=" + this.f101890b + ", school_year=" + this.f101891c + ", major_id=" + this.f101892d + ", school_major=" + this.f101893e + ", school_bg=" + this.f101894f + ", is_university=" + this.f101895g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101888i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nEducationInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EducationInfo.kt\ncom/baicizhan/biz/online/user_study_api/EducationInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
    public static final class a implements ts.f<q> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101896a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101897b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f101898c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101899d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f101900e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f101901f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Boolean f101902g;

        public a() {
            this.f101896a = null;
            this.f101897b = null;
            this.f101898c = null;
            this.f101899d = null;
            this.f101900e = null;
            this.f101901f = null;
            this.f101902g = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q build() {
            return new q(this.f101896a, this.f101897b, this.f101898c, this.f101899d, this.f101900e, this.f101901f, this.f101902g);
        }

        @m80.k
        public final a b(@m80.l Boolean bool) {
            this.f101902g = bool;
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f101899d = num;
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f101901f = num;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f101896a = num;
            return this;
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f101900e = str;
            return this;
        }

        @m80.k
        public final a g(@m80.l String str) {
            this.f101897b = str;
            return this;
        }

        @m80.k
        public final a h(@m80.l Long l11) {
            this.f101898c = l11;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101896a = null;
            this.f101897b = null;
            this.f101898c = null;
            this.f101899d = null;
            this.f101900e = null;
            this.f101901f = null;
            this.f101902g = null;
        }

        public a(@m80.k q source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101896a = source.f101889a;
            this.f101897b = source.f101890b;
            this.f101898c = source.f101891c;
            this.f101899d = source.f101892d;
            this.f101900e = source.f101893e;
            this.f101901f = source.f101894f;
            this.f101902g = source.f101895g;
        }
    }
}
