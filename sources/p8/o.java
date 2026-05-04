package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f80020c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<o, a> f80021d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f80022a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f80023b;

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
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        builder.c(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
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
        public void write(@m80.k ws.i protocol, @m80.k o struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("EnergyInfo");
            protocol.Q6("energy_cost", 1, (byte) 8);
            protocol.l5(struct.f80022a);
            protocol.N2();
            protocol.Q6("energy_count", 2, (byte) 8);
            protocol.l5(struct.f80023b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public o(int i11, int i12) {
        this.f80022a = i11;
        this.f80023b = i12;
    }

    public static /* synthetic */ o d(o oVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = oVar.f80022a;
        }
        if ((i13 & 2) != 0) {
            i12 = oVar.f80023b;
        }
        return oVar.c(i11, i12);
    }

    public final int a() {
        return this.f80022a;
    }

    public final int b() {
        return this.f80023b;
    }

    @m80.k
    public final o c(int i11, int i12) {
        return new o(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f80022a == oVar.f80022a && this.f80023b == oVar.f80023b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f80022a) * 31) + Integer.hashCode(this.f80023b);
    }

    @m80.k
    public String toString() {
        return "EnergyInfo(energy_cost=" + this.f80022a + ", energy_count=" + this.f80023b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80021d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nEnergyInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnergyInfo.kt\ncom/baicizhan/biz/online/game_api/EnergyInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    public static final class a implements ts.f<o> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f80024a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f80025b;

        public a() {
            this.f80024a = null;
            this.f80025b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o build() {
            Integer num = this.f80024a;
            if (num == null) {
                throw new IllegalStateException("Required field 'energy_cost' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f80025b;
            if (num2 != null) {
                return new o(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'energy_count' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f80024a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f80025b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80024a = null;
            this.f80025b = null;
        }

        public a(@m80.k o source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80024a = Integer.valueOf(source.f80022a);
            this.f80025b = Integer.valueOf(source.f80023b);
        }
    }
}
