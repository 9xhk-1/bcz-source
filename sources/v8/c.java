package v8;

import androidx.autofill.HintConstants;
import com.baicizhan.main.auth.AccountVerificationActivity;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final C1257c f93255e = new C1257c(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<c, b> f93256f = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93257a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93258b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93259c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93260d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<c, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@m80.k ws.i protocol, @m80.k b builder) {
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
                                builder.c(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.d(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.e(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BczLoginRequest");
            protocol.Q6(AccountVerificationActivity.f19910x, 1, (byte) 11);
            protocol.p1(struct.f93257a);
            protocol.N2();
            protocol.Q6(HintConstants.AUTOFILL_HINT_PASSWORD, 2, (byte) 11);
            protocol.p1(struct.f93258b);
            protocol.N2();
            if (struct.f93259c != null) {
                protocol.Q6("device", 3, (byte) 11);
                protocol.p1(struct.f93259c);
                protocol.N2();
            }
            if (struct.f93260d != null) {
                protocol.Q6("code", 4, (byte) 11);
                protocol.p1(struct.f93260d);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: v8.c$c, reason: collision with other inner class name */
    public static final class C1257c {
        public /* synthetic */ C1257c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public C1257c() {
        }
    }

    public c(@m80.k String account, @m80.k String password, @m80.l String str, @m80.l String str2) {
        g0.p(account, "account");
        g0.p(password, "password");
        this.f93257a = account;
        this.f93258b = password;
        this.f93259c = str;
        this.f93260d = str2;
    }

    public static /* synthetic */ c f(c cVar, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cVar.f93257a;
        }
        if ((i11 & 2) != 0) {
            str2 = cVar.f93258b;
        }
        if ((i11 & 4) != 0) {
            str3 = cVar.f93259c;
        }
        if ((i11 & 8) != 0) {
            str4 = cVar.f93260d;
        }
        return cVar.e(str, str2, str3, str4);
    }

    @m80.k
    public final String a() {
        return this.f93257a;
    }

    @m80.k
    public final String b() {
        return this.f93258b;
    }

    @m80.l
    public final String c() {
        return this.f93259c;
    }

    @m80.l
    public final String d() {
        return this.f93260d;
    }

    @m80.k
    public final c e(@m80.k String account, @m80.k String password, @m80.l String str, @m80.l String str2) {
        g0.p(account, "account");
        g0.p(password, "password");
        return new c(account, password, str, str2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g0.g(this.f93257a, cVar.f93257a) && g0.g(this.f93258b, cVar.f93258b) && g0.g(this.f93259c, cVar.f93259c) && g0.g(this.f93260d, cVar.f93260d);
    }

    public int hashCode() {
        int hashCode = ((this.f93257a.hashCode() * 31) + this.f93258b.hashCode()) * 31;
        String str = this.f93259c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f93260d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "BczLoginRequest(account=" + this.f93257a + ", password=" + this.f93258b + ", device=" + this.f93259c + ", code=" + this.f93260d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93256f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBczLoginRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczLoginRequest.kt\ncom/baicizhan/biz/online/unified_user_service/BczLoginRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"})
    public static final class b implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93261a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f93262b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93263c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f93264d;

        public b() {
            this.f93261a = null;
            this.f93262b = null;
            this.f93263c = null;
            this.f93264d = null;
        }

        @m80.k
        public final b a(@m80.k String account) {
            g0.p(account, "account");
            this.f93261a = account;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c build() {
            String str = this.f93261a;
            if (str == null) {
                throw new IllegalStateException("Required field 'account' is missing");
            }
            String str2 = this.f93262b;
            if (str2 != null) {
                return new c(str, str2, this.f93263c, this.f93264d);
            }
            throw new IllegalStateException("Required field 'password' is missing");
        }

        @m80.k
        public final b c(@m80.l String str) {
            this.f93264d = str;
            return this;
        }

        @m80.k
        public final b d(@m80.l String str) {
            this.f93263c = str;
            return this;
        }

        @m80.k
        public final b e(@m80.k String password) {
            g0.p(password, "password");
            this.f93262b = password;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93261a = null;
            this.f93262b = null;
            this.f93263c = null;
            this.f93264d = null;
        }

        public b(@m80.k c source) {
            g0.p(source, "source");
            this.f93261a = source.f93257a;
            this.f93262b = source.f93258b;
            this.f93263c = source.f93259c;
            this.f93264d = source.f93260d;
        }
    }
}
