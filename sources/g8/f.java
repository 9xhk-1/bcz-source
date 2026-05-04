package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final c f53239i = new c(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f, b> f53240j = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final long f53241a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final long f53242b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53243c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final com.baicizhan.biz.online.thrift.basic.a f53244d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Double f53245e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Double f53246f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Double f53247g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Double f53248h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<f, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol, @m80.k b builder) {
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
                            builder.i(protocol.T1());
                            break;
                        }
                    case 2:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.T1());
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
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(com.baicizhan.biz.online.thrift.basic.a.f15961g.read(protocol));
                            break;
                        }
                    case 5:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(Double.valueOf(protocol.readDouble()));
                            break;
                        }
                    case 6:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Double.valueOf(protocol.readDouble()));
                            break;
                        }
                    case 7:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(Double.valueOf(protocol.readDouble()));
                            break;
                        }
                    case 8:
                        if (b11 != 4) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(Double.valueOf(protocol.readDouble()));
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
        public void write(@m80.k ws.i protocol, @m80.k f struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AdvertisePromotionInfo");
            protocol.Q6("start_time", 1, (byte) 10);
            protocol.q7(struct.f53241a);
            protocol.N2();
            protocol.Q6("end_time", 2, (byte) 10);
            protocol.q7(struct.f53242b);
            protocol.N2();
            protocol.Q6(com.baicizhan.main.activity.schedule_v2.e.f19255e, 3, (byte) 11);
            protocol.p1(struct.f53243c);
            protocol.N2();
            protocol.Q6("redirect_info", 4, (byte) 12);
            com.baicizhan.biz.online.thrift.basic.a.f15961g.write(protocol, struct.f53244d);
            protocol.N2();
            if (struct.f53245e != null) {
                protocol.Q6("btn_x", 5, (byte) 4);
                protocol.writeDouble(struct.f53245e.doubleValue());
                protocol.N2();
            }
            if (struct.f53246f != null) {
                protocol.Q6("btn_y", 6, (byte) 4);
                protocol.writeDouble(struct.f53246f.doubleValue());
                protocol.N2();
            }
            if (struct.f53247g != null) {
                protocol.Q6("btn_w", 7, (byte) 4);
                protocol.writeDouble(struct.f53247g.doubleValue());
                protocol.N2();
            }
            if (struct.f53248h != null) {
                protocol.Q6("btn_h", 8, (byte) 4);
                protocol.writeDouble(struct.f53248h.doubleValue());
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

    public f(long j11, long j12, @m80.k String img_url, @m80.k com.baicizhan.biz.online.thrift.basic.a redirect_info, @m80.l Double d11, @m80.l Double d12, @m80.l Double d13, @m80.l Double d14) {
        g0.p(img_url, "img_url");
        g0.p(redirect_info, "redirect_info");
        this.f53241a = j11;
        this.f53242b = j12;
        this.f53243c = img_url;
        this.f53244d = redirect_info;
        this.f53245e = d11;
        this.f53246f = d12;
        this.f53247g = d13;
        this.f53248h = d14;
    }

    public static /* synthetic */ f j(f fVar, long j11, long j12, String str, com.baicizhan.biz.online.thrift.basic.a aVar, Double d11, Double d12, Double d13, Double d14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = fVar.f53241a;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            j12 = fVar.f53242b;
        }
        return fVar.i(j13, j12, (i11 & 4) != 0 ? fVar.f53243c : str, (i11 & 8) != 0 ? fVar.f53244d : aVar, (i11 & 16) != 0 ? fVar.f53245e : d11, (i11 & 32) != 0 ? fVar.f53246f : d12, (i11 & 64) != 0 ? fVar.f53247g : d13, (i11 & 128) != 0 ? fVar.f53248h : d14);
    }

    public final long a() {
        return this.f53241a;
    }

    public final long b() {
        return this.f53242b;
    }

    @m80.k
    public final String c() {
        return this.f53243c;
    }

    @m80.k
    public final com.baicizhan.biz.online.thrift.basic.a d() {
        return this.f53244d;
    }

    @m80.l
    public final Double e() {
        return this.f53245e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f53241a == fVar.f53241a && this.f53242b == fVar.f53242b && g0.g(this.f53243c, fVar.f53243c) && g0.g(this.f53244d, fVar.f53244d) && g0.g(this.f53245e, fVar.f53245e) && g0.g(this.f53246f, fVar.f53246f) && g0.g(this.f53247g, fVar.f53247g) && g0.g(this.f53248h, fVar.f53248h);
    }

    @m80.l
    public final Double f() {
        return this.f53246f;
    }

    @m80.l
    public final Double g() {
        return this.f53247g;
    }

    @m80.l
    public final Double h() {
        return this.f53248h;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.f53241a) * 31) + Long.hashCode(this.f53242b)) * 31) + this.f53243c.hashCode()) * 31) + this.f53244d.hashCode()) * 31;
        Double d11 = this.f53245e;
        int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f53246f;
        int hashCode3 = (hashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f53247g;
        int hashCode4 = (hashCode3 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.f53248h;
        return hashCode4 + (d14 != null ? d14.hashCode() : 0);
    }

    @m80.k
    public final f i(long j11, long j12, @m80.k String img_url, @m80.k com.baicizhan.biz.online.thrift.basic.a redirect_info, @m80.l Double d11, @m80.l Double d12, @m80.l Double d13, @m80.l Double d14) {
        g0.p(img_url, "img_url");
        g0.p(redirect_info, "redirect_info");
        return new f(j11, j12, img_url, redirect_info, d11, d12, d13, d14);
    }

    @m80.k
    public String toString() {
        return "AdvertisePromotionInfo(start_time=" + this.f53241a + ", end_time=" + this.f53242b + ", img_url=" + this.f53243c + ", redirect_info=" + this.f53244d + ", btn_x=" + this.f53245e + ", btn_y=" + this.f53246f + ", btn_w=" + this.f53247g + ", btn_h=" + this.f53248h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53240j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAdvertisePromotionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdvertisePromotionInfo.kt\ncom/baicizhan/biz/online/advertise_api/AdvertisePromotionInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
    public static final class b implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Long f53249a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Long f53250b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53251c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public com.baicizhan.biz.online.thrift.basic.a f53252d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Double f53253e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Double f53254f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Double f53255g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Double f53256h;

        public b() {
            this.f53249a = null;
            this.f53250b = null;
            this.f53251c = null;
            this.f53252d = null;
            this.f53253e = null;
            this.f53254f = null;
            this.f53255g = null;
            this.f53256h = null;
        }

        @m80.k
        public final b a(@m80.l Double d11) {
            this.f53256h = d11;
            return this;
        }

        @m80.k
        public final b b(@m80.l Double d11) {
            this.f53255g = d11;
            return this;
        }

        @m80.k
        public final b c(@m80.l Double d11) {
            this.f53253e = d11;
            return this;
        }

        @m80.k
        public final b d(@m80.l Double d11) {
            this.f53254f = d11;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public f build() {
            Long l11 = this.f53249a;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'start_time' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f53250b;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'end_time' is missing");
            }
            long longValue2 = l12.longValue();
            String str = this.f53251c;
            if (str == null) {
                throw new IllegalStateException("Required field 'img_url' is missing");
            }
            com.baicizhan.biz.online.thrift.basic.a aVar = this.f53252d;
            if (aVar != null) {
                return new f(longValue, longValue2, str, aVar, this.f53253e, this.f53254f, this.f53255g, this.f53256h);
            }
            throw new IllegalStateException("Required field 'redirect_info' is missing");
        }

        @m80.k
        public final b f(long j11) {
            this.f53250b = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final b g(@m80.k String img_url) {
            g0.p(img_url, "img_url");
            this.f53251c = img_url;
            return this;
        }

        @m80.k
        public final b h(@m80.k com.baicizhan.biz.online.thrift.basic.a redirect_info) {
            g0.p(redirect_info, "redirect_info");
            this.f53252d = redirect_info;
            return this;
        }

        @m80.k
        public final b i(long j11) {
            this.f53249a = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53249a = null;
            this.f53250b = null;
            this.f53251c = null;
            this.f53252d = null;
            this.f53253e = null;
            this.f53254f = null;
            this.f53255g = null;
            this.f53256h = null;
        }

        public b(@m80.k f source) {
            g0.p(source, "source");
            this.f53249a = Long.valueOf(source.f53241a);
            this.f53250b = Long.valueOf(source.f53242b);
            this.f53251c = source.f53243c;
            this.f53252d = source.f53244d;
            this.f53253e = source.f53245e;
            this.f53254f = source.f53246f;
            this.f53255g = source.f53247g;
            this.f53256h = source.f53248h;
        }
    }
}
