package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final c f79906c = new c(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i, a> f79907d = new b();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79908a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f79909b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements ts.a<i, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k i struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("CakeModule");
            protocol.Q6("topicSize", 1, (byte) 8);
            protocol.l5(struct.f79908a);
            protocol.N2();
            if (struct.f79909b != null) {
                protocol.Q6("name", 2, (byte) 11);
                protocol.p1(struct.f79909b);
                protocol.N2();
            }
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

    public i(int i11, @m80.l String str) {
        this.f79908a = i11;
        this.f79909b = str;
    }

    public static /* synthetic */ i d(i iVar, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = iVar.f79908a;
        }
        if ((i12 & 2) != 0) {
            str = iVar.f79909b;
        }
        return iVar.c(i11, str);
    }

    public final int a() {
        return this.f79908a;
    }

    @m80.l
    public final String b() {
        return this.f79909b;
    }

    @m80.k
    public final i c(int i11, @m80.l String str) {
        return new i(i11, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f79908a == iVar.f79908a && kotlin.jvm.internal.g0.g(this.f79909b, iVar.f79909b);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f79908a) * 31;
        String str = this.f79909b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @m80.k
    public String toString() {
        return "CakeModule(topicSize=" + this.f79908a + ", name=" + this.f79909b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79907d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nCakeModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CakeModule.kt\ncom/baicizhan/biz/online/game_api/CakeModule$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
    public static final class a implements ts.f<i> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79910a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f79911b;

        public a() {
            this.f79910a = null;
            this.f79911b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i build() {
            Integer num = this.f79910a;
            if (num != null) {
                return new i(num.intValue(), this.f79911b);
            }
            throw new IllegalStateException("Required field 'topicSize' is missing");
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f79911b = str;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79910a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79910a = null;
            this.f79911b = null;
        }

        public a(@m80.k i source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79910a = Integer.valueOf(source.f79908a);
            this.f79911b = source.f79909b;
        }
    }
}
