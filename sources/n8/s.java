package n8;

import com.tencent.open.SocialConstants;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class s implements ts.e {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final c f74872d = new c(null);

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<s, b> f74873e = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74874a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74875b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f74876c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<s, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public s read(@m80.k ws.i protocol, @m80.k b builder) {
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
                        builder.b(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 11) {
                    builder.c(protocol.readString());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k s struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BBWordShareInfo");
            protocol.Q6("title", 1, (byte) 11);
            protocol.p1(struct.f74874a);
            protocol.N2();
            protocol.Q6(SocialConstants.PARAM_APP_DESC, 2, (byte) 11);
            protocol.p1(struct.f74875b);
            protocol.N2();
            protocol.Q6("url", 3, (byte) 11);
            protocol.p1(struct.f74876c);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(kotlin.jvm.internal.v vVar) {
            this();
        }

        public c() {
        }
    }

    public s(@m80.k String title, @m80.k String desc, @m80.k String url) {
        g0.p(title, "title");
        g0.p(desc, "desc");
        g0.p(url, "url");
        this.f74874a = title;
        this.f74875b = desc;
        this.f74876c = url;
    }

    public static /* synthetic */ s e(s sVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sVar.f74874a;
        }
        if ((i11 & 2) != 0) {
            str2 = sVar.f74875b;
        }
        if ((i11 & 4) != 0) {
            str3 = sVar.f74876c;
        }
        return sVar.d(str, str2, str3);
    }

    @m80.k
    public final String a() {
        return this.f74874a;
    }

    @m80.k
    public final String b() {
        return this.f74875b;
    }

    @m80.k
    public final String c() {
        return this.f74876c;
    }

    @m80.k
    public final s d(@m80.k String title, @m80.k String desc, @m80.k String url) {
        g0.p(title, "title");
        g0.p(desc, "desc");
        g0.p(url, "url");
        return new s(title, desc, url);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return g0.g(this.f74874a, sVar.f74874a) && g0.g(this.f74875b, sVar.f74875b) && g0.g(this.f74876c, sVar.f74876c);
    }

    public int hashCode() {
        return (((this.f74874a.hashCode() * 31) + this.f74875b.hashCode()) * 31) + this.f74876c.hashCode();
    }

    @m80.k
    public String toString() {
        return "BBWordShareInfo(title=" + this.f74874a + ", desc=" + this.f74875b + ", url=" + this.f74876c + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f74873e.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBBWordShareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BBWordShareInfo.kt\ncom/baicizhan/biz/online/bs_words/BBWordShareInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,144:1\n1#2:145\n*E\n"})
    public static final class b implements ts.f<s> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f74877a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f74878b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f74879c;

        public b() {
            this.f74877a = null;
            this.f74878b = null;
            this.f74879c = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public s build() {
            String str = this.f74877a;
            if (str == null) {
                throw new IllegalStateException("Required field 'title' is missing");
            }
            String str2 = this.f74878b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'desc' is missing");
            }
            String str3 = this.f74879c;
            if (str3 != null) {
                return new s(str, str2, str3);
            }
            throw new IllegalStateException("Required field 'url' is missing");
        }

        @m80.k
        public final b b(@m80.k String desc) {
            g0.p(desc, "desc");
            this.f74878b = desc;
            return this;
        }

        @m80.k
        public final b c(@m80.k String title) {
            g0.p(title, "title");
            this.f74877a = title;
            return this;
        }

        @m80.k
        public final b d(@m80.k String url) {
            g0.p(url, "url");
            this.f74879c = url;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f74877a = null;
            this.f74878b = null;
            this.f74879c = null;
        }

        public b(@m80.k s source) {
            g0.p(source, "source");
            this.f74877a = source.f74874a;
            this.f74878b = source.f74875b;
            this.f74879c = source.f74876c;
        }
    }
}
