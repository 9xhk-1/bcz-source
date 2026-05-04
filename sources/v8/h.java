package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class h implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f93293c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<h, a> f93294d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93295a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93296b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<h, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        at.b.a(protocol, b11);
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
        public void write(@m80.k ws.i protocol, @m80.k h struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("PhoneVerifyCodeRequest");
            protocol.Q6("phone", 1, (byte) 11);
            protocol.p1(struct.f93295a);
            protocol.N2();
            protocol.Q6("verify_code", 2, (byte) 11);
            protocol.p1(struct.f93296b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public h(@m80.k String phone, @m80.k String verify_code) {
        g0.p(phone, "phone");
        g0.p(verify_code, "verify_code");
        this.f93295a = phone;
        this.f93296b = verify_code;
    }

    public static /* synthetic */ h d(h hVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hVar.f93295a;
        }
        if ((i11 & 2) != 0) {
            str2 = hVar.f93296b;
        }
        return hVar.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f93295a;
    }

    @m80.k
    public final String b() {
        return this.f93296b;
    }

    @m80.k
    public final h c(@m80.k String phone, @m80.k String verify_code) {
        g0.p(phone, "phone");
        g0.p(verify_code, "verify_code");
        return new h(phone, verify_code);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return g0.g(this.f93295a, hVar.f93295a) && g0.g(this.f93296b, hVar.f93296b);
    }

    public int hashCode() {
        return (this.f93295a.hashCode() * 31) + this.f93296b.hashCode();
    }

    @m80.k
    public String toString() {
        return "PhoneVerifyCodeRequest(phone=" + this.f93295a + ", verify_code=" + this.f93296b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93294d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPhoneVerifyCodeRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneVerifyCodeRequest.kt\ncom/baicizhan/biz/online/unified_user_service/PhoneVerifyCodeRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
    public static final class a implements ts.f<h> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93297a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f93298b;

        public a() {
            this.f93297a = null;
            this.f93298b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h build() {
            String str = this.f93297a;
            if (str == null) {
                throw new IllegalStateException("Required field 'phone' is missing");
            }
            String str2 = this.f93298b;
            if (str2 != null) {
                return new h(str, str2);
            }
            throw new IllegalStateException("Required field 'verify_code' is missing");
        }

        @m80.k
        public final a b(@m80.k String phone) {
            g0.p(phone, "phone");
            this.f93297a = phone;
            return this;
        }

        @m80.k
        public final a c(@m80.k String verify_code) {
            g0.p(verify_code, "verify_code");
            this.f93298b = verify_code;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93297a = null;
            this.f93298b = null;
        }

        public a(@m80.k h source) {
            g0.p(source, "source");
            this.f93297a = source.f93295a;
            this.f93298b = source.f93296b;
        }
    }
}
