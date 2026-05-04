package v8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f93285d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<g, a> f93286e = new c();

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    @w00.g
    public final h f93287a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final f f93288b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f93289c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<g, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            builder.b(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 12) {
                        builder.c(f.f93278e.read(protocol));
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 12) {
                    builder.d(h.f93294d.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k g struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("PhoneLoginRequest");
            if (struct.f93287a != null) {
                protocol.Q6("verify_code_request", 1, (byte) 12);
                h.f93294d.write(protocol, struct.f93287a);
                protocol.N2();
            }
            if (struct.f93288b != null) {
                protocol.Q6("free_verify_request", 2, (byte) 12);
                f.f93278e.write(protocol, struct.f93288b);
                protocol.N2();
            }
            if (struct.f93289c != null) {
                protocol.Q6("device", 3, (byte) 11);
                protocol.p1(struct.f93289c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public g(@m80.l h hVar, @m80.l f fVar, @m80.l String str) {
        this.f93287a = hVar;
        this.f93288b = fVar;
        this.f93289c = str;
    }

    public static /* synthetic */ g e(g gVar, h hVar, f fVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            hVar = gVar.f93287a;
        }
        if ((i11 & 2) != 0) {
            fVar = gVar.f93288b;
        }
        if ((i11 & 4) != 0) {
            str = gVar.f93289c;
        }
        return gVar.d(hVar, fVar, str);
    }

    @m80.l
    public final h a() {
        return this.f93287a;
    }

    @m80.l
    public final f b() {
        return this.f93288b;
    }

    @m80.l
    public final String c() {
        return this.f93289c;
    }

    @m80.k
    public final g d(@m80.l h hVar, @m80.l f fVar, @m80.l String str) {
        return new g(hVar, fVar, str);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return g0.g(this.f93287a, gVar.f93287a) && g0.g(this.f93288b, gVar.f93288b) && g0.g(this.f93289c, gVar.f93289c);
    }

    public int hashCode() {
        h hVar = this.f93287a;
        int hashCode = (hVar == null ? 0 : hVar.hashCode()) * 31;
        f fVar = this.f93288b;
        int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        String str = this.f93289c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "PhoneLoginRequest(verify_code_request=" + this.f93287a + ", free_verify_request=" + this.f93288b + ", device=" + this.f93289c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f93286e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPhoneLoginRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneLoginRequest.kt\ncom/baicizhan/biz/online/unified_user_service/PhoneLoginRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
    public static final class a implements ts.f<g> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public h f93290a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public f f93291b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f93292c;

        public a() {
            this.f93290a = null;
            this.f93291b = null;
            this.f93292c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g build() {
            return new g(this.f93290a, this.f93291b, this.f93292c);
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f93292c = str;
            return this;
        }

        @m80.k
        public final a c(@m80.l f fVar) {
            this.f93291b = fVar;
            return this;
        }

        @m80.k
        public final a d(@m80.l h hVar) {
            this.f93290a = hVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f93290a = null;
            this.f93291b = null;
            this.f93292c = null;
        }

        public a(@m80.k g source) {
            g0.p(source, "source");
            this.f93290a = source.f93287a;
            this.f93291b = source.f93288b;
            this.f93292c = source.f93289c;
        }
    }
}
