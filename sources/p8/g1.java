package p8;

import com.meizu.cloud.pushsdk.constants.PushConstants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g1 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f79832c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g1, a> f79833d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f79834a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f79835b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<g1, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g1 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g1 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                    } else if (b11 == 10) {
                        builder.b(protocol.T1());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.c(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k g1 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("VipInfo");
            protocol.Q6("level", 1, (byte) 8);
            protocol.l5(struct.f79834a);
            protocol.N2();
            protocol.Q6(PushConstants.REGISTER_STATUS_EXPIRE_TIME, 2, (byte) 10);
            protocol.q7(struct.f79835b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public g1(int i11, long j11) {
        this.f79834a = i11;
        this.f79835b = j11;
    }

    public static /* synthetic */ g1 d(g1 g1Var, int i11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = g1Var.f79834a;
        }
        if ((i12 & 2) != 0) {
            j11 = g1Var.f79835b;
        }
        return g1Var.c(i11, j11);
    }

    public final int a() {
        return this.f79834a;
    }

    public final long b() {
        return this.f79835b;
    }

    @m80.k
    public final g1 c(int i11, long j11) {
        return new g1(i11, j11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return this.f79834a == g1Var.f79834a && this.f79835b == g1Var.f79835b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f79834a) * 31) + Long.hashCode(this.f79835b);
    }

    @m80.k
    public String toString() {
        return "VipInfo(level=" + this.f79834a + ", expire_time=" + this.f79835b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79833d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nVipInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VipInfo.kt\ncom/baicizhan/biz/online/game_api/VipInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    public static final class a implements ts.f<g1> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f79836a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f79837b;

        public a() {
            this.f79836a = null;
            this.f79837b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g1 build() {
            Integer num = this.f79836a;
            if (num == null) {
                throw new IllegalStateException("Required field 'level' is missing");
            }
            int intValue = num.intValue();
            Long l11 = this.f79837b;
            if (l11 != null) {
                return new g1(intValue, l11.longValue());
            }
            throw new IllegalStateException("Required field 'expire_time' is missing");
        }

        @m80.k
        public final a b(long j11) {
            this.f79837b = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a c(int i11) {
            this.f79836a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79836a = null;
            this.f79837b = null;
        }

        public a(@m80.k g1 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79836a = Integer.valueOf(source.f79834a);
            this.f79837b = Long.valueOf(source.f79835b);
        }
    }
}
