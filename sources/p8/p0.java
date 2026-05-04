package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class p0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f80048d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<p0, a> f80049e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final i1 f80050a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final l0 f80051b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final r0 f80052c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<p0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public p0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 12) {
                            builder.d(r0.f80103e.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.b(l0.f79979f.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.c(i1.f79927g.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k p0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SentenceGameHome");
            protocol.Q6("energy_info", 1, (byte) 12);
            i1.f79927g.write(protocol, struct.f80050a);
            protocol.N2();
            protocol.Q6("building_progress", 2, (byte) 12);
            l0.f79979f.write(protocol, struct.f80051b);
            protocol.N2();
            if (struct.f80052c != null) {
                protocol.Q6("lesson_info", 3, (byte) 12);
                r0.f80103e.write(protocol, struct.f80052c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public p0(@m80.k i1 energy_info, @m80.k l0 building_progress, @m80.l r0 r0Var) {
        kotlin.jvm.internal.g0.p(energy_info, "energy_info");
        kotlin.jvm.internal.g0.p(building_progress, "building_progress");
        this.f80050a = energy_info;
        this.f80051b = building_progress;
        this.f80052c = r0Var;
    }

    public static /* synthetic */ p0 e(p0 p0Var, i1 i1Var, l0 l0Var, r0 r0Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i1Var = p0Var.f80050a;
        }
        if ((i11 & 2) != 0) {
            l0Var = p0Var.f80051b;
        }
        if ((i11 & 4) != 0) {
            r0Var = p0Var.f80052c;
        }
        return p0Var.d(i1Var, l0Var, r0Var);
    }

    @m80.k
    public final i1 a() {
        return this.f80050a;
    }

    @m80.k
    public final l0 b() {
        return this.f80051b;
    }

    @m80.l
    public final r0 c() {
        return this.f80052c;
    }

    @m80.k
    public final p0 d(@m80.k i1 energy_info, @m80.k l0 building_progress, @m80.l r0 r0Var) {
        kotlin.jvm.internal.g0.p(energy_info, "energy_info");
        kotlin.jvm.internal.g0.p(building_progress, "building_progress");
        return new p0(energy_info, building_progress, r0Var);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.g0.g(this.f80050a, p0Var.f80050a) && kotlin.jvm.internal.g0.g(this.f80051b, p0Var.f80051b) && kotlin.jvm.internal.g0.g(this.f80052c, p0Var.f80052c);
    }

    public int hashCode() {
        int hashCode = ((this.f80050a.hashCode() * 31) + this.f80051b.hashCode()) * 31;
        r0 r0Var = this.f80052c;
        return hashCode + (r0Var == null ? 0 : r0Var.hashCode());
    }

    @m80.k
    public String toString() {
        return "SentenceGameHome(energy_info=" + this.f80050a + ", building_progress=" + this.f80051b + ", lesson_info=" + this.f80052c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80049e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSentenceGameHome.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceGameHome.kt\ncom/baicizhan/biz/online/game_api/SentenceGameHome$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
    public static final class a implements ts.f<p0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public i1 f80053a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public l0 f80054b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public r0 f80055c;

        public a() {
            this.f80053a = null;
            this.f80054b = null;
            this.f80055c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public p0 build() {
            i1 i1Var = this.f80053a;
            if (i1Var == null) {
                throw new IllegalStateException("Required field 'energy_info' is missing");
            }
            l0 l0Var = this.f80054b;
            if (l0Var != null) {
                return new p0(i1Var, l0Var, this.f80055c);
            }
            throw new IllegalStateException("Required field 'building_progress' is missing");
        }

        @m80.k
        public final a b(@m80.k l0 building_progress) {
            kotlin.jvm.internal.g0.p(building_progress, "building_progress");
            this.f80054b = building_progress;
            return this;
        }

        @m80.k
        public final a c(@m80.k i1 energy_info) {
            kotlin.jvm.internal.g0.p(energy_info, "energy_info");
            this.f80053a = energy_info;
            return this;
        }

        @m80.k
        public final a d(@m80.l r0 r0Var) {
            this.f80055c = r0Var;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80053a = null;
            this.f80054b = null;
            this.f80055c = null;
        }

        public a(@m80.k p0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80053a = source.f80050a;
            this.f80054b = source.f80051b;
            this.f80055c = source.f80052c;
        }
    }
}
