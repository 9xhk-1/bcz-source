package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k0 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101703c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k0, a> f101704d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101705a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101706b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<k0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k k0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("RoleInfo");
            protocol.Q6("role_up", 1, (byte) 8);
            protocol.l5(struct.f101705a);
            protocol.N2();
            protocol.Q6("grade", 2, (byte) 8);
            protocol.l5(struct.f101706b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public k0(int i11, int i12) {
        this.f101705a = i11;
        this.f101706b = i12;
    }

    public static /* synthetic */ k0 d(k0 k0Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = k0Var.f101705a;
        }
        if ((i13 & 2) != 0) {
            i12 = k0Var.f101706b;
        }
        return k0Var.c(i11, i12);
    }

    public final int a() {
        return this.f101705a;
    }

    public final int b() {
        return this.f101706b;
    }

    @m80.k
    public final k0 c(int i11, int i12) {
        return new k0(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f101705a == k0Var.f101705a && this.f101706b == k0Var.f101706b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f101705a) * 31) + Integer.hashCode(this.f101706b);
    }

    @m80.k
    public String toString() {
        return "RoleInfo(role_up=" + this.f101705a + ", grade=" + this.f101706b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101704d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRoleInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleInfo.kt\ncom/baicizhan/biz/online/user_study_api/RoleInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
    public static final class a implements ts.f<k0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101707a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101708b;

        public a() {
            this.f101707a = null;
            this.f101708b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k0 build() {
            Integer num = this.f101707a;
            if (num == null) {
                throw new IllegalStateException("Required field 'role_up' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101708b;
            if (num2 != null) {
                return new k0(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'grade' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101708b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101707a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101707a = null;
            this.f101708b = null;
        }

        public a(@m80.k k0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101707a = Integer.valueOf(source.f101705a);
            this.f101708b = Integer.valueOf(source.f101706b);
        }
    }
}
