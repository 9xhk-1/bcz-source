package m8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final c f72570k = new c(null);

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<a, b> f72571l = new C0873a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f72572a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f72573b;

    /* renamed from: c, reason: collision with root package name */
    @l
    @w00.g
    public final String f72574c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @w00.g
    public final String f72575d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @w00.g
    public final Integer f72576e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @w00.g
    public final Double f72577f;

    /* renamed from: g, reason: collision with root package name */
    @l
    @w00.g
    public final Double f72578g;

    /* renamed from: h, reason: collision with root package name */
    @l
    @w00.g
    public final Double f72579h;

    /* renamed from: i, reason: collision with root package name */
    @l
    @w00.g
    public final Double f72580i;

    /* renamed from: j, reason: collision with root package name */
    @l
    @w00.g
    public final Long f72581j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: m8.a$a, reason: collision with other inner class name */
    public static final class C0873a implements ts.a<a, b> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@k i protocol, @k b builder) {
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
                            builder.a(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 6:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Double.valueOf(protocol.readDouble()));
                            break;
                        }
                    case 7:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(Double.valueOf(protocol.readDouble()));
                            break;
                        }
                    case 8:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Double.valueOf(protocol.readDouble()));
                            break;
                        }
                    case 9:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(Double.valueOf(protocol.readDouble()));
                            break;
                        }
                    case 10:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(Long.valueOf(protocol.T1()));
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
        public void write(@k i protocol, @k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBAdInfo");
            protocol.Q6("ad_id", 1, (byte) 8);
            protocol.l5(struct.f72572a);
            protocol.N2();
            protocol.Q6("ad_name", 2, (byte) 11);
            protocol.p1(struct.f72573b);
            protocol.N2();
            if (struct.f72574c != null) {
                protocol.Q6("image_url", 3, (byte) 11);
                protocol.p1(struct.f72574c);
                protocol.N2();
            }
            if (struct.f72575d != null) {
                protocol.Q6("click_url", 4, (byte) 11);
                protocol.p1(struct.f72575d);
                protocol.N2();
            }
            if (struct.f72576e != null) {
                protocol.Q6("show_time", 5, (byte) 8);
                protocol.l5(struct.f72576e.intValue());
                protocol.N2();
            }
            if (struct.f72577f != null) {
                protocol.Q6("btn_x", 6, (byte) 4);
                protocol.writeDouble(struct.f72577f.doubleValue());
                protocol.N2();
            }
            if (struct.f72578g != null) {
                protocol.Q6("btn_y", 7, (byte) 4);
                protocol.writeDouble(struct.f72578g.doubleValue());
                protocol.N2();
            }
            if (struct.f72579h != null) {
                protocol.Q6("btn_w", 8, (byte) 4);
                protocol.writeDouble(struct.f72579h.doubleValue());
                protocol.N2();
            }
            if (struct.f72580i != null) {
                protocol.Q6("btn_h", 9, (byte) 4);
                protocol.writeDouble(struct.f72580i.doubleValue());
                protocol.N2();
            }
            if (struct.f72581j != null) {
                protocol.Q6("taobao_item_id", 10, (byte) 10);
                protocol.q7(struct.f72581j.longValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(v vVar) {
            this();
        }

        public c() {
        }
    }

    public a(int i11, @k String ad_name, @l String str, @l String str2, @l Integer num, @l Double d11, @l Double d12, @l Double d13, @l Double d14, @l Long l11) {
        g0.p(ad_name, "ad_name");
        this.f72572a = i11;
        this.f72573b = ad_name;
        this.f72574c = str;
        this.f72575d = str2;
        this.f72576e = num;
        this.f72577f = d11;
        this.f72578g = d12;
        this.f72579h = d13;
        this.f72580i = d14;
        this.f72581j = l11;
    }

    public static /* synthetic */ a l(a aVar, int i11, String str, String str2, String str3, Integer num, Double d11, Double d12, Double d13, Double d14, Long l11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = aVar.f72572a;
        }
        if ((i12 & 2) != 0) {
            str = aVar.f72573b;
        }
        if ((i12 & 4) != 0) {
            str2 = aVar.f72574c;
        }
        if ((i12 & 8) != 0) {
            str3 = aVar.f72575d;
        }
        if ((i12 & 16) != 0) {
            num = aVar.f72576e;
        }
        if ((i12 & 32) != 0) {
            d11 = aVar.f72577f;
        }
        if ((i12 & 64) != 0) {
            d12 = aVar.f72578g;
        }
        if ((i12 & 128) != 0) {
            d13 = aVar.f72579h;
        }
        if ((i12 & 256) != 0) {
            d14 = aVar.f72580i;
        }
        if ((i12 & 512) != 0) {
            l11 = aVar.f72581j;
        }
        Double d15 = d14;
        Long l12 = l11;
        Double d16 = d12;
        Double d17 = d13;
        Integer num2 = num;
        Double d18 = d11;
        return aVar.k(i11, str, str2, str3, num2, d18, d16, d17, d15, l12);
    }

    public final int a() {
        return this.f72572a;
    }

    @l
    public final Long b() {
        return this.f72581j;
    }

    @k
    public final String c() {
        return this.f72573b;
    }

    @l
    public final String d() {
        return this.f72574c;
    }

    @l
    public final String e() {
        return this.f72575d;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f72572a == aVar.f72572a && g0.g(this.f72573b, aVar.f72573b) && g0.g(this.f72574c, aVar.f72574c) && g0.g(this.f72575d, aVar.f72575d) && g0.g(this.f72576e, aVar.f72576e) && g0.g(this.f72577f, aVar.f72577f) && g0.g(this.f72578g, aVar.f72578g) && g0.g(this.f72579h, aVar.f72579h) && g0.g(this.f72580i, aVar.f72580i) && g0.g(this.f72581j, aVar.f72581j);
    }

    @l
    public final Integer f() {
        return this.f72576e;
    }

    @l
    public final Double g() {
        return this.f72577f;
    }

    @l
    public final Double h() {
        return this.f72578g;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f72572a) * 31) + this.f72573b.hashCode()) * 31;
        String str = this.f72574c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f72575d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f72576e;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Double d11 = this.f72577f;
        int hashCode5 = (hashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f72578g;
        int hashCode6 = (hashCode5 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f72579h;
        int hashCode7 = (hashCode6 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f72580i;
        int hashCode8 = (hashCode7 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Long l11 = this.f72581j;
        return hashCode8 + (l11 != null ? l11.hashCode() : 0);
    }

    @l
    public final Double i() {
        return this.f72579h;
    }

    @l
    public final Double j() {
        return this.f72580i;
    }

    @k
    public final a k(int i11, @k String ad_name, @l String str, @l String str2, @l Integer num, @l Double d11, @l Double d12, @l Double d13, @l Double d14, @l Long l11) {
        g0.p(ad_name, "ad_name");
        return new a(i11, ad_name, str, str2, num, d11, d12, d13, d14, l11);
    }

    @k
    public String toString() {
        return "BBAdInfo(ad_id=" + this.f72572a + ", ad_name=" + this.f72573b + ", image_url=" + this.f72574c + ", click_url=" + this.f72575d + ", show_time=" + this.f72576e + ", btn_x=" + this.f72577f + ", btn_y=" + this.f72578g + ", btn_w=" + this.f72579h + ", btn_h=" + this.f72580i + ", taobao_item_id=" + this.f72581j + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f72571l.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBAdInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBAdInfo.kt\ncom/baicizhan/biz/online/bs_users/BBAdInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,351:1\n1#2:352\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f72582a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f72583b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f72584c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f72585d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public Integer f72586e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public Double f72587f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public Double f72588g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public Double f72589h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public Double f72590i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public Long f72591j;

        public b() {
            this.f72582a = null;
            this.f72583b = null;
            this.f72584c = null;
            this.f72585d = null;
            this.f72586e = null;
            this.f72587f = null;
            this.f72588g = null;
            this.f72589h = null;
            this.f72590i = null;
            this.f72591j = null;
        }

        @k
        public final b a(int i11) {
            this.f72582a = Integer.valueOf(i11);
            return this;
        }

        @k
        public final b b(@k String ad_name) {
            g0.p(ad_name, "ad_name");
            this.f72583b = ad_name;
            return this;
        }

        @k
        public final b c(@l Double d11) {
            this.f72590i = d11;
            return this;
        }

        @k
        public final b d(@l Double d11) {
            this.f72589h = d11;
            return this;
        }

        @k
        public final b e(@l Double d11) {
            this.f72587f = d11;
            return this;
        }

        @k
        public final b f(@l Double d11) {
            this.f72588g = d11;
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a build() {
            Integer num = this.f72582a;
            if (num == null) {
                throw new IllegalStateException("Required field 'ad_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f72583b;
            if (str != null) {
                return new a(intValue, str, this.f72584c, this.f72585d, this.f72586e, this.f72587f, this.f72588g, this.f72589h, this.f72590i, this.f72591j);
            }
            throw new IllegalStateException("Required field 'ad_name' is missing");
        }

        @k
        public final b h(@l String str) {
            this.f72585d = str;
            return this;
        }

        @k
        public final b i(@l String str) {
            this.f72584c = str;
            return this;
        }

        @k
        public final b j(@l Integer num) {
            this.f72586e = num;
            return this;
        }

        @k
        public final b k(@l Long l11) {
            this.f72591j = l11;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f72582a = null;
            this.f72583b = null;
            this.f72584c = null;
            this.f72585d = null;
            this.f72586e = null;
            this.f72587f = null;
            this.f72588g = null;
            this.f72589h = null;
            this.f72590i = null;
            this.f72591j = null;
        }

        public b(@k a source) {
            g0.p(source, "source");
            this.f72582a = Integer.valueOf(source.f72572a);
            this.f72583b = source.f72573b;
            this.f72584c = source.f72574c;
            this.f72585d = source.f72575d;
            this.f72586e = source.f72576e;
            this.f72587f = source.f72577f;
            this.f72588g = source.f72578g;
            this.f72589h = source.f72579h;
            this.f72590i = source.f72580i;
            this.f72591j = source.f72581j;
        }
    }
}
