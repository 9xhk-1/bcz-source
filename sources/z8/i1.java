package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i1 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f101617e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i1, a> f101618f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101619a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101620b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f101621c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f101622d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<i1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                builder.d(Integer.valueOf(protocol.s8()));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 10) {
                            builder.c(protocol.T1());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.a(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.e(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k i1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserCollectWord");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f101619a);
            protocol.N2();
            protocol.Q6("book_id", 2, (byte) 8);
            protocol.l5(struct.f101620b);
            protocol.N2();
            protocol.Q6("created_at", 3, (byte) 10);
            protocol.q7(struct.f101621c);
            protocol.N2();
            if (struct.f101622d != null) {
                protocol.Q6("tag_id", 4, (byte) 8);
                protocol.l5(struct.f101622d.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public i1(int i11, int i12, long j11, @m80.l Integer num) {
        this.f101619a = i11;
        this.f101620b = i12;
        this.f101621c = j11;
        this.f101622d = num;
    }

    public static /* synthetic */ i1 f(i1 i1Var, int i11, int i12, long j11, Integer num, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = i1Var.f101619a;
        }
        if ((i13 & 2) != 0) {
            i12 = i1Var.f101620b;
        }
        if ((i13 & 4) != 0) {
            j11 = i1Var.f101621c;
        }
        if ((i13 & 8) != 0) {
            num = i1Var.f101622d;
        }
        Integer num2 = num;
        return i1Var.e(i11, i12, j11, num2);
    }

    public final int a() {
        return this.f101619a;
    }

    public final int b() {
        return this.f101620b;
    }

    public final long c() {
        return this.f101621c;
    }

    @m80.l
    public final Integer d() {
        return this.f101622d;
    }

    @m80.k
    public final i1 e(int i11, int i12, long j11, @m80.l Integer num) {
        return new i1(i11, i12, j11, num);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.f101619a == i1Var.f101619a && this.f101620b == i1Var.f101620b && this.f101621c == i1Var.f101621c && kotlin.jvm.internal.g0.g(this.f101622d, i1Var.f101622d);
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f101619a) * 31) + Integer.hashCode(this.f101620b)) * 31) + Long.hashCode(this.f101621c)) * 31;
        Integer num = this.f101622d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @m80.k
    public String toString() {
        return "UserCollectWord(topic_id=" + this.f101619a + ", book_id=" + this.f101620b + ", created_at=" + this.f101621c + ", tag_id=" + this.f101622d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101618f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserCollectWord.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserCollectWord.kt\ncom/baicizhan/biz/online/user_study_api/UserCollectWord$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"})
    public static final class a implements ts.f<i1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101623a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101624b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f101625c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f101626d;

        public a() {
            this.f101623a = null;
            this.f101624b = null;
            this.f101625c = null;
            this.f101626d = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f101624b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i1 build() {
            Integer num = this.f101623a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101624b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'book_id' is missing");
            }
            int intValue2 = num2.intValue();
            Long l11 = this.f101625c;
            if (l11 != null) {
                return new i1(intValue, intValue2, l11.longValue(), this.f101626d);
            }
            throw new IllegalStateException("Required field 'created_at' is missing");
        }

        @m80.k
        public final a c(long j11) {
            this.f101625c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f101626d = num;
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f101623a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101623a = null;
            this.f101624b = null;
            this.f101625c = null;
            this.f101626d = null;
        }

        public a(@m80.k i1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101623a = Integer.valueOf(source.f101619a);
            this.f101624b = Integer.valueOf(source.f101620b);
            this.f101625c = Long.valueOf(source.f101621c);
            this.f101626d = source.f101622d;
        }
    }
}
