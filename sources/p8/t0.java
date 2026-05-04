package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class t0 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f80174c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<t0, a> f80175d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f80176a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f80177b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<t0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k t0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SentenceUserBuildingLevels");
            protocol.Q6("buildingId", 1, (byte) 8);
            protocol.l5(struct.f80176a);
            protocol.N2();
            protocol.Q6("currentBuildingLevel", 2, (byte) 8);
            protocol.l5(struct.f80177b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public t0(int i11, int i12) {
        this.f80176a = i11;
        this.f80177b = i12;
    }

    public static /* synthetic */ t0 d(t0 t0Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = t0Var.f80176a;
        }
        if ((i13 & 2) != 0) {
            i12 = t0Var.f80177b;
        }
        return t0Var.c(i11, i12);
    }

    public final int a() {
        return this.f80176a;
    }

    public final int b() {
        return this.f80177b;
    }

    @m80.k
    public final t0 c(int i11, int i12) {
        return new t0(i11, i12);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f80176a == t0Var.f80176a && this.f80177b == t0Var.f80177b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f80176a) * 31) + Integer.hashCode(this.f80177b);
    }

    @m80.k
    public String toString() {
        return "SentenceUserBuildingLevels(buildingId=" + this.f80176a + ", currentBuildingLevel=" + this.f80177b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80175d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSentenceUserBuildingLevels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceUserBuildingLevels.kt\ncom/baicizhan/biz/online/game_api/SentenceUserBuildingLevels$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
    public static final class a implements ts.f<t0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f80178a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f80179b;

        public a() {
            this.f80178a = null;
            this.f80179b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t0 build() {
            Integer num = this.f80178a;
            if (num == null) {
                throw new IllegalStateException("Required field 'buildingId' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f80179b;
            if (num2 != null) {
                return new t0(intValue, num2.intValue());
            }
            throw new IllegalStateException("Required field 'currentBuildingLevel' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f80178a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f80179b = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80178a = null;
            this.f80179b = null;
        }

        public a(@m80.k t0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80178a = Integer.valueOf(source.f80176a);
            this.f80179b = Integer.valueOf(source.f80177b);
        }
    }
}
