package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b1 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f101188d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b1, a> f101189e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final c1 f101190a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final w1 f101191b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final t1 f101192c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<b1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 12) {
                            builder.b(t1.f102062f.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.c(w1.f102206v.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.d(c1.f101217o.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k b1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserBasicInfoPlusV2");
            protocol.Q6(i9.m.f60424b, 1, (byte) 12);
            c1.f101217o.write(protocol, struct.f101190a);
            protocol.N2();
            protocol.Q6("limit_info", 2, (byte) 12);
            w1.f102206v.write(protocol, struct.f101191b);
            protocol.N2();
            protocol.Q6("learn_info", 3, (byte) 12);
            t1.f102062f.write(protocol, struct.f101192c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public b1(@m80.k c1 user_info, @m80.k w1 limit_info, @m80.k t1 learn_info) {
        kotlin.jvm.internal.g0.p(user_info, "user_info");
        kotlin.jvm.internal.g0.p(limit_info, "limit_info");
        kotlin.jvm.internal.g0.p(learn_info, "learn_info");
        this.f101190a = user_info;
        this.f101191b = limit_info;
        this.f101192c = learn_info;
    }

    public static /* synthetic */ b1 e(b1 b1Var, c1 c1Var, w1 w1Var, t1 t1Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c1Var = b1Var.f101190a;
        }
        if ((i11 & 2) != 0) {
            w1Var = b1Var.f101191b;
        }
        if ((i11 & 4) != 0) {
            t1Var = b1Var.f101192c;
        }
        return b1Var.d(c1Var, w1Var, t1Var);
    }

    @m80.k
    public final c1 a() {
        return this.f101190a;
    }

    @m80.k
    public final w1 b() {
        return this.f101191b;
    }

    @m80.k
    public final t1 c() {
        return this.f101192c;
    }

    @m80.k
    public final b1 d(@m80.k c1 user_info, @m80.k w1 limit_info, @m80.k t1 learn_info) {
        kotlin.jvm.internal.g0.p(user_info, "user_info");
        kotlin.jvm.internal.g0.p(limit_info, "limit_info");
        kotlin.jvm.internal.g0.p(learn_info, "learn_info");
        return new b1(user_info, limit_info, learn_info);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return kotlin.jvm.internal.g0.g(this.f101190a, b1Var.f101190a) && kotlin.jvm.internal.g0.g(this.f101191b, b1Var.f101191b) && kotlin.jvm.internal.g0.g(this.f101192c, b1Var.f101192c);
    }

    public int hashCode() {
        return (((this.f101190a.hashCode() * 31) + this.f101191b.hashCode()) * 31) + this.f101192c.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserBasicInfoPlusV2(user_info=" + this.f101190a + ", limit_info=" + this.f101191b + ", learn_info=" + this.f101192c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101189e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserBasicInfoPlusV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBasicInfoPlusV2.kt\ncom/baicizhan/biz/online/user_study_api/UserBasicInfoPlusV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n1#2:144\n*E\n"})
    public static final class a implements ts.f<b1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public c1 f101193a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public w1 f101194b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public t1 f101195c;

        public a() {
            this.f101193a = null;
            this.f101194b = null;
            this.f101195c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b1 build() {
            c1 c1Var = this.f101193a;
            if (c1Var == null) {
                throw new IllegalStateException("Required field 'user_info' is missing");
            }
            w1 w1Var = this.f101194b;
            if (w1Var == null) {
                throw new IllegalStateException("Required field 'limit_info' is missing");
            }
            t1 t1Var = this.f101195c;
            if (t1Var != null) {
                return new b1(c1Var, w1Var, t1Var);
            }
            throw new IllegalStateException("Required field 'learn_info' is missing");
        }

        @m80.k
        public final a b(@m80.k t1 learn_info) {
            kotlin.jvm.internal.g0.p(learn_info, "learn_info");
            this.f101195c = learn_info;
            return this;
        }

        @m80.k
        public final a c(@m80.k w1 limit_info) {
            kotlin.jvm.internal.g0.p(limit_info, "limit_info");
            this.f101194b = limit_info;
            return this;
        }

        @m80.k
        public final a d(@m80.k c1 user_info) {
            kotlin.jvm.internal.g0.p(user_info, "user_info");
            this.f101193a = user_info;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101193a = null;
            this.f101194b = null;
            this.f101195c = null;
        }

        public a(@m80.k b1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101193a = source.f101190a;
            this.f101194b = source.f101191b;
            this.f101195c = source.f101192c;
        }
    }
}
