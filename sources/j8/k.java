package j8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class k implements ts.e {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final c f63826f = new c(null);

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<k, b> f63827g = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final boolean f63828a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63829b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63830c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63831d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63832e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<k, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k read(@m80.k ws.i protocol, @m80.k b builder) {
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
                        builder.c(protocol.readString());
                    } else {
                        at.b.a(protocol, b11);
                    }
                } else if (b11 == 2) {
                    builder.b(protocol.readBool());
                } else {
                    at.b.a(protocol, b11);
                }
                protocol.A7();
            }
        }

        @Override // ts.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void write(@m80.k ws.i protocol, @m80.k k struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("BczVersionInfo");
            protocol.Q6("has_new_version", 1, (byte) 2);
            protocol.a4(struct.f63828a);
            protocol.N2();
            protocol.Q6("new_version", 2, (byte) 11);
            protocol.p1(struct.f63829b);
            protocol.N2();
            protocol.Q6("version_url", 3, (byte) 11);
            protocol.p1(struct.f63830c);
            protocol.N2();
            protocol.Q6("version_md5", 4, (byte) 11);
            protocol.p1(struct.f63831d);
            protocol.N2();
            protocol.Q6("version_description", 5, (byte) 11);
            protocol.p1(struct.f63832e);
            protocol.N2();
            protocol.r0();
            protocol.E6();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {
        public /* synthetic */ c(v vVar) {
            this();
        }

        public c() {
        }
    }

    public k(boolean z11, @m80.k String new_version, @m80.k String version_url, @m80.k String version_md5, @m80.k String version_description) {
        g0.p(new_version, "new_version");
        g0.p(version_url, "version_url");
        g0.p(version_md5, "version_md5");
        g0.p(version_description, "version_description");
        this.f63828a = z11;
        this.f63829b = new_version;
        this.f63830c = version_url;
        this.f63831d = version_md5;
        this.f63832e = version_description;
    }

    public static /* synthetic */ k g(k kVar, boolean z11, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = kVar.f63828a;
        }
        if ((i11 & 2) != 0) {
            str = kVar.f63829b;
        }
        if ((i11 & 4) != 0) {
            str2 = kVar.f63830c;
        }
        if ((i11 & 8) != 0) {
            str3 = kVar.f63831d;
        }
        if ((i11 & 16) != 0) {
            str4 = kVar.f63832e;
        }
        String str5 = str4;
        String str6 = str2;
        return kVar.f(z11, str, str6, str3, str5);
    }

    public final boolean a() {
        return this.f63828a;
    }

    @m80.k
    public final String b() {
        return this.f63829b;
    }

    @m80.k
    public final String c() {
        return this.f63830c;
    }

    @m80.k
    public final String d() {
        return this.f63831d;
    }

    @m80.k
    public final String e() {
        return this.f63832e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f63828a == kVar.f63828a && g0.g(this.f63829b, kVar.f63829b) && g0.g(this.f63830c, kVar.f63830c) && g0.g(this.f63831d, kVar.f63831d) && g0.g(this.f63832e, kVar.f63832e);
    }

    @m80.k
    public final k f(boolean z11, @m80.k String new_version, @m80.k String version_url, @m80.k String version_md5, @m80.k String version_description) {
        g0.p(new_version, "new_version");
        g0.p(version_url, "version_url");
        g0.p(version_md5, "version_md5");
        g0.p(version_description, "version_description");
        return new k(z11, new_version, version_url, version_md5, version_description);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f63828a) * 31) + this.f63829b.hashCode()) * 31) + this.f63830c.hashCode()) * 31) + this.f63831d.hashCode()) * 31) + this.f63832e.hashCode();
    }

    @m80.k
    public String toString() {
        return "BczVersionInfo(has_new_version=" + this.f63828a + ", new_version=" + this.f63829b + ", version_url=" + this.f63830c + ", version_md5=" + this.f63831d + ", version_description=" + this.f63832e + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63827g.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nBczVersionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczVersionInfo.kt\ncom/baicizhan/biz/online/bcz_system_api/BczVersionInfo$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,212:1\n1#2:213\n*E\n"})
    public static final class b implements ts.f<k> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Boolean f63833a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f63834b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f63835c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f63836d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f63837e;

        public b() {
            this.f63833a = null;
            this.f63834b = null;
            this.f63835c = null;
            this.f63836d = null;
            this.f63837e = null;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k build() {
            Boolean bool = this.f63833a;
            if (bool == null) {
                throw new IllegalStateException("Required field 'has_new_version' is missing");
            }
            boolean booleanValue = bool.booleanValue();
            String str = this.f63834b;
            if (str == null) {
                throw new IllegalStateException("Required field 'new_version' is missing");
            }
            String str2 = this.f63835c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'version_url' is missing");
            }
            String str3 = this.f63836d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'version_md5' is missing");
            }
            String str4 = this.f63837e;
            if (str4 != null) {
                return new k(booleanValue, str, str2, str3, str4);
            }
            throw new IllegalStateException("Required field 'version_description' is missing");
        }

        @m80.k
        public final b b(boolean z11) {
            this.f63833a = Boolean.valueOf(z11);
            return this;
        }

        @m80.k
        public final b c(@m80.k String new_version) {
            g0.p(new_version, "new_version");
            this.f63834b = new_version;
            return this;
        }

        @m80.k
        public final b d(@m80.k String version_description) {
            g0.p(version_description, "version_description");
            this.f63837e = version_description;
            return this;
        }

        @m80.k
        public final b e(@m80.k String version_md5) {
            g0.p(version_md5, "version_md5");
            this.f63836d = version_md5;
            return this;
        }

        @m80.k
        public final b f(@m80.k String version_url) {
            g0.p(version_url, "version_url");
            this.f63835c = version_url;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63833a = null;
            this.f63834b = null;
            this.f63835c = null;
            this.f63836d = null;
            this.f63837e = null;
        }

        public b(@m80.k k source) {
            g0.p(source, "source");
            this.f63833a = Boolean.valueOf(source.f63828a);
            this.f63834b = source.f63829b;
            this.f63835c = source.f63830c;
            this.f63836d = source.f63831d;
            this.f63837e = source.f63832e;
        }
    }
}
