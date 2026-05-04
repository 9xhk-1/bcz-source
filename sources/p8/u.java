package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f80180d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<u, a> f80181e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final d1 f80182a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final e1 f80183b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final v f80184c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<u, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.a(v.f80197d.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.c(e1.f79779e.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.d(d1.f79745e.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k u struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("GameHomeInfo");
            protocol.Q6("user_data_info", 1, (byte) 12);
            d1.f79745e.write(protocol, struct.f80182a);
            protocol.N2();
            protocol.Q6("plan_info", 2, (byte) 12);
            e1.f79779e.write(protocol, struct.f80183b);
            protocol.N2();
            protocol.Q6("basic_info", 3, (byte) 12);
            v.f80197d.write(protocol, struct.f80184c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public u(@m80.k d1 user_data_info, @m80.k e1 plan_info, @m80.k v basic_info) {
        kotlin.jvm.internal.g0.p(user_data_info, "user_data_info");
        kotlin.jvm.internal.g0.p(plan_info, "plan_info");
        kotlin.jvm.internal.g0.p(basic_info, "basic_info");
        this.f80182a = user_data_info;
        this.f80183b = plan_info;
        this.f80184c = basic_info;
    }

    public static /* synthetic */ u e(u uVar, d1 d1Var, e1 e1Var, v vVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d1Var = uVar.f80182a;
        }
        if ((i11 & 2) != 0) {
            e1Var = uVar.f80183b;
        }
        if ((i11 & 4) != 0) {
            vVar = uVar.f80184c;
        }
        return uVar.d(d1Var, e1Var, vVar);
    }

    @m80.k
    public final d1 a() {
        return this.f80182a;
    }

    @m80.k
    public final e1 b() {
        return this.f80183b;
    }

    @m80.k
    public final v c() {
        return this.f80184c;
    }

    @m80.k
    public final u d(@m80.k d1 user_data_info, @m80.k e1 plan_info, @m80.k v basic_info) {
        kotlin.jvm.internal.g0.p(user_data_info, "user_data_info");
        kotlin.jvm.internal.g0.p(plan_info, "plan_info");
        kotlin.jvm.internal.g0.p(basic_info, "basic_info");
        return new u(user_data_info, plan_info, basic_info);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.g0.g(this.f80182a, uVar.f80182a) && kotlin.jvm.internal.g0.g(this.f80183b, uVar.f80183b) && kotlin.jvm.internal.g0.g(this.f80184c, uVar.f80184c);
    }

    public int hashCode() {
        return (((this.f80182a.hashCode() * 31) + this.f80183b.hashCode()) * 31) + this.f80184c.hashCode();
    }

    @m80.k
    public String toString() {
        return "GameHomeInfo(user_data_info=" + this.f80182a + ", plan_info=" + this.f80183b + ", basic_info=" + this.f80184c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80181e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nGameHomeInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameHomeInfo.kt\ncom/baicizhan/biz/online/game_api/GameHomeInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
    public static final class a implements ts.f<u> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public d1 f80185a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public e1 f80186b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public v f80187c;

        public a() {
            this.f80185a = null;
            this.f80186b = null;
            this.f80187c = null;
        }

        @m80.k
        public final a a(@m80.k v basic_info) {
            kotlin.jvm.internal.g0.p(basic_info, "basic_info");
            this.f80187c = basic_info;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u build() {
            d1 d1Var = this.f80185a;
            if (d1Var == null) {
                throw new IllegalStateException("Required field 'user_data_info' is missing");
            }
            e1 e1Var = this.f80186b;
            if (e1Var == null) {
                throw new IllegalStateException("Required field 'plan_info' is missing");
            }
            v vVar = this.f80187c;
            if (vVar != null) {
                return new u(d1Var, e1Var, vVar);
            }
            throw new IllegalStateException("Required field 'basic_info' is missing");
        }

        @m80.k
        public final a c(@m80.k e1 plan_info) {
            kotlin.jvm.internal.g0.p(plan_info, "plan_info");
            this.f80186b = plan_info;
            return this;
        }

        @m80.k
        public final a d(@m80.k d1 user_data_info) {
            kotlin.jvm.internal.g0.p(user_data_info, "user_data_info");
            this.f80185a = user_data_info;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80185a = null;
            this.f80186b = null;
            this.f80187c = null;
        }

        public a(@m80.k u source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80185a = source.f80182a;
            this.f80186b = source.f80183b;
            this.f80187c = source.f80184c;
        }
    }
}
