package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l0 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f79978e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l0, a> f79979f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79980a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79981b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f79982c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f79983d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 8) {
                                builder.e(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k l0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SentenceBuildingProgress");
            protocol.Q6("building_id", 1, (byte) 8);
            protocol.l5(struct.f79980a);
            protocol.N2();
            protocol.Q6("building_level_id", 2, (byte) 8);
            protocol.l5(struct.f79981b);
            protocol.N2();
            protocol.Q6("hammer_remain", 3, (byte) 8);
            protocol.l5(struct.f79982c);
            protocol.N2();
            protocol.Q6("hammer_used", 4, (byte) 8);
            protocol.l5(struct.f79983d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public l0(int i11, int i12, int i13, int i14) {
        this.f79980a = i11;
        this.f79981b = i12;
        this.f79982c = i13;
        this.f79983d = i14;
    }

    public static /* synthetic */ l0 f(l0 l0Var, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = l0Var.f79980a;
        }
        if ((i15 & 2) != 0) {
            i12 = l0Var.f79981b;
        }
        if ((i15 & 4) != 0) {
            i13 = l0Var.f79982c;
        }
        if ((i15 & 8) != 0) {
            i14 = l0Var.f79983d;
        }
        return l0Var.e(i11, i12, i13, i14);
    }

    public final int a() {
        return this.f79980a;
    }

    public final int b() {
        return this.f79981b;
    }

    public final int c() {
        return this.f79982c;
    }

    public final int d() {
        return this.f79983d;
    }

    @m80.k
    public final l0 e(int i11, int i12, int i13, int i14) {
        return new l0(i11, i12, i13, i14);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f79980a == l0Var.f79980a && this.f79981b == l0Var.f79981b && this.f79982c == l0Var.f79982c && this.f79983d == l0Var.f79983d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f79980a) * 31) + Integer.hashCode(this.f79981b)) * 31) + Integer.hashCode(this.f79982c)) * 31) + Integer.hashCode(this.f79983d);
    }

    @m80.k
    public String toString() {
        return "SentenceBuildingProgress(building_id=" + this.f79980a + ", building_level_id=" + this.f79981b + ", hammer_remain=" + this.f79982c + ", hammer_used=" + this.f79983d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79979f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSentenceBuildingProgress.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceBuildingProgress.kt\ncom/baicizhan/biz/online/game_api/SentenceBuildingProgress$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
    public static final class a implements ts.f<l0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79984a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79985b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f79986c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f79987d;

        public a() {
            this.f79984a = null;
            this.f79985b = null;
            this.f79986c = null;
            this.f79987d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l0 build() {
            Integer num = this.f79984a;
            if (num == null) {
                throw new IllegalStateException("Required field 'building_id' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79985b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'building_level_id' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f79986c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'hammer_remain' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f79987d;
            if (num4 != null) {
                return new l0(intValue, intValue2, intValue3, num4.intValue());
            }
            throw new IllegalStateException("Required field 'hammer_used' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f79984a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79985b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f79986c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f79987d = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79984a = null;
            this.f79985b = null;
            this.f79986c = null;
            this.f79987d = null;
        }

        public a(@m80.k l0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79984a = Integer.valueOf(source.f79980a);
            this.f79985b = Integer.valueOf(source.f79981b);
            this.f79986c = Integer.valueOf(source.f79982c);
            this.f79987d = Integer.valueOf(source.f79983d);
        }
    }
}
