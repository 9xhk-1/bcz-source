package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x implements ts.e {

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public static final b f93573l = new b(null);

    /* renamed from: m, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<x, a> f93574m = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93575a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    public final int f93576b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93577c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93578d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93579e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    public final long f93580f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93581g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f93582h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f93583i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    @w00.g
    public final j f93584j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f93585k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<x, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.a(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.s8());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 10) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.l(protocol.T1());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 9:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.k(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 10:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(j.f93308d.read(protocol));
                            break;
                        }
                    case 11:
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
        public void write(@m80.k ws.i protocol, @m80.k x struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserLoginResult");
            protocol.Q6("access_token", 1, (byte) 11);
            protocol.p1(struct.f93575a);
            protocol.N2();
            protocol.Q6("is_new_user", 2, (byte) 8);
            protocol.l5(struct.f93576b);
            protocol.N2();
            protocol.Q6("email", 3, (byte) 11);
            protocol.p1(struct.f93577c);
            protocol.N2();
            protocol.Q6(com.alipay.sdk.m.p.e.f10911o, 4, (byte) 11);
            protocol.p1(struct.f93578d);
            protocol.N2();
            protocol.Q6("last_device", 5, (byte) 11);
            protocol.p1(struct.f93579e);
            protocol.N2();
            protocol.Q6("unique_id", 6, (byte) 10);
            protocol.q7(struct.f93580f);
            protocol.N2();
            if (struct.f93581g != null) {
                protocol.Q6("phone", 7, (byte) 11);
                protocol.p1(struct.f93581g);
                protocol.N2();
            }
            if (struct.f93582h != null) {
                protocol.Q6("force_bind_phone", 8, (byte) 8);
                protocol.l5(struct.f93582h.intValue());
                protocol.N2();
            }
            if (struct.f93583i != null) {
                protocol.Q6("role_new", 9, (byte) 8);
                protocol.l5(struct.f93583i.intValue());
                protocol.N2();
            }
            if (struct.f93584j != null) {
                protocol.Q6("role", 10, (byte) 12);
                j.f93308d.write(protocol, struct.f93584j);
                protocol.N2();
            }
            if (struct.f93585k != null) {
                protocol.Q6("game_mode", 11, (byte) 8);
                protocol.l5(struct.f93585k.intValue());
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public x(@m80.k String access_token, int i11, @m80.k String email, @m80.k String public_key, @m80.k String last_device, long j11, @m80.l String str, @m80.l Integer num, @m80.l Integer num2, @m80.l j jVar, @m80.l Integer num3) {
        g0.p(access_token, "access_token");
        g0.p(email, "email");
        g0.p(public_key, "public_key");
        g0.p(last_device, "last_device");
        this.f93575a = access_token;
        this.f93576b = i11;
        this.f93577c = email;
        this.f93578d = public_key;
        this.f93579e = last_device;
        this.f93580f = j11;
        this.f93581g = str;
        this.f93582h = num;
        this.f93583i = num2;
        this.f93584j = jVar;
        this.f93585k = num3;
    }

    public static /* synthetic */ x m(x xVar, String str, int i11, String str2, String str3, String str4, long j11, String str5, Integer num, Integer num2, j jVar, Integer num3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = xVar.f93575a;
        }
        if ((i12 & 2) != 0) {
            i11 = xVar.f93576b;
        }
        if ((i12 & 4) != 0) {
            str2 = xVar.f93577c;
        }
        if ((i12 & 8) != 0) {
            str3 = xVar.f93578d;
        }
        if ((i12 & 16) != 0) {
            str4 = xVar.f93579e;
        }
        if ((i12 & 32) != 0) {
            j11 = xVar.f93580f;
        }
        if ((i12 & 64) != 0) {
            str5 = xVar.f93581g;
        }
        if ((i12 & 128) != 0) {
            num = xVar.f93582h;
        }
        if ((i12 & 256) != 0) {
            num2 = xVar.f93583i;
        }
        if ((i12 & 512) != 0) {
            jVar = xVar.f93584j;
        }
        if ((i12 & 1024) != 0) {
            num3 = xVar.f93585k;
        }
        Integer num4 = num3;
        Integer num5 = num2;
        String str6 = str5;
        long j12 = j11;
        String str7 = str3;
        String str8 = str4;
        String str9 = str2;
        return xVar.l(str, i11, str9, str7, str8, j12, str6, num, num5, jVar, num4);
    }

    @m80.k
    public final String a() {
        return this.f93575a;
    }

    @m80.l
    public final j b() {
        return this.f93584j;
    }

    @m80.l
    public final Integer c() {
        return this.f93585k;
    }

    public final int d() {
        return this.f93576b;
    }

    @m80.k
    public final String e() {
        return this.f93577c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return g0.g(this.f93575a, xVar.f93575a) && this.f93576b == xVar.f93576b && g0.g(this.f93577c, xVar.f93577c) && g0.g(this.f93578d, xVar.f93578d) && g0.g(this.f93579e, xVar.f93579e) && this.f93580f == xVar.f93580f && g0.g(this.f93581g, xVar.f93581g) && g0.g(this.f93582h, xVar.f93582h) && g0.g(this.f93583i, xVar.f93583i) && g0.g(this.f93584j, xVar.f93584j) && g0.g(this.f93585k, xVar.f93585k);
    }

    @m80.k
    public final String f() {
        return this.f93578d;
    }

    @m80.k
    public final String g() {
        return this.f93579e;
    }

    public final long h() {
        return this.f93580f;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f93575a.hashCode() * 31) + Integer.hashCode(this.f93576b)) * 31) + this.f93577c.hashCode()) * 31) + this.f93578d.hashCode()) * 31) + this.f93579e.hashCode()) * 31) + Long.hashCode(this.f93580f)) * 31;
        String str = this.f93581g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f93582h;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f93583i;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        j jVar = this.f93584j;
        int hashCode5 = (hashCode4 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        Integer num3 = this.f93585k;
        return hashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    @m80.l
    public final String i() {
        return this.f93581g;
    }

    @m80.l
    public final Integer j() {
        return this.f93582h;
    }

    @m80.l
    public final Integer k() {
        return this.f93583i;
    }

    @m80.k
    public final x l(@m80.k String access_token, int i11, @m80.k String email, @m80.k String public_key, @m80.k String last_device, long j11, @m80.l String str, @m80.l Integer num, @m80.l Integer num2, @m80.l j jVar, @m80.l Integer num3) {
        g0.p(access_token, "access_token");
        g0.p(email, "email");
        g0.p(public_key, "public_key");
        g0.p(last_device, "last_device");
        return new x(access_token, i11, email, public_key, last_device, j11, str, num, num2, jVar, num3);
    }

    @m80.k
    public String toString() {
        return "UserLoginResult(access_token=" + this.f93575a + ", is_new_user=" + this.f93576b + ", email=" + this.f93577c + ", public_key=" + this.f93578d + ", last_device=" + this.f93579e + ", unique_id=" + this.f93580f + ", phone=" + this.f93581g + ", force_bind_phone=" + this.f93582h + ", role_new=" + this.f93583i + ", role=" + this.f93584j + ", game_mode=" + this.f93585k + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93574m.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserLoginResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserLoginResult.kt\ncom/baicizhan/biz/online/unified_user_service/UserLoginResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,384:1\n1#2:385\n*E\n"})
    public static final class a implements ts.f<x> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93586a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public Integer f93587b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93588c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f93589d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f93590e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Long f93591f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f93592g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f93593h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public Integer f93594i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public j f93595j;

        /* renamed from: k, reason: collision with root package name */
        @m80.l
        public Integer f93596k;

        public a() {
            this.f93586a = null;
            this.f93587b = null;
            this.f93588c = null;
            this.f93589d = null;
            this.f93590e = null;
            this.f93591f = null;
            this.f93592g = null;
            this.f93593h = null;
            this.f93594i = null;
            this.f93595j = null;
            this.f93596k = null;
        }

        @m80.k
        public final a a(@m80.k String access_token) {
            g0.p(access_token, "access_token");
            this.f93586a = access_token;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x build() {
            String str = this.f93586a;
            if (str == null) {
                throw new IllegalStateException("Required field 'access_token' is missing");
            }
            Integer num = this.f93587b;
            if (num == null) {
                throw new IllegalStateException("Required field 'is_new_user' is missing");
            }
            int intValue = num.intValue();
            String str2 = this.f93588c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'email' is missing");
            }
            String str3 = this.f93589d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'public_key' is missing");
            }
            String str4 = this.f93590e;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'last_device' is missing");
            }
            Long l11 = this.f93591f;
            if (l11 != null) {
                return new x(str, intValue, str2, str3, str4, l11.longValue(), this.f93592g, this.f93593h, this.f93594i, this.f93595j, this.f93596k);
            }
            throw new IllegalStateException("Required field 'unique_id' is missing");
        }

        @m80.k
        public final a c(@m80.k String email) {
            g0.p(email, "email");
            this.f93588c = email;
            return this;
        }

        @m80.k
        public final a d(@m80.l Integer num) {
            this.f93593h = num;
            return this;
        }

        @m80.k
        public final a e(@m80.l Integer num) {
            this.f93596k = num;
            return this;
        }

        @m80.k
        public final a f(int i11) {
            this.f93587b = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final a g(@m80.k String last_device) {
            g0.p(last_device, "last_device");
            this.f93590e = last_device;
            return this;
        }

        @m80.k
        public final a h(@m80.l String str) {
            this.f93592g = str;
            return this;
        }

        @m80.k
        public final a i(@m80.k String public_key) {
            g0.p(public_key, "public_key");
            this.f93589d = public_key;
            return this;
        }

        @m80.k
        public final a j(@m80.l j jVar) {
            this.f93595j = jVar;
            return this;
        }

        @m80.k
        public final a k(@m80.l Integer num) {
            this.f93594i = num;
            return this;
        }

        @m80.k
        public final a l(long j11) {
            this.f93591f = Long.valueOf(j11);
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93586a = null;
            this.f93587b = null;
            this.f93588c = null;
            this.f93589d = null;
            this.f93590e = null;
            this.f93591f = null;
            this.f93592g = null;
            this.f93593h = null;
            this.f93594i = null;
            this.f93595j = null;
            this.f93596k = null;
        }

        public a(@m80.k x source) {
            g0.p(source, "source");
            this.f93586a = source.f93575a;
            this.f93587b = Integer.valueOf(source.f93576b);
            this.f93588c = source.f93577c;
            this.f93589d = source.f93578d;
            this.f93590e = source.f93579e;
            this.f93591f = Long.valueOf(source.f93580f);
            this.f93592g = source.f93581g;
            this.f93593h = source.f93582h;
            this.f93594i = source.f93583i;
            this.f93595j = source.f93584j;
            this.f93596k = source.f93585k;
        }
    }
}
