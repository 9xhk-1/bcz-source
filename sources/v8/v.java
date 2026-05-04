package v8;

import com.tencent.open.SocialOperation;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class v implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f93547e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<v, a> f93548f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93549a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93550b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93551c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93552d;

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
                            if (s11 != 4) {
                                at.b.a(protocol, b11);
                            } else if (b11 == 11) {
                                builder.b(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.e(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.d(protocol.readString());
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
            protocol.g6("UserBindInfo");
            protocol.Q6(ma.b.f72911h1, 1, (byte) 11);
            protocol.p1(struct.f93549a);
            protocol.N2();
            protocol.Q6("openid", 2, (byte) 11);
            protocol.p1(struct.f93550b);
            protocol.N2();
            protocol.Q6(SocialOperation.GAME_UNION_ID, 3, (byte) 11);
            protocol.p1(struct.f93551c);
            protocol.N2();
            protocol.Q6("nickname", 4, (byte) 11);
            protocol.p1(struct.f93552d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public v(@m80.k String provider, @m80.k String openid, @m80.k String unionid, @m80.k String nickname) {
        g0.p(provider, "provider");
        g0.p(openid, "openid");
        g0.p(unionid, "unionid");
        g0.p(nickname, "nickname");
        this.f93549a = provider;
        this.f93550b = openid;
        this.f93551c = unionid;
        this.f93552d = nickname;
    }

    public static /* synthetic */ v f(v vVar, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = vVar.f93549a;
        }
        if ((i11 & 2) != 0) {
            str2 = vVar.f93550b;
        }
        if ((i11 & 4) != 0) {
            str3 = vVar.f93551c;
        }
        if ((i11 & 8) != 0) {
            str4 = vVar.f93552d;
        }
        return vVar.e(str, str2, str3, str4);
    }

    @m80.k
    public final String a() {
        return this.f93549a;
    }

    @m80.k
    public final String b() {
        return this.f93550b;
    }

    @m80.k
    public final String c() {
        return this.f93551c;
    }

    @m80.k
    public final String d() {
        return this.f93552d;
    }

    @m80.k
    public final v e(@m80.k String provider, @m80.k String openid, @m80.k String unionid, @m80.k String nickname) {
        g0.p(provider, "provider");
        g0.p(openid, "openid");
        g0.p(unionid, "unionid");
        g0.p(nickname, "nickname");
        return new v(provider, openid, unionid, nickname);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return g0.g(this.f93549a, vVar.f93549a) && g0.g(this.f93550b, vVar.f93550b) && g0.g(this.f93551c, vVar.f93551c) && g0.g(this.f93552d, vVar.f93552d);
    }

    public int hashCode() {
        return (((((this.f93549a.hashCode() * 31) + this.f93550b.hashCode()) * 31) + this.f93551c.hashCode()) * 31) + this.f93552d.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserBindInfo(provider=" + this.f93549a + ", openid=" + this.f93550b + ", unionid=" + this.f93551c + ", nickname=" + this.f93552d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93548f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserBindInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserBindInfo.kt\ncom/baicizhan/biz/online/unified_user_service/UserBindInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
    public static final class a implements ts.f<v> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93553a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f93554b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93555c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f93556d;

        public a() {
            this.f93553a = null;
            this.f93554b = null;
            this.f93555c = null;
            this.f93556d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public v build() {
            String str = this.f93553a;
            if (str == null) {
                throw new IllegalStateException("Required field 'provider' is missing");
            }
            String str2 = this.f93554b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'openid' is missing");
            }
            String str3 = this.f93555c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'unionid' is missing");
            }
            String str4 = this.f93556d;
            if (str4 != null) {
                return new v(str, str2, str3, str4);
            }
            throw new IllegalStateException("Required field 'nickname' is missing");
        }

        @m80.k
        public final a b(@m80.k String nickname) {
            g0.p(nickname, "nickname");
            this.f93556d = nickname;
            return this;
        }

        @m80.k
        public final a c(@m80.k String openid) {
            g0.p(openid, "openid");
            this.f93554b = openid;
            return this;
        }

        @m80.k
        public final a d(@m80.k String provider) {
            g0.p(provider, "provider");
            this.f93553a = provider;
            return this;
        }

        @m80.k
        public final a e(@m80.k String unionid) {
            g0.p(unionid, "unionid");
            this.f93555c = unionid;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93553a = null;
            this.f93554b = null;
            this.f93555c = null;
            this.f93556d = null;
        }

        public a(@m80.k v source) {
            g0.p(source, "source");
            this.f93553a = source.f93549a;
            this.f93554b = source.f93550b;
            this.f93555c = source.f93551c;
            this.f93556d = source.f93552d;
        }
    }
}
