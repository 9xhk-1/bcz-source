package r8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ws.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final C1042b f83596i = new C1042b(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @k
    public static final ts.a<b, a> f83597j = new c();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f83598a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @k
    public final String f83599b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @k
    public final String f83600c;

    /* renamed from: d, reason: collision with root package name */
    @l
    @w00.g
    public final String f83601d;

    /* renamed from: e, reason: collision with root package name */
    @l
    @w00.g
    public final String f83602e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @w00.g
    public final String f83603f;

    /* renamed from: g, reason: collision with root package name */
    @l
    @w00.g
    public final String f83604g;

    /* renamed from: h, reason: collision with root package name */
    @l
    @w00.g
    public final f8.b f83605h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: r8.b$b, reason: collision with other inner class name */
    public static final class C1042b {
        public /* synthetic */ C1042b(v vVar) {
            this();
        }

        public C1042b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements ts.a<b, a> {
        @Override // ts.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@k i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new a());
        }

        @Override // ts.a
        @k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@k i protocol, @k a builder) {
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
                switch (a62.f96797c) {
                    case 1:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 12) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(f8.b.f51265i.read(protocol));
                            break;
                        }
                    default:
                        at.b.a(protocol, b11);
                        break;
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@k i protocol, @k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("Notify");
            protocol.Q6("time", 1, (byte) 8);
            protocol.l5(struct.f83598a);
            protocol.N2();
            protocol.Q6("title", 2, (byte) 11);
            protocol.p1(struct.f83599b);
            protocol.N2();
            protocol.Q6("content", 3, (byte) 11);
            protocol.p1(struct.f83600c);
            protocol.N2();
            if (struct.f83601d != null) {
                protocol.Q6("url", 4, (byte) 11);
                protocol.p1(struct.f83601d);
                protocol.N2();
            }
            if (struct.f83602e != null) {
                protocol.Q6(com.baicizhan.main.activity.schedule_v2.e.f19255e, 5, (byte) 11);
                protocol.p1(struct.f83602e);
                protocol.N2();
            }
            if (struct.f83603f != null) {
                protocol.Q6("banner_img_url", 6, (byte) 11);
                protocol.p1(struct.f83603f);
                protocol.N2();
            }
            if (struct.f83604g != null) {
                protocol.Q6("aid", 7, (byte) 11);
                protocol.p1(struct.f83604g);
                protocol.N2();
            }
            if (struct.f83605h != null) {
                protocol.Q6("ad_resp", 8, (byte) 12);
                f8.b.f51265i.write(protocol, struct.f83605h);
                protocol.N2();
            }
            protocol.r0();
            protocol.E6();
        }
    }

    public b(int i11, @k String title, @k String content, @l String str, @l String str2, @l String str3, @l String str4, @l f8.b bVar) {
        g0.p(title, "title");
        g0.p(content, "content");
        this.f83598a = i11;
        this.f83599b = title;
        this.f83600c = content;
        this.f83601d = str;
        this.f83602e = str2;
        this.f83603f = str3;
        this.f83604g = str4;
        this.f83605h = bVar;
    }

    public static /* synthetic */ b j(b bVar, int i11, String str, String str2, String str3, String str4, String str5, String str6, f8.b bVar2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = bVar.f83598a;
        }
        if ((i12 & 2) != 0) {
            str = bVar.f83599b;
        }
        if ((i12 & 4) != 0) {
            str2 = bVar.f83600c;
        }
        if ((i12 & 8) != 0) {
            str3 = bVar.f83601d;
        }
        if ((i12 & 16) != 0) {
            str4 = bVar.f83602e;
        }
        if ((i12 & 32) != 0) {
            str5 = bVar.f83603f;
        }
        if ((i12 & 64) != 0) {
            str6 = bVar.f83604g;
        }
        if ((i12 & 128) != 0) {
            bVar2 = bVar.f83605h;
        }
        String str7 = str6;
        f8.b bVar3 = bVar2;
        String str8 = str4;
        String str9 = str5;
        return bVar.i(i11, str, str2, str3, str8, str9, str7, bVar3);
    }

    public final int a() {
        return this.f83598a;
    }

    @k
    public final String b() {
        return this.f83599b;
    }

    @k
    public final String c() {
        return this.f83600c;
    }

    @l
    public final String d() {
        return this.f83601d;
    }

    @l
    public final String e() {
        return this.f83602e;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f83598a == bVar.f83598a && g0.g(this.f83599b, bVar.f83599b) && g0.g(this.f83600c, bVar.f83600c) && g0.g(this.f83601d, bVar.f83601d) && g0.g(this.f83602e, bVar.f83602e) && g0.g(this.f83603f, bVar.f83603f) && g0.g(this.f83604g, bVar.f83604g) && g0.g(this.f83605h, bVar.f83605h);
    }

    @l
    public final String f() {
        return this.f83603f;
    }

    @l
    public final String g() {
        return this.f83604g;
    }

    @l
    public final f8.b h() {
        return this.f83605h;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f83598a) * 31) + this.f83599b.hashCode()) * 31) + this.f83600c.hashCode()) * 31;
        String str = this.f83601d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f83602e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f83603f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f83604g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        f8.b bVar = this.f83605h;
        return hashCode5 + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final b i(int i11, @k String title, @k String content, @l String str, @l String str2, @l String str3, @l String str4, @l f8.b bVar) {
        g0.p(title, "title");
        g0.p(content, "content");
        return new b(i11, title, content, str, str2, str3, str4, bVar);
    }

    @k
    public String toString() {
        return "Notify(time=" + this.f83598a + ", title=" + this.f83599b + ", content=" + this.f83600c + ", url=" + this.f83601d + ", img_url=" + this.f83602e + ", banner_img_url=" + this.f83603f + ", aid=" + this.f83604g + ", ad_resp=" + this.f83605h + ')';
    }

    @Override // ts.e
    public void write(@k i protocol) {
        g0.p(protocol, "protocol");
        f83597j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nNotify.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Notify.kt\ncom/baicizhan/biz/online/notify/Notify$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,287:1\n1#2:288\n*E\n"})
    public static final class a implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @l
        public Integer f83606a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public String f83607b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public String f83608c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public String f83609d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public String f83610e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public String f83611f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public String f83612g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public f8.b f83613h;

        public a() {
            this.f83606a = null;
            this.f83607b = null;
            this.f83608c = null;
            this.f83609d = null;
            this.f83610e = null;
            this.f83611f = null;
            this.f83612g = null;
            this.f83613h = null;
        }

        @k
        public final a a(@l f8.b bVar) {
            this.f83613h = bVar;
            return this;
        }

        @k
        public final a b(@l String str) {
            this.f83612g = str;
            return this;
        }

        @k
        public final a c(@l String str) {
            this.f83611f = str;
            return this;
        }

        @Override // ts.f
        @k
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b build() {
            Integer num = this.f83606a;
            if (num == null) {
                throw new IllegalStateException("Required field 'time' is missing");
            }
            int intValue = num.intValue();
            String str = this.f83607b;
            if (str == null) {
                throw new IllegalStateException("Required field 'title' is missing");
            }
            String str2 = this.f83608c;
            if (str2 != null) {
                return new b(intValue, str, str2, this.f83609d, this.f83610e, this.f83611f, this.f83612g, this.f83613h);
            }
            throw new IllegalStateException("Required field 'content' is missing");
        }

        @k
        public final a e(@k String content) {
            g0.p(content, "content");
            this.f83608c = content;
            return this;
        }

        @k
        public final a f(@l String str) {
            this.f83610e = str;
            return this;
        }

        @k
        public final a g(int i11) {
            this.f83606a = Integer.valueOf(i11);
            return this;
        }

        @k
        public final a h(@k String title) {
            g0.p(title, "title");
            this.f83607b = title;
            return this;
        }

        @k
        public final a i(@l String str) {
            this.f83609d = str;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f83606a = null;
            this.f83607b = null;
            this.f83608c = null;
            this.f83609d = null;
            this.f83610e = null;
            this.f83611f = null;
            this.f83612g = null;
            this.f83613h = null;
        }

        public a(@k b source) {
            g0.p(source, "source");
            this.f83606a = Integer.valueOf(source.f83598a);
            this.f83607b = source.f83599b;
            this.f83608c = source.f83600c;
            this.f83609d = source.f83601d;
            this.f83610e = source.f83602e;
            this.f83611f = source.f83603f;
            this.f83612g = source.f83604g;
            this.f83613h = source.f83605h;
        }
    }
}
