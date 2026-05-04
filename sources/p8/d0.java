package p8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d0 implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f79736d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<d0, a> f79737e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f79738a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f79739b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f79740c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<d0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d0 read(@m80.k ws.i protocol, @m80.k a builder) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(builder, "builder");
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
                    builder.b(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k d0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("ResourceItem");
            protocol.Q6("icon", 1, (byte) 11);
            protocol.p1(struct.f79738a);
            protocol.N2();
            protocol.Q6("name", 2, (byte) 11);
            protocol.p1(struct.f79739b);
            protocol.N2();
            protocol.Q6(y9.b.f99687c, 3, (byte) 11);
            protocol.p1(struct.f79740c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public d0(@m80.k String icon, @m80.k String name, @m80.k String link) {
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(link, "link");
        this.f79738a = icon;
        this.f79739b = name;
        this.f79740c = link;
    }

    public static /* synthetic */ d0 e(d0 d0Var, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = d0Var.f79738a;
        }
        if ((i11 & 2) != 0) {
            str2 = d0Var.f79739b;
        }
        if ((i11 & 4) != 0) {
            str3 = d0Var.f79740c;
        }
        return d0Var.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f79738a;
    }

    @m80.k
    public final String b() {
        return this.f79739b;
    }

    @m80.k
    public final String c() {
        return this.f79740c;
    }

    @m80.k
    public final d0 d(@m80.k String icon, @m80.k String name, @m80.k String link) {
        kotlin.jvm.internal.g0.p(icon, "icon");
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(link, "link");
        return new d0(icon, name, link);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return kotlin.jvm.internal.g0.g(this.f79738a, d0Var.f79738a) && kotlin.jvm.internal.g0.g(this.f79739b, d0Var.f79739b) && kotlin.jvm.internal.g0.g(this.f79740c, d0Var.f79740c);
    }

    public int hashCode() {
        return (((this.f79738a.hashCode() * 31) + this.f79739b.hashCode()) * 31) + this.f79740c.hashCode();
    }

    @m80.k
    public String toString() {
        return "ResourceItem(icon=" + this.f79738a + ", name=" + this.f79739b + ", link=" + this.f79740c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f79737e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nResourceItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceItem.kt\ncom/baicizhan/biz/online/game_api/ResourceItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
    public static final class a implements ts.f<d0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f79741a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f79742b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f79743c;

        public a() {
            this.f79741a = null;
            this.f79742b = null;
            this.f79743c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 build() {
            String str = this.f79741a;
            if (str == null) {
                throw new IllegalStateException("Required field 'icon' is missing");
            }
            String str2 = this.f79742b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'name' is missing");
            }
            String str3 = this.f79743c;
            if (str3 != null) {
                return new d0(str, str2, str3);
            }
            throw new IllegalStateException("Required field 'link' is missing");
        }

        @m80.k
        public final a b(@m80.k String icon) {
            kotlin.jvm.internal.g0.p(icon, "icon");
            this.f79741a = icon;
            return this;
        }

        @m80.k
        public final a c(@m80.k String link) {
            kotlin.jvm.internal.g0.p(link, "link");
            this.f79743c = link;
            return this;
        }

        @m80.k
        public final a d(@m80.k String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            this.f79742b = name;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f79741a = null;
            this.f79742b = null;
            this.f79743c = null;
        }

        public a(@m80.k d0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f79741a = source.f79738a;
            this.f79742b = source.f79739b;
            this.f79743c = source.f79740c;
        }
    }
}
