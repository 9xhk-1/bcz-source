package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d2 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f101445g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d2, a> f101446h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101447a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101448b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101449c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f101450d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101451e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Boolean f101452f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<d2, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d2 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d2 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.d(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Boolean.valueOf(protocol.readBool()));
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
        public void write(@m80.k ws.i protocol, @m80.k d2 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserStudyConfig");
            protocol.Q6("fast_mode", 1, (byte) 8);
            protocol.l5(struct.f101447a);
            protocol.N2();
            protocol.Q6("chn_mode", 2, (byte) 8);
            protocol.l5(struct.f101448b);
            protocol.N2();
            protocol.Q6("listening_mode", 3, (byte) 8);
            protocol.l5(struct.f101449c);
            protocol.N2();
            protocol.Q6("spell_mode", 4, (byte) 8);
            protocol.l5(struct.f101450d);
            protocol.N2();
            if (struct.f101451e != null) {
                protocol.Q6("extra_config", 5, (byte) 11);
                protocol.p1(struct.f101451e);
                protocol.N2();
            }
            if (struct.f101452f != null) {
                protocol.Q6("is_pi_mode", 6, (byte) 2);
                protocol.a4(struct.f101452f.booleanValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public d2(int i11, int i12, int i13, int i14, @m80.l String str, @m80.l Boolean bool) {
        this.f101447a = i11;
        this.f101448b = i12;
        this.f101449c = i13;
        this.f101450d = i14;
        this.f101451e = str;
        this.f101452f = bool;
    }

    public static /* synthetic */ d2 h(d2 d2Var, int i11, int i12, int i13, int i14, String str, Boolean bool, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = d2Var.f101447a;
        }
        if ((i15 & 2) != 0) {
            i12 = d2Var.f101448b;
        }
        if ((i15 & 4) != 0) {
            i13 = d2Var.f101449c;
        }
        if ((i15 & 8) != 0) {
            i14 = d2Var.f101450d;
        }
        if ((i15 & 16) != 0) {
            str = d2Var.f101451e;
        }
        if ((i15 & 32) != 0) {
            bool = d2Var.f101452f;
        }
        String str2 = str;
        Boolean bool2 = bool;
        return d2Var.g(i11, i12, i13, i14, str2, bool2);
    }

    public final int a() {
        return this.f101447a;
    }

    public final int b() {
        return this.f101448b;
    }

    public final int c() {
        return this.f101449c;
    }

    public final int d() {
        return this.f101450d;
    }

    @m80.l
    public final String e() {
        return this.f101451e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return this.f101447a == d2Var.f101447a && this.f101448b == d2Var.f101448b && this.f101449c == d2Var.f101449c && this.f101450d == d2Var.f101450d && kotlin.jvm.internal.g0.g(this.f101451e, d2Var.f101451e) && kotlin.jvm.internal.g0.g(this.f101452f, d2Var.f101452f);
    }

    @m80.l
    public final Boolean f() {
        return this.f101452f;
    }

    @m80.k
    public final d2 g(int i11, int i12, int i13, int i14, @m80.l String str, @m80.l Boolean bool) {
        return new d2(i11, i12, i13, i14, str, bool);
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f101447a) * 31) + Integer.hashCode(this.f101448b)) * 31) + Integer.hashCode(this.f101449c)) * 31) + Integer.hashCode(this.f101450d)) * 31;
        String str = this.f101451e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f101452f;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "UserStudyConfig(fast_mode=" + this.f101447a + ", chn_mode=" + this.f101448b + ", listening_mode=" + this.f101449c + ", spell_mode=" + this.f101450d + ", extra_config=" + this.f101451e + ", is_pi_mode=" + this.f101452f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101446h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserStudyConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserStudyConfig.kt\ncom/baicizhan/biz/online/user_study_api/UserStudyConfig$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n1#2:225\n*E\n"})
    public static final class a implements ts.f<d2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101453a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101454b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101455c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101456d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f101457e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Boolean f101458f;

        public a() {
            this.f101453a = null;
            this.f101454b = null;
            this.f101455c = null;
            this.f101456d = null;
            this.f101457e = null;
            this.f101458f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d2 build() {
            Integer num = this.f101453a;
            if (num == null) {
                throw new IllegalStateException("Required field 'fast_mode' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101454b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'chn_mode' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f101455c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'listening_mode' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f101456d;
            if (num4 != null) {
                return new d2(intValue, intValue2, intValue3, num4.intValue(), this.f101457e, this.f101458f);
            }
            throw new IllegalStateException("Required field 'spell_mode' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101454b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f101457e = str;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101453a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.l Boolean bool) {
            this.f101458f = bool;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f101455c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f101456d = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101453a = null;
            this.f101454b = null;
            this.f101455c = null;
            this.f101456d = null;
            this.f101457e = null;
            this.f101458f = null;
        }

        public a(@m80.k d2 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101453a = Integer.valueOf(source.f101447a);
            this.f101454b = Integer.valueOf(source.f101448b);
            this.f101455c = Integer.valueOf(source.f101449c);
            this.f101456d = Integer.valueOf(source.f101450d);
            this.f101457e = source.f101451e;
            this.f101458f = source.f101452f;
        }
    }
}
