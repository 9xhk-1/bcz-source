package x8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class c implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final b f97700f = new b(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<c, a> f97701g = new C1314c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @k
    public final String f97702a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f97703b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public final String f97704c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @k
    public final String f97705d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @k
    public final String f97706e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(v vVar) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: x8.c$c, reason: collision with other inner class name */
    public static final class C1314c implements ts.a<c, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c read(@k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c read(@k ws.i protocol, @k a builder) {
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
                        builder.f(protocol.readString());
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
        public void write(@k ws.i protocol, @k c struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("ExplorationItem");
            protocol.Q6("icon_url", 1, (byte) 11);
            protocol.p1(struct.f97702a);
            protocol.N2();
            protocol.Q6("title", 2, (byte) 11);
            protocol.p1(struct.f97703b);
            protocol.N2();
            protocol.Q6("subtitle", 3, (byte) 11);
            protocol.p1(struct.f97704c);
            protocol.N2();
            protocol.Q6(md.j.f73126f, 4, (byte) 11);
            protocol.p1(struct.f97705d);
            protocol.N2();
            protocol.Q6("item_tag", 5, (byte) 11);
            protocol.p1(struct.f97706e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    public c(@k String icon_url, @k String title, @k String subtitle, @k String jump_url, @k String item_tag) {
        g0.p(icon_url, "icon_url");
        g0.p(title, "title");
        g0.p(subtitle, "subtitle");
        g0.p(jump_url, "jump_url");
        g0.p(item_tag, "item_tag");
        this.f97702a = icon_url;
        this.f97703b = title;
        this.f97704c = subtitle;
        this.f97705d = jump_url;
        this.f97706e = item_tag;
    }

    public static /* synthetic */ c g(c cVar, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cVar.f97702a;
        }
        if ((i11 & 2) != 0) {
            str2 = cVar.f97703b;
        }
        if ((i11 & 4) != 0) {
            str3 = cVar.f97704c;
        }
        if ((i11 & 8) != 0) {
            str4 = cVar.f97705d;
        }
        if ((i11 & 16) != 0) {
            str5 = cVar.f97706e;
        }
        String str6 = str5;
        String str7 = str3;
        return cVar.f(str, str2, str7, str4, str6);
    }

    @k
    public final String a() {
        return this.f97702a;
    }

    @k
    public final String b() {
        return this.f97703b;
    }

    @k
    public final String c() {
        return this.f97704c;
    }

    @k
    public final String d() {
        return this.f97705d;
    }

    @k
    public final String e() {
        return this.f97706e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return g0.g(this.f97702a, cVar.f97702a) && g0.g(this.f97703b, cVar.f97703b) && g0.g(this.f97704c, cVar.f97704c) && g0.g(this.f97705d, cVar.f97705d) && g0.g(this.f97706e, cVar.f97706e);
    }

    @k
    public final c f(@k String icon_url, @k String title, @k String subtitle, @k String jump_url, @k String item_tag) {
        g0.p(icon_url, "icon_url");
        g0.p(title, "title");
        g0.p(subtitle, "subtitle");
        g0.p(jump_url, "jump_url");
        g0.p(item_tag, "item_tag");
        return new c(icon_url, title, subtitle, jump_url, item_tag);
    }

    public int hashCode() {
        return (((((((this.f97702a.hashCode() * 31) + this.f97703b.hashCode()) * 31) + this.f97704c.hashCode()) * 31) + this.f97705d.hashCode()) * 31) + this.f97706e.hashCode();
    }

    @k
    public String toString() {
        return "ExplorationItem(icon_url=" + this.f97702a + ", title=" + this.f97703b + ", subtitle=" + this.f97704c + ", jump_url=" + this.f97705d + ", item_tag=" + this.f97706e + ')';
    }

    @Override // ts.e
    public void write(@k ws.i protocol) {
        g0.p(protocol, "protocol");
        f97701g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nExplorationItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExplorationItem.kt\ncom/baicizhan/biz/online/user_assistant_api/ExplorationItem$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n1#2:195\n*E\n"})
    public static final class a implements ts.f<c> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public String f97707a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f97708b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f97709c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f97710d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public String f97711e;

        public a() {
            this.f97707a = null;
            this.f97708b = null;
            this.f97709c = null;
            this.f97710d = null;
            this.f97711e = null;
        }

        @Override // ts.f
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c build() {
            String str = this.f97707a;
            if (str == null) {
                throw new IllegalStateException("Required field 'icon_url' is missing");
            }
            String str2 = this.f97708b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'title' is missing");
            }
            String str3 = this.f97709c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'subtitle' is missing");
            }
            String str4 = this.f97710d;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'jump_url' is missing");
            }
            String str5 = this.f97711e;
            if (str5 != null) {
                return new c(str, str2, str3, str4, str5);
            }
            throw new IllegalStateException("Required field 'item_tag' is missing");
        }

        @k
        public final a b(@k String icon_url) {
            g0.p(icon_url, "icon_url");
            this.f97707a = icon_url;
            return this;
        }

        @k
        public final a c(@k String item_tag) {
            g0.p(item_tag, "item_tag");
            this.f97711e = item_tag;
            return this;
        }

        @k
        public final a d(@k String jump_url) {
            g0.p(jump_url, "jump_url");
            this.f97710d = jump_url;
            return this;
        }

        @k
        public final a e(@k String subtitle) {
            g0.p(subtitle, "subtitle");
            this.f97709c = subtitle;
            return this;
        }

        @k
        public final a f(@k String title) {
            g0.p(title, "title");
            this.f97708b = title;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f97707a = null;
            this.f97708b = null;
            this.f97709c = null;
            this.f97710d = null;
            this.f97711e = null;
        }

        public a(@k c source) {
            g0.p(source, "source");
            this.f97707a = source.f97702a;
            this.f97708b = source.f97703b;
            this.f97709c = source.f97704c;
            this.f97710d = source.f97705d;
            this.f97711e = source.f97706e;
        }
    }
}
