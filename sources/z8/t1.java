package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class t1 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f102061e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<t1, a> f102062f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f102063a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102064b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102065c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102066d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<t1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                at.b.a(protocol, b11);
                            } else if (b11 == 8) {
                                builder.c(Integer.valueOf(protocol.s8()));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.e(Integer.valueOf(protocol.s8()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.b(Integer.valueOf(protocol.s8()));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 10) {
                    builder.d(protocol.T1());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k t1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserLearnInfoV2");
            protocol.Q6("last_sync_done_score_time", 1, (byte) 10);
            protocol.q7(struct.f102063a);
            protocol.N2();
            if (struct.f102064b != null) {
                protocol.Q6("daily_plan_count", 2, (byte) 8);
                protocol.l5(struct.f102064b.intValue());
                protocol.N2();
            }
            if (struct.f102065c != null) {
                protocol.Q6("review_plan_count", 3, (byte) 8);
                protocol.l5(struct.f102065c.intValue());
                protocol.N2();
            }
            if (struct.f102066d != null) {
                protocol.Q6("group_count", 4, (byte) 8);
                protocol.l5(struct.f102066d.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public t1(long j11, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        this.f102063a = j11;
        this.f102064b = num;
        this.f102065c = num2;
        this.f102066d = num3;
    }

    public static /* synthetic */ t1 f(t1 t1Var, long j11, Integer num, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = t1Var.f102063a;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            num = t1Var.f102064b;
        }
        Integer num4 = num;
        if ((i11 & 4) != 0) {
            num2 = t1Var.f102065c;
        }
        Integer num5 = num2;
        if ((i11 & 8) != 0) {
            num3 = t1Var.f102066d;
        }
        return t1Var.e(j12, num4, num5, num3);
    }

    public final long a() {
        return this.f102063a;
    }

    @m80.l
    public final Integer b() {
        return this.f102064b;
    }

    @m80.l
    public final Integer c() {
        return this.f102065c;
    }

    @m80.l
    public final Integer d() {
        return this.f102066d;
    }

    @m80.k
    public final t1 e(long j11, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        return new t1(j11, num, num2, num3);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return this.f102063a == t1Var.f102063a && kotlin.jvm.internal.g0.g(this.f102064b, t1Var.f102064b) && kotlin.jvm.internal.g0.g(this.f102065c, t1Var.f102065c) && kotlin.jvm.internal.g0.g(this.f102066d, t1Var.f102066d);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f102063a) * 31;
        Integer num = this.f102064b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f102065c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f102066d;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "UserLearnInfoV2(last_sync_done_score_time=" + this.f102063a + ", daily_plan_count=" + this.f102064b + ", review_plan_count=" + this.f102065c + ", group_count=" + this.f102066d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102062f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserLearnInfoV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserLearnInfoV2.kt\ncom/baicizhan/biz/online/user_study_api/UserLearnInfoV2$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,191:1\n1#2:192\n*E\n"})
    public static final class a implements ts.f<t1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f102067a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102068b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f102069c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f102070d;

        public a() {
            this.f102067a = null;
            this.f102068b = null;
            this.f102069c = null;
            this.f102070d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t1 build() {
            Long l11 = this.f102067a;
            if (l11 != null) {
                return new t1(l11.longValue(), this.f102068b, this.f102069c, this.f102070d);
            }
            throw new IllegalStateException("Required field 'last_sync_done_score_time' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f102068b = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f102070d = num;
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f102067a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f102069c = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102067a = null;
            this.f102068b = null;
            this.f102069c = null;
            this.f102070d = null;
        }

        public a(@m80.k t1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102067a = Long.valueOf(source.f102063a);
            this.f102068b = source.f102064b;
            this.f102069c = source.f102065c;
            this.f102070d = source.f102066d;
        }
    }
}
