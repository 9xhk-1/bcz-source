package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f53337d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<o, a> f53338e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f53339a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f53340b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f53341c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<o, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol, @m80.k a builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
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
                            builder.c(Long.valueOf(protocol.T1()));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 10) {
                        builder.d(Long.valueOf(protocol.T1()));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 10) {
                    builder.b(protocol.T1());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k o struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("LiveStreamingInfo");
            protocol.Q6("current_timestamp", 1, (byte) 10);
            protocol.q7(struct.f53339a);
            protocol.N2();
            if (struct.f53340b != null) {
                protocol.Q6("start_timestamp", 2, (byte) 10);
                protocol.q7(struct.f53340b.longValue());
                protocol.N2();
            }
            if (struct.f53341c != null) {
                protocol.Q6("end_timestamp", 3, (byte) 10);
                protocol.q7(struct.f53341c.longValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public o(long j11, @m80.l Long l11, @m80.l Long l12) {
        this.f53339a = j11;
        this.f53340b = l11;
        this.f53341c = l12;
    }

    public static /* synthetic */ o e(o oVar, long j11, Long l11, Long l12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = oVar.f53339a;
        }
        if ((i11 & 2) != 0) {
            l11 = oVar.f53340b;
        }
        if ((i11 & 4) != 0) {
            l12 = oVar.f53341c;
        }
        return oVar.d(j11, l11, l12);
    }

    public final long a() {
        return this.f53339a;
    }

    @m80.l
    public final Long b() {
        return this.f53340b;
    }

    @m80.l
    public final Long c() {
        return this.f53341c;
    }

    @m80.k
    public final o d(long j11, @m80.l Long l11, @m80.l Long l12) {
        return new o(j11, l11, l12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f53339a == oVar.f53339a && g0.g(this.f53340b, oVar.f53340b) && g0.g(this.f53341c, oVar.f53341c);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.f53339a) * 31;
        Long l11 = this.f53340b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.f53341c;
        return hashCode2 + (l12 != null ? l12.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "LiveStreamingInfo(current_timestamp=" + this.f53339a + ", start_timestamp=" + this.f53340b + ", end_timestamp=" + this.f53341c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53338e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLiveStreamingInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveStreamingInfo.kt\ncom/baicizhan/biz/online/advertise_api/LiveStreamingInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
    public static final class a implements ts.f<o> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f53342a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f53343b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f53344c;

        public a() {
            this.f53342a = null;
            this.f53343b = null;
            this.f53344c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o build() {
            Long l11 = this.f53342a;
            if (l11 != null) {
                return new o(l11.longValue(), this.f53343b, this.f53344c);
            }
            throw new IllegalStateException("Required field 'current_timestamp' is missing");
        }

        @m80.k
        public final a b(long j11) {
            this.f53342a = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a c(@m80.l Long l11) {
            this.f53344c = l11;
            return this;
        }

        @m80.k
        public final a d(@m80.l Long l11) {
            this.f53343b = l11;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53342a = null;
            this.f53343b = null;
            this.f53344c = null;
        }

        public a(@m80.k o source) {
            g0.p(source, "source");
            this.f53342a = Long.valueOf(source.f53339a);
            this.f53343b = source.f53340b;
            this.f53344c = source.f53341c;
        }
    }
}
