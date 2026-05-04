package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p1 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f101879d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<p1, a> f101880e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101881a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101882b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101883c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<p1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k p1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserDakaTopic");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f101881a);
            protocol.N2();
            protocol.Q6("wrong_times", 2, (byte) 8);
            protocol.l5(struct.f101882b);
            protocol.N2();
            protocol.Q6("done_times", 3, (byte) 8);
            protocol.l5(struct.f101883c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public p1(int i11, int i12, int i13) {
        this.f101881a = i11;
        this.f101882b = i12;
        this.f101883c = i13;
    }

    public static /* synthetic */ p1 e(p1 p1Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = p1Var.f101881a;
        }
        if ((i14 & 2) != 0) {
            i12 = p1Var.f101882b;
        }
        if ((i14 & 4) != 0) {
            i13 = p1Var.f101883c;
        }
        return p1Var.d(i11, i12, i13);
    }

    public final int a() {
        return this.f101881a;
    }

    public final int b() {
        return this.f101882b;
    }

    public final int c() {
        return this.f101883c;
    }

    @m80.k
    public final p1 d(int i11, int i12, int i13) {
        return new p1(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.f101881a == p1Var.f101881a && this.f101882b == p1Var.f101882b && this.f101883c == p1Var.f101883c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f101881a) * 31) + Integer.hashCode(this.f101882b)) * 31) + Integer.hashCode(this.f101883c);
    }

    @m80.k
    public String toString() {
        return "UserDakaTopic(topic_id=" + this.f101881a + ", wrong_times=" + this.f101882b + ", done_times=" + this.f101883c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101880e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserDakaTopic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDakaTopic.kt\ncom/baicizhan/biz/online/user_study_api/UserDakaTopic$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
    public static final class a implements ts.f<p1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101884a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101885b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101886c;

        public a() {
            this.f101884a = null;
            this.f101885b = null;
            this.f101886c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p1 build() {
            Integer num = this.f101884a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101885b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'wrong_times' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f101886c;
            if (num3 != null) {
                return new p1(intValue, intValue2, num3.intValue());
            }
            throw new IllegalStateException("Required field 'done_times' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101886c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101884a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101885b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101884a = null;
            this.f101885b = null;
            this.f101886c = null;
        }

        public a(@m80.k p1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101884a = Integer.valueOf(source.f101881a);
            this.f101885b = Integer.valueOf(source.f101882b);
            this.f101886c = Integer.valueOf(source.f101883c);
        }
    }
}
