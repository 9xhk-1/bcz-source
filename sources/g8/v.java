package g8;

import com.tencent.open.SocialConstants;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class v implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f53409d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<v, a> f53410e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53411a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53412b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53413c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<v, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public v read(@m80.k ws.i protocol, @m80.k a builder) {
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
                short s11 = a62.f96797c;
                if (s11 != 1) {
                    if (s11 != 2) {
                        if (s11 != 3) {
                            at.b.a(protocol, b11);
                        } else if (b11 == 11) {
                            builder.d(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.b(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k v struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("PracticeBannerAdv");
            protocol.Q6("id", 1, (byte) 11);
            protocol.p1(struct.f53411a);
            protocol.N2();
            protocol.Q6(SocialConstants.PARAM_IMG_URL, 2, (byte) 11);
            protocol.p1(struct.f53412b);
            protocol.N2();
            protocol.Q6(y9.b.f99687c, 3, (byte) 11);
            protocol.p1(struct.f53413c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public v(@m80.k String id2, @m80.k String img, @m80.k String link) {
        g0.p(id2, "id");
        g0.p(img, "img");
        g0.p(link, "link");
        this.f53411a = id2;
        this.f53412b = img;
        this.f53413c = link;
    }

    public static /* synthetic */ v e(v vVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vVar.f53411a;
        }
        if ((i11 & 2) != 0) {
            str2 = vVar.f53412b;
        }
        if ((i11 & 4) != 0) {
            str3 = vVar.f53413c;
        }
        return vVar.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f53411a;
    }

    @m80.k
    public final String b() {
        return this.f53412b;
    }

    @m80.k
    public final String c() {
        return this.f53413c;
    }

    @m80.k
    public final v d(@m80.k String id2, @m80.k String img, @m80.k String link) {
        g0.p(id2, "id");
        g0.p(img, "img");
        g0.p(link, "link");
        return new v(id2, img, link);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return g0.g(this.f53411a, vVar.f53411a) && g0.g(this.f53412b, vVar.f53412b) && g0.g(this.f53413c, vVar.f53413c);
    }

    public int hashCode() {
        return (((this.f53411a.hashCode() * 31) + this.f53412b.hashCode()) * 31) + this.f53413c.hashCode();
    }

    @m80.k
    public String toString() {
        return "PracticeBannerAdv(id=" + this.f53411a + ", img=" + this.f53412b + ", link=" + this.f53413c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53410e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPracticeBannerAdv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PracticeBannerAdv.kt\ncom/baicizhan/biz/online/advertise_api/PracticeBannerAdv$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
    public static final class a implements ts.f<v> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f53414a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f53415b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53416c;

        public a() {
            this.f53414a = null;
            this.f53415b = null;
            this.f53416c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v build() {
            String str = this.f53414a;
            if (str == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            String str2 = this.f53415b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'img' is missing");
            }
            String str3 = this.f53416c;
            if (str3 != null) {
                return new v(str, str2, str3);
            }
            throw new IllegalStateException("Required field 'link' is missing");
        }

        @m80.k
        public final a b(@m80.k String id2) {
            g0.p(id2, "id");
            this.f53414a = id2;
            return this;
        }

        @m80.k
        public final a c(@m80.k String img) {
            g0.p(img, "img");
            this.f53415b = img;
            return this;
        }

        @m80.k
        public final a d(@m80.k String link) {
            g0.p(link, "link");
            this.f53416c = link;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53414a = null;
            this.f53415b = null;
            this.f53416c = null;
        }

        public a(@m80.k v source) {
            g0.p(source, "source");
            this.f53414a = source.f53411a;
            this.f53415b = source.f53412b;
            this.f53416c = source.f53413c;
        }
    }
}
