package u8;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class j implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final b f91948i = new b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<j, a> f91949j = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f91950a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f91951b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f91952c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f91953d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Long f91954e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f91955f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f91956g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f91957h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<j, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j read(@m80.k ws.i protocol, @m80.k a builder) {
            g0.p(protocol, "protocol");
            g0.p(builder, "builder");
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 3:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(Long.valueOf(protocol.T1()));
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k j struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserEntitlement");
            if (struct.f91950a != null) {
                protocol.Q6("entitlement_key", 1, (byte) 11);
                protocol.p1(struct.f91950a);
                protocol.N2();
            }
            if (struct.f91951b != null) {
                protocol.Q6(PushConstants.REGISTER_STATUS_EXPIRE_TIME, 2, (byte) 10);
                protocol.q7(struct.f91951b.longValue());
                protocol.N2();
            }
            if (struct.f91952c != null) {
                protocol.Q6("max_value", 3, (byte) 8);
                protocol.l5(struct.f91952c.intValue());
                protocol.N2();
            }
            if (struct.f91953d != null) {
                protocol.Q6("current_value", 4, (byte) 8);
                protocol.l5(struct.f91953d.intValue());
                protocol.N2();
            }
            if (struct.f91954e != null) {
                protocol.Q6("next_recovery_time", 5, (byte) 10);
                protocol.q7(struct.f91954e.longValue());
                protocol.N2();
            }
            if (struct.f91955f != null) {
                protocol.Q6("next_recovery_amount", 6, (byte) 8);
                protocol.l5(struct.f91955f.intValue());
                protocol.N2();
            }
            if (struct.f91956g != null) {
                protocol.Q6("recovery_interval", 7, (byte) 8);
                protocol.l5(struct.f91956g.intValue());
                protocol.N2();
            }
            if (struct.f91957h != null) {
                protocol.Q6("member_type", 8, (byte) 8);
                protocol.l5(struct.f91957h.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public j(@m80.l String str, @m80.l Long l11, @m80.l Integer num, @m80.l Integer num2, @m80.l Long l12, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5) {
        this.f91950a = str;
        this.f91951b = l11;
        this.f91952c = num;
        this.f91953d = num2;
        this.f91954e = l12;
        this.f91955f = num3;
        this.f91956g = num4;
        this.f91957h = num5;
    }

    public static /* synthetic */ j j(j jVar, String str, Long l11, Integer num, Integer num2, Long l12, Integer num3, Integer num4, Integer num5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = jVar.f91950a;
        }
        if ((i11 & 2) != 0) {
            l11 = jVar.f91951b;
        }
        if ((i11 & 4) != 0) {
            num = jVar.f91952c;
        }
        if ((i11 & 8) != 0) {
            num2 = jVar.f91953d;
        }
        if ((i11 & 16) != 0) {
            l12 = jVar.f91954e;
        }
        if ((i11 & 32) != 0) {
            num3 = jVar.f91955f;
        }
        if ((i11 & 64) != 0) {
            num4 = jVar.f91956g;
        }
        if ((i11 & 128) != 0) {
            num5 = jVar.f91957h;
        }
        Integer num6 = num4;
        Integer num7 = num5;
        Long l13 = l12;
        Integer num8 = num3;
        return jVar.i(str, l11, num, num2, l13, num8, num6, num7);
    }

    @m80.l
    public final String a() {
        return this.f91950a;
    }

    @m80.l
    public final Long b() {
        return this.f91951b;
    }

    @m80.l
    public final Integer c() {
        return this.f91952c;
    }

    @m80.l
    public final Integer d() {
        return this.f91953d;
    }

    @m80.l
    public final Long e() {
        return this.f91954e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return g0.g(this.f91950a, jVar.f91950a) && g0.g(this.f91951b, jVar.f91951b) && g0.g(this.f91952c, jVar.f91952c) && g0.g(this.f91953d, jVar.f91953d) && g0.g(this.f91954e, jVar.f91954e) && g0.g(this.f91955f, jVar.f91955f) && g0.g(this.f91956g, jVar.f91956g) && g0.g(this.f91957h, jVar.f91957h);
    }

    @m80.l
    public final Integer f() {
        return this.f91955f;
    }

    @m80.l
    public final Integer g() {
        return this.f91956g;
    }

    @m80.l
    public final Integer h() {
        return this.f91957h;
    }

    public int hashCode() {
        String str = this.f91950a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.f91951b;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.f91952c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f91953d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l12 = this.f91954e;
        int hashCode5 = (hashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num3 = this.f91955f;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f91956g;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f91957h;
        return hashCode7 + (num5 != null ? num5.hashCode() : 0);
    }

    @m80.k
    public final j i(@m80.l String str, @m80.l Long l11, @m80.l Integer num, @m80.l Integer num2, @m80.l Long l12, @m80.l Integer num3, @m80.l Integer num4, @m80.l Integer num5) {
        return new j(str, l11, num, num2, l12, num3, num4, num5);
    }

    @m80.k
    public String toString() {
        return "UserEntitlement(entitlement_key=" + this.f91950a + ", expire_time=" + this.f91951b + ", max_value=" + this.f91952c + ", current_value=" + this.f91953d + ", next_recovery_time=" + this.f91954e + ", next_recovery_amount=" + this.f91955f + ", recovery_interval=" + this.f91956g + ", member_type=" + this.f91957h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f91949j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserEntitlement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserEntitlement.kt\ncom/baicizhan/biz/online/strategy_api/UserEntitlement$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,311:1\n1#2:312\n*E\n"})
    public static final class a implements ts.f<j> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f91958a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f91959b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f91960c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f91961d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Long f91962e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f91963f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f91964g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f91965h;

        public a() {
            this.f91958a = null;
            this.f91959b = null;
            this.f91960c = null;
            this.f91961d = null;
            this.f91962e = null;
            this.f91963f = null;
            this.f91964g = null;
            this.f91965h = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public j build() {
            return new j(this.f91958a, this.f91959b, this.f91960c, this.f91961d, this.f91962e, this.f91963f, this.f91964g, this.f91965h);
        }

        @m80.k
        public final a b(@m80.l Integer num) {
            this.f91961d = num;
            return this;
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f91958a = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l Long l11) {
            this.f91959b = l11;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f91960c = num;
            return this;
        }

        @m80.k
        public final a f(@m80.l Integer num) {
            this.f91965h = num;
            return this;
        }

        @m80.k
        public final a g(@m80.l Integer num) {
            this.f91963f = num;
            return this;
        }

        @m80.k
        public final a h(@m80.l Long l11) {
            this.f91962e = l11;
            return this;
        }

        @m80.k
        public final a i(@m80.l Integer num) {
            this.f91964g = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f91958a = null;
            this.f91959b = null;
            this.f91960c = null;
            this.f91961d = null;
            this.f91962e = null;
            this.f91963f = null;
            this.f91964g = null;
            this.f91965h = null;
        }

        public a(@m80.k j source) {
            g0.p(source, "source");
            this.f91958a = source.f91950a;
            this.f91959b = source.f91951b;
            this.f91960c = source.f91952c;
            this.f91961d = source.f91953d;
            this.f91962e = source.f91954e;
            this.f91963f = source.f91955f;
            this.f91964g = source.f91956g;
            this.f91965h = source.f91957h;
        }
    }
}
