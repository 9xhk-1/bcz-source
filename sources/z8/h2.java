package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h2 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f101585d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<h2, a> f101586e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101587a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101588b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101589c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<h2, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h2 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h2 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 8) {
                            builder.b(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k h2 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("WikiComponent");
            protocol.Q6("id", 1, (byte) 8);
            protocol.l5(struct.f101587a);
            protocol.N2();
            protocol.Q6("priority", 2, (byte) 8);
            protocol.l5(struct.f101588b);
            protocol.N2();
            protocol.Q6(k3.u0.f65628b, 3, (byte) 8);
            protocol.l5(struct.f101589c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public h2(int i11, int i12, int i13) {
        this.f101587a = i11;
        this.f101588b = i12;
        this.f101589c = i13;
    }

    public static /* synthetic */ h2 e(h2 h2Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = h2Var.f101587a;
        }
        if ((i14 & 2) != 0) {
            i12 = h2Var.f101588b;
        }
        if ((i14 & 4) != 0) {
            i13 = h2Var.f101589c;
        }
        return h2Var.d(i11, i12, i13);
    }

    public final int a() {
        return this.f101587a;
    }

    public final int b() {
        return this.f101588b;
    }

    public final int c() {
        return this.f101589c;
    }

    @m80.k
    public final h2 d(int i11, int i12, int i13) {
        return new h2(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.f101587a == h2Var.f101587a && this.f101588b == h2Var.f101588b && this.f101589c == h2Var.f101589c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f101587a) * 31) + Integer.hashCode(this.f101588b)) * 31) + Integer.hashCode(this.f101589c);
    }

    @m80.k
    public String toString() {
        return "WikiComponent(id=" + this.f101587a + ", priority=" + this.f101588b + ", enable=" + this.f101589c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101586e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWikiComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiComponent.kt\ncom/baicizhan/biz/online/user_study_api/WikiComponent$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
    public static final class a implements ts.f<h2> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101590a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101591b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101592c;

        public a() {
            this.f101590a = null;
            this.f101591b = null;
            this.f101592c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h2 build() {
            Integer num = this.f101590a;
            if (num == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101591b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'priority' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f101592c;
            if (num3 != null) {
                return new h2(intValue, intValue2, num3.intValue());
            }
            throw new IllegalStateException("Required field 'enable' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101592c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101590a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101591b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101590a = null;
            this.f101591b = null;
            this.f101592c = null;
        }

        public a(@m80.k h2 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101590a = Integer.valueOf(source.f101587a);
            this.f101591b = Integer.valueOf(source.f101588b);
            this.f101592c = Integer.valueOf(source.f101589c);
        }
    }
}
