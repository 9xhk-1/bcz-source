package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class s1 implements ts.e {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final b f102005k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<s1, a> f102006l = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f102007a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f102008b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f102009c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f102010d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102011e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102012f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102013g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102014h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102015i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102016j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<s1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.T1());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.T1());
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
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k s1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserLearnInfo");
            protocol.Q6("last_sync_done_score_time", 1, (byte) 10);
            protocol.q7(struct.f102007a);
            protocol.N2();
            protocol.Q6("total_daka_days", 2, (byte) 8);
            protocol.l5(struct.f102008b);
            protocol.N2();
            protocol.Q6("last_daka_at", 3, (byte) 10);
            protocol.q7(struct.f102009c);
            protocol.N2();
            protocol.Q6("vocab_count", 4, (byte) 8);
            protocol.l5(struct.f102010d);
            protocol.N2();
            if (struct.f102011e != null) {
                protocol.Q6("latest_finished_date", 5, (byte) 10);
                protocol.q7(struct.f102011e.longValue());
                protocol.N2();
            }
            if (struct.f102012f != null) {
                protocol.Q6("collect_words_updated_at", 6, (byte) 10);
                protocol.q7(struct.f102012f.longValue());
                protocol.N2();
            }
            if (struct.f102013g != null) {
                protocol.Q6("listening_vocab_count", 7, (byte) 8);
                protocol.l5(struct.f102013g.intValue());
                protocol.N2();
            }
            if (struct.f102014h != null) {
                protocol.Q6("integration_vocab_count", 8, (byte) 8);
                protocol.l5(struct.f102014h.intValue());
                protocol.N2();
            }
            if (struct.f102015i != null) {
                protocol.Q6("daily_plan_count", 9, (byte) 8);
                protocol.l5(struct.f102015i.intValue());
                protocol.N2();
            }
            if (struct.f102016j != null) {
                protocol.Q6("review_plan_count", 10, (byte) 8);
                protocol.l5(struct.f102016j.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public s1(long j11, int i11, long j12, int i12, @m80.l Long l11, @m80.l Long l12, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4) {
        this.f102007a = j11;
        this.f102008b = i11;
        this.f102009c = j12;
        this.f102010d = i12;
        this.f102011e = l11;
        this.f102012f = l12;
        this.f102013g = num;
        this.f102014h = num2;
        this.f102015i = num3;
        this.f102016j = num4;
    }

    public static /* synthetic */ s1 l(s1 s1Var, long j11, int i11, long j12, int i12, Long l11, Long l12, Integer num, Integer num2, Integer num3, Integer num4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = s1Var.f102007a;
        }
        return s1Var.k(j11, (i13 & 2) != 0 ? s1Var.f102008b : i11, (i13 & 4) != 0 ? s1Var.f102009c : j12, (i13 & 8) != 0 ? s1Var.f102010d : i12, (i13 & 16) != 0 ? s1Var.f102011e : l11, (i13 & 32) != 0 ? s1Var.f102012f : l12, (i13 & 64) != 0 ? s1Var.f102013g : num, (i13 & 128) != 0 ? s1Var.f102014h : num2, (i13 & 256) != 0 ? s1Var.f102015i : num3, (i13 & 512) != 0 ? s1Var.f102016j : num4);
    }

    public final long a() {
        return this.f102007a;
    }

    @m80.l
    public final Integer b() {
        return this.f102016j;
    }

    public final int c() {
        return this.f102008b;
    }

    public final long d() {
        return this.f102009c;
    }

    public final int e() {
        return this.f102010d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.f102007a == s1Var.f102007a && this.f102008b == s1Var.f102008b && this.f102009c == s1Var.f102009c && this.f102010d == s1Var.f102010d && kotlin.jvm.internal.g0.g(this.f102011e, s1Var.f102011e) && kotlin.jvm.internal.g0.g(this.f102012f, s1Var.f102012f) && kotlin.jvm.internal.g0.g(this.f102013g, s1Var.f102013g) && kotlin.jvm.internal.g0.g(this.f102014h, s1Var.f102014h) && kotlin.jvm.internal.g0.g(this.f102015i, s1Var.f102015i) && kotlin.jvm.internal.g0.g(this.f102016j, s1Var.f102016j);
    }

    @m80.l
    public final Long f() {
        return this.f102011e;
    }

    @m80.l
    public final Long g() {
        return this.f102012f;
    }

    @m80.l
    public final Integer h() {
        return this.f102013g;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.f102007a) * 31) + Integer.hashCode(this.f102008b)) * 31) + Long.hashCode(this.f102009c)) * 31) + Integer.hashCode(this.f102010d)) * 31;
        Long l11 = this.f102011e;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f102012f;
        int hashCode3 = (hashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num = this.f102013g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f102014h;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f102015i;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f102016j;
        return hashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    @m80.l
    public final Integer i() {
        return this.f102014h;
    }

    @m80.l
    public final Integer j() {
        return this.f102015i;
    }

    @m80.k
    public final s1 k(long j11, int i11, long j12, int i12, @m80.l Long l11, @m80.l Long l12, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l Integer num4) {
        return new s1(j11, i11, j12, i12, l11, l12, num, num2, num3, num4);
    }

    @m80.k
    public String toString() {
        return "UserLearnInfo(last_sync_done_score_time=" + this.f102007a + ", total_daka_days=" + this.f102008b + ", last_daka_at=" + this.f102009c + ", vocab_count=" + this.f102010d + ", latest_finished_date=" + this.f102011e + ", collect_words_updated_at=" + this.f102012f + ", listening_vocab_count=" + this.f102013g + ", integration_vocab_count=" + this.f102014h + ", daily_plan_count=" + this.f102015i + ", review_plan_count=" + this.f102016j + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102006l.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserLearnInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserLearnInfo.kt\ncom/baicizhan/biz/online/user_study_api/UserLearnInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,369:1\n1#2:370\n*E\n"})
    public static final class a implements ts.f<s1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f102017a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102018b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f102019c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f102020d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Long f102021e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f102022f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f102023g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f102024h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Integer f102025i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Integer f102026j;

        public a() {
            this.f102017a = null;
            this.f102018b = null;
            this.f102019c = null;
            this.f102020d = null;
            this.f102021e = null;
            this.f102022f = null;
            this.f102023g = null;
            this.f102024h = null;
            this.f102025i = null;
            this.f102026j = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s1 build() {
            Long l11 = this.f102017a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'last_sync_done_score_time' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f102018b;
            if (num == null) {
                throw new IllegalStateException("Required field 'total_daka_days' is missing");
            }
            int intValue = num.intValue();
            Long l12 = this.f102019c;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'last_daka_at' is missing");
            }
            long longValue2 = l12.longValue();
            Integer num2 = this.f102020d;
            if (num2 != null) {
                return new s1(longValue, intValue, longValue2, num2.intValue(), this.f102021e, this.f102022f, this.f102023g, this.f102024h, this.f102025i, this.f102026j);
            }
            throw new IllegalStateException("Required field 'vocab_count' is missing");
        }

        @m80.k
        public final a b(@m80.l Long l11) {
            this.f102022f = l11;
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f102025i = num;
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f102024h = num;
            return this;
        }

        @m80.k
        public final a e(long j11) {
            this.f102019c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a f(long j11) {
            this.f102017a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a g(@m80.l Long l11) {
            this.f102021e = l11;
            return this;
        }

        @m80.k
        public final a h(@m80.l Integer num) {
            this.f102023g = num;
            return this;
        }

        @m80.k
        public final a i(@m80.l Integer num) {
            this.f102026j = num;
            return this;
        }

        @m80.k
        public final a j(int i11) {
            this.f102018b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a k(int i11) {
            this.f102020d = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102017a = null;
            this.f102018b = null;
            this.f102019c = null;
            this.f102020d = null;
            this.f102021e = null;
            this.f102022f = null;
            this.f102023g = null;
            this.f102024h = null;
            this.f102025i = null;
            this.f102026j = null;
        }

        public a(@m80.k s1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102017a = Long.valueOf(source.f102007a);
            this.f102018b = Integer.valueOf(source.f102008b);
            this.f102019c = Long.valueOf(source.f102009c);
            this.f102020d = Integer.valueOf(source.f102010d);
            this.f102021e = source.f102011e;
            this.f102022f = source.f102012f;
            this.f102023g = source.f102013g;
            this.f102024h = source.f102014h;
            this.f102025i = source.f102015i;
            this.f102026j = source.f102016j;
        }
    }
}
