package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final c f101459g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e, a> f101460h = new b();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101461a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101462b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101463c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f101464d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f101465e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101466f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ts.a<e, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k e struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("CalendarResignInfo");
            protocol.Q6("title", 1, (byte) 11);
            protocol.p1(struct.f101461a);
            protocol.N2();
            protocol.Q6("icon", 2, (byte) 11);
            protocol.p1(struct.f101462b);
            protocol.N2();
            protocol.Q6("count", 3, (byte) 8);
            protocol.l5(struct.f101463c);
            protocol.N2();
            protocol.Q6("copper_cost", 4, (byte) 8);
            protocol.l5(struct.f101464d);
            protocol.N2();
            protocol.Q6("copper_hold", 5, (byte) 8);
            protocol.l5(struct.f101465e);
            protocol.N2();
            protocol.Q6(md.j.f73126f, 6, (byte) 11);
            protocol.p1(struct.f101466f);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public e(@m80.k String title, @m80.k String icon, int i11, int i12, int i13, @m80.k String jump_url) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(jump_url, "jump_url");
        this.f101461a = title;
        this.f101462b = icon;
        this.f101463c = i11;
        this.f101464d = i12;
        this.f101465e = i13;
        this.f101466f = jump_url;
    }

    public static /* synthetic */ e h(e eVar, String str, String str2, int i11, int i12, int i13, String str3, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = eVar.f101461a;
        }
        if ((i14 & 2) != 0) {
            str2 = eVar.f101462b;
        }
        if ((i14 & 4) != 0) {
            i11 = eVar.f101463c;
        }
        if ((i14 & 8) != 0) {
            i12 = eVar.f101464d;
        }
        if ((i14 & 16) != 0) {
            i13 = eVar.f101465e;
        }
        if ((i14 & 32) != 0) {
            str3 = eVar.f101466f;
        }
        int i15 = i13;
        String str4 = str3;
        return eVar.g(str, str2, i11, i12, i15, str4);
    }

    @m80.k
    public final String a() {
        return this.f101461a;
    }

    @m80.k
    public final String b() {
        return this.f101462b;
    }

    public final int c() {
        return this.f101463c;
    }

    public final int d() {
        return this.f101464d;
    }

    public final int e() {
        return this.f101465e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.g0.g(this.f101461a, eVar.f101461a) && kotlin.jvm.internal.g0.g(this.f101462b, eVar.f101462b) && this.f101463c == eVar.f101463c && this.f101464d == eVar.f101464d && this.f101465e == eVar.f101465e && kotlin.jvm.internal.g0.g(this.f101466f, eVar.f101466f);
    }

    @m80.k
    public final String f() {
        return this.f101466f;
    }

    @m80.k
    public final e g(@m80.k String title, @m80.k String icon, int i11, int i12, int i13, @m80.k String jump_url) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(jump_url, "jump_url");
        return new e(title, icon, i11, i12, i13, jump_url);
    }

    public int hashCode() {
        return (((((((((this.f101461a.hashCode() * 31) + this.f101462b.hashCode()) * 31) + Integer.hashCode(this.f101463c)) * 31) + Integer.hashCode(this.f101464d)) * 31) + Integer.hashCode(this.f101465e)) * 31) + this.f101466f.hashCode();
    }

    @m80.k
    public String toString() {
        return "CalendarResignInfo(title=" + this.f101461a + ", icon=" + this.f101462b + ", count=" + this.f101463c + ", copper_cost=" + this.f101464d + ", copper_hold=" + this.f101465e + ", jump_url=" + this.f101466f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101460h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCalendarResignInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarResignInfo.kt\ncom/baicizhan/biz/online/user_study_api/CalendarResignInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
    public static final class a implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101467a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101468b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101469c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101470d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101471e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f101472f;

        public a() {
            this.f101467a = null;
            this.f101468b = null;
            this.f101469c = null;
            this.f101470d = null;
            this.f101471e = null;
            this.f101472f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e build() {
            String str = this.f101467a;
            if (str == null) {
                throw new IllegalStateException("Required field 'title' is missing");
            }
            String str2 = this.f101468b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'icon' is missing");
            }
            Integer num = this.f101469c;
            if (num == null) {
                throw new IllegalStateException("Required field 'count' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101470d;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'copper_cost' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f101471e;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'copper_hold' is missing");
            }
            int intValue3 = num3.intValue();
            String str3 = this.f101472f;
            if (str3 != null) {
                return new e(str, str2, intValue, intValue2, intValue3, str3);
            }
            throw new IllegalStateException("Required field 'jump_url' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101470d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101471e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101469c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.k String icon) {
            kotlin.jvm.internal.g0.p(icon, "icon");
            this.f101468b = icon;
            return this;
        }

        @m80.k
        public final a f(@m80.k String jump_url) {
            kotlin.jvm.internal.g0.p(jump_url, "jump_url");
            this.f101472f = jump_url;
            return this;
        }

        @m80.k
        public final a g(@m80.k String title) {
            kotlin.jvm.internal.g0.p(title, "title");
            this.f101467a = title;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101467a = null;
            this.f101468b = null;
            this.f101469c = null;
            this.f101470d = null;
            this.f101471e = null;
            this.f101472f = null;
        }

        public a(@m80.k e source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101467a = source.f101461a;
            this.f101468b = source.f101462b;
            this.f101469c = Integer.valueOf(source.f101463c);
            this.f101470d = Integer.valueOf(source.f101464d);
            this.f101471e = Integer.valueOf(source.f101465e);
            this.f101472f = source.f101466f;
        }
    }
}
