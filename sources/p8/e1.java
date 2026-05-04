package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e1 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f79778d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e1, a> f79779e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final c1 f79780a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final b0 f79781b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f79782c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<e1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            at.b.a(protocol, b11);
                        } else if (b11 == 10) {
                            builder.d(protocol.T1());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.c(b0.f79677f.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.a(c1.f79717h.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k e1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserPlanInfo");
            protocol.Q6("book_info", 1, (byte) 12);
            c1.f79717h.write(protocol, struct.f79780a);
            protocol.N2();
            protocol.Q6("plan_progress", 2, (byte) 12);
            b0.f79677f.write(protocol, struct.f79781b);
            protocol.N2();
            protocol.Q6("plan_version", 3, (byte) 10);
            protocol.q7(struct.f79782c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public e1(@m80.k c1 book_info, @m80.k b0 plan_progress, long j11) {
        kotlin.jvm.internal.g0.p(book_info, "book_info");
        kotlin.jvm.internal.g0.p(plan_progress, "plan_progress");
        this.f79780a = book_info;
        this.f79781b = plan_progress;
        this.f79782c = j11;
    }

    public static /* synthetic */ e1 e(e1 e1Var, c1 c1Var, b0 b0Var, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            c1Var = e1Var.f79780a;
        }
        if ((i11 & 2) != 0) {
            b0Var = e1Var.f79781b;
        }
        if ((i11 & 4) != 0) {
            j11 = e1Var.f79782c;
        }
        return e1Var.d(c1Var, b0Var, j11);
    }

    @m80.k
    public final c1 a() {
        return this.f79780a;
    }

    @m80.k
    public final b0 b() {
        return this.f79781b;
    }

    public final long c() {
        return this.f79782c;
    }

    @m80.k
    public final e1 d(@m80.k c1 book_info, @m80.k b0 plan_progress, long j11) {
        kotlin.jvm.internal.g0.p(book_info, "book_info");
        kotlin.jvm.internal.g0.p(plan_progress, "plan_progress");
        return new e1(book_info, plan_progress, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return kotlin.jvm.internal.g0.g(this.f79780a, e1Var.f79780a) && kotlin.jvm.internal.g0.g(this.f79781b, e1Var.f79781b) && this.f79782c == e1Var.f79782c;
    }

    public int hashCode() {
        return (((this.f79780a.hashCode() * 31) + this.f79781b.hashCode()) * 31) + Long.hashCode(this.f79782c);
    }

    @m80.k
    public String toString() {
        return "UserPlanInfo(book_info=" + this.f79780a + ", plan_progress=" + this.f79781b + ", plan_version=" + this.f79782c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79779e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserPlanInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserPlanInfo.kt\ncom/baicizhan/biz/online/game_api/UserPlanInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
    public static final class a implements ts.f<e1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public c1 f79783a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public b0 f79784b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f79785c;

        public a() {
            this.f79783a = null;
            this.f79784b = null;
            this.f79785c = null;
        }

        @m80.k
        public final a a(@m80.k c1 book_info) {
            kotlin.jvm.internal.g0.p(book_info, "book_info");
            this.f79783a = book_info;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e1 build() {
            c1 c1Var = this.f79783a;
            if (c1Var == null) {
                throw new IllegalStateException("Required field 'book_info' is missing");
            }
            b0 b0Var = this.f79784b;
            if (b0Var == null) {
                throw new IllegalStateException("Required field 'plan_progress' is missing");
            }
            Long l11 = this.f79785c;
            if (l11 != null) {
                return new e1(c1Var, b0Var, l11.longValue());
            }
            throw new IllegalStateException("Required field 'plan_version' is missing");
        }

        @m80.k
        public final a c(@m80.k b0 plan_progress) {
            kotlin.jvm.internal.g0.p(plan_progress, "plan_progress");
            this.f79784b = plan_progress;
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f79785c = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79783a = null;
            this.f79784b = null;
            this.f79785c = null;
        }

        public a(@m80.k e1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79783a = source.f79780a;
            this.f79784b = source.f79781b;
            this.f79785c = Long.valueOf(source.f79782c);
        }
    }
}
