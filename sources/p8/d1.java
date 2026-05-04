package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d1 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f79744d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d1, a> f79745e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final g1 f79746a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final i1 f79747b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f79748c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<d1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 8) {
                            builder.b(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.c(i1.f79927g.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.d(g1.f79833d.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k d1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserDataInfo");
            protocol.Q6("vip_info", 1, (byte) 12);
            g1.f79833d.write(protocol, struct.f79746a);
            protocol.N2();
            protocol.Q6("energy_info", 2, (byte) 12);
            i1.f79927g.write(protocol, struct.f79747b);
            protocol.N2();
            protocol.Q6("copper", 3, (byte) 8);
            protocol.l5(struct.f79748c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public d1(@m80.k g1 vip_info, @m80.k i1 energy_info, int i11) {
        kotlin.jvm.internal.g0.p(vip_info, "vip_info");
        kotlin.jvm.internal.g0.p(energy_info, "energy_info");
        this.f79746a = vip_info;
        this.f79747b = energy_info;
        this.f79748c = i11;
    }

    public static /* synthetic */ d1 e(d1 d1Var, g1 g1Var, i1 i1Var, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            g1Var = d1Var.f79746a;
        }
        if ((i12 & 2) != 0) {
            i1Var = d1Var.f79747b;
        }
        if ((i12 & 4) != 0) {
            i11 = d1Var.f79748c;
        }
        return d1Var.d(g1Var, i1Var, i11);
    }

    @m80.k
    public final g1 a() {
        return this.f79746a;
    }

    @m80.k
    public final i1 b() {
        return this.f79747b;
    }

    public final int c() {
        return this.f79748c;
    }

    @m80.k
    public final d1 d(@m80.k g1 vip_info, @m80.k i1 energy_info, int i11) {
        kotlin.jvm.internal.g0.p(vip_info, "vip_info");
        kotlin.jvm.internal.g0.p(energy_info, "energy_info");
        return new d1(vip_info, energy_info, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return kotlin.jvm.internal.g0.g(this.f79746a, d1Var.f79746a) && kotlin.jvm.internal.g0.g(this.f79747b, d1Var.f79747b) && this.f79748c == d1Var.f79748c;
    }

    public int hashCode() {
        return (((this.f79746a.hashCode() * 31) + this.f79747b.hashCode()) * 31) + Integer.hashCode(this.f79748c);
    }

    @m80.k
    public String toString() {
        return "UserDataInfo(vip_info=" + this.f79746a + ", energy_info=" + this.f79747b + ", copper=" + this.f79748c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79745e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserDataInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDataInfo.kt\ncom/baicizhan/biz/online/game_api/UserDataInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
    public static final class a implements ts.f<d1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public g1 f79749a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public i1 f79750b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f79751c;

        public a() {
            this.f79749a = null;
            this.f79750b = null;
            this.f79751c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d1 build() {
            g1 g1Var = this.f79749a;
            if (g1Var == null) {
                throw new IllegalStateException("Required field 'vip_info' is missing");
            }
            i1 i1Var = this.f79750b;
            if (i1Var == null) {
                throw new IllegalStateException("Required field 'energy_info' is missing");
            }
            Integer num = this.f79751c;
            if (num != null) {
                return new d1(g1Var, i1Var, num.intValue());
            }
            throw new IllegalStateException("Required field 'copper' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f79751c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k i1 energy_info) {
            kotlin.jvm.internal.g0.p(energy_info, "energy_info");
            this.f79750b = energy_info;
            return this;
        }

        @m80.k
        public final a d(@m80.k g1 vip_info) {
            kotlin.jvm.internal.g0.p(vip_info, "vip_info");
            this.f79749a = vip_info;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79749a = null;
            this.f79750b = null;
            this.f79751c = null;
        }

        public a(@m80.k d1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79749a = source.f79746a;
            this.f79750b = source.f79747b;
            this.f79751c = Integer.valueOf(source.f79748c);
        }
    }
}
