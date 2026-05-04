package g8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class q implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final b f53351f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<q, a> f53352g = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53353a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53354b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f53355c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f53356d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    @w00.g
    public final f8.b f53357e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<q, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q read(@m80.k ws.i protocol, @m80.k a builder) {
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
                                if (s11 != 5) {
                                    at.b.a(protocol, b11);
                                } else if (b11 == 12) {
                                    builder.a(f8.b.f51265i.read(protocol));
                                } else {
                                    at.b.a(protocol, b11);
                                }
                            } else if (b11 == 11) {
                                builder.b(protocol.readString());
                            } else {
                                at.b.a(protocol, b11);
                            }
                        } else if (b11 == 11) {
                            builder.f(protocol.readString());
                        } else {
                            at.b.a(protocol, b11);
                        }
                    } else if (b11 == 11) {
                        builder.e(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k q struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("MainViewBottomAdv");
            protocol.Q6("id", 1, (byte) 11);
            protocol.p1(struct.f53353a);
            protocol.N2();
            protocol.Q6(com.baicizhan.main.activity.schedule_v2.e.f19255e, 2, (byte) 11);
            protocol.p1(struct.f53354b);
            protocol.N2();
            protocol.Q6(y9.b.f99687c, 3, (byte) 11);
            protocol.p1(struct.f53355c);
            protocol.N2();
            if (struct.f53356d != null) {
                protocol.Q6("aid", 4, (byte) 11);
                protocol.p1(struct.f53356d);
                protocol.N2();
            }
            if (struct.f53357e != null) {
                protocol.Q6("ad_resp", 5, (byte) 12);
                f8.b.f51265i.write(protocol, struct.f53357e);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public q(@m80.k String id2, @m80.k String img_url, @m80.k String link, @m80.l String str, @m80.l f8.b bVar) {
        g0.p(id2, "id");
        g0.p(img_url, "img_url");
        g0.p(link, "link");
        this.f53353a = id2;
        this.f53354b = img_url;
        this.f53355c = link;
        this.f53356d = str;
        this.f53357e = bVar;
    }

    public static /* synthetic */ q g(q qVar, String str, String str2, String str3, String str4, f8.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = qVar.f53353a;
        }
        if ((i11 & 2) != 0) {
            str2 = qVar.f53354b;
        }
        if ((i11 & 4) != 0) {
            str3 = qVar.f53355c;
        }
        if ((i11 & 8) != 0) {
            str4 = qVar.f53356d;
        }
        if ((i11 & 16) != 0) {
            bVar = qVar.f53357e;
        }
        f8.b bVar2 = bVar;
        String str5 = str3;
        return qVar.f(str, str2, str5, str4, bVar2);
    }

    @m80.k
    public final String a() {
        return this.f53353a;
    }

    @m80.k
    public final String b() {
        return this.f53354b;
    }

    @m80.k
    public final String c() {
        return this.f53355c;
    }

    @m80.l
    public final String d() {
        return this.f53356d;
    }

    @m80.l
    public final f8.b e() {
        return this.f53357e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return g0.g(this.f53353a, qVar.f53353a) && g0.g(this.f53354b, qVar.f53354b) && g0.g(this.f53355c, qVar.f53355c) && g0.g(this.f53356d, qVar.f53356d) && g0.g(this.f53357e, qVar.f53357e);
    }

    @m80.k
    public final q f(@m80.k String id2, @m80.k String img_url, @m80.k String link, @m80.l String str, @m80.l f8.b bVar) {
        g0.p(id2, "id");
        g0.p(img_url, "img_url");
        g0.p(link, "link");
        return new q(id2, img_url, link, str, bVar);
    }

    public int hashCode() {
        int hashCode = ((((this.f53353a.hashCode() * 31) + this.f53354b.hashCode()) * 31) + this.f53355c.hashCode()) * 31;
        String str = this.f53356d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        f8.b bVar = this.f53357e;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "MainViewBottomAdv(id=" + this.f53353a + ", img_url=" + this.f53354b + ", link=" + this.f53355c + ", aid=" + this.f53356d + ", ad_resp=" + this.f53357e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f53352g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMainViewBottomAdv.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainViewBottomAdv.kt\ncom/baicizhan/biz/online/advertise_api/MainViewBottomAdv$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,203:1\n1#2:204\n*E\n"})
    public static final class a implements ts.f<q> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f53358a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f53359b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f53360c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f53361d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public f8.b f53362e;

        public a() {
            this.f53358a = null;
            this.f53359b = null;
            this.f53360c = null;
            this.f53361d = null;
            this.f53362e = null;
        }

        @m80.k
        public final a a(@m80.l f8.b bVar) {
            this.f53362e = bVar;
            return this;
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f53361d = str;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q build() {
            String str = this.f53358a;
            if (str == null) {
                throw new IllegalStateException("Required field 'id' is missing");
            }
            String str2 = this.f53359b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'img_url' is missing");
            }
            String str3 = this.f53360c;
            if (str3 != null) {
                return new q(str, str2, str3, this.f53361d, this.f53362e);
            }
            throw new IllegalStateException("Required field 'link' is missing");
        }

        @m80.k
        public final a d(@m80.k String id2) {
            g0.p(id2, "id");
            this.f53358a = id2;
            return this;
        }

        @m80.k
        public final a e(@m80.k String img_url) {
            g0.p(img_url, "img_url");
            this.f53359b = img_url;
            return this;
        }

        @m80.k
        public final a f(@m80.k String link) {
            g0.p(link, "link");
            this.f53360c = link;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f53358a = null;
            this.f53359b = null;
            this.f53360c = null;
            this.f53361d = null;
            this.f53362e = null;
        }

        public a(@m80.k q source) {
            g0.p(source, "source");
            this.f53358a = source.f53353a;
            this.f53359b = source.f53354b;
            this.f53360c = source.f53355c;
            this.f53361d = source.f53356d;
            this.f53362e = source.f53357e;
        }
    }
}
