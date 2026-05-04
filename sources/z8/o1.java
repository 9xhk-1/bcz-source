package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o1 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101857c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<o1, a> f101858d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final l1 f101859a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101860b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<o1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.b(l1.f101744f.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k o1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserDakaSpecialDay");
            protocol.Q6("date", 1, (byte) 12);
            l1.f101744f.write(protocol, struct.f101859a);
            protocol.N2();
            protocol.Q6(com.baicizhan.main.activity.schedule_v2.e.f19255e, 2, (byte) 11);
            protocol.p1(struct.f101860b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public o1(@m80.k l1 date, @m80.k String img_url) {
        kotlin.jvm.internal.g0.p(date, "date");
        kotlin.jvm.internal.g0.p(img_url, "img_url");
        this.f101859a = date;
        this.f101860b = img_url;
    }

    public static /* synthetic */ o1 d(o1 o1Var, l1 l1Var, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l1Var = o1Var.f101859a;
        }
        if ((i11 & 2) != 0) {
            str = o1Var.f101860b;
        }
        return o1Var.c(l1Var, str);
    }

    @m80.k
    public final l1 a() {
        return this.f101859a;
    }

    @m80.k
    public final String b() {
        return this.f101860b;
    }

    @m80.k
    public final o1 c(@m80.k l1 date, @m80.k String img_url) {
        kotlin.jvm.internal.g0.p(date, "date");
        kotlin.jvm.internal.g0.p(img_url, "img_url");
        return new o1(date, img_url);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return kotlin.jvm.internal.g0.g(this.f101859a, o1Var.f101859a) && kotlin.jvm.internal.g0.g(this.f101860b, o1Var.f101860b);
    }

    public int hashCode() {
        return (this.f101859a.hashCode() * 31) + this.f101860b.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserDakaSpecialDay(date=" + this.f101859a + ", img_url=" + this.f101860b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101858d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserDakaSpecialDay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDakaSpecialDay.kt\ncom/baicizhan/biz/online/user_study_api/UserDakaSpecialDay$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
    public static final class a implements ts.f<o1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public l1 f101861a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101862b;

        public a() {
            this.f101861a = null;
            this.f101862b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o1 build() {
            l1 l1Var = this.f101861a;
            if (l1Var == null) {
                throw new IllegalStateException("Required field 'date' is missing");
            }
            String str = this.f101862b;
            if (str != null) {
                return new o1(l1Var, str);
            }
            throw new IllegalStateException("Required field 'img_url' is missing");
        }

        @m80.k
        public final a b(@m80.k l1 date) {
            kotlin.jvm.internal.g0.p(date, "date");
            this.f101861a = date;
            return this;
        }

        @m80.k
        public final a c(@m80.k String img_url) {
            kotlin.jvm.internal.g0.p(img_url, "img_url");
            this.f101862b = img_url;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101861a = null;
            this.f101862b = null;
        }

        public a(@m80.k o1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101861a = source.f101859a;
            this.f101862b = source.f101860b;
        }
    }
}
