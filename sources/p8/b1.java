package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b1 implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f79686i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b1, a> f79687j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79688a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79689b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final boolean f79690c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final boolean f79691d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final boolean f79692e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final boolean f79693f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f79694g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f79695h;

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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readBool());
                            break;
                        }
                    case 4:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readBool());
                            break;
                        }
                    case 5:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readBool());
                            break;
                        }
                    case 6:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readBool());
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k b1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("TodayLearnInfo");
            protocol.Q6("learned", 1, (byte) 8);
            protocol.l5(struct.f79688a);
            protocol.N2();
            protocol.Q6("reviewed", 2, (byte) 8);
            protocol.l5(struct.f79689b);
            protocol.N2();
            protocol.Q6("first_learn_tip", 3, (byte) 2);
            protocol.a4(struct.f79690c);
            protocol.N2();
            protocol.Q6("learn_more_tip", 4, (byte) 2);
            protocol.a4(struct.f79691d);
            protocol.N2();
            protocol.Q6("review_more_tip", 5, (byte) 2);
            protocol.a4(struct.f79692e);
            protocol.N2();
            protocol.Q6("review_no_tip", 6, (byte) 2);
            protocol.a4(struct.f79693f);
            protocol.N2();
            if (struct.f79694g != null) {
                protocol.Q6("group_plan", 7, (byte) 8);
                protocol.l5(struct.f79694g.intValue());
                protocol.N2();
            }
            if (struct.f79695h != null) {
                protocol.Q6("finish_group", 8, (byte) 8);
                protocol.l5(struct.f79695h.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public b1(int i11, int i12, boolean z11, boolean z12, boolean z13, boolean z14, @m80.l Integer num, @m80.l Integer num2) {
        this.f79688a = i11;
        this.f79689b = i12;
        this.f79690c = z11;
        this.f79691d = z12;
        this.f79692e = z13;
        this.f79693f = z14;
        this.f79694g = num;
        this.f79695h = num2;
    }

    public static /* synthetic */ b1 j(b1 b1Var, int i11, int i12, boolean z11, boolean z12, boolean z13, boolean z14, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = b1Var.f79688a;
        }
        if ((i13 & 2) != 0) {
            i12 = b1Var.f79689b;
        }
        if ((i13 & 4) != 0) {
            z11 = b1Var.f79690c;
        }
        if ((i13 & 8) != 0) {
            z12 = b1Var.f79691d;
        }
        if ((i13 & 16) != 0) {
            z13 = b1Var.f79692e;
        }
        if ((i13 & 32) != 0) {
            z14 = b1Var.f79693f;
        }
        if ((i13 & 64) != 0) {
            num = b1Var.f79694g;
        }
        if ((i13 & 128) != 0) {
            num2 = b1Var.f79695h;
        }
        Integer num3 = num;
        Integer num4 = num2;
        boolean z15 = z13;
        boolean z16 = z14;
        return b1Var.i(i11, i12, z11, z12, z15, z16, num3, num4);
    }

    public final int a() {
        return this.f79688a;
    }

    public final int b() {
        return this.f79689b;
    }

    public final boolean c() {
        return this.f79690c;
    }

    public final boolean d() {
        return this.f79691d;
    }

    public final boolean e() {
        return this.f79692e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f79688a == b1Var.f79688a && this.f79689b == b1Var.f79689b && this.f79690c == b1Var.f79690c && this.f79691d == b1Var.f79691d && this.f79692e == b1Var.f79692e && this.f79693f == b1Var.f79693f && kotlin.jvm.internal.g0.g(this.f79694g, b1Var.f79694g) && kotlin.jvm.internal.g0.g(this.f79695h, b1Var.f79695h);
    }

    public final boolean f() {
        return this.f79693f;
    }

    @m80.l
    public final Integer g() {
        return this.f79694g;
    }

    @m80.l
    public final Integer h() {
        return this.f79695h;
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.f79688a) * 31) + Integer.hashCode(this.f79689b)) * 31) + Boolean.hashCode(this.f79690c)) * 31) + Boolean.hashCode(this.f79691d)) * 31) + Boolean.hashCode(this.f79692e)) * 31) + Boolean.hashCode(this.f79693f)) * 31;
        Integer num = this.f79694g;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f79695h;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @m80.k
    public final b1 i(int i11, int i12, boolean z11, boolean z12, boolean z13, boolean z14, @m80.l Integer num, @m80.l Integer num2) {
        return new b1(i11, i12, z11, z12, z13, z14, num, num2);
    }

    @m80.k
    public String toString() {
        return "TodayLearnInfo(learned=" + this.f79688a + ", reviewed=" + this.f79689b + ", first_learn_tip=" + this.f79690c + ", learn_more_tip=" + this.f79691d + ", review_more_tip=" + this.f79692e + ", review_no_tip=" + this.f79693f + ", group_plan=" + this.f79694g + ", finish_group=" + this.f79695h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79687j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTodayLearnInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TodayLearnInfo.kt\ncom/baicizhan/biz/online/game_api/TodayLearnInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
    public static final class a implements ts.f<b1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79696a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79697b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Boolean f79698c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Boolean f79699d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Boolean f79700e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Boolean f79701f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f79702g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f79703h;

        public a() {
            this.f79696a = null;
            this.f79697b = null;
            this.f79698c = null;
            this.f79699d = null;
            this.f79700e = null;
            this.f79701f = null;
            this.f79702g = null;
            this.f79703h = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b1 build() {
            Integer num = this.f79696a;
            if (num == null) {
                throw new IllegalStateException("Required field 'learned' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79697b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'reviewed' is missing");
            }
            int intValue2 = num2.intValue();
            Boolean bool = this.f79698c;
            if (bool == null) {
                throw new IllegalStateException("Required field 'first_learn_tip' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = this.f79699d;
            if (bool2 == null) {
                throw new IllegalStateException("Required field 'learn_more_tip' is missing");
            }
            boolean booleanValue2 = bool2.booleanValue();
            Boolean bool3 = this.f79700e;
            if (bool3 == null) {
                throw new IllegalStateException("Required field 'review_more_tip' is missing");
            }
            boolean booleanValue3 = bool3.booleanValue();
            Boolean bool4 = this.f79701f;
            if (bool4 != null) {
                return new b1(intValue, intValue2, booleanValue, booleanValue2, booleanValue3, bool4.booleanValue(), this.f79702g, this.f79703h);
            }
            throw new IllegalStateException("Required field 'review_no_tip' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f79703h = num;
            return this;
        }

        @m80.k
        public final a c(boolean z11) {
            this.f79698c = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f79702g = num;
            return this;
        }

        @m80.k
        public final a e(boolean z11) {
            this.f79699d = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f79696a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(boolean z11) {
            this.f79700e = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a h(boolean z11) {
            this.f79701f = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a i(int i11) {
            this.f79697b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79696a = null;
            this.f79697b = null;
            this.f79698c = null;
            this.f79699d = null;
            this.f79700e = null;
            this.f79701f = null;
            this.f79702g = null;
            this.f79703h = null;
        }

        public a(@m80.k b1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79696a = Integer.valueOf(source.f79688a);
            this.f79697b = Integer.valueOf(source.f79689b);
            this.f79698c = Boolean.valueOf(source.f79690c);
            this.f79699d = Boolean.valueOf(source.f79691d);
            this.f79700e = Boolean.valueOf(source.f79692e);
            this.f79701f = Boolean.valueOf(source.f79693f);
            this.f79702g = source.f79694g;
            this.f79703h = source.f79695h;
        }
    }
}
