package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i2 implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f101627f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i2, a> f101628g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101629a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101630b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101631c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101632d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101633e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<i2, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i2 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i2 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            if (s11 != 4) {
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 8) {
                                    builder.e(Integer.valueOf(protocol.s8()));
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 8) {
                                builder.c(Integer.valueOf(protocol.s8()));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.d(Integer.valueOf(protocol.s8()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.f(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.b(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k i2 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("WinStreakStatus");
            protocol.Q6(k3.u0.f65628b, 1, (byte) 8);
            protocol.l5(struct.f101629a);
            protocol.N2();
            protocol.Q6("win_streak_days", 2, (byte) 8);
            protocol.l5(struct.f101630b);
            protocol.N2();
            if (struct.f101631c != null) {
                protocol.Q6("latest_win_streak_date", 3, (byte) 8);
                protocol.l5(struct.f101631c.intValue());
                protocol.N2();
            }
            if (struct.f101632d != null) {
                protocol.Q6("enableExperienceRanking", 4, (byte) 8);
                protocol.l5(struct.f101632d.intValue());
                protocol.N2();
            }
            if (struct.f101633e != null) {
                protocol.Q6("taskStatus", 5, (byte) 8);
                protocol.l5(struct.f101633e.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public i2(int i11, int i12, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        this.f101629a = i11;
        this.f101630b = i12;
        this.f101631c = num;
        this.f101632d = num2;
        this.f101633e = num3;
    }

    public static /* synthetic */ i2 g(i2 i2Var, int i11, int i12, Integer num, Integer num2, Integer num3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = i2Var.f101629a;
        }
        if ((i13 & 2) != 0) {
            i12 = i2Var.f101630b;
        }
        if ((i13 & 4) != 0) {
            num = i2Var.f101631c;
        }
        if ((i13 & 8) != 0) {
            num2 = i2Var.f101632d;
        }
        if ((i13 & 16) != 0) {
            num3 = i2Var.f101633e;
        }
        Integer num4 = num3;
        Integer num5 = num;
        return i2Var.f(i11, i12, num5, num2, num4);
    }

    public final int a() {
        return this.f101629a;
    }

    public final int b() {
        return this.f101630b;
    }

    @m80.l
    public final Integer c() {
        return this.f101631c;
    }

    @m80.l
    public final Integer d() {
        return this.f101632d;
    }

    @m80.l
    public final Integer e() {
        return this.f101633e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return this.f101629a == i2Var.f101629a && this.f101630b == i2Var.f101630b && kotlin.jvm.internal.g0.g(this.f101631c, i2Var.f101631c) && kotlin.jvm.internal.g0.g(this.f101632d, i2Var.f101632d) && kotlin.jvm.internal.g0.g(this.f101633e, i2Var.f101633e);
    }

    @m80.k
    public final i2 f(int i11, int i12, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        return new i2(i11, i12, num, num2, num3);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f101629a) * 31) + Integer.hashCode(this.f101630b)) * 31;
        Integer num = this.f101631c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f101632d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f101633e;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "WinStreakStatus(enable=" + this.f101629a + ", win_streak_days=" + this.f101630b + ", latest_win_streak_date=" + this.f101631c + ", enableExperienceRanking=" + this.f101632d + ", taskStatus=" + this.f101633e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101628g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWinStreakStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WinStreakStatus.kt\ncom/baicizhan/biz/online/user_study_api/WinStreakStatus$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
    public static final class a implements ts.f<i2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101634a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101635b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101636c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101637d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101638e;

        public a() {
            this.f101634a = null;
            this.f101635b = null;
            this.f101636c = null;
            this.f101637d = null;
            this.f101638e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i2 build() {
            Integer num = this.f101634a;
            if (num == null) {
                throw new IllegalStateException("Required field 'enable' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101635b;
            if (num2 != null) {
                return new i2(intValue, num2.intValue(), this.f101636c, this.f101637d, this.f101638e);
            }
            throw new IllegalStateException("Required field 'win_streak_days' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101634a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f101637d = num;
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f101636c = num;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f101638e = num;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f101635b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101634a = null;
            this.f101635b = null;
            this.f101636c = null;
            this.f101637d = null;
            this.f101638e = null;
        }

        public a(@m80.k i2 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101634a = Integer.valueOf(source.f101629a);
            this.f101635b = Integer.valueOf(source.f101630b);
            this.f101636c = source.f101631c;
            this.f101637d = source.f101632d;
            this.f101638e = source.f101633e;
        }
    }
}
