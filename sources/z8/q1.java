package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class q1 implements ts.e {

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public static final b f101911m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<q1, a> f101912n = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101913a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101914b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101915c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f101916d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f101917e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f101918f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final int f101919g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101920h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101921i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101922j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101923k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101924l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<q1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.l(protocol.s8());
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
                            builder.h(protocol.s8());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.m(protocol.s8());
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(Integer.valueOf(protocol.s8()));
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
                            builder.f(Integer.valueOf(protocol.s8()));
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
                            builder.g(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k q1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserDoneWordRecord");
            protocol.Q6("word_topic_id", 1, (byte) 8);
            protocol.l5(struct.f101913a);
            protocol.N2();
            protocol.Q6("current_score", 2, (byte) 8);
            protocol.l5(struct.f101914b);
            protocol.N2();
            protocol.Q6("span_days", 3, (byte) 8);
            protocol.l5(struct.f101915c);
            protocol.N2();
            protocol.Q6("used_time", 4, (byte) 8);
            protocol.l5(struct.f101916d);
            protocol.N2();
            protocol.Q6("done_times", 5, (byte) 8);
            protocol.l5(struct.f101917e);
            protocol.N2();
            protocol.Q6("wrong_times", 6, (byte) 8);
            protocol.l5(struct.f101918f);
            protocol.N2();
            protocol.Q6("is_first_do_at_today", 7, (byte) 8);
            protocol.l5(struct.f101919g);
            protocol.N2();
            if (struct.f101920h != null) {
                protocol.Q6("tag_id", 8, (byte) 8);
                protocol.l5(struct.f101920h.intValue());
                protocol.N2();
            }
            if (struct.f101921i != null) {
                protocol.Q6("spell_score", 9, (byte) 8);
                protocol.l5(struct.f101921i.intValue());
                protocol.N2();
            }
            if (struct.f101922j != null) {
                protocol.Q6("listening_score", 10, (byte) 8);
                protocol.l5(struct.f101922j.intValue());
                protocol.N2();
            }
            if (struct.f101923k != null) {
                protocol.Q6("chn_score", 11, (byte) 8);
                protocol.l5(struct.f101923k.intValue());
                protocol.N2();
            }
            if (struct.f101924l != null) {
                protocol.Q6("review_round", 12, (byte) 8);
                protocol.l5(struct.f101924l.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public q1(int i11, int i12, int i13, int i14, int i15, int i16, int i17, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5) {
        this.f101913a = i11;
        this.f101914b = i12;
        this.f101915c = i13;
        this.f101916d = i14;
        this.f101917e = i15;
        this.f101918f = i16;
        this.f101919g = i17;
        this.f101920h = num;
        this.f101921i = num2;
        this.f101922j = num3;
        this.f101923k = num4;
        this.f101924l = num5;
    }

    public static /* synthetic */ q1 n(q1 q1Var, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, int i18, Object obj) {
        if ((i18 & 1) != 0) {
            i11 = q1Var.f101913a;
        }
        if ((i18 & 2) != 0) {
            i12 = q1Var.f101914b;
        }
        if ((i18 & 4) != 0) {
            i13 = q1Var.f101915c;
        }
        if ((i18 & 8) != 0) {
            i14 = q1Var.f101916d;
        }
        if ((i18 & 16) != 0) {
            i15 = q1Var.f101917e;
        }
        if ((i18 & 32) != 0) {
            i16 = q1Var.f101918f;
        }
        if ((i18 & 64) != 0) {
            i17 = q1Var.f101919g;
        }
        if ((i18 & 128) != 0) {
            num = q1Var.f101920h;
        }
        if ((i18 & 256) != 0) {
            num2 = q1Var.f101921i;
        }
        if ((i18 & 512) != 0) {
            num3 = q1Var.f101922j;
        }
        if ((i18 & 1024) != 0) {
            num4 = q1Var.f101923k;
        }
        if ((i18 & 2048) != 0) {
            num5 = q1Var.f101924l;
        }
        Integer num6 = num4;
        Integer num7 = num5;
        Integer num8 = num2;
        Integer num9 = num3;
        int i19 = i17;
        Integer num10 = num;
        int i21 = i15;
        int i22 = i16;
        return q1Var.m(i11, i12, i13, i14, i21, i22, i19, num10, num8, num9, num6, num7);
    }

    public final int a() {
        return this.f101913a;
    }

    @m80.l
    public final Integer b() {
        return this.f101922j;
    }

    @m80.l
    public final Integer c() {
        return this.f101923k;
    }

    @m80.l
    public final Integer d() {
        return this.f101924l;
    }

    public final int e() {
        return this.f101914b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return this.f101913a == q1Var.f101913a && this.f101914b == q1Var.f101914b && this.f101915c == q1Var.f101915c && this.f101916d == q1Var.f101916d && this.f101917e == q1Var.f101917e && this.f101918f == q1Var.f101918f && this.f101919g == q1Var.f101919g && kotlin.jvm.internal.g0.g(this.f101920h, q1Var.f101920h) && kotlin.jvm.internal.g0.g(this.f101921i, q1Var.f101921i) && kotlin.jvm.internal.g0.g(this.f101922j, q1Var.f101922j) && kotlin.jvm.internal.g0.g(this.f101923k, q1Var.f101923k) && kotlin.jvm.internal.g0.g(this.f101924l, q1Var.f101924l);
    }

    public final int f() {
        return this.f101915c;
    }

    public final int g() {
        return this.f101916d;
    }

    public final int h() {
        return this.f101917e;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.f101913a) * 31) + Integer.hashCode(this.f101914b)) * 31) + Integer.hashCode(this.f101915c)) * 31) + Integer.hashCode(this.f101916d)) * 31) + Integer.hashCode(this.f101917e)) * 31) + Integer.hashCode(this.f101918f)) * 31) + Integer.hashCode(this.f101919g)) * 31;
        Integer num = this.f101920h;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f101921i;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f101922j;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f101923k;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f101924l;
        return hashCode5 + (num5 != null ? num5.hashCode() : 0);
    }

    public final int i() {
        return this.f101918f;
    }

    public final int j() {
        return this.f101919g;
    }

    @m80.l
    public final Integer k() {
        return this.f101920h;
    }

    @m80.l
    public final Integer l() {
        return this.f101921i;
    }

    @m80.k
    public final q1 m(int i11, int i12, int i13, int i14, int i15, int i16, int i17, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5) {
        return new q1(i11, i12, i13, i14, i15, i16, i17, num, num2, num3, num4, num5);
    }

    @m80.k
    public String toString() {
        return "UserDoneWordRecord(word_topic_id=" + this.f101913a + ", current_score=" + this.f101914b + ", span_days=" + this.f101915c + ", used_time=" + this.f101916d + ", done_times=" + this.f101917e + ", wrong_times=" + this.f101918f + ", is_first_do_at_today=" + this.f101919g + ", tag_id=" + this.f101920h + ", spell_score=" + this.f101921i + ", listening_score=" + this.f101922j + ", chn_score=" + this.f101923k + ", review_round=" + this.f101924l + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101912n.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserDoneWordRecord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDoneWordRecord.kt\ncom/baicizhan/biz/online/user_study_api/UserDoneWordRecord$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n1#2:416\n*E\n"})
    public static final class a implements ts.f<q1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101925a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101926b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101927c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101928d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f101929e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f101930f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f101931g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f101932h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Integer f101933i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Integer f101934j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public Integer f101935k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public Integer f101936l;

        public a() {
            this.f101925a = null;
            this.f101926b = null;
            this.f101927c = null;
            this.f101928d = null;
            this.f101929e = null;
            this.f101930f = null;
            this.f101931g = null;
            this.f101932h = null;
            this.f101933i = null;
            this.f101934j = null;
            this.f101935k = null;
            this.f101936l = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q1 build() {
            Integer num = this.f101925a;
            if (num == null) {
                throw new IllegalStateException("Required field 'word_topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101926b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'current_score' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f101927c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'span_days' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f101928d;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'used_time' is missing");
            }
            int intValue4 = num4.intValue();
            Integer num5 = this.f101929e;
            if (num5 == null) {
                throw new IllegalStateException("Required field 'done_times' is missing");
            }
            int intValue5 = num5.intValue();
            Integer num6 = this.f101930f;
            if (num6 == null) {
                throw new IllegalStateException("Required field 'wrong_times' is missing");
            }
            int intValue6 = num6.intValue();
            Integer num7 = this.f101931g;
            if (num7 != null) {
                return new q1(intValue, intValue2, intValue3, intValue4, intValue5, intValue6, num7.intValue(), this.f101932h, this.f101933i, this.f101934j, this.f101935k, this.f101936l);
            }
            throw new IllegalStateException("Required field 'is_first_do_at_today' is missing");
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f101935k = num;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101926b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101929e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f101931g = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(@m80.l Integer num) {
            this.f101934j = num;
            return this;
        }

        @m80.k
        public final a g(@m80.l Integer num) {
            this.f101936l = num;
            return this;
        }

        @m80.k
        public final a h(int i11) {
            this.f101927c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a i(@m80.l Integer num) {
            this.f101933i = num;
            return this;
        }

        @m80.k
        public final a j(@m80.l Integer num) {
            this.f101932h = num;
            return this;
        }

        @m80.k
        public final a k(int i11) {
            this.f101928d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a l(int i11) {
            this.f101925a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a m(int i11) {
            this.f101930f = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101925a = null;
            this.f101926b = null;
            this.f101927c = null;
            this.f101928d = null;
            this.f101929e = null;
            this.f101930f = null;
            this.f101931g = null;
            this.f101932h = null;
            this.f101933i = null;
            this.f101934j = null;
            this.f101935k = null;
            this.f101936l = null;
        }

        public a(@m80.k q1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101925a = Integer.valueOf(source.f101913a);
            this.f101926b = Integer.valueOf(source.f101914b);
            this.f101927c = Integer.valueOf(source.f101915c);
            this.f101928d = Integer.valueOf(source.f101916d);
            this.f101929e = Integer.valueOf(source.f101917e);
            this.f101930f = Integer.valueOf(source.f101918f);
            this.f101931g = Integer.valueOf(source.f101919g);
            this.f101932h = source.f101920h;
            this.f101933i = source.f101921i;
            this.f101934j = source.f101922j;
            this.f101935k = source.f101923k;
            this.f101936l = source.f101924l;
        }
    }
}
