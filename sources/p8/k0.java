package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f79964d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k0, a> f79965e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79966a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79967b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f79968c;

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
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 8) {
                            builder.c(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
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
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k k0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("RoundWordItem");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f79966a);
            protocol.N2();
            protocol.Q6("half_day", 2, (byte) 8);
            protocol.l5(struct.f79967b);
            protocol.N2();
            protocol.Q6("half_day_updated", 3, (byte) 8);
            protocol.l5(struct.f79968c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public k0(int i11, int i12, int i13) {
        this.f79966a = i11;
        this.f79967b = i12;
        this.f79968c = i13;
    }

    public static /* synthetic */ k0 e(k0 k0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = k0Var.f79966a;
        }
        if ((i14 & 2) != 0) {
            i12 = k0Var.f79967b;
        }
        if ((i14 & 4) != 0) {
            i13 = k0Var.f79968c;
        }
        return k0Var.d(i11, i12, i13);
    }

    public final int a() {
        return this.f79966a;
    }

    public final int b() {
        return this.f79967b;
    }

    public final int c() {
        return this.f79968c;
    }

    @m80.k
    public final k0 d(int i11, int i12, int i13) {
        return new k0(i11, i12, i13);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f79966a == k0Var.f79966a && this.f79967b == k0Var.f79967b && this.f79968c == k0Var.f79968c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f79966a) * 31) + Integer.hashCode(this.f79967b)) * 31) + Integer.hashCode(this.f79968c);
    }

    @m80.k
    public String toString() {
        return "RoundWordItem(topic_id=" + this.f79966a + ", half_day=" + this.f79967b + ", half_day_updated=" + this.f79968c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79965e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRoundWordItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundWordItem.kt\ncom/baicizhan/biz/online/game_api/RoundWordItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
    public static final class a implements ts.f<k0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79969a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79970b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f79971c;

        public a() {
            this.f79969a = null;
            this.f79970b = null;
            this.f79971c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k0 build() {
            Integer num = this.f79969a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79970b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'half_day' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f79971c;
            if (num3 != null) {
                return new k0(intValue, intValue2, num3.intValue());
            }
            throw new IllegalStateException("Required field 'half_day_updated' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f79970b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79971c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f79969a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79969a = null;
            this.f79970b = null;
            this.f79971c = null;
        }

        public a(@m80.k k0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79969a = Integer.valueOf(source.f79966a);
            this.f79970b = Integer.valueOf(source.f79967b);
            this.f79971c = Integer.valueOf(source.f79968c);
        }
    }
}
