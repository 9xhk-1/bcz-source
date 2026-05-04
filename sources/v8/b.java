package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final c f93241g = new c(null);

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b, C1256b> f93242h = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93243a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93244b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93245c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93246d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93247e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93248f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<b, C1256b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C1256b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol, @m80.k C1256b builder) {
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
                            builder.g(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
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
                            builder.d(protocol.readString());
                            break;
                        }
                    case 6:
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
        public void write(@m80.k ws.i protocol, @m80.k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AppleLoginRequest");
            protocol.Q6("user", 1, (byte) 11);
            protocol.p1(struct.f93243a);
            protocol.N2();
            protocol.Q6("identityToken", 2, (byte) 11);
            protocol.p1(struct.f93244b);
            protocol.N2();
            protocol.Q6("authorizationCode", 3, (byte) 11);
            protocol.p1(struct.f93245c);
            protocol.N2();
            protocol.Q6("name", 4, (byte) 11);
            protocol.p1(struct.f93246d);
            protocol.N2();
            if (struct.f93247e != null) {
                protocol.Q6("device", 5, (byte) 11);
                protocol.p1(struct.f93247e);
                protocol.N2();
            }
            if (struct.f93248f != null) {
                protocol.Q6("bundleID", 6, (byte) 11);
                protocol.p1(struct.f93248f);
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

    public b(@m80.k String user, @m80.k String identityToken, @m80.k String authorizationCode, @m80.k String name, @m80.l String str, @m80.l String str2) {
        g0.p(user, "user");
        g0.p(identityToken, "identityToken");
        g0.p(authorizationCode, "authorizationCode");
        g0.p(name, "name");
        this.f93243a = user;
        this.f93244b = identityToken;
        this.f93245c = authorizationCode;
        this.f93246d = name;
        this.f93247e = str;
        this.f93248f = str2;
    }

    public static /* synthetic */ b h(b bVar, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bVar.f93243a;
        }
        if ((i11 & 2) != 0) {
            str2 = bVar.f93244b;
        }
        if ((i11 & 4) != 0) {
            str3 = bVar.f93245c;
        }
        if ((i11 & 8) != 0) {
            str4 = bVar.f93246d;
        }
        if ((i11 & 16) != 0) {
            str5 = bVar.f93247e;
        }
        if ((i11 & 32) != 0) {
            str6 = bVar.f93248f;
        }
        String str7 = str5;
        String str8 = str6;
        return bVar.g(str, str2, str3, str4, str7, str8);
    }

    @m80.k
    public final String a() {
        return this.f93243a;
    }

    @m80.k
    public final String b() {
        return this.f93244b;
    }

    @m80.k
    public final String c() {
        return this.f93245c;
    }

    @m80.k
    public final String d() {
        return this.f93246d;
    }

    @m80.l
    public final String e() {
        return this.f93247e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f93243a, bVar.f93243a) && g0.g(this.f93244b, bVar.f93244b) && g0.g(this.f93245c, bVar.f93245c) && g0.g(this.f93246d, bVar.f93246d) && g0.g(this.f93247e, bVar.f93247e) && g0.g(this.f93248f, bVar.f93248f);
    }

    @m80.l
    public final String f() {
        return this.f93248f;
    }

    @m80.k
    public final b g(@m80.k String user, @m80.k String identityToken, @m80.k String authorizationCode, @m80.k String name, @m80.l String str, @m80.l String str2) {
        g0.p(user, "user");
        g0.p(identityToken, "identityToken");
        g0.p(authorizationCode, "authorizationCode");
        g0.p(name, "name");
        return new b(user, identityToken, authorizationCode, name, str, str2);
    }

    public int hashCode() {
        int hashCode = ((((((this.f93243a.hashCode() * 31) + this.f93244b.hashCode()) * 31) + this.f93245c.hashCode()) * 31) + this.f93246d.hashCode()) * 31;
        String str = this.f93247e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f93248f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "AppleLoginRequest(user=" + this.f93243a + ", identityToken=" + this.f93244b + ", authorizationCode=" + this.f93245c + ", name=" + this.f93246d + ", device=" + this.f93247e + ", bundleID=" + this.f93248f + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93242h.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAppleLoginRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppleLoginRequest.kt\ncom/baicizhan/biz/online/unified_user_service/AppleLoginRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,223:1\n1#2:224\n*E\n"})
    /* renamed from: v8.b$b, reason: collision with other inner class name */
    public static final class C1256b implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93249a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f93250b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93251c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f93252d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f93253e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f93254f;

        public C1256b() {
            this.f93249a = null;
            this.f93250b = null;
            this.f93251c = null;
            this.f93252d = null;
            this.f93253e = null;
            this.f93254f = null;
        }

        @m80.k
        public final C1256b a(@m80.k String authorizationCode) {
            g0.p(authorizationCode, "authorizationCode");
            this.f93251c = authorizationCode;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b build() {
            String str = this.f93249a;
            if (str == null) {
                throw new IllegalStateException("Required field 'user' is missing");
            }
            String str2 = this.f93250b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'identityToken' is missing");
            }
            String str3 = this.f93251c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'authorizationCode' is missing");
            }
            String str4 = this.f93252d;
            if (str4 != null) {
                return new b(str, str2, str3, str4, this.f93253e, this.f93254f);
            }
            throw new IllegalStateException("Required field 'name' is missing");
        }

        @m80.k
        public final C1256b c(@m80.l String str) {
            this.f93254f = str;
            return this;
        }

        @m80.k
        public final C1256b d(@m80.l String str) {
            this.f93253e = str;
            return this;
        }

        @m80.k
        public final C1256b e(@m80.k String identityToken) {
            g0.p(identityToken, "identityToken");
            this.f93250b = identityToken;
            return this;
        }

        @m80.k
        public final C1256b f(@m80.k String name) {
            g0.p(name, "name");
            this.f93252d = name;
            return this;
        }

        @m80.k
        public final C1256b g(@m80.k String user) {
            g0.p(user, "user");
            this.f93249a = user;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93249a = null;
            this.f93250b = null;
            this.f93251c = null;
            this.f93252d = null;
            this.f93253e = null;
            this.f93254f = null;
        }

        public C1256b(@m80.k b source) {
            g0.p(source, "source");
            this.f93249a = source.f93243a;
            this.f93250b = source.f93244b;
            this.f93251c = source.f93245c;
            this.f93252d = source.f93246d;
            this.f93253e = source.f93247e;
            this.f93254f = source.f93248f;
        }
    }
}
