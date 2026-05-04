package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class r implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f80086h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<r, a> f80087i = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final f0 f80088a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final p8.b f80089b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f80090c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f80091d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final d1 f80092e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final e1 f80093f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final y f80094g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<r, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol, @m80.k a builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(f0.f79793h.read(protocol));
                            break;
                        }
                    case 2:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(p8.b.f79673c.read(protocol));
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.T1());
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.T1());
                            break;
                        }
                    case 5:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(d1.f79745e.read(protocol));
                            break;
                        }
                    case 6:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(e1.f79779e.read(protocol));
                            break;
                        }
                    case 7:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(y.f80253k.read(protocol));
                            break;
                        }
                    default:
                        at.b.a(protocol, b11);
                        break;
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k r struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("FinishRoundRsp");
            protocol.Q6(ma.b.D1, 1, (byte) 12);
            f0.f79793h.write(protocol, struct.f80088a);
            protocol.N2();
            protocol.Q6("award_box", 2, (byte) 12);
            p8.b.f79673c.write(protocol, struct.f80089b);
            protocol.N2();
            protocol.Q6("study_record_versin", 3, (byte) 10);
            protocol.q7(struct.f80090c);
            protocol.N2();
            protocol.Q6("plan_version", 4, (byte) 10);
            protocol.q7(struct.f80091d);
            protocol.N2();
            if (struct.f80092e != null) {
                protocol.Q6("user_data_info", 5, (byte) 12);
                d1.f79745e.write(protocol, struct.f80092e);
                protocol.N2();
            }
            if (struct.f80093f != null) {
                protocol.Q6("plan_info", 6, (byte) 12);
                e1.f79779e.write(protocol, struct.f80093f);
                protocol.N2();
            }
            if (struct.f80094g != null) {
                protocol.Q6("lava_quest", 7, (byte) 12);
                y.f80253k.write(protocol, struct.f80094g);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public r(@m80.k f0 award, @m80.k p8.b award_box, long j11, long j12, @m80.l d1 d1Var, @m80.l e1 e1Var, @m80.l y yVar) {
        kotlin.jvm.internal.g0.p(award, "award");
        kotlin.jvm.internal.g0.p(award_box, "award_box");
        this.f80088a = award;
        this.f80089b = award_box;
        this.f80090c = j11;
        this.f80091d = j12;
        this.f80092e = d1Var;
        this.f80093f = e1Var;
        this.f80094g = yVar;
    }

    public static /* synthetic */ r i(r rVar, f0 f0Var, p8.b bVar, long j11, long j12, d1 d1Var, e1 e1Var, y yVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f0Var = rVar.f80088a;
        }
        if ((i11 & 2) != 0) {
            bVar = rVar.f80089b;
        }
        if ((i11 & 4) != 0) {
            j11 = rVar.f80090c;
        }
        if ((i11 & 8) != 0) {
            j12 = rVar.f80091d;
        }
        if ((i11 & 16) != 0) {
            d1Var = rVar.f80092e;
        }
        if ((i11 & 32) != 0) {
            e1Var = rVar.f80093f;
        }
        if ((i11 & 64) != 0) {
            yVar = rVar.f80094g;
        }
        y yVar2 = yVar;
        d1 d1Var2 = d1Var;
        long j13 = j12;
        long j14 = j11;
        return rVar.h(f0Var, bVar, j14, j13, d1Var2, e1Var, yVar2);
    }

    @m80.k
    public final f0 a() {
        return this.f80088a;
    }

    @m80.k
    public final p8.b b() {
        return this.f80089b;
    }

    public final long c() {
        return this.f80090c;
    }

    public final long d() {
        return this.f80091d;
    }

    @m80.l
    public final d1 e() {
        return this.f80092e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.g0.g(this.f80088a, rVar.f80088a) && kotlin.jvm.internal.g0.g(this.f80089b, rVar.f80089b) && this.f80090c == rVar.f80090c && this.f80091d == rVar.f80091d && kotlin.jvm.internal.g0.g(this.f80092e, rVar.f80092e) && kotlin.jvm.internal.g0.g(this.f80093f, rVar.f80093f) && kotlin.jvm.internal.g0.g(this.f80094g, rVar.f80094g);
    }

    @m80.l
    public final e1 f() {
        return this.f80093f;
    }

    @m80.l
    public final y g() {
        return this.f80094g;
    }

    @m80.k
    public final r h(@m80.k f0 award, @m80.k p8.b award_box, long j11, long j12, @m80.l d1 d1Var, @m80.l e1 e1Var, @m80.l y yVar) {
        kotlin.jvm.internal.g0.p(award, "award");
        kotlin.jvm.internal.g0.p(award_box, "award_box");
        return new r(award, award_box, j11, j12, d1Var, e1Var, yVar);
    }

    public int hashCode() {
        int hashCode = ((((((this.f80088a.hashCode() * 31) + this.f80089b.hashCode()) * 31) + Long.hashCode(this.f80090c)) * 31) + Long.hashCode(this.f80091d)) * 31;
        d1 d1Var = this.f80092e;
        int hashCode2 = (hashCode + (d1Var == null ? 0 : d1Var.hashCode())) * 31;
        e1 e1Var = this.f80093f;
        int hashCode3 = (hashCode2 + (e1Var == null ? 0 : e1Var.hashCode())) * 31;
        y yVar = this.f80094g;
        return hashCode3 + (yVar != null ? yVar.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "FinishRoundRsp(award=" + this.f80088a + ", award_box=" + this.f80089b + ", study_record_versin=" + this.f80090c + ", plan_version=" + this.f80091d + ", user_data_info=" + this.f80092e + ", plan_info=" + this.f80093f + ", lava_quest=" + this.f80094g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f80087i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nFinishRoundRsp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinishRoundRsp.kt\ncom/baicizhan/biz/online/game_api/FinishRoundRsp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,260:1\n1#2:261\n*E\n"})
    public static final class a implements ts.f<r> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public f0 f80095a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public p8.b f80096b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f80097c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f80098d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public d1 f80099e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public e1 f80100f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public y f80101g;

        public a() {
            this.f80095a = null;
            this.f80096b = null;
            this.f80097c = null;
            this.f80098d = null;
            this.f80099e = null;
            this.f80100f = null;
            this.f80101g = null;
        }

        @m80.k
        public final a a(@m80.k f0 award) {
            kotlin.jvm.internal.g0.p(award, "award");
            this.f80095a = award;
            return this;
        }

        @m80.k
        public final a b(@m80.k p8.b award_box) {
            kotlin.jvm.internal.g0.p(award_box, "award_box");
            this.f80096b = award_box;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public r build() {
            f0 f0Var = this.f80095a;
            if (f0Var == null) {
                throw new IllegalStateException("Required field 'award' is missing");
            }
            p8.b bVar = this.f80096b;
            if (bVar == null) {
                throw new IllegalStateException("Required field 'award_box' is missing");
            }
            Long l11 = this.f80097c;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'study_record_versin' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f80098d;
            if (l12 != null) {
                return new r(f0Var, bVar, longValue, l12.longValue(), this.f80099e, this.f80100f, this.f80101g);
            }
            throw new IllegalStateException("Required field 'plan_version' is missing");
        }

        @m80.k
        public final a d(@m80.l y yVar) {
            this.f80101g = yVar;
            return this;
        }

        @m80.k
        public final a e(@m80.l e1 e1Var) {
            this.f80100f = e1Var;
            return this;
        }

        @m80.k
        public final a f(long j11) {
            this.f80098d = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a g(long j11) {
            this.f80097c = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a h(@m80.l d1 d1Var) {
            this.f80099e = d1Var;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f80095a = null;
            this.f80096b = null;
            this.f80097c = null;
            this.f80098d = null;
            this.f80099e = null;
            this.f80100f = null;
            this.f80101g = null;
        }

        public a(@m80.k r source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f80095a = source.f80088a;
            this.f80096b = source.f80089b;
            this.f80097c = Long.valueOf(source.f80090c);
            this.f80098d = Long.valueOf(source.f80091d);
            this.f80099e = source.f80092e;
            this.f80100f = source.f80093f;
            this.f80101g = source.f80094g;
        }
    }
}
