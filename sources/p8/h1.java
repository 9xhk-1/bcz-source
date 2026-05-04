package p8;

import com.baicizhan.client.business.dataset.provider.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h1 implements ts.e {

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public static final b f79858x = new b(null);

    /* renamed from: y, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<h1, a> f79859y = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79860a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final double f79861b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final double f79862c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f79863d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final double f79864e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f79865f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final double f79866g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    public final int f79867h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    public final double f79868i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    public final int f79869j;

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    public final double f79870k;

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    public final int f79871l;

    /* renamed from: m, reason: collision with root package name */
    @w00.g
    public final double f79872m;

    /* renamed from: n, reason: collision with root package name */
    @w00.g
    public final int f79873n;

    /* renamed from: o, reason: collision with root package name */
    @w00.g
    public final double f79874o;

    /* renamed from: p, reason: collision with root package name */
    @w00.g
    public final int f79875p;

    /* renamed from: q, reason: collision with root package name */
    @w00.g
    public final double f79876q;

    /* renamed from: r, reason: collision with root package name */
    @w00.g
    public final int f79877r;

    /* renamed from: s, reason: collision with root package name */
    @w00.g
    public final double f79878s;

    /* renamed from: t, reason: collision with root package name */
    @w00.g
    public final int f79879t;

    /* renamed from: u, reason: collision with root package name */
    @w00.g
    public final double f79880u;

    /* renamed from: v, reason: collision with root package name */
    @w00.g
    public final int f79881v;

    /* renamed from: w, reason: collision with root package name */
    @w00.g
    public final long f79882w;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<h1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.x(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.w(protocol.readDouble());
                            break;
                        }
                    case 3:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.t(protocol.readDouble());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.u(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.r(protocol.readDouble());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.s(protocol.s8());
                            break;
                        }
                    case 7:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readDouble());
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
                            break;
                        }
                    case 9:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.p(protocol.readDouble());
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.q(protocol.s8());
                            break;
                        }
                    case 11:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.n(protocol.readDouble());
                            break;
                        }
                    case 12:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.o(protocol.s8());
                            break;
                        }
                    case 13:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readDouble());
                            break;
                        }
                    case 14:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 15:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readDouble());
                            break;
                        }
                    case 16:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 17:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(protocol.readDouble());
                            break;
                        }
                    case 18:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.m(protocol.s8());
                            break;
                        }
                    case 19:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.readDouble());
                            break;
                        }
                    case 20:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(protocol.s8());
                            break;
                        }
                    case 21:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readDouble());
                            break;
                        }
                    case 22:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 23:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.v(protocol.T1());
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
        public void write(@m80.k ws.i protocol, @m80.k h1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("WordAbilityItem");
            protocol.Q6("topic_id", 1, (byte) 8);
            protocol.l5(struct.f79860a);
            protocol.N2();
            protocol.Q6(a.b.C0242a.f16107c, 2, (byte) 4);
            protocol.writeDouble(struct.f79861b);
            protocol.N2();
            protocol.Q6("evef", 3, (byte) 4);
            protocol.writeDouble(struct.f79862c);
            protocol.N2();
            protocol.Q6("evef_time", 4, (byte) 8);
            protocol.l5(struct.f79863d);
            protocol.N2();
            protocol.Q6("evcf", 5, (byte) 4);
            protocol.writeDouble(struct.f79864e);
            protocol.N2();
            protocol.Q6("evcf_time", 6, (byte) 8);
            protocol.l5(struct.f79865f);
            protocol.N2();
            protocol.Q6("efcf", 7, (byte) 4);
            protocol.writeDouble(struct.f79866g);
            protocol.N2();
            protocol.Q6("efcf_time", 8, (byte) 8);
            protocol.l5(struct.f79867h);
            protocol.N2();
            protocol.Q6("efu", 9, (byte) 4);
            protocol.writeDouble(struct.f79868i);
            protocol.N2();
            protocol.Q6("efu_time", 10, (byte) 8);
            protocol.l5(struct.f79869j);
            protocol.N2();
            protocol.Q6("efs", 11, (byte) 4);
            protocol.writeDouble(struct.f79870k);
            protocol.N2();
            protocol.Q6("efs_time", 12, (byte) 8);
            protocol.l5(struct.f79871l);
            protocol.N2();
            protocol.Q6("cfs", 13, (byte) 4);
            protocol.writeDouble(struct.f79872m);
            protocol.N2();
            protocol.Q6("cfs_time", 14, (byte) 8);
            protocol.l5(struct.f79873n);
            protocol.N2();
            protocol.Q6("cfa", 15, (byte) 4);
            protocol.writeDouble(struct.f79874o);
            protocol.N2();
            protocol.Q6("cfa_time", 16, (byte) 8);
            protocol.l5(struct.f79875p);
            protocol.N2();
            protocol.Q6("efpcf", 17, (byte) 4);
            protocol.writeDouble(struct.f79876q);
            protocol.N2();
            protocol.Q6("efpcf_time", 18, (byte) 8);
            protocol.l5(struct.f79877r);
            protocol.N2();
            protocol.Q6("efd", 19, (byte) 4);
            protocol.writeDouble(struct.f79878s);
            protocol.N2();
            protocol.Q6("efd_time", 20, (byte) 8);
            protocol.l5(struct.f79879t);
            protocol.N2();
            protocol.Q6("efau", 21, (byte) 4);
            protocol.writeDouble(struct.f79880u);
            protocol.N2();
            protocol.Q6("efau_time", 22, (byte) 8);
            protocol.l5(struct.f79881v);
            protocol.N2();
            protocol.Q6("last_modify_time", 23, (byte) 10);
            protocol.q7(struct.f79882w);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public h1(int i11, double d11, double d12, int i12, double d13, int i13, double d14, int i14, double d15, int i15, double d16, int i16, double d17, int i17, double d18, int i18, double d19, int i19, double d21, int i21, double d22, int i22, long j11) {
        this.f79860a = i11;
        this.f79861b = d11;
        this.f79862c = d12;
        this.f79863d = i12;
        this.f79864e = d13;
        this.f79865f = i13;
        this.f79866g = d14;
        this.f79867h = i14;
        this.f79868i = d15;
        this.f79869j = i15;
        this.f79870k = d16;
        this.f79871l = i16;
        this.f79872m = d17;
        this.f79873n = i17;
        this.f79874o = d18;
        this.f79875p = i18;
        this.f79876q = d19;
        this.f79877r = i19;
        this.f79878s = d21;
        this.f79879t = i21;
        this.f79880u = d22;
        this.f79881v = i22;
        this.f79882w = j11;
    }

    public static /* synthetic */ h1 y(h1 h1Var, int i11, double d11, double d12, int i12, double d13, int i13, double d14, int i14, double d15, int i15, double d16, int i16, double d17, int i17, double d18, int i18, double d19, int i19, double d21, int i21, double d22, int i22, long j11, int i23, Object obj) {
        long j12;
        int i24;
        int i25 = (i23 & 1) != 0 ? h1Var.f79860a : i11;
        double d23 = (i23 & 2) != 0 ? h1Var.f79861b : d11;
        double d24 = (i23 & 4) != 0 ? h1Var.f79862c : d12;
        int i26 = (i23 & 8) != 0 ? h1Var.f79863d : i12;
        double d25 = (i23 & 16) != 0 ? h1Var.f79864e : d13;
        int i27 = (i23 & 32) != 0 ? h1Var.f79865f : i13;
        double d26 = (i23 & 64) != 0 ? h1Var.f79866g : d14;
        int i28 = (i23 & 128) != 0 ? h1Var.f79867h : i14;
        double d27 = (i23 & 256) != 0 ? h1Var.f79868i : d15;
        int i29 = i25;
        int i31 = (i23 & 512) != 0 ? h1Var.f79869j : i15;
        double d28 = d23;
        double d29 = (i23 & 1024) != 0 ? h1Var.f79870k : d16;
        int i32 = (i23 & 2048) != 0 ? h1Var.f79871l : i16;
        double d31 = d29;
        double d32 = (i23 & 4096) != 0 ? h1Var.f79872m : d17;
        int i33 = (i23 & 8192) != 0 ? h1Var.f79873n : i17;
        double d33 = (i23 & 16384) != 0 ? h1Var.f79874o : d18;
        int i34 = (i23 & 32768) != 0 ? h1Var.f79875p : i18;
        double d34 = d33;
        double d35 = (i23 & 65536) != 0 ? h1Var.f79876q : d19;
        int i35 = (i23 & 131072) != 0 ? h1Var.f79877r : i19;
        double d36 = (i23 & 262144) != 0 ? h1Var.f79878s : d21;
        int i36 = (i23 & 524288) != 0 ? h1Var.f79879t : i21;
        double d37 = (i23 & 1048576) != 0 ? h1Var.f79880u : d22;
        int i37 = (i23 & 2097152) != 0 ? h1Var.f79881v : i22;
        if ((i23 & 4194304) != 0) {
            i24 = i37;
            j12 = h1Var.f79882w;
        } else {
            j12 = j11;
            i24 = i37;
        }
        return h1Var.x(i29, d28, d24, i26, d25, i27, d26, i28, d27, i31, d31, i32, d32, i33, d34, i34, d35, i35, d36, i36, d37, i24, j12);
    }

    public final int a() {
        return this.f79860a;
    }

    public final int b() {
        return this.f79869j;
    }

    public final double c() {
        return this.f79870k;
    }

    public final int d() {
        return this.f79871l;
    }

    public final double e() {
        return this.f79872m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f79860a == h1Var.f79860a && Double.compare(this.f79861b, h1Var.f79861b) == 0 && Double.compare(this.f79862c, h1Var.f79862c) == 0 && this.f79863d == h1Var.f79863d && Double.compare(this.f79864e, h1Var.f79864e) == 0 && this.f79865f == h1Var.f79865f && Double.compare(this.f79866g, h1Var.f79866g) == 0 && this.f79867h == h1Var.f79867h && Double.compare(this.f79868i, h1Var.f79868i) == 0 && this.f79869j == h1Var.f79869j && Double.compare(this.f79870k, h1Var.f79870k) == 0 && this.f79871l == h1Var.f79871l && Double.compare(this.f79872m, h1Var.f79872m) == 0 && this.f79873n == h1Var.f79873n && Double.compare(this.f79874o, h1Var.f79874o) == 0 && this.f79875p == h1Var.f79875p && Double.compare(this.f79876q, h1Var.f79876q) == 0 && this.f79877r == h1Var.f79877r && Double.compare(this.f79878s, h1Var.f79878s) == 0 && this.f79879t == h1Var.f79879t && Double.compare(this.f79880u, h1Var.f79880u) == 0 && this.f79881v == h1Var.f79881v && this.f79882w == h1Var.f79882w;
    }

    public final int f() {
        return this.f79873n;
    }

    public final double g() {
        return this.f79874o;
    }

    public final int h() {
        return this.f79875p;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.f79860a) * 31) + Double.hashCode(this.f79861b)) * 31) + Double.hashCode(this.f79862c)) * 31) + Integer.hashCode(this.f79863d)) * 31) + Double.hashCode(this.f79864e)) * 31) + Integer.hashCode(this.f79865f)) * 31) + Double.hashCode(this.f79866g)) * 31) + Integer.hashCode(this.f79867h)) * 31) + Double.hashCode(this.f79868i)) * 31) + Integer.hashCode(this.f79869j)) * 31) + Double.hashCode(this.f79870k)) * 31) + Integer.hashCode(this.f79871l)) * 31) + Double.hashCode(this.f79872m)) * 31) + Integer.hashCode(this.f79873n)) * 31) + Double.hashCode(this.f79874o)) * 31) + Integer.hashCode(this.f79875p)) * 31) + Double.hashCode(this.f79876q)) * 31) + Integer.hashCode(this.f79877r)) * 31) + Double.hashCode(this.f79878s)) * 31) + Integer.hashCode(this.f79879t)) * 31) + Double.hashCode(this.f79880u)) * 31) + Integer.hashCode(this.f79881v)) * 31) + Long.hashCode(this.f79882w);
    }

    public final double i() {
        return this.f79876q;
    }

    public final int j() {
        return this.f79877r;
    }

    public final double k() {
        return this.f79878s;
    }

    public final double l() {
        return this.f79861b;
    }

    public final int m() {
        return this.f79879t;
    }

    public final double n() {
        return this.f79880u;
    }

    public final int o() {
        return this.f79881v;
    }

    public final long p() {
        return this.f79882w;
    }

    public final double q() {
        return this.f79862c;
    }

    public final int r() {
        return this.f79863d;
    }

    public final double s() {
        return this.f79864e;
    }

    public final int t() {
        return this.f79865f;
    }

    @m80.k
    public String toString() {
        return "WordAbilityItem(topic_id=" + this.f79860a + ", score=" + this.f79861b + ", evef=" + this.f79862c + ", evef_time=" + this.f79863d + ", evcf=" + this.f79864e + ", evcf_time=" + this.f79865f + ", efcf=" + this.f79866g + ", efcf_time=" + this.f79867h + ", efu=" + this.f79868i + ", efu_time=" + this.f79869j + ", efs=" + this.f79870k + ", efs_time=" + this.f79871l + ", cfs=" + this.f79872m + ", cfs_time=" + this.f79873n + ", cfa=" + this.f79874o + ", cfa_time=" + this.f79875p + ", efpcf=" + this.f79876q + ", efpcf_time=" + this.f79877r + ", efd=" + this.f79878s + ", efd_time=" + this.f79879t + ", efau=" + this.f79880u + ", efau_time=" + this.f79881v + ", last_modify_time=" + this.f79882w + ')';
    }

    public final double u() {
        return this.f79866g;
    }

    public final int v() {
        return this.f79867h;
    }

    public final double w() {
        return this.f79868i;
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79859y.write(protocol, this);
    }

    @m80.k
    public final h1 x(int i11, double d11, double d12, int i12, double d13, int i13, double d14, int i14, double d15, int i15, double d16, int i16, double d17, int i17, double d18, int i18, double d19, int i19, double d21, int i21, double d22, int i22, long j11) {
        return new h1(i11, d11, d12, i12, d13, i13, d14, i14, d15, i15, d16, i16, d17, i17, d18, i18, d19, i19, d21, i21, d22, i22, j11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nWordAbilityItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordAbilityItem.kt\ncom/baicizhan/biz/online/game_api/WordAbilityItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,653:1\n1#2:654\n*E\n"})
    public static final class a implements ts.f<h1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79883a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Double f79884b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Double f79885c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f79886d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Double f79887e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f79888f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Double f79889g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f79890h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Double f79891i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Integer f79892j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public Double f79893k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public Integer f79894l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public Double f79895m;

        /* renamed from: n, reason: collision with root package name */
        @m80.l
        public Integer f79896n;

        /* renamed from: o, reason: collision with root package name */
        @m80.l
        public Double f79897o;

        /* renamed from: p, reason: collision with root package name */
        @m80.l
        public Integer f79898p;

        /* renamed from: q, reason: collision with root package name */
        @m80.l
        public Double f79899q;

        /* renamed from: r, reason: collision with root package name */
        @m80.l
        public Integer f79900r;

        /* renamed from: s, reason: collision with root package name */
        @m80.l
        public Double f79901s;

        /* renamed from: t, reason: collision with root package name */
        @m80.l
        public Integer f79902t;

        /* renamed from: u, reason: collision with root package name */
        @m80.l
        public Double f79903u;

        /* renamed from: v, reason: collision with root package name */
        @m80.l
        public Integer f79904v;

        /* renamed from: w, reason: collision with root package name */
        @m80.l
        public Long f79905w;

        public a() {
            this.f79883a = null;
            this.f79884b = null;
            this.f79885c = null;
            this.f79886d = null;
            this.f79887e = null;
            this.f79888f = null;
            this.f79889g = null;
            this.f79890h = null;
            this.f79891i = null;
            this.f79892j = null;
            this.f79893k = null;
            this.f79894l = null;
            this.f79895m = null;
            this.f79896n = null;
            this.f79897o = null;
            this.f79898p = null;
            this.f79899q = null;
            this.f79900r = null;
            this.f79901s = null;
            this.f79902t = null;
            this.f79903u = null;
            this.f79904v = null;
            this.f79905w = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h1 build() {
            Integer num = this.f79883a;
            if (num == null) {
                throw new IllegalStateException("Required field 'topic_id' is missing");
            }
            int intValue = num.intValue();
            Double d11 = this.f79884b;
            if (d11 == null) {
                throw new IllegalStateException("Required field 'score' is missing");
            }
            double doubleValue = d11.doubleValue();
            Double d12 = this.f79885c;
            if (d12 == null) {
                throw new IllegalStateException("Required field 'evef' is missing");
            }
            double doubleValue2 = d12.doubleValue();
            Integer num2 = this.f79886d;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'evef_time' is missing");
            }
            int intValue2 = num2.intValue();
            Double d13 = this.f79887e;
            if (d13 == null) {
                throw new IllegalStateException("Required field 'evcf' is missing");
            }
            double doubleValue3 = d13.doubleValue();
            Integer num3 = this.f79888f;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'evcf_time' is missing");
            }
            int intValue3 = num3.intValue();
            Double d14 = this.f79889g;
            if (d14 == null) {
                throw new IllegalStateException("Required field 'efcf' is missing");
            }
            double doubleValue4 = d14.doubleValue();
            Integer num4 = this.f79890h;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'efcf_time' is missing");
            }
            int intValue4 = num4.intValue();
            Double d15 = this.f79891i;
            if (d15 == null) {
                throw new IllegalStateException("Required field 'efu' is missing");
            }
            double doubleValue5 = d15.doubleValue();
            Integer num5 = this.f79892j;
            if (num5 == null) {
                throw new IllegalStateException("Required field 'efu_time' is missing");
            }
            int intValue5 = num5.intValue();
            Double d16 = this.f79893k;
            if (d16 == null) {
                throw new IllegalStateException("Required field 'efs' is missing");
            }
            double doubleValue6 = d16.doubleValue();
            Integer num6 = this.f79894l;
            if (num6 == null) {
                throw new IllegalStateException("Required field 'efs_time' is missing");
            }
            int intValue6 = num6.intValue();
            Double d17 = this.f79895m;
            if (d17 == null) {
                throw new IllegalStateException("Required field 'cfs' is missing");
            }
            double doubleValue7 = d17.doubleValue();
            Integer num7 = this.f79896n;
            if (num7 == null) {
                throw new IllegalStateException("Required field 'cfs_time' is missing");
            }
            int intValue7 = num7.intValue();
            Double d18 = this.f79897o;
            if (d18 == null) {
                throw new IllegalStateException("Required field 'cfa' is missing");
            }
            double doubleValue8 = d18.doubleValue();
            Integer num8 = this.f79898p;
            if (num8 == null) {
                throw new IllegalStateException("Required field 'cfa_time' is missing");
            }
            int intValue8 = num8.intValue();
            Double d19 = this.f79899q;
            if (d19 == null) {
                throw new IllegalStateException("Required field 'efpcf' is missing");
            }
            double doubleValue9 = d19.doubleValue();
            Integer num9 = this.f79900r;
            if (num9 == null) {
                throw new IllegalStateException("Required field 'efpcf_time' is missing");
            }
            int intValue9 = num9.intValue();
            Double d21 = this.f79901s;
            if (d21 == null) {
                throw new IllegalStateException("Required field 'efd' is missing");
            }
            double doubleValue10 = d21.doubleValue();
            Integer num10 = this.f79902t;
            if (num10 == null) {
                throw new IllegalStateException("Required field 'efd_time' is missing");
            }
            int intValue10 = num10.intValue();
            Double d22 = this.f79903u;
            if (d22 == null) {
                throw new IllegalStateException("Required field 'efau' is missing");
            }
            double doubleValue11 = d22.doubleValue();
            Integer num11 = this.f79904v;
            if (num11 == null) {
                throw new IllegalStateException("Required field 'efau_time' is missing");
            }
            int intValue11 = num11.intValue();
            Long l11 = this.f79905w;
            if (l11 != null) {
                return new h1(intValue, doubleValue, doubleValue2, intValue2, doubleValue3, intValue3, doubleValue4, intValue4, doubleValue5, intValue5, doubleValue6, intValue6, doubleValue7, intValue7, doubleValue8, intValue8, doubleValue9, intValue9, doubleValue10, intValue10, doubleValue11, intValue11, l11.longValue());
            }
            throw new IllegalStateException("Required field 'last_modify_time' is missing");
        }

        @m80.k
        public final a b(double d11) {
            this.f79897o = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79898p = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(double d11) {
            this.f79895m = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f79896n = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(double d11) {
            this.f79903u = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a g(int i11) {
            this.f79904v = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a h(double d11) {
            this.f79889g = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a i(int i11) {
            this.f79890h = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a j(double d11) {
            this.f79901s = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a k(int i11) {
            this.f79902t = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a l(double d11) {
            this.f79899q = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a m(int i11) {
            this.f79900r = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a n(double d11) {
            this.f79893k = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a o(int i11) {
            this.f79894l = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a p(double d11) {
            this.f79891i = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a q(int i11) {
            this.f79892j = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a r(double d11) {
            this.f79887e = Double.valueOf(d11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79883a = null;
            this.f79884b = null;
            this.f79885c = null;
            this.f79886d = null;
            this.f79887e = null;
            this.f79888f = null;
            this.f79889g = null;
            this.f79890h = null;
            this.f79891i = null;
            this.f79892j = null;
            this.f79893k = null;
            this.f79894l = null;
            this.f79895m = null;
            this.f79896n = null;
            this.f79897o = null;
            this.f79898p = null;
            this.f79899q = null;
            this.f79900r = null;
            this.f79901s = null;
            this.f79902t = null;
            this.f79903u = null;
            this.f79904v = null;
            this.f79905w = null;
        }

        @m80.k
        public final a s(int i11) {
            this.f79888f = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a t(double d11) {
            this.f79885c = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a u(int i11) {
            this.f79886d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a v(long j11) {
            this.f79905w = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a w(double d11) {
            this.f79884b = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a x(int i11) {
            this.f79883a = Integer.valueOf(i11);
            return this;
        }

        public a(@m80.k h1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79883a = Integer.valueOf(source.f79860a);
            this.f79884b = Double.valueOf(source.f79861b);
            this.f79885c = Double.valueOf(source.f79862c);
            this.f79886d = Integer.valueOf(source.f79863d);
            this.f79887e = Double.valueOf(source.f79864e);
            this.f79888f = Integer.valueOf(source.f79865f);
            this.f79889g = Double.valueOf(source.f79866g);
            this.f79890h = Integer.valueOf(source.f79867h);
            this.f79891i = Double.valueOf(source.f79868i);
            this.f79892j = Integer.valueOf(source.f79869j);
            this.f79893k = Double.valueOf(source.f79870k);
            this.f79894l = Integer.valueOf(source.f79871l);
            this.f79895m = Double.valueOf(source.f79872m);
            this.f79896n = Integer.valueOf(source.f79873n);
            this.f79897o = Double.valueOf(source.f79874o);
            this.f79898p = Integer.valueOf(source.f79875p);
            this.f79899q = Double.valueOf(source.f79876q);
            this.f79900r = Integer.valueOf(source.f79877r);
            this.f79901s = Double.valueOf(source.f79878s);
            this.f79902t = Integer.valueOf(source.f79879t);
            this.f79903u = Double.valueOf(source.f79880u);
            this.f79904v = Integer.valueOf(source.f79881v);
            this.f79905w = Long.valueOf(source.f79882w);
        }
    }
}
