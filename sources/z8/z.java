package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class z implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f102295c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<z, a> f102296d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f102297a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102298b;

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
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        at.b.a(protocol, b11);
                    } else if (b11 == 11) {
                        builder.b(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 10) {
                    builder.c(protocol.T1());
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
            protocol.g6("MainPageJS");
            protocol.Q6("version", 1, (byte) 10);
            protocol.q7(struct.f102297a);
            protocol.N2();
            protocol.Q6("jsUrl", 2, (byte) 11);
            protocol.p1(struct.f102298b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public z(long j11, @m80.k String jsUrl) {
        kotlin.jvm.internal.g0.p(jsUrl, "jsUrl");
        this.f102297a = j11;
        this.f102298b = jsUrl;
    }

    public static /* synthetic */ z d(z zVar, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = zVar.f102297a;
        }
        if ((i11 & 2) != 0) {
            str = zVar.f102298b;
        }
        return zVar.c(j11, str);
    }

    public final long a() {
        return this.f102297a;
    }

    @m80.k
    public final String b() {
        return this.f102298b;
    }

    @m80.k
    public final z c(long j11, @m80.k String jsUrl) {
        kotlin.jvm.internal.g0.p(jsUrl, "jsUrl");
        return new z(j11, jsUrl);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f102297a == zVar.f102297a && kotlin.jvm.internal.g0.g(this.f102298b, zVar.f102298b);
    }

    public int hashCode() {
        return (Long.hashCode(this.f102297a) * 31) + this.f102298b.hashCode();
    }

    @m80.k
    public String toString() {
        return "MainPageJS(version=" + this.f102297a + ", jsUrl=" + this.f102298b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102296d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nMainPageJS.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainPageJS.kt\ncom/baicizhan/biz/online/user_study_api/MainPageJS$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
    public static final class a implements ts.f<z> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f102299a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f102300b;

        public a() {
            this.f102299a = null;
            this.f102300b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z build() {
            Long l11 = this.f102299a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'version' is missing");
            }
            long longValue = l11.longValue();
            String str = this.f102300b;
            if (str != null) {
                return new z(longValue, str);
            }
            throw new IllegalStateException("Required field 'jsUrl' is missing");
        }

        @m80.k
        public final a b(@m80.k String jsUrl) {
            kotlin.jvm.internal.g0.p(jsUrl, "jsUrl");
            this.f102300b = jsUrl;
            return this;
        }

        @m80.k
        public final a c(long j11) {
            this.f102299a = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102299a = null;
            this.f102300b = null;
        }

        public a(@m80.k z source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102299a = Long.valueOf(source.f102297a);
            this.f102300b = source.f102298b;
        }
    }
}
