package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f80188d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<u0, a> f80189e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final e f80190a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final b1 f80191b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final a0 f80192c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<u0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 12) {
                            builder.d(a0.f79647d.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.c(b1.f79687j.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.a(e.f79753j.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k u0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("StudyHomeInfo");
            protocol.Q6("book", 1, (byte) 12);
            e.f79753j.write(protocol, struct.f80190a);
            protocol.N2();
            protocol.Q6("learn_info", 2, (byte) 12);
            b1.f79687j.write(protocol, struct.f80191b);
            protocol.N2();
            protocol.Q6("mascot", 3, (byte) 12);
            a0.f79647d.write(protocol, struct.f80192c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public u0(@m80.k e book, @m80.k b1 learn_info, @m80.k a0 mascot) {
        kotlin.jvm.internal.g0.p(book, "book");
        kotlin.jvm.internal.g0.p(learn_info, "learn_info");
        kotlin.jvm.internal.g0.p(mascot, "mascot");
        this.f80190a = book;
        this.f80191b = learn_info;
        this.f80192c = mascot;
    }

    public static /* synthetic */ u0 e(u0 u0Var, e eVar, b1 b1Var, a0 a0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            eVar = u0Var.f80190a;
        }
        if ((i11 & 2) != 0) {
            b1Var = u0Var.f80191b;
        }
        if ((i11 & 4) != 0) {
            a0Var = u0Var.f80192c;
        }
        return u0Var.d(eVar, b1Var, a0Var);
    }

    @m80.k
    public final e a() {
        return this.f80190a;
    }

    @m80.k
    public final b1 b() {
        return this.f80191b;
    }

    @m80.k
    public final a0 c() {
        return this.f80192c;
    }

    @m80.k
    public final u0 d(@m80.k e book, @m80.k b1 learn_info, @m80.k a0 mascot) {
        kotlin.jvm.internal.g0.p(book, "book");
        kotlin.jvm.internal.g0.p(learn_info, "learn_info");
        kotlin.jvm.internal.g0.p(mascot, "mascot");
        return new u0(book, learn_info, mascot);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return kotlin.jvm.internal.g0.g(this.f80190a, u0Var.f80190a) && kotlin.jvm.internal.g0.g(this.f80191b, u0Var.f80191b) && kotlin.jvm.internal.g0.g(this.f80192c, u0Var.f80192c);
    }

    public int hashCode() {
        return (((this.f80190a.hashCode() * 31) + this.f80191b.hashCode()) * 31) + this.f80192c.hashCode();
    }

    @m80.k
    public String toString() {
        return "StudyHomeInfo(book=" + this.f80190a + ", learn_info=" + this.f80191b + ", mascot=" + this.f80192c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80189e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nStudyHomeInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StudyHomeInfo.kt\ncom/baicizhan/biz/online/game_api/StudyHomeInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
    public static final class a implements ts.f<u0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public e f80193a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public b1 f80194b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public a0 f80195c;

        public a() {
            this.f80193a = null;
            this.f80194b = null;
            this.f80195c = null;
        }

        @m80.k
        public final a a(@m80.k e book) {
            kotlin.jvm.internal.g0.p(book, "book");
            this.f80193a = book;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u0 build() {
            e eVar = this.f80193a;
            if (eVar == null) {
                throw new IllegalStateException("Required field 'book' is missing");
            }
            b1 b1Var = this.f80194b;
            if (b1Var == null) {
                throw new IllegalStateException("Required field 'learn_info' is missing");
            }
            a0 a0Var = this.f80195c;
            if (a0Var != null) {
                return new u0(eVar, b1Var, a0Var);
            }
            throw new IllegalStateException("Required field 'mascot' is missing");
        }

        @m80.k
        public final a c(@m80.k b1 learn_info) {
            kotlin.jvm.internal.g0.p(learn_info, "learn_info");
            this.f80194b = learn_info;
            return this;
        }

        @m80.k
        public final a d(@m80.k a0 mascot) {
            kotlin.jvm.internal.g0.p(mascot, "mascot");
            this.f80195c = mascot;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80193a = null;
            this.f80194b = null;
            this.f80195c = null;
        }

        public a(@m80.k u0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80193a = source.f80190a;
            this.f80194b = source.f80191b;
            this.f80195c = source.f80192c;
        }
    }
}
