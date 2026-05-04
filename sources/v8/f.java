package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class f implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f93277d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<f, a> f93278e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93279a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93280b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f93281c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<f, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 11) {
                            builder.d(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
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
        public void write(@m80.k ws.i protocol, @m80.k f struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("PhoneFreeVerifyRequest");
            protocol.Q6("clientToken", 1, (byte) 11);
            protocol.p1(struct.f93279a);
            protocol.N2();
            protocol.Q6("opToken", 2, (byte) 11);
            protocol.p1(struct.f93280b);
            protocol.N2();
            protocol.Q6("operatorName", 3, (byte) 11);
            protocol.p1(struct.f93281c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public f(@m80.k String clientToken, @m80.k String opToken, @m80.k String operatorName) {
        g0.p(clientToken, "clientToken");
        g0.p(opToken, "opToken");
        g0.p(operatorName, "operatorName");
        this.f93279a = clientToken;
        this.f93280b = opToken;
        this.f93281c = operatorName;
    }

    public static /* synthetic */ f e(f fVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fVar.f93279a;
        }
        if ((i11 & 2) != 0) {
            str2 = fVar.f93280b;
        }
        if ((i11 & 4) != 0) {
            str3 = fVar.f93281c;
        }
        return fVar.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f93279a;
    }

    @m80.k
    public final String b() {
        return this.f93280b;
    }

    @m80.k
    public final String c() {
        return this.f93281c;
    }

    @m80.k
    public final f d(@m80.k String clientToken, @m80.k String opToken, @m80.k String operatorName) {
        g0.p(clientToken, "clientToken");
        g0.p(opToken, "opToken");
        g0.p(operatorName, "operatorName");
        return new f(clientToken, opToken, operatorName);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return g0.g(this.f93279a, fVar.f93279a) && g0.g(this.f93280b, fVar.f93280b) && g0.g(this.f93281c, fVar.f93281c);
    }

    public int hashCode() {
        return (((this.f93279a.hashCode() * 31) + this.f93280b.hashCode()) * 31) + this.f93281c.hashCode();
    }

    @m80.k
    public String toString() {
        return "PhoneFreeVerifyRequest(clientToken=" + this.f93279a + ", opToken=" + this.f93280b + ", operatorName=" + this.f93281c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93278e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPhoneFreeVerifyRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneFreeVerifyRequest.kt\ncom/baicizhan/biz/online/unified_user_service/PhoneFreeVerifyRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
    public static final class a implements ts.f<f> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f93282a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f93283b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93284c;

        public a() {
            this.f93282a = null;
            this.f93283b = null;
            this.f93284c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f build() {
            String str = this.f93282a;
            if (str == null) {
                throw new IllegalStateException("Required field 'clientToken' is missing");
            }
            String str2 = this.f93283b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'opToken' is missing");
            }
            String str3 = this.f93284c;
            if (str3 != null) {
                return new f(str, str2, str3);
            }
            throw new IllegalStateException("Required field 'operatorName' is missing");
        }

        @m80.k
        public final a b(@m80.k String clientToken) {
            g0.p(clientToken, "clientToken");
            this.f93282a = clientToken;
            return this;
        }

        @m80.k
        public final a c(@m80.k String opToken) {
            g0.p(opToken, "opToken");
            this.f93283b = opToken;
            return this;
        }

        @m80.k
        public final a d(@m80.k String operatorName) {
            g0.p(operatorName, "operatorName");
            this.f93284c = operatorName;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93282a = null;
            this.f93283b = null;
            this.f93284c = null;
        }

        public a(@m80.k f source) {
            g0.p(source, "source");
            this.f93282a = source.f93279a;
            this.f93283b = source.f93280b;
            this.f93284c = source.f93281c;
        }
    }
}
