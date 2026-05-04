package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f102247c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<x, a> f102248d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f102249a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f102250b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<x, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k x struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("GameMode");
            protocol.Q6("mode", 1, (byte) 8);
            protocol.l5(struct.f102249a);
            protocol.N2();
            protocol.Q6("show_switch", 2, (byte) 8);
            protocol.l5(struct.f102250b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public x(int i11, int i12) {
        this.f102249a = i11;
        this.f102250b = i12;
    }

    public static /* synthetic */ x d(x xVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = xVar.f102249a;
        }
        if ((i13 & 2) != 0) {
            i12 = xVar.f102250b;
        }
        return xVar.c(i11, i12);
    }

    public final int a() {
        return this.f102249a;
    }

    public final int b() {
        return this.f102250b;
    }

    @m80.k
    public final x c(int i11, int i12) {
        return new x(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f102249a == xVar.f102249a && this.f102250b == xVar.f102250b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f102249a) * 31) + Integer.hashCode(this.f102250b);
    }

    @m80.k
    public String toString() {
        return "GameMode(mode=" + this.f102249a + ", show_switch=" + this.f102250b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102248d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nGameMode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMode.kt\ncom/baicizhan/biz/online/user_study_api/GameMode$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    public static final class a implements ts.f<x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f102251a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102252b;

        public a() {
            this.f102251a = null;
            this.f102252b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x build() {
            Integer num = this.f102251a;
            if (num == null) {
                throw new IllegalStateException("Required field 'mode' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f102252b;
            if (num2 != null) {
                return new x(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'show_switch' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f102251a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f102252b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102251a = null;
            this.f102252b = null;
        }

        public a(@m80.k x source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102251a = Integer.valueOf(source.f102249a);
            this.f102252b = Integer.valueOf(source.f102250b);
        }
    }
}
