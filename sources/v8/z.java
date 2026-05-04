package v8;

import androidx.autofill.HintConstants;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class z implements ts.e {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b f93607c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<z, a> f93608d = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93609a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93610b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<z, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z read(@m80.k ws.i protocol, @m80.k a builder) {
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
        public void write(@m80.k ws.i protocol, @m80.k z struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserTryResult");
            protocol.Q6("email", 1, (byte) 11);
            protocol.p1(struct.f93609a);
            protocol.N2();
            protocol.Q6(HintConstants.AUTOFILL_HINT_PASSWORD, 2, (byte) 11);
            protocol.p1(struct.f93610b);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public z(@m80.k String email, @m80.k String password) {
        g0.p(email, "email");
        g0.p(password, "password");
        this.f93609a = email;
        this.f93610b = password;
    }

    public static /* synthetic */ z d(z zVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = zVar.f93609a;
        }
        if ((i11 & 2) != 0) {
            str2 = zVar.f93610b;
        }
        return zVar.c(str, str2);
    }

    @m80.k
    public final String a() {
        return this.f93609a;
    }

    @m80.k
    public final String b() {
        return this.f93610b;
    }

    @m80.k
    public final z c(@m80.k String email, @m80.k String password) {
        g0.p(email, "email");
        g0.p(password, "password");
        return new z(email, password);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return g0.g(this.f93609a, zVar.f93609a) && g0.g(this.f93610b, zVar.f93610b);
    }

    public int hashCode() {
        return (this.f93609a.hashCode() * 31) + this.f93610b.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserTryResult(email=" + this.f93609a + ", password=" + this.f93610b + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93608d.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserTryResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTryResult.kt\ncom/baicizhan/biz/online/unified_user_service/UserTryResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
    public static final class a implements ts.f<z> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93611a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f93612b;

        public a() {
            this.f93611a = null;
            this.f93612b = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z build() {
            String str = this.f93611a;
            if (str == null) {
                throw new IllegalStateException("Required field 'email' is missing");
            }
            String str2 = this.f93612b;
            if (str2 != null) {
                return new z(str, str2);
            }
            throw new IllegalStateException("Required field 'password' is missing");
        }

        @m80.k
        public final a b(@m80.k String email) {
            g0.p(email, "email");
            this.f93611a = email;
            return this;
        }

        @m80.k
        public final a c(@m80.k String password) {
            g0.p(password, "password");
            this.f93612b = password;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93611a = null;
            this.f93612b = null;
        }

        public a(@m80.k z source) {
            g0.p(source, "source");
            this.f93611a = source.f93609a;
            this.f93612b = source.f93610b;
        }
    }
}
