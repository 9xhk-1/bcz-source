package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f101609d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i0, a> f101610e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101611a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101612b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101613c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<i0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 11) {
                            builder.d(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.a(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k i0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("RecommendationDaka");
            protocol.Q6("banner_url", 1, (byte) 11);
            protocol.p1(struct.f101611a);
            protocol.N2();
            protocol.Q6(md.j.f73126f, 2, (byte) 11);
            protocol.p1(struct.f101612b);
            protocol.N2();
            protocol.Q6(ma.b.f72954w, 3, (byte) 11);
            protocol.p1(struct.f101613c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public i0(@m80.k String banner_url, @m80.k String jump_url, @m80.k String user_type) {
        kotlin.jvm.internal.g0.p(banner_url, "banner_url");
        kotlin.jvm.internal.g0.p(jump_url, "jump_url");
        kotlin.jvm.internal.g0.p(user_type, "user_type");
        this.f101611a = banner_url;
        this.f101612b = jump_url;
        this.f101613c = user_type;
    }

    public static /* synthetic */ i0 e(i0 i0Var, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = i0Var.f101611a;
        }
        if ((i11 & 2) != 0) {
            str2 = i0Var.f101612b;
        }
        if ((i11 & 4) != 0) {
            str3 = i0Var.f101613c;
        }
        return i0Var.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f101611a;
    }

    @m80.k
    public final String b() {
        return this.f101612b;
    }

    @m80.k
    public final String c() {
        return this.f101613c;
    }

    @m80.k
    public final i0 d(@m80.k String banner_url, @m80.k String jump_url, @m80.k String user_type) {
        kotlin.jvm.internal.g0.p(banner_url, "banner_url");
        kotlin.jvm.internal.g0.p(jump_url, "jump_url");
        kotlin.jvm.internal.g0.p(user_type, "user_type");
        return new i0(banner_url, jump_url, user_type);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return kotlin.jvm.internal.g0.g(this.f101611a, i0Var.f101611a) && kotlin.jvm.internal.g0.g(this.f101612b, i0Var.f101612b) && kotlin.jvm.internal.g0.g(this.f101613c, i0Var.f101613c);
    }

    public int hashCode() {
        return (((this.f101611a.hashCode() * 31) + this.f101612b.hashCode()) * 31) + this.f101613c.hashCode();
    }

    @m80.k
    public String toString() {
        return "RecommendationDaka(banner_url=" + this.f101611a + ", jump_url=" + this.f101612b + ", user_type=" + this.f101613c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101610e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRecommendationDaka.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendationDaka.kt\ncom/baicizhan/biz/online/user_study_api/RecommendationDaka$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
    public static final class a implements ts.f<i0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101614a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101615b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101616c;

        public a() {
            this.f101614a = null;
            this.f101615b = null;
            this.f101616c = null;
        }

        @m80.k
        public final a a(@m80.k String banner_url) {
            kotlin.jvm.internal.g0.p(banner_url, "banner_url");
            this.f101614a = banner_url;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i0 build() {
            String str = this.f101614a;
            if (str == null) {
                throw new IllegalStateException("Required field 'banner_url' is missing");
            }
            String str2 = this.f101615b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'jump_url' is missing");
            }
            String str3 = this.f101616c;
            if (str3 != null) {
                return new i0(str, str2, str3);
            }
            throw new IllegalStateException("Required field 'user_type' is missing");
        }

        @m80.k
        public final a c(@m80.k String jump_url) {
            kotlin.jvm.internal.g0.p(jump_url, "jump_url");
            this.f101615b = jump_url;
            return this;
        }

        @m80.k
        public final a d(@m80.k String user_type) {
            kotlin.jvm.internal.g0.p(user_type, "user_type");
            this.f101616c = user_type;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101614a = null;
            this.f101615b = null;
            this.f101616c = null;
        }

        public a(@m80.k i0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101614a = source.f101611a;
            this.f101615b = source.f101612b;
            this.f101616c = source.f101613c;
        }
    }
}
