package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class z1 implements ts.e {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final b f102333j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<z1, a> f102334k = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102335a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f102336b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102337c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f102338d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102339e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final long f102340f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final long f102341g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    public final long f102342h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f102343i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<z1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.a(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
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
                            builder.c(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.T1());
                            break;
                        }
                    case 7:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.T1());
                            break;
                        }
                    case 8:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.T1());
                            break;
                        }
                    case 9:
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
        public void write(@m80.k ws.i protocol, @m80.k z1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserSelectedBookBasicInfo");
            protocol.Q6("book_id", 1, (byte) 8);
            protocol.l5(struct.f102335a);
            protocol.N2();
            protocol.Q6("learned_words_count", 2, (byte) 8);
            protocol.l5(struct.f102336b);
            protocol.N2();
            if (struct.f102337c != null) {
                protocol.Q6("group_id", 3, (byte) 8);
                protocol.l5(struct.f102337c.intValue());
                protocol.N2();
            }
            if (struct.f102338d != null) {
                protocol.Q6("daily_plan_count", 4, (byte) 8);
                protocol.l5(struct.f102338d.intValue());
                protocol.N2();
            }
            if (struct.f102339e != null) {
                protocol.Q6("selected_end_time", 5, (byte) 10);
                protocol.q7(struct.f102339e.longValue());
                protocol.N2();
            }
            protocol.Q6("last_touch_at", 6, (byte) 10);
            protocol.q7(struct.f102340f);
            protocol.N2();
            protocol.Q6("roadmap_version", 7, (byte) 10);
            protocol.q7(struct.f102341g);
            protocol.N2();
            protocol.Q6("word_fm_updated_at", 8, (byte) 10);
            protocol.q7(struct.f102342h);
            protocol.N2();
            if (struct.f102343i != null) {
                protocol.Q6("poster_updated_at", 9, (byte) 10);
                protocol.q7(struct.f102343i.longValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public z1(int i11, int i12, @m80.l Integer num, @m80.l Integer num2, @m80.l Long l11, long j11, long j12, long j13, @m80.l Long l12) {
        this.f102335a = i11;
        this.f102336b = i12;
        this.f102337c = num;
        this.f102338d = num2;
        this.f102339e = l11;
        this.f102340f = j11;
        this.f102341g = j12;
        this.f102342h = j13;
        this.f102343i = l12;
    }

    public static /* synthetic */ z1 k(z1 z1Var, int i11, int i12, Integer num, Integer num2, Long l11, long j11, long j12, long j13, Long l12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = z1Var.f102335a;
        }
        if ((i13 & 2) != 0) {
            i12 = z1Var.f102336b;
        }
        if ((i13 & 4) != 0) {
            num = z1Var.f102337c;
        }
        if ((i13 & 8) != 0) {
            num2 = z1Var.f102338d;
        }
        if ((i13 & 16) != 0) {
            l11 = z1Var.f102339e;
        }
        if ((i13 & 32) != 0) {
            j11 = z1Var.f102340f;
        }
        if ((i13 & 64) != 0) {
            j12 = z1Var.f102341g;
        }
        if ((i13 & 128) != 0) {
            j13 = z1Var.f102342h;
        }
        if ((i13 & 256) != 0) {
            l12 = z1Var.f102343i;
        }
        Long l13 = l12;
        long j14 = j13;
        long j15 = j12;
        long j16 = j11;
        Long l14 = l11;
        Integer num3 = num;
        return z1Var.j(i11, i12, num3, num2, l14, j16, j15, j14, l13);
    }

    public final int a() {
        return this.f102335a;
    }

    public final int b() {
        return this.f102336b;
    }

    @m80.l
    public final Integer c() {
        return this.f102337c;
    }

    @m80.l
    public final Integer d() {
        return this.f102338d;
    }

    @m80.l
    public final Long e() {
        return this.f102339e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f102335a == z1Var.f102335a && this.f102336b == z1Var.f102336b && kotlin.jvm.internal.g0.g(this.f102337c, z1Var.f102337c) && kotlin.jvm.internal.g0.g(this.f102338d, z1Var.f102338d) && kotlin.jvm.internal.g0.g(this.f102339e, z1Var.f102339e) && this.f102340f == z1Var.f102340f && this.f102341g == z1Var.f102341g && this.f102342h == z1Var.f102342h && kotlin.jvm.internal.g0.g(this.f102343i, z1Var.f102343i);
    }

    public final long f() {
        return this.f102340f;
    }

    public final long g() {
        return this.f102341g;
    }

    public final long h() {
        return this.f102342h;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f102335a) * 31) + Integer.hashCode(this.f102336b)) * 31;
        Integer num = this.f102337c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f102338d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l11 = this.f102339e;
        int hashCode4 = (((((((hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31) + Long.hashCode(this.f102340f)) * 31) + Long.hashCode(this.f102341g)) * 31) + Long.hashCode(this.f102342h)) * 31;
        Long l12 = this.f102343i;
        return hashCode4 + (l12 != null ? l12.hashCode() : 0);
    }

    @m80.l
    public final Long i() {
        return this.f102343i;
    }

    @m80.k
    public final z1 j(int i11, int i12, @m80.l Integer num, @m80.l Integer num2, @m80.l Long l11, long j11, long j12, long j13, @m80.l Long l12) {
        return new z1(i11, i12, num, num2, l11, j11, j12, j13, l12);
    }

    @m80.k
    public String toString() {
        return "UserSelectedBookBasicInfo(book_id=" + this.f102335a + ", learned_words_count=" + this.f102336b + ", group_id=" + this.f102337c + ", daily_plan_count=" + this.f102338d + ", selected_end_time=" + this.f102339e + ", last_touch_at=" + this.f102340f + ", roadmap_version=" + this.f102341g + ", word_fm_updated_at=" + this.f102342h + ", poster_updated_at=" + this.f102343i + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102334k.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserSelectedBookBasicInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserSelectedBookBasicInfo.kt\ncom/baicizhan/biz/online/user_study_api/UserSelectedBookBasicInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,337:1\n1#2:338\n*E\n"})
    public static final class a implements ts.f<z1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102344a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102345b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f102346c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f102347d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Long f102348e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f102349f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Long f102350g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Long f102351h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Long f102352i;

        public a() {
            this.f102344a = null;
            this.f102345b = null;
            this.f102346c = null;
            this.f102347d = null;
            this.f102348e = null;
            this.f102349f = null;
            this.f102350g = null;
            this.f102351h = null;
            this.f102352i = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f102344a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z1 build() {
            Integer num = this.f102344a;
            if (num == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f102345b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'learned_words_count' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f102346c;
            Integer num4 = this.f102347d;
            Long l11 = this.f102348e;
            Long l12 = this.f102349f;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'last_touch_at' is missing");
            }
            long longValue = l12.longValue();
            Long l13 = this.f102350g;
            if (l13 == null) {
                throw new IllegalStateException("Required field 'roadmap_version' is missing");
            }
            long longValue2 = l13.longValue();
            Long l14 = this.f102351h;
            if (l14 != null) {
                return new z1(intValue, intValue2, num3, num4, l11, longValue, longValue2, l14.longValue(), this.f102352i);
            }
            throw new IllegalStateException("Required field 'word_fm_updated_at' is missing");
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f102347d = num;
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f102346c = num;
            return this;
        }

        @m80.k
        public final a e(long j11) {
            this.f102349f = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f102345b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(@m80.l Long l11) {
            this.f102352i = l11;
            return this;
        }

        @m80.k
        public final a h(long j11) {
            this.f102350g = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a i(@m80.l Long l11) {
            this.f102348e = l11;
            return this;
        }

        @m80.k
        public final a j(long j11) {
            this.f102351h = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102344a = null;
            this.f102345b = null;
            this.f102346c = null;
            this.f102347d = null;
            this.f102348e = null;
            this.f102349f = null;
            this.f102350g = null;
            this.f102351h = null;
            this.f102352i = null;
        }

        public a(@m80.k z1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102344a = Integer.valueOf(source.f102335a);
            this.f102345b = Integer.valueOf(source.f102336b);
            this.f102346c = source.f102337c;
            this.f102347d = source.f102338d;
            this.f102348e = source.f102339e;
            this.f102349f = Long.valueOf(source.f102340f);
            this.f102350g = Long.valueOf(source.f102341g);
            this.f102351h = Long.valueOf(source.f102342h);
            this.f102352i = source.f102343i;
        }
    }
}
