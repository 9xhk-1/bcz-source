package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h0 implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f101571b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<h0, a> f101572c = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final i0 f101573a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<h0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                if (a62.f96797c != 1) {
                    at.b.a(protocol, b11);
                } else if (b11 == 12) {
                    builder.b(i0.f101610e.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k h0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("Recommendation");
            if (struct.f101573a != null) {
                protocol.Q6("rec_daka", 1, (byte) 12);
                i0.f101610e.write(protocol, struct.f101573a);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public h0(@m80.l i0 i0Var) {
        this.f101573a = i0Var;
    }

    public static /* synthetic */ h0 c(h0 h0Var, i0 i0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i0Var = h0Var.f101573a;
        }
        return h0Var.b(i0Var);
    }

    @m80.l
    public final i0 a() {
        return this.f101573a;
    }

    @m80.k
    public final h0 b(@m80.l i0 i0Var) {
        return new h0(i0Var);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && kotlin.jvm.internal.g0.g(this.f101573a, ((h0) obj).f101573a);
    }

    public int hashCode() {
        i0 i0Var = this.f101573a;
        if (i0Var == null) {
            return 0;
        }
        return i0Var.hashCode();
    }

    @m80.k
    public String toString() {
        return "Recommendation(rec_daka=" + this.f101573a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101572c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRecommendation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recommendation.kt\ncom/baicizhan/biz/online/user_study_api/Recommendation$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
    public static final class a implements ts.f<h0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public i0 f101574a;

        public a() {
            this.f101574a = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 build() {
            return new h0(this.f101574a);
        }

        @m80.k
        public final a b(@m80.l i0 i0Var) {
            this.f101574a = i0Var;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101574a = null;
        }

        public a(@m80.k h0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101574a = source.f101573a;
        }
    }
}
