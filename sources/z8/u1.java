package z8;

import com.baicizhan.client.business.dataset.provider.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u1 implements ts.e {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final b f102087m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<u1, a> f102088n = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102089a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102090b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102091c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102092d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102093e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102094f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102095g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102096h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102097i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102098j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102099k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102100l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<u1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.j(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.m(Integer.valueOf(protocol.s8()));
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
                            builder.h(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 8:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 11:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 12:
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
        public void write(@m80.k ws.i protocol, @m80.k u1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserLearnedWordInfo");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f102089a);
            protocol.N2();
            if (struct.f102090b != null) {
                protocol.Q6(a.b.C0242a.f16107c, 2, (byte) 8);
                protocol.l5(struct.f102090b.intValue());
                protocol.N2();
            }
            if (struct.f102091c != null) {
                protocol.Q6("used_time", 3, (byte) 8);
                protocol.l5(struct.f102091c.intValue());
                protocol.N2();
            }
            if (struct.f102092d != null) {
                protocol.Q6("wrong_times", 4, (byte) 8);
                protocol.l5(struct.f102092d.intValue());
                protocol.N2();
            }
            if (struct.f102093e != null) {
                protocol.Q6("done_times", 5, (byte) 8);
                protocol.l5(struct.f102093e.intValue());
                protocol.N2();
            }
            if (struct.f102094f != null) {
                protocol.Q6("span_days", 6, (byte) 8);
                protocol.l5(struct.f102094f.intValue());
                protocol.N2();
            }
            if (struct.f102095g != null) {
                protocol.Q6("update_days", 7, (byte) 8);
                protocol.l5(struct.f102095g.intValue());
                protocol.N2();
            }
            if (struct.f102096h != null) {
                protocol.Q6("created_at", 8, (byte) 10);
                protocol.q7(struct.f102096h.longValue());
                protocol.N2();
            }
            if (struct.f102097i != null) {
                protocol.Q6("spell_score", 9, (byte) 8);
                protocol.l5(struct.f102097i.intValue());
                protocol.N2();
            }
            if (struct.f102098j != null) {
                protocol.Q6("listening_score", 10, (byte) 8);
                protocol.l5(struct.f102098j.intValue());
                protocol.N2();
            }
            if (struct.f102099k != null) {
                protocol.Q6("chn_score", 11, (byte) 8);
                protocol.l5(struct.f102099k.intValue());
                protocol.N2();
            }
            if (struct.f102100l != null) {
                protocol.Q6("review_round", 12, (byte) 8);
                protocol.l5(struct.f102100l.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public u1(int i11, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5, @m80.l Integer num6, @m80.l Long l11, @m80.l Integer num7, @m80.l Integer num8, @m80.l Integer num9, @m80.l Integer num10) {
        this.f102089a = i11;
        this.f102090b = num;
        this.f102091c = num2;
        this.f102092d = num3;
        this.f102093e = num4;
        this.f102094f = num5;
        this.f102095g = num6;
        this.f102096h = l11;
        this.f102097i = num7;
        this.f102098j = num8;
        this.f102099k = num9;
        this.f102100l = num10;
    }

    public static /* synthetic */ u1 n(u1 u1Var, int i11, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l11, Integer num7, Integer num8, Integer num9, Integer num10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = u1Var.f102089a;
        }
        if ((i12 & 2) != 0) {
            num = u1Var.f102090b;
        }
        if ((i12 & 4) != 0) {
            num2 = u1Var.f102091c;
        }
        if ((i12 & 8) != 0) {
            num3 = u1Var.f102092d;
        }
        if ((i12 & 16) != 0) {
            num4 = u1Var.f102093e;
        }
        if ((i12 & 32) != 0) {
            num5 = u1Var.f102094f;
        }
        if ((i12 & 64) != 0) {
            num6 = u1Var.f102095g;
        }
        if ((i12 & 128) != 0) {
            l11 = u1Var.f102096h;
        }
        if ((i12 & 256) != 0) {
            num7 = u1Var.f102097i;
        }
        if ((i12 & 512) != 0) {
            num8 = u1Var.f102098j;
        }
        if ((i12 & 1024) != 0) {
            num9 = u1Var.f102099k;
        }
        if ((i12 & 2048) != 0) {
            num10 = u1Var.f102100l;
        }
        Integer num11 = num9;
        Integer num12 = num10;
        Integer num13 = num7;
        Integer num14 = num8;
        Integer num15 = num6;
        Long l12 = l11;
        Integer num16 = num4;
        Integer num17 = num5;
        return u1Var.m(i11, num, num2, num3, num16, num17, num15, l12, num13, num14, num11, num12);
    }

    public final int a() {
        return this.f102089a;
    }

    @m80.l
    public final Integer b() {
        return this.f102098j;
    }

    @m80.l
    public final Integer c() {
        return this.f102099k;
    }

    @m80.l
    public final Integer d() {
        return this.f102100l;
    }

    @m80.l
    public final Integer e() {
        return this.f102090b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.f102089a == u1Var.f102089a && kotlin.jvm.internal.g0.g(this.f102090b, u1Var.f102090b) && kotlin.jvm.internal.g0.g(this.f102091c, u1Var.f102091c) && kotlin.jvm.internal.g0.g(this.f102092d, u1Var.f102092d) && kotlin.jvm.internal.g0.g(this.f102093e, u1Var.f102093e) && kotlin.jvm.internal.g0.g(this.f102094f, u1Var.f102094f) && kotlin.jvm.internal.g0.g(this.f102095g, u1Var.f102095g) && kotlin.jvm.internal.g0.g(this.f102096h, u1Var.f102096h) && kotlin.jvm.internal.g0.g(this.f102097i, u1Var.f102097i) && kotlin.jvm.internal.g0.g(this.f102098j, u1Var.f102098j) && kotlin.jvm.internal.g0.g(this.f102099k, u1Var.f102099k) && kotlin.jvm.internal.g0.g(this.f102100l, u1Var.f102100l);
    }

    @m80.l
    public final Integer f() {
        return this.f102091c;
    }

    @m80.l
    public final Integer g() {
        return this.f102092d;
    }

    @m80.l
    public final Integer h() {
        return this.f102093e;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f102089a) * 31;
        Integer num = this.f102090b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f102091c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f102092d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f102093e;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f102094f;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f102095g;
        int hashCode7 = (hashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l11 = this.f102096h;
        int hashCode8 = (hashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num7 = this.f102097i;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f102098j;
        int hashCode10 = (hashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f102099k;
        int hashCode11 = (hashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f102100l;
        return hashCode11 + (num10 != null ? num10.hashCode() : 0);
    }

    @m80.l
    public final Integer i() {
        return this.f102094f;
    }

    @m80.l
    public final Integer j() {
        return this.f102095g;
    }

    @m80.l
    public final Long k() {
        return this.f102096h;
    }

    @m80.l
    public final Integer l() {
        return this.f102097i;
    }

    @m80.k
    public final u1 m(int i11, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5, @m80.l Integer num6, @m80.l Long l11, @m80.l Integer num7, @m80.l Integer num8, @m80.l Integer num9, @m80.l Integer num10) {
        return new u1(i11, num, num2, num3, num4, num5, num6, l11, num7, num8, num9, num10);
    }

    @m80.k
    public String toString() {
        return "UserLearnedWordInfo(topic_id=" + this.f102089a + ", score=" + this.f102090b + ", used_time=" + this.f102091c + ", wrong_times=" + this.f102092d + ", done_times=" + this.f102093e + ", span_days=" + this.f102094f + ", update_days=" + this.f102095g + ", created_at=" + this.f102096h + ", spell_score=" + this.f102097i + ", listening_score=" + this.f102098j + ", chn_score=" + this.f102099k + ", review_round=" + this.f102100l + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102088n.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserLearnedWordInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserLearnedWordInfo.kt\ncom/baicizhan/biz/online/user_study_api/UserLearnedWordInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,422:1\n1#2:423\n*E\n"})
    public static final class a implements ts.f<u1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102101a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102102b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f102103c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f102104d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f102105e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f102106f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f102107g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Long f102108h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Integer f102109i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Integer f102110j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public Integer f102111k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public Integer f102112l;

        public a() {
            this.f102101a = null;
            this.f102102b = null;
            this.f102103c = null;
            this.f102104d = null;
            this.f102105e = null;
            this.f102106f = null;
            this.f102107g = null;
            this.f102108h = null;
            this.f102109i = null;
            this.f102110j = null;
            this.f102111k = null;
            this.f102112l = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u1 build() {
            Integer num = this.f102101a;
            if (num != null) {
                return new u1(num.intValue(), this.f102102b, this.f102103c, this.f102104d, this.f102105e, this.f102106f, this.f102107g, this.f102108h, this.f102109i, this.f102110j, this.f102111k, this.f102112l);
            }
            throw new IllegalStateException("Required field 'topic_id' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f102111k = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l Long l11) {
            this.f102108h = l11;
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f102105e = num;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f102110j = num;
            return this;
        }

        @m80.k
        public final a f(@m80.l Integer num) {
            this.f102112l = num;
            return this;
        }

        @m80.k
        public final a g(@m80.l Integer num) {
            this.f102102b = num;
            return this;
        }

        @m80.k
        public final a h(@m80.l Integer num) {
            this.f102106f = num;
            return this;
        }

        @m80.k
        public final a i(@m80.l Integer num) {
            this.f102109i = num;
            return this;
        }

        @m80.k
        public final a j(int i11) {
            this.f102101a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a k(@m80.l Integer num) {
            this.f102107g = num;
            return this;
        }

        @m80.k
        public final a l(@m80.l Integer num) {
            this.f102103c = num;
            return this;
        }

        @m80.k
        public final a m(@m80.l Integer num) {
            this.f102104d = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102101a = null;
            this.f102102b = null;
            this.f102103c = null;
            this.f102104d = null;
            this.f102105e = null;
            this.f102106f = null;
            this.f102107g = null;
            this.f102108h = null;
            this.f102109i = null;
            this.f102110j = null;
            this.f102111k = null;
            this.f102112l = null;
        }

        public a(@m80.k u1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102101a = Integer.valueOf(source.f102089a);
            this.f102102b = source.f102090b;
            this.f102103c = source.f102091c;
            this.f102104d = source.f102092d;
            this.f102105e = source.f102093e;
            this.f102106f = source.f102094f;
            this.f102107g = source.f102095g;
            this.f102108h = source.f102096h;
            this.f102109i = source.f102097i;
            this.f102110j = source.f102098j;
            this.f102111k = source.f102099k;
            this.f102112l = source.f102100l;
        }
    }
}
