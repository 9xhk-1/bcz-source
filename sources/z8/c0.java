package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c0 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101210c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c0, a> f101211d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101212a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101213b;

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
                    } else if (b11 == 11) {
                        builder.b(protocol.readString());
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
            protocol.g6("ModeDesc");
            protocol.Q6("type", 1, (byte) 8);
            protocol.l5(struct.f101212a);
            protocol.N2();
            protocol.Q6("content", 2, (byte) 11);
            protocol.p1(struct.f101213b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public c0(int i11, @m80.k String content) {
        kotlin.jvm.internal.g0.p(content, "content");
        this.f101212a = i11;
        this.f101213b = content;
    }

    public static /* synthetic */ c0 d(c0 c0Var, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = c0Var.f101212a;
        }
        if ((i12 & 2) != 0) {
            str = c0Var.f101213b;
        }
        return c0Var.c(i11, str);
    }

    public final int a() {
        return this.f101212a;
    }

    @m80.k
    public final String b() {
        return this.f101213b;
    }

    @m80.k
    public final c0 c(int i11, @m80.k String content) {
        kotlin.jvm.internal.g0.p(content, "content");
        return new c0(i11, content);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f101212a == c0Var.f101212a && kotlin.jvm.internal.g0.g(this.f101213b, c0Var.f101213b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.f101212a) * 31) + this.f101213b.hashCode();
    }

    @m80.k
    public String toString() {
        return "ModeDesc(type=" + this.f101212a + ", content=" + this.f101213b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101211d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nModeDesc.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModeDesc.kt\ncom/baicizhan/biz/online/user_study_api/ModeDesc$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n1#2:124\n*E\n"})
    public static final class a implements ts.f<c0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101214a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101215b;

        public a() {
            this.f101214a = null;
            this.f101215b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c0 build() {
            Integer num = this.f101214a;
            if (num == null) {
                throw new IllegalStateException("Required field 'type' is missing");
            }
            int intValue = num.intValue();
            String str = this.f101215b;
            if (str != null) {
                return new c0(intValue, str);
            }
            throw new IllegalStateException("Required field 'content' is missing");
        }

        @m80.k
        public final a b(@m80.k String content) {
            kotlin.jvm.internal.g0.p(content, "content");
            this.f101215b = content;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101214a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101214a = null;
            this.f101215b = null;
        }

        public a(@m80.k c0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101214a = Integer.valueOf(source.f101212a);
            this.f101215b = source.f101213b;
        }
    }
}
