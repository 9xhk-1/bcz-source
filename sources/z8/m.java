package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class m implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101753c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<m, a> f101754d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101755a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101756b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<m, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k m struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("DakaRescueInfo");
            protocol.Q6("code", 1, (byte) 8);
            protocol.l5(struct.f101755a);
            protocol.N2();
            protocol.Q6("message", 2, (byte) 11);
            protocol.p1(struct.f101756b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public m(int i11, @m80.k String message) {
        kotlin.jvm.internal.g0.p(message, "message");
        this.f101755a = i11;
        this.f101756b = message;
    }

    public static /* synthetic */ m d(m mVar, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = mVar.f101755a;
        }
        if ((i12 & 2) != 0) {
            str = mVar.f101756b;
        }
        return mVar.c(i11, str);
    }

    public final int a() {
        return this.f101755a;
    }

    @m80.k
    public final String b() {
        return this.f101756b;
    }

    @m80.k
    public final m c(int i11, @m80.k String message) {
        kotlin.jvm.internal.g0.p(message, "message");
        return new m(i11, message);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f101755a == mVar.f101755a && kotlin.jvm.internal.g0.g(this.f101756b, mVar.f101756b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f101755a) * 31) + this.f101756b.hashCode();
    }

    @m80.k
    public String toString() {
        return "DakaRescueInfo(code=" + this.f101755a + ", message=" + this.f101756b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101754d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nDakaRescueInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DakaRescueInfo.kt\ncom/baicizhan/biz/online/user_study_api/DakaRescueInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    public static final class a implements ts.f<m> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101757a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101758b;

        public a() {
            this.f101757a = null;
            this.f101758b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m build() {
            Integer num = this.f101757a;
            if (num == null) {
                throw new IllegalStateException("Required field 'code' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101758b;
            if (str != null) {
                return new m(intValue, str);
            }
            throw new IllegalStateException("Required field 'message' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101757a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String message) {
            kotlin.jvm.internal.g0.p(message, "message");
            this.f101758b = message;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101757a = null;
            this.f101758b = null;
        }

        public a(@m80.k m source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101757a = Integer.valueOf(source.f101755a);
            this.f101758b = source.f101756b;
        }
    }
}
