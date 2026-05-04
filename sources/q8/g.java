package q8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ts.e {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final b f81895j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<g, a> f81896k = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f81897a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f81898b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public final String f81899c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final int f81900d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f81901e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f81902f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @k
    public final String f81903g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    public final int f81904h;

    /* renamed from: i, reason: collision with root package name */
    @l
    @w00.g
    public final Boolean f81905i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<g, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g read(@k i protocol, @k a builder) {
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
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.s8());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.s8());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.s8());
                            break;
                        }
                    case 9:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Boolean.valueOf(protocol.readBool()));
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
        public void write(@k i protocol, @k g struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserAddressReq");
            protocol.Q6("id", 1, (byte) 8);
            protocol.l5(struct.f81897a);
            protocol.N2();
            protocol.Q6("name", 2, (byte) 11);
            protocol.p1(struct.f81898b);
            protocol.N2();
            protocol.Q6("mobile", 3, (byte) 11);
            protocol.p1(struct.f81899c);
            protocol.N2();
            protocol.Q6("province_id", 4, (byte) 8);
            protocol.l5(struct.f81900d);
            protocol.N2();
            protocol.Q6("city_id", 5, (byte) 8);
            protocol.l5(struct.f81901e);
            protocol.N2();
            protocol.Q6("district_id", 6, (byte) 8);
            protocol.l5(struct.f81902f);
            protocol.N2();
            protocol.Q6("detail", 7, (byte) 11);
            protocol.p1(struct.f81903g);
            protocol.N2();
            protocol.Q6("status", 8, (byte) 8);
            protocol.l5(struct.f81904h);
            protocol.N2();
            if (struct.f81905i != null) {
                protocol.Q6("choice", 9, (byte) 2);
                protocol.a4(struct.f81905i.booleanValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public g(int i11, @k String name, @k String mobile, int i12, int i13, int i14, @k String detail, int i15, @l Boolean bool) {
        g0.p(name, "name");
        g0.p(mobile, "mobile");
        g0.p(detail, "detail");
        this.f81897a = i11;
        this.f81898b = name;
        this.f81899c = mobile;
        this.f81900d = i12;
        this.f81901e = i13;
        this.f81902f = i14;
        this.f81903g = detail;
        this.f81904h = i15;
        this.f81905i = bool;
    }

    public static /* synthetic */ g k(g gVar, int i11, String str, String str2, int i12, int i13, int i14, String str3, int i15, Boolean bool, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i11 = gVar.f81897a;
        }
        if ((i16 & 2) != 0) {
            str = gVar.f81898b;
        }
        if ((i16 & 4) != 0) {
            str2 = gVar.f81899c;
        }
        if ((i16 & 8) != 0) {
            i12 = gVar.f81900d;
        }
        if ((i16 & 16) != 0) {
            i13 = gVar.f81901e;
        }
        if ((i16 & 32) != 0) {
            i14 = gVar.f81902f;
        }
        if ((i16 & 64) != 0) {
            str3 = gVar.f81903g;
        }
        if ((i16 & 128) != 0) {
            i15 = gVar.f81904h;
        }
        if ((i16 & 256) != 0) {
            bool = gVar.f81905i;
        }
        int i17 = i15;
        Boolean bool2 = bool;
        int i18 = i14;
        String str4 = str3;
        int i19 = i13;
        String str5 = str2;
        return gVar.j(i11, str, str5, i12, i19, i18, str4, i17, bool2);
    }

    public final int a() {
        return this.f81897a;
    }

    @k
    public final String b() {
        return this.f81898b;
    }

    @k
    public final String c() {
        return this.f81899c;
    }

    public final int d() {
        return this.f81900d;
    }

    public final int e() {
        return this.f81901e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f81897a == gVar.f81897a && g0.g(this.f81898b, gVar.f81898b) && g0.g(this.f81899c, gVar.f81899c) && this.f81900d == gVar.f81900d && this.f81901e == gVar.f81901e && this.f81902f == gVar.f81902f && g0.g(this.f81903g, gVar.f81903g) && this.f81904h == gVar.f81904h && g0.g(this.f81905i, gVar.f81905i);
    }

    public final int f() {
        return this.f81902f;
    }

    @k
    public final String g() {
        return this.f81903g;
    }

    public final int h() {
        return this.f81904h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.f81897a) * 31) + this.f81898b.hashCode()) * 31) + this.f81899c.hashCode()) * 31) + Integer.hashCode(this.f81900d)) * 31) + Integer.hashCode(this.f81901e)) * 31) + Integer.hashCode(this.f81902f)) * 31) + this.f81903g.hashCode()) * 31) + Integer.hashCode(this.f81904h)) * 31;
        Boolean bool = this.f81905i;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    @l
    public final Boolean i() {
        return this.f81905i;
    }

    @k
    public final g j(int i11, @k String name, @k String mobile, int i12, int i13, int i14, @k String detail, int i15, @l Boolean bool) {
        g0.p(name, "name");
        g0.p(mobile, "mobile");
        g0.p(detail, "detail");
        return new g(i11, name, mobile, i12, i13, i14, detail, i15, bool);
    }

    @k
    public String toString() {
        return "UserAddressReq(id=" + this.f81897a + ", name=" + this.f81898b + ", mobile=" + this.f81899c + ", province_id=" + this.f81900d + ", city_id=" + this.f81901e + ", district_id=" + this.f81902f + ", detail=" + this.f81903g + ", status=" + this.f81904h + ", choice=" + this.f81905i + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f81896k.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserAddressReq.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAddressReq.kt\ncom/baicizhan/biz/online/mall_proxy/UserAddressReq$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,324:1\n1#2:325\n*E\n"})
    public static final class a implements ts.f<g> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f81906a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f81907b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f81908c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public Integer f81909d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public Integer f81910e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public Integer f81911f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public String f81912g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public Integer f81913h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public Boolean f81914i;

        public a() {
            Boolean bool = Boolean.TRUE;
            this.f81906a = null;
            this.f81907b = null;
            this.f81908c = null;
            this.f81909d = null;
            this.f81910e = null;
            this.f81911f = null;
            this.f81912g = null;
            this.f81913h = null;
            this.f81914i = bool;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g build() {
            Integer num = this.f81906a;
            if (num == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f81907b;
            if (str == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            String str2 = this.f81908c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'mobile' is missing");
            }
            Integer num2 = this.f81909d;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'province_id' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f81910e;
            if (num3 == null) {
                throw new IllegalStateException("Required field 'city_id' is missing");
            }
            int intValue3 = num3.intValue();
            Integer num4 = this.f81911f;
            if (num4 == null) {
                throw new IllegalStateException("Required field 'district_id' is missing");
            }
            int intValue4 = num4.intValue();
            String str3 = this.f81912g;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'detail' is missing");
            }
            Integer num5 = this.f81913h;
            if (num5 != null) {
                return new g(intValue, str, str2, intValue2, intValue3, intValue4, str3, num5.intValue(), this.f81914i);
            }
            throw new IllegalStateException("Required field 'status' is missing");
        }

        @k
        public final a b(@l Boolean bool) {
            this.f81914i = bool;
            return this;
        }

        @k
        public final a c(int i11) {
            this.f81910e = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a d(@k String detail) {
            g0.p(detail, "detail");
            this.f81912g = detail;
            return this;
        }

        @k
        public final a e(int i11) {
            this.f81911f = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a f(int i11) {
            this.f81906a = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a g(@k String mobile) {
            g0.p(mobile, "mobile");
            this.f81908c = mobile;
            return this;
        }

        @k
        public final a h(@k String name) {
            g0.p(name, "name");
            this.f81907b = name;
            return this;
        }

        @k
        public final a i(int i11) {
            this.f81909d = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a j(int i11) {
            this.f81913h = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f81906a = null;
            this.f81907b = null;
            this.f81908c = null;
            this.f81909d = null;
            this.f81910e = null;
            this.f81911f = null;
            this.f81912g = null;
            this.f81913h = null;
            this.f81914i = Boolean.TRUE;
        }

        public a(@k g source) {
            g0.p(source, "source");
            this.f81914i = Boolean.TRUE;
            this.f81906a = Integer.valueOf(source.f81897a);
            this.f81907b = source.f81898b;
            this.f81908c = source.f81899c;
            this.f81909d = Integer.valueOf(source.f81900d);
            this.f81910e = Integer.valueOf(source.f81901e);
            this.f81911f = Integer.valueOf(source.f81902f);
            this.f81912g = source.f81903g;
            this.f81913h = Integer.valueOf(source.f81904h);
            this.f81914i = source.f81905i;
        }
    }

    public /* synthetic */ g(int i11, String str, String str2, int i12, int i13, int i14, String str3, int i15, Boolean bool, int i16, v vVar) {
        this(i11, str, str2, i12, i13, i14, str3, i15, (i16 & 256) != 0 ? Boolean.TRUE : bool);
    }
}
