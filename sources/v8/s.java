package v8;

import com.tencent.open.SocialOperation;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class s implements ts.e {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public static final b f93423k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<s, a> f93424l = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93425a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93426b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93427c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93428d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93429e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93430f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93431g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93432h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93433i;

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93434j;

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
                            builder.j(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(protocol.readString());
                            break;
                        }
                    case 10:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
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
            protocol.g6("ThirdPartyUserInfo");
            if (struct.f93425a != null) {
                protocol.Q6("uid", 1, (byte) 11);
                protocol.p1(struct.f93425a);
                protocol.N2();
            }
            protocol.Q6("nickname", 2, (byte) 11);
            protocol.p1(struct.f93426b);
            protocol.N2();
            if (struct.f93427c != null) {
                protocol.Q6("atoken", 3, (byte) 11);
                protocol.p1(struct.f93427c);
                protocol.N2();
            }
            if (struct.f93428d != null) {
                protocol.Q6("asecret", 4, (byte) 11);
                protocol.p1(struct.f93428d);
                protocol.N2();
            }
            if (struct.f93429e != null) {
                protocol.Q6("expires_at", 5, (byte) 11);
                protocol.p1(struct.f93429e);
                protocol.N2();
            }
            if (struct.f93430f != null) {
                protocol.Q6("gender", 6, (byte) 11);
                protocol.p1(struct.f93430f);
                protocol.N2();
            }
            if (struct.f93431g != null) {
                protocol.Q6("image_url", 7, (byte) 11);
                protocol.p1(struct.f93431g);
                protocol.N2();
            }
            if (struct.f93432h != null) {
                protocol.Q6("openid", 8, (byte) 11);
                protocol.p1(struct.f93432h);
                protocol.N2();
            }
            if (struct.f93433i != null) {
                protocol.Q6(SocialOperation.GAME_UNION_ID, 9, (byte) 11);
                protocol.p1(struct.f93433i);
                protocol.N2();
            }
            protocol.Q6(ma.b.f72911h1, 10, (byte) 11);
            protocol.p1(struct.f93434j);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public s(@m80.l String str, @m80.k String nickname, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l String str6, @m80.l String str7, @m80.l String str8, @m80.k String provider) {
        g0.p(nickname, "nickname");
        g0.p(provider, "provider");
        this.f93425a = str;
        this.f93426b = nickname;
        this.f93427c = str2;
        this.f93428d = str3;
        this.f93429e = str4;
        this.f93430f = str5;
        this.f93431g = str6;
        this.f93432h = str7;
        this.f93433i = str8;
        this.f93434j = provider;
    }

    public static /* synthetic */ s l(s sVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sVar.f93425a;
        }
        if ((i11 & 2) != 0) {
            str2 = sVar.f93426b;
        }
        if ((i11 & 4) != 0) {
            str3 = sVar.f93427c;
        }
        if ((i11 & 8) != 0) {
            str4 = sVar.f93428d;
        }
        if ((i11 & 16) != 0) {
            str5 = sVar.f93429e;
        }
        if ((i11 & 32) != 0) {
            str6 = sVar.f93430f;
        }
        if ((i11 & 64) != 0) {
            str7 = sVar.f93431g;
        }
        if ((i11 & 128) != 0) {
            str8 = sVar.f93432h;
        }
        if ((i11 & 256) != 0) {
            str9 = sVar.f93433i;
        }
        if ((i11 & 512) != 0) {
            str10 = sVar.f93434j;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        return sVar.k(str, str2, str3, str4, str15, str16, str13, str14, str11, str12);
    }

    @m80.l
    public final String a() {
        return this.f93425a;
    }

    @m80.k
    public final String b() {
        return this.f93434j;
    }

    @m80.k
    public final String c() {
        return this.f93426b;
    }

    @m80.l
    public final String d() {
        return this.f93427c;
    }

    @m80.l
    public final String e() {
        return this.f93428d;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return g0.g(this.f93425a, sVar.f93425a) && g0.g(this.f93426b, sVar.f93426b) && g0.g(this.f93427c, sVar.f93427c) && g0.g(this.f93428d, sVar.f93428d) && g0.g(this.f93429e, sVar.f93429e) && g0.g(this.f93430f, sVar.f93430f) && g0.g(this.f93431g, sVar.f93431g) && g0.g(this.f93432h, sVar.f93432h) && g0.g(this.f93433i, sVar.f93433i) && g0.g(this.f93434j, sVar.f93434j);
    }

    @m80.l
    public final String f() {
        return this.f93429e;
    }

    @m80.l
    public final String g() {
        return this.f93430f;
    }

    @m80.l
    public final String h() {
        return this.f93431g;
    }

    public int hashCode() {
        String str = this.f93425a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f93426b.hashCode()) * 31;
        String str2 = this.f93427c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f93428d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f93429e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f93430f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f93431g;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f93432h;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f93433i;
        return ((hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.f93434j.hashCode();
    }

    @m80.l
    public final String i() {
        return this.f93432h;
    }

    @m80.l
    public final String j() {
        return this.f93433i;
    }

    @m80.k
    public final s k(@m80.l String str, @m80.k String nickname, @m80.l String str2, @m80.l String str3, @m80.l String str4, @m80.l String str5, @m80.l String str6, @m80.l String str7, @m80.l String str8, @m80.k String provider) {
        g0.p(nickname, "nickname");
        g0.p(provider, "provider");
        return new s(str, nickname, str2, str3, str4, str5, str6, str7, str8, provider);
    }

    @m80.k
    public String toString() {
        return "ThirdPartyUserInfo(uid=" + this.f93425a + ", nickname=" + this.f93426b + ", atoken=" + this.f93427c + ", asecret=" + this.f93428d + ", expires_at=" + this.f93429e + ", gender=" + this.f93430f + ", image_url=" + this.f93431g + ", openid=" + this.f93432h + ", unionid=" + this.f93433i + ", provider=" + this.f93434j + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93424l.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThirdPartyUserInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThirdPartyUserInfo.kt\ncom/baicizhan/biz/online/unified_user_service/ThirdPartyUserInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,356:1\n1#2:357\n*E\n"})
    public static final class a implements ts.f<s> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93435a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f93436b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93437c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f93438d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f93439e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f93440f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f93441g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f93442h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f93443i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public String f93444j;

        public a() {
            this.f93435a = null;
            this.f93436b = null;
            this.f93437c = null;
            this.f93438d = null;
            this.f93439e = null;
            this.f93440f = null;
            this.f93441g = null;
            this.f93442h = null;
            this.f93443i = null;
            this.f93444j = null;
        }

        @m80.k
        public final a a(@m80.l String str) {
            this.f93438d = str;
            return this;
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f93437c = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public s build() {
            String str = this.f93435a;
            String str2 = this.f93436b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'nickname' is missing");
            }
            String str3 = this.f93437c;
            String str4 = this.f93438d;
            String str5 = this.f93439e;
            String str6 = this.f93440f;
            String str7 = this.f93441g;
            String str8 = this.f93442h;
            String str9 = this.f93443i;
            String str10 = this.f93444j;
            if (str10 != null) {
                return new s(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
            }
            throw new IllegalStateException("Required field 'provider' is missing");
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f93439e = str;
            return this;
        }

        @m80.k
        public final a e(@m80.l String str) {
            this.f93440f = str;
            return this;
        }

        @m80.k
        public final a f(@m80.l String str) {
            this.f93441g = str;
            return this;
        }

        @m80.k
        public final a g(@m80.k String nickname) {
            g0.p(nickname, "nickname");
            this.f93436b = nickname;
            return this;
        }

        @m80.k
        public final a h(@m80.l String str) {
            this.f93442h = str;
            return this;
        }

        @m80.k
        public final a i(@m80.k String provider) {
            g0.p(provider, "provider");
            this.f93444j = provider;
            return this;
        }

        @m80.k
        public final a j(@m80.l String str) {
            this.f93435a = str;
            return this;
        }

        @m80.k
        public final a k(@m80.l String str) {
            this.f93443i = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93435a = null;
            this.f93436b = null;
            this.f93437c = null;
            this.f93438d = null;
            this.f93439e = null;
            this.f93440f = null;
            this.f93441g = null;
            this.f93442h = null;
            this.f93443i = null;
            this.f93444j = null;
        }

        public a(@m80.k s source) {
            g0.p(source, "source");
            this.f93435a = source.f93425a;
            this.f93436b = source.f93426b;
            this.f93437c = source.f93427c;
            this.f93438d = source.f93428d;
            this.f93439e = source.f93429e;
            this.f93440f = source.f93430f;
            this.f93441g = source.f93431g;
            this.f93442h = source.f93432h;
            this.f93443i = source.f93433i;
            this.f93444j = source.f93434j;
        }
    }
}
