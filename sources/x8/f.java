package x8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final b f97738h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<f, a> f97739i = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f97740a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f97741b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final boolean f97742c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @w00.g
    public final String f97743d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @w00.g
    public final String f97744e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @w00.g
    public final String f97745f;

    /* renamed from: g, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f97746g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@k ws.i protocol, @k a builder) {
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
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.T1());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readBool());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 7:
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
        public void write(@k ws.i protocol, @k f struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("PayResp");
            protocol.Q6("order_id", 1, (byte) 10);
            protocol.q7(struct.f97740a);
            protocol.N2();
            protocol.Q6("step_pay_order_id", 2, (byte) 11);
            protocol.p1(struct.f97741b);
            protocol.N2();
            protocol.Q6("no_need_pay", 3, (byte) 2);
            protocol.a4(struct.f97742c);
            protocol.N2();
            if (struct.f97743d != null) {
                protocol.Q6("pay_id", 4, (byte) 11);
                protocol.p1(struct.f97743d);
                protocol.N2();
            }
            if (struct.f97744e != null) {
                protocol.Q6("pay_url", 5, (byte) 11);
                protocol.p1(struct.f97744e);
                protocol.N2();
            }
            if (struct.f97745f != null) {
                protocol.Q6("pay_json", 6, (byte) 11);
                protocol.p1(struct.f97745f);
                protocol.N2();
            }
            if (struct.f97746g != null) {
                protocol.Q6("pay_type", 7, (byte) 8);
                protocol.l5(struct.f97746g.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public f(long j11, @k String step_pay_order_id, boolean z11, @l String str, @l String str2, @l String str3, @l Integer num) {
        g0.p(step_pay_order_id, "step_pay_order_id");
        this.f97740a = j11;
        this.f97741b = step_pay_order_id;
        this.f97742c = z11;
        this.f97743d = str;
        this.f97744e = str2;
        this.f97745f = str3;
        this.f97746g = num;
    }

    public static /* synthetic */ f i(f fVar, long j11, String str, boolean z11, String str2, String str3, String str4, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = fVar.f97740a;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = fVar.f97741b;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            z11 = fVar.f97742c;
        }
        boolean z12 = z11;
        if ((i11 & 8) != 0) {
            str2 = fVar.f97743d;
        }
        String str6 = str2;
        if ((i11 & 16) != 0) {
            str3 = fVar.f97744e;
        }
        return fVar.h(j12, str5, z12, str6, str3, (i11 & 32) != 0 ? fVar.f97745f : str4, (i11 & 64) != 0 ? fVar.f97746g : num);
    }

    public final long a() {
        return this.f97740a;
    }

    @k
    public final String b() {
        return this.f97741b;
    }

    public final boolean c() {
        return this.f97742c;
    }

    @l
    public final String d() {
        return this.f97743d;
    }

    @l
    public final String e() {
        return this.f97744e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f97740a == fVar.f97740a && g0.g(this.f97741b, fVar.f97741b) && this.f97742c == fVar.f97742c && g0.g(this.f97743d, fVar.f97743d) && g0.g(this.f97744e, fVar.f97744e) && g0.g(this.f97745f, fVar.f97745f) && g0.g(this.f97746g, fVar.f97746g);
    }

    @l
    public final String f() {
        return this.f97745f;
    }

    @l
    public final Integer g() {
        return this.f97746g;
    }

    @k
    public final f h(long j11, @k String step_pay_order_id, boolean z11, @l String str, @l String str2, @l String str3, @l Integer num) {
        g0.p(step_pay_order_id, "step_pay_order_id");
        return new f(j11, step_pay_order_id, z11, str, str2, str3, num);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.f97740a) * 31) + this.f97741b.hashCode()) * 31) + Boolean.hashCode(this.f97742c)) * 31;
        String str = this.f97743d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97744e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f97745f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f97746g;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    @k
    public String toString() {
        return "PayResp(order_id=" + this.f97740a + ", step_pay_order_id=" + this.f97741b + ", no_need_pay=" + this.f97742c + ", pay_id=" + this.f97743d + ", pay_url=" + this.f97744e + ", pay_json=" + this.f97745f + ", pay_type=" + this.f97746g + ')';
    }

    @Override // ts.e
    public void write(@k ws.i protocol) {
        g0.p(protocol, "protocol");
        f97739i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPayResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayResp.kt\ncom/baicizhan/biz/online/user_assistant_api/PayResp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
    public static final class a implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Long f97747a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f97748b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public Boolean f97749c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f97750d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public String f97751e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public String f97752f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public Integer f97753g;

        public a() {
            this.f97747a = null;
            this.f97748b = null;
            this.f97749c = null;
            this.f97750d = null;
            this.f97751e = null;
            this.f97752f = null;
            this.f97753g = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f build() {
            Long l11 = this.f97747a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'order_id' is missing");
            }
            long longValue = l11.longValue();
            String str = this.f97748b;
            if (str == null) {
                throw new IllegalStateException("Required field 'step_pay_order_id' is missing");
            }
            Boolean bool = this.f97749c;
            if (bool != null) {
                return new f(longValue, str, bool.booleanValue(), this.f97750d, this.f97751e, this.f97752f, this.f97753g);
            }
            throw new IllegalStateException("Required field 'no_need_pay' is missing");
        }

        @k
        public final a b(boolean z11) {
            this.f97749c = Boolean.valueOf(z11);
            return this;
        }

        @k
        public final a c(long j11) {
            this.f97747a = Long.valueOf(j11);
            return this;
        }

        @k
        public final a d(@l String str) {
            this.f97750d = str;
            return this;
        }

        @k
        public final a e(@l String str) {
            this.f97752f = str;
            return this;
        }

        @k
        public final a f(@l Integer num) {
            this.f97753g = num;
            return this;
        }

        @k
        public final a g(@l String str) {
            this.f97751e = str;
            return this;
        }

        @k
        public final a h(@k String step_pay_order_id) {
            g0.p(step_pay_order_id, "step_pay_order_id");
            this.f97748b = step_pay_order_id;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f97747a = null;
            this.f97748b = null;
            this.f97749c = null;
            this.f97750d = null;
            this.f97751e = null;
            this.f97752f = null;
            this.f97753g = null;
        }

        public a(@k f source) {
            g0.p(source, "source");
            this.f97747a = Long.valueOf(source.f97740a);
            this.f97748b = source.f97741b;
            this.f97749c = Boolean.valueOf(source.f97742c);
            this.f97750d = source.f97743d;
            this.f97751e = source.f97744e;
            this.f97752f = source.f97745f;
            this.f97753g = source.f97746g;
        }
    }
}
