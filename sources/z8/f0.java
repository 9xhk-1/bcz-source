package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f101505d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f0, a> f101506e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101507a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101508b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101509c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 11) {
                            builder.d(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
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
        public void write(@m80.k ws.i protocol, @m80.k f0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("PangolinAD");
            protocol.Q6("enablePangolin", 1, (byte) 8);
            protocol.l5(struct.f101507a);
            protocol.N2();
            if (struct.f101508b != null) {
                protocol.Q6("slotId1", 2, (byte) 11);
                protocol.p1(struct.f101508b);
                protocol.N2();
            }
            if (struct.f101509c != null) {
                protocol.Q6("slotId2", 3, (byte) 11);
                protocol.p1(struct.f101509c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public f0(int i11, @m80.l String str, @m80.l String str2) {
        this.f101507a = i11;
        this.f101508b = str;
        this.f101509c = str2;
    }

    public static /* synthetic */ f0 e(f0 f0Var, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = f0Var.f101507a;
        }
        if ((i12 & 2) != 0) {
            str = f0Var.f101508b;
        }
        if ((i12 & 4) != 0) {
            str2 = f0Var.f101509c;
        }
        return f0Var.d(i11, str, str2);
    }

    public final int a() {
        return this.f101507a;
    }

    @m80.l
    public final String b() {
        return this.f101508b;
    }

    @m80.l
    public final String c() {
        return this.f101509c;
    }

    @m80.k
    public final f0 d(int i11, @m80.l String str, @m80.l String str2) {
        return new f0(i11, str, str2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f101507a == f0Var.f101507a && kotlin.jvm.internal.g0.g(this.f101508b, f0Var.f101508b) && kotlin.jvm.internal.g0.g(this.f101509c, f0Var.f101509c);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f101507a) * 31;
        String str = this.f101508b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101509c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "PangolinAD(enablePangolin=" + this.f101507a + ", slotId1=" + this.f101508b + ", slotId2=" + this.f101509c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101506e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nPangolinAD.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PangolinAD.kt\ncom/baicizhan/biz/online/user_study_api/PangolinAD$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
    public static final class a implements ts.f<f0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101510a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101511b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101512c;

        public a() {
            this.f101510a = null;
            this.f101511b = null;
            this.f101512c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f0 build() {
            Integer num = this.f101510a;
            if (num != null) {
                return new f0(num.intValue(), this.f101511b, this.f101512c);
            }
            throw new IllegalStateException("Required field 'enablePangolin' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101510a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f101511b = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f101512c = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101510a = null;
            this.f101511b = null;
            this.f101512c = null;
        }

        public a(@m80.k f0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101510a = Integer.valueOf(source.f101507a);
            this.f101511b = source.f101508b;
            this.f101512c = source.f101509c;
        }
    }
}
