package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i1 implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f79926f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<i1, a> f79927g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f79928a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79929b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f79930c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f79931d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final n f79932e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<i1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 12) {
                                    builder.c(n.f80003d.read(protocol));
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 10) {
                                builder.e(protocol.T1());
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
                } else if (b11 == 10) {
                    builder.f(protocol.T1());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k i1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("WordEnergyInfo");
            protocol.Q6("unlimited_time", 1, (byte) 10);
            protocol.q7(struct.f79928a);
            protocol.N2();
            protocol.Q6("energy_max", 2, (byte) 8);
            protocol.l5(struct.f79929b);
            protocol.N2();
            protocol.Q6("energy_count", 3, (byte) 8);
            protocol.l5(struct.f79930c);
            protocol.N2();
            protocol.Q6("next_energy_time", 4, (byte) 10);
            protocol.q7(struct.f79931d);
            protocol.N2();
            protocol.Q6("energy_cycle", 5, (byte) 12);
            n.f80003d.write(protocol, struct.f79932e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public i1(long j11, int i11, int i12, long j12, @m80.k n energy_cycle) {
        kotlin.jvm.internal.g0.p(energy_cycle, "energy_cycle");
        this.f79928a = j11;
        this.f79929b = i11;
        this.f79930c = i12;
        this.f79931d = j12;
        this.f79932e = energy_cycle;
    }

    public static /* synthetic */ i1 g(i1 i1Var, long j11, int i11, int i12, long j12, n nVar, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            j11 = i1Var.f79928a;
        }
        long j13 = j11;
        if ((i13 & 2) != 0) {
            i11 = i1Var.f79929b;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            i12 = i1Var.f79930c;
        }
        int i15 = i12;
        if ((i13 & 8) != 0) {
            j12 = i1Var.f79931d;
        }
        long j14 = j12;
        if ((i13 & 16) != 0) {
            nVar = i1Var.f79932e;
        }
        return i1Var.f(j13, i14, i15, j14, nVar);
    }

    public final long a() {
        return this.f79928a;
    }

    public final int b() {
        return this.f79929b;
    }

    public final int c() {
        return this.f79930c;
    }

    public final long d() {
        return this.f79931d;
    }

    @m80.k
    public final n e() {
        return this.f79932e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return this.f79928a == i1Var.f79928a && this.f79929b == i1Var.f79929b && this.f79930c == i1Var.f79930c && this.f79931d == i1Var.f79931d && kotlin.jvm.internal.g0.g(this.f79932e, i1Var.f79932e);
    }

    @m80.k
    public final i1 f(long j11, int i11, int i12, long j12, @m80.k n energy_cycle) {
        kotlin.jvm.internal.g0.p(energy_cycle, "energy_cycle");
        return new i1(j11, i11, i12, j12, energy_cycle);
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f79928a) * 31) + Integer.hashCode(this.f79929b)) * 31) + Integer.hashCode(this.f79930c)) * 31) + Long.hashCode(this.f79931d)) * 31) + this.f79932e.hashCode();
    }

    @m80.k
    public String toString() {
        return "WordEnergyInfo(unlimited_time=" + this.f79928a + ", energy_max=" + this.f79929b + ", energy_count=" + this.f79930c + ", next_energy_time=" + this.f79931d + ", energy_cycle=" + this.f79932e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79927g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordEnergyInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordEnergyInfo.kt\ncom/baicizhan/biz/online/game_api/WordEnergyInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,211:1\n1#2:212\n*E\n"})
    public static final class a implements ts.f<i1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f79933a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79934b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f79935c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f79936d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public n f79937e;

        public a() {
            this.f79933a = null;
            this.f79934b = null;
            this.f79935c = null;
            this.f79936d = null;
            this.f79937e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i1 build() {
            Long l11 = this.f79933a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'unlimited_time' is missing");
            }
            long longValue = l11.longValue();
            Integer num = this.f79934b;
            if (num == null) {
                throw new IllegalStateException("Required field 'energy_max' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79935c;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'energy_count' is missing");
            }
            int intValue2 = num2.intValue();
            Long l12 = this.f79936d;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'next_energy_time' is missing");
            }
            long longValue2 = l12.longValue();
            n nVar = this.f79937e;
            if (nVar != null) {
                return new i1(longValue, intValue, intValue2, longValue2, nVar);
            }
            throw new IllegalStateException("Required field 'energy_cycle' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f79935c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(@m80.k n energy_cycle) {
            kotlin.jvm.internal.g0.p(energy_cycle, "energy_cycle");
            this.f79937e = energy_cycle;
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f79934b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(long j11) {
            this.f79936d = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a f(long j11) {
            this.f79933a = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79933a = null;
            this.f79934b = null;
            this.f79935c = null;
            this.f79936d = null;
            this.f79937e = null;
        }

        public a(@m80.k i1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79933a = Long.valueOf(source.f79928a);
            this.f79934b = Integer.valueOf(source.f79929b);
            this.f79935c = Integer.valueOf(source.f79930c);
            this.f79936d = Long.valueOf(source.f79931d);
            this.f79937e = source.f79932e;
        }
    }
}
