package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class s implements ts.e {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final b f53367j = new b(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<s, a> f53368k = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53369a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final boolean f53370b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53371c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53372d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final int f53373e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final long f53374f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final long f53375g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53376h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53377i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<s, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.d(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readBool());
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.T1());
                            break;
                        }
                    case 7:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.T1());
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k s struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("MainViewTopBannerAdv");
            protocol.Q6("id", 1, (byte) 11);
            protocol.p1(struct.f53369a);
            protocol.N2();
            protocol.Q6("isDark", 2, (byte) 2);
            protocol.a4(struct.f53370b);
            protocol.N2();
            protocol.Q6(com.baicizhan.main.activity.schedule_v2.e.f19255e, 3, (byte) 11);
            protocol.p1(struct.f53371c);
            protocol.N2();
            protocol.Q6("img_gradient_color", 4, (byte) 11);
            protocol.p1(struct.f53372d);
            protocol.N2();
            protocol.Q6("img_type", 5, (byte) 8);
            protocol.l5(struct.f53373e);
            protocol.N2();
            protocol.Q6("start_time", 6, (byte) 10);
            protocol.q7(struct.f53374f);
            protocol.N2();
            protocol.Q6("end_time", 7, (byte) 10);
            protocol.q7(struct.f53375g);
            protocol.N2();
            if (struct.f53376h != null) {
                protocol.Q6(y9.b.f99687c, 8, (byte) 11);
                protocol.p1(struct.f53376h);
                protocol.N2();
            }
            if (struct.f53377i != null) {
                protocol.Q6("aid", 9, (byte) 11);
                protocol.p1(struct.f53377i);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public s(@m80.k String id2, boolean z11, @m80.k String img_url, @m80.k String img_gradient_color, int i11, long j11, long j12, @m80.l String str, @m80.l String str2) {
        g0.p(id2, "id");
        g0.p(img_url, "img_url");
        g0.p(img_gradient_color, "img_gradient_color");
        this.f53369a = id2;
        this.f53370b = z11;
        this.f53371c = img_url;
        this.f53372d = img_gradient_color;
        this.f53373e = i11;
        this.f53374f = j11;
        this.f53375g = j12;
        this.f53376h = str;
        this.f53377i = str2;
    }

    public static /* synthetic */ s k(s sVar, String str, boolean z11, String str2, String str3, int i11, long j11, long j12, String str4, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = sVar.f53369a;
        }
        if ((i12 & 2) != 0) {
            z11 = sVar.f53370b;
        }
        if ((i12 & 4) != 0) {
            str2 = sVar.f53371c;
        }
        if ((i12 & 8) != 0) {
            str3 = sVar.f53372d;
        }
        if ((i12 & 16) != 0) {
            i11 = sVar.f53373e;
        }
        if ((i12 & 32) != 0) {
            j11 = sVar.f53374f;
        }
        if ((i12 & 64) != 0) {
            j12 = sVar.f53375g;
        }
        if ((i12 & 128) != 0) {
            str4 = sVar.f53376h;
        }
        if ((i12 & 256) != 0) {
            str5 = sVar.f53377i;
        }
        long j13 = j12;
        long j14 = j11;
        String str6 = str3;
        int i13 = i11;
        String str7 = str2;
        return sVar.j(str, z11, str7, str6, i13, j14, j13, str4, str5);
    }

    @m80.k
    public final String a() {
        return this.f53369a;
    }

    public final boolean b() {
        return this.f53370b;
    }

    @m80.k
    public final String c() {
        return this.f53371c;
    }

    @m80.k
    public final String d() {
        return this.f53372d;
    }

    public final int e() {
        return this.f53373e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return g0.g(this.f53369a, sVar.f53369a) && this.f53370b == sVar.f53370b && g0.g(this.f53371c, sVar.f53371c) && g0.g(this.f53372d, sVar.f53372d) && this.f53373e == sVar.f53373e && this.f53374f == sVar.f53374f && this.f53375g == sVar.f53375g && g0.g(this.f53376h, sVar.f53376h) && g0.g(this.f53377i, sVar.f53377i);
    }

    public final long f() {
        return this.f53374f;
    }

    public final long g() {
        return this.f53375g;
    }

    @m80.l
    public final String h() {
        return this.f53376h;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f53369a.hashCode() * 31) + Boolean.hashCode(this.f53370b)) * 31) + this.f53371c.hashCode()) * 31) + this.f53372d.hashCode()) * 31) + Integer.hashCode(this.f53373e)) * 31) + Long.hashCode(this.f53374f)) * 31) + Long.hashCode(this.f53375g)) * 31;
        String str = this.f53376h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53377i;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f53377i;
    }

    @m80.k
    public final s j(@m80.k String id2, boolean z11, @m80.k String img_url, @m80.k String img_gradient_color, int i11, long j11, long j12, @m80.l String str, @m80.l String str2) {
        g0.p(id2, "id");
        g0.p(img_url, "img_url");
        g0.p(img_gradient_color, "img_gradient_color");
        return new s(id2, z11, img_url, img_gradient_color, i11, j11, j12, str, str2);
    }

    @m80.k
    public String toString() {
        return "MainViewTopBannerAdv(id=" + this.f53369a + ", isDark=" + this.f53370b + ", img_url=" + this.f53371c + ", img_gradient_color=" + this.f53372d + ", img_type=" + this.f53373e + ", start_time=" + this.f53374f + ", end_time=" + this.f53375g + ", link=" + this.f53376h + ", aid=" + this.f53377i + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53368k.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMainViewTopBannerAdv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewTopBannerAdv.kt\ncom/baicizhan/biz/online/advertise_api/MainViewTopBannerAdv$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,307:1\n1#2:308\n*E\n"})
    public static final class a implements ts.f<s> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f53378a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Boolean f53379b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53380c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f53381d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Integer f53382e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f53383f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Long f53384g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f53385h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f53386i;

        public a() {
            this.f53378a = null;
            this.f53379b = null;
            this.f53380c = null;
            this.f53381d = null;
            this.f53382e = null;
            this.f53383f = null;
            this.f53384g = null;
            this.f53385h = null;
            this.f53386i = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f53386i = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s build() {
            String str = this.f53378a;
            if (str == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            Boolean bool = this.f53379b;
            if (bool == null) {
                throw new IllegalStateException("Required field 'isDark' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            String str2 = this.f53380c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'img_url' is missing");
            }
            String str3 = this.f53381d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'img_gradient_color' is missing");
            }
            Integer num = this.f53382e;
            if (num == null) {
                throw new IllegalStateException("Required field 'img_type' is missing");
            }
            int intValue = num.intValue();
            Long l11 = this.f53383f;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'start_time' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f53384g;
            if (l12 != null) {
                return new s(str, booleanValue, str2, str3, intValue, longValue, l12.longValue(), this.f53385h, this.f53386i);
            }
            throw new IllegalStateException("Required field 'end_time' is missing");
        }

        @m80.k
        public final a c(long j11) {
            this.f53384g = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a d(@m80.k String id2) {
            g0.p(id2, "id");
            this.f53378a = id2;
            return this;
        }

        @m80.k
        public final a e(@m80.k String img_gradient_color) {
            g0.p(img_gradient_color, "img_gradient_color");
            this.f53381d = img_gradient_color;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f53382e = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(@m80.k String img_url) {
            g0.p(img_url, "img_url");
            this.f53380c = img_url;
            return this;
        }

        @m80.k
        public final a h(boolean z11) {
            this.f53379b = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a i(@m80.l String str) {
            this.f53385h = str;
            return this;
        }

        @m80.k
        public final a j(long j11) {
            this.f53383f = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53378a = null;
            this.f53379b = null;
            this.f53380c = null;
            this.f53381d = null;
            this.f53382e = null;
            this.f53383f = null;
            this.f53384g = null;
            this.f53385h = null;
            this.f53386i = null;
        }

        public a(@m80.k s source) {
            g0.p(source, "source");
            this.f53378a = source.f53369a;
            this.f53379b = Boolean.valueOf(source.f53370b);
            this.f53380c = source.f53371c;
            this.f53381d = source.f53372d;
            this.f53382e = Integer.valueOf(source.f53373e);
            this.f53383f = Long.valueOf(source.f53374f);
            this.f53384g = Long.valueOf(source.f53375g);
            this.f53385h = source.f53376h;
            this.f53386i = source.f53377i;
        }
    }
}
