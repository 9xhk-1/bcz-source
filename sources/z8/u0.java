package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u0 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f102081c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<u0, a> f102082d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f102083a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f102084b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<u0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                } else if (b11 == 11) {
                    builder.a(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k u0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("TaskUploadReq");
            protocol.Q6("action", 1, (byte) 11);
            protocol.p1(struct.f102083a);
            protocol.N2();
            protocol.Q6("cnt", 2, (byte) 8);
            protocol.l5(struct.f102084b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public u0(@m80.k String action, int i11) {
        kotlin.jvm.internal.g0.p(action, "action");
        this.f102083a = action;
        this.f102084b = i11;
    }

    public static /* synthetic */ u0 d(u0 u0Var, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = u0Var.f102083a;
        }
        if ((i12 & 2) != 0) {
            i11 = u0Var.f102084b;
        }
        return u0Var.c(str, i11);
    }

    @m80.k
    public final String a() {
        return this.f102083a;
    }

    public final int b() {
        return this.f102084b;
    }

    @m80.k
    public final u0 c(@m80.k String action, int i11) {
        kotlin.jvm.internal.g0.p(action, "action");
        return new u0(action, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return kotlin.jvm.internal.g0.g(this.f102083a, u0Var.f102083a) && this.f102084b == u0Var.f102084b;
    }

    public int hashCode() {
        return (this.f102083a.hashCode() * 31) + Integer.hashCode(this.f102084b);
    }

    @m80.k
    public String toString() {
        return "TaskUploadReq(action=" + this.f102083a + ", cnt=" + this.f102084b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f102082d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTaskUploadReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskUploadReq.kt\ncom/baicizhan/biz/online/user_study_api/TaskUploadReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    public static final class a implements ts.f<u0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f102085a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f102086b;

        public a() {
            this.f102085a = null;
            this.f102086b = null;
        }

        @m80.k
        public final a a(@m80.k String action) {
            kotlin.jvm.internal.g0.p(action, "action");
            this.f102085a = action;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u0 build() {
            String str = this.f102085a;
            if (str == null) {
                throw new IllegalStateException("Required field 'action' is missing");
            }
            Integer num = this.f102086b;
            if (num != null) {
                return new u0(str, num.intValue());
            }
            throw new IllegalStateException("Required field 'cnt' is missing");
        }

        @m80.k
        public final a c(int i11) {
            this.f102086b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f102085a = null;
            this.f102086b = null;
        }

        public a(@m80.k u0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f102085a = source.f102083a;
            this.f102086b = Integer.valueOf(source.f102084b);
        }
    }
}
