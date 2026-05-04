package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class y implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final b f53441g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<y, a> f53442h = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53443a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53444b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53445c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    public final long f53446d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    public final long f53447e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final boolean f53448f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<y, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.f(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.T1());
                            break;
                        }
                    case 5:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.T1());
                            break;
                        }
                    case 6:
                        if (b11 != 2) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readBool());
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
        public void write(@m80.k ws.i protocol, @m80.k y struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ShoppingImgInfo");
            protocol.Q6(md.j.f73126f, 1, (byte) 11);
            protocol.p1(struct.f53443a);
            protocol.N2();
            protocol.Q6("icon_default", 2, (byte) 11);
            protocol.p1(struct.f53444b);
            protocol.N2();
            protocol.Q6("icon_press", 3, (byte) 11);
            protocol.p1(struct.f53445c);
            protocol.N2();
            protocol.Q6("start_time", 4, (byte) 10);
            protocol.q7(struct.f53446d);
            protocol.N2();
            protocol.Q6("end_time", 5, (byte) 10);
            protocol.q7(struct.f53447e);
            protocol.N2();
            protocol.Q6("isTaobao", 6, (byte) 2);
            protocol.a4(struct.f53448f);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public y(@m80.k String jump_url, @m80.k String icon_default, @m80.k String icon_press, long j11, long j12, boolean z11) {
        g0.p(jump_url, "jump_url");
        g0.p(icon_default, "icon_default");
        g0.p(icon_press, "icon_press");
        this.f53443a = jump_url;
        this.f53444b = icon_default;
        this.f53445c = icon_press;
        this.f53446d = j11;
        this.f53447e = j12;
        this.f53448f = z11;
    }

    public static /* synthetic */ y h(y yVar, String str, String str2, String str3, long j11, long j12, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = yVar.f53443a;
        }
        if ((i11 & 2) != 0) {
            str2 = yVar.f53444b;
        }
        if ((i11 & 4) != 0) {
            str3 = yVar.f53445c;
        }
        if ((i11 & 8) != 0) {
            j11 = yVar.f53446d;
        }
        if ((i11 & 16) != 0) {
            j12 = yVar.f53447e;
        }
        if ((i11 & 32) != 0) {
            z11 = yVar.f53448f;
        }
        boolean z12 = z11;
        long j13 = j12;
        String str4 = str3;
        return yVar.g(str, str2, str4, j11, j13, z12);
    }

    @m80.k
    public final String a() {
        return this.f53443a;
    }

    @m80.k
    public final String b() {
        return this.f53444b;
    }

    @m80.k
    public final String c() {
        return this.f53445c;
    }

    public final long d() {
        return this.f53446d;
    }

    public final long e() {
        return this.f53447e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return g0.g(this.f53443a, yVar.f53443a) && g0.g(this.f53444b, yVar.f53444b) && g0.g(this.f53445c, yVar.f53445c) && this.f53446d == yVar.f53446d && this.f53447e == yVar.f53447e && this.f53448f == yVar.f53448f;
    }

    public final boolean f() {
        return this.f53448f;
    }

    @m80.k
    public final y g(@m80.k String jump_url, @m80.k String icon_default, @m80.k String icon_press, long j11, long j12, boolean z11) {
        g0.p(jump_url, "jump_url");
        g0.p(icon_default, "icon_default");
        g0.p(icon_press, "icon_press");
        return new y(jump_url, icon_default, icon_press, j11, j12, z11);
    }

    public int hashCode() {
        return (((((((((this.f53443a.hashCode() * 31) + this.f53444b.hashCode()) * 31) + this.f53445c.hashCode()) * 31) + Long.hashCode(this.f53446d)) * 31) + Long.hashCode(this.f53447e)) * 31) + Boolean.hashCode(this.f53448f);
    }

    @m80.k
    public String toString() {
        return "ShoppingImgInfo(jump_url=" + this.f53443a + ", icon_default=" + this.f53444b + ", icon_press=" + this.f53445c + ", start_time=" + this.f53446d + ", end_time=" + this.f53447e + ", isTaobao=" + this.f53448f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53442h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nShoppingImgInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingImgInfo.kt\ncom/baicizhan/biz/online/advertise_api/ShoppingImgInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,239:1\n1#2:240\n*E\n"})
    public static final class a implements ts.f<y> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f53449a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f53450b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53451c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public Long f53452d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public Long f53453e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Boolean f53454f;

        public a() {
            this.f53449a = null;
            this.f53450b = null;
            this.f53451c = null;
            this.f53452d = null;
            this.f53453e = null;
            this.f53454f = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y build() {
            String str = this.f53449a;
            if (str == null) {
                throw new IllegalStateException("Required field 'jump_url' is missing");
            }
            String str2 = this.f53450b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'icon_default' is missing");
            }
            String str3 = this.f53451c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'icon_press' is missing");
            }
            Long l11 = this.f53452d;
            if (l11 == null) {
                throw new IllegalStateException("Required field 'start_time' is missing");
            }
            long longValue = l11.longValue();
            Long l12 = this.f53453e;
            if (l12 == null) {
                throw new IllegalStateException("Required field 'end_time' is missing");
            }
            long longValue2 = l12.longValue();
            Boolean bool = this.f53454f;
            if (bool != null) {
                return new y(str, str2, str3, longValue, longValue2, bool.booleanValue());
            }
            throw new IllegalStateException("Required field 'isTaobao' is missing");
        }

        @m80.k
        public final a b(long j11) {
            this.f53453e = Long.valueOf(j11);
            return this;
        }

        @m80.k
        public final a c(@m80.k String icon_default) {
            g0.p(icon_default, "icon_default");
            this.f53450b = icon_default;
            return this;
        }

        @m80.k
        public final a d(@m80.k String icon_press) {
            g0.p(icon_press, "icon_press");
            this.f53451c = icon_press;
            return this;
        }

        @m80.k
        public final a e(boolean z11) {
            this.f53454f = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final a f(@m80.k String jump_url) {
            g0.p(jump_url, "jump_url");
            this.f53449a = jump_url;
            return this;
        }

        @m80.k
        public final a g(long j11) {
            this.f53452d = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53449a = null;
            this.f53450b = null;
            this.f53451c = null;
            this.f53452d = null;
            this.f53453e = null;
            this.f53454f = null;
        }

        public a(@m80.k y source) {
            g0.p(source, "source");
            this.f53449a = source.f53443a;
            this.f53450b = source.f53444b;
            this.f53451c = source.f53445c;
            this.f53452d = Long.valueOf(source.f53446d);
            this.f53453e = Long.valueOf(source.f53447e);
            this.f53454f = Boolean.valueOf(source.f53448f);
        }
    }
}
