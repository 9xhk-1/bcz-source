package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final c f93229d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a, b> f93230e = new C1255a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93231a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93232b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final int f93233c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: v8.a$a, reason: collision with other inner class name */
    public static final class C1255a implements ts.a<a, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol, @m80.k b builder) {
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
                        } else if (b11 == 8) {
                            builder.c(protocol.s8());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.d(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.a(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AccessTokenCheckResult");
            protocol.Q6("access_token", 1, (byte) 11);
            protocol.p1(struct.f93231a);
            protocol.N2();
            protocol.Q6("last_device", 2, (byte) 11);
            protocol.p1(struct.f93232b);
            protocol.N2();
            protocol.Q6("is_new_user", 3, (byte) 8);
            protocol.l5(struct.f93233c);
            protocol.N2();
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

    public a(@m80.k String access_token, @m80.k String last_device, int i11) {
        g0.p(access_token, "access_token");
        g0.p(last_device, "last_device");
        this.f93231a = access_token;
        this.f93232b = last_device;
        this.f93233c = i11;
    }

    public static /* synthetic */ a e(a aVar, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = aVar.f93231a;
        }
        if ((i12 & 2) != 0) {
            str2 = aVar.f93232b;
        }
        if ((i12 & 4) != 0) {
            i11 = aVar.f93233c;
        }
        return aVar.d(str, str2, i11);
    }

    @m80.k
    public final String a() {
        return this.f93231a;
    }

    @m80.k
    public final String b() {
        return this.f93232b;
    }

    public final int c() {
        return this.f93233c;
    }

    @m80.k
    public final a d(@m80.k String access_token, @m80.k String last_device, int i11) {
        g0.p(access_token, "access_token");
        g0.p(last_device, "last_device");
        return new a(access_token, last_device, i11);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f93231a, aVar.f93231a) && g0.g(this.f93232b, aVar.f93232b) && this.f93233c == aVar.f93233c;
    }

    public int hashCode() {
        return (((this.f93231a.hashCode() * 31) + this.f93232b.hashCode()) * 31) + Integer.hashCode(this.f93233c);
    }

    @m80.k
    public String toString() {
        return "AccessTokenCheckResult(access_token=" + this.f93231a + ", last_device=" + this.f93232b + ", is_new_user=" + this.f93233c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93230e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAccessTokenCheckResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccessTokenCheckResult.kt\ncom/baicizhan/biz/online/unified_user_service/AccessTokenCheckResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,151:1\n1#2:152\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93234a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f93235b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public Integer f93236c;

        public b() {
            this.f93234a = null;
            this.f93235b = null;
            this.f93236c = null;
        }

        @m80.k
        public final b a(@m80.k String access_token) {
            g0.p(access_token, "access_token");
            this.f93234a = access_token;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a build() {
            String str = this.f93234a;
            if (str == null) {
                throw new IllegalStateException("Required field 'access_token' is missing");
            }
            String str2 = this.f93235b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'last_device' is missing");
            }
            Integer num = this.f93236c;
            if (num != null) {
                return new a(str, str2, num.intValue());
            }
            throw new IllegalStateException("Required field 'is_new_user' is missing");
        }

        @m80.k
        public final b c(int i11) {
            this.f93236c = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b d(@m80.k String last_device) {
            g0.p(last_device, "last_device");
            this.f93235b = last_device;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93234a = null;
            this.f93235b = null;
            this.f93236c = null;
        }

        public b(@m80.k a source) {
            g0.p(source, "source");
            this.f93234a = source.f93231a;
            this.f93235b = source.f93232b;
            this.f93236c = Integer.valueOf(source.f93233c);
        }
    }
}
