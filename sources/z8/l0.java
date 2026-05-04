package z8;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class l0 implements ts.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f101733e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<l0, a> f101734f = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101735a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101736b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f101737c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f101738d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<l0, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l0 read(@m80.k ws.i protocol) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l0 read(@m80.k ws.i protocol, @m80.k a builder) {
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
                            if (s11 != 4) {
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
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k l0 struct) {
            kotlin.jvm.internal.g0.p(protocol, "protocol");
            kotlin.jvm.internal.g0.p(struct, "struct");
            protocol.g6("SearchPageResource");
            protocol.Q6("title", 1, (byte) 11);
            protocol.p1(struct.f101735a);
            protocol.N2();
            if (struct.f101736b != null) {
                protocol.Q6("sub_title", 2, (byte) 11);
                protocol.p1(struct.f101736b);
                protocol.N2();
            }
            if (struct.f101737c != null) {
                protocol.Q6("image", 3, (byte) 11);
                protocol.p1(struct.f101737c);
                protocol.N2();
            }
            protocol.Q6(y9.b.f99687c, 4, (byte) 11);
            protocol.p1(struct.f101738d);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public l0(@m80.k String title, @m80.l String str, @m80.l String str2, @m80.k String link) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(link, "link");
        this.f101735a = title;
        this.f101736b = str;
        this.f101737c = str2;
        this.f101738d = link;
    }

    public static /* synthetic */ l0 f(l0 l0Var, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = l0Var.f101735a;
        }
        if ((i11 & 2) != 0) {
            str2 = l0Var.f101736b;
        }
        if ((i11 & 4) != 0) {
            str3 = l0Var.f101737c;
        }
        if ((i11 & 8) != 0) {
            str4 = l0Var.f101738d;
        }
        return l0Var.e(str, str2, str3, str4);
    }

    @m80.k
    public final String a() {
        return this.f101735a;
    }

    @m80.l
    public final String b() {
        return this.f101736b;
    }

    @m80.l
    public final String c() {
        return this.f101737c;
    }

    @m80.k
    public final String d() {
        return this.f101738d;
    }

    @m80.k
    public final l0 e(@m80.k String title, @m80.l String str, @m80.l String str2, @m80.k String link) {
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(link, "link");
        return new l0(title, str, str2, link);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return kotlin.jvm.internal.g0.g(this.f101735a, l0Var.f101735a) && kotlin.jvm.internal.g0.g(this.f101736b, l0Var.f101736b) && kotlin.jvm.internal.g0.g(this.f101737c, l0Var.f101737c) && kotlin.jvm.internal.g0.g(this.f101738d, l0Var.f101738d);
    }

    public int hashCode() {
        int hashCode = this.f101735a.hashCode() * 31;
        String str = this.f101736b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f101737c;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f101738d.hashCode();
    }

    @m80.k
    public String toString() {
        return "SearchPageResource(title=" + this.f101735a + ", sub_title=" + this.f101736b + ", image=" + this.f101737c + ", link=" + this.f101738d + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        kotlin.jvm.internal.g0.p(protocol, "protocol");
        f101734f.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nSearchPageResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchPageResource.kt\ncom/baicizhan/biz/online/user_study_api/SearchPageResource$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n1#2:175\n*E\n"})
    public static final class a implements ts.f<l0> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f101739a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f101740b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f101741c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f101742d;

        public a() {
            this.f101739a = null;
            this.f101740b = null;
            this.f101741c = null;
            this.f101742d = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l0 build() {
            String str = this.f101739a;
            if (str == null) {
                throw new IllegalStateException("Required field 'title' is missing");
            }
            String str2 = this.f101740b;
            String str3 = this.f101741c;
            String str4 = this.f101742d;
            if (str4 != null) {
                return new l0(str, str2, str3, str4);
            }
            throw new IllegalStateException("Required field 'link' is missing");
        }

        @m80.k
        public final a b(@m80.l String str) {
            this.f101741c = str;
            return this;
        }

        @m80.k
        public final a c(@m80.k String link) {
            kotlin.jvm.internal.g0.p(link, "link");
            this.f101742d = link;
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f101740b = str;
            return this;
        }

        @m80.k
        public final a e(@m80.k String title) {
            kotlin.jvm.internal.g0.p(title, "title");
            this.f101739a = title;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f101739a = null;
            this.f101740b = null;
            this.f101741c = null;
            this.f101742d = null;
        }

        public a(@m80.k l0 source) {
            kotlin.jvm.internal.g0.p(source, "source");
            this.f101739a = source.f101735a;
            this.f101740b = source.f101736b;
            this.f101741c = source.f101737c;
            this.f101742d = source.f101738d;
        }
    }
}
