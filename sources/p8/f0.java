package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f0 implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f79792g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f0, a> f79793h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79794a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79795b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f79796c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final g0 f79797d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f79798e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f79799f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.e(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(g0.f79825e.read(protocol));
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k f0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("RoundAwardInfo");
            protocol.Q6("energy_count", 1, (byte) 8);
            protocol.l5(struct.f79794a);
            protocol.N2();
            protocol.Q6("compass", 2, (byte) 8);
            protocol.l5(struct.f79795b);
            protocol.N2();
            protocol.Q6("study_score", 3, (byte) 8);
            protocol.l5(struct.f79796c);
            protocol.N2();
            if (struct.f79797d != null) {
                protocol.Q6("combo", 4, (byte) 12);
                g0.f79825e.write(protocol, struct.f79797d);
                protocol.N2();
            }
            if (struct.f79798e != null) {
                protocol.Q6("copper", 5, (byte) 8);
                protocol.l5(struct.f79798e.intValue());
                protocol.N2();
            }
            if (struct.f79799f != null) {
                protocol.Q6("snacks_count", 6, (byte) 8);
                protocol.l5(struct.f79799f.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public f0(int i11, int i12, int i13, @m80.l g0 g0Var, @m80.l Integer num, @m80.l Integer num2) {
        this.f79794a = i11;
        this.f79795b = i12;
        this.f79796c = i13;
        this.f79797d = g0Var;
        this.f79798e = num;
        this.f79799f = num2;
    }

    public static /* synthetic */ f0 h(f0 f0Var, int i11, int i12, int i13, g0 g0Var, Integer num, Integer num2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = f0Var.f79794a;
        }
        if ((i14 & 2) != 0) {
            i12 = f0Var.f79795b;
        }
        if ((i14 & 4) != 0) {
            i13 = f0Var.f79796c;
        }
        if ((i14 & 8) != 0) {
            g0Var = f0Var.f79797d;
        }
        if ((i14 & 16) != 0) {
            num = f0Var.f79798e;
        }
        if ((i14 & 32) != 0) {
            num2 = f0Var.f79799f;
        }
        Integer num3 = num;
        Integer num4 = num2;
        return f0Var.g(i11, i12, i13, g0Var, num3, num4);
    }

    public final int a() {
        return this.f79794a;
    }

    public final int b() {
        return this.f79795b;
    }

    public final int c() {
        return this.f79796c;
    }

    @m80.l
    public final g0 d() {
        return this.f79797d;
    }

    @m80.l
    public final Integer e() {
        return this.f79798e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f79794a == f0Var.f79794a && this.f79795b == f0Var.f79795b && this.f79796c == f0Var.f79796c && kotlin.jvm.internal.g0.g(this.f79797d, f0Var.f79797d) && kotlin.jvm.internal.g0.g(this.f79798e, f0Var.f79798e) && kotlin.jvm.internal.g0.g(this.f79799f, f0Var.f79799f);
    }

    @m80.l
    public final Integer f() {
        return this.f79799f;
    }

    @m80.k
    public final f0 g(int i11, int i12, int i13, @m80.l g0 g0Var, @m80.l Integer num, @m80.l Integer num2) {
        return new f0(i11, i12, i13, g0Var, num, num2);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f79794a) * 31) + Integer.hashCode(this.f79795b)) * 31) + Integer.hashCode(this.f79796c)) * 31;
        g0 g0Var = this.f79797d;
        int hashCode2 = (hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31;
        Integer num = this.f79798e;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f79799f;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "RoundAwardInfo(energy_count=" + this.f79794a + ", compass=" + this.f79795b + ", study_score=" + this.f79796c + ", combo=" + this.f79797d + ", copper=" + this.f79798e + ", snacks_count=" + this.f79799f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79793h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRoundAwardInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundAwardInfo.kt\ncom/baicizhan/biz/online/game_api/RoundAwardInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
    public static final class a implements ts.f<f0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79800a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79801b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f79802c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public g0 f79803d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f79804e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f79805f;

        public a() {
            this.f79800a = null;
            this.f79801b = null;
            this.f79802c = null;
            this.f79803d = null;
            this.f79804e = null;
            this.f79805f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f0 build() {
            Integer num = this.f79800a;
            if (num == null) {
                throw new IllegalStateException("Required field 'energy_count' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79801b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'compass' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f79802c;
            if (num3 != null) {
                return new f0(intValue, intValue2, num3.intValue(), this.f79803d, this.f79804e, this.f79805f);
            }
            throw new IllegalStateException("Required field 'study_score' is missing");
        }

        @m80.k
        public final a b(@m80.l g0 g0Var) {
            this.f79803d = g0Var;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79801b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f79804e = num;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f79800a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.l Integer num) {
            this.f79805f = num;
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f79802c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79800a = null;
            this.f79801b = null;
            this.f79802c = null;
            this.f79803d = null;
            this.f79804e = null;
            this.f79805f = null;
        }

        public a(@m80.k f0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79800a = Integer.valueOf(source.f79794a);
            this.f79801b = Integer.valueOf(source.f79795b);
            this.f79802c = Integer.valueOf(source.f79796c);
            this.f79803d = source.f79797d;
            this.f79804e = source.f79798e;
            this.f79805f = source.f79799f;
        }
    }
}
