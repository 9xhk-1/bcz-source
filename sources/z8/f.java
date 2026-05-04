package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f101489h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f, a> f101490i = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101491a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101492b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101493c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f101494d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f101495e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101496f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101497g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.h(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
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
                            builder.d(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k f struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("CopperExchangeInfo");
            protocol.Q6("title", 1, (byte) 11);
            protocol.p1(struct.f101491a);
            protocol.N2();
            protocol.Q6("icon", 2, (byte) 11);
            protocol.p1(struct.f101492b);
            protocol.N2();
            protocol.Q6("count", 3, (byte) 11);
            protocol.p1(struct.f101493c);
            protocol.N2();
            protocol.Q6("copper_cost", 4, (byte) 8);
            protocol.l5(struct.f101494d);
            protocol.N2();
            protocol.Q6("copper_hold", 5, (byte) 8);
            protocol.l5(struct.f101495e);
            protocol.N2();
            protocol.Q6(md.j.f73126f, 6, (byte) 11);
            protocol.p1(struct.f101496f);
            protocol.N2();
            protocol.Q6("copper_desc", 7, (byte) 11);
            protocol.p1(struct.f101497g);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public f(@m80.k String title, @m80.k String icon, @m80.k String count, int i11, int i12, @m80.k String jump_url, @m80.k String copper_desc) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(count, "count");
        kotlin.jvm.internal.g0.p(jump_url, "jump_url");
        kotlin.jvm.internal.g0.p(copper_desc, "copper_desc");
        this.f101491a = title;
        this.f101492b = icon;
        this.f101493c = count;
        this.f101494d = i11;
        this.f101495e = i12;
        this.f101496f = jump_url;
        this.f101497g = copper_desc;
    }

    public static /* synthetic */ f i(f fVar, String str, String str2, String str3, int i11, int i12, String str4, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = fVar.f101491a;
        }
        if ((i13 & 2) != 0) {
            str2 = fVar.f101492b;
        }
        if ((i13 & 4) != 0) {
            str3 = fVar.f101493c;
        }
        if ((i13 & 8) != 0) {
            i11 = fVar.f101494d;
        }
        if ((i13 & 16) != 0) {
            i12 = fVar.f101495e;
        }
        if ((i13 & 32) != 0) {
            str4 = fVar.f101496f;
        }
        if ((i13 & 64) != 0) {
            str5 = fVar.f101497g;
        }
        String str6 = str4;
        String str7 = str5;
        int i14 = i12;
        String str8 = str3;
        return fVar.h(str, str2, str8, i11, i14, str6, str7);
    }

    @m80.k
    public final String a() {
        return this.f101491a;
    }

    @m80.k
    public final String b() {
        return this.f101492b;
    }

    @m80.k
    public final String c() {
        return this.f101493c;
    }

    public final int d() {
        return this.f101494d;
    }

    public final int e() {
        return this.f101495e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.g0.g(this.f101491a, fVar.f101491a) && kotlin.jvm.internal.g0.g(this.f101492b, fVar.f101492b) && kotlin.jvm.internal.g0.g(this.f101493c, fVar.f101493c) && this.f101494d == fVar.f101494d && this.f101495e == fVar.f101495e && kotlin.jvm.internal.g0.g(this.f101496f, fVar.f101496f) && kotlin.jvm.internal.g0.g(this.f101497g, fVar.f101497g);
    }

    @m80.k
    public final String f() {
        return this.f101496f;
    }

    @m80.k
    public final String g() {
        return this.f101497g;
    }

    @m80.k
    public final f h(@m80.k String title, @m80.k String icon, @m80.k String count, int i11, int i12, @m80.k String jump_url, @m80.k String copper_desc) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(count, "count");
        kotlin.jvm.internal.g0.p(jump_url, "jump_url");
        kotlin.jvm.internal.g0.p(copper_desc, "copper_desc");
        return new f(title, icon, count, i11, i12, jump_url, copper_desc);
    }

    public int hashCode() {
        return (((((((((((this.f101491a.hashCode() * 31) + this.f101492b.hashCode()) * 31) + this.f101493c.hashCode()) * 31) + Integer.hashCode(this.f101494d)) * 31) + Integer.hashCode(this.f101495e)) * 31) + this.f101496f.hashCode()) * 31) + this.f101497g.hashCode();
    }

    @m80.k
    public String toString() {
        return "CopperExchangeInfo(title=" + this.f101491a + ", icon=" + this.f101492b + ", count=" + this.f101493c + ", copper_cost=" + this.f101494d + ", copper_hold=" + this.f101495e + ", jump_url=" + this.f101496f + ", copper_desc=" + this.f101497g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101490i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCopperExchangeInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopperExchangeInfo.kt\ncom/baicizhan/biz/online/user_study_api/CopperExchangeInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,254:1\n1#2:255\n*E\n"})
    public static final class a implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101498a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101499b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101500c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101501d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101502e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f101503f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f101504g;

        public a() {
            this.f101498a = null;
            this.f101499b = null;
            this.f101500c = null;
            this.f101501d = null;
            this.f101502e = null;
            this.f101503f = null;
            this.f101504g = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f build() {
            String str = this.f101498a;
            if (str == null) {
                throw new IllegalStateException("Required field 'title' is missing");
            }
            String str2 = this.f101499b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'icon' is missing");
            }
            String str3 = this.f101500c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'count' is missing");
            }
            Integer num = this.f101501d;
            if (num == null) {
                throw new IllegalStateException("Required field 'copper_cost' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101502e;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'copper_hold' is missing");
            }
            int intValue2 = num2.intValue();
            String str4 = this.f101503f;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'jump_url' is missing");
            }
            String str5 = this.f101504g;
            if (str5 != null) {
                return new f(str, str2, str3, intValue, intValue2, str4, str5);
            }
            throw new IllegalStateException("Required field 'copper_desc' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101501d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String copper_desc) {
            kotlin.jvm.internal.g0.p(copper_desc, "copper_desc");
            this.f101504g = copper_desc;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101502e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.k String count) {
            kotlin.jvm.internal.g0.p(count, "count");
            this.f101500c = count;
            return this;
        }

        @m80.k
        public final a f(@m80.k String icon) {
            kotlin.jvm.internal.g0.p(icon, "icon");
            this.f101499b = icon;
            return this;
        }

        @m80.k
        public final a g(@m80.k String jump_url) {
            kotlin.jvm.internal.g0.p(jump_url, "jump_url");
            this.f101503f = jump_url;
            return this;
        }

        @m80.k
        public final a h(@m80.k String title) {
            kotlin.jvm.internal.g0.p(title, "title");
            this.f101498a = title;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101498a = null;
            this.f101499b = null;
            this.f101500c = null;
            this.f101501d = null;
            this.f101502e = null;
            this.f101503f = null;
            this.f101504g = null;
        }

        public a(@m80.k f source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101498a = source.f101491a;
            this.f101499b = source.f101492b;
            this.f101500c = source.f101493c;
            this.f101501d = Integer.valueOf(source.f101494d);
            this.f101502e = Integer.valueOf(source.f101495e);
            this.f101503f = source.f101496f;
            this.f101504g = source.f101497g;
        }
    }
}
