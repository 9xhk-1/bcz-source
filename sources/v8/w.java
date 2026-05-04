package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class w implements ts.e {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final b f93557h = new b(null);

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<w, a> f93558i = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93559a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final double f93560b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final double f93561c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93562d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93563e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93564f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f93565g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<w, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public w read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public w read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.a(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readDouble());
                            break;
                        }
                    case 3:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readDouble());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k w struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserExtInfo");
            protocol.Q6(q9.h.f81940d, 1, (byte) 11);
            protocol.p1(struct.f93559a);
            protocol.N2();
            protocol.Q6("longitude", 2, (byte) 4);
            protocol.writeDouble(struct.f93560b);
            protocol.N2();
            protocol.Q6("latitude", 3, (byte) 4);
            protocol.writeDouble(struct.f93561c);
            protocol.N2();
            if (struct.f93562d != null) {
                protocol.Q6("province", 4, (byte) 11);
                protocol.p1(struct.f93562d);
                protocol.N2();
            }
            protocol.Q6("city", 5, (byte) 11);
            protocol.p1(struct.f93563e);
            protocol.N2();
            protocol.Q6("district", 6, (byte) 11);
            protocol.p1(struct.f93564f);
            protocol.N2();
            if (struct.f93565g != null) {
                protocol.Q6("screen_mod", 7, (byte) 8);
                protocol.l5(struct.f93565g.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public w(@m80.k String avatar, double d11, double d12, @m80.l String str, @m80.k String city, @m80.k String district, @m80.l Integer num) {
        g0.p(avatar, "avatar");
        g0.p(city, "city");
        g0.p(district, "district");
        this.f93559a = avatar;
        this.f93560b = d11;
        this.f93561c = d12;
        this.f93562d = str;
        this.f93563e = city;
        this.f93564f = district;
        this.f93565g = num;
    }

    public static /* synthetic */ w i(w wVar, String str, double d11, double d12, String str2, String str3, String str4, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wVar.f93559a;
        }
        if ((i11 & 2) != 0) {
            d11 = wVar.f93560b;
        }
        if ((i11 & 4) != 0) {
            d12 = wVar.f93561c;
        }
        if ((i11 & 8) != 0) {
            str2 = wVar.f93562d;
        }
        if ((i11 & 16) != 0) {
            str3 = wVar.f93563e;
        }
        if ((i11 & 32) != 0) {
            str4 = wVar.f93564f;
        }
        if ((i11 & 64) != 0) {
            num = wVar.f93565g;
        }
        double d13 = d12;
        return wVar.h(str, d11, d13, str2, str3, str4, num);
    }

    @m80.k
    public final String a() {
        return this.f93559a;
    }

    public final double b() {
        return this.f93560b;
    }

    public final double c() {
        return this.f93561c;
    }

    @m80.l
    public final String d() {
        return this.f93562d;
    }

    @m80.k
    public final String e() {
        return this.f93563e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return g0.g(this.f93559a, wVar.f93559a) && Double.compare(this.f93560b, wVar.f93560b) == 0 && Double.compare(this.f93561c, wVar.f93561c) == 0 && g0.g(this.f93562d, wVar.f93562d) && g0.g(this.f93563e, wVar.f93563e) && g0.g(this.f93564f, wVar.f93564f) && g0.g(this.f93565g, wVar.f93565g);
    }

    @m80.k
    public final String f() {
        return this.f93564f;
    }

    @m80.l
    public final Integer g() {
        return this.f93565g;
    }

    @m80.k
    public final w h(@m80.k String avatar, double d11, double d12, @m80.l String str, @m80.k String city, @m80.k String district, @m80.l Integer num) {
        g0.p(avatar, "avatar");
        g0.p(city, "city");
        g0.p(district, "district");
        return new w(avatar, d11, d12, str, city, district, num);
    }

    public int hashCode() {
        int hashCode = ((((this.f93559a.hashCode() * 31) + Double.hashCode(this.f93560b)) * 31) + Double.hashCode(this.f93561c)) * 31;
        String str = this.f93562d;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f93563e.hashCode()) * 31) + this.f93564f.hashCode()) * 31;
        Integer num = this.f93565g;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "UserExtInfo(avatar=" + this.f93559a + ", longitude=" + this.f93560b + ", latitude=" + this.f93561c + ", province=" + this.f93562d + ", city=" + this.f93563e + ", district=" + this.f93564f + ", screen_mod=" + this.f93565g + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93558i.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserExtInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserExtInfo.kt\ncom/baicizhan/biz/online/unified_user_service/UserExtInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1#2:270\n*E\n"})
    public static final class a implements ts.f<w> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93566a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Double f93567b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Double f93568c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f93569d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f93570e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f93571f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f93572g;

        public a() {
            this.f93566a = null;
            this.f93567b = null;
            this.f93568c = null;
            this.f93569d = null;
            this.f93570e = null;
            this.f93571f = null;
            this.f93572g = null;
        }

        @m80.k
        public final a a(@m80.k String avatar) {
            g0.p(avatar, "avatar");
            this.f93566a = avatar;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public w build() {
            String str = this.f93566a;
            if (str == null) {
                throw new IllegalStateException("Required field 'avatar' is missing");
            }
            Double d11 = this.f93567b;
            if (d11 == null) {
                throw new IllegalStateException("Required field 'longitude' is missing");
            }
            double doubleValue = d11.doubleValue();
            Double d12 = this.f93568c;
            if (d12 == null) {
                throw new IllegalStateException("Required field 'latitude' is missing");
            }
            double doubleValue2 = d12.doubleValue();
            String str2 = this.f93569d;
            String str3 = this.f93570e;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'city' is missing");
            }
            String str4 = this.f93571f;
            if (str4 != null) {
                return new w(str, doubleValue, doubleValue2, str2, str3, str4, this.f93572g);
            }
            throw new IllegalStateException("Required field 'district' is missing");
        }

        @m80.k
        public final a c(@m80.k String city) {
            g0.p(city, "city");
            this.f93570e = city;
            return this;
        }

        @m80.k
        public final a d(@m80.k String district) {
            g0.p(district, "district");
            this.f93571f = district;
            return this;
        }

        @m80.k
        public final a e(double d11) {
            this.f93568c = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a f(double d11) {
            this.f93567b = Double.valueOf(d11);
            return this;
        }

        @m80.k
        public final a g(@m80.l String str) {
            this.f93569d = str;
            return this;
        }

        @m80.k
        public final a h(@m80.l Integer num) {
            this.f93572g = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93566a = null;
            this.f93567b = null;
            this.f93568c = null;
            this.f93569d = null;
            this.f93570e = null;
            this.f93571f = null;
            this.f93572g = null;
        }

        public a(@m80.k w source) {
            g0.p(source, "source");
            this.f93566a = source.f93559a;
            this.f93567b = Double.valueOf(source.f93560b);
            this.f93568c = Double.valueOf(source.f93561c);
            this.f93569d = source.f93562d;
            this.f93570e = source.f93563e;
            this.f93571f = source.f93564f;
            this.f93572g = source.f93565g;
        }
    }
}
