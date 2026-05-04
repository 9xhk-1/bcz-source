package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class n implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101783c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<n, a> f101784d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f101785a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101786b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<n, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    } else if (b11 == 8) {
                        builder.b(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k n struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("DakaShareBonusReq");
            protocol.Q6("client_timestamp_ms", 1, (byte) 10);
            protocol.q7(struct.f101785a);
            protocol.N2();
            protocol.Q6("channel", 2, (byte) 8);
            protocol.l5(struct.f101786b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public n(long j11, int i11) {
        this.f101785a = j11;
        this.f101786b = i11;
    }

    public static /* synthetic */ n d(n nVar, long j11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = nVar.f101785a;
        }
        if ((i12 & 2) != 0) {
            i11 = nVar.f101786b;
        }
        return nVar.c(j11, i11);
    }

    public final long a() {
        return this.f101785a;
    }

    public final int b() {
        return this.f101786b;
    }

    @m80.k
    public final n c(long j11, int i11) {
        return new n(j11, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f101785a == nVar.f101785a && this.f101786b == nVar.f101786b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f101785a) * 31) + Integer.hashCode(this.f101786b);
    }

    @m80.k
    public String toString() {
        return "DakaShareBonusReq(client_timestamp_ms=" + this.f101785a + ", channel=" + this.f101786b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101784d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDakaShareBonusReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DakaShareBonusReq.kt\ncom/baicizhan/biz/online/user_study_api/DakaShareBonusReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    public static final class a implements ts.f<n> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f101787a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101788b;

        public a() {
            this.f101787a = null;
            this.f101788b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n build() {
            Long l11 = this.f101787a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'client_timestamp_ms' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f101788b;
            if (num != null) {
                return new n(longValue, num.intValue());
            }
            throw new IllegalStateException("Required field 'channel' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101788b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(long j11) {
            this.f101787a = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101787a = null;
            this.f101788b = null;
        }

        public a(@m80.k n source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101787a = Long.valueOf(source.f101785a);
            this.f101788b = Integer.valueOf(source.f101786b);
        }
    }
}
