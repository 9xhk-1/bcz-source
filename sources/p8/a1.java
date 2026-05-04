package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a1 implements ts.e {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final b f79652j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a1, a> f79653k = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f79654a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f79655b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f79656c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f79657d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final long f79658e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f79659f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final d1 f79660g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f79661h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f79662i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<a1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.c(protocol.T1());
                            break;
                        }
                    case 2:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.T1());
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.T1());
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.T1());
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.T1());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.s8());
                            break;
                        }
                    case 7:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(d1.f79745e.read(protocol));
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k a1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SyncInfo");
            protocol.Q6("island_version", 1, (byte) 10);
            protocol.q7(struct.f79654a);
            protocol.N2();
            protocol.Q6("roadmap_version", 2, (byte) 10);
            protocol.q7(struct.f79655b);
            protocol.N2();
            protocol.Q6("study_record_version", 3, (byte) 10);
            protocol.q7(struct.f79656c);
            protocol.N2();
            protocol.Q6("plan_version", 4, (byte) 10);
            protocol.q7(struct.f79657d);
            protocol.N2();
            protocol.Q6("server_time", 5, (byte) 10);
            protocol.q7(struct.f79658e);
            protocol.N2();
            protocol.Q6("current_book_id", 6, (byte) 8);
            protocol.l5(struct.f79659f);
            protocol.N2();
            if (struct.f79660g != null) {
                protocol.Q6("user_data_info", 7, (byte) 12);
                d1.f79745e.write(protocol, struct.f79660g);
                protocol.N2();
            }
            if (struct.f79661h != null) {
                protocol.Q6("sentenceSkuId", 8, (byte) 8);
                protocol.l5(struct.f79661h.intValue());
                protocol.N2();
            }
            if (struct.f79662i != null) {
                protocol.Q6("resource_version", 9, (byte) 8);
                protocol.l5(struct.f79662i.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public a1(long j11, long j12, long j13, long j14, long j15, int i11, @m80.l d1 d1Var, @m80.l Integer num, @m80.l Integer num2) {
        this.f79654a = j11;
        this.f79655b = j12;
        this.f79656c = j13;
        this.f79657d = j14;
        this.f79658e = j15;
        this.f79659f = i11;
        this.f79660g = d1Var;
        this.f79661h = num;
        this.f79662i = num2;
    }

    public final long a() {
        return this.f79654a;
    }

    public final long b() {
        return this.f79655b;
    }

    public final long c() {
        return this.f79656c;
    }

    public final long d() {
        return this.f79657d;
    }

    public final long e() {
        return this.f79658e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return this.f79654a == a1Var.f79654a && this.f79655b == a1Var.f79655b && this.f79656c == a1Var.f79656c && this.f79657d == a1Var.f79657d && this.f79658e == a1Var.f79658e && this.f79659f == a1Var.f79659f && kotlin.jvm.internal.g0.g(this.f79660g, a1Var.f79660g) && kotlin.jvm.internal.g0.g(this.f79661h, a1Var.f79661h) && kotlin.jvm.internal.g0.g(this.f79662i, a1Var.f79662i);
    }

    public final int f() {
        return this.f79659f;
    }

    @m80.l
    public final d1 g() {
        return this.f79660g;
    }

    @m80.l
    public final Integer h() {
        return this.f79661h;
    }

    public int hashCode() {
        int hashCode = ((((((((((Long.hashCode(this.f79654a) * 31) + Long.hashCode(this.f79655b)) * 31) + Long.hashCode(this.f79656c)) * 31) + Long.hashCode(this.f79657d)) * 31) + Long.hashCode(this.f79658e)) * 31) + Integer.hashCode(this.f79659f)) * 31;
        d1 d1Var = this.f79660g;
        int hashCode2 = (hashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        Integer num = this.f79661h;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f79662i;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @m80.l
    public final Integer i() {
        return this.f79662i;
    }

    @m80.k
    public final a1 j(long j11, long j12, long j13, long j14, long j15, int i11, @m80.l d1 d1Var, @m80.l Integer num, @m80.l Integer num2) {
        return new a1(j11, j12, j13, j14, j15, i11, d1Var, num, num2);
    }

    @m80.k
    public String toString() {
        return "SyncInfo(island_version=" + this.f79654a + ", roadmap_version=" + this.f79655b + ", study_record_version=" + this.f79656c + ", plan_version=" + this.f79657d + ", server_time=" + this.f79658e + ", current_book_id=" + this.f79659f + ", user_data_info=" + this.f79660g + ", sentenceSkuId=" + this.f79661h + ", resource_version=" + this.f79662i + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79653k.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSyncInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncInfo.kt\ncom/baicizhan/biz/online/game_api/SyncInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    public static final class a implements ts.f<a1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f79663a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f79664b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f79665c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f79666d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Long f79667e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f79668f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public d1 f79669g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f79670h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Integer f79671i;

        public a() {
            this.f79663a = null;
            this.f79664b = null;
            this.f79665c = null;
            this.f79666d = null;
            this.f79667e = null;
            this.f79668f = null;
            this.f79669g = null;
            this.f79670h = null;
            this.f79671i = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a1 build() {
            Long l11 = this.f79663a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'island_version' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f79664b;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'roadmap_version' is missing");
            }
            long longValue2 = l12.longValue();
            Long l13 = this.f79665c;
            if (l13 == null) {
                throw new IllegalStateException("Required field 'study_record_version' is missing");
            }
            long longValue3 = l13.longValue();
            Long l14 = this.f79666d;
            if (l14 == null) {
                throw new IllegalStateException("Required field 'plan_version' is missing");
            }
            long longValue4 = l14.longValue();
            Long l15 = this.f79667e;
            if (l15 == null) {
                throw new IllegalStateException("Required field 'server_time' is missing");
            }
            long longValue5 = l15.longValue();
            Integer num = this.f79668f;
            if (num != null) {
                return new a1(longValue, longValue2, longValue3, longValue4, longValue5, num.intValue(), this.f79669g, this.f79670h, this.f79671i);
            }
            throw new IllegalStateException("Required field 'current_book_id' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f79668f = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(long j11) {
            this.f79663a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f79666d = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f79671i = num;
            return this;
        }

        @m80.k
        public final a f(long j11) {
            this.f79664b = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a g(@m80.l Integer num) {
            this.f79670h = num;
            return this;
        }

        @m80.k
        public final a h(long j11) {
            this.f79667e = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a i(long j11) {
            this.f79665c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a j(@m80.l d1 d1Var) {
            this.f79669g = d1Var;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79663a = null;
            this.f79664b = null;
            this.f79665c = null;
            this.f79666d = null;
            this.f79667e = null;
            this.f79668f = null;
            this.f79669g = null;
            this.f79670h = null;
            this.f79671i = null;
        }

        public a(@m80.k a1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79663a = Long.valueOf(source.f79654a);
            this.f79664b = Long.valueOf(source.f79655b);
            this.f79665c = Long.valueOf(source.f79656c);
            this.f79666d = Long.valueOf(source.f79657d);
            this.f79667e = Long.valueOf(source.f79658e);
            this.f79668f = Integer.valueOf(source.f79659f);
            this.f79669g = source.f79660g;
            this.f79670h = source.f79661h;
            this.f79671i = source.f79662i;
        }
    }
}
