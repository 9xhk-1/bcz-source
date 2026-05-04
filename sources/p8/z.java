package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class z implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f80280b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<z, a> f80281c = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f80282a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<z, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z read(@m80.k ws.i protocol, @m80.k a builder) {
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
                } else if (b11 == 11) {
                    builder.b(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k z struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("LifeReq");
            protocol.Q6("round_id", 1, (byte) 11);
            protocol.p1(struct.f80282a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public z(@m80.k String round_id) {
        kotlin.jvm.internal.g0.p(round_id, "round_id");
        this.f80282a = round_id;
    }

    public static /* synthetic */ z c(z zVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = zVar.f80282a;
        }
        return zVar.b(str);
    }

    @m80.k
    public final String a() {
        return this.f80282a;
    }

    @m80.k
    public final z b(@m80.k String round_id) {
        kotlin.jvm.internal.g0.p(round_id, "round_id");
        return new z(round_id);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.g0.g(this.f80282a, ((z) obj).f80282a);
    }

    public int hashCode() {
        return this.f80282a.hashCode();
    }

    @m80.k
    public String toString() {
        return "LifeReq(round_id=" + this.f80282a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80281c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nLifeReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifeReq.kt\ncom/baicizhan/biz/online/game_api/LifeReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
    public static final class a implements ts.f<z> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f80283a;

        public a() {
            this.f80283a = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z build() {
            String str = this.f80283a;
            if (str != null) {
                return new z(str);
            }
            throw new IllegalStateException("Required field 'round_id' is missing");
        }

        @m80.k
        public final a b(@m80.k String round_id) {
            kotlin.jvm.internal.g0.p(round_id, "round_id");
            this.f80283a = round_id;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80283a = null;
        }

        public a(@m80.k z source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80283a = source.f80282a;
        }
    }
}
