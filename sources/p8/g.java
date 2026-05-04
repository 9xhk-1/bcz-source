package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f79818c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g, a> f79819d = new b();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79820a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79821b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ts.a<g, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k g struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("BuildingLevelInfo");
            protocol.Q6("level", 1, (byte) 8);
            protocol.l5(struct.f79820a);
            protocol.N2();
            protocol.Q6("cost", 2, (byte) 8);
            protocol.l5(struct.f79821b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public g(int i11, int i12) {
        this.f79820a = i11;
        this.f79821b = i12;
    }

    public static /* synthetic */ g d(g gVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = gVar.f79820a;
        }
        if ((i13 & 2) != 0) {
            i12 = gVar.f79821b;
        }
        return gVar.c(i11, i12);
    }

    public final int a() {
        return this.f79820a;
    }

    public final int b() {
        return this.f79821b;
    }

    @m80.k
    public final g c(int i11, int i12) {
        return new g(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f79820a == gVar.f79820a && this.f79821b == gVar.f79821b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f79820a) * 31) + Integer.hashCode(this.f79821b);
    }

    @m80.k
    public String toString() {
        return "BuildingLevelInfo(level=" + this.f79820a + ", cost=" + this.f79821b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79819d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nBuildingLevelInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuildingLevelInfo.kt\ncom/baicizhan/biz/online/game_api/BuildingLevelInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
    public static final class a implements ts.f<g> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79822a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79823b;

        public a() {
            this.f79822a = null;
            this.f79823b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g build() {
            Integer num = this.f79822a;
            if (num == null) {
                throw new IllegalStateException("Required field 'level' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79823b;
            if (num2 != null) {
                return new g(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'cost' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f79823b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79822a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79822a = null;
            this.f79823b = null;
        }

        public a(@m80.k g source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79822a = Integer.valueOf(source.f79820a);
            this.f79823b = Integer.valueOf(source.f79821b);
        }
    }
}
