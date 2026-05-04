package z8;

import com.baicizhan.client.business.dataset.provider.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class t implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f102027g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<t, a> f102028h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final boolean f102029a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102030b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102031c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102032d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102033e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102034f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<t, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readBool());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Long.valueOf(protocol.T1()));
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
        public void write(@m80.k ws.i protocol, @m80.k t struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("ExperienceRankInfo");
            protocol.Q6(k3.u0.f65628b, 1, (byte) 2);
            protocol.a4(struct.f102029a);
            protocol.N2();
            if (struct.f102030b != null) {
                protocol.Q6("curStatus", 2, (byte) 8);
                protocol.l5(struct.f102030b.intValue());
                protocol.N2();
            }
            if (struct.f102031c != null) {
                protocol.Q6("inLastWeekRank", 3, (byte) 8);
                protocol.l5(struct.f102031c.intValue());
                protocol.N2();
            }
            if (struct.f102032d != null) {
                protocol.Q6(a.b.C0242a.f16107c, 4, (byte) 8);
                protocol.l5(struct.f102032d.intValue());
                protocol.N2();
            }
            if (struct.f102033e != null) {
                protocol.Q6("ranking", 5, (byte) 8);
                protocol.l5(struct.f102033e.intValue());
                protocol.N2();
            }
            if (struct.f102034f != null) {
                protocol.Q6("taskUpdatedAt", 6, (byte) 10);
                protocol.q7(struct.f102034f.longValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public t(boolean z11, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4, @m80.l Long l11) {
        this.f102029a = z11;
        this.f102030b = num;
        this.f102031c = num2;
        this.f102032d = num3;
        this.f102033e = num4;
        this.f102034f = l11;
    }

    public static /* synthetic */ t h(t tVar, boolean z11, Integer num, Integer num2, Integer num3, Integer num4, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = tVar.f102029a;
        }
        if ((i11 & 2) != 0) {
            num = tVar.f102030b;
        }
        if ((i11 & 4) != 0) {
            num2 = tVar.f102031c;
        }
        if ((i11 & 8) != 0) {
            num3 = tVar.f102032d;
        }
        if ((i11 & 16) != 0) {
            num4 = tVar.f102033e;
        }
        if ((i11 & 32) != 0) {
            l11 = tVar.f102034f;
        }
        Integer num5 = num4;
        Long l12 = l11;
        return tVar.g(z11, num, num2, num3, num5, l12);
    }

    public final boolean a() {
        return this.f102029a;
    }

    @m80.l
    public final Integer b() {
        return this.f102030b;
    }

    @m80.l
    public final Integer c() {
        return this.f102031c;
    }

    @m80.l
    public final Integer d() {
        return this.f102032d;
    }

    @m80.l
    public final Integer e() {
        return this.f102033e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f102029a == tVar.f102029a && kotlin.jvm.internal.g0.g(this.f102030b, tVar.f102030b) && kotlin.jvm.internal.g0.g(this.f102031c, tVar.f102031c) && kotlin.jvm.internal.g0.g(this.f102032d, tVar.f102032d) && kotlin.jvm.internal.g0.g(this.f102033e, tVar.f102033e) && kotlin.jvm.internal.g0.g(this.f102034f, tVar.f102034f);
    }

    @m80.l
    public final Long f() {
        return this.f102034f;
    }

    @m80.k
    public final t g(boolean z11, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4, @m80.l Long l11) {
        return new t(z11, num, num2, num3, num4, l11);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f102029a) * 31;
        Integer num = this.f102030b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f102031c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f102032d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f102033e;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Long l11 = this.f102034f;
        return hashCode5 + (l11 != null ? l11.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "ExperienceRankInfo(enable=" + this.f102029a + ", curStatus=" + this.f102030b + ", inLastWeekRank=" + this.f102031c + ", score=" + this.f102032d + ", ranking=" + this.f102033e + ", taskUpdatedAt=" + this.f102034f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102028h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nExperienceRankInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExperienceRankInfo.kt\ncom/baicizhan/biz/online/user_study_api/ExperienceRankInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n1#2:247\n*E\n"})
    public static final class a implements ts.f<t> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Boolean f102035a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102036b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f102037c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f102038d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f102039e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f102040f;

        public a() {
            this.f102035a = null;
            this.f102036b = null;
            this.f102037c = null;
            this.f102038d = null;
            this.f102039e = null;
            this.f102040f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t build() {
            Boolean bool = this.f102035a;
            if (bool != null) {
                return new t(bool.booleanValue(), this.f102036b, this.f102037c, this.f102038d, this.f102039e, this.f102040f);
            }
            throw new IllegalStateException("Required field 'enable' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f102036b = num;
            return this;
        }

        @m80.k
        public final a c(boolean z11) {
            this.f102035a = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f102037c = num;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f102039e = num;
            return this;
        }

        @m80.k
        public final a f(@m80.l Integer num) {
            this.f102038d = num;
            return this;
        }

        @m80.k
        public final a g(@m80.l Long l11) {
            this.f102040f = l11;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102035a = null;
            this.f102036b = null;
            this.f102037c = null;
            this.f102038d = null;
            this.f102039e = null;
            this.f102040f = null;
        }

        public a(@m80.k t source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102035a = Boolean.valueOf(source.f102029a);
            this.f102036b = source.f102030b;
            this.f102037c = source.f102031c;
            this.f102038d = source.f102032d;
            this.f102039e = source.f102033e;
            this.f102040f = source.f102034f;
        }
    }
}
