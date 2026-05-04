package u8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f91914d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e, a> f91915e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f91916a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f91917b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final f f91918c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<e, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 12) {
                            builder.b(f.f91923g.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 10) {
                        builder.d(protocol.T1());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("MemberPopupSaleInfo");
            protocol.Q6("member_sale_stage", 1, (byte) 8);
            protocol.l5(struct.f91916a);
            protocol.N2();
            protocol.Q6("stage_end_time", 2, (byte) 10);
            protocol.q7(struct.f91917b);
            protocol.N2();
            if (struct.f91918c != null) {
                protocol.Q6("member_sale_info", 3, (byte) 12);
                f.f91923g.write(protocol, struct.f91918c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public e(int i11, long j11, @m80.l f fVar) {
        this.f91916a = i11;
        this.f91917b = j11;
        this.f91918c = fVar;
    }

    public static /* synthetic */ e e(e eVar, int i11, long j11, f fVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = eVar.f91916a;
        }
        if ((i12 & 2) != 0) {
            j11 = eVar.f91917b;
        }
        if ((i12 & 4) != 0) {
            fVar = eVar.f91918c;
        }
        return eVar.d(i11, j11, fVar);
    }

    public final int a() {
        return this.f91916a;
    }

    public final long b() {
        return this.f91917b;
    }

    @m80.l
    public final f c() {
        return this.f91918c;
    }

    @m80.k
    public final e d(int i11, long j11, @m80.l f fVar) {
        return new e(i11, j11, fVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f91916a == eVar.f91916a && this.f91917b == eVar.f91917b && g0.g(this.f91918c, eVar.f91918c);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f91916a) * 31) + Long.hashCode(this.f91917b)) * 31;
        f fVar = this.f91918c;
        return hashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    @m80.k
    public String toString() {
        return "MemberPopupSaleInfo(member_sale_stage=" + this.f91916a + ", stage_end_time=" + this.f91917b + ", member_sale_info=" + this.f91918c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f91915e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMemberPopupSaleInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberPopupSaleInfo.kt\ncom/baicizhan/biz/online/strategy_api/MemberPopupSaleInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,158:1\n1#2:159\n*E\n"})
    public static final class a implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f91919a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f91920b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public f f91921c;

        public a() {
            this.f91919a = null;
            this.f91920b = null;
            this.f91921c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e build() {
            Integer num = this.f91919a;
            if (num == null) {
                throw new IllegalStateException("Required field 'member_sale_stage' is missing");
            }
            int intValue = num.intValue();
            Long l11 = this.f91920b;
            if (l11 != null) {
                return new e(intValue, l11.longValue(), this.f91921c);
            }
            throw new IllegalStateException("Required field 'stage_end_time' is missing");
        }

        @m80.k
        public final a b(@m80.l f fVar) {
            this.f91921c = fVar;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f91919a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f91920b = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f91919a = null;
            this.f91920b = null;
            this.f91921c = null;
        }

        public a(@m80.k e source) {
            g0.p(source, "source");
            this.f91919a = Integer.valueOf(source.f91916a);
            this.f91920b = Long.valueOf(source.f91917b);
            this.f91921c = source.f91918c;
        }
    }
}
