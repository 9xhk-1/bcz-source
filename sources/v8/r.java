package v8;

import com.tencent.open.SocialOperation;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class r implements ts.e {

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final b f93399l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<r, a> f93400m = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93401a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93402b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93403c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93404d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93405e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93406f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93407g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93408h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93409i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93410j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93411k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<r, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.i(protocol.readString());
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
                            builder.f(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(protocol.readString());
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 11:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k r struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ThirdPartyLoginRequest");
            protocol.Q6(ma.b.f72911h1, 1, (byte) 11);
            protocol.p1(struct.f93401a);
            protocol.N2();
            if (struct.f93402b != null) {
                protocol.Q6("uid", 2, (byte) 11);
                protocol.p1(struct.f93402b);
                protocol.N2();
            }
            protocol.Q6("nickname", 3, (byte) 11);
            protocol.p1(struct.f93403c);
            protocol.N2();
            protocol.Q6("image_url", 4, (byte) 11);
            protocol.p1(struct.f93404d);
            protocol.N2();
            protocol.Q6("gender", 5, (byte) 11);
            protocol.p1(struct.f93405e);
            protocol.N2();
            if (struct.f93406f != null) {
                protocol.Q6("api_token", 6, (byte) 11);
                protocol.p1(struct.f93406f);
                protocol.N2();
            }
            if (struct.f93407g != null) {
                protocol.Q6("token_expire", 7, (byte) 11);
                protocol.p1(struct.f93407g);
                protocol.N2();
            }
            if (struct.f93408h != null) {
                protocol.Q6("device", 8, (byte) 11);
                protocol.p1(struct.f93408h);
                protocol.N2();
            }
            if (struct.f93409i != null) {
                protocol.Q6(SocialOperation.GAME_UNION_ID, 9, (byte) 11);
                protocol.p1(struct.f93409i);
                protocol.N2();
            }
            if (struct.f93410j != null) {
                protocol.Q6("openid", 10, (byte) 11);
                protocol.p1(struct.f93410j);
                protocol.N2();
            }
            if (struct.f93411k != null) {
                protocol.Q6("code", 11, (byte) 11);
                protocol.p1(struct.f93411k);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public r(@m80.k String provider, @m80.l String str, @m80.k String nickname, @m80.k String image_url, @m80.k String gender, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l String str6, @m80.l String str7) {
        g0.p(provider, "provider");
        g0.p(nickname, "nickname");
        g0.p(image_url, "image_url");
        g0.p(gender, "gender");
        this.f93401a = provider;
        this.f93402b = str;
        this.f93403c = nickname;
        this.f93404d = image_url;
        this.f93405e = gender;
        this.f93406f = str2;
        this.f93407g = str3;
        this.f93408h = str4;
        this.f93409i = str5;
        this.f93410j = str6;
        this.f93411k = str7;
    }

    public static /* synthetic */ r m(r rVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rVar.f93401a;
        }
        if ((i11 & 2) != 0) {
            str2 = rVar.f93402b;
        }
        if ((i11 & 4) != 0) {
            str3 = rVar.f93403c;
        }
        if ((i11 & 8) != 0) {
            str4 = rVar.f93404d;
        }
        if ((i11 & 16) != 0) {
            str5 = rVar.f93405e;
        }
        if ((i11 & 32) != 0) {
            str6 = rVar.f93406f;
        }
        if ((i11 & 64) != 0) {
            str7 = rVar.f93407g;
        }
        if ((i11 & 128) != 0) {
            str8 = rVar.f93408h;
        }
        if ((i11 & 256) != 0) {
            str9 = rVar.f93409i;
        }
        if ((i11 & 512) != 0) {
            str10 = rVar.f93410j;
        }
        if ((i11 & 1024) != 0) {
            str11 = rVar.f93411k;
        }
        String str12 = str10;
        String str13 = str11;
        String str14 = str8;
        String str15 = str9;
        String str16 = str6;
        String str17 = str7;
        String str18 = str5;
        String str19 = str3;
        return rVar.l(str, str2, str19, str4, str18, str16, str17, str14, str15, str12, str13);
    }

    @m80.k
    public final String a() {
        return this.f93401a;
    }

    @m80.l
    public final String b() {
        return this.f93410j;
    }

    @m80.l
    public final String c() {
        return this.f93411k;
    }

    @m80.l
    public final String d() {
        return this.f93402b;
    }

    @m80.k
    public final String e() {
        return this.f93403c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return g0.g(this.f93401a, rVar.f93401a) && g0.g(this.f93402b, rVar.f93402b) && g0.g(this.f93403c, rVar.f93403c) && g0.g(this.f93404d, rVar.f93404d) && g0.g(this.f93405e, rVar.f93405e) && g0.g(this.f93406f, rVar.f93406f) && g0.g(this.f93407g, rVar.f93407g) && g0.g(this.f93408h, rVar.f93408h) && g0.g(this.f93409i, rVar.f93409i) && g0.g(this.f93410j, rVar.f93410j) && g0.g(this.f93411k, rVar.f93411k);
    }

    @m80.k
    public final String f() {
        return this.f93404d;
    }

    @m80.k
    public final String g() {
        return this.f93405e;
    }

    @m80.l
    public final String h() {
        return this.f93406f;
    }

    public int hashCode() {
        int hashCode = this.f93401a.hashCode() * 31;
        String str = this.f93402b;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f93403c.hashCode()) * 31) + this.f93404d.hashCode()) * 31) + this.f93405e.hashCode()) * 31;
        String str2 = this.f93406f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f93407g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f93408h;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f93409i;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f93410j;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f93411k;
        return hashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f93407g;
    }

    @m80.l
    public final String j() {
        return this.f93408h;
    }

    @m80.l
    public final String k() {
        return this.f93409i;
    }

    @m80.k
    public final r l(@m80.k String provider, @m80.l String str, @m80.k String nickname, @m80.k String image_url, @m80.k String gender, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l String str6, @m80.l String str7) {
        g0.p(provider, "provider");
        g0.p(nickname, "nickname");
        g0.p(image_url, "image_url");
        g0.p(gender, "gender");
        return new r(provider, str, nickname, image_url, gender, str2, str3, str4, str5, str6, str7);
    }

    @m80.k
    public String toString() {
        return "ThirdPartyLoginRequest(provider=" + this.f93401a + ", uid=" + this.f93402b + ", nickname=" + this.f93403c + ", image_url=" + this.f93404d + ", gender=" + this.f93405e + ", api_token=" + this.f93406f + ", token_expire=" + this.f93407g + ", device=" + this.f93408h + ", unionid=" + this.f93409i + ", openid=" + this.f93410j + ", code=" + this.f93411k + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93400m.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThirdPartyLoginRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyLoginRequest.kt\ncom/baicizhan/biz/online/unified_user_service/ThirdPartyLoginRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,377:1\n1#2:378\n*E\n"})
    public static final class a implements ts.f<r> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93412a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f93413b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93414c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f93415d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f93416e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f93417f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f93418g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f93419h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f93420i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public String f93421j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public String f93422k;

        public a() {
            this.f93412a = null;
            this.f93413b = null;
            this.f93414c = null;
            this.f93415d = null;
            this.f93416e = null;
            this.f93417f = null;
            this.f93418g = null;
            this.f93419h = null;
            this.f93420i = null;
            this.f93421j = null;
            this.f93422k = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f93417f = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r build() {
            String str = this.f93412a;
            if (str == null) {
                throw new IllegalStateException("Required field 'provider' is missing");
            }
            String str2 = this.f93413b;
            String str3 = this.f93414c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'nickname' is missing");
            }
            String str4 = this.f93415d;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'image_url' is missing");
            }
            String str5 = this.f93416e;
            if (str5 != null) {
                return new r(str, str2, str3, str4, str5, this.f93417f, this.f93418g, this.f93419h, this.f93420i, this.f93421j, this.f93422k);
            }
            throw new IllegalStateException("Required field 'gender' is missing");
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f93422k = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f93419h = str;
            return this;
        }

        @m80.k
        public final a e(@m80.k String gender) {
            g0.p(gender, "gender");
            this.f93416e = gender;
            return this;
        }

        @m80.k
        public final a f(@m80.k String image_url) {
            g0.p(image_url, "image_url");
            this.f93415d = image_url;
            return this;
        }

        @m80.k
        public final a g(@m80.k String nickname) {
            g0.p(nickname, "nickname");
            this.f93414c = nickname;
            return this;
        }

        @m80.k
        public final a h(@m80.l String str) {
            this.f93421j = str;
            return this;
        }

        @m80.k
        public final a i(@m80.k String provider) {
            g0.p(provider, "provider");
            this.f93412a = provider;
            return this;
        }

        @m80.k
        public final a j(@m80.l String str) {
            this.f93418g = str;
            return this;
        }

        @m80.k
        public final a k(@m80.l String str) {
            this.f93413b = str;
            return this;
        }

        @m80.k
        public final a l(@m80.l String str) {
            this.f93420i = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93412a = null;
            this.f93413b = null;
            this.f93414c = null;
            this.f93415d = null;
            this.f93416e = null;
            this.f93417f = null;
            this.f93418g = null;
            this.f93419h = null;
            this.f93420i = null;
            this.f93421j = null;
            this.f93422k = null;
        }

        public a(@m80.k r source) {
            g0.p(source, "source");
            this.f93412a = source.f93401a;
            this.f93413b = source.f93402b;
            this.f93414c = source.f93403c;
            this.f93415d = source.f93404d;
            this.f93416e = source.f93405e;
            this.f93417f = source.f93406f;
            this.f93418g = source.f93407g;
            this.f93419h = source.f93408h;
            this.f93420i = source.f93409i;
            this.f93421j = source.f93410j;
            this.f93422k = source.f93411k;
        }
    }
}
