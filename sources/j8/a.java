package j8;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a implements ts.e {

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final c f63704j = new c(null);

    /* renamed from: k, reason: collision with root package name */
    @w00.g
    @m80.k
    public static final ts.a<a, b> f63705k = new C0738a();

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63706a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63707b;

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63708c;

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63709d;

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63710e;

    /* renamed from: f, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63711f;

    /* renamed from: g, reason: collision with root package name */
    @w00.g
    public final int f63712g;

    /* renamed from: h, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63713h;

    /* renamed from: i, reason: collision with root package name */
    @w00.g
    @m80.k
    public final String f63714i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: j8.a$a, reason: collision with other inner class name */
    public static final class C0738a implements ts.a<a, b> {
        @Override // ts.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol) {
            g0.p(protocol, "protocol");
            return read(protocol, new b());
        }

        @Override // ts.a
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a read(@m80.k ws.i protocol, @m80.k b builder) {
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
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.d(protocol.readString());
                            break;
                        }
                    case 2:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.e(protocol.readString());
                            break;
                        }
                    case 3:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.f(protocol.readString());
                            break;
                        }
                    case 4:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.h(protocol.readString());
                            break;
                        }
                    case 5:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.i(protocol.readString());
                            break;
                        }
                    case 6:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.j(protocol.readString());
                            break;
                        }
                    case 7:
                        if (b11 != 8) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.g(protocol.s8());
                            break;
                        }
                    case 8:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.a(protocol.readString());
                            break;
                        }
                    case 9:
                        if (b11 != 11) {
                            at.b.a(protocol, b11);
                            break;
                        } else {
                            builder.b(protocol.readString());
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
        public void write(@m80.k ws.i protocol, @m80.k a struct) {
            g0.p(protocol, "protocol");
            g0.p(struct, "struct");
            protocol.g6("AppBetaUpdateRequest");
            protocol.Q6("device_id", 1, (byte) 11);
            protocol.p1(struct.f63706a);
            protocol.N2();
            protocol.Q6("device_manufacturer", 2, (byte) 11);
            protocol.p1(struct.f63707b);
            protocol.N2();
            protocol.Q6("device_model", 3, (byte) 11);
            protocol.p1(struct.f63708c);
            protocol.N2();
            protocol.Q6("os_name", 4, (byte) 11);
            protocol.p1(struct.f63709d);
            protocol.N2();
            protocol.Q6("os_sdk", 5, (byte) 11);
            protocol.p1(struct.f63710e);
            protocol.N2();
            protocol.Q6("short_version", 6, (byte) 11);
            protocol.p1(struct.f63711f);
            protocol.N2();
            protocol.Q6("long_version", 7, (byte) 8);
            protocol.l5(struct.f63712g);
            protocol.N2();
            protocol.Q6("app_channel", 8, (byte) 11);
            protocol.p1(struct.f63713h);
            protocol.N2();
            protocol.Q6("app_name", 9, (byte) 11);
            protocol.p1(struct.f63714i);
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

    public a(@m80.k String device_id, @m80.k String device_manufacturer, @m80.k String device_model, @m80.k String os_name, @m80.k String os_sdk, @m80.k String short_version, int i11, @m80.k String app_channel, @m80.k String app_name) {
        g0.p(device_id, "device_id");
        g0.p(device_manufacturer, "device_manufacturer");
        g0.p(device_model, "device_model");
        g0.p(os_name, "os_name");
        g0.p(os_sdk, "os_sdk");
        g0.p(short_version, "short_version");
        g0.p(app_channel, "app_channel");
        g0.p(app_name, "app_name");
        this.f63706a = device_id;
        this.f63707b = device_manufacturer;
        this.f63708c = device_model;
        this.f63709d = os_name;
        this.f63710e = os_sdk;
        this.f63711f = short_version;
        this.f63712g = i11;
        this.f63713h = app_channel;
        this.f63714i = app_name;
    }

    public static /* synthetic */ a k(a aVar, String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = aVar.f63706a;
        }
        if ((i12 & 2) != 0) {
            str2 = aVar.f63707b;
        }
        if ((i12 & 4) != 0) {
            str3 = aVar.f63708c;
        }
        if ((i12 & 8) != 0) {
            str4 = aVar.f63709d;
        }
        if ((i12 & 16) != 0) {
            str5 = aVar.f63710e;
        }
        if ((i12 & 32) != 0) {
            str6 = aVar.f63711f;
        }
        if ((i12 & 64) != 0) {
            i11 = aVar.f63712g;
        }
        if ((i12 & 128) != 0) {
            str7 = aVar.f63713h;
        }
        if ((i12 & 256) != 0) {
            str8 = aVar.f63714i;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str6;
        int i13 = i11;
        String str12 = str5;
        String str13 = str3;
        return aVar.j(str, str2, str13, str4, str12, str11, i13, str9, str10);
    }

    @m80.k
    public final String a() {
        return this.f63706a;
    }

    @m80.k
    public final String b() {
        return this.f63707b;
    }

    @m80.k
    public final String c() {
        return this.f63708c;
    }

    @m80.k
    public final String d() {
        return this.f63709d;
    }

    @m80.k
    public final String e() {
        return this.f63710e;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return g0.g(this.f63706a, aVar.f63706a) && g0.g(this.f63707b, aVar.f63707b) && g0.g(this.f63708c, aVar.f63708c) && g0.g(this.f63709d, aVar.f63709d) && g0.g(this.f63710e, aVar.f63710e) && g0.g(this.f63711f, aVar.f63711f) && this.f63712g == aVar.f63712g && g0.g(this.f63713h, aVar.f63713h) && g0.g(this.f63714i, aVar.f63714i);
    }

    @m80.k
    public final String f() {
        return this.f63711f;
    }

    public final int g() {
        return this.f63712g;
    }

    @m80.k
    public final String h() {
        return this.f63713h;
    }

    public int hashCode() {
        return (((((((((((((((this.f63706a.hashCode() * 31) + this.f63707b.hashCode()) * 31) + this.f63708c.hashCode()) * 31) + this.f63709d.hashCode()) * 31) + this.f63710e.hashCode()) * 31) + this.f63711f.hashCode()) * 31) + Integer.hashCode(this.f63712g)) * 31) + this.f63713h.hashCode()) * 31) + this.f63714i.hashCode();
    }

    @m80.k
    public final String i() {
        return this.f63714i;
    }

    @m80.k
    public final a j(@m80.k String device_id, @m80.k String device_manufacturer, @m80.k String device_model, @m80.k String os_name, @m80.k String os_sdk, @m80.k String short_version, int i11, @m80.k String app_channel, @m80.k String app_name) {
        g0.p(device_id, "device_id");
        g0.p(device_manufacturer, "device_manufacturer");
        g0.p(device_model, "device_model");
        g0.p(os_name, "os_name");
        g0.p(os_sdk, "os_sdk");
        g0.p(short_version, "short_version");
        g0.p(app_channel, "app_channel");
        g0.p(app_name, "app_name");
        return new a(device_id, device_manufacturer, device_model, os_name, os_sdk, short_version, i11, app_channel, app_name);
    }

    @m80.k
    public String toString() {
        return "AppBetaUpdateRequest(device_id=" + this.f63706a + ", device_manufacturer=" + this.f63707b + ", device_model=" + this.f63708c + ", os_name=" + this.f63709d + ", os_sdk=" + this.f63710e + ", short_version=" + this.f63711f + ", long_version=" + this.f63712g + ", app_channel=" + this.f63713h + ", app_name=" + this.f63714i + ')';
    }

    @Override // ts.e
    public void write(@m80.k ws.i protocol) {
        g0.p(protocol, "protocol");
        f63705k.write(protocol, this);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAppBetaUpdateRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBetaUpdateRequest.kt\ncom/baicizhan/biz/online/bcz_system_api/AppBetaUpdateRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,323:1\n1#2:324\n*E\n"})
    public static final class b implements ts.f<a> {

        /* renamed from: a, reason: collision with root package name */
        @m80.l
        public String f63715a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public String f63716b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public String f63717c;

        /* renamed from: d, reason: collision with root package name */
        @m80.l
        public String f63718d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public String f63719e;

        /* renamed from: f, reason: collision with root package name */
        @m80.l
        public String f63720f;

        /* renamed from: g, reason: collision with root package name */
        @m80.l
        public Integer f63721g;

        /* renamed from: h, reason: collision with root package name */
        @m80.l
        public String f63722h;

        /* renamed from: i, reason: collision with root package name */
        @m80.l
        public String f63723i;

        public b() {
            this.f63715a = null;
            this.f63716b = null;
            this.f63717c = null;
            this.f63718d = null;
            this.f63719e = null;
            this.f63720f = null;
            this.f63721g = null;
            this.f63722h = null;
            this.f63723i = null;
        }

        @m80.k
        public final b a(@m80.k String app_channel) {
            g0.p(app_channel, "app_channel");
            this.f63722h = app_channel;
            return this;
        }

        @m80.k
        public final b b(@m80.k String app_name) {
            g0.p(app_name, "app_name");
            this.f63723i = app_name;
            return this;
        }

        @Override // ts.f
        @m80.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a build() {
            String str = this.f63715a;
            if (str == null) {
                throw new IllegalStateException("Required field 'device_id' is missing");
            }
            String str2 = this.f63716b;
            if (str2 == null) {
                throw new IllegalStateException("Required field 'device_manufacturer' is missing");
            }
            String str3 = this.f63717c;
            if (str3 == null) {
                throw new IllegalStateException("Required field 'device_model' is missing");
            }
            String str4 = this.f63718d;
            if (str4 == null) {
                throw new IllegalStateException("Required field 'os_name' is missing");
            }
            String str5 = this.f63719e;
            if (str5 == null) {
                throw new IllegalStateException("Required field 'os_sdk' is missing");
            }
            String str6 = this.f63720f;
            if (str6 == null) {
                throw new IllegalStateException("Required field 'short_version' is missing");
            }
            Integer num = this.f63721g;
            if (num == null) {
                throw new IllegalStateException("Required field 'long_version' is missing");
            }
            int intValue = num.intValue();
            String str7 = this.f63722h;
            if (str7 == null) {
                throw new IllegalStateException("Required field 'app_channel' is missing");
            }
            String str8 = this.f63723i;
            if (str8 != null) {
                return new a(str, str2, str3, str4, str5, str6, intValue, str7, str8);
            }
            throw new IllegalStateException("Required field 'app_name' is missing");
        }

        @m80.k
        public final b d(@m80.k String device_id) {
            g0.p(device_id, "device_id");
            this.f63715a = device_id;
            return this;
        }

        @m80.k
        public final b e(@m80.k String device_manufacturer) {
            g0.p(device_manufacturer, "device_manufacturer");
            this.f63716b = device_manufacturer;
            return this;
        }

        @m80.k
        public final b f(@m80.k String device_model) {
            g0.p(device_model, "device_model");
            this.f63717c = device_model;
            return this;
        }

        @m80.k
        public final b g(int i11) {
            this.f63721g = Integer.valueOf(i11);
            return this;
        }

        @m80.k
        public final b h(@m80.k String os_name) {
            g0.p(os_name, "os_name");
            this.f63718d = os_name;
            return this;
        }

        @m80.k
        public final b i(@m80.k String os_sdk) {
            g0.p(os_sdk, "os_sdk");
            this.f63719e = os_sdk;
            return this;
        }

        @m80.k
        public final b j(@m80.k String short_version) {
            g0.p(short_version, "short_version");
            this.f63720f = short_version;
            return this;
        }

        @Override // ts.f
        public void reset() {
            this.f63715a = null;
            this.f63716b = null;
            this.f63717c = null;
            this.f63718d = null;
            this.f63719e = null;
            this.f63720f = null;
            this.f63721g = null;
            this.f63722h = null;
            this.f63723i = null;
        }

        public b(@m80.k a source) {
            g0.p(source, "source");
            this.f63715a = source.f63706a;
            this.f63716b = source.f63707b;
            this.f63717c = source.f63708c;
            this.f63718d = source.f63709d;
            this.f63719e = source.f63710e;
            this.f63720f = source.f63711f;
            this.f63721g = Integer.valueOf(source.f63712g);
            this.f63722h = source.f63713h;
            this.f63723i = source.f63714i;
        }
    }
}
