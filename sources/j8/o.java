package j8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class o implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f63868d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<o, a> f63869e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f63870a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f63871b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final n f63872c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<o, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o read(@m80.k ws.i protocol, @m80.k a builder) {
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
                        } else if (b11 == 12) {
                            builder.d(n.f63857g.read(protocol));
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 8) {
                    builder.a(protocol.s8());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k o struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("QRCodeResp");
            protocol.Q6("action", 1, (byte) 8);
            protocol.l5(struct.f63870a);
            protocol.N2();
            if (struct.f63871b != null) {
                protocol.Q6("message", 2, (byte) 11);
                protocol.p1(struct.f63871b);
                protocol.N2();
            }
            if (struct.f63872c != null) {
                protocol.Q6("redirect_info", 3, (byte) 12);
                n.f63857g.write(protocol, struct.f63872c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public o(int i11, @m80.l String str, @m80.l n nVar) {
        this.f63870a = i11;
        this.f63871b = str;
        this.f63872c = nVar;
    }

    public static /* synthetic */ o e(o oVar, int i11, String str, n nVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = oVar.f63870a;
        }
        if ((i12 & 2) != 0) {
            str = oVar.f63871b;
        }
        if ((i12 & 4) != 0) {
            nVar = oVar.f63872c;
        }
        return oVar.d(i11, str, nVar);
    }

    public final int a() {
        return this.f63870a;
    }

    @m80.l
    public final String b() {
        return this.f63871b;
    }

    @m80.l
    public final n c() {
        return this.f63872c;
    }

    @m80.k
    public final o d(int i11, @m80.l String str, @m80.l n nVar) {
        return new o(i11, str, nVar);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f63870a == oVar.f63870a && g0.g(this.f63871b, oVar.f63871b) && g0.g(this.f63872c, oVar.f63872c);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f63870a) * 31;
        String str = this.f63871b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        n nVar = this.f63872c;
        return hashCode2 + (nVar != null ? nVar.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "QRCodeResp(action=" + this.f63870a + ", message=" + this.f63871b + ", redirect_info=" + this.f63872c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63869e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nQRCodeResp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QRCodeResp.kt\ncom/baicizhan/biz/online/bcz_system_api/QRCodeResp$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
    public static final class a implements ts.f<o> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f63873a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f63874b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public n f63875c;

        public a() {
            this.f63873a = null;
            this.f63874b = null;
            this.f63875c = null;
        }

        @m80.k
        public final a a(int i11) {
            this.f63873a = Integer.valueOf(i11);
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public o build() {
            Integer num = this.f63873a;
            if (num != null) {
                return new o(num.intValue(), this.f63874b, this.f63875c);
            }
            throw new IllegalStateException("Required field 'action' is missing");
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f63874b = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l n nVar) {
            this.f63875c = nVar;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63873a = null;
            this.f63874b = null;
            this.f63875c = null;
        }

        public a(@m80.k o source) {
            g0.p(source, "source");
            this.f63873a = Integer.valueOf(source.f63870a);
            this.f63874b = source.f63871b;
            this.f63875c = source.f63872c;
        }
    }
}
