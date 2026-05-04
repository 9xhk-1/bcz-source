package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j0 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f79946e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j0, a> f79947f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final h0 f79948a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f79949b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f79950c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final o f79951d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<j0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            } else if (b11 == 12) {
                                builder.b(o.f80021d.read(protocol));
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.d(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 10) {
                        builder.c(protocol.T1());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.e(h0.f79845h.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k j0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("RoundRsp");
            protocol.Q6("round_info", 1, (byte) 12);
            h0.f79845h.write(protocol, struct.f79948a);
            protocol.N2();
            protocol.Q6("plan_version", 2, (byte) 10);
            protocol.q7(struct.f79949b);
            protocol.N2();
            protocol.Q6("round_contiue", 3, (byte) 8);
            protocol.l5(struct.f79950c);
            protocol.N2();
            protocol.Q6("energy_info", 4, (byte) 12);
            o.f80021d.write(protocol, struct.f79951d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public j0(@m80.k h0 round_info, long j11, int i11, @m80.k o energy_info) {
        kotlin.jvm.internal.g0.p(round_info, "round_info");
        kotlin.jvm.internal.g0.p(energy_info, "energy_info");
        this.f79948a = round_info;
        this.f79949b = j11;
        this.f79950c = i11;
        this.f79951d = energy_info;
    }

    public static /* synthetic */ j0 f(j0 j0Var, h0 h0Var, long j11, int i11, o oVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            h0Var = j0Var.f79948a;
        }
        if ((i12 & 2) != 0) {
            j11 = j0Var.f79949b;
        }
        if ((i12 & 4) != 0) {
            i11 = j0Var.f79950c;
        }
        if ((i12 & 8) != 0) {
            oVar = j0Var.f79951d;
        }
        return j0Var.e(h0Var, j11, i11, oVar);
    }

    @m80.k
    public final h0 a() {
        return this.f79948a;
    }

    public final long b() {
        return this.f79949b;
    }

    public final int c() {
        return this.f79950c;
    }

    @m80.k
    public final o d() {
        return this.f79951d;
    }

    @m80.k
    public final j0 e(@m80.k h0 round_info, long j11, int i11, @m80.k o energy_info) {
        kotlin.jvm.internal.g0.p(round_info, "round_info");
        kotlin.jvm.internal.g0.p(energy_info, "energy_info");
        return new j0(round_info, j11, i11, energy_info);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return kotlin.jvm.internal.g0.g(this.f79948a, j0Var.f79948a) && this.f79949b == j0Var.f79949b && this.f79950c == j0Var.f79950c && kotlin.jvm.internal.g0.g(this.f79951d, j0Var.f79951d);
    }

    public int hashCode() {
        return (((((this.f79948a.hashCode() * 31) + Long.hashCode(this.f79949b)) * 31) + Integer.hashCode(this.f79950c)) * 31) + this.f79951d.hashCode();
    }

    @m80.k
    public String toString() {
        return "RoundRsp(round_info=" + this.f79948a + ", plan_version=" + this.f79949b + ", round_contiue=" + this.f79950c + ", energy_info=" + this.f79951d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79947f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nRoundRsp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundRsp.kt\ncom/baicizhan/biz/online/game_api/RoundRsp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class a implements ts.f<j0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public h0 f79952a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f79953b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f79954c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public o f79955d;

        public a() {
            this.f79952a = null;
            this.f79953b = null;
            this.f79954c = null;
            this.f79955d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j0 build() {
            h0 h0Var = this.f79952a;
            if (h0Var == null) {
                throw new IllegalStateException("Required field 'round_info' is missing");
            }
            Long l11 = this.f79953b;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'plan_version' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f79954c;
            if (num == null) {
                throw new IllegalStateException("Required field 'round_contiue' is missing");
            }
            int intValue = num.intValue();
            o oVar = this.f79955d;
            if (oVar != null) {
                return new j0(h0Var, longValue, intValue, oVar);
            }
            throw new IllegalStateException("Required field 'energy_info' is missing");
        }

        @m80.k
        public final a b(@m80.k o energy_info) {
            kotlin.jvm.internal.g0.p(energy_info, "energy_info");
            this.f79955d = energy_info;
            return this;
        }

        @m80.k
        public final a c(long j11) {
            this.f79953b = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f79954c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(@m80.k h0 round_info) {
            kotlin.jvm.internal.g0.p(round_info, "round_info");
            this.f79952a = round_info;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79952a = null;
            this.f79953b = null;
            this.f79954c = null;
            this.f79955d = null;
        }

        public a(@m80.k j0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79952a = source.f79948a;
            this.f79953b = Long.valueOf(source.f79949b);
            this.f79954c = Integer.valueOf(source.f79950c);
            this.f79955d = source.f79951d;
        }
    }
}
