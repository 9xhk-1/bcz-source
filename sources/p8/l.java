package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f79972c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l, a> f79973d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79974a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79975b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    builder.a(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k l struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("CompassInfo");
            protocol.Q6("balance", 1, (byte) 8);
            protocol.l5(struct.f79974a);
            protocol.N2();
            protocol.Q6("cost", 2, (byte) 8);
            protocol.l5(struct.f79975b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public l(int i11, int i12) {
        this.f79974a = i11;
        this.f79975b = i12;
    }

    public static /* synthetic */ l d(l lVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = lVar.f79974a;
        }
        if ((i13 & 2) != 0) {
            i12 = lVar.f79975b;
        }
        return lVar.c(i11, i12);
    }

    public final int a() {
        return this.f79974a;
    }

    public final int b() {
        return this.f79975b;
    }

    @m80.k
    public final l c(int i11, int i12) {
        return new l(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f79974a == lVar.f79974a && this.f79975b == lVar.f79975b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f79974a) * 31) + Integer.hashCode(this.f79975b);
    }

    @m80.k
    public String toString() {
        return "CompassInfo(balance=" + this.f79974a + ", cost=" + this.f79975b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79973d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCompassInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompassInfo.kt\ncom/baicizhan/biz/online/game_api/CompassInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    public static final class a implements ts.f<l> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79976a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79977b;

        public a() {
            this.f79976a = null;
            this.f79977b = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f79976a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l build() {
            Integer num = this.f79976a;
            if (num == null) {
                throw new IllegalStateException("Required field 'balance' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79977b;
            if (num2 != null) {
                return new l(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'cost' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f79977b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79976a = null;
            this.f79977b = null;
        }

        public a(@m80.k l source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79976a = Integer.valueOf(source.f79974a);
            this.f79977b = Integer.valueOf(source.f79975b);
        }
    }
}
