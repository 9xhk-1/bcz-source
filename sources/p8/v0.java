package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class v0 implements ts.e {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final b f80202k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<v0, a> f80203l = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f80204a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f80205b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final boolean f80206c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f80207d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f80208e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f80209f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final long f80210g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f80211h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f80212i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f80213j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<v0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.i(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readBool());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 7:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.T1());
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k v0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("StudyRecordItem");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f80204a);
            protocol.N2();
            protocol.Q6("stage", 2, (byte) 8);
            protocol.l5(struct.f80205b);
            protocol.N2();
            protocol.Q6("is_killed", 3, (byte) 2);
            protocol.a4(struct.f80206c);
            protocol.N2();
            protocol.Q6("half_time", 4, (byte) 8);
            protocol.l5(struct.f80207d);
            protocol.N2();
            protocol.Q6("next_review_time", 5, (byte) 8);
            protocol.l5(struct.f80208e);
            protocol.N2();
            protocol.Q6("learn_time", 6, (byte) 8);
            protocol.l5(struct.f80209f);
            protocol.N2();
            protocol.Q6("last_modify_time", 7, (byte) 10);
            protocol.q7(struct.f80210g);
            protocol.N2();
            if (struct.f80211h != null) {
                protocol.Q6("correct_times", 8, (byte) 8);
                protocol.l5(struct.f80211h.intValue());
                protocol.N2();
            }
            if (struct.f80212i != null) {
                protocol.Q6("attempt_times", 9, (byte) 8);
                protocol.l5(struct.f80212i.intValue());
                protocol.N2();
            }
            if (struct.f80213j != null) {
                protocol.Q6("usage_time", 10, (byte) 8);
                protocol.l5(struct.f80213j.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public v0(int i11, int i12, boolean z11, int i13, int i14, int i15, long j11, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        this.f80204a = i11;
        this.f80205b = i12;
        this.f80206c = z11;
        this.f80207d = i13;
        this.f80208e = i14;
        this.f80209f = i15;
        this.f80210g = j11;
        this.f80211h = num;
        this.f80212i = num2;
        this.f80213j = num3;
    }

    public static /* synthetic */ v0 l(v0 v0Var, int i11, int i12, boolean z11, int i13, int i14, int i15, long j11, Integer num, Integer num2, Integer num3, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = v0Var.f80204a;
        }
        if ((i16 & 2) != 0) {
            i12 = v0Var.f80205b;
        }
        if ((i16 & 4) != 0) {
            z11 = v0Var.f80206c;
        }
        if ((i16 & 8) != 0) {
            i13 = v0Var.f80207d;
        }
        if ((i16 & 16) != 0) {
            i14 = v0Var.f80208e;
        }
        if ((i16 & 32) != 0) {
            i15 = v0Var.f80209f;
        }
        if ((i16 & 64) != 0) {
            j11 = v0Var.f80210g;
        }
        if ((i16 & 128) != 0) {
            num = v0Var.f80211h;
        }
        if ((i16 & 256) != 0) {
            num2 = v0Var.f80212i;
        }
        if ((i16 & 512) != 0) {
            num3 = v0Var.f80213j;
        }
        Integer num4 = num3;
        Integer num5 = num;
        long j12 = j11;
        int i17 = i14;
        int i18 = i15;
        boolean z12 = z11;
        int i19 = i13;
        return v0Var.k(i11, i12, z12, i19, i17, i18, j12, num5, num2, num4);
    }

    public final int a() {
        return this.f80204a;
    }

    @m80.l
    public final Integer b() {
        return this.f80213j;
    }

    public final int c() {
        return this.f80205b;
    }

    public final boolean d() {
        return this.f80206c;
    }

    public final int e() {
        return this.f80207d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.f80204a == v0Var.f80204a && this.f80205b == v0Var.f80205b && this.f80206c == v0Var.f80206c && this.f80207d == v0Var.f80207d && this.f80208e == v0Var.f80208e && this.f80209f == v0Var.f80209f && this.f80210g == v0Var.f80210g && kotlin.jvm.internal.g0.g(this.f80211h, v0Var.f80211h) && kotlin.jvm.internal.g0.g(this.f80212i, v0Var.f80212i) && kotlin.jvm.internal.g0.g(this.f80213j, v0Var.f80213j);
    }

    public final int f() {
        return this.f80208e;
    }

    public final int g() {
        return this.f80209f;
    }

    public final long h() {
        return this.f80210g;
    }

    public int hashCode() {
        int hashCode = ((((((((((((Integer.hashCode(this.f80204a) * 31) + Integer.hashCode(this.f80205b)) * 31) + Boolean.hashCode(this.f80206c)) * 31) + Integer.hashCode(this.f80207d)) * 31) + Integer.hashCode(this.f80208e)) * 31) + Integer.hashCode(this.f80209f)) * 31) + Long.hashCode(this.f80210g)) * 31;
        Integer num = this.f80211h;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f80212i;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f80213j;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    @m80.l
    public final Integer i() {
        return this.f80211h;
    }

    @m80.l
    public final Integer j() {
        return this.f80212i;
    }

    @m80.k
    public final v0 k(int i11, int i12, boolean z11, int i13, int i14, int i15, long j11, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3) {
        return new v0(i11, i12, z11, i13, i14, i15, j11, num, num2, num3);
    }

    @m80.k
    public String toString() {
        return "StudyRecordItem(topic_id=" + this.f80204a + ", stage=" + this.f80205b + ", is_killed=" + this.f80206c + ", half_time=" + this.f80207d + ", next_review_time=" + this.f80208e + ", learn_time=" + this.f80209f + ", last_modify_time=" + this.f80210g + ", correct_times=" + this.f80211h + ", attempt_times=" + this.f80212i + ", usage_time=" + this.f80213j + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80203l.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nStudyRecordItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyRecordItem.kt\ncom/baicizhan/biz/online/game_api/StudyRecordItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,340:1\n1#2:341\n*E\n"})
    public static final class a implements ts.f<v0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f80214a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f80215b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Boolean f80216c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f80217d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f80218e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f80219f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Long f80220g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f80221h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Integer f80222i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Integer f80223j;

        public a() {
            this.f80214a = null;
            this.f80215b = null;
            this.f80216c = null;
            this.f80217d = null;
            this.f80218e = null;
            this.f80219f = null;
            this.f80220g = null;
            this.f80221h = null;
            this.f80222i = null;
            this.f80223j = null;
        }

        @m80.k
        public final a a(@m80.l Integer num) {
            this.f80222i = num;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v0 build() {
            Integer num = this.f80214a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f80215b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'stage' is missing");
            }
            int intValue2 = num2.intValue();
            Boolean bool = this.f80216c;
            if (bool == null) {
                throw new IllegalStateException("Required field 'is_killed' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            Integer num3 = this.f80217d;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'half_time' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f80218e;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'next_review_time' is missing");
            }
            int intValue4 = num4.intValue();
            Integer num5 = this.f80219f;
            if (num5 == null) {
                throw new IllegalStateException("Required field 'learn_time' is missing");
            }
            int intValue5 = num5.intValue();
            Long l11 = this.f80220g;
            if (l11 != null) {
                return new v0(intValue, intValue2, booleanValue, intValue3, intValue4, intValue5, l11.longValue(), this.f80221h, this.f80222i, this.f80223j);
            }
            throw new IllegalStateException("Required field 'last_modify_time' is missing");
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f80221h = num;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f80217d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(boolean z11) {
            this.f80216c = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a f(long j11) {
            this.f80220g = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f80219f = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(int i11) {
            this.f80218e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a i(int i11) {
            this.f80215b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a j(int i11) {
            this.f80214a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a k(@m80.l Integer num) {
            this.f80223j = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80214a = null;
            this.f80215b = null;
            this.f80216c = null;
            this.f80217d = null;
            this.f80218e = null;
            this.f80219f = null;
            this.f80220g = null;
            this.f80221h = null;
            this.f80222i = null;
            this.f80223j = null;
        }

        public a(@m80.k v0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80214a = Integer.valueOf(source.f80204a);
            this.f80215b = Integer.valueOf(source.f80205b);
            this.f80216c = Boolean.valueOf(source.f80206c);
            this.f80217d = Integer.valueOf(source.f80207d);
            this.f80218e = Integer.valueOf(source.f80208e);
            this.f80219f = Integer.valueOf(source.f80209f);
            this.f80220g = Long.valueOf(source.f80210g);
            this.f80221h = source.f80211h;
            this.f80222i = source.f80212i;
            this.f80223j = source.f80213j;
        }
    }
}
