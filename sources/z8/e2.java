package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e2 implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f101485b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e2, a> f101486c = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101487a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<e2, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e2 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e2 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                } else if (b11 == 8) {
                    builder.b(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k e2 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserStudyMode");
            protocol.Q6("review_mode", 1, (byte) 8);
            protocol.l5(struct.f101487a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public e2(int i11) {
        this.f101487a = i11;
    }

    public static /* synthetic */ e2 c(e2 e2Var, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = e2Var.f101487a;
        }
        return e2Var.b(i11);
    }

    public final int a() {
        return this.f101487a;
    }

    @m80.k
    public final e2 b(int i11) {
        return new e2(i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && this.f101487a == ((e2) obj).f101487a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f101487a);
    }

    @m80.k
    public String toString() {
        return "UserStudyMode(review_mode=" + this.f101487a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101486c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserStudyMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserStudyMode.kt\ncom/baicizhan/biz/online/user_study_api/UserStudyMode$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1#2:98\n*E\n"})
    public static final class a implements ts.f<e2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101488a;

        public a() {
            this.f101488a = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e2 build() {
            Integer num = this.f101488a;
            if (num != null) {
                return new e2(num.intValue());
            }
            throw new IllegalStateException("Required field 'review_mode' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101488a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101488a = null;
        }

        public a(@m80.k e2 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101488a = Integer.valueOf(source.f101487a);
        }
    }
}
