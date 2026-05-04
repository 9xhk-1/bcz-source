package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f101180d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b0, a> f101181e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101182a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101183b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101184c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<b0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.c(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.b(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k b0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("MergeState");
            protocol.Q6("id", 1, (byte) 11);
            protocol.p1(struct.f101182a);
            protocol.N2();
            protocol.Q6("state", 2, (byte) 8);
            protocol.l5(struct.f101183b);
            protocol.N2();
            protocol.Q6("percentage", 3, (byte) 8);
            protocol.l5(struct.f101184c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public b0(@m80.k String id2, int i11, int i12) {
        kotlin.jvm.internal.g0.p(id2, "id");
        this.f101182a = id2;
        this.f101183b = i11;
        this.f101184c = i12;
    }

    public static /* synthetic */ b0 e(b0 b0Var, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = b0Var.f101182a;
        }
        if ((i13 & 2) != 0) {
            i11 = b0Var.f101183b;
        }
        if ((i13 & 4) != 0) {
            i12 = b0Var.f101184c;
        }
        return b0Var.d(str, i11, i12);
    }

    @m80.k
    public final String a() {
        return this.f101182a;
    }

    public final int b() {
        return this.f101183b;
    }

    public final int c() {
        return this.f101184c;
    }

    @m80.k
    public final b0 d(@m80.k String id2, int i11, int i12) {
        kotlin.jvm.internal.g0.p(id2, "id");
        return new b0(id2, i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.g0.g(this.f101182a, b0Var.f101182a) && this.f101183b == b0Var.f101183b && this.f101184c == b0Var.f101184c;
    }

    public int hashCode() {
        return (((this.f101182a.hashCode() * 31) + Integer.hashCode(this.f101183b)) * 31) + Integer.hashCode(this.f101184c);
    }

    @m80.k
    public String toString() {
        return "MergeState(id=" + this.f101182a + ", state=" + this.f101183b + ", percentage=" + this.f101184c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101181e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nMergeState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MergeState.kt\ncom/baicizhan/biz/online/user_study_api/MergeState$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n1#2:155\n*E\n"})
    public static final class a implements ts.f<b0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101185a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101186b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101187c;

        public a() {
            this.f101185a = null;
            this.f101186b = null;
            this.f101187c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b0 build() {
            String str = this.f101185a;
            if (str == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            Integer num = this.f101186b;
            if (num == null) {
                throw new IllegalStateException("Required field 'state' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101187c;
            if (num2 != null) {
                return new b0(str, intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'percentage' is missing");
        }

        @m80.k
        public final a b(@m80.k String id2) {
            kotlin.jvm.internal.g0.p(id2, "id");
            this.f101185a = id2;
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101187c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f101186b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101185a = null;
            this.f101186b = null;
            this.f101187c = null;
        }

        public a(@m80.k b0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101185a = source.f101182a;
            this.f101186b = Integer.valueOf(source.f101183b);
            this.f101187c = Integer.valueOf(source.f101184c);
        }
    }
}
