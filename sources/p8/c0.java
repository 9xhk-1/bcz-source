package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c0 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f79710c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c0, a> f79711d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79712a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79713b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<c0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k c0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("PropsItem");
            protocol.Q6("props_type", 1, (byte) 8);
            protocol.l5(struct.f79712a);
            protocol.N2();
            protocol.Q6("count", 2, (byte) 8);
            protocol.l5(struct.f79713b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public c0(int i11, int i12) {
        this.f79712a = i11;
        this.f79713b = i12;
    }

    public static /* synthetic */ c0 d(c0 c0Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = c0Var.f79712a;
        }
        if ((i13 & 2) != 0) {
            i12 = c0Var.f79713b;
        }
        return c0Var.c(i11, i12);
    }

    public final int a() {
        return this.f79712a;
    }

    public final int b() {
        return this.f79713b;
    }

    @m80.k
    public final c0 c(int i11, int i12) {
        return new c0(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f79712a == c0Var.f79712a && this.f79713b == c0Var.f79713b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f79712a) * 31) + Integer.hashCode(this.f79713b);
    }

    @m80.k
    public String toString() {
        return "PropsItem(props_type=" + this.f79712a + ", count=" + this.f79713b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79711d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nPropsItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PropsItem.kt\ncom/baicizhan/biz/online/game_api/PropsItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    public static final class a implements ts.f<c0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79714a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79715b;

        public a() {
            this.f79714a = null;
            this.f79715b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c0 build() {
            Integer num = this.f79714a;
            if (num == null) {
                throw new IllegalStateException("Required field 'props_type' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79715b;
            if (num2 != null) {
                return new c0(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'count' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f79715b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79714a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79714a = null;
            this.f79715b = null;
        }

        public a(@m80.k c0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79714a = Integer.valueOf(source.f79712a);
            this.f79715b = Integer.valueOf(source.f79713b);
        }
    }
}
