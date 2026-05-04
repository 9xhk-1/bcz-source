package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class y0 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f102279c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<y0, a> f102280d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102281a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f102282b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<y0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    } else if (b11 == 8) {
                        builder.b(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k y0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserAchievement");
            protocol.Q6("word_done_count", 1, (byte) 8);
            protocol.l5(struct.f102281a);
            protocol.N2();
            protocol.Q6("total_daka_days", 2, (byte) 8);
            protocol.l5(struct.f102282b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public y0(int i11, int i12) {
        this.f102281a = i11;
        this.f102282b = i12;
    }

    public static /* synthetic */ y0 d(y0 y0Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = y0Var.f102281a;
        }
        if ((i13 & 2) != 0) {
            i12 = y0Var.f102282b;
        }
        return y0Var.c(i11, i12);
    }

    public final int a() {
        return this.f102281a;
    }

    public final int b() {
        return this.f102282b;
    }

    @m80.k
    public final y0 c(int i11, int i12) {
        return new y0(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f102281a == y0Var.f102281a && this.f102282b == y0Var.f102282b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f102281a) * 31) + Integer.hashCode(this.f102282b);
    }

    @m80.k
    public String toString() {
        return "UserAchievement(word_done_count=" + this.f102281a + ", total_daka_days=" + this.f102282b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102280d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserAchievement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAchievement.kt\ncom/baicizhan/biz/online/user_study_api/UserAchievement$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
    public static final class a implements ts.f<y0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102283a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102284b;

        public a() {
            this.f102283a = null;
            this.f102284b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0 build() {
            Integer num = this.f102283a;
            if (num == null) {
                throw new IllegalStateException("Required field 'word_done_count' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f102284b;
            if (num2 != null) {
                return new y0(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'total_daka_days' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f102284b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f102283a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102283a = null;
            this.f102284b = null;
        }

        public a(@m80.k y0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102283a = Integer.valueOf(source.f102281a);
            this.f102284b = Integer.valueOf(source.f102282b);
        }
    }
}
