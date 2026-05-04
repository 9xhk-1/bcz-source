package g8;

import com.tencent.open.SocialConstants;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class z implements ts.e {

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public static final b f53455p = new b(null);

    /* renamed from: q, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<z, a> f53456q = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f53457a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53458b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f53459c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f53460d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f53461e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final int f53462f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final g8.b f53463g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final g8.b f53464h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53465i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f53466j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f53467k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f53468l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    @w00.g
    public final f8.b f53469m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f53470n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f53471o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<z, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.k(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.p(protocol.T1());
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.T1());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.o(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.n(protocol.s8());
                            break;
                        }
                    case 7:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(g8.b.f53173f.read(protocol));
                            break;
                        }
                    case 8:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(g8.b.f53173f.read(protocol));
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 10:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 11:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 12:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.m(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 13:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(f8.b.f51265i.read(protocol));
                            break;
                        }
                    case 14:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 15:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k z struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("StartupAd");
            protocol.Q6("ad_id", 1, (byte) 8);
            protocol.l5(struct.f53457a);
            protocol.N2();
            protocol.Q6(SocialConstants.PARAM_IMG_URL, 2, (byte) 11);
            protocol.p1(struct.f53458b);
            protocol.N2();
            protocol.Q6("start_time", 3, (byte) 10);
            protocol.q7(struct.f53459c);
            protocol.N2();
            protocol.Q6("end_time", 4, (byte) 10);
            protocol.q7(struct.f53460d);
            protocol.N2();
            protocol.Q6("show_times", 5, (byte) 8);
            protocol.l5(struct.f53461e);
            protocol.N2();
            protocol.Q6("show_seconds", 6, (byte) 8);
            protocol.l5(struct.f53462f);
            protocol.N2();
            if (struct.f53463g != null) {
                protocol.Q6(y9.b.f99687c, 7, (byte) 12);
                g8.b.f53173f.write(protocol, struct.f53463g);
                protocol.N2();
            }
            if (struct.f53464h != null) {
                protocol.Q6("backup_link", 8, (byte) 12);
                g8.b.f53173f.write(protocol, struct.f53464h);
                protocol.N2();
            }
            if (struct.f53465i != null) {
                protocol.Q6("ext_ad_id", 9, (byte) 11);
                protocol.p1(struct.f53465i);
                protocol.N2();
            }
            if (struct.f53466j != null) {
                protocol.Q6("ad_type", 10, (byte) 8);
                protocol.l5(struct.f53466j.intValue());
                protocol.N2();
            }
            if (struct.f53467k != null) {
                protocol.Q6("full", 11, (byte) 8);
                protocol.l5(struct.f53467k.intValue());
                protocol.N2();
            }
            if (struct.f53468l != null) {
                protocol.Q6("res_type", 12, (byte) 8);
                protocol.l5(struct.f53468l.intValue());
                protocol.N2();
            }
            if (struct.f53469m != null) {
                protocol.Q6("ad_resp", 13, (byte) 12);
                f8.b.f51265i.write(protocol, struct.f53469m);
                protocol.N2();
            }
            if (struct.f53470n != null) {
                protocol.Q6("cached", 14, (byte) 8);
                protocol.l5(struct.f53470n.intValue());
                protocol.N2();
            }
            if (struct.f53471o != null) {
                protocol.Q6("btn_light", 15, (byte) 8);
                protocol.l5(struct.f53471o.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public z(int i11, @m80.k String img, long j11, long j12, int i12, int i13, @m80.l g8.b bVar, @m80.l g8.b bVar2, @m80.l String str, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l f8.b bVar3, @m80.l Integer num4, @m80.l Integer num5) {
        g0.p(img, "img");
        this.f53457a = i11;
        this.f53458b = img;
        this.f53459c = j11;
        this.f53460d = j12;
        this.f53461e = i12;
        this.f53462f = i13;
        this.f53463g = bVar;
        this.f53464h = bVar2;
        this.f53465i = str;
        this.f53466j = num;
        this.f53467k = num2;
        this.f53468l = num3;
        this.f53469m = bVar3;
        this.f53470n = num4;
        this.f53471o = num5;
    }

    public final int a() {
        return this.f53457a;
    }

    @m80.l
    public final Integer b() {
        return this.f53466j;
    }

    @m80.l
    public final Integer c() {
        return this.f53467k;
    }

    @m80.l
    public final Integer d() {
        return this.f53468l;
    }

    @m80.l
    public final f8.b e() {
        return this.f53469m;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f53457a == zVar.f53457a && g0.g(this.f53458b, zVar.f53458b) && this.f53459c == zVar.f53459c && this.f53460d == zVar.f53460d && this.f53461e == zVar.f53461e && this.f53462f == zVar.f53462f && g0.g(this.f53463g, zVar.f53463g) && g0.g(this.f53464h, zVar.f53464h) && g0.g(this.f53465i, zVar.f53465i) && g0.g(this.f53466j, zVar.f53466j) && g0.g(this.f53467k, zVar.f53467k) && g0.g(this.f53468l, zVar.f53468l) && g0.g(this.f53469m, zVar.f53469m) && g0.g(this.f53470n, zVar.f53470n) && g0.g(this.f53471o, zVar.f53471o);
    }

    @m80.l
    public final Integer f() {
        return this.f53470n;
    }

    @m80.l
    public final Integer g() {
        return this.f53471o;
    }

    @m80.k
    public final String h() {
        return this.f53458b;
    }

    public int hashCode() {
        int hashCode = ((((((((((Integer.hashCode(this.f53457a) * 31) + this.f53458b.hashCode()) * 31) + Long.hashCode(this.f53459c)) * 31) + Long.hashCode(this.f53460d)) * 31) + Integer.hashCode(this.f53461e)) * 31) + Integer.hashCode(this.f53462f)) * 31;
        g8.b bVar = this.f53463g;
        int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        g8.b bVar2 = this.f53464h;
        int hashCode3 = (hashCode2 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        String str = this.f53465i;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f53466j;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f53467k;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f53468l;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        f8.b bVar3 = this.f53469m;
        int hashCode8 = (hashCode7 + (bVar3 == null ? 0 : bVar3.hashCode())) * 31;
        Integer num4 = this.f53470n;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f53471o;
        return hashCode9 + (num5 != null ? num5.hashCode() : 0);
    }

    public final long i() {
        return this.f53459c;
    }

    public final long j() {
        return this.f53460d;
    }

    public final int k() {
        return this.f53461e;
    }

    public final int l() {
        return this.f53462f;
    }

    @m80.l
    public final g8.b m() {
        return this.f53463g;
    }

    @m80.l
    public final g8.b n() {
        return this.f53464h;
    }

    @m80.l
    public final String o() {
        return this.f53465i;
    }

    @m80.k
    public final z p(int i11, @m80.k String img, long j11, long j12, int i12, int i13, @m80.l g8.b bVar, @m80.l g8.b bVar2, @m80.l String str, @m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.l f8.b bVar3, @m80.l Integer num4, @m80.l Integer num5) {
        g0.p(img, "img");
        return new z(i11, img, j11, j12, i12, i13, bVar, bVar2, str, num, num2, num3, bVar3, num4, num5);
    }

    @m80.k
    public String toString() {
        return "StartupAd(ad_id=" + this.f53457a + ", img=" + this.f53458b + ", start_time=" + this.f53459c + ", end_time=" + this.f53460d + ", show_times=" + this.f53461e + ", show_seconds=" + this.f53462f + ", link=" + this.f53463g + ", backup_link=" + this.f53464h + ", ext_ad_id=" + this.f53465i + ", ad_type=" + this.f53466j + ", full=" + this.f53467k + ", res_type=" + this.f53468l + ", ad_resp=" + this.f53469m + ", cached=" + this.f53470n + ", btn_light=" + this.f53471o + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53456q.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nStartupAd.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupAd.kt\ncom/baicizhan/biz/online/advertise_api/StartupAd$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,498:1\n1#2:499\n*E\n"})
    public static final class a implements ts.f<z> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f53472a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f53473b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Long f53474c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f53475d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f53476e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f53477f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public g8.b f53478g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public g8.b f53479h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f53480i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Integer f53481j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public Integer f53482k;

        /* renamed from: l, reason: collision with root package name */
        @m80.l
        public Integer f53483l;

        /* renamed from: m, reason: collision with root package name */
        @m80.l
        public f8.b f53484m;

        /* renamed from: n, reason: collision with root package name */
        @m80.l
        public Integer f53485n;

        /* renamed from: o, reason: collision with root package name */
        @m80.l
        public Integer f53486o;

        public a() {
            this.f53472a = null;
            this.f53473b = null;
            this.f53474c = null;
            this.f53475d = null;
            this.f53476e = null;
            this.f53477f = null;
            this.f53478g = null;
            this.f53479h = null;
            this.f53480i = null;
            this.f53481j = null;
            this.f53482k = null;
            this.f53483l = null;
            this.f53484m = null;
            this.f53485n = null;
            this.f53486o = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f53472a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a b(@m80.l f8.b bVar) {
            this.f53484m = bVar;
            return this;
        }

        @m80.k
        public final a c(@m80.l Integer num) {
            this.f53481j = num;
            return this;
        }

        @m80.k
        public final a d(@m80.l g8.b bVar) {
            this.f53479h = bVar;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f53486o = num;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public z build() {
            Integer num = this.f53472a;
            if (num == null) {
                throw new IllegalStateException("Required field 'ad_id' is missing");
            }
            int intValue = num.intValue();
            String str = this.f53473b;
            if (str == null) {
                throw new IllegalStateException("Required field 'img' is missing");
            }
            Long l11 = this.f53474c;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'start_time' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f53475d;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'end_time' is missing");
            }
            long longValue2 = l12.longValue();
            Integer num2 = this.f53476e;
            if (num2 == null) {
                throw new IllegalStateException("Required field 'show_times' is missing");
            }
            int intValue2 = num2.intValue();
            Integer num3 = this.f53477f;
            if (num3 != null) {
                return new z(intValue, str, longValue, longValue2, intValue2, num3.intValue(), this.f53478g, this.f53479h, this.f53480i, this.f53481j, this.f53482k, this.f53483l, this.f53484m, this.f53485n, this.f53486o);
            }
            throw new IllegalStateException("Required field 'show_seconds' is missing");
        }

        @m80.k
        public final a g(@m80.l Integer num) {
            this.f53485n = num;
            return this;
        }

        @m80.k
        public final a h(long j11) {
            this.f53475d = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a i(@m80.l String str) {
            this.f53480i = str;
            return this;
        }

        @m80.k
        public final a j(@m80.l Integer num) {
            this.f53482k = num;
            return this;
        }

        @m80.k
        public final a k(@m80.k String img) {
            g0.p(img, "img");
            this.f53473b = img;
            return this;
        }

        @m80.k
        public final a l(@m80.l g8.b bVar) {
            this.f53478g = bVar;
            return this;
        }

        @m80.k
        public final a m(@m80.l Integer num) {
            this.f53483l = num;
            return this;
        }

        @m80.k
        public final a n(int i11) {
            this.f53477f = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a o(int i11) {
            this.f53476e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a p(long j11) {
            this.f53474c = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53472a = null;
            this.f53473b = null;
            this.f53474c = null;
            this.f53475d = null;
            this.f53476e = null;
            this.f53477f = null;
            this.f53478g = null;
            this.f53479h = null;
            this.f53480i = null;
            this.f53481j = null;
            this.f53482k = null;
            this.f53483l = null;
            this.f53484m = null;
            this.f53485n = null;
            this.f53486o = null;
        }

        public a(@m80.k z source) {
            g0.p(source, "source");
            this.f53472a = Integer.valueOf(source.f53457a);
            this.f53473b = source.f53458b;
            this.f53474c = Long.valueOf(source.f53459c);
            this.f53475d = Long.valueOf(source.f53460d);
            this.f53476e = Integer.valueOf(source.f53461e);
            this.f53477f = Integer.valueOf(source.f53462f);
            this.f53478g = source.f53463g;
            this.f53479h = source.f53464h;
            this.f53480i = source.f53465i;
            this.f53481j = source.f53466j;
            this.f53482k = source.f53467k;
            this.f53483l = source.f53468l;
            this.f53484m = source.f53469m;
            this.f53485n = source.f53470n;
            this.f53486o = source.f53471o;
        }
    }
}
