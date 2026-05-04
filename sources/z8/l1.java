package z8;

import xo.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l1 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f101743e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l1, a> f101744f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f101745a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101746b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f101747c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f101748d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            } else if (b11 == 10) {
                                builder.d(protocol.T1());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 8) {
                            builder.b(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 8) {
                        builder.c(protocol.s8());
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
        public void write(@m80.k ws.i protocol, @m80.k l1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("UserDakaDate");
            protocol.Q6(n.r.f98259a, 1, (byte) 8);
            protocol.l5(struct.f101745a);
            protocol.N2();
            protocol.Q6(n.r.f98260b, 2, (byte) 8);
            protocol.l5(struct.f101746b);
            protocol.N2();
            protocol.Q6("day", 3, (byte) 8);
            protocol.l5(struct.f101747c);
            protocol.N2();
            protocol.Q6(com.alipay.sdk.m.t.a.f11034k, 4, (byte) 10);
            protocol.q7(struct.f101748d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public l1(int i11, int i12, int i13, long j11) {
        this.f101745a = i11;
        this.f101746b = i12;
        this.f101747c = i13;
        this.f101748d = j11;
    }

    public static /* synthetic */ l1 f(l1 l1Var, int i11, int i12, int i13, long j11, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = l1Var.f101745a;
        }
        if ((i14 & 2) != 0) {
            i12 = l1Var.f101746b;
        }
        if ((i14 & 4) != 0) {
            i13 = l1Var.f101747c;
        }
        if ((i14 & 8) != 0) {
            j11 = l1Var.f101748d;
        }
        int i15 = i13;
        return l1Var.e(i11, i12, i15, j11);
    }

    public final int a() {
        return this.f101745a;
    }

    public final int b() {
        return this.f101746b;
    }

    public final int c() {
        return this.f101747c;
    }

    public final long d() {
        return this.f101748d;
    }

    @m80.k
    public final l1 e(int i11, int i12, int i13, long j11) {
        return new l1(i11, i12, i13, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.f101745a == l1Var.f101745a && this.f101746b == l1Var.f101746b && this.f101747c == l1Var.f101747c && this.f101748d == l1Var.f101748d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f101745a) * 31) + Integer.hashCode(this.f101746b)) * 31) + Integer.hashCode(this.f101747c)) * 31) + Long.hashCode(this.f101748d);
    }

    @m80.k
    public String toString() {
        return "UserDakaDate(year=" + this.f101745a + ", month=" + this.f101746b + ", day=" + this.f101747c + ", timestamp=" + this.f101748d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101744f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nUserDakaDate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserDakaDate.kt\ncom/baicizhan/biz/online/user_study_api/UserDakaDate$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
    public static final class a implements ts.f<l1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f101749a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101750b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f101751c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f101752d;

        public a() {
            this.f101749a = null;
            this.f101750b = null;
            this.f101751c = null;
            this.f101752d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l1 build() {
            Integer num = this.f101749a;
            if (num == null) {
                throw new IllegalStateException("Required field 'year' is missing");
            }
            int intValue = num.intValue();
            Integer num2 = this.f101750b;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'month' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f101751c;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'day' is missing");
            }
            int intValue3 = num3.intValue();
            Long l11 = this.f101752d;
            if (l11 != null) {
                return new l1(intValue, intValue2, intValue3, l11.longValue());
            }
            throw new IllegalStateException("Required field 'timestamp' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101751c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f101750b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a d(long j11) {
            this.f101752d = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a e(int i11) {
            this.f101749a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101749a = null;
            this.f101750b = null;
            this.f101751c = null;
            this.f101752d = null;
        }

        public a(@m80.k l1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101749a = Integer.valueOf(source.f101745a);
            this.f101750b = Integer.valueOf(source.f101746b);
            this.f101751c = Integer.valueOf(source.f101747c);
            this.f101752d = Long.valueOf(source.f101748d);
        }
    }
}
