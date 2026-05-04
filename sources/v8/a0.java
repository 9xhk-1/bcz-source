package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a0 implements ts.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final b f93237b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a0, a> f93238c = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93239a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<a0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                if (a62.f96797c != 1) {
                    at.b.a(protocol, b11);
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
        public void write(@m80.k ws.i protocol, @m80.k a0 struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("UserTryResultForWatch");
            protocol.Q6("token", 1, (byte) 11);
            protocol.p1(struct.f93239a);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public a0(@m80.k String token) {
        g0.p(token, "token");
        this.f93239a = token;
    }

    public static /* synthetic */ a0 c(a0 a0Var, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = a0Var.f93239a;
        }
        return a0Var.b(str);
    }

    @m80.k
    public final String a() {
        return this.f93239a;
    }

    @m80.k
    public final a0 b(@m80.k String token) {
        g0.p(token, "token");
        return new a0(token);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && g0.g(this.f93239a, ((a0) obj).f93239a);
    }

    public int hashCode() {
        return this.f93239a.hashCode();
    }

    @m80.k
    public String toString() {
        return "UserTryResultForWatch(token=" + this.f93239a + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93238c.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nUserTryResultForWatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserTryResultForWatch.kt\ncom/baicizhan/biz/online/unified_user_service/UserTryResultForWatch$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,94:1\n1#2:95\n*E\n"})
    public static final class a implements ts.f<a0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93240a;

        public a() {
            this.f93240a = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 build() {
            String str = this.f93240a;
            if (str != null) {
                return new a0(str);
            }
            throw new IllegalStateException("Required field 'token' is missing");
        }

        @m80.k
        public final a b(@m80.k String token) {
            g0.p(token, "token");
            this.f93240a = token;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93240a = null;
        }

        public a(@m80.k a0 source) {
            g0.p(source, "source");
            this.f93240a = source.f93239a;
        }
    }
}
