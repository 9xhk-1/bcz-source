package j8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class b implements ts.e {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final c f63724i = new c(null);

    /* renamed from: j, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<b, C0739b> f63725j = new a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public final int f63726a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63727b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63728c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63729d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63730e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f63731f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    @w00.g
    public final String f63732g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    @w00.g
    public final Integer f63733h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ts.a<b, C0739b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new C0739b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b read(@m80.k ws.i protocol, @m80.k C0739b builder) {
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
                            builder.f(protocol.s8());
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
                            builder.i(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(Integer.valueOf(protocol.s8()));
                            break;
                        }
                    case 7:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 8:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.c(Integer.valueOf(protocol.s8()));
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
        public void write(@m80.k ws.i protocol, @m80.k b struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AppBetaUpdateResult");
            protocol.Q6("type", 1, (byte) 8);
            protocol.l5(struct.f63726a);
            protocol.N2();
            protocol.Q6("version_description", 2, (byte) 11);
            protocol.p1(struct.f63727b);
            protocol.N2();
            protocol.Q6("version_url", 3, (byte) 11);
            protocol.p1(struct.f63728c);
            protocol.N2();
            protocol.Q6("version_apk_md5", 4, (byte) 11);
            protocol.p1(struct.f63729d);
            protocol.N2();
            protocol.Q6("new_version", 5, (byte) 11);
            protocol.p1(struct.f63730e);
            protocol.N2();
            if (struct.f63731f != null) {
                protocol.Q6("action_type", 6, (byte) 8);
                protocol.l5(struct.f63731f.intValue());
                protocol.N2();
            }
            if (struct.f63732g != null) {
                protocol.Q6(y9.b.f99687c, 7, (byte) 11);
                protocol.p1(struct.f63732g);
                protocol.N2();
            }
            if (struct.f63733h != null) {
                protocol.Q6("image_index", 8, (byte) 8);
                protocol.l5(struct.f63733h.intValue());
                protocol.N2();
            }
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

    public b(int i11, @m80.k String version_description, @m80.k String version_url, @m80.k String version_apk_md5, @m80.k String new_version, @m80.l Integer num, @m80.l String str, @m80.l Integer num2) {
        g0.p(version_description, "version_description");
        g0.p(version_url, "version_url");
        g0.p(version_apk_md5, "version_apk_md5");
        g0.p(new_version, "new_version");
        this.f63726a = i11;
        this.f63727b = version_description;
        this.f63728c = version_url;
        this.f63729d = version_apk_md5;
        this.f63730e = new_version;
        this.f63731f = num;
        this.f63732g = str;
        this.f63733h = num2;
    }

    public static /* synthetic */ b j(b bVar, int i11, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = bVar.f63726a;
        }
        if ((i12 & 2) != 0) {
            str = bVar.f63727b;
        }
        if ((i12 & 4) != 0) {
            str2 = bVar.f63728c;
        }
        if ((i12 & 8) != 0) {
            str3 = bVar.f63729d;
        }
        if ((i12 & 16) != 0) {
            str4 = bVar.f63730e;
        }
        if ((i12 & 32) != 0) {
            num = bVar.f63731f;
        }
        if ((i12 & 64) != 0) {
            str5 = bVar.f63732g;
        }
        if ((i12 & 128) != 0) {
            num2 = bVar.f63733h;
        }
        String str6 = str5;
        Integer num3 = num2;
        String str7 = str4;
        Integer num4 = num;
        return bVar.i(i11, str, str2, str3, str7, num4, str6, num3);
    }

    public final int a() {
        return this.f63726a;
    }

    @m80.k
    public final String b() {
        return this.f63727b;
    }

    @m80.k
    public final String c() {
        return this.f63728c;
    }

    @m80.k
    public final String d() {
        return this.f63729d;
    }

    @m80.k
    public final String e() {
        return this.f63730e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f63726a == bVar.f63726a && g0.g(this.f63727b, bVar.f63727b) && g0.g(this.f63728c, bVar.f63728c) && g0.g(this.f63729d, bVar.f63729d) && g0.g(this.f63730e, bVar.f63730e) && g0.g(this.f63731f, bVar.f63731f) && g0.g(this.f63732g, bVar.f63732g) && g0.g(this.f63733h, bVar.f63733h);
    }

    @m80.l
    public final Integer f() {
        return this.f63731f;
    }

    @m80.l
    public final String g() {
        return this.f63732g;
    }

    @m80.l
    public final Integer h() {
        return this.f63733h;
    }

    public int hashCode() {
        int hashCode = ((((((((Integer.hashCode(this.f63726a) * 31) + this.f63727b.hashCode()) * 31) + this.f63728c.hashCode()) * 31) + this.f63729d.hashCode()) * 31) + this.f63730e.hashCode()) * 31;
        Integer num = this.f63731f;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f63732g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f63733h;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    @m80.k
    public final b i(int i11, @m80.k String version_description, @m80.k String version_url, @m80.k String version_apk_md5, @m80.k String new_version, @m80.l Integer num, @m80.l String str, @m80.l Integer num2) {
        g0.p(version_description, "version_description");
        g0.p(version_url, "version_url");
        g0.p(version_apk_md5, "version_apk_md5");
        g0.p(new_version, "new_version");
        return new b(i11, version_description, version_url, version_apk_md5, new_version, num, str, num2);
    }

    @m80.k
    public String toString() {
        return "AppBetaUpdateResult(type=" + this.f63726a + ", version_description=" + this.f63727b + ", version_url=" + this.f63728c + ", version_apk_md5=" + this.f63729d + ", new_version=" + this.f63730e + ", action_type=" + this.f63731f + ", link=" + this.f63732g + ", image_index=" + this.f63733h + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63725j.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAppBetaUpdateResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBetaUpdateResult.kt\ncom/baicizhan/biz/online/bcz_system_api/AppBetaUpdateResult$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
    /* renamed from: j8.b$b, reason: collision with other inner class name */
    public static final class C0739b implements ts.f<b> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public Integer f63734a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f63735b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f63736c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f63737d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f63738e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public Integer f63739f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public String f63740g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public Integer f63741h;

        public C0739b() {
            this.f63734a = null;
            this.f63735b = null;
            this.f63736c = null;
            this.f63737d = null;
            this.f63738e = null;
            this.f63739f = null;
            this.f63740g = null;
            this.f63741h = null;
        }

        @m80.k
        public final C0739b a(@m80.l Integer num) {
            this.f63739f = num;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b build() {
            Integer num = this.f63734a;
            if (num == null) {
                throw new IllegalStateException("Required field 'type' is missing");
            }
            int intValue = num.intValue();
            String str = this.f63735b;
            if (str == null) {
                throw new IllegalStateException("Required field 'version_description' is missing");
            }
            String str2 = this.f63736c;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'version_url' is missing");
            }
            String str3 = this.f63737d;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'version_apk_md5' is missing");
            }
            String str4 = this.f63738e;
            if (str4 != null) {
                return new b(intValue, str, str2, str3, str4, this.f63739f, this.f63740g, this.f63741h);
            }
            throw new IllegalStateException("Required field 'new_version' is missing");
        }

        @m80.k
        public final C0739b c(@m80.l Integer num) {
            this.f63741h = num;
            return this;
        }

        @m80.k
        public final C0739b d(@m80.l String str) {
            this.f63740g = str;
            return this;
        }

        @m80.k
        public final C0739b e(@m80.k String new_version) {
            g0.p(new_version, "new_version");
            this.f63738e = new_version;
            return this;
        }

        @m80.k
        public final C0739b f(int i11) {
            this.f63734a = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final C0739b g(@m80.k String version_apk_md5) {
            g0.p(version_apk_md5, "version_apk_md5");
            this.f63737d = version_apk_md5;
            return this;
        }

        @m80.k
        public final C0739b h(@m80.k String version_description) {
            g0.p(version_description, "version_description");
            this.f63735b = version_description;
            return this;
        }

        @m80.k
        public final C0739b i(@m80.k String version_url) {
            g0.p(version_url, "version_url");
            this.f63736c = version_url;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63734a = null;
            this.f63735b = null;
            this.f63736c = null;
            this.f63737d = null;
            this.f63738e = null;
            this.f63739f = null;
            this.f63740g = null;
            this.f63741h = null;
        }

        public C0739b(@m80.k b source) {
            g0.p(source, "source");
            this.f63734a = Integer.valueOf(source.f63726a);
            this.f63735b = source.f63727b;
            this.f63736c = source.f63728c;
            this.f63737d = source.f63729d;
            this.f63738e = source.f63730e;
            this.f63739f = source.f63731f;
            this.f63740g = source.f63732g;
            this.f63741h = source.f63733h;
        }
    }
}
