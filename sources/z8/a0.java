package z8;

import com.meizu.cloud.pushsdk.constants.PushConstants;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a0 implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f101118c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a0, a> f101119d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final boolean f101120a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f101121b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<a0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        builder.b(protocol.s8());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 2) {
                    builder.c(protocol.readBool());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k a0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("MemberInfo");
            protocol.Q6("vip", 1, (byte) 2);
            protocol.a4(struct.f101120a);
            protocol.N2();
            protocol.Q6(PushConstants.REGISTER_STATUS_EXPIRE_TIME, 2, (byte) 8);
            protocol.l5(struct.f101121b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public a0(boolean z11, int i11) {
        this.f101120a = z11;
        this.f101121b = i11;
    }

    public static /* synthetic */ a0 d(a0 a0Var, boolean z11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = a0Var.f101120a;
        }
        if ((i12 & 2) != 0) {
            i11 = a0Var.f101121b;
        }
        return a0Var.c(z11, i11);
    }

    public final boolean a() {
        return this.f101120a;
    }

    public final int b() {
        return this.f101121b;
    }

    @m80.k
    public final a0 c(boolean z11, int i11) {
        return new a0(z11, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f101120a == a0Var.f101120a && this.f101121b == a0Var.f101121b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f101120a) * 31) + Integer.hashCode(this.f101121b);
    }

    @m80.k
    public String toString() {
        return "MemberInfo(vip=" + this.f101120a + ", expire_time=" + this.f101121b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101119d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nMemberInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberInfo.kt\ncom/baicizhan/biz/online/user_study_api/MemberInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n1#2:127\n*E\n"})
    public static final class a implements ts.f<a0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Boolean f101122a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f101123b;

        public a() {
            this.f101122a = null;
            this.f101123b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 build() {
            Boolean bool = this.f101122a;
            if (bool == null) {
                throw new IllegalStateException("Required field 'vip' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            Integer num = this.f101123b;
            if (num != null) {
                return new a0(booleanValue, num.intValue());
            }
            throw new IllegalStateException("Required field 'expire_time' is missing");
        }

        @m80.k
        public final a b(int i11) {
            this.f101123b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a c(boolean z11) {
            this.f101122a = Boolean.valueOf(z11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101122a = null;
            this.f101123b = null;
        }

        public a(@m80.k a0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101122a = Boolean.valueOf(source.f101120a);
            this.f101123b = Integer.valueOf(source.f101121b);
        }
    }
}
