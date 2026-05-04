package t8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final C1193b f89985d = new C1193b(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b, a> f89986e = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final s f89987a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f89988b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f89989c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: t8.b$b, reason: collision with other inner class name */
    public static final class C1193b {
        public /* synthetic */ C1193b(kotlin.jvm.internal.v vVar) {
            this();
        }

        public C1193b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<b, a> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol, @m80.k a builder) {
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
                } else if (b11 == 12) {
                    builder.b(s.f90241k.read(protocol));
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("DictWiki");
            protocol.Q6("dict", 1, (byte) 12);
            s.f90241k.write(protocol, struct.f89987a);
            protocol.N2();
            if (struct.f89988b != null) {
                protocol.Q6("origin_word", 2, (byte) 11);
                protocol.p1(struct.f89988b);
                protocol.N2();
            }
            if (struct.f89989c != null) {
                protocol.Q6("variant_type", 3, (byte) 11);
                protocol.p1(struct.f89989c);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public b(@m80.k s dict, @m80.l String str, @m80.l String str2) {
        g0.p(dict, "dict");
        this.f89987a = dict;
        this.f89988b = str;
        this.f89989c = str2;
    }

    public static /* synthetic */ b e(b bVar, s sVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sVar = bVar.f89987a;
        }
        if ((i11 & 2) != 0) {
            str = bVar.f89988b;
        }
        if ((i11 & 4) != 0) {
            str2 = bVar.f89989c;
        }
        return bVar.d(sVar, str, str2);
    }

    @m80.k
    public final s a() {
        return this.f89987a;
    }

    @m80.l
    public final String b() {
        return this.f89988b;
    }

    @m80.l
    public final String c() {
        return this.f89989c;
    }

    @m80.k
    public final b d(@m80.k s dict, @m80.l String str, @m80.l String str2) {
        g0.p(dict, "dict");
        return new b(dict, str, str2);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return g0.g(this.f89987a, bVar.f89987a) && g0.g(this.f89988b, bVar.f89988b) && g0.g(this.f89989c, bVar.f89989c);
    }

    public int hashCode() {
        int hashCode = this.f89987a.hashCode() * 31;
        String str = this.f89988b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f89989c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "DictWiki(dict=" + this.f89987a + ", origin_word=" + this.f89988b + ", variant_type=" + this.f89989c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f89986e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDictWiki.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DictWiki.kt\ncom/baicizhan/biz/online/resource_api/DictWiki$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n1#2:151\n*E\n"})
    public static final class a implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public s f89990a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f89991b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f89992c;

        public a() {
            this.f89990a = null;
            this.f89991b = null;
            this.f89992c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b build() {
            s sVar = this.f89990a;
            if (sVar != null) {
                return new b(sVar, this.f89991b, this.f89992c);
            }
            throw new IllegalStateException("Required field 'dict' is missing");
        }

        @m80.k
        public final a b(@m80.k s dict) {
            g0.p(dict, "dict");
            this.f89990a = dict;
            return this;
        }

        @m80.k
        public final a c(@m80.l String str) {
            this.f89991b = str;
            return this;
        }

        @m80.k
        public final a d(@m80.l String str) {
            this.f89992c = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f89990a = null;
            this.f89991b = null;
            this.f89992c = null;
        }

        public a(@m80.k b source) {
            g0.p(source, "source");
            this.f89990a = source.f89987a;
            this.f89991b = source.f89988b;
            this.f89992c = source.f89989c;
        }
    }
}
