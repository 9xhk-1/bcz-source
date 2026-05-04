package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class e implements ts.e {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final c f53219j = new c(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<e, b> f53220k = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f53221a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53222b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53223c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f53224d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Double f53225e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Double f53226f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Double f53227g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Double f53228h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final com.baicizhan.biz.online.thrift.basic.a f53229i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<e, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.h(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 5:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Double.valueOf(protocol.readDouble()));
                            break;
                        }
                    case 6:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(Double.valueOf(protocol.readDouble()));
                            break;
                        }
                    case 7:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Double.valueOf(protocol.readDouble()));
                            break;
                        }
                    case 8:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(Double.valueOf(protocol.readDouble()));
                            break;
                        }
                    case 9:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(com.baicizhan.biz.online.thrift.basic.a.f15961g.read(protocol));
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
        public void write(@m80.k ws.i protocol, @m80.k e struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AdvertiseLoadingItem");
            protocol.Q6("ad_id", 1, (byte) 8);
            protocol.l5(struct.f53221a);
            protocol.N2();
            protocol.Q6("ad_name", 2, (byte) 11);
            protocol.p1(struct.f53222b);
            protocol.N2();
            if (struct.f53223c != null) {
                protocol.Q6("image_url", 3, (byte) 11);
                protocol.p1(struct.f53223c);
                protocol.N2();
            }
            if (struct.f53224d != null) {
                protocol.Q6("show_time", 4, (byte) 8);
                protocol.l5(struct.f53224d.intValue());
                protocol.N2();
            }
            if (struct.f53225e != null) {
                protocol.Q6("btn_x", 5, (byte) 4);
                protocol.writeDouble(struct.f53225e.doubleValue());
                protocol.N2();
            }
            if (struct.f53226f != null) {
                protocol.Q6("btn_y", 6, (byte) 4);
                protocol.writeDouble(struct.f53226f.doubleValue());
                protocol.N2();
            }
            if (struct.f53227g != null) {
                protocol.Q6("btn_w", 7, (byte) 4);
                protocol.writeDouble(struct.f53227g.doubleValue());
                protocol.N2();
            }
            if (struct.f53228h != null) {
                protocol.Q6("btn_h", 8, (byte) 4);
                protocol.writeDouble(struct.f53228h.doubleValue());
                protocol.N2();
            }
            if (struct.f53229i != null) {
                protocol.Q6("redirect_info", 9, (byte) 12);
                com.baicizhan.biz.online.thrift.basic.a.f15961g.write(protocol, struct.f53229i);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public e(int i11, @m80.k String ad_name, @m80.l String str, @m80.l Integer num, @m80.l Double d11, @m80.l Double d12, @m80.l Double d13, @m80.l Double d14, @m80.l com.baicizhan.biz.online.thrift.basic.a aVar) {
        g0.p(ad_name, "ad_name");
        this.f53221a = i11;
        this.f53222b = ad_name;
        this.f53223c = str;
        this.f53224d = num;
        this.f53225e = d11;
        this.f53226f = d12;
        this.f53227g = d13;
        this.f53228h = d14;
        this.f53229i = aVar;
    }

    public static /* synthetic */ e k(e eVar, int i11, String str, String str2, Integer num, Double d11, Double d12, Double d13, Double d14, com.baicizhan.biz.online.thrift.basic.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = eVar.f53221a;
        }
        if ((i12 & 2) != 0) {
            str = eVar.f53222b;
        }
        if ((i12 & 4) != 0) {
            str2 = eVar.f53223c;
        }
        if ((i12 & 8) != 0) {
            num = eVar.f53224d;
        }
        if ((i12 & 16) != 0) {
            d11 = eVar.f53225e;
        }
        if ((i12 & 32) != 0) {
            d12 = eVar.f53226f;
        }
        if ((i12 & 64) != 0) {
            d13 = eVar.f53227g;
        }
        if ((i12 & 128) != 0) {
            d14 = eVar.f53228h;
        }
        if ((i12 & 256) != 0) {
            aVar = eVar.f53229i;
        }
        Double d15 = d14;
        com.baicizhan.biz.online.thrift.basic.a aVar2 = aVar;
        Double d16 = d12;
        Double d17 = d13;
        Double d18 = d11;
        String str3 = str2;
        return eVar.j(i11, str, str3, num, d18, d16, d17, d15, aVar2);
    }

    public final int a() {
        return this.f53221a;
    }

    @m80.k
    public final String b() {
        return this.f53222b;
    }

    @m80.l
    public final String c() {
        return this.f53223c;
    }

    @m80.l
    public final Integer d() {
        return this.f53224d;
    }

    @m80.l
    public final Double e() {
        return this.f53225e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f53221a == eVar.f53221a && g0.g(this.f53222b, eVar.f53222b) && g0.g(this.f53223c, eVar.f53223c) && g0.g(this.f53224d, eVar.f53224d) && g0.g(this.f53225e, eVar.f53225e) && g0.g(this.f53226f, eVar.f53226f) && g0.g(this.f53227g, eVar.f53227g) && g0.g(this.f53228h, eVar.f53228h) && g0.g(this.f53229i, eVar.f53229i);
    }

    @m80.l
    public final Double f() {
        return this.f53226f;
    }

    @m80.l
    public final Double g() {
        return this.f53227g;
    }

    @m80.l
    public final Double h() {
        return this.f53228h;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f53221a) * 31) + this.f53222b.hashCode()) * 31;
        String str = this.f53223c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f53224d;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Double d11 = this.f53225e;
        int hashCode4 = (hashCode3 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f53226f;
        int hashCode5 = (hashCode4 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f53227g;
        int hashCode6 = (hashCode5 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f53228h;
        int hashCode7 = (hashCode6 + (d14 == null ? 0 : d14.hashCode())) * 31;
        com.baicizhan.biz.online.thrift.basic.a aVar = this.f53229i;
        return hashCode7 + (aVar != null ? aVar.hashCode() : 0);
    }

    @m80.l
    public final com.baicizhan.biz.online.thrift.basic.a i() {
        return this.f53229i;
    }

    @m80.k
    public final e j(int i11, @m80.k String ad_name, @m80.l String str, @m80.l Integer num, @m80.l Double d11, @m80.l Double d12, @m80.l Double d13, @m80.l Double d14, @m80.l com.baicizhan.biz.online.thrift.basic.a aVar) {
        g0.p(ad_name, "ad_name");
        return new e(i11, ad_name, str, num, d11, d12, d13, d14, aVar);
    }

    @m80.k
    public String toString() {
        return "AdvertiseLoadingItem(ad_id=" + this.f53221a + ", ad_name=" + this.f53222b + ", image_url=" + this.f53223c + ", show_time=" + this.f53224d + ", btn_x=" + this.f53225e + ", btn_y=" + this.f53226f + ", btn_w=" + this.f53227g + ", btn_h=" + this.f53228h + ", redirect_info=" + this.f53229i + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53220k.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAdvertiseLoadingItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvertiseLoadingItem.kt\ncom/baicizhan/biz/online/advertise_api/AdvertiseLoadingItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,322:1\n1#2:323\n*E\n"})
    public static final class b implements ts.f<e> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f53230a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f53231b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53232c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Integer f53233d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Double f53234e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Double f53235f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Double f53236g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Double f53237h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public com.baicizhan.biz.online.thrift.basic.a f53238i;

        public b() {
            this.f53230a = null;
            this.f53231b = null;
            this.f53232c = null;
            this.f53233d = null;
            this.f53234e = null;
            this.f53235f = null;
            this.f53236g = null;
            this.f53237h = null;
            this.f53238i = null;
        }

        @m80.k
        public final b a(int i11) {
            this.f53230a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b b(@m80.k String ad_name) {
            g0.p(ad_name, "ad_name");
            this.f53231b = ad_name;
            return this;
        }

        @m80.k
        public final b c(@m80.l Double d11) {
            this.f53237h = d11;
            return this;
        }

        @m80.k
        public final b d(@m80.l Double d11) {
            this.f53236g = d11;
            return this;
        }

        @m80.k
        public final b e(@m80.l Double d11) {
            this.f53234e = d11;
            return this;
        }

        @m80.k
        public final b f(@m80.l Double d11) {
            this.f53235f = d11;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e build() {
            Integer num = this.f53230a;
            if (num == null) {
                throw new IllegalStateException("Required field 'ad_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f53231b;
            if (str != null) {
                return new e(intValue, str, this.f53232c, this.f53233d, this.f53234e, this.f53235f, this.f53236g, this.f53237h, this.f53238i);
            }
            throw new IllegalStateException("Required field 'ad_name' is missing");
        }

        @m80.k
        public final b h(@m80.l String str) {
            this.f53232c = str;
            return this;
        }

        @m80.k
        public final b i(@m80.l com.baicizhan.biz.online.thrift.basic.a aVar) {
            this.f53238i = aVar;
            return this;
        }

        @m80.k
        public final b j(@m80.l Integer num) {
            this.f53233d = num;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53230a = null;
            this.f53231b = null;
            this.f53232c = null;
            this.f53233d = null;
            this.f53234e = null;
            this.f53235f = null;
            this.f53236g = null;
            this.f53237h = null;
            this.f53238i = null;
        }

        public b(@m80.k e source) {
            g0.p(source, "source");
            this.f53230a = Integer.valueOf(source.f53221a);
            this.f53231b = source.f53222b;
            this.f53232c = source.f53223c;
            this.f53233d = source.f53224d;
            this.f53234e = source.f53225e;
            this.f53235f = source.f53226f;
            this.f53236g = source.f53227g;
            this.f53237h = source.f53228h;
            this.f53238i = source.f53229i;
        }
    }
}
