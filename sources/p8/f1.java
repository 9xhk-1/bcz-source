package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f1 implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f79806f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f1, a> f79807g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79808a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f79809b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f79810c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f79811d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f79812e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.f(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.d(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.e(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k f1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserWorth");
            protocol.Q6("win_streak_days", 1, (byte) 8);
            protocol.l5(struct.f79808a);
            protocol.N2();
            protocol.Q6("total_daka_days", 2, (byte) 8);
            protocol.l5(struct.f79809b);
            protocol.N2();
            protocol.Q6("word_done_count", 3, (byte) 8);
            protocol.l5(struct.f79810c);
            protocol.N2();
            protocol.Q6("listen_count", 4, (byte) 8);
            protocol.l5(struct.f79811d);
            protocol.N2();
            protocol.Q6("reading_count", 5, (byte) 8);
            protocol.l5(struct.f79812e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public f1(int i11, int i12, int i13, int i14, int i15) {
        this.f79808a = i11;
        this.f79809b = i12;
        this.f79810c = i13;
        this.f79811d = i14;
        this.f79812e = i15;
    }

    public static /* synthetic */ f1 g(f1 f1Var, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = f1Var.f79808a;
        }
        if ((i16 & 2) != 0) {
            i12 = f1Var.f79809b;
        }
        if ((i16 & 4) != 0) {
            i13 = f1Var.f79810c;
        }
        if ((i16 & 8) != 0) {
            i14 = f1Var.f79811d;
        }
        if ((i16 & 16) != 0) {
            i15 = f1Var.f79812e;
        }
        int i17 = i15;
        int i18 = i13;
        return f1Var.f(i11, i12, i18, i14, i17);
    }

    public final int a() {
        return this.f79808a;
    }

    public final int b() {
        return this.f79809b;
    }

    public final int c() {
        return this.f79810c;
    }

    public final int d() {
        return this.f79811d;
    }

    public final int e() {
        return this.f79812e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f79808a == f1Var.f79808a && this.f79809b == f1Var.f79809b && this.f79810c == f1Var.f79810c && this.f79811d == f1Var.f79811d && this.f79812e == f1Var.f79812e;
    }

    @m80.k
    public final f1 f(int i11, int i12, int i13, int i14, int i15) {
        return new f1(i11, i12, i13, i14, i15);
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f79808a) * 31) + Integer.hashCode(this.f79809b)) * 31) + Integer.hashCode(this.f79810c)) * 31) + Integer.hashCode(this.f79811d)) * 31) + Integer.hashCode(this.f79812e);
    }

    @m80.k
    public String toString() {
        return "UserWorth(win_streak_days=" + this.f79808a + ", total_daka_days=" + this.f79809b + ", word_done_count=" + this.f79810c + ", listen_count=" + this.f79811d + ", reading_count=" + this.f79812e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79807g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserWorth.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserWorth.kt\ncom/baicizhan/biz/online/game_api/UserWorth$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,213:1\n1#2:214\n*E\n"})
    public static final class a implements ts.f<f1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79813a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f79814b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f79815c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f79816d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f79817e;

        public a() {
            this.f79813a = null;
            this.f79814b = null;
            this.f79815c = null;
            this.f79816d = null;
            this.f79817e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f1 build() {
            Integer num = this.f79813a;
            if (num == null) {
                throw new IllegalStateException("Required field 'win_streak_days' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f79814b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'total_daka_days' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f79815c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'word_done_count' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f79816d;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'listen_count' is missing");
            }
            int intValue4 = num4.intValue();
            Integer num5 = this.f79817e;
            if (num5 != null) {
                return new f1(intValue, intValue2, intValue3, intValue4, num5.intValue());
            }
            throw new IllegalStateException("Required field 'reading_count' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f79816d = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79817e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(int i11) {
            this.f79814b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f79813a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f79815c = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79813a = null;
            this.f79814b = null;
            this.f79815c = null;
            this.f79816d = null;
            this.f79817e = null;
        }

        public a(@m80.k f1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79813a = Integer.valueOf(source.f79808a);
            this.f79814b = Integer.valueOf(source.f79809b);
            this.f79815c = Integer.valueOf(source.f79810c);
            this.f79816d = Integer.valueOf(source.f79811d);
            this.f79817e = Integer.valueOf(source.f79812e);
        }
    }
}
