package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f79988c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<m, a> f79989d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f79990a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final l f79991b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<m, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    } else if (b11 == 12) {
                        builder.b(l.f79973d.read(protocol));
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
        public void write(@m80.k ws.i protocol, @m80.k m struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("CostCompassRsp");
            protocol.Q6("plan_version", 1, (byte) 10);
            protocol.q7(struct.f79990a);
            protocol.N2();
            protocol.Q6("compass_info", 2, (byte) 12);
            l.f79973d.write(protocol, struct.f79991b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public m(long j11, @m80.k l compass_info) {
        kotlin.jvm.internal.g0.p(compass_info, "compass_info");
        this.f79990a = j11;
        this.f79991b = compass_info;
    }

    public static /* synthetic */ m d(m mVar, long j11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = mVar.f79990a;
        }
        if ((i11 & 2) != 0) {
            lVar = mVar.f79991b;
        }
        return mVar.c(j11, lVar);
    }

    public final long a() {
        return this.f79990a;
    }

    @m80.k
    public final l b() {
        return this.f79991b;
    }

    @m80.k
    public final m c(long j11, @m80.k l compass_info) {
        kotlin.jvm.internal.g0.p(compass_info, "compass_info");
        return new m(j11, compass_info);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f79990a == mVar.f79990a && kotlin.jvm.internal.g0.g(this.f79991b, mVar.f79991b);
    }

    public int hashCode() {
        return (Long.hashCode(this.f79990a) * 31) + this.f79991b.hashCode();
    }

    @m80.k
    public String toString() {
        return "CostCompassRsp(plan_version=" + this.f79990a + ", compass_info=" + this.f79991b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79989d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCostCompassRsp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CostCompassRsp.kt\ncom/baicizhan/biz/online/game_api/CostCompassRsp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
    public static final class a implements ts.f<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f79992a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public l f79993b;

        public a() {
            this.f79992a = null;
            this.f79993b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m build() {
            Long l11 = this.f79992a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'plan_version' is missing");
            }
            long longValue = l11.longValue();
            l lVar = this.f79993b;
            if (lVar != null) {
                return new m(longValue, lVar);
            }
            throw new IllegalStateException("Required field 'compass_info' is missing");
        }

        @m80.k
        public final a b(@m80.k l compass_info) {
            kotlin.jvm.internal.g0.p(compass_info, "compass_info");
            this.f79993b = compass_info;
            return this;
        }

        @m80.k
        public final a c(long j11) {
            this.f79992a = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79992a = null;
            this.f79993b = null;
        }

        public a(@m80.k m source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79992a = Long.valueOf(source.f79990a);
            this.f79993b = source.f79991b;
        }
    }
}
